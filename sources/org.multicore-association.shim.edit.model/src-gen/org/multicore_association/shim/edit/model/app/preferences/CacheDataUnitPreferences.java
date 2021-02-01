/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

import org.multicore_association.shim.model.shim.CacheCoherencyType;
import org.multicore_association.shim.model.shim.LockDownType;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Data Unit Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getCacheCoherenecy <em>Cache Coherenecy</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getSizeUnit <em>Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getNWay <em>NWay</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLockDownType <em>Lock Down Type</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataUnitPreferences()
 * @model extendedMetaData="name='CacheDataUnitPreferences' kind='elementOnly'"
 * @generated
 */
public interface CacheDataUnitPreferences extends AbstractPreferences {
	/**
	 * Returns the value of the '<em><b>Cache Coherenecy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.CacheCoherencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Coherenecy</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
	 * @see #setCacheCoherenecy(CacheCoherencyType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataUnitPreferences_CacheCoherenecy()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='cacheCoherenecy' namespace='##targetNamespace'"
	 * @generated
	 */
	CacheCoherencyType getCacheCoherenecy();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getCacheCoherenecy <em>Cache Coherenecy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Coherenecy</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
	 * @see #getCacheCoherenecy()
	 * @generated
	 */
	void setCacheCoherenecy(CacheCoherencyType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataUnitPreferences_Size()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getSize <em>Size</em>}' attribute.
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
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataUnitPreferences_SizeUnit()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='sizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getSizeUnit <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #getSizeUnit()
	 * @generated
	 */
	void setSizeUnit(SizeUnitType value);

	/**
	 * Returns the value of the '<em><b>NWay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NWay</em>' attribute.
	 * @see #setNWay(Integer)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataUnitPreferences_NWay()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='nWay' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getNWay();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getNWay <em>NWay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NWay</em>' attribute.
	 * @see #getNWay()
	 * @generated
	 */
	void setNWay(Integer value);

	/**
	 * Returns the value of the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Size</em>' attribute.
	 * @see #setLineSize(Integer)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataUnitPreferences_LineSize()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='lineSize' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getLineSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLineSize <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Size</em>' attribute.
	 * @see #getLineSize()
	 * @generated
	 */
	void setLineSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Lock Down Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.LockDownType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Down Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.LockDownType
	 * @see #isSetLockDownType()
	 * @see #unsetLockDownType()
	 * @see #setLockDownType(LockDownType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheDataUnitPreferences_LockDownType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='lockDownType' namespace='##targetNamespace'"
	 * @generated
	 */
	LockDownType getLockDownType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLockDownType <em>Lock Down Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Down Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.LockDownType
	 * @see #isSetLockDownType()
	 * @see #unsetLockDownType()
	 * @see #getLockDownType()
	 * @generated
	 */
	void setLockDownType(LockDownType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLockDownType <em>Lock Down Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLockDownType()
	 * @see #getLockDownType()
	 * @see #setLockDownType(LockDownType)
	 * @generated
	 */
	void unsetLockDownType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences#getLockDownType <em>Lock Down Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lock Down Type</em>' attribute is set.
	 * @see #unsetLockDownType()
	 * @see #getLockDownType()
	 * @see #setLockDownType(LockDownType)
	 * @generated
	 */
	boolean isSetLockDownType();

} // CacheDataUnitPreferences
