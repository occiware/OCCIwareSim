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
package org.occiware.clouddesigner.occi.simulation.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.infrastructure.util.InfrastructureValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.occiware.clouddesigner.occi.simulation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage
 * @generated
 */
public class SimulationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SimulationValidator INSTANCE = new SimulationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.occiware.clouddesigner.occi.simulation";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Datacenter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATACENTER__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Cloudlet'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLOUDLET__APPLIES_CONSTRAINT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Host'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HOST__APPLIES_CONSTRAINT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Vm'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VM__APPLIES_CONSTRAINT = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Harddrivestorage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HARDDRIVESTORAGE__APPLIES_CONSTRAINT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Sanstorage'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SANSTORAGE__APPLIES_CONSTRAINT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Probadistrib'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBADISTRIB__APPLIES_CONSTRAINT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Pricestrategies'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRICESTRATEGIES__APPLIES_CONSTRAINT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 8;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureValidator infrastructureValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
		infrastructureValidator = InfrastructureValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SimulationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SimulationPackage.COMPUTESIM:
				return validateComputesim((Computesim)value, diagnostics, context);
			case SimulationPackage.STORAGESIM:
				return validateStoragesim((Storagesim)value, diagnostics, context);
			case SimulationPackage.NETWORKSIM:
				return validateNetworksim((Networksim)value, diagnostics, context);
			case SimulationPackage.DATACENTER:
				return validateDatacenter((Datacenter)value, diagnostics, context);
			case SimulationPackage.CLOUDLET:
				return validateCloudlet((Cloudlet)value, diagnostics, context);
			case SimulationPackage.HOST:
				return validateHost((Host)value, diagnostics, context);
			case SimulationPackage.VM:
				return validateVm((Vm)value, diagnostics, context);
			case SimulationPackage.HARDDRIVESTORAGE:
				return validateHarddrivestorage((Harddrivestorage)value, diagnostics, context);
			case SimulationPackage.SANSTORAGE:
				return validateSanstorage((Sanstorage)value, diagnostics, context);
			case SimulationPackage.PROBADISTRIB:
				return validateProbadistrib((Probadistrib)value, diagnostics, context);
			case SimulationPackage.POISSON:
				return validatePoisson((Poisson)value, diagnostics, context);
			case SimulationPackage.GAUSS:
				return validateGauss((Gauss)value, diagnostics, context);
			case SimulationPackage.BINOMIALE:
				return validateBinomiale((Binomiale)value, diagnostics, context);
			case SimulationPackage.PRICESTRATEGIES:
				return validatePricestrategies((Pricestrategies)value, diagnostics, context);
			case SimulationPackage.ONDEMAND:
				return validateOndemand((Ondemand)value, diagnostics, context);
			case SimulationPackage.UPFRONT:
				return validateUpfront((Upfront)value, diagnostics, context);
			case SimulationPackage.AUCTION:
				return validateAuction((Auction)value, diagnostics, context);
			case SimulationPackage.DOUBLE:
				return validatedouble((Double)value, diagnostics, context);
			case SimulationPackage.LONG:
				return validatelong((Long)value, diagnostics, context);
			case SimulationPackage.RAM_PROVISIONER:
				return validateRamProvisioner(value, diagnostics, context);
			case SimulationPackage.BW_PROVISIONER:
				return validateBwProvisioner(value, diagnostics, context);
			case SimulationPackage.PE_PROVISIONER:
				return validatePeProvisioner(value, diagnostics, context);
			case SimulationPackage.CLOUDLET_SCHEDULER:
				return validateCloudletScheduler(value, diagnostics, context);
			case SimulationPackage.VM_SCHEDULER:
				return validateVmScheduler(value, diagnostics, context);
			case SimulationPackage.UTILIZATION_MODEL:
				return validateutilizationModel(value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputesim(Computesim computesim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(computesim, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(computesim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(computesim, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStoragesim(Storagesim storagesim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storagesim, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(storagesim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(storagesim, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworksim(Networksim networksim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(networksim, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(networksim, diagnostics, context);
		if (result || diagnostics != null) result &= infrastructureValidator.validateNetwork_UniqueVlan(networksim, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatacenter(Datacenter datacenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(datacenter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(datacenter, diagnostics, context);
		if (result || diagnostics != null) result &= validateDatacenter_appliesConstraint(datacenter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Datacenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatacenter_appliesConstraint(Datacenter datacenter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return datacenter.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudlet(Cloudlet cloudlet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cloudlet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cloudlet, diagnostics, context);
		if (result || diagnostics != null) result &= validateCloudlet_appliesConstraint(cloudlet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Cloudlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudlet_appliesConstraint(Cloudlet cloudlet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cloudlet.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHost(Host host, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(host, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(host, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(host, diagnostics, context);
		if (result || diagnostics != null) result &= validateHost_appliesConstraint(host, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHost_appliesConstraint(Host host, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return host.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVm(Vm vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vm, diagnostics, context);
		if (result || diagnostics != null) result &= validateVm_appliesConstraint(vm, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Vm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVm_appliesConstraint(Vm vm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vm.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHarddrivestorage(Harddrivestorage harddrivestorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(harddrivestorage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(harddrivestorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(harddrivestorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(harddrivestorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(harddrivestorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(harddrivestorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(harddrivestorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(harddrivestorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(harddrivestorage, diagnostics, context);
		if (result || diagnostics != null) result &= validateHarddrivestorage_appliesConstraint(harddrivestorage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Harddrivestorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHarddrivestorage_appliesConstraint(Harddrivestorage harddrivestorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return harddrivestorage.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSanstorage(Sanstorage sanstorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sanstorage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sanstorage, diagnostics, context);
		if (result || diagnostics != null) result &= validateSanstorage_appliesConstraint(sanstorage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Sanstorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSanstorage_appliesConstraint(Sanstorage sanstorage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sanstorage.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbadistrib(Probadistrib probadistrib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(probadistrib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(probadistrib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(probadistrib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(probadistrib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(probadistrib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(probadistrib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(probadistrib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(probadistrib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(probadistrib, diagnostics, context);
		if (result || diagnostics != null) result &= validateProbadistrib_appliesConstraint(probadistrib, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Probadistrib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProbadistrib_appliesConstraint(Probadistrib probadistrib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return probadistrib.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoisson(Poisson poisson, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(poisson, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(poisson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(poisson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(poisson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(poisson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(poisson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(poisson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(poisson, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(poisson, diagnostics, context);
		if (result || diagnostics != null) result &= validateProbadistrib_appliesConstraint(poisson, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGauss(Gauss gauss, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gauss, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gauss, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gauss, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gauss, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gauss, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gauss, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gauss, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gauss, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gauss, diagnostics, context);
		if (result || diagnostics != null) result &= validateProbadistrib_appliesConstraint(gauss, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinomiale(Binomiale binomiale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(binomiale, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(binomiale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(binomiale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(binomiale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(binomiale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(binomiale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(binomiale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(binomiale, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(binomiale, diagnostics, context);
		if (result || diagnostics != null) result &= validateProbadistrib_appliesConstraint(binomiale, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePricestrategies(Pricestrategies pricestrategies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pricestrategies, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pricestrategies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pricestrategies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pricestrategies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pricestrategies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pricestrategies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pricestrategies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pricestrategies, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pricestrategies, diagnostics, context);
		if (result || diagnostics != null) result &= validatePricestrategies_appliesConstraint(pricestrategies, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Pricestrategies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePricestrategies_appliesConstraint(Pricestrategies pricestrategies, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pricestrategies.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOndemand(Ondemand ondemand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ondemand, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ondemand, diagnostics, context);
		if (result || diagnostics != null) result &= validatePricestrategies_appliesConstraint(ondemand, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpfront(Upfront upfront, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(upfront, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(upfront, diagnostics, context);
		if (result || diagnostics != null) result &= validatePricestrategies_appliesConstraint(upfront, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuction(Auction auction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(auction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(auction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(auction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(auction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(auction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(auction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(auction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(auction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(auction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePricestrategies_appliesConstraint(auction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatedouble(Double double_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatelong(Long long_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRamProvisioner(Object ramProvisioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBwProvisioner(Object bwProvisioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePeProvisioner(Object peProvisioner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudletScheduler(Object cloudletScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmScheduler(Object vmScheduler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateutilizationModel(Object utilizationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SimulationValidator
