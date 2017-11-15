/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.occiware.clouddesigner.occi.simulation/model/simulation.ecore
 * using:
 *   /org.occiware.clouddesigner.occi.simulation/model/simulation.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.occiware.clouddesigner.occi.simulation;

import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.cmf.occi.infrastructure.InfrastructureTables;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.occiware.clouddesigner.occi.simulation.SimulationTables;

/**
 * SimulationTables provides the dispatch tables for the simulation for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
@SuppressWarnings("nls")
public class SimulationTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SimulationPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/simulation/ecore", null, org.occiware.clouddesigner.occi.simulation.SimulationPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Cloudlet = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Cloudlet", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Computesim = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Computesim", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Datacenter = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Datacenter", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Harddrivestorage = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Harddrivestorage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Host = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Host", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Pricestrategies = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Pricestrategies", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Probadistrib = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Probadistrib", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Resource = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Resource", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Sanstorage = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Sanstorage", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Storagesim = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Storagesim", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Vm = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getClassId("Vm", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_BwProvisioner = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("BwProvisioner", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_CloudletScheduler = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("CloudletScheduler", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_PeProvisioner = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("PeProvisioner", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_RamProvisioner = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("RamProvisioner", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_VmScheduler = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("VmScheduler", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_double = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("double", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_long = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("long", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_utilizationModel = org.occiware.clouddesigner.occi.simulation.SimulationTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_simulation_s_ecore.getDataTypeId("utilizationModel", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Cloudlet_c_c_appliesConstraint = "Cloudlet::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Datacenter_c_c_appliesConstraint = "Datacenter::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Harddrivestorage_c_c_appliesConstraint = "Harddrivestorage::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Host_c_c_appliesConstraint = "Host::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Pricestrategies_c_c_appliesConstraint = "Pricestrategies::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Probadistrib_c_c_appliesConstraint = "Probadistrib::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Sanstorage_c_c_appliesConstraint = "Sanstorage::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Vm_c_c_appliesConstraint = "Vm::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SimulationTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Auction = new EcoreExecutorType(SimulationPackage.Literals.AUCTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Binomiale = new EcoreExecutorType(SimulationPackage.Literals.BINOMIALE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _BwProvisioner = new EcoreExecutorType("BwProvisioner", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Cloudlet = new EcoreExecutorType(SimulationPackage.Literals.CLOUDLET, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _CloudletScheduler = new EcoreExecutorType("CloudletScheduler", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Computesim = new EcoreExecutorType(SimulationPackage.Literals.COMPUTESIM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Datacenter = new EcoreExecutorType(SimulationPackage.Literals.DATACENTER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Gauss = new EcoreExecutorType(SimulationPackage.Literals.GAUSS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Harddrivestorage = new EcoreExecutorType(SimulationPackage.Literals.HARDDRIVESTORAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Host = new EcoreExecutorType(SimulationPackage.Literals.HOST, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Networksim = new EcoreExecutorType(SimulationPackage.Literals.NETWORKSIM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ondemand = new EcoreExecutorType(SimulationPackage.Literals.ONDEMAND, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _PeProvisioner = new EcoreExecutorType("PeProvisioner", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Poisson = new EcoreExecutorType(SimulationPackage.Literals.POISSON, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Pricestrategies = new EcoreExecutorType(SimulationPackage.Literals.PRICESTRATEGIES, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Probadistrib = new EcoreExecutorType(SimulationPackage.Literals.PROBADISTRIB, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _RamProvisioner = new EcoreExecutorType("RamProvisioner", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sanstorage = new EcoreExecutorType(SimulationPackage.Literals.SANSTORAGE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Storagesim = new EcoreExecutorType(SimulationPackage.Literals.STORAGESIM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Upfront = new EcoreExecutorType(SimulationPackage.Literals.UPFRONT, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Vm = new EcoreExecutorType(SimulationPackage.Literals.VM, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _VmScheduler = new EcoreExecutorType("VmScheduler", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _double = new EcoreExecutorType("double", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _long = new EcoreExecutorType("long", PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _utilizationModel = new EcoreExecutorType("utilizationModel", PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Auction,
			_Binomiale,
			_BwProvisioner,
			_Cloudlet,
			_CloudletScheduler,
			_Computesim,
			_Datacenter,
			_Gauss,
			_Harddrivestorage,
			_Host,
			_Networksim,
			_Ondemand,
			_PeProvisioner,
			_Poisson,
			_Pricestrategies,
			_Probadistrib,
			_RamProvisioner,
			_Sanstorage,
			_Storagesim,
			_Upfront,
			_Vm,
			_VmScheduler,
			_double,
			_long,
			_utilizationModel
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Auction__Auction = new ExecutorFragment(Types._Auction, SimulationTables.Types._Auction);
		private static final /*@NonNull*/ ExecutorFragment _Auction__MixinBase = new ExecutorFragment(Types._Auction, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Auction__OclAny = new ExecutorFragment(Types._Auction, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Auction__OclElement = new ExecutorFragment(Types._Auction, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Auction__Pricestrategies = new ExecutorFragment(Types._Auction, SimulationTables.Types._Pricestrategies);

		private static final /*@NonNull*/ ExecutorFragment _Binomiale__Binomiale = new ExecutorFragment(Types._Binomiale, SimulationTables.Types._Binomiale);
		private static final /*@NonNull*/ ExecutorFragment _Binomiale__MixinBase = new ExecutorFragment(Types._Binomiale, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Binomiale__OclAny = new ExecutorFragment(Types._Binomiale, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Binomiale__OclElement = new ExecutorFragment(Types._Binomiale, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Binomiale__Probadistrib = new ExecutorFragment(Types._Binomiale, SimulationTables.Types._Probadistrib);

		private static final /*@NonNull*/ ExecutorFragment _BwProvisioner__BwProvisioner = new ExecutorFragment(Types._BwProvisioner, SimulationTables.Types._BwProvisioner);
		private static final /*@NonNull*/ ExecutorFragment _BwProvisioner__OclAny = new ExecutorFragment(Types._BwProvisioner, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__Cloudlet = new ExecutorFragment(Types._Cloudlet, SimulationTables.Types._Cloudlet);
		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__MixinBase = new ExecutorFragment(Types._Cloudlet, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__OclAny = new ExecutorFragment(Types._Cloudlet, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Cloudlet__OclElement = new ExecutorFragment(Types._Cloudlet, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _CloudletScheduler__CloudletScheduler = new ExecutorFragment(Types._CloudletScheduler, SimulationTables.Types._CloudletScheduler);
		private static final /*@NonNull*/ ExecutorFragment _CloudletScheduler__OclAny = new ExecutorFragment(Types._CloudletScheduler, OCLstdlibTables.Types._OclAny);

		private static final /*@NonNull*/ ExecutorFragment _Computesim__Compute = new ExecutorFragment(Types._Computesim, InfrastructureTables.Types._Compute);
		private static final /*@NonNull*/ ExecutorFragment _Computesim__Computesim = new ExecutorFragment(Types._Computesim, SimulationTables.Types._Computesim);
		private static final /*@NonNull*/ ExecutorFragment _Computesim__Entity = new ExecutorFragment(Types._Computesim, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Computesim__OclAny = new ExecutorFragment(Types._Computesim, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Computesim__OclElement = new ExecutorFragment(Types._Computesim, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Computesim__Resource = new ExecutorFragment(Types._Computesim, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Datacenter__Datacenter = new ExecutorFragment(Types._Datacenter, SimulationTables.Types._Datacenter);
		private static final /*@NonNull*/ ExecutorFragment _Datacenter__MixinBase = new ExecutorFragment(Types._Datacenter, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Datacenter__OclAny = new ExecutorFragment(Types._Datacenter, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Datacenter__OclElement = new ExecutorFragment(Types._Datacenter, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Gauss__Gauss = new ExecutorFragment(Types._Gauss, SimulationTables.Types._Gauss);
		private static final /*@NonNull*/ ExecutorFragment _Gauss__MixinBase = new ExecutorFragment(Types._Gauss, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Gauss__OclAny = new ExecutorFragment(Types._Gauss, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Gauss__OclElement = new ExecutorFragment(Types._Gauss, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Gauss__Probadistrib = new ExecutorFragment(Types._Gauss, SimulationTables.Types._Probadistrib);

		private static final /*@NonNull*/ ExecutorFragment _Harddrivestorage__Harddrivestorage = new ExecutorFragment(Types._Harddrivestorage, SimulationTables.Types._Harddrivestorage);
		private static final /*@NonNull*/ ExecutorFragment _Harddrivestorage__MixinBase = new ExecutorFragment(Types._Harddrivestorage, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Harddrivestorage__OclAny = new ExecutorFragment(Types._Harddrivestorage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Harddrivestorage__OclElement = new ExecutorFragment(Types._Harddrivestorage, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Host__Host = new ExecutorFragment(Types._Host, SimulationTables.Types._Host);
		private static final /*@NonNull*/ ExecutorFragment _Host__MixinBase = new ExecutorFragment(Types._Host, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Host__OclAny = new ExecutorFragment(Types._Host, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Host__OclElement = new ExecutorFragment(Types._Host, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Networksim__Entity = new ExecutorFragment(Types._Networksim, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Networksim__Network = new ExecutorFragment(Types._Networksim, InfrastructureTables.Types._Network);
		private static final /*@NonNull*/ ExecutorFragment _Networksim__Networksim = new ExecutorFragment(Types._Networksim, SimulationTables.Types._Networksim);
		private static final /*@NonNull*/ ExecutorFragment _Networksim__OclAny = new ExecutorFragment(Types._Networksim, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Networksim__OclElement = new ExecutorFragment(Types._Networksim, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Networksim__Resource = new ExecutorFragment(Types._Networksim, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Ondemand__MixinBase = new ExecutorFragment(Types._Ondemand, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ondemand__OclAny = new ExecutorFragment(Types._Ondemand, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ondemand__OclElement = new ExecutorFragment(Types._Ondemand, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ondemand__Ondemand = new ExecutorFragment(Types._Ondemand, SimulationTables.Types._Ondemand);
		private static final /*@NonNull*/ ExecutorFragment _Ondemand__Pricestrategies = new ExecutorFragment(Types._Ondemand, SimulationTables.Types._Pricestrategies);

		private static final /*@NonNull*/ ExecutorFragment _PeProvisioner__OclAny = new ExecutorFragment(Types._PeProvisioner, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _PeProvisioner__PeProvisioner = new ExecutorFragment(Types._PeProvisioner, SimulationTables.Types._PeProvisioner);

		private static final /*@NonNull*/ ExecutorFragment _Poisson__MixinBase = new ExecutorFragment(Types._Poisson, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Poisson__OclAny = new ExecutorFragment(Types._Poisson, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Poisson__OclElement = new ExecutorFragment(Types._Poisson, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Poisson__Poisson = new ExecutorFragment(Types._Poisson, SimulationTables.Types._Poisson);
		private static final /*@NonNull*/ ExecutorFragment _Poisson__Probadistrib = new ExecutorFragment(Types._Poisson, SimulationTables.Types._Probadistrib);

		private static final /*@NonNull*/ ExecutorFragment _Pricestrategies__MixinBase = new ExecutorFragment(Types._Pricestrategies, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Pricestrategies__OclAny = new ExecutorFragment(Types._Pricestrategies, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Pricestrategies__OclElement = new ExecutorFragment(Types._Pricestrategies, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Pricestrategies__Pricestrategies = new ExecutorFragment(Types._Pricestrategies, SimulationTables.Types._Pricestrategies);

		private static final /*@NonNull*/ ExecutorFragment _Probadistrib__MixinBase = new ExecutorFragment(Types._Probadistrib, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Probadistrib__OclAny = new ExecutorFragment(Types._Probadistrib, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Probadistrib__OclElement = new ExecutorFragment(Types._Probadistrib, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Probadistrib__Probadistrib = new ExecutorFragment(Types._Probadistrib, SimulationTables.Types._Probadistrib);

		private static final /*@NonNull*/ ExecutorFragment _RamProvisioner__OclAny = new ExecutorFragment(Types._RamProvisioner, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _RamProvisioner__RamProvisioner = new ExecutorFragment(Types._RamProvisioner, SimulationTables.Types._RamProvisioner);

		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__MixinBase = new ExecutorFragment(Types._Sanstorage, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__OclAny = new ExecutorFragment(Types._Sanstorage, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__OclElement = new ExecutorFragment(Types._Sanstorage, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sanstorage__Sanstorage = new ExecutorFragment(Types._Sanstorage, SimulationTables.Types._Sanstorage);

		private static final /*@NonNull*/ ExecutorFragment _Storagesim__Entity = new ExecutorFragment(Types._Storagesim, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Storagesim__OclAny = new ExecutorFragment(Types._Storagesim, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Storagesim__OclElement = new ExecutorFragment(Types._Storagesim, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Storagesim__Resource = new ExecutorFragment(Types._Storagesim, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Storagesim__Storage = new ExecutorFragment(Types._Storagesim, InfrastructureTables.Types._Storage);
		private static final /*@NonNull*/ ExecutorFragment _Storagesim__Storagesim = new ExecutorFragment(Types._Storagesim, SimulationTables.Types._Storagesim);

		private static final /*@NonNull*/ ExecutorFragment _Upfront__MixinBase = new ExecutorFragment(Types._Upfront, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Upfront__OclAny = new ExecutorFragment(Types._Upfront, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Upfront__OclElement = new ExecutorFragment(Types._Upfront, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Upfront__Pricestrategies = new ExecutorFragment(Types._Upfront, SimulationTables.Types._Pricestrategies);
		private static final /*@NonNull*/ ExecutorFragment _Upfront__Upfront = new ExecutorFragment(Types._Upfront, SimulationTables.Types._Upfront);

		private static final /*@NonNull*/ ExecutorFragment _Vm__MixinBase = new ExecutorFragment(Types._Vm, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Vm__OclAny = new ExecutorFragment(Types._Vm, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Vm__OclElement = new ExecutorFragment(Types._Vm, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Vm__Vm = new ExecutorFragment(Types._Vm, SimulationTables.Types._Vm);

		private static final /*@NonNull*/ ExecutorFragment _VmScheduler__OclAny = new ExecutorFragment(Types._VmScheduler, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _VmScheduler__VmScheduler = new ExecutorFragment(Types._VmScheduler, SimulationTables.Types._VmScheduler);

		private static final /*@NonNull*/ ExecutorFragment _double__OclAny = new ExecutorFragment(Types._double, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _double__double = new ExecutorFragment(Types._double, SimulationTables.Types._double);

		private static final /*@NonNull*/ ExecutorFragment _long__OclAny = new ExecutorFragment(Types._long, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _long__long = new ExecutorFragment(Types._long, SimulationTables.Types._long);

		private static final /*@NonNull*/ ExecutorFragment _utilizationModel__OclAny = new ExecutorFragment(Types._utilizationModel, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _utilizationModel__utilizationModel = new ExecutorFragment(Types._utilizationModel, SimulationTables.Types._utilizationModel);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}


		public static final /*@NonNull*/ ExecutorProperty _Binomiale__chance = new EcoreExecutorProperty(SimulationPackage.Literals.BINOMIALE__CHANCE, Types._Binomiale, 0);
		public static final /*@NonNull*/ ExecutorProperty _Binomiale__numCorrect = new EcoreExecutorProperty(SimulationPackage.Literals.BINOMIALE__NUM_CORRECT, Types._Binomiale, 1);
		public static final /*@NonNull*/ ExecutorProperty _Binomiale__numTrials = new EcoreExecutorProperty(SimulationPackage.Literals.BINOMIALE__NUM_TRIALS, Types._Binomiale, 2);

		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletFileSize = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_FILE_SIZE, Types._Cloudlet, 0);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletId = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_ID, Types._Cloudlet, 1);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletLength = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_LENGTH, Types._Cloudlet, 2);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cloudletOutputSize = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CLOUDLET_OUTPUT_SIZE, Types._Cloudlet, 3);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__cores = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__CORES, Types._Cloudlet, 4);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__utilizationModelBw = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__UTILIZATION_MODEL_BW, Types._Cloudlet, 5);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__utilizationModelCpu = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__UTILIZATION_MODEL_CPU, Types._Cloudlet, 6);
		public static final /*@NonNull*/ ExecutorProperty _Cloudlet__utilizationModelRam = new EcoreExecutorProperty(SimulationPackage.Literals.CLOUDLET__UTILIZATION_MODEL_RAM, Types._Cloudlet, 7);

		public static final /*@NonNull*/ ExecutorProperty _Datacenter__cost = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__COST, Types._Datacenter, 0);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__costPerBw = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__COST_PER_BW, Types._Datacenter, 1);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__costPerMem = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__COST_PER_MEM, Types._Datacenter, 2);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__costPerStorage = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__COST_PER_STORAGE, Types._Datacenter, 3);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__location = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__LOCATION, Types._Datacenter, 4);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__name = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__NAME, Types._Datacenter, 5);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__os = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__OS, Types._Datacenter, 6);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__schedulingInterval = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__SCHEDULING_INTERVAL, Types._Datacenter, 7);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__timezone = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__TIMEZONE, Types._Datacenter, 8);
		public static final /*@NonNull*/ ExecutorProperty _Datacenter__vmm = new EcoreExecutorProperty(SimulationPackage.Literals.DATACENTER__VMM, Types._Datacenter, 9);

		public static final /*@NonNull*/ ExecutorProperty _Gauss__P = new EcoreExecutorProperty(SimulationPackage.Literals.GAUSS__P, Types._Gauss, 0);
		public static final /*@NonNull*/ ExecutorProperty _Gauss__n = new EcoreExecutorProperty(SimulationPackage.Literals.GAUSS__N, Types._Gauss, 1);
		public static final /*@NonNull*/ ExecutorProperty _Gauss__x = new EcoreExecutorProperty(SimulationPackage.Literals.GAUSS__X, Types._Gauss, 2);

		public static final /*@NonNull*/ ExecutorProperty _Host__bw = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__BW, Types._Host, 0);
		public static final /*@NonNull*/ ExecutorProperty _Host__bwProvisioner = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__BW_PROVISIONER, Types._Host, 1);
		public static final /*@NonNull*/ ExecutorProperty _Host__cores = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__CORES, Types._Host, 2);
		public static final /*@NonNull*/ ExecutorProperty _Host__elasticHost = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__ELASTIC_HOST, Types._Host, 3);
		public static final /*@NonNull*/ ExecutorProperty _Host__idHost = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__ID_HOST, Types._Host, 4);
		public static final /*@NonNull*/ ExecutorProperty _Host__mips = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__MIPS, Types._Host, 5);
		public static final /*@NonNull*/ ExecutorProperty _Host__mipsMaxHost = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__MIPS_MAX_HOST, Types._Host, 6);
		public static final /*@NonNull*/ ExecutorProperty _Host__peProvisioner = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__PE_PROVISIONER, Types._Host, 7);
		public static final /*@NonNull*/ ExecutorProperty _Host__ram = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__RAM, Types._Host, 8);
		public static final /*@NonNull*/ ExecutorProperty _Host__ramMaxHost = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__RAM_MAX_HOST, Types._Host, 9);
		public static final /*@NonNull*/ ExecutorProperty _Host__ramMinHost = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__RAM_MIN_HOST, Types._Host, 10);
		public static final /*@NonNull*/ ExecutorProperty _Host__ramProvisioner = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__RAM_PROVISIONER, Types._Host, 11);
		public static final /*@NonNull*/ ExecutorProperty _Host__storage = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__STORAGE, Types._Host, 12);
		public static final /*@NonNull*/ ExecutorProperty _Host__vmScheduler = new EcoreExecutorProperty(SimulationPackage.Literals.HOST__VM_SCHEDULER, Types._Host, 13);

		public static final /*@NonNull*/ ExecutorProperty _Poisson__u = new EcoreExecutorProperty(SimulationPackage.Literals.POISSON__U, Types._Poisson, 0);
		public static final /*@NonNull*/ ExecutorProperty _Poisson__x = new EcoreExecutorProperty(SimulationPackage.Literals.POISSON__X, Types._Poisson, 1);

		public static final /*@NonNull*/ ExecutorProperty _Sanstorage__bandwidth = new EcoreExecutorProperty(SimulationPackage.Literals.SANSTORAGE__BANDWIDTH, Types._Sanstorage, 0);
		public static final /*@NonNull*/ ExecutorProperty _Sanstorage__networkLatency = new EcoreExecutorProperty(SimulationPackage.Literals.SANSTORAGE__NETWORK_LATENCY, Types._Sanstorage, 1);

		public static final /*@NonNull*/ ExecutorProperty _Vm__bw = new EcoreExecutorProperty(SimulationPackage.Literals.VM__BW, Types._Vm, 0);
		public static final /*@NonNull*/ ExecutorProperty _Vm__cloudletScheduler = new EcoreExecutorProperty(SimulationPackage.Literals.VM__CLOUDLET_SCHEDULER, Types._Vm, 1);
		public static final /*@NonNull*/ ExecutorProperty _Vm__cores = new EcoreExecutorProperty(SimulationPackage.Literals.VM__CORES, Types._Vm, 2);
		public static final /*@NonNull*/ ExecutorProperty _Vm__dti = new EcoreExecutorProperty(SimulationPackage.Literals.VM__DTI, Types._Vm, 3);
		public static final /*@NonNull*/ ExecutorProperty _Vm__dto = new EcoreExecutorProperty(SimulationPackage.Literals.VM__DTO, Types._Vm, 4);
		public static final /*@NonNull*/ ExecutorProperty _Vm__elasticVm = new EcoreExecutorProperty(SimulationPackage.Literals.VM__ELASTIC_VM, Types._Vm, 5);
		public static final /*@NonNull*/ ExecutorProperty _Vm__idvm = new EcoreExecutorProperty(SimulationPackage.Literals.VM__IDVM, Types._Vm, 6);
		public static final /*@NonNull*/ ExecutorProperty _Vm__irdt = new EcoreExecutorProperty(SimulationPackage.Literals.VM__IRDT, Types._Vm, 7);
		public static final /*@NonNull*/ ExecutorProperty _Vm__irdto = new EcoreExecutorProperty(SimulationPackage.Literals.VM__IRDTO, Types._Vm, 8);
		public static final /*@NonNull*/ ExecutorProperty _Vm__mips = new EcoreExecutorProperty(SimulationPackage.Literals.VM__MIPS, Types._Vm, 9);
		public static final /*@NonNull*/ ExecutorProperty _Vm__os = new EcoreExecutorProperty(SimulationPackage.Literals.VM__OS, Types._Vm, 10);
		public static final /*@NonNull*/ ExecutorProperty _Vm__ram = new EcoreExecutorProperty(SimulationPackage.Literals.VM__RAM, Types._Vm, 11);
		public static final /*@NonNull*/ ExecutorProperty _Vm__ramMaxVm = new EcoreExecutorProperty(SimulationPackage.Literals.VM__RAM_MAX_VM, Types._Vm, 12);
		public static final /*@NonNull*/ ExecutorProperty _Vm__ramMinVm = new EcoreExecutorProperty(SimulationPackage.Literals.VM__RAM_MIN_VM, Types._Vm, 13);
		public static final /*@NonNull*/ ExecutorProperty _Vm__size = new EcoreExecutorProperty(SimulationPackage.Literals.VM__SIZE, Types._Vm, 14);
		public static final /*@NonNull*/ ExecutorProperty _Vm__vmm = new EcoreExecutorProperty(SimulationPackage.Literals.VM__VMM, Types._Vm, 15);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Auction =
		{
			Fragments._Auction__OclAny /* 0 */,
			Fragments._Auction__OclElement /* 1 */,
			Fragments._Auction__MixinBase /* 2 */,
			Fragments._Auction__Pricestrategies /* 3 */,
			Fragments._Auction__Auction /* 4 */
		};
		private static final int /*@NonNull*/ [] __Auction = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Binomiale =
		{
			Fragments._Binomiale__OclAny /* 0 */,
			Fragments._Binomiale__OclElement /* 1 */,
			Fragments._Binomiale__MixinBase /* 2 */,
			Fragments._Binomiale__Probadistrib /* 3 */,
			Fragments._Binomiale__Binomiale /* 4 */
		};
		private static final int /*@NonNull*/ [] __Binomiale = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _BwProvisioner =
		{
			Fragments._BwProvisioner__OclAny /* 0 */,
			Fragments._BwProvisioner__BwProvisioner /* 1 */
		};
		private static final int /*@NonNull*/ [] __BwProvisioner = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Cloudlet =
		{
			Fragments._Cloudlet__OclAny /* 0 */,
			Fragments._Cloudlet__OclElement /* 1 */,
			Fragments._Cloudlet__MixinBase /* 2 */,
			Fragments._Cloudlet__Cloudlet /* 3 */
		};
		private static final int /*@NonNull*/ [] __Cloudlet = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _CloudletScheduler =
		{
			Fragments._CloudletScheduler__OclAny /* 0 */,
			Fragments._CloudletScheduler__CloudletScheduler /* 1 */
		};
		private static final int /*@NonNull*/ [] __CloudletScheduler = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Computesim =
		{
			Fragments._Computesim__OclAny /* 0 */,
			Fragments._Computesim__OclElement /* 1 */,
			Fragments._Computesim__Entity /* 2 */,
			Fragments._Computesim__Resource /* 3 */,
			Fragments._Computesim__Compute /* 4 */,
			Fragments._Computesim__Computesim /* 5 */
		};
		private static final int /*@NonNull*/ [] __Computesim = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Datacenter =
		{
			Fragments._Datacenter__OclAny /* 0 */,
			Fragments._Datacenter__OclElement /* 1 */,
			Fragments._Datacenter__MixinBase /* 2 */,
			Fragments._Datacenter__Datacenter /* 3 */
		};
		private static final int /*@NonNull*/ [] __Datacenter = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Gauss =
		{
			Fragments._Gauss__OclAny /* 0 */,
			Fragments._Gauss__OclElement /* 1 */,
			Fragments._Gauss__MixinBase /* 2 */,
			Fragments._Gauss__Probadistrib /* 3 */,
			Fragments._Gauss__Gauss /* 4 */
		};
		private static final int /*@NonNull*/ [] __Gauss = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Harddrivestorage =
		{
			Fragments._Harddrivestorage__OclAny /* 0 */,
			Fragments._Harddrivestorage__OclElement /* 1 */,
			Fragments._Harddrivestorage__MixinBase /* 2 */,
			Fragments._Harddrivestorage__Harddrivestorage /* 3 */
		};
		private static final int /*@NonNull*/ [] __Harddrivestorage = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Host =
		{
			Fragments._Host__OclAny /* 0 */,
			Fragments._Host__OclElement /* 1 */,
			Fragments._Host__MixinBase /* 2 */,
			Fragments._Host__Host /* 3 */
		};
		private static final int /*@NonNull*/ [] __Host = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Networksim =
		{
			Fragments._Networksim__OclAny /* 0 */,
			Fragments._Networksim__OclElement /* 1 */,
			Fragments._Networksim__Entity /* 2 */,
			Fragments._Networksim__Resource /* 3 */,
			Fragments._Networksim__Network /* 4 */,
			Fragments._Networksim__Networksim /* 5 */
		};
		private static final int /*@NonNull*/ [] __Networksim = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ondemand =
		{
			Fragments._Ondemand__OclAny /* 0 */,
			Fragments._Ondemand__OclElement /* 1 */,
			Fragments._Ondemand__MixinBase /* 2 */,
			Fragments._Ondemand__Pricestrategies /* 3 */,
			Fragments._Ondemand__Ondemand /* 4 */
		};
		private static final int /*@NonNull*/ [] __Ondemand = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _PeProvisioner =
		{
			Fragments._PeProvisioner__OclAny /* 0 */,
			Fragments._PeProvisioner__PeProvisioner /* 1 */
		};
		private static final int /*@NonNull*/ [] __PeProvisioner = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Poisson =
		{
			Fragments._Poisson__OclAny /* 0 */,
			Fragments._Poisson__OclElement /* 1 */,
			Fragments._Poisson__MixinBase /* 2 */,
			Fragments._Poisson__Probadistrib /* 3 */,
			Fragments._Poisson__Poisson /* 4 */
		};
		private static final int /*@NonNull*/ [] __Poisson = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Pricestrategies =
		{
			Fragments._Pricestrategies__OclAny /* 0 */,
			Fragments._Pricestrategies__OclElement /* 1 */,
			Fragments._Pricestrategies__MixinBase /* 2 */,
			Fragments._Pricestrategies__Pricestrategies /* 3 */
		};
		private static final int /*@NonNull*/ [] __Pricestrategies = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Probadistrib =
		{
			Fragments._Probadistrib__OclAny /* 0 */,
			Fragments._Probadistrib__OclElement /* 1 */,
			Fragments._Probadistrib__MixinBase /* 2 */,
			Fragments._Probadistrib__Probadistrib /* 3 */
		};
		private static final int /*@NonNull*/ [] __Probadistrib = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _RamProvisioner =
		{
			Fragments._RamProvisioner__OclAny /* 0 */,
			Fragments._RamProvisioner__RamProvisioner /* 1 */
		};
		private static final int /*@NonNull*/ [] __RamProvisioner = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sanstorage =
		{
			Fragments._Sanstorage__OclAny /* 0 */,
			Fragments._Sanstorage__OclElement /* 1 */,
			Fragments._Sanstorage__MixinBase /* 2 */,
			Fragments._Sanstorage__Sanstorage /* 3 */
		};
		private static final int /*@NonNull*/ [] __Sanstorage = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Storagesim =
		{
			Fragments._Storagesim__OclAny /* 0 */,
			Fragments._Storagesim__OclElement /* 1 */,
			Fragments._Storagesim__Entity /* 2 */,
			Fragments._Storagesim__Resource /* 3 */,
			Fragments._Storagesim__Storage /* 4 */,
			Fragments._Storagesim__Storagesim /* 5 */
		};
		private static final int /*@NonNull*/ [] __Storagesim = { 1,1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Upfront =
		{
			Fragments._Upfront__OclAny /* 0 */,
			Fragments._Upfront__OclElement /* 1 */,
			Fragments._Upfront__MixinBase /* 2 */,
			Fragments._Upfront__Pricestrategies /* 3 */,
			Fragments._Upfront__Upfront /* 4 */
		};
		private static final int /*@NonNull*/ [] __Upfront = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Vm =
		{
			Fragments._Vm__OclAny /* 0 */,
			Fragments._Vm__OclElement /* 1 */,
			Fragments._Vm__MixinBase /* 2 */,
			Fragments._Vm__Vm /* 3 */
		};
		private static final int /*@NonNull*/ [] __Vm = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _VmScheduler =
		{
			Fragments._VmScheduler__OclAny /* 0 */,
			Fragments._VmScheduler__VmScheduler /* 1 */
		};
		private static final int /*@NonNull*/ [] __VmScheduler = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _double =
		{
			Fragments._double__OclAny /* 0 */,
			Fragments._double__double /* 1 */
		};
		private static final int /*@NonNull*/ [] __double = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _long =
		{
			Fragments._long__OclAny /* 0 */,
			Fragments._long__long /* 1 */
		};
		private static final int /*@NonNull*/ [] __long = { 1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _utilizationModel =
		{
			Fragments._utilizationModel__OclAny /* 0 */,
			Fragments._utilizationModel__utilizationModel /* 1 */
		};
		private static final int /*@NonNull*/ [] __utilizationModel = { 1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Auction.initFragments(_Auction, __Auction);
			Types._Binomiale.initFragments(_Binomiale, __Binomiale);
			Types._BwProvisioner.initFragments(_BwProvisioner, __BwProvisioner);
			Types._Cloudlet.initFragments(_Cloudlet, __Cloudlet);
			Types._CloudletScheduler.initFragments(_CloudletScheduler, __CloudletScheduler);
			Types._Computesim.initFragments(_Computesim, __Computesim);
			Types._Datacenter.initFragments(_Datacenter, __Datacenter);
			Types._Gauss.initFragments(_Gauss, __Gauss);
			Types._Harddrivestorage.initFragments(_Harddrivestorage, __Harddrivestorage);
			Types._Host.initFragments(_Host, __Host);
			Types._Networksim.initFragments(_Networksim, __Networksim);
			Types._Ondemand.initFragments(_Ondemand, __Ondemand);
			Types._PeProvisioner.initFragments(_PeProvisioner, __PeProvisioner);
			Types._Poisson.initFragments(_Poisson, __Poisson);
			Types._Pricestrategies.initFragments(_Pricestrategies, __Pricestrategies);
			Types._Probadistrib.initFragments(_Probadistrib, __Probadistrib);
			Types._RamProvisioner.initFragments(_RamProvisioner, __RamProvisioner);
			Types._Sanstorage.initFragments(_Sanstorage, __Sanstorage);
			Types._Storagesim.initFragments(_Storagesim, __Storagesim);
			Types._Upfront.initFragments(_Upfront, __Upfront);
			Types._Vm.initFragments(_Vm, __Vm);
			Types._VmScheduler.initFragments(_VmScheduler, __VmScheduler);
			Types._double.initFragments(_double, __double);
			Types._long.initFragments(_long, __long);
			Types._utilizationModel.initFragments(_utilizationModel, __utilizationModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Auction__Auction = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Auction__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Auction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Auction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Auction__Pricestrategies = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Binomiale__Binomiale = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Binomiale__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Binomiale__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Binomiale__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Binomiale__Probadistrib = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BwProvisioner__BwProvisioner = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _BwProvisioner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__Cloudlet = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Cloudlet__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CloudletScheduler__CloudletScheduler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _CloudletScheduler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computesim__Computesim = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computesim__Compute = {
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__restart /* restart(RestartMethod[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__save /* save(SaveMethod[?],String[?]) */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__start /* start() */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__stop /* stop(StopMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */,
			InfrastructureTables.Operations._Compute__suspend /* suspend(SuspendMethod[?]) */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computesim__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computesim__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computesim__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Computesim__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__Datacenter = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Datacenter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gauss__Gauss = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gauss__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gauss__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gauss__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gauss__Probadistrib = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrivestorage__Harddrivestorage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrivestorage__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrivestorage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Harddrivestorage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__Host = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Host__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networksim__Networksim = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networksim__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networksim__Network = {
			InfrastructureTables.Operations._Network__down /* down() */,
			InfrastructureTables.Operations._Network__down /* down() */,
			InfrastructureTables.Operations._Network__up /* up() */,
			InfrastructureTables.Operations._Network__up /* up() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networksim__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networksim__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Networksim__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__Ondemand = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ondemand__Pricestrategies = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PeProvisioner__PeProvisioner = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _PeProvisioner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Poisson__Poisson = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Poisson__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Poisson__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Poisson__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Poisson__Probadistrib = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Pricestrategies__Pricestrategies = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Pricestrategies__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Pricestrategies__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Pricestrategies__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Probadistrib__Probadistrib = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Probadistrib__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Probadistrib__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Probadistrib__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RamProvisioner__RamProvisioner = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _RamProvisioner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__Sanstorage = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sanstorage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagesim__Storagesim = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagesim__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagesim__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagesim__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagesim__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Storagesim__Storage = {
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__offline /* offline() */,
			InfrastructureTables.Operations._Storage__online /* online() */,
			InfrastructureTables.Operations._Storage__online /* online() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__Upfront = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Upfront__Pricestrategies = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__Vm = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Vm__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VmScheduler__VmScheduler = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _VmScheduler__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _double__double = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _double__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _long__long = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _long__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _utilizationModel__utilizationModel = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _utilizationModel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Auction__Auction.initOperations(_Auction__Auction);
			Fragments._Auction__MixinBase.initOperations(_Auction__MixinBase);
			Fragments._Auction__OclAny.initOperations(_Auction__OclAny);
			Fragments._Auction__OclElement.initOperations(_Auction__OclElement);
			Fragments._Auction__Pricestrategies.initOperations(_Auction__Pricestrategies);

			Fragments._Binomiale__Binomiale.initOperations(_Binomiale__Binomiale);
			Fragments._Binomiale__MixinBase.initOperations(_Binomiale__MixinBase);
			Fragments._Binomiale__OclAny.initOperations(_Binomiale__OclAny);
			Fragments._Binomiale__OclElement.initOperations(_Binomiale__OclElement);
			Fragments._Binomiale__Probadistrib.initOperations(_Binomiale__Probadistrib);

			Fragments._BwProvisioner__BwProvisioner.initOperations(_BwProvisioner__BwProvisioner);
			Fragments._BwProvisioner__OclAny.initOperations(_BwProvisioner__OclAny);

			Fragments._Cloudlet__Cloudlet.initOperations(_Cloudlet__Cloudlet);
			Fragments._Cloudlet__MixinBase.initOperations(_Cloudlet__MixinBase);
			Fragments._Cloudlet__OclAny.initOperations(_Cloudlet__OclAny);
			Fragments._Cloudlet__OclElement.initOperations(_Cloudlet__OclElement);

			Fragments._CloudletScheduler__CloudletScheduler.initOperations(_CloudletScheduler__CloudletScheduler);
			Fragments._CloudletScheduler__OclAny.initOperations(_CloudletScheduler__OclAny);

			Fragments._Computesim__Compute.initOperations(_Computesim__Compute);
			Fragments._Computesim__Computesim.initOperations(_Computesim__Computesim);
			Fragments._Computesim__Entity.initOperations(_Computesim__Entity);
			Fragments._Computesim__OclAny.initOperations(_Computesim__OclAny);
			Fragments._Computesim__OclElement.initOperations(_Computesim__OclElement);
			Fragments._Computesim__Resource.initOperations(_Computesim__Resource);

			Fragments._Datacenter__Datacenter.initOperations(_Datacenter__Datacenter);
			Fragments._Datacenter__MixinBase.initOperations(_Datacenter__MixinBase);
			Fragments._Datacenter__OclAny.initOperations(_Datacenter__OclAny);
			Fragments._Datacenter__OclElement.initOperations(_Datacenter__OclElement);

			Fragments._Gauss__Gauss.initOperations(_Gauss__Gauss);
			Fragments._Gauss__MixinBase.initOperations(_Gauss__MixinBase);
			Fragments._Gauss__OclAny.initOperations(_Gauss__OclAny);
			Fragments._Gauss__OclElement.initOperations(_Gauss__OclElement);
			Fragments._Gauss__Probadistrib.initOperations(_Gauss__Probadistrib);

			Fragments._Harddrivestorage__Harddrivestorage.initOperations(_Harddrivestorage__Harddrivestorage);
			Fragments._Harddrivestorage__MixinBase.initOperations(_Harddrivestorage__MixinBase);
			Fragments._Harddrivestorage__OclAny.initOperations(_Harddrivestorage__OclAny);
			Fragments._Harddrivestorage__OclElement.initOperations(_Harddrivestorage__OclElement);

			Fragments._Host__Host.initOperations(_Host__Host);
			Fragments._Host__MixinBase.initOperations(_Host__MixinBase);
			Fragments._Host__OclAny.initOperations(_Host__OclAny);
			Fragments._Host__OclElement.initOperations(_Host__OclElement);

			Fragments._Networksim__Entity.initOperations(_Networksim__Entity);
			Fragments._Networksim__Network.initOperations(_Networksim__Network);
			Fragments._Networksim__Networksim.initOperations(_Networksim__Networksim);
			Fragments._Networksim__OclAny.initOperations(_Networksim__OclAny);
			Fragments._Networksim__OclElement.initOperations(_Networksim__OclElement);
			Fragments._Networksim__Resource.initOperations(_Networksim__Resource);

			Fragments._Ondemand__MixinBase.initOperations(_Ondemand__MixinBase);
			Fragments._Ondemand__OclAny.initOperations(_Ondemand__OclAny);
			Fragments._Ondemand__OclElement.initOperations(_Ondemand__OclElement);
			Fragments._Ondemand__Ondemand.initOperations(_Ondemand__Ondemand);
			Fragments._Ondemand__Pricestrategies.initOperations(_Ondemand__Pricestrategies);

			Fragments._PeProvisioner__OclAny.initOperations(_PeProvisioner__OclAny);
			Fragments._PeProvisioner__PeProvisioner.initOperations(_PeProvisioner__PeProvisioner);

			Fragments._Poisson__MixinBase.initOperations(_Poisson__MixinBase);
			Fragments._Poisson__OclAny.initOperations(_Poisson__OclAny);
			Fragments._Poisson__OclElement.initOperations(_Poisson__OclElement);
			Fragments._Poisson__Poisson.initOperations(_Poisson__Poisson);
			Fragments._Poisson__Probadistrib.initOperations(_Poisson__Probadistrib);

			Fragments._Pricestrategies__MixinBase.initOperations(_Pricestrategies__MixinBase);
			Fragments._Pricestrategies__OclAny.initOperations(_Pricestrategies__OclAny);
			Fragments._Pricestrategies__OclElement.initOperations(_Pricestrategies__OclElement);
			Fragments._Pricestrategies__Pricestrategies.initOperations(_Pricestrategies__Pricestrategies);

			Fragments._Probadistrib__MixinBase.initOperations(_Probadistrib__MixinBase);
			Fragments._Probadistrib__OclAny.initOperations(_Probadistrib__OclAny);
			Fragments._Probadistrib__OclElement.initOperations(_Probadistrib__OclElement);
			Fragments._Probadistrib__Probadistrib.initOperations(_Probadistrib__Probadistrib);

			Fragments._RamProvisioner__OclAny.initOperations(_RamProvisioner__OclAny);
			Fragments._RamProvisioner__RamProvisioner.initOperations(_RamProvisioner__RamProvisioner);

			Fragments._Sanstorage__MixinBase.initOperations(_Sanstorage__MixinBase);
			Fragments._Sanstorage__OclAny.initOperations(_Sanstorage__OclAny);
			Fragments._Sanstorage__OclElement.initOperations(_Sanstorage__OclElement);
			Fragments._Sanstorage__Sanstorage.initOperations(_Sanstorage__Sanstorage);

			Fragments._Storagesim__Entity.initOperations(_Storagesim__Entity);
			Fragments._Storagesim__OclAny.initOperations(_Storagesim__OclAny);
			Fragments._Storagesim__OclElement.initOperations(_Storagesim__OclElement);
			Fragments._Storagesim__Resource.initOperations(_Storagesim__Resource);
			Fragments._Storagesim__Storage.initOperations(_Storagesim__Storage);
			Fragments._Storagesim__Storagesim.initOperations(_Storagesim__Storagesim);

			Fragments._Upfront__MixinBase.initOperations(_Upfront__MixinBase);
			Fragments._Upfront__OclAny.initOperations(_Upfront__OclAny);
			Fragments._Upfront__OclElement.initOperations(_Upfront__OclElement);
			Fragments._Upfront__Pricestrategies.initOperations(_Upfront__Pricestrategies);
			Fragments._Upfront__Upfront.initOperations(_Upfront__Upfront);

			Fragments._Vm__MixinBase.initOperations(_Vm__MixinBase);
			Fragments._Vm__OclAny.initOperations(_Vm__OclAny);
			Fragments._Vm__OclElement.initOperations(_Vm__OclElement);
			Fragments._Vm__Vm.initOperations(_Vm__Vm);

			Fragments._VmScheduler__OclAny.initOperations(_VmScheduler__OclAny);
			Fragments._VmScheduler__VmScheduler.initOperations(_VmScheduler__VmScheduler);

			Fragments._double__OclAny.initOperations(_double__OclAny);
			Fragments._double__double.initOperations(_double__double);

			Fragments._long__OclAny.initOperations(_long__OclAny);
			Fragments._long__long.initOperations(_long__long);

			Fragments._utilizationModel__OclAny.initOperations(_utilizationModel__OclAny);
			Fragments._utilizationModel__utilizationModel.initOperations(_utilizationModel__utilizationModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Auction = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Binomiale = {
			SimulationTables.Properties._Binomiale__chance,
			SimulationTables.Properties._Binomiale__numCorrect,
			SimulationTables.Properties._Binomiale__numTrials
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _BwProvisioner = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Cloudlet = {
			SimulationTables.Properties._Cloudlet__cloudletFileSize,
			SimulationTables.Properties._Cloudlet__cloudletId,
			SimulationTables.Properties._Cloudlet__cloudletLength,
			SimulationTables.Properties._Cloudlet__cloudletOutputSize,
			SimulationTables.Properties._Cloudlet__cores,
			SimulationTables.Properties._Cloudlet__utilizationModelBw,
			SimulationTables.Properties._Cloudlet__utilizationModelCpu,
			SimulationTables.Properties._Cloudlet__utilizationModelRam
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _CloudletScheduler = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Computesim = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Datacenter = {
			SimulationTables.Properties._Datacenter__cost,
			SimulationTables.Properties._Datacenter__costPerBw,
			SimulationTables.Properties._Datacenter__costPerMem,
			SimulationTables.Properties._Datacenter__costPerStorage,
			SimulationTables.Properties._Datacenter__location,
			SimulationTables.Properties._Datacenter__name,
			SimulationTables.Properties._Datacenter__os,
			SimulationTables.Properties._Datacenter__schedulingInterval,
			SimulationTables.Properties._Datacenter__timezone,
			SimulationTables.Properties._Datacenter__vmm
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Gauss = {
			SimulationTables.Properties._Gauss__P,
			SimulationTables.Properties._Gauss__n,
			SimulationTables.Properties._Gauss__x
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Harddrivestorage = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Host = {
			SimulationTables.Properties._Host__bw,
			SimulationTables.Properties._Host__bwProvisioner,
			SimulationTables.Properties._Host__cores,
			SimulationTables.Properties._Host__elasticHost,
			SimulationTables.Properties._Host__idHost,
			SimulationTables.Properties._Host__mips,
			SimulationTables.Properties._Host__mipsMaxHost,
			SimulationTables.Properties._Host__peProvisioner,
			SimulationTables.Properties._Host__ram,
			SimulationTables.Properties._Host__ramMaxHost,
			SimulationTables.Properties._Host__ramMinHost,
			SimulationTables.Properties._Host__ramProvisioner,
			SimulationTables.Properties._Host__storage,
			SimulationTables.Properties._Host__vmScheduler
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Networksim = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ondemand = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _PeProvisioner = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Poisson = {
			SimulationTables.Properties._Poisson__u,
			SimulationTables.Properties._Poisson__x
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Pricestrategies = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Probadistrib = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _RamProvisioner = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sanstorage = {
			SimulationTables.Properties._Sanstorage__bandwidth,
			SimulationTables.Properties._Sanstorage__networkLatency
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Storagesim = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Upfront = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Vm = {
			SimulationTables.Properties._Vm__bw,
			SimulationTables.Properties._Vm__cloudletScheduler,
			SimulationTables.Properties._Vm__cores,
			SimulationTables.Properties._Vm__dti,
			SimulationTables.Properties._Vm__dto,
			SimulationTables.Properties._Vm__elasticVm,
			SimulationTables.Properties._Vm__idvm,
			SimulationTables.Properties._Vm__irdt,
			SimulationTables.Properties._Vm__irdto,
			SimulationTables.Properties._Vm__mips,
			SimulationTables.Properties._Vm__os,
			SimulationTables.Properties._Vm__ram,
			SimulationTables.Properties._Vm__ramMaxVm,
			SimulationTables.Properties._Vm__ramMinVm,
			SimulationTables.Properties._Vm__size,
			SimulationTables.Properties._Vm__vmm
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _VmScheduler = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _double = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _long = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _utilizationModel = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Auction__Auction.initProperties(_Auction);
			Fragments._Binomiale__Binomiale.initProperties(_Binomiale);
			Fragments._BwProvisioner__BwProvisioner.initProperties(_BwProvisioner);
			Fragments._Cloudlet__Cloudlet.initProperties(_Cloudlet);
			Fragments._CloudletScheduler__CloudletScheduler.initProperties(_CloudletScheduler);
			Fragments._Computesim__Computesim.initProperties(_Computesim);
			Fragments._Datacenter__Datacenter.initProperties(_Datacenter);
			Fragments._Gauss__Gauss.initProperties(_Gauss);
			Fragments._Harddrivestorage__Harddrivestorage.initProperties(_Harddrivestorage);
			Fragments._Host__Host.initProperties(_Host);
			Fragments._Networksim__Networksim.initProperties(_Networksim);
			Fragments._Ondemand__Ondemand.initProperties(_Ondemand);
			Fragments._PeProvisioner__PeProvisioner.initProperties(_PeProvisioner);
			Fragments._Poisson__Poisson.initProperties(_Poisson);
			Fragments._Pricestrategies__Pricestrategies.initProperties(_Pricestrategies);
			Fragments._Probadistrib__Probadistrib.initProperties(_Probadistrib);
			Fragments._RamProvisioner__RamProvisioner.initProperties(_RamProvisioner);
			Fragments._Sanstorage__Sanstorage.initProperties(_Sanstorage);
			Fragments._Storagesim__Storagesim.initProperties(_Storagesim);
			Fragments._Upfront__Upfront.initProperties(_Upfront);
			Fragments._Vm__Vm.initProperties(_Vm);
			Fragments._VmScheduler__VmScheduler.initProperties(_VmScheduler);
			Fragments._double__double.initProperties(_double);
			Fragments._long__long.initProperties(_long);
			Fragments._utilizationModel__utilizationModel.initProperties(_utilizationModel);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SimulationTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
