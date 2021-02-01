/**
 */
package org.multicore_association.shim.edit.model.app.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.edit.model.app.AbstractWizardPageData;
import org.multicore_association.shim.edit.model.app.AppPackage;

import org.multicore_association.shim.model.shim.Shim;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.AbstractWizardPageDataImpl#getShim <em>Shim</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractWizardPageDataImpl extends MinimalEObjectImpl.Container
		implements AbstractWizardPageData {
	/**
	 * The cached value of the '{@link #getShim() <em>Shim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShim()
	 * @generated
	 * @ordered
	 */
	protected Shim shim;

	/**
	 * This is true if the Shim reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shimESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractWizardPageDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ABSTRACT_WIZARD_PAGE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shim getShim() {
		if (shim != null && shim.eIsProxy()) {
			InternalEObject oldShim = (InternalEObject) shim;
			shim = (Shim) eResolveProxy(oldShim);
			if (shim != oldShim) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.ABSTRACT_WIZARD_PAGE_DATA__SHIM, oldShim, shim));
			}
		}
		return shim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shim basicGetShim() {
		return shim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShim(Shim newShim) {
		Shim oldShim = shim;
		shim = newShim;
		boolean oldShimESet = shimESet;
		shimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.ABSTRACT_WIZARD_PAGE_DATA__SHIM, oldShim,
					shim, !oldShimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetShim() {
		Shim oldShim = shim;
		boolean oldShimESet = shimESet;
		shim = null;
		shimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AppPackage.ABSTRACT_WIZARD_PAGE_DATA__SHIM, oldShim,
					null, oldShimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetShim() {
		return shimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AppPackage.ABSTRACT_WIZARD_PAGE_DATA__SHIM:
			if (resolve)
				return getShim();
			return basicGetShim();
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
		case AppPackage.ABSTRACT_WIZARD_PAGE_DATA__SHIM:
			setShim((Shim) newValue);
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
		case AppPackage.ABSTRACT_WIZARD_PAGE_DATA__SHIM:
			unsetShim();
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
		case AppPackage.ABSTRACT_WIZARD_PAGE_DATA__SHIM:
			return isSetShim();
		}
		return super.eIsSet(featureID);
	}

} //AbstractWizardPageDataImpl
