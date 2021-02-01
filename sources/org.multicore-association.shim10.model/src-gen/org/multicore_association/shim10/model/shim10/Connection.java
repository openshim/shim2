/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Connection#getPerformance <em>Performance</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Connection#getTo <em>To</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Connection#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getConnection()
 * @model extendedMetaData="name='Connection' kind='elementOnly'"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.Performance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getConnection_Performance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Performance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Performance> getPerformance();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the instance of MasterComponent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(MasterComponent)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getConnection_To()
	 * @model extendedMetaData="kind='attribute' name='to'"
	 * @generated
	 */
	MasterComponent getTo();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Connection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(MasterComponent value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the instance of MasterComponent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(MasterComponent)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getConnection_From()
	 * @model extendedMetaData="kind='attribute' name='from'"
	 * @generated
	 */
	MasterComponent getFrom();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Connection#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(MasterComponent value);

} // Connection
