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

import org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

import org.multicore_association.shim.model.shim.CacheCoherencyType;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CacheDataUnitPreferencesItemProvider extends AbstractPreferencesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheDataUnitPreferencesItemProvider(AdapterFactory adapterFactory) {
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

			addCacheCoherenecyPropertyDescriptor(object);
			addSizePropertyDescriptor(object);
			addSizeUnitPropertyDescriptor(object);
			addNWayPropertyDescriptor(object);
			addLineSizePropertyDescriptor(object);
			addLockDownTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cache Coherenecy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheCoherenecyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CacheDataUnitPreferences_cacheCoherenecy_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CacheDataUnitPreferences_cacheCoherenecy_feature",
						"_UI_CacheDataUnitPreferences_type"),
				PreferencesPackage.Literals.CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CacheDataUnitPreferences_size_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CacheDataUnitPreferences_size_feature",
								"_UI_CacheDataUnitPreferences_type"),
						PreferencesPackage.Literals.CACHE_DATA_UNIT_PREFERENCES__SIZE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Size Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CacheDataUnitPreferences_sizeUnit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CacheDataUnitPreferences_sizeUnit_feature",
								"_UI_CacheDataUnitPreferences_type"),
						PreferencesPackage.Literals.CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the NWay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNWayPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CacheDataUnitPreferences_nWay_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CacheDataUnitPreferences_nWay_feature",
								"_UI_CacheDataUnitPreferences_type"),
						PreferencesPackage.Literals.CACHE_DATA_UNIT_PREFERENCES__NWAY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Line Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CacheDataUnitPreferences_lineSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CacheDataUnitPreferences_lineSize_feature",
								"_UI_CacheDataUnitPreferences_type"),
						PreferencesPackage.Literals.CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lock Down Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockDownTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CacheDataUnitPreferences_lockDownType_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CacheDataUnitPreferences_lockDownType_feature",
						"_UI_CacheDataUnitPreferences_type"),
				PreferencesPackage.Literals.CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CacheDataUnitPreferences.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CacheDataUnitPreferences"));
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
		CacheCoherencyType labelValue = ((CacheDataUnitPreferences) object).getCacheCoherenecy();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_CacheDataUnitPreferences_type")
				: getString("_UI_CacheDataUnitPreferences_type") + " " + label;
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

		switch (notification.getFeatureID(CacheDataUnitPreferences.class)) {
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY:
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE:
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT:
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__NWAY:
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE:
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

}
