/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slave Component Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getSizeUnit <em>Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getRwType <em>Rw Type</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getSlaveComponentPreferences()
 * @model extendedMetaData="name='SlaveComponentPreferences' kind='elementOnly'"
 * @generated
 */
public interface SlaveComponentPreferences extends AbstractComponentPreferences {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getSlaveComponentPreferences_Size()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Size Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #setSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getSlaveComponentPreferences_SizeUnit()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='sizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getSizeUnit <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #getSizeUnit()
	 * @generated
	 */
	void setSizeUnit(SizeUnitType value);

	/**
	 * Returns the value of the '<em><b>Rw Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.RWType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rw Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @see #setRwType(RWType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getSlaveComponentPreferences_RwType()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='rwType' namespace='##targetNamespace'"
	 * @generated
	 */
	RWType getRwType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences#getRwType <em>Rw Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rw Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @see #getRwType()
	 * @generated
	 */
	void setRwType(RWType value);

} // SlaveComponentPreferences
