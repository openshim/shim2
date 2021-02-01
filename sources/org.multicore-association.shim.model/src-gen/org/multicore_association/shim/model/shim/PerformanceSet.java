/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.PerformanceSet#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.PerformanceSet#getCacheRef <em>Cache Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.PerformanceSet#getPerformance <em>Performance</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getPerformanceSet()
 * @model extendedMetaData="name='PerformanceSet' kind='elementOnly'"
 * @generated
 */
public interface PerformanceSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPerformanceSet_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.PerformanceSet#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Cache Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Ref</em>' reference.
	 * @see #isSetCacheRef()
	 * @see #unsetCacheRef()
	 * @see #setCacheRef(Cache)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPerformanceSet_CacheRef()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='cacheRef'"
	 * @generated
	 */
	Cache getCacheRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.PerformanceSet#getCacheRef <em>Cache Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache Ref</em>' reference.
	 * @see #isSetCacheRef()
	 * @see #unsetCacheRef()
	 * @see #getCacheRef()
	 * @generated
	 */
	void setCacheRef(Cache value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.PerformanceSet#getCacheRef <em>Cache Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCacheRef()
	 * @see #getCacheRef()
	 * @see #setCacheRef(Cache)
	 * @generated
	 */
	void unsetCacheRef();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.PerformanceSet#getCacheRef <em>Cache Ref</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cache Ref</em>' reference is set.
	 * @see #unsetCacheRef()
	 * @see #getCacheRef()
	 * @see #setCacheRef(Cache)
	 * @generated
	 */
	boolean isSetCacheRef();

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.Performance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPerformanceSet_Performance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Performance'"
	 * @generated
	 */
	EList<Performance> getPerformance();

} // PerformanceSet
