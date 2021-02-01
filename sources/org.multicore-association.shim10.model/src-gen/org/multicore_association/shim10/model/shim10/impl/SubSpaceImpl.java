/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.multicore_association.shim10.model.shim10.EndianType;
import org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet;
import org.multicore_association.shim10.model.shim10.MemoryConsistencyModel;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SubSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl#getMemoryConsistencyModel <em>Memory Consistency Model</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl#getMasterSlaveBindingSet <em>Master Slave Binding Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl#getEndian <em>Endian</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SubSpaceImpl#getStart <em>Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSpaceImpl extends MinimalEObjectImpl.Container implements SubSpace {
	/**
	 * The cached value of the '{@link #getMemoryConsistencyModel() <em>Memory Consistency Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryConsistencyModel()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryConsistencyModel> memoryConsistencyModel;

	/**
	 * The cached value of the '{@link #getMasterSlaveBindingSet() <em>Master Slave Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterSlaveBindingSet()
	 * @generated
	 * @ordered
	 */
	protected MasterSlaveBindingSet masterSlaveBindingSet;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final long END_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected long end = END_EDEFAULT;

	/**
	 * This is true if the End attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endESet;

	/**
	 * The default value of the '{@link #getEndian() <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndian()
	 * @generated
	 * @ordered
	 */
	protected static final EndianType ENDIAN_EDEFAULT = EndianType.LITTLE;

	/**
	 * The cached value of the '{@link #getEndian() <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndian()
	 * @generated
	 * @ordered
	 */
	protected EndianType endian = ENDIAN_EDEFAULT;

	/**
	 * This is true if the Endian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endianESet;

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
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final long START_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected long start = START_EDEFAULT;

	/**
	 * This is true if the Start attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.SUB_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryConsistencyModel> getMemoryConsistencyModel() {
		if (memoryConsistencyModel == null) {
			memoryConsistencyModel = new EObjectContainmentEList<MemoryConsistencyModel>(MemoryConsistencyModel.class, this, ShimPackage.SUB_SPACE__MEMORY_CONSISTENCY_MODEL);
		}
		return memoryConsistencyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterSlaveBindingSet getMasterSlaveBindingSet() {
		return masterSlaveBindingSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterSlaveBindingSet(MasterSlaveBindingSet newMasterSlaveBindingSet, NotificationChain msgs) {
		MasterSlaveBindingSet oldMasterSlaveBindingSet = masterSlaveBindingSet;
		masterSlaveBindingSet = newMasterSlaveBindingSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShimPackage.SUB_SPACE__MASTER_SLAVE_BINDING_SET, oldMasterSlaveBindingSet, newMasterSlaveBindingSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterSlaveBindingSet(MasterSlaveBindingSet newMasterSlaveBindingSet) {
		if (newMasterSlaveBindingSet != masterSlaveBindingSet) {
			NotificationChain msgs = null;
			if (masterSlaveBindingSet != null)
				msgs = ((InternalEObject)masterSlaveBindingSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SUB_SPACE__MASTER_SLAVE_BINDING_SET, null, msgs);
			if (newMasterSlaveBindingSet != null)
				msgs = ((InternalEObject)newMasterSlaveBindingSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SUB_SPACE__MASTER_SLAVE_BINDING_SET, null, msgs);
			msgs = basicSetMasterSlaveBindingSet(newMasterSlaveBindingSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SUB_SPACE__MASTER_SLAVE_BINDING_SET, newMasterSlaveBindingSet, newMasterSlaveBindingSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(long newEnd) {
		long oldEnd = end;
		end = newEnd;
		boolean oldEndESet = endESet;
		endESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SUB_SPACE__END, oldEnd, end, !oldEndESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnd() {
		long oldEnd = end;
		boolean oldEndESet = endESet;
		end = END_EDEFAULT;
		endESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.SUB_SPACE__END, oldEnd, END_EDEFAULT, oldEndESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnd() {
		return endESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianType getEndian() {
		return endian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndian(EndianType newEndian) {
		EndianType oldEndian = endian;
		endian = newEndian == null ? ENDIAN_EDEFAULT : newEndian;
		boolean oldEndianESet = endianESet;
		endianESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SUB_SPACE__ENDIAN, oldEndian, endian, !oldEndianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEndian() {
		EndianType oldEndian = endian;
		boolean oldEndianESet = endianESet;
		endian = ENDIAN_EDEFAULT;
		endianESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.SUB_SPACE__ENDIAN, oldEndian, ENDIAN_EDEFAULT, oldEndianESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndian() {
		return endianESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SUB_SPACE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SUB_SPACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(long newStart) {
		long oldStart = start;
		start = newStart;
		boolean oldStartESet = startESet;
		startESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SUB_SPACE__START, oldStart, start, !oldStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStart() {
		long oldStart = start;
		boolean oldStartESet = startESet;
		start = START_EDEFAULT;
		startESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.SUB_SPACE__START, oldStart, START_EDEFAULT, oldStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStart() {
		return startESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShimPackage.SUB_SPACE__MEMORY_CONSISTENCY_MODEL:
				return ((InternalEList<?>)getMemoryConsistencyModel()).basicRemove(otherEnd, msgs);
			case ShimPackage.SUB_SPACE__MASTER_SLAVE_BINDING_SET:
				return basicSetMasterSlaveBindingSet(null, msgs);
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
			case ShimPackage.SUB_SPACE__MEMORY_CONSISTENCY_MODEL:
				return getMemoryConsistencyModel();
			case ShimPackage.SUB_SPACE__MASTER_SLAVE_BINDING_SET:
				return getMasterSlaveBindingSet();
			case ShimPackage.SUB_SPACE__END:
				return getEnd();
			case ShimPackage.SUB_SPACE__ENDIAN:
				return getEndian();
			case ShimPackage.SUB_SPACE__ID:
				return getId();
			case ShimPackage.SUB_SPACE__NAME:
				return getName();
			case ShimPackage.SUB_SPACE__START:
				return getStart();
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
			case ShimPackage.SUB_SPACE__MEMORY_CONSISTENCY_MODEL:
				getMemoryConsistencyModel().clear();
				getMemoryConsistencyModel().addAll((Collection<? extends MemoryConsistencyModel>)newValue);
				return;
			case ShimPackage.SUB_SPACE__MASTER_SLAVE_BINDING_SET:
				setMasterSlaveBindingSet((MasterSlaveBindingSet)newValue);
				return;
			case ShimPackage.SUB_SPACE__END:
				setEnd((Long)newValue);
				return;
			case ShimPackage.SUB_SPACE__ENDIAN:
				setEndian((EndianType)newValue);
				return;
			case ShimPackage.SUB_SPACE__ID:
				setId((String)newValue);
				return;
			case ShimPackage.SUB_SPACE__NAME:
				setName((String)newValue);
				return;
			case ShimPackage.SUB_SPACE__START:
				setStart((Long)newValue);
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
			case ShimPackage.SUB_SPACE__MEMORY_CONSISTENCY_MODEL:
				getMemoryConsistencyModel().clear();
				return;
			case ShimPackage.SUB_SPACE__MASTER_SLAVE_BINDING_SET:
				setMasterSlaveBindingSet((MasterSlaveBindingSet)null);
				return;
			case ShimPackage.SUB_SPACE__END:
				unsetEnd();
				return;
			case ShimPackage.SUB_SPACE__ENDIAN:
				unsetEndian();
				return;
			case ShimPackage.SUB_SPACE__ID:
				setId(ID_EDEFAULT);
				return;
			case ShimPackage.SUB_SPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShimPackage.SUB_SPACE__START:
				unsetStart();
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
			case ShimPackage.SUB_SPACE__MEMORY_CONSISTENCY_MODEL:
				return memoryConsistencyModel != null && !memoryConsistencyModel.isEmpty();
			case ShimPackage.SUB_SPACE__MASTER_SLAVE_BINDING_SET:
				return masterSlaveBindingSet != null;
			case ShimPackage.SUB_SPACE__END:
				return isSetEnd();
			case ShimPackage.SUB_SPACE__ENDIAN:
				return isSetEndian();
			case ShimPackage.SUB_SPACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ShimPackage.SUB_SPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShimPackage.SUB_SPACE__START:
				return isSetStart();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (end: ");
		if (endESet) result.append(end); else result.append("<unset>");
		result.append(", endian: ");
		if (endianESet) result.append(endian); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", start: ");
		if (startESet) result.append(start); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SubSpaceImpl
