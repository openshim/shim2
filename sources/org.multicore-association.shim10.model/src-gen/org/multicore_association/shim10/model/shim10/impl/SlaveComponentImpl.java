/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.multicore_association.shim10.model.shim10.RWType;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SizeUnitType;
import org.multicore_association.shim10.model.shim10.SlaveComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slave Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SlaveComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SlaveComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SlaveComponentImpl#getRwType <em>Rw Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SlaveComponentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SlaveComponentImpl#getSizeUnit <em>Size Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlaveComponentImpl extends MinimalEObjectImpl.Container implements SlaveComponent {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

	/**
	 * The default value of the '{@link #getSizeUnit() <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final SizeUnitType SIZE_UNIT_EDEFAULT = SizeUnitType.KI_B;

	/**
	 * The cached value of the '{@link #getSizeUnit() <em>Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected SizeUnitType sizeUnit = SIZE_UNIT_EDEFAULT;

	/**
	 * This is true if the Size Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlaveComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.SLAVE_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SLAVE_COMPONENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SLAVE_COMPONENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SLAVE_COMPONENT__RW_TYPE, oldRwType, rwType, !oldRwTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.SLAVE_COMPONENT__RW_TYPE, oldRwType, RW_TYPE_EDEFAULT, oldRwTypeESet));
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
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		boolean oldSizeESet = sizeESet;
		sizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SLAVE_COMPONENT__SIZE, oldSize, size, !oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSize() {
		int oldSize = size;
		boolean oldSizeESet = sizeESet;
		size = SIZE_EDEFAULT;
		sizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.SLAVE_COMPONENT__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSize() {
		return sizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeUnitType getSizeUnit() {
		return sizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeUnit(SizeUnitType newSizeUnit) {
		SizeUnitType oldSizeUnit = sizeUnit;
		sizeUnit = newSizeUnit == null ? SIZE_UNIT_EDEFAULT : newSizeUnit;
		boolean oldSizeUnitESet = sizeUnitESet;
		sizeUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SLAVE_COMPONENT__SIZE_UNIT, oldSizeUnit, sizeUnit, !oldSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeUnit() {
		SizeUnitType oldSizeUnit = sizeUnit;
		boolean oldSizeUnitESet = sizeUnitESet;
		sizeUnit = SIZE_UNIT_EDEFAULT;
		sizeUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.SLAVE_COMPONENT__SIZE_UNIT, oldSizeUnit, SIZE_UNIT_EDEFAULT, oldSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeUnit() {
		return sizeUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShimPackage.SLAVE_COMPONENT__ID:
				return getId();
			case ShimPackage.SLAVE_COMPONENT__NAME:
				return getName();
			case ShimPackage.SLAVE_COMPONENT__RW_TYPE:
				return getRwType();
			case ShimPackage.SLAVE_COMPONENT__SIZE:
				return getSize();
			case ShimPackage.SLAVE_COMPONENT__SIZE_UNIT:
				return getSizeUnit();
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
			case ShimPackage.SLAVE_COMPONENT__ID:
				setId((String)newValue);
				return;
			case ShimPackage.SLAVE_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ShimPackage.SLAVE_COMPONENT__RW_TYPE:
				setRwType((RWType)newValue);
				return;
			case ShimPackage.SLAVE_COMPONENT__SIZE:
				setSize((Integer)newValue);
				return;
			case ShimPackage.SLAVE_COMPONENT__SIZE_UNIT:
				setSizeUnit((SizeUnitType)newValue);
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
			case ShimPackage.SLAVE_COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ShimPackage.SLAVE_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShimPackage.SLAVE_COMPONENT__RW_TYPE:
				unsetRwType();
				return;
			case ShimPackage.SLAVE_COMPONENT__SIZE:
				unsetSize();
				return;
			case ShimPackage.SLAVE_COMPONENT__SIZE_UNIT:
				unsetSizeUnit();
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
			case ShimPackage.SLAVE_COMPONENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ShimPackage.SLAVE_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShimPackage.SLAVE_COMPONENT__RW_TYPE:
				return isSetRwType();
			case ShimPackage.SLAVE_COMPONENT__SIZE:
				return isSetSize();
			case ShimPackage.SLAVE_COMPONENT__SIZE_UNIT:
				return isSetSizeUnit();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", rwType: ");
		if (rwTypeESet) result.append(rwType); else result.append("<unset>");
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(", sizeUnit: ");
		if (sizeUnitESet) result.append(sizeUnit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SlaveComponentImpl
