/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Type Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl#isCheckR <em>Check R</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl#isCheckW <em>Check W</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl#isCheckRW <em>Check RW</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl#isCheckRWX <em>Check RWX</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl#isCheckRX <em>Check RX</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl#isCheckX <em>Check X</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl#getAccessByteSize <em>Access Byte Size</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AccessTypePreferencesImpl#getNBurst <em>NBurst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessTypePreferencesImpl extends AbstractComponentPreferencesImpl implements AccessTypePreferences {
	/**
	 * The default value of the '{@link #isCheckR() <em>Check R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckR()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_R_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckR() <em>Check R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckR()
	 * @generated
	 * @ordered
	 */
	protected boolean checkR = CHECK_R_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckW() <em>Check W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckW()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_W_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckW() <em>Check W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckW()
	 * @generated
	 * @ordered
	 */
	protected boolean checkW = CHECK_W_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckRW() <em>Check RW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckRW()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_RW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckRW() <em>Check RW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckRW()
	 * @generated
	 * @ordered
	 */
	protected boolean checkRW = CHECK_RW_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckRWX() <em>Check RWX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckRWX()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_RWX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckRWX() <em>Check RWX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckRWX()
	 * @generated
	 * @ordered
	 */
	protected boolean checkRWX = CHECK_RWX_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckRX() <em>Check RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckRX()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_RX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckRX() <em>Check RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckRX()
	 * @generated
	 * @ordered
	 */
	protected boolean checkRX = CHECK_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckX() <em>Check X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckX()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_X_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckX() <em>Check X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckX()
	 * @generated
	 * @ordered
	 */
	protected boolean checkX = CHECK_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessByteSize() <em>Access Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessByteSize()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_BYTE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessByteSize() <em>Access Byte Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessByteSize()
	 * @generated
	 * @ordered
	 */
	protected String accessByteSize = ACCESS_BYTE_SIZE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessTypePreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencesPackage.Literals.ACCESS_TYPE_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckR() {
		return checkR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckR(boolean newCheckR) {
		boolean oldCheckR = checkR;
		checkR = newCheckR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_R,
					oldCheckR, checkR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckW() {
		return checkW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckW(boolean newCheckW) {
		boolean oldCheckW = checkW;
		checkW = newCheckW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_W,
					oldCheckW, checkW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckRW() {
		return checkRW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckRW(boolean newCheckRW) {
		boolean oldCheckRW = checkRW;
		checkRW = newCheckRW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RW,
					oldCheckRW, checkRW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckRWX() {
		return checkRWX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckRWX(boolean newCheckRWX) {
		boolean oldCheckRWX = checkRWX;
		checkRWX = newCheckRWX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RWX,
					oldCheckRWX, checkRWX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckRX() {
		return checkRX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckRX(boolean newCheckRX) {
		boolean oldCheckRX = checkRX;
		checkRX = newCheckRX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RX,
					oldCheckRX, checkRX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckX() {
		return checkX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckX(boolean newCheckX) {
		boolean oldCheckX = checkX;
		checkX = newCheckX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_X,
					oldCheckX, checkX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessByteSize() {
		return accessByteSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessByteSize(String newAccessByteSize) {
		String oldAccessByteSize = accessByteSize;
		accessByteSize = newAccessByteSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE, oldAccessByteSize, accessByteSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNBurst() {
		return nBurst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNBurst(Integer newNBurst) {
		Integer oldNBurst = nBurst;
		nBurst = newNBurst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.ACCESS_TYPE_PREFERENCES__NBURST,
					oldNBurst, nBurst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_R:
			return isCheckR();
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_W:
			return isCheckW();
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RW:
			return isCheckRW();
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RWX:
			return isCheckRWX();
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RX:
			return isCheckRX();
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_X:
			return isCheckX();
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE:
			return getAccessByteSize();
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__NBURST:
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
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_R:
			setCheckR((Boolean) newValue);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_W:
			setCheckW((Boolean) newValue);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RW:
			setCheckRW((Boolean) newValue);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RWX:
			setCheckRWX((Boolean) newValue);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RX:
			setCheckRX((Boolean) newValue);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_X:
			setCheckX((Boolean) newValue);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE:
			setAccessByteSize((String) newValue);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__NBURST:
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
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_R:
			setCheckR(CHECK_R_EDEFAULT);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_W:
			setCheckW(CHECK_W_EDEFAULT);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RW:
			setCheckRW(CHECK_RW_EDEFAULT);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RWX:
			setCheckRWX(CHECK_RWX_EDEFAULT);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RX:
			setCheckRX(CHECK_RX_EDEFAULT);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_X:
			setCheckX(CHECK_X_EDEFAULT);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE:
			setAccessByteSize(ACCESS_BYTE_SIZE_EDEFAULT);
			return;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__NBURST:
			setNBurst(NBURST_EDEFAULT);
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
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_R:
			return checkR != CHECK_R_EDEFAULT;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_W:
			return checkW != CHECK_W_EDEFAULT;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RW:
			return checkRW != CHECK_RW_EDEFAULT;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RWX:
			return checkRWX != CHECK_RWX_EDEFAULT;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RX:
			return checkRX != CHECK_RX_EDEFAULT;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_X:
			return checkX != CHECK_X_EDEFAULT;
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE:
			return ACCESS_BYTE_SIZE_EDEFAULT == null ? accessByteSize != null
					: !ACCESS_BYTE_SIZE_EDEFAULT.equals(accessByteSize);
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__NBURST:
			return NBURST_EDEFAULT == null ? nBurst != null : !NBURST_EDEFAULT.equals(nBurst);
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
		result.append(" (checkR: ");
		result.append(checkR);
		result.append(", checkW: ");
		result.append(checkW);
		result.append(", checkRW: ");
		result.append(checkRW);
		result.append(", checkRWX: ");
		result.append(checkRWX);
		result.append(", checkRX: ");
		result.append(checkRX);
		result.append(", checkX: ");
		result.append(checkX);
		result.append(", accessByteSize: ");
		result.append(accessByteSize);
		result.append(", nBurst: ");
		result.append(nBurst);
		result.append(')');
		return result.toString();
	}

} //AccessTypePreferencesImpl
