/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim10.model.shim10.ShimFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface ShimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Shim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "file:/C:/Users/scasy/Downloads/shim.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Shim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShimPackage eINSTANCE = org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.AbstractCommunicationImpl <em>Abstract Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.AbstractCommunicationImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAbstractCommunication()
	 * @generated
	 */
	int ABSTRACT_COMMUNICATION = 0;

	/**
	 * The feature id for the '<em><b>Connection Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMUNICATION__CONNECTION_SET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMUNICATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Abstract Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMUNICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMMUNICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.AbstractPerformanceImpl <em>Abstract Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.AbstractPerformanceImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAbstractPerformance()
	 * @generated
	 */
	int ABSTRACT_PERFORMANCE = 1;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE__BEST = 0;

	/**
	 * The feature id for the '<em><b>Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE__TYPICAL = 1;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE__WORST = 2;

	/**
	 * The number of structural features of the '<em>Abstract Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Abstract Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.AccessorImpl <em>Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.AccessorImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAccessor()
	 * @generated
	 */
	int ACCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Performance Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__PERFORMANCE_SET = 0;

	/**
	 * The feature id for the '<em><b>Master Component Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__MASTER_COMPONENT_REF = 1;

	/**
	 * The number of structural features of the '<em>Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.AccessTypeImpl <em>Access Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.AccessTypeImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Access Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__ACCESS_BYTE_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Alignment Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__ALIGNMENT_BYTE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>NBurst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__NBURST = 4;

	/**
	 * The feature id for the '<em><b>Rw Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__RW_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Access Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Access Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.AccessTypeSetImpl <em>Access Type Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.AccessTypeSetImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAccessTypeSet()
	 * @generated
	 */
	int ACCESS_TYPE_SET = 4;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_SET__ACCESS_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Access Type Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Access Type Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.AddressSpaceImpl <em>Address Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.AddressSpaceImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAddressSpace()
	 * @generated
	 */
	int ADDRESS_SPACE = 5;

	/**
	 * The feature id for the '<em><b>Sub Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE__SUB_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Address Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Address Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.AddressSpaceSetImpl <em>Address Space Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.AddressSpaceSetImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAddressSpaceSet()
	 * @generated
	 */
	int ADDRESS_SPACE_SET = 6;

	/**
	 * The feature id for the '<em><b>Address Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_SET__ADDRESS_SPACE = 0;

	/**
	 * The number of structural features of the '<em>Address Space Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Address Space Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.CacheImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 7;

	/**
	 * The feature id for the '<em><b>Cache Coherency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CACHE_COHERENCY = 0;

	/**
	 * The feature id for the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CACHE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ID = 2;

	/**
	 * The feature id for the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__LINE_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Lock Down Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__LOCK_DOWN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NAME = 5;

	/**
	 * The feature id for the '<em><b>NWay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NWAY = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__SIZE = 7;

	/**
	 * The feature id for the '<em><b>Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__SIZE_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Cache Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CACHE_REF = 9;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.ClockFrequencyImpl <em>Clock Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.ClockFrequencyImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getClockFrequency()
	 * @generated
	 */
	int CLOCK_FREQUENCY = 8;

	/**
	 * The feature id for the '<em><b>Clock Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FREQUENCY__CLOCK_VALUE = 0;

	/**
	 * The number of structural features of the '<em>Clock Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FREQUENCY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Clock Frequency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_FREQUENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.CommonInstructionSetImpl <em>Common Instruction Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.CommonInstructionSetImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCommonInstructionSet()
	 * @generated
	 */
	int COMMON_INSTRUCTION_SET = 9;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_INSTRUCTION_SET__INSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_INSTRUCTION_SET__NAME = 1;

	/**
	 * The number of structural features of the '<em>Common Instruction Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_INSTRUCTION_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Common Instruction Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_INSTRUCTION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.CommunicationSetImpl <em>Communication Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.CommunicationSetImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCommunicationSet()
	 * @generated
	 */
	int COMMUNICATION_SET = 10;

	/**
	 * The feature id for the '<em><b>Shared Register Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION = 0;

	/**
	 * The feature id for the '<em><b>Shared Memory Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION = 1;

	/**
	 * The feature id for the '<em><b>Event Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET__EVENT_COMMUNICATION = 2;

	/**
	 * The feature id for the '<em><b>FIFO Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET__FIFO_COMMUNICATION = 3;

	/**
	 * The feature id for the '<em><b>Interrupt Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET__INTERRUPT_COMMUNICATION = 4;

	/**
	 * The number of structural features of the '<em>Communication Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Communication Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.ComponentSetImpl <em>Component Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.ComponentSetImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getComponentSet()
	 * @generated
	 */
	int COMPONENT_SET = 11;

	/**
	 * The feature id for the '<em><b>Component Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__COMPONENT_SET = 0;

	/**
	 * The feature id for the '<em><b>Slave Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__SLAVE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Master Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__MASTER_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__CACHE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__NAME = 4;

	/**
	 * The number of structural features of the '<em>Component Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.ConnectionImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 12;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PERFORMANCE = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.ConnectionSetImpl <em>Connection Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.ConnectionSetImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getConnectionSet()
	 * @generated
	 */
	int CONNECTION_SET = 13;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SET__CONNECTION = 0;

	/**
	 * The number of structural features of the '<em>Connection Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connection Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Abstract Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_COMMUNICATION = 3;

	/**
	 * The feature id for the '<em><b>Abstract Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_PERFORMANCE = 4;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCESSOR = 5;

	/**
	 * The feature id for the '<em><b>Access Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCESS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Access Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACCESS_TYPE_SET = 7;

	/**
	 * The feature id for the '<em><b>Address Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_SPACE = 8;

	/**
	 * The feature id for the '<em><b>Address Space Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS_SPACE_SET = 9;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CACHE = 10;

	/**
	 * The feature id for the '<em><b>Clock Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLOCK_FREQUENCY = 11;

	/**
	 * The feature id for the '<em><b>Common Instruction Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMON_INSTRUCTION_SET = 12;

	/**
	 * The feature id for the '<em><b>Communication Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMMUNICATION_SET = 13;

	/**
	 * The feature id for the '<em><b>Component Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPONENT_SET = 14;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECTION = 15;

	/**
	 * The feature id for the '<em><b>Connection Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONNECTION_SET = 16;

	/**
	 * The feature id for the '<em><b>Event Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT_COMMUNICATION = 17;

	/**
	 * The feature id for the '<em><b>FIFO Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIFO_COMMUNICATION = 18;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSTRUCTION = 19;

	/**
	 * The feature id for the '<em><b>Interrupt Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERRUPT_COMMUNICATION = 20;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LATENCY = 21;

	/**
	 * The feature id for the '<em><b>Master Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTER_COMPONENT = 22;

	/**
	 * The feature id for the '<em><b>Master Slave Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTER_SLAVE_BINDING = 23;

	/**
	 * The feature id for the '<em><b>Master Slave Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET = 24;

	/**
	 * The feature id for the '<em><b>Memory Consistency Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL = 25;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERFORMANCE = 26;

	/**
	 * The feature id for the '<em><b>Performance Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERFORMANCE_SET = 27;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PITCH = 28;

	/**
	 * The feature id for the '<em><b>Shared Memory Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION = 29;

	/**
	 * The feature id for the '<em><b>Shared Register Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION = 30;

	/**
	 * The feature id for the '<em><b>Slave Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SLAVE_COMPONENT = 31;

	/**
	 * The feature id for the '<em><b>Sub Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB_SPACE = 32;

	/**
	 * The feature id for the '<em><b>System Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYSTEM_CONFIGURATION = 33;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 34;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.EventCommunicationImpl <em>Event Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.EventCommunicationImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getEventCommunication()
	 * @generated
	 */
	int EVENT_COMMUNICATION = 15;

	/**
	 * The feature id for the '<em><b>Connection Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COMMUNICATION__CONNECTION_SET = ABSTRACT_COMMUNICATION__CONNECTION_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COMMUNICATION__NAME = ABSTRACT_COMMUNICATION__NAME;

	/**
	 * The number of structural features of the '<em>Event Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COMMUNICATION_FEATURE_COUNT = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_COMMUNICATION_OPERATION_COUNT = ABSTRACT_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.FIFOCommunicationImpl <em>FIFO Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.FIFOCommunicationImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getFIFOCommunication()
	 * @generated
	 */
	int FIFO_COMMUNICATION = 16;

	/**
	 * The feature id for the '<em><b>Connection Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION__CONNECTION_SET = ABSTRACT_COMMUNICATION__CONNECTION_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION__NAME = ABSTRACT_COMMUNICATION__NAME;

	/**
	 * The feature id for the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION__DATA_SIZE = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION__DATA_SIZE_UNIT = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION__QUEUE_SIZE = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FIFO Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION_FEATURE_COUNT = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FIFO Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIFO_COMMUNICATION_OPERATION_COUNT = ABSTRACT_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.InstructionImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 17;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PERFORMANCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.InterruptCommunicationImpl <em>Interrupt Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.InterruptCommunicationImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getInterruptCommunication()
	 * @generated
	 */
	int INTERRUPT_COMMUNICATION = 18;

	/**
	 * The feature id for the '<em><b>Connection Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_COMMUNICATION__CONNECTION_SET = ABSTRACT_COMMUNICATION__CONNECTION_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_COMMUNICATION__NAME = ABSTRACT_COMMUNICATION__NAME;

	/**
	 * The number of structural features of the '<em>Interrupt Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_COMMUNICATION_FEATURE_COUNT = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interrupt Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERRUPT_COMMUNICATION_OPERATION_COUNT = ABSTRACT_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.LatencyImpl <em>Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.LatencyImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getLatency()
	 * @generated
	 */
	int LATENCY = 19;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__BEST = ABSTRACT_PERFORMANCE__BEST;

	/**
	 * The feature id for the '<em><b>Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__TYPICAL = ABSTRACT_PERFORMANCE__TYPICAL;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY__WORST = ABSTRACT_PERFORMANCE__WORST;

	/**
	 * The number of structural features of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_FEATURE_COUNT = ABSTRACT_PERFORMANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Latency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_OPERATION_COUNT = ABSTRACT_PERFORMANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.MasterComponentImpl <em>Master Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.MasterComponentImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterComponent()
	 * @generated
	 */
	int MASTER_COMPONENT = 20;

	/**
	 * The feature id for the '<em><b>Common Instruction Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__COMMON_INSTRUCTION_SET = 0;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__CACHE = 1;

	/**
	 * The feature id for the '<em><b>Clock Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__CLOCK_FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Access Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ACCESS_TYPE_SET = 3;

	/**
	 * The feature id for the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ARCH = 4;

	/**
	 * The feature id for the '<em><b>Arch Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ARCH_OPTION = 5;

	/**
	 * The feature id for the '<em><b>Endian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ENDIAN = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ID = 7;

	/**
	 * The feature id for the '<em><b>Master Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__MASTER_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__NAME = 9;

	/**
	 * The feature id for the '<em><b>NThread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__NTHREAD = 10;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__PID = 11;

	/**
	 * The number of structural features of the '<em>Master Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Master Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.MasterSlaveBindingImpl <em>Master Slave Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.MasterSlaveBindingImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterSlaveBinding()
	 * @generated
	 */
	int MASTER_SLAVE_BINDING = 21;

	/**
	 * The feature id for the '<em><b>Accessor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLAVE_BINDING__ACCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Slave Component Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF = 1;

	/**
	 * The number of structural features of the '<em>Master Slave Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLAVE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Master Slave Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLAVE_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.MasterSlaveBindingSetImpl <em>Master Slave Binding Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.MasterSlaveBindingSetImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterSlaveBindingSet()
	 * @generated
	 */
	int MASTER_SLAVE_BINDING_SET = 22;

	/**
	 * The feature id for the '<em><b>Master Slave Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING = 0;

	/**
	 * The number of structural features of the '<em>Master Slave Binding Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLAVE_BINDING_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Master Slave Binding Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_SLAVE_BINDING_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.MemoryConsistencyModelImpl <em>Memory Consistency Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.MemoryConsistencyModelImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMemoryConsistencyModel()
	 * @generated
	 */
	int MEMORY_CONSISTENCY_MODEL = 23;

	/**
	 * The feature id for the '<em><b>Rar Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL__RAR_ORDERING = 0;

	/**
	 * The feature id for the '<em><b>Raw Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL__RAW_ORDERING = 1;

	/**
	 * The feature id for the '<em><b>War Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL__WAR_ORDERING = 2;

	/**
	 * The feature id for the '<em><b>Waw Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL__WAW_ORDERING = 3;

	/**
	 * The number of structural features of the '<em>Memory Consistency Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Memory Consistency Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.PerformanceImpl <em>Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.PerformanceImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getPerformance()
	 * @generated
	 */
	int PERFORMANCE = 24;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__PITCH = 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__LATENCY = 1;

	/**
	 * The feature id for the '<em><b>Access Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE__ACCESS_TYPE_REF = 2;

	/**
	 * The number of structural features of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.PerformanceSetImpl <em>Performance Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.PerformanceSetImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getPerformanceSet()
	 * @generated
	 */
	int PERFORMANCE_SET = 25;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SET__PERFORMANCE = 0;

	/**
	 * The number of structural features of the '<em>Performance Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Performance Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.PitchImpl <em>Pitch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.PitchImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getPitch()
	 * @generated
	 */
	int PITCH = 26;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__BEST = ABSTRACT_PERFORMANCE__BEST;

	/**
	 * The feature id for the '<em><b>Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__TYPICAL = ABSTRACT_PERFORMANCE__TYPICAL;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH__WORST = ABSTRACT_PERFORMANCE__WORST;

	/**
	 * The number of structural features of the '<em>Pitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_FEATURE_COUNT = ABSTRACT_PERFORMANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_OPERATION_COUNT = ABSTRACT_PERFORMANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.SharedMemoryCommunicationImpl <em>Shared Memory Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.SharedMemoryCommunicationImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSharedMemoryCommunication()
	 * @generated
	 */
	int SHARED_MEMORY_COMMUNICATION = 27;

	/**
	 * The feature id for the '<em><b>Connection Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__CONNECTION_SET = ABSTRACT_COMMUNICATION__CONNECTION_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__NAME = ABSTRACT_COMMUNICATION__NAME;

	/**
	 * The feature id for the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__DATA_SIZE = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address Space Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Space Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Shared Memory Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION_FEATURE_COUNT = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Shared Memory Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION_OPERATION_COUNT = ABSTRACT_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.SharedRegisterCommunicationImpl <em>Shared Register Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.SharedRegisterCommunicationImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSharedRegisterCommunication()
	 * @generated
	 */
	int SHARED_REGISTER_COMMUNICATION = 28;

	/**
	 * The feature id for the '<em><b>Connection Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_REGISTER_COMMUNICATION__CONNECTION_SET = ABSTRACT_COMMUNICATION__CONNECTION_SET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_REGISTER_COMMUNICATION__NAME = ABSTRACT_COMMUNICATION__NAME;

	/**
	 * The feature id for the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_REGISTER_COMMUNICATION__DATA_SIZE = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>NRegister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_REGISTER_COMMUNICATION__NREGISTER = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shared Register Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_REGISTER_COMMUNICATION_FEATURE_COUNT = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shared Register Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_REGISTER_COMMUNICATION_OPERATION_COUNT = ABSTRACT_COMMUNICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.SlaveComponentImpl <em>Slave Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.SlaveComponentImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSlaveComponent()
	 * @generated
	 */
	int SLAVE_COMPONENT = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Rw Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__RW_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__SIZE = 3;

	/**
	 * The feature id for the '<em><b>Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__SIZE_UNIT = 4;

	/**
	 * The number of structural features of the '<em>Slave Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Slave Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl <em>Sub Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSubSpace()
	 * @generated
	 */
	int SUB_SPACE = 30;

	/**
	 * The feature id for the '<em><b>Memory Consistency Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__MEMORY_CONSISTENCY_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Master Slave Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__MASTER_SLAVE_BINDING_SET = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__END = 2;

	/**
	 * The feature id for the '<em><b>Endian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__ENDIAN = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__START = 6;

	/**
	 * The number of structural features of the '<em>Sub Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Sub Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl <em>System Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSystemConfiguration()
	 * @generated
	 */
	int SYSTEM_CONFIGURATION = 31;

	/**
	 * The feature id for the '<em><b>Component Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__COMPONENT_SET = 0;

	/**
	 * The feature id for the '<em><b>Communication Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__COMMUNICATION_SET = 1;

	/**
	 * The feature id for the '<em><b>Address Space Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET = 2;

	/**
	 * The feature id for the '<em><b>Clock Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__CLOCK_FREQUENCY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__NAME = 4;

	/**
	 * The feature id for the '<em><b>Shim Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__SHIM_VERSION = 5;

	/**
	 * The number of structural features of the '<em>System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.CacheCoherencyType <em>Cache Coherency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.CacheCoherencyType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCacheCoherencyType()
	 * @generated
	 */
	int CACHE_COHERENCY_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.CacheType <em>Cache Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.CacheType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCacheType()
	 * @generated
	 */
	int CACHE_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.EndianType <em>Endian Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.EndianType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getEndianType()
	 * @generated
	 */
	int ENDIAN_TYPE = 34;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.LockDownType <em>Lock Down Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.LockDownType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getLockDownType()
	 * @generated
	 */
	int LOCK_DOWN_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.MasterType <em>Master Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.MasterType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterType()
	 * @generated
	 */
	int MASTER_TYPE = 36;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.OperationType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.OrderingType <em>Ordering Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getOrderingType()
	 * @generated
	 */
	int ORDERING_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.RWType <em>RW Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.RWType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getRWType()
	 * @generated
	 */
	int RW_TYPE = 39;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim10.model.shim10.SizeUnitType <em>Size Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSizeUnitType()
	 * @generated
	 */
	int SIZE_UNIT_TYPE = 40;

	/**
	 * The meta object id for the '<em>Cache Coherency Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.CacheCoherencyType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCacheCoherencyTypeObject()
	 * @generated
	 */
	int CACHE_COHERENCY_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Cache Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.CacheType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCacheTypeObject()
	 * @generated
	 */
	int CACHE_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Endian Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.EndianType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getEndianTypeObject()
	 * @generated
	 */
	int ENDIAN_TYPE_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Lock Down Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.LockDownType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getLockDownTypeObject()
	 * @generated
	 */
	int LOCK_DOWN_TYPE_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Master Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.MasterType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterTypeObject()
	 * @generated
	 */
	int MASTER_TYPE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Operation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.OperationType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getOperationTypeObject()
	 * @generated
	 */
	int OPERATION_TYPE_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Ordering Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getOrderingTypeObject()
	 * @generated
	 */
	int ORDERING_TYPE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>RW Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.RWType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getRWTypeObject()
	 * @generated
	 */
	int RW_TYPE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Size Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSizeUnitTypeObject()
	 * @generated
	 */
	int SIZE_UNIT_TYPE_OBJECT = 49;


	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.AbstractCommunication <em>Abstract Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AbstractCommunication
	 * @generated
	 */
	EClass getAbstractCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.AbstractCommunication#getConnectionSet <em>Connection Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AbstractCommunication#getConnectionSet()
	 * @see #getAbstractCommunication()
	 * @generated
	 */
	EReference getAbstractCommunication_ConnectionSet();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AbstractCommunication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AbstractCommunication#getName()
	 * @see #getAbstractCommunication()
	 * @generated
	 */
	EAttribute getAbstractCommunication_Name();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance <em>Abstract Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Performance</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AbstractPerformance
	 * @generated
	 */
	EClass getAbstractPerformance();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getBest <em>Best</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AbstractPerformance#getBest()
	 * @see #getAbstractPerformance()
	 * @generated
	 */
	EAttribute getAbstractPerformance_Best();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getTypical <em>Typical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typical</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AbstractPerformance#getTypical()
	 * @see #getAbstractPerformance()
	 * @generated
	 */
	EAttribute getAbstractPerformance_Typical();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getWorst <em>Worst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AbstractPerformance#getWorst()
	 * @see #getAbstractPerformance()
	 * @generated
	 */
	EAttribute getAbstractPerformance_Worst();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.Accessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accessor</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Accessor
	 * @generated
	 */
	EClass getAccessor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.Accessor#getPerformanceSet <em>Performance Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Accessor#getPerformanceSet()
	 * @see #getAccessor()
	 * @generated
	 */
	EReference getAccessor_PerformanceSet();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim10.model.shim10.Accessor#getMasterComponentRef <em>Master Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master Component Ref</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Accessor#getMasterComponentRef()
	 * @see #getAccessor()
	 * @generated
	 */
	EReference getAccessor_MasterComponentRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AccessType
	 * @generated
	 */
	EClass getAccessType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AccessType#getAccessByteSize <em>Access Byte Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Byte Size</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AccessType#getAccessByteSize()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_AccessByteSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AccessType#getAlignmentByteSize <em>Alignment Byte Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment Byte Size</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AccessType#getAlignmentByteSize()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_AlignmentByteSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AccessType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AccessType#getId()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AccessType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AccessType#getName()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AccessType#getNBurst <em>NBurst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NBurst</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AccessType#getNBurst()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_NBurst();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AccessType#getRwType <em>Rw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rw Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AccessType#getRwType()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_RwType();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.AccessTypeSet <em>Access Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Type Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AccessTypeSet
	 * @generated
	 */
	EClass getAccessTypeSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.AccessTypeSet#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AccessTypeSet#getAccessType()
	 * @see #getAccessTypeSet()
	 * @generated
	 */
	EReference getAccessTypeSet_AccessType();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.AddressSpace <em>Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Space</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AddressSpace
	 * @generated
	 */
	EClass getAddressSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.AddressSpace#getSubSpace <em>Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Space</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AddressSpace#getSubSpace()
	 * @see #getAddressSpace()
	 * @generated
	 */
	EReference getAddressSpace_SubSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AddressSpace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AddressSpace#getId()
	 * @see #getAddressSpace()
	 * @generated
	 */
	EAttribute getAddressSpace_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.AddressSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AddressSpace#getName()
	 * @see #getAddressSpace()
	 * @generated
	 */
	EAttribute getAddressSpace_Name();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.AddressSpaceSet <em>Address Space Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Space Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AddressSpaceSet
	 * @generated
	 */
	EClass getAddressSpaceSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.AddressSpaceSet#getAddressSpace <em>Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Space</em>'.
	 * @see org.multicore_association.shim10.model.shim10.AddressSpaceSet#getAddressSpace()
	 * @see #getAddressSpaceSet()
	 * @generated
	 */
	EReference getAddressSpaceSet_AddressSpace();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Cache#getCacheCoherency <em>Cache Coherency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Coherency</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getCacheCoherency()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_CacheCoherency();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Cache#getCacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getCacheType()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_CacheType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Cache#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getId()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Cache#getLineSize <em>Line Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Size</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getLineSize()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_LineSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Cache#getLockDownType <em>Lock Down Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Down Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getLockDownType()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_LockDownType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Cache#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getName()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Cache#getNWay <em>NWay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NWay</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getNWay()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_NWay();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Cache#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getSize()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Cache#getSizeUnit <em>Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Unit</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getSizeUnit()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_SizeUnit();

	/**
	 * Returns the meta object for the reference list '{@link org.multicore_association.shim10.model.shim10.Cache#getCacheRef <em>Cache Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cache Ref</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Cache#getCacheRef()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_CacheRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.ClockFrequency <em>Clock Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Frequency</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ClockFrequency
	 * @generated
	 */
	EClass getClockFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.ClockFrequency#getClockValue <em>Clock Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Value</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ClockFrequency#getClockValue()
	 * @see #getClockFrequency()
	 * @generated
	 */
	EAttribute getClockFrequency_ClockValue();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.CommonInstructionSet <em>Common Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Instruction Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CommonInstructionSet
	 * @generated
	 */
	EClass getCommonInstructionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.CommonInstructionSet#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CommonInstructionSet#getInstruction()
	 * @see #getCommonInstructionSet()
	 * @generated
	 */
	EReference getCommonInstructionSet_Instruction();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.CommonInstructionSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CommonInstructionSet#getName()
	 * @see #getCommonInstructionSet()
	 * @generated
	 */
	EAttribute getCommonInstructionSet_Name();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.CommunicationSet <em>Communication Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CommunicationSet
	 * @generated
	 */
	EClass getCommunicationSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getSharedRegisterCommunication <em>Shared Register Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Register Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CommunicationSet#getSharedRegisterCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_SharedRegisterCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getSharedMemoryCommunication <em>Shared Memory Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Memory Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CommunicationSet#getSharedMemoryCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_SharedMemoryCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getEventCommunication <em>Event Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CommunicationSet#getEventCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_EventCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getFIFOCommunication <em>FIFO Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FIFO Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CommunicationSet#getFIFOCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_FIFOCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getInterruptCommunication <em>Interrupt Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interrupt Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CommunicationSet#getInterruptCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_InterruptCommunication();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.ComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ComponentSet
	 * @generated
	 */
	EClass getComponentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.ComponentSet#getComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ComponentSet#getComponentSet()
	 * @see #getComponentSet()
	 * @generated
	 */
	EReference getComponentSet_ComponentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.ComponentSet#getSlaveComponent <em>Slave Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slave Component</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ComponentSet#getSlaveComponent()
	 * @see #getComponentSet()
	 * @generated
	 */
	EReference getComponentSet_SlaveComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.ComponentSet#getMasterComponent <em>Master Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Master Component</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ComponentSet#getMasterComponent()
	 * @see #getComponentSet()
	 * @generated
	 */
	EReference getComponentSet_MasterComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.ComponentSet#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cache</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ComponentSet#getCache()
	 * @see #getComponentSet()
	 * @generated
	 */
	EReference getComponentSet_Cache();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.ComponentSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ComponentSet#getName()
	 * @see #getComponentSet()
	 * @generated
	 */
	EAttribute getComponentSet_Name();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.Connection#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Connection#getPerformance()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Performance();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim10.model.shim10.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Connection#getTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_To();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim10.model.shim10.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Connection#getFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_From();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.ConnectionSet <em>Connection Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ConnectionSet
	 * @generated
	 */
	EClass getConnectionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.ConnectionSet#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see org.multicore_association.shim10.model.shim10.ConnectionSet#getConnection()
	 * @see #getConnectionSet()
	 * @generated
	 */
	EReference getConnectionSet_Connection();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAbstractCommunication <em>Abstract Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getAbstractCommunication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAbstractPerformance <em>Abstract Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Performance</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getAbstractPerformance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractPerformance();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Accessor</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Accessor();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AccessType();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessTypeSet <em>Access Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Type Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessTypeSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AccessTypeSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAddressSpace <em>Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Space</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getAddressSpace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddressSpace();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAddressSpaceSet <em>Address Space Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Space Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getAddressSpaceSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AddressSpaceSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getCache()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cache();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getClockFrequency <em>Clock Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clock Frequency</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getClockFrequency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClockFrequency();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getCommonInstructionSet <em>Common Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Common Instruction Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getCommonInstructionSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CommonInstructionSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getCommunicationSet <em>Communication Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getCommunicationSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CommunicationSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getComponentSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComponentSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getConnection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Connection();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getConnectionSet <em>Connection Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getConnectionSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ConnectionSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getEventCommunication <em>Event Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getEventCommunication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EventCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getFIFOCommunication <em>FIFO Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FIFO Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getFIFOCommunication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FIFOCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instruction</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getInstruction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Instruction();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getInterruptCommunication <em>Interrupt Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interrupt Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getInterruptCommunication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InterruptCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getLatency()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Latency();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterComponent <em>Master Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Component</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MasterComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterSlaveBinding <em>Master Slave Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Slave Binding</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterSlaveBinding()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MasterSlaveBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Slave Binding Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterSlaveBindingSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MasterSlaveBindingSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMemoryConsistencyModel <em>Memory Consistency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory Consistency Model</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getMemoryConsistencyModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MemoryConsistencyModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getPerformance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Performance();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getPerformanceSet <em>Performance Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getPerformanceSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PerformanceSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pitch</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getPitch()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pitch();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSharedMemoryCommunication <em>Shared Memory Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shared Memory Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getSharedMemoryCommunication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SharedMemoryCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSharedRegisterCommunication <em>Shared Register Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shared Register Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getSharedRegisterCommunication()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SharedRegisterCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSlaveComponent <em>Slave Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slave Component</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getSlaveComponent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SlaveComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSubSpace <em>Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Space</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getSubSpace()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SubSpace();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSystemConfiguration <em>System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Configuration</em>'.
	 * @see org.multicore_association.shim10.model.shim10.DocumentRoot#getSystemConfiguration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SystemConfiguration();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.EventCommunication <em>Event Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.EventCommunication
	 * @generated
	 */
	EClass getEventCommunication();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication <em>FIFO Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FIFO Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.FIFOCommunication
	 * @generated
	 */
	EClass getFIFOCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSize()
	 * @see #getFIFOCommunication()
	 * @generated
	 */
	EAttribute getFIFOCommunication_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size Unit</em>'.
	 * @see org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSizeUnit()
	 * @see #getFIFOCommunication()
	 * @generated
	 */
	EAttribute getFIFOCommunication_DataSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getQueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Size</em>'.
	 * @see org.multicore_association.shim10.model.shim10.FIFOCommunication#getQueueSize()
	 * @see #getFIFOCommunication()
	 * @generated
	 */
	EAttribute getFIFOCommunication_QueueSize();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.Instruction#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Instruction#getPerformance()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Performance();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.Instruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Instruction#getName()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Name();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.InterruptCommunication <em>Interrupt Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.InterruptCommunication
	 * @generated
	 */
	EClass getInterruptCommunication();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Latency
	 * @generated
	 */
	EClass getLatency();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.MasterComponent <em>Master Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Component</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent
	 * @generated
	 */
	EClass getMasterComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getCommonInstructionSet <em>Common Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Common Instruction Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getCommonInstructionSet()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EReference getMasterComponent_CommonInstructionSet();

	/**
	 * Returns the meta object for the reference list '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cache</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getCache()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EReference getMasterComponent_Cache();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getClockFrequency <em>Clock Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clock Frequency</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getClockFrequency()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EReference getMasterComponent_ClockFrequency();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getAccessTypeSet <em>Access Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Type Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getAccessTypeSet()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EReference getMasterComponent_AccessTypeSet();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getArch <em>Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getArch()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_Arch();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getArchOption <em>Arch Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch Option</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getArchOption()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_ArchOption();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getEndian <em>Endian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endian</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getEndian()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_Endian();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getId()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getMasterType <em>Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getMasterType()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_MasterType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getName()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getNThread <em>NThread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NThread</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getNThread()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_NThread();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getPid <em>Pid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pid</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterComponent#getPid()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_Pid();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.MasterSlaveBinding <em>Master Slave Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Slave Binding</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterSlaveBinding
	 * @generated
	 */
	EClass getMasterSlaveBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.MasterSlaveBinding#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accessor</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterSlaveBinding#getAccessor()
	 * @see #getMasterSlaveBinding()
	 * @generated
	 */
	EReference getMasterSlaveBinding_Accessor();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim10.model.shim10.MasterSlaveBinding#getSlaveComponentRef <em>Slave Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slave Component Ref</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterSlaveBinding#getSlaveComponentRef()
	 * @see #getMasterSlaveBinding()
	 * @generated
	 */
	EReference getMasterSlaveBinding_SlaveComponentRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet <em>Master Slave Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Slave Binding Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet
	 * @generated
	 */
	EClass getMasterSlaveBindingSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet#getMasterSlaveBinding <em>Master Slave Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Master Slave Binding</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet#getMasterSlaveBinding()
	 * @see #getMasterSlaveBindingSet()
	 * @generated
	 */
	EReference getMasterSlaveBindingSet_MasterSlaveBinding();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel <em>Memory Consistency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Consistency Model</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MemoryConsistencyModel
	 * @generated
	 */
	EClass getMemoryConsistencyModel();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRarOrdering <em>Rar Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rar Ordering</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRarOrdering()
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 */
	EAttribute getMemoryConsistencyModel_RarOrdering();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRawOrdering <em>Raw Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Ordering</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRawOrdering()
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 */
	EAttribute getMemoryConsistencyModel_RawOrdering();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWarOrdering <em>War Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>War Ordering</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWarOrdering()
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 */
	EAttribute getMemoryConsistencyModel_WarOrdering();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWawOrdering <em>Waw Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waw Ordering</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWawOrdering()
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 */
	EAttribute getMemoryConsistencyModel_WawOrdering();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Performance
	 * @generated
	 */
	EClass getPerformance();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.Performance#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pitch</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Performance#getPitch()
	 * @see #getPerformance()
	 * @generated
	 */
	EReference getPerformance_Pitch();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.Performance#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Performance#getLatency()
	 * @see #getPerformance()
	 * @generated
	 */
	EReference getPerformance_Latency();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim10.model.shim10.Performance#getAccessTypeRef <em>Access Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Type Ref</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Performance#getAccessTypeRef()
	 * @see #getPerformance()
	 * @generated
	 */
	EReference getPerformance_AccessTypeRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.PerformanceSet <em>Performance Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.PerformanceSet
	 * @generated
	 */
	EClass getPerformanceSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.PerformanceSet#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance</em>'.
	 * @see org.multicore_association.shim10.model.shim10.PerformanceSet#getPerformance()
	 * @see #getPerformanceSet()
	 * @generated
	 */
	EReference getPerformanceSet_Performance();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.Pitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pitch</em>'.
	 * @see org.multicore_association.shim10.model.shim10.Pitch
	 * @generated
	 */
	EClass getPitch();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.SharedMemoryCommunication <em>Shared Memory Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Memory Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedMemoryCommunication
	 * @generated
	 */
	EClass getSharedMemoryCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getDataSize()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EAttribute getSharedMemoryCommunication_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getDataSizeUnit <em>Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size Unit</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getDataSizeUnit()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EAttribute getSharedMemoryCommunication_DataSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getOperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getOperationType()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EAttribute getSharedMemoryCommunication_OperationType();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getAddressSpaceRef <em>Address Space Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address Space Ref</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getAddressSpaceRef()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EReference getSharedMemoryCommunication_AddressSpaceRef();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getSubSpaceRef <em>Sub Space Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Space Ref</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedMemoryCommunication#getSubSpaceRef()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EReference getSharedMemoryCommunication_SubSpaceRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication <em>Shared Register Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Register Communication</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedRegisterCommunication
	 * @generated
	 */
	EClass getSharedRegisterCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSize()
	 * @see #getSharedRegisterCommunication()
	 * @generated
	 */
	EAttribute getSharedRegisterCommunication_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSizeUnit <em>Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size Unit</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSizeUnit()
	 * @see #getSharedRegisterCommunication()
	 * @generated
	 */
	EAttribute getSharedRegisterCommunication_DataSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getNRegister <em>NRegister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NRegister</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getNRegister()
	 * @see #getSharedRegisterCommunication()
	 * @generated
	 */
	EAttribute getSharedRegisterCommunication_NRegister();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.SlaveComponent <em>Slave Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slave Component</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SlaveComponent
	 * @generated
	 */
	EClass getSlaveComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SlaveComponent#getId()
	 * @see #getSlaveComponent()
	 * @generated
	 */
	EAttribute getSlaveComponent_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SlaveComponent#getName()
	 * @see #getSlaveComponent()
	 * @generated
	 */
	EAttribute getSlaveComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getRwType <em>Rw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rw Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SlaveComponent#getRwType()
	 * @see #getSlaveComponent()
	 * @generated
	 */
	EAttribute getSlaveComponent_RwType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SlaveComponent#getSize()
	 * @see #getSlaveComponent()
	 * @generated
	 */
	EAttribute getSlaveComponent_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSizeUnit <em>Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Unit</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SlaveComponent#getSizeUnit()
	 * @see #getSlaveComponent()
	 * @generated
	 */
	EAttribute getSlaveComponent_SizeUnit();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.SubSpace <em>Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Space</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SubSpace
	 * @generated
	 */
	EClass getSubSpace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim10.model.shim10.SubSpace#getMemoryConsistencyModel <em>Memory Consistency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Consistency Model</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SubSpace#getMemoryConsistencyModel()
	 * @see #getSubSpace()
	 * @generated
	 */
	EReference getSubSpace_MemoryConsistencyModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.SubSpace#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Slave Binding Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SubSpace#getMasterSlaveBindingSet()
	 * @see #getSubSpace()
	 * @generated
	 */
	EReference getSubSpace_MasterSlaveBindingSet();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SubSpace#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SubSpace#getEnd()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_End();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SubSpace#getEndian <em>Endian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endian</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SubSpace#getEndian()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_Endian();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SubSpace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SubSpace#getId()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SubSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SubSpace#getName()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SubSpace#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SubSpace#getStart()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_Start();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration <em>System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Configuration</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SystemConfiguration
	 * @generated
	 */
	EClass getSystemConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SystemConfiguration#getComponentSet()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_ComponentSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getCommunicationSet <em>Communication Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SystemConfiguration#getCommunicationSet()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_CommunicationSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getAddressSpaceSet <em>Address Space Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Space Set</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SystemConfiguration#getAddressSpaceSet()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_AddressSpaceSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getClockFrequency <em>Clock Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clock Frequency</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SystemConfiguration#getClockFrequency()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_ClockFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SystemConfiguration#getName()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EAttribute getSystemConfiguration_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getShimVersion <em>Shim Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shim Version</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SystemConfiguration#getShimVersion()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EAttribute getSystemConfiguration_ShimVersion();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim10.model.shim10.CacheCoherencyType <em>Cache Coherency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Coherency Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CacheCoherencyType
	 * @generated
	 */
	EEnum getCacheCoherencyType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim10.model.shim10.CacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CacheType
	 * @generated
	 */
	EEnum getCacheType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim10.model.shim10.EndianType <em>Endian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endian Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.EndianType
	 * @generated
	 */
	EEnum getEndianType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim10.model.shim10.LockDownType <em>Lock Down Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lock Down Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.LockDownType
	 * @generated
	 */
	EEnum getLockDownType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim10.model.shim10.MasterType <em>Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Master Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterType
	 * @generated
	 */
	EEnum getMasterType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim10.model.shim10.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim10.model.shim10.OrderingType <em>Ordering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ordering Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @generated
	 */
	EEnum getOrderingType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim10.model.shim10.RWType <em>RW Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RW Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.RWType
	 * @generated
	 */
	EEnum getRWType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim10.model.shim10.SizeUnitType <em>Size Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Unit Type</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @generated
	 */
	EEnum getSizeUnitType();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim10.model.shim10.CacheCoherencyType <em>Cache Coherency Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cache Coherency Type Object</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CacheCoherencyType
	 * @model instanceClass="Shim.CacheCoherencyType"
	 *        extendedMetaData="name='CacheCoherencyType:Object' baseType='CacheCoherencyType'"
	 * @generated
	 */
	EDataType getCacheCoherencyTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim10.model.shim10.CacheType <em>Cache Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cache Type Object</em>'.
	 * @see org.multicore_association.shim10.model.shim10.CacheType
	 * @model instanceClass="Shim.CacheType"
	 *        extendedMetaData="name='CacheType:Object' baseType='CacheType'"
	 * @generated
	 */
	EDataType getCacheTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim10.model.shim10.EndianType <em>Endian Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Endian Type Object</em>'.
	 * @see org.multicore_association.shim10.model.shim10.EndianType
	 * @model instanceClass="Shim.EndianType"
	 *        extendedMetaData="name='EndianType:Object' baseType='EndianType'"
	 * @generated
	 */
	EDataType getEndianTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim10.model.shim10.LockDownType <em>Lock Down Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lock Down Type Object</em>'.
	 * @see org.multicore_association.shim10.model.shim10.LockDownType
	 * @model instanceClass="Shim.LockDownType"
	 *        extendedMetaData="name='LockDownType:Object' baseType='LockDownType'"
	 * @generated
	 */
	EDataType getLockDownTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim10.model.shim10.MasterType <em>Master Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Master Type Object</em>'.
	 * @see org.multicore_association.shim10.model.shim10.MasterType
	 * @model instanceClass="Shim.MasterType"
	 *        extendedMetaData="name='MasterType:Object' baseType='MasterType'"
	 * @generated
	 */
	EDataType getMasterTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim10.model.shim10.OperationType <em>Operation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation Type Object</em>'.
	 * @see org.multicore_association.shim10.model.shim10.OperationType
	 * @model instanceClass="Shim.OperationType"
	 *        extendedMetaData="name='OperationType:Object' baseType='OperationType'"
	 * @generated
	 */
	EDataType getOperationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim10.model.shim10.OrderingType <em>Ordering Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ordering Type Object</em>'.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @model instanceClass="Shim.OrderingType"
	 *        extendedMetaData="name='OrderingType:Object' baseType='OrderingType'"
	 * @generated
	 */
	EDataType getOrderingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim10.model.shim10.RWType <em>RW Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RW Type Object</em>'.
	 * @see org.multicore_association.shim10.model.shim10.RWType
	 * @model instanceClass="Shim.RWType"
	 *        extendedMetaData="name='RWType:Object' baseType='RWType'"
	 * @generated
	 */
	EDataType getRWTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim10.model.shim10.SizeUnitType <em>Size Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Size Unit Type Object</em>'.
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @model instanceClass="Shim.SizeUnitType"
	 *        extendedMetaData="name='SizeUnitType:Object' baseType='SizeUnitType'"
	 * @generated
	 */
	EDataType getSizeUnitTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShimFactory getShimFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.AbstractCommunicationImpl <em>Abstract Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.AbstractCommunicationImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAbstractCommunication()
		 * @generated
		 */
		EClass ABSTRACT_COMMUNICATION = eINSTANCE.getAbstractCommunication();

		/**
		 * The meta object literal for the '<em><b>Connection Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMMUNICATION__CONNECTION_SET = eINSTANCE.getAbstractCommunication_ConnectionSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMMUNICATION__NAME = eINSTANCE.getAbstractCommunication_Name();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.AbstractPerformanceImpl <em>Abstract Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.AbstractPerformanceImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAbstractPerformance()
		 * @generated
		 */
		EClass ABSTRACT_PERFORMANCE = eINSTANCE.getAbstractPerformance();

		/**
		 * The meta object literal for the '<em><b>Best</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PERFORMANCE__BEST = eINSTANCE.getAbstractPerformance_Best();

		/**
		 * The meta object literal for the '<em><b>Typical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PERFORMANCE__TYPICAL = eINSTANCE.getAbstractPerformance_Typical();

		/**
		 * The meta object literal for the '<em><b>Worst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PERFORMANCE__WORST = eINSTANCE.getAbstractPerformance_Worst();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.AccessorImpl <em>Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.AccessorImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAccessor()
		 * @generated
		 */
		EClass ACCESSOR = eINSTANCE.getAccessor();

		/**
		 * The meta object literal for the '<em><b>Performance Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSOR__PERFORMANCE_SET = eINSTANCE.getAccessor_PerformanceSet();

		/**
		 * The meta object literal for the '<em><b>Master Component Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSOR__MASTER_COMPONENT_REF = eINSTANCE.getAccessor_MasterComponentRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.AccessTypeImpl <em>Access Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.AccessTypeImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAccessType()
		 * @generated
		 */
		EClass ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '<em><b>Access Byte Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__ACCESS_BYTE_SIZE = eINSTANCE.getAccessType_AccessByteSize();

		/**
		 * The meta object literal for the '<em><b>Alignment Byte Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__ALIGNMENT_BYTE_SIZE = eINSTANCE.getAccessType_AlignmentByteSize();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__ID = eINSTANCE.getAccessType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__NAME = eINSTANCE.getAccessType_Name();

		/**
		 * The meta object literal for the '<em><b>NBurst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__NBURST = eINSTANCE.getAccessType_NBurst();

		/**
		 * The meta object literal for the '<em><b>Rw Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__RW_TYPE = eINSTANCE.getAccessType_RwType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.AccessTypeSetImpl <em>Access Type Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.AccessTypeSetImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAccessTypeSet()
		 * @generated
		 */
		EClass ACCESS_TYPE_SET = eINSTANCE.getAccessTypeSet();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_TYPE_SET__ACCESS_TYPE = eINSTANCE.getAccessTypeSet_AccessType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.AddressSpaceImpl <em>Address Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.AddressSpaceImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAddressSpace()
		 * @generated
		 */
		EClass ADDRESS_SPACE = eINSTANCE.getAddressSpace();

		/**
		 * The meta object literal for the '<em><b>Sub Space</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_SPACE__SUB_SPACE = eINSTANCE.getAddressSpace_SubSpace();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE__ID = eINSTANCE.getAddressSpace_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE__NAME = eINSTANCE.getAddressSpace_Name();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.AddressSpaceSetImpl <em>Address Space Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.AddressSpaceSetImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getAddressSpaceSet()
		 * @generated
		 */
		EClass ADDRESS_SPACE_SET = eINSTANCE.getAddressSpaceSet();

		/**
		 * The meta object literal for the '<em><b>Address Space</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_SPACE_SET__ADDRESS_SPACE = eINSTANCE.getAddressSpaceSet_AddressSpace();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.CacheImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Cache Coherency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__CACHE_COHERENCY = eINSTANCE.getCache_CacheCoherency();

		/**
		 * The meta object literal for the '<em><b>Cache Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__CACHE_TYPE = eINSTANCE.getCache_CacheType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__ID = eINSTANCE.getCache_Id();

		/**
		 * The meta object literal for the '<em><b>Line Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__LINE_SIZE = eINSTANCE.getCache_LineSize();

		/**
		 * The meta object literal for the '<em><b>Lock Down Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__LOCK_DOWN_TYPE = eINSTANCE.getCache_LockDownType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__NAME = eINSTANCE.getCache_Name();

		/**
		 * The meta object literal for the '<em><b>NWay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__NWAY = eINSTANCE.getCache_NWay();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__SIZE = eINSTANCE.getCache_Size();

		/**
		 * The meta object literal for the '<em><b>Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__SIZE_UNIT = eINSTANCE.getCache_SizeUnit();

		/**
		 * The meta object literal for the '<em><b>Cache Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__CACHE_REF = eINSTANCE.getCache_CacheRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.ClockFrequencyImpl <em>Clock Frequency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.ClockFrequencyImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getClockFrequency()
		 * @generated
		 */
		EClass CLOCK_FREQUENCY = eINSTANCE.getClockFrequency();

		/**
		 * The meta object literal for the '<em><b>Clock Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOCK_FREQUENCY__CLOCK_VALUE = eINSTANCE.getClockFrequency_ClockValue();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.CommonInstructionSetImpl <em>Common Instruction Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.CommonInstructionSetImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCommonInstructionSet()
		 * @generated
		 */
		EClass COMMON_INSTRUCTION_SET = eINSTANCE.getCommonInstructionSet();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_INSTRUCTION_SET__INSTRUCTION = eINSTANCE.getCommonInstructionSet_Instruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_INSTRUCTION_SET__NAME = eINSTANCE.getCommonInstructionSet_Name();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.CommunicationSetImpl <em>Communication Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.CommunicationSetImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCommunicationSet()
		 * @generated
		 */
		EClass COMMUNICATION_SET = eINSTANCE.getCommunicationSet();

		/**
		 * The meta object literal for the '<em><b>Shared Register Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION = eINSTANCE.getCommunicationSet_SharedRegisterCommunication();

		/**
		 * The meta object literal for the '<em><b>Shared Memory Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION = eINSTANCE.getCommunicationSet_SharedMemoryCommunication();

		/**
		 * The meta object literal for the '<em><b>Event Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET__EVENT_COMMUNICATION = eINSTANCE.getCommunicationSet_EventCommunication();

		/**
		 * The meta object literal for the '<em><b>FIFO Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET__FIFO_COMMUNICATION = eINSTANCE.getCommunicationSet_FIFOCommunication();

		/**
		 * The meta object literal for the '<em><b>Interrupt Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET__INTERRUPT_COMMUNICATION = eINSTANCE.getCommunicationSet_InterruptCommunication();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.ComponentSetImpl <em>Component Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.ComponentSetImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getComponentSet()
		 * @generated
		 */
		EClass COMPONENT_SET = eINSTANCE.getComponentSet();

		/**
		 * The meta object literal for the '<em><b>Component Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SET__COMPONENT_SET = eINSTANCE.getComponentSet_ComponentSet();

		/**
		 * The meta object literal for the '<em><b>Slave Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SET__SLAVE_COMPONENT = eINSTANCE.getComponentSet_SlaveComponent();

		/**
		 * The meta object literal for the '<em><b>Master Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SET__MASTER_COMPONENT = eINSTANCE.getComponentSet_MasterComponent();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SET__CACHE = eINSTANCE.getComponentSet_Cache();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_SET__NAME = eINSTANCE.getComponentSet_Name();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.ConnectionImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PERFORMANCE = eINSTANCE.getConnection_Performance();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO = eINSTANCE.getConnection_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM = eINSTANCE.getConnection_From();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.ConnectionSetImpl <em>Connection Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.ConnectionSetImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getConnectionSet()
		 * @generated
		 */
		EClass CONNECTION_SET = eINSTANCE.getConnectionSet();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_SET__CONNECTION = eINSTANCE.getConnectionSet_Connection();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Abstract Communication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_COMMUNICATION = eINSTANCE.getDocumentRoot_AbstractCommunication();

		/**
		 * The meta object literal for the '<em><b>Abstract Performance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_PERFORMANCE = eINSTANCE.getDocumentRoot_AbstractPerformance();

		/**
		 * The meta object literal for the '<em><b>Accessor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACCESSOR = eINSTANCE.getDocumentRoot_Accessor();

		/**
		 * The meta object literal for the '<em><b>Access Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACCESS_TYPE = eINSTANCE.getDocumentRoot_AccessType();

		/**
		 * The meta object literal for the '<em><b>Access Type Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACCESS_TYPE_SET = eINSTANCE.getDocumentRoot_AccessTypeSet();

		/**
		 * The meta object literal for the '<em><b>Address Space</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDRESS_SPACE = eINSTANCE.getDocumentRoot_AddressSpace();

		/**
		 * The meta object literal for the '<em><b>Address Space Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDRESS_SPACE_SET = eINSTANCE.getDocumentRoot_AddressSpaceSet();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CACHE = eINSTANCE.getDocumentRoot_Cache();

		/**
		 * The meta object literal for the '<em><b>Clock Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLOCK_FREQUENCY = eINSTANCE.getDocumentRoot_ClockFrequency();

		/**
		 * The meta object literal for the '<em><b>Common Instruction Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMMON_INSTRUCTION_SET = eINSTANCE.getDocumentRoot_CommonInstructionSet();

		/**
		 * The meta object literal for the '<em><b>Communication Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMMUNICATION_SET = eINSTANCE.getDocumentRoot_CommunicationSet();

		/**
		 * The meta object literal for the '<em><b>Component Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPONENT_SET = eINSTANCE.getDocumentRoot_ComponentSet();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONNECTION = eINSTANCE.getDocumentRoot_Connection();

		/**
		 * The meta object literal for the '<em><b>Connection Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONNECTION_SET = eINSTANCE.getDocumentRoot_ConnectionSet();

		/**
		 * The meta object literal for the '<em><b>Event Communication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EVENT_COMMUNICATION = eINSTANCE.getDocumentRoot_EventCommunication();

		/**
		 * The meta object literal for the '<em><b>FIFO Communication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FIFO_COMMUNICATION = eINSTANCE.getDocumentRoot_FIFOCommunication();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INSTRUCTION = eINSTANCE.getDocumentRoot_Instruction();

		/**
		 * The meta object literal for the '<em><b>Interrupt Communication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERRUPT_COMMUNICATION = eINSTANCE.getDocumentRoot_InterruptCommunication();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LATENCY = eINSTANCE.getDocumentRoot_Latency();

		/**
		 * The meta object literal for the '<em><b>Master Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MASTER_COMPONENT = eINSTANCE.getDocumentRoot_MasterComponent();

		/**
		 * The meta object literal for the '<em><b>Master Slave Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MASTER_SLAVE_BINDING = eINSTANCE.getDocumentRoot_MasterSlaveBinding();

		/**
		 * The meta object literal for the '<em><b>Master Slave Binding Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET = eINSTANCE.getDocumentRoot_MasterSlaveBindingSet();

		/**
		 * The meta object literal for the '<em><b>Memory Consistency Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL = eINSTANCE.getDocumentRoot_MemoryConsistencyModel();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERFORMANCE = eINSTANCE.getDocumentRoot_Performance();

		/**
		 * The meta object literal for the '<em><b>Performance Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERFORMANCE_SET = eINSTANCE.getDocumentRoot_PerformanceSet();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PITCH = eINSTANCE.getDocumentRoot_Pitch();

		/**
		 * The meta object literal for the '<em><b>Shared Memory Communication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION = eINSTANCE.getDocumentRoot_SharedMemoryCommunication();

		/**
		 * The meta object literal for the '<em><b>Shared Register Communication</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION = eINSTANCE.getDocumentRoot_SharedRegisterCommunication();

		/**
		 * The meta object literal for the '<em><b>Slave Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SLAVE_COMPONENT = eINSTANCE.getDocumentRoot_SlaveComponent();

		/**
		 * The meta object literal for the '<em><b>Sub Space</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUB_SPACE = eINSTANCE.getDocumentRoot_SubSpace();

		/**
		 * The meta object literal for the '<em><b>System Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SYSTEM_CONFIGURATION = eINSTANCE.getDocumentRoot_SystemConfiguration();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.EventCommunicationImpl <em>Event Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.EventCommunicationImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getEventCommunication()
		 * @generated
		 */
		EClass EVENT_COMMUNICATION = eINSTANCE.getEventCommunication();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.FIFOCommunicationImpl <em>FIFO Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.FIFOCommunicationImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getFIFOCommunication()
		 * @generated
		 */
		EClass FIFO_COMMUNICATION = eINSTANCE.getFIFOCommunication();

		/**
		 * The meta object literal for the '<em><b>Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIFO_COMMUNICATION__DATA_SIZE = eINSTANCE.getFIFOCommunication_DataSize();

		/**
		 * The meta object literal for the '<em><b>Data Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIFO_COMMUNICATION__DATA_SIZE_UNIT = eINSTANCE.getFIFOCommunication_DataSizeUnit();

		/**
		 * The meta object literal for the '<em><b>Queue Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIFO_COMMUNICATION__QUEUE_SIZE = eINSTANCE.getFIFOCommunication_QueueSize();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.InstructionImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__PERFORMANCE = eINSTANCE.getInstruction_Performance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__NAME = eINSTANCE.getInstruction_Name();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.InterruptCommunicationImpl <em>Interrupt Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.InterruptCommunicationImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getInterruptCommunication()
		 * @generated
		 */
		EClass INTERRUPT_COMMUNICATION = eINSTANCE.getInterruptCommunication();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.LatencyImpl <em>Latency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.LatencyImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getLatency()
		 * @generated
		 */
		EClass LATENCY = eINSTANCE.getLatency();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.MasterComponentImpl <em>Master Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.MasterComponentImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterComponent()
		 * @generated
		 */
		EClass MASTER_COMPONENT = eINSTANCE.getMasterComponent();

		/**
		 * The meta object literal for the '<em><b>Common Instruction Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_COMPONENT__COMMON_INSTRUCTION_SET = eINSTANCE.getMasterComponent_CommonInstructionSet();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_COMPONENT__CACHE = eINSTANCE.getMasterComponent_Cache();

		/**
		 * The meta object literal for the '<em><b>Clock Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_COMPONENT__CLOCK_FREQUENCY = eINSTANCE.getMasterComponent_ClockFrequency();

		/**
		 * The meta object literal for the '<em><b>Access Type Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_COMPONENT__ACCESS_TYPE_SET = eINSTANCE.getMasterComponent_AccessTypeSet();

		/**
		 * The meta object literal for the '<em><b>Arch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__ARCH = eINSTANCE.getMasterComponent_Arch();

		/**
		 * The meta object literal for the '<em><b>Arch Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__ARCH_OPTION = eINSTANCE.getMasterComponent_ArchOption();

		/**
		 * The meta object literal for the '<em><b>Endian</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__ENDIAN = eINSTANCE.getMasterComponent_Endian();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__ID = eINSTANCE.getMasterComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Master Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__MASTER_TYPE = eINSTANCE.getMasterComponent_MasterType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__NAME = eINSTANCE.getMasterComponent_Name();

		/**
		 * The meta object literal for the '<em><b>NThread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__NTHREAD = eINSTANCE.getMasterComponent_NThread();

		/**
		 * The meta object literal for the '<em><b>Pid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__PID = eINSTANCE.getMasterComponent_Pid();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.MasterSlaveBindingImpl <em>Master Slave Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.MasterSlaveBindingImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterSlaveBinding()
		 * @generated
		 */
		EClass MASTER_SLAVE_BINDING = eINSTANCE.getMasterSlaveBinding();

		/**
		 * The meta object literal for the '<em><b>Accessor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_SLAVE_BINDING__ACCESSOR = eINSTANCE.getMasterSlaveBinding_Accessor();

		/**
		 * The meta object literal for the '<em><b>Slave Component Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF = eINSTANCE.getMasterSlaveBinding_SlaveComponentRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.MasterSlaveBindingSetImpl <em>Master Slave Binding Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.MasterSlaveBindingSetImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterSlaveBindingSet()
		 * @generated
		 */
		EClass MASTER_SLAVE_BINDING_SET = eINSTANCE.getMasterSlaveBindingSet();

		/**
		 * The meta object literal for the '<em><b>Master Slave Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING = eINSTANCE.getMasterSlaveBindingSet_MasterSlaveBinding();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.MemoryConsistencyModelImpl <em>Memory Consistency Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.MemoryConsistencyModelImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMemoryConsistencyModel()
		 * @generated
		 */
		EClass MEMORY_CONSISTENCY_MODEL = eINSTANCE.getMemoryConsistencyModel();

		/**
		 * The meta object literal for the '<em><b>Rar Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_CONSISTENCY_MODEL__RAR_ORDERING = eINSTANCE.getMemoryConsistencyModel_RarOrdering();

		/**
		 * The meta object literal for the '<em><b>Raw Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_CONSISTENCY_MODEL__RAW_ORDERING = eINSTANCE.getMemoryConsistencyModel_RawOrdering();

		/**
		 * The meta object literal for the '<em><b>War Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_CONSISTENCY_MODEL__WAR_ORDERING = eINSTANCE.getMemoryConsistencyModel_WarOrdering();

		/**
		 * The meta object literal for the '<em><b>Waw Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_CONSISTENCY_MODEL__WAW_ORDERING = eINSTANCE.getMemoryConsistencyModel_WawOrdering();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.PerformanceImpl <em>Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.PerformanceImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getPerformance()
		 * @generated
		 */
		EClass PERFORMANCE = eINSTANCE.getPerformance();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE__PITCH = eINSTANCE.getPerformance_Pitch();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE__LATENCY = eINSTANCE.getPerformance_Latency();

		/**
		 * The meta object literal for the '<em><b>Access Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE__ACCESS_TYPE_REF = eINSTANCE.getPerformance_AccessTypeRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.PerformanceSetImpl <em>Performance Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.PerformanceSetImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getPerformanceSet()
		 * @generated
		 */
		EClass PERFORMANCE_SET = eINSTANCE.getPerformanceSet();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_SET__PERFORMANCE = eINSTANCE.getPerformanceSet_Performance();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.PitchImpl <em>Pitch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.PitchImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getPitch()
		 * @generated
		 */
		EClass PITCH = eINSTANCE.getPitch();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.SharedMemoryCommunicationImpl <em>Shared Memory Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.SharedMemoryCommunicationImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSharedMemoryCommunication()
		 * @generated
		 */
		EClass SHARED_MEMORY_COMMUNICATION = eINSTANCE.getSharedMemoryCommunication();

		/**
		 * The meta object literal for the '<em><b>Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_MEMORY_COMMUNICATION__DATA_SIZE = eINSTANCE.getSharedMemoryCommunication_DataSize();

		/**
		 * The meta object literal for the '<em><b>Data Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT = eINSTANCE.getSharedMemoryCommunication_DataSizeUnit();

		/**
		 * The meta object literal for the '<em><b>Operation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE = eINSTANCE.getSharedMemoryCommunication_OperationType();

		/**
		 * The meta object literal for the '<em><b>Address Space Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF = eINSTANCE.getSharedMemoryCommunication_AddressSpaceRef();

		/**
		 * The meta object literal for the '<em><b>Sub Space Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF = eINSTANCE.getSharedMemoryCommunication_SubSpaceRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.SharedRegisterCommunicationImpl <em>Shared Register Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.SharedRegisterCommunicationImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSharedRegisterCommunication()
		 * @generated
		 */
		EClass SHARED_REGISTER_COMMUNICATION = eINSTANCE.getSharedRegisterCommunication();

		/**
		 * The meta object literal for the '<em><b>Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_REGISTER_COMMUNICATION__DATA_SIZE = eINSTANCE.getSharedRegisterCommunication_DataSize();

		/**
		 * The meta object literal for the '<em><b>Data Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT = eINSTANCE.getSharedRegisterCommunication_DataSizeUnit();

		/**
		 * The meta object literal for the '<em><b>NRegister</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_REGISTER_COMMUNICATION__NREGISTER = eINSTANCE.getSharedRegisterCommunication_NRegister();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.SlaveComponentImpl <em>Slave Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.SlaveComponentImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSlaveComponent()
		 * @generated
		 */
		EClass SLAVE_COMPONENT = eINSTANCE.getSlaveComponent();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAVE_COMPONENT__ID = eINSTANCE.getSlaveComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAVE_COMPONENT__NAME = eINSTANCE.getSlaveComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Rw Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAVE_COMPONENT__RW_TYPE = eINSTANCE.getSlaveComponent_RwType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAVE_COMPONENT__SIZE = eINSTANCE.getSlaveComponent_Size();

		/**
		 * The meta object literal for the '<em><b>Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAVE_COMPONENT__SIZE_UNIT = eINSTANCE.getSlaveComponent_SizeUnit();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl <em>Sub Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSubSpace()
		 * @generated
		 */
		EClass SUB_SPACE = eINSTANCE.getSubSpace();

		/**
		 * The meta object literal for the '<em><b>Memory Consistency Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SPACE__MEMORY_CONSISTENCY_MODEL = eINSTANCE.getSubSpace_MemoryConsistencyModel();

		/**
		 * The meta object literal for the '<em><b>Master Slave Binding Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SPACE__MASTER_SLAVE_BINDING_SET = eINSTANCE.getSubSpace_MasterSlaveBindingSet();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SPACE__END = eINSTANCE.getSubSpace_End();

		/**
		 * The meta object literal for the '<em><b>Endian</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SPACE__ENDIAN = eINSTANCE.getSubSpace_Endian();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SPACE__ID = eINSTANCE.getSubSpace_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SPACE__NAME = eINSTANCE.getSubSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SPACE__START = eINSTANCE.getSubSpace_Start();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl <em>System Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSystemConfiguration()
		 * @generated
		 */
		EClass SYSTEM_CONFIGURATION = eINSTANCE.getSystemConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__COMPONENT_SET = eINSTANCE.getSystemConfiguration_ComponentSet();

		/**
		 * The meta object literal for the '<em><b>Communication Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__COMMUNICATION_SET = eINSTANCE.getSystemConfiguration_CommunicationSet();

		/**
		 * The meta object literal for the '<em><b>Address Space Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET = eINSTANCE.getSystemConfiguration_AddressSpaceSet();

		/**
		 * The meta object literal for the '<em><b>Clock Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__CLOCK_FREQUENCY = eINSTANCE.getSystemConfiguration_ClockFrequency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_CONFIGURATION__NAME = eINSTANCE.getSystemConfiguration_Name();

		/**
		 * The meta object literal for the '<em><b>Shim Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_CONFIGURATION__SHIM_VERSION = eINSTANCE.getSystemConfiguration_ShimVersion();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.CacheCoherencyType <em>Cache Coherency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.CacheCoherencyType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCacheCoherencyType()
		 * @generated
		 */
		EEnum CACHE_COHERENCY_TYPE = eINSTANCE.getCacheCoherencyType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.CacheType <em>Cache Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.CacheType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCacheType()
		 * @generated
		 */
		EEnum CACHE_TYPE = eINSTANCE.getCacheType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.EndianType <em>Endian Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.EndianType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getEndianType()
		 * @generated
		 */
		EEnum ENDIAN_TYPE = eINSTANCE.getEndianType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.LockDownType <em>Lock Down Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.LockDownType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getLockDownType()
		 * @generated
		 */
		EEnum LOCK_DOWN_TYPE = eINSTANCE.getLockDownType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.MasterType <em>Master Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.MasterType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterType()
		 * @generated
		 */
		EEnum MASTER_TYPE = eINSTANCE.getMasterType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.OperationType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.OrderingType <em>Ordering Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.OrderingType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getOrderingType()
		 * @generated
		 */
		EEnum ORDERING_TYPE = eINSTANCE.getOrderingType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.RWType <em>RW Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.RWType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getRWType()
		 * @generated
		 */
		EEnum RW_TYPE = eINSTANCE.getRWType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim10.model.shim10.SizeUnitType <em>Size Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSizeUnitType()
		 * @generated
		 */
		EEnum SIZE_UNIT_TYPE = eINSTANCE.getSizeUnitType();

		/**
		 * The meta object literal for the '<em>Cache Coherency Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.CacheCoherencyType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCacheCoherencyTypeObject()
		 * @generated
		 */
		EDataType CACHE_COHERENCY_TYPE_OBJECT = eINSTANCE.getCacheCoherencyTypeObject();

		/**
		 * The meta object literal for the '<em>Cache Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.CacheType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getCacheTypeObject()
		 * @generated
		 */
		EDataType CACHE_TYPE_OBJECT = eINSTANCE.getCacheTypeObject();

		/**
		 * The meta object literal for the '<em>Endian Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.EndianType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getEndianTypeObject()
		 * @generated
		 */
		EDataType ENDIAN_TYPE_OBJECT = eINSTANCE.getEndianTypeObject();

		/**
		 * The meta object literal for the '<em>Lock Down Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.LockDownType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getLockDownTypeObject()
		 * @generated
		 */
		EDataType LOCK_DOWN_TYPE_OBJECT = eINSTANCE.getLockDownTypeObject();

		/**
		 * The meta object literal for the '<em>Master Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.MasterType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getMasterTypeObject()
		 * @generated
		 */
		EDataType MASTER_TYPE_OBJECT = eINSTANCE.getMasterTypeObject();

		/**
		 * The meta object literal for the '<em>Operation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.OperationType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getOperationTypeObject()
		 * @generated
		 */
		EDataType OPERATION_TYPE_OBJECT = eINSTANCE.getOperationTypeObject();

		/**
		 * The meta object literal for the '<em>Ordering Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.OrderingType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getOrderingTypeObject()
		 * @generated
		 */
		EDataType ORDERING_TYPE_OBJECT = eINSTANCE.getOrderingTypeObject();

		/**
		 * The meta object literal for the '<em>RW Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.RWType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getRWTypeObject()
		 * @generated
		 */
		EDataType RW_TYPE_OBJECT = eINSTANCE.getRWTypeObject();

		/**
		 * The meta object literal for the '<em>Size Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
		 * @see org.multicore_association.shim10.model.shim10.impl.ShimPackageImpl#getSizeUnitTypeObject()
		 * @generated
		 */
		EDataType SIZE_UNIT_TYPE_OBJECT = eINSTANCE.getSizeUnitTypeObject();

	}

} //ShimPackage
