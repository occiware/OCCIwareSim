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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage
 * @generated
 */
public interface SimulationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulationFactory eINSTANCE = org.occiware.clouddesigner.occi.simulation.impl.SimulationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Computesim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computesim</em>'.
	 * @generated
	 */
	Computesim createComputesim();

	/**
	 * Returns a new object of class '<em>Storagesim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storagesim</em>'.
	 * @generated
	 */
	Storagesim createStoragesim();

	/**
	 * Returns a new object of class '<em>Networksim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networksim</em>'.
	 * @generated
	 */
	Networksim createNetworksim();

	/**
	 * Returns a new object of class '<em>Datacenter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datacenter</em>'.
	 * @generated
	 */
	Datacenter createDatacenter();

	/**
	 * Returns a new object of class '<em>Cloudlet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudlet</em>'.
	 * @generated
	 */
	Cloudlet createCloudlet();

	/**
	 * Returns a new object of class '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host</em>'.
	 * @generated
	 */
	Host createHost();

	/**
	 * Returns a new object of class '<em>Vm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vm</em>'.
	 * @generated
	 */
	Vm createVm();

	/**
	 * Returns a new object of class '<em>Harddrivestorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Harddrivestorage</em>'.
	 * @generated
	 */
	Harddrivestorage createHarddrivestorage();

	/**
	 * Returns a new object of class '<em>Sanstorage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sanstorage</em>'.
	 * @generated
	 */
	Sanstorage createSanstorage();

	/**
	 * Returns a new object of class '<em>Probadistrib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Probadistrib</em>'.
	 * @generated
	 */
	Probadistrib createProbadistrib();

	/**
	 * Returns a new object of class '<em>Poisson</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poisson</em>'.
	 * @generated
	 */
	Poisson createPoisson();

	/**
	 * Returns a new object of class '<em>Gauss</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gauss</em>'.
	 * @generated
	 */
	Gauss createGauss();

	/**
	 * Returns a new object of class '<em>Binomiale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binomiale</em>'.
	 * @generated
	 */
	Binomiale createBinomiale();

	/**
	 * Returns a new object of class '<em>Pricestrategies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pricestrategies</em>'.
	 * @generated
	 */
	Pricestrategies createPricestrategies();

	/**
	 * Returns a new object of class '<em>Ondemand</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ondemand</em>'.
	 * @generated
	 */
	Ondemand createOndemand();

	/**
	 * Returns a new object of class '<em>Upfront</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upfront</em>'.
	 * @generated
	 */
	Upfront createUpfront();

	/**
	 * Returns a new object of class '<em>Auction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auction</em>'.
	 * @generated
	 */
	Auction createAuction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimulationPackage getSimulationPackage();

} //SimulationFactory
