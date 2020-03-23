/**
 */
package org.multicore_association.shim.edit.model.app.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData;
import org.multicore_association.shim.edit.model.app.AppPackage;

import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;

import org.multicore_association.shim.model.shim.SlaveComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Space Parameter Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.AddressSpaceParameterWizardPageDataImpl#getAddressSpacePreferences <em>Address Space Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.AddressSpaceParameterWizardPageDataImpl#getNumberOfAddressSpace <em>Number Of Address Space</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.AddressSpaceParameterWizardPageDataImpl#getTargetSlaveComponent <em>Target Slave Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressSpaceParameterWizardPageDataImpl extends AbstractWizardPageDataImpl
		implements AddressSpaceParameterWizardPageData {
	/**
	 * The cached value of the '{@link #getAddressSpacePreferences() <em>Address Space Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpacePreferences()
	 * @generated
	 * @ordered
	 */
	protected AddressSpacePreferences addressSpacePreferences;

	/**
	 * The default value of the '{@link #getNumberOfAddressSpace() <em>Number Of Address Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfAddressSpace()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ADDRESS_SPACE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfAddressSpace() <em>Number Of Address Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfAddressSpace()
	 * @generated
	 * @ordered
	 */
	protected int numberOfAddressSpace = NUMBER_OF_ADDRESS_SPACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargetSlaveComponent() <em>Target Slave Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSlaveComponent()
	 * @generated
	 * @ordered
	 */
	protected SlaveComponent targetSlaveComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressSpaceParameterWizardPageDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressSpacePreferences getAddressSpacePreferences() {
		if (addressSpacePreferences != null && addressSpacePreferences.eIsProxy()) {
			InternalEObject oldAddressSpacePreferences = (InternalEObject) addressSpacePreferences;
			addressSpacePreferences = (AddressSpacePreferences) eResolveProxy(oldAddressSpacePreferences);
			if (addressSpacePreferences != oldAddressSpacePreferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES,
							oldAddressSpacePreferences, addressSpacePreferences));
			}
		}
		return addressSpacePreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpacePreferences basicGetAddressSpacePreferences() {
		return addressSpacePreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressSpacePreferences(AddressSpacePreferences newAddressSpacePreferences) {
		AddressSpacePreferences oldAddressSpacePreferences = addressSpacePreferences;
		addressSpacePreferences = newAddressSpacePreferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES,
					oldAddressSpacePreferences, addressSpacePreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfAddressSpace() {
		return numberOfAddressSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfAddressSpace(int newNumberOfAddressSpace) {
		int oldNumberOfAddressSpace = numberOfAddressSpace;
		numberOfAddressSpace = newNumberOfAddressSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE,
					oldNumberOfAddressSpace, numberOfAddressSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlaveComponent getTargetSlaveComponent() {
		if (targetSlaveComponent != null && targetSlaveComponent.eIsProxy()) {
			InternalEObject oldTargetSlaveComponent = (InternalEObject) targetSlaveComponent;
			targetSlaveComponent = (SlaveComponent) eResolveProxy(oldTargetSlaveComponent);
			if (targetSlaveComponent != oldTargetSlaveComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT,
							oldTargetSlaveComponent, targetSlaveComponent));
			}
		}
		return targetSlaveComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaveComponent basicGetTargetSlaveComponent() {
		return targetSlaveComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetSlaveComponent(SlaveComponent newTargetSlaveComponent) {
		SlaveComponent oldTargetSlaveComponent = targetSlaveComponent;
		targetSlaveComponent = newTargetSlaveComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT,
					oldTargetSlaveComponent, targetSlaveComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES:
			if (resolve)
				return getAddressSpacePreferences();
			return basicGetAddressSpacePreferences();
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE:
			return getNumberOfAddressSpace();
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT:
			if (resolve)
				return getTargetSlaveComponent();
			return basicGetTargetSlaveComponent();
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
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES:
			setAddressSpacePreferences((AddressSpacePreferences) newValue);
			return;
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE:
			setNumberOfAddressSpace((Integer) newValue);
			return;
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT:
			setTargetSlaveComponent((SlaveComponent) newValue);
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
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES:
			setAddressSpacePreferences((AddressSpacePreferences) null);
			return;
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE:
			setNumberOfAddressSpace(NUMBER_OF_ADDRESS_SPACE_EDEFAULT);
			return;
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT:
			setTargetSlaveComponent((SlaveComponent) null);
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
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES:
			return addressSpacePreferences != null;
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE:
			return numberOfAddressSpace != NUMBER_OF_ADDRESS_SPACE_EDEFAULT;
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT:
			return targetSlaveComponent != null;
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
		result.append(" (numberOfAddressSpace: ");
		result.append(numberOfAddressSpace);
		result.append(')');
		return result.toString();
	}

} //AddressSpaceParameterWizardPageDataImpl
