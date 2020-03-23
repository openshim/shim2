/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AccessTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AccessTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AccessTypeImpl#getRwType <em>Rw Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AccessTypeImpl#getAccessByteSize <em>Access Byte Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AccessTypeImpl#getAlignmentByteSize <em>Alignment Byte Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AccessTypeImpl#getNBurst <em>NBurst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessTypeImpl extends MinimalEObjectImpl.Container implements AccessType {
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
	 * The default value of the '{@link #getRwType() <em>Rw Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRwType()
	 * @generated
	 * @ordered
	 */
	protected static final RWType RW_TYPE_EDEFAULT = RWType.RW;

	/**
	 * The cached value of the '{@link #getRwType() <em>Rw Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRwType()
	 * @generated
	 * @ordered
	 */
	protected RWType rwType = RW_TYPE_EDEFAULT;

	/**
	 * This is true if the Rw Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rwTypeESet;

	/**
	 * The default value of the '{@link #getAccessByteSize() <em>Access Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessByteSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ACCESS_BYTE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessByteSize() <em>Access Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessByteSize()
	 * @generated
	 * @ordered
	 */
	protected Integer accessByteSize = ACCESS_BYTE_SIZE_EDEFAULT;

	/**
	 * This is true if the Access Byte Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean accessByteSizeESet;

	/**
	 * The default value of the '{@link #getAlignmentByteSize() <em>Alignment Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentByteSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALIGNMENT_BYTE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignmentByteSize() <em>Alignment Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignmentByteSize()
	 * @generated
	 * @ordered
	 */
	protected Integer alignmentByteSize = ALIGNMENT_BYTE_SIZE_EDEFAULT;

	/**
	 * This is true if the Alignment Byte Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignmentByteSizeESet;

	/**
	 * The default value of the '{@link #getNBurst() <em>NBurst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBurst()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NBURST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNBurst() <em>NBurst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBurst()
	 * @generated
	 * @ordered
	 */
	protected Integer nBurst = NBURST_EDEFAULT;

	/**
	 * This is true if the NBurst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nBurstESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.ACCESS_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ACCESS_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ACCESS_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RWType getRwType() {
		return rwType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRwType(RWType newRwType) {
		RWType oldRwType = rwType;
		rwType = newRwType == null ? RW_TYPE_EDEFAULT : newRwType;
		boolean oldRwTypeESet = rwTypeESet;
		rwTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ACCESS_TYPE__RW_TYPE, oldRwType, rwType,
					!oldRwTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRwType() {
		RWType oldRwType = rwType;
		boolean oldRwTypeESet = rwTypeESet;
		rwType = RW_TYPE_EDEFAULT;
		rwTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ACCESS_TYPE__RW_TYPE, oldRwType,
					RW_TYPE_EDEFAULT, oldRwTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRwType() {
		return rwTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAccessByteSize() {
		return accessByteSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessByteSize(Integer newAccessByteSize) {
		Integer oldAccessByteSize = accessByteSize;
		accessByteSize = newAccessByteSize;
		boolean oldAccessByteSizeESet = accessByteSizeESet;
		accessByteSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ACCESS_TYPE__ACCESS_BYTE_SIZE,
					oldAccessByteSize, accessByteSize, !oldAccessByteSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAccessByteSize() {
		Integer oldAccessByteSize = accessByteSize;
		boolean oldAccessByteSizeESet = accessByteSizeESet;
		accessByteSize = ACCESS_BYTE_SIZE_EDEFAULT;
		accessByteSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ACCESS_TYPE__ACCESS_BYTE_SIZE,
					oldAccessByteSize, ACCESS_BYTE_SIZE_EDEFAULT, oldAccessByteSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAccessByteSize() {
		return accessByteSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAlignmentByteSize() {
		return alignmentByteSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignmentByteSize(Integer newAlignmentByteSize) {
		Integer oldAlignmentByteSize = alignmentByteSize;
		alignmentByteSize = newAlignmentByteSize;
		boolean oldAlignmentByteSizeESet = alignmentByteSizeESet;
		alignmentByteSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ACCESS_TYPE__ALIGNMENT_BYTE_SIZE,
					oldAlignmentByteSize, alignmentByteSize, !oldAlignmentByteSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlignmentByteSize() {
		Integer oldAlignmentByteSize = alignmentByteSize;
		boolean oldAlignmentByteSizeESet = alignmentByteSizeESet;
		alignmentByteSize = ALIGNMENT_BYTE_SIZE_EDEFAULT;
		alignmentByteSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ACCESS_TYPE__ALIGNMENT_BYTE_SIZE,
					oldAlignmentByteSize, ALIGNMENT_BYTE_SIZE_EDEFAULT, oldAlignmentByteSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlignmentByteSize() {
		return alignmentByteSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNBurst() {
		return nBurst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNBurst(Integer newNBurst) {
		Integer oldNBurst = nBurst;
		nBurst = newNBurst;
		boolean oldNBurstESet = nBurstESet;
		nBurstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ACCESS_TYPE__NBURST, oldNBurst, nBurst,
					!oldNBurstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNBurst() {
		Integer oldNBurst = nBurst;
		boolean oldNBurstESet = nBurstESet;
		nBurst = NBURST_EDEFAULT;
		nBurstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ACCESS_TYPE__NBURST, oldNBurst,
					NBURST_EDEFAULT, oldNBurstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNBurst() {
		return nBurstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.ACCESS_TYPE__NAME:
			return getName();
		case ShimPackage.ACCESS_TYPE__ID:
			return getId();
		case ShimPackage.ACCESS_TYPE__RW_TYPE:
			return getRwType();
		case ShimPackage.ACCESS_TYPE__ACCESS_BYTE_SIZE:
			return getAccessByteSize();
		case ShimPackage.ACCESS_TYPE__ALIGNMENT_BYTE_SIZE:
			return getAlignmentByteSize();
		case ShimPackage.ACCESS_TYPE__NBURST:
			return getNBurst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ShimPackage.ACCESS_TYPE__NAME:
			setName((String) newValue);
			return;
		case ShimPackage.ACCESS_TYPE__ID:
			setId((String) newValue);
			return;
		case ShimPackage.ACCESS_TYPE__RW_TYPE:
			setRwType((RWType) newValue);
			return;
		case ShimPackage.ACCESS_TYPE__ACCESS_BYTE_SIZE:
			setAccessByteSize((Integer) newValue);
			return;
		case ShimPackage.ACCESS_TYPE__ALIGNMENT_BYTE_SIZE:
			setAlignmentByteSize((Integer) newValue);
			return;
		case ShimPackage.ACCESS_TYPE__NBURST:
			setNBurst((Integer) newValue);
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
		case ShimPackage.ACCESS_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShimPackage.ACCESS_TYPE__ID:
			setId(ID_EDEFAULT);
			return;
		case ShimPackage.ACCESS_TYPE__RW_TYPE:
			unsetRwType();
			return;
		case ShimPackage.ACCESS_TYPE__ACCESS_BYTE_SIZE:
			unsetAccessByteSize();
			return;
		case ShimPackage.ACCESS_TYPE__ALIGNMENT_BYTE_SIZE:
			unsetAlignmentByteSize();
			return;
		case ShimPackage.ACCESS_TYPE__NBURST:
			unsetNBurst();
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
		case ShimPackage.ACCESS_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShimPackage.ACCESS_TYPE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ShimPackage.ACCESS_TYPE__RW_TYPE:
			return isSetRwType();
		case ShimPackage.ACCESS_TYPE__ACCESS_BYTE_SIZE:
			return isSetAccessByteSize();
		case ShimPackage.ACCESS_TYPE__ALIGNMENT_BYTE_SIZE:
			return isSetAlignmentByteSize();
		case ShimPackage.ACCESS_TYPE__NBURST:
			return isSetNBurst();
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
		result.append(", rwType: ");
		if (rwTypeESet)
			result.append(rwType);
		else
			result.append("<unset>");
		result.append(", accessByteSize: ");
		if (accessByteSizeESet)
			result.append(accessByteSize);
		else
			result.append("<unset>");
		result.append(", alignmentByteSize: ");
		if (alignmentByteSizeESet)
			result.append(alignmentByteSize);
		else
			result.append("<unset>");
		result.append(", nBurst: ");
		if (nBurstESet)
			result.append(nBurst);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AccessTypeImpl
