/**
 */
package org.multicore_association.shim.edit.model.app.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.AppPackage;
import org.multicore_association.shim.edit.model.app.CacheWizardPageData;

import org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.CacheWizardPageDataImpl#getCacheDataPreferences <em>Cache Data Preferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CacheWizardPageDataImpl extends AbstractWizardPageDataImpl implements CacheWizardPageData {
	/**
	 * The cached value of the '{@link #getCacheDataPreferences() <em>Cache Data Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheDataPreferences()
	 * @generated
	 * @ordered
	 */
	protected CacheDataPreferences cacheDataPreferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CacheWizardPageDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.CACHE_WIZARD_PAGE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheDataPreferences getCacheDataPreferences() {
		if (cacheDataPreferences != null && cacheDataPreferences.eIsProxy()) {
			InternalEObject oldCacheDataPreferences = (InternalEObject) cacheDataPreferences;
			cacheDataPreferences = (CacheDataPreferences) eResolveProxy(oldCacheDataPreferences);
			if (cacheDataPreferences != oldCacheDataPreferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.CACHE_WIZARD_PAGE_DATA__CACHE_DATA_PREFERENCES, oldCacheDataPreferences,
							cacheDataPreferences));
			}
		}
		return cacheDataPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheDataPreferences basicGetCacheDataPreferences() {
		return cacheDataPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCacheDataPreferences(CacheDataPreferences newCacheDataPreferences) {
		CacheDataPreferences oldCacheDataPreferences = cacheDataPreferences;
		cacheDataPreferences = newCacheDataPreferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.CACHE_WIZARD_PAGE_DATA__CACHE_DATA_PREFERENCES, oldCacheDataPreferences,
					cacheDataPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AppPackage.CACHE_WIZARD_PAGE_DATA__CACHE_DATA_PREFERENCES:
			if (resolve)
				return getCacheDataPreferences();
			return basicGetCacheDataPreferences();
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
		case AppPackage.CACHE_WIZARD_PAGE_DATA__CACHE_DATA_PREFERENCES:
			setCacheDataPreferences((CacheDataPreferences) newValue);
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
		case AppPackage.CACHE_WIZARD_PAGE_DATA__CACHE_DATA_PREFERENCES:
			setCacheDataPreferences((CacheDataPreferences) null);
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
		case AppPackage.CACHE_WIZARD_PAGE_DATA__CACHE_DATA_PREFERENCES:
			return cacheDataPreferences != null;
		}
		return super.eIsSet(featureID);
	}

} //CacheWizardPageDataImpl
