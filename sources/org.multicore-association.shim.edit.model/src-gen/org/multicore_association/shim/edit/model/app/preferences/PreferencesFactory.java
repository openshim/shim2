/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage
 * @generated
 */
public interface PreferencesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PreferencesFactory eINSTANCE = org.multicore_association.shim.edit.model.app.preferences.impl.PreferencesFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Access Type Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Type Preferences</em>'.
	 * @generated
	 */
	AccessTypePreferences createAccessTypePreferences();

	/**
	 * Returns a new object of class '<em>Address Space Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Space Preferences</em>'.
	 * @generated
	 */
	AddressSpacePreferences createAddressSpacePreferences();

	/**
	 * Returns a new object of class '<em>Cache Data Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Data Preferences</em>'.
	 * @generated
	 */
	CacheDataPreferences createCacheDataPreferences();

	/**
	 * Returns a new object of class '<em>Cache Data Unit Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache Data Unit Preferences</em>'.
	 * @generated
	 */
	CacheDataUnitPreferences createCacheDataUnitPreferences();

	/**
	 * Returns a new object of class '<em>Communication Set Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Set Preferences</em>'.
	 * @generated
	 */
	CommunicationSetPreferences createCommunicationSetPreferences();

	/**
	 * Returns a new object of class '<em>Component Set Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Set Preferences</em>'.
	 * @generated
	 */
	ComponentSetPreferences createComponentSetPreferences();

	/**
	 * Returns a new object of class '<em>Components Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Components Preferences</em>'.
	 * @generated
	 */
	ComponentsPreferences createComponentsPreferences();

	/**
	 * Returns a new object of class '<em>Latency Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latency Preferences</em>'.
	 * @generated
	 */
	LatencyPreferences createLatencyPreferences();

	/**
	 * Returns a new object of class '<em>Master Component Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Master Component Preferences</em>'.
	 * @generated
	 */
	MasterComponentPreferences createMasterComponentPreferences();

	/**
	 * Returns a new object of class '<em>Pitch Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pitch Preferences</em>'.
	 * @generated
	 */
	PitchPreferences createPitchPreferences();

	/**
	 * Returns a new object of class '<em>Save Policy Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Save Policy Preferences</em>'.
	 * @generated
	 */
	SavePolicyPreferences createSavePolicyPreferences();

	/**
	 * Returns a new object of class '<em>Shim Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shim Preferences</em>'.
	 * @generated
	 */
	ShimPreferences createShimPreferences();

	/**
	 * Returns a new object of class '<em>Slave Component Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slave Component Preferences</em>'.
	 * @generated
	 */
	SlaveComponentPreferences createSlaveComponentPreferences();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PreferencesPackage getPreferencesPackage();

} //PreferencesFactory
