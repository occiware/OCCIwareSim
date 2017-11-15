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
package org.occiware.clouddesigner.occi.simulation.util;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Network;
import org.eclipse.cmf.occi.infrastructure.Storage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.occiware.clouddesigner.occi.simulation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage
 * @generated
 */
public class SimulationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimulationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationSwitch() {
		if (modelPackage == null) {
			modelPackage = SimulationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimulationPackage.COMPUTESIM: {
				Computesim computesim = (Computesim)theEObject;
				T result = caseComputesim(computesim);
				if (result == null) result = caseCompute(computesim);
				if (result == null) result = caseResource(computesim);
				if (result == null) result = caseEntity(computesim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.STORAGESIM: {
				Storagesim storagesim = (Storagesim)theEObject;
				T result = caseStoragesim(storagesim);
				if (result == null) result = caseStorage(storagesim);
				if (result == null) result = caseResource(storagesim);
				if (result == null) result = caseEntity(storagesim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.NETWORKSIM: {
				Networksim networksim = (Networksim)theEObject;
				T result = caseNetworksim(networksim);
				if (result == null) result = caseNetwork(networksim);
				if (result == null) result = caseResource(networksim);
				if (result == null) result = caseEntity(networksim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.DATACENTER: {
				Datacenter datacenter = (Datacenter)theEObject;
				T result = caseDatacenter(datacenter);
				if (result == null) result = caseMixinBase(datacenter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.CLOUDLET: {
				Cloudlet cloudlet = (Cloudlet)theEObject;
				T result = caseCloudlet(cloudlet);
				if (result == null) result = caseMixinBase(cloudlet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.HOST: {
				Host host = (Host)theEObject;
				T result = caseHost(host);
				if (result == null) result = caseMixinBase(host);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.VM: {
				Vm vm = (Vm)theEObject;
				T result = caseVm(vm);
				if (result == null) result = caseMixinBase(vm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.HARDDRIVESTORAGE: {
				Harddrivestorage harddrivestorage = (Harddrivestorage)theEObject;
				T result = caseHarddrivestorage(harddrivestorage);
				if (result == null) result = caseMixinBase(harddrivestorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.SANSTORAGE: {
				Sanstorage sanstorage = (Sanstorage)theEObject;
				T result = caseSanstorage(sanstorage);
				if (result == null) result = caseMixinBase(sanstorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.PROBADISTRIB: {
				Probadistrib probadistrib = (Probadistrib)theEObject;
				T result = caseProbadistrib(probadistrib);
				if (result == null) result = caseMixinBase(probadistrib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.POISSON: {
				Poisson poisson = (Poisson)theEObject;
				T result = casePoisson(poisson);
				if (result == null) result = caseProbadistrib(poisson);
				if (result == null) result = caseMixinBase(poisson);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.GAUSS: {
				Gauss gauss = (Gauss)theEObject;
				T result = caseGauss(gauss);
				if (result == null) result = caseProbadistrib(gauss);
				if (result == null) result = caseMixinBase(gauss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.BINOMIALE: {
				Binomiale binomiale = (Binomiale)theEObject;
				T result = caseBinomiale(binomiale);
				if (result == null) result = caseProbadistrib(binomiale);
				if (result == null) result = caseMixinBase(binomiale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.PRICESTRATEGIES: {
				Pricestrategies pricestrategies = (Pricestrategies)theEObject;
				T result = casePricestrategies(pricestrategies);
				if (result == null) result = caseMixinBase(pricestrategies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.ONDEMAND: {
				Ondemand ondemand = (Ondemand)theEObject;
				T result = caseOndemand(ondemand);
				if (result == null) result = casePricestrategies(ondemand);
				if (result == null) result = caseMixinBase(ondemand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.UPFRONT: {
				Upfront upfront = (Upfront)theEObject;
				T result = caseUpfront(upfront);
				if (result == null) result = casePricestrategies(upfront);
				if (result == null) result = caseMixinBase(upfront);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulationPackage.AUCTION: {
				Auction auction = (Auction)theEObject;
				T result = caseAuction(auction);
				if (result == null) result = casePricestrategies(auction);
				if (result == null) result = caseMixinBase(auction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computesim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computesim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputesim(Computesim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storagesim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storagesim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoragesim(Storagesim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networksim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networksim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworksim(Networksim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datacenter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datacenter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatacenter(Datacenter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloudlet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloudlet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudlet(Cloudlet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHost(Host object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVm(Vm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Harddrivestorage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Harddrivestorage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHarddrivestorage(Harddrivestorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sanstorage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sanstorage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSanstorage(Sanstorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probadistrib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probadistrib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbadistrib(Probadistrib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poisson</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poisson</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoisson(Poisson object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gauss</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gauss</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGauss(Gauss object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binomiale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binomiale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinomiale(Binomiale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pricestrategies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pricestrategies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePricestrategies(Pricestrategies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ondemand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ondemand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOndemand(Ondemand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upfront</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upfront</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpfront(Upfront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuction(Auction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinBase(MixinBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimulationSwitch
