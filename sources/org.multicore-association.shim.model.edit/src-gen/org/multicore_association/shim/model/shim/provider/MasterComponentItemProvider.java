/**
 */
package org.multicore_association.shim.model.shim.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.ShimFactory;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.model.shim.MasterComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterComponentItemProvider extends AbstractComponentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterComponentItemProvider(AdapterFactory adapterFactory) {
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

			addCacheRefPropertyDescriptor(object);
			addArchPropertyDescriptor(object);
			addArchOptionPropertyDescriptor(object);
			addEndianPropertyDescriptor(object);
			addMasterTypePropertyDescriptor(object);
			addNChannelPropertyDescriptor(object);
			addNThreadPropertyDescriptor(object);
			addPidPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_MasterComponent_cacheRef_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_cacheRef_feature",
								"_UI_MasterComponent_type"),
						ShimPackage.Literals.MASTER_COMPONENT__CACHE_REF, true, false, true, null, null, null));
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
						getResourceLocator(), getString("_UI_MasterComponent_arch_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_arch_feature",
								"_UI_MasterComponent_type"),
						ShimPackage.Literals.MASTER_COMPONENT__ARCH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Arch Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponent_archOption_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_archOption_feature",
								"_UI_MasterComponent_type"),
						ShimPackage.Literals.MASTER_COMPONENT__ARCH_OPTION, true, false, false,
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
						getResourceLocator(), getString("_UI_MasterComponent_endian_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_endian_feature",
								"_UI_MasterComponent_type"),
						ShimPackage.Literals.MASTER_COMPONENT__ENDIAN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Master Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponent_masterType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_masterType_feature",
								"_UI_MasterComponent_type"),
						ShimPackage.Literals.MASTER_COMPONENT__MASTER_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the NChannel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNChannelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponent_nChannel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_nChannel_feature",
								"_UI_MasterComponent_type"),
						ShimPackage.Literals.MASTER_COMPONENT__NCHANNEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the NThread feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNThreadPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponent_nThread_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_nThread_feature",
								"_UI_MasterComponent_type"),
						ShimPackage.Literals.MASTER_COMPONENT__NTHREAD, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPidPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MasterComponent_pid_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_pid_feature",
								"_UI_MasterComponent_type"),
						ShimPackage.Literals.MASTER_COMPONENT__PID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(ShimPackage.Literals.MASTER_COMPONENT__ACCESS_TYPE_SET);
			childrenFeatures.add(ShimPackage.Literals.MASTER_COMPONENT__CLOCK_FREQUENCY);
			childrenFeatures.add(ShimPackage.Literals.MASTER_COMPONENT__COMMON_INSTRUCTION_SET);
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
	 * This returns MasterComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MasterComponent"));
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
		String label = ((MasterComponent) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MasterComponent_type")
				: getString("_UI_MasterComponent_type") + " " + label;
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

		switch (notification.getFeatureID(MasterComponent.class)) {
		case ShimPackage.MASTER_COMPONENT__ARCH:
		case ShimPackage.MASTER_COMPONENT__ARCH_OPTION:
		case ShimPackage.MASTER_COMPONENT__ENDIAN:
		case ShimPackage.MASTER_COMPONENT__MASTER_TYPE:
		case ShimPackage.MASTER_COMPONENT__NCHANNEL:
		case ShimPackage.MASTER_COMPONENT__NTHREAD:
		case ShimPackage.MASTER_COMPONENT__PID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET:
		case ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY:
		case ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(ShimPackage.Literals.MASTER_COMPONENT__ACCESS_TYPE_SET,
				ShimFactory.eINSTANCE.createAccessTypeSet()));

		newChildDescriptors.add(createChildParameter(ShimPackage.Literals.MASTER_COMPONENT__CLOCK_FREQUENCY,
				ShimFactory.eINSTANCE.createClockFrequency()));

		newChildDescriptors.add(createChildParameter(ShimPackage.Literals.MASTER_COMPONENT__COMMON_INSTRUCTION_SET,
				ShimFactory.eINSTANCE.createCommonInstructionSet()));
	}

}
