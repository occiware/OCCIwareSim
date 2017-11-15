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

import org.occiware.clouddesigner.occi.simulation.Datacenter;
import org.occiware.clouddesigner.occi.simulation.SimulationPackage;
import org.occiware.clouddesigner.occi.simulation.SimulationTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datacenter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getVmm <em>Vmm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getCostPerMem <em>Cost Per Mem</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getCostPerStorage <em>Cost Per Storage</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getCostPerBw <em>Cost Per Bw</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getSchedulingInterval <em>Scheduling Interval</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatacenterImpl extends MixinBaseImpl implements Datacenter {
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
	 * The default value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected static final Double TIMEZONE_EDEFAULT = new Double(10.0);

	/**
	 * The cached value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected Double timezone = TIMEZONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final Double COST_EDEFAULT = new Double(3.0);

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected Double cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostPerMem() <em>Cost Per Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerMem()
	 * @generated
	 * @ordered
	 */
	protected static final Double COST_PER_MEM_EDEFAULT = new Double(0.05);

	/**
	 * The cached value of the '{@link #getCostPerMem() <em>Cost Per Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerMem()
	 * @generated
	 * @ordered
	 */
	protected Double costPerMem = COST_PER_MEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostPerStorage() <em>Cost Per Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerStorage()
	 * @generated
	 * @ordered
	 */
	protected static final Double COST_PER_STORAGE_EDEFAULT = new Double(0.001);

	/**
	 * The cached value of the '{@link #getCostPerStorage() <em>Cost Per Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerStorage()
	 * @generated
	 * @ordered
	 */
	protected Double costPerStorage = COST_PER_STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostPerBw() <em>Cost Per Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerBw()
	 * @generated
	 * @ordered
	 */
	protected static final Double COST_PER_BW_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getCostPerBw() <em>Cost Per Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerBw()
	 * @generated
	 * @ordered
	 */
	protected Double costPerBw = COST_PER_BW_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "datacenter_0";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchedulingInterval() <em>Scheduling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCHEDULING_INTERVAL_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getSchedulingInterval() <em>Scheduling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingInterval()
	 * @generated
	 * @ordered
	 */
	protected Double schedulingInterval = SCHEDULING_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = "US East (N. Virginia)";

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatacenterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.DATACENTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__OS, oldOs, os));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__VMM, oldVmm, vmm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTimezone() {
		return timezone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimezone(Double newTimezone) {
		Double oldTimezone = timezone;
		timezone = newTimezone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__TIMEZONE, oldTimezone, timezone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(Double newCost) {
		Double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCostPerMem() {
		return costPerMem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerMem(Double newCostPerMem) {
		Double oldCostPerMem = costPerMem;
		costPerMem = newCostPerMem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__COST_PER_MEM, oldCostPerMem, costPerMem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCostPerStorage() {
		return costPerStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerStorage(Double newCostPerStorage) {
		Double oldCostPerStorage = costPerStorage;
		costPerStorage = newCostPerStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__COST_PER_STORAGE, oldCostPerStorage, costPerStorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCostPerBw() {
		return costPerBw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerBw(Double newCostPerBw) {
		Double oldCostPerBw = costPerBw;
		costPerBw = newCostPerBw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__COST_PER_BW, oldCostPerBw, costPerBw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSchedulingInterval() {
		return schedulingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingInterval(Double newSchedulingInterval) {
		Double oldSchedulingInterval = schedulingInterval;
		schedulingInterval = newSchedulingInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__SCHEDULING_INTERVAL, oldSchedulingInterval, schedulingInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.DATACENTER__LOCATION, oldLocation, location));
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
		 *   let severity : Integer[1] = 'Datacenter::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Computesim)
		 *       in
		 *         'Datacenter::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SimulationTables.STR_Datacenter_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SimulationTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_simulation_c_c_Computesim = idResolver.getClass(SimulationTables.CLSSid_Computesim, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_simulation_c_c_Computesim).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SimulationTables.STR_Datacenter_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, SimulationTables.INT_0).booleanValue();
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
			case SimulationPackage.DATACENTER__OS:
				return getOs();
			case SimulationPackage.DATACENTER__VMM:
				return getVmm();
			case SimulationPackage.DATACENTER__TIMEZONE:
				return getTimezone();
			case SimulationPackage.DATACENTER__COST:
				return getCost();
			case SimulationPackage.DATACENTER__COST_PER_MEM:
				return getCostPerMem();
			case SimulationPackage.DATACENTER__COST_PER_STORAGE:
				return getCostPerStorage();
			case SimulationPackage.DATACENTER__COST_PER_BW:
				return getCostPerBw();
			case SimulationPackage.DATACENTER__NAME:
				return getName();
			case SimulationPackage.DATACENTER__SCHEDULING_INTERVAL:
				return getSchedulingInterval();
			case SimulationPackage.DATACENTER__LOCATION:
				return getLocation();
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
			case SimulationPackage.DATACENTER__OS:
				setOs((String)newValue);
				return;
			case SimulationPackage.DATACENTER__VMM:
				setVmm((String)newValue);
				return;
			case SimulationPackage.DATACENTER__TIMEZONE:
				setTimezone((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__COST:
				setCost((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__COST_PER_MEM:
				setCostPerMem((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__COST_PER_STORAGE:
				setCostPerStorage((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__COST_PER_BW:
				setCostPerBw((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__NAME:
				setName((String)newValue);
				return;
			case SimulationPackage.DATACENTER__SCHEDULING_INTERVAL:
				setSchedulingInterval((Double)newValue);
				return;
			case SimulationPackage.DATACENTER__LOCATION:
				setLocation((String)newValue);
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
			case SimulationPackage.DATACENTER__OS:
				setOs(OS_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__VMM:
				setVmm(VMM_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__TIMEZONE:
				setTimezone(TIMEZONE_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__COST:
				setCost(COST_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__COST_PER_MEM:
				setCostPerMem(COST_PER_MEM_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__COST_PER_STORAGE:
				setCostPerStorage(COST_PER_STORAGE_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__COST_PER_BW:
				setCostPerBw(COST_PER_BW_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__SCHEDULING_INTERVAL:
				setSchedulingInterval(SCHEDULING_INTERVAL_EDEFAULT);
				return;
			case SimulationPackage.DATACENTER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
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
			case SimulationPackage.DATACENTER__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case SimulationPackage.DATACENTER__VMM:
				return VMM_EDEFAULT == null ? vmm != null : !VMM_EDEFAULT.equals(vmm);
			case SimulationPackage.DATACENTER__TIMEZONE:
				return TIMEZONE_EDEFAULT == null ? timezone != null : !TIMEZONE_EDEFAULT.equals(timezone);
			case SimulationPackage.DATACENTER__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case SimulationPackage.DATACENTER__COST_PER_MEM:
				return COST_PER_MEM_EDEFAULT == null ? costPerMem != null : !COST_PER_MEM_EDEFAULT.equals(costPerMem);
			case SimulationPackage.DATACENTER__COST_PER_STORAGE:
				return COST_PER_STORAGE_EDEFAULT == null ? costPerStorage != null : !COST_PER_STORAGE_EDEFAULT.equals(costPerStorage);
			case SimulationPackage.DATACENTER__COST_PER_BW:
				return COST_PER_BW_EDEFAULT == null ? costPerBw != null : !COST_PER_BW_EDEFAULT.equals(costPerBw);
			case SimulationPackage.DATACENTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SimulationPackage.DATACENTER__SCHEDULING_INTERVAL:
				return SCHEDULING_INTERVAL_EDEFAULT == null ? schedulingInterval != null : !SCHEDULING_INTERVAL_EDEFAULT.equals(schedulingInterval);
			case SimulationPackage.DATACENTER__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
			case SimulationPackage.DATACENTER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (os: ");
		result.append(os);
		result.append(", vmm: ");
		result.append(vmm);
		result.append(", timezone: ");
		result.append(timezone);
		result.append(", cost: ");
		result.append(cost);
		result.append(", costPerMem: ");
		result.append(costPerMem);
		result.append(", costPerStorage: ");
		result.append(costPerStorage);
		result.append(", costPerBw: ");
		result.append(costPerBw);
		result.append(", name: ");
		result.append(name);
		result.append(", schedulingInterval: ");
		result.append(schedulingInterval);
		result.append(", location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //DatacenterImpl
