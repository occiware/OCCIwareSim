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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.occiware.clouddesigner.occi.simulation.Auction;
import org.occiware.clouddesigner.occi.simulation.Binomiale;
import org.occiware.clouddesigner.occi.simulation.Cloudlet;
import org.occiware.clouddesigner.occi.simulation.Computesim;
import org.occiware.clouddesigner.occi.simulation.Datacenter;
import org.occiware.clouddesigner.occi.simulation.Gauss;
import org.occiware.clouddesigner.occi.simulation.Harddrivestorage;
import org.occiware.clouddesigner.occi.simulation.Host;
import org.occiware.clouddesigner.occi.simulation.Networksim;
import org.occiware.clouddesigner.occi.simulation.Ondemand;
import org.occiware.clouddesigner.occi.simulation.Poisson;
import org.occiware.clouddesigner.occi.simulation.Pricestrategies;
import org.occiware.clouddesigner.occi.simulation.Probadistrib;
import org.occiware.clouddesigner.occi.simulation.Sanstorage;
import org.occiware.clouddesigner.occi.simulation.SimulationFactory;
import org.occiware.clouddesigner.occi.simulation.SimulationPackage;
import org.occiware.clouddesigner.occi.simulation.Storagesim;
import org.occiware.clouddesigner.occi.simulation.Upfront;
import org.occiware.clouddesigner.occi.simulation.Vm;

import org.occiware.clouddesigner.occi.simulation.util.SimulationValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationPackageImpl extends EPackageImpl implements SimulationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computesimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storagesimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networksimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datacenterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass harddrivestorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sanstorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass probadistribEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poissonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gaussEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binomialeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pricestrategiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ondemandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upfrontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType longEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ramProvisionerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bwProvisionerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType peProvisionerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cloudletSchedulerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vmSchedulerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType utilizationModelEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimulationPackageImpl() {
		super(eNS_URI, SimulationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimulationPackage init() {
		if (isInited) return (SimulationPackage)EPackage.Registry.INSTANCE.getEPackage(SimulationPackage.eNS_URI);

		// Obtain or create and register package
		SimulationPackageImpl theSimulationPackage = (SimulationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimulationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimulationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimulationPackage.createPackageContents();

		// Initialize created meta-data
		theSimulationPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSimulationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return SimulationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSimulationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimulationPackage.eNS_URI, theSimulationPackage);
		return theSimulationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputesim() {
		return computesimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStoragesim() {
		return storagesimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworksim() {
		return networksimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatacenter() {
		return datacenterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_Os() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_Vmm() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_Timezone() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_Cost() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_CostPerMem() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_CostPerStorage() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_CostPerBw() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_Name() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_SchedulingInterval() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatacenter_Location() {
		return (EAttribute)datacenterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatacenter__AppliesConstraint__DiagnosticChain_Map() {
		return datacenterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudlet() {
		return cloudletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletId() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletLength() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_Cores() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletFileSize() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_CloudletOutputSize() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_UtilizationModelCpu() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_UtilizationModelRam() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudlet_UtilizationModelBw() {
		return (EAttribute)cloudletEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCloudlet__AppliesConstraint__DiagnosticChain_Map() {
		return cloudletEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHost() {
		return hostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_IdHost() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_RamProvisioner() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_BwProvisioner() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Storage() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Cores() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_VmScheduler() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Ram() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Bw() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_Mips() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_PeProvisioner() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_ElasticHost() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_RamMaxHost() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_RamMinHost() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHost_MipsMaxHost() {
		return (EAttribute)hostEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHost__AppliesConstraint__DiagnosticChain_Map() {
		return hostEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVm() {
		return vmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Idvm() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Mips() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Cores() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Bw() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Size() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_CloudletScheduler() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Vmm() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Ram() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_RamMaxVm() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_RamMinVm() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Os() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Irdto() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Dto() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Dti() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_Irdt() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVm_ElasticVm() {
		return (EAttribute)vmEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVm__AppliesConstraint__DiagnosticChain_Map() {
		return vmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHarddrivestorage() {
		return harddrivestorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHarddrivestorage__AppliesConstraint__DiagnosticChain_Map() {
		return harddrivestorageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSanstorage() {
		return sanstorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSanstorage_Bandwidth() {
		return (EAttribute)sanstorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSanstorage_NetworkLatency() {
		return (EAttribute)sanstorageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSanstorage__AppliesConstraint__DiagnosticChain_Map() {
		return sanstorageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProbadistrib() {
		return probadistribEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProbadistrib__AppliesConstraint__DiagnosticChain_Map() {
		return probadistribEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoisson() {
		return poissonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoisson_X() {
		return (EAttribute)poissonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoisson_U() {
		return (EAttribute)poissonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGauss() {
		return gaussEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGauss_X() {
		return (EAttribute)gaussEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGauss_N() {
		return (EAttribute)gaussEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGauss_P() {
		return (EAttribute)gaussEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinomiale() {
		return binomialeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinomiale_NumCorrect() {
		return (EAttribute)binomialeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinomiale_NumTrials() {
		return (EAttribute)binomialeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinomiale_Chance() {
		return (EAttribute)binomialeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPricestrategies() {
		return pricestrategiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPricestrategies__AppliesConstraint__DiagnosticChain_Map() {
		return pricestrategiesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOndemand() {
		return ondemandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpfront() {
		return upfrontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuction() {
		return auctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getdouble() {
		return doubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getlong() {
		return longEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRamProvisioner() {
		return ramProvisionerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBwProvisioner() {
		return bwProvisionerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPeProvisioner() {
		return peProvisionerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCloudletScheduler() {
		return cloudletSchedulerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVmScheduler() {
		return vmSchedulerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getutilizationModel() {
		return utilizationModelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationFactory getSimulationFactory() {
		return (SimulationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		computesimEClass = createEClass(COMPUTESIM);

		storagesimEClass = createEClass(STORAGESIM);

		networksimEClass = createEClass(NETWORKSIM);

		datacenterEClass = createEClass(DATACENTER);
		createEAttribute(datacenterEClass, DATACENTER__OS);
		createEAttribute(datacenterEClass, DATACENTER__VMM);
		createEAttribute(datacenterEClass, DATACENTER__TIMEZONE);
		createEAttribute(datacenterEClass, DATACENTER__COST);
		createEAttribute(datacenterEClass, DATACENTER__COST_PER_MEM);
		createEAttribute(datacenterEClass, DATACENTER__COST_PER_STORAGE);
		createEAttribute(datacenterEClass, DATACENTER__COST_PER_BW);
		createEAttribute(datacenterEClass, DATACENTER__NAME);
		createEAttribute(datacenterEClass, DATACENTER__SCHEDULING_INTERVAL);
		createEAttribute(datacenterEClass, DATACENTER__LOCATION);
		createEOperation(datacenterEClass, DATACENTER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		cloudletEClass = createEClass(CLOUDLET);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_ID);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_LENGTH);
		createEAttribute(cloudletEClass, CLOUDLET__CORES);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_FILE_SIZE);
		createEAttribute(cloudletEClass, CLOUDLET__CLOUDLET_OUTPUT_SIZE);
		createEAttribute(cloudletEClass, CLOUDLET__UTILIZATION_MODEL_CPU);
		createEAttribute(cloudletEClass, CLOUDLET__UTILIZATION_MODEL_RAM);
		createEAttribute(cloudletEClass, CLOUDLET__UTILIZATION_MODEL_BW);
		createEOperation(cloudletEClass, CLOUDLET___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		hostEClass = createEClass(HOST);
		createEAttribute(hostEClass, HOST__ID_HOST);
		createEAttribute(hostEClass, HOST__RAM_PROVISIONER);
		createEAttribute(hostEClass, HOST__BW_PROVISIONER);
		createEAttribute(hostEClass, HOST__STORAGE);
		createEAttribute(hostEClass, HOST__CORES);
		createEAttribute(hostEClass, HOST__VM_SCHEDULER);
		createEAttribute(hostEClass, HOST__RAM);
		createEAttribute(hostEClass, HOST__BW);
		createEAttribute(hostEClass, HOST__MIPS);
		createEAttribute(hostEClass, HOST__PE_PROVISIONER);
		createEAttribute(hostEClass, HOST__ELASTIC_HOST);
		createEAttribute(hostEClass, HOST__RAM_MAX_HOST);
		createEAttribute(hostEClass, HOST__RAM_MIN_HOST);
		createEAttribute(hostEClass, HOST__MIPS_MAX_HOST);
		createEOperation(hostEClass, HOST___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		vmEClass = createEClass(VM);
		createEAttribute(vmEClass, VM__IDVM);
		createEAttribute(vmEClass, VM__MIPS);
		createEAttribute(vmEClass, VM__CORES);
		createEAttribute(vmEClass, VM__BW);
		createEAttribute(vmEClass, VM__SIZE);
		createEAttribute(vmEClass, VM__CLOUDLET_SCHEDULER);
		createEAttribute(vmEClass, VM__VMM);
		createEAttribute(vmEClass, VM__RAM);
		createEAttribute(vmEClass, VM__RAM_MAX_VM);
		createEAttribute(vmEClass, VM__RAM_MIN_VM);
		createEAttribute(vmEClass, VM__OS);
		createEAttribute(vmEClass, VM__IRDTO);
		createEAttribute(vmEClass, VM__DTO);
		createEAttribute(vmEClass, VM__DTI);
		createEAttribute(vmEClass, VM__IRDT);
		createEAttribute(vmEClass, VM__ELASTIC_VM);
		createEOperation(vmEClass, VM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		harddrivestorageEClass = createEClass(HARDDRIVESTORAGE);
		createEOperation(harddrivestorageEClass, HARDDRIVESTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		sanstorageEClass = createEClass(SANSTORAGE);
		createEAttribute(sanstorageEClass, SANSTORAGE__BANDWIDTH);
		createEAttribute(sanstorageEClass, SANSTORAGE__NETWORK_LATENCY);
		createEOperation(sanstorageEClass, SANSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		probadistribEClass = createEClass(PROBADISTRIB);
		createEOperation(probadistribEClass, PROBADISTRIB___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		poissonEClass = createEClass(POISSON);
		createEAttribute(poissonEClass, POISSON__X);
		createEAttribute(poissonEClass, POISSON__U);

		gaussEClass = createEClass(GAUSS);
		createEAttribute(gaussEClass, GAUSS__X);
		createEAttribute(gaussEClass, GAUSS__N);
		createEAttribute(gaussEClass, GAUSS__P);

		binomialeEClass = createEClass(BINOMIALE);
		createEAttribute(binomialeEClass, BINOMIALE__NUM_CORRECT);
		createEAttribute(binomialeEClass, BINOMIALE__NUM_TRIALS);
		createEAttribute(binomialeEClass, BINOMIALE__CHANCE);

		pricestrategiesEClass = createEClass(PRICESTRATEGIES);
		createEOperation(pricestrategiesEClass, PRICESTRATEGIES___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		ondemandEClass = createEClass(ONDEMAND);

		upfrontEClass = createEClass(UPFRONT);

		auctionEClass = createEClass(AUCTION);

		// Create data types
		doubleEDataType = createEDataType(DOUBLE);
		longEDataType = createEDataType(LONG);
		ramProvisionerEDataType = createEDataType(RAM_PROVISIONER);
		bwProvisionerEDataType = createEDataType(BW_PROVISIONER);
		peProvisionerEDataType = createEDataType(PE_PROVISIONER);
		cloudletSchedulerEDataType = createEDataType(CLOUDLET_SCHEDULER);
		vmSchedulerEDataType = createEDataType(VM_SCHEDULER);
		utilizationModelEDataType = createEDataType(UTILIZATION_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		computesimEClass.getESuperTypes().add(theInfrastructurePackage.getCompute());
		storagesimEClass.getESuperTypes().add(theInfrastructurePackage.getStorage());
		networksimEClass.getESuperTypes().add(theInfrastructurePackage.getNetwork());
		datacenterEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cloudletEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		hostEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		vmEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		harddrivestorageEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sanstorageEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		probadistribEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		poissonEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		poissonEClass.getESuperTypes().add(this.getProbadistrib());
		gaussEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		gaussEClass.getESuperTypes().add(this.getProbadistrib());
		binomialeEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		binomialeEClass.getESuperTypes().add(this.getProbadistrib());
		pricestrategiesEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ondemandEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ondemandEClass.getESuperTypes().add(this.getPricestrategies());
		upfrontEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		upfrontEClass.getESuperTypes().add(this.getPricestrategies());
		auctionEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		auctionEClass.getESuperTypes().add(this.getPricestrategies());

		// Initialize classes, features, and operations; add parameters
		initEClass(computesimEClass, Computesim.class, "Computesim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storagesimEClass, Storagesim.class, "Storagesim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(networksimEClass, Networksim.class, "Networksim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datacenterEClass, Datacenter.class, "Datacenter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatacenter_Os(), theOCCIPackage.getString(), "os", "Linux", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_Vmm(), theOCCIPackage.getString(), "vmm", "Xen", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_Timezone(), this.getdouble(), "timezone", "10.0", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_Cost(), this.getdouble(), "cost", "3.0", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_CostPerMem(), this.getdouble(), "costPerMem", "0.05", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_CostPerStorage(), this.getdouble(), "costPerStorage", "0.001", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_CostPerBw(), this.getdouble(), "costPerBw", "0.0", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_Name(), theOCCIPackage.getString(), "name", "datacenter_0", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_SchedulingInterval(), this.getdouble(), "schedulingInterval", "0", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatacenter_Location(), theOCCIPackage.getString(), "location", "US East (N. Virginia)", 0, 1, Datacenter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDatacenter__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cloudletEClass, Cloudlet.class, "Cloudlet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudlet_CloudletId(), theOCCIPackage.getInteger(), "cloudletId", "0", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletLength(), this.getlong(), "cloudletLength", "400000", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_Cores(), theOCCIPackage.getInteger(), "cores", "1", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletFileSize(), this.getlong(), "cloudletFileSize", "300", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_CloudletOutputSize(), this.getlong(), "cloudletOutputSize", "300", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_UtilizationModelCpu(), this.getutilizationModel(), "utilizationModelCpu", "UtilizationModelFull", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_UtilizationModelRam(), this.getutilizationModel(), "utilizationModelRam", "UtilizationModelFull", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudlet_UtilizationModelBw(), this.getutilizationModel(), "utilizationModelBw", "UtilizationModelFull", 0, 1, Cloudlet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCloudlet__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hostEClass, Host.class, "Host", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHost_IdHost(), theOCCIPackage.getInteger(), "idHost", "0", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_RamProvisioner(), this.getRamProvisioner(), "ramProvisioner", "RamProvisionerSimple", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_BwProvisioner(), this.getBwProvisioner(), "bwProvisioner", "BwProvisionerSimple", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Storage(), this.getlong(), "storage", "1000000", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Cores(), theOCCIPackage.getInteger(), "cores", "1", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_VmScheduler(), this.getVmScheduler(), "vmScheduler", "VmSchedulerTimeShared", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Ram(), theOCCIPackage.getInteger(), "ram", "2048", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Bw(), theOCCIPackage.getInteger(), "bw", "10000", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_Mips(), theOCCIPackage.getInteger(), "mips", "1000", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_PeProvisioner(), this.getPeProvisioner(), "peProvisioner", "PeProvisionerSimple", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_ElasticHost(), theOCCIPackage.getString(), "elasticHost", "N", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_RamMaxHost(), theOCCIPackage.getInteger(), "ramMaxHost", "0", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_RamMinHost(), theOCCIPackage.getInteger(), "ramMinHost", "0", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHost_MipsMaxHost(), theOCCIPackage.getInteger(), "mipsMaxHost", "0", 0, 1, Host.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getHost__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vmEClass, Vm.class, "Vm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVm_Idvm(), theOCCIPackage.getInteger(), "idvm", "0", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Mips(), theOCCIPackage.getInteger(), "mips", "1000", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Cores(), theOCCIPackage.getInteger(), "cores", "1", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Bw(), this.getlong(), "bw", "1000", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Size(), this.getlong(), "size", "10000", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_CloudletScheduler(), this.getCloudletScheduler(), "cloudletScheduler", "CloudletSchedulerTimeShared", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Vmm(), theOCCIPackage.getString(), "vmm", "Xen", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Ram(), theOCCIPackage.getInteger(), "ram", "512", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_RamMaxVm(), theOCCIPackage.getInteger(), "ramMaxVm", "0", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_RamMinVm(), theOCCIPackage.getInteger(), "ramMinVm", "0", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Os(), theOCCIPackage.getString(), "os", "Linux", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Irdto(), this.getdouble(), "irdto", "0", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Dto(), this.getdouble(), "dto", "0", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Dti(), this.getdouble(), "dti", "0", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_Irdt(), this.getdouble(), "irdt", "0", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVm_ElasticVm(), theOCCIPackage.getString(), "elasticVm", "N", 0, 1, Vm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVm__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(harddrivestorageEClass, Harddrivestorage.class, "Harddrivestorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHarddrivestorage__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sanstorageEClass, Sanstorage.class, "Sanstorage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSanstorage_Bandwidth(), this.getdouble(), "bandwidth", null, 0, 1, Sanstorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSanstorage_NetworkLatency(), this.getdouble(), "networkLatency", null, 0, 1, Sanstorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSanstorage__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(probadistribEClass, Probadistrib.class, "Probadistrib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getProbadistrib__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(poissonEClass, Poisson.class, "Poisson", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoisson_X(), this.getdouble(), "x", null, 0, 1, Poisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoisson_U(), this.getdouble(), "u", null, 0, 1, Poisson.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gaussEClass, Gauss.class, "Gauss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGauss_X(), this.getdouble(), "x", null, 0, 1, Gauss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGauss_N(), this.getdouble(), "n", null, 0, 1, Gauss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGauss_P(), this.getdouble(), "P", null, 0, 1, Gauss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binomialeEClass, Binomiale.class, "Binomiale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinomiale_NumCorrect(), theOCCIPackage.getInteger(), "numCorrect", "10", 0, 1, Binomiale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinomiale_NumTrials(), theOCCIPackage.getInteger(), "numTrials", "13", 0, 1, Binomiale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinomiale_Chance(), this.getdouble(), "chance", "0.5", 0, 1, Binomiale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pricestrategiesEClass, Pricestrategies.class, "Pricestrategies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPricestrategies__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ondemandEClass, Ondemand.class, "Ondemand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(upfrontEClass, Upfront.class, "Upfront", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(auctionEClass, Auction.class, "Auction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(doubleEDataType, Double.class, "double", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longEDataType, Long.class, "long", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ramProvisionerEDataType, Object.class, "RamProvisioner", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bwProvisionerEDataType, Object.class, "BwProvisioner", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(peProvisionerEDataType, Object.class, "PeProvisioner", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cloudletSchedulerEDataType, Object.class, "CloudletScheduler", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vmSchedulerEDataType, Object.class, "VmScheduler", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(utilizationModelEDataType, Object.class, "utilizationModel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (datacenterEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (cloudletEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (hostEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (vmEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (harddrivestorageEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (sanstorageEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (probadistribEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (pricestrategiesEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

} //SimulationPackageImpl
