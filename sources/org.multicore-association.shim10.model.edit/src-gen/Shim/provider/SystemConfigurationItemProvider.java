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
 * This is the item provider adapter for a {@link org.multicore_association.shim10.model.shim10.SystemConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemConfigurationItemProvider 
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
	public SystemConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addShimVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_SystemConfiguration_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemConfiguration_name_feature", "_UI_SystemConfiguration_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shim Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShimVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SystemConfiguration_shimVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SystemConfiguration_shimVersion_feature", "_UI_SystemConfiguration_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__SHIM_VERSION,
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
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__COMPONENT_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__COMMUNICATION_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY);
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
	 * This returns SystemConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.multicore_association.shim10.model.shim10.SystemConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SystemConfiguration_type") :
			getString("_UI_SystemConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(org.multicore_association.shim10.model.shim10.SystemConfiguration.class)) {
			case org.multicore_association.shim10.model.shim10.ShimPackage.SYSTEM_CONFIGURATION__NAME:
			case org.multicore_association.shim10.model.shim10.ShimPackage.SYSTEM_CONFIGURATION__SHIM_VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case org.multicore_association.shim10.model.shim10.ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY:
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
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__COMPONENT_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createComponentSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__COMMUNICATION_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createCommunicationSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createAddressSpaceSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createClockFrequency()));
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
