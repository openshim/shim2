/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

import org.multicore_association.shim.model.shim.OperationType;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Set Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#isCheckInterruptCommunication <em>Check Interrupt Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#isCheckEventCommunication <em>Check Event Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#isCheckFIFOCommunication <em>Check FIFO Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#getFifoDataSize <em>Fifo Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#getFifoDataSizeUnit <em>Fifo Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#isCheckSharedMemoryCommunication <em>Check Shared Memory Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#getSharedMemoryDataSize <em>Shared Memory Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#getSharedMemoryDataSizeUnit <em>Shared Memory Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#isCheckSharedRegisterCommunication <em>Check Shared Register Communication</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#getSharedRegisterDataSize <em>Shared Register Data Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#getSharedRegisterDataSizeUnit <em>Shared Register Data Size Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#getNRegister <em>NRegister</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.CommunicationSetPreferencesImpl#isDontConnect <em>Dont Connect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationSetPreferencesImpl extends AbstractPreferencesImpl implements CommunicationSetPreferences {
	/**
	 * The default value of the '{@link #isCheckInterruptCommunication() <em>Check Interrupt Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckInterruptCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_INTERRUPT_COMMUNICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckInterruptCommunication() <em>Check Interrupt Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckInterruptCommunication()
	 * @generated
	 * @ordered
	 */
	protected boolean checkInterruptCommunication = CHECK_INTERRUPT_COMMUNICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckEventCommunication() <em>Check Event Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckEventCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_EVENT_COMMUNICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckEventCommunication() <em>Check Event Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckEventCommunication()
	 * @generated
	 * @ordered
	 */
	protected boolean checkEventCommunication = CHECK_EVENT_COMMUNICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckFIFOCommunication() <em>Check FIFO Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckFIFOCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_FIFO_COMMUNICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckFIFOCommunication() <em>Check FIFO Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckFIFOCommunication()
	 * @generated
	 * @ordered
	 */
	protected boolean checkFIFOCommunication = CHECK_FIFO_COMMUNICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFifoDataSize() <em>Fifo Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifoDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FIFO_DATA_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFifoDataSize() <em>Fifo Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifoDataSize()
	 * @generated
	 * @ordered
	 */
	protected int fifoDataSize = FIFO_DATA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFifoDataSizeUnit() <em>Fifo Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifoDataSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final SizeUnitType FIFO_DATA_SIZE_UNIT_EDEFAULT = SizeUnitType.KI_B;

	/**
	 * The cached value of the '{@link #getFifoDataSizeUnit() <em>Fifo Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFifoDataSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected SizeUnitType fifoDataSizeUnit = FIFO_DATA_SIZE_UNIT_EDEFAULT;

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
	 * The default value of the '{@link #isCheckSharedMemoryCommunication() <em>Check Shared Memory Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckSharedMemoryCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_SHARED_MEMORY_COMMUNICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckSharedMemoryCommunication() <em>Check Shared Memory Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckSharedMemoryCommunication()
	 * @generated
	 * @ordered
	 */
	protected boolean checkSharedMemoryCommunication = CHECK_SHARED_MEMORY_COMMUNICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedMemoryDataSize() <em>Shared Memory Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedMemoryDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SHARED_MEMORY_DATA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedMemoryDataSize() <em>Shared Memory Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedMemoryDataSize()
	 * @generated
	 * @ordered
	 */
	protected Integer sharedMemoryDataSize = SHARED_MEMORY_DATA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedMemoryDataSizeUnit() <em>Shared Memory Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedMemoryDataSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final SizeUnitType SHARED_MEMORY_DATA_SIZE_UNIT_EDEFAULT = SizeUnitType.KI_B;

	/**
	 * The cached value of the '{@link #getSharedMemoryDataSizeUnit() <em>Shared Memory Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedMemoryDataSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected SizeUnitType sharedMemoryDataSizeUnit = SHARED_MEMORY_DATA_SIZE_UNIT_EDEFAULT;

	/**
	 * This is true if the Shared Memory Data Size Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sharedMemoryDataSizeUnitESet;

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
	 * The default value of the '{@link #isCheckSharedRegisterCommunication() <em>Check Shared Register Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckSharedRegisterCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_SHARED_REGISTER_COMMUNICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckSharedRegisterCommunication() <em>Check Shared Register Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckSharedRegisterCommunication()
	 * @generated
	 * @ordered
	 */
	protected boolean checkSharedRegisterCommunication = CHECK_SHARED_REGISTER_COMMUNICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedRegisterDataSize() <em>Shared Register Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedRegisterDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SHARED_REGISTER_DATA_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSharedRegisterDataSize() <em>Shared Register Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedRegisterDataSize()
	 * @generated
	 * @ordered
	 */
	protected int sharedRegisterDataSize = SHARED_REGISTER_DATA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedRegisterDataSizeUnit() <em>Shared Register Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedRegisterDataSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final SizeUnitType SHARED_REGISTER_DATA_SIZE_UNIT_EDEFAULT = SizeUnitType.KI_B;

	/**
	 * The cached value of the '{@link #getSharedRegisterDataSizeUnit() <em>Shared Register Data Size Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedRegisterDataSizeUnit()
	 * @generated
	 * @ordered
	 */
	protected SizeUnitType sharedRegisterDataSizeUnit = SHARED_REGISTER_DATA_SIZE_UNIT_EDEFAULT;

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
	 * The default value of the '{@link #isDontConnect() <em>Dont Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDontConnect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DONT_CONNECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDontConnect() <em>Dont Connect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDontConnect()
	 * @generated
	 * @ordered
	 */
	protected boolean dontConnect = DONT_CONNECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationSetPreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckInterruptCommunication() {
		return checkInterruptCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckInterruptCommunication(boolean newCheckInterruptCommunication) {
		boolean oldCheckInterruptCommunication = checkInterruptCommunication;
		checkInterruptCommunication = newCheckInterruptCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION,
					oldCheckInterruptCommunication, checkInterruptCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckEventCommunication() {
		return checkEventCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckEventCommunication(boolean newCheckEventCommunication) {
		boolean oldCheckEventCommunication = checkEventCommunication;
		checkEventCommunication = newCheckEventCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION,
					oldCheckEventCommunication, checkEventCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckFIFOCommunication() {
		return checkFIFOCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckFIFOCommunication(boolean newCheckFIFOCommunication) {
		boolean oldCheckFIFOCommunication = checkFIFOCommunication;
		checkFIFOCommunication = newCheckFIFOCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION,
					oldCheckFIFOCommunication, checkFIFOCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFifoDataSize() {
		return fifoDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFifoDataSize(int newFifoDataSize) {
		int oldFifoDataSize = fifoDataSize;
		fifoDataSize = newFifoDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE, oldFifoDataSize, fifoDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeUnitType getFifoDataSizeUnit() {
		return fifoDataSizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFifoDataSizeUnit(SizeUnitType newFifoDataSizeUnit) {
		SizeUnitType oldFifoDataSizeUnit = fifoDataSizeUnit;
		fifoDataSizeUnit = newFifoDataSizeUnit == null ? FIFO_DATA_SIZE_UNIT_EDEFAULT : newFifoDataSizeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT, oldFifoDataSizeUnit,
					fifoDataSizeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueSize(int newQueueSize) {
		int oldQueueSize = queueSize;
		queueSize = newQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE, oldQueueSize, queueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckSharedMemoryCommunication() {
		return checkSharedMemoryCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckSharedMemoryCommunication(boolean newCheckSharedMemoryCommunication) {
		boolean oldCheckSharedMemoryCommunication = checkSharedMemoryCommunication;
		checkSharedMemoryCommunication = newCheckSharedMemoryCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION,
					oldCheckSharedMemoryCommunication, checkSharedMemoryCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSharedMemoryDataSize() {
		return sharedMemoryDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedMemoryDataSize(Integer newSharedMemoryDataSize) {
		Integer oldSharedMemoryDataSize = sharedMemoryDataSize;
		sharedMemoryDataSize = newSharedMemoryDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE, oldSharedMemoryDataSize,
					sharedMemoryDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeUnitType getSharedMemoryDataSizeUnit() {
		return sharedMemoryDataSizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedMemoryDataSizeUnit(SizeUnitType newSharedMemoryDataSizeUnit) {
		SizeUnitType oldSharedMemoryDataSizeUnit = sharedMemoryDataSizeUnit;
		sharedMemoryDataSizeUnit = newSharedMemoryDataSizeUnit == null ? SHARED_MEMORY_DATA_SIZE_UNIT_EDEFAULT
				: newSharedMemoryDataSizeUnit;
		boolean oldSharedMemoryDataSizeUnitESet = sharedMemoryDataSizeUnitESet;
		sharedMemoryDataSizeUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT,
					oldSharedMemoryDataSizeUnit, sharedMemoryDataSizeUnit, !oldSharedMemoryDataSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSharedMemoryDataSizeUnit() {
		SizeUnitType oldSharedMemoryDataSizeUnit = sharedMemoryDataSizeUnit;
		boolean oldSharedMemoryDataSizeUnitESet = sharedMemoryDataSizeUnitESet;
		sharedMemoryDataSizeUnit = SHARED_MEMORY_DATA_SIZE_UNIT_EDEFAULT;
		sharedMemoryDataSizeUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT,
					oldSharedMemoryDataSizeUnit, SHARED_MEMORY_DATA_SIZE_UNIT_EDEFAULT,
					oldSharedMemoryDataSizeUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSharedMemoryDataSizeUnit() {
		return sharedMemoryDataSizeUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getOperationType() {
		return operationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationType(OperationType newOperationType) {
		OperationType oldOperationType = operationType;
		operationType = newOperationType == null ? OPERATION_TYPE_EDEFAULT : newOperationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE, oldOperationType, operationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckSharedRegisterCommunication() {
		return checkSharedRegisterCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckSharedRegisterCommunication(boolean newCheckSharedRegisterCommunication) {
		boolean oldCheckSharedRegisterCommunication = checkSharedRegisterCommunication;
		checkSharedRegisterCommunication = newCheckSharedRegisterCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION,
					oldCheckSharedRegisterCommunication, checkSharedRegisterCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSharedRegisterDataSize() {
		return sharedRegisterDataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedRegisterDataSize(int newSharedRegisterDataSize) {
		int oldSharedRegisterDataSize = sharedRegisterDataSize;
		sharedRegisterDataSize = newSharedRegisterDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE,
					oldSharedRegisterDataSize, sharedRegisterDataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SizeUnitType getSharedRegisterDataSizeUnit() {
		return sharedRegisterDataSizeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedRegisterDataSizeUnit(SizeUnitType newSharedRegisterDataSizeUnit) {
		SizeUnitType oldSharedRegisterDataSizeUnit = sharedRegisterDataSizeUnit;
		sharedRegisterDataSizeUnit = newSharedRegisterDataSizeUnit == null ? SHARED_REGISTER_DATA_SIZE_UNIT_EDEFAULT
				: newSharedRegisterDataSizeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT,
					oldSharedRegisterDataSizeUnit, sharedRegisterDataSizeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNRegister() {
		return nRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNRegister(int newNRegister) {
		int oldNRegister = nRegister;
		nRegister = newNRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__NREGISTER, oldNRegister, nRegister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDontConnect() {
		return dontConnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDontConnect(boolean newDontConnect) {
		boolean oldDontConnect = dontConnect;
		dontConnect = newDontConnect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMMUNICATION_SET_PREFERENCES__DONT_CONNECT, oldDontConnect, dontConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION:
			return isCheckInterruptCommunication();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION:
			return isCheckEventCommunication();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION:
			return isCheckFIFOCommunication();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE:
			return getFifoDataSize();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT:
			return getFifoDataSizeUnit();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE:
			return getQueueSize();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION:
			return isCheckSharedMemoryCommunication();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE:
			return getSharedMemoryDataSize();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT:
			return getSharedMemoryDataSizeUnit();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE:
			return getOperationType();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION:
			return isCheckSharedRegisterCommunication();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE:
			return getSharedRegisterDataSize();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT:
			return getSharedRegisterDataSizeUnit();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__NREGISTER:
			return getNRegister();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__DONT_CONNECT:
			return isDontConnect();
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
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION:
			setCheckInterruptCommunication((Boolean) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION:
			setCheckEventCommunication((Boolean) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION:
			setCheckFIFOCommunication((Boolean) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE:
			setFifoDataSize((Integer) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT:
			setFifoDataSizeUnit((SizeUnitType) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE:
			setQueueSize((Integer) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION:
			setCheckSharedMemoryCommunication((Boolean) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE:
			setSharedMemoryDataSize((Integer) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT:
			setSharedMemoryDataSizeUnit((SizeUnitType) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE:
			setOperationType((OperationType) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION:
			setCheckSharedRegisterCommunication((Boolean) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE:
			setSharedRegisterDataSize((Integer) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT:
			setSharedRegisterDataSizeUnit((SizeUnitType) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__NREGISTER:
			setNRegister((Integer) newValue);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__DONT_CONNECT:
			setDontConnect((Boolean) newValue);
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
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION:
			setCheckInterruptCommunication(CHECK_INTERRUPT_COMMUNICATION_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION:
			setCheckEventCommunication(CHECK_EVENT_COMMUNICATION_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION:
			setCheckFIFOCommunication(CHECK_FIFO_COMMUNICATION_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE:
			setFifoDataSize(FIFO_DATA_SIZE_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT:
			setFifoDataSizeUnit(FIFO_DATA_SIZE_UNIT_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE:
			setQueueSize(QUEUE_SIZE_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION:
			setCheckSharedMemoryCommunication(CHECK_SHARED_MEMORY_COMMUNICATION_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE:
			setSharedMemoryDataSize(SHARED_MEMORY_DATA_SIZE_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT:
			unsetSharedMemoryDataSizeUnit();
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE:
			setOperationType(OPERATION_TYPE_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION:
			setCheckSharedRegisterCommunication(CHECK_SHARED_REGISTER_COMMUNICATION_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE:
			setSharedRegisterDataSize(SHARED_REGISTER_DATA_SIZE_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT:
			setSharedRegisterDataSizeUnit(SHARED_REGISTER_DATA_SIZE_UNIT_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__NREGISTER:
			setNRegister(NREGISTER_EDEFAULT);
			return;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__DONT_CONNECT:
			setDontConnect(DONT_CONNECT_EDEFAULT);
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
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION:
			return checkInterruptCommunication != CHECK_INTERRUPT_COMMUNICATION_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION:
			return checkEventCommunication != CHECK_EVENT_COMMUNICATION_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION:
			return checkFIFOCommunication != CHECK_FIFO_COMMUNICATION_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE:
			return fifoDataSize != FIFO_DATA_SIZE_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT:
			return fifoDataSizeUnit != FIFO_DATA_SIZE_UNIT_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE:
			return queueSize != QUEUE_SIZE_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION:
			return checkSharedMemoryCommunication != CHECK_SHARED_MEMORY_COMMUNICATION_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE:
			return SHARED_MEMORY_DATA_SIZE_EDEFAULT == null ? sharedMemoryDataSize != null
					: !SHARED_MEMORY_DATA_SIZE_EDEFAULT.equals(sharedMemoryDataSize);
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT:
			return isSetSharedMemoryDataSizeUnit();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE:
			return operationType != OPERATION_TYPE_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION:
			return checkSharedRegisterCommunication != CHECK_SHARED_REGISTER_COMMUNICATION_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE:
			return sharedRegisterDataSize != SHARED_REGISTER_DATA_SIZE_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT:
			return sharedRegisterDataSizeUnit != SHARED_REGISTER_DATA_SIZE_UNIT_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__NREGISTER:
			return nRegister != NREGISTER_EDEFAULT;
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__DONT_CONNECT:
			return dontConnect != DONT_CONNECT_EDEFAULT;
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
		result.append(" (checkInterruptCommunication: ");
		result.append(checkInterruptCommunication);
		result.append(", checkEventCommunication: ");
		result.append(checkEventCommunication);
		result.append(", checkFIFOCommunication: ");
		result.append(checkFIFOCommunication);
		result.append(", fifoDataSize: ");
		result.append(fifoDataSize);
		result.append(", fifoDataSizeUnit: ");
		result.append(fifoDataSizeUnit);
		result.append(", queueSize: ");
		result.append(queueSize);
		result.append(", checkSharedMemoryCommunication: ");
		result.append(checkSharedMemoryCommunication);
		result.append(", sharedMemoryDataSize: ");
		result.append(sharedMemoryDataSize);
		result.append(", sharedMemoryDataSizeUnit: ");
		if (sharedMemoryDataSizeUnitESet)
			result.append(sharedMemoryDataSizeUnit);
		else
			result.append("<unset>");
		result.append(", operationType: ");
		result.append(operationType);
		result.append(", checkSharedRegisterCommunication: ");
		result.append(checkSharedRegisterCommunication);
		result.append(", sharedRegisterDataSize: ");
		result.append(sharedRegisterDataSize);
		result.append(", sharedRegisterDataSizeUnit: ");
		result.append(sharedRegisterDataSizeUnit);
		result.append(", nRegister: ");
		result.append(nRegister);
		result.append(", dontConnect: ");
		result.append(dontConnect);
		result.append(')');
		return result.toString();
	}

} //CommunicationSetPreferencesImpl
