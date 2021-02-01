/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface;

import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emfforms.spi.swt.treemasterdetail.MenuProvider;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeMasterDetailComposite;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeMasterDetailSWTFactory;
import org.eclipse.emfforms.spi.swt.treemasterdetail.TreeViewerBuilder;
import org.eclipse.emfforms.spi.swt.treemasterdetail.util.RootObject;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.multicore_association.shim.edit.actions.ShimObjectMenuManager;
import org.multicore_association.shim.edit.gui.swt.viewer.ShimTreeLabelProvider;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.service.ShimServiceUtils;

public class ShimContentMasterDetailControl extends ShimContentControl
	implements SelectionListener {

	private static final Logger log = ShimLoggerUtil
			.getLogger(ShimContentMasterDetailControl.class);

	public static final int TREE_WIDTH = 300;

	private ShimTreeViewer treeViewer;
	TreeItem selectedItem;

	private int autoExpandLevel;

	private TreeMasterDetailComposite treeMasterDetailComposite;

	public ShimContentMasterDetailControl(Composite parent, int style) {
		super(parent, style);

		setAutoExpandLevel(2);

		createContents(this, null);
	}

	private void createContents(Composite parent, EObject object) {
		StackLayout stack = new StackLayout();
		parent.setLayout(stack);

		RootObject rootObject = null;
		if (object != null) {
			rootObject = new RootObject(object);
		}

		treeMasterDetailComposite = TreeMasterDetailSWTFactory.fillDefaults(parent, SWT.NONE, rootObject)
				.customizeLabelProvider(new ShimTreeLabelProvider())
				.customizeTree(new TreeViewerBuilder() {

					@Override
					public TreeViewer createTree(Composite parent) {
						treeViewer = new ShimTreeViewer(parent);
						treeViewer.setExpandPreCheckFilters(true);
						treeViewer.setAutoExpandLevel(autoExpandLevel);

						Tree tree = treeViewer.getTree();
						tree.addSelectionListener(ShimContentMasterDetailControl.this);

						TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
						TreeColumn treeColumn = treeViewerColumn.getColumn();
						treeColumn.setWidth(TREE_WIDTH);

						return treeViewer;
					}
				})
				.customizeMenu(new MenuProvider() {
					@Override
					public Menu getMenu(TreeViewer treeViewer, EditingDomain editingDomain) {
						return (new ShimObjectMenuManager(treeViewer))
								.createContextMenu(treeViewer.getControl());
					}
				})
				.customizeInitialTreeWidth(TREE_WIDTH)
				.customizeViewModelServices((x, y) -> ShimServiceUtils.getViewModelServices())
				.create();

		stack.topControl = treeMasterDetailComposite;
	}

	@Override
	public void dispose() {
		if (treeMasterDetailComposite != null) {
			treeMasterDetailComposite.dispose();
			treeMasterDetailComposite = null;
		}
		if (treeViewer != null) {
			treeViewer.getControl().dispose();
			treeViewer = null;
		}

		super.dispose();
	}
	
	/**
	 * @return the shimTreeViewer
	 */
	public ShimTreeViewer getTreeViewer() {
		return treeViewer;
	}

	public void setAutoExpandLevel(int autoExpandLevel) {
		this.autoExpandLevel = autoExpandLevel;
	}

	/**
	 * @param object
	 *            the input object
	 */
	@Override
	public void setInput(EObject object) {
		treeMasterDetailComposite.dispose();

		createContents(this, object);
		this.layout();

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
		TreeItem item = (TreeItem) event.item;
		selectedItem = item;

		log.finest("TreeViewer " + item.getText() + " selected");
	}

	@Override
	public boolean findAndSelect(Object item) {
		return treeViewer.findAndSelect(item);
	}

	/**
	 * @see org.multicore_association.shim.edit.gui.jface.ShimSelectableItem#refresh()
	 */
	@Override
	public void refresh() {
		treeViewer.refresh();
	}
}
