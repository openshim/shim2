/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.multicore_association.shim10.model.shim10.AbstractCommunication;
import org.multicore_association.shim10.model.shim10.AbstractPerformance;
import org.multicore_association.shim10.model.shim10.AccessType;
import org.multicore_association.shim10.model.shim10.AccessTypeSet;
import org.multicore_association.shim10.model.shim10.Accessor;
import org.multicore_association.shim10.model.shim10.AddressSpace;
import org.multicore_association.shim10.model.shim10.AddressSpaceSet;
import org.multicore_association.shim10.model.shim10.Cache;
import org.multicore_association.shim10.model.shim10.ClockFrequency;
import org.multicore_association.shim10.model.shim10.CommonInstructionSet;
import org.multicore_association.shim10.model.shim10.CommunicationSet;
import org.multicore_association.shim10.model.shim10.ComponentSet;
import org.multicore_association.shim10.model.shim10.Connection;
import org.multicore_association.shim10.model.shim10.ConnectionSet;
import org.multicore_association.shim10.model.shim10.DocumentRoot;
import org.multicore_association.shim10.model.shim10.EventCommunication;
import org.multicore_association.shim10.model.shim10.FIFOCommunication;
import org.multicore_association.shim10.model.shim10.Instruction;
import org.multicore_association.shim10.model.shim10.InterruptCommunication;
import org.multicore_association.shim10.model.shim10.Latency;
import org.multicore_association.shim10.model.shim10.MasterComponent;
import org.multicore_association.shim10.model.shim10.MasterSlaveBinding;
import org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet;
import org.multicore_association.shim10.model.shim10.MemoryConsistencyModel;
import org.multicore_association.shim10.model.shim10.Performance;
import org.multicore_association.shim10.model.shim10.PerformanceSet;
import org.multicore_association.shim10.model.shim10.Pitch;
import org.multicore_association.shim10.model.shim10.SharedMemoryCommunication;
import org.multicore_association.shim10.model.shim10.SharedRegisterCommunication;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SlaveComponent;
import org.multicore_association.shim10.model.shim10.SubSpace;
import org.multicore_association.shim10.model.shim10.SystemConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getAbstractCommunication <em>Abstract Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getAbstractPerformance <em>Abstract Performance</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getAccessTypeSet <em>Access Type Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getAddressSpace <em>Address Space</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getAddressSpaceSet <em>Address Space Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getCache <em>Cache</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getClockFrequency <em>Clock Frequency</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getCommonInstructionSet <em>Common Instruction Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getCommunicationSet <em>Communication Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getConnectionSet <em>Connection Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getEventCommunication <em>Event Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getFIFOCommunication <em>FIFO Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getInterruptCommunication <em>Interrupt Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getMasterComponent <em>Master Component</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getMasterSlaveBinding <em>Master Slave Binding</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getMemoryConsistencyModel <em>Memory Consistency Model</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getPerformance <em>Performance</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getPerformanceSet <em>Performance Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getSharedMemoryCommunication <em>Shared Memory Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getSharedRegisterCommunication <em>Shared Register Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getSlaveComponent <em>Slave Component</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getSubSpace <em>Sub Space</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.DocumentRootImpl#getSystemConfiguration <em>System Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ShimPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ShimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ShimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCommunication getAbstractCommunication() {
		return (AbstractCommunication)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCommunication(AbstractCommunication newAbstractCommunication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION, newAbstractCommunication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractCommunication(AbstractCommunication newAbstractCommunication) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION, newAbstractCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPerformance getAbstractPerformance() {
		return (AbstractPerformance)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractPerformance(AbstractPerformance newAbstractPerformance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE, newAbstractPerformance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractPerformance(AbstractPerformance newAbstractPerformance) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE, newAbstractPerformance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accessor getAccessor() {
		return (Accessor)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__ACCESSOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessor(Accessor newAccessor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__ACCESSOR, newAccessor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessor(Accessor newAccessor) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__ACCESSOR, newAccessor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccessType() {
		return (AccessType)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessType(AccessType newAccessType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE, newAccessType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(AccessType newAccessType) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE, newAccessType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTypeSet getAccessTypeSet() {
		return (AccessTypeSet)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessTypeSet(AccessTypeSet newAccessTypeSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE_SET, newAccessTypeSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTypeSet(AccessTypeSet newAccessTypeSet) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE_SET, newAccessTypeSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpace getAddressSpace() {
		return (AddressSpace)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressSpace(AddressSpace newAddressSpace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE, newAddressSpace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpace(AddressSpace newAddressSpace) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE, newAddressSpace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpaceSet getAddressSpaceSet() {
		return (AddressSpaceSet)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressSpaceSet(AddressSpaceSet newAddressSpaceSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE_SET, newAddressSpaceSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpaceSet(AddressSpaceSet newAddressSpaceSet) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE_SET, newAddressSpaceSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache getCache() {
		return (Cache)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__CACHE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCache(Cache newCache, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__CACHE, newCache, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCache(Cache newCache) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__CACHE, newCache);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockFrequency getClockFrequency() {
		return (ClockFrequency)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__CLOCK_FREQUENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockFrequency(ClockFrequency newClockFrequency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__CLOCK_FREQUENCY, newClockFrequency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockFrequency(ClockFrequency newClockFrequency) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__CLOCK_FREQUENCY, newClockFrequency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonInstructionSet getCommonInstructionSet() {
		return (CommonInstructionSet)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommonInstructionSet(CommonInstructionSet newCommonInstructionSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET, newCommonInstructionSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonInstructionSet(CommonInstructionSet newCommonInstructionSet) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET, newCommonInstructionSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSet getCommunicationSet() {
		return (CommunicationSet)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__COMMUNICATION_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationSet(CommunicationSet newCommunicationSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__COMMUNICATION_SET, newCommunicationSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationSet(CommunicationSet newCommunicationSet) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__COMMUNICATION_SET, newCommunicationSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSet getComponentSet() {
		return (ComponentSet)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__COMPONENT_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentSet(ComponentSet newComponentSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__COMPONENT_SET, newComponentSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentSet(ComponentSet newComponentSet) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__COMPONENT_SET, newComponentSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnection() {
		return (Connection)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection(Connection newConnection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION, newConnection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Connection newConnection) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION, newConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSet getConnectionSet() {
		return (ConnectionSet)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionSet(ConnectionSet newConnectionSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION_SET, newConnectionSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionSet(ConnectionSet newConnectionSet) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION_SET, newConnectionSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCommunication getEventCommunication() {
		return (EventCommunication)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__EVENT_COMMUNICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventCommunication(EventCommunication newEventCommunication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__EVENT_COMMUNICATION, newEventCommunication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventCommunication(EventCommunication newEventCommunication) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__EVENT_COMMUNICATION, newEventCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FIFOCommunication getFIFOCommunication() {
		return (FIFOCommunication)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__FIFO_COMMUNICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFIFOCommunication(FIFOCommunication newFIFOCommunication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__FIFO_COMMUNICATION, newFIFOCommunication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFIFOCommunication(FIFOCommunication newFIFOCommunication) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__FIFO_COMMUNICATION, newFIFOCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getInstruction() {
		return (Instruction)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__INSTRUCTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstruction(Instruction newInstruction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__INSTRUCTION, newInstruction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(Instruction newInstruction) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__INSTRUCTION, newInstruction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptCommunication getInterruptCommunication() {
		return (InterruptCommunication)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterruptCommunication(InterruptCommunication newInterruptCommunication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION, newInterruptCommunication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterruptCommunication(InterruptCommunication newInterruptCommunication) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION, newInterruptCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latency getLatency() {
		return (Latency)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__LATENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatency(Latency newLatency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__LATENCY, newLatency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(Latency newLatency) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__LATENCY, newLatency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterComponent getMasterComponent() {
		return (MasterComponent)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__MASTER_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterComponent(MasterComponent newMasterComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__MASTER_COMPONENT, newMasterComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterComponent(MasterComponent newMasterComponent) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__MASTER_COMPONENT, newMasterComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterSlaveBinding getMasterSlaveBinding() {
		return (MasterSlaveBinding)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterSlaveBinding(MasterSlaveBinding newMasterSlaveBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING, newMasterSlaveBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterSlaveBinding(MasterSlaveBinding newMasterSlaveBinding) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING, newMasterSlaveBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterSlaveBindingSet getMasterSlaveBindingSet() {
		return (MasterSlaveBindingSet)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterSlaveBindingSet(MasterSlaveBindingSet newMasterSlaveBindingSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET, newMasterSlaveBindingSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterSlaveBindingSet(MasterSlaveBindingSet newMasterSlaveBindingSet) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET, newMasterSlaveBindingSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryConsistencyModel getMemoryConsistencyModel() {
		return (MemoryConsistencyModel)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemoryConsistencyModel(MemoryConsistencyModel newMemoryConsistencyModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL, newMemoryConsistencyModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryConsistencyModel(MemoryConsistencyModel newMemoryConsistencyModel) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL, newMemoryConsistencyModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance getPerformance() {
		return (Performance)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformance(Performance newPerformance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE, newPerformance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformance(Performance newPerformance) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE, newPerformance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceSet getPerformanceSet() {
		return (PerformanceSet)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE_SET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceSet(PerformanceSet newPerformanceSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE_SET, newPerformanceSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformanceSet(PerformanceSet newPerformanceSet) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE_SET, newPerformanceSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pitch getPitch() {
		return (Pitch)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__PITCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPitch(Pitch newPitch, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__PITCH, newPitch, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(Pitch newPitch) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__PITCH, newPitch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedMemoryCommunication getSharedMemoryCommunication() {
		return (SharedMemoryCommunication)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharedMemoryCommunication(SharedMemoryCommunication newSharedMemoryCommunication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION, newSharedMemoryCommunication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedMemoryCommunication(SharedMemoryCommunication newSharedMemoryCommunication) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION, newSharedMemoryCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedRegisterCommunication getSharedRegisterCommunication() {
		return (SharedRegisterCommunication)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharedRegisterCommunication(SharedRegisterCommunication newSharedRegisterCommunication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION, newSharedRegisterCommunication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedRegisterCommunication(SharedRegisterCommunication newSharedRegisterCommunication) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION, newSharedRegisterCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaveComponent getSlaveComponent() {
		return (SlaveComponent)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__SLAVE_COMPONENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlaveComponent(SlaveComponent newSlaveComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__SLAVE_COMPONENT, newSlaveComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlaveComponent(SlaveComponent newSlaveComponent) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__SLAVE_COMPONENT, newSlaveComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSpace getSubSpace() {
		return (SubSpace)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__SUB_SPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubSpace(SubSpace newSubSpace, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__SUB_SPACE, newSubSpace, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSpace(SubSpace newSubSpace) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__SUB_SPACE, newSubSpace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemConfiguration getSystemConfiguration() {
		return (SystemConfiguration)getMixed().get(ShimPackage.Literals.DOCUMENT_ROOT__SYSTEM_CONFIGURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemConfiguration(SystemConfiguration newSystemConfiguration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ShimPackage.Literals.DOCUMENT_ROOT__SYSTEM_CONFIGURATION, newSystemConfiguration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemConfiguration(SystemConfiguration newSystemConfiguration) {
		((FeatureMap.Internal)getMixed()).set(ShimPackage.Literals.DOCUMENT_ROOT__SYSTEM_CONFIGURATION, newSystemConfiguration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShimPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ShimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ShimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION:
				return basicSetAbstractCommunication(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE:
				return basicSetAbstractPerformance(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__ACCESSOR:
				return basicSetAccessor(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE:
				return basicSetAccessType(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE_SET:
				return basicSetAccessTypeSet(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE:
				return basicSetAddressSpace(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE_SET:
				return basicSetAddressSpaceSet(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__CACHE:
				return basicSetCache(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__CLOCK_FREQUENCY:
				return basicSetClockFrequency(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET:
				return basicSetCommonInstructionSet(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__COMMUNICATION_SET:
				return basicSetCommunicationSet(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__COMPONENT_SET:
				return basicSetComponentSet(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__CONNECTION:
				return basicSetConnection(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__CONNECTION_SET:
				return basicSetConnectionSet(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__EVENT_COMMUNICATION:
				return basicSetEventCommunication(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__FIFO_COMMUNICATION:
				return basicSetFIFOCommunication(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__INSTRUCTION:
				return basicSetInstruction(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION:
				return basicSetInterruptCommunication(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__LATENCY:
				return basicSetLatency(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__MASTER_COMPONENT:
				return basicSetMasterComponent(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING:
				return basicSetMasterSlaveBinding(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET:
				return basicSetMasterSlaveBindingSet(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL:
				return basicSetMemoryConsistencyModel(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE:
				return basicSetPerformance(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE_SET:
				return basicSetPerformanceSet(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__PITCH:
				return basicSetPitch(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION:
				return basicSetSharedMemoryCommunication(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION:
				return basicSetSharedRegisterCommunication(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__SLAVE_COMPONENT:
				return basicSetSlaveComponent(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__SUB_SPACE:
				return basicSetSubSpace(null, msgs);
			case ShimPackage.DOCUMENT_ROOT__SYSTEM_CONFIGURATION:
				return basicSetSystemConfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShimPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ShimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ShimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION:
				return getAbstractCommunication();
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE:
				return getAbstractPerformance();
			case ShimPackage.DOCUMENT_ROOT__ACCESSOR:
				return getAccessor();
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE:
				return getAccessType();
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE_SET:
				return getAccessTypeSet();
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE:
				return getAddressSpace();
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE_SET:
				return getAddressSpaceSet();
			case ShimPackage.DOCUMENT_ROOT__CACHE:
				return getCache();
			case ShimPackage.DOCUMENT_ROOT__CLOCK_FREQUENCY:
				return getClockFrequency();
			case ShimPackage.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET:
				return getCommonInstructionSet();
			case ShimPackage.DOCUMENT_ROOT__COMMUNICATION_SET:
				return getCommunicationSet();
			case ShimPackage.DOCUMENT_ROOT__COMPONENT_SET:
				return getComponentSet();
			case ShimPackage.DOCUMENT_ROOT__CONNECTION:
				return getConnection();
			case ShimPackage.DOCUMENT_ROOT__CONNECTION_SET:
				return getConnectionSet();
			case ShimPackage.DOCUMENT_ROOT__EVENT_COMMUNICATION:
				return getEventCommunication();
			case ShimPackage.DOCUMENT_ROOT__FIFO_COMMUNICATION:
				return getFIFOCommunication();
			case ShimPackage.DOCUMENT_ROOT__INSTRUCTION:
				return getInstruction();
			case ShimPackage.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION:
				return getInterruptCommunication();
			case ShimPackage.DOCUMENT_ROOT__LATENCY:
				return getLatency();
			case ShimPackage.DOCUMENT_ROOT__MASTER_COMPONENT:
				return getMasterComponent();
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING:
				return getMasterSlaveBinding();
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET:
				return getMasterSlaveBindingSet();
			case ShimPackage.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL:
				return getMemoryConsistencyModel();
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE:
				return getPerformance();
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE_SET:
				return getPerformanceSet();
			case ShimPackage.DOCUMENT_ROOT__PITCH:
				return getPitch();
			case ShimPackage.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION:
				return getSharedMemoryCommunication();
			case ShimPackage.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION:
				return getSharedRegisterCommunication();
			case ShimPackage.DOCUMENT_ROOT__SLAVE_COMPONENT:
				return getSlaveComponent();
			case ShimPackage.DOCUMENT_ROOT__SUB_SPACE:
				return getSubSpace();
			case ShimPackage.DOCUMENT_ROOT__SYSTEM_CONFIGURATION:
				return getSystemConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShimPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION:
				setAbstractCommunication((AbstractCommunication)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE:
				setAbstractPerformance((AbstractPerformance)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__ACCESSOR:
				setAccessor((Accessor)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE:
				setAccessType((AccessType)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE_SET:
				setAccessTypeSet((AccessTypeSet)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE:
				setAddressSpace((AddressSpace)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE_SET:
				setAddressSpaceSet((AddressSpaceSet)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__CACHE:
				setCache((Cache)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__CLOCK_FREQUENCY:
				setClockFrequency((ClockFrequency)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET:
				setCommonInstructionSet((CommonInstructionSet)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__COMMUNICATION_SET:
				setCommunicationSet((CommunicationSet)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__COMPONENT_SET:
				setComponentSet((ComponentSet)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__CONNECTION:
				setConnection((Connection)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__CONNECTION_SET:
				setConnectionSet((ConnectionSet)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__EVENT_COMMUNICATION:
				setEventCommunication((EventCommunication)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__FIFO_COMMUNICATION:
				setFIFOCommunication((FIFOCommunication)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__INSTRUCTION:
				setInstruction((Instruction)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION:
				setInterruptCommunication((InterruptCommunication)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__LATENCY:
				setLatency((Latency)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__MASTER_COMPONENT:
				setMasterComponent((MasterComponent)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING:
				setMasterSlaveBinding((MasterSlaveBinding)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET:
				setMasterSlaveBindingSet((MasterSlaveBindingSet)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL:
				setMemoryConsistencyModel((MemoryConsistencyModel)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE:
				setPerformance((Performance)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE_SET:
				setPerformanceSet((PerformanceSet)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__PITCH:
				setPitch((Pitch)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION:
				setSharedMemoryCommunication((SharedMemoryCommunication)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION:
				setSharedRegisterCommunication((SharedRegisterCommunication)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__SLAVE_COMPONENT:
				setSlaveComponent((SlaveComponent)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__SUB_SPACE:
				setSubSpace((SubSpace)newValue);
				return;
			case ShimPackage.DOCUMENT_ROOT__SYSTEM_CONFIGURATION:
				setSystemConfiguration((SystemConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShimPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ShimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ShimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION:
				setAbstractCommunication((AbstractCommunication)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE:
				setAbstractPerformance((AbstractPerformance)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__ACCESSOR:
				setAccessor((Accessor)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE:
				setAccessType((AccessType)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE_SET:
				setAccessTypeSet((AccessTypeSet)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE:
				setAddressSpace((AddressSpace)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE_SET:
				setAddressSpaceSet((AddressSpaceSet)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__CACHE:
				setCache((Cache)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__CLOCK_FREQUENCY:
				setClockFrequency((ClockFrequency)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET:
				setCommonInstructionSet((CommonInstructionSet)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__COMMUNICATION_SET:
				setCommunicationSet((CommunicationSet)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__COMPONENT_SET:
				setComponentSet((ComponentSet)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__CONNECTION:
				setConnection((Connection)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__CONNECTION_SET:
				setConnectionSet((ConnectionSet)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__EVENT_COMMUNICATION:
				setEventCommunication((EventCommunication)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__FIFO_COMMUNICATION:
				setFIFOCommunication((FIFOCommunication)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__INSTRUCTION:
				setInstruction((Instruction)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION:
				setInterruptCommunication((InterruptCommunication)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__LATENCY:
				setLatency((Latency)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__MASTER_COMPONENT:
				setMasterComponent((MasterComponent)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING:
				setMasterSlaveBinding((MasterSlaveBinding)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET:
				setMasterSlaveBindingSet((MasterSlaveBindingSet)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL:
				setMemoryConsistencyModel((MemoryConsistencyModel)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE:
				setPerformance((Performance)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE_SET:
				setPerformanceSet((PerformanceSet)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__PITCH:
				setPitch((Pitch)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION:
				setSharedMemoryCommunication((SharedMemoryCommunication)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION:
				setSharedRegisterCommunication((SharedRegisterCommunication)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__SLAVE_COMPONENT:
				setSlaveComponent((SlaveComponent)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__SUB_SPACE:
				setSubSpace((SubSpace)null);
				return;
			case ShimPackage.DOCUMENT_ROOT__SYSTEM_CONFIGURATION:
				setSystemConfiguration((SystemConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShimPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ShimPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ShimPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION:
				return getAbstractCommunication() != null;
			case ShimPackage.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE:
				return getAbstractPerformance() != null;
			case ShimPackage.DOCUMENT_ROOT__ACCESSOR:
				return getAccessor() != null;
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE:
				return getAccessType() != null;
			case ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE_SET:
				return getAccessTypeSet() != null;
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE:
				return getAddressSpace() != null;
			case ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE_SET:
				return getAddressSpaceSet() != null;
			case ShimPackage.DOCUMENT_ROOT__CACHE:
				return getCache() != null;
			case ShimPackage.DOCUMENT_ROOT__CLOCK_FREQUENCY:
				return getClockFrequency() != null;
			case ShimPackage.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET:
				return getCommonInstructionSet() != null;
			case ShimPackage.DOCUMENT_ROOT__COMMUNICATION_SET:
				return getCommunicationSet() != null;
			case ShimPackage.DOCUMENT_ROOT__COMPONENT_SET:
				return getComponentSet() != null;
			case ShimPackage.DOCUMENT_ROOT__CONNECTION:
				return getConnection() != null;
			case ShimPackage.DOCUMENT_ROOT__CONNECTION_SET:
				return getConnectionSet() != null;
			case ShimPackage.DOCUMENT_ROOT__EVENT_COMMUNICATION:
				return getEventCommunication() != null;
			case ShimPackage.DOCUMENT_ROOT__FIFO_COMMUNICATION:
				return getFIFOCommunication() != null;
			case ShimPackage.DOCUMENT_ROOT__INSTRUCTION:
				return getInstruction() != null;
			case ShimPackage.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION:
				return getInterruptCommunication() != null;
			case ShimPackage.DOCUMENT_ROOT__LATENCY:
				return getLatency() != null;
			case ShimPackage.DOCUMENT_ROOT__MASTER_COMPONENT:
				return getMasterComponent() != null;
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING:
				return getMasterSlaveBinding() != null;
			case ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET:
				return getMasterSlaveBindingSet() != null;
			case ShimPackage.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL:
				return getMemoryConsistencyModel() != null;
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE:
				return getPerformance() != null;
			case ShimPackage.DOCUMENT_ROOT__PERFORMANCE_SET:
				return getPerformanceSet() != null;
			case ShimPackage.DOCUMENT_ROOT__PITCH:
				return getPitch() != null;
			case ShimPackage.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION:
				return getSharedMemoryCommunication() != null;
			case ShimPackage.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION:
				return getSharedRegisterCommunication() != null;
			case ShimPackage.DOCUMENT_ROOT__SLAVE_COMPONENT:
				return getSlaveComponent() != null;
			case ShimPackage.DOCUMENT_ROOT__SUB_SPACE:
				return getSubSpace() != null;
			case ShimPackage.DOCUMENT_ROOT__SYSTEM_CONFIGURATION:
				return getSystemConfiguration() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
