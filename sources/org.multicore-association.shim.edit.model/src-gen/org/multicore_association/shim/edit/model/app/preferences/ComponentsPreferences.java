/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberMaster <em>Number Master</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberSlave <em>Number Slave</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberComponent <em>Number Component</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getComponentsPreferences()
 * @model extendedMetaData="name='ComponentsPreferences' kind='elementOnly'"
 * @generated
 */
public interface ComponentsPreferences extends AbstractPreferences {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getComponentsPreferences_SystemName()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='systemName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Number Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Master</em>' attribute.
	 * @see #setNumberMaster(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getComponentsPreferences_NumberMaster()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='numberMaster' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumberMaster();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberMaster <em>Number Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Master</em>' attribute.
	 * @see #getNumberMaster()
	 * @generated
	 */
	void setNumberMaster(int value);

	/**
	 * Returns the value of the '<em><b>Number Slave</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Slave</em>' attribute.
	 * @see #setNumberSlave(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getComponentsPreferences_NumberSlave()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='numberSlave' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumberSlave();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberSlave <em>Number Slave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Slave</em>' attribute.
	 * @see #getNumberSlave()
	 * @generated
	 */
	void setNumberSlave(int value);

	/**
	 * Returns the value of the '<em><b>Number Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Component</em>' attribute.
	 * @see #setNumberComponent(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getComponentsPreferences_NumberComponent()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='numberComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNumberComponent();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getNumberComponent <em>Number Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Component</em>' attribute.
	 * @see #getNumberComponent()
	 * @generated
	 */
	void setNumberComponent(int value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(float)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getComponentsPreferences_Clock()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedFloatType" required="true"
	 *        extendedMetaData="kind='attribute' name='clock' namespace='##targetNamespace'"
	 * @generated
	 */
	float getClock();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(float value);

} // ComponentsPreferences
