/**
 */
package org.multicore_association.shim.model.shim;

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
 *   <li>{@link org.multicore_association.shim.model.shim.Connection#getFrom <em>From</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Connection#getTo <em>To</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Connection#getPerformance <em>Performance</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getConnection()
 * @model extendedMetaData="name='Connection' kind='elementOnly'"
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the instance of MasterComponent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(MasterComponent)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getConnection_From()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='from'"
	 * @generated
	 */
	MasterComponent getFrom();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Connection#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(MasterComponent value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the instance of MasterComponent
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(MasterComponent)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getConnection_To()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='to'"
	 * @generated
	 */
	MasterComponent getTo();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Connection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(MasterComponent value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.Performance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getConnection_Performance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Performance'"
	 * @generated
	 */
	EList<Performance> getPerformance();

} // Connection
