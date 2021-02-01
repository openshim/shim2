/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAbstractCommunication <em>Abstract Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAbstractPerformance <em>Abstract Performance</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessTypeSet <em>Access Type Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAddressSpace <em>Address Space</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAddressSpaceSet <em>Address Space Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getCache <em>Cache</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getClockFrequency <em>Clock Frequency</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getCommonInstructionSet <em>Common Instruction Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getCommunicationSet <em>Communication Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getConnectionSet <em>Connection Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getEventCommunication <em>Event Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getFIFOCommunication <em>FIFO Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getInterruptCommunication <em>Interrupt Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getLatency <em>Latency</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterComponent <em>Master Component</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterSlaveBinding <em>Master Slave Binding</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMemoryConsistencyModel <em>Memory Consistency Model</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getPerformance <em>Performance</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getPerformanceSet <em>Performance Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSharedMemoryCommunication <em>Shared Memory Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSharedRegisterCommunication <em>Shared Register Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSlaveComponent <em>Slave Component</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSubSpace <em>Sub Space</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSystemConfiguration <em>System Configuration</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Communication</em>' containment reference.
	 * @see #setAbstractCommunication(AbstractCommunication)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_AbstractCommunication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractCommunication getAbstractCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAbstractCommunication <em>Abstract Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Communication</em>' containment reference.
	 * @see #getAbstractCommunication()
	 * @generated
	 */
	void setAbstractCommunication(AbstractCommunication value);

	/**
	 * Returns the value of the '<em><b>Abstract Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Performance</em>' containment reference.
	 * @see #setAbstractPerformance(AbstractPerformance)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_AbstractPerformance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractPerformance' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractPerformance getAbstractPerformance();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAbstractPerformance <em>Abstract Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Performance</em>' containment reference.
	 * @see #getAbstractPerformance()
	 * @generated
	 */
	void setAbstractPerformance(AbstractPerformance value);

	/**
	 * Returns the value of the '<em><b>Accessor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessor</em>' containment reference.
	 * @see #setAccessor(Accessor)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_Accessor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Accessor' namespace='##targetNamespace'"
	 * @generated
	 */
	Accessor getAccessor();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessor <em>Accessor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accessor</em>' containment reference.
	 * @see #getAccessor()
	 * @generated
	 */
	void setAccessor(Accessor value);

	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' containment reference.
	 * @see #setAccessType(AccessType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_AccessType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccessType' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessType getAccessType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessType <em>Access Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type</em>' containment reference.
	 * @see #getAccessType()
	 * @generated
	 */
	void setAccessType(AccessType value);

	/**
	 * Returns the value of the '<em><b>Access Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type Set</em>' containment reference.
	 * @see #setAccessTypeSet(AccessTypeSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_AccessTypeSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccessTypeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessTypeSet getAccessTypeSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAccessTypeSet <em>Access Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type Set</em>' containment reference.
	 * @see #getAccessTypeSet()
	 * @generated
	 */
	void setAccessTypeSet(AccessTypeSet value);

	/**
	 * Returns the value of the '<em><b>Address Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space</em>' containment reference.
	 * @see #setAddressSpace(AddressSpace)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_AddressSpace()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpace getAddressSpace();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAddressSpace <em>Address Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space</em>' containment reference.
	 * @see #getAddressSpace()
	 * @generated
	 */
	void setAddressSpace(AddressSpace value);

	/**
	 * Returns the value of the '<em><b>Address Space Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space Set</em>' containment reference.
	 * @see #setAddressSpaceSet(AddressSpaceSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_AddressSpaceSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressSpaceSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpaceSet getAddressSpaceSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getAddressSpaceSet <em>Address Space Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space Set</em>' containment reference.
	 * @see #getAddressSpaceSet()
	 * @generated
	 */
	void setAddressSpaceSet(AddressSpaceSet value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' containment reference.
	 * @see #setCache(Cache)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_Cache()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Cache' namespace='##targetNamespace'"
	 * @generated
	 */
	Cache getCache();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getCache <em>Cache</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' containment reference.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(Cache value);

	/**
	 * Returns the value of the '<em><b>Clock Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Frequency</em>' containment reference.
	 * @see #setClockFrequency(ClockFrequency)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_ClockFrequency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClockFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockFrequency getClockFrequency();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getClockFrequency <em>Clock Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Frequency</em>' containment reference.
	 * @see #getClockFrequency()
	 * @generated
	 */
	void setClockFrequency(ClockFrequency value);

	/**
	 * Returns the value of the '<em><b>Common Instruction Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Instruction Set</em>' containment reference.
	 * @see #setCommonInstructionSet(CommonInstructionSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_CommonInstructionSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CommonInstructionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CommonInstructionSet getCommonInstructionSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getCommonInstructionSet <em>Common Instruction Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Instruction Set</em>' containment reference.
	 * @see #getCommonInstructionSet()
	 * @generated
	 */
	void setCommonInstructionSet(CommonInstructionSet value);

	/**
	 * Returns the value of the '<em><b>Communication Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Set</em>' containment reference.
	 * @see #setCommunicationSet(CommunicationSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_CommunicationSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CommunicationSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationSet getCommunicationSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getCommunicationSet <em>Communication Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Set</em>' containment reference.
	 * @see #getCommunicationSet()
	 * @generated
	 */
	void setCommunicationSet(CommunicationSet value);

	/**
	 * Returns the value of the '<em><b>Component Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Set</em>' containment reference.
	 * @see #setComponentSet(ComponentSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_ComponentSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ComponentSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentSet getComponentSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getComponentSet <em>Component Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Set</em>' containment reference.
	 * @see #getComponentSet()
	 * @generated
	 */
	void setComponentSet(ComponentSet value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference.
	 * @see #setConnection(Connection)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_Connection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Connection' namespace='##targetNamespace'"
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getConnection <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' containment reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>Connection Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Set</em>' containment reference.
	 * @see #setConnectionSet(ConnectionSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_ConnectionSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConnectionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionSet getConnectionSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getConnectionSet <em>Connection Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Set</em>' containment reference.
	 * @see #getConnectionSet()
	 * @generated
	 */
	void setConnectionSet(ConnectionSet value);

	/**
	 * Returns the value of the '<em><b>Event Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Communication</em>' containment reference.
	 * @see #setEventCommunication(EventCommunication)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_EventCommunication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EventCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	EventCommunication getEventCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getEventCommunication <em>Event Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Communication</em>' containment reference.
	 * @see #getEventCommunication()
	 * @generated
	 */
	void setEventCommunication(EventCommunication value);

	/**
	 * Returns the value of the '<em><b>FIFO Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FIFO Communication</em>' containment reference.
	 * @see #setFIFOCommunication(FIFOCommunication)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_FIFOCommunication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FIFOCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	FIFOCommunication getFIFOCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getFIFOCommunication <em>FIFO Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FIFO Communication</em>' containment reference.
	 * @see #getFIFOCommunication()
	 * @generated
	 */
	void setFIFOCommunication(FIFOCommunication value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference.
	 * @see #setInstruction(Instruction)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_Instruction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Instruction' namespace='##targetNamespace'"
	 * @generated
	 */
	Instruction getInstruction();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getInstruction <em>Instruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruction</em>' containment reference.
	 * @see #getInstruction()
	 * @generated
	 */
	void setInstruction(Instruction value);

	/**
	 * Returns the value of the '<em><b>Interrupt Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupt Communication</em>' containment reference.
	 * @see #setInterruptCommunication(InterruptCommunication)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_InterruptCommunication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='InterruptCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	InterruptCommunication getInterruptCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getInterruptCommunication <em>Interrupt Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interrupt Communication</em>' containment reference.
	 * @see #getInterruptCommunication()
	 * @generated
	 */
	void setInterruptCommunication(InterruptCommunication value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' containment reference.
	 * @see #setLatency(Latency)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_Latency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Latency' namespace='##targetNamespace'"
	 * @generated
	 */
	Latency getLatency();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getLatency <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' containment reference.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(Latency value);

	/**
	 * Returns the value of the '<em><b>Master Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Component</em>' containment reference.
	 * @see #setMasterComponent(MasterComponent)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_MasterComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MasterComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterComponent getMasterComponent();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterComponent <em>Master Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Component</em>' containment reference.
	 * @see #getMasterComponent()
	 * @generated
	 */
	void setMasterComponent(MasterComponent value);

	/**
	 * Returns the value of the '<em><b>Master Slave Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Slave Binding</em>' containment reference.
	 * @see #setMasterSlaveBinding(MasterSlaveBinding)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_MasterSlaveBinding()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MasterSlaveBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterSlaveBinding getMasterSlaveBinding();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterSlaveBinding <em>Master Slave Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Slave Binding</em>' containment reference.
	 * @see #getMasterSlaveBinding()
	 * @generated
	 */
	void setMasterSlaveBinding(MasterSlaveBinding value);

	/**
	 * Returns the value of the '<em><b>Master Slave Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Slave Binding Set</em>' containment reference.
	 * @see #setMasterSlaveBindingSet(MasterSlaveBindingSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_MasterSlaveBindingSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MasterSlaveBindingSet' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterSlaveBindingSet getMasterSlaveBindingSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Slave Binding Set</em>' containment reference.
	 * @see #getMasterSlaveBindingSet()
	 * @generated
	 */
	void setMasterSlaveBindingSet(MasterSlaveBindingSet value);

	/**
	 * Returns the value of the '<em><b>Memory Consistency Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Consistency Model</em>' containment reference.
	 * @see #setMemoryConsistencyModel(MemoryConsistencyModel)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_MemoryConsistencyModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MemoryConsistencyModel' namespace='##targetNamespace'"
	 * @generated
	 */
	MemoryConsistencyModel getMemoryConsistencyModel();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getMemoryConsistencyModel <em>Memory Consistency Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Consistency Model</em>' containment reference.
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 */
	void setMemoryConsistencyModel(MemoryConsistencyModel value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference.
	 * @see #setPerformance(Performance)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_Performance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Performance' namespace='##targetNamespace'"
	 * @generated
	 */
	Performance getPerformance();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getPerformance <em>Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' containment reference.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(Performance value);

	/**
	 * Returns the value of the '<em><b>Performance Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Set</em>' containment reference.
	 * @see #setPerformanceSet(PerformanceSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_PerformanceSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PerformanceSet' namespace='##targetNamespace'"
	 * @generated
	 */
	PerformanceSet getPerformanceSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getPerformanceSet <em>Performance Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Set</em>' containment reference.
	 * @see #getPerformanceSet()
	 * @generated
	 */
	void setPerformanceSet(PerformanceSet value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' containment reference.
	 * @see #setPitch(Pitch)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_Pitch()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Pitch' namespace='##targetNamespace'"
	 * @generated
	 */
	Pitch getPitch();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getPitch <em>Pitch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' containment reference.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(Pitch value);

	/**
	 * Returns the value of the '<em><b>Shared Memory Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Memory Communication</em>' containment reference.
	 * @see #setSharedMemoryCommunication(SharedMemoryCommunication)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_SharedMemoryCommunication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SharedMemoryCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	SharedMemoryCommunication getSharedMemoryCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSharedMemoryCommunication <em>Shared Memory Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Memory Communication</em>' containment reference.
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 */
	void setSharedMemoryCommunication(SharedMemoryCommunication value);

	/**
	 * Returns the value of the '<em><b>Shared Register Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Register Communication</em>' containment reference.
	 * @see #setSharedRegisterCommunication(SharedRegisterCommunication)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_SharedRegisterCommunication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SharedRegisterCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	SharedRegisterCommunication getSharedRegisterCommunication();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSharedRegisterCommunication <em>Shared Register Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Register Communication</em>' containment reference.
	 * @see #getSharedRegisterCommunication()
	 * @generated
	 */
	void setSharedRegisterCommunication(SharedRegisterCommunication value);

	/**
	 * Returns the value of the '<em><b>Slave Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave Component</em>' containment reference.
	 * @see #setSlaveComponent(SlaveComponent)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_SlaveComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SlaveComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	SlaveComponent getSlaveComponent();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSlaveComponent <em>Slave Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave Component</em>' containment reference.
	 * @see #getSlaveComponent()
	 * @generated
	 */
	void setSlaveComponent(SlaveComponent value);

	/**
	 * Returns the value of the '<em><b>Sub Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Space</em>' containment reference.
	 * @see #setSubSpace(SubSpace)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_SubSpace()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	SubSpace getSubSpace();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSubSpace <em>Sub Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Space</em>' containment reference.
	 * @see #getSubSpace()
	 * @generated
	 */
	void setSubSpace(SubSpace value);

	/**
	 * Returns the value of the '<em><b>System Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Configuration</em>' containment reference.
	 * @see #setSystemConfiguration(SystemConfiguration)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getDocumentRoot_SystemConfiguration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SystemConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemConfiguration getSystemConfiguration();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.DocumentRoot#getSystemConfiguration <em>System Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Configuration</em>' containment reference.
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	void setSystemConfiguration(SystemConfiguration value);

} // DocumentRoot
