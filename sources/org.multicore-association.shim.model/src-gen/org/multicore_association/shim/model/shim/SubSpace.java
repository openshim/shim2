/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.SubSpace#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SubSpace#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SubSpace#getStart <em>Start</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SubSpace#getEnd <em>End</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SubSpace#getEndian <em>Endian</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SubSpace#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SubSpace#getMemoryConsistencyModel <em>Memory Consistency Model</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getSubSpace()
 * @model extendedMetaData="name='SubSpace' kind='elementOnly'"
 * @generated
 */
public interface SubSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSubSpace_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SubSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSubSpace_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SubSpace#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(long)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSubSpace_Start()
	 * @model default="0" dataType="org.multicore_association.shim.model.shim.AddressValueType" required="true"
	 *        extendedMetaData="kind='attribute' name='start'"
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SubSpace#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(long value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * The default value is <code>"4294967295"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(long)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSubSpace_End()
	 * @model default="4294967295" dataType="org.multicore_association.shim.model.shim.AddressValueType" required="true"
	 *        extendedMetaData="kind='attribute' name='end'"
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SubSpace#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(long value);

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
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSubSpace_Endian()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='endian'"
	 * @generated
	 */
	EndianType getEndian();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SubSpace#getEndian <em>Endian</em>}' attribute.
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
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.SubSpace#getEndian <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndian()
	 * @see #getEndian()
	 * @see #setEndian(EndianType)
	 * @generated
	 */
	void unsetEndian();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.SubSpace#getEndian <em>Endian</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Master Slave Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Slave Binding Set</em>' containment reference.
	 * @see #setMasterSlaveBindingSet(MasterSlaveBindingSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSubSpace_MasterSlaveBindingSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MasterSlaveBindingSet'"
	 * @generated
	 */
	MasterSlaveBindingSet getMasterSlaveBindingSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SubSpace#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Slave Binding Set</em>' containment reference.
	 * @see #getMasterSlaveBindingSet()
	 * @generated
	 */
	void setMasterSlaveBindingSet(MasterSlaveBindingSet value);

	/**
	 * Returns the value of the '<em><b>Memory Consistency Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.MemoryConsistencyModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Consistency Model</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSubSpace_MemoryConsistencyModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MemoryConsistencyModel'"
	 * @generated
	 */
	EList<MemoryConsistencyModel> getMemoryConsistencyModel();

} // SubSpace
