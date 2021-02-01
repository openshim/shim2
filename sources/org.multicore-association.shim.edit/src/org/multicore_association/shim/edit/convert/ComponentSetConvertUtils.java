package org.multicore_association.shim.edit.convert;

import java.util.List;

import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.AccessTypeSet;
import org.multicore_association.shim.model.shim.Cache;
import org.multicore_association.shim.model.shim.CacheCoherencyType;
import org.multicore_association.shim.model.shim.CacheType;
import org.multicore_association.shim.model.shim.ClockFrequency;
import org.multicore_association.shim.model.shim.CommonInstructionSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.FrequencyVoltageSet;
import org.multicore_association.shim.model.shim.FunctionalUnit;
import org.multicore_association.shim.model.shim.FunctionalUnitSet;
import org.multicore_association.shim.model.shim.Instruction;
import org.multicore_association.shim.model.shim.Latency;
import org.multicore_association.shim.model.shim.LockDownType;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.MasterType;
import org.multicore_association.shim.model.shim.OperatingPoint;
import org.multicore_association.shim.model.shim.OperatingPointSet;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.Pitch;
import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SizeUnitType;
import org.multicore_association.shim.model.shim.SlaveComponent;

public class ComponentSetConvertUtils {

	private ComponentSetConvertUtils() {
	}
	
	// 	SystemConfiguration Å´
	// 	ComponentSet
	//		Å® name
	//		Å® id
	//		Å® frequencyDomainRef
	//		Å® voltageDomainRef
	//		Å® operatingPointRef
	//		Å® ComponentSet d
	//		Å® MasterComponent d
	//		Å® SlaveComponent d
	//		Å® Cache d
	public static ComponentSet convert(
			org.multicore_association.shim10.model.shim10.ComponentSet componentSet10, FrequencyVoltageSet fvs) {
		ComponentSet componentSet20 = (ComponentSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getComponentSet());
		
		componentSet20.unsetOperatingPointRef();
		
		componentSet20.setName(componentSet10.getName());
		
		List<ComponentSet> csList = componentSet20.getComponentSet();
		csList.clear();
		List<MasterComponent> mcList = componentSet20.getMasterComponent();
		mcList.clear();
		List<SlaveComponent> scList = componentSet20.getSlaveComponent();
		scList.clear();
		List<Cache> cList = componentSet20.getCache();
		cList.clear();
		
		for (org.multicore_association.shim10.model.shim10.ComponentSet cs10 :
			componentSet10.getComponentSet()) {
			csList.add(convert(cs10, fvs));
		}
		
		for (org.multicore_association.shim10.model.shim10.MasterComponent mc10 : 
			componentSet10.getMasterComponent()) {
			MasterComponent mc20 = convertMasterComponent(mc10, fvs.getOperatingPointSet());
			for (org.multicore_association.shim10.model.shim10.Cache c10 :
				mc10.getCache()) {
				Cache c20 = convertCache(c10);
				cList.add(c20);
				mc20.getCacheRef().add(c20);
			}
			mcList.add(mc20);
		}
		
		for (org.multicore_association.shim10.model.shim10.SlaveComponent sc10 :
			componentSet10.getSlaveComponent()) {
			scList.add(convertSlaveComponent(sc10));
		}
		
		return componentSet20;
	}
	
	//	ComponentSet Å´
	//	MasterComponent
	//		Å® CommonInstructionSet d
	//		Å® CacheRef d
	//		Å® AccessTypeSet
	//		Å® ClockFrequency d
	//		Å® arch
	//		Å® archOption
	//		Å® endian
	//		Å® id
	//		Å® masterType
	//		Å® name
	//		Å® nThread
	//		Å® pid
	private static MasterComponent convertMasterComponent(
			org.multicore_association.shim10.model.shim10.MasterComponent masterComponent10, List<OperatingPointSet> opsList) {
		MasterComponent masterComponent20 = (MasterComponent) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getMasterComponent());
		
		masterComponent20.setCommonInstructionSet(
				convertCommonInstructionSet(masterComponent10.getCommonInstructionSet()));
		
		masterComponent20.setAccessTypeSet(convertAccessTypeSet(masterComponent10.getAccessTypeSet()));
		
		Float value = masterComponent10.getClockFrequency().getClockValue();
		
		opsLoop : for (OperatingPointSet ops : opsList) {
			List<OperatingPoint> opList = ops.getOperatingPoint();
			for (OperatingPoint op : opList) {
				if (Math.round(value) == op.getFrequency()) {
					masterComponent20.setOperatingPointRef(ops);
					break opsLoop;
				}
			}
		}
		
		
//		masterComponent20.setClockFrequency(
//				convertClockFrequency(masterComponent10.getClockFrequency()));
		
		masterComponent20.setArch(masterComponent10.getArch());
		masterComponent20.setArchOption(masterComponent10.getArchOption());
		
		switch (masterComponent10.getEndian()) {
			case LITTLE:
				masterComponent20.setEndian(EndianType.LITTLE);
				break;
			case BIG:
				masterComponent20.setEndian(EndianType.BIG);
				break;
		}
		
		masterComponent20.setId(masterComponent10.getId());
		
		switch (masterComponent10.getMasterType()) {
			case PU:
				masterComponent20.setMasterType(MasterType.PU);
				break;
			case TU:
				masterComponent20.setMasterType(MasterType.TU);
				break;
			case OTHER:
				masterComponent20.setMasterType(MasterType.OTHER);
				break;
		}
		
		masterComponent20.setName(masterComponent10.getName());
		masterComponent20.setNThread(masterComponent10.getNThread());
		masterComponent20.setPid(masterComponent10.getPid());
		
		return masterComponent20;
	}
	
	//	MasterComponent Å´
	//	CommonInstructionSet
	//		Å® name
	//		Å® FunctionalUnitSet
	private static CommonInstructionSet convertCommonInstructionSet(
			org.multicore_association.shim10.model.shim10.CommonInstructionSet commonInstructionSet10) {
		CommonInstructionSet commonInstructionSet20 = (CommonInstructionSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getCommonInstructionSet());
		
		commonInstructionSet20.setName(commonInstructionSet10.getName());
		
		FunctionalUnitSet functionalUnitSet20 = (FunctionalUnitSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getFunctionalUnitSet());
		List<FunctionalUnit> fuList = functionalUnitSet20.getFunctionalUnit();
		fuList.clear();
		fuList.add(convertFunctionalUnit(commonInstructionSet10.getInstruction()));
		
		commonInstructionSet20.setFunctionalUnitSet(functionalUnitSet20);
				
		return commonInstructionSet20;
	}
	
	//	MaserComponent Å´
	//	Cache
	//		Å® CacheRef
	//		Å® CacheCoherency (debug)
	//		Å® CacheType
	//		Å® id
	//		Å® lineSize
	//		Å® LockDownType
	//		Å® name
	//		Å® nWay
	//		Å® size
	//		Å® sizeUnit
	//		Å® shim2.0 is different from shim1.0 in other items
	private static Cache convertCache(
			org.multicore_association.shim10.model.shim10.Cache cache10) {
		Cache cache20 = (Cache) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getCache());
		
		List<Cache> cList = cache20.getCacheRef();
		cList.clear();
		
		for (org.multicore_association.shim10.model.shim10.Cache c10 :
			cache10.getCacheRef()) {
			cList.add(convertCache(c10));
		}
		
		switch (cache10.getCacheCoherency()) {
			case HARD:
				cache20.setCacheCoherency(CacheCoherencyType.HARDWARE);
				break;
			case SOFT:
				cache20.setCacheCoherency(CacheCoherencyType.SOFTWARE);
				break;
		}
		
		switch (cache10.getCacheType()) {
			case DATA:
				cache20.setCacheType(CacheType.DATA);
				break;
			case INSTRUCTION:
				cache20.setCacheType(CacheType.INSTRUCTION);
				break;
			case UNIFIED:
				cache20.setCacheType(CacheType.UNIFIED);
				break;
		}
		
		cache20.setId(cache10.getId());
		cache20.setLineSize(cache10.getLineSize());
		
		switch (cache10.getLockDownType()) {
			case LINE:
				cache20.setLockDownType(LockDownType.LINE);
				break;
			case NONE:
				cache20.setLockDownType(LockDownType.NONE);
				break;
			case WAY:
				cache20.setLockDownType(LockDownType.WAY);
				break;
		}
		
		cache20.setName(cache10.getName());
		cache20.setNWay(cache10.getNWay());
		cache20.setSize(cache10.getSize());
		
		switch (cache10.getSizeUnit()) {
			case KI_B:
				cache20.setSizeUnit(SizeUnitType.KI_B);
				break;
			case B:
				cache20.setSizeUnit(SizeUnitType.B);
				break;
			case GI_B:
				cache20.setSizeUnit(SizeUnitType.GI_B);
				break;
			case MI_B:
				cache20.setSizeUnit(SizeUnitType.MI_B);
				break;
			case TI_B:
				cache20.setSizeUnit(SizeUnitType.TI_B);
				break;
		}
		
		return cache20;
	}
	
	private static AccessTypeSet convertAccessTypeSet(
			org.multicore_association.shim10.model.shim10.AccessTypeSet accessTypeSet10) {
		AccessTypeSet accessTypeSet20 = (AccessTypeSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getAccessTypeSet());
		
		List<AccessType> atList = accessTypeSet20.getAccessType();
		atList.clear();
		
		for (org.multicore_association.shim10.model.shim10.AccessType at10 : 
			accessTypeSet10.getAccessType()) {
			AccessType at20 = (AccessType) DefaultDataStore
					.getDefaultInstance(ShimPackage.eINSTANCE.getAccessType());
			at20.setName(at10.getName());
			at20.setId(at10.getId());
			
			switch (at10.getRwType()) {
				case RW:
					at20.setRwType(RWType.RW);
				case WX:
					at20.setRwType(RWType.WX);
				case RX:
					at20.setRwType(RWType.RX);
				case R:
					at20.setRwType(RWType.R);
				case W:
					at20.setRwType(RWType.W);
				case X:
					at20.setRwType(RWType.X);
				case RWX:
					at20.setRwType(RWType.RWX);
			}
			
			at20.setAccessByteSize(at10.getAccessByteSize());
			at20.setAlignmentByteSize(at10.getAlignmentByteSize());
			at20.setNBurst(at10.getNBurst());
			
			atList.add(at20);
		}
		
		return accessTypeSet20;
	}
	
	//	MasterComponent Å´
	//	ClockFrequency
	//		Å® ClockValue
	private static ClockFrequency convertClockFrequency(
			org.multicore_association.shim10.model.shim10.ClockFrequency clockFrequency10) {
		ClockFrequency clockFrequency20 = (ClockFrequency) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getClockFrequency());
		
		clockFrequency20.setClockValue(clockFrequency10.getClockValue());
		
		return clockFrequency20;
	}
	
	//	ComponentSet Å´
	//	SlaveComponent (debug)
	//		Å® id
	//		Å® name
	//		Å® size
	//		Å® sizeUnit
	//		Å® rwType
	private static SlaveComponent convertSlaveComponent(
			org.multicore_association.shim10.model.shim10.SlaveComponent slaveComponent10) {
		SlaveComponent slaveComponent20 = (SlaveComponent) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getSlaveComponent());
		slaveComponent20.setId(slaveComponent10.getId());
		slaveComponent20.setName(slaveComponent10.getName());
		slaveComponent20.setSize(slaveComponent10.getSize());
		
		switch (slaveComponent10.getSizeUnit()) {
			case KI_B:
				slaveComponent20.setSizeUnit(SizeUnitType.KI_B);
				break;
			case B:
				slaveComponent20.setSizeUnit(SizeUnitType.B);
				break;
			case GI_B:
				slaveComponent20.setSizeUnit(SizeUnitType.GI_B);
				break;
			case MI_B:
				slaveComponent20.setSizeUnit(SizeUnitType.MI_B);
				break;
			case TI_B:
				slaveComponent20.setSizeUnit(SizeUnitType.TI_B);
				break;
		}
		
		switch (slaveComponent10.getRwType()) {
			case RW:
				slaveComponent20.setRwType(RWType.RW);
				break;
			case WX:
				slaveComponent20.setRwType(RWType.WX);
				break;
			case RX:
				slaveComponent20.setRwType(RWType.RX);
				break;
			case R:
				slaveComponent20.setRwType(RWType.R);
				break;
			case W:
				slaveComponent20.setRwType(RWType.W);
				break;
			case X:
				slaveComponent20.setRwType(RWType.X);
				break;
			case RWX:
				slaveComponent20.setRwType(RWType.RWX);
				break;
		}
		
		return slaveComponent20;
	}
	
	private static FunctionalUnit convertFunctionalUnit(
			List<org.multicore_association.shim10.model.shim10.Instruction> iList10) {
		FunctionalUnit functionalUnit = (FunctionalUnit) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getFunctionalUnit());
		
		functionalUnit.setName("functionalunit");
		List<Instruction> iList20 = functionalUnit.getInstruction();
		iList20.clear();
		
		for (org.multicore_association.shim10.model.shim10.Instruction i : iList10) {
			iList20.add(convertInstruction(i));
		}
		
		return functionalUnit;
	}
	
	private static Instruction convertInstruction(
			org.multicore_association.shim10.model.shim10.Instruction instruction10) {
		Instruction instruction20 = (Instruction) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getInstruction());
		
		instruction20.setName(instruction10.getName());
		
		instruction20.setPerformance(convertPerformance(instruction10.getPerformance()));
		
		return instruction20;
	}
	
	private static Performance convertPerformance(
			org.multicore_association.shim10.model.shim10.Performance performance10) {
		Performance performance20 = (Performance) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getPerformance());
		
		Pitch pitch20 = (Pitch) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getPitch());
		pitch20.setBest(performance10.getPitch().getBest());
		pitch20.setTypical(performance10.getPitch().getTypical());
		pitch20.setWorst(performance10.getPitch().getWorst());
		performance20.setPitch(pitch20);
		
		Latency latency20 = (Latency) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getLatency());
		latency20.setBest(performance10.getLatency().getBest());
		latency20.setTypical(performance10.getLatency().getTypical());
		latency20.setWorst(performance10.getLatency().getWorst());
		performance20.setLatency(latency20);
		
//		performance20.getAccessTypeRef().setId(performance10.getAccessTypeRef().getId());
		
		return performance20;
	}

}
