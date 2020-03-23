/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getCacheRef <em>Cache Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getAccessTypeSet <em>Access Type Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getClockFrequency <em>Clock Frequency</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getArch <em>Arch</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getArchOption <em>Arch Option</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getEndian <em>Endian</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getMasterType <em>Master Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getNChannel <em>NChannel</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getNThread <em>NThread</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getPid <em>Pid</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterComponent#getCommonInstructionSet <em>Common Instruction Set</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent()
 * @model extendedMetaData="name='MasterComponent' kind='elementOnly'"
 * @generated
 */
public interface MasterComponent extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Cache Ref</b></em>' reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.Cache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache Ref</em>' reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_CacheRef()
	 * @model extendedMetaData="kind='element' name='CacheRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Cache> getCacheRef();

	/**
	 * Returns the value of the '<em><b>Access Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type Set</em>' containment reference.
	 * @see #setAccessTypeSet(AccessTypeSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_AccessTypeSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessTypeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessTypeSet getAccessTypeSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getAccessTypeSet <em>Access Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type Set</em>' containment reference.
	 * @see #getAccessTypeSet()
	 * @generated
	 */
	void setAccessTypeSet(AccessTypeSet value);

	/**
	 * Returns the value of the '<em><b>Clock Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Frequency</em>' containment reference.
	 * @see #setClockFrequency(ClockFrequency)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_ClockFrequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClockFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockFrequency getClockFrequency();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getClockFrequency <em>Clock Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Frequency</em>' containment reference.
	 * @see #getClockFrequency()
	 * @generated
	 */
	void setClockFrequency(ClockFrequency value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='arch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArch();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(String value);

	/**
	 * Returns the value of the '<em><b>Arch Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch Option</em>' attribute.
	 * @see #isSetArchOption()
	 * @see #unsetArchOption()
	 * @see #setArchOption(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_ArchOption()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='archOption' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArchOption();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getArchOption <em>Arch Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch Option</em>' attribute.
	 * @see #isSetArchOption()
	 * @see #unsetArchOption()
	 * @see #getArchOption()
	 * @generated
	 */
	void setArchOption(String value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getArchOption <em>Arch Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArchOption()
	 * @see #getArchOption()
	 * @see #setArchOption(String)
	 * @generated
	 */
	void unsetArchOption();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getArchOption <em>Arch Option</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arch Option</em>' attribute is set.
	 * @see #unsetArchOption()
	 * @see #getArchOption()
	 * @see #setArchOption(String)
	 * @generated
	 */
	boolean isSetArchOption();

	/**
	 * Returns the value of the '<em><b>Endian</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.EndianType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endian</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.EndianType
	 * @see #isSetEndian()
	 * @see #unsetEndian()
	 * @see #setEndian(EndianType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_Endian()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='endian' namespace='##targetNamespace'"
	 * @generated
	 */
	EndianType getEndian();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getEndian <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endian</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.EndianType
	 * @see #isSetEndian()
	 * @see #unsetEndian()
	 * @see #getEndian()
	 * @generated
	 */
	void setEndian(EndianType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getEndian <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndian()
	 * @see #getEndian()
	 * @see #setEndian(EndianType)
	 * @generated
	 */
	void unsetEndian();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getEndian <em>Endian</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Endian</em>' attribute is set.
	 * @see #unsetEndian()
	 * @see #getEndian()
	 * @see #setEndian(EndianType)
	 * @generated
	 */
	boolean isSetEndian();

	/**
	 * Returns the value of the '<em><b>Master Type</b></em>' attribute.
	 * The default value is <code>"PU"</code>.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.MasterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.MasterType
	 * @see #setMasterType(MasterType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_MasterType()
	 * @model default="PU" required="true"
	 *        extendedMetaData="kind='attribute' name='masterType' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterType getMasterType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getMasterType <em>Master Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.MasterType
	 * @see #getMasterType()
	 * @generated
	 */
	void setMasterType(MasterType value);

	/**
	 * Returns the value of the '<em><b>NChannel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NChannel</em>' attribute.
	 * @see #isSetNChannel()
	 * @see #unsetNChannel()
	 * @see #setNChannel(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_NChannel()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='nChannel' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getNChannel();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getNChannel <em>NChannel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NChannel</em>' attribute.
	 * @see #isSetNChannel()
	 * @see #unsetNChannel()
	 * @see #getNChannel()
	 * @generated
	 */
	void setNChannel(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getNChannel <em>NChannel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNChannel()
	 * @see #getNChannel()
	 * @see #setNChannel(Integer)
	 * @generated
	 */
	void unsetNChannel();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getNChannel <em>NChannel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NChannel</em>' attribute is set.
	 * @see #unsetNChannel()
	 * @see #getNChannel()
	 * @see #setNChannel(Integer)
	 * @generated
	 */
	boolean isSetNChannel();

	/**
	 * Returns the value of the '<em><b>NThread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NThread</em>' attribute.
	 * @see #isSetNThread()
	 * @see #unsetNThread()
	 * @see #setNThread(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_NThread()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='nThread' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getNThread();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getNThread <em>NThread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NThread</em>' attribute.
	 * @see #isSetNThread()
	 * @see #unsetNThread()
	 * @see #getNThread()
	 * @generated
	 */
	void setNThread(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getNThread <em>NThread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNThread()
	 * @see #getNThread()
	 * @see #setNThread(Integer)
	 * @generated
	 */
	void unsetNThread();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getNThread <em>NThread</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NThread</em>' attribute is set.
	 * @see #unsetNThread()
	 * @see #getNThread()
	 * @see #setNThread(Integer)
	 * @generated
	 */
	boolean isSetNThread();

	/**
	 * Returns the value of the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pid</em>' attribute.
	 * @see #isSetPid()
	 * @see #unsetPid()
	 * @see #setPid(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_Pid()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='pid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPid();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid</em>' attribute.
	 * @see #isSetPid()
	 * @see #unsetPid()
	 * @see #getPid()
	 * @generated
	 */
	void setPid(String value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPid()
	 * @see #getPid()
	 * @see #setPid(String)
	 * @generated
	 */
	void unsetPid();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getPid <em>Pid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pid</em>' attribute is set.
	 * @see #unsetPid()
	 * @see #getPid()
	 * @see #setPid(String)
	 * @generated
	 */
	boolean isSetPid();

	/**
	 * Returns the value of the '<em><b>Common Instruction Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Instruction Set</em>' containment reference.
	 * @see #setCommonInstructionSet(CommonInstructionSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterComponent_CommonInstructionSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommonInstructionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CommonInstructionSet getCommonInstructionSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterComponent#getCommonInstructionSet <em>Common Instruction Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Instruction Set</em>' containment reference.
	 * @see #getCommonInstructionSet()
	 * @generated
	 */
	void setCommonInstructionSet(CommonInstructionSet value);

} // MasterComponent
