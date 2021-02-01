/**
 */
package org.multicore_association.shim.edit.model.app;

import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;

import org.multicore_association.shim.model.shim.SlaveComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Space Parameter Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getAddressSpacePreferences <em>Address Space Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getNumberOfAddressSpace <em>Number Of Address Space</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getTargetSlaveComponent <em>Target Slave Component</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.AppPackage#getAddressSpaceParameterWizardPageData()
 * @model extendedMetaData="name='AddressSpaceParameterWizardPageData' kind='elementOnly'"
 * @generated
 */
public interface AddressSpaceParameterWizardPageData extends AbstractWizardPageData {
	/**
	 * Returns the value of the '<em><b>Address Space Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space Preferences</em>' reference.
	 * @see #setAddressSpacePreferences(AddressSpacePreferences)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getAddressSpaceParameterWizardPageData_AddressSpacePreferences()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='AddressSpacePreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpacePreferences getAddressSpacePreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getAddressSpacePreferences <em>Address Space Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space Preferences</em>' reference.
	 * @see #getAddressSpacePreferences()
	 * @generated
	 */
	void setAddressSpacePreferences(AddressSpacePreferences value);

	/**
	 * Returns the value of the '<em><b>Number Of Address Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Address Space</em>' attribute.
	 * @see #setNumberOfAddressSpace(int)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getAddressSpaceParameterWizardPageData_NumberOfAddressSpace()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='numberOfAddressSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumberOfAddressSpace();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getNumberOfAddressSpace <em>Number Of Address Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Address Space</em>' attribute.
	 * @see #getNumberOfAddressSpace()
	 * @generated
	 */
	void setNumberOfAddressSpace(int value);

	/**
	 * Returns the value of the '<em><b>Target Slave Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Slave Component</em>' reference.
	 * @see #setTargetSlaveComponent(SlaveComponent)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getAddressSpaceParameterWizardPageData_TargetSlaveComponent()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='TargetSlaveComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	SlaveComponent getTargetSlaveComponent();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData#getTargetSlaveComponent <em>Target Slave Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Slave Component</em>' reference.
	 * @see #getTargetSlaveComponent()
	 * @generated
	 */
	void setTargetSlaveComponent(SlaveComponent value);

} // AddressSpaceParameterWizardPageData
