/**
 */
package org.multicore_association.shim.edit.model.app.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.multicore_association.shim.edit.model.app.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppFactoryImpl extends EFactoryImpl implements AppFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppFactory init() {
		try {
			AppFactory theAppFactory = (AppFactory) EPackage.Registry.INSTANCE.getEFactory(AppPackage.eNS_URI);
			if (theAppFactory != null) {
				return theAppFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AppFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AppPackage.ACCESS_TYPE_WIZARD_PAGE_DATA:
			return createAccessTypeWizardPageData();
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA:
			return createAddressSpaceParameterWizardPageData();
		case AppPackage.CACHE_WIZARD_PAGE_DATA:
			return createCacheWizardPageData();
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA:
			return createCommunicationSetWizardPageData();
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA:
			return createComponentParameterWizardPageData();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case AppPackage.BYTE_SIZE_LIST_TYPE:
			return createByteSizeListTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case AppPackage.BYTE_SIZE_LIST_TYPE:
			return convertByteSizeListTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessTypeWizardPageData createAccessTypeWizardPageData() {
		AccessTypeWizardPageDataImpl accessTypeWizardPageData = new AccessTypeWizardPageDataImpl();
		return accessTypeWizardPageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressSpaceParameterWizardPageData createAddressSpaceParameterWizardPageData() {
		AddressSpaceParameterWizardPageDataImpl addressSpaceParameterWizardPageData = new AddressSpaceParameterWizardPageDataImpl();
		return addressSpaceParameterWizardPageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheWizardPageData createCacheWizardPageData() {
		CacheWizardPageDataImpl cacheWizardPageData = new CacheWizardPageDataImpl();
		return cacheWizardPageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationSetWizardPageData createCommunicationSetWizardPageData() {
		CommunicationSetWizardPageDataImpl communicationSetWizardPageData = new CommunicationSetWizardPageDataImpl();
		return communicationSetWizardPageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentParameterWizardPageData createComponentParameterWizardPageData() {
		ComponentParameterWizardPageDataImpl componentParameterWizardPageData = new ComponentParameterWizardPageDataImpl();
		return componentParameterWizardPageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createByteSizeListTypeFromString(EDataType eDataType, String initialValue) {
		return (String) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertByteSizeListTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppPackage getAppPackage() {
		return (AppPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AppPackage getPackage() {
		return AppPackage.eINSTANCE;
	}

} //AppFactoryImpl
