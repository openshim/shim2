/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Unit Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.FunctionalUnitSet#getFunctionalUnit <em>Functional Unit</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getFunctionalUnitSet()
 * @model extendedMetaData="name='FunctionalUnitSet' kind='elementOnly'"
 * @generated
 */
public interface FunctionalUnitSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Functional Unit</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.FunctionalUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Unit</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFunctionalUnitSet_FunctionalUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FunctionalUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FunctionalUnit> getFunctionalUnit();

} // FunctionalUnitSet
