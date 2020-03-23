/**
 */
package org.multicore_association.shim.edit.model.app.preferences.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AddressSpacePreferencesItemProvider extends AbstractPreferencesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpacePreferencesItemProvider(AdapterFactory adapterFactory) {
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

			addNumberSubSpacePropertyDescriptor(object);
			addSizeSubSpacePropertyDescriptor(object);
			addAddressSpaceNamePropertyDescriptor(object);
			addSubSpaceNamePropertyDescriptor(object);
			addDontConnectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Number Sub Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberSubSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddressSpacePreferences_numberSubSpace_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AddressSpacePreferences_numberSubSpace_feature",
						"_UI_AddressSpacePreferences_type"),
				PreferencesPackage.Literals.ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Size Sub Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizeSubSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AddressSpacePreferences_sizeSubSpace_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AddressSpacePreferences_sizeSubSpace_feature", "_UI_AddressSpacePreferences_type"),
						PreferencesPackage.Literals.ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Address Space Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressSpaceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AddressSpacePreferences_addressSpaceName_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AddressSpacePreferences_addressSpaceName_feature",
						"_UI_AddressSpacePreferences_type"),
				PreferencesPackage.Literals.ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sub Space Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubSpaceNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AddressSpacePreferences_subSpaceName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AddressSpacePreferences_subSpaceName_feature", "_UI_AddressSpacePreferences_type"),
						PreferencesPackage.Literals.ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dont Connect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDontConnectPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AddressSpacePreferences_dontConnect_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AddressSpacePreferences_dontConnect_feature", "_UI_AddressSpacePreferences_type"),
						PreferencesPackage.Literals.ADDRESS_SPACE_PREFERENCES__DONT_CONNECT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AddressSpacePreferences.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AddressSpacePreferences"));
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
		String label = ((AddressSpacePreferences) object).getAddressSpaceName();
		return label == null || label.length() == 0 ? getString("_UI_AddressSpacePreferences_type")
				: getString("_UI_AddressSpacePreferences_type") + " " + label;
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

		switch (notification.getFeatureID(AddressSpacePreferences.class)) {
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE:
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE:
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME:
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME:
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES__DONT_CONNECT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

}
