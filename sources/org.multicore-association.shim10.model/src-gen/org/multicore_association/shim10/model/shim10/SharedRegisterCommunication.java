/**
 */
package org.multicore_association.shim10.model.shim10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Register Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSizeUnit <em>Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getNRegister <em>NRegister</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSharedRegisterCommunication()
 * @model extendedMetaData="name='SharedRegisterCommunication' kind='elementOnly'"
 * @generated
 */
public interface SharedRegisterCommunication extends AbstractCommunication {
	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size</em>' attribute.
	 * @see #isSetDataSize()
	 * @see #unsetDataSize()
	 * @see #setDataSize(int)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSharedRegisterCommunication_DataSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='dataSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDataSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSize <em>Data Size</em>}' attribute.
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
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSize()
	 * @see #getDataSize()
	 * @see #setDataSize(int)
	 * @generated
	 */
	void unsetDataSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSize <em>Data Size</em>}' attribute is set.
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
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSharedRegisterCommunication_DataSizeUnit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='dataSizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getDataSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute.
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
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataSizeUnit()
	 * @see #getDataSizeUnit()
	 * @see #setDataSizeUnit(SizeUnitType)
	 * @generated
	 */
	void unsetDataSizeUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getDataSizeUnit <em>Data Size Unit</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>NRegister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NRegister</em>' attribute.
	 * @see #isSetNRegister()
	 * @see #unsetNRegister()
	 * @see #setNRegister(int)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSharedRegisterCommunication_NRegister()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='nRegister' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNRegister();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getNRegister <em>NRegister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NRegister</em>' attribute.
	 * @see #isSetNRegister()
	 * @see #unsetNRegister()
	 * @see #getNRegister()
	 * @generated
	 */
	void setNRegister(int value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getNRegister <em>NRegister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNRegister()
	 * @see #getNRegister()
	 * @see #setNRegister(int)
	 * @generated
	 */
	void unsetNRegister();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication#getNRegister <em>NRegister</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NRegister</em>' attribute is set.
	 * @see #unsetNRegister()
	 * @see #getNRegister()
	 * @see #setNRegister(int)
	 * @generated
	 */
	boolean isSetNRegister();

} // SharedRegisterCommunication
