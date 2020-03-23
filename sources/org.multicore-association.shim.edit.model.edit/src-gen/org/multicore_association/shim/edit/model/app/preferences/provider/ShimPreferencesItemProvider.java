/**
 */
package org.multicore_association.shim.edit.model.app.preferences.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.app.preferences.ShimPreferences;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShimPreferencesItemProvider extends AbstractPreferencesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimPreferencesItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__COMPONENTS_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__LATENCY_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__PITCH_PREFERENCES);
			childrenFeatures.add(PreferencesPackage.Literals.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ShimPreferences.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ShimPreferences"));
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
		return getString("_UI_ShimPreferences_type");
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

		switch (notification.getFeatureID(ShimPreferences.class)) {
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES:
		case PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

}
