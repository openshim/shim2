/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Slave Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterSlaveBinding#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterSlaveBinding#getSlaveComponentRef <em>Slave Component Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterSlaveBinding()
 * @model extendedMetaData="name='MasterSlaveBinding' kind='elementOnly'"
 * @generated
 */
public interface MasterSlaveBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Accessor</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.Accessor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessor</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterSlaveBinding_Accessor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Accessor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Accessor> getAccessor();

	/**
	 * Returns the value of the '<em><b>Slave Component Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave Component Ref</em>' reference.
	 * @see #setSlaveComponentRef(SlaveComponent)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterSlaveBinding_SlaveComponentRef()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='slaveComponentRef' namespace='##targetNamespace'"
	 * @generated
	 */
	SlaveComponent getSlaveComponentRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.MasterSlaveBinding#getSlaveComponentRef <em>Slave Component Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave Component Ref</em>' reference.
	 * @see #getSlaveComponentRef()
	 * @generated
	 */
	void setSlaveComponentRef(SlaveComponent value);

} // MasterSlaveBinding
