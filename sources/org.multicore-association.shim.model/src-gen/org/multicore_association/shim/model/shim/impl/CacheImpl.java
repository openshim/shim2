/**
 */
package org.multicore_association.shim.model.shim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.multicore_association.shim.model.shim.Cache;
import org.multicore_association.shim.model.shim.CacheCoherencyType;
import org.multicore_association.shim.model.shim.CachePrefetchType;
import org.multicore_association.shim.model.shim.CacheReplacementType;
import org.multicore_association.shim.model.shim.CacheType;
import org.multicore_association.shim.model.shim.CacheWriteAllocateType;
import org.multicore_association.shim.model.shim.CacheWriteBackType;
import org.multicore_association.shim.model.shim.LockDownType;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getCacheCoherency <em>Cache Coherency</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getSizeUnit <em>Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getNWay <em>NWay</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getLockDownType <em>Lock Down Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getPrefetch <em>Prefetch</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getPrefetchDistance <em>Prefetch Distance</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getReplacement <em>Replacement</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getWriteAllocate <em>Write Allocate</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getWriteBack <em>Write Back</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CacheImpl#getCacheRef <em>Cache Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheImpl extends AbstractComponentImpl implements Cache {
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
	 * The default value of the '{@link #getCacheCoherency() <em>Cache Coherency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheCoherency()
	 * @generated
	 * @ordered
	 */
	protected static final CacheCoherencyType CACHE_COHERENCY_EDEFAULT = CacheCoherencyType.HARDWARE;

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
	 * This is true if the NWay attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nWayESet;

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
	 * The default value of the '{@link #getPrefetch() <em>Prefetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetch()
	 * @generated
	 * @ordered
	 */
	protected static final CachePrefetchType PREFETCH_EDEFAULT = CachePrefetchType.ALWAYS;

	/**
	 * The cached value of the '{@link #getPrefetch() <em>Prefetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetch()
	 * @generated
	 * @ordered
	 */
	protected CachePrefetchType prefetch = PREFETCH_EDEFAULT;

	/**
	 * This is true if the Prefetch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prefetchESet;

	/**
	 * The default value of the '{@link #getPrefetchDistance() <em>Prefetch Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchDistance()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PREFETCH_DISTANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefetchDistance() <em>Prefetch Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefetchDistance()
	 * @generated
	 * @ordered
	 */
	protected Integer prefetchDistance = PREFETCH_DISTANCE_EDEFAULT;

	/**
	 * This is true if the Prefetch Distance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prefetchDistanceESet;

	/**
	 * The default value of the '{@link #getReplacement() <em>Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacement()
	 * @generated
	 * @ordered
	 */
	protected static final CacheReplacementType REPLACEMENT_EDEFAULT = CacheReplacementType.FIFO;

	/**
	 * The cached value of the '{@link #getReplacement() <em>Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacement()
	 * @generated
	 * @ordered
	 */
	protected CacheReplacementType replacement = REPLACEMENT_EDEFAULT;

	/**
	 * This is true if the Replacement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean replacementESet;

	/**
	 * The default value of the '{@link #getWriteAllocate() <em>Write Allocate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteAllocate()
	 * @generated
	 * @ordered
	 */
	protected static final CacheWriteAllocateType WRITE_ALLOCATE_EDEFAULT = CacheWriteAllocateType.ALWAYS;

	/**
	 * The cached value of the '{@link #getWriteAllocate() <em>Write Allocate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteAllocate()
	 * @generated
	 * @ordered
	 */
	protected CacheWriteAllocateType writeAllocate = WRITE_ALLOCATE_EDEFAULT;

	/**
	 * This is true if the Write Allocate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeAllocateESet;

	/**
	 * The default value of the '{@link #getWriteBack() <em>Write Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBack()
	 * @generated
	 * @ordered
	 */
	protected static final CacheWriteBackType WRITE_BACK_EDEFAULT = CacheWriteBackType.ALWAYS;

	/**
	 * The cached value of the '{@link #getWriteBack() <em>Write Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBack()
	 * @generated
	 * @ordered
	 */
	protected CacheWriteBackType writeBack = WRITE_BACK_EDEFAULT;

	/**
	 * This is true if the Write Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeBackESet;

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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__CACHE_TYPE, oldCacheType,
					cacheType));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__CACHE_COHERENCY, oldCacheCoherency,
					cacheCoherency));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__SIZE, oldSize, size));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__SIZE_UNIT, oldSizeUnit, sizeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNWay() {
		return nWay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNWay(Integer newNWay) {
		Integer oldNWay = nWay;
		nWay = newNWay;
		boolean oldNWayESet = nWayESet;
		nWayESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__NWAY, oldNWay, nWay,
					!oldNWayESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNWay() {
		Integer oldNWay = nWay;
		boolean oldNWayESet = nWayESet;
		nWay = NWAY_EDEFAULT;
		nWayESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__NWAY, oldNWay, NWAY_EDEFAULT,
					oldNWayESet));
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
	public Integer getLineSize() {
		return lineSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineSize(Integer newLineSize) {
		Integer oldLineSize = lineSize;
		lineSize = newLineSize;
		boolean oldLineSizeESet = lineSizeESet;
		lineSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__LINE_SIZE, oldLineSize, lineSize,
					!oldLineSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLineSize() {
		Integer oldLineSize = lineSize;
		boolean oldLineSizeESet = lineSizeESet;
		lineSize = LINE_SIZE_EDEFAULT;
		lineSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__LINE_SIZE, oldLineSize,
					LINE_SIZE_EDEFAULT, oldLineSizeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__LOCK_DOWN_TYPE, oldLockDownType,
					lockDownType, !oldLockDownTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__LOCK_DOWN_TYPE, oldLockDownType,
					LOCK_DOWN_TYPE_EDEFAULT, oldLockDownTypeESet));
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
	public CachePrefetchType getPrefetch() {
		return prefetch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefetch(CachePrefetchType newPrefetch) {
		CachePrefetchType oldPrefetch = prefetch;
		prefetch = newPrefetch == null ? PREFETCH_EDEFAULT : newPrefetch;
		boolean oldPrefetchESet = prefetchESet;
		prefetchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__PREFETCH, oldPrefetch, prefetch,
					!oldPrefetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrefetch() {
		CachePrefetchType oldPrefetch = prefetch;
		boolean oldPrefetchESet = prefetchESet;
		prefetch = PREFETCH_EDEFAULT;
		prefetchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__PREFETCH, oldPrefetch,
					PREFETCH_EDEFAULT, oldPrefetchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrefetch() {
		return prefetchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPrefetchDistance() {
		return prefetchDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefetchDistance(Integer newPrefetchDistance) {
		Integer oldPrefetchDistance = prefetchDistance;
		prefetchDistance = newPrefetchDistance;
		boolean oldPrefetchDistanceESet = prefetchDistanceESet;
		prefetchDistanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__PREFETCH_DISTANCE,
					oldPrefetchDistance, prefetchDistance, !oldPrefetchDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrefetchDistance() {
		Integer oldPrefetchDistance = prefetchDistance;
		boolean oldPrefetchDistanceESet = prefetchDistanceESet;
		prefetchDistance = PREFETCH_DISTANCE_EDEFAULT;
		prefetchDistanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__PREFETCH_DISTANCE,
					oldPrefetchDistance, PREFETCH_DISTANCE_EDEFAULT, oldPrefetchDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrefetchDistance() {
		return prefetchDistanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheReplacementType getReplacement() {
		return replacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacement(CacheReplacementType newReplacement) {
		CacheReplacementType oldReplacement = replacement;
		replacement = newReplacement == null ? REPLACEMENT_EDEFAULT : newReplacement;
		boolean oldReplacementESet = replacementESet;
		replacementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__REPLACEMENT, oldReplacement,
					replacement, !oldReplacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReplacement() {
		CacheReplacementType oldReplacement = replacement;
		boolean oldReplacementESet = replacementESet;
		replacement = REPLACEMENT_EDEFAULT;
		replacementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__REPLACEMENT, oldReplacement,
					REPLACEMENT_EDEFAULT, oldReplacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReplacement() {
		return replacementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheWriteAllocateType getWriteAllocate() {
		return writeAllocate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteAllocate(CacheWriteAllocateType newWriteAllocate) {
		CacheWriteAllocateType oldWriteAllocate = writeAllocate;
		writeAllocate = newWriteAllocate == null ? WRITE_ALLOCATE_EDEFAULT : newWriteAllocate;
		boolean oldWriteAllocateESet = writeAllocateESet;
		writeAllocateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__WRITE_ALLOCATE, oldWriteAllocate,
					writeAllocate, !oldWriteAllocateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriteAllocate() {
		CacheWriteAllocateType oldWriteAllocate = writeAllocate;
		boolean oldWriteAllocateESet = writeAllocateESet;
		writeAllocate = WRITE_ALLOCATE_EDEFAULT;
		writeAllocateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__WRITE_ALLOCATE, oldWriteAllocate,
					WRITE_ALLOCATE_EDEFAULT, oldWriteAllocateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriteAllocate() {
		return writeAllocateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheWriteBackType getWriteBack() {
		return writeBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteBack(CacheWriteBackType newWriteBack) {
		CacheWriteBackType oldWriteBack = writeBack;
		writeBack = newWriteBack == null ? WRITE_BACK_EDEFAULT : newWriteBack;
		boolean oldWriteBackESet = writeBackESet;
		writeBackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CACHE__WRITE_BACK, oldWriteBack,
					writeBack, !oldWriteBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriteBack() {
		CacheWriteBackType oldWriteBack = writeBack;
		boolean oldWriteBackESet = writeBackESet;
		writeBack = WRITE_BACK_EDEFAULT;
		writeBackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CACHE__WRITE_BACK, oldWriteBack,
					WRITE_BACK_EDEFAULT, oldWriteBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriteBack() {
		return writeBackESet;
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
		case ShimPackage.CACHE__CACHE_TYPE:
			return getCacheType();
		case ShimPackage.CACHE__CACHE_COHERENCY:
			return getCacheCoherency();
		case ShimPackage.CACHE__SIZE:
			return getSize();
		case ShimPackage.CACHE__SIZE_UNIT:
			return getSizeUnit();
		case ShimPackage.CACHE__NWAY:
			return getNWay();
		case ShimPackage.CACHE__LINE_SIZE:
			return getLineSize();
		case ShimPackage.CACHE__LOCK_DOWN_TYPE:
			return getLockDownType();
		case ShimPackage.CACHE__PREFETCH:
			return getPrefetch();
		case ShimPackage.CACHE__PREFETCH_DISTANCE:
			return getPrefetchDistance();
		case ShimPackage.CACHE__REPLACEMENT:
			return getReplacement();
		case ShimPackage.CACHE__WRITE_ALLOCATE:
			return getWriteAllocate();
		case ShimPackage.CACHE__WRITE_BACK:
			return getWriteBack();
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
		case ShimPackage.CACHE__CACHE_TYPE:
			setCacheType((CacheType) newValue);
			return;
		case ShimPackage.CACHE__CACHE_COHERENCY:
			setCacheCoherency((CacheCoherencyType) newValue);
			return;
		case ShimPackage.CACHE__SIZE:
			setSize((Integer) newValue);
			return;
		case ShimPackage.CACHE__SIZE_UNIT:
			setSizeUnit((SizeUnitType) newValue);
			return;
		case ShimPackage.CACHE__NWAY:
			setNWay((Integer) newValue);
			return;
		case ShimPackage.CACHE__LINE_SIZE:
			setLineSize((Integer) newValue);
			return;
		case ShimPackage.CACHE__LOCK_DOWN_TYPE:
			setLockDownType((LockDownType) newValue);
			return;
		case ShimPackage.CACHE__PREFETCH:
			setPrefetch((CachePrefetchType) newValue);
			return;
		case ShimPackage.CACHE__PREFETCH_DISTANCE:
			setPrefetchDistance((Integer) newValue);
			return;
		case ShimPackage.CACHE__REPLACEMENT:
			setReplacement((CacheReplacementType) newValue);
			return;
		case ShimPackage.CACHE__WRITE_ALLOCATE:
			setWriteAllocate((CacheWriteAllocateType) newValue);
			return;
		case ShimPackage.CACHE__WRITE_BACK:
			setWriteBack((CacheWriteBackType) newValue);
			return;
		case ShimPackage.CACHE__CACHE_REF:
			getCacheRef().clear();
			getCacheRef().addAll((Collection<? extends Cache>) newValue);
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
		case ShimPackage.CACHE__CACHE_TYPE:
			setCacheType(CACHE_TYPE_EDEFAULT);
			return;
		case ShimPackage.CACHE__CACHE_COHERENCY:
			setCacheCoherency(CACHE_COHERENCY_EDEFAULT);
			return;
		case ShimPackage.CACHE__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case ShimPackage.CACHE__SIZE_UNIT:
			setSizeUnit(SIZE_UNIT_EDEFAULT);
			return;
		case ShimPackage.CACHE__NWAY:
			unsetNWay();
			return;
		case ShimPackage.CACHE__LINE_SIZE:
			unsetLineSize();
			return;
		case ShimPackage.CACHE__LOCK_DOWN_TYPE:
			unsetLockDownType();
			return;
		case ShimPackage.CACHE__PREFETCH:
			unsetPrefetch();
			return;
		case ShimPackage.CACHE__PREFETCH_DISTANCE:
			unsetPrefetchDistance();
			return;
		case ShimPackage.CACHE__REPLACEMENT:
			unsetReplacement();
			return;
		case ShimPackage.CACHE__WRITE_ALLOCATE:
			unsetWriteAllocate();
			return;
		case ShimPackage.CACHE__WRITE_BACK:
			unsetWriteBack();
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
		case ShimPackage.CACHE__CACHE_TYPE:
			return cacheType != CACHE_TYPE_EDEFAULT;
		case ShimPackage.CACHE__CACHE_COHERENCY:
			return cacheCoherency != CACHE_COHERENCY_EDEFAULT;
		case ShimPackage.CACHE__SIZE:
			return size != SIZE_EDEFAULT;
		case ShimPackage.CACHE__SIZE_UNIT:
			return sizeUnit != SIZE_UNIT_EDEFAULT;
		case ShimPackage.CACHE__NWAY:
			return isSetNWay();
		case ShimPackage.CACHE__LINE_SIZE:
			return isSetLineSize();
		case ShimPackage.CACHE__LOCK_DOWN_TYPE:
			return isSetLockDownType();
		case ShimPackage.CACHE__PREFETCH:
			return isSetPrefetch();
		case ShimPackage.CACHE__PREFETCH_DISTANCE:
			return isSetPrefetchDistance();
		case ShimPackage.CACHE__REPLACEMENT:
			return isSetReplacement();
		case ShimPackage.CACHE__WRITE_ALLOCATE:
			return isSetWriteAllocate();
		case ShimPackage.CACHE__WRITE_BACK:
			return isSetWriteBack();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cacheType: ");
		result.append(cacheType);
		result.append(", cacheCoherency: ");
		result.append(cacheCoherency);
		result.append(", size: ");
		result.append(size);
		result.append(", sizeUnit: ");
		result.append(sizeUnit);
		result.append(", nWay: ");
		if (nWayESet)
			result.append(nWay);
		else
			result.append("<unset>");
		result.append(", lineSize: ");
		if (lineSizeESet)
			result.append(lineSize);
		else
			result.append("<unset>");
		result.append(", lockDownType: ");
		if (lockDownTypeESet)
			result.append(lockDownType);
		else
			result.append("<unset>");
		result.append(", prefetch: ");
		if (prefetchESet)
			result.append(prefetch);
		else
			result.append("<unset>");
		result.append(", prefetchDistance: ");
		if (prefetchDistanceESet)
			result.append(prefetchDistance);
		else
			result.append("<unset>");
		result.append(", replacement: ");
		if (replacementESet)
			result.append(replacement);
		else
			result.append("<unset>");
		result.append(", writeAllocate: ");
		if (writeAllocateESet)
			result.append(writeAllocate);
		else
			result.append("<unset>");
		result.append(", writeBack: ");
		if (writeBackESet)
			result.append(writeBack);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CacheImpl
