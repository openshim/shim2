/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.multicore_association.shim.model.shim.*;

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
			ShimFactory theShimFactory = (ShimFactory) EPackage.Registry.INSTANCE.getEFactory(ShimPackage.eNS_URI);
			if (theShimFactory != null) {
				return theShimFactory;
			}
		} catch (Exception exception) {
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
		case ShimPackage.ACCESSOR:
			return createAccessor();
		case ShimPackage.ACCESS_TYPE:
			return createAccessType();
		case ShimPackage.ACCESS_TYPE_SET:
			return createAccessTypeSet();
		case ShimPackage.ADDRESS_SPACE:
			return createAddressSpace();
		case ShimPackage.ADDRESS_SPACE_SET:
			return createAddressSpaceSet();
		case ShimPackage.CACHE:
			return createCache();
		case ShimPackage.CLOCK_FREQUENCY:
			return createClockFrequency();
		case ShimPackage.COMMON_INSTRUCTION_SET:
			return createCommonInstructionSet();
		case ShimPackage.COMMUNICATION_SET:
			return createCommunicationSet();
		case ShimPackage.COMPONENT_SET:
			return createComponentSet();
		case ShimPackage.CONNECTION:
			return createConnection();
		case ShimPackage.CONNECTION_SET:
			return createConnectionSet();
		case ShimPackage.CONTENTION_GROUP:
			return createContentionGroup();
		case ShimPackage.CONTENTION_GROUP_SET:
			return createContentionGroupSet();
		case ShimPackage.CUSTOM_INSTRUCTION:
			return createCustomInstruction();
		case ShimPackage.DATA_RATE:
			return createDataRate();
		case ShimPackage.DOCUMENT_ROOT:
			return createDocumentRoot();
		case ShimPackage.EVENT_COMMUNICATION:
			return createEventCommunication();
		case ShimPackage.FIFO_COMMUNICATION:
			return createFIFOCommunication();
		case ShimPackage.FREQUENCY_DOMAIN:
			return createFrequencyDomain();
		case ShimPackage.FREQUENCY_VOLTAGE_SET:
			return createFrequencyVoltageSet();
		case ShimPackage.FUNCTIONAL_UNIT:
			return createFunctionalUnit();
		case ShimPackage.FUNCTIONAL_UNIT_SET:
			return createFunctionalUnitSet();
		case ShimPackage.FUNCTIONAL_UNIT_SET_FILE:
			return createFunctionalUnitSetFile();
		case ShimPackage.INSTRUCTION:
			return createInstruction();
		case ShimPackage.INSTRUCTION_INPUT:
			return createInstructionInput();
		case ShimPackage.INSTRUCTION_OPERATION:
			return createInstructionOperation();
		case ShimPackage.INSTRUCTION_OUTPUT:
			return createInstructionOutput();
		case ShimPackage.INTERRUPT_COMMUNICATION:
			return createInterruptCommunication();
		case ShimPackage.LATENCY:
			return createLatency();
		case ShimPackage.MASTER_COMPONENT:
			return createMasterComponent();
		case ShimPackage.MASTER_SLAVE_BINDING:
			return createMasterSlaveBinding();
		case ShimPackage.MASTER_SLAVE_BINDING_SET:
			return createMasterSlaveBindingSet();
		case ShimPackage.MEMORY_CONSISTENCY_MODEL:
			return createMemoryConsistencyModel();
		case ShimPackage.OPERATING_POINT:
			return createOperatingPoint();
		case ShimPackage.OPERATING_POINT_SET:
			return createOperatingPointSet();
		case ShimPackage.PERFORMANCE:
			return createPerformance();
		case ShimPackage.PERFORMANCE_SET:
			return createPerformanceSet();
		case ShimPackage.PITCH:
			return createPitch();
		case ShimPackage.POWER_CONFIGURATION:
			return createPowerConfiguration();
		case ShimPackage.POWER_CONSUMPTION:
			return createPowerConsumption();
		case ShimPackage.POWER_CONSUMPTION_SET:
			return createPowerConsumptionSet();
		case ShimPackage.SHARED_MEMORY_COMMUNICATION:
			return createSharedMemoryCommunication();
		case ShimPackage.SHARED_REGISTER_COMMUNICATION:
			return createSharedRegisterCommunication();
		case ShimPackage.SHIM:
			return createShim();
		case ShimPackage.SLAVE_COMPONENT:
			return createSlaveComponent();
		case ShimPackage.SUB_SPACE:
			return createSubSpace();
		case ShimPackage.SYSTEM_CONFIGURATION:
			return createSystemConfiguration();
		case ShimPackage.THROUGHPUT:
			return createThroughput();
		case ShimPackage.VOLTAGE_DOMAIN:
			return createVoltageDomain();
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
		case ShimPackage.CACHE_PREFETCH_TYPE:
			return createCachePrefetchTypeFromString(eDataType, initialValue);
		case ShimPackage.CACHE_REPLACEMENT_TYPE:
			return createCacheReplacementTypeFromString(eDataType, initialValue);
		case ShimPackage.CACHE_TYPE:
			return createCacheTypeFromString(eDataType, initialValue);
		case ShimPackage.CACHE_WRITE_ALLOCATE_TYPE:
			return createCacheWriteAllocateTypeFromString(eDataType, initialValue);
		case ShimPackage.CACHE_WRITE_BACK_TYPE:
			return createCacheWriteBackTypeFromString(eDataType, initialValue);
		case ShimPackage.DATA_RATE_UNIT_TYPE:
			return createDataRateUnitTypeFromString(eDataType, initialValue);
		case ShimPackage.ENDIAN_TYPE:
			return createEndianTypeFromString(eDataType, initialValue);
		case ShimPackage.FREQUENCY_UNIT_TYPE:
			return createFrequencyUnitTypeFromString(eDataType, initialValue);
		case ShimPackage.INSTRUCTION_INPUT_TYPE:
			return createInstructionInputTypeFromString(eDataType, initialValue);
		case ShimPackage.INSTRUCTION_OUTPUT_TYPE:
			return createInstructionOutputTypeFromString(eDataType, initialValue);
		case ShimPackage.LOCK_DOWN_TYPE:
			return createLockDownTypeFromString(eDataType, initialValue);
		case ShimPackage.MASTER_TYPE:
			return createMasterTypeFromString(eDataType, initialValue);
		case ShimPackage.OPERAND_ADDRESSING_TYPE:
			return createOperandAddressingTypeFromString(eDataType, initialValue);
		case ShimPackage.OPERATION_TYPE:
			return createOperationTypeFromString(eDataType, initialValue);
		case ShimPackage.ORDERING_TYPE:
			return createOrderingTypeFromString(eDataType, initialValue);
		case ShimPackage.POWER_UNIT_TYPE:
			return createPowerUnitTypeFromString(eDataType, initialValue);
		case ShimPackage.RW_TYPE:
			return createRWTypeFromString(eDataType, initialValue);
		case ShimPackage.SIGNEDNESS_TYPE:
			return createSignednessTypeFromString(eDataType, initialValue);
		case ShimPackage.SIZE_UNIT_TYPE:
			return createSizeUnitTypeFromString(eDataType, initialValue);
		case ShimPackage.THROUGHPUT_UNIT_TYPE:
			return createThroughputUnitTypeFromString(eDataType, initialValue);
		case ShimPackage.VOLTAGE_UNIT_TYPE:
			return createVoltageUnitTypeFromString(eDataType, initialValue);
		case ShimPackage.ADDRESS_VALUE_TYPE:
			return createAddressValueTypeFromString(eDataType, initialValue);
		case ShimPackage.ADDRESS_VALUE_OBJECT_TYPE:
			return createAddressValueObjectTypeFromString(eDataType, initialValue);
		case ShimPackage.CACHE_COHERENCY_TYPE_OBJECT:
			return createCacheCoherencyTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.CACHE_PREFETCH_TYPE_OBJECT:
			return createCachePrefetchTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.CACHE_REPLACEMENT_TYPE_OBJECT:
			return createCacheReplacementTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.CACHE_TYPE_OBJECT:
			return createCacheTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.CACHE_WRITE_ALLOCATE_TYPE_OBJECT:
			return createCacheWriteAllocateTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.CACHE_WRITE_BACK_TYPE_OBJECT:
			return createCacheWriteBackTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.DATA_RATE_UNIT_TYPE_OBJECT:
			return createDataRateUnitTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.ENDIAN_TYPE_OBJECT:
			return createEndianTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.FREQUENCY_UNIT_TYPE_OBJECT:
			return createFrequencyUnitTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.INSTRUCTION_INPUT_TYPE_OBJECT:
			return createInstructionInputTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.INSTRUCTION_OUTPUT_TYPE_OBJECT:
			return createInstructionOutputTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.LOCK_DOWN_TYPE_OBJECT:
			return createLockDownTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.MASTER_TYPE_OBJECT:
			return createMasterTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.OPERAND_ADDRESSING_TYPE_OBJECT:
			return createOperandAddressingTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.OPERATION_TYPE_OBJECT:
			return createOperationTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.ORDERING_TYPE_OBJECT:
			return createOrderingTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.POWER_UNIT_TYPE_OBJECT:
			return createPowerUnitTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.RW_TYPE_OBJECT:
			return createRWTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.SIGNEDNESS_TYPE_OBJECT:
			return createSignednessTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.SIZE_UNIT_TYPE_OBJECT:
			return createSizeUnitTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.THROUGHPUT_UNIT_TYPE_OBJECT:
			return createThroughputUnitTypeObjectFromString(eDataType, initialValue);
		case ShimPackage.UNSIGNED_FLOAT_TYPE:
			return createUnsignedFloatTypeFromString(eDataType, initialValue);
		case ShimPackage.UNSIGNED_FLOAT_OBJECT_TYPE:
			return createUnsignedFloatObjectTypeFromString(eDataType, initialValue);
		case ShimPackage.UNSIGNED_INT_TYPE:
			return createUnsignedIntTypeFromString(eDataType, initialValue);
		case ShimPackage.UNSIGNED_INT_OBJECT_TYPE:
			return createUnsignedIntObjectTypeFromString(eDataType, initialValue);
		case ShimPackage.VOLTAGE_UNIT_TYPE_OBJECT:
			return createVoltageUnitTypeObjectFromString(eDataType, initialValue);
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
		case ShimPackage.CACHE_PREFETCH_TYPE:
			return convertCachePrefetchTypeToString(eDataType, instanceValue);
		case ShimPackage.CACHE_REPLACEMENT_TYPE:
			return convertCacheReplacementTypeToString(eDataType, instanceValue);
		case ShimPackage.CACHE_TYPE:
			return convertCacheTypeToString(eDataType, instanceValue);
		case ShimPackage.CACHE_WRITE_ALLOCATE_TYPE:
			return convertCacheWriteAllocateTypeToString(eDataType, instanceValue);
		case ShimPackage.CACHE_WRITE_BACK_TYPE:
			return convertCacheWriteBackTypeToString(eDataType, instanceValue);
		case ShimPackage.DATA_RATE_UNIT_TYPE:
			return convertDataRateUnitTypeToString(eDataType, instanceValue);
		case ShimPackage.ENDIAN_TYPE:
			return convertEndianTypeToString(eDataType, instanceValue);
		case ShimPackage.FREQUENCY_UNIT_TYPE:
			return convertFrequencyUnitTypeToString(eDataType, instanceValue);
		case ShimPackage.INSTRUCTION_INPUT_TYPE:
			return convertInstructionInputTypeToString(eDataType, instanceValue);
		case ShimPackage.INSTRUCTION_OUTPUT_TYPE:
			return convertInstructionOutputTypeToString(eDataType, instanceValue);
		case ShimPackage.LOCK_DOWN_TYPE:
			return convertLockDownTypeToString(eDataType, instanceValue);
		case ShimPackage.MASTER_TYPE:
			return convertMasterTypeToString(eDataType, instanceValue);
		case ShimPackage.OPERAND_ADDRESSING_TYPE:
			return convertOperandAddressingTypeToString(eDataType, instanceValue);
		case ShimPackage.OPERATION_TYPE:
			return convertOperationTypeToString(eDataType, instanceValue);
		case ShimPackage.ORDERING_TYPE:
			return convertOrderingTypeToString(eDataType, instanceValue);
		case ShimPackage.POWER_UNIT_TYPE:
			return convertPowerUnitTypeToString(eDataType, instanceValue);
		case ShimPackage.RW_TYPE:
			return convertRWTypeToString(eDataType, instanceValue);
		case ShimPackage.SIGNEDNESS_TYPE:
			return convertSignednessTypeToString(eDataType, instanceValue);
		case ShimPackage.SIZE_UNIT_TYPE:
			return convertSizeUnitTypeToString(eDataType, instanceValue);
		case ShimPackage.THROUGHPUT_UNIT_TYPE:
			return convertThroughputUnitTypeToString(eDataType, instanceValue);
		case ShimPackage.VOLTAGE_UNIT_TYPE:
			return convertVoltageUnitTypeToString(eDataType, instanceValue);
		case ShimPackage.ADDRESS_VALUE_TYPE:
			return convertAddressValueTypeToString(eDataType, instanceValue);
		case ShimPackage.ADDRESS_VALUE_OBJECT_TYPE:
			return convertAddressValueObjectTypeToString(eDataType, instanceValue);
		case ShimPackage.CACHE_COHERENCY_TYPE_OBJECT:
			return convertCacheCoherencyTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.CACHE_PREFETCH_TYPE_OBJECT:
			return convertCachePrefetchTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.CACHE_REPLACEMENT_TYPE_OBJECT:
			return convertCacheReplacementTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.CACHE_TYPE_OBJECT:
			return convertCacheTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.CACHE_WRITE_ALLOCATE_TYPE_OBJECT:
			return convertCacheWriteAllocateTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.CACHE_WRITE_BACK_TYPE_OBJECT:
			return convertCacheWriteBackTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.DATA_RATE_UNIT_TYPE_OBJECT:
			return convertDataRateUnitTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.ENDIAN_TYPE_OBJECT:
			return convertEndianTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.FREQUENCY_UNIT_TYPE_OBJECT:
			return convertFrequencyUnitTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.INSTRUCTION_INPUT_TYPE_OBJECT:
			return convertInstructionInputTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.INSTRUCTION_OUTPUT_TYPE_OBJECT:
			return convertInstructionOutputTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.LOCK_DOWN_TYPE_OBJECT:
			return convertLockDownTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.MASTER_TYPE_OBJECT:
			return convertMasterTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.OPERAND_ADDRESSING_TYPE_OBJECT:
			return convertOperandAddressingTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.OPERATION_TYPE_OBJECT:
			return convertOperationTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.ORDERING_TYPE_OBJECT:
			return convertOrderingTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.POWER_UNIT_TYPE_OBJECT:
			return convertPowerUnitTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.RW_TYPE_OBJECT:
			return convertRWTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.SIGNEDNESS_TYPE_OBJECT:
			return convertSignednessTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.SIZE_UNIT_TYPE_OBJECT:
			return convertSizeUnitTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.THROUGHPUT_UNIT_TYPE_OBJECT:
			return convertThroughputUnitTypeObjectToString(eDataType, instanceValue);
		case ShimPackage.UNSIGNED_FLOAT_TYPE:
			return convertUnsignedFloatTypeToString(eDataType, instanceValue);
		case ShimPackage.UNSIGNED_FLOAT_OBJECT_TYPE:
			return convertUnsignedFloatObjectTypeToString(eDataType, instanceValue);
		case ShimPackage.UNSIGNED_INT_TYPE:
			return convertUnsignedIntTypeToString(eDataType, instanceValue);
		case ShimPackage.UNSIGNED_INT_OBJECT_TYPE:
			return convertUnsignedIntObjectTypeToString(eDataType, instanceValue);
		case ShimPackage.VOLTAGE_UNIT_TYPE_OBJECT:
			return convertVoltageUnitTypeObjectToString(eDataType, instanceValue);
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
	public ContentionGroup createContentionGroup() {
		ContentionGroupImpl contentionGroup = new ContentionGroupImpl();
		return contentionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentionGroupSet createContentionGroupSet() {
		ContentionGroupSetImpl contentionGroupSet = new ContentionGroupSetImpl();
		return contentionGroupSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomInstruction createCustomInstruction() {
		CustomInstructionImpl customInstruction = new CustomInstructionImpl();
		return customInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRate createDataRate() {
		DataRateImpl dataRate = new DataRateImpl();
		return dataRate;
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
	public FrequencyDomain createFrequencyDomain() {
		FrequencyDomainImpl frequencyDomain = new FrequencyDomainImpl();
		return frequencyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyVoltageSet createFrequencyVoltageSet() {
		FrequencyVoltageSetImpl frequencyVoltageSet = new FrequencyVoltageSetImpl();
		return frequencyVoltageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalUnit createFunctionalUnit() {
		FunctionalUnitImpl functionalUnit = new FunctionalUnitImpl();
		return functionalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalUnitSet createFunctionalUnitSet() {
		FunctionalUnitSetImpl functionalUnitSet = new FunctionalUnitSetImpl();
		return functionalUnitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalUnitSetFile createFunctionalUnitSetFile() {
		FunctionalUnitSetFileImpl functionalUnitSetFile = new FunctionalUnitSetFileImpl();
		return functionalUnitSetFile;
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
	public InstructionInput createInstructionInput() {
		InstructionInputImpl instructionInput = new InstructionInputImpl();
		return instructionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionOperation createInstructionOperation() {
		InstructionOperationImpl instructionOperation = new InstructionOperationImpl();
		return instructionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionOutput createInstructionOutput() {
		InstructionOutputImpl instructionOutput = new InstructionOutputImpl();
		return instructionOutput;
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
	public OperatingPoint createOperatingPoint() {
		OperatingPointImpl operatingPoint = new OperatingPointImpl();
		return operatingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingPointSet createOperatingPointSet() {
		OperatingPointSetImpl operatingPointSet = new OperatingPointSetImpl();
		return operatingPointSet;
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
	public PowerConfiguration createPowerConfiguration() {
		PowerConfigurationImpl powerConfiguration = new PowerConfigurationImpl();
		return powerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerConsumption createPowerConsumption() {
		PowerConsumptionImpl powerConsumption = new PowerConsumptionImpl();
		return powerConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerConsumptionSet createPowerConsumptionSet() {
		PowerConsumptionSetImpl powerConsumptionSet = new PowerConsumptionSetImpl();
		return powerConsumptionSet;
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
	public Shim createShim() {
		ShimImpl shim = new ShimImpl();
		return shim;
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
	public Throughput createThroughput() {
		ThroughputImpl throughput = new ThroughputImpl();
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageDomain createVoltageDomain() {
		VoltageDomainImpl voltageDomain = new VoltageDomainImpl();
		return voltageDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheCoherencyType createCacheCoherencyTypeFromString(EDataType eDataType, String initialValue) {
		CacheCoherencyType result = CacheCoherencyType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public CachePrefetchType createCachePrefetchTypeFromString(EDataType eDataType, String initialValue) {
		CachePrefetchType result = CachePrefetchType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCachePrefetchTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheReplacementType createCacheReplacementTypeFromString(EDataType eDataType, String initialValue) {
		CacheReplacementType result = CacheReplacementType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheReplacementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType createCacheTypeFromString(EDataType eDataType, String initialValue) {
		CacheType result = CacheType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public CacheWriteAllocateType createCacheWriteAllocateTypeFromString(EDataType eDataType, String initialValue) {
		CacheWriteAllocateType result = CacheWriteAllocateType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheWriteAllocateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheWriteBackType createCacheWriteBackTypeFromString(EDataType eDataType, String initialValue) {
		CacheWriteBackType result = CacheWriteBackType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheWriteBackTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRateUnitType createDataRateUnitTypeFromString(EDataType eDataType, String initialValue) {
		DataRateUnitType result = DataRateUnitType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataRateUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianType createEndianTypeFromString(EDataType eDataType, String initialValue) {
		EndianType result = EndianType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public FrequencyUnitType createFrequencyUnitTypeFromString(EDataType eDataType, String initialValue) {
		FrequencyUnitType result = FrequencyUnitType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionInputType createInstructionInputTypeFromString(EDataType eDataType, String initialValue) {
		InstructionInputType result = InstructionInputType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstructionInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionOutputType createInstructionOutputTypeFromString(EDataType eDataType, String initialValue) {
		InstructionOutputType result = InstructionOutputType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstructionOutputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockDownType createLockDownTypeFromString(EDataType eDataType, String initialValue) {
		LockDownType result = LockDownType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public OperandAddressingType createOperandAddressingTypeFromString(EDataType eDataType, String initialValue) {
		OperandAddressingType result = OperandAddressingType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperandAddressingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationType createOperationTypeFromString(EDataType eDataType, String initialValue) {
		OperationType result = OperationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public PowerUnitType createPowerUnitTypeFromString(EDataType eDataType, String initialValue) {
		PowerUnitType result = PowerUnitType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPowerUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWType createRWTypeFromString(EDataType eDataType, String initialValue) {
		RWType result = RWType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public SignednessType createSignednessTypeFromString(EDataType eDataType, String initialValue) {
		SignednessType result = SignednessType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignednessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeUnitType createSizeUnitTypeFromString(EDataType eDataType, String initialValue) {
		SizeUnitType result = SizeUnitType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
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
	public ThroughputUnitType createThroughputUnitTypeFromString(EDataType eDataType, String initialValue) {
		ThroughputUnitType result = ThroughputUnitType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThroughputUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageUnitType createVoltageUnitTypeFromString(EDataType eDataType, String initialValue) {
		VoltageUnitType result = VoltageUnitType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoltageUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createAddressValueTypeFromString(EDataType eDataType, String initialValue) {
		return (Long) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressValueTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createAddressValueObjectTypeFromString(EDataType eDataType, String initialValue) {
		return (Long) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressValueObjectTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
	public CachePrefetchType createCachePrefetchTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCachePrefetchTypeFromString(ShimPackage.Literals.CACHE_PREFETCH_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCachePrefetchTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCachePrefetchTypeToString(ShimPackage.Literals.CACHE_PREFETCH_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheReplacementType createCacheReplacementTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCacheReplacementTypeFromString(ShimPackage.Literals.CACHE_REPLACEMENT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheReplacementTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCacheReplacementTypeToString(ShimPackage.Literals.CACHE_REPLACEMENT_TYPE, instanceValue);
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
	public CacheWriteAllocateType createCacheWriteAllocateTypeObjectFromString(EDataType eDataType,
			String initialValue) {
		return createCacheWriteAllocateTypeFromString(ShimPackage.Literals.CACHE_WRITE_ALLOCATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheWriteAllocateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCacheWriteAllocateTypeToString(ShimPackage.Literals.CACHE_WRITE_ALLOCATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheWriteBackType createCacheWriteBackTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCacheWriteBackTypeFromString(ShimPackage.Literals.CACHE_WRITE_BACK_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheWriteBackTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCacheWriteBackTypeToString(ShimPackage.Literals.CACHE_WRITE_BACK_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRateUnitType createDataRateUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataRateUnitTypeFromString(ShimPackage.Literals.DATA_RATE_UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataRateUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataRateUnitTypeToString(ShimPackage.Literals.DATA_RATE_UNIT_TYPE, instanceValue);
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
	public FrequencyUnitType createFrequencyUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFrequencyUnitTypeFromString(ShimPackage.Literals.FREQUENCY_UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFrequencyUnitTypeToString(ShimPackage.Literals.FREQUENCY_UNIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionInputType createInstructionInputTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInstructionInputTypeFromString(ShimPackage.Literals.INSTRUCTION_INPUT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstructionInputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInstructionInputTypeToString(ShimPackage.Literals.INSTRUCTION_INPUT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionOutputType createInstructionOutputTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInstructionOutputTypeFromString(ShimPackage.Literals.INSTRUCTION_OUTPUT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInstructionOutputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInstructionOutputTypeToString(ShimPackage.Literals.INSTRUCTION_OUTPUT_TYPE, instanceValue);
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
	public OperandAddressingType createOperandAddressingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createOperandAddressingTypeFromString(ShimPackage.Literals.OPERAND_ADDRESSING_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperandAddressingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOperandAddressingTypeToString(ShimPackage.Literals.OPERAND_ADDRESSING_TYPE, instanceValue);
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
	public PowerUnitType createPowerUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPowerUnitTypeFromString(ShimPackage.Literals.POWER_UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPowerUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPowerUnitTypeToString(ShimPackage.Literals.POWER_UNIT_TYPE, instanceValue);
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
	public SignednessType createSignednessTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignednessTypeFromString(ShimPackage.Literals.SIGNEDNESS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignednessTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignednessTypeToString(ShimPackage.Literals.SIGNEDNESS_TYPE, instanceValue);
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
	public ThroughputUnitType createThroughputUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createThroughputUnitTypeFromString(ShimPackage.Literals.THROUGHPUT_UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThroughputUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertThroughputUnitTypeToString(ShimPackage.Literals.THROUGHPUT_UNIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createUnsignedFloatTypeFromString(EDataType eDataType, String initialValue) {
		return (Float) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedFloatTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createUnsignedFloatObjectTypeFromString(EDataType eDataType, String initialValue) {
		return (Float) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedFloatObjectTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createUnsignedIntTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedIntTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createUnsignedIntObjectTypeFromString(EDataType eDataType, String initialValue) {
		return (Integer) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnsignedIntObjectTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageUnitType createVoltageUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVoltageUnitTypeFromString(ShimPackage.Literals.VOLTAGE_UNIT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVoltageUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVoltageUnitTypeToString(ShimPackage.Literals.VOLTAGE_UNIT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimPackage getShimPackage() {
		return (ShimPackage) getEPackage();
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
