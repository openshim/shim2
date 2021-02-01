/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.TreeItem;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.search.PropertyCompareUtil;
import org.multicore_association.shim.edit.model.search.SearchOptions;
import org.multicore_association.shim.edit.model.search.ShimSearchResult;

/**
 * Implementation of Shim TreeViewer which can search.
 */
public class ShimTreeViewer extends TreeViewer {

	private static final Logger log = ShimLoggerUtil
			.getLogger(ShimTreeViewer.class);

	/**
	 * Constructs a new instance of SearchableTreeViewer.
	 * 
	 * @param parent
	 *            the parent composite
	 */
	public ShimTreeViewer(Composite parent) {
		super(parent);

		getTree().addKeyListener(new KeyListener() {

			/**
			 * @see org.eclipse.swt.events.KeyListener#keyReleased(org.eclipse.swt.events.KeyEvent)
			 */
			@Override
			public void keyReleased(KeyEvent e) {
				// NOOP
			}

			/**
			 * @see org.eclipse.swt.events.KeyListener#keyPressed(org.eclipse.swt.events.KeyEvent)
			 */
			@Override
			public void keyPressed(KeyEvent e) {
				if (!(getSelection() instanceof IStructuredSelection)) {
					return;
				}
				IStructuredSelection selection = (IStructuredSelection) getSelection();
				if (selection.isEmpty()) {
					return;
				}

				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(selection.getFirstElement());
				if (editingDomain == null) {
					return;
				}

				if ((e.keyCode == SWT.DEL && e.stateMask != SWT.CTRL)
						|| (e.keyCode == 'd' && e.stateMask == SWT.CTRL)) {
					// press DELET or CTRL+D key.
					DeleteAction delete = new DeleteAction(editingDomain, true);
					delete.selectionChanged(selection);
					if (delete.isEnabled()) {
						delete.run();
					}
				} else if (e.keyCode == 'x' && e.stateMask == SWT.CTRL) {
					// press CTRL+C key.
					CutAction cut = new CutAction(editingDomain);
					cut.selectionChanged(selection);
					if (cut.isEnabled()) {
						cut.run();
					}
				} else if (e.keyCode == 'c' && e.stateMask == SWT.CTRL) {
					// press CTRL+C key.
					CopyAction copy = new CopyAction(editingDomain);
					copy.selectionChanged(selection);
					if (copy.isEnabled()) {
						copy.run();
					}
				} else if (e.keyCode == 'v' && e.stateMask == SWT.CTRL) {
					// press CTRL+V key.
					PasteAction paste = new PasteAction(editingDomain);
					paste.selectionChanged(selection);
					if (paste.isEnabled()) {
						paste.run();
					}
				}
			}
		});
	}

	/**
	 * Finds and select the specified element.
	 * 
	 * @param element
	 *            the element which find from TreeViewer.
	 * @return Returns true if the element is found, and false otherwise.
	 */
	public boolean findAndSelect(Object element) {
		Object input = getInput();
		if (input instanceof List) {
			List<?> list = (List<?>) input;
			if (list.isEmpty()) {
				return false;
			}
			input = list.get(0);
		}

		return findAndSelect(input, element);
	}

	/**
	 * Finds and select the specified element.
	 * 
	 * @param root
	 *            the starting point element to search
	 * @param element
	 *            the element which find from TreeViewer.
	 * @return Returns true if the element is found, and false otherwise.
	 */
	public boolean findAndSelect(Object root, Object element) {
		ITreeContentProvider provider = (ITreeContentProvider) getContentProvider();
		Set<Object> route = new HashSet<Object>();
		if (findElement(route, root, element, provider)) {
			route.remove(element);
			// If route is empty, element is root element.So no need to expand.
			if (!route.isEmpty()) {
				setExpandedElements(route.toArray());
			}

			TreeItem selectedTreeItem = findTreeItem(element);
			assert selectedTreeItem != null;

			setSelection(new StructuredSelection(element), true);
			getTree().showSelection();

			// send selection event to SelectionListner
			Event event = new Event();
			event.item = selectedTreeItem;
			getTree().notifyListeners(SWT.Selection, event);
			return true;
		}

		log.info("Search is failed. : element=" + element);
		return false;
	}

	/**
	 * Returns the TreeItem of the specified element.
	 * 
	 * @param element
	 *            the element to find
	 * @return the TreeItem
	 */
	public TreeItem findTreeItem(Object element) {
		return (TreeItem) findItem(element);
	}

	/**
	 * @param route
	 *            the set of parent object
	 * @param input
	 * 
	 * @param element
	 *            the element which find from TreeViewer.
	 * @param provider
	 *            ITreeContentProvider of TreeViewer
	 * @return Returns true if the element is found, and false otherwise.
	 */
	private static boolean findElement(Set<Object> route, Object input,
			Object element, ITreeContentProvider provider) {
		if (element.equals(input)) {
			route.add(input);
			return true;
		}
		Object[] children = provider.getChildren(input);
		if (children.length > 0) {
			for (Object child : children) {
				if (child.equals(input)) {
					continue;
				}
				if (findElement(route, child, element, provider)) {
					route.add(input);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Searches TreeViewer by the specified text.
	 * 
	 * @param searchText
	 *            the text to search
	 * @param isCaseSensitive
	 *            if true, case sensitive search was performed
	 * @param isWholeWord
	 *            if true, only whole words were searched
	 * @param isRegExp
	 *            if true, regular expression search was performed
	 * @return the list of search result
	 */
	public List<ShimSearchResult> search(String searchText,
			SearchOptions options) {
		List<ShimSearchResult> searchResultList = new ArrayList<ShimSearchResult>();
		ITreeContentProvider provider = (ITreeContentProvider) getContentProvider();
		Object input = getInput();
		if (input instanceof List) {
			input = ((List<?>) input).get(0);
		}

		searchObject(searchResultList, provider, (EObject) input, searchText, options,
				null);

		return searchResultList;
	}

	/**
	 * Searches TreeViewer by the specified text.
	 * 
	 * @param searchResultList
	 * @param provider
	 * @param input
	 * @param searchText
	 * @param options
	 * @param parentName
	 */
	private void searchObject(List<ShimSearchResult> searchResultList,
			ITreeContentProvider provider, EObject input, String searchText,
			SearchOptions options, String parentName) {
		List<EStructuralFeature> matchFeatures = PropertyCompareUtil.getMatchFeatures(
				searchText, input, options);
		if (!matchFeatures.isEmpty()) {
			for (EStructuralFeature matchFeature : matchFeatures) {
				searchResultList.add(new ShimSearchResult(input, matchFeature,
						parentName));
			}
		}

		Object[] children = provider.getChildren(input);
		if (children.length > 0) {
			String nameProperty = ShimUtils.getName(input);
			if (nameProperty == null) {
				nameProperty = parentName;
			}

			for (Object child : children) {
				if (child.equals(input)) {
					continue;
				}

				searchObject(searchResultList, provider, (EObject) child, searchText,
						options, nameProperty);
			}
		}

	}
}
