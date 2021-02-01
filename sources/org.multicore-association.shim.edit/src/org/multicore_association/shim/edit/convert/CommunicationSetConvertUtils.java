package org.multicore_association.shim.edit.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.AccessTypeSet;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.AddressSpaceSet;
import org.multicore_association.shim.model.shim.CommunicationSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.Connection;
import org.multicore_association.shim.model.shim.ConnectionSet;
import org.multicore_association.shim.model.shim.EventCommunication;
import org.multicore_association.shim.model.shim.FIFOCommunication;
import org.multicore_association.shim.model.shim.InterruptCommunication;
import org.multicore_association.shim.model.shim.Latency;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.OperationType;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.Pitch;
import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.SharedMemoryCommunication;
import org.multicore_association.shim.model.shim.SharedRegisterCommunication;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SizeUnitType;
import org.multicore_association.shim.model.shim.SubSpace;

public class CommunicationSetConvertUtils {

	private CommunicationSetConvertUtils() {
	}
	
	// 	SystemConfiguration Å´
	//	CommunicationSet
	//		Å® SharedMemoryCommunication d
	//		Å® SharedRegisterCommunication d
	//		Å® EventCommunication d
	//		Å® FIFOCommunication d
	//		Å® InterruptCommunication d
	public static CommunicationSet convert(
			org.multicore_association.shim10.model.shim10.CommunicationSet communicationSet10, 
			AddressSpaceSet ass, ComponentSet cs) {
		CommunicationSet communicationSet20 = (CommunicationSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getCommunicationSet());
		
		List<SharedMemoryCommunication> smcList = communicationSet20.getSharedMemoryCommunication();
		List<SharedRegisterCommunication> srcList = communicationSet20.getSharedRegisterCommunication();
		List<EventCommunication> ecList = communicationSet20.getEventCommunication();
		List<FIFOCommunication> fifocList = communicationSet20.getFIFOCommunication();
		List<InterruptCommunication> icList = communicationSet20.getInterruptCommunication();
		
		for (org.multicore_association.shim10.model.shim10.SharedMemoryCommunication smc10 :
			communicationSet10.getSharedMemoryCommunication()) {
			smcList.add(convertSharedMemoryCommunication(smc10, ass, cs));
		}
		
		for (org.multicore_association.shim10.model.shim10.SharedRegisterCommunication src10 :
			communicationSet10.getSharedRegisterCommunication()) {
			srcList.add(convertSharedRegisterCommunication(src10, cs));
		}
		
		for (org.multicore_association.shim10.model.shim10.EventCommunication ec10 :
			communicationSet10.getEventCommunication()) {
			ecList.add(convertEventCommunication(ec10, cs));
		}
		
		for (org.multicore_association.shim10.model.shim10.FIFOCommunication fifoc10 :
			communicationSet10.getFIFOCommunication()) {
			fifocList.add(convertFIFOCommunication(fifoc10, cs));
		}
		
		for (org.multicore_association.shim10.model.shim10.InterruptCommunication ic10 :
			communicationSet10.getInterruptCommunication()) {
			icList.add(convertInterruptCommunication(ic10, cs));
		}
		
		return communicationSet20;
	}
	
	//	CommunicationSet Å´
	//	SharedMemoryCommunication
	//		Å® ConnectionSet
	//		Å® name
	//		Å® dataSize
	//		Å® dataSizeUnit
	//		Å® operationType
	//		Å® AddressSpaceRef d
	//		Å® SubSpaceRef d
	private static SharedMemoryCommunication convertSharedMemoryCommunication(
			org.multicore_association.shim10.model.shim10.SharedMemoryCommunication sharedMemoryCommunication10, 
			AddressSpaceSet ass, ComponentSet cs) {
		SharedMemoryCommunication sharedMemoryCommunication20 = (SharedMemoryCommunication) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getSharedMemoryCommunication());
		
		sharedMemoryCommunication20.setConnectionSet(convertConnectionSet(
				sharedMemoryCommunication10.getConnectionSet(), cs));
		sharedMemoryCommunication20.setName(sharedMemoryCommunication10.getName());
		sharedMemoryCommunication20.setDataSize(sharedMemoryCommunication10.getDataSize());
		
		switch (sharedMemoryCommunication10.getDataSizeUnit()) {
			case KI_B:
				sharedMemoryCommunication20.setDataSizeUnit(SizeUnitType.KI_B);
				break;
			case B:
				sharedMemoryCommunication20.setDataSizeUnit(SizeUnitType.B);
				break;
			case GI_B:
				sharedMemoryCommunication20.setDataSizeUnit(SizeUnitType.GI_B);
				break;
			case MI_B:
				sharedMemoryCommunication20.setDataSizeUnit(SizeUnitType.MI_B);
				break;
			case TI_B:
				sharedMemoryCommunication20.setDataSizeUnit(SizeUnitType.TI_B);
				break;
		}
		
		switch (sharedMemoryCommunication10.getOperationType()) {
			case TAS:
				sharedMemoryCommunication20.setOperationType(OperationType.TAS);
				break;
			case LLSC:
				sharedMemoryCommunication20.setOperationType(OperationType.LLSC);
				break;
			case CAX:
				sharedMemoryCommunication20.setOperationType(OperationType.CAX);
				break;
			case OTHER:
				sharedMemoryCommunication20.setOperationType(OperationType.OTHER);
				break;
		}
		
		List<AddressSpace> asList = ass.getAddressSpace();
		searchAddressSpace(asList, sharedMemoryCommunication10.getAddressSpaceRef().getId())
		.ifPresent(x -> sharedMemoryCommunication20.setAddressSpaceRef(x));
		
		List<SubSpace> ssList = ShimModelManager.makeSubSpaceList(ass);
		
		searchSubSpace(ssList, sharedMemoryCommunication10.getSubSpaceRef().getId())
		.ifPresent(x -> sharedMemoryCommunication20.setSubSpaceRef(x));
		
		return sharedMemoryCommunication20;
	}
	

	
	//	CommunicationSet Å´
	//	SharedRegisterCommunication
	//		Å® ConnectionSet
	//		Å® name
	//		Å® dataSize
	//		Å® dataSizeUnit
	//		Å® nRegister
	private static SharedRegisterCommunication convertSharedRegisterCommunication(
			org.multicore_association.shim10.model.shim10.SharedRegisterCommunication sharedRegisterCommunication10, 
			ComponentSet cs) {
		SharedRegisterCommunication sharedRegisterCommunication20 = (SharedRegisterCommunication) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getSharedRegisterCommunication());
		
		sharedRegisterCommunication20.setConnectionSet(
				convertConnectionSet(sharedRegisterCommunication10.getConnectionSet(), cs));
		sharedRegisterCommunication20.setName(sharedRegisterCommunication10.getName());
		sharedRegisterCommunication20.setDataSize(sharedRegisterCommunication10.getDataSize());
		
		switch (sharedRegisterCommunication10.getDataSizeUnit()) {
			case KI_B:
				sharedRegisterCommunication20.setDataSizeUnit(SizeUnitType.KI_B);
				break;
			case B:
				sharedRegisterCommunication20.setDataSizeUnit(SizeUnitType.B);
				break;
			case GI_B:
				sharedRegisterCommunication20.setDataSizeUnit(SizeUnitType.GI_B);
				break;
			case MI_B:
				sharedRegisterCommunication20.setDataSizeUnit(SizeUnitType.MI_B);
				break;
			case TI_B:
				sharedRegisterCommunication20.setDataSizeUnit(SizeUnitType.TI_B);
				break;
		}
		
		sharedRegisterCommunication20.setNRegister(sharedRegisterCommunication10.getNRegister());
		
		return sharedRegisterCommunication20;
	}
	
	//	CommunicationSet Å´
	//	EventCommunication
	//		Å® ConnectionSet
	//		Å® name
	private static EventCommunication convertEventCommunication(
			org.multicore_association.shim10.model.shim10.EventCommunication eventCommunication10, 
			ComponentSet cs) {
		EventCommunication eventCommunication20 = (EventCommunication) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getEventCommunication());
		
		eventCommunication20.setConnectionSet(convertConnectionSet(
				eventCommunication10.getConnectionSet(), cs));
		eventCommunication20.setName(eventCommunication10.getName());
		
		return eventCommunication20;
	}
	
	//	CommunicationSet Å´
	//	FIFOCommunication
	//		Å® ConnectionSet
	//		Å® name
	//		Å® dataSize
	//		Å® dataSizeUnit
	//		Å® queueSize
	private static FIFOCommunication convertFIFOCommunication(
			org.multicore_association.shim10.model.shim10.FIFOCommunication fifoCommunication10, 
			ComponentSet cs) {
		FIFOCommunication fifoCommunication20 = (FIFOCommunication) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getFIFOCommunication());
		
		fifoCommunication20.setConnectionSet(convertConnectionSet(
				fifoCommunication10.getConnectionSet(), cs));
		fifoCommunication20.setName(fifoCommunication10.getName());
		
		fifoCommunication20.setDataSize(fifoCommunication10.getDataSize());
		
		switch (fifoCommunication10.getDataSizeUnit()) {
			case KI_B:
				fifoCommunication20.setDataSizeUnit(SizeUnitType.KI_B);
				break;
			case B:
				fifoCommunication20.setDataSizeUnit(SizeUnitType.B);
				break;
			case GI_B:
				fifoCommunication20.setDataSizeUnit(SizeUnitType.GI_B);
				break;
			case MI_B:
				fifoCommunication20.setDataSizeUnit(SizeUnitType.MI_B);
				break;
			case TI_B:
				fifoCommunication20.setDataSizeUnit(SizeUnitType.TI_B);
				break;
		}
		
		fifoCommunication20.setQueueSize(fifoCommunication10.getQueueSize());
		
		return fifoCommunication20;
	}
	
	//	CommunicationSet Å´
	//	InterruptCommunication
	//		Å® ConnectionSet
	//		Å® name
	private static InterruptCommunication convertInterruptCommunication(
			org.multicore_association.shim10.model.shim10.InterruptCommunication interruptCommunication10, 
			ComponentSet cs) {
		InterruptCommunication interruptCommunication20 = (InterruptCommunication) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getInterruptCommunication());
		
		if (interruptCommunication10.getConnectionSet() != null) {
			System.out.println("interrupt" + interruptCommunication10.getConnectionSet());
			interruptCommunication20.setConnectionSet(
					convertConnectionSet(interruptCommunication10.getConnectionSet(), cs));
		}
		interruptCommunication20.setName(interruptCommunication10.getName());
		
		return interruptCommunication20;
	}
	
	//	ConnectionSet
	//		Å® Connection
	private static ConnectionSet convertConnectionSet(
			org.multicore_association.shim10.model.shim10.ConnectionSet connectionSet10, 
			ComponentSet cs) {
		ConnectionSet connectionSet20 = (ConnectionSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getConnectionSet());
		
		List<Connection> cList = connectionSet20.getConnection();
		cList.clear();
		
		if (connectionSet10 != null) {
			System.out.println(connectionSet10.getConnection());
			for (org.multicore_association.shim10.model.shim10.Connection c10 :
				connectionSet10.getConnection()) {
				cList.add(convertConnection(c10, cs));
			}
		}
		
		return connectionSet20;
	}
	
	//	ConnectionSet Å´
	//	Connection
	//		Å® Performance
	//		Å® from
	//		Å® to
	private static Connection convertConnection(
			org.multicore_association.shim10.model.shim10.Connection connection10, 
			ComponentSet cs) {
		Connection connection20 = (Connection) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getConnection());
		
		List<Performance> pList = connection20.getPerformance();
		pList.clear();
		
		for (org.multicore_association.shim10.model.shim10.Performance p10 :
			connection10.getPerformance()) {
			pList.add(convertPerformance(p10, cs));
		}
		
		List<MasterComponent> mcList = ShimModelManager.makeMasterComponentList(cs);
		
		searchMasterComponent(mcList, connection10.getFrom().getId())
		.ifPresent(x -> connection20.setFrom(x));
		
		searchMasterComponent(mcList, connection10.getTo().getId())
		.ifPresent(x -> connection20.setTo(x));
		
		return connection20;
	}
	
	//	Connection Å´
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
		
		if (performance10.getAccessTypeRef() != null) {
			searchAccessType(atList, performance10.getAccessTypeRef().getId())
			.ifPresent(x -> performance20.setAccessTypeRef(x));
		}
		
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
	
	private static Optional<AddressSpace> searchAddressSpace(List<AddressSpace> asl,
			String id) {
		for (AddressSpace as : asl) {
			if (as.getId().equals(id)) {
				return Optional.of(as);
			}
		}
		
		return Optional.empty();
	}
	
	private static Optional<SubSpace> searchSubSpace(List<SubSpace> ssl,
			String id) {
		for (SubSpace ss : ssl) {
			if (ss.getId().equals(id)) {
				return Optional.of(ss);
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
	
	private static Optional<MasterComponent> searchMasterComponent(List<MasterComponent> mcl,
			String id) {
		for (MasterComponent mc : mcl) {
			if (mc.getId().equals(id)) {
				return Optional.of(mc);
			}
		}
		
		return Optional.empty();
	}

}
