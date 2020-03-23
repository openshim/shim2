/**
 */
package org.multicore_association.shim.edit.model.app.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.multicore_association.shim.edit.model.app.AbstractWizardPageData;
import org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData;
import org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData;
import org.multicore_association.shim.edit.model.app.AppFactory;
import org.multicore_association.shim.edit.model.app.AppPackage;
import org.multicore_association.shim.edit.model.app.CacheWizardPageData;
import org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData;
import org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData;

import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

import org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesPackageImpl;

import org.multicore_association.shim.edit.model.app.util.AppValidator;

import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppPackageImpl extends EPackageImpl implements AppPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractWizardPageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessTypeWizardPageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressSpaceParameterWizardPageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheWizardPageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationSetWizardPageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentParameterWizardPageDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType byteSizeListTypeEDataType = null;

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
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AppPackageImpl() {
		super(eNS_URI, AppFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AppPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AppPackage init() {
		if (isInited)
			return (AppPackage) EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAppPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AppPackageImpl theAppPackage = registeredAppPackage instanceof AppPackageImpl
				? (AppPackageImpl) registeredAppPackage
				: new AppPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ShimPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PreferencesPackage.eNS_URI);
		PreferencesPackageImpl thePreferencesPackage = (PreferencesPackageImpl) (registeredPackage instanceof PreferencesPackageImpl
				? registeredPackage
				: PreferencesPackage.eINSTANCE);

		// Create package meta-data objects
		theAppPackage.createPackageContents();
		thePreferencesPackage.createPackageContents();

		// Initialize created meta-data
		theAppPackage.initializePackageContents();
		thePreferencesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theAppPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return AppValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theAppPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AppPackage.eNS_URI, theAppPackage);
		return theAppPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractWizardPageData() {
		return abstractWizardPageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractWizardPageData_Shim() {
		return (EReference) abstractWizardPageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessTypeWizardPageData() {
		return accessTypeWizardPageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessTypeWizardPageData_AccessTypePreferences() {
		return (EReference) accessTypeWizardPageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressSpaceParameterWizardPageData() {
		return addressSpaceParameterWizardPageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressSpaceParameterWizardPageData_AddressSpacePreferences() {
		return (EReference) addressSpaceParameterWizardPageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressSpaceParameterWizardPageData_NumberOfAddressSpace() {
		return (EAttribute) addressSpaceParameterWizardPageDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddressSpaceParameterWizardPageData_TargetSlaveComponent() {
		return (EReference) addressSpaceParameterWizardPageDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCacheWizardPageData() {
		return cacheWizardPageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCacheWizardPageData_CacheDataPreferences() {
		return (EReference) cacheWizardPageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationSetWizardPageData() {
		return communicationSetWizardPageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationSetWizardPageData_CommunicationSetPreferences() {
		return (EReference) communicationSetWizardPageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationSetWizardPageData_AddressSpace() {
		return (EReference) communicationSetWizardPageDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationSetWizardPageData_SubSpace() {
		return (EReference) communicationSetWizardPageDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentParameterWizardPageData() {
		return componentParameterWizardPageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentParameterWizardPageData_ComponentsPreferences() {
		return (EReference) componentParameterWizardPageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentParameterWizardPageData_MasterComponentPreferences() {
		return (EReference) componentParameterWizardPageDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentParameterWizardPageData_SlaveComponentPreferences() {
		return (EReference) componentParameterWizardPageDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentParameterWizardPageData_ComponentSetPreferences() {
		return (EReference) componentParameterWizardPageDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getByteSizeListType() {
		return byteSizeListTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppFactory getAppFactory() {
		return (AppFactory) getEFactoryInstance();
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
		abstractWizardPageDataEClass = createEClass(ABSTRACT_WIZARD_PAGE_DATA);
		createEReference(abstractWizardPageDataEClass, ABSTRACT_WIZARD_PAGE_DATA__SHIM);

		accessTypeWizardPageDataEClass = createEClass(ACCESS_TYPE_WIZARD_PAGE_DATA);
		createEReference(accessTypeWizardPageDataEClass, ACCESS_TYPE_WIZARD_PAGE_DATA__ACCESS_TYPE_PREFERENCES);

		addressSpaceParameterWizardPageDataEClass = createEClass(ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA);
		createEReference(addressSpaceParameterWizardPageDataEClass,
				ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES);
		createEAttribute(addressSpaceParameterWizardPageDataEClass,
				ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE);
		createEReference(addressSpaceParameterWizardPageDataEClass,
				ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT);

		cacheWizardPageDataEClass = createEClass(CACHE_WIZARD_PAGE_DATA);
		createEReference(cacheWizardPageDataEClass, CACHE_WIZARD_PAGE_DATA__CACHE_DATA_PREFERENCES);

		communicationSetWizardPageDataEClass = createEClass(COMMUNICATION_SET_WIZARD_PAGE_DATA);
		createEReference(communicationSetWizardPageDataEClass,
				COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES);
		createEReference(communicationSetWizardPageDataEClass, COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE);
		createEReference(communicationSetWizardPageDataEClass, COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE);

		componentParameterWizardPageDataEClass = createEClass(COMPONENT_PARAMETER_WIZARD_PAGE_DATA);
		createEReference(componentParameterWizardPageDataEClass,
				COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES);
		createEReference(componentParameterWizardPageDataEClass,
				COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES);
		createEReference(componentParameterWizardPageDataEClass,
				COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES);
		createEReference(componentParameterWizardPageDataEClass,
				COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES);

		// Create data types
		byteSizeListTypeEDataType = createEDataType(BYTE_SIZE_LIST_TYPE);
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
		PreferencesPackage thePreferencesPackage = (PreferencesPackage) EPackage.Registry.INSTANCE
				.getEPackage(PreferencesPackage.eNS_URI);
		ShimPackage theShimPackage = (ShimPackage) EPackage.Registry.INSTANCE.getEPackage(ShimPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thePreferencesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accessTypeWizardPageDataEClass.getESuperTypes().add(this.getAbstractWizardPageData());
		addressSpaceParameterWizardPageDataEClass.getESuperTypes().add(this.getAbstractWizardPageData());
		cacheWizardPageDataEClass.getESuperTypes().add(this.getAbstractWizardPageData());
		communicationSetWizardPageDataEClass.getESuperTypes().add(this.getAbstractWizardPageData());
		componentParameterWizardPageDataEClass.getESuperTypes().add(this.getAbstractWizardPageData());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractWizardPageDataEClass, AbstractWizardPageData.class, "AbstractWizardPageData", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractWizardPageData_Shim(), theShimPackage.getShim(), null, "shim", null, 0, 1,
				AbstractWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessTypeWizardPageDataEClass, AccessTypeWizardPageData.class, "AccessTypeWizardPageData",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessTypeWizardPageData_AccessTypePreferences(),
				thePreferencesPackage.getAccessTypePreferences(), null, "accessTypePreferences", null, 1, 1,
				AccessTypeWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressSpaceParameterWizardPageDataEClass, AddressSpaceParameterWizardPageData.class,
				"AddressSpaceParameterWizardPageData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressSpaceParameterWizardPageData_AddressSpacePreferences(),
				thePreferencesPackage.getAddressSpacePreferences(), null, "addressSpacePreferences", null, 1, 1,
				AddressSpaceParameterWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressSpaceParameterWizardPageData_NumberOfAddressSpace(),
				theShimPackage.getUnsignedIntType(), "numberOfAddressSpace", null, 1, 1,
				AddressSpaceParameterWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressSpaceParameterWizardPageData_TargetSlaveComponent(),
				theShimPackage.getSlaveComponent(), null, "targetSlaveComponent", null, 1, 1,
				AddressSpaceParameterWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheWizardPageDataEClass, CacheWizardPageData.class, "CacheWizardPageData", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCacheWizardPageData_CacheDataPreferences(), thePreferencesPackage.getCacheDataPreferences(),
				null, "cacheDataPreferences", null, 1, 1, CacheWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationSetWizardPageDataEClass, CommunicationSetWizardPageData.class,
				"CommunicationSetWizardPageData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationSetWizardPageData_CommunicationSetPreferences(),
				thePreferencesPackage.getCommunicationSetPreferences(), null, "communicationSetPreferences", null, 1, 1,
				CommunicationSetWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSetWizardPageData_AddressSpace(), theShimPackage.getAddressSpace(), null,
				"addressSpace", null, 1, 1, CommunicationSetWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationSetWizardPageData_SubSpace(), theShimPackage.getSubSpace(), null, "subSpace",
				null, 1, 1, CommunicationSetWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentParameterWizardPageDataEClass, ComponentParameterWizardPageData.class,
				"ComponentParameterWizardPageData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentParameterWizardPageData_ComponentsPreferences(),
				thePreferencesPackage.getComponentsPreferences(), null, "componentsPreferences", null, 1, 1,
				ComponentParameterWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentParameterWizardPageData_MasterComponentPreferences(),
				thePreferencesPackage.getMasterComponentPreferences(), null, "masterComponentPreferences", null, 1, 1,
				ComponentParameterWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentParameterWizardPageData_SlaveComponentPreferences(),
				thePreferencesPackage.getSlaveComponentPreferences(), null, "slaveComponentPreferences", null, 1, 1,
				ComponentParameterWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentParameterWizardPageData_ComponentSetPreferences(),
				thePreferencesPackage.getComponentSetPreferences(), null, "componentSetPreferences", null, 1, 1,
				ComponentParameterWizardPageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(byteSizeListTypeEDataType, String.class, "ByteSizeListType", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation(this, source, new String[] { "qualified", "false" });
		addAnnotation(abstractWizardPageDataEClass, source,
				new String[] { "name", "AbstractWizardPageData", "kind", "elementOnly" });
		addAnnotation(getAbstractWizardPageData_Shim(), source,
				new String[] { "kind", "element", "name", "Shim", "namespace", "##targetNamespace" });
		addAnnotation(accessTypeWizardPageDataEClass, source,
				new String[] { "name", "AccessTypeWizardPageData", "kind", "elementOnly" });
		addAnnotation(getAccessTypeWizardPageData_AccessTypePreferences(), source,
				new String[] { "kind", "element", "name", "AccessTypePreferences", "namespace", "##targetNamespace" });
		addAnnotation(addressSpaceParameterWizardPageDataEClass, source,
				new String[] { "name", "AddressSpaceParameterWizardPageData", "kind", "elementOnly" });
		addAnnotation(getAddressSpaceParameterWizardPageData_AddressSpacePreferences(), source, new String[] { "kind",
				"element", "name", "AddressSpacePreferences", "namespace", "##targetNamespace" });
		addAnnotation(getAddressSpaceParameterWizardPageData_NumberOfAddressSpace(), source,
				new String[] { "kind", "attribute", "name", "numberOfAddressSpace", "namespace", "##targetNamespace" });
		addAnnotation(getAddressSpaceParameterWizardPageData_TargetSlaveComponent(), source,
				new String[] { "kind", "element", "name", "TargetSlaveComponent", "namespace", "##targetNamespace" });
		addAnnotation(byteSizeListTypeEDataType, source,
				new String[] { "name", "ByteSizeListType", "whiteSpace", "collapse", "pattern", "(\\d+(,\\d+)*)?" });
		addAnnotation(cacheWizardPageDataEClass, source,
				new String[] { "name", "CacheWizardPageData", "kind", "elementOnly" });
		addAnnotation(getCacheWizardPageData_CacheDataPreferences(), source,
				new String[] { "kind", "element", "name", "CacheDataPreferences", "namespace", "##targetNamespace" });
		addAnnotation(communicationSetWizardPageDataEClass, source,
				new String[] { "name", "CommunicationSetWizardPageData", "kind", "elementOnly" });
		addAnnotation(getCommunicationSetWizardPageData_CommunicationSetPreferences(), source, new String[] { "kind",
				"element", "name", "CommunicationSetPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetWizardPageData_AddressSpace(), source,
				new String[] { "kind", "element", "name", "AddressSpace", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetWizardPageData_SubSpace(), source,
				new String[] { "kind", "element", "name", "SubSpace", "namespace", "##targetNamespace" });
		addAnnotation(componentParameterWizardPageDataEClass, source,
				new String[] { "name", "ComponentParameterWizardPageData", "kind", "elementOnly" });
		addAnnotation(getComponentParameterWizardPageData_ComponentsPreferences(), source,
				new String[] { "kind", "element", "name", "ComponentsPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getComponentParameterWizardPageData_MasterComponentPreferences(), source, new String[] { "kind",
				"element", "name", "MasterComponentPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getComponentParameterWizardPageData_SlaveComponentPreferences(), source, new String[] { "kind",
				"element", "name", "SlaveComponentPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getComponentParameterWizardPageData_ComponentSetPreferences(), source, new String[] { "kind",
				"element", "name", "ComponentSetPreferences", "namespace", "##targetNamespace" });
	}

} //AppPackageImpl
