/**
 */
package org.multicore_association.shim.model.shim.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.multicore_association.shim.model.shim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage
 * @generated
 */
public class ShimValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ShimValidator INSTANCE = new ShimValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.multicore_association.shim.model.shim";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return ShimPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case ShimPackage.ABSTRACT_COMMUNICATION:
			return validateAbstractCommunication((AbstractCommunication) value, diagnostics, context);
		case ShimPackage.ABSTRACT_COMPONENT:
			return validateAbstractComponent((AbstractComponent) value, diagnostics, context);
		case ShimPackage.ABSTRACT_INSTRUCTION:
			return validateAbstractInstruction((AbstractInstruction) value, diagnostics, context);
		case ShimPackage.ABSTRACT_PERFORMANCE:
			return validateAbstractPerformance((AbstractPerformance) value, diagnostics, context);
		case ShimPackage.ABSTRACT_SHIM:
			return validateAbstractShim((AbstractShim) value, diagnostics, context);
		case ShimPackage.ACCESSOR:
			return validateAccessor((Accessor) value, diagnostics, context);
		case ShimPackage.ACCESS_TYPE:
			return validateAccessType((AccessType) value, diagnostics, context);
		case ShimPackage.ACCESS_TYPE_SET:
			return validateAccessTypeSet((AccessTypeSet) value, diagnostics, context);
		case ShimPackage.ADDRESS_SPACE:
			return validateAddressSpace((AddressSpace) value, diagnostics, context);
		case ShimPackage.ADDRESS_SPACE_SET:
			return validateAddressSpaceSet((AddressSpaceSet) value, diagnostics, context);
		case ShimPackage.CACHE:
			return validateCache((Cache) value, diagnostics, context);
		case ShimPackage.CLOCK_FREQUENCY:
			return validateClockFrequency((ClockFrequency) value, diagnostics, context);
		case ShimPackage.COMMON_INSTRUCTION_SET:
			return validateCommonInstructionSet((CommonInstructionSet) value, diagnostics, context);
		case ShimPackage.COMMUNICATION_SET:
			return validateCommunicationSet((CommunicationSet) value, diagnostics, context);
		case ShimPackage.COMPONENT_SET:
			return validateComponentSet((ComponentSet) value, diagnostics, context);
		case ShimPackage.CONNECTION:
			return validateConnection((Connection) value, diagnostics, context);
		case ShimPackage.CONNECTION_SET:
			return validateConnectionSet((ConnectionSet) value, diagnostics, context);
		case ShimPackage.CONTENTION_GROUP:
			return validateContentionGroup((ContentionGroup) value, diagnostics, context);
		case ShimPackage.CONTENTION_GROUP_SET:
			return validateContentionGroupSet((ContentionGroupSet) value, diagnostics, context);
		case ShimPackage.CUSTOM_INSTRUCTION:
			return validateCustomInstruction((CustomInstruction) value, diagnostics, context);
		case ShimPackage.DATA_RATE:
			return validateDataRate((DataRate) value, diagnostics, context);
		case ShimPackage.DOCUMENT_ROOT:
			return validateDocumentRoot((DocumentRoot) value, diagnostics, context);
		case ShimPackage.EVENT_COMMUNICATION:
			return validateEventCommunication((EventCommunication) value, diagnostics, context);
		case ShimPackage.FIFO_COMMUNICATION:
			return validateFIFOCommunication((FIFOCommunication) value, diagnostics, context);
		case ShimPackage.FREQUENCY_DOMAIN:
			return validateFrequencyDomain((FrequencyDomain) value, diagnostics, context);
		case ShimPackage.FREQUENCY_VOLTAGE_SET:
			return validateFrequencyVoltageSet((FrequencyVoltageSet) value, diagnostics, context);
		case ShimPackage.FUNCTIONAL_UNIT:
			return validateFunctionalUnit((FunctionalUnit) value, diagnostics, context);
		case ShimPackage.FUNCTIONAL_UNIT_SET:
			return validateFunctionalUnitSet((FunctionalUnitSet) value, diagnostics, context);
		case ShimPackage.FUNCTIONAL_UNIT_SET_FILE:
			return validateFunctionalUnitSetFile((FunctionalUnitSetFile) value, diagnostics, context);
		case ShimPackage.INSTRUCTION:
			return validateInstruction((Instruction) value, diagnostics, context);
		case ShimPackage.INSTRUCTION_INPUT:
			return validateInstructionInput((InstructionInput) value, diagnostics, context);
		case ShimPackage.INSTRUCTION_OPERATION:
			return validateInstructionOperation((InstructionOperation) value, diagnostics, context);
		case ShimPackage.INSTRUCTION_OUTPUT:
			return validateInstructionOutput((InstructionOutput) value, diagnostics, context);
		case ShimPackage.INTERRUPT_COMMUNICATION:
			return validateInterruptCommunication((InterruptCommunication) value, diagnostics, context);
		case ShimPackage.LATENCY:
			return validateLatency((Latency) value, diagnostics, context);
		case ShimPackage.MASTER_COMPONENT:
			return validateMasterComponent((MasterComponent) value, diagnostics, context);
		case ShimPackage.MASTER_SLAVE_BINDING:
			return validateMasterSlaveBinding((MasterSlaveBinding) value, diagnostics, context);
		case ShimPackage.MASTER_SLAVE_BINDING_SET:
			return validateMasterSlaveBindingSet((MasterSlaveBindingSet) value, diagnostics, context);
		case ShimPackage.MEMORY_CONSISTENCY_MODEL:
			return validateMemoryConsistencyModel((MemoryConsistencyModel) value, diagnostics, context);
		case ShimPackage.OPERATING_POINT:
			return validateOperatingPoint((OperatingPoint) value, diagnostics, context);
		case ShimPackage.OPERATING_POINT_SET:
			return validateOperatingPointSet((OperatingPointSet) value, diagnostics, context);
		case ShimPackage.PERFORMANCE:
			return validatePerformance((Performance) value, diagnostics, context);
		case ShimPackage.PERFORMANCE_SET:
			return validatePerformanceSet((PerformanceSet) value, diagnostics, context);
		case ShimPackage.PITCH:
			return validatePitch((Pitch) value, diagnostics, context);
		case ShimPackage.POWER_CONFIGURATION:
			return validatePowerConfiguration((PowerConfiguration) value, diagnostics, context);
		case ShimPackage.POWER_CONSUMPTION:
			return validatePowerConsumption((PowerConsumption) value, diagnostics, context);
		case ShimPackage.POWER_CONSUMPTION_SET:
			return validatePowerConsumptionSet((PowerConsumptionSet) value, diagnostics, context);
		case ShimPackage.SHARED_MEMORY_COMMUNICATION:
			return validateSharedMemoryCommunication((SharedMemoryCommunication) value, diagnostics, context);
		case ShimPackage.SHARED_REGISTER_COMMUNICATION:
			return validateSharedRegisterCommunication((SharedRegisterCommunication) value, diagnostics, context);
		case ShimPackage.SHIM:
			return validateShim((Shim) value, diagnostics, context);
		case ShimPackage.SLAVE_COMPONENT:
			return validateSlaveComponent((SlaveComponent) value, diagnostics, context);
		case ShimPackage.SUB_SPACE:
			return validateSubSpace((SubSpace) value, diagnostics, context);
		case ShimPackage.SYSTEM_CONFIGURATION:
			return validateSystemConfiguration((SystemConfiguration) value, diagnostics, context);
		case ShimPackage.THROUGHPUT:
			return validateThroughput((Throughput) value, diagnostics, context);
		case ShimPackage.VOLTAGE_DOMAIN:
			return validateVoltageDomain((VoltageDomain) value, diagnostics, context);
		case ShimPackage.CACHE_COHERENCY_TYPE:
			return validateCacheCoherencyType((CacheCoherencyType) value, diagnostics, context);
		case ShimPackage.CACHE_PREFETCH_TYPE:
			return validateCachePrefetchType((CachePrefetchType) value, diagnostics, context);
		case ShimPackage.CACHE_REPLACEMENT_TYPE:
			return validateCacheReplacementType((CacheReplacementType) value, diagnostics, context);
		case ShimPackage.CACHE_TYPE:
			return validateCacheType((CacheType) value, diagnostics, context);
		case ShimPackage.CACHE_WRITE_ALLOCATE_TYPE:
			return validateCacheWriteAllocateType((CacheWriteAllocateType) value, diagnostics, context);
		case ShimPackage.CACHE_WRITE_BACK_TYPE:
			return validateCacheWriteBackType((CacheWriteBackType) value, diagnostics, context);
		case ShimPackage.DATA_RATE_UNIT_TYPE:
			return validateDataRateUnitType((DataRateUnitType) value, diagnostics, context);
		case ShimPackage.ENDIAN_TYPE:
			return validateEndianType((EndianType) value, diagnostics, context);
		case ShimPackage.FREQUENCY_UNIT_TYPE:
			return validateFrequencyUnitType((FrequencyUnitType) value, diagnostics, context);
		case ShimPackage.INSTRUCTION_INPUT_TYPE:
			return validateInstructionInputType((InstructionInputType) value, diagnostics, context);
		case ShimPackage.INSTRUCTION_OUTPUT_TYPE:
			return validateInstructionOutputType((InstructionOutputType) value, diagnostics, context);
		case ShimPackage.LOCK_DOWN_TYPE:
			return validateLockDownType((LockDownType) value, diagnostics, context);
		case ShimPackage.MASTER_TYPE:
			return validateMasterType((MasterType) value, diagnostics, context);
		case ShimPackage.OPERAND_ADDRESSING_TYPE:
			return validateOperandAddressingType((OperandAddressingType) value, diagnostics, context);
		case ShimPackage.OPERATION_TYPE:
			return validateOperationType((OperationType) value, diagnostics, context);
		case ShimPackage.ORDERING_TYPE:
			return validateOrderingType((OrderingType) value, diagnostics, context);
		case ShimPackage.POWER_UNIT_TYPE:
			return validatePowerUnitType((PowerUnitType) value, diagnostics, context);
		case ShimPackage.RW_TYPE:
			return validateRWType((RWType) value, diagnostics, context);
		case ShimPackage.SIGNEDNESS_TYPE:
			return validateSignednessType((SignednessType) value, diagnostics, context);
		case ShimPackage.SIZE_UNIT_TYPE:
			return validateSizeUnitType((SizeUnitType) value, diagnostics, context);
		case ShimPackage.THROUGHPUT_UNIT_TYPE:
			return validateThroughputUnitType((ThroughputUnitType) value, diagnostics, context);
		case ShimPackage.VOLTAGE_UNIT_TYPE:
			return validateVoltageUnitType((VoltageUnitType) value, diagnostics, context);
		case ShimPackage.ADDRESS_VALUE_TYPE:
			return validateAddressValueType((Long) value, diagnostics, context);
		case ShimPackage.ADDRESS_VALUE_OBJECT_TYPE:
			return validateAddressValueObjectType((Long) value, diagnostics, context);
		case ShimPackage.CACHE_COHERENCY_TYPE_OBJECT:
			return validateCacheCoherencyTypeObject((CacheCoherencyType) value, diagnostics, context);
		case ShimPackage.CACHE_PREFETCH_TYPE_OBJECT:
			return validateCachePrefetchTypeObject((CachePrefetchType) value, diagnostics, context);
		case ShimPackage.CACHE_REPLACEMENT_TYPE_OBJECT:
			return validateCacheReplacementTypeObject((CacheReplacementType) value, diagnostics, context);
		case ShimPackage.CACHE_TYPE_OBJECT:
			return validateCacheTypeObject((CacheType) value, diagnostics, context);
		case ShimPackage.CACHE_WRITE_ALLOCATE_TYPE_OBJECT:
			return validateCacheWriteAllocateTypeObject((CacheWriteAllocateType) value, diagnostics, context);
		case ShimPackage.CACHE_WRITE_BACK_TYPE_OBJECT:
			return validateCacheWriteBackTypeObject((CacheWriteBackType) value, diagnostics, context);
		case ShimPackage.DATA_RATE_UNIT_TYPE_OBJECT:
			return validateDataRateUnitTypeObject((DataRateUnitType) value, diagnostics, context);
		case ShimPackage.ENDIAN_TYPE_OBJECT:
			return validateEndianTypeObject((EndianType) value, diagnostics, context);
		case ShimPackage.FREQUENCY_UNIT_TYPE_OBJECT:
			return validateFrequencyUnitTypeObject((FrequencyUnitType) value, diagnostics, context);
		case ShimPackage.INSTRUCTION_INPUT_TYPE_OBJECT:
			return validateInstructionInputTypeObject((InstructionInputType) value, diagnostics, context);
		case ShimPackage.INSTRUCTION_OUTPUT_TYPE_OBJECT:
			return validateInstructionOutputTypeObject((InstructionOutputType) value, diagnostics, context);
		case ShimPackage.LOCK_DOWN_TYPE_OBJECT:
			return validateLockDownTypeObject((LockDownType) value, diagnostics, context);
		case ShimPackage.MASTER_TYPE_OBJECT:
			return validateMasterTypeObject((MasterType) value, diagnostics, context);
		case ShimPackage.OPERAND_ADDRESSING_TYPE_OBJECT:
			return validateOperandAddressingTypeObject((OperandAddressingType) value, diagnostics, context);
		case ShimPackage.OPERATION_TYPE_OBJECT:
			return validateOperationTypeObject((OperationType) value, diagnostics, context);
		case ShimPackage.ORDERING_TYPE_OBJECT:
			return validateOrderingTypeObject((OrderingType) value, diagnostics, context);
		case ShimPackage.POWER_UNIT_TYPE_OBJECT:
			return validatePowerUnitTypeObject((PowerUnitType) value, diagnostics, context);
		case ShimPackage.RW_TYPE_OBJECT:
			return validateRWTypeObject((RWType) value, diagnostics, context);
		case ShimPackage.SIGNEDNESS_TYPE_OBJECT:
			return validateSignednessTypeObject((SignednessType) value, diagnostics, context);
		case ShimPackage.SIZE_UNIT_TYPE_OBJECT:
			return validateSizeUnitTypeObject((SizeUnitType) value, diagnostics, context);
		case ShimPackage.THROUGHPUT_UNIT_TYPE_OBJECT:
			return validateThroughputUnitTypeObject((ThroughputUnitType) value, diagnostics, context);
		case ShimPackage.UNSIGNED_FLOAT_TYPE:
			return validateUnsignedFloatType((Float) value, diagnostics, context);
		case ShimPackage.UNSIGNED_FLOAT_OBJECT_TYPE:
			return validateUnsignedFloatObjectType((Float) value, diagnostics, context);
		case ShimPackage.UNSIGNED_INT_TYPE:
			return validateUnsignedIntType((Integer) value, diagnostics, context);
		case ShimPackage.UNSIGNED_INT_OBJECT_TYPE:
			return validateUnsignedIntObjectType((Integer) value, diagnostics, context);
		case ShimPackage.VOLTAGE_UNIT_TYPE_OBJECT:
			return validateVoltageUnitTypeObject((VoltageUnitType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCommunication(AbstractCommunication abstractCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComponent(AbstractComponent abstractComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractInstruction(AbstractInstruction abstractInstruction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractInstruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPerformance(AbstractPerformance abstractPerformance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractPerformance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractShim(AbstractShim abstractShim, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractShim, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessor(Accessor accessor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessType(AccessType accessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeSet(AccessTypeSet accessTypeSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessTypeSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressSpace(AddressSpace addressSpace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressSpace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressSpaceSet(AddressSpaceSet addressSpaceSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressSpaceSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCache(Cache cache, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cache, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClockFrequency(ClockFrequency clockFrequency, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clockFrequency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommonInstructionSet(CommonInstructionSet commonInstructionSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commonInstructionSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationSet(CommunicationSet communicationSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentSet(ComponentSet componentSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionSet(ConnectionSet connectionSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentionGroup(ContentionGroup contentionGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentionGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentionGroupSet(ContentionGroupSet contentionGroupSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentionGroupSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomInstruction(CustomInstruction customInstruction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customInstruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRate(DataRate dataRate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataRate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventCommunication(EventCommunication eventCommunication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFIFOCommunication(FIFOCommunication fifoCommunication, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fifoCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyDomain(FrequencyDomain frequencyDomain, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frequencyDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyVoltageSet(FrequencyVoltageSet frequencyVoltageSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frequencyVoltageSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalUnit(FunctionalUnit functionalUnit, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalUnit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalUnitSet(FunctionalUnitSet functionalUnitSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalUnitSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalUnitSetFile(FunctionalUnitSetFile functionalUnitSetFile,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalUnitSetFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstruction(Instruction instruction, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionInput(InstructionInput instructionInput, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructionInput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionOperation(InstructionOperation instructionOperation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructionOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionOutput(InstructionOutput instructionOutput, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instructionOutput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterruptCommunication(InterruptCommunication interruptCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interruptCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatency(Latency latency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterComponent(MasterComponent masterComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(masterComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterSlaveBinding(MasterSlaveBinding masterSlaveBinding, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(masterSlaveBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterSlaveBindingSet(MasterSlaveBindingSet masterSlaveBindingSet,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(masterSlaveBindingSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryConsistencyModel(MemoryConsistencyModel memoryConsistencyModel,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryConsistencyModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatingPoint(OperatingPoint operatingPoint, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operatingPoint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperatingPointSet(OperatingPointSet operatingPointSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operatingPointSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformance(Performance performance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceSet(PerformanceSet performanceSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePitch(Pitch pitch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pitch, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerConfiguration(PowerConfiguration powerConfiguration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerConsumption(PowerConsumption powerConsumption, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerConsumption, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerConsumptionSet(PowerConsumptionSet powerConsumptionSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(powerConsumptionSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedMemoryCommunication(SharedMemoryCommunication sharedMemoryCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sharedMemoryCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharedRegisterCommunication(SharedRegisterCommunication sharedRegisterCommunication,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sharedRegisterCommunication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShim(Shim shim, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shim, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlaveComponent(SlaveComponent slaveComponent, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slaveComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubSpace(SubSpace subSpace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subSpace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemConfiguration(SystemConfiguration systemConfiguration, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemConfiguration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThroughput(Throughput throughput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(throughput, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageDomain(VoltageDomain voltageDomain, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(voltageDomain, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheCoherencyType(CacheCoherencyType cacheCoherencyType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCachePrefetchType(CachePrefetchType cachePrefetchType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheReplacementType(CacheReplacementType cacheReplacementType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheType(CacheType cacheType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheWriteAllocateType(CacheWriteAllocateType cacheWriteAllocateType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheWriteBackType(CacheWriteBackType cacheWriteBackType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRateUnitType(DataRateUnitType dataRateUnitType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndianType(EndianType endianType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyUnitType(FrequencyUnitType frequencyUnitType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionInputType(InstructionInputType instructionInputType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionOutputType(InstructionOutputType instructionOutputType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLockDownType(LockDownType lockDownType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterType(MasterType masterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperandAddressingType(OperandAddressingType operandAddressingType,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationType(OperationType operationType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderingType(OrderingType orderingType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerUnitType(PowerUnitType powerUnitType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRWType(RWType rwType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignednessType(SignednessType signednessType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeUnitType(SizeUnitType sizeUnitType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThroughputUnitType(ThroughputUnitType throughputUnitType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageUnitType(VoltageUnitType voltageUnitType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressValueType(long addressValueType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateAddressValueType_Min(addressValueType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAddressValueType_Min
	 */
	public static final long ADDRESS_VALUE_TYPE__MIN__VALUE = 0L;

	/**
	 * Validates the Min constraint of '<em>Address Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressValueType_Min(long addressValueType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = addressValueType >= ADDRESS_VALUE_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ShimPackage.Literals.ADDRESS_VALUE_TYPE, addressValueType,
					ADDRESS_VALUE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressValueObjectType(Long addressValueObjectType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateAddressValueObjectType_Min(addressValueObjectType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAddressValueObjectType_Min
	 */
	public static final Long ADDRESS_VALUE_OBJECT_TYPE__MIN__VALUE = new Long(0L);

	/**
	 * Validates the Min constraint of '<em>Address Value Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressValueObjectType_Min(Long addressValueObjectType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = addressValueObjectType.compareTo(ADDRESS_VALUE_OBJECT_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(ShimPackage.Literals.ADDRESS_VALUE_OBJECT_TYPE, addressValueObjectType,
					ADDRESS_VALUE_OBJECT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheCoherencyTypeObject(CacheCoherencyType cacheCoherencyTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCachePrefetchTypeObject(CachePrefetchType cachePrefetchTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheReplacementTypeObject(CacheReplacementType cacheReplacementTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheTypeObject(CacheType cacheTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheWriteAllocateTypeObject(CacheWriteAllocateType cacheWriteAllocateTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheWriteBackTypeObject(CacheWriteBackType cacheWriteBackTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataRateUnitTypeObject(DataRateUnitType dataRateUnitTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndianTypeObject(EndianType endianTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyUnitTypeObject(FrequencyUnitType frequencyUnitTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionInputTypeObject(InstructionInputType instructionInputTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstructionOutputTypeObject(InstructionOutputType instructionOutputTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLockDownTypeObject(LockDownType lockDownTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMasterTypeObject(MasterType masterTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperandAddressingTypeObject(OperandAddressingType operandAddressingTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationTypeObject(OperationType operationTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrderingTypeObject(OrderingType orderingTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerUnitTypeObject(PowerUnitType powerUnitTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRWTypeObject(RWType rwTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignednessTypeObject(SignednessType signednessTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSizeUnitTypeObject(SizeUnitType sizeUnitTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThroughputUnitTypeObject(ThroughputUnitType throughputUnitTypeObject,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedFloatType(float unsignedFloatType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateUnsignedFloatType_Min(unsignedFloatType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnsignedFloatType_Min
	 */
	public static final float UNSIGNED_FLOAT_TYPE__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Unsigned Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedFloatType_Min(float unsignedFloatType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = unsignedFloatType >= UNSIGNED_FLOAT_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ShimPackage.Literals.UNSIGNED_FLOAT_TYPE, unsignedFloatType,
					UNSIGNED_FLOAT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedFloatObjectType(Float unsignedFloatObjectType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateUnsignedFloatObjectType_Min(unsignedFloatObjectType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnsignedFloatObjectType_Min
	 */
	public static final Float UNSIGNED_FLOAT_OBJECT_TYPE__MIN__VALUE = new Float(0.0F);

	/**
	 * Validates the Min constraint of '<em>Unsigned Float Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedFloatObjectType_Min(Float unsignedFloatObjectType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = unsignedFloatObjectType.compareTo(UNSIGNED_FLOAT_OBJECT_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(ShimPackage.Literals.UNSIGNED_FLOAT_OBJECT_TYPE, unsignedFloatObjectType,
					UNSIGNED_FLOAT_OBJECT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntType(int unsignedIntType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateUnsignedIntType_Min(unsignedIntType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnsignedIntType_Min
	 */
	public static final int UNSIGNED_INT_TYPE__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Unsigned Int Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntType_Min(int unsignedIntType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = unsignedIntType >= UNSIGNED_INT_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ShimPackage.Literals.UNSIGNED_INT_TYPE, unsignedIntType, UNSIGNED_INT_TYPE__MIN__VALUE,
					true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntObjectType(Integer unsignedIntObjectType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateUnsignedIntObjectType_Min(unsignedIntObjectType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUnsignedIntObjectType_Min
	 */
	public static final Integer UNSIGNED_INT_OBJECT_TYPE__MIN__VALUE = new Integer(0);

	/**
	 * Validates the Min constraint of '<em>Unsigned Int Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnsignedIntObjectType_Min(Integer unsignedIntObjectType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = unsignedIntObjectType.compareTo(UNSIGNED_INT_OBJECT_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(ShimPackage.Literals.UNSIGNED_INT_OBJECT_TYPE, unsignedIntObjectType,
					UNSIGNED_INT_OBJECT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVoltageUnitTypeObject(VoltageUnitType voltageUnitTypeObject, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ShimValidator
