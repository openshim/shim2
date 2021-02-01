/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.swt.viewer;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.multicore_association.shim.edit.Activator;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.model.shim.provider.ShimItemProviderAdapterFactory;

public class ShimTreeLabelProvider extends AdapterFactoryLabelProvider {

	public ShimTreeLabelProvider() {
		super(new ShimItemProviderAdapterFactory());
	}

	@Override
	public String getText(Object object) {

		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			EClass eClass = eObject.eClass();

			String className = eClass.getName();
			String messageKey = className + "_abbr_type";

			String typeLabel = Activator.message.getProperty(messageKey, className);
			String valueLabel = ShimUtils.getName(eObject);

			if (StringUtils.isNotBlank(valueLabel)) {
				return "[" + typeLabel + "] " + valueLabel;
			} else {
				return "[" + typeLabel + "]";
			}
		}

		return super.getText(object);
	}

	@Override
	public String getColumnText(Object object, int columnIndex) {
		return getText(object);
	}

	@Override
	public StyledString getStyledText(Object object) {
		return new StyledString(getText(object));
	}
}
