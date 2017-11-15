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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.occiware.clouddesigner.occi.simulation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationFactoryImpl extends EFactoryImpl implements SimulationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimulationFactory init() {
		try {
			SimulationFactory theSimulationFactory = (SimulationFactory)EPackage.Registry.INSTANCE.getEFactory(SimulationPackage.eNS_URI);
			if (theSimulationFactory != null) {
				return theSimulationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimulationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimulationPackage.COMPUTESIM: return createComputesim();
			case SimulationPackage.STORAGESIM: return createStoragesim();
			case SimulationPackage.NETWORKSIM: return createNetworksim();
			case SimulationPackage.DATACENTER: return createDatacenter();
			case SimulationPackage.CLOUDLET: return createCloudlet();
			case SimulationPackage.HOST: return createHost();
			case SimulationPackage.VM: return createVm();
			case SimulationPackage.HARDDRIVESTORAGE: return createHarddrivestorage();
			case SimulationPackage.SANSTORAGE: return createSanstorage();
			case SimulationPackage.PROBADISTRIB: return createProbadistrib();
			case SimulationPackage.POISSON: return createPoisson();
			case SimulationPackage.GAUSS: return createGauss();
			case SimulationPackage.BINOMIALE: return createBinomiale();
			case SimulationPackage.PRICESTRATEGIES: return createPricestrategies();
			case SimulationPackage.ONDEMAND: return createOndemand();
			case SimulationPackage.UPFRONT: return createUpfront();
			case SimulationPackage.AUCTION: return createAuction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimulationPackage.DOUBLE:
				return createdoubleFromString(eDataType, initialValue);
			case SimulationPackage.LONG:
				return createlongFromString(eDataType, initialValue);
			case SimulationPackage.RAM_PROVISIONER:
				return createRamProvisionerFromString(eDataType, initialValue);
			case SimulationPackage.BW_PROVISIONER:
				return createBwProvisionerFromString(eDataType, initialValue);
			case SimulationPackage.PE_PROVISIONER:
				return createPeProvisionerFromString(eDataType, initialValue);
			case SimulationPackage.CLOUDLET_SCHEDULER:
				return createCloudletSchedulerFromString(eDataType, initialValue);
			case SimulationPackage.VM_SCHEDULER:
				return createVmSchedulerFromString(eDataType, initialValue);
			case SimulationPackage.UTILIZATION_MODEL:
				return createutilizationModelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimulationPackage.DOUBLE:
				return convertdoubleToString(eDataType, instanceValue);
			case SimulationPackage.LONG:
				return convertlongToString(eDataType, instanceValue);
			case SimulationPackage.RAM_PROVISIONER:
				return convertRamProvisionerToString(eDataType, instanceValue);
			case SimulationPackage.BW_PROVISIONER:
				return convertBwProvisionerToString(eDataType, instanceValue);
			case SimulationPackage.PE_PROVISIONER:
				return convertPeProvisionerToString(eDataType, instanceValue);
			case SimulationPackage.CLOUDLET_SCHEDULER:
				return convertCloudletSchedulerToString(eDataType, instanceValue);
			case SimulationPackage.VM_SCHEDULER:
				return convertVmSchedulerToString(eDataType, instanceValue);
			case SimulationPackage.UTILIZATION_MODEL:
				return convertutilizationModelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Computesim createComputesim() {
		ComputesimImpl computesim = new ComputesimImpl();
		return computesim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Storagesim createStoragesim() {
		StoragesimImpl storagesim = new StoragesimImpl();
		return storagesim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Networksim createNetworksim() {
		NetworksimImpl networksim = new NetworksimImpl();
		return networksim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datacenter createDatacenter() {
		DatacenterImpl datacenter = new DatacenterImpl();
		return datacenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cloudlet createCloudlet() {
		CloudletImpl cloudlet = new CloudletImpl();
		return cloudlet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Host createHost() {
		HostImpl host = new HostImpl();
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vm createVm() {
		VmImpl vm = new VmImpl();
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Harddrivestorage createHarddrivestorage() {
		HarddrivestorageImpl harddrivestorage = new HarddrivestorageImpl();
		return harddrivestorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sanstorage createSanstorage() {
		SanstorageImpl sanstorage = new SanstorageImpl();
		return sanstorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probadistrib createProbadistrib() {
		ProbadistribImpl probadistrib = new ProbadistribImpl();
		return probadistrib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Poisson createPoisson() {
		PoissonImpl poisson = new PoissonImpl();
		return poisson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gauss createGauss() {
		GaussImpl gauss = new GaussImpl();
		return gauss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binomiale createBinomiale() {
		BinomialeImpl binomiale = new BinomialeImpl();
		return binomiale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pricestrategies createPricestrategies() {
		PricestrategiesImpl pricestrategies = new PricestrategiesImpl();
		return pricestrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ondemand createOndemand() {
		OndemandImpl ondemand = new OndemandImpl();
		return ondemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Upfront createUpfront() {
		UpfrontImpl upfront = new UpfrontImpl();
		return upfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auction createAuction() {
		AuctionImpl auction = new AuctionImpl();
		return auction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createdoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertdoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createlongFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertlongToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createRamProvisionerFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRamProvisionerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBwProvisionerFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBwProvisionerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPeProvisionerFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPeProvisionerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createCloudletSchedulerFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCloudletSchedulerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createVmSchedulerFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVmSchedulerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createutilizationModelFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertutilizationModelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationPackage getSimulationPackage() {
		return (SimulationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimulationPackage getPackage() {
		return SimulationPackage.eINSTANCE;
	}

} //SimulationFactoryImpl
