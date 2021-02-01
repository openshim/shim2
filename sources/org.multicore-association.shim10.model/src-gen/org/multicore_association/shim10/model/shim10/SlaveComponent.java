/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slave Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Memory
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getRwType <em>Rw Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSizeUnit <em>Size Unit</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSlaveComponent()
 * @model extendedMetaData="name='SlaveComponent' kind='empty'"
 * @generated
 */
public interface SlaveComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSlaveComponent_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getId <em>Id</em>}' attribute.
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
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSlaveComponent_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rw Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.RWType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rw Type</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.RWType
	 * @see #isSetRwType()
	 * @see #unsetRwType()
	 * @see #setRwType(RWType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSlaveComponent_RwType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='rwType' namespace='##targetNamespace'"
	 * @generated
	 */
	RWType getRwType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getRwType <em>Rw Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rw Type</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.RWType
	 * @see #isSetRwType()
	 * @see #unsetRwType()
	 * @see #getRwType()
	 * @generated
	 */
	void setRwType(RWType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getRwType <em>Rw Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRwType()
	 * @see #getRwType()
	 * @see #setRwType(RWType)
	 * @generated
	 */
	void unsetRwType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getRwType <em>Rw Type</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #setSize(int)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSlaveComponent_Size()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #isSetSize()
	 * @see #unsetSize()
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSize()
	 * @see #getSize()
	 * @see #setSize(int)
	 * @generated
	 */
	void unsetSize();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSize <em>Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size</em>' attribute is set.
	 * @see #unsetSize()
	 * @see #getSize()
	 * @see #setSize(int)
	 * @generated
	 */
	boolean isSetSize();

	/**
	 * Returns the value of the '<em><b>Size Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim10.model.shim10.SizeUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Unit</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @see #isSetSizeUnit()
	 * @see #unsetSizeUnit()
	 * @see #setSizeUnit(SizeUnitType)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSlaveComponent_SizeUnit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='sizeUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	SizeUnitType getSizeUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSizeUnit <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Unit</em>' attribute.
	 * @see org.multicore_association.shim10.model.shim10.SizeUnitType
	 * @see #isSetSizeUnit()
	 * @see #unsetSizeUnit()
	 * @see #getSizeUnit()
	 * @generated
	 */
	void setSizeUnit(SizeUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSizeUnit <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSizeUnit()
	 * @see #getSizeUnit()
	 * @see #setSizeUnit(SizeUnitType)
	 * @generated
	 */
	void unsetSizeUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.SlaveComponent#getSizeUnit <em>Size Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Size Unit</em>' attribute is set.
	 * @see #unsetSizeUnit()
	 * @see #getSizeUnit()
	 * @see #setSizeUnit(SizeUnitType)
	 * @generated
	 */
	boolean isSetSizeUnit();

} // SlaveComponent
