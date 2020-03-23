/**
 */
package org.multicore_association.shim.model.shim.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.multicore_association.shim.model.shim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage
 * @generated
 */
public class ShimSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShimPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimSwitch() {
		if (modelPackage == null) {
			modelPackage = ShimPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ShimPackage.ABSTRACT_COMMUNICATION: {
			AbstractCommunication abstractCommunication = (AbstractCommunication) theEObject;
			T result = caseAbstractCommunication(abstractCommunication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.ABSTRACT_COMPONENT: {
			AbstractComponent abstractComponent = (AbstractComponent) theEObject;
			T result = caseAbstractComponent(abstractComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.ABSTRACT_INSTRUCTION: {
			AbstractInstruction abstractInstruction = (AbstractInstruction) theEObject;
			T result = caseAbstractInstruction(abstractInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.ABSTRACT_PERFORMANCE: {
			AbstractPerformance abstractPerformance = (AbstractPerformance) theEObject;
			T result = caseAbstractPerformance(abstractPerformance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.ABSTRACT_SHIM: {
			AbstractShim abstractShim = (AbstractShim) theEObject;
			T result = caseAbstractShim(abstractShim);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.ACCESSOR: {
			Accessor accessor = (Accessor) theEObject;
			T result = caseAccessor(accessor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.ACCESS_TYPE: {
			AccessType accessType = (AccessType) theEObject;
			T result = caseAccessType(accessType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.ACCESS_TYPE_SET: {
			AccessTypeSet accessTypeSet = (AccessTypeSet) theEObject;
			T result = caseAccessTypeSet(accessTypeSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.ADDRESS_SPACE: {
			AddressSpace addressSpace = (AddressSpace) theEObject;
			T result = caseAddressSpace(addressSpace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.ADDRESS_SPACE_SET: {
			AddressSpaceSet addressSpaceSet = (AddressSpaceSet) theEObject;
			T result = caseAddressSpaceSet(addressSpaceSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.CACHE: {
			Cache cache = (Cache) theEObject;
			T result = caseCache(cache);
			if (result == null)
				result = caseAbstractComponent(cache);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.CLOCK_FREQUENCY: {
			ClockFrequency clockFrequency = (ClockFrequency) theEObject;
			T result = caseClockFrequency(clockFrequency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.COMMON_INSTRUCTION_SET: {
			CommonInstructionSet commonInstructionSet = (CommonInstructionSet) theEObject;
			T result = caseCommonInstructionSet(commonInstructionSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.COMMUNICATION_SET: {
			CommunicationSet communicationSet = (CommunicationSet) theEObject;
			T result = caseCommunicationSet(communicationSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.COMPONENT_SET: {
			ComponentSet componentSet = (ComponentSet) theEObject;
			T result = caseComponentSet(componentSet);
			if (result == null)
				result = caseAbstractComponent(componentSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.CONNECTION: {
			Connection connection = (Connection) theEObject;
			T result = caseConnection(connection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.CONNECTION_SET: {
			ConnectionSet connectionSet = (ConnectionSet) theEObject;
			T result = caseConnectionSet(connectionSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.CONTENTION_GROUP: {
			ContentionGroup contentionGroup = (ContentionGroup) theEObject;
			T result = caseContentionGroup(contentionGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.CONTENTION_GROUP_SET: {
			ContentionGroupSet contentionGroupSet = (ContentionGroupSet) theEObject;
			T result = caseContentionGroupSet(contentionGroupSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.CUSTOM_INSTRUCTION: {
			CustomInstruction customInstruction = (CustomInstruction) theEObject;
			T result = caseCustomInstruction(customInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.DATA_RATE: {
			DataRate dataRate = (DataRate) theEObject;
			T result = caseDataRate(dataRate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.EVENT_COMMUNICATION: {
			EventCommunication eventCommunication = (EventCommunication) theEObject;
			T result = caseEventCommunication(eventCommunication);
			if (result == null)
				result = caseAbstractCommunication(eventCommunication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.FIFO_COMMUNICATION: {
			FIFOCommunication fifoCommunication = (FIFOCommunication) theEObject;
			T result = caseFIFOCommunication(fifoCommunication);
			if (result == null)
				result = caseAbstractCommunication(fifoCommunication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.FREQUENCY_DOMAIN: {
			FrequencyDomain frequencyDomain = (FrequencyDomain) theEObject;
			T result = caseFrequencyDomain(frequencyDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.FREQUENCY_VOLTAGE_SET: {
			FrequencyVoltageSet frequencyVoltageSet = (FrequencyVoltageSet) theEObject;
			T result = caseFrequencyVoltageSet(frequencyVoltageSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.FUNCTIONAL_UNIT: {
			FunctionalUnit functionalUnit = (FunctionalUnit) theEObject;
			T result = caseFunctionalUnit(functionalUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.FUNCTIONAL_UNIT_SET: {
			FunctionalUnitSet functionalUnitSet = (FunctionalUnitSet) theEObject;
			T result = caseFunctionalUnitSet(functionalUnitSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.FUNCTIONAL_UNIT_SET_FILE: {
			FunctionalUnitSetFile functionalUnitSetFile = (FunctionalUnitSetFile) theEObject;
			T result = caseFunctionalUnitSetFile(functionalUnitSetFile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.INSTRUCTION: {
			Instruction instruction = (Instruction) theEObject;
			T result = caseInstruction(instruction);
			if (result == null)
				result = caseAbstractInstruction(instruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.INSTRUCTION_INPUT: {
			InstructionInput instructionInput = (InstructionInput) theEObject;
			T result = caseInstructionInput(instructionInput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.INSTRUCTION_OPERATION: {
			InstructionOperation instructionOperation = (InstructionOperation) theEObject;
			T result = caseInstructionOperation(instructionOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.INSTRUCTION_OUTPUT: {
			InstructionOutput instructionOutput = (InstructionOutput) theEObject;
			T result = caseInstructionOutput(instructionOutput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.INTERRUPT_COMMUNICATION: {
			InterruptCommunication interruptCommunication = (InterruptCommunication) theEObject;
			T result = caseInterruptCommunication(interruptCommunication);
			if (result == null)
				result = caseAbstractCommunication(interruptCommunication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.LATENCY: {
			Latency latency = (Latency) theEObject;
			T result = caseLatency(latency);
			if (result == null)
				result = caseAbstractPerformance(latency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.MASTER_COMPONENT: {
			MasterComponent masterComponent = (MasterComponent) theEObject;
			T result = caseMasterComponent(masterComponent);
			if (result == null)
				result = caseAbstractComponent(masterComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.MASTER_SLAVE_BINDING: {
			MasterSlaveBinding masterSlaveBinding = (MasterSlaveBinding) theEObject;
			T result = caseMasterSlaveBinding(masterSlaveBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.MASTER_SLAVE_BINDING_SET: {
			MasterSlaveBindingSet masterSlaveBindingSet = (MasterSlaveBindingSet) theEObject;
			T result = caseMasterSlaveBindingSet(masterSlaveBindingSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.MEMORY_CONSISTENCY_MODEL: {
			MemoryConsistencyModel memoryConsistencyModel = (MemoryConsistencyModel) theEObject;
			T result = caseMemoryConsistencyModel(memoryConsistencyModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.OPERATING_POINT: {
			OperatingPoint operatingPoint = (OperatingPoint) theEObject;
			T result = caseOperatingPoint(operatingPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.OPERATING_POINT_SET: {
			OperatingPointSet operatingPointSet = (OperatingPointSet) theEObject;
			T result = caseOperatingPointSet(operatingPointSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.PERFORMANCE: {
			Performance performance = (Performance) theEObject;
			T result = casePerformance(performance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.PERFORMANCE_SET: {
			PerformanceSet performanceSet = (PerformanceSet) theEObject;
			T result = casePerformanceSet(performanceSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.PITCH: {
			Pitch pitch = (Pitch) theEObject;
			T result = casePitch(pitch);
			if (result == null)
				result = caseAbstractPerformance(pitch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.POWER_CONFIGURATION: {
			PowerConfiguration powerConfiguration = (PowerConfiguration) theEObject;
			T result = casePowerConfiguration(powerConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.POWER_CONSUMPTION: {
			PowerConsumption powerConsumption = (PowerConsumption) theEObject;
			T result = casePowerConsumption(powerConsumption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.POWER_CONSUMPTION_SET: {
			PowerConsumptionSet powerConsumptionSet = (PowerConsumptionSet) theEObject;
			T result = casePowerConsumptionSet(powerConsumptionSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.SHARED_MEMORY_COMMUNICATION: {
			SharedMemoryCommunication sharedMemoryCommunication = (SharedMemoryCommunication) theEObject;
			T result = caseSharedMemoryCommunication(sharedMemoryCommunication);
			if (result == null)
				result = caseAbstractCommunication(sharedMemoryCommunication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.SHARED_REGISTER_COMMUNICATION: {
			SharedRegisterCommunication sharedRegisterCommunication = (SharedRegisterCommunication) theEObject;
			T result = caseSharedRegisterCommunication(sharedRegisterCommunication);
			if (result == null)
				result = caseAbstractCommunication(sharedRegisterCommunication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.SHIM: {
			Shim shim = (Shim) theEObject;
			T result = caseShim(shim);
			if (result == null)
				result = caseAbstractShim(shim);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.SLAVE_COMPONENT: {
			SlaveComponent slaveComponent = (SlaveComponent) theEObject;
			T result = caseSlaveComponent(slaveComponent);
			if (result == null)
				result = caseAbstractComponent(slaveComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.SUB_SPACE: {
			SubSpace subSpace = (SubSpace) theEObject;
			T result = caseSubSpace(subSpace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.SYSTEM_CONFIGURATION: {
			SystemConfiguration systemConfiguration = (SystemConfiguration) theEObject;
			T result = caseSystemConfiguration(systemConfiguration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.THROUGHPUT: {
			Throughput throughput = (Throughput) theEObject;
			T result = caseThroughput(throughput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ShimPackage.VOLTAGE_DOMAIN: {
			VoltageDomain voltageDomain = (VoltageDomain) theEObject;
			T result = caseVoltageDomain(voltageDomain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCommunication(AbstractCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponent(AbstractComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInstruction(AbstractInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Performance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Performance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPerformance(AbstractPerformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Shim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Shim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractShim(AbstractShim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessor(Accessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessType(AccessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Type Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Type Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessTypeSet(AccessTypeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressSpace(AddressSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Space Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Space Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressSpaceSet(AddressSpaceSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCache(Cache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Frequency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockFrequency(ClockFrequency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Instruction Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Instruction Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonInstructionSet(CommonInstructionSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationSet(CommunicationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSet(ComponentSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionSet(ConnectionSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contention Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contention Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentionGroup(ContentionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contention Group Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contention Group Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentionGroupSet(ContentionGroupSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomInstruction(CustomInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataRate(DataRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventCommunication(EventCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FIFO Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FIFO Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFIFOCommunication(FIFOCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyDomain(FrequencyDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Voltage Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Voltage Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyVoltageSet(FrequencyVoltageSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalUnit(FunctionalUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Unit Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Unit Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalUnitSet(FunctionalUnitSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Unit Set File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Unit Set File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalUnitSetFile(FunctionalUnitSetFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionInput(InstructionInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionOperation(InstructionOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionOutput(InstructionOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interrupt Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interrupt Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterruptCommunication(InterruptCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatency(Latency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterComponent(MasterComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Slave Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Slave Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterSlaveBinding(MasterSlaveBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Slave Binding Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Slave Binding Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterSlaveBindingSet(MasterSlaveBindingSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Consistency Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Consistency Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryConsistencyModel(MemoryConsistencyModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingPoint(OperatingPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating Point Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating Point Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingPointSet(OperatingPointSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformance(Performance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceSet(PerformanceSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pitch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePitch(Pitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerConfiguration(PowerConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Consumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerConsumption(PowerConsumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Consumption Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Consumption Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerConsumptionSet(PowerConsumptionSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Memory Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Memory Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedMemoryCommunication(SharedMemoryCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Register Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Register Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedRegisterCommunication(SharedRegisterCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShim(Shim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slave Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slave Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlaveComponent(SlaveComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSpace(SubSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemConfiguration(SystemConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throughput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throughput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThroughput(Throughput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voltage Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voltage Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoltageDomain(VoltageDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ShimSwitch
