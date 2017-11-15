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
package org.occiware.clouddesigner.occi.simulation;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getIdHost <em>Id Host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getRamProvisioner <em>Ram Provisioner</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getBwProvisioner <em>Bw Provisioner</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getStorage <em>Storage</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getCores <em>Cores</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getVmScheduler <em>Vm Scheduler</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getRam <em>Ram</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getBw <em>Bw</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getMips <em>Mips</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getPeProvisioner <em>Pe Provisioner</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getElasticHost <em>Elastic Host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getRamMaxHost <em>Ram Max Host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getRamMinHost <em>Ram Min Host</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Host#getMipsMaxHost <em>Mips Max Host</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Host extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Id Host</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id Host</em>' attribute.
	 * @see #setIdHost(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_IdHost()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!idHost'"
	 * @generated
	 */
	Integer getIdHost();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getIdHost <em>Id Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Host</em>' attribute.
	 * @see #getIdHost()
	 * @generated
	 */
	void setIdHost(Integer value);

	/**
	 * Returns the value of the '<em><b>Ram Provisioner</b></em>' attribute.
	 * The default value is <code>"RamProvisionerSimple"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ram Provisioner</em>' attribute.
	 * @see #setRamProvisioner(Object)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_RamProvisioner()
	 * @model default="RamProvisionerSimple" dataType="org.occiware.clouddesigner.occi.simulation.RamProvisioner"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!ramProvisioner'"
	 * @generated
	 */
	Object getRamProvisioner();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getRamProvisioner <em>Ram Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Provisioner</em>' attribute.
	 * @see #getRamProvisioner()
	 * @generated
	 */
	void setRamProvisioner(Object value);

	/**
	 * Returns the value of the '<em><b>Bw Provisioner</b></em>' attribute.
	 * The default value is <code>"BwProvisionerSimple"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bw Provisioner</em>' attribute.
	 * @see #setBwProvisioner(Object)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_BwProvisioner()
	 * @model default="BwProvisionerSimple" dataType="org.occiware.clouddesigner.occi.simulation.BwProvisioner"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!bwProvisioner'"
	 * @generated
	 */
	Object getBwProvisioner();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getBwProvisioner <em>Bw Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bw Provisioner</em>' attribute.
	 * @see #getBwProvisioner()
	 * @generated
	 */
	void setBwProvisioner(Object value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * The default value is <code>"1000000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see #setStorage(Long)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_Storage()
	 * @model default="1000000" dataType="org.occiware.clouddesigner.occi.simulation.long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!storage'"
	 * @generated
	 */
	Long getStorage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(Long value);

	/**
	 * Returns the value of the '<em><b>Cores</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cores</em>' attribute.
	 * @see #setCores(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_Cores()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!cores'"
	 * @generated
	 */
	Integer getCores();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Vm Scheduler</b></em>' attribute.
	 * The default value is <code>"VmSchedulerTimeShared"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vm Scheduler</em>' attribute.
	 * @see #setVmScheduler(Object)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_VmScheduler()
	 * @model default="VmSchedulerTimeShared" dataType="org.occiware.clouddesigner.occi.simulation.VmScheduler"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!vmScheduler'"
	 * @generated
	 */
	Object getVmScheduler();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getVmScheduler <em>Vm Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Scheduler</em>' attribute.
	 * @see #getVmScheduler()
	 * @generated
	 */
	void setVmScheduler(Object value);

	/**
	 * Returns the value of the '<em><b>Ram</b></em>' attribute.
	 * The default value is <code>"2048"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ram</em>' attribute.
	 * @see #setRam(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_Ram()
	 * @model default="2048" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!ram'"
	 * @generated
	 */
	Integer getRam();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getRam <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' attribute.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(Integer value);

	/**
	 * Returns the value of the '<em><b>Bw</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bw</em>' attribute.
	 * @see #setBw(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_Bw()
	 * @model default="10000" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!bw'"
	 * @generated
	 */
	Integer getBw();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getBw <em>Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bw</em>' attribute.
	 * @see #getBw()
	 * @generated
	 */
	void setBw(Integer value);

	/**
	 * Returns the value of the '<em><b>Mips</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mips</em>' attribute.
	 * @see #setMips(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_Mips()
	 * @model default="1000" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!mips'"
	 * @generated
	 */
	Integer getMips();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getMips <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mips</em>' attribute.
	 * @see #getMips()
	 * @generated
	 */
	void setMips(Integer value);

	/**
	 * Returns the value of the '<em><b>Pe Provisioner</b></em>' attribute.
	 * The default value is <code>"PeProvisionerSimple"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pe Provisioner</em>' attribute.
	 * @see #setPeProvisioner(Object)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_PeProvisioner()
	 * @model default="PeProvisionerSimple" dataType="org.occiware.clouddesigner.occi.simulation.PeProvisioner"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!peProvisioner'"
	 * @generated
	 */
	Object getPeProvisioner();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getPeProvisioner <em>Pe Provisioner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pe Provisioner</em>' attribute.
	 * @see #getPeProvisioner()
	 * @generated
	 */
	void setPeProvisioner(Object value);

	/**
	 * Returns the value of the '<em><b>Elastic Host</b></em>' attribute.
	 * The default value is <code>"N"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * H (horizontal), V (vertical), N (No)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elastic Host</em>' attribute.
	 * @see #setElasticHost(String)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_ElasticHost()
	 * @model default="N" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!elasticHost'"
	 * @generated
	 */
	String getElasticHost();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getElasticHost <em>Elastic Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elastic Host</em>' attribute.
	 * @see #getElasticHost()
	 * @generated
	 */
	void setElasticHost(String value);

	/**
	 * Returns the value of the '<em><b>Ram Max Host</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ram Max Host</em>' attribute.
	 * @see #setRamMaxHost(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_RamMaxHost()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!ramMaxHost'"
	 * @generated
	 */
	Integer getRamMaxHost();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getRamMaxHost <em>Ram Max Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Max Host</em>' attribute.
	 * @see #getRamMaxHost()
	 * @generated
	 */
	void setRamMaxHost(Integer value);

	/**
	 * Returns the value of the '<em><b>Ram Min Host</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ram Min Host</em>' attribute.
	 * @see #setRamMinHost(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_RamMinHost()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!ramMinHost'"
	 * @generated
	 */
	Integer getRamMinHost();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getRamMinHost <em>Ram Min Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Min Host</em>' attribute.
	 * @see #getRamMinHost()
	 * @generated
	 */
	void setRamMinHost(Integer value);

	/**
	 * Returns the value of the '<em><b>Mips Max Host</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mips Max Host</em>' attribute.
	 * @see #setMipsMaxHost(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getHost_MipsMaxHost()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Host!mipsMaxHost'"
	 * @generated
	 */
	Integer getMipsMaxHost();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Host#getMipsMaxHost <em>Mips Max Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mips Max Host</em>' attribute.
	 * @see #getMipsMaxHost()
	 * @generated
	 */
	void setMipsMaxHost(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Host::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Computesim)\n *       in\n *         \'Host::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.STR_Host_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_simulation_c_c_Computesim_0 = idResolver.getClass(&lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.CLSSid_Computesim, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_simulation_c_c_Computesim_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.STR_Host_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Host
