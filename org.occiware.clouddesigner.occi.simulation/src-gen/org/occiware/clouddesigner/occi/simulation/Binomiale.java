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
 * A representation of the model object '<em><b>Binomiale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Binomiale#getNumCorrect <em>Num Correct</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Binomiale#getNumTrials <em>Num Trials</em>}</li>
 *   <li>{@link org.occiware.clouddesigner.occi.simulation.Binomiale#getChance <em>Chance</em>}</li>
 * </ul>
 *
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getBinomiale()
 * @model
 * @generated
 */
public interface Binomiale extends MixinBase, Probadistrib {
	/**
	 * Returns the value of the '<em><b>Num Correct</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numCorrect
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Correct</em>' attribute.
	 * @see #setNumCorrect(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getBinomiale_NumCorrect()
	 * @model default="10" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Binomiale!numCorrect'"
	 * @generated
	 */
	Integer getNumCorrect();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Binomiale#getNumCorrect <em>Num Correct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Correct</em>' attribute.
	 * @see #getNumCorrect()
	 * @generated
	 */
	void setNumCorrect(Integer value);

	/**
	 * Returns the value of the '<em><b>Num Trials</b></em>' attribute.
	 * The default value is <code>"13"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * numTrials
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Trials</em>' attribute.
	 * @see #setNumTrials(Integer)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getBinomiale_NumTrials()
	 * @model default="13" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Binomiale!numTrials'"
	 * @generated
	 */
	Integer getNumTrials();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Binomiale#getNumTrials <em>Num Trials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Trials</em>' attribute.
	 * @see #getNumTrials()
	 * @generated
	 */
	void setNumTrials(Integer value);

	/**
	 * Returns the value of the '<em><b>Chance</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * chance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chance</em>' attribute.
	 * @see #setChance(Double)
	 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage#getBinomiale_Chance()
	 * @model default="0.5" dataType="org.occiware.clouddesigner.occi.simulation.double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://schemas.ogf.org/occi/simulation/ecore!Binomiale!chance'"
	 * @generated
	 */
	Double getChance();

	/**
	 * Sets the value of the '{@link org.occiware.clouddesigner.occi.simulation.Binomiale#getChance <em>Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chance</em>' attribute.
	 * @see #getChance()
	 * @generated
	 */
	void setChance(Double value);

} // Binomiale
