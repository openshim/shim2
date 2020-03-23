/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Space Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.AddressSpaceSet#getAddressSpace <em>Address Space</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getAddressSpaceSet()
 * @model extendedMetaData="name='AddressSpaceSet' kind='elementOnly'"
 * @generated
 */
public interface AddressSpaceSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Address Space</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.AddressSpace}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAddressSpaceSet_AddressSpace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AddressSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AddressSpace> getAddressSpace();

} // AddressSpaceSet
