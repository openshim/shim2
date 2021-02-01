/**
 */
package org.multicore_association.shim.model.shim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slave Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Memory
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.SlaveComponent#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SlaveComponent#getSizeUnit <em>Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SlaveComponent#getRwType <em>Rw Type</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getSlaveComponent()
 * @model extendedMetaData="name='SlaveComponent' kind='empty'"
 * @generated
 */
public interface SlaveComponent extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSlaveComponent_Size()
	 * @model default="0" dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SlaveComponent#getSize <em>Size</em>}' attribute.
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
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSlaveComponent_SizeUnit()
	 * @model default="KiB" required="true"
	 *        extendedMetaData="kind='attribute' name='sizeUnit'"
	 * @generated
	 */
	SizeUnitType getSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SlaveComponent#getSizeUnit <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #getSizeUnit()
	 * @generated
	 */
	void setSizeUnit(SizeUnitType value);

	/**
	 * Returns the value of the '<em><b>Rw Type</b></em>' attribute.
	 * The default value is <code>"RW"</code>.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.RWType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rw Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @see #setRwType(RWType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSlaveComponent_RwType()
	 * @model default="RW" required="true"
	 *        extendedMetaData="kind='attribute' name='rwType'"
	 * @generated
	 */
	RWType getRwType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SlaveComponent#getRwType <em>Rw Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rw Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @see #getRwType()
	 * @generated
	 */
	void setRwType(RWType value);

} // SlaveComponent
