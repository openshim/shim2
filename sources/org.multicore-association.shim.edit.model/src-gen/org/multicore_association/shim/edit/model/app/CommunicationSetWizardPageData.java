/**
 */
package org.multicore_association.shim.edit.model.app;

import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;

import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.SubSpace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Set Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getCommunicationSetPreferences <em>Communication Set Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getAddressSpace <em>Address Space</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getSubSpace <em>Sub Space</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.AppPackage#getCommunicationSetWizardPageData()
 * @model extendedMetaData="name='CommunicationSetWizardPageData' kind='elementOnly'"
 * @generated
 */
public interface CommunicationSetWizardPageData extends AbstractWizardPageData {
	/**
	 * Returns the value of the '<em><b>Communication Set Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Set Preferences</em>' reference.
	 * @see #setCommunicationSetPreferences(CommunicationSetPreferences)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getCommunicationSetWizardPageData_CommunicationSetPreferences()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='CommunicationSetPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationSetPreferences getCommunicationSetPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getCommunicationSetPreferences <em>Communication Set Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Set Preferences</em>' reference.
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 */
	void setCommunicationSetPreferences(CommunicationSetPreferences value);

	/**
	 * Returns the value of the '<em><b>Address Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space</em>' reference.
	 * @see #setAddressSpace(AddressSpace)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getCommunicationSetWizardPageData_AddressSpace()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='AddressSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpace getAddressSpace();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getAddressSpace <em>Address Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space</em>' reference.
	 * @see #getAddressSpace()
	 * @generated
	 */
	void setAddressSpace(AddressSpace value);

	/**
	 * Returns the value of the '<em><b>Sub Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Space</em>' reference.
	 * @see #setSubSpace(SubSpace)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getCommunicationSetWizardPageData_SubSpace()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='SubSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	SubSpace getSubSpace();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData#getSubSpace <em>Sub Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Space</em>' reference.
	 * @see #getSubSpace()
	 * @generated
	 */
	void setSubSpace(SubSpace value);

} // CommunicationSetWizardPageData
