/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Space Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getNumberSubSpace <em>Number Sub Space</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getSizeSubSpace <em>Size Sub Space</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getAddressSpaceName <em>Address Space Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getSubSpaceName <em>Sub Space Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#isDontConnect <em>Dont Connect</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAddressSpacePreferences()
 * @model extendedMetaData="name='AddressSpacePreferences' kind='elementOnly'"
 * @generated
 */
public interface AddressSpacePreferences extends AbstractPreferences {
	/**
	 * Returns the value of the '<em><b>Number Sub Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Sub Space</em>' attribute.
	 * @see #setNumberSubSpace(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAddressSpacePreferences_NumberSubSpace()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='numberSubSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumberSubSpace();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getNumberSubSpace <em>Number Sub Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Sub Space</em>' attribute.
	 * @see #getNumberSubSpace()
	 * @generated
	 */
	void setNumberSubSpace(int value);

	/**
	 * Returns the value of the '<em><b>Size Sub Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Sub Space</em>' attribute.
	 * @see #setSizeSubSpace(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAddressSpacePreferences_SizeSubSpace()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='sizeSubSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSizeSubSpace();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getSizeSubSpace <em>Size Sub Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Sub Space</em>' attribute.
	 * @see #getSizeSubSpace()
	 * @generated
	 */
	void setSizeSubSpace(int value);

	/**
	 * Returns the value of the '<em><b>Address Space Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space Name</em>' attribute.
	 * @see #setAddressSpaceName(String)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAddressSpacePreferences_AddressSpaceName()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='addressSpaceName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressSpaceName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getAddressSpaceName <em>Address Space Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space Name</em>' attribute.
	 * @see #getAddressSpaceName()
	 * @generated
	 */
	void setAddressSpaceName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Space Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Space Name</em>' attribute.
	 * @see #setSubSpaceName(String)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAddressSpacePreferences_SubSpaceName()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='subSpaceName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubSpaceName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#getSubSpaceName <em>Sub Space Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Space Name</em>' attribute.
	 * @see #getSubSpaceName()
	 * @generated
	 */
	void setSubSpaceName(String value);

	/**
	 * Returns the value of the '<em><b>Dont Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dont Connect</em>' attribute.
	 * @see #setDontConnect(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAddressSpacePreferences_DontConnect()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='dontConnect' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDontConnect();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences#isDontConnect <em>Dont Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dont Connect</em>' attribute.
	 * @see #isDontConnect()
	 * @generated
	 */
	void setDontConnect(boolean value);

} // AddressSpacePreferences
