/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getSharedRegisterCommunication <em>Shared Register Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getSharedMemoryCommunication <em>Shared Memory Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getEventCommunication <em>Event Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getFIFOCommunication <em>FIFO Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.CommunicationSet#getInterruptCommunication <em>Interrupt Communication</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCommunicationSet()
 * @model extendedMetaData="name='CommunicationSet' kind='elementOnly'"
 * @generated
 */
public interface CommunicationSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Shared Register Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.SharedRegisterCommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Register Communication</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCommunicationSet_SharedRegisterCommunication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SharedRegisterCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SharedRegisterCommunication> getSharedRegisterCommunication();

	/**
	 * Returns the value of the '<em><b>Shared Memory Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.SharedMemoryCommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Memory Communication</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCommunicationSet_SharedMemoryCommunication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SharedMemoryCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SharedMemoryCommunication> getSharedMemoryCommunication();

	/**
	 * Returns the value of the '<em><b>Event Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.EventCommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Communication</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCommunicationSet_EventCommunication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EventCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EventCommunication> getEventCommunication();

	/**
	 * Returns the value of the '<em><b>FIFO Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.FIFOCommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FIFO Communication</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCommunicationSet_FIFOCommunication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FIFOCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FIFOCommunication> getFIFOCommunication();

	/**
	 * Returns the value of the '<em><b>Interrupt Communication</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.InterruptCommunication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interrupt Communication</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getCommunicationSet_InterruptCommunication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterruptCommunication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterruptCommunication> getInterruptCommunication();

} // CommunicationSet
