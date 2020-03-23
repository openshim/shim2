/**
 */
package org.multicore_association.shim.model.shim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.multicore_association.shim.model.shim.AccessTypeSet;
import org.multicore_association.shim.model.shim.Cache;
import org.multicore_association.shim.model.shim.ClockFrequency;
import org.multicore_association.shim.model.shim.CommonInstructionSet;
import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.MasterType;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getCacheRef <em>Cache Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getAccessTypeSet <em>Access Type Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getClockFrequency <em>Clock Frequency</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getArchOption <em>Arch Option</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getEndian <em>Endian</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getMasterType <em>Master Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getNChannel <em>NChannel</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getNThread <em>NThread</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterComponentImpl#getCommonInstructionSet <em>Common Instruction Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MasterComponentImpl extends AbstractComponentImpl implements MasterComponent {
	/**
	 * The cached value of the '{@link #getCacheRef() <em>Cache Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Cache> cacheRef;

	/**
	 * The cached value of the '{@link #getAccessTypeSet() <em>Access Type Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTypeSet()
	 * @generated
	 * @ordered
	 */
	protected AccessTypeSet accessTypeSet;

	/**
	 * The cached value of the '{@link #getClockFrequency() <em>Clock Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockFrequency()
	 * @generated
	 * @ordered
	 */
	protected ClockFrequency clockFrequency;

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
	 * The default value of the '{@link #getArchOption() <em>Arch Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchOption()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCH_OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchOption() <em>Arch Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchOption()
	 * @generated
	 * @ordered
	 */
	protected String archOption = ARCH_OPTION_EDEFAULT;

	/**
	 * This is true if the Arch Option attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archOptionESet;

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
	 * This is true if the Endian attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean endianESet;

	/**
	 * The default value of the '{@link #getMasterType() <em>Master Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterType()
	 * @generated
	 * @ordered
	 */
	protected static final MasterType MASTER_TYPE_EDEFAULT = MasterType.PU;

	/**
	 * The cached value of the '{@link #getMasterType() <em>Master Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterType()
	 * @generated
	 * @ordered
	 */
	protected MasterType masterType = MASTER_TYPE_EDEFAULT;

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
	 * This is true if the NChannel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nChannelESet;

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
	 * This is true if the NThread attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nThreadESet;

	/**
	 * The default value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected static final String PID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected String pid = PID_EDEFAULT;

	/**
	 * This is true if the Pid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pidESet;

	/**
	 * The cached value of the '{@link #getCommonInstructionSet() <em>Common Instruction Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonInstructionSet()
	 * @generated
	 * @ordered
	 */
	protected CommonInstructionSet commonInstructionSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.MASTER_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cache> getCacheRef() {
		if (cacheRef == null) {
			cacheRef = new EObjectResolvingEList<Cache>(Cache.class, this, ShimPackage.MASTER_COMPONENT__CACHE_REF);
		}
		return cacheRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTypeSet getAccessTypeSet() {
		return accessTypeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessTypeSet(AccessTypeSet newAccessTypeSet, NotificationChain msgs) {
		AccessTypeSet oldAccessTypeSet = accessTypeSet;
		accessTypeSet = newAccessTypeSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET, oldAccessTypeSet, newAccessTypeSet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTypeSet(AccessTypeSet newAccessTypeSet) {
		if (newAccessTypeSet != accessTypeSet) {
			NotificationChain msgs = null;
			if (accessTypeSet != null)
				msgs = ((InternalEObject) accessTypeSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET, null, msgs);
			if (newAccessTypeSet != null)
				msgs = ((InternalEObject) newAccessTypeSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET, null, msgs);
			msgs = basicSetAccessTypeSet(newAccessTypeSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET,
					newAccessTypeSet, newAccessTypeSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockFrequency getClockFrequency() {
		return clockFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockFrequency(ClockFrequency newClockFrequency, NotificationChain msgs) {
		ClockFrequency oldClockFrequency = clockFrequency;
		clockFrequency = newClockFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY, oldClockFrequency, newClockFrequency);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockFrequency(ClockFrequency newClockFrequency) {
		if (newClockFrequency != clockFrequency) {
			NotificationChain msgs = null;
			if (clockFrequency != null)
				msgs = ((InternalEObject) clockFrequency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY, null, msgs);
			if (newClockFrequency != null)
				msgs = ((InternalEObject) newClockFrequency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY, null, msgs);
			msgs = basicSetClockFrequency(newClockFrequency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY,
					newClockFrequency, newClockFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArch() {
		return arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArch(String newArch) {
		String oldArch = arch;
		arch = newArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__ARCH, oldArch, arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchOption() {
		return archOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchOption(String newArchOption) {
		String oldArchOption = archOption;
		archOption = newArchOption;
		boolean oldArchOptionESet = archOptionESet;
		archOptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__ARCH_OPTION,
					oldArchOption, archOption, !oldArchOptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchOption() {
		String oldArchOption = archOption;
		boolean oldArchOptionESet = archOptionESet;
		archOption = ARCH_OPTION_EDEFAULT;
		archOptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.MASTER_COMPONENT__ARCH_OPTION,
					oldArchOption, ARCH_OPTION_EDEFAULT, oldArchOptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchOption() {
		return archOptionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__ENDIAN, oldEndian,
					endian, !oldEndianESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.MASTER_COMPONENT__ENDIAN, oldEndian,
					ENDIAN_EDEFAULT, oldEndianESet));
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
	public MasterType getMasterType() {
		return masterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterType(MasterType newMasterType) {
		MasterType oldMasterType = masterType;
		masterType = newMasterType == null ? MASTER_TYPE_EDEFAULT : newMasterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__MASTER_TYPE,
					oldMasterType, masterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNChannel() {
		return nChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNChannel(Integer newNChannel) {
		Integer oldNChannel = nChannel;
		nChannel = newNChannel;
		boolean oldNChannelESet = nChannelESet;
		nChannelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__NCHANNEL, oldNChannel,
					nChannel, !oldNChannelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNChannel() {
		Integer oldNChannel = nChannel;
		boolean oldNChannelESet = nChannelESet;
		nChannel = NCHANNEL_EDEFAULT;
		nChannelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.MASTER_COMPONENT__NCHANNEL, oldNChannel,
					NCHANNEL_EDEFAULT, oldNChannelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNChannel() {
		return nChannelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNThread() {
		return nThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNThread(Integer newNThread) {
		Integer oldNThread = nThread;
		nThread = newNThread;
		boolean oldNThreadESet = nThreadESet;
		nThreadESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__NTHREAD, oldNThread,
					nThread, !oldNThreadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNThread() {
		Integer oldNThread = nThread;
		boolean oldNThreadESet = nThreadESet;
		nThread = NTHREAD_EDEFAULT;
		nThreadESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.MASTER_COMPONENT__NTHREAD, oldNThread,
					NTHREAD_EDEFAULT, oldNThreadESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNThread() {
		return nThreadESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPid(String newPid) {
		String oldPid = pid;
		pid = newPid;
		boolean oldPidESet = pidESet;
		pidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__PID, oldPid, pid,
					!oldPidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPid() {
		String oldPid = pid;
		boolean oldPidESet = pidESet;
		pid = PID_EDEFAULT;
		pidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.MASTER_COMPONENT__PID, oldPid,
					PID_EDEFAULT, oldPidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPid() {
		return pidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonInstructionSet getCommonInstructionSet() {
		return commonInstructionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommonInstructionSet(CommonInstructionSet newCommonInstructionSet,
			NotificationChain msgs) {
		CommonInstructionSet oldCommonInstructionSet = commonInstructionSet;
		commonInstructionSet = newCommonInstructionSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET, oldCommonInstructionSet,
					newCommonInstructionSet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonInstructionSet(CommonInstructionSet newCommonInstructionSet) {
		if (newCommonInstructionSet != commonInstructionSet) {
			NotificationChain msgs = null;
			if (commonInstructionSet != null)
				msgs = ((InternalEObject) commonInstructionSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET, null, msgs);
			if (newCommonInstructionSet != null)
				msgs = ((InternalEObject) newCommonInstructionSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET, null, msgs);
			msgs = basicSetCommonInstructionSet(newCommonInstructionSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET,
					newCommonInstructionSet, newCommonInstructionSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET:
			return basicSetAccessTypeSet(null, msgs);
		case ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY:
			return basicSetClockFrequency(null, msgs);
		case ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET:
			return basicSetCommonInstructionSet(null, msgs);
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
		case ShimPackage.MASTER_COMPONENT__CACHE_REF:
			return getCacheRef();
		case ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET:
			return getAccessTypeSet();
		case ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY:
			return getClockFrequency();
		case ShimPackage.MASTER_COMPONENT__ARCH:
			return getArch();
		case ShimPackage.MASTER_COMPONENT__ARCH_OPTION:
			return getArchOption();
		case ShimPackage.MASTER_COMPONENT__ENDIAN:
			return getEndian();
		case ShimPackage.MASTER_COMPONENT__MASTER_TYPE:
			return getMasterType();
		case ShimPackage.MASTER_COMPONENT__NCHANNEL:
			return getNChannel();
		case ShimPackage.MASTER_COMPONENT__NTHREAD:
			return getNThread();
		case ShimPackage.MASTER_COMPONENT__PID:
			return getPid();
		case ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET:
			return getCommonInstructionSet();
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
		case ShimPackage.MASTER_COMPONENT__CACHE_REF:
			getCacheRef().clear();
			getCacheRef().addAll((Collection<? extends Cache>) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET:
			setAccessTypeSet((AccessTypeSet) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY:
			setClockFrequency((ClockFrequency) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__ARCH:
			setArch((String) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__ARCH_OPTION:
			setArchOption((String) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__ENDIAN:
			setEndian((EndianType) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__MASTER_TYPE:
			setMasterType((MasterType) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__NCHANNEL:
			setNChannel((Integer) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__NTHREAD:
			setNThread((Integer) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__PID:
			setPid((String) newValue);
			return;
		case ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET:
			setCommonInstructionSet((CommonInstructionSet) newValue);
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
		case ShimPackage.MASTER_COMPONENT__CACHE_REF:
			getCacheRef().clear();
			return;
		case ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET:
			setAccessTypeSet((AccessTypeSet) null);
			return;
		case ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY:
			setClockFrequency((ClockFrequency) null);
			return;
		case ShimPackage.MASTER_COMPONENT__ARCH:
			setArch(ARCH_EDEFAULT);
			return;
		case ShimPackage.MASTER_COMPONENT__ARCH_OPTION:
			unsetArchOption();
			return;
		case ShimPackage.MASTER_COMPONENT__ENDIAN:
			unsetEndian();
			return;
		case ShimPackage.MASTER_COMPONENT__MASTER_TYPE:
			setMasterType(MASTER_TYPE_EDEFAULT);
			return;
		case ShimPackage.MASTER_COMPONENT__NCHANNEL:
			unsetNChannel();
			return;
		case ShimPackage.MASTER_COMPONENT__NTHREAD:
			unsetNThread();
			return;
		case ShimPackage.MASTER_COMPONENT__PID:
			unsetPid();
			return;
		case ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET:
			setCommonInstructionSet((CommonInstructionSet) null);
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
		case ShimPackage.MASTER_COMPONENT__CACHE_REF:
			return cacheRef != null && !cacheRef.isEmpty();
		case ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET:
			return accessTypeSet != null;
		case ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY:
			return clockFrequency != null;
		case ShimPackage.MASTER_COMPONENT__ARCH:
			return ARCH_EDEFAULT == null ? arch != null : !ARCH_EDEFAULT.equals(arch);
		case ShimPackage.MASTER_COMPONENT__ARCH_OPTION:
			return isSetArchOption();
		case ShimPackage.MASTER_COMPONENT__ENDIAN:
			return isSetEndian();
		case ShimPackage.MASTER_COMPONENT__MASTER_TYPE:
			return masterType != MASTER_TYPE_EDEFAULT;
		case ShimPackage.MASTER_COMPONENT__NCHANNEL:
			return isSetNChannel();
		case ShimPackage.MASTER_COMPONENT__NTHREAD:
			return isSetNThread();
		case ShimPackage.MASTER_COMPONENT__PID:
			return isSetPid();
		case ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET:
			return commonInstructionSet != null;
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
		result.append(" (arch: ");
		result.append(arch);
		result.append(", archOption: ");
		if (archOptionESet)
			result.append(archOption);
		else
			result.append("<unset>");
		result.append(", endian: ");
		if (endianESet)
			result.append(endian);
		else
			result.append("<unset>");
		result.append(", masterType: ");
		result.append(masterType);
		result.append(", nChannel: ");
		if (nChannelESet)
			result.append(nChannel);
		else
			result.append("<unset>");
		result.append(", nThread: ");
		if (nThreadESet)
			result.append(nThread);
		else
			result.append("<unset>");
		result.append(", pid: ");
		if (pidESet)
			result.append(pid);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MasterComponentImpl
