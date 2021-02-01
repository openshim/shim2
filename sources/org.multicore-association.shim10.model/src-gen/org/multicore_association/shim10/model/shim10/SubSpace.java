/**
 */
package org.multicore_association.shim10.model.shim10;

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
 *   <li>{@link org.multicore_association.shim10.model.shim10.SubSpace#getMemoryConsistencyModel <em>Memory Consistency Model</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SubSpace#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SubSpace#getEnd <em>End</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SubSpace#getEndian <em>Endian</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SubSpace#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SubSpace#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SubSpace#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSubSpace()
 * @model extendedMetaData="name='SubSpace' kind='elementOnly'"
 * @generated
 */
public interface SubSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Memory Consistency Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.MemoryConsistencyModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Consistency Model</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSubSpace_MemoryConsistencyModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MemoryConsistencyModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MemoryConsistencyModel> getMemoryConsistencyModel();

	/**
	 * Returns the value of the '<em><b>Master Slave Binding Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Slave Binding Set</em>' containment reference.
	 * @see #setMasterSlaveBindingSet(MasterSlaveBindingSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSubSpace_MasterSlaveBindingSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MasterSlaveBindingSet' namespace='##targetNamespace'"
	 * @generated
	 */
	MasterSlaveBindingSet getMasterSlaveBindingSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Slave Binding Set</em>' containment reference.
	 * @see #getMasterSlaveBindingSet()
	 * @generated
	 */
	void setMasterSlaveBindingSet(MasterSlaveBindingSet value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #isSetEnd()
	 * @see #unsetEnd()
	 * @see #setEnd(long)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSubSpace_End()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='attribute' name='end' namespace='##targetNamespace'"
	 * @generated
	 */
	long getEnd();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #isSetEnd()
	 * @see #unsetEnd()
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(long value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnd()
	 * @see #getEnd()
	 * @see #setEnd(long)
	 * @generated
	 */
	void unsetEnd();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getEnd <em>End</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>End</em>' attribute is set.
	 * @see #unsetEnd()
	 * @see #getEnd()
	 * @see #setEnd(long)
	 * @generated
	 */
	boolean isSetEnd();

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
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSubSpace_Endian()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='endian' namespace='##targetNamespace'"
	 * @generated
	 */
	EndianType getEndian();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getEndian <em>Endian</em>}' attribute.
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
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getEndian <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEndian()
	 * @see #getEndian()
	 * @see #setEndian(EndianType)
	 * @generated
	 */
	void unsetEndian();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getEndian <em>Endian</em>}' attribute is set.
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
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSubSpace_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSubSpace_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #isSetStart()
	 * @see #unsetStart()
	 * @see #setStart(long)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSubSpace_Start()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        extendedMetaData="kind='attribute' name='start' namespace='##targetNamespace'"
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #isSetStart()
	 * @see #unsetStart()
	 * @see #getStart()
	 * @generated
	 */
	void setStart(long value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStart()
	 * @see #getStart()
	 * @see #setStart(long)
	 * @generated
	 */
	void unsetStart();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.SubSpace#getStart <em>Start</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Start</em>' attribute is set.
	 * @see #unsetStart()
	 * @see #getStart()
	 * @see #setStart(long)
	 * @generated
	 */
	boolean isSetStart();

} // SubSpace
