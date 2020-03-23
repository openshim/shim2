/**
 */
package org.multicore_association.shim.model.shim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

import org.multicore_association.shim.model.shim.ContentionGroup;
import org.multicore_association.shim.model.shim.DataRate;
import org.multicore_association.shim.model.shim.PerformanceSet;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.Throughput;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contention Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ContentionGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ContentionGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ContentionGroupImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ContentionGroupImpl#getDataRate <em>Data Rate</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ContentionGroupImpl#getPerformanceSetRef <em>Performance Set Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentionGroupImpl extends MinimalEObjectImpl.Container implements ContentionGroup {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected Throughput throughput;

	/**
	 * The cached value of the '{@link #getDataRate() <em>Data Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRate()
	 * @generated
	 * @ordered
	 */
	protected DataRate dataRate;

	/**
	 * The cached value of the '{@link #getPerformanceSetRef() <em>Performance Set Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceSetRef()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceSet> performanceSetRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.CONTENTION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CONTENTION_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CONTENTION_GROUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throughput getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThroughput(Throughput newThroughput, NotificationChain msgs) {
		Throughput oldThroughput = throughput;
		throughput = newThroughput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.CONTENTION_GROUP__THROUGHPUT, oldThroughput, newThroughput);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(Throughput newThroughput) {
		if (newThroughput != throughput) {
			NotificationChain msgs = null;
			if (throughput != null)
				msgs = ((InternalEObject) throughput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.CONTENTION_GROUP__THROUGHPUT, null, msgs);
			if (newThroughput != null)
				msgs = ((InternalEObject) newThroughput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.CONTENTION_GROUP__THROUGHPUT, null, msgs);
			msgs = basicSetThroughput(newThroughput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CONTENTION_GROUP__THROUGHPUT,
					newThroughput, newThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRate getDataRate() {
		return dataRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataRate(DataRate newDataRate, NotificationChain msgs) {
		DataRate oldDataRate = dataRate;
		dataRate = newDataRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.CONTENTION_GROUP__DATA_RATE, oldDataRate, newDataRate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRate(DataRate newDataRate) {
		if (newDataRate != dataRate) {
			NotificationChain msgs = null;
			if (dataRate != null)
				msgs = ((InternalEObject) dataRate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.CONTENTION_GROUP__DATA_RATE, null, msgs);
			if (newDataRate != null)
				msgs = ((InternalEObject) newDataRate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.CONTENTION_GROUP__DATA_RATE, null, msgs);
			msgs = basicSetDataRate(newDataRate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CONTENTION_GROUP__DATA_RATE, newDataRate,
					newDataRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformanceSet> getPerformanceSetRef() {
		if (performanceSetRef == null) {
			performanceSetRef = new EObjectEList<PerformanceSet>(PerformanceSet.class, this,
					ShimPackage.CONTENTION_GROUP__PERFORMANCE_SET_REF);
		}
		return performanceSetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.CONTENTION_GROUP__THROUGHPUT:
			return basicSetThroughput(null, msgs);
		case ShimPackage.CONTENTION_GROUP__DATA_RATE:
			return basicSetDataRate(null, msgs);
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
		case ShimPackage.CONTENTION_GROUP__NAME:
			return getName();
		case ShimPackage.CONTENTION_GROUP__ID:
			return getId();
		case ShimPackage.CONTENTION_GROUP__THROUGHPUT:
			return getThroughput();
		case ShimPackage.CONTENTION_GROUP__DATA_RATE:
			return getDataRate();
		case ShimPackage.CONTENTION_GROUP__PERFORMANCE_SET_REF:
			return getPerformanceSetRef();
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
		case ShimPackage.CONTENTION_GROUP__NAME:
			setName((String) newValue);
			return;
		case ShimPackage.CONTENTION_GROUP__ID:
			setId((String) newValue);
			return;
		case ShimPackage.CONTENTION_GROUP__THROUGHPUT:
			setThroughput((Throughput) newValue);
			return;
		case ShimPackage.CONTENTION_GROUP__DATA_RATE:
			setDataRate((DataRate) newValue);
			return;
		case ShimPackage.CONTENTION_GROUP__PERFORMANCE_SET_REF:
			getPerformanceSetRef().clear();
			getPerformanceSetRef().addAll((Collection<? extends PerformanceSet>) newValue);
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
		case ShimPackage.CONTENTION_GROUP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShimPackage.CONTENTION_GROUP__ID:
			setId(ID_EDEFAULT);
			return;
		case ShimPackage.CONTENTION_GROUP__THROUGHPUT:
			setThroughput((Throughput) null);
			return;
		case ShimPackage.CONTENTION_GROUP__DATA_RATE:
			setDataRate((DataRate) null);
			return;
		case ShimPackage.CONTENTION_GROUP__PERFORMANCE_SET_REF:
			getPerformanceSetRef().clear();
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
		case ShimPackage.CONTENTION_GROUP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShimPackage.CONTENTION_GROUP__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ShimPackage.CONTENTION_GROUP__THROUGHPUT:
			return throughput != null;
		case ShimPackage.CONTENTION_GROUP__DATA_RATE:
			return dataRate != null;
		case ShimPackage.CONTENTION_GROUP__PERFORMANCE_SET_REF:
			return performanceSetRef != null && !performanceSetRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ContentionGroupImpl
