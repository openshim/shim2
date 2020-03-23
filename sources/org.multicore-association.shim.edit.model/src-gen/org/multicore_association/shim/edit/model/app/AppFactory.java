/**
 */
package org.multicore_association.shim.edit.model.app;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.edit.model.app.AppPackage
 * @generated
 */
public interface AppFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppFactory eINSTANCE = org.multicore_association.shim.edit.model.app.impl.AppFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Access Type Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Type Wizard Page Data</em>'.
	 * @generated
	 */
	AccessTypeWizardPageData createAccessTypeWizardPageData();

	/**
	 * Returns a new object of class '<em>Address Space Parameter Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Space Parameter Wizard Page Data</em>'.
	 * @generated
	 */
	AddressSpaceParameterWizardPageData createAddressSpaceParameterWizardPageData();

	/**
	 * Returns a new object of class '<em>Cache Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Wizard Page Data</em>'.
	 * @generated
	 */
	CacheWizardPageData createCacheWizardPageData();

	/**
	 * Returns a new object of class '<em>Communication Set Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Set Wizard Page Data</em>'.
	 * @generated
	 */
	CommunicationSetWizardPageData createCommunicationSetWizardPageData();

	/**
	 * Returns a new object of class '<em>Component Parameter Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Parameter Wizard Page Data</em>'.
	 * @generated
	 */
	ComponentParameterWizardPageData createComponentParameterWizardPageData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AppPackage getAppPackage();

} //AppFactory
