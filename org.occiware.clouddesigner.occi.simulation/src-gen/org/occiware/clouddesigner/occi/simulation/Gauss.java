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
 * A representation of the model object '<em><b>Gauss</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Gauss#getX <em>X</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Gauss#getN <em>N</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Gauss#getP <em>P</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getGauss()
 * @model
 * @generated
 */
public interface Gauss extends MixinBase, Probadistrib {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of successes that result from the binomial experiment
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getGauss_X()
	 * @model dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Gauss!x'"
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Gauss#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Double value);

	/**
	 * Returns the value of the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of trials in the binomial experiment
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>N</em>' attribute.
	 * @see #setN(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getGauss_N()
	 * @model dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Gauss!n'"
	 * @generated
	 */
	Double getN();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Gauss#getN <em>N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N</em>' attribute.
	 * @see #getN()
	 * @generated
	 */
	void setN(Double value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The probability of success on an individual trial
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>P</em>' attribute.
	 * @see #setP(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getGauss_P()
	 * @model dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Gauss!P'"
	 * @generated
	 */
	Double getP();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Gauss#getP <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' attribute.
	 * @see #getP()
	 * @generated
	 */
	void setP(Double value);

} // Gauss
