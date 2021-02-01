/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.PerformanceSet#getPerformance <em>Performance</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getPerformanceSet()
 * @model extendedMetaData="name='PerformanceSet' kind='elementOnly'"
 * @generated
 */
public interface PerformanceSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.Performance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getPerformanceSet_Performance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Performance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Performance> getPerformance();

} // PerformanceSet
