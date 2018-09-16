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
 * A representation of the model object '<em><b>Datacenter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getOs <em>Os</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getVmm <em>Vmm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCost <em>Cost</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerMem <em>Cost Per Mem</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerStorage <em>Cost Per Storage</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerBw <em>Cost Per Bw</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getName <em>Name</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getSchedulingInterval <em>Scheduling Interval</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Datacenter extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * The default value is <code>"Linux"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_Os()
	 * @model default="Linux" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!os'"
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Vmm</b></em>' attribute.
	 * The default value is <code>"Xen"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vmm</em>' attribute.
	 * @see #setVmm(String)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_Vmm()
	 * @model default="Xen" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!vmm'"
	 * @generated
	 */
	String getVmm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getVmm <em>Vmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmm</em>' attribute.
	 * @see #getVmm()
	 * @generated
	 */
	void setVmm(String value);

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timezone</em>' attribute.
	 * @see #setTimezone(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_Timezone()
	 * @model default="10.0" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!timezone'"
	 * @generated
	 */
	Double getTimezone();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getTimezone <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone</em>' attribute.
	 * @see #getTimezone()
	 * @generated
	 */
	void setTimezone(Double value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * The default value is <code>"3.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_Cost()
	 * @model default="3.0" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!cost'"
	 * @generated
	 */
	Double getCost();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Double value);

	/**
	 * Returns the value of the '<em><b>Cost Per Mem</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Per Mem</em>' attribute.
	 * @see #setCostPerMem(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_CostPerMem()
	 * @model default="0.05" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!costPerMem'"
	 * @generated
	 */
	Double getCostPerMem();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerMem <em>Cost Per Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Mem</em>' attribute.
	 * @see #getCostPerMem()
	 * @generated
	 */
	void setCostPerMem(Double value);

	/**
	 * Returns the value of the '<em><b>Cost Per Storage</b></em>' attribute.
	 * The default value is <code>"0.001"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Per Storage</em>' attribute.
	 * @see #setCostPerStorage(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_CostPerStorage()
	 * @model default="0.001" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!costPerStorage'"
	 * @generated
	 */
	Double getCostPerStorage();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerStorage <em>Cost Per Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Storage</em>' attribute.
	 * @see #getCostPerStorage()
	 * @generated
	 */
	void setCostPerStorage(Double value);

	/**
	 * Returns the value of the '<em><b>Cost Per Bw</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cost Per Bw</em>' attribute.
	 * @see #setCostPerBw(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_CostPerBw()
	 * @model default="0.0" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!costPerBw'"
	 * @generated
	 */
	Double getCostPerBw();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerBw <em>Cost Per Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Per Bw</em>' attribute.
	 * @see #getCostPerBw()
	 * @generated
	 */
	void setCostPerBw(Double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"datacenter_0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_Name()
	 * @model default="datacenter_0" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scheduling Interval</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scheduling Interval</em>' attribute.
	 * @see #setSchedulingInterval(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_SchedulingInterval()
	 * @model default="0" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!schedulingInterval'"
	 * @generated
	 */
	Double getSchedulingInterval();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getSchedulingInterval <em>Scheduling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Interval</em>' attribute.
	 * @see #getSchedulingInterval()
	 * @generated
	 */
	void setSchedulingInterval(Double value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The default value is <code>"US East (N. Virginia)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getDatacenter_Location()
	 * @model default="US East (N. Virginia)" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Datacenter!location'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Datacenter::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Computesim)\n *       in\n *         \'Datacenter::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.STR_Datacenter_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_simulation_c_c_Computesim = idResolver.getClass(&lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.CLSSid_Computesim, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_simulation_c_c_Computesim).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.STR_Datacenter_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Datacenter
