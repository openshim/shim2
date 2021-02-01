/**
 */
package org.multicore_association.shim.edit.model.app;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.multicore_association.shim.edit.model.app.AppFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface AppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "app";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://multicore-association.org/shimApp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shimApp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppPackage eINSTANCE = org.multicore_association.shim.edit.model.app.impl.AppPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.impl.AbstractWizardPageDataImpl <em>Abstract Wizard Page Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.impl.AbstractWizardPageDataImpl
	 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getAbstractWizardPageData()
	 * @generated
	 */
	int ABSTRACT_WIZARD_PAGE_DATA = 0;

	/**
	 * The feature id for the '<em><b>Shim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WIZARD_PAGE_DATA__SHIM = 0;

	/**
	 * The number of structural features of the '<em>Abstract Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_WIZARD_PAGE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.impl.AccessTypeWizardPageDataImpl <em>Access Type Wizard Page Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.impl.AccessTypeWizardPageDataImpl
	 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getAccessTypeWizardPageData()
	 * @generated
	 */
	int ACCESS_TYPE_WIZARD_PAGE_DATA = 1;

	/**
	 * The feature id for the '<em><b>Shim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_WIZARD_PAGE_DATA__SHIM = ABSTRACT_WIZARD_PAGE_DATA__SHIM;

	/**
	 * The feature id for the '<em><b>Access Type Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_WIZARD_PAGE_DATA__ACCESS_TYPE_PREFERENCES = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access Type Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_WIZARD_PAGE_DATA_FEATURE_COUNT = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Access Type Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_WIZARD_PAGE_DATA_OPERATION_COUNT = ABSTRACT_WIZARD_PAGE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.impl.AddressSpaceParameterWizardPageDataImpl <em>Address Space Parameter Wizard Page Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.impl.AddressSpaceParameterWizardPageDataImpl
	 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getAddressSpaceParameterWizardPageData()
	 * @generated
	 */
	int ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA = 2;

	/**
	 * The feature id for the '<em><b>Shim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__SHIM = ABSTRACT_WIZARD_PAGE_DATA__SHIM;

	/**
	 * The feature id for the '<em><b>Address Space Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Number Of Address Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Slave Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Address Space Parameter Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA_FEATURE_COUNT = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Address Space Parameter Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA_OPERATION_COUNT = ABSTRACT_WIZARD_PAGE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.impl.CacheWizardPageDataImpl <em>Cache Wizard Page Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.impl.CacheWizardPageDataImpl
	 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getCacheWizardPageData()
	 * @generated
	 */
	int CACHE_WIZARD_PAGE_DATA = 3;

	/**
	 * The feature id for the '<em><b>Shim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_WIZARD_PAGE_DATA__SHIM = ABSTRACT_WIZARD_PAGE_DATA__SHIM;

	/**
	 * The feature id for the '<em><b>Cache Data Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_WIZARD_PAGE_DATA__CACHE_DATA_PREFERENCES = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cache Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_WIZARD_PAGE_DATA_FEATURE_COUNT = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cache Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CACHE_WIZARD_PAGE_DATA_OPERATION_COUNT = ABSTRACT_WIZARD_PAGE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.impl.CommunicationSetWizardPageDataImpl <em>Communication Set Wizard Page Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.impl.CommunicationSetWizardPageDataImpl
	 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getCommunicationSetWizardPageData()
	 * @generated
	 */
	int COMMUNICATION_SET_WIZARD_PAGE_DATA = 4;

	/**
	 * The feature id for the '<em><b>Shim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_WIZARD_PAGE_DATA__SHIM = ABSTRACT_WIZARD_PAGE_DATA__SHIM;

	/**
	 * The feature id for the '<em><b>Communication Set Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Communication Set Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_WIZARD_PAGE_DATA_FEATURE_COUNT = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Communication Set Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SET_WIZARD_PAGE_DATA_OPERATION_COUNT = ABSTRACT_WIZARD_PAGE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.multicore_association.shim.edit.model.app.impl.ComponentParameterWizardPageDataImpl <em>Component Parameter Wizard Page Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.multicore_association.shim.edit.model.app.impl.ComponentParameterWizardPageDataImpl
	 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getComponentParameterWizardPageData()
	 * @generated
	 */
	int COMPONENT_PARAMETER_WIZARD_PAGE_DATA = 5;

	/**
	 * The feature id for the '<em><b>Shim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SHIM = ABSTRACT_WIZARD_PAGE_DATA__SHIM;

	/**
	 * The feature id for the '<em><b>Components Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Master Component Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Slave Component Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component Set Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Parameter Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_WIZARD_PAGE_DATA_FEATURE_COUNT = ABSTRACT_WIZARD_PAGE_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Parameter Wizard Page Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PARAMETER_WIZARD_PAGE_DATA_OPERATION_COUNT = ABSTRACT_WIZARD_PAGE_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Byte Size List Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getByteSizeListType()
	 * @generated
	 */
	int BYTE_SIZE_LIST_TYPE = 6;

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.AbstractWizardPageData <em>Abstract Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Wizard Page Data</em>'.
	 * @see org.multicore_association.shim.edit.model.app.AbstractWizardPageData
	 * @generated
	 */
	EClass getAbstractWizardPageData();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.AbstractWizardPageData#getShim <em>Shim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shim</em>'.
	 * @see org.multicore_association.shim.edit.model.app.AbstractWizardPageData#getShim()
	 * @see #getAbstractWizardPageData()
	 * @generated
	 */
	EReference getAbstractWizardPageData_Shim();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData <em>Access Type Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Type Wizard Page Data</em>'.
	 * @see org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData
	 * @generated
	 */
	EClass getAccessTypeWizardPageData();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData#getAccessTypePreferences <em>Access Type Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Access Type Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData#getAccessTypePreferences()
	 * @see #getAccessTypeWizardPageData()
	 * @generated
	 */
	EReference getAccessTypeWizardPageData_AccessTypePreferences();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData <em>Address Space Parameter Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Space Parameter Wizard Page Data</em>'.
	 * @see org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData
	 * @generated
	 */
	EClass getAddressSpaceParameterWizardPageData();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getAddressSpacePreferences <em>Address Space Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address Space Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getAddressSpacePreferences()
	 * @see #getAddressSpaceParameterWizardPageData()
	 * @generated
	 */
	EReference getAddressSpaceParameterWizardPageData_AddressSpacePreferences();

	/**
	 * Returns the meta object for the attribute '{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getNumberOfAddressSpace <em>Number Of Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Address Space</em>'.
	 * @see org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getNumberOfAddressSpace()
	 * @see #getAddressSpaceParameterWizardPageData()
	 * @generated
	 */
	EAttribute getAddressSpaceParameterWizardPageData_NumberOfAddressSpace();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getTargetSlaveComponent <em>Target Slave Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Slave Component</em>'.
	 * @see org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getTargetSlaveComponent()
	 * @see #getAddressSpaceParameterWizardPageData()
	 * @generated
	 */
	EReference getAddressSpaceParameterWizardPageData_TargetSlaveComponent();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.CacheWizardPageData <em>Cache Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache Wizard Page Data</em>'.
	 * @see org.multicore_association.shim.edit.model.app.CacheWizardPageData
	 * @generated
	 */
	EClass getCacheWizardPageData();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.CacheWizardPageData#getCacheDataPreferences <em>Cache Data Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cache Data Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.CacheWizardPageData#getCacheDataPreferences()
	 * @see #getCacheWizardPageData()
	 * @generated
	 */
	EReference getCacheWizardPageData_CacheDataPreferences();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData <em>Communication Set Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Set Wizard Page Data</em>'.
	 * @see org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData
	 * @generated
	 */
	EClass getCommunicationSetWizardPageData();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getCommunicationSetPreferences <em>Communication Set Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Communication Set Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getCommunicationSetPreferences()
	 * @see #getCommunicationSetWizardPageData()
	 * @generated
	 */
	EReference getCommunicationSetWizardPageData_CommunicationSetPreferences();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getAddressSpace <em>Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address Space</em>'.
	 * @see org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getAddressSpace()
	 * @see #getCommunicationSetWizardPageData()
	 * @generated
	 */
	EReference getCommunicationSetWizardPageData_AddressSpace();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getSubSpace <em>Sub Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Space</em>'.
	 * @see org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getSubSpace()
	 * @see #getCommunicationSetWizardPageData()
	 * @generated
	 */
	EReference getCommunicationSetWizardPageData_SubSpace();

	/**
	 * Returns the meta object for class '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData <em>Component Parameter Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Parameter Wizard Page Data</em>'.
	 * @see org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData
	 * @generated
	 */
	EClass getComponentParameterWizardPageData();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getComponentsPreferences <em>Components Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Components Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getComponentsPreferences()
	 * @see #getComponentParameterWizardPageData()
	 * @generated
	 */
	EReference getComponentParameterWizardPageData_ComponentsPreferences();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getMasterComponentPreferences <em>Master Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Master Component Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getMasterComponentPreferences()
	 * @see #getComponentParameterWizardPageData()
	 * @generated
	 */
	EReference getComponentParameterWizardPageData_MasterComponentPreferences();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getSlaveComponentPreferences <em>Slave Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Slave Component Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getSlaveComponentPreferences()
	 * @see #getComponentParameterWizardPageData()
	 * @generated
	 */
	EReference getComponentParameterWizardPageData_SlaveComponentPreferences();

	/**
	 * Returns the meta object for the reference '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getComponentSetPreferences <em>Component Set Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Set Preferences</em>'.
	 * @see org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getComponentSetPreferences()
	 * @see #getComponentParameterWizardPageData()
	 * @generated
	 */
	EReference getComponentParameterWizardPageData_ComponentSetPreferences();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Byte Size List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Byte Size List Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ByteSizeListType' whiteSpace='collapse' pattern='(\\d+(,\\d+)*)?'"
	 * @generated
	 */
	EDataType getByteSizeListType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppFactory getAppFactory();

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
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.impl.AbstractWizardPageDataImpl <em>Abstract Wizard Page Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.impl.AbstractWizardPageDataImpl
		 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getAbstractWizardPageData()
		 * @generated
		 */
		EClass ABSTRACT_WIZARD_PAGE_DATA = eINSTANCE.getAbstractWizardPageData();

		/**
		 * The meta object literal for the '<em><b>Shim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_WIZARD_PAGE_DATA__SHIM = eINSTANCE.getAbstractWizardPageData_Shim();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.impl.AccessTypeWizardPageDataImpl <em>Access Type Wizard Page Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.impl.AccessTypeWizardPageDataImpl
		 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getAccessTypeWizardPageData()
		 * @generated
		 */
		EClass ACCESS_TYPE_WIZARD_PAGE_DATA = eINSTANCE.getAccessTypeWizardPageData();

		/**
		 * The meta object literal for the '<em><b>Access Type Preferences</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_TYPE_WIZARD_PAGE_DATA__ACCESS_TYPE_PREFERENCES = eINSTANCE
				.getAccessTypeWizardPageData_AccessTypePreferences();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.impl.AddressSpaceParameterWizardPageDataImpl <em>Address Space Parameter Wizard Page Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.impl.AddressSpaceParameterWizardPageDataImpl
		 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getAddressSpaceParameterWizardPageData()
		 * @generated
		 */
		EClass ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA = eINSTANCE.getAddressSpaceParameterWizardPageData();

		/**
		 * The meta object literal for the '<em><b>Address Space Preferences</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES = eINSTANCE
				.getAddressSpaceParameterWizardPageData_AddressSpacePreferences();

		/**
		 * The meta object literal for the '<em><b>Number Of Address Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE = eINSTANCE
				.getAddressSpaceParameterWizardPageData_NumberOfAddressSpace();

		/**
		 * The meta object literal for the '<em><b>Target Slave Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT = eINSTANCE
				.getAddressSpaceParameterWizardPageData_TargetSlaveComponent();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.impl.CacheWizardPageDataImpl <em>Cache Wizard Page Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.impl.CacheWizardPageDataImpl
		 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getCacheWizardPageData()
		 * @generated
		 */
		EClass CACHE_WIZARD_PAGE_DATA = eINSTANCE.getCacheWizardPageData();

		/**
		 * The meta object literal for the '<em><b>Cache Data Preferences</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CACHE_WIZARD_PAGE_DATA__CACHE_DATA_PREFERENCES = eINSTANCE
				.getCacheWizardPageData_CacheDataPreferences();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.impl.CommunicationSetWizardPageDataImpl <em>Communication Set Wizard Page Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.impl.CommunicationSetWizardPageDataImpl
		 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getCommunicationSetWizardPageData()
		 * @generated
		 */
		EClass COMMUNICATION_SET_WIZARD_PAGE_DATA = eINSTANCE.getCommunicationSetWizardPageData();

		/**
		 * The meta object literal for the '<em><b>Communication Set Preferences</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES = eINSTANCE
				.getCommunicationSetWizardPageData_CommunicationSetPreferences();

		/**
		 * The meta object literal for the '<em><b>Address Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE = eINSTANCE
				.getCommunicationSetWizardPageData_AddressSpace();

		/**
		 * The meta object literal for the '<em><b>Sub Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE = eINSTANCE
				.getCommunicationSetWizardPageData_SubSpace();

		/**
		 * The meta object literal for the '{@link org.multicore_association.shim.edit.model.app.impl.ComponentParameterWizardPageDataImpl <em>Component Parameter Wizard Page Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.multicore_association.shim.edit.model.app.impl.ComponentParameterWizardPageDataImpl
		 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getComponentParameterWizardPageData()
		 * @generated
		 */
		EClass COMPONENT_PARAMETER_WIZARD_PAGE_DATA = eINSTANCE.getComponentParameterWizardPageData();

		/**
		 * The meta object literal for the '<em><b>Components Preferences</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES = eINSTANCE
				.getComponentParameterWizardPageData_ComponentsPreferences();

		/**
		 * The meta object literal for the '<em><b>Master Component Preferences</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES = eINSTANCE
				.getComponentParameterWizardPageData_MasterComponentPreferences();

		/**
		 * The meta object literal for the '<em><b>Slave Component Preferences</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES = eINSTANCE
				.getComponentParameterWizardPageData_SlaveComponentPreferences();

		/**
		 * The meta object literal for the '<em><b>Component Set Preferences</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES = eINSTANCE
				.getComponentParameterWizardPageData_ComponentSetPreferences();

		/**
		 * The meta object literal for the '<em>Byte Size List Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.multicore_association.shim.edit.model.app.impl.AppPackageImpl#getByteSizeListType()
		 * @generated
		 */
		EDataType BYTE_SIZE_LIST_TYPE = eINSTANCE.getByteSizeListType();

	}

} //AppPackage
