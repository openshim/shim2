/**
 */
package org.multicore_association.shim.model.shim.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.multicore_association.shim.model.shim.Cache;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.model.shim.Cache} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CacheItemProvider extends AbstractComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheItemProvider(AdapterFactory adapterFactory) {
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

			addCacheTypePropertyDescriptor(object);
			addCacheCoherencyPropertyDescriptor(object);
			addSizePropertyDescriptor(object);
			addSizeUnitPropertyDescriptor(object);
			addNWayPropertyDescriptor(object);
			addLineSizePropertyDescriptor(object);
			addLockDownTypePropertyDescriptor(object);
			addPrefetchPropertyDescriptor(object);
			addPrefetchDistancePropertyDescriptor(object);
			addReplacementPropertyDescriptor(object);
			addWriteAllocatePropertyDescriptor(object);
			addWriteBackPropertyDescriptor(object);
			addCacheRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cache Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cache_cacheType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_cacheType_feature",
								"_UI_Cache_type"),
						ShimPackage.Literals.CACHE__CACHE_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cache Coherency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheCoherencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cache_cacheCoherency_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_cacheCoherency_feature",
								"_UI_Cache_type"),
						ShimPackage.Literals.CACHE__CACHE_COHERENCY, true, false, false,
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
						getResourceLocator(), getString("_UI_Cache_size_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_size_feature", "_UI_Cache_type"),
						ShimPackage.Literals.CACHE__SIZE, true, false, false,
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
						getResourceLocator(), getString("_UI_Cache_sizeUnit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_sizeUnit_feature", "_UI_Cache_type"),
						ShimPackage.Literals.CACHE__SIZE_UNIT, true, false, false,
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
						getResourceLocator(), getString("_UI_Cache_nWay_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_nWay_feature", "_UI_Cache_type"),
						ShimPackage.Literals.CACHE__NWAY, true, false, false,
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
						getResourceLocator(), getString("_UI_Cache_lineSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_lineSize_feature", "_UI_Cache_type"),
						ShimPackage.Literals.CACHE__LINE_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lock Down Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockDownTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cache_lockDownType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_lockDownType_feature",
								"_UI_Cache_type"),
						ShimPackage.Literals.CACHE__LOCK_DOWN_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prefetch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefetchPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cache_prefetch_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_prefetch_feature", "_UI_Cache_type"),
						ShimPackage.Literals.CACHE__PREFETCH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Prefetch Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefetchDistancePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cache_prefetchDistance_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_prefetchDistance_feature",
								"_UI_Cache_type"),
						ShimPackage.Literals.CACHE__PREFETCH_DISTANCE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Replacement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReplacementPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cache_replacement_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_replacement_feature",
								"_UI_Cache_type"),
						ShimPackage.Literals.CACHE__REPLACEMENT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Write Allocate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriteAllocatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cache_writeAllocate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_writeAllocate_feature",
								"_UI_Cache_type"),
						ShimPackage.Literals.CACHE__WRITE_ALLOCATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Write Back feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWriteBackPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cache_writeBack_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_writeBack_feature",
								"_UI_Cache_type"),
						ShimPackage.Literals.CACHE__WRITE_BACK, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cache Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Cache_cacheRef_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Cache_cacheRef_feature", "_UI_Cache_type"),
						ShimPackage.Literals.CACHE__CACHE_REF, true, false, true, null, null, null));
	}

	/**
	 * This returns Cache.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Cache"));
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
		String label = ((Cache) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Cache_type")
				: getString("_UI_Cache_type") + " " + label;
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

		switch (notification.getFeatureID(Cache.class)) {
		case ShimPackage.CACHE__CACHE_TYPE:
		case ShimPackage.CACHE__CACHE_COHERENCY:
		case ShimPackage.CACHE__SIZE:
		case ShimPackage.CACHE__SIZE_UNIT:
		case ShimPackage.CACHE__NWAY:
		case ShimPackage.CACHE__LINE_SIZE:
		case ShimPackage.CACHE__LOCK_DOWN_TYPE:
		case ShimPackage.CACHE__PREFETCH:
		case ShimPackage.CACHE__PREFETCH_DISTANCE:
		case ShimPackage.CACHE__REPLACEMENT:
		case ShimPackage.CACHE__WRITE_ALLOCATE:
		case ShimPackage.CACHE__WRITE_BACK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
