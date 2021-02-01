/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;

import org.apache.commons.lang3.tuple.Pair;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.multicore_association.shim.edit.binding.Shim10DataLoader;
import org.multicore_association.shim.edit.binding.ShimDataLoader;
import org.multicore_association.shim.edit.gui.jface.wizard.CreateNewDataWizard;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.FunctionalUnitSet;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim10.model.*;
import org.multicore_association.shim10.model.shim10.DocumentRoot;

public class FileHandlerUtils {

	static final String COMMAND_PARAMETER_SAVE_AS_ID = "org.multicore_association.shim.edit.commandparameter.saveAs";

	private FileHandlerUtils() {
	}

	public static Optional<Shim> createNewShim(Shell shell) {
		CreateNewDataWizard createNewDataWizard = new CreateNewDataWizard();

		WizardDialog shimWizardDialog = new WizardDialog(shell, createNewDataWizard);

		int result = shimWizardDialog.open();
		if (result == Window.OK) {
			return Optional.of(createNewDataWizard.getShim());
		}

		return Optional.empty();
	}
	
	public static Optional<Pair<String, Shim>> open10(Shell shell) {
		
		FileDialog openDialog = new FileDialog(shell, SWT.OPEN);
		
		String path = openDialog.open();
		
		if (path == null) {
			// Cancel
			OpenHandler.log.finest("Open Operation Canceled!!");
			return Optional.empty();
		}
		
		OpenHandler.log.info("Open file. Path=" + path);
				
		Shim10DataLoader loader = new Shim10DataLoader(path);
		
		Shim shim1 = ShimUtils.createShim();
		shim1.setFunctionalUnitSet((FunctionalUnitSet) DefaultDataStore.getDefaultSet(ShimPackage.eINSTANCE.getFunctionalUnitSet()));
		
		try {
			int ret = loader.Load();
			if (ret == 1) {
				return Optional.of(Pair.of(path, loader.getShim()));
//				return Optional.of(Pair.of(path, shim1));
			} else {
				MessageDialog.openError(shell, "shim1.0 open error", "This file is not ver1.0.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			OpenHandler.log.log(Level.SEVERE, "XML Open Error", e);
			Status status = new Status(IStatus.ERROR, "XML Open Error",
					IStatus.OK, e.getMessage(), null);
			ErrorDialog.openError(shell, "Open Error",
					"Not Valid XML Format", status);
		}
	
		return Optional.empty();
	}

	public static Optional<Pair<String,Shim>> openShim(Shell shell) {
	
		FileDialog openDialog = new FileDialog(shell, SWT.OPEN);
	
		String path = openDialog.open();
	
		if (path == null) {
			// Cancel
			OpenHandler.log.finest("Open Operation Canceled!!");
			return Optional.empty();
		}
	
		OpenHandler.log.info("Open file. Path=" + path);
	
		Shim shim = ShimUtils.createShim();
	
		ShimDataLoader loader = new ShimDataLoader(shim, path);
		
		try {
			int ret = loader.Load();
			if (ret == 1) {
				return Optional.of(Pair.of(path, loader.shim));
			}
		} catch (Exception e) {
			e.printStackTrace();
			OpenHandler.log.log(Level.SEVERE, "XML Open Error", e);
			Status status = new Status(IStatus.ERROR, "XML Open Error",
					IStatus.OK, e.getMessage(), null);
			ErrorDialog.openError(shell, "Open Error",
					"Not Valid XML Format", status);
		}
	
		return Optional.empty();
	}

	public static Optional<String> saveShim(Shell shell, Shim shim, String path, boolean isSaveAs) {
	
		if (path == null || isSaveAs) {
			FileDialog dialog = new FileDialog(shell, SWT.SAVE);
			if (path == null) {
				path = "shim_save_file_out.xml";
			}
			dialog.setFileName(path);
	
			path = dialog.open();
		}
	
		if (path != null) {
			saveResource(shim, path);
		}
	
		return Optional.ofNullable(path);
	}
	
	public static void convertShim(Shell shell, Shim shim) {
		
		FileDialog dialog = new FileDialog(shell, SWT.SAVE);
		String fileName = "shim_conert_1_0.xml";
		dialog.setFileName(fileName);
		
		String path = dialog.open();
		
		if (path != null) {
			saveResource(shim, path);
		}
	}

	public static void saveResource(Shim shim, String path) {
		//ShimPackage.eINSTANCE.setNsPrefix(null);
		Resource resource = ShimDataLoader.createResource(path);
		resource.getContents().add(EcoreUtil.copy(shim));
	
		try (FileOutputStream fos = new FileOutputStream(path)) {
			resource.save(fos, ShimDataLoader.createSaveOptions());
		} catch (IOException e) {
			
		}
	
		SaveHandler.log.info("Save SHIM data. Path=" + path);
	}
}
