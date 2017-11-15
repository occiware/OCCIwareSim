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
 * A representation of the model object '<em><b>Cloudlet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletId <em>Cloudlet Id</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletLength <em>Cloudlet Length</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCores <em>Cores</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletFileSize <em>Cloudlet File Size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletOutputSize <em>Cloudlet Output Size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelCpu <em>Utilization Model Cpu</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelRam <em>Utilization Model Ram</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelBw <em>Utilization Model Bw</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getCloudlet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Cloudlet extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Cloudlet Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Id</em>' attribute.
	 * @see #setCloudletId(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getCloudlet_CloudletId()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletId'"
	 * @generated
	 */
	Integer getCloudletId();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletId <em>Cloudlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Id</em>' attribute.
	 * @see #getCloudletId()
	 * @generated
	 */
	void setCloudletId(Integer value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Length</b></em>' attribute.
	 * The default value is <code>"400000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Length</em>' attribute.
	 * @see #setCloudletLength(Long)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getCloudlet_CloudletLength()
	 * @model default="400000" dataType="org.occiware.clouddesigner.occi.simulation.long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletLength'"
	 * @generated
	 */
	Long getCloudletLength();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletLength <em>Cloudlet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Length</em>' attribute.
	 * @see #getCloudletLength()
	 * @generated
	 */
	void setCloudletLength(Long value);

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
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getCloudlet_Cores()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cores'"
	 * @generated
	 */
	Integer getCores();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Cloudlet File Size</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet File Size</em>' attribute.
	 * @see #setCloudletFileSize(Long)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getCloudlet_CloudletFileSize()
	 * @model default="300" dataType="org.occiware.clouddesigner.occi.simulation.long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletFileSize'"
	 * @generated
	 */
	Long getCloudletFileSize();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletFileSize <em>Cloudlet File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet File Size</em>' attribute.
	 * @see #getCloudletFileSize()
	 * @generated
	 */
	void setCloudletFileSize(Long value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Output Size</b></em>' attribute.
	 * The default value is <code>"300"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Output Size</em>' attribute.
	 * @see #setCloudletOutputSize(Long)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getCloudlet_CloudletOutputSize()
	 * @model default="300" dataType="org.occiware.clouddesigner.occi.simulation.long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletOutputSize'"
	 * @generated
	 */
	Long getCloudletOutputSize();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletOutputSize <em>Cloudlet Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Output Size</em>' attribute.
	 * @see #getCloudletOutputSize()
	 * @generated
	 */
	void setCloudletOutputSize(Long value);

	/**
	 * Returns the value of the '<em><b>Utilization Model Cpu</b></em>' attribute.
	 * The default value is <code>"UtilizationModelFull"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utilization Model Cpu</em>' attribute.
	 * @see #setUtilizationModelCpu(Object)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getCloudlet_UtilizationModelCpu()
	 * @model default="UtilizationModelFull" dataType="org.occiware.clouddesigner.occi.simulation.utilizationModel"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!utilizationModelCpu'"
	 * @generated
	 */
	Object getUtilizationModelCpu();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelCpu <em>Utilization Model Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization Model Cpu</em>' attribute.
	 * @see #getUtilizationModelCpu()
	 * @generated
	 */
	void setUtilizationModelCpu(Object value);

	/**
	 * Returns the value of the '<em><b>Utilization Model Ram</b></em>' attribute.
	 * The default value is <code>"UtilizationModelFull"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utilization Model Ram</em>' attribute.
	 * @see #setUtilizationModelRam(Object)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getCloudlet_UtilizationModelRam()
	 * @model default="UtilizationModelFull" dataType="org.occiware.clouddesigner.occi.simulation.utilizationModel"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!utilizationModelRam'"
	 * @generated
	 */
	Object getUtilizationModelRam();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelRam <em>Utilization Model Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization Model Ram</em>' attribute.
	 * @see #getUtilizationModelRam()
	 * @generated
	 */
	void setUtilizationModelRam(Object value);

	/**
	 * Returns the value of the '<em><b>Utilization Model Bw</b></em>' attribute.
	 * The default value is <code>"UtilizationModelFull"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utilization Model Bw</em>' attribute.
	 * @see #setUtilizationModelBw(Object)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getCloudlet_UtilizationModelBw()
	 * @model default="UtilizationModelFull" dataType="org.occiware.clouddesigner.occi.simulation.utilizationModel"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!utilizationModelBw'"
	 * @generated
	 */
	Object getUtilizationModelBw();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelBw <em>Utilization Model Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilization Model Bw</em>' attribute.
	 * @see #getUtilizationModelBw()
	 * @generated
	 */
	void setUtilizationModelBw(Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Cloudlet::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Computesim)\n *       in\n *         \'Cloudlet::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.STR_Cloudlet_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_simulation_c_c_Computesim_0 = idResolver.getClass(&lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.CLSSid_Computesim, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_simulation_c_c_Computesim_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.STR_Cloudlet_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Cloudlet
