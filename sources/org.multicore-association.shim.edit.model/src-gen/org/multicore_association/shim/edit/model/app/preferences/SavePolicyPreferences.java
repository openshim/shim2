/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Save Policy Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences#getSavePolicy <em>Save Policy</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getSavePolicyPreferences()
 * @model extendedMetaData="name='SavePolicyPreferences' kind='elementOnly'"
 * @generated
 */
public interface SavePolicyPreferences extends AbstractPreferences {
	/**
	 * Returns the value of the '<em><b>Save Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Save Policy</em>' attribute.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyType
	 * @see #setSavePolicy(SavePolicyType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getSavePolicyPreferences_SavePolicy()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='savePolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	SavePolicyType getSavePolicy();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences#getSavePolicy <em>Save Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Policy</em>' attribute.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyType
	 * @see #getSavePolicy()
	 * @generated
	 */
	void setSavePolicy(SavePolicyType value);

} // SavePolicyPreferences
