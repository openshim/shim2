/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.multicore_association.shim10.model.shim10.Cache;
import org.multicore_association.shim10.model.shim10.CacheCoherencyType;
import org.multicore_association.shim10.model.shim10.CacheType;
import org.multicore_association.shim10.model.shim10.LockDownType;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getCacheCoherency <em>Cache Coherency</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getLockDownType <em>Lock Down Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getNWay <em>NWay</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getSizeUnit <em>Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CacheImpl#getCacheRef <em>Cache Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheImpl extends MinimalEObjectImpl.Container implements Cache {
	/**
	 * The default value of the '{@link #getCacheCoherency() <em>Cache Coherency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheCoherency()
	 * @generated
	 * @ordered
	 */
	protected static final CacheCoherencyType CACHE_COHERENCY_EDEFAULT = CacheCoherencyType.SOFT;

	/**
	 * The cached value of the '{@link #getCacheCoherency() <em>Cache Coherency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheCoherency()
	 * @generated
	 * @ordered
	 */
	protected CacheCoherencyType cacheCoherency = CACHE_COHERENCY_EDEFAULT;

	/**
	 * This is true if the Cache Coherency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cacheCoherencyESet;

	/**
	 * The default value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected static final CacheType CACHE_TYPE_EDEFAULT = CacheType.DATA;

	/**
	 * The cached value of the '{@link #getCacheType() <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheType()
	 * @generated
	 * @ordered
	 */
	protected CacheType cacheType = CACHE_TYPE_EDEFAULT;

	/**
	 * This is true if the Cache Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cacheTypeESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineSize() <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSize()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineSize() <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineSize()
	 * @generated
	 * @ordered
	 */
	protected int lineSize = LINE_SIZE_EDEFAULT;

	/**
	 * This is true if the Line Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineSizeESet;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNWay() <em>NWay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNWay()
	 * @generated
	 * @ordered
	 */
	protected static final int NWAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNWay() <em>NWay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNWay()
	 * @generated
	 * @ordered
	 */
	protected int nWay = NWAY_EDEFAULT;

	/**
	 * This is true if the NWay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nWayESet;

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
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

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
	 * This is true if the Size Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeUnitESet;

	/**
	 * The cached value of the '{@link #getCacheRef() <em>Cache Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Cache> cacheRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.CACHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheCoherencyType getCacheCoherency() {
		return cacheCoherency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheCoherency(CacheCoherencyType newCacheCoherency) {
		CacheCoherencyType oldCacheCoherency = cacheCoherency;
		cacheCoherency = newCacheCoherency == null ? CACHE_COHERENCY_EDEFAULT : newCacheCoherency;
		boolean oldCacheCoherencyESet = cacheCoherencyESet;
		cacheCoherencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__CACHE_COHERENCY, oldCacheCoherency, cacheCoherency, !oldCacheCoherencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCacheCoherency() {
		CacheCoherencyType oldCacheCoherency = cacheCoherency;
		boolean oldCacheCoherencyESet = cacheCoherencyESet;
		cacheCoherency = CACHE_COHERENCY_EDEFAULT;
		cacheCoherencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__CACHE_COHERENCY, oldCacheCoherency, CACHE_COHERENCY_EDEFAULT, oldCacheCoherencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCacheCoherency() {
		return cacheCoherencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheType getCacheType() {
		return cacheType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheType(CacheType newCacheType) {
		CacheType oldCacheType = cacheType;
		cacheType = newCacheType == null ? CACHE_TYPE_EDEFAULT : newCacheType;
		boolean oldCacheTypeESet = cacheTypeESet;
		cacheTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__CACHE_TYPE, oldCacheType, cacheType, !oldCacheTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCacheType() {
		CacheType oldCacheType = cacheType;
		boolean oldCacheTypeESet = cacheTypeESet;
		cacheType = CACHE_TYPE_EDEFAULT;
		cacheTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__CACHE_TYPE, oldCacheType, CACHE_TYPE_EDEFAULT, oldCacheTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCacheType() {
		return cacheTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineSize() {
		return lineSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineSize(int newLineSize) {
		int oldLineSize = lineSize;
		lineSize = newLineSize;
		boolean oldLineSizeESet = lineSizeESet;
		lineSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__LINE_SIZE, oldLineSize, lineSize, !oldLineSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLineSize() {
		int oldLineSize = lineSize;
		boolean oldLineSizeESet = lineSizeESet;
		lineSize = LINE_SIZE_EDEFAULT;
		lineSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__LINE_SIZE, oldLineSize, LINE_SIZE_EDEFAULT, oldLineSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLineSize() {
		return lineSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LockDownType getLockDownType() {
		return lockDownType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockDownType(LockDownType newLockDownType) {
		LockDownType oldLockDownType = lockDownType;
		lockDownType = newLockDownType == null ? LOCK_DOWN_TYPE_EDEFAULT : newLockDownType;
		boolean oldLockDownTypeESet = lockDownTypeESet;
		lockDownTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__LOCK_DOWN_TYPE, oldLockDownType, lockDownType, !oldLockDownTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLockDownType() {
		LockDownType oldLockDownType = lockDownType;
		boolean oldLockDownTypeESet = lockDownTypeESet;
		lockDownType = LOCK_DOWN_TYPE_EDEFAULT;
		lockDownTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__LOCK_DOWN_TYPE, oldLockDownType, LOCK_DOWN_TYPE_EDEFAULT, oldLockDownTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLockDownType() {
		return lockDownTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNWay() {
		return nWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNWay(int newNWay) {
		int oldNWay = nWay;
		nWay = newNWay;
		boolean oldNWayESet = nWayESet;
		nWayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__NWAY, oldNWay, nWay, !oldNWayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNWay() {
		int oldNWay = nWay;
		boolean oldNWayESet = nWayESet;
		nWay = NWAY_EDEFAULT;
		nWayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__NWAY, oldNWay, NWAY_EDEFAULT, oldNWayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNWay() {
		return nWayESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		boolean oldSizeESet = sizeESet;
		sizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__SIZE, oldSize, size, !oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		int oldSize = size;
		boolean oldSizeESet = sizeESet;
		size = SIZE_EDEFAULT;
		sizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return sizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeUnitType getSizeUnit() {
		return sizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeUnit(SizeUnitType newSizeUnit) {
		SizeUnitType oldSizeUnit = sizeUnit;
		sizeUnit = newSizeUnit == null ? SIZE_UNIT_EDEFAULT : newSizeUnit;
		boolean oldSizeUnitESet = sizeUnitESet;
		sizeUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__SIZE_UNIT, oldSizeUnit, sizeUnit, !oldSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeUnit() {
		SizeUnitType oldSizeUnit = sizeUnit;
		boolean oldSizeUnitESet = sizeUnitESet;
		sizeUnit = SIZE_UNIT_EDEFAULT;
		sizeUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__SIZE_UNIT, oldSizeUnit, SIZE_UNIT_EDEFAULT, oldSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeUnit() {
		return sizeUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cache> getCacheRef() {
		if (cacheRef == null) {
			cacheRef = new EObjectResolvingEList<Cache>(Cache.class, this, ShimPackage.CACHE__CACHE_REF);
		}
		return cacheRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShimPackage.CACHE__CACHE_COHERENCY:
				return getCacheCoherency();
			case ShimPackage.CACHE__CACHE_TYPE:
				return getCacheType();
			case ShimPackage.CACHE__ID:
				return getId();
			case ShimPackage.CACHE__LINE_SIZE:
				return getLineSize();
			case ShimPackage.CACHE__LOCK_DOWN_TYPE:
				return getLockDownType();
			case ShimPackage.CACHE__NAME:
				return getName();
			case ShimPackage.CACHE__NWAY:
				return getNWay();
			case ShimPackage.CACHE__SIZE:
				return getSize();
			case ShimPackage.CACHE__SIZE_UNIT:
				return getSizeUnit();
			case ShimPackage.CACHE__CACHE_REF:
				return getCacheRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShimPackage.CACHE__CACHE_COHERENCY:
				setCacheCoherency((CacheCoherencyType)newValue);
				return;
			case ShimPackage.CACHE__CACHE_TYPE:
				setCacheType((CacheType)newValue);
				return;
			case ShimPackage.CACHE__ID:
				setId((String)newValue);
				return;
			case ShimPackage.CACHE__LINE_SIZE:
				setLineSize((Integer)newValue);
				return;
			case ShimPackage.CACHE__LOCK_DOWN_TYPE:
				setLockDownType((LockDownType)newValue);
				return;
			case ShimPackage.CACHE__NAME:
				setName((String)newValue);
				return;
			case ShimPackage.CACHE__NWAY:
				setNWay((Integer)newValue);
				return;
			case ShimPackage.CACHE__SIZE:
				setSize((Integer)newValue);
				return;
			case ShimPackage.CACHE__SIZE_UNIT:
				setSizeUnit((SizeUnitType)newValue);
				return;
			case ShimPackage.CACHE__CACHE_REF:
				getCacheRef().clear();
				getCacheRef().addAll((Collection<? extends Cache>)newValue);
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
			case ShimPackage.CACHE__CACHE_COHERENCY:
				unsetCacheCoherency();
				return;
			case ShimPackage.CACHE__CACHE_TYPE:
				unsetCacheType();
				return;
			case ShimPackage.CACHE__ID:
				setId(ID_EDEFAULT);
				return;
			case ShimPackage.CACHE__LINE_SIZE:
				unsetLineSize();
				return;
			case ShimPackage.CACHE__LOCK_DOWN_TYPE:
				unsetLockDownType();
				return;
			case ShimPackage.CACHE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShimPackage.CACHE__NWAY:
				unsetNWay();
				return;
			case ShimPackage.CACHE__SIZE:
				unsetSize();
				return;
			case ShimPackage.CACHE__SIZE_UNIT:
				unsetSizeUnit();
				return;
			case ShimPackage.CACHE__CACHE_REF:
				getCacheRef().clear();
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
			case ShimPackage.CACHE__CACHE_COHERENCY:
				return isSetCacheCoherency();
			case ShimPackage.CACHE__CACHE_TYPE:
				return isSetCacheType();
			case ShimPackage.CACHE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ShimPackage.CACHE__LINE_SIZE:
				return isSetLineSize();
			case ShimPackage.CACHE__LOCK_DOWN_TYPE:
				return isSetLockDownType();
			case ShimPackage.CACHE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShimPackage.CACHE__NWAY:
				return isSetNWay();
			case ShimPackage.CACHE__SIZE:
				return isSetSize();
			case ShimPackage.CACHE__SIZE_UNIT:
				return isSetSizeUnit();
			case ShimPackage.CACHE__CACHE_REF:
				return cacheRef != null && !cacheRef.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cacheCoherency: ");
		if (cacheCoherencyESet) result.append(cacheCoherency); else result.append("<unset>");
		result.append(", cacheType: ");
		if (cacheTypeESet) result.append(cacheType); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", lineSize: ");
		if (lineSizeESet) result.append(lineSize); else result.append("<unset>");
		result.append(", lockDownType: ");
		if (lockDownTypeESet) result.append(lockDownType); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", nWay: ");
		if (nWayESet) result.append(nWay); else result.append("<unset>");
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(", sizeUnit: ");
		if (sizeUnitESet) result.append(sizeUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CacheImpl
