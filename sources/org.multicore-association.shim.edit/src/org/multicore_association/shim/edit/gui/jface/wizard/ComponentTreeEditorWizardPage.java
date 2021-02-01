/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfforms.spi.swt.treemasterdetail.MenuProvider;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeViewerBuilder;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeViewerSWTFactory;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.multicore_association.shim.edit.actions.ShimObjectMenuManager;
import org.multicore_association.shim.edit.gui.jface.ShimTreeViewer;
import org.multicore_association.shim.edit.gui.swt.viewer.ShimTreeLabelProvider;
import org.multicore_association.shim.edit.handler.shim.RenumberComponentSetHandler;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimFactory;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SlaveComponent;
import org.multicore_association.shim.model.shim.SystemConfiguration;

/**
 * Wizard page that allows configuration of the Components.
 */
public class ComponentTreeEditorWizardPage extends ShimEditorWizardPageBase
		implements SelectionListener {

	private static final Logger log = ShimLoggerUtil
			.getLogger(ComponentTreeEditorWizardPage.class);

	public TreeViewer treeViewer;
	public Button btnReNumber;

	public ComponentSet root;

	private Composite container;

	/**
	 * Constructs a new instance of ComponentTreeEditorWizardPage.
	 */
	public ComponentTreeEditorWizardPage() {
		super("wizardPage");
		setTitle("Edit Component Structure");
		setDescription("View and Edit Component Set Structure.\nIf you click on Back button, the information that you edited is destroyed.");
	}

	@Override
	public void dispose() {
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

		log.finest("In ShimWizardPage_TreeEdit::createControl()----");
		container = new Composite(parent, SWT.NULL);

		setControl(container);
		GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 0).applyTo(container);

		render(null);
	}

	private void render(EObject input) {
		if (treeViewer != null) {
			treeViewer.getControl().dispose();
			treeViewer = null;
		}
		if (btnReNumber != null) {
			btnReNumber.dispose();
			btnReNumber = null;
		}

		treeViewer = TreeViewerSWTFactory.fillDefaults(container, input)
				.customizeTree(new TreeViewerBuilderForWizard())
				.customizeLabelProvider(new ShimTreeLabelProvider())
				.customizeViewerFilters(new ViewerFilter[] { new ViewerFilterForWizard() })
				.customizeMenu(new MenuProvider() {
					@Override
					public Menu getMenu(TreeViewer treeViewer, EditingDomain editingDomain) {
						return new MenuManagerForWizard(treeViewer).createContextMenu(treeViewer.getControl());
					}
				})
				.create();

		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(treeViewer.getControl());

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
	 * @param e
	 *            the notified SelectionEvent
	 */
	protected void performRenumber(SelectionEvent event) {
		Shim shim = ShimUtils.getShim(root);
		RenumberComponentSetHandler.renumberComponentSet(shim);
		treeViewer.refresh();
	}

	/**
	 * Creates the root ComponentSet element from input preferences.
	 */
	public void createRootComponentSet(SystemConfiguration sys) {
		ShimWrappedPreferences settings = ShimWrappedPreferences.getCurrentInstance();

		ComponentSet dcs = (ComponentSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getComponentSet());

		root = ShimFactory.eINSTANCE.createComponentSet();
		root.setName(dcs.getName() + "_0");

		int numberOfComonentSet = settings.getComponentsPreferences()
				.getNumberComponent();
		int numberOfMasterComponent = settings.getComponentsPreferences()
				.getNumberMaster();
		int numberOfSlaveComponent = settings.getComponentsPreferences()
				.getNumberSlave();
		
		if (numberOfComonentSet == 0) {
			// In case of numberOfComonentSet == 0, 
			// adds MasterComponents and SlaveComponents to the root.
			for (int j = 0; j < numberOfMasterComponent; j++) {
				MasterComponent mc = ShimFactory.eINSTANCE.createMasterComponent();
				ShimModelManager.initObject(mc, "_0_" + j);
				root.getMasterComponent().add(mc);
			}

			for (int j = 0; j < numberOfSlaveComponent; j++) {
				SlaveComponent slc = ShimFactory.eINSTANCE.createSlaveComponent();
				ShimModelManager.initObject(slc, "_0_" + j);
				log.log(Level.FINEST,
						"-------------In Wizard CreateSlaveComponent id="
								+ slc.getId());
				root.getSlaveComponent().add(slc);
			}
			
		} else {
			// Otherwise, adds  MasterComponents and SlaveComponents
			// to the child ComponentSets.
			for (int i = 0; i < numberOfComonentSet; i++) {
				ComponentSet cset = ShimFactory.eINSTANCE.createComponentSet();
				cset.setName(dcs.getName() + "_0_" + i);
	
				for (int j = 0; j < numberOfMasterComponent; j++) {
					MasterComponent mc = ShimFactory.eINSTANCE.createMasterComponent();
					ShimModelManager.initObject(mc, "_0_" + i + "_" + j);
					cset.getMasterComponent().add(mc);
				}
	
				for (int j = 0; j < numberOfSlaveComponent; j++) {
					SlaveComponent slc = ShimFactory.eINSTANCE.createSlaveComponent();
					ShimModelManager.initObject(slc, "_0_" + i + "_" + j);
					log.log(Level.FINEST,
							"-------------In Wizard CreateSlaveComponent id="
									+ slc.getId());
					cset.getSlaveComponent().add(slc);
				}
				root.getComponentSet().add(cset);
			}
		}

		sys.setComponentSet(root);

		render(root);
	}

	private class TreeViewerBuilderForWizard implements TreeViewerBuilder {
		@Override
		public TreeViewer createTree(Composite parent) {
			treeViewer = new ShimTreeViewer(parent);
			treeViewer.setExpandPreCheckFilters(true);
			treeViewer.setAutoExpandLevel(3);

			GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(treeViewer.getControl());

			Composite composite = new Composite(parent, SWT.NONE);
			GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.END).applyTo(composite);
			GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 0).applyTo(composite);

			btnReNumber = new Button(composite, SWT.NONE);
			btnReNumber.addSelectionListener(ComponentTreeEditorWizardPage.this);
			btnReNumber.setText("Re-number nodes");

			return treeViewer;
		}
	}

	private static class ViewerFilterForWizard extends ViewerFilter {
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (parentElement instanceof ComponentSet) {
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
				if (node instanceof ComponentSet
						&& treeViewer.getTree().getSelectionCount() == 1) {
					addCreateChildrenActions(manager, node);

					manager.add(new Separator());
				}

				addEditActions(manager, selection);
			}
		}
	}
}
