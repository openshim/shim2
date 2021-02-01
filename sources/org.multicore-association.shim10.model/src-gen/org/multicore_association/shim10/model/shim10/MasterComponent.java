/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getCommonInstructionSet <em>Common Instruction Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getCache <em>Cache</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getClockFrequency <em>Clock Frequency</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getAccessTypeSet <em>Access Type Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getArch <em>Arch</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getArchOption <em>Arch Option</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getEndian <em>Endian</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getMasterType <em>Master Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getNThread <em>NThread</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.MasterComponent#getPid <em>Pid</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent()
 * @model extendedMetaData="name='MasterComponent' kind='elementOnly'"
 * @generated
 */
public interface MasterComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Common Instruction Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Instruction Set</em>' containment reference.
	 * @see #setCommonInstructionSet(CommonInstructionSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_CommonInstructionSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommonInstructionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CommonInstructionSet getCommonInstructionSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getCommonInstructionSet <em>Common Instruction Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Instruction Set</em>' containment reference.
	 * @see #getCommonInstructionSet()
	 * @generated
	 */
	void setCommonInstructionSet(CommonInstructionSet value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.Cache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_Cache()
	 * @model extendedMetaData="kind='element' name='Cache'"
	 * @generated
	 */
	EList<Cache> getCache();

	/**
	 * Returns the value of the '<em><b>Clock Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Frequency</em>' containment reference.
	 * @see #setClockFrequency(ClockFrequency)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_ClockFrequency()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClockFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockFrequency getClockFrequency();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getClockFrequency <em>Clock Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Frequency</em>' containment reference.
	 * @see #getClockFrequency()
	 * @generated
	 */
	void setClockFrequency(ClockFrequency value);

	/**
	 * Returns the value of the '<em><b>Access Type Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type Set</em>' containment reference.
	 * @see #setAccessTypeSet(AccessTypeSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_AccessTypeSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessTypeSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AccessTypeSet getAccessTypeSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getAccessTypeSet <em>Access Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type Set</em>' containment reference.
	 * @see #getAccessTypeSet()
	 * @generated
	 */
	void setAccessTypeSet(AccessTypeSet value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='arch' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArch();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getArch <em>Arch</em>}' attribute.
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
	 * @see #setArchOption(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_ArchOption()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='archOption' namespace='##targetNamespace'"
	 * @generated
	 */
	String getArchOption();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getArchOption <em>Arch Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch Option</em>' attribute.
	 * @see #getArchOption()
	 * @generated
	 */
	void setArchOption(String value);

	/**
	 * Returns the value of the '<em><b>Endian</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.EndianType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endian</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.EndianType
	 * @see #isSetEndian()
	 * @see #unsetEndian()
	 * @see #setEndian(EndianType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_Endian()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='endian' namespace='##targetNamespace'"
	 * @generated
	 */
	EndianType getEndian();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getEndian <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endian</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.EndianType
	 * @see #isSetEndian()
	 * @see #unsetEndian()
	 * @see #getEndian()
	 * @generated
	 */
	void setEndian(EndianType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getEndian <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndian()
	 * @see #getEndian()
	 * @see #setEndian(EndianType)
	 * @generated
	 */
	void unsetEndian();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getEndian <em>Endian</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Master Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.MasterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Type</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.MasterType
	 * @see #isSetMasterType()
	 * @see #unsetMasterType()
	 * @see #setMasterType(MasterType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_MasterType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='masterType' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterType getMasterType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getMasterType <em>Master Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Type</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.MasterType
	 * @see #isSetMasterType()
	 * @see #unsetMasterType()
	 * @see #getMasterType()
	 * @generated
	 */
	void setMasterType(MasterType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getMasterType <em>Master Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMasterType()
	 * @see #getMasterType()
	 * @see #setMasterType(MasterType)
	 * @generated
	 */
	void unsetMasterType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getMasterType <em>Master Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Master Type</em>' attribute is set.
	 * @see #unsetMasterType()
	 * @see #getMasterType()
	 * @see #setMasterType(MasterType)
	 * @generated
	 */
	boolean isSetMasterType();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>NThread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NThread</em>' attribute.
	 * @see #isSetNThread()
	 * @see #unsetNThread()
	 * @see #setNThread(int)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_NThread()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='nThread' namespace='##targetNamespace'"
	 * @generated
	 */
	int getNThread();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getNThread <em>NThread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NThread</em>' attribute.
	 * @see #isSetNThread()
	 * @see #unsetNThread()
	 * @see #getNThread()
	 * @generated
	 */
	void setNThread(int value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getNThread <em>NThread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNThread()
	 * @see #getNThread()
	 * @see #setNThread(int)
	 * @generated
	 */
	void unsetNThread();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getNThread <em>NThread</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NThread</em>' attribute is set.
	 * @see #unsetNThread()
	 * @see #getNThread()
	 * @see #setNThread(int)
	 * @generated
	 */
	boolean isSetNThread();

	/**
	 * Returns the value of the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pid</em>' attribute.
	 * @see #setPid(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getMasterComponent_Pid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='pid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPid();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.MasterComponent#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid</em>' attribute.
	 * @see #getPid()
	 * @generated
	 */
	void setPid(String value);

} // MasterComponent
