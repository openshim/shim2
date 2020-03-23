/**
 */
package org.multicore_association.shim.model.shim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Register Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication#getDataSizeUnit <em>Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication#getNRegister <em>NRegister</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedRegisterCommunication()
 * @model extendedMetaData="name='SharedRegisterCommunication' kind='elementOnly'"
 * @generated
 */
public interface SharedRegisterCommunication extends AbstractCommunication {
	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size</em>' attribute.
	 * @see #setDataSize(int)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedRegisterCommunication_DataSize()
	 * @model default="0" dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='dataSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDataSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size</em>' attribute.
	 * @see #getDataSize()
	 * @generated
	 */
	void setDataSize(int value);

	/**
	 * Returns the value of the '<em><b>Data Size Unit</b></em>' attribute.
	 * The default value is <code>"KiB"</code>.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedRegisterCommunication_DataSizeUnit()
	 * @model default="KiB" required="true"
	 *        extendedMetaData="kind='attribute' name='dataSizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getDataSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #getDataSizeUnit()
	 * @generated
	 */
	void setDataSizeUnit(SizeUnitType value);

	/**
	 * Returns the value of the '<em><b>NRegister</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NRegister</em>' attribute.
	 * @see #setNRegister(int)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSharedRegisterCommunication_NRegister()
	 * @model default="0" dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='nRegister' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNRegister();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SharedRegisterCommunication#getNRegister <em>NRegister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NRegister</em>' attribute.
	 * @see #getNRegister()
	 * @generated
	 */
	void setNRegister(int value);

} // SharedRegisterCommunication
