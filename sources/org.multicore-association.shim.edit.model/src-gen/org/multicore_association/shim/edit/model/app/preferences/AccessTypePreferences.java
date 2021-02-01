/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Type Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckR <em>Check R</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckW <em>Check W</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRW <em>Check RW</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRWX <em>Check RWX</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRX <em>Check RX</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckX <em>Check X</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#getAccessByteSize <em>Access Byte Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#getNBurst <em>NBurst</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAccessTypePreferences()
 * @model extendedMetaData="name='AccessTypePreferences' kind='elementOnly'"
 * @generated
 */
public interface AccessTypePreferences extends AbstractComponentPreferences {
	/**
	 * Returns the value of the '<em><b>Check R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check R</em>' attribute.
	 * @see #setCheckR(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAccessTypePreferences_CheckR()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkR' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckR();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckR <em>Check R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check R</em>' attribute.
	 * @see #isCheckR()
	 * @generated
	 */
	void setCheckR(boolean value);

	/**
	 * Returns the value of the '<em><b>Check W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check W</em>' attribute.
	 * @see #setCheckW(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAccessTypePreferences_CheckW()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkW' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckW();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckW <em>Check W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check W</em>' attribute.
	 * @see #isCheckW()
	 * @generated
	 */
	void setCheckW(boolean value);

	/**
	 * Returns the value of the '<em><b>Check RW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check RW</em>' attribute.
	 * @see #setCheckRW(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAccessTypePreferences_CheckRW()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkRW' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckRW();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRW <em>Check RW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check RW</em>' attribute.
	 * @see #isCheckRW()
	 * @generated
	 */
	void setCheckRW(boolean value);

	/**
	 * Returns the value of the '<em><b>Check RWX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check RWX</em>' attribute.
	 * @see #setCheckRWX(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAccessTypePreferences_CheckRWX()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkRWX' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckRWX();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRWX <em>Check RWX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check RWX</em>' attribute.
	 * @see #isCheckRWX()
	 * @generated
	 */
	void setCheckRWX(boolean value);

	/**
	 * Returns the value of the '<em><b>Check RX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check RX</em>' attribute.
	 * @see #setCheckRX(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAccessTypePreferences_CheckRX()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkRX' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckRX();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckRX <em>Check RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check RX</em>' attribute.
	 * @see #isCheckRX()
	 * @generated
	 */
	void setCheckRX(boolean value);

	/**
	 * Returns the value of the '<em><b>Check X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check X</em>' attribute.
	 * @see #setCheckX(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAccessTypePreferences_CheckX()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkX' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckX();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#isCheckX <em>Check X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check X</em>' attribute.
	 * @see #isCheckX()
	 * @generated
	 */
	void setCheckX(boolean value);

	/**
	 * Returns the value of the '<em><b>Access Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Byte Size</em>' attribute.
	 * @see #setAccessByteSize(String)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAccessTypePreferences_AccessByteSize()
	 * @model dataType="org.multicore_association.shim.edit.model.app.ByteSizeListType" required="true"
	 *        extendedMetaData="kind='attribute' name='accessByteSize' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccessByteSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#getAccessByteSize <em>Access Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Byte Size</em>' attribute.
	 * @see #getAccessByteSize()
	 * @generated
	 */
	void setAccessByteSize(String value);

	/**
	 * Returns the value of the '<em><b>NBurst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NBurst</em>' attribute.
	 * @see #setNBurst(Integer)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getAccessTypePreferences_NBurst()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='nBurst' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getNBurst();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences#getNBurst <em>NBurst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NBurst</em>' attribute.
	 * @see #getNBurst()
	 * @generated
	 */
	void setNBurst(Integer value);

} // AccessTypePreferences
