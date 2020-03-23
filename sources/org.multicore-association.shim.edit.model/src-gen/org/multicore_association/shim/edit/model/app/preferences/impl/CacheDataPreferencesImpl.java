/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache Data Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataPreferencesImpl#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataPreferencesImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataPreferencesImpl#getInstruction <em>Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheDataPreferencesImpl extends AbstractPreferencesImpl implements CacheDataPreferences {
	/**
	 * The default value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected static final CacheTypeSelect CACHE_TYPE_EDEFAULT = CacheTypeSelect.NONE;

	/**
	 * The cached value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected CacheTypeSelect cacheType = CACHE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected CacheDataUnitPreferences data;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected CacheDataUnitPreferences instruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheDataPreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencesPackage.Literals.CACHE_DATA_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheTypeSelect getCacheType() {
		return cacheType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheType(CacheTypeSelect newCacheType) {
		CacheTypeSelect oldCacheType = cacheType;
		cacheType = newCacheType == null ? CACHE_TYPE_EDEFAULT : newCacheType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.CACHE_DATA_PREFERENCES__CACHE_TYPE,
					oldCacheType, cacheType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheDataUnitPreferences getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(CacheDataUnitPreferences newData, NotificationChain msgs) {
		CacheDataUnitPreferences oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.CACHE_DATA_PREFERENCES__DATA, oldData, newData);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(CacheDataUnitPreferences newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject) data).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.CACHE_DATA_PREFERENCES__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject) newData).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.CACHE_DATA_PREFERENCES__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.CACHE_DATA_PREFERENCES__DATA,
					newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheDataUnitPreferences getInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(CacheDataUnitPreferences newInstruction, NotificationChain msgs) {
		CacheDataUnitPreferences oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.CACHE_DATA_PREFERENCES__INSTRUCTION, oldInstruction, newInstruction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstruction(CacheDataUnitPreferences newInstruction) {
		if (newInstruction != instruction) {
			NotificationChain msgs = null;
			if (instruction != null)
				msgs = ((InternalEObject) instruction).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.CACHE_DATA_PREFERENCES__INSTRUCTION, null, msgs);
			if (newInstruction != null)
				msgs = ((InternalEObject) newInstruction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.CACHE_DATA_PREFERENCES__INSTRUCTION, null, msgs);
			msgs = basicSetInstruction(newInstruction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.CACHE_DATA_PREFERENCES__INSTRUCTION, newInstruction, newInstruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PreferencesPackage.CACHE_DATA_PREFERENCES__DATA:
			return basicSetData(null, msgs);
		case PreferencesPackage.CACHE_DATA_PREFERENCES__INSTRUCTION:
			return basicSetInstruction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PreferencesPackage.CACHE_DATA_PREFERENCES__CACHE_TYPE:
			return getCacheType();
		case PreferencesPackage.CACHE_DATA_PREFERENCES__DATA:
			return getData();
		case PreferencesPackage.CACHE_DATA_PREFERENCES__INSTRUCTION:
			return getInstruction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PreferencesPackage.CACHE_DATA_PREFERENCES__CACHE_TYPE:
			setCacheType((CacheTypeSelect) newValue);
			return;
		case PreferencesPackage.CACHE_DATA_PREFERENCES__DATA:
			setData((CacheDataUnitPreferences) newValue);
			return;
		case PreferencesPackage.CACHE_DATA_PREFERENCES__INSTRUCTION:
			setInstruction((CacheDataUnitPreferences) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PreferencesPackage.CACHE_DATA_PREFERENCES__CACHE_TYPE:
			setCacheType(CACHE_TYPE_EDEFAULT);
			return;
		case PreferencesPackage.CACHE_DATA_PREFERENCES__DATA:
			setData((CacheDataUnitPreferences) null);
			return;
		case PreferencesPackage.CACHE_DATA_PREFERENCES__INSTRUCTION:
			setInstruction((CacheDataUnitPreferences) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PreferencesPackage.CACHE_DATA_PREFERENCES__CACHE_TYPE:
			return cacheType != CACHE_TYPE_EDEFAULT;
		case PreferencesPackage.CACHE_DATA_PREFERENCES__DATA:
			return data != null;
		case PreferencesPackage.CACHE_DATA_PREFERENCES__INSTRUCTION:
			return instruction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cacheType: ");
		result.append(cacheType);
		result.append(')');
		return result.toString();
	}

} //CacheDataPreferencesImpl
