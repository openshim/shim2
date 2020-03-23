/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Type Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.AccessTypeSet#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getAccessTypeSet()
 * @model extendedMetaData="name='AccessTypeSet' kind='elementOnly'"
 * @generated
 */
public interface AccessTypeSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.AccessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAccessTypeSet_AccessType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AccessType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AccessType> getAccessType();

} // AccessTypeSet
