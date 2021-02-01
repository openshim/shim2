/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Data Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getData <em>Data</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataPreferences()
 * @model extendedMetaData="name='CacheDataPreferences' kind='elementOnly'"
 * @generated
 */
public interface CacheDataPreferences extends AbstractPreferences {
	/**
	 * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Type</em>' attribute.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect
	 * @see #setCacheType(CacheTypeSelect)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataPreferences_CacheType()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='cacheType' namespace='##targetNamespace'"
	 * @generated
	 */
	CacheTypeSelect getCacheType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Type</em>' attribute.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect
	 * @see #getCacheType()
	 * @generated
	 */
	void setCacheType(CacheTypeSelect value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(CacheDataUnitPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataPreferences_Data()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Data' namespace='##targetNamespace'"
	 * @generated
	 */
	CacheDataUnitPreferences getData();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(CacheDataUnitPreferences value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(CacheDataUnitPreferences)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataPreferences_Instruction()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Instruction' namespace='##targetNamespace'"
	 * @generated
	 */
	CacheDataUnitPreferences getInstruction();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(CacheDataUnitPreferences value);

} // CacheDataPreferences
