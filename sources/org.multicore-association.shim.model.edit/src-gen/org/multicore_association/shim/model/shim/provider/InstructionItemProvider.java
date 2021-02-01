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

import org.multicore_association.shim.model.shim.Instruction;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.model.shim.Instruction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InstructionItemProvider extends AbstractInstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionItemProvider(AdapterFactory adapterFactory) {
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

			addImmediateBitWidthPropertyDescriptor(object);
			addInputBitWidthPropertyDescriptor(object);
			addInputPreservedPropertyDescriptor(object);
			addIsEmulatedPropertyDescriptor(object);
			addOperandAddressingPropertyDescriptor(object);
			addOperationPropertyDescriptor(object);
			addOutputBitWidthPropertyDescriptor(object);
			addSupportedSignednessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Immediate Bit Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImmediateBitWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Instruction_immediateBitWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instruction_immediateBitWidth_feature",
								"_UI_Instruction_type"),
						ShimPackage.Literals.INSTRUCTION__IMMEDIATE_BIT_WIDTH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Input Bit Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputBitWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Instruction_inputBitWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instruction_inputBitWidth_feature",
								"_UI_Instruction_type"),
						ShimPackage.Literals.INSTRUCTION__INPUT_BIT_WIDTH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Input Preserved feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPreservedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Instruction_inputPreserved_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instruction_inputPreserved_feature",
								"_UI_Instruction_type"),
						ShimPackage.Literals.INSTRUCTION__INPUT_PRESERVED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Emulated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsEmulatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Instruction_isEmulated_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instruction_isEmulated_feature",
								"_UI_Instruction_type"),
						ShimPackage.Literals.INSTRUCTION__IS_EMULATED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operand Addressing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperandAddressingPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Instruction_operandAddressing_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instruction_operandAddressing_feature",
								"_UI_Instruction_type"),
						ShimPackage.Literals.INSTRUCTION__OPERAND_ADDRESSING, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Instruction_operation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instruction_operation_feature",
								"_UI_Instruction_type"),
						ShimPackage.Literals.INSTRUCTION__OPERATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Output Bit Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputBitWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Instruction_outputBitWidth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instruction_outputBitWidth_feature",
								"_UI_Instruction_type"),
						ShimPackage.Literals.INSTRUCTION__OUTPUT_BIT_WIDTH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Supported Signedness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSupportedSignednessPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Instruction_supportedSignedness_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Instruction_supportedSignedness_feature",
								"_UI_Instruction_type"),
						ShimPackage.Literals.INSTRUCTION__SUPPORTED_SIGNEDNESS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Instruction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Instruction"));
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
		String label = ((Instruction) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Instruction_type")
				: getString("_UI_Instruction_type") + " " + label;
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

		switch (notification.getFeatureID(Instruction.class)) {
		case ShimPackage.INSTRUCTION__IMMEDIATE_BIT_WIDTH:
		case ShimPackage.INSTRUCTION__INPUT_BIT_WIDTH:
		case ShimPackage.INSTRUCTION__INPUT_PRESERVED:
		case ShimPackage.INSTRUCTION__IS_EMULATED:
		case ShimPackage.INSTRUCTION__OPERAND_ADDRESSING:
		case ShimPackage.INSTRUCTION__OPERATION:
		case ShimPackage.INSTRUCTION__OUTPUT_BIT_WIDTH:
		case ShimPackage.INSTRUCTION__SUPPORTED_SIGNEDNESS:
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
