/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

import org.multicore_association.shim.model.shim.CacheCoherencyType;
import org.multicore_association.shim.model.shim.LockDownType;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache Data Unit Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl#getCacheCoherenecy <em>Cache Coherenecy</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl#getSizeUnit <em>Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl#getNWay <em>NWay</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CacheDataUnitPreferencesImpl#getLockDownType <em>Lock Down Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheDataUnitPreferencesImpl extends AbstractPreferencesImpl implements CacheDataUnitPreferences {
	/**
	 * The default value of the '{@link #getCacheCoherenecy() <em>Cache Coherenecy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheCoherenecy()
	 * @generated
	 * @ordered
	 */
	protected static final CacheCoherencyType CACHE_COHERENECY_EDEFAULT = CacheCoherencyType.HARDWARE;

	/**
	 * The cached value of the '{@link #getCacheCoherenecy() <em>Cache Coherenecy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheCoherenecy()
	 * @generated
	 * @ordered
	 */
	protected CacheCoherencyType cacheCoherenecy = CACHE_COHERENECY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeUnit() <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final SizeUnitType SIZE_UNIT_EDEFAULT = SizeUnitType.KI_B;

	/**
	 * The cached value of the '{@link #getSizeUnit() <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected SizeUnitType sizeUnit = SIZE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNWay() <em>NWay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNWay()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NWAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNWay() <em>NWay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNWay()
	 * @generated
	 * @ordered
	 */
	protected Integer nWay = NWAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineSize() <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineSize() <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSize()
	 * @generated
	 * @ordered
	 */
	protected Integer lineSize = LINE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLockDownType() <em>Lock Down Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockDownType()
	 * @generated
	 * @ordered
	 */
	protected static final LockDownType LOCK_DOWN_TYPE_EDEFAULT = LockDownType.LINE;

	/**
	 * The cached value of the '{@link #getLockDownType() <em>Lock Down Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockDownType()
	 * @generated
	 * @ordered
	 */
	protected LockDownType lockDownType = LOCK_DOWN_TYPE_EDEFAULT;

	/**
	 * This is true if the Lock Down Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lockDownTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheDataUnitPreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencesPackage.Literals.CACHE_DATA_UNIT_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheCoherencyType getCacheCoherenecy() {
		return cacheCoherenecy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheCoherenecy(CacheCoherencyType newCacheCoherenecy) {
		CacheCoherencyType oldCacheCoherenecy = cacheCoherenecy;
		cacheCoherenecy = newCacheCoherenecy == null ? CACHE_COHERENECY_EDEFAULT : newCacheCoherenecy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY, oldCacheCoherenecy,
					cacheCoherenecy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE,
					oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeUnitType getSizeUnit() {
		return sizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeUnit(SizeUnitType newSizeUnit) {
		SizeUnitType oldSizeUnit = sizeUnit;
		sizeUnit = newSizeUnit == null ? SIZE_UNIT_EDEFAULT : newSizeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT, oldSizeUnit, sizeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNWay() {
		return nWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNWay(Integer newNWay) {
		Integer oldNWay = nWay;
		nWay = newNWay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__NWAY,
					oldNWay, nWay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLineSize() {
		return lineSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineSize(Integer newLineSize) {
		Integer oldLineSize = lineSize;
		lineSize = newLineSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE, oldLineSize, lineSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LockDownType getLockDownType() {
		return lockDownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockDownType(LockDownType newLockDownType) {
		LockDownType oldLockDownType = lockDownType;
		lockDownType = newLockDownType == null ? LOCK_DOWN_TYPE_EDEFAULT : newLockDownType;
		boolean oldLockDownTypeESet = lockDownTypeESet;
		lockDownTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE, oldLockDownType, lockDownType,
					!oldLockDownTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLockDownType() {
		LockDownType oldLockDownType = lockDownType;
		boolean oldLockDownTypeESet = lockDownTypeESet;
		lockDownType = LOCK_DOWN_TYPE_EDEFAULT;
		lockDownTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE, oldLockDownType,
					LOCK_DOWN_TYPE_EDEFAULT, oldLockDownTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLockDownType() {
		return lockDownTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY:
			return getCacheCoherenecy();
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE:
			return getSize();
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT:
			return getSizeUnit();
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__NWAY:
			return getNWay();
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE:
			return getLineSize();
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE:
			return getLockDownType();
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
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY:
			setCacheCoherenecy((CacheCoherencyType) newValue);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE:
			setSize((Integer) newValue);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT:
			setSizeUnit((SizeUnitType) newValue);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__NWAY:
			setNWay((Integer) newValue);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE:
			setLineSize((Integer) newValue);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE:
			setLockDownType((LockDownType) newValue);
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
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY:
			setCacheCoherenecy(CACHE_COHERENECY_EDEFAULT);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT:
			setSizeUnit(SIZE_UNIT_EDEFAULT);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__NWAY:
			setNWay(NWAY_EDEFAULT);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE:
			setLineSize(LINE_SIZE_EDEFAULT);
			return;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE:
			unsetLockDownType();
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
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY:
			return cacheCoherenecy != CACHE_COHERENECY_EDEFAULT;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE:
			return size != SIZE_EDEFAULT;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT:
			return sizeUnit != SIZE_UNIT_EDEFAULT;
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__NWAY:
			return NWAY_EDEFAULT == null ? nWay != null : !NWAY_EDEFAULT.equals(nWay);
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE:
			return LINE_SIZE_EDEFAULT == null ? lineSize != null : !LINE_SIZE_EDEFAULT.equals(lineSize);
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE:
			return isSetLockDownType();
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
		result.append(" (cacheCoherenecy: ");
		result.append(cacheCoherenecy);
		result.append(", size: ");
		result.append(size);
		result.append(", sizeUnit: ");
		result.append(sizeUnit);
		result.append(", nWay: ");
		result.append(nWay);
		result.append(", lineSize: ");
		result.append(lineSize);
		result.append(", lockDownType: ");
		if (lockDownTypeESet)
			result.append(lockDownType);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CacheDataUnitPreferencesImpl
