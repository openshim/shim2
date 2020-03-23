/**
 */
package org.multicore_association.shim.edit.model.app;

import org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Type Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData#getAccessTypePreferences <em>Access Type Preferences</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.AppPackage#getAccessTypeWizardPageData()
 * @model extendedMetaData="name='AccessTypeWizardPageData' kind='elementOnly'"
 * @generated
 */
public interface AccessTypeWizardPageData extends AbstractWizardPageData {
	/**
	 * Returns the value of the '<em><b>Access Type Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type Preferences</em>' reference.
	 * @see #setAccessTypePreferences(AccessTypePreferences)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getAccessTypeWizardPageData_AccessTypePreferences()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='AccessTypePreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessTypePreferences getAccessTypePreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData#getAccessTypePreferences <em>Access Type Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type Preferences</em>' reference.
	 * @see #getAccessTypePreferences()
	 * @generated
	 */
	void setAccessTypePreferences(AccessTypePreferences value);

} // AccessTypeWizardPageData
