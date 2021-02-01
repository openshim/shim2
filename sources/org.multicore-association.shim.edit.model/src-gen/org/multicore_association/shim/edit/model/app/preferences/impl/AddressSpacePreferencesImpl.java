/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Space Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AddressSpacePreferencesImpl#getNumberSubSpace <em>Number Sub Space</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AddressSpacePreferencesImpl#getSizeSubSpace <em>Size Sub Space</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AddressSpacePreferencesImpl#getAddressSpaceName <em>Address Space Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AddressSpacePreferencesImpl#getSubSpaceName <em>Sub Space Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.AddressSpacePreferencesImpl#isDontConnect <em>Dont Connect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressSpacePreferencesImpl extends AbstractPreferencesImpl implements AddressSpacePreferences {
	/**
	 * The default value of the '{@link #getNumberSubSpace() <em>Number Sub Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSubSpace()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_SUB_SPACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberSubSpace() <em>Number Sub Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSubSpace()
	 * @generated
	 * @ordered
	 */
	protected int numberSubSpace = NUMBER_SUB_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeSubSpace() <em>Size Sub Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeSubSpace()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_SUB_SPACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSizeSubSpace() <em>Size Sub Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeSubSpace()
	 * @generated
	 * @ordered
	 */
	protected int sizeSubSpace = SIZE_SUB_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressSpaceName() <em>Address Space Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_SPACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressSpaceName() <em>Address Space Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceName()
	 * @generated
	 * @ordered
	 */
	protected String addressSpaceName = ADDRESS_SPACE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubSpaceName() <em>Sub Space Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_SPACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubSpaceName() <em>Sub Space Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpaceName()
	 * @generated
	 * @ordered
	 */
	protected String subSpaceName = SUB_SPACE_NAME_EDEFAULT;

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
	protected AddressSpacePreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencesPackage.Literals.ADDRESS_SPACE_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberSubSpace() {
		return numberSubSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberSubSpace(int newNumberSubSpace) {
		int oldNumberSubSpace = numberSubSpace;
		numberSubSpace = newNumberSubSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE, oldNumberSubSpace, numberSubSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSizeSubSpace() {
		return sizeSubSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSizeSubSpace(int newSizeSubSpace) {
		int oldSizeSubSpace = sizeSubSpace;
		sizeSubSpace = newSizeSubSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE, oldSizeSubSpace, sizeSubSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddressSpaceName() {
		return addressSpaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressSpaceName(String newAddressSpaceName) {
		String oldAddressSpaceName = addressSpaceName;
		addressSpaceName = newAddressSpaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME, oldAddressSpaceName,
					addressSpaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubSpaceName() {
		return subSpaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubSpaceName(String newSubSpaceName) {
		String oldSubSpaceName = subSpaceName;
		subSpaceName = newSubSpaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME, oldSubSpaceName, subSpaceName));
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
					PreferencesPackage.ADDRESS_SPACE_PREFERENCES__DONT_CONNECT, oldDontConnect, dontConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE:
			return getNumberSubSpace();
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE:
			return getSizeSubSpace();
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME:
			return getAddressSpaceName();
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME:
			return getSubSpaceName();
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__DONT_CONNECT:
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
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE:
			setNumberSubSpace((Integer) newValue);
			return;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE:
			setSizeSubSpace((Integer) newValue);
			return;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME:
			setAddressSpaceName((String) newValue);
			return;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME:
			setSubSpaceName((String) newValue);
			return;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__DONT_CONNECT:
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
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE:
			setNumberSubSpace(NUMBER_SUB_SPACE_EDEFAULT);
			return;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE:
			setSizeSubSpace(SIZE_SUB_SPACE_EDEFAULT);
			return;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME:
			setAddressSpaceName(ADDRESS_SPACE_NAME_EDEFAULT);
			return;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME:
			setSubSpaceName(SUB_SPACE_NAME_EDEFAULT);
			return;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__DONT_CONNECT:
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
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE:
			return numberSubSpace != NUMBER_SUB_SPACE_EDEFAULT;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE:
			return sizeSubSpace != SIZE_SUB_SPACE_EDEFAULT;
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME:
			return ADDRESS_SPACE_NAME_EDEFAULT == null ? addressSpaceName != null
					: !ADDRESS_SPACE_NAME_EDEFAULT.equals(addressSpaceName);
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME:
			return SUB_SPACE_NAME_EDEFAULT == null ? subSpaceName != null
					: !SUB_SPACE_NAME_EDEFAULT.equals(subSpaceName);
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__DONT_CONNECT:
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
		result.append(" (numberSubSpace: ");
		result.append(numberSubSpace);
		result.append(", sizeSubSpace: ");
		result.append(sizeSubSpace);
		result.append(", addressSpaceName: ");
		result.append(addressSpaceName);
		result.append(", subSpaceName: ");
		result.append(subSpaceName);
		result.append(", dontConnect: ");
		result.append(dontConnect);
		result.append(')');
		return result.toString();
	}

} //AddressSpacePreferencesImpl
