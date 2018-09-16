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

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.occiware.clouddesigner.occi.simulation.SimulationFactory
 * @model kind="package"
 * @generated
 */
public interface SimulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.ogf.org/occi/simulation/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulationPackage eINSTANCE = org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.ComputesimImpl <em>Computesim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.ComputesimImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getComputesim()
	 * @generated
	 */
	int COMPUTESIM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__ID = InfrastructurePackage.COMPUTE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__TITLE = InfrastructurePackage.COMPUTE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__KIND = InfrastructurePackage.COMPUTE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__LOCATION = InfrastructurePackage.COMPUTE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__ATTRIBUTES = InfrastructurePackage.COMPUTE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__MIXINS = InfrastructurePackage.COMPUTE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__PARTS = InfrastructurePackage.COMPUTE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__SUMMARY = InfrastructurePackage.COMPUTE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__LINKS = InfrastructurePackage.COMPUTE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__RLINKS = InfrastructurePackage.COMPUTE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Compute Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__OCCI_COMPUTE_ARCHITECTURE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__OCCI_COMPUTE_CORES = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_CORES;

	/**
	 * The feature id for the '<em><b>Occi Compute Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__OCCI_COMPUTE_HOSTNAME = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_HOSTNAME;

	/**
	 * The feature id for the '<em><b>Occi Compute Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__OCCI_COMPUTE_SHARE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SHARE;

	/**
	 * The feature id for the '<em><b>Occi Compute Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__OCCI_COMPUTE_SPEED = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_SPEED;

	/**
	 * The feature id for the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__OCCI_COMPUTE_MEMORY = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_MEMORY;

	/**
	 * The feature id for the '<em><b>Occi Compute State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__OCCI_COMPUTE_STATE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Compute State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM__OCCI_COMPUTE_STATE_MESSAGE = InfrastructurePackage.COMPUTE__OCCI_COMPUTE_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Computesim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM_FEATURE_COUNT = InfrastructurePackage.COMPUTE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM___OCCI_CREATE = InfrastructurePackage.COMPUTE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM___OCCI_RETRIEVE = InfrastructurePackage.COMPUTE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM___OCCI_UPDATE = InfrastructurePackage.COMPUTE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM___OCCI_DELETE = InfrastructurePackage.COMPUTE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM___START = InfrastructurePackage.COMPUTE___START;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM___STOP__STOPMETHOD = InfrastructurePackage.COMPUTE___STOP__STOPMETHOD;

	/**
	 * The operation id for the '<em>Restart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM___RESTART__RESTARTMETHOD = InfrastructurePackage.COMPUTE___RESTART__RESTARTMETHOD;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM___SUSPEND__SUSPENDMETHOD = InfrastructurePackage.COMPUTE___SUSPEND__SUSPENDMETHOD;

	/**
	 * The operation id for the '<em>Save</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM___SAVE__SAVEMETHOD_STRING = InfrastructurePackage.COMPUTE___SAVE__SAVEMETHOD_STRING;

	/**
	 * The number of operations of the '<em>Computesim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTESIM_OPERATION_COUNT = InfrastructurePackage.COMPUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.StoragesimImpl <em>Storagesim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.StoragesimImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getStoragesim()
	 * @generated
	 */
	int STORAGESIM = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__ID = InfrastructurePackage.STORAGE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__TITLE = InfrastructurePackage.STORAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__KIND = InfrastructurePackage.STORAGE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__LOCATION = InfrastructurePackage.STORAGE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__ATTRIBUTES = InfrastructurePackage.STORAGE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__MIXINS = InfrastructurePackage.STORAGE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__PARTS = InfrastructurePackage.STORAGE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__SUMMARY = InfrastructurePackage.STORAGE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__LINKS = InfrastructurePackage.STORAGE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__RLINKS = InfrastructurePackage.STORAGE__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__OCCI_STORAGE_SIZE = InfrastructurePackage.STORAGE__OCCI_STORAGE_SIZE;

	/**
	 * The feature id for the '<em><b>Occi Storage State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__OCCI_STORAGE_STATE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE;

	/**
	 * The feature id for the '<em><b>Occi Storage State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM__OCCI_STORAGE_STATE_MESSAGE = InfrastructurePackage.STORAGE__OCCI_STORAGE_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Storagesim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM_FEATURE_COUNT = InfrastructurePackage.STORAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM___OCCI_CREATE = InfrastructurePackage.STORAGE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM___OCCI_RETRIEVE = InfrastructurePackage.STORAGE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM___OCCI_UPDATE = InfrastructurePackage.STORAGE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM___OCCI_DELETE = InfrastructurePackage.STORAGE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Online</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM___ONLINE = InfrastructurePackage.STORAGE___ONLINE;

	/**
	 * The operation id for the '<em>Offline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM___OFFLINE = InfrastructurePackage.STORAGE___OFFLINE;

	/**
	 * The number of operations of the '<em>Storagesim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGESIM_OPERATION_COUNT = InfrastructurePackage.STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.NetworksimImpl <em>Networksim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.NetworksimImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getNetworksim()
	 * @generated
	 */
	int NETWORKSIM = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__ID = InfrastructurePackage.NETWORK__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__TITLE = InfrastructurePackage.NETWORK__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__KIND = InfrastructurePackage.NETWORK__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__LOCATION = InfrastructurePackage.NETWORK__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__ATTRIBUTES = InfrastructurePackage.NETWORK__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__MIXINS = InfrastructurePackage.NETWORK__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__PARTS = InfrastructurePackage.NETWORK__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__SUMMARY = InfrastructurePackage.NETWORK__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__LINKS = InfrastructurePackage.NETWORK__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__RLINKS = InfrastructurePackage.NETWORK__RLINKS;

	/**
	 * The feature id for the '<em><b>Occi Network Vlan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__OCCI_NETWORK_VLAN = InfrastructurePackage.NETWORK__OCCI_NETWORK_VLAN;

	/**
	 * The feature id for the '<em><b>Occi Network Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__OCCI_NETWORK_LABEL = InfrastructurePackage.NETWORK__OCCI_NETWORK_LABEL;

	/**
	 * The feature id for the '<em><b>Occi Network State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__OCCI_NETWORK_STATE = InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE;

	/**
	 * The feature id for the '<em><b>Occi Network State Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM__OCCI_NETWORK_STATE_MESSAGE = InfrastructurePackage.NETWORK__OCCI_NETWORK_STATE_MESSAGE;

	/**
	 * The number of structural features of the '<em>Networksim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM_FEATURE_COUNT = InfrastructurePackage.NETWORK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM___OCCI_CREATE = InfrastructurePackage.NETWORK___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM___OCCI_RETRIEVE = InfrastructurePackage.NETWORK___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM___OCCI_UPDATE = InfrastructurePackage.NETWORK___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM___OCCI_DELETE = InfrastructurePackage.NETWORK___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM___UP = InfrastructurePackage.NETWORK___UP;

	/**
	 * The operation id for the '<em>Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM___DOWN = InfrastructurePackage.NETWORK___DOWN;

	/**
	 * The number of operations of the '<em>Networksim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKSIM_OPERATION_COUNT = InfrastructurePackage.NETWORK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl <em>Datacenter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getDatacenter()
	 * @generated
	 */
	int DATACENTER = 3;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__OS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vmm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__VMM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__TIMEZONE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__COST = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cost Per Mem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__COST_PER_MEM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cost Per Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__COST_PER_STORAGE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cost Per Bw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__COST_PER_BW = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__NAME = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Scheduling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__SCHEDULING_INTERVAL = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER__LOCATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Datacenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Datacenter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATACENTER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl <em>Cloudlet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getCloudlet()
	 * @generated
	 */
	int CLOUDLET = 4;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Cloudlet Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_ID = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cloudlet Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_LENGTH = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CORES = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cloudlet File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_FILE_SIZE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cloudlet Output Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__CLOUDLET_OUTPUT_SIZE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Utilization Model Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__UTILIZATION_MODEL_CPU = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Utilization Model Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__UTILIZATION_MODEL_RAM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Utilization Model Bw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET__UTILIZATION_MODEL_BW = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Cloudlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloudlet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUDLET_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.HostImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getHost()
	 * @generated
	 */
	int HOST = 5;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Id Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ID_HOST = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ram Provisioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__RAM_PROVISIONER = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bw Provisioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__BW_PROVISIONER = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__STORAGE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__CORES = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vm Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__VM_SCHEDULER = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__RAM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__BW = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__MIPS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pe Provisioner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__PE_PROVISIONER = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Elastic Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__ELASTIC_HOST = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ram Max Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__RAM_MAX_HOST = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ram Min Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__RAM_MIN_HOST = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Mips Max Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST__MIPS_MAX_HOST = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOST_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl <em>Vm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.VmImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getVm()
	 * @generated
	 */
	int VM = 6;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Idvm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__IDVM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mips</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__MIPS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__CORES = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__BW = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__SIZE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cloudlet Scheduler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__CLOUDLET_SCHEDULER = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Vmm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__VMM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__RAM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Ram Max Vm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__RAM_MAX_VM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Ram Min Vm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__RAM_MIN_VM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__OS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Irdto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__IRDTO = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__DTO = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Dti</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__DTI = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Irdt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__IRDT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Elastic Vm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM__ELASTIC_VM = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Vm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 16;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.HarddrivestorageImpl <em>Harddrivestorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.HarddrivestorageImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getHarddrivestorage()
	 * @generated
	 */
	int HARDDRIVESTORAGE = 7;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVESTORAGE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVESTORAGE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVESTORAGE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Harddrivestorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVESTORAGE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVESTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Harddrivestorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDDRIVESTORAGE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.SanstorageImpl <em>Sanstorage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SanstorageImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getSanstorage()
	 * @generated
	 */
	int SANSTORAGE = 8;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__BANDWIDTH = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Network Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE__NETWORK_LATENCY = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sanstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sanstorage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SANSTORAGE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.ProbadistribImpl <em>Probadistrib</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.ProbadistribImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getProbadistrib()
	 * @generated
	 */
	int PROBADISTRIB = 9;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBADISTRIB__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBADISTRIB__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBADISTRIB__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Probadistrib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBADISTRIB_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBADISTRIB___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Probadistrib</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROBADISTRIB_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.PoissonImpl <em>Poisson</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.PoissonImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getPoisson()
	 * @generated
	 */
	int POISSON = 10;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__X = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON__U = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Poisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Poisson</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISSON_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.GaussImpl <em>Gauss</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.GaussImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getGauss()
	 * @generated
	 */
	int GAUSS = 11;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS__X = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS__N = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS__P = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Gauss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gauss</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAUSS_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.BinomialeImpl <em>Binomiale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.BinomialeImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getBinomiale()
	 * @generated
	 */
	int BINOMIALE = 12;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIALE__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIALE__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIALE__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Num Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIALE__NUM_CORRECT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Trials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIALE__NUM_TRIALS = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIALE__CHANCE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binomiale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIALE_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIALE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binomiale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINOMIALE_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.PricestrategiesImpl <em>Pricestrategies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.PricestrategiesImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getPricestrategies()
	 * @generated
	 */
	int PRICESTRATEGIES = 13;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGIES__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGIES__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGIES__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Pricestrategies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGIES_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGIES___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pricestrategies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICESTRATEGIES_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.OndemandImpl <em>Ondemand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.OndemandImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getOndemand()
	 * @generated
	 */
	int ONDEMAND = 14;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Ondemand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ondemand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONDEMAND_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.UpfrontImpl <em>Upfront</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.UpfrontImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getUpfront()
	 * @generated
	 */
	int UPFRONT = 15;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Upfront</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Upfront</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPFRONT_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.occiware.clouddesigner.occi.simulation.impl.AuctionImpl <em>Auction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.occiware.clouddesigner.occi.simulation.impl.AuctionImpl
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getAuction()
	 * @generated
	 */
	int AUCTION = 16;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Auction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUCTION_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getdouble()
	 * @generated
	 */
	int DOUBLE = 17;

	/**
	 * The meta object id for the '<em>long</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getlong()
	 * @generated
	 */
	int LONG = 18;

	/**
	 * The meta object id for the '<em>Ram Provisioner</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getRamProvisioner()
	 * @generated
	 */
	int RAM_PROVISIONER = 19;

	/**
	 * The meta object id for the '<em>Bw Provisioner</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getBwProvisioner()
	 * @generated
	 */
	int BW_PROVISIONER = 20;

	/**
	 * The meta object id for the '<em>Pe Provisioner</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getPeProvisioner()
	 * @generated
	 */
	int PE_PROVISIONER = 21;

	/**
	 * The meta object id for the '<em>Cloudlet Scheduler</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getCloudletScheduler()
	 * @generated
	 */
	int CLOUDLET_SCHEDULER = 22;

	/**
	 * The meta object id for the '<em>Vm Scheduler</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getVmScheduler()
	 * @generated
	 */
	int VM_SCHEDULER = 23;

	/**
	 * The meta object id for the '<em>utilization Model</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getutilizationModel()
	 * @generated
	 */
	int UTILIZATION_MODEL = 24;


	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Computesim <em>Computesim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computesim</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Computesim
	 * @generated
	 */
	EClass getComputesim();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Storagesim <em>Storagesim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storagesim</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Storagesim
	 * @generated
	 */
	EClass getStoragesim();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Networksim <em>Networksim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networksim</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Networksim
	 * @generated
	 */
	EClass getNetworksim();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Datacenter <em>Datacenter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datacenter</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter
	 * @generated
	 */
	EClass getDatacenter();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getOs()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Os();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getVmm <em>Vmm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmm</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getVmm()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Vmm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timezone</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getTimezone()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Timezone();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getCost()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Cost();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerMem <em>Cost Per Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Mem</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerMem()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_CostPerMem();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerStorage <em>Cost Per Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Storage</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerStorage()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_CostPerStorage();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerBw <em>Cost Per Bw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost Per Bw</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getCostPerBw()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_CostPerBw();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getName()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getSchedulingInterval <em>Scheduling Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Interval</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getSchedulingInterval()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_SchedulingInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#getLocation()
	 * @see #getDatacenter()
	 * @generated
	 */
	EAttribute getDatacenter_Location();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.simulation.Datacenter#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.clouddesigner.occi.simulation.Datacenter#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDatacenter__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet <em>Cloudlet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloudlet</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet
	 * @generated
	 */
	EClass getCloudlet();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletId <em>Cloudlet Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Id</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletId()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletId();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletLength <em>Cloudlet Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Length</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletLength()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletLength();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet#getCores()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_Cores();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletFileSize <em>Cloudlet File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet File Size</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletFileSize()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletFileSize();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletOutputSize <em>Cloudlet Output Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Output Size</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet#getCloudletOutputSize()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_CloudletOutputSize();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelCpu <em>Utilization Model Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization Model Cpu</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelCpu()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_UtilizationModelCpu();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelRam <em>Utilization Model Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization Model Ram</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelRam()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_UtilizationModelRam();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelBw <em>Utilization Model Bw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Utilization Model Bw</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet#getUtilizationModelBw()
	 * @see #getCloudlet()
	 * @generated
	 */
	EAttribute getCloudlet_UtilizationModelBw();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.simulation.Cloudlet#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.clouddesigner.occi.simulation.Cloudlet#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCloudlet__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Host <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host
	 * @generated
	 */
	EClass getHost();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getIdHost <em>Id Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Host</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getIdHost()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_IdHost();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getRamProvisioner <em>Ram Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Provisioner</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getRamProvisioner()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_RamProvisioner();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getBwProvisioner <em>Bw Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bw Provisioner</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getBwProvisioner()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_BwProvisioner();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getStorage()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Storage();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getCores()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Cores();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getVmScheduler <em>Vm Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Scheduler</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getVmScheduler()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_VmScheduler();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getRam()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Ram();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getBw <em>Bw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bw</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getBw()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Bw();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getMips <em>Mips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mips</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getMips()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_Mips();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getPeProvisioner <em>Pe Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pe Provisioner</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getPeProvisioner()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_PeProvisioner();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getElasticHost <em>Elastic Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elastic Host</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getElasticHost()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_ElasticHost();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getRamMaxHost <em>Ram Max Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Max Host</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getRamMaxHost()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_RamMaxHost();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getRamMinHost <em>Ram Min Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Min Host</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getRamMinHost()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_RamMinHost();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Host#getMipsMaxHost <em>Mips Max Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mips Max Host</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#getMipsMaxHost()
	 * @see #getHost()
	 * @generated
	 */
	EAttribute getHost_MipsMaxHost();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.simulation.Host#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.clouddesigner.occi.simulation.Host#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHost__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Vm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vm</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm
	 * @generated
	 */
	EClass getVm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getIdvm <em>Idvm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idvm</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getIdvm()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Idvm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getMips <em>Mips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mips</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getMips()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Mips();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getCores <em>Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getCores()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Cores();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getBw <em>Bw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bw</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getBw()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Bw();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getSize()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getCloudletScheduler <em>Cloudlet Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloudlet Scheduler</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getCloudletScheduler()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_CloudletScheduler();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getVmm <em>Vmm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vmm</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getVmm()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Vmm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getRam <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getRam()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Ram();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getRamMaxVm <em>Ram Max Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Max Vm</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getRamMaxVm()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_RamMaxVm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getRamMinVm <em>Ram Min Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ram Min Vm</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getRamMinVm()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_RamMinVm();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getOs()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Os();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getIrdto <em>Irdto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Irdto</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getIrdto()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Irdto();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dto</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getDto()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Dto();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getDti <em>Dti</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dti</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getDti()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Dti();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getIrdt <em>Irdt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Irdt</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getIrdt()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_Irdt();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Vm#getElasticVm <em>Elastic Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elastic Vm</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#getElasticVm()
	 * @see #getVm()
	 * @generated
	 */
	EAttribute getVm_ElasticVm();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.simulation.Vm#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.clouddesigner.occi.simulation.Vm#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVm__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Harddrivestorage <em>Harddrivestorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Harddrivestorage</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Harddrivestorage
	 * @generated
	 */
	EClass getHarddrivestorage();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.simulation.Harddrivestorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.clouddesigner.occi.simulation.Harddrivestorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getHarddrivestorage__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Sanstorage <em>Sanstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sanstorage</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Sanstorage
	 * @generated
	 */
	EClass getSanstorage();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Sanstorage#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bandwidth</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Sanstorage#getBandwidth()
	 * @see #getSanstorage()
	 * @generated
	 */
	EAttribute getSanstorage_Bandwidth();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Sanstorage#getNetworkLatency <em>Network Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Latency</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Sanstorage#getNetworkLatency()
	 * @see #getSanstorage()
	 * @generated
	 */
	EAttribute getSanstorage_NetworkLatency();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.simulation.Sanstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.clouddesigner.occi.simulation.Sanstorage#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSanstorage__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Probadistrib <em>Probadistrib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Probadistrib</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Probadistrib
	 * @generated
	 */
	EClass getProbadistrib();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.simulation.Probadistrib#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.clouddesigner.occi.simulation.Probadistrib#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getProbadistrib__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Poisson <em>Poisson</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poisson</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Poisson
	 * @generated
	 */
	EClass getPoisson();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Poisson#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Poisson#getX()
	 * @see #getPoisson()
	 * @generated
	 */
	EAttribute getPoisson_X();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Poisson#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>U</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Poisson#getU()
	 * @see #getPoisson()
	 * @generated
	 */
	EAttribute getPoisson_U();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Gauss <em>Gauss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gauss</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Gauss
	 * @generated
	 */
	EClass getGauss();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Gauss#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Gauss#getX()
	 * @see #getGauss()
	 * @generated
	 */
	EAttribute getGauss_X();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Gauss#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>N</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Gauss#getN()
	 * @see #getGauss()
	 * @generated
	 */
	EAttribute getGauss_N();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Gauss#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Gauss#getP()
	 * @see #getGauss()
	 * @generated
	 */
	EAttribute getGauss_P();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Binomiale <em>Binomiale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binomiale</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Binomiale
	 * @generated
	 */
	EClass getBinomiale();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Binomiale#getNumCorrect <em>Num Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Correct</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Binomiale#getNumCorrect()
	 * @see #getBinomiale()
	 * @generated
	 */
	EAttribute getBinomiale_NumCorrect();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Binomiale#getNumTrials <em>Num Trials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Trials</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Binomiale#getNumTrials()
	 * @see #getBinomiale()
	 * @generated
	 */
	EAttribute getBinomiale_NumTrials();

	/**
	 * Returns the meta object for the attribute '{@link org.occiware.clouddesigner.occi.simulation.Binomiale#getChance <em>Chance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chance</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Binomiale#getChance()
	 * @see #getBinomiale()
	 * @generated
	 */
	EAttribute getBinomiale_Chance();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Pricestrategies <em>Pricestrategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pricestrategies</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Pricestrategies
	 * @generated
	 */
	EClass getPricestrategies();

	/**
	 * Returns the meta object for the '{@link org.occiware.clouddesigner.occi.simulation.Pricestrategies#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see org.occiware.clouddesigner.occi.simulation.Pricestrategies#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPricestrategies__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Ondemand <em>Ondemand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ondemand</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Ondemand
	 * @generated
	 */
	EClass getOndemand();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Upfront <em>Upfront</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upfront</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Upfront
	 * @generated
	 */
	EClass getUpfront();

	/**
	 * Returns the meta object for class '{@link org.occiware.clouddesigner.occi.simulation.Auction <em>Auction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auction</em>'.
	 * @see org.occiware.clouddesigner.occi.simulation.Auction
	 * @generated
	 */
	EClass getAuction();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getdouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>long</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getlong();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Ram Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ram Provisioner</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getRamProvisioner();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Bw Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bw Provisioner</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getBwProvisioner();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Pe Provisioner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pe Provisioner</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getPeProvisioner();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Cloudlet Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cloudlet Scheduler</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getCloudletScheduler();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Vm Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vm Scheduler</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getVmScheduler();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>utilization Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>utilization Model</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getutilizationModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimulationFactory getSimulationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.ComputesimImpl <em>Computesim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.ComputesimImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getComputesim()
		 * @generated
		 */
		EClass COMPUTESIM = eINSTANCE.getComputesim();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.StoragesimImpl <em>Storagesim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.StoragesimImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getStoragesim()
		 * @generated
		 */
		EClass STORAGESIM = eINSTANCE.getStoragesim();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.NetworksimImpl <em>Networksim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.NetworksimImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getNetworksim()
		 * @generated
		 */
		EClass NETWORKSIM = eINSTANCE.getNetworksim();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl <em>Datacenter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.DatacenterImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getDatacenter()
		 * @generated
		 */
		EClass DATACENTER = eINSTANCE.getDatacenter();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__OS = eINSTANCE.getDatacenter_Os();

		/**
		 * The meta object literal for the '<em><b>Vmm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__VMM = eINSTANCE.getDatacenter_Vmm();

		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__TIMEZONE = eINSTANCE.getDatacenter_Timezone();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__COST = eINSTANCE.getDatacenter_Cost();

		/**
		 * The meta object literal for the '<em><b>Cost Per Mem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__COST_PER_MEM = eINSTANCE.getDatacenter_CostPerMem();

		/**
		 * The meta object literal for the '<em><b>Cost Per Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__COST_PER_STORAGE = eINSTANCE.getDatacenter_CostPerStorage();

		/**
		 * The meta object literal for the '<em><b>Cost Per Bw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__COST_PER_BW = eINSTANCE.getDatacenter_CostPerBw();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__NAME = eINSTANCE.getDatacenter_Name();

		/**
		 * The meta object literal for the '<em><b>Scheduling Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__SCHEDULING_INTERVAL = eINSTANCE.getDatacenter_SchedulingInterval();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATACENTER__LOCATION = eINSTANCE.getDatacenter_Location();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATACENTER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDatacenter__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl <em>Cloudlet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.CloudletImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getCloudlet()
		 * @generated
		 */
		EClass CLOUDLET = eINSTANCE.getCloudlet();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_ID = eINSTANCE.getCloudlet_CloudletId();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_LENGTH = eINSTANCE.getCloudlet_CloudletLength();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CORES = eINSTANCE.getCloudlet_Cores();

		/**
		 * The meta object literal for the '<em><b>Cloudlet File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_FILE_SIZE = eINSTANCE.getCloudlet_CloudletFileSize();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Output Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__CLOUDLET_OUTPUT_SIZE = eINSTANCE.getCloudlet_CloudletOutputSize();

		/**
		 * The meta object literal for the '<em><b>Utilization Model Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__UTILIZATION_MODEL_CPU = eINSTANCE.getCloudlet_UtilizationModelCpu();

		/**
		 * The meta object literal for the '<em><b>Utilization Model Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__UTILIZATION_MODEL_RAM = eINSTANCE.getCloudlet_UtilizationModelRam();

		/**
		 * The meta object literal for the '<em><b>Utilization Model Bw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUDLET__UTILIZATION_MODEL_BW = eINSTANCE.getCloudlet_UtilizationModelBw();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CLOUDLET___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCloudlet__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.HostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.HostImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getHost()
		 * @generated
		 */
		EClass HOST = eINSTANCE.getHost();

		/**
		 * The meta object literal for the '<em><b>Id Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__ID_HOST = eINSTANCE.getHost_IdHost();

		/**
		 * The meta object literal for the '<em><b>Ram Provisioner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__RAM_PROVISIONER = eINSTANCE.getHost_RamProvisioner();

		/**
		 * The meta object literal for the '<em><b>Bw Provisioner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__BW_PROVISIONER = eINSTANCE.getHost_BwProvisioner();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__STORAGE = eINSTANCE.getHost_Storage();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__CORES = eINSTANCE.getHost_Cores();

		/**
		 * The meta object literal for the '<em><b>Vm Scheduler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__VM_SCHEDULER = eINSTANCE.getHost_VmScheduler();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__RAM = eINSTANCE.getHost_Ram();

		/**
		 * The meta object literal for the '<em><b>Bw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__BW = eINSTANCE.getHost_Bw();

		/**
		 * The meta object literal for the '<em><b>Mips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__MIPS = eINSTANCE.getHost_Mips();

		/**
		 * The meta object literal for the '<em><b>Pe Provisioner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__PE_PROVISIONER = eINSTANCE.getHost_PeProvisioner();

		/**
		 * The meta object literal for the '<em><b>Elastic Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__ELASTIC_HOST = eINSTANCE.getHost_ElasticHost();

		/**
		 * The meta object literal for the '<em><b>Ram Max Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__RAM_MAX_HOST = eINSTANCE.getHost_RamMaxHost();

		/**
		 * The meta object literal for the '<em><b>Ram Min Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__RAM_MIN_HOST = eINSTANCE.getHost_RamMinHost();

		/**
		 * The meta object literal for the '<em><b>Mips Max Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOST__MIPS_MAX_HOST = eINSTANCE.getHost_MipsMaxHost();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOST___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHost__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.VmImpl <em>Vm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.VmImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getVm()
		 * @generated
		 */
		EClass VM = eINSTANCE.getVm();

		/**
		 * The meta object literal for the '<em><b>Idvm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__IDVM = eINSTANCE.getVm_Idvm();

		/**
		 * The meta object literal for the '<em><b>Mips</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__MIPS = eINSTANCE.getVm_Mips();

		/**
		 * The meta object literal for the '<em><b>Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__CORES = eINSTANCE.getVm_Cores();

		/**
		 * The meta object literal for the '<em><b>Bw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__BW = eINSTANCE.getVm_Bw();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__SIZE = eINSTANCE.getVm_Size();

		/**
		 * The meta object literal for the '<em><b>Cloudlet Scheduler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__CLOUDLET_SCHEDULER = eINSTANCE.getVm_CloudletScheduler();

		/**
		 * The meta object literal for the '<em><b>Vmm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__VMM = eINSTANCE.getVm_Vmm();

		/**
		 * The meta object literal for the '<em><b>Ram</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__RAM = eINSTANCE.getVm_Ram();

		/**
		 * The meta object literal for the '<em><b>Ram Max Vm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__RAM_MAX_VM = eINSTANCE.getVm_RamMaxVm();

		/**
		 * The meta object literal for the '<em><b>Ram Min Vm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__RAM_MIN_VM = eINSTANCE.getVm_RamMinVm();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__OS = eINSTANCE.getVm_Os();

		/**
		 * The meta object literal for the '<em><b>Irdto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__IRDTO = eINSTANCE.getVm_Irdto();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__DTO = eINSTANCE.getVm_Dto();

		/**
		 * The meta object literal for the '<em><b>Dti</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__DTI = eINSTANCE.getVm_Dti();

		/**
		 * The meta object literal for the '<em><b>Irdt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__IRDT = eINSTANCE.getVm_Irdt();

		/**
		 * The meta object literal for the '<em><b>Elastic Vm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM__ELASTIC_VM = eINSTANCE.getVm_ElasticVm();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getVm__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.HarddrivestorageImpl <em>Harddrivestorage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.HarddrivestorageImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getHarddrivestorage()
		 * @generated
		 */
		EClass HARDDRIVESTORAGE = eINSTANCE.getHarddrivestorage();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HARDDRIVESTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getHarddrivestorage__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.SanstorageImpl <em>Sanstorage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SanstorageImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getSanstorage()
		 * @generated
		 */
		EClass SANSTORAGE = eINSTANCE.getSanstorage();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SANSTORAGE__BANDWIDTH = eINSTANCE.getSanstorage_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>Network Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SANSTORAGE__NETWORK_LATENCY = eINSTANCE.getSanstorage_NetworkLatency();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SANSTORAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getSanstorage__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.ProbadistribImpl <em>Probadistrib</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.ProbadistribImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getProbadistrib()
		 * @generated
		 */
		EClass PROBADISTRIB = eINSTANCE.getProbadistrib();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROBADISTRIB___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getProbadistrib__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.PoissonImpl <em>Poisson</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.PoissonImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getPoisson()
		 * @generated
		 */
		EClass POISSON = eINSTANCE.getPoisson();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POISSON__X = eINSTANCE.getPoisson_X();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POISSON__U = eINSTANCE.getPoisson_U();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.GaussImpl <em>Gauss</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.GaussImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getGauss()
		 * @generated
		 */
		EClass GAUSS = eINSTANCE.getGauss();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSS__X = eINSTANCE.getGauss_X();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSS__N = eINSTANCE.getGauss_N();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAUSS__P = eINSTANCE.getGauss_P();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.BinomialeImpl <em>Binomiale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.BinomialeImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getBinomiale()
		 * @generated
		 */
		EClass BINOMIALE = eINSTANCE.getBinomiale();

		/**
		 * The meta object literal for the '<em><b>Num Correct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINOMIALE__NUM_CORRECT = eINSTANCE.getBinomiale_NumCorrect();

		/**
		 * The meta object literal for the '<em><b>Num Trials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINOMIALE__NUM_TRIALS = eINSTANCE.getBinomiale_NumTrials();

		/**
		 * The meta object literal for the '<em><b>Chance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINOMIALE__CHANCE = eINSTANCE.getBinomiale_Chance();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.PricestrategiesImpl <em>Pricestrategies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.PricestrategiesImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getPricestrategies()
		 * @generated
		 */
		EClass PRICESTRATEGIES = eINSTANCE.getPricestrategies();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRICESTRATEGIES___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPricestrategies__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.OndemandImpl <em>Ondemand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.OndemandImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getOndemand()
		 * @generated
		 */
		EClass ONDEMAND = eINSTANCE.getOndemand();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.UpfrontImpl <em>Upfront</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.UpfrontImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getUpfront()
		 * @generated
		 */
		EClass UPFRONT = eINSTANCE.getUpfront();

		/**
		 * The meta object literal for the '{@link org.occiware.clouddesigner.occi.simulation.impl.AuctionImpl <em>Auction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.occiware.clouddesigner.occi.simulation.impl.AuctionImpl
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getAuction()
		 * @generated
		 */
		EClass AUCTION = eINSTANCE.getAuction();

		/**
		 * The meta object literal for the '<em>double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getdouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getdouble();

		/**
		 * The meta object literal for the '<em>long</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getlong()
		 * @generated
		 */
		EDataType LONG = eINSTANCE.getlong();

		/**
		 * The meta object literal for the '<em>Ram Provisioner</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getRamProvisioner()
		 * @generated
		 */
		EDataType RAM_PROVISIONER = eINSTANCE.getRamProvisioner();

		/**
		 * The meta object literal for the '<em>Bw Provisioner</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getBwProvisioner()
		 * @generated
		 */
		EDataType BW_PROVISIONER = eINSTANCE.getBwProvisioner();

		/**
		 * The meta object literal for the '<em>Pe Provisioner</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getPeProvisioner()
		 * @generated
		 */
		EDataType PE_PROVISIONER = eINSTANCE.getPeProvisioner();

		/**
		 * The meta object literal for the '<em>Cloudlet Scheduler</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getCloudletScheduler()
		 * @generated
		 */
		EDataType CLOUDLET_SCHEDULER = eINSTANCE.getCloudletScheduler();

		/**
		 * The meta object literal for the '<em>Vm Scheduler</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getVmScheduler()
		 * @generated
		 */
		EDataType VM_SCHEDULER = eINSTANCE.getVmScheduler();

		/**
		 * The meta object literal for the '<em>utilization Model</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.occiware.clouddesigner.occi.simulation.impl.SimulationPackageImpl#getutilizationModel()
		 * @generated
		 */
		EDataType UTILIZATION_MODEL = eINSTANCE.getutilizationModel();

	}

} //SimulationPackage
