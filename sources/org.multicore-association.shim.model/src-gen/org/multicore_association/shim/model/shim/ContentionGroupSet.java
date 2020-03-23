/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contention Group Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.ContentionGroupSet#getContentionGroup <em>Contention Group</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getContentionGroupSet()
 * @model extendedMetaData="name='ContentionGroupSet' kind='elementOnly'"
 * @generated
 */
public interface ContentionGroupSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Contention Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.ContentionGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contention Group</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getContentionGroupSet_ContentionGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ContentionGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContentionGroup> getContentionGroup();

} // ContentionGroupSet
