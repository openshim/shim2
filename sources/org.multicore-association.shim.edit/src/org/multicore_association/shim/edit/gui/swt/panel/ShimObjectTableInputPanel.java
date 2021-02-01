/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.swt.panel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.multicore_association.shim.edit.gui.swt.ObjectListRefresher;
import org.multicore_association.shim.edit.gui.swt.viewer.ShimObjectTableFilter;
import org.multicore_association.shim.edit.gui.swt.viewer.ShimObjectTableViewer;
import org.multicore_association.shim.edit.model.ShimObject;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.model.shim.Shim;

/**
 * An InputPanel implementation for ShimObject table.
 */
public class ShimObjectTableInputPanel extends InputPanelBase implements
		ObjectListRefresher {

	private static final String LABEL_PREFIX = "list of ";
	private static final String ANY_FIELD = "[ANY]";

	private List<ShimObject> objectList = null;
	private Composite composite;
	private Composite filterComposite;
	private Combo filterCombo;
	private Text filterText;

	private ShimObjectTableViewer tableViewer;
	private ShimObjectTableFilter tableFilter;

	private Shim shim;
	private EClass eClass;

	/**
	 * Constructs a new instance of ShimObjectTableInputPanel.
	 * 
	 * @param parent
	 *            parent composite
	 * @param style
	 *            SWT style bits
	 */
	public ShimObjectTableInputPanel(Composite parent, int style) {
		super(parent, style);

		setLblTitleText("[ANY NAME]");

		// To reset the Apply Button and Text of error message.
		textErrorMassage.setVisible(true);
	}

	@Override
	protected Control createContents(Composite parent, int style) {
		eClass = null;

		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));

		createFilterInputArea();

		createTableComposite();

		return composite;
	}

	/**
	 * Creates the composite to filter the list.
	 */
	private void createFilterInputArea() {
		filterComposite = new Composite(composite, SWT.NONE);
		filterComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		filterComposite.setLayout(new GridLayout(3, false));

		Label lblFilter = new Label(filterComposite, SWT.NONE);
		GridData gd_lblFilter = new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1);
		gd_lblFilter.widthHint = 50;
		lblFilter.setLayoutData(gd_lblFilter);
		lblFilter.setText("Filter:");

		filterCombo = new Combo(filterComposite, SWT.READ_ONLY);
		GridData gd_filterCombo = new GridData(SWT.LEFT, SWT.CENTER, false,
				false, 1, 1);
		gd_filterCombo.widthHint = 120;
		filterCombo.setLayoutData(gd_filterCombo);

		filterText = new Text(filterComposite, SWT.BORDER);
		filterText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		
		// define modify listener
		ModifyListener modifyListener = new ModifyListener() {
			/**
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			@Override
			public void modifyText(ModifyEvent event) {
				String text = filterText.getText();
				tableFilter.setSearchText(text);
				
				String searchFiled = filterCombo.getText();
				if (ANY_FIELD.equals(searchFiled)) {
					tableFilter.setSearchFiled(null);
				} else {
					tableFilter.setSearchFiled(searchFiled);
				}
				
				tableViewer.refresh();
			}
		};
		filterCombo.addModifyListener(modifyListener);
		filterText.addModifyListener(modifyListener);
		
		filterComposite.setEnabled(false);
	}

	/**
	 * Creates the composite which displays the list of SHIM Data.
	 */
	private void createTableComposite() {
		Composite tableComposite = new Composite(composite, SWT.NONE);
		tableComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));

		tableViewer = new ShimObjectTableViewer(tableComposite, SWT.BORDER,
				this);
		Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		TableColumnLayout tcl_composite = new TableColumnLayout();
		tableComposite.setLayout(tcl_composite);
		
		tableFilter = new ShimObjectTableFilter();
		tableViewer.addFilter(tableFilter);
	}

	/**
	 * @see org.multicore_association.shim.edit.gui.swt.panel.InputPanelBase#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(Object input) {
		if (input instanceof EObject) {
			EObject object = (EObject) input;

			shim = ShimUtils.getShim(object);
			eClass = object.eClass();

			setLblTitleText(LABEL_PREFIX + eClass.getName());

			tableViewer.initTabeleViewer(eClass, true);
			refreshObjectList();

			// create combo
			List<String> comboItems = new ArrayList<String>();
			comboItems.add(ANY_FIELD);
			
			TableColumn[] columns = tableViewer.getTable().getColumns();
			for (TableColumn column : columns) {
				comboItems.add(column.getText());
			}
			filterCombo.setItems(comboItems.toArray(new String[comboItems
					.size()]));
			filterCombo.select(0);
			
			filterComposite.setEnabled(true);

			selectCurrentInputPanelObject(object);
		}
	}

	/**
	 * @see shim.gui.swt.ObjectListRefresher#refreshObjectList()
	 */
	@Override
	public void refreshObjectList() {
		objectList = ShimUtils.getObjectsList(shim, eClass)
				.stream()
				.map(x -> new ShimObject(x))
				.collect(Collectors.toList());
		tableViewer.dispose();
		tableViewer.setInput(objectList);
	}

	/**
	 * @see org.multicore_association.shim.edit.gui.swt.panel.InputPanelBase#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
		objectList = null;
		tableViewer.dispose();
		tableViewer.getTable().clearAll();
		tableViewer.refresh();
	}

	/**
	 * Selects the element which is selected in the current InputPanel's tree
	 * viewer.<br>
	 * Synchronizes the selection between InputPanel and this table.
	 * 
	 * @param currentInputPanelObject
	 *            the element which is selected in the current InputPanel's tree
	 *            viewer
	 */
	private void selectCurrentInputPanelObject(EObject currentInputPanelObject) {
		if (objectList != null && currentInputPanelObject != null) {
			int size = objectList.size();
			for (int i = 0; i < size; i++) {
				EObject object = objectList.get(i).getObj();
				if (EcoreUtil.equals(object, currentInputPanelObject)) {
					tableViewer.getTable().select(i);
					tableViewer.getTable().showSelection();
					break;
				}
			}
		}
	}

	/**
	 * Returns the item which is selected in the table viewer.
	 * 
	 * @return the item which is selected in the table viewer
	 */
	public Object getSelectedItem() {
		TableItem[] selection = tableViewer.getTable().getSelection();
		if (selection != null && selection.length > 0) {
			ShimObject object = (ShimObject) selection[0].getData();
			return object.getObj();
		}
		return null;
	}
}
