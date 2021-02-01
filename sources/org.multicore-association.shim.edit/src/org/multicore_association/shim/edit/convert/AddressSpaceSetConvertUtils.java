package org.multicore_association.shim.edit.convert;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EObject;
import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.AccessTypeSet;
import org.multicore_association.shim.model.shim.Accessor;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.AddressSpaceSet;
import org.multicore_association.shim.model.shim.Cache;
import org.multicore_association.shim.model.shim.CacheCoherencyType;
import org.multicore_association.shim.model.shim.CacheType;
import org.multicore_association.shim.model.shim.ClockFrequency;
import org.multicore_association.shim.model.shim.CommonInstructionSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.Latency;
import org.multicore_association.shim.model.shim.LockDownType;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.MasterSlaveBinding;
import org.multicore_association.shim.model.shim.MasterSlaveBindingSet;
import org.multicore_association.shim.model.shim.MasterType;
import org.multicore_association.shim.model.shim.MemoryConsistencyModel;
import org.multicore_association.shim.model.shim.OrderingType;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.PerformanceSet;
import org.multicore_association.shim.model.shim.Pitch;
import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.ShimFactory;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SizeUnitType;
import org.multicore_association.shim.model.shim.SlaveComponent;
import org.multicore_association.shim.model.shim.SubSpace;

public class AddressSpaceSetConvertUtils {

	private AddressSpaceSetConvertUtils() {
	}
	
	//	SystemComfiguration Å´
	// 	AddressSpaceSet
	//		Å® AddressSpace d
	public static AddressSpaceSet convert(
			org.multicore_association.shim10.model.shim10.AddressSpaceSet addressSpaceSet10,
			ComponentSet component) {
		AddressSpaceSet addressSpaceSet20 = (AddressSpaceSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getAddressSpaceSet());
		List<AddressSpace> asList = addressSpaceSet20.getAddressSpace();
		asList.clear();
		
		for (org.multicore_association.shim10.model.shim10.AddressSpace as10 :
			addressSpaceSet10.getAddressSpace()) {
			asList.add(convertAddressSpace(as10, component));
		}
		
		return addressSpaceSet20;
	}
	
	//	AddressSpaceSet Å´
	//	AddressSpace
	//		Å® name
	//		Å® id
	//		Å® SubSpace d
	public static AddressSpace convertAddressSpace(
			org.multicore_association.shim10.model.shim10.AddressSpace addressSpace10,
			ComponentSet component) {
		AddressSpace addressSpace20 = (AddressSpace) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getAddressSpace());
		
		addressSpace20.setName(addressSpace10.getName());
		addressSpace20.setId(addressSpace10.getId());
		
		List<SubSpace> ssList = addressSpace20.getSubSpace();
		ssList.clear();
		
		if (addressSpace10.getSubSpace() != null) {
			for (org.multicore_association.shim10.model.shim10.SubSpace ss10 :
				addressSpace10.getSubSpace()) {
				ssList.add(convertSubSpace(ss10, component));
			}
		}
		
		return addressSpace20;
	}
	
	//	AddressSpace Å´
	//	SubSpace
	//		Å® name
	//		Å® id
	//		Å® start
	//		Å® end
	//		Å® endian
	//		Å® MasterSlaveBindingSet d
	//		Å® MemoryConsistencyModel d
	public static SubSpace convertSubSpace(
			org.multicore_association.shim10.model.shim10.SubSpace subSpace10,
			ComponentSet component) {
		SubSpace subSpace20 = (SubSpace) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getSubSpace());
		
		subSpace20.setName(subSpace10.getName());
		subSpace20.setId(subSpace10.getId());
		subSpace20.setStart(subSpace10.getStart());
		subSpace20.setEnd(subSpace10.getEnd());
		
		switch(subSpace10.getEndian()) {
			case LITTLE:
				subSpace20.setEndian(EndianType.LITTLE);
				break;
			case BIG:
				subSpace20.setEndian(EndianType.BIG);
				break;
		}
				
		List<MemoryConsistencyModel> mcmList = subSpace20.getMemoryConsistencyModel();
		
		for (org.multicore_association.shim10.model.shim10.MemoryConsistencyModel mcm10 :
			subSpace10.getMemoryConsistencyModel()) {
			mcmList.add(convertMemoryConsistencyModel(mcm10));
		}
		
		subSpace20.setMasterSlaveBindingSet(convertMasterSlaveBindingSet(
				subSpace10.getMasterSlaveBindingSet(), component));
		
		return subSpace20;
	}
	
	//	SubSpace Å´
	//	MasterSlaveBindingSet
	//		Å® MasterSlaveBinding d
	public static MasterSlaveBindingSet convertMasterSlaveBindingSet(
			org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet masterSlaveBindingSet10,
			ComponentSet component) {
		MasterSlaveBindingSet masterSlaveBindingSet20 = (MasterSlaveBindingSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getMasterSlaveBindingSet());
		
		List<MasterSlaveBinding> msbList = masterSlaveBindingSet20.getMasterSlaveBinding();
		msbList.clear();
		
		for (org.multicore_association.shim10.model.shim10.MasterSlaveBinding msb10 :
			masterSlaveBindingSet10.getMasterSlaveBinding()) {
			msbList.add(convertMasterSlaveBinding(msb10, component));
		}
		
		return masterSlaveBindingSet20;
	}
	
	//	SubSpace Å´
	//	MemoryConsistencyModel
	//		Å® rarOrdering
	//		Å® rawordering
	//		Å® warordering
	//		Å® wawordering
	public static MemoryConsistencyModel convertMemoryConsistencyModel(
			org.multicore_association.shim10.model.shim10.MemoryConsistencyModel memoryConsistencyModel10) {
		MemoryConsistencyModel memoryConsistencyModel20 = (MemoryConsistencyModel) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getMemoryConsistencyModel());
				
		switch (memoryConsistencyModel10.getRarOrdering()) {
			case ORDERD:
				memoryConsistencyModel20.setRarOrdering(OrderingType.ORDERED);
				break;
			case UNORDERD:
				memoryConsistencyModel20.setRarOrdering(OrderingType.UNORDERED);
				break;
		}
		
		switch (memoryConsistencyModel10.getRawOrdering()) {
			case ORDERD:
				memoryConsistencyModel20.setRawOrdering(OrderingType.ORDERED);
				break;
			case UNORDERD:
				memoryConsistencyModel20.setRawOrdering(OrderingType.UNORDERED);
				break;
		}
		
		switch (memoryConsistencyModel10.getWarOrdering()) {
			case ORDERD:
				memoryConsistencyModel20.setWarOrdering(OrderingType.ORDERED);
				break;
			case UNORDERD:
				memoryConsistencyModel20.setWarOrdering(OrderingType.UNORDERED);
				break;
		}
		
		switch (memoryConsistencyModel10.getWawOrdering()) {
			case ORDERD:
				memoryConsistencyModel20.setWawOrdering(OrderingType.ORDERED);
				break;
			case UNORDERD:
				memoryConsistencyModel20.setWawOrdering(OrderingType.UNORDERED);
				break;
		}
		
		return memoryConsistencyModel20;
	}
	
	//	MasterSlaveBindingSet Å´
	//	MasterSlaveBinding
	//		Å® SlaveComponentRef d
	//		Å® Accessor d
	public static MasterSlaveBinding convertMasterSlaveBinding(
			org.multicore_association.shim10.model.shim10.MasterSlaveBinding masterSlaveBinding10,
			ComponentSet component) {
		MasterSlaveBinding masterSlaveBinding20 = (MasterSlaveBinding) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getMasterSlaveBinding());
		
		List<SlaveComponent> scList = ShimModelManager.makeSlaveComponentList(component);
		
		searchSlaveComponent(scList, masterSlaveBinding10.getSlaveComponentRef())
		.ifPresent(x -> masterSlaveBinding20.setSlaveComponentRef(x));

		List<Accessor> aList = masterSlaveBinding20.getAccessor();
		aList.clear();
		
		for (org.multicore_association.shim10.model.shim10.Accessor a10 :
			masterSlaveBinding10.getAccessor()) {
			aList.add(convertAccessor(a10, component));
		}
		
		return masterSlaveBinding20;
	}
	
	//	MasterSlaveBinding Å´
	//	Accessor
	//		Å® PerformanceSet d
	//		Å® MasterComponentRef d
	public static Accessor convertAccessor(
			org.multicore_association.shim10.model.shim10.Accessor accessor10,
			ComponentSet component) {
		Accessor accessor20 = (Accessor) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getAccessor());
		
		List<PerformanceSet> psList = accessor20.getPerformanceSet();
		psList.clear();
		
		for (org.multicore_association.shim10.model.shim10.PerformanceSet ps10 :
			accessor10.getPerformanceSet()) {
			psList.add(convertPerformanceSet(ps10, component));
		}
		
		List<MasterComponent> mcList = ShimModelManager.makeMasterComponentList(component);
		searchMasterComponent(mcList, accessor10.getMasterComponentRef())
		.ifPresent(x -> accessor20.setMasterComponentRef(x));
		
		return accessor20;
	}
	
	//	Accessor Å´
	//	PerformanceSet
	//		Å® Performance d
	public static PerformanceSet convertPerformanceSet(
			org.multicore_association.shim10.model.shim10.PerformanceSet performanceSet10,
			ComponentSet component) {
		PerformanceSet performanceSet20 = (PerformanceSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getPerformanceSet());
		
		List<Performance> pList = performanceSet20.getPerformance();
		pList.clear();
		
		for (org.multicore_association.shim10.model.shim10.Performance p10 :
			performanceSet10.getPerformance()) {
			pList.add(convertPerformance(p10, component));
		}
		
		return performanceSet20;
	}
	
	//	PerformanceSet Å´
	//	Performance
	//		Å® Pitch d
	//		Å® Latency d
	//		Å® AccessTypeRef d
	public static Performance convertPerformance(
			org.multicore_association.shim10.model.shim10.Performance performance10,
			ComponentSet cs) {
		Performance performance20 = (Performance) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getPerformance());
		
		performance20.setPitch(convertPitch(performance10.getPitch()));
		performance20.setLatency(convertLatency(performance10.getLatency()));
		
		List<AccessType> atList = ShimModelManager.makeAccessTypeList(cs);
		
		searchAccessType(atList, performance10.getAccessTypeRef().getId())
		.ifPresent(x -> performance20.setAccessTypeRef(x));
		
		return performance20;
	}
	
	//	Performance Å´
	//	Pitch
	//		Å® best
	//		Å® typical
	//		Å® worst
	public static Pitch convertPitch(
			org.multicore_association.shim10.model.shim10.Pitch pitch10) {
		Pitch pitch20 = (Pitch) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getPitch());
		
		pitch20.setBest(pitch10.getBest());
		pitch20.setTypical(pitch10.getTypical());
		pitch20.setWorst(pitch10.getWorst());
		
		return pitch20;
	}
	
	//	Performance Å´
	//	Latency
	//		Å® best
	//		Å® typical
	//		Å® worst
	public static Latency convertLatency(
			org.multicore_association.shim10.model.shim10.Latency latency10) {
		Latency latency20 = (Latency) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getLatency());
		
		latency20.setBest(latency10.getBest());
		latency20.setTypical(latency10.getTypical());
		latency20.setWorst(latency10.getWorst());
		
		return latency20;
	}
	
	//	Performance Å´
	//	AccessType
	//		Å®Å@accessByteSize
	//		Å® alignmentByteSize
	//		Å® id
	//		Å® name
	//		Å® nBurst
	//		Å® rwType
	public static AccessType convertAccessType(
			org.multicore_association.shim10.model.shim10.AccessType accessType10) {
		AccessType accessType20 = (AccessType) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getAccessType());
		
		accessType20.setAccessByteSize(accessType10.getAccessByteSize());
		accessType20.setAlignmentByteSize(accessType10.getAccessByteSize());
		accessType20.setId(accessType10.getId());
		accessType20.setName(accessType10.getName());
		accessType20.setNBurst(accessType10.getNBurst());
		
		switch (accessType10.getRwType()) {
			case RW:
				accessType20.setRwType(RWType.RW);
				break;
			case WX:
				accessType20.setRwType(RWType.WX);
				break;
			case RX:
				accessType20.setRwType(RWType.RX);
				break;
			case R:
				accessType20.setRwType(RWType.R);
				break;
			case W:
				accessType20.setRwType(RWType.W);
				break;
			case X:
				accessType20.setRwType(RWType.X);
				break;
			case RWX:
				accessType20.setRwType(RWType.RWX);
				break;
		}
		
		return accessType20;
	}
	
	private static Optional<SlaveComponent> searchSlaveComponent(List<SlaveComponent> scl, 
			org.multicore_association.shim10.model.shim10.SlaveComponent slaveComponent) {
		for (SlaveComponent sc : scl) {
			if (sc.getId().equals(slaveComponent.getId())) {
				return Optional.of(sc);
			}
		}
		return Optional.empty();
	}
	
	private static Optional<MasterComponent> searchMasterComponent(List<MasterComponent> mcl, 
			org.multicore_association.shim10.model.shim10.MasterComponent masterComponent) {
		for (MasterComponent mc : mcl) {
			if (mc.getId().equals(masterComponent.getId())) {
				return Optional.of(mc);
			}
		}
		return Optional.empty();
	}
	
	private static Optional<AccessType> searchAccessType(List<AccessType> atl,
			String id) {
		for (AccessType at : atl) {
			if (at.getId().equals(id)) {
				return Optional.of(at);
			}
		}
		
		return Optional.empty();
	}

}
