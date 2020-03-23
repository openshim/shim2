/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.model.shim.SharedRegisterCommunication;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Register Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SharedRegisterCommunicationImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SharedRegisterCommunicationImpl#getDataSizeUnit <em>Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SharedRegisterCommunicationImpl#getNRegister <em>NRegister</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedRegisterCommunicationImpl extends AbstractCommunicationImpl implements SharedRegisterCommunication {
	/**
	 * The default value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DATA_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected int dataSize = DATA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataSizeUnit() <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final SizeUnitType DATA_SIZE_UNIT_EDEFAULT = SizeUnitType.KI_B;

	/**
	 * The cached value of the '{@link #getDataSizeUnit() <em>Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected SizeUnitType dataSizeUnit = DATA_SIZE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNRegister() <em>NRegister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNRegister()
	 * @generated
	 * @ordered
	 */
	protected static final int NREGISTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNRegister() <em>NRegister</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNRegister()
	 * @generated
	 * @ordered
	 */
	protected int nRegister = NREGISTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedRegisterCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.SHARED_REGISTER_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDataSize() {
		return dataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSize(int newDataSize) {
		int oldDataSize = dataSize;
		dataSize = newDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE,
					oldDataSize, dataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeUnitType getDataSizeUnit() {
		return dataSizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSizeUnit(SizeUnitType newDataSizeUnit) {
		SizeUnitType oldDataSizeUnit = dataSizeUnit;
		dataSizeUnit = newDataSizeUnit == null ? DATA_SIZE_UNIT_EDEFAULT : newDataSizeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT, oldDataSizeUnit, dataSizeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNRegister() {
		return nRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNRegister(int newNRegister) {
		int oldNRegister = nRegister;
		nRegister = newNRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHARED_REGISTER_COMMUNICATION__NREGISTER,
					oldNRegister, nRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE:
			return getDataSize();
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT:
			return getDataSizeUnit();
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__NREGISTER:
			return getNRegister();
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
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE:
			setDataSize((Integer) newValue);
			return;
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT:
			setDataSizeUnit((SizeUnitType) newValue);
			return;
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__NREGISTER:
			setNRegister((Integer) newValue);
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
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE:
			setDataSize(DATA_SIZE_EDEFAULT);
			return;
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT:
			setDataSizeUnit(DATA_SIZE_UNIT_EDEFAULT);
			return;
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__NREGISTER:
			setNRegister(NREGISTER_EDEFAULT);
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
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE:
			return dataSize != DATA_SIZE_EDEFAULT;
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__DATA_SIZE_UNIT:
			return dataSizeUnit != DATA_SIZE_UNIT_EDEFAULT;
		case ShimPackage.SHARED_REGISTER_COMMUNICATION__NREGISTER:
			return nRegister != NREGISTER_EDEFAULT;
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
		result.append(" (dataSize: ");
		result.append(dataSize);
		result.append(", dataSizeUnit: ");
		result.append(dataSizeUnit);
		result.append(", nRegister: ");
		result.append(nRegister);
		result.append(')');
		return result.toString();
	}

} //SharedRegisterCommunicationImpl
