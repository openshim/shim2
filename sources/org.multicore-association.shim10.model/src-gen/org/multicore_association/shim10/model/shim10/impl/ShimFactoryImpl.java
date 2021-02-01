/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.multicore_association.shim10.model.shim10.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShimFactoryImpl extends EFactoryImpl implements ShimFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShimFactory init() {
		try {
			ShimFactory theShimFactory = (ShimFactory)EPackage.Registry.INSTANCE.getEFactory(ShimPackage.eNS_URI);
			if (theShimFactory != null) {
				return theShimFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShimFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ShimPackage.ACCESSOR: return createAccessor();
			case ShimPackage.ACCESS_TYPE: return createAccessType();
			case ShimPackage.ACCESS_TYPE_SET: return createAccessTypeSet();
			case ShimPackage.ADDRESS_SPACE: return createAddressSpace();
			case ShimPackage.ADDRESS_SPACE_SET: return createAddressSpaceSet();
			case ShimPackage.CACHE: return createCache();
			case ShimPackage.CLOCK_FREQUENCY: return createClockFrequency();
			case ShimPackage.COMMON_INSTRUCTION_SET: return createCommonInstructionSet();
			case ShimPackage.COMMUNICATION_SET: return createCommunicationSet();
			case ShimPackage.COMPONENT_SET: return createComponentSet();
			case ShimPackage.CONNECTION: return createConnection();
			case ShimPackage.CONNECTION_SET: return createConnectionSet();
			case ShimPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ShimPackage.EVENT_COMMUNICATION: return createEventCommunication();
			case ShimPackage.FIFO_COMMUNICATION: return createFIFOCommunication();
			case ShimPackage.INSTRUCTION: return createInstruction();
			case ShimPackage.INTERRUPT_COMMUNICATION: return createInterruptCommunication();
			case ShimPackage.LATENCY: return createLatency();
			case ShimPackage.MASTER_COMPONENT: return createMasterComponent();
			case ShimPackage.MASTER_SLAVE_BINDING: return createMasterSlaveBinding();
			case ShimPackage.MASTER_SLAVE_BINDING_SET: return createMasterSlaveBindingSet();
			case ShimPackage.MEMORY_CONSISTENCY_MODEL: return createMemoryConsistencyModel();
			case ShimPackage.PERFORMANCE: return createPerformance();
			case ShimPackage.PERFORMANCE_SET: return createPerformanceSet();
			case ShimPackage.PITCH: return createPitch();
			case ShimPackage.SHARED_MEMORY_COMMUNICATION: return createSharedMemoryCommunication();
			case ShimPackage.SHARED_REGISTER_COMMUNICATION: return createSharedRegisterCommunication();
			case ShimPackage.SLAVE_COMPONENT: return createSlaveComponent();
			case ShimPackage.SUB_SPACE: return createSubSpace();
			case ShimPackage.SYSTEM_CONFIGURATION: return createSystemConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ShimPackage.CACHE_COHERENCY_TYPE:
				return createCacheCoherencyTypeFromString(eDataType, initialValue);
			case ShimPackage.CACHE_TYPE:
				return createCacheTypeFromString(eDataType, initialValue);
			case ShimPackage.ENDIAN_TYPE:
				return createEndianTypeFromString(eDataType, initialValue);
			case ShimPackage.LOCK_DOWN_TYPE:
				return createLockDownTypeFromString(eDataType, initialValue);
			case ShimPackage.MASTER_TYPE:
				return createMasterTypeFromString(eDataType, initialValue);
			case ShimPackage.OPERATION_TYPE:
				return createOperationTypeFromString(eDataType, initialValue);
			case ShimPackage.ORDERING_TYPE:
				return createOrderingTypeFromString(eDataType, initialValue);
			case ShimPackage.RW_TYPE:
				return createRWTypeFromString(eDataType, initialValue);
			case ShimPackage.SIZE_UNIT_TYPE:
				return createSizeUnitTypeFromString(eDataType, initialValue);
			case ShimPackage.CACHE_COHERENCY_TYPE_OBJECT:
				return createCacheCoherencyTypeObjectFromString(eDataType, initialValue);
			case ShimPackage.CACHE_TYPE_OBJECT:
				return createCacheTypeObjectFromString(eDataType, initialValue);
			case ShimPackage.ENDIAN_TYPE_OBJECT:
				return createEndianTypeObjectFromString(eDataType, initialValue);
			case ShimPackage.LOCK_DOWN_TYPE_OBJECT:
				return createLockDownTypeObjectFromString(eDataType, initialValue);
			case ShimPackage.MASTER_TYPE_OBJECT:
				return createMasterTypeObjectFromString(eDataType, initialValue);
			case ShimPackage.OPERATION_TYPE_OBJECT:
				return createOperationTypeObjectFromString(eDataType, initialValue);
			case ShimPackage.ORDERING_TYPE_OBJECT:
				return createOrderingTypeObjectFromString(eDataType, initialValue);
			case ShimPackage.RW_TYPE_OBJECT:
				return createRWTypeObjectFromString(eDataType, initialValue);
			case ShimPackage.SIZE_UNIT_TYPE_OBJECT:
				return createSizeUnitTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ShimPackage.CACHE_COHERENCY_TYPE:
				return convertCacheCoherencyTypeToString(eDataType, instanceValue);
			case ShimPackage.CACHE_TYPE:
				return convertCacheTypeToString(eDataType, instanceValue);
			case ShimPackage.ENDIAN_TYPE:
				return convertEndianTypeToString(eDataType, instanceValue);
			case ShimPackage.LOCK_DOWN_TYPE:
				return convertLockDownTypeToString(eDataType, instanceValue);
			case ShimPackage.MASTER_TYPE:
				return convertMasterTypeToString(eDataType, instanceValue);
			case ShimPackage.OPERATION_TYPE:
				return convertOperationTypeToString(eDataType, instanceValue);
			case ShimPackage.ORDERING_TYPE:
				return convertOrderingTypeToString(eDataType, instanceValue);
			case ShimPackage.RW_TYPE:
				return convertRWTypeToString(eDataType, instanceValue);
			case ShimPackage.SIZE_UNIT_TYPE:
				return convertSizeUnitTypeToString(eDataType, instanceValue);
			case ShimPackage.CACHE_COHERENCY_TYPE_OBJECT:
				return convertCacheCoherencyTypeObjectToString(eDataType, instanceValue);
			case ShimPackage.CACHE_TYPE_OBJECT:
				return convertCacheTypeObjectToString(eDataType, instanceValue);
			case ShimPackage.ENDIAN_TYPE_OBJECT:
				return convertEndianTypeObjectToString(eDataType, instanceValue);
			case ShimPackage.LOCK_DOWN_TYPE_OBJECT:
				return convertLockDownTypeObjectToString(eDataType, instanceValue);
			case ShimPackage.MASTER_TYPE_OBJECT:
				return convertMasterTypeObjectToString(eDataType, instanceValue);
			case ShimPackage.OPERATION_TYPE_OBJECT:
				return convertOperationTypeObjectToString(eDataType, instanceValue);
			case ShimPackage.ORDERING_TYPE_OBJECT:
				return convertOrderingTypeObjectToString(eDataType, instanceValue);
			case ShimPackage.RW_TYPE_OBJECT:
				return convertRWTypeObjectToString(eDataType, instanceValue);
			case ShimPackage.SIZE_UNIT_TYPE_OBJECT:
				return convertSizeUnitTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accessor createAccessor() {
		AccessorImpl accessor = new AccessorImpl();
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType createAccessType() {
		AccessTypeImpl accessType = new AccessTypeImpl();
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTypeSet createAccessTypeSet() {
		AccessTypeSetImpl accessTypeSet = new AccessTypeSetImpl();
		return accessTypeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpace createAddressSpace() {
		AddressSpaceImpl addressSpace = new AddressSpaceImpl();
		return addressSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpaceSet createAddressSpaceSet() {
		AddressSpaceSetImpl addressSpaceSet = new AddressSpaceSetImpl();
		return addressSpaceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache createCache() {
		CacheImpl cache = new CacheImpl();
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockFrequency createClockFrequency() {
		ClockFrequencyImpl clockFrequency = new ClockFrequencyImpl();
		return clockFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonInstructionSet createCommonInstructionSet() {
		CommonInstructionSetImpl commonInstructionSet = new CommonInstructionSetImpl();
		return commonInstructionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSet createCommunicationSet() {
		CommunicationSetImpl communicationSet = new CommunicationSetImpl();
		return communicationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSet createComponentSet() {
		ComponentSetImpl componentSet = new ComponentSetImpl();
		return componentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSet createConnectionSet() {
		ConnectionSetImpl connectionSet = new ConnectionSetImpl();
		return connectionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCommunication createEventCommunication() {
		EventCommunicationImpl eventCommunication = new EventCommunicationImpl();
		return eventCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FIFOCommunication createFIFOCommunication() {
		FIFOCommunicationImpl fifoCommunication = new FIFOCommunicationImpl();
		return fifoCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptCommunication createInterruptCommunication() {
		InterruptCommunicationImpl interruptCommunication = new InterruptCommunicationImpl();
		return interruptCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latency createLatency() {
		LatencyImpl latency = new LatencyImpl();
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterComponent createMasterComponent() {
		MasterComponentImpl masterComponent = new MasterComponentImpl();
		return masterComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterSlaveBinding createMasterSlaveBinding() {
		MasterSlaveBindingImpl masterSlaveBinding = new MasterSlaveBindingImpl();
		return masterSlaveBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterSlaveBindingSet createMasterSlaveBindingSet() {
		MasterSlaveBindingSetImpl masterSlaveBindingSet = new MasterSlaveBindingSetImpl();
		return masterSlaveBindingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryConsistencyModel createMemoryConsistencyModel() {
		MemoryConsistencyModelImpl memoryConsistencyModel = new MemoryConsistencyModelImpl();
		return memoryConsistencyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance createPerformance() {
		PerformanceImpl performance = new PerformanceImpl();
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceSet createPerformanceSet() {
		PerformanceSetImpl performanceSet = new PerformanceSetImpl();
		return performanceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pitch createPitch() {
		PitchImpl pitch = new PitchImpl();
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedMemoryCommunication createSharedMemoryCommunication() {
		SharedMemoryCommunicationImpl sharedMemoryCommunication = new SharedMemoryCommunicationImpl();
		return sharedMemoryCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedRegisterCommunication createSharedRegisterCommunication() {
		SharedRegisterCommunicationImpl sharedRegisterCommunication = new SharedRegisterCommunicationImpl();
		return sharedRegisterCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaveComponent createSlaveComponent() {
		SlaveComponentImpl slaveComponent = new SlaveComponentImpl();
		return slaveComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSpace createSubSpace() {
		SubSpaceImpl subSpace = new SubSpaceImpl();
		return subSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemConfiguration createSystemConfiguration() {
		SystemConfigurationImpl systemConfiguration = new SystemConfigurationImpl();
		return systemConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheCoherencyType createCacheCoherencyTypeFromString(EDataType eDataType, String initialValue) {
		CacheCoherencyType result = CacheCoherencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheCoherencyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType createCacheTypeFromString(EDataType eDataType, String initialValue) {
		CacheType result = CacheType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianType createEndianTypeFromString(EDataType eDataType, String initialValue) {
		EndianType result = EndianType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockDownType createLockDownTypeFromString(EDataType eDataType, String initialValue) {
		LockDownType result = LockDownType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLockDownTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterType createMasterTypeFromString(EDataType eDataType, String initialValue) {
		MasterType result = MasterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMasterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		OperationType result = OperationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType createOrderingTypeFromString(EDataType eDataType, String initialValue) {
		OrderingType result = OrderingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWType createRWTypeFromString(EDataType eDataType, String initialValue) {
		RWType result = RWType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRWTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeUnitType createSizeUnitTypeFromString(EDataType eDataType, String initialValue) {
		SizeUnitType result = SizeUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheCoherencyType createCacheCoherencyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCacheCoherencyTypeFromString(ShimPackage.Literals.CACHE_COHERENCY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheCoherencyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCacheCoherencyTypeToString(ShimPackage.Literals.CACHE_COHERENCY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType createCacheTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCacheTypeFromString(ShimPackage.Literals.CACHE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCacheTypeToString(ShimPackage.Literals.CACHE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianType createEndianTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEndianTypeFromString(ShimPackage.Literals.ENDIAN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndianTypeToString(ShimPackage.Literals.ENDIAN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockDownType createLockDownTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLockDownTypeFromString(ShimPackage.Literals.LOCK_DOWN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLockDownTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLockDownTypeToString(ShimPackage.Literals.LOCK_DOWN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterType createMasterTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMasterTypeFromString(ShimPackage.Literals.MASTER_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMasterTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMasterTypeToString(ShimPackage.Literals.MASTER_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOperationTypeFromString(ShimPackage.Literals.OPERATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperationTypeToString(ShimPackage.Literals.OPERATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType createOrderingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOrderingTypeFromString(ShimPackage.Literals.ORDERING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrderingTypeToString(ShimPackage.Literals.ORDERING_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWType createRWTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRWTypeFromString(ShimPackage.Literals.RW_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRWTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRWTypeToString(ShimPackage.Literals.RW_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeUnitType createSizeUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSizeUnitTypeFromString(ShimPackage.Literals.SIZE_UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSizeUnitTypeToString(ShimPackage.Literals.SIZE_UNIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimPackage getShimPackage() {
		return (ShimPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShimPackage getPackage() {
		return ShimPackage.eINSTANCE;
	}

} //ShimFactoryImpl
