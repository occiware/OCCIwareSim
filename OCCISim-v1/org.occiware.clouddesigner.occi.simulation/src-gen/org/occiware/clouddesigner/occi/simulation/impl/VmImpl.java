/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package org.occiware.clouddesigner.occi.simulation.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

import org.occiware.clouddesigner.occi.simulation.SimulationPackage;
import org.occiware.clouddesigner.occi.simulation.SimulationTables;
import org.occiware.clouddesigner.occi.simulation.Vm;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getIdvm <em>Idvm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getMips <em>Mips</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getBw <em>Bw</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getCloudletScheduler <em>Cloudlet Scheduler</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getVmm <em>Vmm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getRamMaxVm <em>Ram Max Vm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getRamMinVm <em>Ram Min Vm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getIrdto <em>Irdto</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getDto <em>Dto</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getDti <em>Dti</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getIrdt <em>Irdt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl#getElasticVm <em>Elastic Vm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VmImpl extends MixinBaseImpl implements Vm {
	/**
	 * The default value of the '{@link #getIdvm() <em>Idvm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdvm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IDVM_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getIdvm() <em>Idvm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdvm()
	 * @generated
	 * @ordered
	 */
	protected Integer idvm = IDVM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMips() <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMips()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIPS_EDEFAULT = new Integer(1000);

	/**
	 * The cached value of the '{@link #getMips() <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMips()
	 * @generated
	 * @ordered
	 */
	protected Integer mips = MIPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CORES_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getCores() <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCores()
	 * @generated
	 * @ordered
	 */
	protected Integer cores = CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBw() <em>Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBw()
	 * @generated
	 * @ordered
	 */
	protected static final Long BW_EDEFAULT = new Long(1000L);

	/**
	 * The cached value of the '{@link #getBw() <em>Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBw()
	 * @generated
	 * @ordered
	 */
	protected Long bw = BW_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIZE_EDEFAULT = new Long(10000L);

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Long size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletScheduler() <em>Cloudlet Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletScheduler()
	 * @generated
	 * @ordered
	 */
	protected static Object CLOUDLET_SCHEDULER_EDEFAULT; // TODO The default value literal "CloudletSchedulerTimeShared" is not valid.

	/**
	 * The cached value of the '{@link #getCloudletScheduler() <em>Cloudlet Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletScheduler()
	 * @generated
	 * @ordered
	 */
	protected Object cloudletScheduler = CLOUDLET_SCHEDULER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmm() <em>Vmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmm()
	 * @generated
	 * @ordered
	 */
	protected static final String VMM_EDEFAULT = "Xen";

	/**
	 * The cached value of the '{@link #getVmm() <em>Vmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmm()
	 * @generated
	 * @ordered
	 */
	protected String vmm = VMM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RAM_EDEFAULT = new Integer(512);

	/**
	 * The cached value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected Integer ram = RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamMaxVm() <em>Ram Max Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamMaxVm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RAM_MAX_VM_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getRamMaxVm() <em>Ram Max Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamMaxVm()
	 * @generated
	 * @ordered
	 */
	protected Integer ramMaxVm = RAM_MAX_VM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamMinVm() <em>Ram Min Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamMinVm()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RAM_MIN_VM_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getRamMinVm() <em>Ram Min Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamMinVm()
	 * @generated
	 * @ordered
	 */
	protected Integer ramMinVm = RAM_MIN_VM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = "Linux";

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIrdto() <em>Irdto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrdto()
	 * @generated
	 * @ordered
	 */
	protected static final Double IRDTO_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getIrdto() <em>Irdto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrdto()
	 * @generated
	 * @ordered
	 */
	protected Double irdto = IRDTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDto() <em>Dto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected static final Double DTO_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getDto() <em>Dto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected Double dto = DTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDti() <em>Dti</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDti()
	 * @generated
	 * @ordered
	 */
	protected static final Double DTI_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getDti() <em>Dti</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDti()
	 * @generated
	 * @ordered
	 */
	protected Double dti = DTI_EDEFAULT;

	/**
	 * The default value of the '{@link #getIrdt() <em>Irdt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrdt()
	 * @generated
	 * @ordered
	 */
	protected static final Double IRDT_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getIrdt() <em>Irdt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIrdt()
	 * @generated
	 * @ordered
	 */
	protected Double irdt = IRDT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElasticVm() <em>Elastic Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticVm()
	 * @generated
	 * @ordered
	 */
	protected static final String ELASTIC_VM_EDEFAULT = "N";

	/**
	 * The cached value of the '{@link #getElasticVm() <em>Elastic Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticVm()
	 * @generated
	 * @ordered
	 */
	protected String elasticVm = ELASTIC_VM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.VM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIdvm() {
		return idvm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdvm(Integer newIdvm) {
		Integer oldIdvm = idvm;
		idvm = newIdvm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__IDVM, oldIdvm, idvm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMips() {
		return mips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMips(Integer newMips) {
		Integer oldMips = mips;
		mips = newMips;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__MIPS, oldMips, mips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCores() {
		return cores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCores(Integer newCores) {
		Integer oldCores = cores;
		cores = newCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__CORES, oldCores, cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getBw() {
		return bw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBw(Long newBw) {
		Long oldBw = bw;
		bw = newBw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__BW, oldBw, bw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Long newSize) {
		Long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCloudletScheduler() {
		return cloudletScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletScheduler(Object newCloudletScheduler) {
		Object oldCloudletScheduler = cloudletScheduler;
		cloudletScheduler = newCloudletScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__CLOUDLET_SCHEDULER, oldCloudletScheduler, cloudletScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmm() {
		return vmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmm(String newVmm) {
		String oldVmm = vmm;
		vmm = newVmm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VMM, oldVmm, vmm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRam() {
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRam(Integer newRam) {
		Integer oldRam = ram;
		ram = newRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__RAM, oldRam, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRamMaxVm() {
		return ramMaxVm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamMaxVm(Integer newRamMaxVm) {
		Integer oldRamMaxVm = ramMaxVm;
		ramMaxVm = newRamMaxVm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__RAM_MAX_VM, oldRamMaxVm, ramMaxVm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRamMinVm() {
		return ramMinVm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamMinVm(Integer newRamMinVm) {
		Integer oldRamMinVm = ramMinVm;
		ramMinVm = newRamMinVm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__RAM_MIN_VM, oldRamMinVm, ramMinVm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIrdto() {
		return irdto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrdto(Double newIrdto) {
		Double oldIrdto = irdto;
		irdto = newIrdto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__IRDTO, oldIrdto, irdto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDto() {
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDto(Double newDto) {
		Double oldDto = dto;
		dto = newDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__DTO, oldDto, dto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDti() {
		return dti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDti(Double newDti) {
		Double oldDti = dti;
		dti = newDti;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__DTI, oldDti, dti));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getIrdt() {
		return irdt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrdt(Double newIrdt) {
		Double oldIrdt = irdt;
		irdt = newIrdt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__IRDT, oldIrdt, irdt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElasticVm() {
		return elasticVm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElasticVm(String newElasticVm) {
		String oldElasticVm = elasticVm;
		elasticVm = newElasticVm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__ELASTIC_VM, oldElasticVm, elasticVm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Vm::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Computesim)
		 *       in
		 *         'Vm::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SimulationTables.STR_Vm_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SimulationTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_simulation_c_c_Computesim_0 = idResolver.getClass(SimulationTables.CLSSid_Computesim, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_simulation_c_c_Computesim_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SimulationTables.STR_Vm_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, SimulationTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulationPackage.VM__IDVM:
				return getIdvm();
			case SimulationPackage.VM__MIPS:
				return getMips();
			case SimulationPackage.VM__CORES:
				return getCores();
			case SimulationPackage.VM__BW:
				return getBw();
			case SimulationPackage.VM__SIZE:
				return getSize();
			case SimulationPackage.VM__CLOUDLET_SCHEDULER:
				return getCloudletScheduler();
			case SimulationPackage.VM__VMM:
				return getVmm();
			case SimulationPackage.VM__RAM:
				return getRam();
			case SimulationPackage.VM__RAM_MAX_VM:
				return getRamMaxVm();
			case SimulationPackage.VM__RAM_MIN_VM:
				return getRamMinVm();
			case SimulationPackage.VM__OS:
				return getOs();
			case SimulationPackage.VM__IRDTO:
				return getIrdto();
			case SimulationPackage.VM__DTO:
				return getDto();
			case SimulationPackage.VM__DTI:
				return getDti();
			case SimulationPackage.VM__IRDT:
				return getIrdt();
			case SimulationPackage.VM__ELASTIC_VM:
				return getElasticVm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimulationPackage.VM__IDVM:
				setIdvm((Integer)newValue);
				return;
			case SimulationPackage.VM__MIPS:
				setMips((Integer)newValue);
				return;
			case SimulationPackage.VM__CORES:
				setCores((Integer)newValue);
				return;
			case SimulationPackage.VM__BW:
				setBw((Long)newValue);
				return;
			case SimulationPackage.VM__SIZE:
				setSize((Long)newValue);
				return;
			case SimulationPackage.VM__CLOUDLET_SCHEDULER:
				setCloudletScheduler(newValue);
				return;
			case SimulationPackage.VM__VMM:
				setVmm((String)newValue);
				return;
			case SimulationPackage.VM__RAM:
				setRam((Integer)newValue);
				return;
			case SimulationPackage.VM__RAM_MAX_VM:
				setRamMaxVm((Integer)newValue);
				return;
			case SimulationPackage.VM__RAM_MIN_VM:
				setRamMinVm((Integer)newValue);
				return;
			case SimulationPackage.VM__OS:
				setOs((String)newValue);
				return;
			case SimulationPackage.VM__IRDTO:
				setIrdto((Double)newValue);
				return;
			case SimulationPackage.VM__DTO:
				setDto((Double)newValue);
				return;
			case SimulationPackage.VM__DTI:
				setDti((Double)newValue);
				return;
			case SimulationPackage.VM__IRDT:
				setIrdt((Double)newValue);
				return;
			case SimulationPackage.VM__ELASTIC_VM:
				setElasticVm((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimulationPackage.VM__IDVM:
				setIdvm(IDVM_EDEFAULT);
				return;
			case SimulationPackage.VM__MIPS:
				setMips(MIPS_EDEFAULT);
				return;
			case SimulationPackage.VM__CORES:
				setCores(CORES_EDEFAULT);
				return;
			case SimulationPackage.VM__BW:
				setBw(BW_EDEFAULT);
				return;
			case SimulationPackage.VM__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case SimulationPackage.VM__CLOUDLET_SCHEDULER:
				setCloudletScheduler(CLOUDLET_SCHEDULER_EDEFAULT);
				return;
			case SimulationPackage.VM__VMM:
				setVmm(VMM_EDEFAULT);
				return;
			case SimulationPackage.VM__RAM:
				setRam(RAM_EDEFAULT);
				return;
			case SimulationPackage.VM__RAM_MAX_VM:
				setRamMaxVm(RAM_MAX_VM_EDEFAULT);
				return;
			case SimulationPackage.VM__RAM_MIN_VM:
				setRamMinVm(RAM_MIN_VM_EDEFAULT);
				return;
			case SimulationPackage.VM__OS:
				setOs(OS_EDEFAULT);
				return;
			case SimulationPackage.VM__IRDTO:
				setIrdto(IRDTO_EDEFAULT);
				return;
			case SimulationPackage.VM__DTO:
				setDto(DTO_EDEFAULT);
				return;
			case SimulationPackage.VM__DTI:
				setDti(DTI_EDEFAULT);
				return;
			case SimulationPackage.VM__IRDT:
				setIrdt(IRDT_EDEFAULT);
				return;
			case SimulationPackage.VM__ELASTIC_VM:
				setElasticVm(ELASTIC_VM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimulationPackage.VM__IDVM:
				return IDVM_EDEFAULT == null ? idvm != null : !IDVM_EDEFAULT.equals(idvm);
			case SimulationPackage.VM__MIPS:
				return MIPS_EDEFAULT == null ? mips != null : !MIPS_EDEFAULT.equals(mips);
			case SimulationPackage.VM__CORES:
				return CORES_EDEFAULT == null ? cores != null : !CORES_EDEFAULT.equals(cores);
			case SimulationPackage.VM__BW:
				return BW_EDEFAULT == null ? bw != null : !BW_EDEFAULT.equals(bw);
			case SimulationPackage.VM__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case SimulationPackage.VM__CLOUDLET_SCHEDULER:
				return CLOUDLET_SCHEDULER_EDEFAULT == null ? cloudletScheduler != null : !CLOUDLET_SCHEDULER_EDEFAULT.equals(cloudletScheduler);
			case SimulationPackage.VM__VMM:
				return VMM_EDEFAULT == null ? vmm != null : !VMM_EDEFAULT.equals(vmm);
			case SimulationPackage.VM__RAM:
				return RAM_EDEFAULT == null ? ram != null : !RAM_EDEFAULT.equals(ram);
			case SimulationPackage.VM__RAM_MAX_VM:
				return RAM_MAX_VM_EDEFAULT == null ? ramMaxVm != null : !RAM_MAX_VM_EDEFAULT.equals(ramMaxVm);
			case SimulationPackage.VM__RAM_MIN_VM:
				return RAM_MIN_VM_EDEFAULT == null ? ramMinVm != null : !RAM_MIN_VM_EDEFAULT.equals(ramMinVm);
			case SimulationPackage.VM__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case SimulationPackage.VM__IRDTO:
				return IRDTO_EDEFAULT == null ? irdto != null : !IRDTO_EDEFAULT.equals(irdto);
			case SimulationPackage.VM__DTO:
				return DTO_EDEFAULT == null ? dto != null : !DTO_EDEFAULT.equals(dto);
			case SimulationPackage.VM__DTI:
				return DTI_EDEFAULT == null ? dti != null : !DTI_EDEFAULT.equals(dti);
			case SimulationPackage.VM__IRDT:
				return IRDT_EDEFAULT == null ? irdt != null : !IRDT_EDEFAULT.equals(irdt);
			case SimulationPackage.VM__ELASTIC_VM:
				return ELASTIC_VM_EDEFAULT == null ? elasticVm != null : !ELASTIC_VM_EDEFAULT.equals(elasticVm);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SimulationPackage.VM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (idvm: ");
		result.append(idvm);
		result.append(", mips: ");
		result.append(mips);
		result.append(", cores: ");
		result.append(cores);
		result.append(", bw: ");
		result.append(bw);
		result.append(", size: ");
		result.append(size);
		result.append(", cloudletScheduler: ");
		result.append(cloudletScheduler);
		result.append(", vmm: ");
		result.append(vmm);
		result.append(", ram: ");
		result.append(ram);
		result.append(", ramMaxVm: ");
		result.append(ramMaxVm);
		result.append(", ramMinVm: ");
		result.append(ramMinVm);
		result.append(", os: ");
		result.append(os);
		result.append(", irdto: ");
		result.append(irdto);
		result.append(", dto: ");
		result.append(dto);
		result.append(", dti: ");
		result.append(dti);
		result.append(", irdt: ");
		result.append(irdt);
		result.append(", elasticVm: ");
		result.append(elasticVm);
		result.append(')');
		return result.toString();
	}

} //VmImpl
