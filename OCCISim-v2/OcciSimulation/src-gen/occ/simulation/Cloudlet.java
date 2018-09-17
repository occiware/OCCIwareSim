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
package occ.simulation;

import org.eclipse.cmf.occi.infrastructure.Compute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloudlet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletId <em>Cloudlet Id</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletLength <em>Cloudlet Length</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletCores <em>Cloudlet Cores</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletFileSize <em>Cloudlet File Size</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletOutputSize <em>Cloudlet Output Size</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletUtilizationModelCpu <em>Cloudlet Utilization Model Cpu</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletUtilizationModelRam <em>Cloudlet Utilization Model Ram</em>}</li>
 *   <li>{@link occ.simulation.Cloudlet#getCloudletUtilizationModelBw <em>Cloudlet Utilization Model Bw</em>}</li>
 * </ul>
 *
 * @see occ.simulation.SimulationPackage#getCloudlet()
 * @model
 * @generated
 */
public interface Cloudlet extends Compute {
	/**
	 * Returns the value of the '<em><b>Cloudlet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Id</em>' attribute.
	 * @see #setCloudletId(Integer)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletId()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletId'"
	 * @generated
	 */
	Integer getCloudletId();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletId <em>Cloudlet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Id</em>' attribute.
	 * @see #getCloudletId()
	 * @generated
	 */
	void setCloudletId(Integer value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Length</em>' attribute.
	 * @see #setCloudletLength(Long)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletLength()
	 * @model dataType="occ.simulation.Long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletLength'"
	 * @generated
	 */
	Long getCloudletLength();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletLength <em>Cloudlet Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Length</em>' attribute.
	 * @see #getCloudletLength()
	 * @generated
	 */
	void setCloudletLength(Long value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Cores</em>' attribute.
	 * @see #setCloudletCores(Integer)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletCores()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletCores'"
	 * @generated
	 */
	Integer getCloudletCores();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletCores <em>Cloudlet Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Cores</em>' attribute.
	 * @see #getCloudletCores()
	 * @generated
	 */
	void setCloudletCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Cloudlet File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet File Size</em>' attribute.
	 * @see #setCloudletFileSize(Long)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletFileSize()
	 * @model dataType="occ.simulation.Long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletFileSize'"
	 * @generated
	 */
	Long getCloudletFileSize();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletFileSize <em>Cloudlet File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet File Size</em>' attribute.
	 * @see #getCloudletFileSize()
	 * @generated
	 */
	void setCloudletFileSize(Long value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Output Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Output Size</em>' attribute.
	 * @see #setCloudletOutputSize(Long)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletOutputSize()
	 * @model dataType="occ.simulation.Long"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletOutputSize'"
	 * @generated
	 */
	Long getCloudletOutputSize();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletOutputSize <em>Cloudlet Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Output Size</em>' attribute.
	 * @see #getCloudletOutputSize()
	 * @generated
	 */
	void setCloudletOutputSize(Long value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Utilization Model Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Utilization Model Cpu</em>' attribute.
	 * @see #setCloudletUtilizationModelCpu(Object)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletUtilizationModelCpu()
	 * @model dataType="occ.simulation.utilizationModel"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletUtilizationModelCpu'"
	 * @generated
	 */
	Object getCloudletUtilizationModelCpu();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletUtilizationModelCpu <em>Cloudlet Utilization Model Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Utilization Model Cpu</em>' attribute.
	 * @see #getCloudletUtilizationModelCpu()
	 * @generated
	 */
	void setCloudletUtilizationModelCpu(Object value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Utilization Model Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Utilization Model Ram</em>' attribute.
	 * @see #setCloudletUtilizationModelRam(Object)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletUtilizationModelRam()
	 * @model dataType="occ.simulation.utilizationModel"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletUtilizationModelRam'"
	 * @generated
	 */
	Object getCloudletUtilizationModelRam();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletUtilizationModelRam <em>Cloudlet Utilization Model Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Utilization Model Ram</em>' attribute.
	 * @see #getCloudletUtilizationModelRam()
	 * @generated
	 */
	void setCloudletUtilizationModelRam(Object value);

	/**
	 * Returns the value of the '<em><b>Cloudlet Utilization Model Bw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cloudlet Utilization Model Bw</em>' attribute.
	 * @see #setCloudletUtilizationModelBw(Object)
	 * @see occ.simulation.SimulationPackage#getCloudlet_CloudletUtilizationModelBw()
	 * @model dataType="occ.simulation.utilizationModel"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Cloudlet!cloudletUtilizationModelBw'"
	 * @generated
	 */
	Object getCloudletUtilizationModelBw();

	/**
	 * Sets the value of the '{@link occ.simulation.Cloudlet#getCloudletUtilizationModelBw <em>Cloudlet Utilization Model Bw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudlet Utilization Model Bw</em>' attribute.
	 * @see #getCloudletUtilizationModelBw()
	 * @generated
	 */
	void setCloudletUtilizationModelBw(Object value);

} // Cloudlet
