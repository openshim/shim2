package org.multicore_association.shim.edit.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.Accessor;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.FunctionalUnitSet;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.MasterSlaveBinding;
import org.multicore_association.shim.model.shim.PowerConfiguration;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SlaveComponent;
import org.multicore_association.shim.model.shim.SubSpace;
import org.multicore_association.shim10.model.shim10.DocumentRoot;

public class ShimConvertTo20Util {

	public ShimConvertTo20Util() {
		// TODO Auto-generated constructor stub
	}
	
	//	SystemConfiguration
	//		Å® AddressSpaceSet d
	//		Å® ComponentSet d
	//		Å® CommunicationSet d
	public static Shim convert(DocumentRoot root, Shim shim) {
		shim.setSystemConfiguration(SystemConfigurationConvertUtils.convert(
				root.getSystemConfiguration()));
		
		PowerConfiguration powerConfiguration = (PowerConfiguration) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getPowerConfiguration());
		shim.setPowerConfiguration(powerConfiguration);
		
		FunctionalUnitSet functionalUnitSet = (FunctionalUnitSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getFunctionalUnitSet());
		shim.setFunctionalUnitSet(functionalUnitSet);
				
		return shim;
	}

}
