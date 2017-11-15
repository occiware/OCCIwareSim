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

import org.occiware.clouddesigner.occi.simulation.Cloudlet;
import org.occiware.clouddesigner.occi.simulation.SimulationPackage;
import org.occiware.clouddesigner.occi.simulation.SimulationTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloudlet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl#getCloudletId <em>Cloudlet Id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl#getCloudletLength <em>Cloudlet Length</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl#getCloudletFileSize <em>Cloudlet File Size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl#getCloudletOutputSize <em>Cloudlet Output Size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl#getUtilizationModelCpu <em>Utilization Model Cpu</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl#getUtilizationModelRam <em>Utilization Model Ram</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl#getUtilizationModelBw <em>Utilization Model Bw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudletImpl extends MixinBaseImpl implements Cloudlet {
	/**
	 * The default value of the '{@link #getCloudletId() <em>Cloudlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CLOUDLET_ID_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getCloudletId() <em>Cloudlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletId()
	 * @generated
	 * @ordered
	 */
	protected Integer cloudletId = CLOUDLET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletLength() <em>Cloudlet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLOUDLET_LENGTH_EDEFAULT = new Long(400000L);

	/**
	 * The cached value of the '{@link #getCloudletLength() <em>Cloudlet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletLength()
	 * @generated
	 * @ordered
	 */
	protected Long cloudletLength = CLOUDLET_LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #getCloudletFileSize() <em>Cloudlet File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLOUDLET_FILE_SIZE_EDEFAULT = new Long(300L);

	/**
	 * The cached value of the '{@link #getCloudletFileSize() <em>Cloudlet File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletFileSize()
	 * @generated
	 * @ordered
	 */
	protected Long cloudletFileSize = CLOUDLET_FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudletOutputSize() <em>Cloudlet Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletOutputSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long CLOUDLET_OUTPUT_SIZE_EDEFAULT = new Long(300L);

	/**
	 * The cached value of the '{@link #getCloudletOutputSize() <em>Cloudlet Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudletOutputSize()
	 * @generated
	 * @ordered
	 */
	protected Long cloudletOutputSize = CLOUDLET_OUTPUT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilizationModelCpu() <em>Utilization Model Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationModelCpu()
	 * @generated
	 * @ordered
	 */
	protected static Object UTILIZATION_MODEL_CPU_EDEFAULT; // TODO The default value literal "UtilizationModelFull" is not valid.

	/**
	 * The cached value of the '{@link #getUtilizationModelCpu() <em>Utilization Model Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationModelCpu()
	 * @generated
	 * @ordered
	 */
	protected Object utilizationModelCpu = UTILIZATION_MODEL_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilizationModelRam() <em>Utilization Model Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationModelRam()
	 * @generated
	 * @ordered
	 */
	protected static Object UTILIZATION_MODEL_RAM_EDEFAULT; // TODO The default value literal "UtilizationModelFull" is not valid.

	/**
	 * The cached value of the '{@link #getUtilizationModelRam() <em>Utilization Model Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationModelRam()
	 * @generated
	 * @ordered
	 */
	protected Object utilizationModelRam = UTILIZATION_MODEL_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUtilizationModelBw() <em>Utilization Model Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationModelBw()
	 * @generated
	 * @ordered
	 */
	protected static Object UTILIZATION_MODEL_BW_EDEFAULT; // TODO The default value literal "UtilizationModelFull" is not valid.

	/**
	 * The cached value of the '{@link #getUtilizationModelBw() <em>Utilization Model Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationModelBw()
	 * @generated
	 * @ordered
	 */
	protected Object utilizationModelBw = UTILIZATION_MODEL_BW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.CLOUDLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCloudletId() {
		return cloudletId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletId(Integer newCloudletId) {
		Integer oldCloudletId = cloudletId;
		cloudletId = newCloudletId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_ID, oldCloudletId, cloudletId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCloudletLength() {
		return cloudletLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletLength(Long newCloudletLength) {
		Long oldCloudletLength = cloudletLength;
		cloudletLength = newCloudletLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_LENGTH, oldCloudletLength, cloudletLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CORES, oldCores, cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCloudletFileSize() {
		return cloudletFileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletFileSize(Long newCloudletFileSize) {
		Long oldCloudletFileSize = cloudletFileSize;
		cloudletFileSize = newCloudletFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE, oldCloudletFileSize, cloudletFileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getCloudletOutputSize() {
		return cloudletOutputSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudletOutputSize(Long newCloudletOutputSize) {
		Long oldCloudletOutputSize = cloudletOutputSize;
		cloudletOutputSize = newCloudletOutputSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE, oldCloudletOutputSize, cloudletOutputSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUtilizationModelCpu() {
		return utilizationModelCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilizationModelCpu(Object newUtilizationModelCpu) {
		Object oldUtilizationModelCpu = utilizationModelCpu;
		utilizationModelCpu = newUtilizationModelCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__UTILIZATION_MODEL_CPU, oldUtilizationModelCpu, utilizationModelCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUtilizationModelRam() {
		return utilizationModelRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilizationModelRam(Object newUtilizationModelRam) {
		Object oldUtilizationModelRam = utilizationModelRam;
		utilizationModelRam = newUtilizationModelRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__UTILIZATION_MODEL_RAM, oldUtilizationModelRam, utilizationModelRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUtilizationModelBw() {
		return utilizationModelBw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilizationModelBw(Object newUtilizationModelBw) {
		Object oldUtilizationModelBw = utilizationModelBw;
		utilizationModelBw = newUtilizationModelBw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.CLOUDLET__UTILIZATION_MODEL_BW, oldUtilizationModelBw, utilizationModelBw));
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
		 *   let severity : Integer[1] = 'Cloudlet::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Computesim)
		 *       in
		 *         'Cloudlet::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SimulationTables.STR_Cloudlet_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SimulationTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_simulation_c_c_Computesim_0 = idResolver.getClass(SimulationTables.CLSSid_Computesim, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_simulation_c_c_Computesim_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SimulationTables.STR_Cloudlet_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, SimulationTables.INT_0).booleanValue();
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
			case SimulationPackage.CLOUDLET__CLOUDLET_ID:
				return getCloudletId();
			case SimulationPackage.CLOUDLET__CLOUDLET_LENGTH:
				return getCloudletLength();
			case SimulationPackage.CLOUDLET__CORES:
				return getCores();
			case SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE:
				return getCloudletFileSize();
			case SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE:
				return getCloudletOutputSize();
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_CPU:
				return getUtilizationModelCpu();
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_RAM:
				return getUtilizationModelRam();
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_BW:
				return getUtilizationModelBw();
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
			case SimulationPackage.CLOUDLET__CLOUDLET_ID:
				setCloudletId((Integer)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_LENGTH:
				setCloudletLength((Long)newValue);
				return;
			case SimulationPackage.CLOUDLET__CORES:
				setCores((Integer)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE:
				setCloudletFileSize((Long)newValue);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE:
				setCloudletOutputSize((Long)newValue);
				return;
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_CPU:
				setUtilizationModelCpu(newValue);
				return;
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_RAM:
				setUtilizationModelRam(newValue);
				return;
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_BW:
				setUtilizationModelBw(newValue);
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
			case SimulationPackage.CLOUDLET__CLOUDLET_ID:
				setCloudletId(CLOUDLET_ID_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_LENGTH:
				setCloudletLength(CLOUDLET_LENGTH_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CORES:
				setCores(CORES_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE:
				setCloudletFileSize(CLOUDLET_FILE_SIZE_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE:
				setCloudletOutputSize(CLOUDLET_OUTPUT_SIZE_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_CPU:
				setUtilizationModelCpu(UTILIZATION_MODEL_CPU_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_RAM:
				setUtilizationModelRam(UTILIZATION_MODEL_RAM_EDEFAULT);
				return;
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_BW:
				setUtilizationModelBw(UTILIZATION_MODEL_BW_EDEFAULT);
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
			case SimulationPackage.CLOUDLET__CLOUDLET_ID:
				return CLOUDLET_ID_EDEFAULT == null ? cloudletId != null : !CLOUDLET_ID_EDEFAULT.equals(cloudletId);
			case SimulationPackage.CLOUDLET__CLOUDLET_LENGTH:
				return CLOUDLET_LENGTH_EDEFAULT == null ? cloudletLength != null : !CLOUDLET_LENGTH_EDEFAULT.equals(cloudletLength);
			case SimulationPackage.CLOUDLET__CORES:
				return CORES_EDEFAULT == null ? cores != null : !CORES_EDEFAULT.equals(cores);
			case SimulationPackage.CLOUDLET__CLOUDLET_FILE_SIZE:
				return CLOUDLET_FILE_SIZE_EDEFAULT == null ? cloudletFileSize != null : !CLOUDLET_FILE_SIZE_EDEFAULT.equals(cloudletFileSize);
			case SimulationPackage.CLOUDLET__CLOUDLET_OUTPUT_SIZE:
				return CLOUDLET_OUTPUT_SIZE_EDEFAULT == null ? cloudletOutputSize != null : !CLOUDLET_OUTPUT_SIZE_EDEFAULT.equals(cloudletOutputSize);
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_CPU:
				return UTILIZATION_MODEL_CPU_EDEFAULT == null ? utilizationModelCpu != null : !UTILIZATION_MODEL_CPU_EDEFAULT.equals(utilizationModelCpu);
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_RAM:
				return UTILIZATION_MODEL_RAM_EDEFAULT == null ? utilizationModelRam != null : !UTILIZATION_MODEL_RAM_EDEFAULT.equals(utilizationModelRam);
			case SimulationPackage.CLOUDLET__UTILIZATION_MODEL_BW:
				return UTILIZATION_MODEL_BW_EDEFAULT == null ? utilizationModelBw != null : !UTILIZATION_MODEL_BW_EDEFAULT.equals(utilizationModelBw);
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
			case SimulationPackage.CLOUDLET___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (cloudletId: ");
		result.append(cloudletId);
		result.append(", cloudletLength: ");
		result.append(cloudletLength);
		result.append(", cores: ");
		result.append(cores);
		result.append(", cloudletFileSize: ");
		result.append(cloudletFileSize);
		result.append(", cloudletOutputSize: ");
		result.append(cloudletOutputSize);
		result.append(", utilizationModelCpu: ");
		result.append(utilizationModelCpu);
		result.append(", utilizationModelRam: ");
		result.append(utilizationModelRam);
		result.append(", utilizationModelBw: ");
		result.append(utilizationModelBw);
		result.append(')');
		return result.toString();
	}

} //CloudletImpl
