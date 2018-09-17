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
package occ.simulation.impl;

import occ.simulation.SimulationPackage;
import occ.simulation.Vm;

import org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link occ.simulation.impl.VmImpl#getVmId <em>Vm Id</em>}</li>
 *   <li>{@link occ.simulation.impl.VmImpl#getVmMips <em>Vm Mips</em>}</li>
 *   <li>{@link occ.simulation.impl.VmImpl#getVmCores <em>Vm Cores</em>}</li>
 *   <li>{@link occ.simulation.impl.VmImpl#getVmImageSize <em>Vm Image Size</em>}</li>
 *   <li>{@link occ.simulation.impl.VmImpl#getVmBw <em>Vm Bw</em>}</li>
 *   <li>{@link occ.simulation.impl.VmImpl#getVmRam <em>Vm Ram</em>}</li>
 *   <li>{@link occ.simulation.impl.VmImpl#getVmOs <em>Vm Os</em>}</li>
 *   <li>{@link occ.simulation.impl.VmImpl#getVmCloudletScheduler <em>Vm Cloudlet Scheduler</em>}</li>
 *   <li>{@link occ.simulation.impl.VmImpl#getVmElasticity <em>Vm Elasticity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VmImpl extends ComputeImpl implements Vm {
	/**
	 * The default value of the '{@link #getVmId() <em>Vm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmId()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmId() <em>Vm Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmId()
	 * @generated
	 * @ordered
	 */
	protected Integer vmId = VM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmMips() <em>Vm Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmMips()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VM_MIPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmMips() <em>Vm Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmMips()
	 * @generated
	 * @ordered
	 */
	protected Integer vmMips = VM_MIPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmCores() <em>Vm Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmCores()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VM_CORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmCores() <em>Vm Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmCores()
	 * @generated
	 * @ordered
	 */
	protected Integer vmCores = VM_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmImageSize() <em>Vm Image Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmImageSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long VM_IMAGE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmImageSize() <em>Vm Image Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmImageSize()
	 * @generated
	 * @ordered
	 */
	protected Long vmImageSize = VM_IMAGE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmBw() <em>Vm Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmBw()
	 * @generated
	 * @ordered
	 */
	protected static final Long VM_BW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmBw() <em>Vm Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmBw()
	 * @generated
	 * @ordered
	 */
	protected Long vmBw = VM_BW_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmRam() <em>Vm Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmRam()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VM_RAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmRam() <em>Vm Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmRam()
	 * @generated
	 * @ordered
	 */
	protected Integer vmRam = VM_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmOs() <em>Vm Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmOs()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmOs() <em>Vm Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmOs()
	 * @generated
	 * @ordered
	 */
	protected String vmOs = VM_OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmCloudletScheduler() <em>Vm Cloudlet Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmCloudletScheduler()
	 * @generated
	 * @ordered
	 */
	protected static final Object VM_CLOUDLET_SCHEDULER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmCloudletScheduler() <em>Vm Cloudlet Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmCloudletScheduler()
	 * @generated
	 * @ordered
	 */
	protected Object vmCloudletScheduler = VM_CLOUDLET_SCHEDULER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmElasticity() <em>Vm Elasticity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmElasticity()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ELASTICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmElasticity() <em>Vm Elasticity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmElasticity()
	 * @generated
	 * @ordered
	 */
	protected String vmElasticity = VM_ELASTICITY_EDEFAULT;

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
	public Integer getVmId() {
		return vmId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmId(Integer newVmId) {
		Integer oldVmId = vmId;
		vmId = newVmId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VM_ID, oldVmId, vmId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVmMips() {
		return vmMips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmMips(Integer newVmMips) {
		Integer oldVmMips = vmMips;
		vmMips = newVmMips;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VM_MIPS, oldVmMips, vmMips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVmCores() {
		return vmCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmCores(Integer newVmCores) {
		Integer oldVmCores = vmCores;
		vmCores = newVmCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VM_CORES, oldVmCores, vmCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getVmImageSize() {
		return vmImageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmImageSize(Long newVmImageSize) {
		Long oldVmImageSize = vmImageSize;
		vmImageSize = newVmImageSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VM_IMAGE_SIZE, oldVmImageSize, vmImageSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getVmBw() {
		return vmBw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmBw(Long newVmBw) {
		Long oldVmBw = vmBw;
		vmBw = newVmBw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VM_BW, oldVmBw, vmBw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVmRam() {
		return vmRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmRam(Integer newVmRam) {
		Integer oldVmRam = vmRam;
		vmRam = newVmRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VM_RAM, oldVmRam, vmRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmOs() {
		return vmOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmOs(String newVmOs) {
		String oldVmOs = vmOs;
		vmOs = newVmOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VM_OS, oldVmOs, vmOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVmCloudletScheduler() {
		return vmCloudletScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmCloudletScheduler(Object newVmCloudletScheduler) {
		Object oldVmCloudletScheduler = vmCloudletScheduler;
		vmCloudletScheduler = newVmCloudletScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VM_CLOUDLET_SCHEDULER, oldVmCloudletScheduler, vmCloudletScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmElasticity() {
		return vmElasticity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmElasticity(String newVmElasticity) {
		String oldVmElasticity = vmElasticity;
		vmElasticity = newVmElasticity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.VM__VM_ELASTICITY, oldVmElasticity, vmElasticity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulationPackage.VM__VM_ID:
				return getVmId();
			case SimulationPackage.VM__VM_MIPS:
				return getVmMips();
			case SimulationPackage.VM__VM_CORES:
				return getVmCores();
			case SimulationPackage.VM__VM_IMAGE_SIZE:
				return getVmImageSize();
			case SimulationPackage.VM__VM_BW:
				return getVmBw();
			case SimulationPackage.VM__VM_RAM:
				return getVmRam();
			case SimulationPackage.VM__VM_OS:
				return getVmOs();
			case SimulationPackage.VM__VM_CLOUDLET_SCHEDULER:
				return getVmCloudletScheduler();
			case SimulationPackage.VM__VM_ELASTICITY:
				return getVmElasticity();
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
			case SimulationPackage.VM__VM_ID:
				setVmId((Integer)newValue);
				return;
			case SimulationPackage.VM__VM_MIPS:
				setVmMips((Integer)newValue);
				return;
			case SimulationPackage.VM__VM_CORES:
				setVmCores((Integer)newValue);
				return;
			case SimulationPackage.VM__VM_IMAGE_SIZE:
				setVmImageSize((Long)newValue);
				return;
			case SimulationPackage.VM__VM_BW:
				setVmBw((Long)newValue);
				return;
			case SimulationPackage.VM__VM_RAM:
				setVmRam((Integer)newValue);
				return;
			case SimulationPackage.VM__VM_OS:
				setVmOs((String)newValue);
				return;
			case SimulationPackage.VM__VM_CLOUDLET_SCHEDULER:
				setVmCloudletScheduler(newValue);
				return;
			case SimulationPackage.VM__VM_ELASTICITY:
				setVmElasticity((String)newValue);
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
			case SimulationPackage.VM__VM_ID:
				setVmId(VM_ID_EDEFAULT);
				return;
			case SimulationPackage.VM__VM_MIPS:
				setVmMips(VM_MIPS_EDEFAULT);
				return;
			case SimulationPackage.VM__VM_CORES:
				setVmCores(VM_CORES_EDEFAULT);
				return;
			case SimulationPackage.VM__VM_IMAGE_SIZE:
				setVmImageSize(VM_IMAGE_SIZE_EDEFAULT);
				return;
			case SimulationPackage.VM__VM_BW:
				setVmBw(VM_BW_EDEFAULT);
				return;
			case SimulationPackage.VM__VM_RAM:
				setVmRam(VM_RAM_EDEFAULT);
				return;
			case SimulationPackage.VM__VM_OS:
				setVmOs(VM_OS_EDEFAULT);
				return;
			case SimulationPackage.VM__VM_CLOUDLET_SCHEDULER:
				setVmCloudletScheduler(VM_CLOUDLET_SCHEDULER_EDEFAULT);
				return;
			case SimulationPackage.VM__VM_ELASTICITY:
				setVmElasticity(VM_ELASTICITY_EDEFAULT);
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
			case SimulationPackage.VM__VM_ID:
				return VM_ID_EDEFAULT == null ? vmId != null : !VM_ID_EDEFAULT.equals(vmId);
			case SimulationPackage.VM__VM_MIPS:
				return VM_MIPS_EDEFAULT == null ? vmMips != null : !VM_MIPS_EDEFAULT.equals(vmMips);
			case SimulationPackage.VM__VM_CORES:
				return VM_CORES_EDEFAULT == null ? vmCores != null : !VM_CORES_EDEFAULT.equals(vmCores);
			case SimulationPackage.VM__VM_IMAGE_SIZE:
				return VM_IMAGE_SIZE_EDEFAULT == null ? vmImageSize != null : !VM_IMAGE_SIZE_EDEFAULT.equals(vmImageSize);
			case SimulationPackage.VM__VM_BW:
				return VM_BW_EDEFAULT == null ? vmBw != null : !VM_BW_EDEFAULT.equals(vmBw);
			case SimulationPackage.VM__VM_RAM:
				return VM_RAM_EDEFAULT == null ? vmRam != null : !VM_RAM_EDEFAULT.equals(vmRam);
			case SimulationPackage.VM__VM_OS:
				return VM_OS_EDEFAULT == null ? vmOs != null : !VM_OS_EDEFAULT.equals(vmOs);
			case SimulationPackage.VM__VM_CLOUDLET_SCHEDULER:
				return VM_CLOUDLET_SCHEDULER_EDEFAULT == null ? vmCloudletScheduler != null : !VM_CLOUDLET_SCHEDULER_EDEFAULT.equals(vmCloudletScheduler);
			case SimulationPackage.VM__VM_ELASTICITY:
				return VM_ELASTICITY_EDEFAULT == null ? vmElasticity != null : !VM_ELASTICITY_EDEFAULT.equals(vmElasticity);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (vmId: ");
		result.append(vmId);
		result.append(", vmMips: ");
		result.append(vmMips);
		result.append(", vmCores: ");
		result.append(vmCores);
		result.append(", vmImageSize: ");
		result.append(vmImageSize);
		result.append(", vmBw: ");
		result.append(vmBw);
		result.append(", vmRam: ");
		result.append(vmRam);
		result.append(", vmOs: ");
		result.append(vmOs);
		result.append(", vmCloudletScheduler: ");
		result.append(vmCloudletScheduler);
		result.append(", vmElasticity: ");
		result.append(vmElasticity);
		result.append(')');
		return result.toString();
	}

} //VmImpl
