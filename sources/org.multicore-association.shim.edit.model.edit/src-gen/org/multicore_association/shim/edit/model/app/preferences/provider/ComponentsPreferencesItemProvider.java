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

import org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentsPreferencesItemProvider extends AbstractPreferencesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentsPreferencesItemProvider(AdapterFactory adapterFactory) {
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

			addSystemNamePropertyDescriptor(object);
			addNumberMasterPropertyDescriptor(object);
			addNumberSlavePropertyDescriptor(object);
			addNumberComponentPropertyDescriptor(object);
			addClockPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the System Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSystemNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentsPreferences_systemName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentsPreferences_systemName_feature",
								"_UI_ComponentsPreferences_type"),
						PreferencesPackage.Literals.COMPONENTS_PREFERENCES__SYSTEM_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Number Master feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberMasterPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentsPreferences_numberMaster_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ComponentsPreferences_numberMaster_feature", "_UI_ComponentsPreferences_type"),
						PreferencesPackage.Literals.COMPONENTS_PREFERENCES__NUMBER_MASTER, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Number Slave feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberSlavePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentsPreferences_numberSlave_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentsPreferences_numberSlave_feature",
								"_UI_ComponentsPreferences_type"),
						PreferencesPackage.Literals.COMPONENTS_PREFERENCES__NUMBER_SLAVE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Number Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentsPreferences_numberComponent_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ComponentsPreferences_numberComponent_feature", "_UI_ComponentsPreferences_type"),
						PreferencesPackage.Literals.COMPONENTS_PREFERENCES__NUMBER_COMPONENT, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Clock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentsPreferences_clock_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentsPreferences_clock_feature",
						"_UI_ComponentsPreferences_type"),
				PreferencesPackage.Literals.COMPONENTS_PREFERENCES__CLOCK, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ComponentsPreferences.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentsPreferences"));
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
		String label = ((ComponentsPreferences) object).getSystemName();
		return label == null || label.length() == 0 ? getString("_UI_ComponentsPreferences_type")
				: getString("_UI_ComponentsPreferences_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentsPreferences.class)) {
		case PreferencesPackage.COMPONENTS_PREFERENCES__SYSTEM_NAME:
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_MASTER:
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_SLAVE:
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_COMPONENT:
		case PreferencesPackage.COMPONENTS_PREFERENCES__CLOCK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

}
