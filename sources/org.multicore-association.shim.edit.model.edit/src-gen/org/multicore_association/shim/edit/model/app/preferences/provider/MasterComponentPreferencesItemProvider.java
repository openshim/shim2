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

import org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterComponentPreferencesItemProvider extends AbstractComponentPreferencesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterComponentPreferencesItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addEndianPropertyDescriptor(object);
			addArchPropertyDescriptor(object);
			addArchOptPropertyDescriptor(object);
			addNChannelPropertyDescriptor(object);
			addNThreadPropertyDescriptor(object);
			addCheckClockForMasterPropertyDescriptor(object);
			addClockPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponentPreferences_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponentPreferences_type_feature",
								"_UI_MasterComponentPreferences_type"),
						PreferencesPackage.Literals.MASTER_COMPONENT_PREFERENCES__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Endian feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndianPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponentPreferences_endian_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponentPreferences_endian_feature",
								"_UI_MasterComponentPreferences_type"),
						PreferencesPackage.Literals.MASTER_COMPONENT_PREFERENCES__ENDIAN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Arch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponentPreferences_arch_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponentPreferences_arch_feature",
								"_UI_MasterComponentPreferences_type"),
						PreferencesPackage.Literals.MASTER_COMPONENT_PREFERENCES__ARCH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Arch Opt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchOptPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MasterComponentPreferences_archOpt_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MasterComponentPreferences_archOpt_feature",
						"_UI_MasterComponentPreferences_type"),
				PreferencesPackage.Literals.MASTER_COMPONENT_PREFERENCES__ARCH_OPT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the NChannel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNChannelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MasterComponentPreferences_nChannel_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MasterComponentPreferences_nChannel_feature",
						"_UI_MasterComponentPreferences_type"),
				PreferencesPackage.Literals.MASTER_COMPONENT_PREFERENCES__NCHANNEL, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the NThread feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNThreadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_MasterComponentPreferences_nThread_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MasterComponentPreferences_nThread_feature",
						"_UI_MasterComponentPreferences_type"),
				PreferencesPackage.Literals.MASTER_COMPONENT_PREFERENCES__NTHREAD, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check Clock For Master feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckClockForMasterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponentPreferences_checkClockForMaster_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_MasterComponentPreferences_checkClockForMaster_feature",
								"_UI_MasterComponentPreferences_type"),
						PreferencesPackage.Literals.MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER, true, false,
						false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Clock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponentPreferences_clock_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponentPreferences_clock_feature",
								"_UI_MasterComponentPreferences_type"),
						PreferencesPackage.Literals.MASTER_COMPONENT_PREFERENCES__CLOCK, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns MasterComponentPreferences.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MasterComponentPreferences"));
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
		String label = ((MasterComponentPreferences) object).getBaseName();
		return label == null || label.length() == 0 ? getString("_UI_MasterComponentPreferences_type")
				: getString("_UI_MasterComponentPreferences_type") + " " + label;
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

		switch (notification.getFeatureID(MasterComponentPreferences.class)) {
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__TYPE:
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ENDIAN:
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH:
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__ARCH_OPT:
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NCHANNEL:
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__NTHREAD:
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER:
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES__CLOCK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

}
