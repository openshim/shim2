/**
 */
package Shim.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim10.model.shim10.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ACCESSOR);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__CACHE);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__CLOCK_FREQUENCY);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__COMMUNICATION_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__COMPONENT_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__EVENT_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__FIFO_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__INSTRUCTION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__LATENCY);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__MASTER_COMPONENT);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE_SET);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__PITCH);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SLAVE_COMPONENT);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SUB_SPACE);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SYSTEM_CONFIGURATION);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(org.multicore_association.shim10.model.shim10.DocumentRoot.class)) {
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__ACCESSOR:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__ACCESS_TYPE_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__ADDRESS_SPACE_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__CACHE:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__CLOCK_FREQUENCY:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__COMMUNICATION_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__COMPONENT_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__CONNECTION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__CONNECTION_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__EVENT_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__FIFO_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__INSTRUCTION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__LATENCY:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__MASTER_COMPONENT:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__PERFORMANCE:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__PERFORMANCE_SET:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__PITCH:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__SLAVE_COMPONENT:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__SUB_SPACE:
			case org.multicore_association.shim10.model.shim10.ShimPackage.DOCUMENT_ROOT__SYSTEM_CONFIGURATION:
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
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createEventCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createFIFOCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createInterruptCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createSharedMemoryCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createSharedRegisterCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createLatency()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createPitch()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ACCESSOR,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createAccessor()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createAccessType()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ACCESS_TYPE_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createAccessTypeSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createAddressSpace()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ADDRESS_SPACE_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createAddressSpaceSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__CACHE,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createCache()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__CLOCK_FREQUENCY,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createClockFrequency()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__COMMON_INSTRUCTION_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createCommonInstructionSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__COMMUNICATION_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createCommunicationSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__COMPONENT_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createComponentSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__CONNECTION_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createConnectionSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__EVENT_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createEventCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__FIFO_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createFIFOCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__INSTRUCTION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createInterruptCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__LATENCY,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createLatency()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__MASTER_COMPONENT,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createMasterComponent()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createMasterSlaveBinding()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__MASTER_SLAVE_BINDING_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createMasterSlaveBindingSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__MEMORY_CONSISTENCY_MODEL,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createMemoryConsistencyModel()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createPerformance()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__PERFORMANCE_SET,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createPerformanceSet()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__PITCH,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createPitch()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createSharedMemoryCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createSharedRegisterCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SLAVE_COMPONENT,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createSlaveComponent()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SUB_SPACE,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createSubSpace()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SYSTEM_CONFIGURATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createSystemConfiguration()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_COMMUNICATION ||
			childFeature == org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__EVENT_COMMUNICATION ||
			childFeature == org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__FIFO_COMMUNICATION ||
			childFeature == org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__INTERRUPT_COMMUNICATION ||
			childFeature == org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SHARED_MEMORY_COMMUNICATION ||
			childFeature == org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__SHARED_REGISTER_COMMUNICATION ||
			childFeature == org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__ABSTRACT_PERFORMANCE ||
			childFeature == org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__LATENCY ||
			childFeature == org.multicore_association.shim10.model.shim10.ShimPackage.Literals.DOCUMENT_ROOT__PITCH;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
