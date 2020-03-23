/**
 */
package org.multicore_association.shim.model.shim.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.multicore_association.shim.model.shim.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage
 * @generated
 */
public class ShimAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShimPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ShimPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShimSwitch<Adapter> modelSwitch = new ShimSwitch<Adapter>() {
		@Override
		public Adapter caseAbstractCommunication(AbstractCommunication object) {
			return createAbstractCommunicationAdapter();
		}

		@Override
		public Adapter caseAbstractComponent(AbstractComponent object) {
			return createAbstractComponentAdapter();
		}

		@Override
		public Adapter caseAbstractInstruction(AbstractInstruction object) {
			return createAbstractInstructionAdapter();
		}

		@Override
		public Adapter caseAbstractPerformance(AbstractPerformance object) {
			return createAbstractPerformanceAdapter();
		}

		@Override
		public Adapter caseAbstractShim(AbstractShim object) {
			return createAbstractShimAdapter();
		}

		@Override
		public Adapter caseAccessor(Accessor object) {
			return createAccessorAdapter();
		}

		@Override
		public Adapter caseAccessType(AccessType object) {
			return createAccessTypeAdapter();
		}

		@Override
		public Adapter caseAccessTypeSet(AccessTypeSet object) {
			return createAccessTypeSetAdapter();
		}

		@Override
		public Adapter caseAddressSpace(AddressSpace object) {
			return createAddressSpaceAdapter();
		}

		@Override
		public Adapter caseAddressSpaceSet(AddressSpaceSet object) {
			return createAddressSpaceSetAdapter();
		}

		@Override
		public Adapter caseCache(Cache object) {
			return createCacheAdapter();
		}

		@Override
		public Adapter caseClockFrequency(ClockFrequency object) {
			return createClockFrequencyAdapter();
		}

		@Override
		public Adapter caseCommonInstructionSet(CommonInstructionSet object) {
			return createCommonInstructionSetAdapter();
		}

		@Override
		public Adapter caseCommunicationSet(CommunicationSet object) {
			return createCommunicationSetAdapter();
		}

		@Override
		public Adapter caseComponentSet(ComponentSet object) {
			return createComponentSetAdapter();
		}

		@Override
		public Adapter caseConnection(Connection object) {
			return createConnectionAdapter();
		}

		@Override
		public Adapter caseConnectionSet(ConnectionSet object) {
			return createConnectionSetAdapter();
		}

		@Override
		public Adapter caseContentionGroup(ContentionGroup object) {
			return createContentionGroupAdapter();
		}

		@Override
		public Adapter caseContentionGroupSet(ContentionGroupSet object) {
			return createContentionGroupSetAdapter();
		}

		@Override
		public Adapter caseCustomInstruction(CustomInstruction object) {
			return createCustomInstructionAdapter();
		}

		@Override
		public Adapter caseDataRate(DataRate object) {
			return createDataRateAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseEventCommunication(EventCommunication object) {
			return createEventCommunicationAdapter();
		}

		@Override
		public Adapter caseFIFOCommunication(FIFOCommunication object) {
			return createFIFOCommunicationAdapter();
		}

		@Override
		public Adapter caseFrequencyDomain(FrequencyDomain object) {
			return createFrequencyDomainAdapter();
		}

		@Override
		public Adapter caseFrequencyVoltageSet(FrequencyVoltageSet object) {
			return createFrequencyVoltageSetAdapter();
		}

		@Override
		public Adapter caseFunctionalUnit(FunctionalUnit object) {
			return createFunctionalUnitAdapter();
		}

		@Override
		public Adapter caseFunctionalUnitSet(FunctionalUnitSet object) {
			return createFunctionalUnitSetAdapter();
		}

		@Override
		public Adapter caseFunctionalUnitSetFile(FunctionalUnitSetFile object) {
			return createFunctionalUnitSetFileAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseInstructionInput(InstructionInput object) {
			return createInstructionInputAdapter();
		}

		@Override
		public Adapter caseInstructionOperation(InstructionOperation object) {
			return createInstructionOperationAdapter();
		}

		@Override
		public Adapter caseInstructionOutput(InstructionOutput object) {
			return createInstructionOutputAdapter();
		}

		@Override
		public Adapter caseInterruptCommunication(InterruptCommunication object) {
			return createInterruptCommunicationAdapter();
		}

		@Override
		public Adapter caseLatency(Latency object) {
			return createLatencyAdapter();
		}

		@Override
		public Adapter caseMasterComponent(MasterComponent object) {
			return createMasterComponentAdapter();
		}

		@Override
		public Adapter caseMasterSlaveBinding(MasterSlaveBinding object) {
			return createMasterSlaveBindingAdapter();
		}

		@Override
		public Adapter caseMasterSlaveBindingSet(MasterSlaveBindingSet object) {
			return createMasterSlaveBindingSetAdapter();
		}

		@Override
		public Adapter caseMemoryConsistencyModel(MemoryConsistencyModel object) {
			return createMemoryConsistencyModelAdapter();
		}

		@Override
		public Adapter caseOperatingPoint(OperatingPoint object) {
			return createOperatingPointAdapter();
		}

		@Override
		public Adapter caseOperatingPointSet(OperatingPointSet object) {
			return createOperatingPointSetAdapter();
		}

		@Override
		public Adapter casePerformance(Performance object) {
			return createPerformanceAdapter();
		}

		@Override
		public Adapter casePerformanceSet(PerformanceSet object) {
			return createPerformanceSetAdapter();
		}

		@Override
		public Adapter casePitch(Pitch object) {
			return createPitchAdapter();
		}

		@Override
		public Adapter casePowerConfiguration(PowerConfiguration object) {
			return createPowerConfigurationAdapter();
		}

		@Override
		public Adapter casePowerConsumption(PowerConsumption object) {
			return createPowerConsumptionAdapter();
		}

		@Override
		public Adapter casePowerConsumptionSet(PowerConsumptionSet object) {
			return createPowerConsumptionSetAdapter();
		}

		@Override
		public Adapter caseSharedMemoryCommunication(SharedMemoryCommunication object) {
			return createSharedMemoryCommunicationAdapter();
		}

		@Override
		public Adapter caseSharedRegisterCommunication(SharedRegisterCommunication object) {
			return createSharedRegisterCommunicationAdapter();
		}

		@Override
		public Adapter caseShim(Shim object) {
			return createShimAdapter();
		}

		@Override
		public Adapter caseSlaveComponent(SlaveComponent object) {
			return createSlaveComponentAdapter();
		}

		@Override
		public Adapter caseSubSpace(SubSpace object) {
			return createSubSpaceAdapter();
		}

		@Override
		public Adapter caseSystemConfiguration(SystemConfiguration object) {
			return createSystemConfigurationAdapter();
		}

		@Override
		public Adapter caseThroughput(Throughput object) {
			return createThroughputAdapter();
		}

		@Override
		public Adapter caseVoltageDomain(VoltageDomain object) {
			return createVoltageDomainAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.AbstractCommunication <em>Abstract Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.AbstractCommunication
	 * @generated
	 */
	public Adapter createAbstractCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.AbstractComponent
	 * @generated
	 */
	public Adapter createAbstractComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.AbstractInstruction <em>Abstract Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.AbstractInstruction
	 * @generated
	 */
	public Adapter createAbstractInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.AbstractPerformance <em>Abstract Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.AbstractPerformance
	 * @generated
	 */
	public Adapter createAbstractPerformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.AbstractShim <em>Abstract Shim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.AbstractShim
	 * @generated
	 */
	public Adapter createAbstractShimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.Accessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.Accessor
	 * @generated
	 */
	public Adapter createAccessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.AccessType
	 * @generated
	 */
	public Adapter createAccessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.AccessTypeSet <em>Access Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.AccessTypeSet
	 * @generated
	 */
	public Adapter createAccessTypeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.AddressSpace <em>Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.AddressSpace
	 * @generated
	 */
	public Adapter createAddressSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.AddressSpaceSet <em>Address Space Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.AddressSpaceSet
	 * @generated
	 */
	public Adapter createAddressSpaceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.Cache
	 * @generated
	 */
	public Adapter createCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.ClockFrequency <em>Clock Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.ClockFrequency
	 * @generated
	 */
	public Adapter createClockFrequencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.CommonInstructionSet <em>Common Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.CommonInstructionSet
	 * @generated
	 */
	public Adapter createCommonInstructionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.CommunicationSet <em>Communication Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.CommunicationSet
	 * @generated
	 */
	public Adapter createCommunicationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.ComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.ComponentSet
	 * @generated
	 */
	public Adapter createComponentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.ConnectionSet <em>Connection Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.ConnectionSet
	 * @generated
	 */
	public Adapter createConnectionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.ContentionGroup <em>Contention Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.ContentionGroup
	 * @generated
	 */
	public Adapter createContentionGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.ContentionGroupSet <em>Contention Group Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.ContentionGroupSet
	 * @generated
	 */
	public Adapter createContentionGroupSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.CustomInstruction <em>Custom Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.CustomInstruction
	 * @generated
	 */
	public Adapter createCustomInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.DataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.DataRate
	 * @generated
	 */
	public Adapter createDataRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.EventCommunication <em>Event Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.EventCommunication
	 * @generated
	 */
	public Adapter createEventCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.FIFOCommunication <em>FIFO Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.FIFOCommunication
	 * @generated
	 */
	public Adapter createFIFOCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.FrequencyDomain <em>Frequency Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.FrequencyDomain
	 * @generated
	 */
	public Adapter createFrequencyDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.FrequencyVoltageSet <em>Frequency Voltage Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.FrequencyVoltageSet
	 * @generated
	 */
	public Adapter createFrequencyVoltageSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.FunctionalUnit <em>Functional Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnit
	 * @generated
	 */
	public Adapter createFunctionalUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.FunctionalUnitSet <em>Functional Unit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnitSet
	 * @generated
	 */
	public Adapter createFunctionalUnitSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.FunctionalUnitSetFile <em>Functional Unit Set File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnitSetFile
	 * @generated
	 */
	public Adapter createFunctionalUnitSetFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.InstructionInput <em>Instruction Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.InstructionInput
	 * @generated
	 */
	public Adapter createInstructionInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.InstructionOperation <em>Instruction Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.InstructionOperation
	 * @generated
	 */
	public Adapter createInstructionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.InstructionOutput <em>Instruction Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.InstructionOutput
	 * @generated
	 */
	public Adapter createInstructionOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.InterruptCommunication <em>Interrupt Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.InterruptCommunication
	 * @generated
	 */
	public Adapter createInterruptCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.Latency
	 * @generated
	 */
	public Adapter createLatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.MasterComponent <em>Master Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.MasterComponent
	 * @generated
	 */
	public Adapter createMasterComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.MasterSlaveBinding <em>Master Slave Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.MasterSlaveBinding
	 * @generated
	 */
	public Adapter createMasterSlaveBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.MasterSlaveBindingSet <em>Master Slave Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.MasterSlaveBindingSet
	 * @generated
	 */
	public Adapter createMasterSlaveBindingSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.MemoryConsistencyModel <em>Memory Consistency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.MemoryConsistencyModel
	 * @generated
	 */
	public Adapter createMemoryConsistencyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.OperatingPoint <em>Operating Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.OperatingPoint
	 * @generated
	 */
	public Adapter createOperatingPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.OperatingPointSet <em>Operating Point Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.OperatingPointSet
	 * @generated
	 */
	public Adapter createOperatingPointSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.Performance
	 * @generated
	 */
	public Adapter createPerformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.PerformanceSet <em>Performance Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.PerformanceSet
	 * @generated
	 */
	public Adapter createPerformanceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.Pitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.Pitch
	 * @generated
	 */
	public Adapter createPitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.PowerConfiguration <em>Power Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.PowerConfiguration
	 * @generated
	 */
	public Adapter createPowerConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.PowerConsumption <em>Power Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.PowerConsumption
	 * @generated
	 */
	public Adapter createPowerConsumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.PowerConsumptionSet <em>Power Consumption Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.PowerConsumptionSet
	 * @generated
	 */
	public Adapter createPowerConsumptionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication <em>Shared Memory Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.SharedMemoryCommunication
	 * @generated
	 */
	public Adapter createSharedMemoryCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication <em>Shared Register Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.SharedRegisterCommunication
	 * @generated
	 */
	public Adapter createSharedRegisterCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.Shim <em>Shim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.Shim
	 * @generated
	 */
	public Adapter createShimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.SlaveComponent <em>Slave Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.SlaveComponent
	 * @generated
	 */
	public Adapter createSlaveComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.SubSpace <em>Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.SubSpace
	 * @generated
	 */
	public Adapter createSubSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.SystemConfiguration <em>System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.SystemConfiguration
	 * @generated
	 */
	public Adapter createSystemConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.Throughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.Throughput
	 * @generated
	 */
	public Adapter createThroughputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.model.shim.VoltageDomain <em>Voltage Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.model.shim.VoltageDomain
	 * @generated
	 */
	public Adapter createVoltageDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ShimAdapterFactory
