/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.multicore_association.shim.edit.gui.swt.panel.SearchInputPanel;
import org.multicore_association.shim.edit.gui.swt.panel.ShimObjectTableInputPanel;
import org.multicore_association.shim.edit.handler.file.FileHandlerUtils;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.edit.part.PartUtils;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * An editor part of the SHIM Data.
 */
public class ShimEditorPart {

	private static final Logger log = ShimLoggerUtil
			.getLogger(ShimEditorPart.class);

	@Inject
	private MPart part;

	private CTabFolder tabFolder;

	private List<Pair<EReference[], ShimContentControl>> shimContentControls;

	// Editing the elements.
	private Composite container;
	private Composite compositeElements;
	private ShimObjectTableInputPanel inputPanelShimObjectTable;

	// Search the elements.
	private Composite compositeSearch;
	private SearchInputPanel inputPanelSearch;

	private Shim shim;

	private String defaultPathName;

	/**
	 * Constructs a new instance of SHIMEditJFaceApplicationWindow.
	 */
	@Inject
	public ShimEditorPart() {
	}

	/**
	 * Creates contents of the editor part.
	 * 
	 * @param parent
	 *            the parent control
	 */
	@PostConstruct
	public Control createContents(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		container.setLayout(new StackLayout());

		tabFolder = new CTabFolder(container, SWT.BOTTOM);

		createTabItems();

		// If notifies the selection event in tabFolder, refreshes all
		// tree viewers.
		tabFolder.addSelectionListener(new SelectionListener() {

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
				refresh();
			}
		});

		tabFolder.setSelection(0);

		// creates the tab item of ElementTable.
		compositeElements = new Composite(container, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 0).applyTo(compositeElements);

		inputPanelShimObjectTable = new ShimObjectTableInputPanel(
				compositeElements, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(inputPanelShimObjectTable);

		// creates the tab item of Search.
		compositeSearch = new Composite(container, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 0).applyTo(compositeSearch);

		inputPanelSearch = new SearchInputPanel(compositeSearch, SWT.NONE, this);
		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(inputPanelSearch);

		// layout
		StackLayout shimEditContainerLayout = (StackLayout) container
				.getLayout();
		shimEditContainerLayout.topControl = tabFolder;

		Shim shim;
		if (part != null) {
			Object object = part.getObject();
			if (object instanceof Shim) {
				shim = (Shim) object;
			} else {
				shim = ShimUtils.createShim();
			}
		} else {
			shim = ShimUtils.createShim();
		}
		setInput(shim);

		return container;
	}

	@PreDestroy
	public void dispose() {
		if (shimContentControls != null) {
			shimContentControls.stream().forEach(x -> x.getValue().dispose());
		}

		if (compositeElements != null) {
			compositeElements.dispose();
			compositeElements = null;
		}

		if (compositeSearch != null) {
			compositeSearch.dispose();
			compositeSearch = null;
		}
	}

	public Shim getInput() {
		return shim;
	}

	public void setInput(Shim shim) {
		log.finest("ShimEditorPart.setInput()");

		this.shim = shim;

		for (Pair<EReference[], ShimContentControl> pair : shimContentControls) {
			EObject current = shim;
			EReference[] references = pair.getKey();

			for (EReference reference : references) {
				Object object = current.eGet(reference);

//				if (!(object instanceof EObject)) {
	//				object = DefaultDataStore.getDefaultSet(reference.getEReferenceType());
		//			ShimUtils.addOrSet(current, reference, (EObject) object);
			//	}
				current = (EObject) object;
			}

			ShimContentControl control = pair.getValue();
			control.setInput(current);
			control.refresh();
		}
	}

	public String getDefaultPathName() {
		return defaultPathName;
	}

	public void setDefaultPathName(String defaultPathName) {
		this.defaultPathName = defaultPathName;
	}

	/**
	 * Create tab items.
	 */
	private void createTabItems() {
		shimContentControls = new ArrayList<Pair<EReference[],ShimContentControl>>();

		shimContentControls.add(Pair.of(
				new EReference[] {
				},
				createSystemTabItem()));

		shimContentControls.add(Pair.of(
				new EReference[] {
						ShimPackage.eINSTANCE.getShim_SystemConfiguration(),
						ShimPackage.eINSTANCE.getSystemConfiguration_ComponentSet(),
				},
				createShimMasterDetailTabItem("Components", 4)));

		shimContentControls.add(Pair.of(
				new EReference[] {
						ShimPackage.eINSTANCE.getShim_SystemConfiguration(),
						ShimPackage.eINSTANCE.getSystemConfiguration_AddressSpaceSet(),
				},
				createShimMasterDetailTabItem("AddressSpace", 3)));

		shimContentControls.add(Pair.of(
				new EReference[] {
						ShimPackage.eINSTANCE.getShim_SystemConfiguration(),
						ShimPackage.eINSTANCE.getSystemConfiguration_CommunicationSet(),
				},
				createShimMasterDetailTabItem("Communications", 2)));

		shimContentControls.add(Pair.of(
				new EReference[] {
						ShimPackage.eINSTANCE.getShim_SystemConfiguration(),
						ShimPackage.eINSTANCE.getSystemConfiguration_ContentionGroupSet(),
				},
				createShimMasterDetailTabItem("ContentionGroups", 2)));

		shimContentControls.add(Pair.of(
				new EReference[] {
						ShimPackage.eINSTANCE.getShim_SystemConfiguration(),
						ShimPackage.eINSTANCE.getSystemConfiguration_FrequencyVoltageSet(),
				},
				createShimMasterDetailTabItem("FrequencyVoltageSet", 2)));

		shimContentControls.add(Pair.of(
				new EReference[] {
						ShimPackage.eINSTANCE.getShim_FunctionalUnitSet(),
				},
				createShimMasterDetailTabItem("FunctionalUnits", 2)));

		shimContentControls.add(Pair.of(
				new EReference[] {
						ShimPackage.eINSTANCE.getShim_PowerConfiguration(),
				},
				createShimMasterDetailTabItem("Power", 2)));
		
		shimContentControls.add(Pair.of(
				new EReference[] {
				},
				createShimContentXmlOutputControlTabItem()));
	}

	/**
	 * Creates a new tab item.
	 */
	private ShimContentMasterDetailControl createShimMasterDetailTabItem(String label, int autoExpandLevel) {
		CTabItem tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText(label);

		ShimContentMasterDetailControl control = new ShimContentMasterDetailControl(tabFolder, SWT.NONE);
		control.setBackground(control.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		control.setBackgroundMode(SWT.INHERIT_DEFAULT);
		control.setAutoExpandLevel(autoExpandLevel);

		tabItem.setControl(control);

		return control;
	}

	/**
	 * Creates the tab item of System.
	 */
	private ShimContentControl createSystemTabItem() {
		CTabItem tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("System");

		ShimContentECPInputPanelControl control = new ShimContentECPInputPanelControl(tabFolder, SWT.NONE);
		control.setBackground(control.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		control.setBackgroundMode(SWT.INHERIT_DEFAULT);

		tabItem.setControl(control);

		return control;
	}
	
	/**
	 * Creates a new tab item.
	 */
	private ShimContentXmlOutputControl createShimContentXmlOutputControlTabItem() {
		CTabItem tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("xml");
		
		System.out.println(part.toString());

		ShimContentXmlOutputControl control = new ShimContentXmlOutputControl(tabFolder, SWT.NONE, getDefaultPathName());
		control.setBackground(control.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		control.setBackgroundMode(SWT.INHERIT_DEFAULT);

		tabItem.setControl(control);

		return control;
	}

	public ShimContentMasterDetailControl findShimContentControl(EReference keyReference) {

		for (Pair<EReference[], ShimContentControl> pair : shimContentControls) {
			ShimContentControl control = pair.getValue();
			EReference[] reference = pair.getKey();

			if (!(control instanceof ShimContentMasterDetailControl)) {
				continue;
			}
			if (reference == null || reference.length == 0) {
				continue;
			}

			if (EcoreUtil.equals(reference[reference.length - 1], keyReference)) {
				return (ShimContentMasterDetailControl) control;
			}
		}

		return null;
	}

	/**
	 * @see org.multicore_association.shim.edit.gui.jface.ShimSelectableItem#refresh()
	 */
	public void refresh() {
		log.finest("refresh(): TreeViewer Refreshed");
		for (Pair<EReference[], ShimContentControl> pair : shimContentControls) {
			ShimContentControl control = pair.getValue();
			control.refresh();
		}
	}

	public boolean isElementTableActive() {
		StackLayout stackLayout = (StackLayout) container.getLayout();

		return stackLayout.topControl.equals(compositeElements);
	}

	public void performElementTableAction() {
		StackLayout stackLayout = (StackLayout) container.getLayout();

		if (!stackLayout.topControl.equals(compositeElements)) {
			Optional<Object> input = Optional.ofNullable(getTreeViewerSelection(false))
					.map(x -> x.getFirstElement());
			inputPanelShimObjectTable.clearErrorMessage();
			inputPanelShimObjectTable.setInput(input.orElse(null));
			stackLayout.topControl = compositeElements;

		} else {
			refresh();

			Object selectedItem = inputPanelShimObjectTable
					.getSelectedItem();
			if (selectedItem != null) {
				int selectionIndex = tabFolder.getSelectionIndex();
				ShimContentControl selectionControl = shimContentControls
						.get(selectionIndex).getValue();

				selectionControl.findAndSelect(selectedItem);
			}

			stackLayout.topControl = tabFolder;
		}

		container.layout();
	}

	public boolean isSearchActive() {
		StackLayout stackLayout = (StackLayout) container.getLayout();

		return stackLayout.topControl.equals(compositeSearch);
	}

	public void performSearchAction() {
		StackLayout stackLayout = (StackLayout) container.getLayout();

		if (!stackLayout.topControl.equals(compositeSearch)) {
			inputPanelSearch.clearErrorMessage();
			List<ShimTreeViewer> input = new ArrayList<ShimTreeViewer>();
			for (Pair<EReference[], ShimContentControl> pair : shimContentControls) {
				ShimContentControl control = pair.getValue();

				if (control instanceof ShimContentMasterDetailControl) {
					input.add(((ShimContentMasterDetailControl)control).getTreeViewer());
				}
			}
			inputPanelSearch.setInput(input);
			stackLayout.topControl = compositeSearch;
		} else {
			refresh();

			stackLayout.topControl = tabFolder;
		}

		container.layout();
	}

	/**
	 * Changes the InputPanel which displays into the specified InputPanel.
	 * 
	 * @param element
	 *            the element to display and be selected
	 */
	public void changeInputPanel(Object element) {

		int selectionIndex = -1;

		List<Pair<EReference[], ShimContentControl>> controls = shimContentControls;
		for (int i = 0; i < controls.size(); i++) {
			ShimContentControl control = controls.get(i).getValue();

			if (control.findAndSelect(element)) {
				selectionIndex = i;
				break;
			}
		}

		if (selectionIndex == -1) {
			inputPanelSearch.clearSearchResult();
		} else {
			tabFolder.setSelection(selectionIndex);
		}

		refresh();

		StackLayout stackLayout = (StackLayout) container.getLayout();
		stackLayout.topControl = tabFolder;

		inputPanelSearch.dispose();

		container.layout();
	}

	public IStructuredSelection getTreeViewerSelection(boolean checkFocus) {
		int index = tabFolder.getSelectionIndex();
		if (index < 0 || index >= tabFolder.getItemCount()) {
			return StructuredSelection.EMPTY;
		}

		ShimContentControl control = shimContentControls.get(index).getValue();
		if (!(control instanceof ShimContentMasterDetailControl)) {
			return StructuredSelection.EMPTY;
		}

		TreeViewer treeViewer = ((ShimContentMasterDetailControl) control).getTreeViewer();

		if (checkFocus && !treeViewer.getControl().isFocusControl()) {
			return StructuredSelection.EMPTY;
		}

		return treeViewer.getStructuredSelection();
	}

	public Optional<EditingDomain> getEditingDomain() {
		return Optional.ofNullable(shim).map(AdapterFactoryEditingDomain::getEditingDomainFor);
	}
}
