/**
 */
package org.multicore_association.shim10.model.shim10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FIFO Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getQueueSize <em>Queue Size</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getFIFOCommunication()
 * @model extendedMetaData="name='FIFOCommunication' kind='elementOnly'"
 * @generated
 */
public interface FIFOCommunication extends AbstractCommunication {
	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size</em>' attribute.
	 * @see #isSetDataSize()
	 * @see #unsetDataSize()
	 * @see #setDataSize(int)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getFIFOCommunication_DataSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='dataSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDataSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size</em>' attribute.
	 * @see #isSetDataSize()
	 * @see #unsetDataSize()
	 * @see #getDataSize()
	 * @generated
	 */
	void setDataSize(int value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSize()
	 * @see #getDataSize()
	 * @see #setDataSize(int)
	 * @generated
	 */
	void unsetDataSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSize <em>Data Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Size</em>' attribute is set.
	 * @see #unsetDataSize()
	 * @see #getDataSize()
	 * @see #setDataSize(int)
	 * @generated
	 */
	boolean isSetDataSize();

	/**
	 * Returns the value of the '<em><b>Data Size Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @see #isSetDataSizeUnit()
	 * @see #unsetDataSizeUnit()
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getFIFOCommunication_DataSizeUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dataSizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getDataSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @see #isSetDataSizeUnit()
	 * @see #unsetDataSizeUnit()
	 * @see #getDataSizeUnit()
	 * @generated
	 */
	void setDataSizeUnit(SizeUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSizeUnit()
	 * @see #getDataSizeUnit()
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @generated
	 */
	void unsetDataSizeUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' attribute.
	 * @see #isSetQueueSize()
	 * @see #unsetQueueSize()
	 * @see #setQueueSize(int)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getFIFOCommunication_QueueSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='queueSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getQueueSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #isSetQueueSize()
	 * @see #unsetQueueSize()
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(int value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueueSize()
	 * @see #getQueueSize()
	 * @see #setQueueSize(int)
	 * @generated
	 */
	void unsetQueueSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.FIFOCommunication#getQueueSize <em>Queue Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Queue Size</em>' attribute is set.
	 * @see #unsetQueueSize()
	 * @see #getQueueSize()
	 * @see #setQueueSize(int)
	 * @generated
	 */
	boolean isSetQueueSize();

} // FIFOCommunication
