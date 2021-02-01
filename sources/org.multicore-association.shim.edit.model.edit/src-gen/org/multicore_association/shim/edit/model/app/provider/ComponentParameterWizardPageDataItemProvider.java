/**
 */
package org.multicore_association.shim.edit.model.app.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.multicore_association.shim.edit.model.app.AppPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentParameterWizardPageDataItemProvider extends AbstractWizardPageDataItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameterWizardPageDataItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addComponentsPreferencesPropertyDescriptor(object);
			addMasterComponentPreferencesPropertyDescriptor(object);
			addSlaveComponentPreferencesPropertyDescriptor(object);
			addComponentSetPreferencesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Components Preferences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentsPreferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentParameterWizardPageData_componentsPreferences_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ComponentParameterWizardPageData_componentsPreferences_feature",
						"_UI_ComponentParameterWizardPageData_type"),
				AppPackage.Literals.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENTS_PREFERENCES, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Master Component Preferences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterComponentPreferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentParameterWizardPageData_masterComponentPreferences_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ComponentParameterWizardPageData_masterComponentPreferences_feature",
						"_UI_ComponentParameterWizardPageData_type"),
				AppPackage.Literals.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__MASTER_COMPONENT_PREFERENCES, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Slave Component Preferences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSlaveComponentPreferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentParameterWizardPageData_slaveComponentPreferences_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ComponentParameterWizardPageData_slaveComponentPreferences_feature",
						"_UI_ComponentParameterWizardPageData_type"),
				AppPackage.Literals.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__SLAVE_COMPONENT_PREFERENCES, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Component Set Preferences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentSetPreferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentParameterWizardPageData_componentSetPreferences_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ComponentParameterWizardPageData_componentSetPreferences_feature",
						"_UI_ComponentParameterWizardPageData_type"),
				AppPackage.Literals.COMPONENT_PARAMETER_WIZARD_PAGE_DATA__COMPONENT_SET_PREFERENCES, true, false, true,
				null, null, null));
	}

	/**
	 * This returns ComponentParameterWizardPageData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentParameterWizardPageData"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ComponentParameterWizardPageData_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
	}

}
