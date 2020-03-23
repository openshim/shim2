/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.AccessType#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AccessType#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AccessType#getRwType <em>Rw Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AccessType#getAccessByteSize <em>Access Byte Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AccessType#getAlignmentByteSize <em>Alignment Byte Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AccessType#getNBurst <em>NBurst</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getAccessType()
 * @model extendedMetaData="name='AccessType' kind='empty'"
 * @generated
 */
public interface AccessType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAccessType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getName <em>Name</em>}' attribute.
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
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAccessType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Rw Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.RWType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rw Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @see #isSetRwType()
	 * @see #unsetRwType()
	 * @see #setRwType(RWType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAccessType_RwType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rwType' namespace='##targetNamespace'"
	 * @generated
	 */
	RWType getRwType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getRwType <em>Rw Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rw Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.RWType
	 * @see #isSetRwType()
	 * @see #unsetRwType()
	 * @see #getRwType()
	 * @generated
	 */
	void setRwType(RWType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getRwType <em>Rw Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRwType()
	 * @see #getRwType()
	 * @see #setRwType(RWType)
	 * @generated
	 */
	void unsetRwType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getRwType <em>Rw Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rw Type</em>' attribute is set.
	 * @see #unsetRwType()
	 * @see #getRwType()
	 * @see #setRwType(RWType)
	 * @generated
	 */
	boolean isSetRwType();

	/**
	 * Returns the value of the '<em><b>Access Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Byte Size</em>' attribute.
	 * @see #isSetAccessByteSize()
	 * @see #unsetAccessByteSize()
	 * @see #setAccessByteSize(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAccessType_AccessByteSize()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='accessByteSize' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getAccessByteSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getAccessByteSize <em>Access Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Byte Size</em>' attribute.
	 * @see #isSetAccessByteSize()
	 * @see #unsetAccessByteSize()
	 * @see #getAccessByteSize()
	 * @generated
	 */
	void setAccessByteSize(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getAccessByteSize <em>Access Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccessByteSize()
	 * @see #getAccessByteSize()
	 * @see #setAccessByteSize(Integer)
	 * @generated
	 */
	void unsetAccessByteSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getAccessByteSize <em>Access Byte Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Access Byte Size</em>' attribute is set.
	 * @see #unsetAccessByteSize()
	 * @see #getAccessByteSize()
	 * @see #setAccessByteSize(Integer)
	 * @generated
	 */
	boolean isSetAccessByteSize();

	/**
	 * Returns the value of the '<em><b>Alignment Byte Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment Byte Size</em>' attribute.
	 * @see #isSetAlignmentByteSize()
	 * @see #unsetAlignmentByteSize()
	 * @see #setAlignmentByteSize(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAccessType_AlignmentByteSize()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='alignmentByteSize' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getAlignmentByteSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getAlignmentByteSize <em>Alignment Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment Byte Size</em>' attribute.
	 * @see #isSetAlignmentByteSize()
	 * @see #unsetAlignmentByteSize()
	 * @see #getAlignmentByteSize()
	 * @generated
	 */
	void setAlignmentByteSize(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getAlignmentByteSize <em>Alignment Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlignmentByteSize()
	 * @see #getAlignmentByteSize()
	 * @see #setAlignmentByteSize(Integer)
	 * @generated
	 */
	void unsetAlignmentByteSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getAlignmentByteSize <em>Alignment Byte Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alignment Byte Size</em>' attribute is set.
	 * @see #unsetAlignmentByteSize()
	 * @see #getAlignmentByteSize()
	 * @see #setAlignmentByteSize(Integer)
	 * @generated
	 */
	boolean isSetAlignmentByteSize();

	/**
	 * Returns the value of the '<em><b>NBurst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NBurst</em>' attribute.
	 * @see #isSetNBurst()
	 * @see #unsetNBurst()
	 * @see #setNBurst(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAccessType_NBurst()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='nBurst' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getNBurst();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getNBurst <em>NBurst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NBurst</em>' attribute.
	 * @see #isSetNBurst()
	 * @see #unsetNBurst()
	 * @see #getNBurst()
	 * @generated
	 */
	void setNBurst(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getNBurst <em>NBurst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNBurst()
	 * @see #getNBurst()
	 * @see #setNBurst(Integer)
	 * @generated
	 */
	void unsetNBurst();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AccessType#getNBurst <em>NBurst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NBurst</em>' attribute is set.
	 * @see #unsetNBurst()
	 * @see #getNBurst()
	 * @see #setNBurst(Integer)
	 * @generated
	 */
	boolean isSetNBurst();

} // AccessType
