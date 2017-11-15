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

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poisson</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Poisson#getX <em>X</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Poisson#getU <em>U</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getPoisson()
 * @model
 * @generated
 */
public interface Poisson extends MixinBase, Probadistrib {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual number of successes that occur in a specified region
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getPoisson_X()
	 * @model dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Poisson!x'"
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Poisson#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Double value);

	/**
	 * Returns the value of the '<em><b>U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mean number of successes that occur in a specified region
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>U</em>' attribute.
	 * @see #setU(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getPoisson_U()
	 * @model dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Poisson!u'"
	 * @generated
	 */
	Double getU();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Poisson#getU <em>U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' attribute.
	 * @see #getU()
	 * @generated
	 */
	void setU(Double value);

} // Poisson
