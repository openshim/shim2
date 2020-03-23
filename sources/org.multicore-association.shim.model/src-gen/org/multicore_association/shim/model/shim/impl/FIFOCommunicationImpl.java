/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.model.shim.FIFOCommunication;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FIFO Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FIFOCommunicationImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FIFOCommunicationImpl#getDataSizeUnit <em>Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FIFOCommunicationImpl#getQueueSize <em>Queue Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FIFOCommunicationImpl extends AbstractCommunicationImpl implements FIFOCommunication {
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
	 * This is true if the Data Size Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSizeUnitESet;

	/**
	 * The default value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQueueSize() <em>Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected int queueSize = QUEUE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FIFOCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.FIFO_COMMUNICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.FIFO_COMMUNICATION__DATA_SIZE,
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
		boolean oldDataSizeUnitESet = dataSizeUnitESet;
		dataSizeUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT,
					oldDataSizeUnit, dataSizeUnit, !oldDataSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSizeUnit() {
		SizeUnitType oldDataSizeUnit = dataSizeUnit;
		boolean oldDataSizeUnitESet = dataSizeUnitESet;
		dataSizeUnit = DATA_SIZE_UNIT_EDEFAULT;
		dataSizeUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT,
					oldDataSizeUnit, DATA_SIZE_UNIT_EDEFAULT, oldDataSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSizeUnit() {
		return dataSizeUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueSize(int newQueueSize) {
		int oldQueueSize = queueSize;
		queueSize = newQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE,
					oldQueueSize, queueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE:
			return getDataSize();
		case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT:
			return getDataSizeUnit();
		case ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE:
			return getQueueSize();
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
		case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE:
			setDataSize((Integer) newValue);
			return;
		case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT:
			setDataSizeUnit((SizeUnitType) newValue);
			return;
		case ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE:
			setQueueSize((Integer) newValue);
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
		case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE:
			setDataSize(DATA_SIZE_EDEFAULT);
			return;
		case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT:
			unsetDataSizeUnit();
			return;
		case ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE:
			setQueueSize(QUEUE_SIZE_EDEFAULT);
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
		case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE:
			return dataSize != DATA_SIZE_EDEFAULT;
		case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT:
			return isSetDataSizeUnit();
		case ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE:
			return queueSize != QUEUE_SIZE_EDEFAULT;
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
		if (dataSizeUnitESet)
			result.append(dataSizeUnit);
		else
			result.append("<unset>");
		result.append(", queueSize: ");
		result.append(queueSize);
		result.append(')');
		return result.toString();
	}

} //FIFOCommunicationImpl
