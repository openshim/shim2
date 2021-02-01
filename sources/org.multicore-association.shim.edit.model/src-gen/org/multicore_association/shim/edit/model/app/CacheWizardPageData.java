/**
 */
package org.multicore_association.shim.edit.model.app;

import org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.CacheWizardPageData#getCacheDataPreferences <em>Cache Data Preferences</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.AppPackage#getCacheWizardPageData()
 * @model extendedMetaData="name='CacheWizardPageData' kind='elementOnly'"
 * @generated
 */
public interface CacheWizardPageData extends AbstractWizardPageData {
	/**
	 * Returns the value of the '<em><b>Cache Data Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Data Preferences</em>' reference.
	 * @see #setCacheDataPreferences(CacheDataPreferences)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getCacheWizardPageData_CacheDataPreferences()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='CacheDataPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	CacheDataPreferences getCacheDataPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.CacheWizardPageData#getCacheDataPreferences <em>Cache Data Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Data Preferences</em>' reference.
	 * @see #getCacheDataPreferences()
	 * @generated
	 */
	void setCacheDataPreferences(CacheDataPreferences value);

} // CacheWizardPageData
