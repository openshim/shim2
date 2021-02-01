/**
 */
package org.multicore_association.shim.model.shim;

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
 * @see org.multicore_association.shim.model.shim.ShimFactory
 * @model kind="package"
 *        extendedMetaData="qualified='true'"
 * @generated
 */
public interface ShimPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "shim";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.multicore-association.org/2017/SHIM2.0/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shim";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShimPackage eINSTANCE = org.multicore_association.shim.model.shim.impl.ShimPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AbstractCommunicationImpl <em>Abstract Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AbstractCommunicationImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractCommunication()
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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AbstractComponentImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractComponent()
	 * @generated
	 */
	int ABSTRACT_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Frequency Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF = 2;

	/**
	 * The feature id for the '<em><b>Voltage Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF = 3;

	/**
	 * The feature id for the '<em><b>Operating Point Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT__OPERATING_POINT_REF = 4;

	/**
	 * The number of structural features of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Abstract Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl <em>Abstract Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractInstruction()
	 * @generated
	 */
	int ABSTRACT_INSTRUCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Encoding Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION__ENCODING_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>NInputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION__NINPUTS = 2;

	/**
	 * The feature id for the '<em><b>NOutputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION__NOUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>SIMD Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION__SIMD_WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION__PERFORMANCE = 5;

	/**
	 * The number of structural features of the '<em>Abstract Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Abstract Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AbstractPerformanceImpl <em>Abstract Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AbstractPerformanceImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractPerformance()
	 * @generated
	 */
	int ABSTRACT_PERFORMANCE = 3;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AbstractShimImpl <em>Abstract Shim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AbstractShimImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractShim()
	 * @generated
	 */
	int ABSTRACT_SHIM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHIM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Shim Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHIM__SHIM_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Abstract Shim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHIM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Shim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SHIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AccessorImpl <em>Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AccessorImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAccessor()
	 * @generated
	 */
	int ACCESSOR = 5;

	/**
	 * The feature id for the '<em><b>Master Component Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__MASTER_COMPONENT_REF = 0;

	/**
	 * The feature id for the '<em><b>Performance Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSOR__PERFORMANCE_SET = 1;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AccessTypeImpl <em>Access Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AccessTypeImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAccessType()
	 * @generated
	 */
	int ACCESS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Rw Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__RW_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Access Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__ACCESS_BYTE_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Alignment Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__ALIGNMENT_BYTE_SIZE = 4;

	/**
	 * The feature id for the '<em><b>NBurst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE__NBURST = 5;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AccessTypeSetImpl <em>Access Type Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AccessTypeSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAccessTypeSet()
	 * @generated
	 */
	int ACCESS_TYPE_SET = 7;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AddressSpaceImpl <em>Address Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AddressSpaceImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAddressSpace()
	 * @generated
	 */
	int ADDRESS_SPACE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE__ID = 1;

	/**
	 * The feature id for the '<em><b>Sub Space</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE__SUB_SPACE = 2;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.AddressSpaceSetImpl <em>Address Space Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.AddressSpaceSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAddressSpaceSet()
	 * @generated
	 */
	int ADDRESS_SPACE_SET = 9;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.CacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.CacheImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCache()
	 * @generated
	 */
	int CACHE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__ID = ABSTRACT_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Frequency Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__FREQUENCY_DOMAIN_REF = ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF;

	/**
	 * The feature id for the '<em><b>Voltage Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__VOLTAGE_DOMAIN_REF = ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF;

	/**
	 * The feature id for the '<em><b>Operating Point Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__OPERATING_POINT_REF = ABSTRACT_COMPONENT__OPERATING_POINT_REF;

	/**
	 * The feature id for the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CACHE_TYPE = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cache Coherency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CACHE_COHERENCY = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__SIZE = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__SIZE_UNIT = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>NWay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__NWAY = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__LINE_SIZE = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lock Down Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__LOCK_DOWN_TYPE = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Prefetch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__PREFETCH = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Prefetch Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__PREFETCH_DISTANCE = ABSTRACT_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Replacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__REPLACEMENT = ABSTRACT_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Write Allocate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__WRITE_ALLOCATE = ABSTRACT_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Write Back</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__WRITE_BACK = ABSTRACT_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Cache Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE__CACHE_REF = ABSTRACT_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_OPERATION_COUNT = ABSTRACT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.ClockFrequencyImpl <em>Clock Frequency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ClockFrequencyImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getClockFrequency()
	 * @generated
	 */
	int CLOCK_FREQUENCY = 11;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.CommonInstructionSetImpl <em>Common Instruction Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.CommonInstructionSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCommonInstructionSet()
	 * @generated
	 */
	int COMMON_INSTRUCTION_SET = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_INSTRUCTION_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Functional Unit Set File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE = 1;

	/**
	 * The feature id for the '<em><b>Functional Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET = 2;

	/**
	 * The number of structural features of the '<em>Common Instruction Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_INSTRUCTION_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Common Instruction Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_INSTRUCTION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.CommunicationSetImpl <em>Communication Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.CommunicationSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCommunicationSet()
	 * @generated
	 */
	int COMMUNICATION_SET = 13;

	/**
	 * The feature id for the '<em><b>Shared Memory Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION = 0;

	/**
	 * The feature id for the '<em><b>Shared Register Communication</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION = 1;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.ComponentSetImpl <em>Component Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ComponentSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getComponentSet()
	 * @generated
	 */
	int COMPONENT_SET = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__ID = ABSTRACT_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Frequency Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__FREQUENCY_DOMAIN_REF = ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF;

	/**
	 * The feature id for the '<em><b>Voltage Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__VOLTAGE_DOMAIN_REF = ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF;

	/**
	 * The feature id for the '<em><b>Operating Point Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__OPERATING_POINT_REF = ABSTRACT_COMPONENT__OPERATING_POINT_REF;

	/**
	 * The feature id for the '<em><b>Component Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__COMPONENT_SET = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Master Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__MASTER_COMPONENT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slave Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__SLAVE_COMPONENT = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET__CACHE = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET_OPERATION_COUNT = ABSTRACT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ConnectionImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 15;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO = 1;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PERFORMANCE = 2;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.ConnectionSetImpl <em>Connection Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ConnectionSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getConnectionSet()
	 * @generated
	 */
	int CONNECTION_SET = 16;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.ContentionGroupImpl <em>Contention Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ContentionGroupImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getContentionGroup()
	 * @generated
	 */
	int CONTENTION_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP__ID = 1;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP__THROUGHPUT = 2;

	/**
	 * The feature id for the '<em><b>Data Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP__DATA_RATE = 3;

	/**
	 * The feature id for the '<em><b>Performance Set Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP__PERFORMANCE_SET_REF = 4;

	/**
	 * The number of structural features of the '<em>Contention Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Contention Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.ContentionGroupSetImpl <em>Contention Group Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ContentionGroupSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getContentionGroupSet()
	 * @generated
	 */
	int CONTENTION_GROUP_SET = 18;

	/**
	 * The feature id for the '<em><b>Contention Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP_SET__CONTENTION_GROUP = 0;

	/**
	 * The number of structural features of the '<em>Contention Group Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Contention Group Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTION_GROUP_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.CustomInstructionImpl <em>Custom Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.CustomInstructionImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCustomInstruction()
	 * @generated
	 */
	int CUSTOM_INSTRUCTION = 19;

	/**
	 * The feature id for the '<em><b>Instruction Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTRUCTION__INSTRUCTION_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Instruction Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTRUCTION__INSTRUCTION_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Instruction Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTRUCTION__INSTRUCTION_OUTPUT = 2;

	/**
	 * The number of structural features of the '<em>Custom Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTRUCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Custom Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.DataRateImpl <em>Data Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.DataRateImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getDataRate()
	 * @generated
	 */
	int DATA_RATE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_RATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.DocumentRootImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 21;

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
	 * The feature id for the '<em><b>Shim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHIM = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.EventCommunicationImpl <em>Event Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.EventCommunicationImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getEventCommunication()
	 * @generated
	 */
	int EVENT_COMMUNICATION = 22;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.FIFOCommunicationImpl <em>FIFO Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.FIFOCommunicationImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFIFOCommunication()
	 * @generated
	 */
	int FIFO_COMMUNICATION = 23;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.FrequencyDomainImpl <em>Frequency Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.FrequencyDomainImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFrequencyDomain()
	 * @generated
	 */
	int FREQUENCY_DOMAIN = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_DOMAIN__ID = 1;

	/**
	 * The number of structural features of the '<em>Frequency Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Frequency Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.FrequencyVoltageSetImpl <em>Frequency Voltage Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.FrequencyVoltageSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFrequencyVoltageSet()
	 * @generated
	 */
	int FREQUENCY_VOLTAGE_SET = 25;

	/**
	 * The feature id for the '<em><b>Frequency Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_VOLTAGE_SET__FREQUENCY_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Voltage Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_VOLTAGE_SET__VOLTAGE_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Operating Point Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_VOLTAGE_SET__OPERATING_POINT_SET = 2;

	/**
	 * The number of structural features of the '<em>Frequency Voltage Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_VOLTAGE_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Frequency Voltage Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_VOLTAGE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitImpl <em>Functional Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.FunctionalUnitImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFunctionalUnit()
	 * @generated
	 */
	int FUNCTIONAL_UNIT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT__INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Custom Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT__CUSTOM_INSTRUCTION = 2;

	/**
	 * The number of structural features of the '<em>Functional Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Functional Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitSetImpl <em>Functional Unit Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.FunctionalUnitSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFunctionalUnitSet()
	 * @generated
	 */
	int FUNCTIONAL_UNIT_SET = 27;

	/**
	 * The feature id for the '<em><b>Functional Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT_SET__FUNCTIONAL_UNIT = 0;

	/**
	 * The number of structural features of the '<em>Functional Unit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Functional Unit Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitSetFileImpl <em>Functional Unit Set File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.FunctionalUnitSetFileImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFunctionalUnitSetFile()
	 * @generated
	 */
	int FUNCTIONAL_UNIT_SET_FILE = 28;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT_SET_FILE__SRC = 0;

	/**
	 * The number of structural features of the '<em>Functional Unit Set File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT_SET_FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Functional Unit Set File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_UNIT_SET_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.InstructionImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NAME = ABSTRACT_INSTRUCTION__NAME;

	/**
	 * The feature id for the '<em><b>Encoding Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__ENCODING_LENGTH = ABSTRACT_INSTRUCTION__ENCODING_LENGTH;

	/**
	 * The feature id for the '<em><b>NInputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NINPUTS = ABSTRACT_INSTRUCTION__NINPUTS;

	/**
	 * The feature id for the '<em><b>NOutputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__NOUTPUTS = ABSTRACT_INSTRUCTION__NOUTPUTS;

	/**
	 * The feature id for the '<em><b>SIMD Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__SIMD_WIDTH = ABSTRACT_INSTRUCTION__SIMD_WIDTH;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PERFORMANCE = ABSTRACT_INSTRUCTION__PERFORMANCE;

	/**
	 * The feature id for the '<em><b>Immediate Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__IMMEDIATE_BIT_WIDTH = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__INPUT_BIT_WIDTH = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Preserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__INPUT_PRESERVED = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Emulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__IS_EMULATED = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Operand Addressing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OPERAND_ADDRESSING = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OPERATION = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__OUTPUT_BIT_WIDTH = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Supported Signedness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__SUPPORTED_SIGNEDNESS = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = ABSTRACT_INSTRUCTION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = ABSTRACT_INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.InstructionInputImpl <em>Instruction Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.InstructionInputImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionInput()
	 * @generated
	 */
	int INSTRUCTION_INPUT = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_INPUT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_INPUT__BIT_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_INPUT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Instruction Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_INPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instruction Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_INPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.InstructionOperationImpl <em>Instruction Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.InstructionOperationImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionOperation()
	 * @generated
	 */
	int INSTRUCTION_OPERATION = 31;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Instruction Operand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION__INSTRUCTION_OPERAND = 1;

	/**
	 * The number of structural features of the '<em>Instruction Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Instruction Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.InstructionOutputImpl <em>Instruction Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.InstructionOutputImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionOutput()
	 * @generated
	 */
	int INSTRUCTION_OUTPUT = 32;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OUTPUT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OUTPUT__BIT_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OUTPUT__REF = 2;

	/**
	 * The number of structural features of the '<em>Instruction Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OUTPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Instruction Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.InterruptCommunicationImpl <em>Interrupt Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.InterruptCommunicationImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInterruptCommunication()
	 * @generated
	 */
	int INTERRUPT_COMMUNICATION = 33;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.LatencyImpl <em>Latency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.LatencyImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getLatency()
	 * @generated
	 */
	int LATENCY = 34;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl <em>Master Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.MasterComponentImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterComponent()
	 * @generated
	 */
	int MASTER_COMPONENT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ID = ABSTRACT_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Frequency Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__FREQUENCY_DOMAIN_REF = ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF;

	/**
	 * The feature id for the '<em><b>Voltage Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__VOLTAGE_DOMAIN_REF = ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF;

	/**
	 * The feature id for the '<em><b>Operating Point Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__OPERATING_POINT_REF = ABSTRACT_COMPONENT__OPERATING_POINT_REF;

	/**
	 * The feature id for the '<em><b>Cache Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__CACHE_REF = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ACCESS_TYPE_SET = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clock Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__CLOCK_FREQUENCY = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ARCH = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Arch Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ARCH_OPTION = ABSTRACT_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Endian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__ENDIAN = ABSTRACT_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Master Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__MASTER_TYPE = ABSTRACT_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>NChannel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__NCHANNEL = ABSTRACT_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>NThread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__NTHREAD = ABSTRACT_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__PID = ABSTRACT_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Common Instruction Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT__COMMON_INSTRUCTION_SET = ABSTRACT_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Master Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Master Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_OPERATION_COUNT = ABSTRACT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.MasterSlaveBindingImpl <em>Master Slave Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.MasterSlaveBindingImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterSlaveBinding()
	 * @generated
	 */
	int MASTER_SLAVE_BINDING = 36;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.MasterSlaveBindingSetImpl <em>Master Slave Binding Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.MasterSlaveBindingSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterSlaveBindingSet()
	 * @generated
	 */
	int MASTER_SLAVE_BINDING_SET = 37;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.MemoryConsistencyModelImpl <em>Memory Consistency Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.MemoryConsistencyModelImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMemoryConsistencyModel()
	 * @generated
	 */
	int MEMORY_CONSISTENCY_MODEL = 38;

	/**
	 * The feature id for the '<em><b>Raw Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL__RAW_ORDERING = 0;

	/**
	 * The feature id for the '<em><b>War Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL__WAR_ORDERING = 1;

	/**
	 * The feature id for the '<em><b>Waw Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL__WAW_ORDERING = 2;

	/**
	 * The feature id for the '<em><b>Rar Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CONSISTENCY_MODEL__RAR_ORDERING = 3;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.OperatingPointImpl <em>Operating Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.OperatingPointImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperatingPoint()
	 * @generated
	 */
	int OPERATING_POINT = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT__ID = 1;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT__FREQUENCY = 2;

	/**
	 * The feature id for the '<em><b>Frequency Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT__FREQUENCY_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT__VOLTAGE = 4;

	/**
	 * The feature id for the '<em><b>Voltage Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT__VOLTAGE_UNIT = 5;

	/**
	 * The number of structural features of the '<em>Operating Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Operating Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.OperatingPointSetImpl <em>Operating Point Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.OperatingPointSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperatingPointSet()
	 * @generated
	 */
	int OPERATING_POINT_SET = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT_SET__ID = 1;

	/**
	 * The feature id for the '<em><b>Operating Point</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT_SET__OPERATING_POINT = 2;

	/**
	 * The number of structural features of the '<em>Operating Point Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operating Point Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_POINT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.PerformanceImpl <em>Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.PerformanceImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPerformance()
	 * @generated
	 */
	int PERFORMANCE = 41;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.PerformanceSetImpl <em>Performance Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.PerformanceSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPerformanceSet()
	 * @generated
	 */
	int PERFORMANCE_SET = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SET__ID = 0;

	/**
	 * The feature id for the '<em><b>Cache Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SET__CACHE_REF = 1;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SET__PERFORMANCE = 2;

	/**
	 * The number of structural features of the '<em>Performance Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Performance Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.PitchImpl <em>Pitch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.PitchImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPitch()
	 * @generated
	 */
	int PITCH = 43;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.PowerConfigurationImpl <em>Power Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.PowerConfigurationImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerConfiguration()
	 * @generated
	 */
	int POWER_CONFIGURATION = 44;

	/**
	 * The feature id for the '<em><b>System Configuration Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONFIGURATION__SYSTEM_CONFIGURATION_SRC = 0;

	/**
	 * The feature id for the '<em><b>Power Consumption Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONFIGURATION__POWER_CONSUMPTION_SET = 1;

	/**
	 * The number of structural features of the '<em>Power Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Power Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionImpl <em>Power Consumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.PowerConsumptionImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerConsumption()
	 * @generated
	 */
	int POWER_CONSUMPTION = 45;

	/**
	 * The feature id for the '<em><b>Operating Point Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION__OPERATING_POINT_REF = 0;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION__POWER = 1;

	/**
	 * The feature id for the '<em><b>Power Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION__POWER_UNIT = 2;

	/**
	 * The number of structural features of the '<em>Power Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Power Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionSetImpl <em>Power Consumption Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.PowerConsumptionSetImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerConsumptionSet()
	 * @generated
	 */
	int POWER_CONSUMPTION_SET = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION_SET__ID = 1;

	/**
	 * The feature id for the '<em><b>Power Consumption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION_SET__POWER_CONSUMPTION = 2;

	/**
	 * The feature id for the '<em><b>Power Consumer Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION_SET__POWER_CONSUMER_REF = 3;

	/**
	 * The number of structural features of the '<em>Power Consumption Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION_SET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Power Consumption Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_CONSUMPTION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.SharedMemoryCommunicationImpl <em>Shared Memory Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.SharedMemoryCommunicationImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSharedMemoryCommunication()
	 * @generated
	 */
	int SHARED_MEMORY_COMMUNICATION = 47;

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
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__DATA_SIZE = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT = ABSTRACT_COMMUNICATION_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.SharedRegisterCommunicationImpl <em>Shared Register Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.SharedRegisterCommunicationImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSharedRegisterCommunication()
	 * @generated
	 */
	int SHARED_REGISTER_COMMUNICATION = 48;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.ShimImpl <em>Shim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ShimImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getShim()
	 * @generated
	 */
	int SHIM = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM__NAME = ABSTRACT_SHIM__NAME;

	/**
	 * The feature id for the '<em><b>Shim Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM__SHIM_VERSION = ABSTRACT_SHIM__SHIM_VERSION;

	/**
	 * The feature id for the '<em><b>System Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM__SYSTEM_CONFIGURATION = ABSTRACT_SHIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM__POWER_CONFIGURATION = ABSTRACT_SHIM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Functional Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM__FUNCTIONAL_UNIT_SET = ABSTRACT_SHIM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_FEATURE_COUNT = ABSTRACT_SHIM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_OPERATION_COUNT = ABSTRACT_SHIM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.SlaveComponentImpl <em>Slave Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.SlaveComponentImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSlaveComponent()
	 * @generated
	 */
	int SLAVE_COMPONENT = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__NAME = ABSTRACT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__ID = ABSTRACT_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Frequency Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__FREQUENCY_DOMAIN_REF = ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF;

	/**
	 * The feature id for the '<em><b>Voltage Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__VOLTAGE_DOMAIN_REF = ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF;

	/**
	 * The feature id for the '<em><b>Operating Point Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__OPERATING_POINT_REF = ABSTRACT_COMPONENT__OPERATING_POINT_REF;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__SIZE = ABSTRACT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__SIZE_UNIT = ABSTRACT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rw Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT__RW_TYPE = ABSTRACT_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slave Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_FEATURE_COUNT = ABSTRACT_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Slave Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_OPERATION_COUNT = ABSTRACT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.SubSpaceImpl <em>Sub Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.SubSpaceImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSubSpace()
	 * @generated
	 */
	int SUB_SPACE = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__ID = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__END = 3;

	/**
	 * The feature id for the '<em><b>Endian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__ENDIAN = 4;

	/**
	 * The feature id for the '<em><b>Master Slave Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__MASTER_SLAVE_BINDING_SET = 5;

	/**
	 * The feature id for the '<em><b>Memory Consistency Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SPACE__MEMORY_CONSISTENCY_MODEL = 6;

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
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.SystemConfigurationImpl <em>System Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.SystemConfigurationImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSystemConfiguration()
	 * @generated
	 */
	int SYSTEM_CONFIGURATION = 52;

	/**
	 * The feature id for the '<em><b>Component Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__COMPONENT_SET = 0;

	/**
	 * The feature id for the '<em><b>Address Space Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET = 1;

	/**
	 * The feature id for the '<em><b>Communication Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__COMMUNICATION_SET = 2;

	/**
	 * The feature id for the '<em><b>Frequency Voltage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET = 3;

	/**
	 * The feature id for the '<em><b>Contention Group Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET = 4;

	/**
	 * The number of structural features of the '<em>System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.ThroughputImpl <em>Throughput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ThroughputImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getThroughput()
	 * @generated
	 */
	int THROUGHPUT = 53;

	/**
	 * The feature id for the '<em><b>Frequency Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT__FREQUENCY_DOMAIN_REF = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT__UNIT = 2;

	/**
	 * The number of structural features of the '<em>Throughput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Throughput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGHPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.impl.VoltageDomainImpl <em>Voltage Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.VoltageDomainImpl
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getVoltageDomain()
	 * @generated
	 */
	int VOLTAGE_DOMAIN = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_DOMAIN__ID = 1;

	/**
	 * The number of structural features of the '<em>Voltage Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_DOMAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Voltage Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLTAGE_DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.CacheCoherencyType <em>Cache Coherency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheCoherencyType()
	 * @generated
	 */
	int CACHE_COHERENCY_TYPE = 55;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.CachePrefetchType <em>Cache Prefetch Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CachePrefetchType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCachePrefetchType()
	 * @generated
	 */
	int CACHE_PREFETCH_TYPE = 56;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.CacheReplacementType <em>Cache Replacement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheReplacementType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheReplacementType()
	 * @generated
	 */
	int CACHE_REPLACEMENT_TYPE = 57;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.CacheType <em>Cache Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheType()
	 * @generated
	 */
	int CACHE_TYPE = 58;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.CacheWriteAllocateType <em>Cache Write Allocate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheWriteAllocateType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheWriteAllocateType()
	 * @generated
	 */
	int CACHE_WRITE_ALLOCATE_TYPE = 59;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.CacheWriteBackType <em>Cache Write Back Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheWriteBackType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheWriteBackType()
	 * @generated
	 */
	int CACHE_WRITE_BACK_TYPE = 60;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.DataRateUnitType <em>Data Rate Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.DataRateUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getDataRateUnitType()
	 * @generated
	 */
	int DATA_RATE_UNIT_TYPE = 61;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.EndianType <em>Endian Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.EndianType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getEndianType()
	 * @generated
	 */
	int ENDIAN_TYPE = 62;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.FrequencyUnitType <em>Frequency Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.FrequencyUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFrequencyUnitType()
	 * @generated
	 */
	int FREQUENCY_UNIT_TYPE = 63;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.InstructionInputType <em>Instruction Input Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.InstructionInputType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionInputType()
	 * @generated
	 */
	int INSTRUCTION_INPUT_TYPE = 64;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.InstructionOutputType <em>Instruction Output Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.InstructionOutputType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionOutputType()
	 * @generated
	 */
	int INSTRUCTION_OUTPUT_TYPE = 65;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.LockDownType <em>Lock Down Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.LockDownType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getLockDownType()
	 * @generated
	 */
	int LOCK_DOWN_TYPE = 66;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.MasterType <em>Master Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.MasterType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterType()
	 * @generated
	 */
	int MASTER_TYPE = 67;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.OperandAddressingType <em>Operand Addressing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.OperandAddressingType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperandAddressingType()
	 * @generated
	 */
	int OPERAND_ADDRESSING_TYPE = 68;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.OperationType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 69;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.OrderingType <em>Ordering Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.OrderingType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOrderingType()
	 * @generated
	 */
	int ORDERING_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.PowerUnitType <em>Power Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.PowerUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerUnitType()
	 * @generated
	 */
	int POWER_UNIT_TYPE = 71;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.RWType <em>RW Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getRWType()
	 * @generated
	 */
	int RW_TYPE = 72;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.SignednessType <em>Signedness Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.SignednessType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSignednessType()
	 * @generated
	 */
	int SIGNEDNESS_TYPE = 73;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.SizeUnitType <em>Size Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSizeUnitType()
	 * @generated
	 */
	int SIZE_UNIT_TYPE = 74;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.ThroughputUnitType <em>Throughput Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.ThroughputUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getThroughputUnitType()
	 * @generated
	 */
	int THROUGHPUT_UNIT_TYPE = 75;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.model.shim.VoltageUnitType <em>Voltage Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.VoltageUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getVoltageUnitType()
	 * @generated
	 */
	int VOLTAGE_UNIT_TYPE = 76;

	/**
	 * The meta object id for the '<em>Address Value Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAddressValueType()
	 * @generated
	 */
	int ADDRESS_VALUE_TYPE = 77;

	/**
	 * The meta object id for the '<em>Address Value Object Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAddressValueObjectType()
	 * @generated
	 */
	int ADDRESS_VALUE_OBJECT_TYPE = 78;

	/**
	 * The meta object id for the '<em>Cache Coherency Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheCoherencyTypeObject()
	 * @generated
	 */
	int CACHE_COHERENCY_TYPE_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Cache Prefetch Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CachePrefetchType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCachePrefetchTypeObject()
	 * @generated
	 */
	int CACHE_PREFETCH_TYPE_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Cache Replacement Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheReplacementType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheReplacementTypeObject()
	 * @generated
	 */
	int CACHE_REPLACEMENT_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Cache Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheTypeObject()
	 * @generated
	 */
	int CACHE_TYPE_OBJECT = 82;

	/**
	 * The meta object id for the '<em>Cache Write Allocate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheWriteAllocateType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheWriteAllocateTypeObject()
	 * @generated
	 */
	int CACHE_WRITE_ALLOCATE_TYPE_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Cache Write Back Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.CacheWriteBackType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheWriteBackTypeObject()
	 * @generated
	 */
	int CACHE_WRITE_BACK_TYPE_OBJECT = 84;

	/**
	 * The meta object id for the '<em>Data Rate Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.DataRateUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getDataRateUnitTypeObject()
	 * @generated
	 */
	int DATA_RATE_UNIT_TYPE_OBJECT = 85;

	/**
	 * The meta object id for the '<em>Endian Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.EndianType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getEndianTypeObject()
	 * @generated
	 */
	int ENDIAN_TYPE_OBJECT = 86;

	/**
	 * The meta object id for the '<em>Frequency Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.FrequencyUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFrequencyUnitTypeObject()
	 * @generated
	 */
	int FREQUENCY_UNIT_TYPE_OBJECT = 87;

	/**
	 * The meta object id for the '<em>Instruction Input Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.InstructionInputType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionInputTypeObject()
	 * @generated
	 */
	int INSTRUCTION_INPUT_TYPE_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Instruction Output Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.InstructionOutputType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionOutputTypeObject()
	 * @generated
	 */
	int INSTRUCTION_OUTPUT_TYPE_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Lock Down Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.LockDownType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getLockDownTypeObject()
	 * @generated
	 */
	int LOCK_DOWN_TYPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Master Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.MasterType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterTypeObject()
	 * @generated
	 */
	int MASTER_TYPE_OBJECT = 91;

	/**
	 * The meta object id for the '<em>Operand Addressing Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.OperandAddressingType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperandAddressingTypeObject()
	 * @generated
	 */
	int OPERAND_ADDRESSING_TYPE_OBJECT = 92;

	/**
	 * The meta object id for the '<em>Operation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.OperationType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperationTypeObject()
	 * @generated
	 */
	int OPERATION_TYPE_OBJECT = 93;

	/**
	 * The meta object id for the '<em>Ordering Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.OrderingType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOrderingTypeObject()
	 * @generated
	 */
	int ORDERING_TYPE_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Power Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.PowerUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerUnitTypeObject()
	 * @generated
	 */
	int POWER_UNIT_TYPE_OBJECT = 95;

	/**
	 * The meta object id for the '<em>RW Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getRWTypeObject()
	 * @generated
	 */
	int RW_TYPE_OBJECT = 96;

	/**
	 * The meta object id for the '<em>Signedness Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.SignednessType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSignednessTypeObject()
	 * @generated
	 */
	int SIGNEDNESS_TYPE_OBJECT = 97;

	/**
	 * The meta object id for the '<em>Size Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSizeUnitTypeObject()
	 * @generated
	 */
	int SIZE_UNIT_TYPE_OBJECT = 98;

	/**
	 * The meta object id for the '<em>Throughput Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.ThroughputUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getThroughputUnitTypeObject()
	 * @generated
	 */
	int THROUGHPUT_UNIT_TYPE_OBJECT = 99;

	/**
	 * The meta object id for the '<em>Unsigned Float Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getUnsignedFloatType()
	 * @generated
	 */
	int UNSIGNED_FLOAT_TYPE = 100;

	/**
	 * The meta object id for the '<em>Unsigned Float Object Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getUnsignedFloatObjectType()
	 * @generated
	 */
	int UNSIGNED_FLOAT_OBJECT_TYPE = 101;

	/**
	 * The meta object id for the '<em>Unsigned Int Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getUnsignedIntType()
	 * @generated
	 */
	int UNSIGNED_INT_TYPE = 102;

	/**
	 * The meta object id for the '<em>Unsigned Int Object Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getUnsignedIntObjectType()
	 * @generated
	 */
	int UNSIGNED_INT_OBJECT_TYPE = 103;

	/**
	 * The meta object id for the '<em>Voltage Unit Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.model.shim.VoltageUnitType
	 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getVoltageUnitTypeObject()
	 * @generated
	 */
	int VOLTAGE_UNIT_TYPE_OBJECT = 104;

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.AbstractCommunication <em>Abstract Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractCommunication
	 * @generated
	 */
	EClass getAbstractCommunication();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.AbstractCommunication#getConnectionSet <em>Connection Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection Set</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractCommunication#getConnectionSet()
	 * @see #getAbstractCommunication()
	 * @generated
	 */
	EReference getAbstractCommunication_ConnectionSet();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractCommunication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractCommunication#getName()
	 * @see #getAbstractCommunication()
	 * @generated
	 */
	EAttribute getAbstractCommunication_Name();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.AbstractComponent <em>Abstract Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractComponent
	 * @generated
	 */
	EClass getAbstractComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractComponent#getName()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EAttribute getAbstractComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractComponent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractComponent#getId()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EAttribute getAbstractComponent_Id();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.AbstractComponent#getFrequencyDomainRef <em>Frequency Domain Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frequency Domain Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractComponent#getFrequencyDomainRef()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_FrequencyDomainRef();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.AbstractComponent#getVoltageDomainRef <em>Voltage Domain Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Voltage Domain Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractComponent#getVoltageDomainRef()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_VoltageDomainRef();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.AbstractComponent#getOperatingPointRef <em>Operating Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operating Point Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractComponent#getOperatingPointRef()
	 * @see #getAbstractComponent()
	 * @generated
	 */
	EReference getAbstractComponent_OperatingPointRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.AbstractInstruction <em>Abstract Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Instruction</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractInstruction
	 * @generated
	 */
	EClass getAbstractInstruction();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractInstruction#getName()
	 * @see #getAbstractInstruction()
	 * @generated
	 */
	EAttribute getAbstractInstruction_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getEncodingLength <em>Encoding Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding Length</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractInstruction#getEncodingLength()
	 * @see #getAbstractInstruction()
	 * @generated
	 */
	EAttribute getAbstractInstruction_EncodingLength();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNInputs <em>NInputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NInputs</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractInstruction#getNInputs()
	 * @see #getAbstractInstruction()
	 * @generated
	 */
	EAttribute getAbstractInstruction_NInputs();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNOutputs <em>NOutputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NOutputs</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractInstruction#getNOutputs()
	 * @see #getAbstractInstruction()
	 * @generated
	 */
	EAttribute getAbstractInstruction_NOutputs();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getSIMDWidth <em>SIMD Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SIMD Width</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractInstruction#getSIMDWidth()
	 * @see #getAbstractInstruction()
	 * @generated
	 */
	EAttribute getAbstractInstruction_SIMDWidth();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractInstruction#getPerformance()
	 * @see #getAbstractInstruction()
	 * @generated
	 */
	EReference getAbstractInstruction_Performance();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.AbstractPerformance <em>Abstract Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Performance</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractPerformance
	 * @generated
	 */
	EClass getAbstractPerformance();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getBest <em>Best</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractPerformance#getBest()
	 * @see #getAbstractPerformance()
	 * @generated
	 */
	EAttribute getAbstractPerformance_Best();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getTypical <em>Typical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typical</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractPerformance#getTypical()
	 * @see #getAbstractPerformance()
	 * @generated
	 */
	EAttribute getAbstractPerformance_Typical();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getWorst <em>Worst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractPerformance#getWorst()
	 * @see #getAbstractPerformance()
	 * @generated
	 */
	EAttribute getAbstractPerformance_Worst();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.AbstractShim <em>Abstract Shim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Shim</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractShim
	 * @generated
	 */
	EClass getAbstractShim();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractShim#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractShim#getName()
	 * @see #getAbstractShim()
	 * @generated
	 */
	EAttribute getAbstractShim_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AbstractShim#getShimVersion <em>Shim Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shim Version</em>'.
	 * @see org.multicore_association.shim.model.shim.AbstractShim#getShimVersion()
	 * @see #getAbstractShim()
	 * @generated
	 */
	EAttribute getAbstractShim_ShimVersion();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.Accessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accessor</em>'.
	 * @see org.multicore_association.shim.model.shim.Accessor
	 * @generated
	 */
	EClass getAccessor();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.Accessor#getMasterComponentRef <em>Master Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master Component Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.Accessor#getMasterComponentRef()
	 * @see #getAccessor()
	 * @generated
	 */
	EReference getAccessor_MasterComponentRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.Accessor#getPerformanceSet <em>Performance Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance Set</em>'.
	 * @see org.multicore_association.shim.model.shim.Accessor#getPerformanceSet()
	 * @see #getAccessor()
	 * @generated
	 */
	EReference getAccessor_PerformanceSet();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.AccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Type</em>'.
	 * @see org.multicore_association.shim.model.shim.AccessType
	 * @generated
	 */
	EClass getAccessType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AccessType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.AccessType#getName()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AccessType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.AccessType#getId()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AccessType#getRwType <em>Rw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rw Type</em>'.
	 * @see org.multicore_association.shim.model.shim.AccessType#getRwType()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_RwType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AccessType#getAccessByteSize <em>Access Byte Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Byte Size</em>'.
	 * @see org.multicore_association.shim.model.shim.AccessType#getAccessByteSize()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_AccessByteSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AccessType#getAlignmentByteSize <em>Alignment Byte Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment Byte Size</em>'.
	 * @see org.multicore_association.shim.model.shim.AccessType#getAlignmentByteSize()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_AlignmentByteSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AccessType#getNBurst <em>NBurst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NBurst</em>'.
	 * @see org.multicore_association.shim.model.shim.AccessType#getNBurst()
	 * @see #getAccessType()
	 * @generated
	 */
	EAttribute getAccessType_NBurst();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.AccessTypeSet <em>Access Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Type Set</em>'.
	 * @see org.multicore_association.shim.model.shim.AccessTypeSet
	 * @generated
	 */
	EClass getAccessTypeSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.AccessTypeSet#getAccessType <em>Access Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Type</em>'.
	 * @see org.multicore_association.shim.model.shim.AccessTypeSet#getAccessType()
	 * @see #getAccessTypeSet()
	 * @generated
	 */
	EReference getAccessTypeSet_AccessType();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.AddressSpace <em>Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Space</em>'.
	 * @see org.multicore_association.shim.model.shim.AddressSpace
	 * @generated
	 */
	EClass getAddressSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AddressSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.AddressSpace#getName()
	 * @see #getAddressSpace()
	 * @generated
	 */
	EAttribute getAddressSpace_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.AddressSpace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.AddressSpace#getId()
	 * @see #getAddressSpace()
	 * @generated
	 */
	EAttribute getAddressSpace_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.AddressSpace#getSubSpace <em>Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Space</em>'.
	 * @see org.multicore_association.shim.model.shim.AddressSpace#getSubSpace()
	 * @see #getAddressSpace()
	 * @generated
	 */
	EReference getAddressSpace_SubSpace();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.AddressSpaceSet <em>Address Space Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Space Set</em>'.
	 * @see org.multicore_association.shim.model.shim.AddressSpaceSet
	 * @generated
	 */
	EClass getAddressSpaceSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.AddressSpaceSet#getAddressSpace <em>Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Space</em>'.
	 * @see org.multicore_association.shim.model.shim.AddressSpaceSet#getAddressSpace()
	 * @see #getAddressSpaceSet()
	 * @generated
	 */
	EReference getAddressSpaceSet_AddressSpace();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.Cache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache
	 * @generated
	 */
	EClass getCache();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getCacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Type</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getCacheType()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_CacheType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getCacheCoherency <em>Cache Coherency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Coherency</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getCacheCoherency()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_CacheCoherency();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getSize()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getSizeUnit <em>Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getSizeUnit()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_SizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getNWay <em>NWay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NWay</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getNWay()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_NWay();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getLineSize <em>Line Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Size</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getLineSize()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_LineSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getLockDownType <em>Lock Down Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Down Type</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getLockDownType()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_LockDownType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getPrefetch <em>Prefetch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefetch</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getPrefetch()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Prefetch();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getPrefetchDistance <em>Prefetch Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefetch Distance</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getPrefetchDistance()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_PrefetchDistance();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getReplacement <em>Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replacement</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getReplacement()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_Replacement();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getWriteAllocate <em>Write Allocate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Allocate</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getWriteAllocate()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_WriteAllocate();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Cache#getWriteBack <em>Write Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Back</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getWriteBack()
	 * @see #getCache()
	 * @generated
	 */
	EAttribute getCache_WriteBack();

	/**
	 * Returns the meta object for the reference list '{@link org.multicore_association.shim.model.shim.Cache#getCacheRef <em>Cache Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cache Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.Cache#getCacheRef()
	 * @see #getCache()
	 * @generated
	 */
	EReference getCache_CacheRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.ClockFrequency <em>Clock Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Frequency</em>'.
	 * @see org.multicore_association.shim.model.shim.ClockFrequency
	 * @generated
	 */
	EClass getClockFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.ClockFrequency#getClockValue <em>Clock Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock Value</em>'.
	 * @see org.multicore_association.shim.model.shim.ClockFrequency#getClockValue()
	 * @see #getClockFrequency()
	 * @generated
	 */
	EAttribute getClockFrequency_ClockValue();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.CommonInstructionSet <em>Common Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Instruction Set</em>'.
	 * @see org.multicore_association.shim.model.shim.CommonInstructionSet
	 * @generated
	 */
	EClass getCommonInstructionSet();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.CommonInstructionSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.CommonInstructionSet#getName()
	 * @see #getCommonInstructionSet()
	 * @generated
	 */
	EAttribute getCommonInstructionSet_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.CommonInstructionSet#getFunctionalUnitSetFile <em>Functional Unit Set File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Unit Set File</em>'.
	 * @see org.multicore_association.shim.model.shim.CommonInstructionSet#getFunctionalUnitSetFile()
	 * @see #getCommonInstructionSet()
	 * @generated
	 */
	EReference getCommonInstructionSet_FunctionalUnitSetFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.CommonInstructionSet#getFunctionalUnitSet <em>Functional Unit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Unit Set</em>'.
	 * @see org.multicore_association.shim.model.shim.CommonInstructionSet#getFunctionalUnitSet()
	 * @see #getCommonInstructionSet()
	 * @generated
	 */
	EReference getCommonInstructionSet_FunctionalUnitSet();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.CommunicationSet <em>Communication Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Set</em>'.
	 * @see org.multicore_association.shim.model.shim.CommunicationSet
	 * @generated
	 */
	EClass getCommunicationSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.CommunicationSet#getSharedMemoryCommunication <em>Shared Memory Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Memory Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.CommunicationSet#getSharedMemoryCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_SharedMemoryCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.CommunicationSet#getSharedRegisterCommunication <em>Shared Register Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared Register Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.CommunicationSet#getSharedRegisterCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_SharedRegisterCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.CommunicationSet#getEventCommunication <em>Event Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.CommunicationSet#getEventCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_EventCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.CommunicationSet#getFIFOCommunication <em>FIFO Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FIFO Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.CommunicationSet#getFIFOCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_FIFOCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.CommunicationSet#getInterruptCommunication <em>Interrupt Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interrupt Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.CommunicationSet#getInterruptCommunication()
	 * @see #getCommunicationSet()
	 * @generated
	 */
	EReference getCommunicationSet_InterruptCommunication();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.ComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Set</em>'.
	 * @see org.multicore_association.shim.model.shim.ComponentSet
	 * @generated
	 */
	EClass getComponentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.ComponentSet#getComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component Set</em>'.
	 * @see org.multicore_association.shim.model.shim.ComponentSet#getComponentSet()
	 * @see #getComponentSet()
	 * @generated
	 */
	EReference getComponentSet_ComponentSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.ComponentSet#getMasterComponent <em>Master Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Master Component</em>'.
	 * @see org.multicore_association.shim.model.shim.ComponentSet#getMasterComponent()
	 * @see #getComponentSet()
	 * @generated
	 */
	EReference getComponentSet_MasterComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.ComponentSet#getSlaveComponent <em>Slave Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slave Component</em>'.
	 * @see org.multicore_association.shim.model.shim.ComponentSet#getSlaveComponent()
	 * @see #getComponentSet()
	 * @generated
	 */
	EReference getComponentSet_SlaveComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.ComponentSet#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cache</em>'.
	 * @see org.multicore_association.shim.model.shim.ComponentSet#getCache()
	 * @see #getComponentSet()
	 * @generated
	 */
	EReference getComponentSet_Cache();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.multicore_association.shim.model.shim.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.multicore_association.shim.model.shim.Connection#getFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_From();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.multicore_association.shim.model.shim.Connection#getTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_To();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.Connection#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance</em>'.
	 * @see org.multicore_association.shim.model.shim.Connection#getPerformance()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Performance();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.ConnectionSet <em>Connection Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Set</em>'.
	 * @see org.multicore_association.shim.model.shim.ConnectionSet
	 * @generated
	 */
	EClass getConnectionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.ConnectionSet#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see org.multicore_association.shim.model.shim.ConnectionSet#getConnection()
	 * @see #getConnectionSet()
	 * @generated
	 */
	EReference getConnectionSet_Connection();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.ContentionGroup <em>Contention Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contention Group</em>'.
	 * @see org.multicore_association.shim.model.shim.ContentionGroup
	 * @generated
	 */
	EClass getContentionGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.ContentionGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.ContentionGroup#getName()
	 * @see #getContentionGroup()
	 * @generated
	 */
	EAttribute getContentionGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.ContentionGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.ContentionGroup#getId()
	 * @see #getContentionGroup()
	 * @generated
	 */
	EAttribute getContentionGroup_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.ContentionGroup#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throughput</em>'.
	 * @see org.multicore_association.shim.model.shim.ContentionGroup#getThroughput()
	 * @see #getContentionGroup()
	 * @generated
	 */
	EReference getContentionGroup_Throughput();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.ContentionGroup#getDataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Rate</em>'.
	 * @see org.multicore_association.shim.model.shim.ContentionGroup#getDataRate()
	 * @see #getContentionGroup()
	 * @generated
	 */
	EReference getContentionGroup_DataRate();

	/**
	 * Returns the meta object for the reference list '{@link org.multicore_association.shim.model.shim.ContentionGroup#getPerformanceSetRef <em>Performance Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Performance Set Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.ContentionGroup#getPerformanceSetRef()
	 * @see #getContentionGroup()
	 * @generated
	 */
	EReference getContentionGroup_PerformanceSetRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.ContentionGroupSet <em>Contention Group Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contention Group Set</em>'.
	 * @see org.multicore_association.shim.model.shim.ContentionGroupSet
	 * @generated
	 */
	EClass getContentionGroupSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.ContentionGroupSet#getContentionGroup <em>Contention Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contention Group</em>'.
	 * @see org.multicore_association.shim.model.shim.ContentionGroupSet#getContentionGroup()
	 * @see #getContentionGroupSet()
	 * @generated
	 */
	EReference getContentionGroupSet_ContentionGroup();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.CustomInstruction <em>Custom Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Instruction</em>'.
	 * @see org.multicore_association.shim.model.shim.CustomInstruction
	 * @generated
	 */
	EClass getCustomInstruction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.CustomInstruction#getInstructionInput <em>Instruction Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction Input</em>'.
	 * @see org.multicore_association.shim.model.shim.CustomInstruction#getInstructionInput()
	 * @see #getCustomInstruction()
	 * @generated
	 */
	EReference getCustomInstruction_InstructionInput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.CustomInstruction#getInstructionOperation <em>Instruction Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction Operation</em>'.
	 * @see org.multicore_association.shim.model.shim.CustomInstruction#getInstructionOperation()
	 * @see #getCustomInstruction()
	 * @generated
	 */
	EReference getCustomInstruction_InstructionOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.CustomInstruction#getInstructionOutput <em>Instruction Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction Output</em>'.
	 * @see org.multicore_association.shim.model.shim.CustomInstruction#getInstructionOutput()
	 * @see #getCustomInstruction()
	 * @generated
	 */
	EReference getCustomInstruction_InstructionOutput();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.DataRate <em>Data Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Rate</em>'.
	 * @see org.multicore_association.shim.model.shim.DataRate
	 * @generated
	 */
	EClass getDataRate();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.DataRate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.multicore_association.shim.model.shim.DataRate#getValue()
	 * @see #getDataRate()
	 * @generated
	 */
	EAttribute getDataRate_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.DataRate#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.DataRate#getUnit()
	 * @see #getDataRate()
	 * @generated
	 */
	EAttribute getDataRate_Unit();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.multicore_association.shim.model.shim.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.multicore_association.shim.model.shim.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.multicore_association.shim.model.shim.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.multicore_association.shim.model.shim.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.multicore_association.shim.model.shim.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.multicore_association.shim.model.shim.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.multicore_association.shim.model.shim.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.DocumentRoot#getShim <em>Shim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shim</em>'.
	 * @see org.multicore_association.shim.model.shim.DocumentRoot#getShim()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Shim();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.EventCommunication <em>Event Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.EventCommunication
	 * @generated
	 */
	EClass getEventCommunication();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.FIFOCommunication <em>FIFO Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FIFO Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.FIFOCommunication
	 * @generated
	 */
	EClass getFIFOCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.FIFOCommunication#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see org.multicore_association.shim.model.shim.FIFOCommunication#getDataSize()
	 * @see #getFIFOCommunication()
	 * @generated
	 */
	EAttribute getFIFOCommunication_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.FIFOCommunication#getDataSizeUnit()
	 * @see #getFIFOCommunication()
	 * @generated
	 */
	EAttribute getFIFOCommunication_DataSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.FIFOCommunication#getQueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Size</em>'.
	 * @see org.multicore_association.shim.model.shim.FIFOCommunication#getQueueSize()
	 * @see #getFIFOCommunication()
	 * @generated
	 */
	EAttribute getFIFOCommunication_QueueSize();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.FrequencyDomain <em>Frequency Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Domain</em>'.
	 * @see org.multicore_association.shim.model.shim.FrequencyDomain
	 * @generated
	 */
	EClass getFrequencyDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.FrequencyDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.FrequencyDomain#getName()
	 * @see #getFrequencyDomain()
	 * @generated
	 */
	EAttribute getFrequencyDomain_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.FrequencyDomain#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.FrequencyDomain#getId()
	 * @see #getFrequencyDomain()
	 * @generated
	 */
	EAttribute getFrequencyDomain_Id();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.FrequencyVoltageSet <em>Frequency Voltage Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Voltage Set</em>'.
	 * @see org.multicore_association.shim.model.shim.FrequencyVoltageSet
	 * @generated
	 */
	EClass getFrequencyVoltageSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.FrequencyVoltageSet#getFrequencyDomain <em>Frequency Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frequency Domain</em>'.
	 * @see org.multicore_association.shim.model.shim.FrequencyVoltageSet#getFrequencyDomain()
	 * @see #getFrequencyVoltageSet()
	 * @generated
	 */
	EReference getFrequencyVoltageSet_FrequencyDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.FrequencyVoltageSet#getVoltageDomain <em>Voltage Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Voltage Domain</em>'.
	 * @see org.multicore_association.shim.model.shim.FrequencyVoltageSet#getVoltageDomain()
	 * @see #getFrequencyVoltageSet()
	 * @generated
	 */
	EReference getFrequencyVoltageSet_VoltageDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.FrequencyVoltageSet#getOperatingPointSet <em>Operating Point Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operating Point Set</em>'.
	 * @see org.multicore_association.shim.model.shim.FrequencyVoltageSet#getOperatingPointSet()
	 * @see #getFrequencyVoltageSet()
	 * @generated
	 */
	EReference getFrequencyVoltageSet_OperatingPointSet();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.FunctionalUnit <em>Functional Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnit
	 * @generated
	 */
	EClass getFunctionalUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.FunctionalUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnit#getName()
	 * @see #getFunctionalUnit()
	 * @generated
	 */
	EAttribute getFunctionalUnit_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.FunctionalUnit#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction</em>'.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnit#getInstruction()
	 * @see #getFunctionalUnit()
	 * @generated
	 */
	EReference getFunctionalUnit_Instruction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.FunctionalUnit#getCustomInstruction <em>Custom Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Instruction</em>'.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnit#getCustomInstruction()
	 * @see #getFunctionalUnit()
	 * @generated
	 */
	EReference getFunctionalUnit_CustomInstruction();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.FunctionalUnitSet <em>Functional Unit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Unit Set</em>'.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnitSet
	 * @generated
	 */
	EClass getFunctionalUnitSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.FunctionalUnitSet#getFunctionalUnit <em>Functional Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnitSet#getFunctionalUnit()
	 * @see #getFunctionalUnitSet()
	 * @generated
	 */
	EReference getFunctionalUnitSet_FunctionalUnit();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.FunctionalUnitSetFile <em>Functional Unit Set File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Unit Set File</em>'.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnitSetFile
	 * @generated
	 */
	EClass getFunctionalUnitSetFile();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.FunctionalUnitSetFile#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.multicore_association.shim.model.shim.FunctionalUnitSetFile#getSrc()
	 * @see #getFunctionalUnitSetFile()
	 * @generated
	 */
	EAttribute getFunctionalUnitSetFile_Src();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see org.multicore_association.shim.model.shim.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Instruction#getImmediateBitWidth <em>Immediate Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate Bit Width</em>'.
	 * @see org.multicore_association.shim.model.shim.Instruction#getImmediateBitWidth()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_ImmediateBitWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Instruction#getInputBitWidth <em>Input Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Bit Width</em>'.
	 * @see org.multicore_association.shim.model.shim.Instruction#getInputBitWidth()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_InputBitWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Instruction#isInputPreserved <em>Input Preserved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Preserved</em>'.
	 * @see org.multicore_association.shim.model.shim.Instruction#isInputPreserved()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_InputPreserved();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Instruction#isIsEmulated <em>Is Emulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Emulated</em>'.
	 * @see org.multicore_association.shim.model.shim.Instruction#isIsEmulated()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_IsEmulated();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Instruction#getOperandAddressing <em>Operand Addressing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operand Addressing</em>'.
	 * @see org.multicore_association.shim.model.shim.Instruction#getOperandAddressing()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_OperandAddressing();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Instruction#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.multicore_association.shim.model.shim.Instruction#getOperation()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Instruction#getOutputBitWidth <em>Output Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Bit Width</em>'.
	 * @see org.multicore_association.shim.model.shim.Instruction#getOutputBitWidth()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_OutputBitWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Instruction#getSupportedSignedness <em>Supported Signedness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supported Signedness</em>'.
	 * @see org.multicore_association.shim.model.shim.Instruction#getSupportedSignedness()
	 * @see #getInstruction()
	 * @generated
	 */
	EAttribute getInstruction_SupportedSignedness();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.InstructionInput <em>Instruction Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Input</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionInput
	 * @generated
	 */
	EClass getInstructionInput();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.InstructionInput#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionInput#getType()
	 * @see #getInstructionInput()
	 * @generated
	 */
	EAttribute getInstructionInput_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.InstructionInput#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionInput#getBitWidth()
	 * @see #getInstructionInput()
	 * @generated
	 */
	EAttribute getInstructionInput_BitWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.InstructionInput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionInput#getValue()
	 * @see #getInstructionInput()
	 * @generated
	 */
	EAttribute getInstructionInput_Value();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.InstructionOperation <em>Instruction Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Operation</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionOperation
	 * @generated
	 */
	EClass getInstructionOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.InstructionOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionOperation#getOperation()
	 * @see #getInstructionOperation()
	 * @generated
	 */
	EAttribute getInstructionOperation_Operation();

	/**
	 * Returns the meta object for the attribute list '{@link org.multicore_association.shim.model.shim.InstructionOperation#getInstructionOperand <em>Instruction Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Instruction Operand</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionOperation#getInstructionOperand()
	 * @see #getInstructionOperation()
	 * @generated
	 */
	EAttribute getInstructionOperation_InstructionOperand();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.InstructionOutput <em>Instruction Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Output</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionOutput
	 * @generated
	 */
	EClass getInstructionOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.InstructionOutput#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionOutput#getType()
	 * @see #getInstructionOutput()
	 * @generated
	 */
	EAttribute getInstructionOutput_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.InstructionOutput#getBitWidth <em>Bit Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Width</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionOutput#getBitWidth()
	 * @see #getInstructionOutput()
	 * @generated
	 */
	EAttribute getInstructionOutput_BitWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.InstructionOutput#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionOutput#getRef()
	 * @see #getInstructionOutput()
	 * @generated
	 */
	EAttribute getInstructionOutput_Ref();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.InterruptCommunication <em>Interrupt Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interrupt Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.InterruptCommunication
	 * @generated
	 */
	EClass getInterruptCommunication();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.Latency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency</em>'.
	 * @see org.multicore_association.shim.model.shim.Latency
	 * @generated
	 */
	EClass getLatency();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.MasterComponent <em>Master Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Component</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent
	 * @generated
	 */
	EClass getMasterComponent();

	/**
	 * Returns the meta object for the reference list '{@link org.multicore_association.shim.model.shim.MasterComponent#getCacheRef <em>Cache Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cache Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getCacheRef()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EReference getMasterComponent_CacheRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.MasterComponent#getAccessTypeSet <em>Access Type Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Type Set</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getAccessTypeSet()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EReference getMasterComponent_AccessTypeSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.MasterComponent#getClockFrequency <em>Clock Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clock Frequency</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getClockFrequency()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EReference getMasterComponent_ClockFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MasterComponent#getArch <em>Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getArch()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_Arch();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MasterComponent#getArchOption <em>Arch Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch Option</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getArchOption()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_ArchOption();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MasterComponent#getEndian <em>Endian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endian</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getEndian()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_Endian();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MasterComponent#getMasterType <em>Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master Type</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getMasterType()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_MasterType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MasterComponent#getNChannel <em>NChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NChannel</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getNChannel()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_NChannel();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MasterComponent#getNThread <em>NThread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NThread</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getNThread()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_NThread();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MasterComponent#getPid <em>Pid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pid</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getPid()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EAttribute getMasterComponent_Pid();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.MasterComponent#getCommonInstructionSet <em>Common Instruction Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Common Instruction Set</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterComponent#getCommonInstructionSet()
	 * @see #getMasterComponent()
	 * @generated
	 */
	EReference getMasterComponent_CommonInstructionSet();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.MasterSlaveBinding <em>Master Slave Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Slave Binding</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterSlaveBinding
	 * @generated
	 */
	EClass getMasterSlaveBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.MasterSlaveBinding#getAccessor <em>Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accessor</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterSlaveBinding#getAccessor()
	 * @see #getMasterSlaveBinding()
	 * @generated
	 */
	EReference getMasterSlaveBinding_Accessor();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.MasterSlaveBinding#getSlaveComponentRef <em>Slave Component Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slave Component Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterSlaveBinding#getSlaveComponentRef()
	 * @see #getMasterSlaveBinding()
	 * @generated
	 */
	EReference getMasterSlaveBinding_SlaveComponentRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.MasterSlaveBindingSet <em>Master Slave Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Slave Binding Set</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterSlaveBindingSet
	 * @generated
	 */
	EClass getMasterSlaveBindingSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.MasterSlaveBindingSet#getMasterSlaveBinding <em>Master Slave Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Master Slave Binding</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterSlaveBindingSet#getMasterSlaveBinding()
	 * @see #getMasterSlaveBindingSet()
	 * @generated
	 */
	EReference getMasterSlaveBindingSet_MasterSlaveBinding();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.MemoryConsistencyModel <em>Memory Consistency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Consistency Model</em>'.
	 * @see org.multicore_association.shim.model.shim.MemoryConsistencyModel
	 * @generated
	 */
	EClass getMemoryConsistencyModel();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MemoryConsistencyModel#getRawOrdering <em>Raw Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Ordering</em>'.
	 * @see org.multicore_association.shim.model.shim.MemoryConsistencyModel#getRawOrdering()
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 */
	EAttribute getMemoryConsistencyModel_RawOrdering();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MemoryConsistencyModel#getWarOrdering <em>War Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>War Ordering</em>'.
	 * @see org.multicore_association.shim.model.shim.MemoryConsistencyModel#getWarOrdering()
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 */
	EAttribute getMemoryConsistencyModel_WarOrdering();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MemoryConsistencyModel#getWawOrdering <em>Waw Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waw Ordering</em>'.
	 * @see org.multicore_association.shim.model.shim.MemoryConsistencyModel#getWawOrdering()
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 */
	EAttribute getMemoryConsistencyModel_WawOrdering();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.MemoryConsistencyModel#getRarOrdering <em>Rar Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rar Ordering</em>'.
	 * @see org.multicore_association.shim.model.shim.MemoryConsistencyModel#getRarOrdering()
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 */
	EAttribute getMemoryConsistencyModel_RarOrdering();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.OperatingPoint <em>Operating Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Point</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPoint
	 * @generated
	 */
	EClass getOperatingPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.OperatingPoint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPoint#getName()
	 * @see #getOperatingPoint()
	 * @generated
	 */
	EAttribute getOperatingPoint_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.OperatingPoint#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPoint#getId()
	 * @see #getOperatingPoint()
	 * @generated
	 */
	EAttribute getOperatingPoint_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPoint#getFrequency()
	 * @see #getOperatingPoint()
	 * @generated
	 */
	EAttribute getOperatingPoint_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequencyUnit <em>Frequency Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPoint#getFrequencyUnit()
	 * @see #getOperatingPoint()
	 * @generated
	 */
	EAttribute getOperatingPoint_FrequencyUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltage <em>Voltage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPoint#getVoltage()
	 * @see #getOperatingPoint()
	 * @generated
	 */
	EAttribute getOperatingPoint_Voltage();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltageUnit <em>Voltage Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voltage Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPoint#getVoltageUnit()
	 * @see #getOperatingPoint()
	 * @generated
	 */
	EAttribute getOperatingPoint_VoltageUnit();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.OperatingPointSet <em>Operating Point Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating Point Set</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPointSet
	 * @generated
	 */
	EClass getOperatingPointSet();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.OperatingPointSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPointSet#getName()
	 * @see #getOperatingPointSet()
	 * @generated
	 */
	EAttribute getOperatingPointSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.OperatingPointSet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPointSet#getId()
	 * @see #getOperatingPointSet()
	 * @generated
	 */
	EAttribute getOperatingPointSet_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.OperatingPointSet#getOperatingPoint <em>Operating Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operating Point</em>'.
	 * @see org.multicore_association.shim.model.shim.OperatingPointSet#getOperatingPoint()
	 * @see #getOperatingPointSet()
	 * @generated
	 */
	EReference getOperatingPointSet_OperatingPoint();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance</em>'.
	 * @see org.multicore_association.shim.model.shim.Performance
	 * @generated
	 */
	EClass getPerformance();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.Performance#getAccessTypeRef <em>Access Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Type Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.Performance#getAccessTypeRef()
	 * @see #getPerformance()
	 * @generated
	 */
	EReference getPerformance_AccessTypeRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.Performance#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pitch</em>'.
	 * @see org.multicore_association.shim.model.shim.Performance#getPitch()
	 * @see #getPerformance()
	 * @generated
	 */
	EReference getPerformance_Pitch();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.Performance#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see org.multicore_association.shim.model.shim.Performance#getLatency()
	 * @see #getPerformance()
	 * @generated
	 */
	EReference getPerformance_Latency();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.PerformanceSet <em>Performance Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance Set</em>'.
	 * @see org.multicore_association.shim.model.shim.PerformanceSet
	 * @generated
	 */
	EClass getPerformanceSet();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.PerformanceSet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.PerformanceSet#getId()
	 * @see #getPerformanceSet()
	 * @generated
	 */
	EAttribute getPerformanceSet_Id();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.PerformanceSet#getCacheRef <em>Cache Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cache Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.PerformanceSet#getCacheRef()
	 * @see #getPerformanceSet()
	 * @generated
	 */
	EReference getPerformanceSet_CacheRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.PerformanceSet#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performance</em>'.
	 * @see org.multicore_association.shim.model.shim.PerformanceSet#getPerformance()
	 * @see #getPerformanceSet()
	 * @generated
	 */
	EReference getPerformanceSet_Performance();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.Pitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pitch</em>'.
	 * @see org.multicore_association.shim.model.shim.Pitch
	 * @generated
	 */
	EClass getPitch();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.PowerConfiguration <em>Power Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Configuration</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConfiguration
	 * @generated
	 */
	EClass getPowerConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.PowerConfiguration#getSystemConfigurationSrc <em>System Configuration Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Configuration Src</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConfiguration#getSystemConfigurationSrc()
	 * @see #getPowerConfiguration()
	 * @generated
	 */
	EAttribute getPowerConfiguration_SystemConfigurationSrc();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.PowerConfiguration#getPowerConsumptionSet <em>Power Consumption Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Power Consumption Set</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConfiguration#getPowerConsumptionSet()
	 * @see #getPowerConfiguration()
	 * @generated
	 */
	EReference getPowerConfiguration_PowerConsumptionSet();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.PowerConsumption <em>Power Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Consumption</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConsumption
	 * @generated
	 */
	EClass getPowerConsumption();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.PowerConsumption#getOperatingPointRef <em>Operating Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operating Point Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConsumption#getOperatingPointRef()
	 * @see #getPowerConsumption()
	 * @generated
	 */
	EReference getPowerConsumption_OperatingPointRef();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.PowerConsumption#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConsumption#getPower()
	 * @see #getPowerConsumption()
	 * @generated
	 */
	EAttribute getPowerConsumption_Power();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.PowerConsumption#getPowerUnit <em>Power Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConsumption#getPowerUnit()
	 * @see #getPowerConsumption()
	 * @generated
	 */
	EAttribute getPowerConsumption_PowerUnit();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.PowerConsumptionSet <em>Power Consumption Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Consumption Set</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConsumptionSet
	 * @generated
	 */
	EClass getPowerConsumptionSet();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConsumptionSet#getName()
	 * @see #getPowerConsumptionSet()
	 * @generated
	 */
	EAttribute getPowerConsumptionSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConsumptionSet#getId()
	 * @see #getPowerConsumptionSet()
	 * @generated
	 */
	EAttribute getPowerConsumptionSet_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getPowerConsumption <em>Power Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Consumption</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConsumptionSet#getPowerConsumption()
	 * @see #getPowerConsumptionSet()
	 * @generated
	 */
	EReference getPowerConsumptionSet_PowerConsumption();

	/**
	 * Returns the meta object for the reference list '{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getPowerConsumerRef <em>Power Consumer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Consumer Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerConsumptionSet#getPowerConsumerRef()
	 * @see #getPowerConsumptionSet()
	 * @generated
	 */
	EReference getPowerConsumptionSet_PowerConsumerRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication <em>Shared Memory Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Memory Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedMemoryCommunication
	 * @generated
	 */
	EClass getSharedMemoryCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getOperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Type</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedMemoryCommunication#getOperationType()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EAttribute getSharedMemoryCommunication_OperationType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSize()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EAttribute getSharedMemoryCommunication_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSizeUnit <em>Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedMemoryCommunication#getDataSizeUnit()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EAttribute getSharedMemoryCommunication_DataSizeUnit();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getAddressSpaceRef <em>Address Space Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address Space Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedMemoryCommunication#getAddressSpaceRef()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EReference getSharedMemoryCommunication_AddressSpaceRef();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.SharedMemoryCommunication#getSubSpaceRef <em>Sub Space Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Space Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedMemoryCommunication#getSubSpaceRef()
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	EReference getSharedMemoryCommunication_SubSpaceRef();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication <em>Shared Register Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shared Register Communication</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedRegisterCommunication
	 * @generated
	 */
	EClass getSharedRegisterCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication#getDataSize <em>Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedRegisterCommunication#getDataSize()
	 * @see #getSharedRegisterCommunication()
	 * @generated
	 */
	EAttribute getSharedRegisterCommunication_DataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication#getDataSizeUnit <em>Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Size Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedRegisterCommunication#getDataSizeUnit()
	 * @see #getSharedRegisterCommunication()
	 * @generated
	 */
	EAttribute getSharedRegisterCommunication_DataSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication#getNRegister <em>NRegister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NRegister</em>'.
	 * @see org.multicore_association.shim.model.shim.SharedRegisterCommunication#getNRegister()
	 * @see #getSharedRegisterCommunication()
	 * @generated
	 */
	EAttribute getSharedRegisterCommunication_NRegister();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.Shim <em>Shim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shim</em>'.
	 * @see org.multicore_association.shim.model.shim.Shim
	 * @generated
	 */
	EClass getShim();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.Shim#getSystemConfiguration <em>System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Configuration</em>'.
	 * @see org.multicore_association.shim.model.shim.Shim#getSystemConfiguration()
	 * @see #getShim()
	 * @generated
	 */
	EReference getShim_SystemConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.Shim#getPowerConfiguration <em>Power Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Power Configuration</em>'.
	 * @see org.multicore_association.shim.model.shim.Shim#getPowerConfiguration()
	 * @see #getShim()
	 * @generated
	 */
	EReference getShim_PowerConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.Shim#getFunctionalUnitSet <em>Functional Unit Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Unit Set</em>'.
	 * @see org.multicore_association.shim.model.shim.Shim#getFunctionalUnitSet()
	 * @see #getShim()
	 * @generated
	 */
	EReference getShim_FunctionalUnitSet();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.SlaveComponent <em>Slave Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slave Component</em>'.
	 * @see org.multicore_association.shim.model.shim.SlaveComponent
	 * @generated
	 */
	EClass getSlaveComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SlaveComponent#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.multicore_association.shim.model.shim.SlaveComponent#getSize()
	 * @see #getSlaveComponent()
	 * @generated
	 */
	EAttribute getSlaveComponent_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SlaveComponent#getSizeUnit <em>Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.SlaveComponent#getSizeUnit()
	 * @see #getSlaveComponent()
	 * @generated
	 */
	EAttribute getSlaveComponent_SizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SlaveComponent#getRwType <em>Rw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rw Type</em>'.
	 * @see org.multicore_association.shim.model.shim.SlaveComponent#getRwType()
	 * @see #getSlaveComponent()
	 * @generated
	 */
	EAttribute getSlaveComponent_RwType();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.SubSpace <em>Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Space</em>'.
	 * @see org.multicore_association.shim.model.shim.SubSpace
	 * @generated
	 */
	EClass getSubSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SubSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.SubSpace#getName()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SubSpace#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.SubSpace#getId()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SubSpace#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.multicore_association.shim.model.shim.SubSpace#getStart()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SubSpace#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.multicore_association.shim.model.shim.SubSpace#getEnd()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_End();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.SubSpace#getEndian <em>Endian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endian</em>'.
	 * @see org.multicore_association.shim.model.shim.SubSpace#getEndian()
	 * @see #getSubSpace()
	 * @generated
	 */
	EAttribute getSubSpace_Endian();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.SubSpace#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Slave Binding Set</em>'.
	 * @see org.multicore_association.shim.model.shim.SubSpace#getMasterSlaveBindingSet()
	 * @see #getSubSpace()
	 * @generated
	 */
	EReference getSubSpace_MasterSlaveBindingSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.multicore_association.shim.model.shim.SubSpace#getMemoryConsistencyModel <em>Memory Consistency Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Consistency Model</em>'.
	 * @see org.multicore_association.shim.model.shim.SubSpace#getMemoryConsistencyModel()
	 * @see #getSubSpace()
	 * @generated
	 */
	EReference getSubSpace_MemoryConsistencyModel();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.SystemConfiguration <em>System Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Configuration</em>'.
	 * @see org.multicore_association.shim.model.shim.SystemConfiguration
	 * @generated
	 */
	EClass getSystemConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getComponentSet <em>Component Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Set</em>'.
	 * @see org.multicore_association.shim.model.shim.SystemConfiguration#getComponentSet()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_ComponentSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getAddressSpaceSet <em>Address Space Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Space Set</em>'.
	 * @see org.multicore_association.shim.model.shim.SystemConfiguration#getAddressSpaceSet()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_AddressSpaceSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getCommunicationSet <em>Communication Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication Set</em>'.
	 * @see org.multicore_association.shim.model.shim.SystemConfiguration#getCommunicationSet()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_CommunicationSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getFrequencyVoltageSet <em>Frequency Voltage Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency Voltage Set</em>'.
	 * @see org.multicore_association.shim.model.shim.SystemConfiguration#getFrequencyVoltageSet()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_FrequencyVoltageSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getContentionGroupSet <em>Contention Group Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contention Group Set</em>'.
	 * @see org.multicore_association.shim.model.shim.SystemConfiguration#getContentionGroupSet()
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	EReference getSystemConfiguration_ContentionGroupSet();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.Throughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throughput</em>'.
	 * @see org.multicore_association.shim.model.shim.Throughput
	 * @generated
	 */
	EClass getThroughput();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.model.shim.Throughput#getFrequencyDomainRef <em>Frequency Domain Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frequency Domain Ref</em>'.
	 * @see org.multicore_association.shim.model.shim.Throughput#getFrequencyDomainRef()
	 * @see #getThroughput()
	 * @generated
	 */
	EReference getThroughput_FrequencyDomainRef();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Throughput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.multicore_association.shim.model.shim.Throughput#getValue()
	 * @see #getThroughput()
	 * @generated
	 */
	EAttribute getThroughput_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.Throughput#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.multicore_association.shim.model.shim.Throughput#getUnit()
	 * @see #getThroughput()
	 * @generated
	 */
	EAttribute getThroughput_Unit();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.model.shim.VoltageDomain <em>Voltage Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voltage Domain</em>'.
	 * @see org.multicore_association.shim.model.shim.VoltageDomain
	 * @generated
	 */
	EClass getVoltageDomain();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.VoltageDomain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.multicore_association.shim.model.shim.VoltageDomain#getName()
	 * @see #getVoltageDomain()
	 * @generated
	 */
	EAttribute getVoltageDomain_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.model.shim.VoltageDomain#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.multicore_association.shim.model.shim.VoltageDomain#getId()
	 * @see #getVoltageDomain()
	 * @generated
	 */
	EAttribute getVoltageDomain_Id();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.CacheCoherencyType <em>Cache Coherency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Coherency Type</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
	 * @generated
	 */
	EEnum getCacheCoherencyType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.CachePrefetchType <em>Cache Prefetch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Prefetch Type</em>'.
	 * @see org.multicore_association.shim.model.shim.CachePrefetchType
	 * @generated
	 */
	EEnum getCachePrefetchType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.CacheReplacementType <em>Cache Replacement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Replacement Type</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheReplacementType
	 * @generated
	 */
	EEnum getCacheReplacementType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.CacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Type</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheType
	 * @generated
	 */
	EEnum getCacheType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.CacheWriteAllocateType <em>Cache Write Allocate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Write Allocate Type</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheWriteAllocateType
	 * @generated
	 */
	EEnum getCacheWriteAllocateType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.CacheWriteBackType <em>Cache Write Back Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Write Back Type</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheWriteBackType
	 * @generated
	 */
	EEnum getCacheWriteBackType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.DataRateUnitType <em>Data Rate Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Rate Unit Type</em>'.
	 * @see org.multicore_association.shim.model.shim.DataRateUnitType
	 * @generated
	 */
	EEnum getDataRateUnitType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.EndianType <em>Endian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Endian Type</em>'.
	 * @see org.multicore_association.shim.model.shim.EndianType
	 * @generated
	 */
	EEnum getEndianType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.FrequencyUnitType <em>Frequency Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frequency Unit Type</em>'.
	 * @see org.multicore_association.shim.model.shim.FrequencyUnitType
	 * @generated
	 */
	EEnum getFrequencyUnitType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.InstructionInputType <em>Instruction Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instruction Input Type</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionInputType
	 * @generated
	 */
	EEnum getInstructionInputType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.InstructionOutputType <em>Instruction Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Instruction Output Type</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionOutputType
	 * @generated
	 */
	EEnum getInstructionOutputType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.LockDownType <em>Lock Down Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lock Down Type</em>'.
	 * @see org.multicore_association.shim.model.shim.LockDownType
	 * @generated
	 */
	EEnum getLockDownType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.MasterType <em>Master Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Master Type</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterType
	 * @generated
	 */
	EEnum getMasterType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.OperandAddressingType <em>Operand Addressing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operand Addressing Type</em>'.
	 * @see org.multicore_association.shim.model.shim.OperandAddressingType
	 * @generated
	 */
	EEnum getOperandAddressingType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see org.multicore_association.shim.model.shim.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.OrderingType <em>Ordering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ordering Type</em>'.
	 * @see org.multicore_association.shim.model.shim.OrderingType
	 * @generated
	 */
	EEnum getOrderingType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.PowerUnitType <em>Power Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Power Unit Type</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerUnitType
	 * @generated
	 */
	EEnum getPowerUnitType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.RWType <em>RW Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RW Type</em>'.
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @generated
	 */
	EEnum getRWType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.SignednessType <em>Signedness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signedness Type</em>'.
	 * @see org.multicore_association.shim.model.shim.SignednessType
	 * @generated
	 */
	EEnum getSignednessType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.SizeUnitType <em>Size Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Unit Type</em>'.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @generated
	 */
	EEnum getSizeUnitType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.ThroughputUnitType <em>Throughput Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Throughput Unit Type</em>'.
	 * @see org.multicore_association.shim.model.shim.ThroughputUnitType
	 * @generated
	 */
	EEnum getThroughputUnitType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.model.shim.VoltageUnitType <em>Voltage Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Voltage Unit Type</em>'.
	 * @see org.multicore_association.shim.model.shim.VoltageUnitType
	 * @generated
	 */
	EEnum getVoltageUnitType();

	/**
	 * Returns the meta object for data type '<em>Address Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address Value Type</em>'.
	 * @model instanceClass="long"
	 *        extendedMetaData="name='AddressValueType' minInclusive='0'"
	 * @generated
	 */
	EDataType getAddressValueType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Address Value Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Address Value Object Type</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 *        extendedMetaData="name='AddressValueObjectType' minInclusive='0'"
	 * @generated
	 */
	EDataType getAddressValueObjectType();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.CacheCoherencyType <em>Cache Coherency Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cache Coherency Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
	 * @model instanceClass="org.multicore_association.shim.model.shim.CacheCoherencyType"
	 *        extendedMetaData="name='CacheCoherencyType:Object' baseType='CacheCoherencyType'"
	 * @generated
	 */
	EDataType getCacheCoherencyTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.CachePrefetchType <em>Cache Prefetch Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cache Prefetch Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.CachePrefetchType
	 * @model instanceClass="org.multicore_association.shim.model.shim.CachePrefetchType"
	 *        extendedMetaData="name='CachePrefetchType:Object' baseType='CachePrefetchType'"
	 * @generated
	 */
	EDataType getCachePrefetchTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.CacheReplacementType <em>Cache Replacement Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cache Replacement Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheReplacementType
	 * @model instanceClass="org.multicore_association.shim.model.shim.CacheReplacementType"
	 *        extendedMetaData="name='CacheReplacementType:Object' baseType='CacheReplacementType'"
	 * @generated
	 */
	EDataType getCacheReplacementTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.CacheType <em>Cache Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cache Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheType
	 * @model instanceClass="org.multicore_association.shim.model.shim.CacheType"
	 *        extendedMetaData="name='CacheType:Object' baseType='CacheType'"
	 * @generated
	 */
	EDataType getCacheTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.CacheWriteAllocateType <em>Cache Write Allocate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cache Write Allocate Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheWriteAllocateType
	 * @model instanceClass="org.multicore_association.shim.model.shim.CacheWriteAllocateType"
	 *        extendedMetaData="name='CacheWriteAllocateType:Object' baseType='CacheWriteAllocateType'"
	 * @generated
	 */
	EDataType getCacheWriteAllocateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.CacheWriteBackType <em>Cache Write Back Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cache Write Back Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.CacheWriteBackType
	 * @model instanceClass="org.multicore_association.shim.model.shim.CacheWriteBackType"
	 *        extendedMetaData="name='CacheWriteBackType:Object' baseType='CacheWriteBackType'"
	 * @generated
	 */
	EDataType getCacheWriteBackTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.DataRateUnitType <em>Data Rate Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Rate Unit Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.DataRateUnitType
	 * @model instanceClass="org.multicore_association.shim.model.shim.DataRateUnitType"
	 *        extendedMetaData="name='DataRateUnitType:Object' baseType='DataRateUnitType'"
	 * @generated
	 */
	EDataType getDataRateUnitTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.EndianType <em>Endian Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Endian Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.EndianType
	 * @model instanceClass="org.multicore_association.shim.model.shim.EndianType"
	 *        extendedMetaData="name='EndianType:Object' baseType='EndianType'"
	 * @generated
	 */
	EDataType getEndianTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.FrequencyUnitType <em>Frequency Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frequency Unit Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.FrequencyUnitType
	 * @model instanceClass="org.multicore_association.shim.model.shim.FrequencyUnitType"
	 *        extendedMetaData="name='FrequencyUnitType:Object' baseType='FrequencyUnitType'"
	 * @generated
	 */
	EDataType getFrequencyUnitTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.InstructionInputType <em>Instruction Input Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instruction Input Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionInputType
	 * @model instanceClass="org.multicore_association.shim.model.shim.InstructionInputType"
	 *        extendedMetaData="name='InstructionInputType:Object' baseType='InstructionInputType'"
	 * @generated
	 */
	EDataType getInstructionInputTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.InstructionOutputType <em>Instruction Output Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Instruction Output Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.InstructionOutputType
	 * @model instanceClass="org.multicore_association.shim.model.shim.InstructionOutputType"
	 *        extendedMetaData="name='InstructionOutputType:Object' baseType='InstructionOutputType'"
	 * @generated
	 */
	EDataType getInstructionOutputTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.LockDownType <em>Lock Down Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lock Down Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.LockDownType
	 * @model instanceClass="org.multicore_association.shim.model.shim.LockDownType"
	 *        extendedMetaData="name='LockDownType:Object' baseType='LockDownType'"
	 * @generated
	 */
	EDataType getLockDownTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.MasterType <em>Master Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Master Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.MasterType
	 * @model instanceClass="org.multicore_association.shim.model.shim.MasterType"
	 *        extendedMetaData="name='MasterType:Object' baseType='MasterType'"
	 * @generated
	 */
	EDataType getMasterTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.OperandAddressingType <em>Operand Addressing Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operand Addressing Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.OperandAddressingType
	 * @model instanceClass="org.multicore_association.shim.model.shim.OperandAddressingType"
	 *        extendedMetaData="name='OperandAddressingType:Object' baseType='OperandAddressingType'"
	 * @generated
	 */
	EDataType getOperandAddressingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.OperationType <em>Operation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.OperationType
	 * @model instanceClass="org.multicore_association.shim.model.shim.OperationType"
	 *        extendedMetaData="name='OperationType:Object' baseType='OperationType'"
	 * @generated
	 */
	EDataType getOperationTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.OrderingType <em>Ordering Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ordering Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.OrderingType
	 * @model instanceClass="org.multicore_association.shim.model.shim.OrderingType"
	 *        extendedMetaData="name='OrderingType:Object' baseType='OrderingType'"
	 * @generated
	 */
	EDataType getOrderingTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.PowerUnitType <em>Power Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Power Unit Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.PowerUnitType
	 * @model instanceClass="org.multicore_association.shim.model.shim.PowerUnitType"
	 *        extendedMetaData="name='PowerUnitType:Object' baseType='PowerUnitType'"
	 * @generated
	 */
	EDataType getPowerUnitTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.RWType <em>RW Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RW Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @model instanceClass="org.multicore_association.shim.model.shim.RWType"
	 *        extendedMetaData="name='RWType:Object' baseType='RWType'"
	 * @generated
	 */
	EDataType getRWTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.SignednessType <em>Signedness Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Signedness Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.SignednessType
	 * @model instanceClass="org.multicore_association.shim.model.shim.SignednessType"
	 *        extendedMetaData="name='SignednessType:Object' baseType='SignednessType'"
	 * @generated
	 */
	EDataType getSignednessTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.SizeUnitType <em>Size Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Size Unit Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @model instanceClass="org.multicore_association.shim.model.shim.SizeUnitType"
	 *        extendedMetaData="name='SizeUnitType:Object' baseType='SizeUnitType'"
	 * @generated
	 */
	EDataType getSizeUnitTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.ThroughputUnitType <em>Throughput Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throughput Unit Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.ThroughputUnitType
	 * @model instanceClass="org.multicore_association.shim.model.shim.ThroughputUnitType"
	 *        extendedMetaData="name='ThroughputUnitType:Object' baseType='ThroughputUnitType'"
	 * @generated
	 */
	EDataType getThroughputUnitTypeObject();

	/**
	 * Returns the meta object for data type '<em>Unsigned Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsigned Float Type</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='UnsignedIntType' minInclusive='0'"
	 * @generated
	 */
	EDataType getUnsignedFloatType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Unsigned Float Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsigned Float Object Type</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='UnsignedIntObjectType' minInclusive='0'"
	 * @generated
	 */
	EDataType getUnsignedFloatObjectType();

	/**
	 * Returns the meta object for data type '<em>Unsigned Int Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsigned Int Type</em>'.
	 * @model instanceClass="int"
	 *        extendedMetaData="name='UnsignedIntType' minInclusive='0'"
	 * @generated
	 */
	EDataType getUnsignedIntType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Unsigned Int Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unsigned Int Object Type</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 *        extendedMetaData="name='UnsignedIntObjectType' minInclusive='0'"
	 * @generated
	 */
	EDataType getUnsignedIntObjectType();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.model.shim.VoltageUnitType <em>Voltage Unit Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Voltage Unit Type Object</em>'.
	 * @see org.multicore_association.shim.model.shim.VoltageUnitType
	 * @model instanceClass="org.multicore_association.shim.model.shim.VoltageUnitType"
	 *        extendedMetaData="name='VoltageUnitType:Object' baseType='VoltageUnitType'"
	 * @generated
	 */
	EDataType getVoltageUnitTypeObject();

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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AbstractCommunicationImpl <em>Abstract Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AbstractCommunicationImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractCommunication()
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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AbstractComponentImpl <em>Abstract Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AbstractComponentImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractComponent()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT = eINSTANCE.getAbstractComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT__NAME = eINSTANCE.getAbstractComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT__ID = eINSTANCE.getAbstractComponent_Id();

		/**
		 * The meta object literal for the '<em><b>Frequency Domain Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF = eINSTANCE.getAbstractComponent_FrequencyDomainRef();

		/**
		 * The meta object literal for the '<em><b>Voltage Domain Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF = eINSTANCE.getAbstractComponent_VoltageDomainRef();

		/**
		 * The meta object literal for the '<em><b>Operating Point Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT__OPERATING_POINT_REF = eINSTANCE.getAbstractComponent_OperatingPointRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl <em>Abstract Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractInstruction()
		 * @generated
		 */
		EClass ABSTRACT_INSTRUCTION = eINSTANCE.getAbstractInstruction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INSTRUCTION__NAME = eINSTANCE.getAbstractInstruction_Name();

		/**
		 * The meta object literal for the '<em><b>Encoding Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INSTRUCTION__ENCODING_LENGTH = eINSTANCE.getAbstractInstruction_EncodingLength();

		/**
		 * The meta object literal for the '<em><b>NInputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INSTRUCTION__NINPUTS = eINSTANCE.getAbstractInstruction_NInputs();

		/**
		 * The meta object literal for the '<em><b>NOutputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INSTRUCTION__NOUTPUTS = eINSTANCE.getAbstractInstruction_NOutputs();

		/**
		 * The meta object literal for the '<em><b>SIMD Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INSTRUCTION__SIMD_WIDTH = eINSTANCE.getAbstractInstruction_SIMDWidth();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_INSTRUCTION__PERFORMANCE = eINSTANCE.getAbstractInstruction_Performance();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AbstractPerformanceImpl <em>Abstract Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AbstractPerformanceImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractPerformance()
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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AbstractShimImpl <em>Abstract Shim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AbstractShimImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAbstractShim()
		 * @generated
		 */
		EClass ABSTRACT_SHIM = eINSTANCE.getAbstractShim();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHIM__NAME = eINSTANCE.getAbstractShim_Name();

		/**
		 * The meta object literal for the '<em><b>Shim Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SHIM__SHIM_VERSION = eINSTANCE.getAbstractShim_ShimVersion();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AccessorImpl <em>Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AccessorImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAccessor()
		 * @generated
		 */
		EClass ACCESSOR = eINSTANCE.getAccessor();

		/**
		 * The meta object literal for the '<em><b>Master Component Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSOR__MASTER_COMPONENT_REF = eINSTANCE.getAccessor_MasterComponentRef();

		/**
		 * The meta object literal for the '<em><b>Performance Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSOR__PERFORMANCE_SET = eINSTANCE.getAccessor_PerformanceSet();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AccessTypeImpl <em>Access Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AccessTypeImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAccessType()
		 * @generated
		 */
		EClass ACCESS_TYPE = eINSTANCE.getAccessType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__NAME = eINSTANCE.getAccessType_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__ID = eINSTANCE.getAccessType_Id();

		/**
		 * The meta object literal for the '<em><b>Rw Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__RW_TYPE = eINSTANCE.getAccessType_RwType();

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
		 * The meta object literal for the '<em><b>NBurst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE__NBURST = eINSTANCE.getAccessType_NBurst();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AccessTypeSetImpl <em>Access Type Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AccessTypeSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAccessTypeSet()
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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AddressSpaceImpl <em>Address Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AddressSpaceImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAddressSpace()
		 * @generated
		 */
		EClass ADDRESS_SPACE = eINSTANCE.getAddressSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE__NAME = eINSTANCE.getAddressSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE__ID = eINSTANCE.getAddressSpace_Id();

		/**
		 * The meta object literal for the '<em><b>Sub Space</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_SPACE__SUB_SPACE = eINSTANCE.getAddressSpace_SubSpace();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.AddressSpaceSetImpl <em>Address Space Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.AddressSpaceSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAddressSpaceSet()
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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.CacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.CacheImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCache()
		 * @generated
		 */
		EClass CACHE = eINSTANCE.getCache();

		/**
		 * The meta object literal for the '<em><b>Cache Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__CACHE_TYPE = eINSTANCE.getCache_CacheType();

		/**
		 * The meta object literal for the '<em><b>Cache Coherency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__CACHE_COHERENCY = eINSTANCE.getCache_CacheCoherency();

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
		 * The meta object literal for the '<em><b>NWay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__NWAY = eINSTANCE.getCache_NWay();

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
		 * The meta object literal for the '<em><b>Prefetch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__PREFETCH = eINSTANCE.getCache_Prefetch();

		/**
		 * The meta object literal for the '<em><b>Prefetch Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__PREFETCH_DISTANCE = eINSTANCE.getCache_PrefetchDistance();

		/**
		 * The meta object literal for the '<em><b>Replacement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__REPLACEMENT = eINSTANCE.getCache_Replacement();

		/**
		 * The meta object literal for the '<em><b>Write Allocate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__WRITE_ALLOCATE = eINSTANCE.getCache_WriteAllocate();

		/**
		 * The meta object literal for the '<em><b>Write Back</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE__WRITE_BACK = eINSTANCE.getCache_WriteBack();

		/**
		 * The meta object literal for the '<em><b>Cache Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE__CACHE_REF = eINSTANCE.getCache_CacheRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.ClockFrequencyImpl <em>Clock Frequency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ClockFrequencyImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getClockFrequency()
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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.CommonInstructionSetImpl <em>Common Instruction Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.CommonInstructionSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCommonInstructionSet()
		 * @generated
		 */
		EClass COMMON_INSTRUCTION_SET = eINSTANCE.getCommonInstructionSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_INSTRUCTION_SET__NAME = eINSTANCE.getCommonInstructionSet_Name();

		/**
		 * The meta object literal for the '<em><b>Functional Unit Set File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE = eINSTANCE
				.getCommonInstructionSet_FunctionalUnitSetFile();

		/**
		 * The meta object literal for the '<em><b>Functional Unit Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET = eINSTANCE.getCommonInstructionSet_FunctionalUnitSet();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.CommunicationSetImpl <em>Communication Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.CommunicationSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCommunicationSet()
		 * @generated
		 */
		EClass COMMUNICATION_SET = eINSTANCE.getCommunicationSet();

		/**
		 * The meta object literal for the '<em><b>Shared Memory Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION = eINSTANCE
				.getCommunicationSet_SharedMemoryCommunication();

		/**
		 * The meta object literal for the '<em><b>Shared Register Communication</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION = eINSTANCE
				.getCommunicationSet_SharedRegisterCommunication();

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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.ComponentSetImpl <em>Component Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ComponentSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getComponentSet()
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
		 * The meta object literal for the '<em><b>Master Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SET__MASTER_COMPONENT = eINSTANCE.getComponentSet_MasterComponent();

		/**
		 * The meta object literal for the '<em><b>Slave Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SET__SLAVE_COMPONENT = eINSTANCE.getComponentSet_SlaveComponent();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SET__CACHE = eINSTANCE.getComponentSet_Cache();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ConnectionImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM = eINSTANCE.getConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO = eINSTANCE.getConnection_To();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__PERFORMANCE = eINSTANCE.getConnection_Performance();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.ConnectionSetImpl <em>Connection Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ConnectionSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getConnectionSet()
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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.ContentionGroupImpl <em>Contention Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ContentionGroupImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getContentionGroup()
		 * @generated
		 */
		EClass CONTENTION_GROUP = eINSTANCE.getContentionGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENTION_GROUP__NAME = eINSTANCE.getContentionGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENTION_GROUP__ID = eINSTANCE.getContentionGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTION_GROUP__THROUGHPUT = eINSTANCE.getContentionGroup_Throughput();

		/**
		 * The meta object literal for the '<em><b>Data Rate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTION_GROUP__DATA_RATE = eINSTANCE.getContentionGroup_DataRate();

		/**
		 * The meta object literal for the '<em><b>Performance Set Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTION_GROUP__PERFORMANCE_SET_REF = eINSTANCE.getContentionGroup_PerformanceSetRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.ContentionGroupSetImpl <em>Contention Group Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ContentionGroupSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getContentionGroupSet()
		 * @generated
		 */
		EClass CONTENTION_GROUP_SET = eINSTANCE.getContentionGroupSet();

		/**
		 * The meta object literal for the '<em><b>Contention Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTION_GROUP_SET__CONTENTION_GROUP = eINSTANCE.getContentionGroupSet_ContentionGroup();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.CustomInstructionImpl <em>Custom Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.CustomInstructionImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCustomInstruction()
		 * @generated
		 */
		EClass CUSTOM_INSTRUCTION = eINSTANCE.getCustomInstruction();

		/**
		 * The meta object literal for the '<em><b>Instruction Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_INSTRUCTION__INSTRUCTION_INPUT = eINSTANCE.getCustomInstruction_InstructionInput();

		/**
		 * The meta object literal for the '<em><b>Instruction Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_INSTRUCTION__INSTRUCTION_OPERATION = eINSTANCE.getCustomInstruction_InstructionOperation();

		/**
		 * The meta object literal for the '<em><b>Instruction Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_INSTRUCTION__INSTRUCTION_OUTPUT = eINSTANCE.getCustomInstruction_InstructionOutput();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.DataRateImpl <em>Data Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.DataRateImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getDataRate()
		 * @generated
		 */
		EClass DATA_RATE = eINSTANCE.getDataRate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RATE__VALUE = eINSTANCE.getDataRate_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_RATE__UNIT = eINSTANCE.getDataRate_Unit();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.DocumentRootImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Shim</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SHIM = eINSTANCE.getDocumentRoot_Shim();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.EventCommunicationImpl <em>Event Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.EventCommunicationImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getEventCommunication()
		 * @generated
		 */
		EClass EVENT_COMMUNICATION = eINSTANCE.getEventCommunication();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.FIFOCommunicationImpl <em>FIFO Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.FIFOCommunicationImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFIFOCommunication()
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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.FrequencyDomainImpl <em>Frequency Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.FrequencyDomainImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFrequencyDomain()
		 * @generated
		 */
		EClass FREQUENCY_DOMAIN = eINSTANCE.getFrequencyDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_DOMAIN__NAME = eINSTANCE.getFrequencyDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREQUENCY_DOMAIN__ID = eINSTANCE.getFrequencyDomain_Id();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.FrequencyVoltageSetImpl <em>Frequency Voltage Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.FrequencyVoltageSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFrequencyVoltageSet()
		 * @generated
		 */
		EClass FREQUENCY_VOLTAGE_SET = eINSTANCE.getFrequencyVoltageSet();

		/**
		 * The meta object literal for the '<em><b>Frequency Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_VOLTAGE_SET__FREQUENCY_DOMAIN = eINSTANCE.getFrequencyVoltageSet_FrequencyDomain();

		/**
		 * The meta object literal for the '<em><b>Voltage Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_VOLTAGE_SET__VOLTAGE_DOMAIN = eINSTANCE.getFrequencyVoltageSet_VoltageDomain();

		/**
		 * The meta object literal for the '<em><b>Operating Point Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREQUENCY_VOLTAGE_SET__OPERATING_POINT_SET = eINSTANCE.getFrequencyVoltageSet_OperatingPointSet();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitImpl <em>Functional Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.FunctionalUnitImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFunctionalUnit()
		 * @generated
		 */
		EClass FUNCTIONAL_UNIT = eINSTANCE.getFunctionalUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_UNIT__NAME = eINSTANCE.getFunctionalUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_UNIT__INSTRUCTION = eINSTANCE.getFunctionalUnit_Instruction();

		/**
		 * The meta object literal for the '<em><b>Custom Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_UNIT__CUSTOM_INSTRUCTION = eINSTANCE.getFunctionalUnit_CustomInstruction();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitSetImpl <em>Functional Unit Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.FunctionalUnitSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFunctionalUnitSet()
		 * @generated
		 */
		EClass FUNCTIONAL_UNIT_SET = eINSTANCE.getFunctionalUnitSet();

		/**
		 * The meta object literal for the '<em><b>Functional Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_UNIT_SET__FUNCTIONAL_UNIT = eINSTANCE.getFunctionalUnitSet_FunctionalUnit();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitSetFileImpl <em>Functional Unit Set File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.FunctionalUnitSetFileImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFunctionalUnitSetFile()
		 * @generated
		 */
		EClass FUNCTIONAL_UNIT_SET_FILE = eINSTANCE.getFunctionalUnitSetFile();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_UNIT_SET_FILE__SRC = eINSTANCE.getFunctionalUnitSetFile_Src();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.InstructionImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Immediate Bit Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__IMMEDIATE_BIT_WIDTH = eINSTANCE.getInstruction_ImmediateBitWidth();

		/**
		 * The meta object literal for the '<em><b>Input Bit Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__INPUT_BIT_WIDTH = eINSTANCE.getInstruction_InputBitWidth();

		/**
		 * The meta object literal for the '<em><b>Input Preserved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__INPUT_PRESERVED = eINSTANCE.getInstruction_InputPreserved();

		/**
		 * The meta object literal for the '<em><b>Is Emulated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__IS_EMULATED = eINSTANCE.getInstruction_IsEmulated();

		/**
		 * The meta object literal for the '<em><b>Operand Addressing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__OPERAND_ADDRESSING = eINSTANCE.getInstruction_OperandAddressing();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__OPERATION = eINSTANCE.getInstruction_Operation();

		/**
		 * The meta object literal for the '<em><b>Output Bit Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__OUTPUT_BIT_WIDTH = eINSTANCE.getInstruction_OutputBitWidth();

		/**
		 * The meta object literal for the '<em><b>Supported Signedness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION__SUPPORTED_SIGNEDNESS = eINSTANCE.getInstruction_SupportedSignedness();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.InstructionInputImpl <em>Instruction Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.InstructionInputImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionInput()
		 * @generated
		 */
		EClass INSTRUCTION_INPUT = eINSTANCE.getInstructionInput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_INPUT__TYPE = eINSTANCE.getInstructionInput_Type();

		/**
		 * The meta object literal for the '<em><b>Bit Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_INPUT__BIT_WIDTH = eINSTANCE.getInstructionInput_BitWidth();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_INPUT__VALUE = eINSTANCE.getInstructionInput_Value();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.InstructionOperationImpl <em>Instruction Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.InstructionOperationImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionOperation()
		 * @generated
		 */
		EClass INSTRUCTION_OPERATION = eINSTANCE.getInstructionOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_OPERATION__OPERATION = eINSTANCE.getInstructionOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Instruction Operand</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_OPERATION__INSTRUCTION_OPERAND = eINSTANCE.getInstructionOperation_InstructionOperand();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.InstructionOutputImpl <em>Instruction Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.InstructionOutputImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionOutput()
		 * @generated
		 */
		EClass INSTRUCTION_OUTPUT = eINSTANCE.getInstructionOutput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_OUTPUT__TYPE = eINSTANCE.getInstructionOutput_Type();

		/**
		 * The meta object literal for the '<em><b>Bit Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_OUTPUT__BIT_WIDTH = eINSTANCE.getInstructionOutput_BitWidth();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_OUTPUT__REF = eINSTANCE.getInstructionOutput_Ref();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.InterruptCommunicationImpl <em>Interrupt Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.InterruptCommunicationImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInterruptCommunication()
		 * @generated
		 */
		EClass INTERRUPT_COMMUNICATION = eINSTANCE.getInterruptCommunication();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.LatencyImpl <em>Latency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.LatencyImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getLatency()
		 * @generated
		 */
		EClass LATENCY = eINSTANCE.getLatency();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl <em>Master Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.MasterComponentImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterComponent()
		 * @generated
		 */
		EClass MASTER_COMPONENT = eINSTANCE.getMasterComponent();

		/**
		 * The meta object literal for the '<em><b>Cache Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_COMPONENT__CACHE_REF = eINSTANCE.getMasterComponent_CacheRef();

		/**
		 * The meta object literal for the '<em><b>Access Type Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_COMPONENT__ACCESS_TYPE_SET = eINSTANCE.getMasterComponent_AccessTypeSet();

		/**
		 * The meta object literal for the '<em><b>Clock Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_COMPONENT__CLOCK_FREQUENCY = eINSTANCE.getMasterComponent_ClockFrequency();

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
		 * The meta object literal for the '<em><b>Master Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__MASTER_TYPE = eINSTANCE.getMasterComponent_MasterType();

		/**
		 * The meta object literal for the '<em><b>NChannel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT__NCHANNEL = eINSTANCE.getMasterComponent_NChannel();

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
		 * The meta object literal for the '<em><b>Common Instruction Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_COMPONENT__COMMON_INSTRUCTION_SET = eINSTANCE.getMasterComponent_CommonInstructionSet();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.MasterSlaveBindingImpl <em>Master Slave Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.MasterSlaveBindingImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterSlaveBinding()
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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.MasterSlaveBindingSetImpl <em>Master Slave Binding Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.MasterSlaveBindingSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterSlaveBindingSet()
		 * @generated
		 */
		EClass MASTER_SLAVE_BINDING_SET = eINSTANCE.getMasterSlaveBindingSet();

		/**
		 * The meta object literal for the '<em><b>Master Slave Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING = eINSTANCE
				.getMasterSlaveBindingSet_MasterSlaveBinding();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.MemoryConsistencyModelImpl <em>Memory Consistency Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.MemoryConsistencyModelImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMemoryConsistencyModel()
		 * @generated
		 */
		EClass MEMORY_CONSISTENCY_MODEL = eINSTANCE.getMemoryConsistencyModel();

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
		 * The meta object literal for the '<em><b>Rar Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_CONSISTENCY_MODEL__RAR_ORDERING = eINSTANCE.getMemoryConsistencyModel_RarOrdering();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.OperatingPointImpl <em>Operating Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.OperatingPointImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperatingPoint()
		 * @generated
		 */
		EClass OPERATING_POINT = eINSTANCE.getOperatingPoint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_POINT__NAME = eINSTANCE.getOperatingPoint_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_POINT__ID = eINSTANCE.getOperatingPoint_Id();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_POINT__FREQUENCY = eINSTANCE.getOperatingPoint_Frequency();

		/**
		 * The meta object literal for the '<em><b>Frequency Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_POINT__FREQUENCY_UNIT = eINSTANCE.getOperatingPoint_FrequencyUnit();

		/**
		 * The meta object literal for the '<em><b>Voltage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_POINT__VOLTAGE = eINSTANCE.getOperatingPoint_Voltage();

		/**
		 * The meta object literal for the '<em><b>Voltage Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_POINT__VOLTAGE_UNIT = eINSTANCE.getOperatingPoint_VoltageUnit();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.OperatingPointSetImpl <em>Operating Point Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.OperatingPointSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperatingPointSet()
		 * @generated
		 */
		EClass OPERATING_POINT_SET = eINSTANCE.getOperatingPointSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_POINT_SET__NAME = eINSTANCE.getOperatingPointSet_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_POINT_SET__ID = eINSTANCE.getOperatingPointSet_Id();

		/**
		 * The meta object literal for the '<em><b>Operating Point</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATING_POINT_SET__OPERATING_POINT = eINSTANCE.getOperatingPointSet_OperatingPoint();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.PerformanceImpl <em>Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.PerformanceImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPerformance()
		 * @generated
		 */
		EClass PERFORMANCE = eINSTANCE.getPerformance();

		/**
		 * The meta object literal for the '<em><b>Access Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE__ACCESS_TYPE_REF = eINSTANCE.getPerformance_AccessTypeRef();

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
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.PerformanceSetImpl <em>Performance Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.PerformanceSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPerformanceSet()
		 * @generated
		 */
		EClass PERFORMANCE_SET = eINSTANCE.getPerformanceSet();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORMANCE_SET__ID = eINSTANCE.getPerformanceSet_Id();

		/**
		 * The meta object literal for the '<em><b>Cache Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_SET__CACHE_REF = eINSTANCE.getPerformanceSet_CacheRef();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMANCE_SET__PERFORMANCE = eINSTANCE.getPerformanceSet_Performance();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.PitchImpl <em>Pitch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.PitchImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPitch()
		 * @generated
		 */
		EClass PITCH = eINSTANCE.getPitch();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.PowerConfigurationImpl <em>Power Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.PowerConfigurationImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerConfiguration()
		 * @generated
		 */
		EClass POWER_CONFIGURATION = eINSTANCE.getPowerConfiguration();

		/**
		 * The meta object literal for the '<em><b>System Configuration Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CONFIGURATION__SYSTEM_CONFIGURATION_SRC = eINSTANCE
				.getPowerConfiguration_SystemConfigurationSrc();

		/**
		 * The meta object literal for the '<em><b>Power Consumption Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONFIGURATION__POWER_CONSUMPTION_SET = eINSTANCE.getPowerConfiguration_PowerConsumptionSet();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionImpl <em>Power Consumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.PowerConsumptionImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerConsumption()
		 * @generated
		 */
		EClass POWER_CONSUMPTION = eINSTANCE.getPowerConsumption();

		/**
		 * The meta object literal for the '<em><b>Operating Point Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONSUMPTION__OPERATING_POINT_REF = eINSTANCE.getPowerConsumption_OperatingPointRef();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CONSUMPTION__POWER = eINSTANCE.getPowerConsumption_Power();

		/**
		 * The meta object literal for the '<em><b>Power Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CONSUMPTION__POWER_UNIT = eINSTANCE.getPowerConsumption_PowerUnit();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionSetImpl <em>Power Consumption Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.PowerConsumptionSetImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerConsumptionSet()
		 * @generated
		 */
		EClass POWER_CONSUMPTION_SET = eINSTANCE.getPowerConsumptionSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CONSUMPTION_SET__NAME = eINSTANCE.getPowerConsumptionSet_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_CONSUMPTION_SET__ID = eINSTANCE.getPowerConsumptionSet_Id();

		/**
		 * The meta object literal for the '<em><b>Power Consumption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONSUMPTION_SET__POWER_CONSUMPTION = eINSTANCE.getPowerConsumptionSet_PowerConsumption();

		/**
		 * The meta object literal for the '<em><b>Power Consumer Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_CONSUMPTION_SET__POWER_CONSUMER_REF = eINSTANCE.getPowerConsumptionSet_PowerConsumerRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.SharedMemoryCommunicationImpl <em>Shared Memory Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.SharedMemoryCommunicationImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSharedMemoryCommunication()
		 * @generated
		 */
		EClass SHARED_MEMORY_COMMUNICATION = eINSTANCE.getSharedMemoryCommunication();

		/**
		 * The meta object literal for the '<em><b>Operation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE = eINSTANCE.getSharedMemoryCommunication_OperationType();

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
		 * The meta object literal for the '<em><b>Address Space Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF = eINSTANCE
				.getSharedMemoryCommunication_AddressSpaceRef();

		/**
		 * The meta object literal for the '<em><b>Sub Space Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF = eINSTANCE.getSharedMemoryCommunication_SubSpaceRef();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.SharedRegisterCommunicationImpl <em>Shared Register Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.SharedRegisterCommunicationImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSharedRegisterCommunication()
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
		EAttribute SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT = eINSTANCE
				.getSharedRegisterCommunication_DataSizeUnit();

		/**
		 * The meta object literal for the '<em><b>NRegister</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHARED_REGISTER_COMMUNICATION__NREGISTER = eINSTANCE.getSharedRegisterCommunication_NRegister();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.ShimImpl <em>Shim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ShimImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getShim()
		 * @generated
		 */
		EClass SHIM = eINSTANCE.getShim();

		/**
		 * The meta object literal for the '<em><b>System Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM__SYSTEM_CONFIGURATION = eINSTANCE.getShim_SystemConfiguration();

		/**
		 * The meta object literal for the '<em><b>Power Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM__POWER_CONFIGURATION = eINSTANCE.getShim_PowerConfiguration();

		/**
		 * The meta object literal for the '<em><b>Functional Unit Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM__FUNCTIONAL_UNIT_SET = eINSTANCE.getShim_FunctionalUnitSet();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.SlaveComponentImpl <em>Slave Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.SlaveComponentImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSlaveComponent()
		 * @generated
		 */
		EClass SLAVE_COMPONENT = eINSTANCE.getSlaveComponent();

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
		 * The meta object literal for the '<em><b>Rw Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAVE_COMPONENT__RW_TYPE = eINSTANCE.getSlaveComponent_RwType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.SubSpaceImpl <em>Sub Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.SubSpaceImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSubSpace()
		 * @generated
		 */
		EClass SUB_SPACE = eINSTANCE.getSubSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SPACE__NAME = eINSTANCE.getSubSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SPACE__ID = eINSTANCE.getSubSpace_Id();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SPACE__START = eINSTANCE.getSubSpace_Start();

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
		 * The meta object literal for the '<em><b>Master Slave Binding Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SPACE__MASTER_SLAVE_BINDING_SET = eINSTANCE.getSubSpace_MasterSlaveBindingSet();

		/**
		 * The meta object literal for the '<em><b>Memory Consistency Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SPACE__MEMORY_CONSISTENCY_MODEL = eINSTANCE.getSubSpace_MemoryConsistencyModel();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.SystemConfigurationImpl <em>System Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.SystemConfigurationImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSystemConfiguration()
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
		 * The meta object literal for the '<em><b>Address Space Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET = eINSTANCE.getSystemConfiguration_AddressSpaceSet();

		/**
		 * The meta object literal for the '<em><b>Communication Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__COMMUNICATION_SET = eINSTANCE.getSystemConfiguration_CommunicationSet();

		/**
		 * The meta object literal for the '<em><b>Frequency Voltage Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET = eINSTANCE.getSystemConfiguration_FrequencyVoltageSet();

		/**
		 * The meta object literal for the '<em><b>Contention Group Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET = eINSTANCE.getSystemConfiguration_ContentionGroupSet();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.ThroughputImpl <em>Throughput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ThroughputImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getThroughput()
		 * @generated
		 */
		EClass THROUGHPUT = eINSTANCE.getThroughput();

		/**
		 * The meta object literal for the '<em><b>Frequency Domain Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROUGHPUT__FREQUENCY_DOMAIN_REF = eINSTANCE.getThroughput_FrequencyDomainRef();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROUGHPUT__VALUE = eINSTANCE.getThroughput_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROUGHPUT__UNIT = eINSTANCE.getThroughput_Unit();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.impl.VoltageDomainImpl <em>Voltage Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.VoltageDomainImpl
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getVoltageDomain()
		 * @generated
		 */
		EClass VOLTAGE_DOMAIN = eINSTANCE.getVoltageDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLTAGE_DOMAIN__NAME = eINSTANCE.getVoltageDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLTAGE_DOMAIN__ID = eINSTANCE.getVoltageDomain_Id();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.CacheCoherencyType <em>Cache Coherency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheCoherencyType()
		 * @generated
		 */
		EEnum CACHE_COHERENCY_TYPE = eINSTANCE.getCacheCoherencyType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.CachePrefetchType <em>Cache Prefetch Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CachePrefetchType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCachePrefetchType()
		 * @generated
		 */
		EEnum CACHE_PREFETCH_TYPE = eINSTANCE.getCachePrefetchType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.CacheReplacementType <em>Cache Replacement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheReplacementType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheReplacementType()
		 * @generated
		 */
		EEnum CACHE_REPLACEMENT_TYPE = eINSTANCE.getCacheReplacementType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.CacheType <em>Cache Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheType()
		 * @generated
		 */
		EEnum CACHE_TYPE = eINSTANCE.getCacheType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.CacheWriteAllocateType <em>Cache Write Allocate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheWriteAllocateType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheWriteAllocateType()
		 * @generated
		 */
		EEnum CACHE_WRITE_ALLOCATE_TYPE = eINSTANCE.getCacheWriteAllocateType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.CacheWriteBackType <em>Cache Write Back Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheWriteBackType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheWriteBackType()
		 * @generated
		 */
		EEnum CACHE_WRITE_BACK_TYPE = eINSTANCE.getCacheWriteBackType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.DataRateUnitType <em>Data Rate Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.DataRateUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getDataRateUnitType()
		 * @generated
		 */
		EEnum DATA_RATE_UNIT_TYPE = eINSTANCE.getDataRateUnitType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.EndianType <em>Endian Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.EndianType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getEndianType()
		 * @generated
		 */
		EEnum ENDIAN_TYPE = eINSTANCE.getEndianType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.FrequencyUnitType <em>Frequency Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.FrequencyUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFrequencyUnitType()
		 * @generated
		 */
		EEnum FREQUENCY_UNIT_TYPE = eINSTANCE.getFrequencyUnitType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.InstructionInputType <em>Instruction Input Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.InstructionInputType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionInputType()
		 * @generated
		 */
		EEnum INSTRUCTION_INPUT_TYPE = eINSTANCE.getInstructionInputType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.InstructionOutputType <em>Instruction Output Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.InstructionOutputType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionOutputType()
		 * @generated
		 */
		EEnum INSTRUCTION_OUTPUT_TYPE = eINSTANCE.getInstructionOutputType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.LockDownType <em>Lock Down Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.LockDownType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getLockDownType()
		 * @generated
		 */
		EEnum LOCK_DOWN_TYPE = eINSTANCE.getLockDownType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.MasterType <em>Master Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.MasterType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterType()
		 * @generated
		 */
		EEnum MASTER_TYPE = eINSTANCE.getMasterType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.OperandAddressingType <em>Operand Addressing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.OperandAddressingType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperandAddressingType()
		 * @generated
		 */
		EEnum OPERAND_ADDRESSING_TYPE = eINSTANCE.getOperandAddressingType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.OperationType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.OrderingType <em>Ordering Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.OrderingType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOrderingType()
		 * @generated
		 */
		EEnum ORDERING_TYPE = eINSTANCE.getOrderingType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.PowerUnitType <em>Power Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.PowerUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerUnitType()
		 * @generated
		 */
		EEnum POWER_UNIT_TYPE = eINSTANCE.getPowerUnitType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.RWType <em>RW Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.RWType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getRWType()
		 * @generated
		 */
		EEnum RW_TYPE = eINSTANCE.getRWType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.SignednessType <em>Signedness Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.SignednessType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSignednessType()
		 * @generated
		 */
		EEnum SIGNEDNESS_TYPE = eINSTANCE.getSignednessType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.SizeUnitType <em>Size Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.SizeUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSizeUnitType()
		 * @generated
		 */
		EEnum SIZE_UNIT_TYPE = eINSTANCE.getSizeUnitType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.ThroughputUnitType <em>Throughput Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.ThroughputUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getThroughputUnitType()
		 * @generated
		 */
		EEnum THROUGHPUT_UNIT_TYPE = eINSTANCE.getThroughputUnitType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.model.shim.VoltageUnitType <em>Voltage Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.VoltageUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getVoltageUnitType()
		 * @generated
		 */
		EEnum VOLTAGE_UNIT_TYPE = eINSTANCE.getVoltageUnitType();

		/**
		 * The meta object literal for the '<em>Address Value Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAddressValueType()
		 * @generated
		 */
		EDataType ADDRESS_VALUE_TYPE = eINSTANCE.getAddressValueType();

		/**
		 * The meta object literal for the '<em>Address Value Object Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getAddressValueObjectType()
		 * @generated
		 */
		EDataType ADDRESS_VALUE_OBJECT_TYPE = eINSTANCE.getAddressValueObjectType();

		/**
		 * The meta object literal for the '<em>Cache Coherency Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheCoherencyTypeObject()
		 * @generated
		 */
		EDataType CACHE_COHERENCY_TYPE_OBJECT = eINSTANCE.getCacheCoherencyTypeObject();

		/**
		 * The meta object literal for the '<em>Cache Prefetch Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CachePrefetchType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCachePrefetchTypeObject()
		 * @generated
		 */
		EDataType CACHE_PREFETCH_TYPE_OBJECT = eINSTANCE.getCachePrefetchTypeObject();

		/**
		 * The meta object literal for the '<em>Cache Replacement Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheReplacementType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheReplacementTypeObject()
		 * @generated
		 */
		EDataType CACHE_REPLACEMENT_TYPE_OBJECT = eINSTANCE.getCacheReplacementTypeObject();

		/**
		 * The meta object literal for the '<em>Cache Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheTypeObject()
		 * @generated
		 */
		EDataType CACHE_TYPE_OBJECT = eINSTANCE.getCacheTypeObject();

		/**
		 * The meta object literal for the '<em>Cache Write Allocate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheWriteAllocateType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheWriteAllocateTypeObject()
		 * @generated
		 */
		EDataType CACHE_WRITE_ALLOCATE_TYPE_OBJECT = eINSTANCE.getCacheWriteAllocateTypeObject();

		/**
		 * The meta object literal for the '<em>Cache Write Back Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.CacheWriteBackType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getCacheWriteBackTypeObject()
		 * @generated
		 */
		EDataType CACHE_WRITE_BACK_TYPE_OBJECT = eINSTANCE.getCacheWriteBackTypeObject();

		/**
		 * The meta object literal for the '<em>Data Rate Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.DataRateUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getDataRateUnitTypeObject()
		 * @generated
		 */
		EDataType DATA_RATE_UNIT_TYPE_OBJECT = eINSTANCE.getDataRateUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Endian Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.EndianType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getEndianTypeObject()
		 * @generated
		 */
		EDataType ENDIAN_TYPE_OBJECT = eINSTANCE.getEndianTypeObject();

		/**
		 * The meta object literal for the '<em>Frequency Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.FrequencyUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getFrequencyUnitTypeObject()
		 * @generated
		 */
		EDataType FREQUENCY_UNIT_TYPE_OBJECT = eINSTANCE.getFrequencyUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Instruction Input Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.InstructionInputType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionInputTypeObject()
		 * @generated
		 */
		EDataType INSTRUCTION_INPUT_TYPE_OBJECT = eINSTANCE.getInstructionInputTypeObject();

		/**
		 * The meta object literal for the '<em>Instruction Output Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.InstructionOutputType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getInstructionOutputTypeObject()
		 * @generated
		 */
		EDataType INSTRUCTION_OUTPUT_TYPE_OBJECT = eINSTANCE.getInstructionOutputTypeObject();

		/**
		 * The meta object literal for the '<em>Lock Down Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.LockDownType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getLockDownTypeObject()
		 * @generated
		 */
		EDataType LOCK_DOWN_TYPE_OBJECT = eINSTANCE.getLockDownTypeObject();

		/**
		 * The meta object literal for the '<em>Master Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.MasterType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getMasterTypeObject()
		 * @generated
		 */
		EDataType MASTER_TYPE_OBJECT = eINSTANCE.getMasterTypeObject();

		/**
		 * The meta object literal for the '<em>Operand Addressing Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.OperandAddressingType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperandAddressingTypeObject()
		 * @generated
		 */
		EDataType OPERAND_ADDRESSING_TYPE_OBJECT = eINSTANCE.getOperandAddressingTypeObject();

		/**
		 * The meta object literal for the '<em>Operation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.OperationType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOperationTypeObject()
		 * @generated
		 */
		EDataType OPERATION_TYPE_OBJECT = eINSTANCE.getOperationTypeObject();

		/**
		 * The meta object literal for the '<em>Ordering Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.OrderingType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getOrderingTypeObject()
		 * @generated
		 */
		EDataType ORDERING_TYPE_OBJECT = eINSTANCE.getOrderingTypeObject();

		/**
		 * The meta object literal for the '<em>Power Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.PowerUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getPowerUnitTypeObject()
		 * @generated
		 */
		EDataType POWER_UNIT_TYPE_OBJECT = eINSTANCE.getPowerUnitTypeObject();

		/**
		 * The meta object literal for the '<em>RW Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.RWType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getRWTypeObject()
		 * @generated
		 */
		EDataType RW_TYPE_OBJECT = eINSTANCE.getRWTypeObject();

		/**
		 * The meta object literal for the '<em>Signedness Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.SignednessType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSignednessTypeObject()
		 * @generated
		 */
		EDataType SIGNEDNESS_TYPE_OBJECT = eINSTANCE.getSignednessTypeObject();

		/**
		 * The meta object literal for the '<em>Size Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.SizeUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getSizeUnitTypeObject()
		 * @generated
		 */
		EDataType SIZE_UNIT_TYPE_OBJECT = eINSTANCE.getSizeUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Throughput Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.ThroughputUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getThroughputUnitTypeObject()
		 * @generated
		 */
		EDataType THROUGHPUT_UNIT_TYPE_OBJECT = eINSTANCE.getThroughputUnitTypeObject();

		/**
		 * The meta object literal for the '<em>Unsigned Float Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getUnsignedFloatType()
		 * @generated
		 */
		EDataType UNSIGNED_FLOAT_TYPE = eINSTANCE.getUnsignedFloatType();

		/**
		 * The meta object literal for the '<em>Unsigned Float Object Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getUnsignedFloatObjectType()
		 * @generated
		 */
		EDataType UNSIGNED_FLOAT_OBJECT_TYPE = eINSTANCE.getUnsignedFloatObjectType();

		/**
		 * The meta object literal for the '<em>Unsigned Int Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getUnsignedIntType()
		 * @generated
		 */
		EDataType UNSIGNED_INT_TYPE = eINSTANCE.getUnsignedIntType();

		/**
		 * The meta object literal for the '<em>Unsigned Int Object Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getUnsignedIntObjectType()
		 * @generated
		 */
		EDataType UNSIGNED_INT_OBJECT_TYPE = eINSTANCE.getUnsignedIntObjectType();

		/**
		 * The meta object literal for the '<em>Voltage Unit Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.model.shim.VoltageUnitType
		 * @see org.multicore_association.shim.model.shim.impl.ShimPackageImpl#getVoltageUnitTypeObject()
		 * @generated
		 */
		EDataType VOLTAGE_UNIT_TYPE_OBJECT = eINSTANCE.getVoltageUnitTypeObject();

	}

} //ShimPackage
