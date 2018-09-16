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

import org.occiware.clouddesigner.occi.simulation.Binomiale;
import org.occiware.clouddesigner.occi.simulation.Probadistrib;
import org.occiware.clouddesigner.occi.simulation.SimulationPackage;
import org.occiware.clouddesigner.occi.simulation.SimulationTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binomiale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.BinomialeImpl#getNumCorrect <em>Num Correct</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.BinomialeImpl#getNumTrials <em>Num Trials</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.BinomialeImpl#getChance <em>Chance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinomialeImpl extends MixinBaseImpl implements Binomiale {
	/**
	 * The default value of the '{@link #getNumCorrect() <em>Num Correct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCorrect()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_CORRECT_EDEFAULT = new Integer(10);

	/**
	 * The cached value of the '{@link #getNumCorrect() <em>Num Correct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCorrect()
	 * @generated
	 * @ordered
	 */
	protected Integer numCorrect = NUM_CORRECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumTrials() <em>Num Trials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTrials()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_TRIALS_EDEFAULT = new Integer(13);

	/**
	 * The cached value of the '{@link #getNumTrials() <em>Num Trials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTrials()
	 * @generated
	 * @ordered
	 */
	protected Integer numTrials = NUM_TRIALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChance() <em>Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChance()
	 * @generated
	 * @ordered
	 */
	protected static final Double CHANCE_EDEFAULT = new Double(0.5);

	/**
	 * The cached value of the '{@link #getChance() <em>Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChance()
	 * @generated
	 * @ordered
	 */
	protected Double chance = CHANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinomialeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.BINOMIALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumCorrect() {
		return numCorrect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCorrect(Integer newNumCorrect) {
		Integer oldNumCorrect = numCorrect;
		numCorrect = newNumCorrect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.BINOMIALE__NUM_CORRECT, oldNumCorrect, numCorrect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumTrials() {
		return numTrials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumTrials(Integer newNumTrials) {
		Integer oldNumTrials = numTrials;
		numTrials = newNumTrials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.BINOMIALE__NUM_TRIALS, oldNumTrials, numTrials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getChance() {
		return chance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChance(Double newChance) {
		Double oldChance = chance;
		chance = newChance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.BINOMIALE__CHANCE, oldChance, chance));
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
		 *   let severity : Integer[1] = 'Probadistrib::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(occi::Resource)
		 *       in
		 *         'Probadistrib::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SimulationTables.STR_Probadistrib_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SimulationTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_occi_c_c_Resource = idResolver.getClass(SimulationTables.CLSSid_Resource, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_occi_c_c_Resource).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SimulationTables.STR_Probadistrib_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, SimulationTables.INT_0).booleanValue();
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
			case SimulationPackage.BINOMIALE__NUM_CORRECT:
				return getNumCorrect();
			case SimulationPackage.BINOMIALE__NUM_TRIALS:
				return getNumTrials();
			case SimulationPackage.BINOMIALE__CHANCE:
				return getChance();
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
			case SimulationPackage.BINOMIALE__NUM_CORRECT:
				setNumCorrect((Integer)newValue);
				return;
			case SimulationPackage.BINOMIALE__NUM_TRIALS:
				setNumTrials((Integer)newValue);
				return;
			case SimulationPackage.BINOMIALE__CHANCE:
				setChance((Double)newValue);
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
			case SimulationPackage.BINOMIALE__NUM_CORRECT:
				setNumCorrect(NUM_CORRECT_EDEFAULT);
				return;
			case SimulationPackage.BINOMIALE__NUM_TRIALS:
				setNumTrials(NUM_TRIALS_EDEFAULT);
				return;
			case SimulationPackage.BINOMIALE__CHANCE:
				setChance(CHANCE_EDEFAULT);
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
			case SimulationPackage.BINOMIALE__NUM_CORRECT:
				return NUM_CORRECT_EDEFAULT == null ? numCorrect != null : !NUM_CORRECT_EDEFAULT.equals(numCorrect);
			case SimulationPackage.BINOMIALE__NUM_TRIALS:
				return NUM_TRIALS_EDEFAULT == null ? numTrials != null : !NUM_TRIALS_EDEFAULT.equals(numTrials);
			case SimulationPackage.BINOMIALE__CHANCE:
				return CHANCE_EDEFAULT == null ? chance != null : !CHANCE_EDEFAULT.equals(chance);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Probadistrib.class) {
			switch (baseOperationID) {
				case SimulationPackage.PROBADISTRIB___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return SimulationPackage.BINOMIALE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case SimulationPackage.BINOMIALE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (numCorrect: ");
		result.append(numCorrect);
		result.append(", numTrials: ");
		result.append(numTrials);
		result.append(", chance: ");
		result.append(chance);
		result.append(')');
		return result.toString();
	}

} //BinomialeImpl
