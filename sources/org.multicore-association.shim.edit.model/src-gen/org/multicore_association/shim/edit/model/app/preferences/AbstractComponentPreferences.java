/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AbstractComponentPreferences#getBaseName <em>Base Name</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAbstractComponentPreferences()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractComponentPreferences' kind='elementOnly'"
 * @generated
 */
public interface AbstractComponentPreferences extends AbstractPreferences {
	/**
	 * Returns the value of the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Name</em>' attribute.
	 * @see #setBaseName(String)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAbstractComponentPreferences_BaseName()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='baseName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractComponentPreferences#getBaseName <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Name</em>' attribute.
	 * @see #getBaseName()
	 * @generated
	 */
	void setBaseName(String value);

} // AbstractComponentPreferences
