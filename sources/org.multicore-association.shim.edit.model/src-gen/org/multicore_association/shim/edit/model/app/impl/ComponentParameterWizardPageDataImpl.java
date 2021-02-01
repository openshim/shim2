/**
 */
package org.multicore_association.shim.edit.model.app.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.AppPackage;
import org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData;

import org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences;
import org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Parameter Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.ComponentParameterWizardPageDataImpl#getComponentsPreferences <em>Components Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.ComponentParameterWizardPageDataImpl#getMasterComponentPreferences <em>Master Component Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.ComponentParameterWizardPageDataImpl#getSlaveComponentPreferences <em>Slave Component Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.impl.ComponentParameterWizardPageDataImpl#getComponentSetPreferences <em>Component Set Preferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentParameterWizardPageDataImpl extends AbstractWizardPageDataImpl
		implements ComponentParameterWizardPageData {
	/**
	 * The cached value of the '{@link #getComponentsPreferences() <em>Components Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsPreferences()
	 * @generated
	 * @ordered
	 */
	protected ComponentsPreferences componentsPreferences;

	/**
	 * The cached value of the '{@link #getMasterComponentPreferences() <em>Master Component Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterComponentPreferences()
	 * @generated
	 * @ordered
	 */
	protected MasterComponentPreferences masterComponentPreferences;

	/**
	 * The cached value of the '{@link #getSlaveComponentPreferences() <em>Slave Component Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveComponentPreferences()
	 * @generated
	 * @ordered
	 */
	protected SlaveComponentPreferences slaveComponentPreferences;

	/**
	 * The cached value of the '{@link #getComponentSetPreferences() <em>Component Set Preferences</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSetPreferences()
	 * @generated
	 * @ordered
	 */
	protected ComponentSetPreferences componentSetPreferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentParameterWizardPageDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.COMPONENT_PARAMETER_WIZARD_PAGE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsPreferences getComponentsPreferences() {
		if (componentsPreferences != null && componentsPreferences.eIsProxy()) {
			InternalEObject oldComponentsPreferences = (InternalEObject) componentsPreferences;
			componentsPreferences = (ComponentsPreferences) eResolveProxy(oldComponentsPreferences);
			if (componentsPreferences != oldComponentsPreferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES,
							oldComponentsPreferences, componentsPreferences));
			}
		}
		return componentsPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsPreferences basicGetComponentsPreferences() {
		return componentsPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentsPreferences(ComponentsPreferences newComponentsPreferences) {
		ComponentsPreferences oldComponentsPreferences = componentsPreferences;
		componentsPreferences = newComponentsPreferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES, oldComponentsPreferences,
					componentsPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MasterComponentPreferences getMasterComponentPreferences() {
		if (masterComponentPreferences != null && masterComponentPreferences.eIsProxy()) {
			InternalEObject oldMasterComponentPreferences = (InternalEObject) masterComponentPreferences;
			masterComponentPreferences = (MasterComponentPreferences) eResolveProxy(oldMasterComponentPreferences);
			if (masterComponentPreferences != oldMasterComponentPreferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES,
							oldMasterComponentPreferences, masterComponentPreferences));
			}
		}
		return masterComponentPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterComponentPreferences basicGetMasterComponentPreferences() {
		return masterComponentPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMasterComponentPreferences(MasterComponentPreferences newMasterComponentPreferences) {
		MasterComponentPreferences oldMasterComponentPreferences = masterComponentPreferences;
		masterComponentPreferences = newMasterComponentPreferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES,
					oldMasterComponentPreferences, masterComponentPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlaveComponentPreferences getSlaveComponentPreferences() {
		if (slaveComponentPreferences != null && slaveComponentPreferences.eIsProxy()) {
			InternalEObject oldSlaveComponentPreferences = (InternalEObject) slaveComponentPreferences;
			slaveComponentPreferences = (SlaveComponentPreferences) eResolveProxy(oldSlaveComponentPreferences);
			if (slaveComponentPreferences != oldSlaveComponentPreferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES,
							oldSlaveComponentPreferences, slaveComponentPreferences));
			}
		}
		return slaveComponentPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaveComponentPreferences basicGetSlaveComponentPreferences() {
		return slaveComponentPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlaveComponentPreferences(SlaveComponentPreferences newSlaveComponentPreferences) {
		SlaveComponentPreferences oldSlaveComponentPreferences = slaveComponentPreferences;
		slaveComponentPreferences = newSlaveComponentPreferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES,
					oldSlaveComponentPreferences, slaveComponentPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSetPreferences getComponentSetPreferences() {
		if (componentSetPreferences != null && componentSetPreferences.eIsProxy()) {
			InternalEObject oldComponentSetPreferences = (InternalEObject) componentSetPreferences;
			componentSetPreferences = (ComponentSetPreferences) eResolveProxy(oldComponentSetPreferences);
			if (componentSetPreferences != oldComponentSetPreferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES,
							oldComponentSetPreferences, componentSetPreferences));
			}
		}
		return componentSetPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSetPreferences basicGetComponentSetPreferences() {
		return componentSetPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponentSetPreferences(ComponentSetPreferences newComponentSetPreferences) {
		ComponentSetPreferences oldComponentSetPreferences = componentSetPreferences;
		componentSetPreferences = newComponentSetPreferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES,
					oldComponentSetPreferences, componentSetPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES:
			if (resolve)
				return getComponentsPreferences();
			return basicGetComponentsPreferences();
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES:
			if (resolve)
				return getMasterComponentPreferences();
			return basicGetMasterComponentPreferences();
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES:
			if (resolve)
				return getSlaveComponentPreferences();
			return basicGetSlaveComponentPreferences();
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES:
			if (resolve)
				return getComponentSetPreferences();
			return basicGetComponentSetPreferences();
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
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES:
			setComponentsPreferences((ComponentsPreferences) newValue);
			return;
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES:
			setMasterComponentPreferences((MasterComponentPreferences) newValue);
			return;
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES:
			setSlaveComponentPreferences((SlaveComponentPreferences) newValue);
			return;
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES:
			setComponentSetPreferences((ComponentSetPreferences) newValue);
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
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES:
			setComponentsPreferences((ComponentsPreferences) null);
			return;
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES:
			setMasterComponentPreferences((MasterComponentPreferences) null);
			return;
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES:
			setSlaveComponentPreferences((SlaveComponentPreferences) null);
			return;
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES:
			setComponentSetPreferences((ComponentSetPreferences) null);
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
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES:
			return componentsPreferences != null;
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES:
			return masterComponentPreferences != null;
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES:
			return slaveComponentPreferences != null;
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES:
			return componentSetPreferences != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentParameterWizardPageDataImpl
