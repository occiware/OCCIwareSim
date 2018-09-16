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

import org.occiware.clouddesigner.occi.simulation.Host;
import org.occiware.clouddesigner.occi.simulation.SimulationPackage;
import org.occiware.clouddesigner.occi.simulation.SimulationTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getIdHost <em>Id Host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getRamProvisioner <em>Ram Provisioner</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getBwProvisioner <em>Bw Provisioner</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getCores <em>Cores</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getVmScheduler <em>Vm Scheduler</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getRam <em>Ram</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getBw <em>Bw</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getMips <em>Mips</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getPeProvisioner <em>Pe Provisioner</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getElasticHost <em>Elastic Host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getRamMaxHost <em>Ram Max Host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getRamMinHost <em>Ram Min Host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl#getMipsMaxHost <em>Mips Max Host</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostImpl extends MixinBaseImpl implements Host {
	/**
	 * The default value of the '{@link #getIdHost() <em>Id Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdHost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ID_HOST_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getIdHost() <em>Id Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdHost()
	 * @generated
	 * @ordered
	 */
	protected Integer idHost = ID_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamProvisioner() <em>Ram Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamProvisioner()
	 * @generated
	 * @ordered
	 */
	protected static Object RAM_PROVISIONER_EDEFAULT; // TODO The default value literal "RamProvisionerSimple" is not valid.

	/**
	 * The cached value of the '{@link #getRamProvisioner() <em>Ram Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamProvisioner()
	 * @generated
	 * @ordered
	 */
	protected Object ramProvisioner = RAM_PROVISIONER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBwProvisioner() <em>Bw Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBwProvisioner()
	 * @generated
	 * @ordered
	 */
	protected static Object BW_PROVISIONER_EDEFAULT; // TODO The default value literal "BwProvisionerSimple" is not valid.

	/**
	 * The cached value of the '{@link #getBwProvisioner() <em>Bw Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBwProvisioner()
	 * @generated
	 * @ordered
	 */
	protected Object bwProvisioner = BW_PROVISIONER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected static final Long STORAGE_EDEFAULT = new Long(1000000L);

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected Long storage = STORAGE_EDEFAULT;

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
	 * The default value of the '{@link #getVmScheduler() <em>Vm Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmScheduler()
	 * @generated
	 * @ordered
	 */
	protected static Object VM_SCHEDULER_EDEFAULT; // TODO The default value literal "VmSchedulerTimeShared" is not valid.

	/**
	 * The cached value of the '{@link #getVmScheduler() <em>Vm Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmScheduler()
	 * @generated
	 * @ordered
	 */
	protected Object vmScheduler = VM_SCHEDULER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRam() <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRam()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RAM_EDEFAULT = new Integer(2048);

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
	 * The default value of the '{@link #getBw() <em>Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBw()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BW_EDEFAULT = new Integer(10000);

	/**
	 * The cached value of the '{@link #getBw() <em>Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBw()
	 * @generated
	 * @ordered
	 */
	protected Integer bw = BW_EDEFAULT;

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
	 * The default value of the '{@link #getPeProvisioner() <em>Pe Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeProvisioner()
	 * @generated
	 * @ordered
	 */
	protected static Object PE_PROVISIONER_EDEFAULT; // TODO The default value literal "PeProvisionerSimple" is not valid.

	/**
	 * The cached value of the '{@link #getPeProvisioner() <em>Pe Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeProvisioner()
	 * @generated
	 * @ordered
	 */
	protected Object peProvisioner = PE_PROVISIONER_EDEFAULT;

	/**
	 * The default value of the '{@link #getElasticHost() <em>Elastic Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticHost()
	 * @generated
	 * @ordered
	 */
	protected static final String ELASTIC_HOST_EDEFAULT = "N";

	/**
	 * The cached value of the '{@link #getElasticHost() <em>Elastic Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElasticHost()
	 * @generated
	 * @ordered
	 */
	protected String elasticHost = ELASTIC_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamMaxHost() <em>Ram Max Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamMaxHost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RAM_MAX_HOST_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getRamMaxHost() <em>Ram Max Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamMaxHost()
	 * @generated
	 * @ordered
	 */
	protected Integer ramMaxHost = RAM_MAX_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRamMinHost() <em>Ram Min Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamMinHost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RAM_MIN_HOST_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getRamMinHost() <em>Ram Min Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRamMinHost()
	 * @generated
	 * @ordered
	 */
	protected Integer ramMinHost = RAM_MIN_HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipsMaxHost() <em>Mips Max Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipsMaxHost()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIPS_MAX_HOST_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMipsMaxHost() <em>Mips Max Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipsMaxHost()
	 * @generated
	 * @ordered
	 */
	protected Integer mipsMaxHost = MIPS_MAX_HOST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIdHost() {
		return idHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdHost(Integer newIdHost) {
		Integer oldIdHost = idHost;
		idHost = newIdHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__ID_HOST, oldIdHost, idHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getRamProvisioner() {
		return ramProvisioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamProvisioner(Object newRamProvisioner) {
		Object oldRamProvisioner = ramProvisioner;
		ramProvisioner = newRamProvisioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__RAM_PROVISIONER, oldRamProvisioner, ramProvisioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getBwProvisioner() {
		return bwProvisioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBwProvisioner(Object newBwProvisioner) {
		Object oldBwProvisioner = bwProvisioner;
		bwProvisioner = newBwProvisioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__BW_PROVISIONER, oldBwProvisioner, bwProvisioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(Long newStorage) {
		Long oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__STORAGE, oldStorage, storage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__CORES, oldCores, cores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getVmScheduler() {
		return vmScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmScheduler(Object newVmScheduler) {
		Object oldVmScheduler = vmScheduler;
		vmScheduler = newVmScheduler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__VM_SCHEDULER, oldVmScheduler, vmScheduler));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__RAM, oldRam, ram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBw() {
		return bw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBw(Integer newBw) {
		Integer oldBw = bw;
		bw = newBw;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__BW, oldBw, bw));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__MIPS, oldMips, mips));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPeProvisioner() {
		return peProvisioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeProvisioner(Object newPeProvisioner) {
		Object oldPeProvisioner = peProvisioner;
		peProvisioner = newPeProvisioner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__PE_PROVISIONER, oldPeProvisioner, peProvisioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElasticHost() {
		return elasticHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElasticHost(String newElasticHost) {
		String oldElasticHost = elasticHost;
		elasticHost = newElasticHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__ELASTIC_HOST, oldElasticHost, elasticHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRamMaxHost() {
		return ramMaxHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamMaxHost(Integer newRamMaxHost) {
		Integer oldRamMaxHost = ramMaxHost;
		ramMaxHost = newRamMaxHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__RAM_MAX_HOST, oldRamMaxHost, ramMaxHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRamMinHost() {
		return ramMinHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRamMinHost(Integer newRamMinHost) {
		Integer oldRamMinHost = ramMinHost;
		ramMinHost = newRamMinHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__RAM_MIN_HOST, oldRamMinHost, ramMinHost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMipsMaxHost() {
		return mipsMaxHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMipsMaxHost(Integer newMipsMaxHost) {
		Integer oldMipsMaxHost = mipsMaxHost;
		mipsMaxHost = newMipsMaxHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.HOST__MIPS_MAX_HOST, oldMipsMaxHost, mipsMaxHost));
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
		 *   let severity : Integer[1] = 'Host::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Computesim)
		 *       in
		 *         'Host::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, SimulationTables.STR_Host_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, SimulationTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_simulation_c_c_Computesim_0 = idResolver.getClass(SimulationTables.CLSSid_Computesim, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_simulation_c_c_Computesim_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, SimulationTables.STR_Host_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, SimulationTables.INT_0).booleanValue();
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
			case SimulationPackage.HOST__ID_HOST:
				return getIdHost();
			case SimulationPackage.HOST__RAM_PROVISIONER:
				return getRamProvisioner();
			case SimulationPackage.HOST__BW_PROVISIONER:
				return getBwProvisioner();
			case SimulationPackage.HOST__STORAGE:
				return getStorage();
			case SimulationPackage.HOST__CORES:
				return getCores();
			case SimulationPackage.HOST__VM_SCHEDULER:
				return getVmScheduler();
			case SimulationPackage.HOST__RAM:
				return getRam();
			case SimulationPackage.HOST__BW:
				return getBw();
			case SimulationPackage.HOST__MIPS:
				return getMips();
			case SimulationPackage.HOST__PE_PROVISIONER:
				return getPeProvisioner();
			case SimulationPackage.HOST__ELASTIC_HOST:
				return getElasticHost();
			case SimulationPackage.HOST__RAM_MAX_HOST:
				return getRamMaxHost();
			case SimulationPackage.HOST__RAM_MIN_HOST:
				return getRamMinHost();
			case SimulationPackage.HOST__MIPS_MAX_HOST:
				return getMipsMaxHost();
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
			case SimulationPackage.HOST__ID_HOST:
				setIdHost((Integer)newValue);
				return;
			case SimulationPackage.HOST__RAM_PROVISIONER:
				setRamProvisioner(newValue);
				return;
			case SimulationPackage.HOST__BW_PROVISIONER:
				setBwProvisioner(newValue);
				return;
			case SimulationPackage.HOST__STORAGE:
				setStorage((Long)newValue);
				return;
			case SimulationPackage.HOST__CORES:
				setCores((Integer)newValue);
				return;
			case SimulationPackage.HOST__VM_SCHEDULER:
				setVmScheduler(newValue);
				return;
			case SimulationPackage.HOST__RAM:
				setRam((Integer)newValue);
				return;
			case SimulationPackage.HOST__BW:
				setBw((Integer)newValue);
				return;
			case SimulationPackage.HOST__MIPS:
				setMips((Integer)newValue);
				return;
			case SimulationPackage.HOST__PE_PROVISIONER:
				setPeProvisioner(newValue);
				return;
			case SimulationPackage.HOST__ELASTIC_HOST:
				setElasticHost((String)newValue);
				return;
			case SimulationPackage.HOST__RAM_MAX_HOST:
				setRamMaxHost((Integer)newValue);
				return;
			case SimulationPackage.HOST__RAM_MIN_HOST:
				setRamMinHost((Integer)newValue);
				return;
			case SimulationPackage.HOST__MIPS_MAX_HOST:
				setMipsMaxHost((Integer)newValue);
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
			case SimulationPackage.HOST__ID_HOST:
				setIdHost(ID_HOST_EDEFAULT);
				return;
			case SimulationPackage.HOST__RAM_PROVISIONER:
				setRamProvisioner(RAM_PROVISIONER_EDEFAULT);
				return;
			case SimulationPackage.HOST__BW_PROVISIONER:
				setBwProvisioner(BW_PROVISIONER_EDEFAULT);
				return;
			case SimulationPackage.HOST__STORAGE:
				setStorage(STORAGE_EDEFAULT);
				return;
			case SimulationPackage.HOST__CORES:
				setCores(CORES_EDEFAULT);
				return;
			case SimulationPackage.HOST__VM_SCHEDULER:
				setVmScheduler(VM_SCHEDULER_EDEFAULT);
				return;
			case SimulationPackage.HOST__RAM:
				setRam(RAM_EDEFAULT);
				return;
			case SimulationPackage.HOST__BW:
				setBw(BW_EDEFAULT);
				return;
			case SimulationPackage.HOST__MIPS:
				setMips(MIPS_EDEFAULT);
				return;
			case SimulationPackage.HOST__PE_PROVISIONER:
				setPeProvisioner(PE_PROVISIONER_EDEFAULT);
				return;
			case SimulationPackage.HOST__ELASTIC_HOST:
				setElasticHost(ELASTIC_HOST_EDEFAULT);
				return;
			case SimulationPackage.HOST__RAM_MAX_HOST:
				setRamMaxHost(RAM_MAX_HOST_EDEFAULT);
				return;
			case SimulationPackage.HOST__RAM_MIN_HOST:
				setRamMinHost(RAM_MIN_HOST_EDEFAULT);
				return;
			case SimulationPackage.HOST__MIPS_MAX_HOST:
				setMipsMaxHost(MIPS_MAX_HOST_EDEFAULT);
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
			case SimulationPackage.HOST__ID_HOST:
				return ID_HOST_EDEFAULT == null ? idHost != null : !ID_HOST_EDEFAULT.equals(idHost);
			case SimulationPackage.HOST__RAM_PROVISIONER:
				return RAM_PROVISIONER_EDEFAULT == null ? ramProvisioner != null : !RAM_PROVISIONER_EDEFAULT.equals(ramProvisioner);
			case SimulationPackage.HOST__BW_PROVISIONER:
				return BW_PROVISIONER_EDEFAULT == null ? bwProvisioner != null : !BW_PROVISIONER_EDEFAULT.equals(bwProvisioner);
			case SimulationPackage.HOST__STORAGE:
				return STORAGE_EDEFAULT == null ? storage != null : !STORAGE_EDEFAULT.equals(storage);
			case SimulationPackage.HOST__CORES:
				return CORES_EDEFAULT == null ? cores != null : !CORES_EDEFAULT.equals(cores);
			case SimulationPackage.HOST__VM_SCHEDULER:
				return VM_SCHEDULER_EDEFAULT == null ? vmScheduler != null : !VM_SCHEDULER_EDEFAULT.equals(vmScheduler);
			case SimulationPackage.HOST__RAM:
				return RAM_EDEFAULT == null ? ram != null : !RAM_EDEFAULT.equals(ram);
			case SimulationPackage.HOST__BW:
				return BW_EDEFAULT == null ? bw != null : !BW_EDEFAULT.equals(bw);
			case SimulationPackage.HOST__MIPS:
				return MIPS_EDEFAULT == null ? mips != null : !MIPS_EDEFAULT.equals(mips);
			case SimulationPackage.HOST__PE_PROVISIONER:
				return PE_PROVISIONER_EDEFAULT == null ? peProvisioner != null : !PE_PROVISIONER_EDEFAULT.equals(peProvisioner);
			case SimulationPackage.HOST__ELASTIC_HOST:
				return ELASTIC_HOST_EDEFAULT == null ? elasticHost != null : !ELASTIC_HOST_EDEFAULT.equals(elasticHost);
			case SimulationPackage.HOST__RAM_MAX_HOST:
				return RAM_MAX_HOST_EDEFAULT == null ? ramMaxHost != null : !RAM_MAX_HOST_EDEFAULT.equals(ramMaxHost);
			case SimulationPackage.HOST__RAM_MIN_HOST:
				return RAM_MIN_HOST_EDEFAULT == null ? ramMinHost != null : !RAM_MIN_HOST_EDEFAULT.equals(ramMinHost);
			case SimulationPackage.HOST__MIPS_MAX_HOST:
				return MIPS_MAX_HOST_EDEFAULT == null ? mipsMaxHost != null : !MIPS_MAX_HOST_EDEFAULT.equals(mipsMaxHost);
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
			case SimulationPackage.HOST___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (idHost: ");
		result.append(idHost);
		result.append(", ramProvisioner: ");
		result.append(ramProvisioner);
		result.append(", bwProvisioner: ");
		result.append(bwProvisioner);
		result.append(", storage: ");
		result.append(storage);
		result.append(", cores: ");
		result.append(cores);
		result.append(", vmScheduler: ");
		result.append(vmScheduler);
		result.append(", ram: ");
		result.append(ram);
		result.append(", bw: ");
		result.append(bw);
		result.append(", mips: ");
		result.append(mips);
		result.append(", peProvisioner: ");
		result.append(peProvisioner);
		result.append(", elasticHost: ");
		result.append(elasticHost);
		result.append(", ramMaxHost: ");
		result.append(ramMaxHost);
		result.append(", ramMinHost: ");
		result.append(ramMinHost);
		result.append(", mipsMaxHost: ");
		result.append(mipsMaxHost);
		result.append(')');
		return result.toString();
	}

} //HostImpl
