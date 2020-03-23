/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Master Slave Binding Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.MasterSlaveBindingSet#getMasterSlaveBinding <em>Master Slave Binding</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterSlaveBindingSet()
 * @model extendedMetaData="name='MasterSlaveBindingSet' kind='elementOnly'"
 * @generated
 */
public interface MasterSlaveBindingSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Master Slave Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.MasterSlaveBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Slave Binding</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getMasterSlaveBindingSet_MasterSlaveBinding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MasterSlaveBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterSlaveBinding> getMasterSlaveBinding();

} // MasterSlaveBindingSet
