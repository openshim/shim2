/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shim Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getComponentsPreferences <em>Components Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getMasterComponentPreferences <em>Master Component Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getSlaveComponentPreferences <em>Slave Component Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getComponentSetPreferences <em>Component Set Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getAddressSpacePreferences <em>Address Space Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getCommunicationSetPreferences <em>Communication Set Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getCacheDataPreferences <em>Cache Data Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getAccessTypePreferences <em>Access Type Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getLatencyPreferences <em>Latency Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getPitchPreferences <em>Pitch Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getSavePolicyPreferences <em>Save Policy Preferences</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences()
 * @model extendedMetaData="name='ShimPreferences' kind='elementOnly'"
 * @generated
 */
public interface ShimPreferences extends AbstractPreferences {
	/**
	 * Returns the value of the '<em><b>Components Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Preferences</em>' containment reference.
	 * @see #setComponentsPreferences(ComponentsPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_ComponentsPreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ComponentsPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsPreferences getComponentsPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getComponentsPreferences <em>Components Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components Preferences</em>' containment reference.
	 * @see #getComponentsPreferences()
	 * @generated
	 */
	void setComponentsPreferences(ComponentsPreferences value);

	/**
	 * Returns the value of the '<em><b>Master Component Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Component Preferences</em>' containment reference.
	 * @see #setMasterComponentPreferences(MasterComponentPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_MasterComponentPreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MasterComponentPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterComponentPreferences getMasterComponentPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getMasterComponentPreferences <em>Master Component Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Component Preferences</em>' containment reference.
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	void setMasterComponentPreferences(MasterComponentPreferences value);

	/**
	 * Returns the value of the '<em><b>Slave Component Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave Component Preferences</em>' containment reference.
	 * @see #setSlaveComponentPreferences(SlaveComponentPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_SlaveComponentPreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SlaveComponentPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	SlaveComponentPreferences getSlaveComponentPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getSlaveComponentPreferences <em>Slave Component Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave Component Preferences</em>' containment reference.
	 * @see #getSlaveComponentPreferences()
	 * @generated
	 */
	void setSlaveComponentPreferences(SlaveComponentPreferences value);

	/**
	 * Returns the value of the '<em><b>Component Set Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Set Preferences</em>' containment reference.
	 * @see #setComponentSetPreferences(ComponentSetPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_ComponentSetPreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ComponentSetPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentSetPreferences getComponentSetPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getComponentSetPreferences <em>Component Set Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Set Preferences</em>' containment reference.
	 * @see #getComponentSetPreferences()
	 * @generated
	 */
	void setComponentSetPreferences(ComponentSetPreferences value);

	/**
	 * Returns the value of the '<em><b>Address Space Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space Preferences</em>' containment reference.
	 * @see #setAddressSpacePreferences(AddressSpacePreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_AddressSpacePreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AddressSpacePreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpacePreferences getAddressSpacePreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getAddressSpacePreferences <em>Address Space Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space Preferences</em>' containment reference.
	 * @see #getAddressSpacePreferences()
	 * @generated
	 */
	void setAddressSpacePreferences(AddressSpacePreferences value);

	/**
	 * Returns the value of the '<em><b>Communication Set Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Set Preferences</em>' containment reference.
	 * @see #setCommunicationSetPreferences(CommunicationSetPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_CommunicationSetPreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CommunicationSetPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationSetPreferences getCommunicationSetPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getCommunicationSetPreferences <em>Communication Set Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Set Preferences</em>' containment reference.
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	void setCommunicationSetPreferences(CommunicationSetPreferences value);

	/**
	 * Returns the value of the '<em><b>Cache Data Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Data Preferences</em>' containment reference.
	 * @see #setCacheDataPreferences(CacheDataPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_CacheDataPreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CacheDataPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	CacheDataPreferences getCacheDataPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getCacheDataPreferences <em>Cache Data Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Data Preferences</em>' containment reference.
	 * @see #getCacheDataPreferences()
	 * @generated
	 */
	void setCacheDataPreferences(CacheDataPreferences value);

	/**
	 * Returns the value of the '<em><b>Access Type Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type Preferences</em>' containment reference.
	 * @see #setAccessTypePreferences(AccessTypePreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_AccessTypePreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessTypePreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessTypePreferences getAccessTypePreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getAccessTypePreferences <em>Access Type Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type Preferences</em>' containment reference.
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	void setAccessTypePreferences(AccessTypePreferences value);

	/**
	 * Returns the value of the '<em><b>Latency Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency Preferences</em>' containment reference.
	 * @see #setLatencyPreferences(LatencyPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_LatencyPreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LatencyPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	LatencyPreferences getLatencyPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getLatencyPreferences <em>Latency Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Preferences</em>' containment reference.
	 * @see #getLatencyPreferences()
	 * @generated
	 */
	void setLatencyPreferences(LatencyPreferences value);

	/**
	 * Returns the value of the '<em><b>Pitch Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch Preferences</em>' containment reference.
	 * @see #setPitchPreferences(PitchPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_PitchPreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PitchPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	PitchPreferences getPitchPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getPitchPreferences <em>Pitch Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch Preferences</em>' containment reference.
	 * @see #getPitchPreferences()
	 * @generated
	 */
	void setPitchPreferences(PitchPreferences value);

	/**
	 * Returns the value of the '<em><b>Save Policy Preferences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Policy Preferences</em>' containment reference.
	 * @see #setSavePolicyPreferences(SavePolicyPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getShimPreferences_SavePolicyPreferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SavePolicyPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	SavePolicyPreferences getSavePolicyPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences#getSavePolicyPreferences <em>Save Policy Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Policy Preferences</em>' containment reference.
	 * @see #getSavePolicyPreferences()
	 * @generated
	 */
	void setSavePolicyPreferences(SavePolicyPreferences value);

} // ShimPreferences
