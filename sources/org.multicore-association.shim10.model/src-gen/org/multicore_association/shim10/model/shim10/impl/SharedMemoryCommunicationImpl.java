/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.multicore_association.shim10.model.shim10.AddressSpace;
import org.multicore_association.shim10.model.shim10.OperationType;
import org.multicore_association.shim10.model.shim10.SharedMemoryCommunication;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SizeUnitType;
import org.multicore_association.shim10.model.shim10.SubSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Memory Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SharedMemoryCommunicationImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SharedMemoryCommunicationImpl#getDataSizeUnit <em>Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SharedMemoryCommunicationImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SharedMemoryCommunicationImpl#getAddressSpaceRef <em>Address Space Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SharedMemoryCommunicationImpl#getSubSpaceRef <em>Sub Space Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SharedMemoryCommunicationImpl extends AbstractCommunicationImpl implements SharedMemoryCommunication {
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
	 * The default value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected static final OperationType OPERATION_TYPE_EDEFAULT = OperationType.TAS;

	/**
	 * The cached value of the '{@link #getOperationType() <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationType()
	 * @generated
	 * @ordered
	 */
	protected OperationType operationType = OPERATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Operation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationTypeESet;

	/**
	 * The cached value of the '{@link #getAddressSpaceRef() <em>Address Space Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceRef()
	 * @generated
	 * @ordered
	 */
	protected AddressSpace addressSpaceRef;

	/**
	 * The cached value of the '{@link #getSubSpaceRef() <em>Sub Space Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpaceRef()
	 * @generated
	 * @ordered
	 */
	protected SubSpace subSpaceRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedMemoryCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.SHARED_MEMORY_COMMUNICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE, oldDataSize, dataSize, !oldDataSizeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE, oldDataSize, DATA_SIZE_EDEFAULT, oldDataSizeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT, oldDataSizeUnit, dataSizeUnit, !oldDataSizeUnitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT, oldDataSizeUnit, DATA_SIZE_UNIT_EDEFAULT, oldDataSizeUnitESet));
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
	public OperationType getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(OperationType newOperationType) {
		OperationType oldOperationType = operationType;
		operationType = newOperationType == null ? OPERATION_TYPE_EDEFAULT : newOperationType;
		boolean oldOperationTypeESet = operationTypeESet;
		operationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE, oldOperationType, operationType, !oldOperationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationType() {
		OperationType oldOperationType = operationType;
		boolean oldOperationTypeESet = operationTypeESet;
		operationType = OPERATION_TYPE_EDEFAULT;
		operationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE, oldOperationType, OPERATION_TYPE_EDEFAULT, oldOperationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationType() {
		return operationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpace getAddressSpaceRef() {
		if (addressSpaceRef != null && addressSpaceRef.eIsProxy()) {
			InternalEObject oldAddressSpaceRef = (InternalEObject)addressSpaceRef;
			addressSpaceRef = (AddressSpace)eResolveProxy(oldAddressSpaceRef);
			if (addressSpaceRef != oldAddressSpaceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShimPackage.SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF, oldAddressSpaceRef, addressSpaceRef));
			}
		}
		return addressSpaceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpace basicGetAddressSpaceRef() {
		return addressSpaceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpaceRef(AddressSpace newAddressSpaceRef) {
		AddressSpace oldAddressSpaceRef = addressSpaceRef;
		addressSpaceRef = newAddressSpaceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF, oldAddressSpaceRef, addressSpaceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSpace getSubSpaceRef() {
		if (subSpaceRef != null && subSpaceRef.eIsProxy()) {
			InternalEObject oldSubSpaceRef = (InternalEObject)subSpaceRef;
			subSpaceRef = (SubSpace)eResolveProxy(oldSubSpaceRef);
			if (subSpaceRef != oldSubSpaceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShimPackage.SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF, oldSubSpaceRef, subSpaceRef));
			}
		}
		return subSpaceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSpace basicGetSubSpaceRef() {
		return subSpaceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSpaceRef(SubSpace newSubSpaceRef) {
		SubSpace oldSubSpaceRef = subSpaceRef;
		subSpaceRef = newSubSpaceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF, oldSubSpaceRef, subSpaceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE:
				return getDataSize();
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT:
				return getDataSizeUnit();
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE:
				return getOperationType();
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF:
				if (resolve) return getAddressSpaceRef();
				return basicGetAddressSpaceRef();
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF:
				if (resolve) return getSubSpaceRef();
				return basicGetSubSpaceRef();
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
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE:
				setDataSize((Integer)newValue);
				return;
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT:
				setDataSizeUnit((SizeUnitType)newValue);
				return;
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE:
				setOperationType((OperationType)newValue);
				return;
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF:
				setAddressSpaceRef((AddressSpace)newValue);
				return;
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF:
				setSubSpaceRef((SubSpace)newValue);
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
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE:
				unsetDataSize();
				return;
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT:
				unsetDataSizeUnit();
				return;
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE:
				unsetOperationType();
				return;
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF:
				setAddressSpaceRef((AddressSpace)null);
				return;
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF:
				setSubSpaceRef((SubSpace)null);
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
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE:
				return isSetDataSize();
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT:
				return isSetDataSizeUnit();
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE:
				return isSetOperationType();
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF:
				return addressSpaceRef != null;
			case ShimPackage.SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF:
				return subSpaceRef != null;
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
		result.append(", operationType: ");
		if (operationTypeESet) result.append(operationType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SharedMemoryCommunicationImpl
