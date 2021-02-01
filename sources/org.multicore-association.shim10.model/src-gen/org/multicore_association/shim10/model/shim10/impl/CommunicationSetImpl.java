/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.multicore_association.shim10.model.shim10.CommunicationSet;
import org.multicore_association.shim10.model.shim10.EventCommunication;
import org.multicore_association.shim10.model.shim10.FIFOCommunication;
import org.multicore_association.shim10.model.shim10.InterruptCommunication;
import org.multicore_association.shim10.model.shim10.SharedMemoryCommunication;
import org.multicore_association.shim10.model.shim10.SharedRegisterCommunication;
import org.multicore_association.shim10.model.shim10.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CommunicationSetImpl#getSharedRegisterCommunication <em>Shared Register Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CommunicationSetImpl#getSharedMemoryCommunication <em>Shared Memory Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CommunicationSetImpl#getEventCommunication <em>Event Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CommunicationSetImpl#getFIFOCommunication <em>FIFO Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.CommunicationSetImpl#getInterruptCommunication <em>Interrupt Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationSetImpl extends MinimalEObjectImpl.Container implements CommunicationSet {
	/**
	 * The cached value of the '{@link #getSharedRegisterCommunication() <em>Shared Register Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedRegisterCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedRegisterCommunication> sharedRegisterCommunication;

	/**
	 * The cached value of the '{@link #getSharedMemoryCommunication() <em>Shared Memory Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedMemoryCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedMemoryCommunication> sharedMemoryCommunication;

	/**
	 * The cached value of the '{@link #getEventCommunication() <em>Event Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<EventCommunication> eventCommunication;

	/**
	 * The cached value of the '{@link #getFIFOCommunication() <em>FIFO Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFIFOCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<FIFOCommunication> fIFOCommunication;

	/**
	 * The cached value of the '{@link #getInterruptCommunication() <em>Interrupt Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<InterruptCommunication> interruptCommunication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.COMMUNICATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedRegisterCommunication> getSharedRegisterCommunication() {
		if (sharedRegisterCommunication == null) {
			sharedRegisterCommunication = new EObjectContainmentEList<SharedRegisterCommunication>(SharedRegisterCommunication.class, this, ShimPackage.COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION);
		}
		return sharedRegisterCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedMemoryCommunication> getSharedMemoryCommunication() {
		if (sharedMemoryCommunication == null) {
			sharedMemoryCommunication = new EObjectContainmentEList<SharedMemoryCommunication>(SharedMemoryCommunication.class, this, ShimPackage.COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION);
		}
		return sharedMemoryCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventCommunication> getEventCommunication() {
		if (eventCommunication == null) {
			eventCommunication = new EObjectContainmentEList<EventCommunication>(EventCommunication.class, this, ShimPackage.COMMUNICATION_SET__EVENT_COMMUNICATION);
		}
		return eventCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FIFOCommunication> getFIFOCommunication() {
		if (fIFOCommunication == null) {
			fIFOCommunication = new EObjectContainmentEList<FIFOCommunication>(FIFOCommunication.class, this, ShimPackage.COMMUNICATION_SET__FIFO_COMMUNICATION);
		}
		return fIFOCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterruptCommunication> getInterruptCommunication() {
		if (interruptCommunication == null) {
			interruptCommunication = new EObjectContainmentEList<InterruptCommunication>(InterruptCommunication.class, this, ShimPackage.COMMUNICATION_SET__INTERRUPT_COMMUNICATION);
		}
		return interruptCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShimPackage.COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION:
				return ((InternalEList<?>)getSharedRegisterCommunication()).basicRemove(otherEnd, msgs);
			case ShimPackage.COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION:
				return ((InternalEList<?>)getSharedMemoryCommunication()).basicRemove(otherEnd, msgs);
			case ShimPackage.COMMUNICATION_SET__EVENT_COMMUNICATION:
				return ((InternalEList<?>)getEventCommunication()).basicRemove(otherEnd, msgs);
			case ShimPackage.COMMUNICATION_SET__FIFO_COMMUNICATION:
				return ((InternalEList<?>)getFIFOCommunication()).basicRemove(otherEnd, msgs);
			case ShimPackage.COMMUNICATION_SET__INTERRUPT_COMMUNICATION:
				return ((InternalEList<?>)getInterruptCommunication()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShimPackage.COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION:
				return getSharedRegisterCommunication();
			case ShimPackage.COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION:
				return getSharedMemoryCommunication();
			case ShimPackage.COMMUNICATION_SET__EVENT_COMMUNICATION:
				return getEventCommunication();
			case ShimPackage.COMMUNICATION_SET__FIFO_COMMUNICATION:
				return getFIFOCommunication();
			case ShimPackage.COMMUNICATION_SET__INTERRUPT_COMMUNICATION:
				return getInterruptCommunication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShimPackage.COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION:
				getSharedRegisterCommunication().clear();
				getSharedRegisterCommunication().addAll((Collection<? extends SharedRegisterCommunication>)newValue);
				return;
			case ShimPackage.COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION:
				getSharedMemoryCommunication().clear();
				getSharedMemoryCommunication().addAll((Collection<? extends SharedMemoryCommunication>)newValue);
				return;
			case ShimPackage.COMMUNICATION_SET__EVENT_COMMUNICATION:
				getEventCommunication().clear();
				getEventCommunication().addAll((Collection<? extends EventCommunication>)newValue);
				return;
			case ShimPackage.COMMUNICATION_SET__FIFO_COMMUNICATION:
				getFIFOCommunication().clear();
				getFIFOCommunication().addAll((Collection<? extends FIFOCommunication>)newValue);
				return;
			case ShimPackage.COMMUNICATION_SET__INTERRUPT_COMMUNICATION:
				getInterruptCommunication().clear();
				getInterruptCommunication().addAll((Collection<? extends InterruptCommunication>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShimPackage.COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION:
				getSharedRegisterCommunication().clear();
				return;
			case ShimPackage.COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION:
				getSharedMemoryCommunication().clear();
				return;
			case ShimPackage.COMMUNICATION_SET__EVENT_COMMUNICATION:
				getEventCommunication().clear();
				return;
			case ShimPackage.COMMUNICATION_SET__FIFO_COMMUNICATION:
				getFIFOCommunication().clear();
				return;
			case ShimPackage.COMMUNICATION_SET__INTERRUPT_COMMUNICATION:
				getInterruptCommunication().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShimPackage.COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION:
				return sharedRegisterCommunication != null && !sharedRegisterCommunication.isEmpty();
			case ShimPackage.COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION:
				return sharedMemoryCommunication != null && !sharedMemoryCommunication.isEmpty();
			case ShimPackage.COMMUNICATION_SET__EVENT_COMMUNICATION:
				return eventCommunication != null && !eventCommunication.isEmpty();
			case ShimPackage.COMMUNICATION_SET__FIFO_COMMUNICATION:
				return fIFOCommunication != null && !fIFOCommunication.isEmpty();
			case ShimPackage.COMMUNICATION_SET__INTERRUPT_COMMUNICATION:
				return interruptCommunication != null && !interruptCommunication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationSetImpl
