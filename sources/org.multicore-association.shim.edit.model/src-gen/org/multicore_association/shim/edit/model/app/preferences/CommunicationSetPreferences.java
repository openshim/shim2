/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

import org.multicore_association.shim.model.shim.OperationType;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Set Preferences</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckInterruptCommunication <em>Check Interrupt Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckEventCommunication <em>Check Event Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckFIFOCommunication <em>Check FIFO Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getFifoDataSize <em>Fifo Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getFifoDataSizeUnit <em>Fifo Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckSharedMemoryCommunication <em>Check Shared Memory Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSize <em>Shared Memory Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSizeUnit <em>Shared Memory Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckSharedRegisterCommunication <em>Check Shared Register Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedRegisterDataSize <em>Shared Register Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedRegisterDataSizeUnit <em>Shared Register Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getNRegister <em>NRegister</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isDontConnect <em>Dont Connect</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences()
 * @model extendedMetaData="name='CommunicationSetPreferences' kind='elementOnly'"
 * @generated
 */
public interface CommunicationSetPreferences extends AbstractPreferences {
	/**
	 * Returns the value of the '<em><b>Check Interrupt Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Interrupt Communication</em>' attribute.
	 * @see #setCheckInterruptCommunication(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_CheckInterruptCommunication()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkInterruptCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckInterruptCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckInterruptCommunication <em>Check Interrupt Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Interrupt Communication</em>' attribute.
	 * @see #isCheckInterruptCommunication()
	 * @generated
	 */
	void setCheckInterruptCommunication(boolean value);

	/**
	 * Returns the value of the '<em><b>Check Event Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Event Communication</em>' attribute.
	 * @see #setCheckEventCommunication(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_CheckEventCommunication()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkEventCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckEventCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckEventCommunication <em>Check Event Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Event Communication</em>' attribute.
	 * @see #isCheckEventCommunication()
	 * @generated
	 */
	void setCheckEventCommunication(boolean value);

	/**
	 * Returns the value of the '<em><b>Check FIFO Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check FIFO Communication</em>' attribute.
	 * @see #setCheckFIFOCommunication(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_CheckFIFOCommunication()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkFIFOCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckFIFOCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckFIFOCommunication <em>Check FIFO Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check FIFO Communication</em>' attribute.
	 * @see #isCheckFIFOCommunication()
	 * @generated
	 */
	void setCheckFIFOCommunication(boolean value);

	/**
	 * Returns the value of the '<em><b>Fifo Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fifo Data Size</em>' attribute.
	 * @see #setFifoDataSize(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_FifoDataSize()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='fifoDataSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getFifoDataSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getFifoDataSize <em>Fifo Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fifo Data Size</em>' attribute.
	 * @see #getFifoDataSize()
	 * @generated
	 */
	void setFifoDataSize(int value);

	/**
	 * Returns the value of the '<em><b>Fifo Data Size Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fifo Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #setFifoDataSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_FifoDataSizeUnit()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='fifoDataSizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getFifoDataSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getFifoDataSizeUnit <em>Fifo Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fifo Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #getFifoDataSizeUnit()
	 * @generated
	 */
	void setFifoDataSizeUnit(SizeUnitType value);

	/**
	 * Returns the value of the '<em><b>Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Size</em>' attribute.
	 * @see #setQueueSize(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_QueueSize()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='queueSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getQueueSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getQueueSize <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Size</em>' attribute.
	 * @see #getQueueSize()
	 * @generated
	 */
	void setQueueSize(int value);

	/**
	 * Returns the value of the '<em><b>Check Shared Memory Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Shared Memory Communication</em>' attribute.
	 * @see #setCheckSharedMemoryCommunication(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_CheckSharedMemoryCommunication()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkSharedMemoryCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckSharedMemoryCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckSharedMemoryCommunication <em>Check Shared Memory Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Shared Memory Communication</em>' attribute.
	 * @see #isCheckSharedMemoryCommunication()
	 * @generated
	 */
	void setCheckSharedMemoryCommunication(boolean value);

	/**
	 * Returns the value of the '<em><b>Shared Memory Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Memory Data Size</em>' attribute.
	 * @see #setSharedMemoryDataSize(Integer)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_SharedMemoryDataSize()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='sharedMemoryDataSize' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getSharedMemoryDataSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSize <em>Shared Memory Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Memory Data Size</em>' attribute.
	 * @see #getSharedMemoryDataSize()
	 * @generated
	 */
	void setSharedMemoryDataSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Shared Memory Data Size Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Memory Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #isSetSharedMemoryDataSizeUnit()
	 * @see #unsetSharedMemoryDataSizeUnit()
	 * @see #setSharedMemoryDataSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_SharedMemoryDataSizeUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='sharedMemoryDataSizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getSharedMemoryDataSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSizeUnit <em>Shared Memory Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Memory Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #isSetSharedMemoryDataSizeUnit()
	 * @see #unsetSharedMemoryDataSizeUnit()
	 * @see #getSharedMemoryDataSizeUnit()
	 * @generated
	 */
	void setSharedMemoryDataSizeUnit(SizeUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSizeUnit <em>Shared Memory Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSharedMemoryDataSizeUnit()
	 * @see #getSharedMemoryDataSizeUnit()
	 * @see #setSharedMemoryDataSizeUnit(SizeUnitType)
	 * @generated
	 */
	void unsetSharedMemoryDataSizeUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedMemoryDataSizeUnit <em>Shared Memory Data Size Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shared Memory Data Size Unit</em>' attribute is set.
	 * @see #unsetSharedMemoryDataSizeUnit()
	 * @see #getSharedMemoryDataSizeUnit()
	 * @see #setSharedMemoryDataSizeUnit(SizeUnitType)
	 * @generated
	 */
	boolean isSetSharedMemoryDataSizeUnit();

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.OperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.OperationType
	 * @see #setOperationType(OperationType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_OperationType()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='operationType' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getOperationType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.OperationType
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(OperationType value);

	/**
	 * Returns the value of the '<em><b>Check Shared Register Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Shared Register Communication</em>' attribute.
	 * @see #setCheckSharedRegisterCommunication(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_CheckSharedRegisterCommunication()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='checkSharedRegisterCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCheckSharedRegisterCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isCheckSharedRegisterCommunication <em>Check Shared Register Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Shared Register Communication</em>' attribute.
	 * @see #isCheckSharedRegisterCommunication()
	 * @generated
	 */
	void setCheckSharedRegisterCommunication(boolean value);

	/**
	 * Returns the value of the '<em><b>Shared Register Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Register Data Size</em>' attribute.
	 * @see #setSharedRegisterDataSize(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_SharedRegisterDataSize()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='sharedRegisterDataSize' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSharedRegisterDataSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedRegisterDataSize <em>Shared Register Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Register Data Size</em>' attribute.
	 * @see #getSharedRegisterDataSize()
	 * @generated
	 */
	void setSharedRegisterDataSize(int value);

	/**
	 * Returns the value of the '<em><b>Shared Register Data Size Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Register Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #setSharedRegisterDataSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_SharedRegisterDataSizeUnit()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='sharedRegisterDataSizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getSharedRegisterDataSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getSharedRegisterDataSizeUnit <em>Shared Register Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Register Data Size Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SizeUnitType
	 * @see #getSharedRegisterDataSizeUnit()
	 * @generated
	 */
	void setSharedRegisterDataSizeUnit(SizeUnitType value);

	/**
	 * Returns the value of the '<em><b>NRegister</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NRegister</em>' attribute.
	 * @see #setNRegister(int)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_NRegister()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='nRegister' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNRegister();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#getNRegister <em>NRegister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NRegister</em>' attribute.
	 * @see #getNRegister()
	 * @generated
	 */
	void setNRegister(int value);

	/**
	 * Returns the value of the '<em><b>Dont Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dont Connect</em>' attribute.
	 * @see #setDontConnect(boolean)
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCommunicationSetPreferences_DontConnect()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='dontConnect' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isDontConnect();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences#isDontConnect <em>Dont Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dont Connect</em>' attribute.
	 * @see #isDontConnect()
	 * @generated
	 */
	void setDontConnect(boolean value);

} // CommunicationSetPreferences
