/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.multicore_association.shim10.model.shim10.FIFOCommunication;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FIFO Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.FIFOCommunicationImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.FIFOCommunicationImpl#getDataSizeUnit <em>Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.FIFOCommunicationImpl#getQueueSize <em>Queue Size</em>}</li>
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
	 * This is true if the Data Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataSizeESet;

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
	 * This is true if the Queue Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean queueSizeESet;

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
		boolean oldDataSizeESet = dataSizeESet;
		dataSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.FIFO_COMMUNICATION__DATA_SIZE, oldDataSize, dataSize, !oldDataSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataSize() {
		int oldDataSize = dataSize;
		boolean oldDataSizeESet = dataSizeESet;
		dataSize = DATA_SIZE_EDEFAULT;
		dataSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.FIFO_COMMUNICATION__DATA_SIZE, oldDataSize, DATA_SIZE_EDEFAULT, oldDataSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataSize() {
		return dataSizeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT, oldDataSizeUnit, dataSizeUnit, !oldDataSizeUnitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT, oldDataSizeUnit, DATA_SIZE_UNIT_EDEFAULT, oldDataSizeUnitESet));
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
		boolean oldQueueSizeESet = queueSizeESet;
		queueSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE, oldQueueSize, queueSize, !oldQueueSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQueueSize() {
		int oldQueueSize = queueSize;
		boolean oldQueueSizeESet = queueSizeESet;
		queueSize = QUEUE_SIZE_EDEFAULT;
		queueSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE, oldQueueSize, QUEUE_SIZE_EDEFAULT, oldQueueSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQueueSize() {
		return queueSizeESet;
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
				setDataSize((Integer)newValue);
				return;
			case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT:
				setDataSizeUnit((SizeUnitType)newValue);
				return;
			case ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE:
				setQueueSize((Integer)newValue);
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
				unsetDataSize();
				return;
			case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT:
				unsetDataSizeUnit();
				return;
			case ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE:
				unsetQueueSize();
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
				return isSetDataSize();
			case ShimPackage.FIFO_COMMUNICATION__DATA_SIZE_UNIT:
				return isSetDataSizeUnit();
			case ShimPackage.FIFO_COMMUNICATION__QUEUE_SIZE:
				return isSetQueueSize();
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
		result.append(" (dataSize: ");
		if (dataSizeESet) result.append(dataSize); else result.append("<unset>");
		result.append(", dataSizeUnit: ");
		if (dataSizeUnitESet) result.append(dataSizeUnit); else result.append("<unset>");
		result.append(", queueSize: ");
		if (queueSizeESet) result.append(queueSize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FIFOCommunicationImpl
