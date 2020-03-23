/**
 */
package org.multicore_association.shim.edit.model.app;

import org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences;
import org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Parameter Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getComponentsPreferences <em>Components Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getMasterComponentPreferences <em>Master Component Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getSlaveComponentPreferences <em>Slave Component Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getComponentSetPreferences <em>Component Set Preferences</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.AppPackage#getComponentParameterWizardPageData()
 * @model extendedMetaData="name='ComponentParameterWizardPageData' kind='elementOnly'"
 * @generated
 */
public interface ComponentParameterWizardPageData extends AbstractWizardPageData {
	/**
	 * Returns the value of the '<em><b>Components Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Preferences</em>' reference.
	 * @see #setComponentsPreferences(ComponentsPreferences)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getComponentParameterWizardPageData_ComponentsPreferences()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ComponentsPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentsPreferences getComponentsPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getComponentsPreferences <em>Components Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components Preferences</em>' reference.
	 * @see #getComponentsPreferences()
	 * @generated
	 */
	void setComponentsPreferences(ComponentsPreferences value);

	/**
	 * Returns the value of the '<em><b>Master Component Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Component Preferences</em>' reference.
	 * @see #setMasterComponentPreferences(MasterComponentPreferences)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getComponentParameterWizardPageData_MasterComponentPreferences()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='MasterComponentPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterComponentPreferences getMasterComponentPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getMasterComponentPreferences <em>Master Component Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Component Preferences</em>' reference.
	 * @see #getMasterComponentPreferences()
	 * @generated
	 */
	void setMasterComponentPreferences(MasterComponentPreferences value);

	/**
	 * Returns the value of the '<em><b>Slave Component Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave Component Preferences</em>' reference.
	 * @see #setSlaveComponentPreferences(SlaveComponentPreferences)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getComponentParameterWizardPageData_SlaveComponentPreferences()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='SlaveComponentPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	SlaveComponentPreferences getSlaveComponentPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getSlaveComponentPreferences <em>Slave Component Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave Component Preferences</em>' reference.
	 * @see #getSlaveComponentPreferences()
	 * @generated
	 */
	void setSlaveComponentPreferences(SlaveComponentPreferences value);

	/**
	 * Returns the value of the '<em><b>Component Set Preferences</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Set Preferences</em>' reference.
	 * @see #setComponentSetPreferences(ComponentSetPreferences)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getComponentParameterWizardPageData_ComponentSetPreferences()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ComponentSetPreferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentSetPreferences getComponentSetPreferences();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData#getComponentSetPreferences <em>Component Set Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Set Preferences</em>' reference.
	 * @see #getComponentSetPreferences()
	 * @generated
	 */
	void setComponentSetPreferences(ComponentSetPreferences value);

} // ComponentParameterWizardPageData
