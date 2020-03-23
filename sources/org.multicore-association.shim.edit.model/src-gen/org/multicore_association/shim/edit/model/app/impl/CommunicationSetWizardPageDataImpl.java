/**
 */
package org.multicore_association.shim.edit.model.app.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.AppPackage;
import org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData;

import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;

import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.SubSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Set Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.CommunicationSetWizardPageDataImpl#getCommunicationSetPreferences <em>Communication Set Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.CommunicationSetWizardPageDataImpl#getAddressSpace <em>Address Space</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.CommunicationSetWizardPageDataImpl#getSubSpace <em>Sub Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationSetWizardPageDataImpl extends AbstractWizardPageDataImpl
		implements CommunicationSetWizardPageData {
	/**
	 * The cached value of the '{@link #getCommunicationSetPreferences() <em>Communication Set Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 * @ordered
	 */
	protected CommunicationSetPreferences communicationSetPreferences;

	/**
	 * The cached value of the '{@link #getAddressSpace() <em>Address Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpace()
	 * @generated
	 * @ordered
	 */
	protected AddressSpace addressSpace;

	/**
	 * The cached value of the '{@link #getSubSpace() <em>Sub Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpace()
	 * @generated
	 * @ordered
	 */
	protected SubSpace subSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationSetWizardPageDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.COMMUNICATION_SET_WIZARD_PAGE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationSetPreferences getCommunicationSetPreferences() {
		if (communicationSetPreferences != null && communicationSetPreferences.eIsProxy()) {
			InternalEObject oldCommunicationSetPreferences = (InternalEObject) communicationSetPreferences;
			communicationSetPreferences = (CommunicationSetPreferences) eResolveProxy(oldCommunicationSetPreferences);
			if (communicationSetPreferences != oldCommunicationSetPreferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES,
							oldCommunicationSetPreferences, communicationSetPreferences));
			}
		}
		return communicationSetPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSetPreferences basicGetCommunicationSetPreferences() {
		return communicationSetPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommunicationSetPreferences(CommunicationSetPreferences newCommunicationSetPreferences) {
		CommunicationSetPreferences oldCommunicationSetPreferences = communicationSetPreferences;
		communicationSetPreferences = newCommunicationSetPreferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES,
					oldCommunicationSetPreferences, communicationSetPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressSpace getAddressSpace() {
		if (addressSpace != null && addressSpace.eIsProxy()) {
			InternalEObject oldAddressSpace = (InternalEObject) addressSpace;
			addressSpace = (AddressSpace) eResolveProxy(oldAddressSpace);
			if (addressSpace != oldAddressSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE, oldAddressSpace,
							addressSpace));
			}
		}
		return addressSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpace basicGetAddressSpace() {
		return addressSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressSpace(AddressSpace newAddressSpace) {
		AddressSpace oldAddressSpace = addressSpace;
		addressSpace = newAddressSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE, oldAddressSpace, addressSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubSpace getSubSpace() {
		if (subSpace != null && subSpace.eIsProxy()) {
			InternalEObject oldSubSpace = (InternalEObject) subSpace;
			subSpace = (SubSpace) eResolveProxy(oldSubSpace);
			if (subSpace != oldSubSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE, oldSubSpace, subSpace));
			}
		}
		return subSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSpace basicGetSubSpace() {
		return subSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubSpace(SubSpace newSubSpace) {
		SubSpace oldSubSpace = subSpace;
		subSpace = newSubSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE, oldSubSpace, subSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES:
			if (resolve)
				return getCommunicationSetPreferences();
			return basicGetCommunicationSetPreferences();
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE:
			if (resolve)
				return getAddressSpace();
			return basicGetAddressSpace();
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE:
			if (resolve)
				return getSubSpace();
			return basicGetSubSpace();
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
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES:
			setCommunicationSetPreferences((CommunicationSetPreferences) newValue);
			return;
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE:
			setAddressSpace((AddressSpace) newValue);
			return;
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE:
			setSubSpace((SubSpace) newValue);
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
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES:
			setCommunicationSetPreferences((CommunicationSetPreferences) null);
			return;
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE:
			setAddressSpace((AddressSpace) null);
			return;
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE:
			setSubSpace((SubSpace) null);
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
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES:
			return communicationSetPreferences != null;
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE:
			return addressSpace != null;
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE:
			return subSpace != null;
		}
		return super.eIsSet(featureID);
	}

} //CommunicationSetWizardPageDataImpl
