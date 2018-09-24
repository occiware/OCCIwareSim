
package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

import occ.simulation.ElasticityType;
import occ.simulation.impl.HostImpl;
import occ.simulation.impl.VmImpl;


/**
 * 
 * @author Mehdi Ahmed-Nacer
 *
 */


public class Parser {

	Configuration configuration;

	public Parser(Configuration config){
		this.configuration= config;
		System.out.println("BrigeConfigSimulation");
	}

	public Map<Entity, Set<Entity>> parsing(){
		System.out.println("start parsing ...");
		Map<Entity, Set<Entity>> entities = new HashMap<Entity, Set<Entity>>();

		for(Resource resource : configuration.getResources()) {
			for(Mixin mixin : resource.getMixins()) {
				if(mixin.getScheme().contains("simulation")){
					if(mixin.getTerm().contains("datacenter")){
						Dc_Config dc = DcFromResource(resource);
						entities.put(dc, new HashSet<Entity>());
						System.out.println(dc);
					}else if(mixin.getTerm().contains("host")){
						Host_Config host = HostFromResource(resource);
						entities.put(host, new HashSet<Entity>());
						System.out.println(host);
					}else if (mixin.getTerm().contains("vm")){
						VM_Config vm = VMFromResource(resource);
						entities.put(vm, new HashSet<Entity>());
						System.out.println(vm);
					}else if (mixin.getTerm().contains("cloudlet")){
						Cloudlet_Config cloudlet = CloudletFromResource(resource);
						entities.put(cloudlet, new HashSet<Entity>());
						System.out.println(cloudlet);
					}else if(mixin.getTerm().contains("HarddriveStorage")){ 
						HarddriveStorage_Config hardDrive = HarddriveFromResource(resource);
						entities.put(hardDrive, new HashSet<Entity>());
						System.out.println(hardDrive);

					}
				}
			}
		}

		//Link entities
		for(Entity ent: entities.keySet()){
			for(Entity link: entities.keySet()){
				if(ent.getLinkedResourceId().contains(link.getId())){
					if(isDC(ent) && isHost(link))
						entities.get(ent).add(link);
					else if (isDC(ent) && isHardDrive(link))
						entities.get(ent).add(link);
					else if (isHost(ent) && isVM(link))
						entities.get(ent).add(link);
					else if (isVM(ent) && isCloudlet(link))
						entities.get(ent).add(link);
				}
			}

		}
		return entities;
	}

	/*********************************************************************************/
	/****************  Fill the attributes of each entity **************************/
	/*********************************************************************************/
	/*********************************************************************************/
	private HarddriveStorage_Config HarddriveFromResource(Resource resource){
		String id = resource.getId();
		int size = 1000;
		List<String> idTarget = new ArrayList<String>();
		for(AttributeState as : resource.getAttributes()) {
			if(as.getName().equals("size")) size = Integer.parseInt(as.getValue());
		}
		return new HarddriveStorage_Config(id, size, idTarget);
	}

	private Cloudlet_Config CloudletFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();
		int cloudletId=0,pesNumber=0;
		long cloudletLength=0, cloudletFileSize=0, cloudletOutputSize=0;
		String utilizationModelCpu="", utilizationModelRam="", utilizationModelBw="";

		for(Mixin m : resource.getMixins())
		{
			if(m.getTerm().equals("cloudlet"))
			{
				for(Attribute as: m.getAttributes())
				{
					System.out.println(as.getName()+" >>>> "+as.getDefault());
					if(as.getName().equals("cloudletId")) cloudletId = Integer.parseInt(as.getDefault());
					else if (as.getName().contains("cores")) pesNumber = Integer.parseInt(as.getDefault());
					else if (as.getName().equals("cloudletLength")) cloudletLength = Long.parseLong(as.getDefault());
					else if (as.getName().equals("cloudletFileSize")) cloudletFileSize = Long.parseLong(as.getDefault());
					else if (as.getName().equals("cloudletOutputSize")) cloudletOutputSize = Long.parseLong(as.getDefault());
					else if (as.getName().equals("utilizationModelCpu")) utilizationModelCpu = as.getDefault();
					else if (as.getName().equals("utilizationModelRam")) utilizationModelRam = as.getDefault();
					else if (as.getName().equals("utilizationModelBw")) utilizationModelBw = as.getDefault();
				}
			}
		}


		/*	for(AttributeState as : resource.getAttributes()) {
			if(as.getName().equals("cloudletId")) cloudletId = Integer.parseInt(as.getValue());
			else if (as.getName().contains("cores")) pesNumber = Integer.parseInt(as.getValue());
			else if (as.getName().equals("cloudletLength")) cloudletLength = Long.parseLong(as.getValue());
			else if (as.getName().equals("cloudletFileSize")) cloudletFileSize = Long.parseLong(as.getValue());
			else if (as.getName().equals("cloudletOutputSize")) cloudletOutputSize = Long.parseLong(as.getValue());
			else if (as.getName().equals("utilizationModelCpu")) utilizationModelCpu = as.getValue();
			else if (as.getName().equals("utilizationModelRam")) utilizationModelRam = as.getValue();
			else if (as.getName().equals("utilizationModelBw")) utilizationModelBw = as.getValue();
		}*/

		return new Cloudlet_Config(id, idTarget, cloudletId, pesNumber, cloudletLength, cloudletFileSize,
				cloudletOutputSize, utilizationModelCpu, utilizationModelRam,
				utilizationModelBw);
	}

	private VM_Config VMFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();
		int id_vm=0, numberOfPes=0, ram=0;
		double mips=0;
		long bw=0, size=0;
		String vmm="";
		ElasticityType elastic_vm=ElasticityType.NONE;
		int ram_max=0,ram_min=0;
		String cloudletScheduler="";
		String os="";
		double irdto=0, dto=0, dti=0, irdt=0;
		for(MixinBase m : resource.getParts())
		{			
			if(m.getMixin().getTerm().equals("vm"))
			{
				VmImpl vm = (VmImpl) m;
				id_vm = vm.getVmId();
				mips = 1000*vm.getVmMips();
				numberOfPes = vm.getVmCores();
				ram = vm.getVmRam();
				bw = vm.getVmBw();
				size = vm.getVmImageSize();
				vmm = vm.getVmVmm();
				cloudletScheduler = "CloudletSchedulerTimeShared";//To modify 
				elastic_vm = vm.getVmElasticity();
				os = vm.getVmOs();
				/*irdto = vm.getIrdto();
				dto =vm.getDto();
				dti = vm.getDti();
				irdt = vm.getIrdt();*/
			}
		}

		/*for(AttributeState as : resource.getAttributes()) {
			System.out.println(as.getName()+" >>>> "+as.getValue());
			if(as.getName().equals("id_vm")) id_vm = Integer.parseInt(as.getValue());
			else if (as.getName().contains("speed")  || as.getName().contains("mips")) mips = 1000*Double.parseDouble(as.getValue());
			else if (as.getName().contains("cores")) numberOfPes = Integer.parseInt(as.getValue());
			else if (as.getName().contains("memory")) ram = 1000*Integer.parseInt(as.getValue());//GB
			else if (as.getName().equals("ram")) ram = Integer.parseInt(as.getValue());
			else if (as.getName().equals("bw")) bw = Long.parseLong(as.getValue());
			else if (as.getName().equals("size")) size = Long.parseLong(as.getValue());
			else if (as.getName().equals("vmm")) vmm = as.getValue();
			else if (as.getName().equals("cloudletScheduler")) cloudletScheduler = as.getValue();
			else if (as.getName().equals("ram_max_vm")) ram_max = Integer.parseInt(as.getValue());
			else if (as.getName().equals("ram_min_vm")) ram_min = Integer.parseInt(as.getValue());
			else if (as.getName().equals("elastic_vm")) elastic_vm = as.getValue();
			else if (as.getName().equals("os")) os = as.getValue();
			else if (as.getName().equals("irdto")) irdto = Integer.parseInt(as.getValue());
			else if (as.getName().equals("dto")) dto =Integer.parseInt( as.getValue());
			else if (as.getName().equals("dti")) dti = Integer.parseInt(as.getValue());
			else if (as.getName().equals("irdt")) irdt = Integer.parseInt(as.getValue());

		}*/
		//resource linked to VM
		for(Link link : resource.getLinks()) {
			if(link.getTarget().getKind().getTerm().contains("cloudlet")){
				idTarget.add(link.getTarget().getId());
			}else{
				for(Mixin m: link.getTarget().getMixins()){
					if(m.getTerm().contains("cloudlet")){
						idTarget.add(link.getTarget().getId());
					}
				}
			}
		}

		return new VM_Config(id, idTarget, id_vm, numberOfPes, ram, mips,
				bw, size, vmm, cloudletScheduler, elastic_vm, ram_min, ram_max, os, irdto, dto, dti, irdt) ;
	}	

	private Host_Config HostFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();
		int id_host=0, core=0, ram=0, bw=0;
		ElasticityType elastic_host=ElasticityType.NONE;
		String ramProvisioner="", bwProvisioner="", peProvisioner="",vmScheduler="";
		long storage=0;
		double mips=0;
		int ram_max_host=0, ram_min_host=0, mips_max_host=0;

		for(MixinBase mixin : resource.getParts()) {
			System.out.println(mixin.getMixin().getName());
			if(mixin.getMixin().getName().equals("host"))
			{
				HostImpl as = (HostImpl) mixin;
				id_host = as.getHostId();
				mips = 1000*as.getHostMips();
				core = as.getHostCores();
				ram = as.getHostRam();//MB
				bw = as.getHostBw();
				storage = as.getHostStorage();//MB
				ramProvisioner = (as.getHostRamProvisionner() == null) ? "RamProvisionerSimple" : as.getHostRamProvisionner().toString();
				bwProvisioner = (as.getHostBwProvisionner() == null) ? "BwProvisionerSimple" : as.getHostBwProvisionner().toString();
				vmScheduler = (as.getHostVmScheduler() == null) ? "VmSchedulerTimeShared": as.getHostVmScheduler().toString();
				peProvisioner = (as.getHostPeProvisionner() == null) ? "PeProvisionerSimple": as.getHostPeProvisionner().toString();
				elastic_host = as.getHostElasticity();

			}
		}
		/*for(AttributeState as : resource.getAttributes()) {
			if(as.getName().equals("id_host")) id_host = Integer.parseInt(as.getValue());
			else if (as.getName().contains("speed")  || as.getName().equals("mips")) mips = 1000*Double.parseDouble(as.getValue());
			else if (as.getName().contains("cores")) core = Integer.parseInt(as.getValue());
			//else if (as.getName().contains("memory")) ram = 1000*Integer.parseInt(as.getValue());//GB
			else if (as.getName().equals("ram")) ram = Integer.parseInt(as.getValue());//MB
			else if (as.getName().equals("bw")) bw = Integer.parseInt(as.getValue());
			else if (as.getName().equals("storage")) storage = Long.parseLong(as.getValue());//MB
			else if (as.getName().equals("ramProvisioner")) ramProvisioner = as.getValue();
			else if (as.getName().equals("bwProvisioner")) bwProvisioner = as.getValue();
			else if (as.getName().equals("vmScheduler")) vmScheduler = as.getValue();
			else if (as.getName().equals("peProvisioner")) peProvisioner = as.getValue();
			else if (as.getName().equals("elastic_host")) elastic_host = as.getValue();
			else if (as.getName().equals("ram_max_host")) ram_max_host = Integer.parseInt(as.getValue());
			else if (as.getName().equals("ram_min_host")) ram_min_host = Integer.parseInt(as.getValue());
			else if (as.getName().equals("mips_max_host")) mips_max_host = Integer.parseInt(as.getValue());

		}*/
		//VM linked to host
		for(Link link : resource.getLinks()) {
			if(link.getTarget().getKind().getTerm().contains("vm")){
				idTarget.add(link.getTarget().getId());
			}else{
				for(Mixin m: link.getTarget().getMixins()){
					if(m.getTerm().contains("vm")){
						idTarget.add(link.getTarget().getId());
					}
				}
			}
		}
		return new Host_Config(id, idTarget, id_host, mips, core, ramProvisioner,
				bwProvisioner, vmScheduler, peProvisioner, storage, ram, bw,
				elastic_host, ram_min_host, ram_max_host, mips_max_host);
	}


	public Dc_Config DcFromResource(Resource resource){
		String id = resource.getId(); //ressourceId
		List<String> idTarget = new ArrayList<String>();

		String architecture = "", os="", vmm="", name="", location="";
		double schedulingInterval= 0, timeZone=0, costPerSec=0, costPerMem=0, costPerStorage=0, costPerBw=0;

		for(Mixin m : resource.getMixins())
		{
			if(m.getTerm().equals("datacenter"))
			{
				for(Attribute as: m.getAttributes())
				{
					System.out.println(as.getName()+" >>>> "+as.getDefault());
					if(as.getName().contains("arch")) architecture = as.getDefault();
					else if(as.getName().equals("os")) os = as.getDefault();
					else if(as.getName().equals("vmm")) vmm = as.getDefault();
					else if(as.getName().equals("time_zone")) timeZone = Double.parseDouble(as.getDefault());
					else if(as.getName().equals("cost")) costPerSec = Double.parseDouble(as.getDefault());
					else if(as.getName().equals("costPerMem")) costPerMem = Double.parseDouble(as.getDefault());
					else if(as.getName().equals("costPerStorage")) costPerStorage = Double.parseDouble(as.getDefault());
					else if(as.getName().equals("costPerBw")) costPerBw = Double.parseDouble(as.getDefault());
					else if(as.getName().equals("name")) name = as.getDefault();
					else if(as.getName().equals("schedulingInterval")) schedulingInterval = Double.parseDouble(as.getDefault());
					else if(as.getName().equals("location")) location = as.getDefault();
				}
			}
		}

		/*for(AttributeState as : resource.getAttributes()) {
			if(as.getName().contains("arch")) architecture = as.getValue();
			else if(as.getName().equals("os")) os = as.getValue();
			else if(as.getName().equals("vmm")) vmm = as.getValue();
			else if(as.getName().equals("time_zone")) timeZone = Double.parseDouble(as.getValue());
			else if(as.getName().equals("cost")) costPerSec = Double.parseDouble(as.getValue());
			else if(as.getName().equals("costPerMem")) costPerMem = Double.parseDouble(as.getValue());
			else if(as.getName().equals("costPerStorage")) costPerStorage = Double.parseDouble(as.getValue());
			else if(as.getName().equals("costPerBw")) costPerBw = Double.parseDouble(as.getValue());
			else if(as.getName().equals("name")) name = as.getValue();
			else if(as.getName().equals("schedulingInterval")) schedulingInterval = Double.parseDouble(as.getValue());
			else if(as.getName().equals("location")) location = as.getValue();

		}*/

		//host linked to datacenter
		for(Link link : resource.getLinks()) {
			for(Mixin m: link.getTarget().getMixins()){
				if(m.getTerm().contains("host") || m.getTerm().contains("HarddriveStorage")){
					idTarget.add(link.getTarget().getId());
				}
			}	
		}
		//create datacenter
		return new Dc_Config(id, idTarget, name, architecture, os, vmm, timeZone, costPerSec, costPerMem, 
				costPerStorage, costPerBw, schedulingInterval, location);
	}

	/*********************************************************************************/
	/******************************  PRIVATE CLASSES *********************************/
	/*********************************************************************************/
	/*********************************************************************************/
	protected class HarddriveStorage_Config implements Entity{
		double size; 
		String id;
		List<String> idTarget;

		public HarddriveStorage_Config(String id, double size, List<String> idTarget){
			this.id = id;
			this.size = size;
			this.idTarget = idTarget;
		}

		@Override
		public String getId() {
			return id;
		}

		@Override
		public String toString() {
			return "HarddriveStorage [size=" + size + ", id=" + id + "]";
		}

		@Override
		public List<String> getLinkedResourceId() {
			return idTarget;
		}

	}

	public class Cloudlet_Config implements Entity{
		String id; //ressourceId
		List<String> idTarget;
		int cloudletId,pesNumber;
		long cloudletLength, cloudletFileSize, cloudletOutputSize;
		String utilizationModelCpu, utilizationModelRam,utilizationModelBw;

		public Cloudlet_Config(String id, List<String> idTarget, int cloudletId, int pesNumber, long cloudletLength, long cloudletFileSize,
				long cloudletOutputSize, String utilizationModelCpu, String utilizationModelRam,
				String utilizationModelBw) {
			this.id = id;
			this.idTarget = idTarget;
			this.cloudletId = cloudletId;
			this.pesNumber = pesNumber;
			this.cloudletLength = cloudletLength;
			this.cloudletFileSize = cloudletFileSize;
			this.cloudletOutputSize = cloudletOutputSize;
			this.utilizationModelCpu = utilizationModelCpu;
			this.utilizationModelRam = utilizationModelRam;
			this.utilizationModelBw = utilizationModelBw;
		}
		@Override
		public String toString() {
			return "Cloudlet [cloudletId=" + cloudletId + ", pesNumber=" + pesNumber + ", cloudletLength="
					+ cloudletLength + ", cloudletFileSize=" + cloudletFileSize + ", cloudletOutputSize="
					+ cloudletOutputSize + ", utilizationModelCpu=" + utilizationModelCpu + ", utilizationModelRam="
					+ utilizationModelRam + ", utilizationModelBw=" + utilizationModelBw + "]";
		}
		@Override
		public String getId() {
			return id;
		}
		@Override
		public List<String> getLinkedResourceId() {
			return idTarget;
		}
	}

	public class VM_Config implements Entity{
		String id; //ressourceId
		List<String> idTarget;
		int id_vm, numberOfPes, ram, ram_min, ram_max;
		double mips;
		long bw, size;
		String vmm;
		ElasticityType elastic;
		String cloudletScheduler, os;
		double irdto, dto, dti, irdt;
		public VM_Config(String id, List<String> idTarget, int id_vm, int numberOfPes, int ram, double mips,
				long bw, long size, String vmm, String cloudletScheduler,
				ElasticityType elastic, int ram_min, int ram_max, String os, double irdto, 
				double dto, double dti, double irdt) {
			this.id = id;
			this.idTarget = idTarget;
			this.id_vm = id_vm;
			this.numberOfPes = numberOfPes;
			this.ram = ram;
			this.mips = mips;
			this.bw = bw;
			this.size = size;
			this.vmm = vmm;
			this.cloudletScheduler = cloudletScheduler;
			this.ram_min=ram_min;
			this.ram_max= ram_max;
			this.elastic=elastic;
			this.os = os;
			this.irdt = irdt;
			this.irdto = irdto;
			this.dti = dti;
			this.dto = dto;
		}
		public int getPesNumber(){
			return numberOfPes;
		}

		public int getRam(){
			return ram;
		}
		@Override
		public String toString() {
			return "VM [id=" + id + ", idTarget=" + idTarget + ", id_vm=" + id_vm + 
					", numberOfPes=" + numberOfPes + ", ram=" + ram + ", mips=" + mips + ", bw=" + bw + ", size="
					+ size + ", vmm=" + vmm + ", cloudletScheduler=" + cloudletScheduler + 
					"elasticity="+elastic+" ram_min="+ram_min+" ram_max="+ram_max+
					", os="+os+", dti= "+dti+", dto="+dto+", irdt="+irdt+", irdto="+irdto+"]";
		}

		@Override
		public String getId() {
			return id;
		}
		@Override
		public List<String> getLinkedResourceId() {
			return idTarget;
		}

		public String getOs(){
			return os;
		}
	}


	protected static class Host_Config implements Entity{
		String id; //ressourceId
		List<String> idTarget;
		public static int numberHost = 0;
		int id_host, core, ram, bw, ram_min_host, ram_max_host, mips_max_host;
		double mips;
		String ramProvisioner, bwProvisioner,peProvisioner, vmScheduler;
		ElasticityType elastic_host;
		long storage;
		public Host_Config(String id, List<String> idTarget, int id_host, double mips, int core, String ramProvisioner,
				String bwProvisioner, String vmScheduler, String peProvisioner, long storage, int ram, int bw,
				ElasticityType elastic_host, int ram_min_host, int ram_max_host, int mips_max_host) {
			this.id = id;
			this.idTarget = idTarget;
			this.id_host = id_host;
			this.mips = mips;
			this.core = core;
			this.ramProvisioner = ramProvisioner;
			this.bwProvisioner = bwProvisioner;
			this.peProvisioner = peProvisioner;
			this.vmScheduler = vmScheduler;
			this.storage = storage;
			this.bw = bw;
			this.ram = ram;
			this.elastic_host=elastic_host;
			this.ram_min_host=ram_min_host;
			this.ram_max_host=ram_max_host;
			this.mips_max_host=mips_max_host;
			numberHost++;
		}

		public Host_Config clone(){
			numberHost++;
			String newResourceId = UUID.randomUUID().toString();
			return new Host_Config(newResourceId, this.idTarget, numberHost, this.mips, this.core, this.ramProvisioner,
					this.bwProvisioner, this.vmScheduler, this.peProvisioner, this.storage, this.ram, this.bw,
					this.elastic_host, this.ram_min_host, this.ram_max_host, this.mips_max_host);
		}

		@Override
		public String toString() {
			return "Host_Config [id=" + id + ", idTarget=" + idTarget + ", id_host=" + id_host + ", mips=" + mips
					+ ", core=" + core + ", ram=" + ram + ", bw=" + bw + ", ramProvisioner=" + ramProvisioner
					+ ", bwProvisioner=" + bwProvisioner + ", peProvisioner=" + peProvisioner + ", vmScheduler="
					+ vmScheduler + ", storage=" + storage + " elastic_host="+elastic_host+" ram_min_host="+ram_min_host+
					"ram_max_host="+ram_max_host+" mips_max_host="+mips_max_host+"]";
		}

		@Override
		public String getId() {
			return id;
		}
		@Override
		public List<String> getLinkedResourceId() {
			return idTarget;
		}

		public void setTarget(List<String> targ){
			this.idTarget = targ;
		}

		public void setStorage(long storage){
			this.storage = storage;
		}

		public void setId(int id){
			this.id_host = id;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Host_Config other = (Host_Config) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

	}

	public class Dc_Config implements Entity{
		String id;
		List<String> targetId; //list of hosts
		String vmm, os, name, architecture, location;
		double schedulingInterval;
		double time_zone, costPerSec, costPerMem, costPerStorage, costPerBw;

		public Dc_Config(String id, List<String> targetId, String name,
				String architecture, String os, String vmm, double time_zone, 
				double costPerSec, double costPerMem, double costPerStorage, 
				double costPerBw, double schedulingInterval, String location){
			this.architecture = architecture;
			this.id = id;
			this.targetId = targetId;
			this.vmm = vmm;
			this.os = os;
			this.name = name;
			this.schedulingInterval = schedulingInterval;
			this.costPerSec = costPerSec;
			this.costPerMem = costPerMem;
			this.costPerStorage = costPerStorage;
			this.costPerBw = costPerBw;
			this.time_zone = time_zone;
			this.location = location;
		}

		public String getLocation()
		{
			return location;
		}

		@Override
		public String toString() {
			return "Dc_Config [id=" + id + ", targetId=" + targetId + ", vmm=" + vmm + ", os=" + os + ", name=" + name
					+ ", architecture=" + architecture + ", schedulingInterval=" + schedulingInterval + ", time_zone="
					+ time_zone + ", costPerSec=" + costPerSec + ", costPerMem=" + costPerMem + ", costPerStorage="
					+ costPerStorage + ", costPerBw=" + costPerBw + ", location="+location+ "]";
		}

		@Override
		public String getId() {
			return id;
		}

		@Override
		public List<String> getLinkedResourceId() {
			return targetId;
		}
	}

	public interface Entity{
		public String getId();
		public List<String> getLinkedResourceId();
		public String toString();
	}

	/*************** PRIVATE METHOD *****************/
	public boolean isDC(Object obj){
		if(obj instanceof Dc_Config){
			return true;
		}
		return false;
	}

	public boolean isHost(Object obj){
		if(obj instanceof Host_Config){
			return true;
		}
		return false;
	}

	public boolean isVM(Object obj){
		if(obj instanceof VM_Config){
			return true;
		}
		return false;
	}

	public boolean isCloudlet(Object obj){
		if(obj instanceof Cloudlet_Config){
			return true;
		}
		return false;
	}
	public boolean isHardDrive(Object obj){
		if(obj instanceof HarddriveStorage_Config){
			return true;
		}
		return false;
	}


}
