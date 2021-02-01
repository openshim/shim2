/**
 */
package org.multicore_association.shim10.model.shim10.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.multicore_association.shim10.model.shim10.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim10.model.shim10.ShimPackage
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShimSwitch<Adapter> modelSwitch =
		new ShimSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractCommunication(AbstractCommunication object) {
				return createAbstractCommunicationAdapter();
			}
			@Override
			public Adapter caseAbstractPerformance(AbstractPerformance object) {
				return createAbstractPerformanceAdapter();
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
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
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
			public Adapter caseSharedMemoryCommunication(SharedMemoryCommunication object) {
				return createSharedMemoryCommunicationAdapter();
			}
			@Override
			public Adapter caseSharedRegisterCommunication(SharedRegisterCommunication object) {
				return createSharedRegisterCommunicationAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.AbstractCommunication <em>Abstract Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.AbstractCommunication
	 * @generated
	 */
	public Adapter createAbstractCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance <em>Abstract Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.AbstractPerformance
	 * @generated
	 */
	public Adapter createAbstractPerformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.Accessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.Accessor
	 * @generated
	 */
	public Adapter createAccessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.AccessType
	 * @generated
	 */
	public Adapter createAccessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.AccessTypeSet <em>Access Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.AccessTypeSet
	 * @generated
	 */
	public Adapter createAccessTypeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.AddressSpace <em>Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.AddressSpace
	 * @generated
	 */
	public Adapter createAddressSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.AddressSpaceSet <em>Address Space Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.AddressSpaceSet
	 * @generated
	 */
	public Adapter createAddressSpaceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.Cache
	 * @generated
	 */
	public Adapter createCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.ClockFrequency <em>Clock Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.ClockFrequency
	 * @generated
	 */
	public Adapter createClockFrequencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.CommonInstructionSet <em>Common Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.CommonInstructionSet
	 * @generated
	 */
	public Adapter createCommonInstructionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.CommunicationSet <em>Communication Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.CommunicationSet
	 * @generated
	 */
	public Adapter createCommunicationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.ComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.ComponentSet
	 * @generated
	 */
	public Adapter createComponentSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.ConnectionSet <em>Connection Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.ConnectionSet
	 * @generated
	 */
	public Adapter createConnectionSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.EventCommunication <em>Event Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.EventCommunication
	 * @generated
	 */
	public Adapter createEventCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication <em>FIFO Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.FIFOCommunication
	 * @generated
	 */
	public Adapter createFIFOCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.InterruptCommunication <em>Interrupt Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.InterruptCommunication
	 * @generated
	 */
	public Adapter createInterruptCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.Latency
	 * @generated
	 */
	public Adapter createLatencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.MasterComponent <em>Master Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent
	 * @generated
	 */
	public Adapter createMasterComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.MasterSlaveBinding <em>Master Slave Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.MasterSlaveBinding
	 * @generated
	 */
	public Adapter createMasterSlaveBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet <em>Master Slave Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet
	 * @generated
	 */
	public Adapter createMasterSlaveBindingSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel <em>Memory Consistency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.MemoryConsistencyModel
	 * @generated
	 */
	public Adapter createMemoryConsistencyModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.Performance
	 * @generated
	 */
	public Adapter createPerformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.PerformanceSet <em>Performance Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.PerformanceSet
	 * @generated
	 */
	public Adapter createPerformanceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.Pitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.Pitch
	 * @generated
	 */
	public Adapter createPitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.SharedMemoryCommunication <em>Shared Memory Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.SharedMemoryCommunication
	 * @generated
	 */
	public Adapter createSharedMemoryCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication <em>Shared Register Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.SharedRegisterCommunication
	 * @generated
	 */
	public Adapter createSharedRegisterCommunicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.SlaveComponent <em>Slave Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.SlaveComponent
	 * @generated
	 */
	public Adapter createSlaveComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.SubSpace <em>Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.SubSpace
	 * @generated
	 */
	public Adapter createSubSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration <em>System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim10.model.shim10.SystemConfiguration
	 * @generated
	 */
	public Adapter createSystemConfigurationAdapter() {
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
