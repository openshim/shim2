/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SizeUnitType;
import org.multicore_association.shim.model.shim.SlaveComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slave Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SlaveComponentImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SlaveComponentImpl#getSizeUnit <em>Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SlaveComponentImpl#getRwType <em>Rw Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlaveComponentImpl extends AbstractComponentImpl implements SlaveComponent {
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SLAVE_COMPONENT__SIZE, oldSize, size));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SLAVE_COMPONENT__SIZE_UNIT, oldSizeUnit,
					sizeUnit));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SLAVE_COMPONENT__RW_TYPE, oldRwType,
					rwType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.SLAVE_COMPONENT__SIZE:
			return getSize();
		case ShimPackage.SLAVE_COMPONENT__SIZE_UNIT:
			return getSizeUnit();
		case ShimPackage.SLAVE_COMPONENT__RW_TYPE:
			return getRwType();
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
		case ShimPackage.SLAVE_COMPONENT__SIZE:
			setSize((Integer) newValue);
			return;
		case ShimPackage.SLAVE_COMPONENT__SIZE_UNIT:
			setSizeUnit((SizeUnitType) newValue);
			return;
		case ShimPackage.SLAVE_COMPONENT__RW_TYPE:
			setRwType((RWType) newValue);
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
		case ShimPackage.SLAVE_COMPONENT__SIZE:
			setSize(SIZE_EDEFAULT);
			return;
		case ShimPackage.SLAVE_COMPONENT__SIZE_UNIT:
			setSizeUnit(SIZE_UNIT_EDEFAULT);
			return;
		case ShimPackage.SLAVE_COMPONENT__RW_TYPE:
			setRwType(RW_TYPE_EDEFAULT);
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
		case ShimPackage.SLAVE_COMPONENT__SIZE:
			return size != SIZE_EDEFAULT;
		case ShimPackage.SLAVE_COMPONENT__SIZE_UNIT:
			return sizeUnit != SIZE_UNIT_EDEFAULT;
		case ShimPackage.SLAVE_COMPONENT__RW_TYPE:
			return rwType != RW_TYPE_EDEFAULT;
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
		result.append(" (size: ");
		result.append(size);
		result.append(", sizeUnit: ");
		result.append(sizeUnit);
		result.append(", rwType: ");
		result.append(rwType);
		result.append(')');
		return result.toString();
	}

} //SlaveComponentImpl
