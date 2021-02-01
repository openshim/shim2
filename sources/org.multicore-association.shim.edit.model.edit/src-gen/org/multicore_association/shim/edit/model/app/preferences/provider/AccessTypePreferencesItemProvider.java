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

import org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AccessTypePreferencesItemProvider extends AbstractComponentPreferencesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTypePreferencesItemProvider(AdapterFactory adapterFactory) {
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

			addCheckRPropertyDescriptor(object);
			addCheckWPropertyDescriptor(object);
			addCheckRWPropertyDescriptor(object);
			addCheckRWXPropertyDescriptor(object);
			addCheckRXPropertyDescriptor(object);
			addCheckXPropertyDescriptor(object);
			addAccessByteSizePropertyDescriptor(object);
			addNBurstPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Check R feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckRPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AccessTypePreferences_checkR_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AccessTypePreferences_checkR_feature",
						"_UI_AccessTypePreferences_type"),
				PreferencesPackage.Literals.ACCESS_TYPE_PREFERENCES__CHECK_R, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check W feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AccessTypePreferences_checkW_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AccessTypePreferences_checkW_feature",
						"_UI_AccessTypePreferences_type"),
				PreferencesPackage.Literals.ACCESS_TYPE_PREFERENCES__CHECK_W, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check RW feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckRWPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AccessTypePreferences_checkRW_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AccessTypePreferences_checkRW_feature",
								"_UI_AccessTypePreferences_type"),
						PreferencesPackage.Literals.ACCESS_TYPE_PREFERENCES__CHECK_RW, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check RWX feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckRWXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AccessTypePreferences_checkRWX_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AccessTypePreferences_checkRWX_feature",
								"_UI_AccessTypePreferences_type"),
						PreferencesPackage.Literals.ACCESS_TYPE_PREFERENCES__CHECK_RWX, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check RX feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckRXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AccessTypePreferences_checkRX_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AccessTypePreferences_checkRX_feature",
								"_UI_AccessTypePreferences_type"),
						PreferencesPackage.Literals.ACCESS_TYPE_PREFERENCES__CHECK_RX, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AccessTypePreferences_checkX_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AccessTypePreferences_checkX_feature",
						"_UI_AccessTypePreferences_type"),
				PreferencesPackage.Literals.ACCESS_TYPE_PREFERENCES__CHECK_X, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Access Byte Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessByteSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AccessTypePreferences_accessByteSize_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AccessTypePreferences_accessByteSize_feature", "_UI_AccessTypePreferences_type"),
						PreferencesPackage.Literals.ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the NBurst feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNBurstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_AccessTypePreferences_nBurst_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_AccessTypePreferences_nBurst_feature",
						"_UI_AccessTypePreferences_type"),
				PreferencesPackage.Literals.ACCESS_TYPE_PREFERENCES__NBURST, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns AccessTypePreferences.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AccessTypePreferences"));
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
		String label = ((AccessTypePreferences) object).getBaseName();
		return label == null || label.length() == 0 ? getString("_UI_AccessTypePreferences_type")
				: getString("_UI_AccessTypePreferences_type") + " " + label;
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

		switch (notification.getFeatureID(AccessTypePreferences.class)) {
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_R:
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_W:
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RW:
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RWX:
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_RX:
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__CHECK_X:
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE:
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES__NBURST:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

}
