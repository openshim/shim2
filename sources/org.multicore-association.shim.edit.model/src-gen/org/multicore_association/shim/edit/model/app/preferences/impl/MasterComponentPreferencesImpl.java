/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.MasterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Component Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl#getEndian <em>Endian</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl#getArchOpt <em>Arch Opt</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl#getNChannel <em>NChannel</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl#getNThread <em>NThread</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl#isCheckClockForMaster <em>Check Clock For Master</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.MasterComponentPreferencesImpl#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MasterComponentPreferencesImpl extends AbstractComponentPreferencesImpl
		implements MasterComponentPreferences {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MasterType TYPE_EDEFAULT = MasterType.PU;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MasterType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndian() <em>Endian</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndian()
	 * @generated
	 * @ordered
	 */
	protected static final EndianType ENDIAN_EDEFAULT = EndianType.NONE;

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
	 * The default value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected String arch = ARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchOpt() <em>Arch Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchOpt()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCH_OPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchOpt() <em>Arch Opt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchOpt()
	 * @generated
	 * @ordered
	 */
	protected String archOpt = ARCH_OPT_EDEFAULT;

	/**
	 * This is true if the Arch Opt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archOptESet;

	/**
	 * The default value of the '{@link #getNChannel() <em>NChannel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNChannel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NCHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNChannel() <em>NChannel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNChannel()
	 * @generated
	 * @ordered
	 */
	protected Integer nChannel = NCHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNThread() <em>NThread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNThread()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NTHREAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNThread() <em>NThread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNThread()
	 * @generated
	 * @ordered
	 */
	protected Integer nThread = NTHREAD_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckClockForMaster() <em>Check Clock For Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckClockForMaster()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_CLOCK_FOR_MASTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckClockForMaster() <em>Check Clock For Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckClockForMaster()
	 * @generated
	 * @ordered
	 */
	protected boolean checkClockForMaster = CHECK_CLOCK_FOR_MASTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected static final Float CLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected Float clock = CLOCK_EDEFAULT;

	/**
	 * This is true if the Clock attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clockESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterComponentPreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencesPackage.Literals.MASTER_COMPONENT_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MasterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(MasterType newType) {
		MasterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.MASTER_COMPONENT_PREFERENCES__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndianType getEndian() {
		return endian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndian(EndianType newEndian) {
		EndianType oldEndian = endian;
		endian = newEndian == null ? ENDIAN_EDEFAULT : newEndian;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ENDIAN, oldEndian, endian));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArch() {
		return arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArch(String newArch) {
		String oldArch = arch;
		arch = newArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH,
					oldArch, arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArchOpt() {
		return archOpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchOpt(String newArchOpt) {
		String oldArchOpt = archOpt;
		archOpt = newArchOpt;
		boolean oldArchOptESet = archOptESet;
		archOptESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH_OPT, oldArchOpt, archOpt, !oldArchOptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetArchOpt() {
		String oldArchOpt = archOpt;
		boolean oldArchOptESet = archOptESet;
		archOpt = ARCH_OPT_EDEFAULT;
		archOptESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH_OPT, oldArchOpt, ARCH_OPT_EDEFAULT,
					oldArchOptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetArchOpt() {
		return archOptESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNChannel() {
		return nChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNChannel(Integer newNChannel) {
		Integer oldNChannel = nChannel;
		nChannel = newNChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NCHANNEL, oldNChannel, nChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNThread() {
		return nThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNThread(Integer newNThread) {
		Integer oldNThread = nThread;
		nThread = newNThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NTHREAD, oldNThread, nThread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckClockForMaster() {
		return checkClockForMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckClockForMaster(boolean newCheckClockForMaster) {
		boolean oldCheckClockForMaster = checkClockForMaster;
		checkClockForMaster = newCheckClockForMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER, oldCheckClockForMaster,
					checkClockForMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClock(Float newClock) {
		Float oldClock = clock;
		clock = newClock;
		boolean oldClockESet = clockESet;
		clockESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CLOCK, oldClock, clock, !oldClockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetClock() {
		Float oldClock = clock;
		boolean oldClockESet = clockESet;
		clock = CLOCK_EDEFAULT;
		clockESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CLOCK, oldClock, CLOCK_EDEFAULT, oldClockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetClock() {
		return clockESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__TYPE:
			return getType();
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ENDIAN:
			return getEndian();
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH:
			return getArch();
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH_OPT:
			return getArchOpt();
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NCHANNEL:
			return getNChannel();
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NTHREAD:
			return getNThread();
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER:
			return isCheckClockForMaster();
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CLOCK:
			return getClock();
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
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__TYPE:
			setType((MasterType) newValue);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ENDIAN:
			setEndian((EndianType) newValue);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH:
			setArch((String) newValue);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH_OPT:
			setArchOpt((String) newValue);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NCHANNEL:
			setNChannel((Integer) newValue);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NTHREAD:
			setNThread((Integer) newValue);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER:
			setCheckClockForMaster((Boolean) newValue);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CLOCK:
			setClock((Float) newValue);
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
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ENDIAN:
			setEndian(ENDIAN_EDEFAULT);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH:
			setArch(ARCH_EDEFAULT);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH_OPT:
			unsetArchOpt();
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NCHANNEL:
			setNChannel(NCHANNEL_EDEFAULT);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NTHREAD:
			setNThread(NTHREAD_EDEFAULT);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER:
			setCheckClockForMaster(CHECK_CLOCK_FOR_MASTER_EDEFAULT);
			return;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CLOCK:
			unsetClock();
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
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__TYPE:
			return type != TYPE_EDEFAULT;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ENDIAN:
			return endian != ENDIAN_EDEFAULT;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH:
			return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH_OPT:
			return isSetArchOpt();
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NCHANNEL:
			return NCHANNEL_EDEFAULT == null ? nChannel != null : !NCHANNEL_EDEFAULT.equals(nChannel);
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NTHREAD:
			return NTHREAD_EDEFAULT == null ? nThread != null : !NTHREAD_EDEFAULT.equals(nThread);
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER:
			return checkClockForMaster != CHECK_CLOCK_FOR_MASTER_EDEFAULT;
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CLOCK:
			return isSetClock();
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
		result.append(" (type: ");
		result.append(type);
		result.append(", endian: ");
		result.append(endian);
		result.append(", arch: ");
		result.append(arch);
		result.append(", archOpt: ");
		if (archOptESet)
			result.append(archOpt);
		else
			result.append("<unset>");
		result.append(", nChannel: ");
		result.append(nChannel);
		result.append(", nThread: ");
		result.append(nThread);
		result.append(", checkClockForMaster: ");
		result.append(checkClockForMaster);
		result.append(", clock: ");
		if (clockESet)
			result.append(clock);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MasterComponentPreferencesImpl
