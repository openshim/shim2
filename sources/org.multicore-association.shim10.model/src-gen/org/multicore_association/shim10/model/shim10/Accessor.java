/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Accessor#getPerformanceSet <em>Performance Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Accessor#getMasterComponentRef <em>Master Component Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getAccessor()
 * @model extendedMetaData="name='Accessor' kind='elementOnly'"
 * @generated
 */
public interface Accessor extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.PerformanceSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Set</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getAccessor_PerformanceSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PerformanceSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PerformanceSet> getPerformanceSet();

	/**
	 * Returns the value of the '<em><b>Master Component Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Component Ref</em>' reference.
	 * @see #setMasterComponentRef(MasterComponent)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getAccessor_MasterComponentRef()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='masterComponentRef'"
	 * @generated
	 */
	MasterComponent getMasterComponentRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Accessor#getMasterComponentRef <em>Master Component Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Component Ref</em>' reference.
	 * @see #getMasterComponentRef()
	 * @generated
	 */
	void setMasterComponentRef(MasterComponent value);

} // Accessor
