/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

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
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesFactory
 * @model kind="package"
 * @generated
 */
public interface PreferencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "preferences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://multicore-association.org/shimAppPreferences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shimAppPreferences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PreferencesPackage eINSTANCE = org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AbstractPreferencesImpl <em>Abstract Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AbstractPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAbstractPreferences()
	 * @generated
	 */
	int ABSTRACT_PREFERENCES = 0;

	/**
	 * The number of structural features of the '<em>Abstract Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PREFERENCES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PREFERENCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AbstractComponentPreferencesImpl <em>Abstract Component Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AbstractComponentPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAbstractComponentPreferences()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_PREFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_PREFERENCES__BASE_NAME = ABSTRACT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Component Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Component Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_PREFERENCES_OPERATION_COUNT = ABSTRACT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AbstractPerformancePreferencesImpl <em>Abstract Performance Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AbstractPerformancePreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAbstractPerformancePreferences()
	 * @generated
	 */
	int ABSTRACT_PERFORMANCE_PREFERENCES = 2;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE_PREFERENCES__BEST = ABSTRACT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE_PREFERENCES__TYPICAL = ABSTRACT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE_PREFERENCES__WORST = ABSTRACT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Performance Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE_PREFERENCES_FEATURE_COUNT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Performance Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PERFORMANCE_PREFERENCES_OPERATION_COUNT = ABSTRACT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl <em>Access Type Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAccessTypePreferences()
	 * @generated
	 */
	int ACCESS_TYPE_PREFERENCES = 3;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES__BASE_NAME = ABSTRACT_COMPONENT_PREFERENCES__BASE_NAME;

	/**
	 * The feature id for the '<em><b>Check R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES__CHECK_R = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES__CHECK_W = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Check RW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES__CHECK_RW = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Check RWX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES__CHECK_RWX = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Check RX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES__CHECK_RX = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Check X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES__CHECK_X = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Access Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>NBurst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES__NBURST = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Access Type Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES_FEATURE_COUNT = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Access Type Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_PREFERENCES_OPERATION_COUNT = ABSTRACT_COMPONENT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AddressSpacePreferencesImpl <em>Address Space Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AddressSpacePreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAddressSpacePreferences()
	 * @generated
	 */
	int ADDRESS_SPACE_PREFERENCES = 4;

	/**
	 * The feature id for the '<em><b>Number Sub Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Sub Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Address Space Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME = ABSTRACT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Space Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME = ABSTRACT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dont Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PREFERENCES__DONT_CONNECT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Address Space Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PREFERENCES_FEATURE_COUNT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Address Space Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PREFERENCES_OPERATION_COUNT = ABSTRACT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataPreferencesImpl <em>Cache Data Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCacheDataPreferences()
	 * @generated
	 */
	int CACHE_DATA_PREFERENCES = 5;

	/**
	 * The feature id for the '<em><b>Cache Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_PREFERENCES__CACHE_TYPE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_PREFERENCES__DATA = ABSTRACT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_PREFERENCES__INSTRUCTION = ABSTRACT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cache Data Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_PREFERENCES_FEATURE_COUNT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cache Data Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_PREFERENCES_OPERATION_COUNT = ABSTRACT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl <em>Cache Data Unit Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCacheDataUnitPreferences()
	 * @generated
	 */
	int CACHE_DATA_UNIT_PREFERENCES = 6;

	/**
	 * The feature id for the '<em><b>Cache Coherenecy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY = ABSTRACT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_UNIT_PREFERENCES__SIZE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>NWay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_UNIT_PREFERENCES__NWAY = ABSTRACT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lock Down Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cache Data Unit Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_UNIT_PREFERENCES_FEATURE_COUNT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Cache Data Unit Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_DATA_UNIT_PREFERENCES_OPERATION_COUNT = ABSTRACT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl <em>Communication Set Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCommunicationSetPreferences()
	 * @generated
	 */
	int COMMUNICATION_SET_PREFERENCES = 7;

	/**
	 * The feature id for the '<em><b>Check Interrupt Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION = ABSTRACT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Event Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION = ABSTRACT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Check FIFO Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION = ABSTRACT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fifo Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fifo Data Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Check Shared Memory Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION = ABSTRACT_PREFERENCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Shared Memory Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Shared Memory Data Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Check Shared Register Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION = ABSTRACT_PREFERENCES_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Shared Register Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Shared Register Data Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>NRegister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__NREGISTER = ABSTRACT_PREFERENCES_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Dont Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES__DONT_CONNECT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Communication Set Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES_FEATURE_COUNT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Communication Set Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_PREFERENCES_OPERATION_COUNT = ABSTRACT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.ComponentSetPreferencesImpl <em>Component Set Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.ComponentSetPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getComponentSetPreferences()
	 * @generated
	 */
	int COMPONENT_SET_PREFERENCES = 8;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET_PREFERENCES__BASE_NAME = ABSTRACT_COMPONENT_PREFERENCES__BASE_NAME;

	/**
	 * The number of structural features of the '<em>Component Set Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET_PREFERENCES_FEATURE_COUNT = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Set Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SET_PREFERENCES_OPERATION_COUNT = ABSTRACT_COMPONENT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.ComponentsPreferencesImpl <em>Components Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.ComponentsPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getComponentsPreferences()
	 * @generated
	 */
	int COMPONENTS_PREFERENCES = 9;

	/**
	 * The feature id for the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_PREFERENCES__SYSTEM_NAME = ABSTRACT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_PREFERENCES__NUMBER_MASTER = ABSTRACT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number Slave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_PREFERENCES__NUMBER_SLAVE = ABSTRACT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_PREFERENCES__NUMBER_COMPONENT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_PREFERENCES__CLOCK = ABSTRACT_PREFERENCES_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Components Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_PREFERENCES_FEATURE_COUNT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Components Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_PREFERENCES_OPERATION_COUNT = ABSTRACT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.LatencyPreferencesImpl <em>Latency Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.LatencyPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getLatencyPreferences()
	 * @generated
	 */
	int LATENCY_PREFERENCES = 10;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_PREFERENCES__BEST = ABSTRACT_PERFORMANCE_PREFERENCES__BEST;

	/**
	 * The feature id for the '<em><b>Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_PREFERENCES__TYPICAL = ABSTRACT_PERFORMANCE_PREFERENCES__TYPICAL;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_PREFERENCES__WORST = ABSTRACT_PERFORMANCE_PREFERENCES__WORST;

	/**
	 * The number of structural features of the '<em>Latency Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_PREFERENCES_FEATURE_COUNT = ABSTRACT_PERFORMANCE_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Latency Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_PREFERENCES_OPERATION_COUNT = ABSTRACT_PERFORMANCE_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl <em>Master Component Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getMasterComponentPreferences()
	 * @generated
	 */
	int MASTER_COMPONENT_PREFERENCES = 11;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES__BASE_NAME = ABSTRACT_COMPONENT_PREFERENCES__BASE_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES__TYPE = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endian</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES__ENDIAN = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES__ARCH = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arch Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES__ARCH_OPT = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>NChannel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES__NCHANNEL = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>NThread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES__NTHREAD = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Check Clock For Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES__CLOCK = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Master Component Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES_FEATURE_COUNT = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Master Component Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASTER_COMPONENT_PREFERENCES_OPERATION_COUNT = ABSTRACT_COMPONENT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.PitchPreferencesImpl <em>Pitch Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PitchPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getPitchPreferences()
	 * @generated
	 */
	int PITCH_PREFERENCES = 12;

	/**
	 * The feature id for the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_PREFERENCES__BEST = ABSTRACT_PERFORMANCE_PREFERENCES__BEST;

	/**
	 * The feature id for the '<em><b>Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_PREFERENCES__TYPICAL = ABSTRACT_PERFORMANCE_PREFERENCES__TYPICAL;

	/**
	 * The feature id for the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_PREFERENCES__WORST = ABSTRACT_PERFORMANCE_PREFERENCES__WORST;

	/**
	 * The number of structural features of the '<em>Pitch Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_PREFERENCES_FEATURE_COUNT = ABSTRACT_PERFORMANCE_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pitch Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_PREFERENCES_OPERATION_COUNT = ABSTRACT_PERFORMANCE_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.SavePolicyPreferencesImpl <em>Save Policy Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.SavePolicyPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getSavePolicyPreferences()
	 * @generated
	 */
	int SAVE_POLICY_PREFERENCES = 13;

	/**
	 * The feature id for the '<em><b>Save Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_POLICY_PREFERENCES__SAVE_POLICY = ABSTRACT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Save Policy Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_POLICY_PREFERENCES_FEATURE_COUNT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Save Policy Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVE_POLICY_PREFERENCES_OPERATION_COUNT = ABSTRACT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl <em>Shim Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getShimPreferences()
	 * @generated
	 */
	int SHIM_PREFERENCES = 14;

	/**
	 * The feature id for the '<em><b>Components Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__COMPONENTS_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Master Component Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slave Component Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Set Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Address Space Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Communication Set Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cache Data Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__CACHE_DATA_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Access Type Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Latency Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__LATENCY_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pitch Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__PITCH_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Save Policy Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES = ABSTRACT_PREFERENCES_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Shim Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES_FEATURE_COUNT = ABSTRACT_PREFERENCES_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Shim Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIM_PREFERENCES_OPERATION_COUNT = ABSTRACT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.SlaveComponentPreferencesImpl <em>Slave Component Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.SlaveComponentPreferencesImpl
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getSlaveComponentPreferences()
	 * @generated
	 */
	int SLAVE_COMPONENT_PREFERENCES = 15;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_PREFERENCES__BASE_NAME = ABSTRACT_COMPONENT_PREFERENCES__BASE_NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_PREFERENCES__SIZE = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_PREFERENCES__SIZE_UNIT = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rw Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_PREFERENCES__RW_TYPE = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Slave Component Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_PREFERENCES_FEATURE_COUNT = ABSTRACT_COMPONENT_PREFERENCES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Slave Component Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLAVE_COMPONENT_PREFERENCES_OPERATION_COUNT = ABSTRACT_COMPONENT_PREFERENCES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect <em>Cache Type Select</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCacheTypeSelect()
	 * @generated
	 */
	int CACHE_TYPE_SELECT = 16;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyType <em>Save Policy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyType
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getSavePolicyType()
	 * @generated
	 */
	int SAVE_POLICY_TYPE = 17;

	/**
	 * The meta object id for the '<em>Cache Type Select Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCacheTypeSelectObject()
	 * @generated
	 */
	int CACHE_TYPE_SELECT_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Save Policy Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyType
	 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getSavePolicyTypeObject()
	 * @generated
	 */
	int SAVE_POLICY_TYPE_OBJECT = 19;

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractPreferences <em>Abstract Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractPreferences
	 * @generated
	 */
	EClass getAbstractPreferences();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractComponentPreferences <em>Abstract Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractComponentPreferences
	 * @generated
	 */
	EClass getAbstractComponentPreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractComponentPreferences#getBaseName <em>Base Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Name</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractComponentPreferences#getBaseName()
	 * @see #getAbstractComponentPreferences()
	 * @generated
	 */
	EAttribute getAbstractComponentPreferences_BaseName();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences <em>Abstract Performance Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Performance Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences
	 * @generated
	 */
	EClass getAbstractPerformancePreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences#getBest <em>Best</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences#getBest()
	 * @see #getAbstractPerformancePreferences()
	 * @generated
	 */
	EAttribute getAbstractPerformancePreferences_Best();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences#getTypical <em>Typical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typical</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences#getTypical()
	 * @see #getAbstractPerformancePreferences()
	 * @generated
	 */
	EAttribute getAbstractPerformancePreferences_Typical();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences#getWorst <em>Worst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences#getWorst()
	 * @see #getAbstractPerformancePreferences()
	 * @generated
	 */
	EAttribute getAbstractPerformancePreferences_Worst();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences <em>Access Type Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Type Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences
	 * @generated
	 */
	EClass getAccessTypePreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckR <em>Check R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check R</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckR()
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	EAttribute getAccessTypePreferences_CheckR();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckW <em>Check W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check W</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckW()
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	EAttribute getAccessTypePreferences_CheckW();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRW <em>Check RW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check RW</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRW()
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	EAttribute getAccessTypePreferences_CheckRW();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRWX <em>Check RWX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check RWX</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRWX()
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	EAttribute getAccessTypePreferences_CheckRWX();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRX <em>Check RX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check RX</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRX()
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	EAttribute getAccessTypePreferences_CheckRX();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckX <em>Check X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check X</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckX()
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	EAttribute getAccessTypePreferences_CheckX();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#getAccessByteSize <em>Access Byte Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Byte Size</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#getAccessByteSize()
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	EAttribute getAccessTypePreferences_AccessByteSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#getNBurst <em>NBurst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NBurst</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#getNBurst()
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	EAttribute getAccessTypePreferences_NBurst();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences <em>Address Space Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Space Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences
	 * @generated
	 */
	EClass getAddressSpacePreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getNumberSubSpace <em>Number Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Sub Space</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getNumberSubSpace()
	 * @see #getAddressSpacePreferences()
	 * @generated
	 */
	EAttribute getAddressSpacePreferences_NumberSubSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getSizeSubSpace <em>Size Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Sub Space</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getSizeSubSpace()
	 * @see #getAddressSpacePreferences()
	 * @generated
	 */
	EAttribute getAddressSpacePreferences_SizeSubSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getAddressSpaceName <em>Address Space Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address Space Name</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getAddressSpaceName()
	 * @see #getAddressSpacePreferences()
	 * @generated
	 */
	EAttribute getAddressSpacePreferences_AddressSpaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getSubSpaceName <em>Sub Space Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Space Name</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getSubSpaceName()
	 * @see #getAddressSpacePreferences()
	 * @generated
	 */
	EAttribute getAddressSpacePreferences_SubSpaceName();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#isDontConnect <em>Dont Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dont Connect</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#isDontConnect()
	 * @see #getAddressSpacePreferences()
	 * @generated
	 */
	EAttribute getAddressSpacePreferences_DontConnect();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences <em>Cache Data Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Data Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences
	 * @generated
	 */
	EClass getCacheDataPreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getCacheType <em>Cache Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Type</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getCacheType()
	 * @see #getCacheDataPreferences()
	 * @generated
	 */
	EAttribute getCacheDataPreferences_CacheType();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getData()
	 * @see #getCacheDataPreferences()
	 * @generated
	 */
	EReference getCacheDataPreferences_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instruction</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getInstruction()
	 * @see #getCacheDataPreferences()
	 * @generated
	 */
	EReference getCacheDataPreferences_Instruction();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences <em>Cache Data Unit Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Data Unit Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences
	 * @generated
	 */
	EClass getCacheDataUnitPreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getCacheCoherenecy <em>Cache Coherenecy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Coherenecy</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getCacheCoherenecy()
	 * @see #getCacheDataUnitPreferences()
	 * @generated
	 */
	EAttribute getCacheDataUnitPreferences_CacheCoherenecy();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getSize()
	 * @see #getCacheDataUnitPreferences()
	 * @generated
	 */
	EAttribute getCacheDataUnitPreferences_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getSizeUnit <em>Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Unit</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getSizeUnit()
	 * @see #getCacheDataUnitPreferences()
	 * @generated
	 */
	EAttribute getCacheDataUnitPreferences_SizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getNWay <em>NWay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NWay</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getNWay()
	 * @see #getCacheDataUnitPreferences()
	 * @generated
	 */
	EAttribute getCacheDataUnitPreferences_NWay();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLineSize <em>Line Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Size</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLineSize()
	 * @see #getCacheDataUnitPreferences()
	 * @generated
	 */
	EAttribute getCacheDataUnitPreferences_LineSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLockDownType <em>Lock Down Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Down Type</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLockDownType()
	 * @see #getCacheDataUnitPreferences()
	 * @generated
	 */
	EAttribute getCacheDataUnitPreferences_LockDownType();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences <em>Communication Set Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Set Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences
	 * @generated
	 */
	EClass getCommunicationSetPreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckInterruptCommunication <em>Check Interrupt Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Interrupt Communication</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckInterruptCommunication()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_CheckInterruptCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckEventCommunication <em>Check Event Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Event Communication</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckEventCommunication()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_CheckEventCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckFIFOCommunication <em>Check FIFO Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check FIFO Communication</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckFIFOCommunication()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_CheckFIFOCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getFifoDataSize <em>Fifo Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fifo Data Size</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getFifoDataSize()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_FifoDataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getFifoDataSizeUnit <em>Fifo Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fifo Data Size Unit</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getFifoDataSizeUnit()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_FifoDataSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getQueueSize <em>Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Size</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getQueueSize()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_QueueSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckSharedMemoryCommunication <em>Check Shared Memory Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Shared Memory Communication</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckSharedMemoryCommunication()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_CheckSharedMemoryCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSize <em>Shared Memory Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Memory Data Size</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSize()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_SharedMemoryDataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSizeUnit <em>Shared Memory Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Memory Data Size Unit</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSizeUnit()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_SharedMemoryDataSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getOperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Type</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getOperationType()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_OperationType();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckSharedRegisterCommunication <em>Check Shared Register Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Shared Register Communication</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckSharedRegisterCommunication()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_CheckSharedRegisterCommunication();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedRegisterDataSize <em>Shared Register Data Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Register Data Size</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedRegisterDataSize()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_SharedRegisterDataSize();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedRegisterDataSizeUnit <em>Shared Register Data Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Register Data Size Unit</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedRegisterDataSizeUnit()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_SharedRegisterDataSizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getNRegister <em>NRegister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NRegister</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getNRegister()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_NRegister();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isDontConnect <em>Dont Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dont Connect</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isDontConnect()
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	EAttribute getCommunicationSetPreferences_DontConnect();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences <em>Component Set Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Set Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences
	 * @generated
	 */
	EClass getComponentSetPreferences();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences <em>Components Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences
	 * @generated
	 */
	EClass getComponentsPreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getSystemName <em>System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Name</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getSystemName()
	 * @see #getComponentsPreferences()
	 * @generated
	 */
	EAttribute getComponentsPreferences_SystemName();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberMaster <em>Number Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Master</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberMaster()
	 * @see #getComponentsPreferences()
	 * @generated
	 */
	EAttribute getComponentsPreferences_NumberMaster();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberSlave <em>Number Slave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Slave</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberSlave()
	 * @see #getComponentsPreferences()
	 * @generated
	 */
	EAttribute getComponentsPreferences_NumberSlave();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberComponent <em>Number Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Component</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberComponent()
	 * @see #getComponentsPreferences()
	 * @generated
	 */
	EAttribute getComponentsPreferences_NumberComponent();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getClock()
	 * @see #getComponentsPreferences()
	 * @generated
	 */
	EAttribute getComponentsPreferences_Clock();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.LatencyPreferences <em>Latency Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.LatencyPreferences
	 * @generated
	 */
	EClass getLatencyPreferences();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences <em>Master Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Master Component Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences
	 * @generated
	 */
	EClass getMasterComponentPreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getType()
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	EAttribute getMasterComponentPreferences_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getEndian <em>Endian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endian</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getEndian()
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	EAttribute getMasterComponentPreferences_Endian();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArch <em>Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArch()
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	EAttribute getMasterComponentPreferences_Arch();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArchOpt <em>Arch Opt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch Opt</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArchOpt()
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	EAttribute getMasterComponentPreferences_ArchOpt();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getNChannel <em>NChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NChannel</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getNChannel()
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	EAttribute getMasterComponentPreferences_NChannel();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getNThread <em>NThread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NThread</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getNThread()
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	EAttribute getMasterComponentPreferences_NThread();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#isCheckClockForMaster <em>Check Clock For Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Clock For Master</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#isCheckClockForMaster()
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	EAttribute getMasterComponentPreferences_CheckClockForMaster();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getClock()
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	EAttribute getMasterComponentPreferences_Clock();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.PitchPreferences <em>Pitch Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pitch Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.PitchPreferences
	 * @generated
	 */
	EClass getPitchPreferences();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences <em>Save Policy Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Save Policy Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences
	 * @generated
	 */
	EClass getSavePolicyPreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences#getSavePolicy <em>Save Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Save Policy</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences#getSavePolicy()
	 * @see #getSavePolicyPreferences()
	 * @generated
	 */
	EAttribute getSavePolicyPreferences_SavePolicy();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences <em>Shim Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shim Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences
	 * @generated
	 */
	EClass getShimPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getComponentsPreferences <em>Components Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getComponentsPreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_ComponentsPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getMasterComponentPreferences <em>Master Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Component Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getMasterComponentPreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_MasterComponentPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getSlaveComponentPreferences <em>Slave Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Slave Component Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getSlaveComponentPreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_SlaveComponentPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getComponentSetPreferences <em>Component Set Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component Set Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getComponentSetPreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_ComponentSetPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getAddressSpacePreferences <em>Address Space Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Space Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getAddressSpacePreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_AddressSpacePreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getCommunicationSetPreferences <em>Communication Set Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication Set Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getCommunicationSetPreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_CommunicationSetPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getCacheDataPreferences <em>Cache Data Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache Data Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getCacheDataPreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_CacheDataPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getAccessTypePreferences <em>Access Type Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Type Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getAccessTypePreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_AccessTypePreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getLatencyPreferences <em>Latency Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getLatencyPreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_LatencyPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getPitchPreferences <em>Pitch Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pitch Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getPitchPreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_PitchPreferences();

	/**
	 * Returns the meta object for the containment reference '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getSavePolicyPreferences <em>Save Policy Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Save Policy Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getSavePolicyPreferences()
	 * @see #getShimPreferences()
	 * @generated
	 */
	EReference getShimPreferences_SavePolicyPreferences();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences <em>Slave Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slave Component Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences
	 * @generated
	 */
	EClass getSlaveComponentPreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getSize()
	 * @see #getSlaveComponentPreferences()
	 * @generated
	 */
	EAttribute getSlaveComponentPreferences_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getSizeUnit <em>Size Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Unit</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getSizeUnit()
	 * @see #getSlaveComponentPreferences()
	 * @generated
	 */
	EAttribute getSlaveComponentPreferences_SizeUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getRwType <em>Rw Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rw Type</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getRwType()
	 * @see #getSlaveComponentPreferences()
	 * @generated
	 */
	EAttribute getSlaveComponentPreferences_RwType();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect <em>Cache Type Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cache Type Select</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect
	 * @generated
	 */
	EEnum getCacheTypeSelect();

	/**
	 * Returns the meta object for enum '{@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyType <em>Save Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Save Policy Type</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyType
	 * @generated
	 */
	EEnum getSavePolicyType();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect <em>Cache Type Select Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Cache Type Select Object</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect
	 * @model instanceClass="org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect"
	 *        extendedMetaData="name='CacheTypeSelect:Object' baseType='CacheTypeSelect'"
	 * @generated
	 */
	EDataType getCacheTypeSelectObject();

	/**
	 * Returns the meta object for data type '{@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyType <em>Save Policy Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Save Policy Type Object</em>'.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyType
	 * @model instanceClass="org.multicore_association.shim.edit.model.app.preferences.SavePolicyType"
	 *        extendedMetaData="name='SavePolicyType:Object' baseType='SavePolicyType'"
	 * @generated
	 */
	EDataType getSavePolicyTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PreferencesFactory getPreferencesFactory();

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
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AbstractPreferencesImpl <em>Abstract Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AbstractPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAbstractPreferences()
		 * @generated
		 */
		EClass ABSTRACT_PREFERENCES = eINSTANCE.getAbstractPreferences();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AbstractComponentPreferencesImpl <em>Abstract Component Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AbstractComponentPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAbstractComponentPreferences()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_PREFERENCES = eINSTANCE.getAbstractComponentPreferences();

		/**
		 * The meta object literal for the '<em><b>Base Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT_PREFERENCES__BASE_NAME = eINSTANCE.getAbstractComponentPreferences_BaseName();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AbstractPerformancePreferencesImpl <em>Abstract Performance Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AbstractPerformancePreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAbstractPerformancePreferences()
		 * @generated
		 */
		EClass ABSTRACT_PERFORMANCE_PREFERENCES = eINSTANCE.getAbstractPerformancePreferences();

		/**
		 * The meta object literal for the '<em><b>Best</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PERFORMANCE_PREFERENCES__BEST = eINSTANCE.getAbstractPerformancePreferences_Best();

		/**
		 * The meta object literal for the '<em><b>Typical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PERFORMANCE_PREFERENCES__TYPICAL = eINSTANCE.getAbstractPerformancePreferences_Typical();

		/**
		 * The meta object literal for the '<em><b>Worst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PERFORMANCE_PREFERENCES__WORST = eINSTANCE.getAbstractPerformancePreferences_Worst();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl <em>Access Type Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAccessTypePreferences()
		 * @generated
		 */
		EClass ACCESS_TYPE_PREFERENCES = eINSTANCE.getAccessTypePreferences();

		/**
		 * The meta object literal for the '<em><b>Check R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE_PREFERENCES__CHECK_R = eINSTANCE.getAccessTypePreferences_CheckR();

		/**
		 * The meta object literal for the '<em><b>Check W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE_PREFERENCES__CHECK_W = eINSTANCE.getAccessTypePreferences_CheckW();

		/**
		 * The meta object literal for the '<em><b>Check RW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE_PREFERENCES__CHECK_RW = eINSTANCE.getAccessTypePreferences_CheckRW();

		/**
		 * The meta object literal for the '<em><b>Check RWX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE_PREFERENCES__CHECK_RWX = eINSTANCE.getAccessTypePreferences_CheckRWX();

		/**
		 * The meta object literal for the '<em><b>Check RX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE_PREFERENCES__CHECK_RX = eINSTANCE.getAccessTypePreferences_CheckRX();

		/**
		 * The meta object literal for the '<em><b>Check X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE_PREFERENCES__CHECK_X = eINSTANCE.getAccessTypePreferences_CheckX();

		/**
		 * The meta object literal for the '<em><b>Access Byte Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE = eINSTANCE.getAccessTypePreferences_AccessByteSize();

		/**
		 * The meta object literal for the '<em><b>NBurst</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_TYPE_PREFERENCES__NBURST = eINSTANCE.getAccessTypePreferences_NBurst();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.AddressSpacePreferencesImpl <em>Address Space Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.AddressSpacePreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getAddressSpacePreferences()
		 * @generated
		 */
		EClass ADDRESS_SPACE_PREFERENCES = eINSTANCE.getAddressSpacePreferences();

		/**
		 * The meta object literal for the '<em><b>Number Sub Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE = eINSTANCE.getAddressSpacePreferences_NumberSubSpace();

		/**
		 * The meta object literal for the '<em><b>Size Sub Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE = eINSTANCE.getAddressSpacePreferences_SizeSubSpace();

		/**
		 * The meta object literal for the '<em><b>Address Space Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME = eINSTANCE
				.getAddressSpacePreferences_AddressSpaceName();

		/**
		 * The meta object literal for the '<em><b>Sub Space Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME = eINSTANCE.getAddressSpacePreferences_SubSpaceName();

		/**
		 * The meta object literal for the '<em><b>Dont Connect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE_PREFERENCES__DONT_CONNECT = eINSTANCE.getAddressSpacePreferences_DontConnect();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataPreferencesImpl <em>Cache Data Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCacheDataPreferences()
		 * @generated
		 */
		EClass CACHE_DATA_PREFERENCES = eINSTANCE.getCacheDataPreferences();

		/**
		 * The meta object literal for the '<em><b>Cache Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_DATA_PREFERENCES__CACHE_TYPE = eINSTANCE.getCacheDataPreferences_CacheType();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_DATA_PREFERENCES__DATA = eINSTANCE.getCacheDataPreferences_Data();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_DATA_PREFERENCES__INSTRUCTION = eINSTANCE.getCacheDataPreferences_Instruction();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl <em>Cache Data Unit Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCacheDataUnitPreferences()
		 * @generated
		 */
		EClass CACHE_DATA_UNIT_PREFERENCES = eINSTANCE.getCacheDataUnitPreferences();

		/**
		 * The meta object literal for the '<em><b>Cache Coherenecy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY = eINSTANCE
				.getCacheDataUnitPreferences_CacheCoherenecy();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_DATA_UNIT_PREFERENCES__SIZE = eINSTANCE.getCacheDataUnitPreferences_Size();

		/**
		 * The meta object literal for the '<em><b>Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT = eINSTANCE.getCacheDataUnitPreferences_SizeUnit();

		/**
		 * The meta object literal for the '<em><b>NWay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_DATA_UNIT_PREFERENCES__NWAY = eINSTANCE.getCacheDataUnitPreferences_NWay();

		/**
		 * The meta object literal for the '<em><b>Line Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE = eINSTANCE.getCacheDataUnitPreferences_LineSize();

		/**
		 * The meta object literal for the '<em><b>Lock Down Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE = eINSTANCE.getCacheDataUnitPreferences_LockDownType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl <em>Communication Set Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCommunicationSetPreferences()
		 * @generated
		 */
		EClass COMMUNICATION_SET_PREFERENCES = eINSTANCE.getCommunicationSetPreferences();

		/**
		 * The meta object literal for the '<em><b>Check Interrupt Communication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION = eINSTANCE
				.getCommunicationSetPreferences_CheckInterruptCommunication();

		/**
		 * The meta object literal for the '<em><b>Check Event Communication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION = eINSTANCE
				.getCommunicationSetPreferences_CheckEventCommunication();

		/**
		 * The meta object literal for the '<em><b>Check FIFO Communication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION = eINSTANCE
				.getCommunicationSetPreferences_CheckFIFOCommunication();

		/**
		 * The meta object literal for the '<em><b>Fifo Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE = eINSTANCE
				.getCommunicationSetPreferences_FifoDataSize();

		/**
		 * The meta object literal for the '<em><b>Fifo Data Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT = eINSTANCE
				.getCommunicationSetPreferences_FifoDataSizeUnit();

		/**
		 * The meta object literal for the '<em><b>Queue Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE = eINSTANCE.getCommunicationSetPreferences_QueueSize();

		/**
		 * The meta object literal for the '<em><b>Check Shared Memory Communication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION = eINSTANCE
				.getCommunicationSetPreferences_CheckSharedMemoryCommunication();

		/**
		 * The meta object literal for the '<em><b>Shared Memory Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE = eINSTANCE
				.getCommunicationSetPreferences_SharedMemoryDataSize();

		/**
		 * The meta object literal for the '<em><b>Shared Memory Data Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT = eINSTANCE
				.getCommunicationSetPreferences_SharedMemoryDataSizeUnit();

		/**
		 * The meta object literal for the '<em><b>Operation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE = eINSTANCE
				.getCommunicationSetPreferences_OperationType();

		/**
		 * The meta object literal for the '<em><b>Check Shared Register Communication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION = eINSTANCE
				.getCommunicationSetPreferences_CheckSharedRegisterCommunication();

		/**
		 * The meta object literal for the '<em><b>Shared Register Data Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE = eINSTANCE
				.getCommunicationSetPreferences_SharedRegisterDataSize();

		/**
		 * The meta object literal for the '<em><b>Shared Register Data Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT = eINSTANCE
				.getCommunicationSetPreferences_SharedRegisterDataSizeUnit();

		/**
		 * The meta object literal for the '<em><b>NRegister</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__NREGISTER = eINSTANCE.getCommunicationSetPreferences_NRegister();

		/**
		 * The meta object literal for the '<em><b>Dont Connect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_SET_PREFERENCES__DONT_CONNECT = eINSTANCE.getCommunicationSetPreferences_DontConnect();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.ComponentSetPreferencesImpl <em>Component Set Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.ComponentSetPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getComponentSetPreferences()
		 * @generated
		 */
		EClass COMPONENT_SET_PREFERENCES = eINSTANCE.getComponentSetPreferences();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.ComponentsPreferencesImpl <em>Components Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.ComponentsPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getComponentsPreferences()
		 * @generated
		 */
		EClass COMPONENTS_PREFERENCES = eINSTANCE.getComponentsPreferences();

		/**
		 * The meta object literal for the '<em><b>System Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS_PREFERENCES__SYSTEM_NAME = eINSTANCE.getComponentsPreferences_SystemName();

		/**
		 * The meta object literal for the '<em><b>Number Master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS_PREFERENCES__NUMBER_MASTER = eINSTANCE.getComponentsPreferences_NumberMaster();

		/**
		 * The meta object literal for the '<em><b>Number Slave</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS_PREFERENCES__NUMBER_SLAVE = eINSTANCE.getComponentsPreferences_NumberSlave();

		/**
		 * The meta object literal for the '<em><b>Number Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS_PREFERENCES__NUMBER_COMPONENT = eINSTANCE.getComponentsPreferences_NumberComponent();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS_PREFERENCES__CLOCK = eINSTANCE.getComponentsPreferences_Clock();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.LatencyPreferencesImpl <em>Latency Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.LatencyPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getLatencyPreferences()
		 * @generated
		 */
		EClass LATENCY_PREFERENCES = eINSTANCE.getLatencyPreferences();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl <em>Master Component Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getMasterComponentPreferences()
		 * @generated
		 */
		EClass MASTER_COMPONENT_PREFERENCES = eINSTANCE.getMasterComponentPreferences();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT_PREFERENCES__TYPE = eINSTANCE.getMasterComponentPreferences_Type();

		/**
		 * The meta object literal for the '<em><b>Endian</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT_PREFERENCES__ENDIAN = eINSTANCE.getMasterComponentPreferences_Endian();

		/**
		 * The meta object literal for the '<em><b>Arch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT_PREFERENCES__ARCH = eINSTANCE.getMasterComponentPreferences_Arch();

		/**
		 * The meta object literal for the '<em><b>Arch Opt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT_PREFERENCES__ARCH_OPT = eINSTANCE.getMasterComponentPreferences_ArchOpt();

		/**
		 * The meta object literal for the '<em><b>NChannel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT_PREFERENCES__NCHANNEL = eINSTANCE.getMasterComponentPreferences_NChannel();

		/**
		 * The meta object literal for the '<em><b>NThread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT_PREFERENCES__NTHREAD = eINSTANCE.getMasterComponentPreferences_NThread();

		/**
		 * The meta object literal for the '<em><b>Check Clock For Master</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER = eINSTANCE
				.getMasterComponentPreferences_CheckClockForMaster();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MASTER_COMPONENT_PREFERENCES__CLOCK = eINSTANCE.getMasterComponentPreferences_Clock();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.PitchPreferencesImpl <em>Pitch Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PitchPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getPitchPreferences()
		 * @generated
		 */
		EClass PITCH_PREFERENCES = eINSTANCE.getPitchPreferences();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.SavePolicyPreferencesImpl <em>Save Policy Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.SavePolicyPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getSavePolicyPreferences()
		 * @generated
		 */
		EClass SAVE_POLICY_PREFERENCES = eINSTANCE.getSavePolicyPreferences();

		/**
		 * The meta object literal for the '<em><b>Save Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVE_POLICY_PREFERENCES__SAVE_POLICY = eINSTANCE.getSavePolicyPreferences_SavePolicy();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl <em>Shim Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getShimPreferences()
		 * @generated
		 */
		EClass SHIM_PREFERENCES = eINSTANCE.getShimPreferences();

		/**
		 * The meta object literal for the '<em><b>Components Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__COMPONENTS_PREFERENCES = eINSTANCE.getShimPreferences_ComponentsPreferences();

		/**
		 * The meta object literal for the '<em><b>Master Component Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES = eINSTANCE
				.getShimPreferences_MasterComponentPreferences();

		/**
		 * The meta object literal for the '<em><b>Slave Component Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES = eINSTANCE
				.getShimPreferences_SlaveComponentPreferences();

		/**
		 * The meta object literal for the '<em><b>Component Set Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES = eINSTANCE.getShimPreferences_ComponentSetPreferences();

		/**
		 * The meta object literal for the '<em><b>Address Space Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES = eINSTANCE.getShimPreferences_AddressSpacePreferences();

		/**
		 * The meta object literal for the '<em><b>Communication Set Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES = eINSTANCE
				.getShimPreferences_CommunicationSetPreferences();

		/**
		 * The meta object literal for the '<em><b>Cache Data Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__CACHE_DATA_PREFERENCES = eINSTANCE.getShimPreferences_CacheDataPreferences();

		/**
		 * The meta object literal for the '<em><b>Access Type Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES = eINSTANCE.getShimPreferences_AccessTypePreferences();

		/**
		 * The meta object literal for the '<em><b>Latency Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__LATENCY_PREFERENCES = eINSTANCE.getShimPreferences_LatencyPreferences();

		/**
		 * The meta object literal for the '<em><b>Pitch Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__PITCH_PREFERENCES = eINSTANCE.getShimPreferences_PitchPreferences();

		/**
		 * The meta object literal for the '<em><b>Save Policy Preferences</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES = eINSTANCE.getShimPreferences_SavePolicyPreferences();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.impl.SlaveComponentPreferencesImpl <em>Slave Component Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.SlaveComponentPreferencesImpl
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getSlaveComponentPreferences()
		 * @generated
		 */
		EClass SLAVE_COMPONENT_PREFERENCES = eINSTANCE.getSlaveComponentPreferences();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAVE_COMPONENT_PREFERENCES__SIZE = eINSTANCE.getSlaveComponentPreferences_Size();

		/**
		 * The meta object literal for the '<em><b>Size Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAVE_COMPONENT_PREFERENCES__SIZE_UNIT = eINSTANCE.getSlaveComponentPreferences_SizeUnit();

		/**
		 * The meta object literal for the '<em><b>Rw Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLAVE_COMPONENT_PREFERENCES__RW_TYPE = eINSTANCE.getSlaveComponentPreferences_RwType();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect <em>Cache Type Select</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCacheTypeSelect()
		 * @generated
		 */
		EEnum CACHE_TYPE_SELECT = eINSTANCE.getCacheTypeSelect();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyType <em>Save Policy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyType
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getSavePolicyType()
		 * @generated
		 */
		EEnum SAVE_POLICY_TYPE = eINSTANCE.getSavePolicyType();

		/**
		 * The meta object literal for the '<em>Cache Type Select Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getCacheTypeSelectObject()
		 * @generated
		 */
		EDataType CACHE_TYPE_SELECT_OBJECT = eINSTANCE.getCacheTypeSelectObject();

		/**
		 * The meta object literal for the '<em>Save Policy Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyType
		 * @see org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl#getSavePolicyTypeObject()
		 * @generated
		 */
		EDataType SAVE_POLICY_TYPE_OBJECT = eINSTANCE.getSavePolicyTypeObject();

	}

} //PreferencesPackage
