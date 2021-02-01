/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Save Policy Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.SavePolicyPreferencesImpl#getSavePolicy <em>Save Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SavePolicyPreferencesImpl extends AbstractPreferencesImpl implements SavePolicyPreferences {
	/**
	 * The default value of the '{@link #getSavePolicy() <em>Save Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSavePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SavePolicyType SAVE_POLICY_EDEFAULT = SavePolicyType.ALWAYS;

	/**
	 * The cached value of the '{@link #getSavePolicy() <em>Save Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSavePolicy()
	 * @generated
	 * @ordered
	 */
	protected SavePolicyType savePolicy = SAVE_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SavePolicyPreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencesPackage.Literals.SAVE_POLICY_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SavePolicyType getSavePolicy() {
		return savePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSavePolicy(SavePolicyType newSavePolicy) {
		SavePolicyType oldSavePolicy = savePolicy;
		savePolicy = newSavePolicy == null ? SAVE_POLICY_EDEFAULT : newSavePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SAVE_POLICY_PREFERENCES__SAVE_POLICY, oldSavePolicy, savePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PreferencesPackage.SAVE_POLICY_PREFERENCES__SAVE_POLICY:
			return getSavePolicy();
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
		case PreferencesPackage.SAVE_POLICY_PREFERENCES__SAVE_POLICY:
			setSavePolicy((SavePolicyType) newValue);
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
		case PreferencesPackage.SAVE_POLICY_PREFERENCES__SAVE_POLICY:
			setSavePolicy(SAVE_POLICY_EDEFAULT);
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
		case PreferencesPackage.SAVE_POLICY_PREFERENCES__SAVE_POLICY:
			return savePolicy != SAVE_POLICY_EDEFAULT;
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
		result.append(" (savePolicy: ");
		result.append(savePolicy);
		result.append(')');
		return result.toString();
	}

} //SavePolicyPreferencesImpl
