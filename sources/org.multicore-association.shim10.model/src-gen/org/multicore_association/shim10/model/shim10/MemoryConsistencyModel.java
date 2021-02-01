/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Consistency Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRarOrdering <em>Rar Ordering</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRawOrdering <em>Raw Ordering</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWarOrdering <em>War Ordering</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWawOrdering <em>Waw Ordering</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMemoryConsistencyModel()
 * @model extendedMetaData="name='MemoryConsistencyModel' kind='empty'"
 * @generated
 */
public interface MemoryConsistencyModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Rar Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.OrderingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rar Ordering</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see #isSetRarOrdering()
	 * @see #unsetRarOrdering()
	 * @see #setRarOrdering(OrderingType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMemoryConsistencyModel_RarOrdering()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rarOrdering' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderingType getRarOrdering();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRarOrdering <em>Rar Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rar Ordering</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see #isSetRarOrdering()
	 * @see #unsetRarOrdering()
	 * @see #getRarOrdering()
	 * @generated
	 */
	void setRarOrdering(OrderingType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRarOrdering <em>Rar Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRarOrdering()
	 * @see #getRarOrdering()
	 * @see #setRarOrdering(OrderingType)
	 * @generated
	 */
	void unsetRarOrdering();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRarOrdering <em>Rar Ordering</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rar Ordering</em>' attribute is set.
	 * @see #unsetRarOrdering()
	 * @see #getRarOrdering()
	 * @see #setRarOrdering(OrderingType)
	 * @generated
	 */
	boolean isSetRarOrdering();

	/**
	 * Returns the value of the '<em><b>Raw Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.OrderingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Read After Write
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Raw Ordering</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see #isSetRawOrdering()
	 * @see #unsetRawOrdering()
	 * @see #setRawOrdering(OrderingType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMemoryConsistencyModel_RawOrdering()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rawOrdering' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderingType getRawOrdering();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRawOrdering <em>Raw Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raw Ordering</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see #isSetRawOrdering()
	 * @see #unsetRawOrdering()
	 * @see #getRawOrdering()
	 * @generated
	 */
	void setRawOrdering(OrderingType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRawOrdering <em>Raw Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRawOrdering()
	 * @see #getRawOrdering()
	 * @see #setRawOrdering(OrderingType)
	 * @generated
	 */
	void unsetRawOrdering();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getRawOrdering <em>Raw Ordering</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Raw Ordering</em>' attribute is set.
	 * @see #unsetRawOrdering()
	 * @see #getRawOrdering()
	 * @see #setRawOrdering(OrderingType)
	 * @generated
	 */
	boolean isSetRawOrdering();

	/**
	 * Returns the value of the '<em><b>War Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.OrderingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Write After Read
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>War Ordering</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see #isSetWarOrdering()
	 * @see #unsetWarOrdering()
	 * @see #setWarOrdering(OrderingType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMemoryConsistencyModel_WarOrdering()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='warOrdering' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderingType getWarOrdering();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWarOrdering <em>War Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>War Ordering</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see #isSetWarOrdering()
	 * @see #unsetWarOrdering()
	 * @see #getWarOrdering()
	 * @generated
	 */
	void setWarOrdering(OrderingType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWarOrdering <em>War Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarOrdering()
	 * @see #getWarOrdering()
	 * @see #setWarOrdering(OrderingType)
	 * @generated
	 */
	void unsetWarOrdering();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWarOrdering <em>War Ordering</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>War Ordering</em>' attribute is set.
	 * @see #unsetWarOrdering()
	 * @see #getWarOrdering()
	 * @see #setWarOrdering(OrderingType)
	 * @generated
	 */
	boolean isSetWarOrdering();

	/**
	 * Returns the value of the '<em><b>Waw Ordering</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.OrderingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Write After Write
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Waw Ordering</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see #isSetWawOrdering()
	 * @see #unsetWawOrdering()
	 * @see #setWawOrdering(OrderingType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMemoryConsistencyModel_WawOrdering()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='wawOrdering' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderingType getWawOrdering();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWawOrdering <em>Waw Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waw Ordering</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.OrderingType
	 * @see #isSetWawOrdering()
	 * @see #unsetWawOrdering()
	 * @see #getWawOrdering()
	 * @generated
	 */
	void setWawOrdering(OrderingType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWawOrdering <em>Waw Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWawOrdering()
	 * @see #getWawOrdering()
	 * @see #setWawOrdering(OrderingType)
	 * @generated
	 */
	void unsetWawOrdering();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel#getWawOrdering <em>Waw Ordering</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Waw Ordering</em>' attribute is set.
	 * @see #unsetWawOrdering()
	 * @see #getWawOrdering()
	 * @see #setWawOrdering(OrderingType)
	 * @generated
	 */
	boolean isSetWawOrdering();

} // MemoryConsistencyModel
