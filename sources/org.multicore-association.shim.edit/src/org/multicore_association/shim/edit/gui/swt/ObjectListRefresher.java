/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.swt;

/**
 * Interface for the SWT resource which needs to refresh the object list.
 */
public interface ObjectListRefresher {

	/**
	 * Refreshes the object list.
	 */
	public void refreshObjectList();
	
}
