package org.multicore_association.shim.edit.convert;

import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim10.model.shim10.DocumentRoot;

public class ShimConvertData {
	
	private DocumentRoot root = null;
	private Shim shim = null;

	// shim ver.1.0
	public ShimConvertData(DocumentRoot root) {
		this.root = root;
		shim = ShimUtils.createShim();
		convertToShim20();
	}
	
	// shim ver.2.0
	public ShimConvertData(Shim shim) {
		this.shim = shim;
	}
	
	private void convertToShim20() {
		if (root.getSystemConfiguration() != null) {
			shim = ShimConvertTo20Util.convert(root, shim);
		}
	}
	
	public Shim getShim() {
		return shim;
	}
 
}
