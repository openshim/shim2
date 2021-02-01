/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getCacheCoherency <em>Cache Coherency</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getCacheType <em>Cache Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getLineSize <em>Line Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getLockDownType <em>Lock Down Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getNWay <em>NWay</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getSizeUnit <em>Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Cache#getCacheRef <em>Cache Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache()
 * @model extendedMetaData="name='Cache' kind='elementOnly'"
 * @generated
 */
public interface Cache extends EObject {
	/**
	 * Returns the value of the '<em><b>Cache Coherency</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.CacheCoherencyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Coherency</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.CacheCoherencyType
	 * @see #isSetCacheCoherency()
	 * @see #unsetCacheCoherency()
	 * @see #setCacheCoherency(CacheCoherencyType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_CacheCoherency()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='cacheCoherency' namespace='##targetNamespace'"
	 * @generated
	 */
	CacheCoherencyType getCacheCoherency();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getCacheCoherency <em>Cache Coherency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Coherency</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.CacheCoherencyType
	 * @see #isSetCacheCoherency()
	 * @see #unsetCacheCoherency()
	 * @see #getCacheCoherency()
	 * @generated
	 */
	void setCacheCoherency(CacheCoherencyType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getCacheCoherency <em>Cache Coherency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCacheCoherency()
	 * @see #getCacheCoherency()
	 * @see #setCacheCoherency(CacheCoherencyType)
	 * @generated
	 */
	void unsetCacheCoherency();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getCacheCoherency <em>Cache Coherency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cache Coherency</em>' attribute is set.
	 * @see #unsetCacheCoherency()
	 * @see #getCacheCoherency()
	 * @see #setCacheCoherency(CacheCoherencyType)
	 * @generated
	 */
	boolean isSetCacheCoherency();

	/**
	 * Returns the value of the '<em><b>Cache Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.CacheType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * soft / hard
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cache Type</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.CacheType
	 * @see #isSetCacheType()
	 * @see #unsetCacheType()
	 * @see #setCacheType(CacheType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_CacheType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='cacheType' namespace='##targetNamespace'"
	 * @generated
	 */
	CacheType getCacheType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Type</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.CacheType
	 * @see #isSetCacheType()
	 * @see #unsetCacheType()
	 * @see #getCacheType()
	 * @generated
	 */
	void setCacheType(CacheType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getCacheType <em>Cache Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCacheType()
	 * @see #getCacheType()
	 * @see #setCacheType(CacheType)
	 * @generated
	 */
	void unsetCacheType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getCacheType <em>Cache Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cache Type</em>' attribute is set.
	 * @see #unsetCacheType()
	 * @see #getCacheType()
	 * @see #setCacheType(CacheType)
	 * @generated
	 */
	boolean isSetCacheType();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Line Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Size</em>' attribute.
	 * @see #isSetLineSize()
	 * @see #unsetLineSize()
	 * @see #setLineSize(int)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_LineSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='lineSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getLineSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getLineSize <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Size</em>' attribute.
	 * @see #isSetLineSize()
	 * @see #unsetLineSize()
	 * @see #getLineSize()
	 * @generated
	 */
	void setLineSize(int value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getLineSize <em>Line Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineSize()
	 * @see #getLineSize()
	 * @see #setLineSize(int)
	 * @generated
	 */
	void unsetLineSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getLineSize <em>Line Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Size</em>' attribute is set.
	 * @see #unsetLineSize()
	 * @see #getLineSize()
	 * @see #setLineSize(int)
	 * @generated
	 */
	boolean isSetLineSize();

	/**
	 * Returns the value of the '<em><b>Lock Down Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.LockDownType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lock Down Type</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.LockDownType
	 * @see #isSetLockDownType()
	 * @see #unsetLockDownType()
	 * @see #setLockDownType(LockDownType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_LockDownType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='lockDownType' namespace='##targetNamespace'"
	 * @generated
	 */
	LockDownType getLockDownType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getLockDownType <em>Lock Down Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lock Down Type</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.LockDownType
	 * @see #isSetLockDownType()
	 * @see #unsetLockDownType()
	 * @see #getLockDownType()
	 * @generated
	 */
	void setLockDownType(LockDownType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getLockDownType <em>Lock Down Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLockDownType()
	 * @see #getLockDownType()
	 * @see #setLockDownType(LockDownType)
	 * @generated
	 */
	void unsetLockDownType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getLockDownType <em>Lock Down Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>NWay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NWay</em>' attribute.
	 * @see #isSetNWay()
	 * @see #unsetNWay()
	 * @see #setNWay(int)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_NWay()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='nWay' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNWay();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getNWay <em>NWay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NWay</em>' attribute.
	 * @see #isSetNWay()
	 * @see #unsetNWay()
	 * @see #getNWay()
	 * @generated
	 */
	void setNWay(int value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getNWay <em>NWay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNWay()
	 * @see #getNWay()
	 * @see #setNWay(int)
	 * @generated
	 */
	void unsetNWay();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getNWay <em>NWay</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NWay</em>' attribute is set.
	 * @see #unsetNWay()
	 * @see #getNWay()
	 * @see #setNWay(int)
	 * @generated
	 */
	boolean isSetNWay();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(int)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_Size()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(int)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(int)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Size Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Unit</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @see #isSetSizeUnit()
	 * @see #unsetSizeUnit()
	 * @see #setSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_SizeUnit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='sizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getSizeUnit <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Unit</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @see #isSetSizeUnit()
	 * @see #unsetSizeUnit()
	 * @see #getSizeUnit()
	 * @generated
	 */
	void setSizeUnit(SizeUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getSizeUnit <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeUnit()
	 * @see #getSizeUnit()
	 * @see #setSizeUnit(SizeUnitType)
	 * @generated
	 */
	void unsetSizeUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.Cache#getSizeUnit <em>Size Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Unit</em>' attribute is set.
	 * @see #unsetSizeUnit()
	 * @see #getSizeUnit()
	 * @see #setSizeUnit(SizeUnitType)
	 * @generated
	 */
	boolean isSetSizeUnit();

	/**
	 * Returns the value of the '<em><b>Cache Ref</b></em>' reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.Cache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Ref</em>' reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCache_CacheRef()
	 * @model extendedMetaData="kind='element' name='CacheRef'"
	 * @generated
	 */
	EList<Cache> getCacheRef();

} // Cache
