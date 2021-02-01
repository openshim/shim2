/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.actions;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.common.spi.ChildrenDescriptorCollector;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emfforms.spi.swt.treemasterdetail.util.CreateChildAction;
import org.eclipse.emfforms.spi.swt.treemasterdetail.util.CreateElementCallback;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.MasterComponent;

/**
 * This is the action bar contributor for the SHIM editor.
 */
public class ShimObjectMenuManager extends MenuManager implements IMenuListener {

	protected TreeViewer treeViewer;
	private CreateElementCallback createElementCallback;
	private ChildrenDescriptorCollector childrenDescriptorCollector;

	/**
	 * Constructs a new instance of ShimObjectMenuManager.
	 * 
	 * @param tv
	 *            the tree viewer with this menu
	 */
	public ShimObjectMenuManager(TreeViewer treeViewer) {
		this.treeViewer = treeViewer;
		this.createElementCallback = new CreateElementCallback() {

			@Override
			public void initElement(EObject parent, EReference reference, EObject newObject) {
				ShimObjectMenuManager.initObject(parent, newObject);
			}

			@Override
			public boolean beforeCreateElement(Object newElement) {
				return true;
			}

			@Override
			public void afterCreateElement(Object newElement) {
			}
		};
		this.childrenDescriptorCollector = new ChildrenDescriptorCollector();

		this.setRemoveAllWhenShown(true);

		this.addMenuListener(this);
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
		if (treeViewer.getSelection().isEmpty()) {
			return;
		}

		if (treeViewer.getSelection() instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();

			if (selection.size() == 1 && selection.getFirstElement() instanceof EObject) {
				EObject eObject = (EObject) selection.getFirstElement();
				addCreateChildrenActions(manager, eObject);

				manager.add(new Separator());
			}

			addEditActions(manager, selection);
		}
	}

	protected void addCreateChildrenActions(IMenuManager manager, EObject eObject) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
		if (domain == null) {
			return;
		}
		final Collection<?> descriptors = childrenDescriptorCollector.getDescriptors(eObject);
		fillContextMenu(manager, descriptors, domain, eObject);
	}

	protected void addEditActions(IMenuManager manager, IStructuredSelection selection) {
		if (selection == null || selection.isEmpty()) {
			return;
		}

		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(selection.getFirstElement());
		if (editingDomain == null) {
			return;
		}

		CutAction cutAction = new CutAction(editingDomain);
		cutAction.setText("Cut@Ctrl+X");
		cutAction.selectionChanged(selection);
		manager.add(cutAction);

		CopyAction copyAction = new CopyAction(editingDomain);
		copyAction.setText("Copy@Ctrl+C");
		copyAction.selectionChanged(selection);
		manager.add(copyAction);

		PasteAction pasteAction = new PasteAction(editingDomain);
		pasteAction.setText("Paste@Ctrl+V");
		pasteAction.selectionChanged(selection);
		manager.add(pasteAction);

		DeleteAction deleteAction = new DeleteAction(editingDomain, true);
		deleteAction.setText("Delete@Delete");
		deleteAction.selectionChanged(selection);
		manager.add(deleteAction);
	}

	private static void initObject(EObject current, EObject newObject) {
		EClass child = newObject.eClass();

		DefaultDataStore.initDefaultSet(newObject);

		// The name attribute should be unique.
		ShimUtils.getNameAttribute(newObject).ifPresent(attribute -> {

			Collection<String> names = ShimUtils.findChildReferenceByClass(current, child)
					.filter(x -> x.isContainment())
					.flatMap(reference -> {
						Object x = current.eGet(reference);
						if (x instanceof Collection) {
							@SuppressWarnings("unchecked")
							Collection<EObject> list = (Collection<EObject>) x;
							return Optional.of(list);
						}
						return Optional.empty();
					})
					.map(list -> list.stream()
							.map(x -> (String) x.eGet(attribute))
							.collect(Collectors.toSet()))
					.orElse(Collections.emptySet());

			String name = EcoreUtil.convertToString(
					attribute.getEAttributeType(), newObject.eGet(attribute));

			if (!StringUtils.endsWithAny(name,
					DefaultDataStore.CHILD_SUB_NAME,
					DefaultDataStore.CHILD_SUB_NAME.substring(0, 1))) {
				name = name + DefaultDataStore.CHILD_SUB_NAME;
			}

			String newName = "";
			for (int i = 1; i < 1000; i++) {
				String suffix = String.format("%d", i);
				String oldChar = DefaultDataStore.CHILD_SUB_NAME.substring(1);
				newName = name.replace(oldChar, suffix);
				if (!names.contains(newName)) {
					break;
				}
			}
			newObject.eSet(attribute, newName);
		});

		// If newObject is MasterComponent, set CommonInstructionSet in this
		// method.
		if (newObject instanceof MasterComponent) {
			ShimModelManager
					.setCommonInstructionSetToSingleMasterComponent((MasterComponent) newObject);
		}
	}

	/**
	 * Fill context menu.
	 *
	 * @param manager The menu manager responsible for the context menu
	 * @param descriptors The menu items to be added
	 * @param domain The editing domain of the current EObject
	 * @param eObject The model element
	 */
	private void fillContextMenu(IMenuManager manager, Collection<?> descriptors, final EditingDomain domain,
		final EObject eObject) {
		for (final Object descriptor : descriptors) {

			if (!CommandParameter.class.isInstance(descriptor)) {
				continue;
			}
			final CommandParameter cp = (CommandParameter) descriptor;
			if (cp.getEReference() == null) {
				continue;
			}
			if (filterDescriptor(cp)) {
				continue;
			}
			if (!cp.getEReference().isMany() && eObject.eIsSet(cp.getEStructuralFeature())) {
				continue;
			} else if (cp.getEReference().isMany() && cp.getEReference().getUpperBound() != -1
				&& cp.getEReference().getUpperBound() <= ((List<?>) eObject.eGet(cp.getEReference())).size()) {
				continue;
			}

			manager.add(createCreateChildAction(domain, eObject, cp));
		}

	}

	/**
	 * Creates a new child creation action based on the given {@link CommandParameter}. Subclasses might override this
	 * to customize the action creation (e.g. an action's label).
	 *
	 * @param domain The {@link EditingDomain} the element is be created with
	 * @param eObject The parent object the element is added to
	 * @param cp The {@link CommandParameter} creating the element when executed
	 * @return The action creating a new child when ran
	 * @since 1.20
	 */
	protected IAction createCreateChildAction(final EditingDomain domain, final EObject eObject,
		final CommandParameter cp) {
		return new CreateChildAction(eObject, domain, treeViewer, cp, createElementCallback);
	}

	/**
	 * Allows to prevent adding a create child action for the given {@link CommandParameter}.
	 *
	 * @param cp the descriptor
	 * @return <code>true</code> if action should be filtered (=not created), <code>false</code> otherwise
	 * @since 1.8
	 */
	protected boolean filterDescriptor(CommandParameter cp) {
		return false;
	}
}
