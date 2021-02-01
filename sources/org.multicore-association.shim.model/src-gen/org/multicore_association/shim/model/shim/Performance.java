/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.Performance#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Performance#getLatency <em>Latency</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Performance#getAccessTypeRef <em>Access Type Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getPerformance()
 * @model extendedMetaData="name='Performance' kind='elementOnly'"
 * @generated
 */
public interface Performance extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Type Ref</em>' reference.
	 * @see #setAccessTypeRef(AccessType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPerformance_AccessTypeRef()
	 * @model extendedMetaData="kind='attribute' name='accessTypeRef'"
	 * @generated
	 */
	AccessType getAccessTypeRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Performance#getAccessTypeRef <em>Access Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Type Ref</em>' reference.
	 * @see #getAccessTypeRef()
	 * @generated
	 */
	void setAccessTypeRef(AccessType value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' containment reference.
	 * @see #setPitch(Pitch)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPerformance_Pitch()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pitch'"
	 * @generated
	 */
	Pitch getPitch();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Performance#getPitch <em>Pitch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' containment reference.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(Pitch value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' containment reference.
	 * @see #setLatency(Latency)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPerformance_Latency()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Latency'"
	 * @generated
	 */
	Latency getLatency();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Performance#getLatency <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' containment reference.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(Latency value);

} // Performance
