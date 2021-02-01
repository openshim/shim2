/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.swt.viewer;

import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ITableFontProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.multicore_association.shim.edit.gui.common.CommonConstants;
import org.multicore_association.shim.edit.gui.swt.ShimObjectColumnFormat;
import org.multicore_association.shim.edit.gui.swt.ShimObjectColumnFormat.ColumnType;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.ShimObject;

/**
 * The label provider for Shim_Object.
 */
public class ShimObjectTableLabelProvider extends LabelProvider implements
		ITableLabelProvider, ITableFontProvider {

	private EClass eClass;
	private List<ShimObjectColumnFormat> formatList;

	/**
	 * Constructs a new instance of ShimObjectTableLabelProvider.
	 * 
	 * @param eClass
	 *            the class of Shim_Object's data
	 * @param formatList
	 *            the list of all column's ShimObjectColumnFormat
	 */
	public ShimObjectTableLabelProvider(EClass eClass,
			List<ShimObjectColumnFormat> formatList) {
		super();
		this.eClass = eClass;
		this.formatList = formatList;
	}

	/**
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object,
	 *      int)
	 */
	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
	 *      int)
	 */
	@Override
	public String getColumnText(Object element, int columnIndex) {
		ShimObject so = (ShimObject) element;
		EObject obj = so.getObj();

		String result = "";
		if (EcoreUtil.equals(eClass, obj.eClass())) {
			ShimObjectColumnFormat format = formatList.get(columnIndex);
			ColumnType type = format.getType();
			Object val = so.getValue(format.getPropertyName());

			if (val != null) {
				switch (type) {
				case COMBO:
					if (val instanceof Enumerator) {
						result = ((Enumerator) val).getLiteral();
					} else {
						val.toString();
					}
					break;
				case TEXT:
				case INT:
				case HEADER:
				case FOOTER:
					result = val.toString();
					break;
				case FLOAT:
					result = String.format(CommonConstants.FORMAT_FLOAT, val);
					break;
				case HEX:
					result = String.format(CommonConstants.FORMAT_HEX, val);
					break;

				case OBJECT:
					result = ShimUtils.getName((EObject) val);
					break;

				default:
					result = "--";
					break;
				}
			}
		}
		return result;
	}

	/**
	 * @see org.eclipse.jface.viewers.ITableFontProvider#getFont(java.lang.Object,
	 *      int)
	 */
	@Override
	public Font getFont(Object element, int columnIndex) {
		ShimObject so = (ShimObject) element;
		EObject obj = so.getObj();

		Font result = JFaceResources.getFont(JFaceResources.DEFAULT_FONT);

		if (obj == null || EcoreUtil.equals(eClass, obj.eClass())) {
			ShimObjectColumnFormat format = formatList.get(columnIndex);
			ColumnType type = format.getType();

			switch (type) {
			case INT:
			case FLOAT:
			case HEX:
				// memo. JFaceResources.TEXT_FONT is monospace font.
				result = JFaceResources.getFont(JFaceResources.TEXT_FONT);
				break;

			default:
				break;
			}
		}
		return result;
	}

}
