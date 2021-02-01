/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfforms.spi.swt.treemasterdetail.MenuProvider;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeMasterDetailComposite;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeMasterDetailSWTFactory;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeViewerBuilder;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TreeColumn;
import org.multicore_association.shim.edit.actions.ShimObjectMenuManager;
import org.multicore_association.shim.edit.gui.jface.ShimTreeViewer;
import org.multicore_association.shim.edit.gui.swt.viewer.ShimTreeLabelProvider;
import org.multicore_association.shim.edit.handler.shim.RenumberAddressSpaceSetHandler;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.AddressSpaceSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.MemoryConsistencyModel;
import org.multicore_association.shim.model.shim.OrderingType;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimFactory;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SubSpace;
import org.multicore_association.shim.model.shim.SystemConfiguration;

/**
 * Wizard page that allows configuration of the AddressSpace.
 */
public class AddressSpaceEditorWizardPage extends ShimEditorWizardPageBase
		implements SelectionListener {

	private static final int TREE_WIDTH = 250;

	private static final Logger log = ShimLoggerUtil
			.getLogger(AddressSpaceEditorWizardPage.class);

	private ShimTreeViewer treeViewer;
	private Button btnReNumber;

	private AddressSpaceSet addressSpaceSet;

	private TreeMasterDetailComposite view;

	private Composite container;

	/**
	 * Constructs a new instance of AddressSpaceEditorWizardPage.
	 */
	public AddressSpaceEditorWizardPage() {
		super("wizardPage");
		setTitle("Setting  AddressSpace");
		setDescription("View and Edit AddressSpaces and SubSpaces.\nIf you click on Back button, the information that you edited is destroyed.");
	}

	@Override
	public void dispose() {
		if (view != null) {
			view.dispose();
			view = null;
		}
		if (treeViewer != null) {
			treeViewer.getControl().dispose();
			treeViewer = null;
		}
		if (btnReNumber != null) {
			btnReNumber.dispose();
			btnReNumber = null;
		}

		super.dispose();
	}

	/**
	 * Creates contents of this page.
	 * 
	 * @param parent
	 *            the parent composite
	 */
	@Override
	public void createControl(Composite parent) {

		log.finest("In ShimWizardPage_AddressSpace::createControl()----");
		container = new Composite(parent, SWT.NULL);

		setControl(container);
		GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 0).applyTo(container);

		render(null);
	}

	private void render(EObject input) {
		if (view != null) {
			view.dispose();
			view = null;
		}
		if (treeViewer != null) {
			treeViewer.getControl().dispose();
			treeViewer = null;
		}
		if (btnReNumber != null) {
			btnReNumber.dispose();
			btnReNumber = null;
		}

		view = TreeMasterDetailSWTFactory.fillDefaults(container, SWT.NONE, input)
				.customizeTree(new TreeViewerBuilderForWizard())
				.customizeLabelProvider(new ShimTreeLabelProvider())
				.customizeViewerFilters(new ViewerFilter[] { new ViewerFilterForWizard() })
				.customizeMenu(new MenuProvider() {
					@Override
					public Menu getMenu(TreeViewer treeViewer, EditingDomain editingDomain) {
						return new MenuManagerForWizard(treeViewer).createContextMenu(treeViewer.getControl());
					}
				})
				.customizeInitialTreeWidth(TREE_WIDTH)
				.create();

		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(view);

		container.layout();
	}

	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetDefaultSelected(SelectionEvent event) {
		// NOOP
	}

	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 */
	@Override
	public void widgetSelected(SelectionEvent event) {
		if (event.getSource() == btnReNumber) {
			performRenumber(event);
		}
	}

	/**
	 * Activates 'Re-number nodes' action.
	 * 
	 * @param event
	 *            the notified SelectionEvent
	 */
	protected void performRenumber(SelectionEvent event) {
		Shim shim = ShimUtils.getShim(addressSpaceSet);
		RenumberAddressSpaceSetHandler.renumberAddressSpaceSet(shim);
		treeViewer.refresh();
	}

	/**
	 * Creates an AddressSpaceSet from the input preferences.
	 */
	public void createAddressSpaceSet(SystemConfiguration sys) {
		addressSpaceSet = (AddressSpaceSet) DefaultDataStore.getDefaultSet(
				ShimPackage.eINSTANCE.getAddressSpaceSet());

		sys.setAddressSpaceSet(addressSpaceSet);

		List<AddressSpace> asList = addressSpaceSet.getAddressSpace();
		asList.clear();

		List<ComponentSet> csetList = ShimModelManager.makeComponentSetList(sys);

		Map<ComponentSet, AddressSpace> ca_map = new HashMap<ComponentSet, AddressSpace>();

		AddressSpacePreferences asParameter = ShimWrappedPreferences
				.getCurrentInstance().getAddressSpacePreferences();
		String as_prefix = asParameter.getAddressSpaceName();
		String ss_prefix = ShimWrappedPreferences.getCurrentInstance()
				.getAddressSpacePreferences().getSubSpaceName();

		for (ComponentSet cset : csetList) {
			AddressSpace as = (AddressSpace) DefaultDataStore
					.getDefaultInstance(ShimPackage.eINSTANCE.getAddressSpace());

			as.setName(as_prefix
					+ cset.getName().substring(cset.getName().indexOf("_")));
			asList.add(as);
			ca_map.put(cset, as);
		}

		for (int i = 0; i < asList.size(); i++) {
			AddressSpace as = asList.get(i);
			List<SubSpace> subspacelist = as.getSubSpace();
			int nsub = asParameter.getNumberSubSpace();

			int startAddress = 0;

			int subSpaceSize = asParameter.getSizeSubSpace();

			log.finest("******SubSpace Size = " + subSpaceSize);

			int subSpaceAddress = startAddress;

			for (int j = 0; j < nsub; j++) {
				SubSpace ss = (SubSpace) DefaultDataStore
						.getDefaultInstance(ShimPackage.eINSTANCE.getSubSpace());

				ss.setName(ss_prefix
						+ as.getName().substring(as.getName().indexOf("_"))
						+ "_" + j);

				Integer startSubSpaceAddress = subSpaceAddress;
				Integer endSubSpaceAddress = subSpaceAddress + subSpaceSize - 1;

				ss.setStart(startSubSpaceAddress);
				ss.setEnd(endSubSpaceAddress);

				ss.setEndian(EndianType.LITTLE);

				MemoryConsistencyModel mcm = ShimFactory.eINSTANCE.createMemoryConsistencyModel();
				mcm.setRarOrdering(OrderingType.ORDERED);
				mcm.setRawOrdering(OrderingType.ORDERED);
				mcm.setWarOrdering(OrderingType.ORDERED);
				mcm.setWawOrdering(OrderingType.ORDERED);

				ss.getMemoryConsistencyModel().add(mcm);

				subspacelist.add(ss);

				subSpaceAddress += subSpaceSize;
			}
		}

		log.finest("****csetList.size() = " + csetList.size());
		log.finest("****addressSpaceList.size() = " + asList.size());

		render(addressSpaceSet);

		if (!addressSpaceSet.getAddressSpace().isEmpty()) {
			treeViewer.setSelection(new StructuredSelection(addressSpaceSet.getAddressSpace().get(0)));
		}
	}

	private class TreeViewerBuilderForWizard implements TreeViewerBuilder {
		@Override
		public TreeViewer createTree(Composite parent) {
			treeViewer = new ShimTreeViewer(parent);
			treeViewer.setExpandPreCheckFilters(true);
			treeViewer.setAutoExpandLevel(3);

			GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(treeViewer.getControl());

			TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
			TreeColumn treeColumn = treeViewerColumn.getColumn();
			treeColumn.setWidth(TREE_WIDTH);

			Composite composite = new Composite(parent, SWT.NONE);
			GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.END).applyTo(composite);
			GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 0).applyTo(composite);

			btnReNumber = new Button(composite, SWT.NONE);
			btnReNumber.addSelectionListener(AddressSpaceEditorWizardPage.this);
			btnReNumber.setText("Re-number nodes");

			return treeViewer;
		}
	}

	private static class ViewerFilterForWizard extends ViewerFilter {
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (parentElement instanceof AddressSpaceSet
					|| parentElement instanceof AddressSpace) {
				return true;
			}
			return false;
		}
	}

	private class MenuManagerForWizard extends ShimObjectMenuManager {
		private MenuManagerForWizard(TreeViewer treeViewer) {
			super(treeViewer);
		}

		@Override
		public void menuAboutToShow(IMenuManager manager) {
			if (treeViewer.getSelection() instanceof IStructuredSelection) {
				IStructuredSelection selection = (IStructuredSelection) treeViewer.getSelection();

				if (selection.isEmpty()) {
					return;
				}

				EObject node = (EObject) selection.getFirstElement();
				if (node instanceof AddressSpace
						&& treeViewer.getTree().getSelectionCount() == 1) {
					addCreateChildrenActions(manager, node);

					manager.add(new Separator());
				}

				addEditActions(manager, selection);
			}
		}
	}
}
