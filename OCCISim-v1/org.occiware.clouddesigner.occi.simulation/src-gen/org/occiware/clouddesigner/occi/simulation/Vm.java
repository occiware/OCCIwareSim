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
 * A representation of the model object '<em><b>Vm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getIdvm <em>Idvm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getMips <em>Mips</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getCores <em>Cores</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getBw <em>Bw</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getSize <em>Size</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getCloudletScheduler <em>Cloudlet Scheduler</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getVmm <em>Vmm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getRam <em>Ram</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getRamMaxVm <em>Ram Max Vm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getRamMinVm <em>Ram Min Vm</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getOs <em>Os</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getIrdto <em>Irdto</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getDto <em>Dto</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getDti <em>Dti</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getIrdt <em>Irdt</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Vm#getElasticVm <em>Elastic Vm</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Vm extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Idvm</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Idvm</em>' attribute.
	 * @see #setIdvm(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Idvm()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!idvm'"
	 * @generated
	 */
	Integer getIdvm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getIdvm <em>Idvm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idvm</em>' attribute.
	 * @see #getIdvm()
	 * @generated
	 */
	void setIdvm(Integer value);

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
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Mips()
	 * @model default="1000" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!mips'"
	 * @generated
	 */
	Integer getMips();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getMips <em>Mips</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mips</em>' attribute.
	 * @see #getMips()
	 * @generated
	 */
	void setMips(Integer value);

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
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Cores()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!cores'"
	 * @generated
	 */
	Integer getCores();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getCores <em>Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores</em>' attribute.
	 * @see #getCores()
	 * @generated
	 */
	void setCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Bw</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bw</em>' attribute.
	 * @see #setBw(Long)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Bw()
	 * @model default="1000" dataType="org.occiware.clouddesigner.occi.simulation.long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!bw'"
	 * @generated
	 */
	Long getBw();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getBw <em>Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bw</em>' attribute.
	 * @see #getBw()
	 * @generated
	 */
	void setBw(Long value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Long)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Size()
	 * @model default="10000" dataType="org.occiware.clouddesigner.occi.simulation.long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!size'"
	 * @generated
	 */
	Long getSize();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Long value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Scheduler</b></em>' attribute.
	 * The default value is <code>"CloudletSchedulerTimeShared"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Scheduler</em>' attribute.
	 * @see #setCloudletScheduler(Object)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_CloudletScheduler()
	 * @model default="CloudletSchedulerTimeShared" dataType="org.occiware.clouddesigner.occi.simulation.CloudletScheduler"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!cloudletScheduler'"
	 * @generated
	 */
	Object getCloudletScheduler();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getCloudletScheduler <em>Cloudlet Scheduler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Scheduler</em>' attribute.
	 * @see #getCloudletScheduler()
	 * @generated
	 */
	void setCloudletScheduler(Object value);

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
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Vmm()
	 * @model default="Xen" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!vmm'"
	 * @generated
	 */
	String getVmm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getVmm <em>Vmm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmm</em>' attribute.
	 * @see #getVmm()
	 * @generated
	 */
	void setVmm(String value);

	/**
	 * Returns the value of the '<em><b>Ram</b></em>' attribute.
	 * The default value is <code>"512"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ram</em>' attribute.
	 * @see #setRam(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Ram()
	 * @model default="512" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!ram'"
	 * @generated
	 */
	Integer getRam();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getRam <em>Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram</em>' attribute.
	 * @see #getRam()
	 * @generated
	 */
	void setRam(Integer value);

	/**
	 * Returns the value of the '<em><b>Ram Max Vm</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ram Max Vm</em>' attribute.
	 * @see #setRamMaxVm(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_RamMaxVm()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!ramMaxVm'"
	 * @generated
	 */
	Integer getRamMaxVm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getRamMaxVm <em>Ram Max Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Max Vm</em>' attribute.
	 * @see #getRamMaxVm()
	 * @generated
	 */
	void setRamMaxVm(Integer value);

	/**
	 * Returns the value of the '<em><b>Ram Min Vm</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ram Min Vm</em>' attribute.
	 * @see #setRamMinVm(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_RamMinVm()
	 * @model default="0" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!ramMinVm'"
	 * @generated
	 */
	Integer getRamMinVm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getRamMinVm <em>Ram Min Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ram Min Vm</em>' attribute.
	 * @see #getRamMinVm()
	 * @generated
	 */
	void setRamMinVm(Integer value);

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
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Os()
	 * @model default="Linux" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!os'"
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Irdto</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inter-Region Data Transfer Out
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Irdto</em>' attribute.
	 * @see #setIrdto(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Irdto()
	 * @model default="0" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!irdto'"
	 * @generated
	 */
	Double getIrdto();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getIrdto <em>Irdto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irdto</em>' attribute.
	 * @see #getIrdto()
	 * @generated
	 */
	void setIrdto(Double value);

	/**
	 * Returns the value of the '<em><b>Dto</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Transfer Out
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dto</em>' attribute.
	 * @see #setDto(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Dto()
	 * @model default="0" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!dto'"
	 * @generated
	 */
	Double getDto();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getDto <em>Dto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto</em>' attribute.
	 * @see #getDto()
	 * @generated
	 */
	void setDto(Double value);

	/**
	 * Returns the value of the '<em><b>Dti</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data Transfer in
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dti</em>' attribute.
	 * @see #setDti(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Dti()
	 * @model default="0" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!dti'"
	 * @generated
	 */
	Double getDti();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getDti <em>Dti</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dti</em>' attribute.
	 * @see #getDti()
	 * @generated
	 */
	void setDti(Double value);

	/**
	 * Returns the value of the '<em><b>Irdt</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Intra-Region Data Transfer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Irdt</em>' attribute.
	 * @see #setIrdt(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_Irdt()
	 * @model default="0" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!irdt'"
	 * @generated
	 */
	Double getIrdt();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getIrdt <em>Irdt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Irdt</em>' attribute.
	 * @see #getIrdt()
	 * @generated
	 */
	void setIrdt(Double value);

	/**
	 * Returns the value of the '<em><b>Elastic Vm</b></em>' attribute.
	 * The default value is <code>"N"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elastic Vm</em>' attribute.
	 * @see #setElasticVm(String)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getVm_ElasticVm()
	 * @model default="N" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Vm!elasticVm'"
	 * @generated
	 */
	String getElasticVm();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Vm#getElasticVm <em>Elastic Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elastic Vm</em>' attribute.
	 * @see #getElasticVm()
	 * @generated
	 */
	void setElasticVm(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Vm::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Computesim)\n *       in\n *         \'Vm::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.STR_Vm_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_simulation_c_c_Computesim_0 = idResolver.getClass(&lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.CLSSid_Computesim, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_simulation_c_c_Computesim_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.STR_Vm_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.occiware.clouddesigner.occi.simulation.SimulationTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Vm
