/**
 */
package org.multicore_association.shim.edit.model.app.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData;
import org.multicore_association.shim.edit.model.app.AppPackage;

import org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Type Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.AccessTypeWizardPageDataImpl#getAccessTypePreferences <em>Access Type Preferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessTypeWizardPageDataImpl extends AbstractWizardPageDataImpl implements AccessTypeWizardPageData {
	/**
	 * The cached value of the '{@link #getAccessTypePreferences() <em>Access Type Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTypePreferences()
	 * @generated
	 * @ordered
	 */
	protected AccessTypePreferences accessTypePreferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessTypeWizardPageDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACCESS_TYPE_WIZARD_PAGE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessTypePreferences getAccessTypePreferences() {
		if (accessTypePreferences != null && accessTypePreferences.eIsProxy()) {
			InternalEObject oldAccessTypePreferences = (InternalEObject) accessTypePreferences;
			accessTypePreferences = (AccessTypePreferences) eResolveProxy(oldAccessTypePreferences);
			if (accessTypePreferences != oldAccessTypePreferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.ACCESS_TYPE_WIZARD_PAGE_DATA__ACCESS_TYPE_PREFERENCES, oldAccessTypePreferences,
							accessTypePreferences));
			}
		}
		return accessTypePreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTypePreferences basicGetAccessTypePreferences() {
		return accessTypePreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessTypePreferences(AccessTypePreferences newAccessTypePreferences) {
		AccessTypePreferences oldAccessTypePreferences = accessTypePreferences;
		accessTypePreferences = newAccessTypePreferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.ACCESS_TYPE_WIZARD_PAGE_DATA__ACCESS_TYPE_PREFERENCES, oldAccessTypePreferences,
					accessTypePreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AppPackage.ACCESS_TYPE_WIZARD_PAGE_DATA__ACCESS_TYPE_PREFERENCES:
			if (resolve)
				return getAccessTypePreferences();
			return basicGetAccessTypePreferences();
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
		case AppPackage.ACCESS_TYPE_WIZARD_PAGE_DATA__ACCESS_TYPE_PREFERENCES:
			setAccessTypePreferences((AccessTypePreferences) newValue);
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
		case AppPackage.ACCESS_TYPE_WIZARD_PAGE_DATA__ACCESS_TYPE_PREFERENCES:
			setAccessTypePreferences((AccessTypePreferences) null);
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
		case AppPackage.ACCESS_TYPE_WIZARD_PAGE_DATA__ACCESS_TYPE_PREFERENCES:
			return accessTypePreferences != null;
		}
		return super.eIsSet(featureID);
	}

} //AccessTypeWizardPageDataImpl
