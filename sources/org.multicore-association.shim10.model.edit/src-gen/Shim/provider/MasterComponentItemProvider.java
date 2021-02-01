/**
 */
package Shim.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim10.model.shim10.MasterComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MasterComponentItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
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

			addCachePropertyDescriptor(object);
			addArchPropertyDescriptor(object);
			addArchOptionPropertyDescriptor(object);
			addEndianPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addMasterTypePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNThreadPropertyDescriptor(object);
			addPidPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cache feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCachePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MasterComponent_Cache_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_Cache_feature", "_UI_MasterComponent_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__CACHE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MasterComponent_arch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_arch_feature", "_UI_MasterComponent_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__ARCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arch Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MasterComponent_archOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_archOption_feature", "_UI_MasterComponent_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__ARCH_OPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endian feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndianPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MasterComponent_endian_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_endian_feature", "_UI_MasterComponent_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__ENDIAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MasterComponent_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_id_feature", "_UI_MasterComponent_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Master Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MasterComponent_masterType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_masterType_feature", "_UI_MasterComponent_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__MASTER_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MasterComponent_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_name_feature", "_UI_MasterComponent_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the NThread feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNThreadPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MasterComponent_nThread_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_nThread_feature", "_UI_MasterComponent_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__NTHREAD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MasterComponent_pid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MasterComponent_pid_feature", "_UI_MasterComponent_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__PID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__COMMON_INSTRUCTION_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__CLOCK_FREQUENCY);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__ACCESS_TYPE_SET);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.multicore_association.shim10.model.shim10.MasterComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MasterComponent_type") :
			getString("_UI_MasterComponent_type") + " " + label;
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

		switch (notification.getFeatureID(org.multicore_association.shim10.model.shim10.MasterComponent.class)) {
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__ARCH:
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__ARCH_OPTION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__ENDIAN:
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__ID:
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__MASTER_TYPE:
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__NAME:
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__NTHREAD:
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__PID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__COMMON_INSTRUCTION_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__CLOCK_FREQUENCY:
			case org.multicore_association.shim10.model.shim10.ShimPackage.MASTER_COMPONENT__ACCESS_TYPE_SET:
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

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__COMMON_INSTRUCTION_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createCommonInstructionSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__CLOCK_FREQUENCY,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createClockFrequency()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.MASTER_COMPONENT__ACCESS_TYPE_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createAccessTypeSet()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Shim10EditPlugin.INSTANCE;
	}

}
