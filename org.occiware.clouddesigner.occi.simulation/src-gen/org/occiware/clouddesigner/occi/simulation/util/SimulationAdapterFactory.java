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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.occiware.clouddesigner.occi.simulation.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.simulation.SimulationPackage
 * @generated
 */
public class SimulationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimulationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimulationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationSwitch<Adapter> modelSwitch =
		new SimulationSwitch<Adapter>() {
			@Override
			public Adapter caseComputesim(Computesim object) {
				return createComputesimAdapter();
			}
			@Override
			public Adapter caseStoragesim(Storagesim object) {
				return createStoragesimAdapter();
			}
			@Override
			public Adapter caseNetworksim(Networksim object) {
				return createNetworksimAdapter();
			}
			@Override
			public Adapter caseDatacenter(Datacenter object) {
				return createDatacenterAdapter();
			}
			@Override
			public Adapter caseCloudlet(Cloudlet object) {
				return createCloudletAdapter();
			}
			@Override
			public Adapter caseHost(Host object) {
				return createHostAdapter();
			}
			@Override
			public Adapter caseVm(Vm object) {
				return createVmAdapter();
			}
			@Override
			public Adapter caseHarddrivestorage(Harddrivestorage object) {
				return createHarddrivestorageAdapter();
			}
			@Override
			public Adapter caseSanstorage(Sanstorage object) {
				return createSanstorageAdapter();
			}
			@Override
			public Adapter caseProbadistrib(Probadistrib object) {
				return createProbadistribAdapter();
			}
			@Override
			public Adapter casePoisson(Poisson object) {
				return createPoissonAdapter();
			}
			@Override
			public Adapter caseGauss(Gauss object) {
				return createGaussAdapter();
			}
			@Override
			public Adapter caseBinomiale(Binomiale object) {
				return createBinomialeAdapter();
			}
			@Override
			public Adapter casePricestrategies(Pricestrategies object) {
				return createPricestrategiesAdapter();
			}
			@Override
			public Adapter caseOndemand(Ondemand object) {
				return createOndemandAdapter();
			}
			@Override
			public Adapter caseUpfront(Upfront object) {
				return createUpfrontAdapter();
			}
			@Override
			public Adapter caseAuction(Auction object) {
				return createAuctionAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseCompute(Compute object) {
				return createComputeAdapter();
			}
			@Override
			public Adapter caseStorage(Storage object) {
				return createStorageAdapter();
			}
			@Override
			public Adapter caseNetwork(Network object) {
				return createNetworkAdapter();
			}
			@Override
			public Adapter caseMixinBase(MixinBase object) {
				return createMixinBaseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Computesim <em>Computesim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Computesim
	 * @generated
	 */
	public Adapter createComputesimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Storagesim <em>Storagesim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Storagesim
	 * @generated
	 */
	public Adapter createStoragesimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Networksim <em>Networksim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Networksim
	 * @generated
	 */
	public Adapter createNetworksimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Datacenter <em>Datacenter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter
	 * @generated
	 */
	public Adapter createDatacenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet <em>Cloudlet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet
	 * @generated
	 */
	public Adapter createCloudletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Host
	 * @generated
	 */
	public Adapter createHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Vm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm
	 * @generated
	 */
	public Adapter createVmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Harddrivestorage <em>Harddrivestorage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Harddrivestorage
	 * @generated
	 */
	public Adapter createHarddrivestorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Sanstorage <em>Sanstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Sanstorage
	 * @generated
	 */
	public Adapter createSanstorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Probadistrib <em>Probadistrib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Probadistrib
	 * @generated
	 */
	public Adapter createProbadistribAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Poisson <em>Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Poisson
	 * @generated
	 */
	public Adapter createPoissonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Gauss <em>Gauss</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Gauss
	 * @generated
	 */
	public Adapter createGaussAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Binomiale <em>Binomiale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Binomiale
	 * @generated
	 */
	public Adapter createBinomialeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Pricestrategies <em>Pricestrategies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Pricestrategies
	 * @generated
	 */
	public Adapter createPricestrategiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Ondemand <em>Ondemand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Ondemand
	 * @generated
	 */
	public Adapter createOndemandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Upfront <em>Upfront</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Upfront
	 * @generated
	 */
	public Adapter createUpfrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.occiware.clouddesigner.occi.simulation.Auction <em>Auction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.occiware.clouddesigner.occi.simulation.Auction
	 * @generated
	 */
	public Adapter createAuctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.infrastructure.Compute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.infrastructure.Compute
	 * @generated
	 */
	public Adapter createComputeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.infrastructure.Storage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.infrastructure.Storage
	 * @generated
	 */
	public Adapter createStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.infrastructure.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.infrastructure.Network
	 * @generated
	 */
	public Adapter createNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.MixinBase <em>Mixin Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.MixinBase
	 * @generated
	 */
	public Adapter createMixinBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimulationAdapterFactory
