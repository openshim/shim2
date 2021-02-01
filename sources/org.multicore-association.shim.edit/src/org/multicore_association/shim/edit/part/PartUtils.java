/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.part;

import java.io.File;
import java.util.Optional;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.multicore_association.shim.edit.gui.jface.ShimEditorPart;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim10.model.shim10.DocumentRoot;

public class PartUtils {

	static final String PARTSTACK_MAIN_ID = "org.multicore_association.shim.edit.partstack.main";
	static final String PARTDESCRIPTOR_SHIMEDITOR_ID = "org.multicore_association.shim.edit.partdescriptor.shimEditor";

	private PartUtils() {
	}

	public static Optional<MPartStack> findPartStackMain(MWindow window, EModelService modelService) {
		return modelService.findElements(window, PARTSTACK_MAIN_ID, MPartStack.class)
				.stream().findFirst();
	}

	public static Optional<ShimEditorPart> findShimEditorPart(MPart part) {
		return Optional.ofNullable(part)
		.flatMap(x -> {
			Object object = x.getObject();
			if (object instanceof ShimEditorPart) {
				return Optional.of((ShimEditorPart) object);
			}
			return Optional.empty();
		});
	}

	public static MPart createShimEditorPart(Shim shim, EPartService partService) {
		return createShimEditorPart(shim, shim.getName() + ".xml", partService);
	}

	public static MPart createShimEditorPart(Shim shim, String path, EPartService partService) {
		File file = new File(path);

		MPart part = partService.createPart(PARTDESCRIPTOR_SHIMEDITOR_ID);
		part.setLabel(file.getName());
		part.setTooltip(path);
//		part.setElementId("newid");
		part.setObject(shim);

		return part;
	}
	
	public static MPart createShim10EditorPart(DocumentRoot root, String path, EPartService partService) {
		File file = new File(path);
		
		MPart part = partService.createPart(PARTDESCRIPTOR_SHIMEDITOR_ID);
		part.setLabel(file.getName());
		part.setTooltip(path);
		part.setObject(root);
		
		return part;
	}
}
