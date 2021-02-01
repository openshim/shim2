/**
 */
package org.multicore_association.shim.edit.model.app.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData;
import org.multicore_association.shim.edit.model.app.AppPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressSpaceParameterWizardPageDataItemProvider extends AbstractWizardPageDataItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpaceParameterWizardPageDataItemProvider(AdapterFactory adapterFactory) {
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

			addAddressSpacePreferencesPropertyDescriptor(object);
			addNumberOfAddressSpacePropertyDescriptor(object);
			addTargetSlaveComponentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Address Space Preferences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressSpacePreferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddressSpaceParameterWizardPageData_addressSpacePreferences_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddressSpaceParameterWizardPageData_addressSpacePreferences_feature",
						"_UI_AddressSpaceParameterWizardPageData_type"),
				AppPackage.Literals.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__ADDRESS_SPACE_PREFERENCES, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Number Of Address Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfAddressSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddressSpaceParameterWizardPageData_numberOfAddressSpace_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddressSpaceParameterWizardPageData_numberOfAddressSpace_feature",
						"_UI_AddressSpaceParameterWizardPageData_type"),
				AppPackage.Literals.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Slave Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetSlaveComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddressSpaceParameterWizardPageData_targetSlaveComponent_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AddressSpaceParameterWizardPageData_targetSlaveComponent_feature",
						"_UI_AddressSpaceParameterWizardPageData_type"),
				AppPackage.Literals.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__TARGET_SLAVE_COMPONENT, true, false, true,
				null, null, null));
	}

	/**
	 * This returns AddressSpaceParameterWizardPageData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddressSpaceParameterWizardPageData"));
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
		AddressSpaceParameterWizardPageData addressSpaceParameterWizardPageData = (AddressSpaceParameterWizardPageData) object;
		return getString("_UI_AddressSpaceParameterWizardPageData_type") + " "
				+ addressSpaceParameterWizardPageData.getNumberOfAddressSpace();
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

		switch (notification.getFeatureID(AddressSpaceParameterWizardPageData.class)) {
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA__NUMBER_OF_ADDRESS_SPACE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

}
