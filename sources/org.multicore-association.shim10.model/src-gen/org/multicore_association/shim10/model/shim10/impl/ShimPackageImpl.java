/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.multicore_association.shim10.model.shim10.AbstractCommunication;
import org.multicore_association.shim10.model.shim10.AbstractPerformance;
import org.multicore_association.shim10.model.shim10.AccessType;
import org.multicore_association.shim10.model.shim10.AccessTypeSet;
import org.multicore_association.shim10.model.shim10.Accessor;
import org.multicore_association.shim10.model.shim10.AddressSpace;
import org.multicore_association.shim10.model.shim10.AddressSpaceSet;
import org.multicore_association.shim10.model.shim10.Cache;
import org.multicore_association.shim10.model.shim10.CacheCoherencyType;
import org.multicore_association.shim10.model.shim10.CacheType;
import org.multicore_association.shim10.model.shim10.ClockFrequency;
import org.multicore_association.shim10.model.shim10.CommonInstructionSet;
import org.multicore_association.shim10.model.shim10.CommunicationSet;
import org.multicore_association.shim10.model.shim10.ComponentSet;
import org.multicore_association.shim10.model.shim10.Connection;
import org.multicore_association.shim10.model.shim10.ConnectionSet;
import org.multicore_association.shim10.model.shim10.DocumentRoot;
import org.multicore_association.shim10.model.shim10.EndianType;
import org.multicore_association.shim10.model.shim10.EventCommunication;
import org.multicore_association.shim10.model.shim10.FIFOCommunication;
import org.multicore_association.shim10.model.shim10.Instruction;
import org.multicore_association.shim10.model.shim10.InterruptCommunication;
import org.multicore_association.shim10.model.shim10.Latency;
import org.multicore_association.shim10.model.shim10.LockDownType;
import org.multicore_association.shim10.model.shim10.MasterComponent;
import org.multicore_association.shim10.model.shim10.MasterSlaveBinding;
import org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet;
import org.multicore_association.shim10.model.shim10.MasterType;
import org.multicore_association.shim10.model.shim10.MemoryConsistencyModel;
import org.multicore_association.shim10.model.shim10.OperationType;
import org.multicore_association.shim10.model.shim10.OrderingType;
import org.multicore_association.shim10.model.shim10.Performance;
import org.multicore_association.shim10.model.shim10.PerformanceSet;
import org.multicore_association.shim10.model.shim10.Pitch;
import org.multicore_association.shim10.model.shim10.RWType;
import org.multicore_association.shim10.model.shim10.SharedMemoryCommunication;
import org.multicore_association.shim10.model.shim10.SharedRegisterCommunication;
import org.multicore_association.shim10.model.shim10.ShimFactory;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SizeUnitType;
import org.multicore_association.shim10.model.shim10.SlaveComponent;
import org.multicore_association.shim10.model.shim10.SubSpace;
import org.multicore_association.shim10.model.shim10.SystemConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShimPackageImpl extends EPackageImpl implements ShimPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPerformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessTypeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressSpaceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clockFrequencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonInstructionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fifoCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterSlaveBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterSlaveBindingSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryConsistencyModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedMemoryCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedRegisterCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaveComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheCoherencyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endianTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lockDownTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum masterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rwTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cacheCoherencyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cacheTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType endianTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lockDownTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType masterTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderingTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rwTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sizeUnitTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShimPackageImpl() {
		super(eNS_URI, ShimFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ShimPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ShimPackage init() {
		if (isInited) return (ShimPackage)EPackage.Registry.INSTANCE.getEPackage(ShimPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredShimPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ShimPackageImpl theShimPackage = registeredShimPackage instanceof ShimPackageImpl ? (ShimPackageImpl)registeredShimPackage : new ShimPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theShimPackage.createPackageContents();

		// Initialize created meta-data
		theShimPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShimPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ShimPackage.eNS_URI, theShimPackage);
		return theShimPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCommunication() {
		return abstractCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCommunication_ConnectionSet() {
		return (EReference)abstractCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCommunication_Name() {
		return (EAttribute)abstractCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPerformance() {
		return abstractPerformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPerformance_Best() {
		return (EAttribute)abstractPerformanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPerformance_Typical() {
		return (EAttribute)abstractPerformanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPerformance_Worst() {
		return (EAttribute)abstractPerformanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessor() {
		return accessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessor_PerformanceSet() {
		return (EReference)accessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessor_MasterComponentRef() {
		return (EReference)accessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessType() {
		return accessTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_AccessByteSize() {
		return (EAttribute)accessTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_AlignmentByteSize() {
		return (EAttribute)accessTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_Id() {
		return (EAttribute)accessTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_Name() {
		return (EAttribute)accessTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_NBurst() {
		return (EAttribute)accessTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_RwType() {
		return (EAttribute)accessTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessTypeSet() {
		return accessTypeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessTypeSet_AccessType() {
		return (EReference)accessTypeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressSpace() {
		return addressSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressSpace_SubSpace() {
		return (EReference)addressSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressSpace_Id() {
		return (EAttribute)addressSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressSpace_Name() {
		return (EAttribute)addressSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressSpaceSet() {
		return addressSpaceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressSpaceSet_AddressSpace() {
		return (EReference)addressSpaceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCache() {
		return cacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_CacheCoherency() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_CacheType() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Id() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_LineSize() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_LockDownType() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Name() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_NWay() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Size() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_SizeUnit() {
		return (EAttribute)cacheEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCache_CacheRef() {
		return (EReference)cacheEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClockFrequency() {
		return clockFrequencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClockFrequency_ClockValue() {
		return (EAttribute)clockFrequencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonInstructionSet() {
		return commonInstructionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonInstructionSet_Instruction() {
		return (EReference)commonInstructionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonInstructionSet_Name() {
		return (EAttribute)commonInstructionSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationSet() {
		return communicationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationSet_SharedRegisterCommunication() {
		return (EReference)communicationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationSet_SharedMemoryCommunication() {
		return (EReference)communicationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationSet_EventCommunication() {
		return (EReference)communicationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationSet_FIFOCommunication() {
		return (EReference)communicationSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationSet_InterruptCommunication() {
		return (EReference)communicationSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSet() {
		return componentSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSet_ComponentSet() {
		return (EReference)componentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSet_SlaveComponent() {
		return (EReference)componentSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSet_MasterComponent() {
		return (EReference)componentSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSet_Cache() {
		return (EReference)componentSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSet_Name() {
		return (EAttribute)componentSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Performance() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_To() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_From() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionSet() {
		return connectionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionSet_Connection() {
		return (EReference)connectionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractCommunication() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractPerformance() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Accessor() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AccessType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AccessTypeSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressSpace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AddressSpaceSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cache() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClockFrequency() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CommonInstructionSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CommunicationSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComponentSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Connection() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConnectionSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EventCommunication() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FIFOCommunication() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Instruction() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InterruptCommunication() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Latency() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MasterComponent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MasterSlaveBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MasterSlaveBindingSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MemoryConsistencyModel() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Performance() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PerformanceSet() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Pitch() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SharedMemoryCommunication() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SharedRegisterCommunication() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SlaveComponent() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubSpace() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SystemConfiguration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventCommunication() {
		return eventCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFIFOCommunication() {
		return fifoCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFIFOCommunication_DataSize() {
		return (EAttribute)fifoCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFIFOCommunication_DataSizeUnit() {
		return (EAttribute)fifoCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFIFOCommunication_QueueSize() {
		return (EAttribute)fifoCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstruction_Performance() {
		return (EReference)instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_Name() {
		return (EAttribute)instructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptCommunication() {
		return interruptCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatency() {
		return latencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterComponent() {
		return masterComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterComponent_CommonInstructionSet() {
		return (EReference)masterComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterComponent_Cache() {
		return (EReference)masterComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterComponent_ClockFrequency() {
		return (EReference)masterComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterComponent_AccessTypeSet() {
		return (EReference)masterComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_Arch() {
		return (EAttribute)masterComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_ArchOption() {
		return (EAttribute)masterComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_Endian() {
		return (EAttribute)masterComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_Id() {
		return (EAttribute)masterComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_MasterType() {
		return (EAttribute)masterComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_Name() {
		return (EAttribute)masterComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_NThread() {
		return (EAttribute)masterComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_Pid() {
		return (EAttribute)masterComponentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterSlaveBinding() {
		return masterSlaveBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterSlaveBinding_Accessor() {
		return (EReference)masterSlaveBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterSlaveBinding_SlaveComponentRef() {
		return (EReference)masterSlaveBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMasterSlaveBindingSet() {
		return masterSlaveBindingSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterSlaveBindingSet_MasterSlaveBinding() {
		return (EReference)masterSlaveBindingSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryConsistencyModel() {
		return memoryConsistencyModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryConsistencyModel_RarOrdering() {
		return (EAttribute)memoryConsistencyModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryConsistencyModel_RawOrdering() {
		return (EAttribute)memoryConsistencyModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryConsistencyModel_WarOrdering() {
		return (EAttribute)memoryConsistencyModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryConsistencyModel_WawOrdering() {
		return (EAttribute)memoryConsistencyModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformance() {
		return performanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformance_Pitch() {
		return (EReference)performanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformance_Latency() {
		return (EReference)performanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformance_AccessTypeRef() {
		return (EReference)performanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformanceSet() {
		return performanceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformanceSet_Performance() {
		return (EReference)performanceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPitch() {
		return pitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedMemoryCommunication() {
		return sharedMemoryCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedMemoryCommunication_DataSize() {
		return (EAttribute)sharedMemoryCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedMemoryCommunication_DataSizeUnit() {
		return (EAttribute)sharedMemoryCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedMemoryCommunication_OperationType() {
		return (EAttribute)sharedMemoryCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedMemoryCommunication_AddressSpaceRef() {
		return (EReference)sharedMemoryCommunicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedMemoryCommunication_SubSpaceRef() {
		return (EReference)sharedMemoryCommunicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedRegisterCommunication() {
		return sharedRegisterCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedRegisterCommunication_DataSize() {
		return (EAttribute)sharedRegisterCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedRegisterCommunication_DataSizeUnit() {
		return (EAttribute)sharedRegisterCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedRegisterCommunication_NRegister() {
		return (EAttribute)sharedRegisterCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlaveComponent() {
		return slaveComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlaveComponent_Id() {
		return (EAttribute)slaveComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlaveComponent_Name() {
		return (EAttribute)slaveComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlaveComponent_RwType() {
		return (EAttribute)slaveComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlaveComponent_Size() {
		return (EAttribute)slaveComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlaveComponent_SizeUnit() {
		return (EAttribute)slaveComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubSpace() {
		return subSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSpace_MemoryConsistencyModel() {
		return (EReference)subSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSpace_MasterSlaveBindingSet() {
		return (EReference)subSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSpace_End() {
		return (EAttribute)subSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSpace_Endian() {
		return (EAttribute)subSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSpace_Id() {
		return (EAttribute)subSpaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSpace_Name() {
		return (EAttribute)subSpaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSpace_Start() {
		return (EAttribute)subSpaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemConfiguration() {
		return systemConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_ComponentSet() {
		return (EReference)systemConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_CommunicationSet() {
		return (EReference)systemConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_AddressSpaceSet() {
		return (EReference)systemConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_ClockFrequency() {
		return (EReference)systemConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemConfiguration_Name() {
		return (EAttribute)systemConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemConfiguration_ShimVersion() {
		return (EAttribute)systemConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCacheCoherencyType() {
		return cacheCoherencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCacheType() {
		return cacheTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndianType() {
		return endianTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLockDownType() {
		return lockDownTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMasterType() {
		return masterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationType() {
		return operationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderingType() {
		return orderingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRWType() {
		return rwTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSizeUnitType() {
		return sizeUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCacheCoherencyTypeObject() {
		return cacheCoherencyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCacheTypeObject() {
		return cacheTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEndianTypeObject() {
		return endianTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLockDownTypeObject() {
		return lockDownTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMasterTypeObject() {
		return masterTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperationTypeObject() {
		return operationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrderingTypeObject() {
		return orderingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRWTypeObject() {
		return rwTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSizeUnitTypeObject() {
		return sizeUnitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimFactory getShimFactory() {
		return (ShimFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractCommunicationEClass = createEClass(ABSTRACT_COMMUNICATION);
		createEReference(abstractCommunicationEClass, ABSTRACT_COMMUNICATION__CONNECTION_SET);
		createEAttribute(abstractCommunicationEClass, ABSTRACT_COMMUNICATION__NAME);

		abstractPerformanceEClass = createEClass(ABSTRACT_PERFORMANCE);
		createEAttribute(abstractPerformanceEClass, ABSTRACT_PERFORMANCE__BEST);
		createEAttribute(abstractPerformanceEClass, ABSTRACT_PERFORMANCE__TYPICAL);
		createEAttribute(abstractPerformanceEClass, ABSTRACT_PERFORMANCE__WORST);

		accessorEClass = createEClass(ACCESSOR);
		createEReference(accessorEClass, ACCESSOR__PERFORMANCE_SET);
		createEReference(accessorEClass, ACCESSOR__MASTER_COMPONENT_REF);

		accessTypeEClass = createEClass(ACCESS_TYPE);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__ACCESS_BYTE_SIZE);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__ALIGNMENT_BYTE_SIZE);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__ID);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__NAME);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__NBURST);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__RW_TYPE);

		accessTypeSetEClass = createEClass(ACCESS_TYPE_SET);
		createEReference(accessTypeSetEClass, ACCESS_TYPE_SET__ACCESS_TYPE);

		addressSpaceEClass = createEClass(ADDRESS_SPACE);
		createEReference(addressSpaceEClass, ADDRESS_SPACE__SUB_SPACE);
		createEAttribute(addressSpaceEClass, ADDRESS_SPACE__ID);
		createEAttribute(addressSpaceEClass, ADDRESS_SPACE__NAME);

		addressSpaceSetEClass = createEClass(ADDRESS_SPACE_SET);
		createEReference(addressSpaceSetEClass, ADDRESS_SPACE_SET__ADDRESS_SPACE);

		cacheEClass = createEClass(CACHE);
		createEAttribute(cacheEClass, CACHE__CACHE_COHERENCY);
		createEAttribute(cacheEClass, CACHE__CACHE_TYPE);
		createEAttribute(cacheEClass, CACHE__ID);
		createEAttribute(cacheEClass, CACHE__LINE_SIZE);
		createEAttribute(cacheEClass, CACHE__LOCK_DOWN_TYPE);
		createEAttribute(cacheEClass, CACHE__NAME);
		createEAttribute(cacheEClass, CACHE__NWAY);
		createEAttribute(cacheEClass, CACHE__SIZE);
		createEAttribute(cacheEClass, CACHE__SIZE_UNIT);
		createEReference(cacheEClass, CACHE__CACHE_REF);

		clockFrequencyEClass = createEClass(CLOCK_FREQUENCY);
		createEAttribute(clockFrequencyEClass, CLOCK_FREQUENCY__CLOCK_VALUE);

		commonInstructionSetEClass = createEClass(COMMON_INSTRUCTION_SET);
		createEReference(commonInstructionSetEClass, COMMON_INSTRUCTION_SET__INSTRUCTION);
		createEAttribute(commonInstructionSetEClass, COMMON_INSTRUCTION_SET__NAME);

		communicationSetEClass = createEClass(COMMUNICATION_SET);
		createEReference(communicationSetEClass, COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION);
		createEReference(communicationSetEClass, COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION);
		createEReference(communicationSetEClass, COMMUNICATION_SET__EVENT_COMMUNICATION);
		createEReference(communicationSetEClass, COMMUNICATION_SET__FIFO_COMMUNICATION);
		createEReference(communicationSetEClass, COMMUNICATION_SET__INTERRUPT_COMMUNICATION);

		componentSetEClass = createEClass(COMPONENT_SET);
		createEReference(componentSetEClass, COMPONENT_SET__COMPONENT_SET);
		createEReference(componentSetEClass, COMPONENT_SET__SLAVE_COMPONENT);
		createEReference(componentSetEClass, COMPONENT_SET__MASTER_COMPONENT);
		createEReference(componentSetEClass, COMPONENT_SET__CACHE);
		createEAttribute(componentSetEClass, COMPONENT_SET__NAME);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__PERFORMANCE);
		createEReference(connectionEClass, CONNECTION__TO);
		createEReference(connectionEClass, CONNECTION__FROM);

		connectionSetEClass = createEClass(CONNECTION_SET);
		createEReference(connectionSetEClass, CONNECTION_SET__CONNECTION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT_COMMUNICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT_PERFORMANCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCESSOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCESS_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACCESS_TYPE_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS_SPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS_SPACE_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CACHE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLOCK_FREQUENCY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMMON_INSTRUCTION_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMMUNICATION_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COMPONENT_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONNECTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONNECTION_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EVENT_COMMUNICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FIFO_COMMUNICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INSTRUCTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERRUPT_COMMUNICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LATENCY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MASTER_COMPONENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MASTER_SLAVE_BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERFORMANCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PERFORMANCE_SET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PITCH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SLAVE_COMPONENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUB_SPACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SYSTEM_CONFIGURATION);

		eventCommunicationEClass = createEClass(EVENT_COMMUNICATION);

		fifoCommunicationEClass = createEClass(FIFO_COMMUNICATION);
		createEAttribute(fifoCommunicationEClass, FIFO_COMMUNICATION__DATA_SIZE);
		createEAttribute(fifoCommunicationEClass, FIFO_COMMUNICATION__DATA_SIZE_UNIT);
		createEAttribute(fifoCommunicationEClass, FIFO_COMMUNICATION__QUEUE_SIZE);

		instructionEClass = createEClass(INSTRUCTION);
		createEReference(instructionEClass, INSTRUCTION__PERFORMANCE);
		createEAttribute(instructionEClass, INSTRUCTION__NAME);

		interruptCommunicationEClass = createEClass(INTERRUPT_COMMUNICATION);

		latencyEClass = createEClass(LATENCY);

		masterComponentEClass = createEClass(MASTER_COMPONENT);
		createEReference(masterComponentEClass, MASTER_COMPONENT__COMMON_INSTRUCTION_SET);
		createEReference(masterComponentEClass, MASTER_COMPONENT__CACHE);
		createEReference(masterComponentEClass, MASTER_COMPONENT__CLOCK_FREQUENCY);
		createEReference(masterComponentEClass, MASTER_COMPONENT__ACCESS_TYPE_SET);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__ARCH);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__ARCH_OPTION);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__ENDIAN);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__ID);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__MASTER_TYPE);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__NAME);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__NTHREAD);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__PID);

		masterSlaveBindingEClass = createEClass(MASTER_SLAVE_BINDING);
		createEReference(masterSlaveBindingEClass, MASTER_SLAVE_BINDING__ACCESSOR);
		createEReference(masterSlaveBindingEClass, MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF);

		masterSlaveBindingSetEClass = createEClass(MASTER_SLAVE_BINDING_SET);
		createEReference(masterSlaveBindingSetEClass, MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING);

		memoryConsistencyModelEClass = createEClass(MEMORY_CONSISTENCY_MODEL);
		createEAttribute(memoryConsistencyModelEClass, MEMORY_CONSISTENCY_MODEL__RAR_ORDERING);
		createEAttribute(memoryConsistencyModelEClass, MEMORY_CONSISTENCY_MODEL__RAW_ORDERING);
		createEAttribute(memoryConsistencyModelEClass, MEMORY_CONSISTENCY_MODEL__WAR_ORDERING);
		createEAttribute(memoryConsistencyModelEClass, MEMORY_CONSISTENCY_MODEL__WAW_ORDERING);

		performanceEClass = createEClass(PERFORMANCE);
		createEReference(performanceEClass, PERFORMANCE__PITCH);
		createEReference(performanceEClass, PERFORMANCE__LATENCY);
		createEReference(performanceEClass, PERFORMANCE__ACCESS_TYPE_REF);

		performanceSetEClass = createEClass(PERFORMANCE_SET);
		createEReference(performanceSetEClass, PERFORMANCE_SET__PERFORMANCE);

		pitchEClass = createEClass(PITCH);

		sharedMemoryCommunicationEClass = createEClass(SHARED_MEMORY_COMMUNICATION);
		createEAttribute(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__DATA_SIZE);
		createEAttribute(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT);
		createEAttribute(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE);
		createEReference(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF);
		createEReference(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF);

		sharedRegisterCommunicationEClass = createEClass(SHARED_REGISTER_COMMUNICATION);
		createEAttribute(sharedRegisterCommunicationEClass, SHARED_REGISTER_COMMUNICATION__DATA_SIZE);
		createEAttribute(sharedRegisterCommunicationEClass, SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT);
		createEAttribute(sharedRegisterCommunicationEClass, SHARED_REGISTER_COMMUNICATION__NREGISTER);

		slaveComponentEClass = createEClass(SLAVE_COMPONENT);
		createEAttribute(slaveComponentEClass, SLAVE_COMPONENT__ID);
		createEAttribute(slaveComponentEClass, SLAVE_COMPONENT__NAME);
		createEAttribute(slaveComponentEClass, SLAVE_COMPONENT__RW_TYPE);
		createEAttribute(slaveComponentEClass, SLAVE_COMPONENT__SIZE);
		createEAttribute(slaveComponentEClass, SLAVE_COMPONENT__SIZE_UNIT);

		subSpaceEClass = createEClass(SUB_SPACE);
		createEReference(subSpaceEClass, SUB_SPACE__MEMORY_CONSISTENCY_MODEL);
		createEReference(subSpaceEClass, SUB_SPACE__MASTER_SLAVE_BINDING_SET);
		createEAttribute(subSpaceEClass, SUB_SPACE__END);
		createEAttribute(subSpaceEClass, SUB_SPACE__ENDIAN);
		createEAttribute(subSpaceEClass, SUB_SPACE__ID);
		createEAttribute(subSpaceEClass, SUB_SPACE__NAME);
		createEAttribute(subSpaceEClass, SUB_SPACE__START);

		systemConfigurationEClass = createEClass(SYSTEM_CONFIGURATION);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__COMPONENT_SET);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__COMMUNICATION_SET);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__CLOCK_FREQUENCY);
		createEAttribute(systemConfigurationEClass, SYSTEM_CONFIGURATION__NAME);
		createEAttribute(systemConfigurationEClass, SYSTEM_CONFIGURATION__SHIM_VERSION);

		// Create enums
		cacheCoherencyTypeEEnum = createEEnum(CACHE_COHERENCY_TYPE);
		cacheTypeEEnum = createEEnum(CACHE_TYPE);
		endianTypeEEnum = createEEnum(ENDIAN_TYPE);
		lockDownTypeEEnum = createEEnum(LOCK_DOWN_TYPE);
		masterTypeEEnum = createEEnum(MASTER_TYPE);
		operationTypeEEnum = createEEnum(OPERATION_TYPE);
		orderingTypeEEnum = createEEnum(ORDERING_TYPE);
		rwTypeEEnum = createEEnum(RW_TYPE);
		sizeUnitTypeEEnum = createEEnum(SIZE_UNIT_TYPE);

		// Create data types
		cacheCoherencyTypeObjectEDataType = createEDataType(CACHE_COHERENCY_TYPE_OBJECT);
		cacheTypeObjectEDataType = createEDataType(CACHE_TYPE_OBJECT);
		endianTypeObjectEDataType = createEDataType(ENDIAN_TYPE_OBJECT);
		lockDownTypeObjectEDataType = createEDataType(LOCK_DOWN_TYPE_OBJECT);
		masterTypeObjectEDataType = createEDataType(MASTER_TYPE_OBJECT);
		operationTypeObjectEDataType = createEDataType(OPERATION_TYPE_OBJECT);
		orderingTypeObjectEDataType = createEDataType(ORDERING_TYPE_OBJECT);
		rwTypeObjectEDataType = createEDataType(RW_TYPE_OBJECT);
		sizeUnitTypeObjectEDataType = createEDataType(SIZE_UNIT_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		eventCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());
		fifoCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());
		interruptCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());
		latencyEClass.getESuperTypes().add(this.getAbstractPerformance());
		pitchEClass.getESuperTypes().add(this.getAbstractPerformance());
		sharedMemoryCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());
		sharedRegisterCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractCommunicationEClass, AbstractCommunication.class, "AbstractCommunication", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCommunication_ConnectionSet(), this.getConnectionSet(), null, "connectionSet", null, 0, 1, AbstractCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCommunication_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AbstractCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPerformanceEClass, AbstractPerformance.class, "AbstractPerformance", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPerformance_Best(), theXMLTypePackage.getFloat(), "best", null, 0, 1, AbstractPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPerformance_Typical(), theXMLTypePackage.getFloat(), "typical", null, 1, 1, AbstractPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPerformance_Worst(), theXMLTypePackage.getFloat(), "worst", null, 0, 1, AbstractPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessorEClass, Accessor.class, "Accessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessor_PerformanceSet(), this.getPerformanceSet(), null, "performanceSet", null, 0, -1, Accessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessor_MasterComponentRef(), this.getMasterComponent(), null, "masterComponentRef", null, 1, 1, Accessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessTypeEClass, AccessType.class, "AccessType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessType_AccessByteSize(), theXMLTypePackage.getInt(), "accessByteSize", null, 0, 1, AccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_AlignmentByteSize(), theXMLTypePackage.getInt(), "alignmentByteSize", null, 0, 1, AccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, AccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_NBurst(), theXMLTypePackage.getInt(), "nBurst", null, 0, 1, AccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_RwType(), this.getRWType(), "rwType", null, 0, 1, AccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessTypeSetEClass, AccessTypeSet.class, "AccessTypeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessTypeSet_AccessType(), this.getAccessType(), null, "accessType", null, 1, -1, AccessTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressSpaceEClass, AddressSpace.class, "AddressSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressSpace_SubSpace(), this.getSubSpace(), null, "subSpace", null, 0, -1, AddressSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressSpace_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, AddressSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressSpace_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AddressSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressSpaceSetEClass, AddressSpaceSet.class, "AddressSpaceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressSpaceSet_AddressSpace(), this.getAddressSpace(), null, "addressSpace", null, 1, -1, AddressSpaceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCache_CacheCoherency(), this.getCacheCoherencyType(), "cacheCoherency", null, 1, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_CacheType(), this.getCacheType(), "cacheType", null, 1, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_LineSize(), theXMLTypePackage.getInt(), "lineSize", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_LockDownType(), this.getLockDownType(), "lockDownType", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_NWay(), theXMLTypePackage.getInt(), "nWay", null, 0, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Size(), theXMLTypePackage.getInt(), "size", null, 1, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_SizeUnit(), this.getSizeUnitType(), "sizeUnit", null, 1, 1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCache_CacheRef(), this.getCache(), null, "cacheRef", null, 0, -1, Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clockFrequencyEClass, ClockFrequency.class, "ClockFrequency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClockFrequency_ClockValue(), theXMLTypePackage.getFloat(), "clockValue", null, 1, 1, ClockFrequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonInstructionSetEClass, CommonInstructionSet.class, "CommonInstructionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonInstructionSet_Instruction(), this.getInstruction(), null, "instruction", null, 1, -1, CommonInstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonInstructionSet_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, CommonInstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationSetEClass, CommunicationSet.class, "CommunicationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationSet_SharedRegisterCommunication(), this.getSharedRegisterCommunication(), null, "sharedRegisterCommunication", null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSet_SharedMemoryCommunication(), this.getSharedMemoryCommunication(), null, "sharedMemoryCommunication", null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSet_EventCommunication(), this.getEventCommunication(), null, "eventCommunication", null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSet_FIFOCommunication(), this.getFIFOCommunication(), null, "fIFOCommunication", null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSet_InterruptCommunication(), this.getInterruptCommunication(), null, "interruptCommunication", null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSetEClass, ComponentSet.class, "ComponentSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSet_ComponentSet(), this.getComponentSet(), null, "componentSet", null, 0, -1, ComponentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSet_SlaveComponent(), this.getSlaveComponent(), null, "slaveComponent", null, 0, -1, ComponentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSet_MasterComponent(), this.getMasterComponent(), null, "masterComponent", null, 0, -1, ComponentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSet_Cache(), this.getCache(), null, "cache", null, 0, -1, ComponentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentSet_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ComponentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Performance(), this.getPerformance(), null, "performance", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_To(), this.getMasterComponent(), null, "to", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_From(), this.getMasterComponent(), null, "from", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionSetEClass, ConnectionSet.class, "ConnectionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionSet_Connection(), this.getConnection(), null, "connection", null, 1, -1, ConnectionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AbstractCommunication(), this.getAbstractCommunication(), null, "abstractCommunication", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AbstractPerformance(), this.getAbstractPerformance(), null, "abstractPerformance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Accessor(), this.getAccessor(), null, "accessor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AccessType(), this.getAccessType(), null, "accessType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AccessTypeSet(), this.getAccessTypeSet(), null, "accessTypeSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddressSpace(), this.getAddressSpace(), null, "addressSpace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AddressSpaceSet(), this.getAddressSpaceSet(), null, "addressSpaceSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cache(), this.getCache(), null, "cache", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClockFrequency(), this.getClockFrequency(), null, "clockFrequency", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CommonInstructionSet(), this.getCommonInstructionSet(), null, "commonInstructionSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CommunicationSet(), this.getCommunicationSet(), null, "communicationSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ComponentSet(), this.getComponentSet(), null, "componentSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Connection(), this.getConnection(), null, "connection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConnectionSet(), this.getConnectionSet(), null, "connectionSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_EventCommunication(), this.getEventCommunication(), null, "eventCommunication", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FIFOCommunication(), this.getFIFOCommunication(), null, "fIFOCommunication", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Instruction(), this.getInstruction(), null, "instruction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InterruptCommunication(), this.getInterruptCommunication(), null, "interruptCommunication", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Latency(), this.getLatency(), null, "latency", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MasterComponent(), this.getMasterComponent(), null, "masterComponent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MasterSlaveBinding(), this.getMasterSlaveBinding(), null, "masterSlaveBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MasterSlaveBindingSet(), this.getMasterSlaveBindingSet(), null, "masterSlaveBindingSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MemoryConsistencyModel(), this.getMemoryConsistencyModel(), null, "memoryConsistencyModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Performance(), this.getPerformance(), null, "performance", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PerformanceSet(), this.getPerformanceSet(), null, "performanceSet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Pitch(), this.getPitch(), null, "pitch", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SharedMemoryCommunication(), this.getSharedMemoryCommunication(), null, "sharedMemoryCommunication", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SharedRegisterCommunication(), this.getSharedRegisterCommunication(), null, "sharedRegisterCommunication", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SlaveComponent(), this.getSlaveComponent(), null, "slaveComponent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubSpace(), this.getSubSpace(), null, "subSpace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SystemConfiguration(), this.getSystemConfiguration(), null, "systemConfiguration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eventCommunicationEClass, EventCommunication.class, "EventCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fifoCommunicationEClass, FIFOCommunication.class, "FIFOCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFIFOCommunication_DataSize(), theXMLTypePackage.getInt(), "dataSize", null, 1, 1, FIFOCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFIFOCommunication_DataSizeUnit(), this.getSizeUnitType(), "dataSizeUnit", null, 0, 1, FIFOCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFIFOCommunication_QueueSize(), theXMLTypePackage.getInt(), "queueSize", null, 1, 1, FIFOCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstruction_Performance(), this.getPerformance(), null, "performance", null, 1, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interruptCommunicationEClass, InterruptCommunication.class, "InterruptCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(latencyEClass, Latency.class, "Latency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(masterComponentEClass, MasterComponent.class, "MasterComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterComponent_CommonInstructionSet(), this.getCommonInstructionSet(), null, "commonInstructionSet", null, 0, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterComponent_Cache(), this.getCache(), null, "Cache", null, 0, -1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterComponent_ClockFrequency(), this.getClockFrequency(), null, "clockFrequency", null, 0, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterComponent_AccessTypeSet(), this.getAccessTypeSet(), null, "accessTypeSet", null, 1, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_Arch(), theXMLTypePackage.getString(), "arch", null, 1, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_ArchOption(), theXMLTypePackage.getString(), "archOption", null, 0, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_Endian(), this.getEndianType(), "endian", null, 0, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_MasterType(), this.getMasterType(), "masterType", null, 1, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_NThread(), theXMLTypePackage.getInt(), "nThread", null, 0, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_Pid(), theXMLTypePackage.getString(), "pid", null, 0, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterSlaveBindingEClass, MasterSlaveBinding.class, "MasterSlaveBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterSlaveBinding_Accessor(), this.getAccessor(), null, "accessor", null, 1, -1, MasterSlaveBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterSlaveBinding_SlaveComponentRef(), this.getSlaveComponent(), null, "slaveComponentRef", null, 1, 1, MasterSlaveBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterSlaveBindingSetEClass, MasterSlaveBindingSet.class, "MasterSlaveBindingSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterSlaveBindingSet_MasterSlaveBinding(), this.getMasterSlaveBinding(), null, "masterSlaveBinding", null, 1, -1, MasterSlaveBindingSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryConsistencyModelEClass, MemoryConsistencyModel.class, "MemoryConsistencyModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryConsistencyModel_RarOrdering(), this.getOrderingType(), "rarOrdering", null, 0, 1, MemoryConsistencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryConsistencyModel_RawOrdering(), this.getOrderingType(), "rawOrdering", null, 0, 1, MemoryConsistencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryConsistencyModel_WarOrdering(), this.getOrderingType(), "warOrdering", null, 0, 1, MemoryConsistencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryConsistencyModel_WawOrdering(), this.getOrderingType(), "wawOrdering", null, 0, 1, MemoryConsistencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceEClass, Performance.class, "Performance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformance_Pitch(), this.getPitch(), null, "pitch", null, 1, 1, Performance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformance_Latency(), this.getLatency(), null, "latency", null, 1, 1, Performance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformance_AccessTypeRef(), this.getAccessType(), null, "accessTypeRef", null, 0, 1, Performance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceSetEClass, PerformanceSet.class, "PerformanceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformanceSet_Performance(), this.getPerformance(), null, "performance", null, 0, -1, PerformanceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pitchEClass, Pitch.class, "Pitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sharedMemoryCommunicationEClass, SharedMemoryCommunication.class, "SharedMemoryCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedMemoryCommunication_DataSize(), theXMLTypePackage.getInt(), "dataSize", null, 0, 1, SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedMemoryCommunication_DataSizeUnit(), this.getSizeUnitType(), "dataSizeUnit", null, 0, 1, SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedMemoryCommunication_OperationType(), this.getOperationType(), "operationType", null, 0, 1, SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedMemoryCommunication_AddressSpaceRef(), this.getAddressSpace(), null, "addressSpaceRef", null, 0, 1, SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedMemoryCommunication_SubSpaceRef(), this.getSubSpace(), null, "subSpaceRef", null, 0, 1, SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedRegisterCommunicationEClass, SharedRegisterCommunication.class, "SharedRegisterCommunication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedRegisterCommunication_DataSize(), theXMLTypePackage.getInt(), "dataSize", null, 1, 1, SharedRegisterCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedRegisterCommunication_DataSizeUnit(), this.getSizeUnitType(), "dataSizeUnit", null, 1, 1, SharedRegisterCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedRegisterCommunication_NRegister(), theXMLTypePackage.getInt(), "nRegister", null, 1, 1, SharedRegisterCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slaveComponentEClass, SlaveComponent.class, "SlaveComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlaveComponent_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, SlaveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlaveComponent_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SlaveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlaveComponent_RwType(), this.getRWType(), "rwType", null, 1, 1, SlaveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlaveComponent_Size(), theXMLTypePackage.getInt(), "size", null, 1, 1, SlaveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlaveComponent_SizeUnit(), this.getSizeUnitType(), "sizeUnit", null, 1, 1, SlaveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subSpaceEClass, SubSpace.class, "SubSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubSpace_MemoryConsistencyModel(), this.getMemoryConsistencyModel(), null, "memoryConsistencyModel", null, 0, -1, SubSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSpace_MasterSlaveBindingSet(), this.getMasterSlaveBindingSet(), null, "masterSlaveBindingSet", null, 0, 1, SubSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSpace_End(), theXMLTypePackage.getLong(), "end", null, 1, 1, SubSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSpace_Endian(), this.getEndianType(), "endian", null, 0, 1, SubSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSpace_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, SubSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSpace_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SubSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSpace_Start(), theXMLTypePackage.getLong(), "start", null, 1, 1, SubSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemConfigurationEClass, SystemConfiguration.class, "SystemConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemConfiguration_ComponentSet(), this.getComponentSet(), null, "componentSet", null, 1, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_CommunicationSet(), this.getCommunicationSet(), null, "communicationSet", null, 0, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_AddressSpaceSet(), this.getAddressSpaceSet(), null, "addressSpaceSet", null, 0, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_ClockFrequency(), this.getClockFrequency(), null, "clockFrequency", null, 1, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemConfiguration_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemConfiguration_ShimVersion(), theXMLTypePackage.getString(), "shimVersion", null, 1, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cacheCoherencyTypeEEnum, CacheCoherencyType.class, "CacheCoherencyType");
		addEEnumLiteral(cacheCoherencyTypeEEnum, CacheCoherencyType.SOFT);
		addEEnumLiteral(cacheCoherencyTypeEEnum, CacheCoherencyType.HARD);

		initEEnum(cacheTypeEEnum, CacheType.class, "CacheType");
		addEEnumLiteral(cacheTypeEEnum, CacheType.DATA);
		addEEnumLiteral(cacheTypeEEnum, CacheType.INSTRUCTION);
		addEEnumLiteral(cacheTypeEEnum, CacheType.UNIFIED);

		initEEnum(endianTypeEEnum, EndianType.class, "EndianType");
		addEEnumLiteral(endianTypeEEnum, EndianType.LITTLE);
		addEEnumLiteral(endianTypeEEnum, EndianType.BIG);

		initEEnum(lockDownTypeEEnum, LockDownType.class, "LockDownType");
		addEEnumLiteral(lockDownTypeEEnum, LockDownType.LINE);
		addEEnumLiteral(lockDownTypeEEnum, LockDownType.NONE);
		addEEnumLiteral(lockDownTypeEEnum, LockDownType.WAY);

		initEEnum(masterTypeEEnum, MasterType.class, "MasterType");
		addEEnumLiteral(masterTypeEEnum, MasterType.PU);
		addEEnumLiteral(masterTypeEEnum, MasterType.TU);
		addEEnumLiteral(masterTypeEEnum, MasterType.OTHER);

		initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
		addEEnumLiteral(operationTypeEEnum, OperationType.TAS);
		addEEnumLiteral(operationTypeEEnum, OperationType.LLSC);
		addEEnumLiteral(operationTypeEEnum, OperationType.CAX);
		addEEnumLiteral(operationTypeEEnum, OperationType.OTHER);

		initEEnum(orderingTypeEEnum, OrderingType.class, "OrderingType");
		addEEnumLiteral(orderingTypeEEnum, OrderingType.ORDERD);
		addEEnumLiteral(orderingTypeEEnum, OrderingType.UNORDERD);

		initEEnum(rwTypeEEnum, RWType.class, "RWType");
		addEEnumLiteral(rwTypeEEnum, RWType.RW);
		addEEnumLiteral(rwTypeEEnum, RWType.WX);
		addEEnumLiteral(rwTypeEEnum, RWType.RX);
		addEEnumLiteral(rwTypeEEnum, RWType.R);
		addEEnumLiteral(rwTypeEEnum, RWType.W);
		addEEnumLiteral(rwTypeEEnum, RWType.X);
		addEEnumLiteral(rwTypeEEnum, RWType.RWX);

		initEEnum(sizeUnitTypeEEnum, SizeUnitType.class, "SizeUnitType");
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.KI_B);
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.B);
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.GI_B);
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.MI_B);
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.TI_B);

		// Initialize data types
		initEDataType(cacheCoherencyTypeObjectEDataType, CacheCoherencyType.class, "CacheCoherencyTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cacheTypeObjectEDataType, CacheType.class, "CacheTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(endianTypeObjectEDataType, EndianType.class, "EndianTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lockDownTypeObjectEDataType, LockDownType.class, "LockDownTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(masterTypeObjectEDataType, MasterType.class, "MasterTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operationTypeObjectEDataType, OperationType.class, "OperationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orderingTypeObjectEDataType, OrderingType.class, "OrderingTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rwTypeObjectEDataType, RWType.class, "RWTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sizeUnitTypeObjectEDataType, SizeUnitType.class, "SizeUnitTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "qualified", "false"
		   });
		addAnnotation
		  (abstractCommunicationEClass,
		   source,
		   new String[] {
			   "name", "AbstractCommunication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAbstractCommunication_ConnectionSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAbstractCommunication_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (abstractPerformanceEClass,
		   source,
		   new String[] {
			   "name", "AbstractPerformance",
			   "kind", "empty"
		   });
		addAnnotation
		  (getAbstractPerformance_Best(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "best",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAbstractPerformance_Typical(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typical",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAbstractPerformance_Worst(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "worst",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (accessorEClass,
		   source,
		   new String[] {
			   "name", "Accessor",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAccessor_PerformanceSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PerformanceSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAccessor_MasterComponentRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "masterComponentRef"
		   });
		addAnnotation
		  (accessTypeEClass,
		   source,
		   new String[] {
			   "name", "AccessType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getAccessType_AccessByteSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "accessByteSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAccessType_AlignmentByteSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "alignmentByteSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAccessType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAccessType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAccessType_NBurst(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nBurst",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAccessType_RwType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rwType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (accessTypeSetEClass,
		   source,
		   new String[] {
			   "name", "AccessTypeSet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAccessTypeSet_AccessType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AccessType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (addressSpaceEClass,
		   source,
		   new String[] {
			   "name", "AddressSpace",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddressSpace_SubSpace(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubSpace",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressSpace_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getAddressSpace_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (addressSpaceSetEClass,
		   source,
		   new String[] {
			   "name", "AddressSpaceSet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAddressSpaceSet_AddressSpace(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AddressSpace",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (cacheEClass,
		   source,
		   new String[] {
			   "name", "Cache",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCache_CacheCoherency(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cacheCoherency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCache_CacheType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "cacheType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCache_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCache_LineSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lineSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCache_LockDownType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "lockDownType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCache_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCache_NWay(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nWay",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCache_Size(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "size",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCache_SizeUnit(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sizeUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCache_CacheRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CacheRef"
		   });
		addAnnotation
		  (cacheCoherencyTypeEEnum,
		   source,
		   new String[] {
			   "name", "CacheCoherencyType"
		   });
		addAnnotation
		  (cacheCoherencyTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "CacheCoherencyType:Object",
			   "baseType", "CacheCoherencyType"
		   });
		addAnnotation
		  (cacheTypeEEnum,
		   source,
		   new String[] {
			   "name", "CacheType"
		   });
		addAnnotation
		  (cacheTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "CacheType:Object",
			   "baseType", "CacheType"
		   });
		addAnnotation
		  (clockFrequencyEClass,
		   source,
		   new String[] {
			   "name", "ClockFrequency",
			   "kind", "empty"
		   });
		addAnnotation
		  (getClockFrequency_ClockValue(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "clockValue",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (commonInstructionSetEClass,
		   source,
		   new String[] {
			   "name", "CommonInstructionSet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCommonInstructionSet_Instruction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Instruction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommonInstructionSet_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (communicationSetEClass,
		   source,
		   new String[] {
			   "name", "CommunicationSet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCommunicationSet_SharedRegisterCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SharedRegisterCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommunicationSet_SharedMemoryCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SharedMemoryCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommunicationSet_EventCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EventCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommunicationSet_FIFOCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FIFOCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCommunicationSet_InterruptCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InterruptCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (componentSetEClass,
		   source,
		   new String[] {
			   "name", "ComponentSet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getComponentSet_ComponentSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComponentSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentSet_SlaveComponent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SlaveComponent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentSet_MasterComponent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MasterComponent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentSet_Cache(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Cache",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getComponentSet_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (connectionEClass,
		   source,
		   new String[] {
			   "name", "Connection",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConnection_Performance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Performance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getConnection_To(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "to"
		   });
		addAnnotation
		  (getConnection_From(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "from"
		   });
		addAnnotation
		  (connectionSetEClass,
		   source,
		   new String[] {
			   "name", "ConnectionSet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getConnectionSet_Connection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Connection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_AbstractCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AbstractCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AbstractPerformance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AbstractPerformance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Accessor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Accessor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AccessType(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AccessType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AccessTypeSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AccessTypeSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddressSpace(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AddressSpace",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_AddressSpaceSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AddressSpaceSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Cache(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Cache",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ClockFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ClockFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CommonInstructionSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommonInstructionSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_CommunicationSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommunicationSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ComponentSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComponentSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Connection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Connection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ConnectionSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ConnectionSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_EventCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EventCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_FIFOCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FIFOCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Instruction(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Instruction",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_InterruptCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "InterruptCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Latency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Latency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MasterComponent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MasterComponent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MasterSlaveBinding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MasterSlaveBinding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MasterSlaveBindingSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MasterSlaveBindingSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_MemoryConsistencyModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MemoryConsistencyModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Performance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Performance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_PerformanceSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PerformanceSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Pitch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pitch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SharedMemoryCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SharedMemoryCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SharedRegisterCommunication(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SharedRegisterCommunication",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SlaveComponent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SlaveComponent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SubSpace(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SubSpace",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_SystemConfiguration(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SystemConfiguration",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (endianTypeEEnum,
		   source,
		   new String[] {
			   "name", "EndianType"
		   });
		addAnnotation
		  (endianTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "EndianType:Object",
			   "baseType", "EndianType"
		   });
		addAnnotation
		  (eventCommunicationEClass,
		   source,
		   new String[] {
			   "name", "EventCommunication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (fifoCommunicationEClass,
		   source,
		   new String[] {
			   "name", "FIFOCommunication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFIFOCommunication_DataSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dataSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFIFOCommunication_DataSizeUnit(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dataSizeUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFIFOCommunication_QueueSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "queueSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (instructionEClass,
		   source,
		   new String[] {
			   "name", "Instruction",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInstruction_Performance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Performance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getInstruction_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (interruptCommunicationEClass,
		   source,
		   new String[] {
			   "name", "InterruptCommunication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (latencyEClass,
		   source,
		   new String[] {
			   "name", "Latency",
			   "kind", "empty"
		   });
		addAnnotation
		  (lockDownTypeEEnum,
		   source,
		   new String[] {
			   "name", "LockDownType"
		   });
		addAnnotation
		  (lockDownTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "LockDownType:Object",
			   "baseType", "LockDownType"
		   });
		addAnnotation
		  (masterComponentEClass,
		   source,
		   new String[] {
			   "name", "MasterComponent",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMasterComponent_CommonInstructionSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommonInstructionSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_Cache(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Cache"
		   });
		addAnnotation
		  (getMasterComponent_ClockFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ClockFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_AccessTypeSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AccessTypeSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_Arch(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "arch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_ArchOption(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "archOption",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_Endian(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "endian",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_MasterType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "masterType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_NThread(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nThread",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterComponent_Pid(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "pid",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (masterSlaveBindingEClass,
		   source,
		   new String[] {
			   "name", "MasterSlaveBinding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMasterSlaveBinding_Accessor(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Accessor",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMasterSlaveBinding_SlaveComponentRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "slaveComponentRef"
		   });
		addAnnotation
		  (masterSlaveBindingSetEClass,
		   source,
		   new String[] {
			   "name", "MasterSlaveBindingSet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMasterSlaveBindingSet_MasterSlaveBinding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MasterSlaveBinding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (masterTypeEEnum,
		   source,
		   new String[] {
			   "name", "MasterType"
		   });
		addAnnotation
		  (masterTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "MasterType:Object",
			   "baseType", "MasterType"
		   });
		addAnnotation
		  (memoryConsistencyModelEClass,
		   source,
		   new String[] {
			   "name", "MemoryConsistencyModel",
			   "kind", "empty"
		   });
		addAnnotation
		  (getMemoryConsistencyModel_RarOrdering(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rarOrdering",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMemoryConsistencyModel_RawOrdering(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rawOrdering",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMemoryConsistencyModel_WarOrdering(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "warOrdering",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getMemoryConsistencyModel_WawOrdering(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "wawOrdering",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (operationTypeEEnum,
		   source,
		   new String[] {
			   "name", "OperationType"
		   });
		addAnnotation
		  (operationTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "OperationType:Object",
			   "baseType", "OperationType"
		   });
		addAnnotation
		  (orderingTypeEEnum,
		   source,
		   new String[] {
			   "name", "OrderingType"
		   });
		addAnnotation
		  (orderingTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "OrderingType:Object",
			   "baseType", "OrderingType"
		   });
		addAnnotation
		  (performanceEClass,
		   source,
		   new String[] {
			   "name", "Performance",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPerformance_Pitch(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pitch",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPerformance_Latency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Latency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getPerformance_AccessTypeRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "accessTypeRef"
		   });
		addAnnotation
		  (performanceSetEClass,
		   source,
		   new String[] {
			   "name", "PerformanceSet",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPerformanceSet_Performance(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Performance",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (pitchEClass,
		   source,
		   new String[] {
			   "name", "Pitch",
			   "kind", "empty"
		   });
		addAnnotation
		  (rwTypeEEnum,
		   source,
		   new String[] {
			   "name", "RWType"
		   });
		addAnnotation
		  (rwTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "RWType:Object",
			   "baseType", "RWType"
		   });
		addAnnotation
		  (sharedMemoryCommunicationEClass,
		   source,
		   new String[] {
			   "name", "SharedMemoryCommunication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSharedMemoryCommunication_DataSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dataSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSharedMemoryCommunication_DataSizeUnit(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dataSizeUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSharedMemoryCommunication_OperationType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "operationType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSharedMemoryCommunication_AddressSpaceRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "addressSpaceRef"
		   });
		addAnnotation
		  (getSharedMemoryCommunication_SubSpaceRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "subSpaceRef"
		   });
		addAnnotation
		  (sharedRegisterCommunicationEClass,
		   source,
		   new String[] {
			   "name", "SharedRegisterCommunication",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSharedRegisterCommunication_DataSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dataSize",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSharedRegisterCommunication_DataSizeUnit(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "dataSizeUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSharedRegisterCommunication_NRegister(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "nRegister",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (sizeUnitTypeEEnum,
		   source,
		   new String[] {
			   "name", "SizeUnitType"
		   });
		addAnnotation
		  (sizeUnitTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "SizeUnitType:Object",
			   "baseType", "SizeUnitType"
		   });
		addAnnotation
		  (slaveComponentEClass,
		   source,
		   new String[] {
			   "name", "SlaveComponent",
			   "kind", "empty"
		   });
		addAnnotation
		  (getSlaveComponent_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSlaveComponent_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSlaveComponent_RwType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "rwType",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSlaveComponent_Size(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "size",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSlaveComponent_SizeUnit(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sizeUnit",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (subSpaceEClass,
		   source,
		   new String[] {
			   "name", "SubSpace",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSubSpace_MemoryConsistencyModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MemoryConsistencyModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubSpace_MasterSlaveBindingSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "MasterSlaveBindingSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubSpace_End(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "end",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubSpace_Endian(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "endian",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubSpace_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubSpace_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSubSpace_Start(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "start",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (systemConfigurationEClass,
		   source,
		   new String[] {
			   "name", "SystemConfiguration",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSystemConfiguration_ComponentSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ComponentSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemConfiguration_CommunicationSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CommunicationSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemConfiguration_AddressSpaceSet(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AddressSpaceSet",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemConfiguration_ClockFrequency(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ClockFrequency",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemConfiguration_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getSystemConfiguration_ShimVersion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "shimVersion",
			   "namespace", "##targetNamespace"
		   });
	}

} //ShimPackageImpl
