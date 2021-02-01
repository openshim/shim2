/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.multicore_association.shim.model.shim.AbstractCommunication;
import org.multicore_association.shim.model.shim.AbstractComponent;
import org.multicore_association.shim.model.shim.AbstractInstruction;
import org.multicore_association.shim.model.shim.AbstractPerformance;
import org.multicore_association.shim.model.shim.AbstractShim;
import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.AccessTypeSet;
import org.multicore_association.shim.model.shim.Accessor;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.AddressSpaceSet;
import org.multicore_association.shim.model.shim.Cache;
import org.multicore_association.shim.model.shim.CacheCoherencyType;
import org.multicore_association.shim.model.shim.CachePrefetchType;
import org.multicore_association.shim.model.shim.CacheReplacementType;
import org.multicore_association.shim.model.shim.CacheType;
import org.multicore_association.shim.model.shim.CacheWriteAllocateType;
import org.multicore_association.shim.model.shim.CacheWriteBackType;
import org.multicore_association.shim.model.shim.ClockFrequency;
import org.multicore_association.shim.model.shim.CommonInstructionSet;
import org.multicore_association.shim.model.shim.CommunicationSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.Connection;
import org.multicore_association.shim.model.shim.ConnectionSet;
import org.multicore_association.shim.model.shim.ContentionGroup;
import org.multicore_association.shim.model.shim.ContentionGroupSet;
import org.multicore_association.shim.model.shim.CustomInstruction;
import org.multicore_association.shim.model.shim.DataRate;
import org.multicore_association.shim.model.shim.DataRateUnitType;
import org.multicore_association.shim.model.shim.DocumentRoot;
import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.EventCommunication;
import org.multicore_association.shim.model.shim.FIFOCommunication;
import org.multicore_association.shim.model.shim.FrequencyDomain;
import org.multicore_association.shim.model.shim.FrequencyUnitType;
import org.multicore_association.shim.model.shim.FrequencyVoltageSet;
import org.multicore_association.shim.model.shim.FunctionalUnit;
import org.multicore_association.shim.model.shim.FunctionalUnitSet;
import org.multicore_association.shim.model.shim.FunctionalUnitSetFile;
import org.multicore_association.shim.model.shim.Instruction;
import org.multicore_association.shim.model.shim.InstructionInput;
import org.multicore_association.shim.model.shim.InstructionInputType;
import org.multicore_association.shim.model.shim.InstructionOperation;
import org.multicore_association.shim.model.shim.InstructionOutput;
import org.multicore_association.shim.model.shim.InstructionOutputType;
import org.multicore_association.shim.model.shim.InterruptCommunication;
import org.multicore_association.shim.model.shim.Latency;
import org.multicore_association.shim.model.shim.LockDownType;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.MasterSlaveBinding;
import org.multicore_association.shim.model.shim.MasterSlaveBindingSet;
import org.multicore_association.shim.model.shim.MasterType;
import org.multicore_association.shim.model.shim.MemoryConsistencyModel;
import org.multicore_association.shim.model.shim.OperandAddressingType;
import org.multicore_association.shim.model.shim.OperatingPoint;
import org.multicore_association.shim.model.shim.OperatingPointSet;
import org.multicore_association.shim.model.shim.OperationType;
import org.multicore_association.shim.model.shim.OrderingType;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.PerformanceSet;
import org.multicore_association.shim.model.shim.Pitch;
import org.multicore_association.shim.model.shim.PowerConfiguration;
import org.multicore_association.shim.model.shim.PowerConsumption;
import org.multicore_association.shim.model.shim.PowerConsumptionSet;
import org.multicore_association.shim.model.shim.PowerUnitType;
import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.SharedMemoryCommunication;
import org.multicore_association.shim.model.shim.SharedRegisterCommunication;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimFactory;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SignednessType;
import org.multicore_association.shim.model.shim.SizeUnitType;
import org.multicore_association.shim.model.shim.SlaveComponent;
import org.multicore_association.shim.model.shim.SubSpace;
import org.multicore_association.shim.model.shim.SystemConfiguration;
import org.multicore_association.shim.model.shim.Throughput;
import org.multicore_association.shim.model.shim.ThroughputUnitType;
import org.multicore_association.shim.model.shim.VoltageDomain;
import org.multicore_association.shim.model.shim.VoltageUnitType;

import org.multicore_association.shim.model.shim.util.ShimValidator;

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
	private EClass abstractComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInstructionEClass = null;

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
	private EClass abstractShimEClass = null;

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
	private EClass contentionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentionGroupSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRateEClass = null;

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
	private EClass frequencyDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyVoltageSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalUnitSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalUnitSetFileEClass = null;

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
	private EClass instructionInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionOutputEClass = null;

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
	private EClass operatingPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingPointSetEClass = null;

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
	private EClass powerConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerConsumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerConsumptionSetEClass = null;

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
	private EClass shimEClass = null;

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
	private EClass throughputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voltageDomainEClass = null;

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
	private EEnum cachePrefetchTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheReplacementTypeEEnum = null;

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
	private EEnum cacheWriteAllocateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheWriteBackTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataRateUnitTypeEEnum = null;

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
	private EEnum frequencyUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instructionInputTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instructionOutputTypeEEnum = null;

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
	private EEnum operandAddressingTypeEEnum = null;

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
	private EEnum powerUnitTypeEEnum = null;

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
	private EEnum signednessTypeEEnum = null;

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
	private EEnum throughputUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum voltageUnitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType addressValueTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType addressValueObjectTypeEDataType = null;

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
	private EDataType cachePrefetchTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cacheReplacementTypeObjectEDataType = null;

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
	private EDataType cacheWriteAllocateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cacheWriteBackTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataRateUnitTypeObjectEDataType = null;

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
	private EDataType frequencyUnitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instructionInputTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instructionOutputTypeObjectEDataType = null;

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
	private EDataType operandAddressingTypeObjectEDataType = null;

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
	private EDataType powerUnitTypeObjectEDataType = null;

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
	private EDataType signednessTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sizeUnitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType throughputUnitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsignedFloatTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsignedFloatObjectTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsignedIntTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsignedIntObjectTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voltageUnitTypeObjectEDataType = null;

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
	 * @see org.multicore_association.shim.model.shim.ShimPackage#eNS_URI
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
		if (isInited)
			return (ShimPackage) EPackage.Registry.INSTANCE.getEPackage(ShimPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredShimPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ShimPackageImpl theShimPackage = registeredShimPackage instanceof ShimPackageImpl
				? (ShimPackageImpl) registeredShimPackage
				: new ShimPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theShimPackage.createPackageContents();

		// Initialize created meta-data
		theShimPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theShimPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return ShimValidator.INSTANCE;
			}
		});

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
		return (EReference) abstractCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractCommunication_Name() {
		return (EAttribute) abstractCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponent() {
		return abstractComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponent_Name() {
		return (EAttribute) abstractComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponent_Id() {
		return (EAttribute) abstractComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponent_FrequencyDomainRef() {
		return (EReference) abstractComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponent_VoltageDomainRef() {
		return (EReference) abstractComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponent_OperatingPointRef() {
		return (EReference) abstractComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInstruction() {
		return abstractInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInstruction_Name() {
		return (EAttribute) abstractInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInstruction_EncodingLength() {
		return (EAttribute) abstractInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInstruction_NInputs() {
		return (EAttribute) abstractInstructionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInstruction_NOutputs() {
		return (EAttribute) abstractInstructionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInstruction_SIMDWidth() {
		return (EAttribute) abstractInstructionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractInstruction_Performance() {
		return (EReference) abstractInstructionEClass.getEStructuralFeatures().get(5);
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
		return (EAttribute) abstractPerformanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPerformance_Typical() {
		return (EAttribute) abstractPerformanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPerformance_Worst() {
		return (EAttribute) abstractPerformanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractShim() {
		return abstractShimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShim_Name() {
		return (EAttribute) abstractShimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShim_ShimVersion() {
		return (EAttribute) abstractShimEClass.getEStructuralFeatures().get(1);
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
	public EReference getAccessor_MasterComponentRef() {
		return (EReference) accessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessor_PerformanceSet() {
		return (EReference) accessorEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getAccessType_Name() {
		return (EAttribute) accessTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_Id() {
		return (EAttribute) accessTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_RwType() {
		return (EAttribute) accessTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_AccessByteSize() {
		return (EAttribute) accessTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_AlignmentByteSize() {
		return (EAttribute) accessTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessType_NBurst() {
		return (EAttribute) accessTypeEClass.getEStructuralFeatures().get(5);
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
		return (EReference) accessTypeSetEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAddressSpace_Name() {
		return (EAttribute) addressSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressSpace_Id() {
		return (EAttribute) addressSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressSpace_SubSpace() {
		return (EReference) addressSpaceEClass.getEStructuralFeatures().get(2);
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
		return (EReference) addressSpaceSetEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCache_CacheType() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_CacheCoherency() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Size() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_SizeUnit() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_NWay() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_LineSize() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_LockDownType() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Prefetch() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_PrefetchDistance() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_Replacement() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_WriteAllocate() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCache_WriteBack() {
		return (EAttribute) cacheEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCache_CacheRef() {
		return (EReference) cacheEClass.getEStructuralFeatures().get(12);
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
		return (EAttribute) clockFrequencyEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCommonInstructionSet_Name() {
		return (EAttribute) commonInstructionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonInstructionSet_FunctionalUnitSetFile() {
		return (EReference) commonInstructionSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonInstructionSet_FunctionalUnitSet() {
		return (EReference) commonInstructionSetEClass.getEStructuralFeatures().get(2);
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
	public EReference getCommunicationSet_SharedMemoryCommunication() {
		return (EReference) communicationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationSet_SharedRegisterCommunication() {
		return (EReference) communicationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationSet_EventCommunication() {
		return (EReference) communicationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationSet_FIFOCommunication() {
		return (EReference) communicationSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationSet_InterruptCommunication() {
		return (EReference) communicationSetEClass.getEStructuralFeatures().get(4);
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
		return (EReference) componentSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSet_MasterComponent() {
		return (EReference) componentSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSet_SlaveComponent() {
		return (EReference) componentSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSet_Cache() {
		return (EReference) componentSetEClass.getEStructuralFeatures().get(3);
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
	public EReference getConnection_From() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_To() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Performance() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(2);
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
		return (EReference) connectionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentionGroup() {
		return contentionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentionGroup_Name() {
		return (EAttribute) contentionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentionGroup_Id() {
		return (EAttribute) contentionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentionGroup_Throughput() {
		return (EReference) contentionGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentionGroup_DataRate() {
		return (EReference) contentionGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentionGroup_PerformanceSetRef() {
		return (EReference) contentionGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentionGroupSet() {
		return contentionGroupSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentionGroupSet_ContentionGroup() {
		return (EReference) contentionGroupSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomInstruction() {
		return customInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomInstruction_InstructionInput() {
		return (EReference) customInstructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomInstruction_InstructionOperation() {
		return (EReference) customInstructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomInstruction_InstructionOutput() {
		return (EReference) customInstructionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataRate() {
		return dataRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRate_Value() {
		return (EAttribute) dataRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataRate_Unit() {
		return (EAttribute) dataRateEClass.getEStructuralFeatures().get(1);
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
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Shim() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
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
		return (EAttribute) fifoCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFIFOCommunication_DataSizeUnit() {
		return (EAttribute) fifoCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFIFOCommunication_QueueSize() {
		return (EAttribute) fifoCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyDomain() {
		return frequencyDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyDomain_Name() {
		return (EAttribute) frequencyDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyDomain_Id() {
		return (EAttribute) frequencyDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyVoltageSet() {
		return frequencyVoltageSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyVoltageSet_FrequencyDomain() {
		return (EReference) frequencyVoltageSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyVoltageSet_VoltageDomain() {
		return (EReference) frequencyVoltageSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyVoltageSet_OperatingPointSet() {
		return (EReference) frequencyVoltageSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalUnit() {
		return functionalUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalUnit_Name() {
		return (EAttribute) functionalUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalUnit_Instruction() {
		return (EReference) functionalUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalUnit_CustomInstruction() {
		return (EReference) functionalUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalUnitSet() {
		return functionalUnitSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalUnitSet_FunctionalUnit() {
		return (EReference) functionalUnitSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalUnitSetFile() {
		return functionalUnitSetFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalUnitSetFile_Src() {
		return (EAttribute) functionalUnitSetFileEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getInstruction_ImmediateBitWidth() {
		return (EAttribute) instructionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_InputBitWidth() {
		return (EAttribute) instructionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_InputPreserved() {
		return (EAttribute) instructionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_IsEmulated() {
		return (EAttribute) instructionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_OperandAddressing() {
		return (EAttribute) instructionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_Operation() {
		return (EAttribute) instructionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_OutputBitWidth() {
		return (EAttribute) instructionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstruction_SupportedSignedness() {
		return (EAttribute) instructionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionInput() {
		return instructionInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionInput_Type() {
		return (EAttribute) instructionInputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionInput_BitWidth() {
		return (EAttribute) instructionInputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionInput_Value() {
		return (EAttribute) instructionInputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionOperation() {
		return instructionOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionOperation_Operation() {
		return (EAttribute) instructionOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionOperation_InstructionOperand() {
		return (EAttribute) instructionOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionOutput() {
		return instructionOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionOutput_Type() {
		return (EAttribute) instructionOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionOutput_BitWidth() {
		return (EAttribute) instructionOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionOutput_Ref() {
		return (EAttribute) instructionOutputEClass.getEStructuralFeatures().get(2);
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
	public EReference getMasterComponent_CacheRef() {
		return (EReference) masterComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterComponent_AccessTypeSet() {
		return (EReference) masterComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterComponent_ClockFrequency() {
		return (EReference) masterComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_Arch() {
		return (EAttribute) masterComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_ArchOption() {
		return (EAttribute) masterComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_Endian() {
		return (EAttribute) masterComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_MasterType() {
		return (EAttribute) masterComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_NChannel() {
		return (EAttribute) masterComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_NThread() {
		return (EAttribute) masterComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMasterComponent_Pid() {
		return (EAttribute) masterComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterComponent_CommonInstructionSet() {
		return (EReference) masterComponentEClass.getEStructuralFeatures().get(10);
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
		return (EReference) masterSlaveBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMasterSlaveBinding_SlaveComponentRef() {
		return (EReference) masterSlaveBindingEClass.getEStructuralFeatures().get(1);
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
		return (EReference) masterSlaveBindingSetEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getMemoryConsistencyModel_RawOrdering() {
		return (EAttribute) memoryConsistencyModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryConsistencyModel_WarOrdering() {
		return (EAttribute) memoryConsistencyModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryConsistencyModel_WawOrdering() {
		return (EAttribute) memoryConsistencyModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryConsistencyModel_RarOrdering() {
		return (EAttribute) memoryConsistencyModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingPoint() {
		return operatingPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingPoint_Name() {
		return (EAttribute) operatingPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingPoint_Id() {
		return (EAttribute) operatingPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingPoint_Frequency() {
		return (EAttribute) operatingPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingPoint_FrequencyUnit() {
		return (EAttribute) operatingPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingPoint_Voltage() {
		return (EAttribute) operatingPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingPoint_VoltageUnit() {
		return (EAttribute) operatingPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatingPointSet() {
		return operatingPointSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingPointSet_Name() {
		return (EAttribute) operatingPointSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperatingPointSet_Id() {
		return (EAttribute) operatingPointSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperatingPointSet_OperatingPoint() {
		return (EReference) operatingPointSetEClass.getEStructuralFeatures().get(2);
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
	public EReference getPerformance_AccessTypeRef() {
		return (EReference) performanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformance_Pitch() {
		return (EReference) performanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformance_Latency() {
		return (EReference) performanceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPerformanceSet_Id() {
		return (EAttribute) performanceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformanceSet_CacheRef() {
		return (EReference) performanceSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerformanceSet_Performance() {
		return (EReference) performanceSetEClass.getEStructuralFeatures().get(2);
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
	public EClass getPowerConfiguration() {
		return powerConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerConfiguration_SystemConfigurationSrc() {
		return (EAttribute) powerConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConfiguration_PowerConsumptionSet() {
		return (EReference) powerConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerConsumption() {
		return powerConsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConsumption_OperatingPointRef() {
		return (EReference) powerConsumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerConsumption_Power() {
		return (EAttribute) powerConsumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerConsumption_PowerUnit() {
		return (EAttribute) powerConsumptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerConsumptionSet() {
		return powerConsumptionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerConsumptionSet_Name() {
		return (EAttribute) powerConsumptionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerConsumptionSet_Id() {
		return (EAttribute) powerConsumptionSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConsumptionSet_PowerConsumption() {
		return (EReference) powerConsumptionSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerConsumptionSet_PowerConsumerRef() {
		return (EReference) powerConsumptionSetEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getSharedMemoryCommunication_OperationType() {
		return (EAttribute) sharedMemoryCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedMemoryCommunication_DataSize() {
		return (EAttribute) sharedMemoryCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedMemoryCommunication_DataSizeUnit() {
		return (EAttribute) sharedMemoryCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedMemoryCommunication_AddressSpaceRef() {
		return (EReference) sharedMemoryCommunicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedMemoryCommunication_SubSpaceRef() {
		return (EReference) sharedMemoryCommunicationEClass.getEStructuralFeatures().get(4);
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
		return (EAttribute) sharedRegisterCommunicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedRegisterCommunication_DataSizeUnit() {
		return (EAttribute) sharedRegisterCommunicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedRegisterCommunication_NRegister() {
		return (EAttribute) sharedRegisterCommunicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShim() {
		return shimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShim_SystemConfiguration() {
		return (EReference) shimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShim_PowerConfiguration() {
		return (EReference) shimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShim_FunctionalUnitSet() {
		return (EReference) shimEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getSlaveComponent_Size() {
		return (EAttribute) slaveComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlaveComponent_SizeUnit() {
		return (EAttribute) slaveComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlaveComponent_RwType() {
		return (EAttribute) slaveComponentEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getSubSpace_Name() {
		return (EAttribute) subSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSpace_Id() {
		return (EAttribute) subSpaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSpace_Start() {
		return (EAttribute) subSpaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSpace_End() {
		return (EAttribute) subSpaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubSpace_Endian() {
		return (EAttribute) subSpaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSpace_MasterSlaveBindingSet() {
		return (EReference) subSpaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubSpace_MemoryConsistencyModel() {
		return (EReference) subSpaceEClass.getEStructuralFeatures().get(6);
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
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_AddressSpaceSet() {
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_CommunicationSet() {
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_FrequencyVoltageSet() {
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemConfiguration_ContentionGroupSet() {
		return (EReference) systemConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThroughput() {
		return throughputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThroughput_FrequencyDomainRef() {
		return (EReference) throughputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThroughput_Value() {
		return (EAttribute) throughputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThroughput_Unit() {
		return (EAttribute) throughputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoltageDomain() {
		return voltageDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoltageDomain_Name() {
		return (EAttribute) voltageDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoltageDomain_Id() {
		return (EAttribute) voltageDomainEClass.getEStructuralFeatures().get(1);
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
	public EEnum getCachePrefetchType() {
		return cachePrefetchTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCacheReplacementType() {
		return cacheReplacementTypeEEnum;
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
	public EEnum getCacheWriteAllocateType() {
		return cacheWriteAllocateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCacheWriteBackType() {
		return cacheWriteBackTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataRateUnitType() {
		return dataRateUnitTypeEEnum;
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
	public EEnum getFrequencyUnitType() {
		return frequencyUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstructionInputType() {
		return instructionInputTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstructionOutputType() {
		return instructionOutputTypeEEnum;
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
	public EEnum getOperandAddressingType() {
		return operandAddressingTypeEEnum;
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
	public EEnum getPowerUnitType() {
		return powerUnitTypeEEnum;
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
	public EEnum getSignednessType() {
		return signednessTypeEEnum;
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
	public EEnum getThroughputUnitType() {
		return throughputUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVoltageUnitType() {
		return voltageUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAddressValueType() {
		return addressValueTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAddressValueObjectType() {
		return addressValueObjectTypeEDataType;
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
	public EDataType getCachePrefetchTypeObject() {
		return cachePrefetchTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCacheReplacementTypeObject() {
		return cacheReplacementTypeObjectEDataType;
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
	public EDataType getCacheWriteAllocateTypeObject() {
		return cacheWriteAllocateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCacheWriteBackTypeObject() {
		return cacheWriteBackTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataRateUnitTypeObject() {
		return dataRateUnitTypeObjectEDataType;
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
	public EDataType getFrequencyUnitTypeObject() {
		return frequencyUnitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInstructionInputTypeObject() {
		return instructionInputTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInstructionOutputTypeObject() {
		return instructionOutputTypeObjectEDataType;
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
	public EDataType getOperandAddressingTypeObject() {
		return operandAddressingTypeObjectEDataType;
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
	public EDataType getPowerUnitTypeObject() {
		return powerUnitTypeObjectEDataType;
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
	public EDataType getSignednessTypeObject() {
		return signednessTypeObjectEDataType;
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
	public EDataType getThroughputUnitTypeObject() {
		return throughputUnitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsignedFloatType() {
		return unsignedFloatTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsignedFloatObjectType() {
		return unsignedFloatObjectTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsignedIntType() {
		return unsignedIntTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsignedIntObjectType() {
		return unsignedIntObjectTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoltageUnitTypeObject() {
		return voltageUnitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimFactory getShimFactory() {
		return (ShimFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		abstractCommunicationEClass = createEClass(ABSTRACT_COMMUNICATION);
		createEReference(abstractCommunicationEClass, ABSTRACT_COMMUNICATION__CONNECTION_SET);
		createEAttribute(abstractCommunicationEClass, ABSTRACT_COMMUNICATION__NAME);

		abstractComponentEClass = createEClass(ABSTRACT_COMPONENT);
		createEAttribute(abstractComponentEClass, ABSTRACT_COMPONENT__NAME);
		createEAttribute(abstractComponentEClass, ABSTRACT_COMPONENT__ID);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF);
		createEReference(abstractComponentEClass, ABSTRACT_COMPONENT__OPERATING_POINT_REF);

		abstractInstructionEClass = createEClass(ABSTRACT_INSTRUCTION);
		createEAttribute(abstractInstructionEClass, ABSTRACT_INSTRUCTION__NAME);
		createEAttribute(abstractInstructionEClass, ABSTRACT_INSTRUCTION__ENCODING_LENGTH);
		createEAttribute(abstractInstructionEClass, ABSTRACT_INSTRUCTION__NINPUTS);
		createEAttribute(abstractInstructionEClass, ABSTRACT_INSTRUCTION__NOUTPUTS);
		createEAttribute(abstractInstructionEClass, ABSTRACT_INSTRUCTION__SIMD_WIDTH);
		createEReference(abstractInstructionEClass, ABSTRACT_INSTRUCTION__PERFORMANCE);

		abstractPerformanceEClass = createEClass(ABSTRACT_PERFORMANCE);
		createEAttribute(abstractPerformanceEClass, ABSTRACT_PERFORMANCE__BEST);
		createEAttribute(abstractPerformanceEClass, ABSTRACT_PERFORMANCE__TYPICAL);
		createEAttribute(abstractPerformanceEClass, ABSTRACT_PERFORMANCE__WORST);

		abstractShimEClass = createEClass(ABSTRACT_SHIM);
		createEAttribute(abstractShimEClass, ABSTRACT_SHIM__NAME);
		createEAttribute(abstractShimEClass, ABSTRACT_SHIM__SHIM_VERSION);

		accessorEClass = createEClass(ACCESSOR);
		createEReference(accessorEClass, ACCESSOR__MASTER_COMPONENT_REF);
		createEReference(accessorEClass, ACCESSOR__PERFORMANCE_SET);

		accessTypeEClass = createEClass(ACCESS_TYPE);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__NAME);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__ID);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__RW_TYPE);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__ACCESS_BYTE_SIZE);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__ALIGNMENT_BYTE_SIZE);
		createEAttribute(accessTypeEClass, ACCESS_TYPE__NBURST);

		accessTypeSetEClass = createEClass(ACCESS_TYPE_SET);
		createEReference(accessTypeSetEClass, ACCESS_TYPE_SET__ACCESS_TYPE);

		addressSpaceEClass = createEClass(ADDRESS_SPACE);
		createEAttribute(addressSpaceEClass, ADDRESS_SPACE__NAME);
		createEAttribute(addressSpaceEClass, ADDRESS_SPACE__ID);
		createEReference(addressSpaceEClass, ADDRESS_SPACE__SUB_SPACE);

		addressSpaceSetEClass = createEClass(ADDRESS_SPACE_SET);
		createEReference(addressSpaceSetEClass, ADDRESS_SPACE_SET__ADDRESS_SPACE);

		cacheEClass = createEClass(CACHE);
		createEAttribute(cacheEClass, CACHE__CACHE_TYPE);
		createEAttribute(cacheEClass, CACHE__CACHE_COHERENCY);
		createEAttribute(cacheEClass, CACHE__SIZE);
		createEAttribute(cacheEClass, CACHE__SIZE_UNIT);
		createEAttribute(cacheEClass, CACHE__NWAY);
		createEAttribute(cacheEClass, CACHE__LINE_SIZE);
		createEAttribute(cacheEClass, CACHE__LOCK_DOWN_TYPE);
		createEAttribute(cacheEClass, CACHE__PREFETCH);
		createEAttribute(cacheEClass, CACHE__PREFETCH_DISTANCE);
		createEAttribute(cacheEClass, CACHE__REPLACEMENT);
		createEAttribute(cacheEClass, CACHE__WRITE_ALLOCATE);
		createEAttribute(cacheEClass, CACHE__WRITE_BACK);
		createEReference(cacheEClass, CACHE__CACHE_REF);

		clockFrequencyEClass = createEClass(CLOCK_FREQUENCY);
		createEAttribute(clockFrequencyEClass, CLOCK_FREQUENCY__CLOCK_VALUE);

		commonInstructionSetEClass = createEClass(COMMON_INSTRUCTION_SET);
		createEAttribute(commonInstructionSetEClass, COMMON_INSTRUCTION_SET__NAME);
		createEReference(commonInstructionSetEClass, COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE);
		createEReference(commonInstructionSetEClass, COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET);

		communicationSetEClass = createEClass(COMMUNICATION_SET);
		createEReference(communicationSetEClass, COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION);
		createEReference(communicationSetEClass, COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION);
		createEReference(communicationSetEClass, COMMUNICATION_SET__EVENT_COMMUNICATION);
		createEReference(communicationSetEClass, COMMUNICATION_SET__FIFO_COMMUNICATION);
		createEReference(communicationSetEClass, COMMUNICATION_SET__INTERRUPT_COMMUNICATION);

		componentSetEClass = createEClass(COMPONENT_SET);
		createEReference(componentSetEClass, COMPONENT_SET__COMPONENT_SET);
		createEReference(componentSetEClass, COMPONENT_SET__MASTER_COMPONENT);
		createEReference(componentSetEClass, COMPONENT_SET__SLAVE_COMPONENT);
		createEReference(componentSetEClass, COMPONENT_SET__CACHE);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__FROM);
		createEReference(connectionEClass, CONNECTION__TO);
		createEReference(connectionEClass, CONNECTION__PERFORMANCE);

		connectionSetEClass = createEClass(CONNECTION_SET);
		createEReference(connectionSetEClass, CONNECTION_SET__CONNECTION);

		contentionGroupEClass = createEClass(CONTENTION_GROUP);
		createEAttribute(contentionGroupEClass, CONTENTION_GROUP__NAME);
		createEAttribute(contentionGroupEClass, CONTENTION_GROUP__ID);
		createEReference(contentionGroupEClass, CONTENTION_GROUP__THROUGHPUT);
		createEReference(contentionGroupEClass, CONTENTION_GROUP__DATA_RATE);
		createEReference(contentionGroupEClass, CONTENTION_GROUP__PERFORMANCE_SET_REF);

		contentionGroupSetEClass = createEClass(CONTENTION_GROUP_SET);
		createEReference(contentionGroupSetEClass, CONTENTION_GROUP_SET__CONTENTION_GROUP);

		customInstructionEClass = createEClass(CUSTOM_INSTRUCTION);
		createEReference(customInstructionEClass, CUSTOM_INSTRUCTION__INSTRUCTION_INPUT);
		createEReference(customInstructionEClass, CUSTOM_INSTRUCTION__INSTRUCTION_OPERATION);
		createEReference(customInstructionEClass, CUSTOM_INSTRUCTION__INSTRUCTION_OUTPUT);

		dataRateEClass = createEClass(DATA_RATE);
		createEAttribute(dataRateEClass, DATA_RATE__VALUE);
		createEAttribute(dataRateEClass, DATA_RATE__UNIT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SHIM);

		eventCommunicationEClass = createEClass(EVENT_COMMUNICATION);

		fifoCommunicationEClass = createEClass(FIFO_COMMUNICATION);
		createEAttribute(fifoCommunicationEClass, FIFO_COMMUNICATION__DATA_SIZE);
		createEAttribute(fifoCommunicationEClass, FIFO_COMMUNICATION__DATA_SIZE_UNIT);
		createEAttribute(fifoCommunicationEClass, FIFO_COMMUNICATION__QUEUE_SIZE);

		frequencyDomainEClass = createEClass(FREQUENCY_DOMAIN);
		createEAttribute(frequencyDomainEClass, FREQUENCY_DOMAIN__NAME);
		createEAttribute(frequencyDomainEClass, FREQUENCY_DOMAIN__ID);

		frequencyVoltageSetEClass = createEClass(FREQUENCY_VOLTAGE_SET);
		createEReference(frequencyVoltageSetEClass, FREQUENCY_VOLTAGE_SET__FREQUENCY_DOMAIN);
		createEReference(frequencyVoltageSetEClass, FREQUENCY_VOLTAGE_SET__VOLTAGE_DOMAIN);
		createEReference(frequencyVoltageSetEClass, FREQUENCY_VOLTAGE_SET__OPERATING_POINT_SET);

		functionalUnitEClass = createEClass(FUNCTIONAL_UNIT);
		createEAttribute(functionalUnitEClass, FUNCTIONAL_UNIT__NAME);
		createEReference(functionalUnitEClass, FUNCTIONAL_UNIT__INSTRUCTION);
		createEReference(functionalUnitEClass, FUNCTIONAL_UNIT__CUSTOM_INSTRUCTION);

		functionalUnitSetEClass = createEClass(FUNCTIONAL_UNIT_SET);
		createEReference(functionalUnitSetEClass, FUNCTIONAL_UNIT_SET__FUNCTIONAL_UNIT);

		functionalUnitSetFileEClass = createEClass(FUNCTIONAL_UNIT_SET_FILE);
		createEAttribute(functionalUnitSetFileEClass, FUNCTIONAL_UNIT_SET_FILE__SRC);

		instructionEClass = createEClass(INSTRUCTION);
		createEAttribute(instructionEClass, INSTRUCTION__IMMEDIATE_BIT_WIDTH);
		createEAttribute(instructionEClass, INSTRUCTION__INPUT_BIT_WIDTH);
		createEAttribute(instructionEClass, INSTRUCTION__INPUT_PRESERVED);
		createEAttribute(instructionEClass, INSTRUCTION__IS_EMULATED);
		createEAttribute(instructionEClass, INSTRUCTION__OPERAND_ADDRESSING);
		createEAttribute(instructionEClass, INSTRUCTION__OPERATION);
		createEAttribute(instructionEClass, INSTRUCTION__OUTPUT_BIT_WIDTH);
		createEAttribute(instructionEClass, INSTRUCTION__SUPPORTED_SIGNEDNESS);

		instructionInputEClass = createEClass(INSTRUCTION_INPUT);
		createEAttribute(instructionInputEClass, INSTRUCTION_INPUT__TYPE);
		createEAttribute(instructionInputEClass, INSTRUCTION_INPUT__BIT_WIDTH);
		createEAttribute(instructionInputEClass, INSTRUCTION_INPUT__VALUE);

		instructionOperationEClass = createEClass(INSTRUCTION_OPERATION);
		createEAttribute(instructionOperationEClass, INSTRUCTION_OPERATION__OPERATION);
		createEAttribute(instructionOperationEClass, INSTRUCTION_OPERATION__INSTRUCTION_OPERAND);

		instructionOutputEClass = createEClass(INSTRUCTION_OUTPUT);
		createEAttribute(instructionOutputEClass, INSTRUCTION_OUTPUT__TYPE);
		createEAttribute(instructionOutputEClass, INSTRUCTION_OUTPUT__BIT_WIDTH);
		createEAttribute(instructionOutputEClass, INSTRUCTION_OUTPUT__REF);

		interruptCommunicationEClass = createEClass(INTERRUPT_COMMUNICATION);

		latencyEClass = createEClass(LATENCY);

		masterComponentEClass = createEClass(MASTER_COMPONENT);
		createEReference(masterComponentEClass, MASTER_COMPONENT__CACHE_REF);
		createEReference(masterComponentEClass, MASTER_COMPONENT__ACCESS_TYPE_SET);
		createEReference(masterComponentEClass, MASTER_COMPONENT__CLOCK_FREQUENCY);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__ARCH);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__ARCH_OPTION);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__ENDIAN);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__MASTER_TYPE);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__NCHANNEL);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__NTHREAD);
		createEAttribute(masterComponentEClass, MASTER_COMPONENT__PID);
		createEReference(masterComponentEClass, MASTER_COMPONENT__COMMON_INSTRUCTION_SET);

		masterSlaveBindingEClass = createEClass(MASTER_SLAVE_BINDING);
		createEReference(masterSlaveBindingEClass, MASTER_SLAVE_BINDING__ACCESSOR);
		createEReference(masterSlaveBindingEClass, MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF);

		masterSlaveBindingSetEClass = createEClass(MASTER_SLAVE_BINDING_SET);
		createEReference(masterSlaveBindingSetEClass, MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING);

		memoryConsistencyModelEClass = createEClass(MEMORY_CONSISTENCY_MODEL);
		createEAttribute(memoryConsistencyModelEClass, MEMORY_CONSISTENCY_MODEL__RAW_ORDERING);
		createEAttribute(memoryConsistencyModelEClass, MEMORY_CONSISTENCY_MODEL__WAR_ORDERING);
		createEAttribute(memoryConsistencyModelEClass, MEMORY_CONSISTENCY_MODEL__WAW_ORDERING);
		createEAttribute(memoryConsistencyModelEClass, MEMORY_CONSISTENCY_MODEL__RAR_ORDERING);

		operatingPointEClass = createEClass(OPERATING_POINT);
		createEAttribute(operatingPointEClass, OPERATING_POINT__NAME);
		createEAttribute(operatingPointEClass, OPERATING_POINT__ID);
		createEAttribute(operatingPointEClass, OPERATING_POINT__FREQUENCY);
		createEAttribute(operatingPointEClass, OPERATING_POINT__FREQUENCY_UNIT);
		createEAttribute(operatingPointEClass, OPERATING_POINT__VOLTAGE);
		createEAttribute(operatingPointEClass, OPERATING_POINT__VOLTAGE_UNIT);

		operatingPointSetEClass = createEClass(OPERATING_POINT_SET);
		createEAttribute(operatingPointSetEClass, OPERATING_POINT_SET__NAME);
		createEAttribute(operatingPointSetEClass, OPERATING_POINT_SET__ID);
		createEReference(operatingPointSetEClass, OPERATING_POINT_SET__OPERATING_POINT);

		performanceEClass = createEClass(PERFORMANCE);
		createEReference(performanceEClass, PERFORMANCE__PITCH);
		createEReference(performanceEClass, PERFORMANCE__LATENCY);
		createEReference(performanceEClass, PERFORMANCE__ACCESS_TYPE_REF);

		performanceSetEClass = createEClass(PERFORMANCE_SET);
		createEAttribute(performanceSetEClass, PERFORMANCE_SET__ID);
		createEReference(performanceSetEClass, PERFORMANCE_SET__CACHE_REF);
		createEReference(performanceSetEClass, PERFORMANCE_SET__PERFORMANCE);

		pitchEClass = createEClass(PITCH);

		powerConfigurationEClass = createEClass(POWER_CONFIGURATION);
		createEAttribute(powerConfigurationEClass, POWER_CONFIGURATION__SYSTEM_CONFIGURATION_SRC);
		createEReference(powerConfigurationEClass, POWER_CONFIGURATION__POWER_CONSUMPTION_SET);

		powerConsumptionEClass = createEClass(POWER_CONSUMPTION);
		createEReference(powerConsumptionEClass, POWER_CONSUMPTION__OPERATING_POINT_REF);
		createEAttribute(powerConsumptionEClass, POWER_CONSUMPTION__POWER);
		createEAttribute(powerConsumptionEClass, POWER_CONSUMPTION__POWER_UNIT);

		powerConsumptionSetEClass = createEClass(POWER_CONSUMPTION_SET);
		createEAttribute(powerConsumptionSetEClass, POWER_CONSUMPTION_SET__NAME);
		createEAttribute(powerConsumptionSetEClass, POWER_CONSUMPTION_SET__ID);
		createEReference(powerConsumptionSetEClass, POWER_CONSUMPTION_SET__POWER_CONSUMPTION);
		createEReference(powerConsumptionSetEClass, POWER_CONSUMPTION_SET__POWER_CONSUMER_REF);

		sharedMemoryCommunicationEClass = createEClass(SHARED_MEMORY_COMMUNICATION);
		createEAttribute(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE);
		createEAttribute(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__DATA_SIZE);
		createEAttribute(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT);
		createEReference(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF);
		createEReference(sharedMemoryCommunicationEClass, SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF);

		sharedRegisterCommunicationEClass = createEClass(SHARED_REGISTER_COMMUNICATION);
		createEAttribute(sharedRegisterCommunicationEClass, SHARED_REGISTER_COMMUNICATION__DATA_SIZE);
		createEAttribute(sharedRegisterCommunicationEClass, SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT);
		createEAttribute(sharedRegisterCommunicationEClass, SHARED_REGISTER_COMMUNICATION__NREGISTER);

		shimEClass = createEClass(SHIM);
		createEReference(shimEClass, SHIM__SYSTEM_CONFIGURATION);
		createEReference(shimEClass, SHIM__POWER_CONFIGURATION);
		createEReference(shimEClass, SHIM__FUNCTIONAL_UNIT_SET);

		slaveComponentEClass = createEClass(SLAVE_COMPONENT);
		createEAttribute(slaveComponentEClass, SLAVE_COMPONENT__SIZE);
		createEAttribute(slaveComponentEClass, SLAVE_COMPONENT__SIZE_UNIT);
		createEAttribute(slaveComponentEClass, SLAVE_COMPONENT__RW_TYPE);

		subSpaceEClass = createEClass(SUB_SPACE);
		createEAttribute(subSpaceEClass, SUB_SPACE__NAME);
		createEAttribute(subSpaceEClass, SUB_SPACE__ID);
		createEAttribute(subSpaceEClass, SUB_SPACE__START);
		createEAttribute(subSpaceEClass, SUB_SPACE__END);
		createEAttribute(subSpaceEClass, SUB_SPACE__ENDIAN);
		createEReference(subSpaceEClass, SUB_SPACE__MASTER_SLAVE_BINDING_SET);
		createEReference(subSpaceEClass, SUB_SPACE__MEMORY_CONSISTENCY_MODEL);

		systemConfigurationEClass = createEClass(SYSTEM_CONFIGURATION);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__COMPONENT_SET);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__COMMUNICATION_SET);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET);
		createEReference(systemConfigurationEClass, SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET);

		throughputEClass = createEClass(THROUGHPUT);
		createEReference(throughputEClass, THROUGHPUT__FREQUENCY_DOMAIN_REF);
		createEAttribute(throughputEClass, THROUGHPUT__VALUE);
		createEAttribute(throughputEClass, THROUGHPUT__UNIT);

		voltageDomainEClass = createEClass(VOLTAGE_DOMAIN);
		createEAttribute(voltageDomainEClass, VOLTAGE_DOMAIN__NAME);
		createEAttribute(voltageDomainEClass, VOLTAGE_DOMAIN__ID);

		// Create enums
		cacheCoherencyTypeEEnum = createEEnum(CACHE_COHERENCY_TYPE);
		cachePrefetchTypeEEnum = createEEnum(CACHE_PREFETCH_TYPE);
		cacheReplacementTypeEEnum = createEEnum(CACHE_REPLACEMENT_TYPE);
		cacheTypeEEnum = createEEnum(CACHE_TYPE);
		cacheWriteAllocateTypeEEnum = createEEnum(CACHE_WRITE_ALLOCATE_TYPE);
		cacheWriteBackTypeEEnum = createEEnum(CACHE_WRITE_BACK_TYPE);
		dataRateUnitTypeEEnum = createEEnum(DATA_RATE_UNIT_TYPE);
		endianTypeEEnum = createEEnum(ENDIAN_TYPE);
		frequencyUnitTypeEEnum = createEEnum(FREQUENCY_UNIT_TYPE);
		instructionInputTypeEEnum = createEEnum(INSTRUCTION_INPUT_TYPE);
		instructionOutputTypeEEnum = createEEnum(INSTRUCTION_OUTPUT_TYPE);
		lockDownTypeEEnum = createEEnum(LOCK_DOWN_TYPE);
		masterTypeEEnum = createEEnum(MASTER_TYPE);
		operandAddressingTypeEEnum = createEEnum(OPERAND_ADDRESSING_TYPE);
		operationTypeEEnum = createEEnum(OPERATION_TYPE);
		orderingTypeEEnum = createEEnum(ORDERING_TYPE);
		powerUnitTypeEEnum = createEEnum(POWER_UNIT_TYPE);
		rwTypeEEnum = createEEnum(RW_TYPE);
		signednessTypeEEnum = createEEnum(SIGNEDNESS_TYPE);
		sizeUnitTypeEEnum = createEEnum(SIZE_UNIT_TYPE);
		throughputUnitTypeEEnum = createEEnum(THROUGHPUT_UNIT_TYPE);
		voltageUnitTypeEEnum = createEEnum(VOLTAGE_UNIT_TYPE);

		// Create data types
		addressValueTypeEDataType = createEDataType(ADDRESS_VALUE_TYPE);
		addressValueObjectTypeEDataType = createEDataType(ADDRESS_VALUE_OBJECT_TYPE);
		cacheCoherencyTypeObjectEDataType = createEDataType(CACHE_COHERENCY_TYPE_OBJECT);
		cachePrefetchTypeObjectEDataType = createEDataType(CACHE_PREFETCH_TYPE_OBJECT);
		cacheReplacementTypeObjectEDataType = createEDataType(CACHE_REPLACEMENT_TYPE_OBJECT);
		cacheTypeObjectEDataType = createEDataType(CACHE_TYPE_OBJECT);
		cacheWriteAllocateTypeObjectEDataType = createEDataType(CACHE_WRITE_ALLOCATE_TYPE_OBJECT);
		cacheWriteBackTypeObjectEDataType = createEDataType(CACHE_WRITE_BACK_TYPE_OBJECT);
		dataRateUnitTypeObjectEDataType = createEDataType(DATA_RATE_UNIT_TYPE_OBJECT);
		endianTypeObjectEDataType = createEDataType(ENDIAN_TYPE_OBJECT);
		frequencyUnitTypeObjectEDataType = createEDataType(FREQUENCY_UNIT_TYPE_OBJECT);
		instructionInputTypeObjectEDataType = createEDataType(INSTRUCTION_INPUT_TYPE_OBJECT);
		instructionOutputTypeObjectEDataType = createEDataType(INSTRUCTION_OUTPUT_TYPE_OBJECT);
		lockDownTypeObjectEDataType = createEDataType(LOCK_DOWN_TYPE_OBJECT);
		masterTypeObjectEDataType = createEDataType(MASTER_TYPE_OBJECT);
		operandAddressingTypeObjectEDataType = createEDataType(OPERAND_ADDRESSING_TYPE_OBJECT);
		operationTypeObjectEDataType = createEDataType(OPERATION_TYPE_OBJECT);
		orderingTypeObjectEDataType = createEDataType(ORDERING_TYPE_OBJECT);
		powerUnitTypeObjectEDataType = createEDataType(POWER_UNIT_TYPE_OBJECT);
		rwTypeObjectEDataType = createEDataType(RW_TYPE_OBJECT);
		signednessTypeObjectEDataType = createEDataType(SIGNEDNESS_TYPE_OBJECT);
		sizeUnitTypeObjectEDataType = createEDataType(SIZE_UNIT_TYPE_OBJECT);
		throughputUnitTypeObjectEDataType = createEDataType(THROUGHPUT_UNIT_TYPE_OBJECT);
		unsignedFloatTypeEDataType = createEDataType(UNSIGNED_FLOAT_TYPE);
		unsignedFloatObjectTypeEDataType = createEDataType(UNSIGNED_FLOAT_OBJECT_TYPE);
		unsignedIntTypeEDataType = createEDataType(UNSIGNED_INT_TYPE);
		unsignedIntObjectTypeEDataType = createEDataType(UNSIGNED_INT_OBJECT_TYPE);
		voltageUnitTypeObjectEDataType = createEDataType(VOLTAGE_UNIT_TYPE_OBJECT);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cacheEClass.getESuperTypes().add(this.getAbstractComponent());
		componentSetEClass.getESuperTypes().add(this.getAbstractComponent());
		eventCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());
		fifoCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());
		instructionEClass.getESuperTypes().add(this.getAbstractInstruction());
		interruptCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());
		latencyEClass.getESuperTypes().add(this.getAbstractPerformance());
		masterComponentEClass.getESuperTypes().add(this.getAbstractComponent());
		pitchEClass.getESuperTypes().add(this.getAbstractPerformance());
		sharedMemoryCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());
		sharedRegisterCommunicationEClass.getESuperTypes().add(this.getAbstractCommunication());
		shimEClass.getESuperTypes().add(this.getAbstractShim());
		slaveComponentEClass.getESuperTypes().add(this.getAbstractComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractCommunicationEClass, AbstractCommunication.class, "AbstractCommunication", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCommunication_ConnectionSet(), this.getConnectionSet(), null, "connectionSet", null,
				0, 1, AbstractCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCommunication_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				AbstractCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComponentEClass, AbstractComponent.class, "AbstractComponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractComponent_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractComponent_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, AbstractComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponent_FrequencyDomainRef(), this.getFrequencyDomain(), null, "frequencyDomainRef",
				null, 0, 1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponent_VoltageDomainRef(), this.getVoltageDomain(), null, "voltageDomainRef", null,
				0, 1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractComponent_OperatingPointRef(), this.getOperatingPointSet(), null, "operatingPointRef",
				null, 0, 1, AbstractComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractInstructionEClass, AbstractInstruction.class, "AbstractInstruction", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractInstruction_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				AbstractInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractInstruction_EncodingLength(), this.getUnsignedIntObjectType(), "encodingLength", null,
				0, 1, AbstractInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractInstruction_NInputs(), this.getUnsignedIntObjectType(), "nInputs", null, 0, 1,
				AbstractInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractInstruction_NOutputs(), theXMLTypePackage.getString(), "nOutputs", null, 0, 1,
				AbstractInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractInstruction_SIMDWidth(), theXMLTypePackage.getString(), "sIMDWidth", null, 0, 1,
				AbstractInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractInstruction_Performance(), this.getPerformance(), null, "performance", null, 1, 1,
				AbstractInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPerformanceEClass, AbstractPerformance.class, "AbstractPerformance", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPerformance_Best(), this.getUnsignedFloatObjectType(), "best", null, 0, 1,
				AbstractPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPerformance_Typical(), this.getUnsignedFloatType(), "typical", null, 1, 1,
				AbstractPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPerformance_Worst(), this.getUnsignedFloatObjectType(), "worst", null, 0, 1,
				AbstractPerformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(abstractShimEClass, AbstractShim.class, "AbstractShim", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractShim_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AbstractShim.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractShim_ShimVersion(), theXMLTypePackage.getString(), "shimVersion", null, 1, 1,
				AbstractShim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(accessorEClass, Accessor.class, "Accessor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessor_MasterComponentRef(), this.getMasterComponent(), null, "masterComponentRef", null, 1,
				1, Accessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessor_PerformanceSet(), this.getPerformanceSet(), null, "performanceSet", null, 0, -1,
				Accessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessTypeEClass, AccessType.class, "AccessType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AccessType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, AccessType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_RwType(), this.getRWType(), "rwType", null, 0, 1, AccessType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_AccessByteSize(), this.getUnsignedIntObjectType(), "accessByteSize", null, 0, 1,
				AccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_AlignmentByteSize(), this.getUnsignedIntObjectType(), "alignmentByteSize", null, 0,
				1, AccessType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessType_NBurst(), this.getUnsignedIntObjectType(), "nBurst", null, 0, 1, AccessType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessTypeSetEClass, AccessTypeSet.class, "AccessTypeSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessTypeSet_AccessType(), this.getAccessType(), null, "accessType", null, 1, -1,
				AccessTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressSpaceEClass, AddressSpace.class, "AddressSpace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressSpace_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AddressSpace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressSpace_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, AddressSpace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressSpace_SubSpace(), this.getSubSpace(), null, "subSpace", null, 0, -1,
				AddressSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressSpaceSetEClass, AddressSpaceSet.class, "AddressSpaceSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressSpaceSet_AddressSpace(), this.getAddressSpace(), null, "addressSpace", null, 1, -1,
				AddressSpaceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheEClass, Cache.class, "Cache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCache_CacheType(), this.getCacheType(), "cacheType", "DATA", 1, 1, Cache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_CacheCoherency(), this.getCacheCoherencyType(), "cacheCoherency", "HARDWARE", 1, 1,
				Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCache_Size(), this.getUnsignedIntType(), "size", "0", 1, 1, Cache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_SizeUnit(), this.getSizeUnitType(), "sizeUnit", "KiB", 1, 1, Cache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_NWay(), this.getUnsignedIntObjectType(), "nWay", null, 0, 1, Cache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_LineSize(), this.getUnsignedIntObjectType(), "lineSize", null, 0, 1, Cache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_LockDownType(), this.getLockDownType(), "lockDownType", null, 0, 1, Cache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_Prefetch(), this.getCachePrefetchType(), "prefetch", null, 0, 1, Cache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_PrefetchDistance(), this.getUnsignedIntObjectType(), "prefetchDistance", null, 0, 1,
				Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCache_Replacement(), this.getCacheReplacementType(), "replacement", null, 0, 1, Cache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCache_WriteAllocate(), this.getCacheWriteAllocateType(), "writeAllocate", null, 0, 1,
				Cache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getCache_WriteBack(), this.getCacheWriteBackType(), "writeBack", null, 0, 1, Cache.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCache_CacheRef(), this.getCache(), null, "cacheRef", null, 0, -1, Cache.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(clockFrequencyEClass, ClockFrequency.class, "ClockFrequency", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClockFrequency_ClockValue(), this.getUnsignedFloatType(), "clockValue", "0", 1, 1,
				ClockFrequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(commonInstructionSetEClass, CommonInstructionSet.class, "CommonInstructionSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonInstructionSet_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				CommonInstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonInstructionSet_FunctionalUnitSetFile(), this.getFunctionalUnitSetFile(), null,
				"functionalUnitSetFile", null, 0, 1, CommonInstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommonInstructionSet_FunctionalUnitSet(), this.getFunctionalUnitSet(), null,
				"functionalUnitSet", null, 1, 1, CommonInstructionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationSetEClass, CommunicationSet.class, "CommunicationSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationSet_SharedMemoryCommunication(), this.getSharedMemoryCommunication(), null,
				"sharedMemoryCommunication", null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSet_SharedRegisterCommunication(), this.getSharedRegisterCommunication(), null,
				"sharedRegisterCommunication", null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSet_EventCommunication(), this.getEventCommunication(), null,
				"eventCommunication", null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSet_FIFOCommunication(), this.getFIFOCommunication(), null, "fIFOCommunication",
				null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSet_InterruptCommunication(), this.getInterruptCommunication(), null,
				"interruptCommunication", null, 0, -1, CommunicationSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSetEClass, ComponentSet.class, "ComponentSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSet_ComponentSet(), this.getComponentSet(), null, "componentSet", null, 0, -1,
				ComponentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSet_MasterComponent(), this.getMasterComponent(), null, "masterComponent", null, 0,
				-1, ComponentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSet_SlaveComponent(), this.getSlaveComponent(), null, "slaveComponent", null, 0, -1,
				ComponentSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSet_Cache(), this.getCache(), null, "cache", null, 0, -1, ComponentSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_From(), this.getMasterComponent(), null, "from", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_To(), this.getMasterComponent(), null, "to", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_Performance(), this.getPerformance(), null, "performance", null, 0, -1,
				Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionSetEClass, ConnectionSet.class, "ConnectionSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionSet_Connection(), this.getConnection(), null, "connection", null, 1, -1,
				ConnectionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentionGroupEClass, ContentionGroup.class, "ContentionGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentionGroup_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				ContentionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentionGroup_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, ContentionGroup.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentionGroup_Throughput(), this.getThroughput(), null, "throughput", null, 0, 1,
				ContentionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentionGroup_DataRate(), this.getDataRate(), null, "dataRate", null, 0, 1,
				ContentionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentionGroup_PerformanceSetRef(), this.getPerformanceSet(), null, "performanceSetRef",
				null, 1, -1, ContentionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentionGroupSetEClass, ContentionGroupSet.class, "ContentionGroupSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentionGroupSet_ContentionGroup(), this.getContentionGroup(), null, "contentionGroup",
				null, 1, -1, ContentionGroupSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customInstructionEClass, CustomInstruction.class, "CustomInstruction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomInstruction_InstructionInput(), this.getInstructionInput(), null, "instructionInput",
				null, 1, -1, CustomInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomInstruction_InstructionOperation(), this.getPerformance(), null, "instructionOperation",
				null, 1, -1, CustomInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomInstruction_InstructionOutput(), this.getPerformance(), null, "instructionOutput", null,
				1, -1, CustomInstruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRateEClass, DataRate.class, "DataRate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataRate_Value(), this.getUnsignedIntObjectType(), "value", null, 0, 1, DataRate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataRate_Unit(), this.getDataRateUnitType(), "unit", null, 0, 1, DataRate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null,
				"xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null,
				"xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Shim(), this.getShim(), null, "shim", null, 0, -2, null, IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);

		initEClass(eventCommunicationEClass, EventCommunication.class, "EventCommunication", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fifoCommunicationEClass, FIFOCommunication.class, "FIFOCommunication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFIFOCommunication_DataSize(), this.getUnsignedIntType(), "dataSize", "0", 1, 1,
				FIFOCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFIFOCommunication_DataSizeUnit(), this.getSizeUnitType(), "dataSizeUnit", null, 0, 1,
				FIFOCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFIFOCommunication_QueueSize(), this.getUnsignedIntType(), "queueSize", "0", 1, 1,
				FIFOCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(frequencyDomainEClass, FrequencyDomain.class, "FrequencyDomain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrequencyDomain_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				FrequencyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrequencyDomain_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, FrequencyDomain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyVoltageSetEClass, FrequencyVoltageSet.class, "FrequencyVoltageSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrequencyVoltageSet_FrequencyDomain(), this.getFrequencyDomain(), null, "frequencyDomain",
				null, 1, -1, FrequencyVoltageSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrequencyVoltageSet_VoltageDomain(), this.getVoltageDomain(), null, "voltageDomain", null, 0,
				-1, FrequencyVoltageSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrequencyVoltageSet_OperatingPointSet(), this.getOperatingPointSet(), null,
				"operatingPointSet", null, 1, -1, FrequencyVoltageSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalUnitEClass, FunctionalUnit.class, "FunctionalUnit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalUnit_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				FunctionalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalUnit_Instruction(), this.getInstruction(), null, "instruction", null, 0, -1,
				FunctionalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalUnit_CustomInstruction(), this.getCustomInstruction(), null, "customInstruction",
				null, 0, -1, FunctionalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalUnitSetEClass, FunctionalUnitSet.class, "FunctionalUnitSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalUnitSet_FunctionalUnit(), this.getFunctionalUnit(), null, "functionalUnit", null, 0,
				-1, FunctionalUnitSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalUnitSetFileEClass, FunctionalUnitSetFile.class, "FunctionalUnitSetFile", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalUnitSetFile_Src(), ecorePackage.getEString(), "src", "0", 1, 1,
				FunctionalUnitSetFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstruction_ImmediateBitWidth(), this.getUnsignedIntObjectType(), "immediateBitWidth", null,
				0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_InputBitWidth(), this.getUnsignedIntObjectType(), "inputBitWidth", null, 0, 1,
				Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_InputPreserved(), theXMLTypePackage.getBoolean(), "inputPreserved", null, 0, 1,
				Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_IsEmulated(), theXMLTypePackage.getBoolean(), "isEmulated", null, 0, 1,
				Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_OperandAddressing(), this.getOperandAddressingType(), "operandAddressing", null,
				0, 1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_Operation(), this.getUnsignedIntObjectType(), "operation", null, 0, 1,
				Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_OutputBitWidth(), this.getUnsignedIntObjectType(), "outputBitWidth", null, 0, 1,
				Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstruction_SupportedSignedness(), this.getSignednessType(), "supportedSignedness", null, 0,
				1, Instruction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(instructionInputEClass, InstructionInput.class, "InstructionInput", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionInput_Type(), this.getInstructionInputType(), "type", null, 0, 1,
				InstructionInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionInput_BitWidth(), this.getUnsignedIntType(), "bitWidth", null, 1, 1,
				InstructionInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionInput_Value(), theXMLTypePackage.getString(), "value", null, 0, 1,
				InstructionInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(instructionOperationEClass, InstructionOperation.class, "InstructionOperation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionOperation_Operation(), theXMLTypePackage.getString(), "operation", null, 1, 1,
				InstructionOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionOperation_InstructionOperand(), theXMLTypePackage.getString(),
				"instructionOperand", null, 0, -1, InstructionOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionOutputEClass, InstructionOutput.class, "InstructionOutput", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionOutput_Type(), this.getInstructionOutputType(), "type", null, 0, 1,
				InstructionOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionOutput_BitWidth(), this.getUnsignedIntType(), "bitWidth", null, 1, 1,
				InstructionOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstructionOutput_Ref(), theXMLTypePackage.getString(), "ref", null, 0, 1,
				InstructionOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(interruptCommunicationEClass, InterruptCommunication.class, "InterruptCommunication", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(latencyEClass, Latency.class, "Latency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(masterComponentEClass, MasterComponent.class, "MasterComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterComponent_CacheRef(), this.getCache(), null, "cacheRef", null, 0, -1,
				MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterComponent_AccessTypeSet(), this.getAccessTypeSet(), null, "accessTypeSet", null, 1, 1,
				MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterComponent_ClockFrequency(), this.getClockFrequency(), null, "clockFrequency", null, 0,
				1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_Arch(), theXMLTypePackage.getString(), "arch", null, 1, 1,
				MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_ArchOption(), theXMLTypePackage.getString(), "archOption", null, 0, 1,
				MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_Endian(), this.getEndianType(), "endian", null, 0, 1, MasterComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_MasterType(), this.getMasterType(), "masterType", "PU", 1, 1,
				MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_NChannel(), this.getUnsignedIntObjectType(), "nChannel", null, 0, 1,
				MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_NThread(), this.getUnsignedIntObjectType(), "nThread", null, 0, 1,
				MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponent_Pid(), theXMLTypePackage.getString(), "pid", null, 0, 1,
				MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMasterComponent_CommonInstructionSet(), this.getCommonInstructionSet(), null,
				"commonInstructionSet", null, 0, 1, MasterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterSlaveBindingEClass, MasterSlaveBinding.class, "MasterSlaveBinding", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterSlaveBinding_Accessor(), this.getAccessor(), null, "accessor", null, 1, -1,
				MasterSlaveBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMasterSlaveBinding_SlaveComponentRef(), this.getSlaveComponent(), null, "slaveComponentRef",
				null, 1, 1, MasterSlaveBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(masterSlaveBindingSetEClass, MasterSlaveBindingSet.class, "MasterSlaveBindingSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMasterSlaveBindingSet_MasterSlaveBinding(), this.getMasterSlaveBinding(), null,
				"masterSlaveBinding", null, 1, -1, MasterSlaveBindingSet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryConsistencyModelEClass, MemoryConsistencyModel.class, "MemoryConsistencyModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryConsistencyModel_RawOrdering(), this.getOrderingType(), "rawOrdering", null, 0, 1,
				MemoryConsistencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryConsistencyModel_WarOrdering(), this.getOrderingType(), "warOrdering", null, 0, 1,
				MemoryConsistencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryConsistencyModel_WawOrdering(), this.getOrderingType(), "wawOrdering", null, 0, 1,
				MemoryConsistencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryConsistencyModel_RarOrdering(), this.getOrderingType(), "rarOrdering", null, 0, 1,
				MemoryConsistencyModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatingPointEClass, OperatingPoint.class, "OperatingPoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatingPoint_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				OperatingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingPoint_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, OperatingPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingPoint_Frequency(), this.getUnsignedIntObjectType(), "frequency", null, 0, 1,
				OperatingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingPoint_FrequencyUnit(), this.getFrequencyUnitType(), "frequencyUnit", null, 0, 1,
				OperatingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingPoint_Voltage(), this.getUnsignedIntObjectType(), "voltage", null, 0, 1,
				OperatingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingPoint_VoltageUnit(), this.getVoltageUnitType(), "voltageUnit", null, 0, 1,
				OperatingPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(operatingPointSetEClass, OperatingPointSet.class, "OperatingPointSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatingPointSet_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				OperatingPointSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperatingPointSet_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, OperatingPointSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperatingPointSet_OperatingPoint(), this.getOperatingPoint(), null, "operatingPoint", null, 0,
				-1, OperatingPointSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceEClass, Performance.class, "Performance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerformance_Pitch(), this.getPitch(), null, "pitch", null, 1, 1, Performance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformance_Latency(), this.getLatency(), null, "latency", null, 1, 1, Performance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformance_AccessTypeRef(), this.getAccessType(), null, "accessTypeRef", null, 0, 1,
				Performance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(performanceSetEClass, PerformanceSet.class, "PerformanceSet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerformanceSet_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, PerformanceSet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceSet_CacheRef(), this.getCache(), null, "cacheRef", null, 0, 1,
				PerformanceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerformanceSet_Performance(), this.getPerformance(), null, "performance", null, 0, -1,
				PerformanceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pitchEClass, Pitch.class, "Pitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerConfigurationEClass, PowerConfiguration.class, "PowerConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerConfiguration_SystemConfigurationSrc(), theXMLTypePackage.getString(),
				"systemConfigurationSrc", null, 0, 1, PowerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerConfiguration_PowerConsumptionSet(), this.getPowerConsumptionSet(), null,
				"powerConsumptionSet", null, 1, 1, PowerConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerConsumptionEClass, PowerConsumption.class, "PowerConsumption", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerConsumption_OperatingPointRef(), this.getOperatingPoint(), null, "operatingPointRef",
				null, 0, 1, PowerConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerConsumption_Power(), this.getUnsignedIntObjectType(), "power", null, 0, 1,
				PowerConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerConsumption_PowerUnit(), this.getPowerUnitType(), "powerUnit", null, 0, 1,
				PowerConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(powerConsumptionSetEClass, PowerConsumptionSet.class, "PowerConsumptionSet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerConsumptionSet_Name(), theXMLTypePackage.getString(), "name", null, 1, 1,
				PowerConsumptionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerConsumptionSet_Id(), theXMLTypePackage.getID(), "id", null, 1, 1,
				PowerConsumptionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPowerConsumptionSet_PowerConsumption(), this.getPowerConsumption(), null, "powerConsumption",
				null, 0, -1, PowerConsumptionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerConsumptionSet_PowerConsumerRef(), this.getAbstractComponent(), null, "powerConsumerRef",
				null, 0, -1, PowerConsumptionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedMemoryCommunicationEClass, SharedMemoryCommunication.class, "SharedMemoryCommunication",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedMemoryCommunication_OperationType(), this.getOperationType(), "operationType", null, 0,
				1, SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedMemoryCommunication_DataSize(), this.getUnsignedIntObjectType(), "dataSize", null, 0, 1,
				SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedMemoryCommunication_DataSizeUnit(), this.getSizeUnitType(), "dataSizeUnit", null, 0, 1,
				SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedMemoryCommunication_AddressSpaceRef(), this.getAddressSpace(), null, "addressSpaceRef",
				null, 0, 1, SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSharedMemoryCommunication_SubSpaceRef(), this.getSubSpace(), null, "subSpaceRef", null, 0, 1,
				SharedMemoryCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sharedRegisterCommunicationEClass, SharedRegisterCommunication.class, "SharedRegisterCommunication",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedRegisterCommunication_DataSize(), this.getUnsignedIntType(), "dataSize", "0", 1, 1,
				SharedRegisterCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedRegisterCommunication_DataSizeUnit(), this.getSizeUnitType(), "dataSizeUnit", "KiB", 1,
				1, SharedRegisterCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSharedRegisterCommunication_NRegister(), this.getUnsignedIntType(), "nRegister", "0", 1, 1,
				SharedRegisterCommunication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shimEClass, Shim.class, "Shim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShim_SystemConfiguration(), this.getSystemConfiguration(), null, "systemConfiguration", null,
				1, 1, Shim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShim_PowerConfiguration(), this.getPowerConfiguration(), null, "powerConfiguration", null, 0,
				1, Shim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShim_FunctionalUnitSet(), this.getFunctionalUnitSet(), null, "functionalUnitSet", null, 0, 1,
				Shim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slaveComponentEClass, SlaveComponent.class, "SlaveComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlaveComponent_Size(), this.getUnsignedIntType(), "size", "0", 1, 1, SlaveComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlaveComponent_SizeUnit(), this.getSizeUnitType(), "sizeUnit", "KiB", 1, 1,
				SlaveComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlaveComponent_RwType(), this.getRWType(), "rwType", "RW", 1, 1, SlaveComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subSpaceEClass, SubSpace.class, "SubSpace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubSpace_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SubSpace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSpace_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, SubSpace.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSpace_Start(), this.getAddressValueType(), "start", "0", 1, 1, SubSpace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSpace_End(), this.getAddressValueType(), "end", "4294967295", 1, 1, SubSpace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubSpace_Endian(), this.getEndianType(), "endian", null, 0, 1, SubSpace.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSpace_MasterSlaveBindingSet(), this.getMasterSlaveBindingSet(), null,
				"masterSlaveBindingSet", null, 0, 1, SubSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubSpace_MemoryConsistencyModel(), this.getMemoryConsistencyModel(), null,
				"memoryConsistencyModel", null, 0, -1, SubSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemConfigurationEClass, SystemConfiguration.class, "SystemConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemConfiguration_ComponentSet(), this.getComponentSet(), null, "componentSet", null, 1, 1,
				SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_AddressSpaceSet(), this.getAddressSpaceSet(), null, "addressSpaceSet",
				null, 0, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_CommunicationSet(), this.getCommunicationSet(), null, "communicationSet",
				null, 0, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_FrequencyVoltageSet(), this.getFrequencyVoltageSet(), null,
				"frequencyVoltageSet", null, 0, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemConfiguration_ContentionGroupSet(), this.getContentionGroupSet(), null,
				"contentionGroupSet", null, 0, 1, SystemConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throughputEClass, Throughput.class, "Throughput", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getThroughput_FrequencyDomainRef(), this.getFrequencyDomain(), null, "frequencyDomainRef", null,
				0, 1, Throughput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThroughput_Value(), this.getUnsignedIntObjectType(), "value", null, 0, 1, Throughput.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThroughput_Unit(), this.getThroughputUnitType(), "unit", null, 0, 1, Throughput.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voltageDomainEClass, VoltageDomain.class, "VoltageDomain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoltageDomain_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, VoltageDomain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoltageDomain_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, VoltageDomain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cacheCoherencyTypeEEnum, CacheCoherencyType.class, "CacheCoherencyType");
		addEEnumLiteral(cacheCoherencyTypeEEnum, CacheCoherencyType.HARDWARE);
		addEEnumLiteral(cacheCoherencyTypeEEnum, CacheCoherencyType.SOFTWARE);

		initEEnum(cachePrefetchTypeEEnum, CachePrefetchType.class, "CachePrefetchType");
		addEEnumLiteral(cachePrefetchTypeEEnum, CachePrefetchType.ALWAYS);
		addEEnumLiteral(cachePrefetchTypeEEnum, CachePrefetchType.NEVER);
		addEEnumLiteral(cachePrefetchTypeEEnum, CachePrefetchType.ONCE);
		addEEnumLiteral(cachePrefetchTypeEEnum, CachePrefetchType.ONMISS);

		initEEnum(cacheReplacementTypeEEnum, CacheReplacementType.class, "CacheReplacementType");
		addEEnumLiteral(cacheReplacementTypeEEnum, CacheReplacementType.FIFO);
		addEEnumLiteral(cacheReplacementTypeEEnum, CacheReplacementType.LRU);
		addEEnumLiteral(cacheReplacementTypeEEnum, CacheReplacementType.RANDOM);

		initEEnum(cacheTypeEEnum, CacheType.class, "CacheType");
		addEEnumLiteral(cacheTypeEEnum, CacheType.DATA);
		addEEnumLiteral(cacheTypeEEnum, CacheType.INSTRUCTION);
		addEEnumLiteral(cacheTypeEEnum, CacheType.UNIFIED);

		initEEnum(cacheWriteAllocateTypeEEnum, CacheWriteAllocateType.class, "CacheWriteAllocateType");
		addEEnumLiteral(cacheWriteAllocateTypeEEnum, CacheWriteAllocateType.ALWAYS);
		addEEnumLiteral(cacheWriteAllocateTypeEEnum, CacheWriteAllocateType.NEVER);
		addEEnumLiteral(cacheWriteAllocateTypeEEnum, CacheWriteAllocateType.NOFETCH);

		initEEnum(cacheWriteBackTypeEEnum, CacheWriteBackType.class, "CacheWriteBackType");
		addEEnumLiteral(cacheWriteBackTypeEEnum, CacheWriteBackType.ALWAYS);
		addEEnumLiteral(cacheWriteBackTypeEEnum, CacheWriteBackType.NEVER);
		addEEnumLiteral(cacheWriteBackTypeEEnum, CacheWriteBackType.NOFETCH);

		initEEnum(dataRateUnitTypeEEnum, DataRateUnitType.class, "DataRateUnitType");
		addEEnumLiteral(dataRateUnitTypeEEnum, DataRateUnitType.BS);
		addEEnumLiteral(dataRateUnitTypeEEnum, DataRateUnitType.KI_BS);
		addEEnumLiteral(dataRateUnitTypeEEnum, DataRateUnitType.MI_BS);
		addEEnumLiteral(dataRateUnitTypeEEnum, DataRateUnitType.GI_BS);
		addEEnumLiteral(dataRateUnitTypeEEnum, DataRateUnitType.TI_BS);

		initEEnum(endianTypeEEnum, EndianType.class, "EndianType");
		addEEnumLiteral(endianTypeEEnum, EndianType.NONE);
		addEEnumLiteral(endianTypeEEnum, EndianType.LITTLE);
		addEEnumLiteral(endianTypeEEnum, EndianType.BIG);

		initEEnum(frequencyUnitTypeEEnum, FrequencyUnitType.class, "FrequencyUnitType");
		addEEnumLiteral(frequencyUnitTypeEEnum, FrequencyUnitType.HZ);
		addEEnumLiteral(frequencyUnitTypeEEnum, FrequencyUnitType.KHZ);
		addEEnumLiteral(frequencyUnitTypeEEnum, FrequencyUnitType.MHZ);
		addEEnumLiteral(frequencyUnitTypeEEnum, FrequencyUnitType.GHZ);

		initEEnum(instructionInputTypeEEnum, InstructionInputType.class, "InstructionInputType");
		addEEnumLiteral(instructionInputTypeEEnum, InstructionInputType.INTEGER);
		addEEnumLiteral(instructionInputTypeEEnum, InstructionInputType.FLOAT);
		addEEnumLiteral(instructionInputTypeEEnum, InstructionInputType.POINTER);
		addEEnumLiteral(instructionInputTypeEEnum, InstructionInputType.IMMEDIATE);

		initEEnum(instructionOutputTypeEEnum, InstructionOutputType.class, "InstructionOutputType");
		addEEnumLiteral(instructionOutputTypeEEnum, InstructionOutputType.INTEGER);
		addEEnumLiteral(instructionOutputTypeEEnum, InstructionOutputType.FLOAT);
		addEEnumLiteral(instructionOutputTypeEEnum, InstructionOutputType.POINTER);

		initEEnum(lockDownTypeEEnum, LockDownType.class, "LockDownType");
		addEEnumLiteral(lockDownTypeEEnum, LockDownType.LINE);
		addEEnumLiteral(lockDownTypeEEnum, LockDownType.NONE);
		addEEnumLiteral(lockDownTypeEEnum, LockDownType.WAY);

		initEEnum(masterTypeEEnum, MasterType.class, "MasterType");
		addEEnumLiteral(masterTypeEEnum, MasterType.PU);
		addEEnumLiteral(masterTypeEEnum, MasterType.TU);
		addEEnumLiteral(masterTypeEEnum, MasterType.OTHER);

		initEEnum(operandAddressingTypeEEnum, OperandAddressingType.class, "OperandAddressingType");
		addEEnumLiteral(operandAddressingTypeEEnum, OperandAddressingType.NONE);
		addEEnumLiteral(operandAddressingTypeEEnum, OperandAddressingType.IMMEDIATE);
		addEEnumLiteral(operandAddressingTypeEEnum, OperandAddressingType.REGISTER);
		addEEnumLiteral(operandAddressingTypeEEnum, OperandAddressingType.BOTH);

		initEEnum(operationTypeEEnum, OperationType.class, "OperationType");
		addEEnumLiteral(operationTypeEEnum, OperationType.TAS);
		addEEnumLiteral(operationTypeEEnum, OperationType.LLSC);
		addEEnumLiteral(operationTypeEEnum, OperationType.CAX);
		addEEnumLiteral(operationTypeEEnum, OperationType.OTHER);

		initEEnum(orderingTypeEEnum, OrderingType.class, "OrderingType");
		addEEnumLiteral(orderingTypeEEnum, OrderingType.ORDERED);
		addEEnumLiteral(orderingTypeEEnum, OrderingType.UNORDERED);

		initEEnum(powerUnitTypeEEnum, PowerUnitType.class, "PowerUnitType");
		addEEnumLiteral(powerUnitTypeEEnum, PowerUnitType.PW);
		addEEnumLiteral(powerUnitTypeEEnum, PowerUnitType.NW);
		addEEnumLiteral(powerUnitTypeEEnum, PowerUnitType.UW);
		addEEnumLiteral(powerUnitTypeEEnum, PowerUnitType.MW);
		addEEnumLiteral(powerUnitTypeEEnum, PowerUnitType.W);

		initEEnum(rwTypeEEnum, RWType.class, "RWType");
		addEEnumLiteral(rwTypeEEnum, RWType.RW);
		addEEnumLiteral(rwTypeEEnum, RWType.WX);
		addEEnumLiteral(rwTypeEEnum, RWType.RX);
		addEEnumLiteral(rwTypeEEnum, RWType.R);
		addEEnumLiteral(rwTypeEEnum, RWType.W);
		addEEnumLiteral(rwTypeEEnum, RWType.X);
		addEEnumLiteral(rwTypeEEnum, RWType.RWX);

		initEEnum(signednessTypeEEnum, SignednessType.class, "SignednessType");
		addEEnumLiteral(signednessTypeEEnum, SignednessType.SIGNED);
		addEEnumLiteral(signednessTypeEEnum, SignednessType.UNSIGNED);
		addEEnumLiteral(signednessTypeEEnum, SignednessType.BOTH);

		initEEnum(sizeUnitTypeEEnum, SizeUnitType.class, "SizeUnitType");
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.KI_B);
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.B);
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.GI_B);
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.MI_B);
		addEEnumLiteral(sizeUnitTypeEEnum, SizeUnitType.TI_B);

		initEEnum(throughputUnitTypeEEnum, ThroughputUnitType.class, "ThroughputUnitType");
		addEEnumLiteral(throughputUnitTypeEEnum, ThroughputUnitType.BCYCLE);
		addEEnumLiteral(throughputUnitTypeEEnum, ThroughputUnitType.BKCYCLE);

		initEEnum(voltageUnitTypeEEnum, VoltageUnitType.class, "VoltageUnitType");
		addEEnumLiteral(voltageUnitTypeEEnum, VoltageUnitType.PV);
		addEEnumLiteral(voltageUnitTypeEEnum, VoltageUnitType.NV);
		addEEnumLiteral(voltageUnitTypeEEnum, VoltageUnitType.UV);
		addEEnumLiteral(voltageUnitTypeEEnum, VoltageUnitType.MV);
		addEEnumLiteral(voltageUnitTypeEEnum, VoltageUnitType.V);

		// Initialize data types
		initEDataType(addressValueTypeEDataType, long.class, "AddressValueType", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(addressValueObjectTypeEDataType, Long.class, "AddressValueObjectType", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cacheCoherencyTypeObjectEDataType, CacheCoherencyType.class, "CacheCoherencyTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cachePrefetchTypeObjectEDataType, CachePrefetchType.class, "CachePrefetchTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cacheReplacementTypeObjectEDataType, CacheReplacementType.class, "CacheReplacementTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cacheTypeObjectEDataType, CacheType.class, "CacheTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cacheWriteAllocateTypeObjectEDataType, CacheWriteAllocateType.class,
				"CacheWriteAllocateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cacheWriteBackTypeObjectEDataType, CacheWriteBackType.class, "CacheWriteBackTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataRateUnitTypeObjectEDataType, DataRateUnitType.class, "DataRateUnitTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(endianTypeObjectEDataType, EndianType.class, "EndianTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(frequencyUnitTypeObjectEDataType, FrequencyUnitType.class, "FrequencyUnitTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(instructionInputTypeObjectEDataType, InstructionInputType.class, "InstructionInputTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(instructionOutputTypeObjectEDataType, InstructionOutputType.class, "InstructionOutputTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lockDownTypeObjectEDataType, LockDownType.class, "LockDownTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(masterTypeObjectEDataType, MasterType.class, "MasterTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operandAddressingTypeObjectEDataType, OperandAddressingType.class, "OperandAddressingTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(operationTypeObjectEDataType, OperationType.class, "OperationTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orderingTypeObjectEDataType, OrderingType.class, "OrderingTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(powerUnitTypeObjectEDataType, PowerUnitType.class, "PowerUnitTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rwTypeObjectEDataType, RWType.class, "RWTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signednessTypeObjectEDataType, SignednessType.class, "SignednessTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sizeUnitTypeObjectEDataType, SizeUnitType.class, "SizeUnitTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(throughputUnitTypeObjectEDataType, ThroughputUnitType.class, "ThroughputUnitTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unsignedFloatTypeEDataType, float.class, "UnsignedFloatType", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unsignedFloatObjectTypeEDataType, Float.class, "UnsignedFloatObjectType", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unsignedIntTypeEDataType, int.class, "UnsignedIntType", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unsignedIntObjectTypeEDataType, Integer.class, "UnsignedIntObjectType", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(voltageUnitTypeObjectEDataType, VoltageUnitType.class, "VoltageUnitTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation(this, source, new String[] { "qualified", "true" });
		addAnnotation(abstractCommunicationEClass, source,
				new String[] { "name", "AbstractCommunication", "kind", "elementOnly" });
		addAnnotation(getAbstractCommunication_ConnectionSet(), source,
				new String[] { "kind", "element", "name", "ConnectionSet" });
		addAnnotation(getAbstractCommunication_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(abstractComponentEClass, source,
				new String[] { "name", "AbstractComponent", "kind", "elementOnly" });
		addAnnotation(getAbstractComponent_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getAbstractComponent_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getAbstractComponent_FrequencyDomainRef(), source,
				new String[] { "kind", "attribute", "name", "frequencyDomainRef" });
		addAnnotation(getAbstractComponent_VoltageDomainRef(), source,
				new String[] { "kind", "attribute", "name", "voltageDomainRef" });
		addAnnotation(getAbstractComponent_OperatingPointRef(), source,
				new String[] { "kind", "attribute", "name", "operatingPointRef" });
		addAnnotation(abstractInstructionEClass, source,
				new String[] { "name", "AbstractInstruction", "kind", "elementOnly" });
		addAnnotation(getAbstractInstruction_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getAbstractInstruction_EncodingLength(), source,
				new String[] { "kind", "attribute", "name", "encodingLength" });
		addAnnotation(getAbstractInstruction_NInputs(), source,
				new String[] { "kind", "attribute", "name", "nInputs" });
		addAnnotation(getAbstractInstruction_NOutputs(), source,
				new String[] { "kind", "attribute", "name", "nOutputs" });
		addAnnotation(getAbstractInstruction_SIMDWidth(), source,
				new String[] { "kind", "attribute", "name", "sIMDWidth" });
		addAnnotation(getAbstractInstruction_Performance(), source,
				new String[] { "kind", "element", "name", "Performance" });
		addAnnotation(abstractPerformanceEClass, source,
				new String[] { "name", "AbstractPerformance", "kind", "empty" });
		addAnnotation(getAbstractPerformance_Best(), source, new String[] { "kind", "attribute", "name", "best" });
		addAnnotation(getAbstractPerformance_Typical(), source,
				new String[] { "kind", "attribute", "name", "typical" });
		addAnnotation(getAbstractPerformance_Worst(), source, new String[] { "kind", "attribute", "name", "worst" });
		addAnnotation(abstractShimEClass, source, new String[] { "name", "AbstractShim", "kind", "elementOnly" });
		addAnnotation(getAbstractShim_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getAbstractShim_ShimVersion(), source,
				new String[] { "kind", "attribute", "name", "shimVersion" });
		addAnnotation(accessorEClass, source, new String[] { "name", "Accessor", "kind", "elementOnly" });
		addAnnotation(getAccessor_MasterComponentRef(), source,
				new String[] { "kind", "attribute", "name", "masterComponentRef" });
		addAnnotation(getAccessor_PerformanceSet(), source,
				new String[] { "kind", "element", "name", "PerformanceSet" });
		addAnnotation(accessTypeEClass, source, new String[] { "name", "AccessType", "kind", "empty" });
		addAnnotation(getAccessType_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getAccessType_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getAccessType_RwType(), source, new String[] { "kind", "attribute", "name", "rwType" });
		addAnnotation(getAccessType_AccessByteSize(), source,
				new String[] { "kind", "attribute", "name", "accessByteSize" });
		addAnnotation(getAccessType_AlignmentByteSize(), source,
				new String[] { "kind", "attribute", "name", "alignmentByteSize" });
		addAnnotation(getAccessType_NBurst(), source, new String[] { "kind", "attribute", "name", "nBurst" });
		addAnnotation(accessTypeSetEClass, source, new String[] { "name", "AccessTypeSet", "kind", "elementOnly" });
		addAnnotation(getAccessTypeSet_AccessType(), source, new String[] { "kind", "element", "name", "AccessType" });
		addAnnotation(addressSpaceEClass, source, new String[] { "name", "AddressSpace", "kind", "elementOnly" });
		addAnnotation(getAddressSpace_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getAddressSpace_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getAddressSpace_SubSpace(), source, new String[] { "kind", "element", "name", "SubSpace" });
		addAnnotation(addressSpaceSetEClass, source, new String[] { "name", "AddressSpaceSet", "kind", "elementOnly" });
		addAnnotation(getAddressSpaceSet_AddressSpace(), source,
				new String[] { "kind", "element", "name", "AddressSpace" });
		addAnnotation(addressValueTypeEDataType, source,
				new String[] { "name", "AddressValueType", "minInclusive", "0" });
		addAnnotation(addressValueObjectTypeEDataType, source,
				new String[] { "name", "AddressValueObjectType", "minInclusive", "0" });
		addAnnotation(cacheEClass, source, new String[] { "name", "Cache", "kind", "elementOnly" });
		addAnnotation(getCache_CacheType(), source, new String[] { "kind", "attribute", "name", "cacheType" });
		addAnnotation(getCache_CacheCoherency(), source,
				new String[] { "kind", "attribute", "name", "cacheCoherency" });
		addAnnotation(getCache_Size(), source, new String[] { "kind", "attribute", "name", "size" });
		addAnnotation(getCache_SizeUnit(), source, new String[] { "kind", "attribute", "name", "sizeUnit" });
		addAnnotation(getCache_NWay(), source, new String[] { "kind", "attribute", "name", "nWay" });
		addAnnotation(getCache_LineSize(), source, new String[] { "kind", "attribute", "name", "lineSize" });
		addAnnotation(getCache_LockDownType(), source, new String[] { "kind", "attribute", "name", "lockDownType" });
		addAnnotation(getCache_Prefetch(), source, new String[] { "kind", "attribute", "name", "prefetch" });
		addAnnotation(getCache_PrefetchDistance(), source,
				new String[] { "kind", "attribute", "name", "prefetchDistance" });
		addAnnotation(getCache_Replacement(), source, new String[] { "kind", "attribute", "name", "replacement" });
		addAnnotation(getCache_WriteAllocate(), source, new String[] { "kind", "attribute", "name", "writeAllocate" });
		addAnnotation(getCache_WriteBack(), source, new String[] { "kind", "attribute", "name", "writeBack" });
		addAnnotation(getCache_CacheRef(), source, new String[] { "kind", "element", "name", "CacheRef" });
		addAnnotation(cacheCoherencyTypeEEnum, source, new String[] { "name", "CacheCoherencyType" });
		addAnnotation(cacheCoherencyTypeObjectEDataType, source,
				new String[] { "name", "CacheCoherencyType:Object", "baseType", "CacheCoherencyType" });
		addAnnotation(cachePrefetchTypeEEnum, source, new String[] { "name", "CachePrefetchType" });
		addAnnotation(cachePrefetchTypeObjectEDataType, source,
				new String[] { "name", "CachePrefetchType:Object", "baseType", "CachePrefetchType" });
		addAnnotation(cacheReplacementTypeEEnum, source, new String[] { "name", "CacheReplacementType" });
		addAnnotation(cacheReplacementTypeObjectEDataType, source,
				new String[] { "name", "CacheReplacementType:Object", "baseType", "CacheReplacementType" });
		addAnnotation(cacheTypeEEnum, source, new String[] { "name", "CacheType" });
		addAnnotation(cacheTypeObjectEDataType, source,
				new String[] { "name", "CacheType:Object", "baseType", "CacheType" });
		addAnnotation(cacheWriteAllocateTypeEEnum, source, new String[] { "name", "CacheWriteAllocateType" });
		addAnnotation(cacheWriteAllocateTypeObjectEDataType, source,
				new String[] { "name", "CacheWriteAllocateType:Object", "baseType", "CacheWriteAllocateType" });
		addAnnotation(cacheWriteBackTypeEEnum, source, new String[] { "name", "CacheWriteBackType" });
		addAnnotation(cacheWriteBackTypeObjectEDataType, source,
				new String[] { "name", "CacheWriteBackType:Object", "baseType", "CacheWriteBackType" });
		addAnnotation(clockFrequencyEClass, source, new String[] { "name", "ClockFrequency", "kind", "empty" });
		addAnnotation(getClockFrequency_ClockValue(), source,
				new String[] { "kind", "attribute", "name", "clockValue" });
		addAnnotation(commonInstructionSetEClass, source,
				new String[] { "name", "CommonInstructionSet", "kind", "elementOnly" });
		addAnnotation(getCommonInstructionSet_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getCommonInstructionSet_FunctionalUnitSetFile(), source,
				new String[] { "kind", "element", "name", "FunctionalUnitSetFile" });
		addAnnotation(getCommonInstructionSet_FunctionalUnitSet(), source,
				new String[] { "kind", "element", "name", "FunctionalUnitSet" });
		addAnnotation(communicationSetEClass, source,
				new String[] { "name", "CommunicationSet", "kind", "elementOnly" });
		addAnnotation(getCommunicationSet_SharedMemoryCommunication(), source,
				new String[] { "kind", "element", "name", "SharedMemoryCommunication" });
		addAnnotation(getCommunicationSet_SharedRegisterCommunication(), source,
				new String[] { "kind", "element", "name", "SharedRegisterCommunication" });
		addAnnotation(getCommunicationSet_EventCommunication(), source,
				new String[] { "kind", "element", "name", "EventCommunication" });
		addAnnotation(getCommunicationSet_FIFOCommunication(), source,
				new String[] { "kind", "element", "name", "FIFOCommunication" });
		addAnnotation(getCommunicationSet_InterruptCommunication(), source,
				new String[] { "kind", "element", "name", "InterruptCommunication" });
		addAnnotation(componentSetEClass, source, new String[] { "name", "ComponentSet", "kind", "elementOnly" });
		addAnnotation(getComponentSet_ComponentSet(), source,
				new String[] { "kind", "element", "name", "ComponentSet" });
		addAnnotation(getComponentSet_MasterComponent(), source,
				new String[] { "kind", "element", "name", "MasterComponent" });
		addAnnotation(getComponentSet_SlaveComponent(), source,
				new String[] { "kind", "element", "name", "SlaveComponent" });
		addAnnotation(getComponentSet_Cache(), source, new String[] { "kind", "element", "name", "Cache" });
		addAnnotation(connectionEClass, source, new String[] { "name", "Connection", "kind", "elementOnly" });
		addAnnotation(getConnection_From(), source, new String[] { "kind", "attribute", "name", "from" });
		addAnnotation(getConnection_To(), source, new String[] { "kind", "attribute", "name", "to" });
		addAnnotation(getConnection_Performance(), source, new String[] { "kind", "element", "name", "Performance" });
		addAnnotation(connectionSetEClass, source, new String[] { "name", "ConnectionSet", "kind", "elementOnly" });
		addAnnotation(getConnectionSet_Connection(), source, new String[] { "kind", "element", "name", "Connection" });
		addAnnotation(contentionGroupEClass, source, new String[] { "name", "ContentionGroup", "kind", "elementOnly" });
		addAnnotation(getContentionGroup_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getContentionGroup_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getContentionGroup_Throughput(), source,
				new String[] { "kind", "element", "name", "Throughput" });
		addAnnotation(getContentionGroup_DataRate(), source, new String[] { "kind", "element", "name", "DataRate" });
		addAnnotation(getContentionGroup_PerformanceSetRef(), source,
				new String[] { "kind", "element", "name", "PerformanceSetRef" });
		addAnnotation(contentionGroupSetEClass, source,
				new String[] { "name", "ContentionGroupSet", "kind", "elementOnly" });
		addAnnotation(getContentionGroupSet_ContentionGroup(), source,
				new String[] { "kind", "element", "name", "ContentionGroup" });
		addAnnotation(customInstructionEClass, source,
				new String[] { "name", "CustomInstruction", "kind", "elementOnly" });
		addAnnotation(getCustomInstruction_InstructionInput(), source,
				new String[] { "kind", "element", "name", "InstructionInput" });
		addAnnotation(getCustomInstruction_InstructionOperation(), source,
				new String[] { "kind", "element", "name", "InstructionOperation" });
		addAnnotation(getCustomInstruction_InstructionOutput(), source,
				new String[] { "kind", "element", "name", "InstructionOutput" });
		addAnnotation(dataRateEClass, source, new String[] { "name", "DataRate", "kind", "elementOnly" });
		addAnnotation(getDataRate_Value(), source, new String[] { "kind", "attribute", "name", "value" });
		addAnnotation(getDataRate_Unit(), source, new String[] { "kind", "attribute", "name", "unit" });
		addAnnotation(dataRateUnitTypeEEnum, source, new String[] { "name", "DataRateUnitType" });
		addAnnotation(dataRateUnitTypeObjectEDataType, source,
				new String[] { "name", "DataRateUnitType:Object", "baseType", "DataRateUnitType" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source,
				new String[] { "kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source,
				new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_Shim(), source, new String[] { "kind", "element", "name", "Shim", "namespace",
				"http://www.multicore-association.org/2017/SHIM2.0/" });
		addAnnotation(endianTypeEEnum, source, new String[] { "name", "EndianType" });
		addAnnotation(endianTypeObjectEDataType, source,
				new String[] { "name", "EndianType:Object", "baseType", "EndianType" });
		addAnnotation(eventCommunicationEClass, source,
				new String[] { "name", "EventCommunication", "kind", "elementOnly" });
		addAnnotation(fifoCommunicationEClass, source,
				new String[] { "name", "FIFOCommunication", "kind", "elementOnly" });
		addAnnotation(getFIFOCommunication_DataSize(), source,
				new String[] { "kind", "attribute", "name", "dataSize" });
		addAnnotation(getFIFOCommunication_DataSizeUnit(), source,
				new String[] { "kind", "attribute", "name", "dataSizeUnit" });
		addAnnotation(getFIFOCommunication_QueueSize(), source,
				new String[] { "kind", "attribute", "name", "queueSize" });
		addAnnotation(frequencyDomainEClass, source, new String[] { "name", "FrequencyDomain", "kind", "empty" });
		addAnnotation(getFrequencyDomain_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getFrequencyDomain_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(frequencyUnitTypeEEnum, source, new String[] { "name", "FrequencyUnitType" });
		addAnnotation(frequencyUnitTypeObjectEDataType, source,
				new String[] { "name", "FrequencyUnitType:Object", "baseType", "FrequencyUnitType" });
		addAnnotation(frequencyVoltageSetEClass, source,
				new String[] { "name", "FrequencyVoltageSet", "kind", "elementOnly" });
		addAnnotation(getFrequencyVoltageSet_FrequencyDomain(), source,
				new String[] { "kind", "element", "name", "FrequencyDomain" });
		addAnnotation(getFrequencyVoltageSet_VoltageDomain(), source,
				new String[] { "kind", "element", "name", "VoltageDomain" });
		addAnnotation(getFrequencyVoltageSet_OperatingPointSet(), source,
				new String[] { "kind", "element", "name", "OperatingPointSet" });
		addAnnotation(functionalUnitEClass, source, new String[] { "name", "FunctionalUnit", "kind", "elementOnly" });
		addAnnotation(getFunctionalUnit_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getFunctionalUnit_Instruction(), source,
				new String[] { "kind", "element", "name", "Instruction" });
		addAnnotation(getFunctionalUnit_CustomInstruction(), source,
				new String[] { "kind", "element", "name", "CustomInstruction" });
		addAnnotation(functionalUnitSetEClass, source,
				new String[] { "name", "FunctionalUnitSet", "kind", "elementOnly" });
		addAnnotation(getFunctionalUnitSet_FunctionalUnit(), source,
				new String[] { "kind", "element", "name", "FunctionalUnit" });
		addAnnotation(functionalUnitSetFileEClass, source,
				new String[] { "name", "FunctionalUnitSetFile", "kind", "elementOnly" });
		addAnnotation(getFunctionalUnitSetFile_Src(), source, new String[] { "kind", "attribute", "name", "src" });
		addAnnotation(instructionEClass, source, new String[] { "name", "Instruction", "kind", "elementOnly" });
		addAnnotation(getInstruction_ImmediateBitWidth(), source,
				new String[] { "kind", "attribute", "name", "immediateBitWidth" });
		addAnnotation(getInstruction_InputBitWidth(), source,
				new String[] { "kind", "attribute", "name", "inputBitWidth" });
		addAnnotation(getInstruction_InputPreserved(), source,
				new String[] { "kind", "attribute", "name", "inputPreserved" });
		addAnnotation(getInstruction_IsEmulated(), source, new String[] { "kind", "attribute", "name", "isEmulated" });
		addAnnotation(getInstruction_OperandAddressing(), source,
				new String[] { "kind", "attribute", "name", "operandAddressing" });
		addAnnotation(getInstruction_Operation(), source, new String[] { "kind", "attribute", "name", "operation" });
		addAnnotation(getInstruction_OutputBitWidth(), source,
				new String[] { "kind", "attribute", "name", "outputBitWidth" });
		addAnnotation(getInstruction_SupportedSignedness(), source,
				new String[] { "kind", "attribute", "name", "supportedSignedness" });
		addAnnotation(instructionInputEClass, source,
				new String[] { "name", "InstructionInput", "kind", "elementOnly" });
		addAnnotation(getInstructionInput_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(getInstructionInput_BitWidth(), source, new String[] { "kind", "attribute", "name", "bitWidth" });
		addAnnotation(getInstructionInput_Value(), source, new String[] { "kind", "attribute", "name", "value" });
		addAnnotation(instructionInputTypeEEnum, source, new String[] { "name", "InstructionInputType" });
		addAnnotation(instructionInputTypeObjectEDataType, source,
				new String[] { "name", "InstructionInputType:Object", "baseType", "InstructionInputType" });
		addAnnotation(instructionOperationEClass, source,
				new String[] { "name", "InstructionOperation", "kind", "elementOnly" });
		addAnnotation(getInstructionOperation_Operation(), source,
				new String[] { "kind", "attribute", "name", "operation" });
		addAnnotation(getInstructionOperation_InstructionOperand(), source,
				new String[] { "kind", "element", "name", "InstructionOperand" });
		addAnnotation(instructionOutputEClass, source,
				new String[] { "name", "InstructionOutput", "kind", "elementOnly" });
		addAnnotation(getInstructionOutput_Type(), source, new String[] { "kind", "attribute", "name", "type" });
		addAnnotation(getInstructionOutput_BitWidth(), source,
				new String[] { "kind", "attribute", "name", "bitWidth" });
		addAnnotation(getInstructionOutput_Ref(), source, new String[] { "kind", "attribute", "name", "ref" });
		addAnnotation(instructionOutputTypeEEnum, source, new String[] { "name", "InstructionOutputType" });
		addAnnotation(instructionOutputTypeObjectEDataType, source,
				new String[] { "name", "InstructionOutputType:Object", "baseType", "InstructionOutputType" });
		addAnnotation(interruptCommunicationEClass, source,
				new String[] { "name", "InterruptCommunication", "kind", "elementOnly" });
		addAnnotation(latencyEClass, source, new String[] { "name", "Latency", "kind", "empty" });
		addAnnotation(lockDownTypeEEnum, source, new String[] { "name", "LockDownType" });
		addAnnotation(lockDownTypeObjectEDataType, source,
				new String[] { "name", "LockDownType:Object", "baseType", "LockDownType" });
		addAnnotation(masterComponentEClass, source, new String[] { "name", "MasterComponent", "kind", "elementOnly" });
		addAnnotation(getMasterComponent_CacheRef(), source, new String[] { "kind", "element", "name", "CacheRef" });
		addAnnotation(getMasterComponent_AccessTypeSet(), source,
				new String[] { "kind", "element", "name", "AccessTypeSet" });
		addAnnotation(getMasterComponent_ClockFrequency(), source,
				new String[] { "kind", "element", "name", "ClockFrequency" });
		addAnnotation(getMasterComponent_Arch(), source, new String[] { "kind", "attribute", "name", "arch" });
		addAnnotation(getMasterComponent_ArchOption(), source,
				new String[] { "kind", "attribute", "name", "archOption" });
		addAnnotation(getMasterComponent_Endian(), source, new String[] { "kind", "attribute", "name", "endian" });
		addAnnotation(getMasterComponent_MasterType(), source,
				new String[] { "kind", "attribute", "name", "masterType" });
		addAnnotation(getMasterComponent_NChannel(), source, new String[] { "kind", "attribute", "name", "nChannel" });
		addAnnotation(getMasterComponent_NThread(), source, new String[] { "kind", "attribute", "name", "nThread" });
		addAnnotation(getMasterComponent_Pid(), source, new String[] { "kind", "attribute", "name", "pid" });
		addAnnotation(getMasterComponent_CommonInstructionSet(), source,
				new String[] { "kind", "element", "name", "CommonInstructionSet" });
		addAnnotation(masterSlaveBindingEClass, source,
				new String[] { "name", "MasterSlaveBinding", "kind", "elementOnly" });
		addAnnotation(getMasterSlaveBinding_Accessor(), source, new String[] { "kind", "element", "name", "Accessor" });
		addAnnotation(getMasterSlaveBinding_SlaveComponentRef(), source,
				new String[] { "kind", "attribute", "name", "slaveComponentRef" });
		addAnnotation(masterSlaveBindingSetEClass, source,
				new String[] { "name", "MasterSlaveBindingSet", "kind", "elementOnly" });
		addAnnotation(getMasterSlaveBindingSet_MasterSlaveBinding(), source,
				new String[] { "kind", "element", "name", "MasterSlaveBinding" });
		addAnnotation(masterTypeEEnum, source, new String[] { "name", "MasterType" });
		addAnnotation(masterTypeObjectEDataType, source,
				new String[] { "name", "MasterType:Object", "baseType", "MasterType" });
		addAnnotation(memoryConsistencyModelEClass, source,
				new String[] { "name", "MemoryConsistencyModel", "kind", "empty" });
		addAnnotation(getMemoryConsistencyModel_RawOrdering(), source,
				new String[] { "kind", "attribute", "name", "rawOrdering" });
		addAnnotation(getMemoryConsistencyModel_WarOrdering(), source,
				new String[] { "kind", "attribute", "name", "warOrdering" });
		addAnnotation(getMemoryConsistencyModel_WawOrdering(), source,
				new String[] { "kind", "attribute", "name", "wawOrdering" });
		addAnnotation(getMemoryConsistencyModel_RarOrdering(), source,
				new String[] { "kind", "attribute", "name", "rarOrdering" });
		addAnnotation(operandAddressingTypeEEnum, source, new String[] { "name", "OperandAddressingType" });
		addAnnotation(operandAddressingTypeObjectEDataType, source,
				new String[] { "name", "OperandAddressingType:Object", "baseType", "OperandAddressingType" });
		addAnnotation(operatingPointEClass, source, new String[] { "name", "OperatingPoint", "kind", "elementOnly" });
		addAnnotation(getOperatingPoint_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getOperatingPoint_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getOperatingPoint_Frequency(), source, new String[] { "kind", "attribute", "name", "frequency" });
		addAnnotation(getOperatingPoint_FrequencyUnit(), source,
				new String[] { "kind", "attribute", "name", "frequencyUnit" });
		addAnnotation(getOperatingPoint_Voltage(), source, new String[] { "kind", "attribute", "name", "voltage" });
		addAnnotation(getOperatingPoint_VoltageUnit(), source,
				new String[] { "kind", "attribute", "name", "voltageUnit" });
		addAnnotation(operatingPointSetEClass, source,
				new String[] { "name", "OperatingPointSet", "kind", "elementOnly" });
		addAnnotation(getOperatingPointSet_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getOperatingPointSet_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getOperatingPointSet_OperatingPoint(), source,
				new String[] { "kind", "element", "name", "OperatingPoint" });
		addAnnotation(operationTypeEEnum, source, new String[] { "name", "OperationType" });
		addAnnotation(operationTypeObjectEDataType, source,
				new String[] { "name", "OperationType:Object", "baseType", "OperationType" });
		addAnnotation(orderingTypeEEnum, source, new String[] { "name", "OrderingType" });
		addAnnotation(orderingTypeObjectEDataType, source,
				new String[] { "name", "OrderingType:Object", "baseType", "OrderingType" });
		addAnnotation(performanceEClass, source, new String[] { "name", "Performance", "kind", "elementOnly" });
		addAnnotation(getPerformance_Pitch(), source, new String[] { "kind", "element", "name", "Pitch" });
		addAnnotation(getPerformance_Latency(), source, new String[] { "kind", "element", "name", "Latency" });
		addAnnotation(getPerformance_AccessTypeRef(), source,
				new String[] { "kind", "attribute", "name", "accessTypeRef" });
		addAnnotation(performanceSetEClass, source, new String[] { "name", "PerformanceSet", "kind", "elementOnly" });
		addAnnotation(getPerformanceSet_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getPerformanceSet_CacheRef(), source, new String[] { "kind", "attribute", "name", "cacheRef" });
		addAnnotation(getPerformanceSet_Performance(), source,
				new String[] { "kind", "element", "name", "Performance" });
		addAnnotation(pitchEClass, source, new String[] { "name", "Pitch", "kind", "empty" });
		addAnnotation(powerConfigurationEClass, source,
				new String[] { "name", "PowerConfiguration", "kind", "elementOnly" });
		addAnnotation(getPowerConfiguration_SystemConfigurationSrc(), source,
				new String[] { "kind", "attribute", "name", "systemConfigurationSrc" });
		addAnnotation(getPowerConfiguration_PowerConsumptionSet(), source,
				new String[] { "kind", "element", "name", "PowerConsumptionSet" });
		addAnnotation(powerConsumptionEClass, source,
				new String[] { "name", "PowerConsumption", "kind", "elementOnly" });
		addAnnotation(getPowerConsumption_OperatingPointRef(), source,
				new String[] { "kind", "attribute", "name", "operatingPointRef" });
		addAnnotation(getPowerConsumption_Power(), source, new String[] { "kind", "attribute", "name", "power" });
		addAnnotation(getPowerConsumption_PowerUnit(), source,
				new String[] { "kind", "attribute", "name", "powerUnit" });
		addAnnotation(powerConsumptionSetEClass, source,
				new String[] { "name", "PowerConsumptionSet", "kind", "elementOnly" });
		addAnnotation(getPowerConsumptionSet_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getPowerConsumptionSet_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getPowerConsumptionSet_PowerConsumption(), source,
				new String[] { "kind", "element", "name", "PowerConsumption" });
		addAnnotation(getPowerConsumptionSet_PowerConsumerRef(), source,
				new String[] { "kind", "element", "name", "PowerConsumerRef" });
		addAnnotation(powerUnitTypeEEnum, source, new String[] { "name", "PowerUnitType" });
		addAnnotation(powerUnitTypeObjectEDataType, source,
				new String[] { "name", "PowerUnitType:Object", "baseType", "PowerUnitType" });
		addAnnotation(rwTypeEEnum, source, new String[] { "name", "RWType" });
		addAnnotation(rwTypeObjectEDataType, source, new String[] { "name", "RWType:Object", "baseType", "RWType" });
		addAnnotation(sharedMemoryCommunicationEClass, source,
				new String[] { "name", "SharedMemoryCommunication", "kind", "elementOnly" });
		addAnnotation(getSharedMemoryCommunication_OperationType(), source,
				new String[] { "kind", "attribute", "name", "operationType" });
		addAnnotation(getSharedMemoryCommunication_DataSize(), source,
				new String[] { "kind", "attribute", "name", "dataSize" });
		addAnnotation(getSharedMemoryCommunication_DataSizeUnit(), source,
				new String[] { "kind", "attribute", "name", "dataSizeUnit" });
		addAnnotation(getSharedMemoryCommunication_AddressSpaceRef(), source,
				new String[] { "kind", "attribute", "name", "addressSpaceRef" });
		addAnnotation(getSharedMemoryCommunication_SubSpaceRef(), source,
				new String[] { "kind", "attribute", "name", "subSpaceRef" });
		addAnnotation(sharedRegisterCommunicationEClass, source,
				new String[] { "name", "SharedRegisterCommunication", "kind", "elementOnly" });
		addAnnotation(getSharedRegisterCommunication_DataSize(), source,
				new String[] { "kind", "attribute", "name", "dataSize" });
		addAnnotation(getSharedRegisterCommunication_DataSizeUnit(), source,
				new String[] { "kind", "attribute", "name", "dataSizeUnit" });
		addAnnotation(getSharedRegisterCommunication_NRegister(), source,
				new String[] { "kind", "attribute", "name", "nRegister" });
		addAnnotation(shimEClass, source, new String[] { "name", "Shim", "kind", "elementOnly" });
		addAnnotation(getShim_SystemConfiguration(), source,
				new String[] { "kind", "element", "name", "SystemConfiguration" });
		addAnnotation(getShim_PowerConfiguration(), source,
				new String[] { "kind", "element", "name", "PowerConfiguration" });
		addAnnotation(getShim_FunctionalUnitSet(), source,
				new String[] { "kind", "element", "name", "FunctionalUnitSet" });
		addAnnotation(signednessTypeEEnum, source, new String[] { "name", "SignednessType" });
		addAnnotation(signednessTypeObjectEDataType, source,
				new String[] { "name", "SignednessType:Object", "baseType", "SignednessType" });
		addAnnotation(sizeUnitTypeEEnum, source, new String[] { "name", "SizeUnitType" });
		addAnnotation(sizeUnitTypeObjectEDataType, source,
				new String[] { "name", "SizeUnitType:Object", "baseType", "SizeUnitType" });
		addAnnotation(slaveComponentEClass, source, new String[] { "name", "SlaveComponent", "kind", "empty" });
		addAnnotation(getSlaveComponent_Size(), source, new String[] { "kind", "attribute", "name", "size" });
		addAnnotation(getSlaveComponent_SizeUnit(), source, new String[] { "kind", "attribute", "name", "sizeUnit" });
		addAnnotation(getSlaveComponent_RwType(), source, new String[] { "kind", "attribute", "name", "rwType" });
		addAnnotation(subSpaceEClass, source, new String[] { "name", "SubSpace", "kind", "elementOnly" });
		addAnnotation(getSubSpace_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getSubSpace_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(getSubSpace_Start(), source, new String[] { "kind", "attribute", "name", "start" });
		addAnnotation(getSubSpace_End(), source, new String[] { "kind", "attribute", "name", "end" });
		addAnnotation(getSubSpace_Endian(), source, new String[] { "kind", "attribute", "name", "endian" });
		addAnnotation(getSubSpace_MasterSlaveBindingSet(), source,
				new String[] { "kind", "element", "name", "MasterSlaveBindingSet" });
		addAnnotation(getSubSpace_MemoryConsistencyModel(), source,
				new String[] { "kind", "element", "name", "MemoryConsistencyModel" });
		addAnnotation(systemConfigurationEClass, source,
				new String[] { "name", "SystemConfiguration", "kind", "elementOnly" });
		addAnnotation(getSystemConfiguration_ComponentSet(), source,
				new String[] { "kind", "element", "name", "ComponentSet" });
		addAnnotation(getSystemConfiguration_AddressSpaceSet(), source,
				new String[] { "kind", "element", "name", "AddressSpaceSet" });
		addAnnotation(getSystemConfiguration_CommunicationSet(), source,
				new String[] { "kind", "element", "name", "CommunicationSet" });
		addAnnotation(getSystemConfiguration_FrequencyVoltageSet(), source,
				new String[] { "kind", "element", "name", "FrequencyVoltageSet" });
		addAnnotation(getSystemConfiguration_ContentionGroupSet(), source,
				new String[] { "kind", "element", "name", "ContentionGroupSet" });
		addAnnotation(throughputEClass, source, new String[] { "name", "Throughput", "kind", "elementOnly" });
		addAnnotation(getThroughput_FrequencyDomainRef(), source,
				new String[] { "kind", "attribute", "name", "frequencyDomainRef" });
		addAnnotation(getThroughput_Value(), source, new String[] { "kind", "attribute", "name", "value" });
		addAnnotation(getThroughput_Unit(), source, new String[] { "kind", "attribute", "name", "unit" });
		addAnnotation(throughputUnitTypeEEnum, source, new String[] { "name", "ThroughputUnitType" });
		addAnnotation(throughputUnitTypeObjectEDataType, source,
				new String[] { "name", "ThroughputUnitType:Object", "baseType", "ThroughputUnitType" });
		addAnnotation(unsignedFloatTypeEDataType, source,
				new String[] { "name", "UnsignedIntType", "minInclusive", "0" });
		addAnnotation(unsignedFloatObjectTypeEDataType, source,
				new String[] { "name", "UnsignedIntObjectType", "minInclusive", "0" });
		addAnnotation(unsignedIntTypeEDataType, source,
				new String[] { "name", "UnsignedIntType", "minInclusive", "0" });
		addAnnotation(unsignedIntObjectTypeEDataType, source,
				new String[] { "name", "UnsignedIntObjectType", "minInclusive", "0" });
		addAnnotation(voltageDomainEClass, source, new String[] { "name", "VoltageDomain", "kind", "empty" });
		addAnnotation(getVoltageDomain_Name(), source, new String[] { "kind", "attribute", "name", "name" });
		addAnnotation(getVoltageDomain_Id(), source, new String[] { "kind", "attribute", "name", "id" });
		addAnnotation(voltageUnitTypeEEnum, source, new String[] { "name", "VoltageUnitType" });
		addAnnotation(voltageUnitTypeObjectEDataType, source,
				new String[] { "name", "VoltageUnitType:Object", "baseType", "VoltageUnitType" });
	}

} //ShimPackageImpl
