/**
 */
package org.multicore_association.shim.model.shim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FIFO Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.FIFOCommunication#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.FIFOCommunication#getQueueSize <em>Queue Size</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getFIFOCommunication()
 * @model extendedMetaData="name='FIFOCommunication' kind='elementOnly'"
 * @generated
 */
public interface FIFOCommunication extends AbstractCommunication {
	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size</em>' attribute.
	 * @see #setDataSize(int)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFIFOCommunication_DataSize()
	 * @model default="0" dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='dataSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDataSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.FIFOCommunication#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size</em>' attribute.
	 * @see #getDataSize()
	 * @generated
	 */
	void setDataSize(int value);

	/**
	 * Returns the value of the '<em><b>Data Size Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #isSetDataSizeUnit()
	 * @see #unsetDataSizeUnit()
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFIFOCommunication_DataSizeUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dataSizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getDataSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #isSetDataSizeUnit()
	 * @see #unsetDataSizeUnit()
	 * @see #getDataSizeUnit()
	 * @generated
	 */
	void setDataSizeUnit(SizeUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSizeUnit()
	 * @see #getDataSizeUnit()
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @generated
	 */
	void unsetDataSizeUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Size Unit</em>' attribute is set.
	 * @see #unsetDataSizeUnit()
	 * @see #getDataSizeUnit()
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @generated
	 */
	boolean isSetDataSizeUnit();

	/**
	 * Returns the value of the '<em><b>Queue Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' attribute.
	 * @see #setQueueSize(int)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFIFOCommunication_QueueSize()
	 * @model default="0" dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='queueSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getQueueSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.FIFOCommunication#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(int value);

} // FIFOCommunication
