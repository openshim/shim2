/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.MasterType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Component Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getType <em>Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getEndian <em>Endian</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArch <em>Arch</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArchOpt <em>Arch Opt</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getNChannel <em>NChannel</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getNThread <em>NThread</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#isCheckClockForMaster <em>Check Clock For Master</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getMasterComponentPreferences()
 * @model extendedMetaData="name='MasterComponentPreferences' kind='elementOnly'"
 * @generated
 */
public interface MasterComponentPreferences extends AbstractComponentPreferences {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.MasterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.MasterType
	 * @see #setType(MasterType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getMasterComponentPreferences_Type()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterType getType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.MasterType
	 * @see #getType()
	 * @generated
	 */
	void setType(MasterType value);

	/**
	 * Returns the value of the '<em><b>Endian</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.EndianType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endian</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.EndianType
	 * @see #setEndian(EndianType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getMasterComponentPreferences_Endian()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='endian' namespace='##targetNamespace'"
	 * @generated
	 */
	EndianType getEndian();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getEndian <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endian</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.EndianType
	 * @see #getEndian()
	 * @generated
	 */
	void setEndian(EndianType value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(String)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getMasterComponentPreferences_Arch()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='arch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArch();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(String value);

	/**
	 * Returns the value of the '<em><b>Arch Opt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch Opt</em>' attribute.
	 * @see #isSetArchOpt()
	 * @see #unsetArchOpt()
	 * @see #setArchOpt(String)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getMasterComponentPreferences_ArchOpt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='archOpt' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArchOpt();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArchOpt <em>Arch Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch Opt</em>' attribute.
	 * @see #isSetArchOpt()
	 * @see #unsetArchOpt()
	 * @see #getArchOpt()
	 * @generated
	 */
	void setArchOpt(String value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArchOpt <em>Arch Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchOpt()
	 * @see #getArchOpt()
	 * @see #setArchOpt(String)
	 * @generated
	 */
	void unsetArchOpt();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getArchOpt <em>Arch Opt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arch Opt</em>' attribute is set.
	 * @see #unsetArchOpt()
	 * @see #getArchOpt()
	 * @see #setArchOpt(String)
	 * @generated
	 */
	boolean isSetArchOpt();

	/**
	 * Returns the value of the '<em><b>NChannel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NChannel</em>' attribute.
	 * @see #setNChannel(Integer)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getMasterComponentPreferences_NChannel()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='nChannel' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getNChannel();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getNChannel <em>NChannel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NChannel</em>' attribute.
	 * @see #getNChannel()
	 * @generated
	 */
	void setNChannel(Integer value);

	/**
	 * Returns the value of the '<em><b>NThread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NThread</em>' attribute.
	 * @see #setNThread(Integer)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getMasterComponentPreferences_NThread()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='nThread' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getNThread();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getNThread <em>NThread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NThread</em>' attribute.
	 * @see #getNThread()
	 * @generated
	 */
	void setNThread(Integer value);

	/**
	 * Returns the value of the '<em><b>Check Clock For Master</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Clock For Master</em>' attribute.
	 * @see #setCheckClockForMaster(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getMasterComponentPreferences_CheckClockForMaster()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkClockForMaster' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckClockForMaster();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#isCheckClockForMaster <em>Check Clock For Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Clock For Master</em>' attribute.
	 * @see #isCheckClockForMaster()
	 * @generated
	 */
	void setCheckClockForMaster(boolean value);

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #isSetClock()
	 * @see #unsetClock()
	 * @see #setClock(Float)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getMasterComponentPreferences_Clock()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedFloatObjectType" required="true"
	 *        extendedMetaData="kind='attribute' name='clock' namespace='##targetNamespace'"
	 * @generated
	 */
	Float getClock();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #isSetClock()
	 * @see #unsetClock()
	 * @see #getClock()
	 * @generated
	 */
	void setClock(Float value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClock()
	 * @see #getClock()
	 * @see #setClock(Float)
	 * @generated
	 */
	void unsetClock();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences#getClock <em>Clock</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clock</em>' attribute is set.
	 * @see #unsetClock()
	 * @see #getClock()
	 * @see #setClock(Float)
	 * @generated
	 */
	boolean isSetClock();

} // MasterComponentPreferences
