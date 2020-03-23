/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;

public abstract class ShimContentControl extends Composite {

	public ShimContentControl(Composite parent, int style) {
		super(parent, style);
	}

	public abstract void setInput(EObject input);

	public abstract boolean findAndSelect(Object selectedItem);

	public abstract void refresh();
}
