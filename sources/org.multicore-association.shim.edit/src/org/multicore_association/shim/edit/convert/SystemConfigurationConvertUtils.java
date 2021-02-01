package org.multicore_association.shim.edit.convert;

import java.util.ArrayList;
import java.util.List;

import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.AddressSpaceSet;
import org.multicore_association.shim.model.shim.CommunicationSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.ContentionGroupSet;
import org.multicore_association.shim.model.shim.FrequencyVoltageSet;
import org.multicore_association.shim.model.shim.OperatingPoint;
import org.multicore_association.shim.model.shim.OperatingPointSet;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SystemConfiguration;

public class SystemConfigurationConvertUtils {
	
	private SystemConfigurationConvertUtils() {
	}

	//	SystemConfiguration
	//		Å® AddressSpaceSet
	//		Å® ComponentSet
	//		Å® CommunicationSet
	public static SystemConfiguration convert(
			org.multicore_association.shim10.model.shim10.SystemConfiguration systemConfiguration10) {
		SystemConfiguration systemConfiguration20 = (SystemConfiguration) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getSystemConfiguration());
		
		FrequencyVoltageSet frequencyVoltageSet = convertFrequencyVoltageSet(systemConfiguration10);
		systemConfiguration20.setFrequencyVoltageSet(frequencyVoltageSet);
		
		ComponentSet componentSet = ComponentSetConvertUtils.convert(
				systemConfiguration10.getComponentSet(), frequencyVoltageSet);
		Float value = systemConfiguration10.getClockFrequency().getClockValue();
		List<OperatingPointSet> opsList = frequencyVoltageSet.getOperatingPointSet();
		List<OperatingPoint> opList = opsList.get(1).getOperatingPoint();
		for (OperatingPoint op : opList) {
			if (Math.round(value) == op.getFrequency()) {
				componentSet.setOperatingPointRef(opsList.get(1));
			}
		}
		
		AddressSpaceSet addressSpaceSet = AddressSpaceSetConvertUtils.convert(
				systemConfiguration10.getAddressSpaceSet(), componentSet);
		CommunicationSet communicationSet = CommunicationSetConvertUtils.convert(
				systemConfiguration10.getCommunicationSet(), addressSpaceSet, componentSet);
		
		systemConfiguration20.setComponentSet(componentSet);
		systemConfiguration20.setAddressSpaceSet(addressSpaceSet);
		systemConfiguration20.setCommunicationSet(communicationSet);
		
		ContentionGroupSet contentionGroupSet = (ContentionGroupSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getContentionGroupSet());
		systemConfiguration20.setContentionGroupSet(contentionGroupSet);
		
		return systemConfiguration20;
	}
	
	
	private static FrequencyVoltageSet convertFrequencyVoltageSet(
			org.multicore_association.shim10.model.shim10.SystemConfiguration systemConfiguration) {
		FrequencyVoltageSet frequencyVoltageSet = (FrequencyVoltageSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getFrequencyVoltageSet());
		
		List<OperatingPointSet> opsList = frequencyVoltageSet.getOperatingPointSet();
		opsList.clear();
		
		OperatingPointSet ops1 = (OperatingPointSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getOperatingPointSet());
		ops1.setName("OperatingPointSet0");
		ops1.setId("OPS_CLUSTER0");
		
		List<OperatingPoint> opList1 = ops1.getOperatingPoint();
		opList1.clear();
		
		for (org.multicore_association.shim10.model.shim10.MasterComponent mc : 
			makeMasterComponent10List(systemConfiguration.getComponentSet())) {
			Float cvalue = mc.getClockFrequency().getClockValue();
			if (!existOperatingPoint(cvalue, opList1)) {
				OperatingPoint op = makeOperatingPoint(mc.getClockFrequency().getClockValue(), 0, opList1.size());
				opList1.add(op);
			}
		}
		
		opsList.add(ops1);
		
		OperatingPointSet ops2 = (OperatingPointSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getOperatingPointSet());
		ops2.setName("OperatingPointSet1");
		ops2.setId("OPS_CLUSTER1");
		List<OperatingPoint> opList2 = ops2.getOperatingPoint();
		opList2.clear();
		
		OperatingPoint opsys = makeOperatingPoint(systemConfiguration.getClockFrequency().getClockValue(), 1, opList2.size());
		opList2.add(opsys);
		
		opsList.add(ops2);
		
		return frequencyVoltageSet;
	}
	
	private static boolean existOperatingPoint(Float value, List<OperatingPoint> opList) {
		for (OperatingPoint op : opList) {
			if (Math.round(value) == op.getFrequency()) {
				return true;
			}
		}
		return false;
	}
	
	private static OperatingPoint makeOperatingPoint(Float value, Integer cluster, Integer num) {
		OperatingPoint operatingPoint = (OperatingPoint) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getOperatingPoint());
		
		operatingPoint.setName("operatingpoint" + num);
		operatingPoint.setId("OP_CLUSTER" + cluster + "_F" + num);
		operatingPoint.setFrequency(Math.round(value));
		
		return operatingPoint;
	}
	
	private static List<org.multicore_association.shim10.model.shim10.MasterComponent> makeMasterComponent10List(
			org.multicore_association.shim10.model.shim10.ComponentSet componentSet) {
		
		List<org.multicore_association.shim10.model.shim10.MasterComponent> mcList = 
				new ArrayList<org.multicore_association.shim10.model.shim10.MasterComponent>();
		
		if (componentSet.getMasterComponent() != null) {
			mcList.addAll(componentSet.getMasterComponent());
		}
		
		if (componentSet.getComponentSet() != null) {
			for (org.multicore_association.shim10.model.shim10.ComponentSet cs : componentSet.getComponentSet()) {
				mcList.addAll(makeMasterComponent10List(cs));
			}
		}
		
		return mcList;
	}
	
}
