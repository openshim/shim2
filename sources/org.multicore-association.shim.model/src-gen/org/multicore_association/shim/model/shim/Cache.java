/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getCacheCoherency <em>Cache Coherency</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getSizeUnit <em>Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getNWay <em>NWay</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getLockDownType <em>Lock Down Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getPrefetch <em>Prefetch</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getPrefetchDistance <em>Prefetch Distance</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getReplacement <em>Replacement</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getWriteAllocate <em>Write Allocate</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getWriteBack <em>Write Back</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Cache#getCacheRef <em>Cache Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache()
 * @model extendedMetaData="name='Cache' kind='elementOnly'"
 * @generated
 */
public interface Cache extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
	 * The default value is <code>"DATA"</code>.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.CacheType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * soft / hard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cache Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheType
	 * @see #setCacheType(CacheType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_CacheType()
	 * @model default="DATA" required="true"
	 *        extendedMetaData="kind='attribute' name='cacheType'"
	 * @generated
	 */
	CacheType getCacheType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheType
	 * @see #getCacheType()
	 * @generated
	 */
	void setCacheType(CacheType value);

	/**
	 * Returns the value of the '<em><b>Cache Coherency</b></em>' attribute.
	 * The default value is <code>"HARDWARE"</code>.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.CacheCoherencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Coherency</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
	 * @see #setCacheCoherency(CacheCoherencyType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_CacheCoherency()
	 * @model default="HARDWARE" required="true"
	 *        extendedMetaData="kind='attribute' name='cacheCoherency'"
	 * @generated
	 */
	CacheCoherencyType getCacheCoherency();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getCacheCoherency <em>Cache Coherency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Coherency</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheCoherencyType
	 * @see #getCacheCoherency()
	 * @generated
	 */
	void setCacheCoherency(CacheCoherencyType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_Size()
	 * @model default="0" dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Size Unit</b></em>' attribute.
	 * The default value is <code>"KiB"</code>.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #setSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_SizeUnit()
	 * @model default="KiB" required="true"
	 *        extendedMetaData="kind='attribute' name='sizeUnit'"
	 * @generated
	 */
	SizeUnitType getSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getSizeUnit <em>Size Unit</em>}' attribute.
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
	 * @see #isSetNWay()
	 * @see #unsetNWay()
	 * @see #setNWay(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_NWay()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='nWay'"
	 * @generated
	 */
	Integer getNWay();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getNWay <em>NWay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NWay</em>' attribute.
	 * @see #isSetNWay()
	 * @see #unsetNWay()
	 * @see #getNWay()
	 * @generated
	 */
	void setNWay(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getNWay <em>NWay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNWay()
	 * @see #getNWay()
	 * @see #setNWay(Integer)
	 * @generated
	 */
	void unsetNWay();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Cache#getNWay <em>NWay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NWay</em>' attribute is set.
	 * @see #unsetNWay()
	 * @see #getNWay()
	 * @see #setNWay(Integer)
	 * @generated
	 */
	boolean isSetNWay();

	/**
	 * Returns the value of the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Size</em>' attribute.
	 * @see #isSetLineSize()
	 * @see #unsetLineSize()
	 * @see #setLineSize(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_LineSize()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='lineSize'"
	 * @generated
	 */
	Integer getLineSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getLineSize <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Size</em>' attribute.
	 * @see #isSetLineSize()
	 * @see #unsetLineSize()
	 * @see #getLineSize()
	 * @generated
	 */
	void setLineSize(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getLineSize <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineSize()
	 * @see #getLineSize()
	 * @see #setLineSize(Integer)
	 * @generated
	 */
	void unsetLineSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Cache#getLineSize <em>Line Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Size</em>' attribute is set.
	 * @see #unsetLineSize()
	 * @see #getLineSize()
	 * @see #setLineSize(Integer)
	 * @generated
	 */
	boolean isSetLineSize();

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
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_LockDownType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='lockDownType'"
	 * @generated
	 */
	LockDownType getLockDownType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getLockDownType <em>Lock Down Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getLockDownType <em>Lock Down Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLockDownType()
	 * @see #getLockDownType()
	 * @see #setLockDownType(LockDownType)
	 * @generated
	 */
	void unsetLockDownType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Cache#getLockDownType <em>Lock Down Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lock Down Type</em>' attribute is set.
	 * @see #unsetLockDownType()
	 * @see #getLockDownType()
	 * @see #setLockDownType(LockDownType)
	 * @generated
	 */
	boolean isSetLockDownType();

	/**
	 * Returns the value of the '<em><b>Prefetch</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.CachePrefetchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefetch</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CachePrefetchType
	 * @see #isSetPrefetch()
	 * @see #unsetPrefetch()
	 * @see #setPrefetch(CachePrefetchType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_Prefetch()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='prefetch'"
	 * @generated
	 */
	CachePrefetchType getPrefetch();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getPrefetch <em>Prefetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefetch</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CachePrefetchType
	 * @see #isSetPrefetch()
	 * @see #unsetPrefetch()
	 * @see #getPrefetch()
	 * @generated
	 */
	void setPrefetch(CachePrefetchType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getPrefetch <em>Prefetch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefetch()
	 * @see #getPrefetch()
	 * @see #setPrefetch(CachePrefetchType)
	 * @generated
	 */
	void unsetPrefetch();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Cache#getPrefetch <em>Prefetch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefetch</em>' attribute is set.
	 * @see #unsetPrefetch()
	 * @see #getPrefetch()
	 * @see #setPrefetch(CachePrefetchType)
	 * @generated
	 */
	boolean isSetPrefetch();

	/**
	 * Returns the value of the '<em><b>Prefetch Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefetch Distance</em>' attribute.
	 * @see #isSetPrefetchDistance()
	 * @see #unsetPrefetchDistance()
	 * @see #setPrefetchDistance(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_PrefetchDistance()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='prefetchDistance'"
	 * @generated
	 */
	Integer getPrefetchDistance();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getPrefetchDistance <em>Prefetch Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefetch Distance</em>' attribute.
	 * @see #isSetPrefetchDistance()
	 * @see #unsetPrefetchDistance()
	 * @see #getPrefetchDistance()
	 * @generated
	 */
	void setPrefetchDistance(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getPrefetchDistance <em>Prefetch Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefetchDistance()
	 * @see #getPrefetchDistance()
	 * @see #setPrefetchDistance(Integer)
	 * @generated
	 */
	void unsetPrefetchDistance();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Cache#getPrefetchDistance <em>Prefetch Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefetch Distance</em>' attribute is set.
	 * @see #unsetPrefetchDistance()
	 * @see #getPrefetchDistance()
	 * @see #setPrefetchDistance(Integer)
	 * @generated
	 */
	boolean isSetPrefetchDistance();

	/**
	 * Returns the value of the '<em><b>Replacement</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.CacheReplacementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replacement</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheReplacementType
	 * @see #isSetReplacement()
	 * @see #unsetReplacement()
	 * @see #setReplacement(CacheReplacementType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_Replacement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='replacement'"
	 * @generated
	 */
	CacheReplacementType getReplacement();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getReplacement <em>Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replacement</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheReplacementType
	 * @see #isSetReplacement()
	 * @see #unsetReplacement()
	 * @see #getReplacement()
	 * @generated
	 */
	void setReplacement(CacheReplacementType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getReplacement <em>Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReplacement()
	 * @see #getReplacement()
	 * @see #setReplacement(CacheReplacementType)
	 * @generated
	 */
	void unsetReplacement();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Cache#getReplacement <em>Replacement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Replacement</em>' attribute is set.
	 * @see #unsetReplacement()
	 * @see #getReplacement()
	 * @see #setReplacement(CacheReplacementType)
	 * @generated
	 */
	boolean isSetReplacement();

	/**
	 * Returns the value of the '<em><b>Write Allocate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.CacheWriteAllocateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Allocate</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheWriteAllocateType
	 * @see #isSetWriteAllocate()
	 * @see #unsetWriteAllocate()
	 * @see #setWriteAllocate(CacheWriteAllocateType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_WriteAllocate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='writeAllocate'"
	 * @generated
	 */
	CacheWriteAllocateType getWriteAllocate();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getWriteAllocate <em>Write Allocate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Allocate</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheWriteAllocateType
	 * @see #isSetWriteAllocate()
	 * @see #unsetWriteAllocate()
	 * @see #getWriteAllocate()
	 * @generated
	 */
	void setWriteAllocate(CacheWriteAllocateType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getWriteAllocate <em>Write Allocate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteAllocate()
	 * @see #getWriteAllocate()
	 * @see #setWriteAllocate(CacheWriteAllocateType)
	 * @generated
	 */
	void unsetWriteAllocate();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Cache#getWriteAllocate <em>Write Allocate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Allocate</em>' attribute is set.
	 * @see #unsetWriteAllocate()
	 * @see #getWriteAllocate()
	 * @see #setWriteAllocate(CacheWriteAllocateType)
	 * @generated
	 */
	boolean isSetWriteAllocate();

	/**
	 * Returns the value of the '<em><b>Write Back</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.CacheWriteBackType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Back</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheWriteBackType
	 * @see #isSetWriteBack()
	 * @see #unsetWriteBack()
	 * @see #setWriteBack(CacheWriteBackType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_WriteBack()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='writeBack'"
	 * @generated
	 */
	CacheWriteBackType getWriteBack();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getWriteBack <em>Write Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Back</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.CacheWriteBackType
	 * @see #isSetWriteBack()
	 * @see #unsetWriteBack()
	 * @see #getWriteBack()
	 * @generated
	 */
	void setWriteBack(CacheWriteBackType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Cache#getWriteBack <em>Write Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteBack()
	 * @see #getWriteBack()
	 * @see #setWriteBack(CacheWriteBackType)
	 * @generated
	 */
	void unsetWriteBack();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Cache#getWriteBack <em>Write Back</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Back</em>' attribute is set.
	 * @see #unsetWriteBack()
	 * @see #getWriteBack()
	 * @see #setWriteBack(CacheWriteBackType)
	 * @generated
	 */
	boolean isSetWriteBack();

	/**
	 * Returns the value of the '<em><b>Cache Ref</b></em>' reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.Cache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Ref</em>' reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCache_CacheRef()
	 * @model extendedMetaData="kind='element' name='CacheRef'"
	 * @generated
	 */
	EList<Cache> getCacheRef();

} // Cache
