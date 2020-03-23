/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.binding;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.DocumentRoot;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SlaveComponent;

/**
 * A class that implements methods to load SHIM Data.
 */
public class ShimDataLoader {

	String path = null;
	public Shim shim = null;

	/**
	 * Constructs a new instance of ShimDataLoader.
	 * 
	 * @param system
	 *            an instance of Shim to load
	 * @param path
	 *            SHIM Data XML file Path
	 */
	public ShimDataLoader(Shim shim, String path) {
		this.path = path;
		this.shim = shim;
	}

	/**
	 * Loads SHIM Data XML file.
	 * 
	 * @return returnCode - If success to load, return 1. If fail to load,
	 *         return -1.
	 * @throws Exception
	 */
	public int Load() throws Exception {

		try {

			Resource resource = createResource(path);

			try (InputStream xmlInputStream = new FileInputStream(path)) {
				resource.load(xmlInputStream, createLoadOptions());
			}

			EObject content = resource.getContents().get(0);

			if (!(content instanceof DocumentRoot)) {
				return -1;
			}
			DocumentRoot documentRoot = (DocumentRoot) content;
			shim = documentRoot.getShim();

			if (shim != null) {
				shim = EcoreUtil.copy(shim);
			}

			printShimData(shim);

			return 1;

		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Prints the loaded SHIM Data to the standard output stream.
	 * 
	 * @param sys
	 *            the loaded SHIM Data
	 */
	private void printShimData(Shim shim) {
		System.out.println("<Output Start>----------------");
		System.out.println("  name=" + shim.getName());
		printComponentSet(shim.getSystemConfiguration().getComponentSet(), 1);
		System.out.println("</Output End>----------------");

	}

	/**
	 * Prints the ComponentSet to the standard output stream.
	 * 
	 * @param cset
	 *            the ComponentSet to write
	 * @param level
	 *            non-negative level of cset
	 */
	private void printComponentSet(ComponentSet cset, int level) {
		if (cset == null) {
			System.out.println("<<No ComponentSet>>");
		}
		for (MasterComponent mc : cset.getMasterComponent()) {
			printMasterComponent(mc, level + 1);

		}
		for (SlaveComponent sc : cset.getSlaveComponent()) {
			printSlaveComponent(sc, level + 1);

		}
		for (ComponentSet subCset : cset.getComponentSet()) {
			printComponentSet(subCset, level + 1);
		}

	}

	/**
	 * Prints the MasterComponent to the standard output stream.
	 * 
	 * @param mc
	 *            the MasterComponent to print
	 * @param level
	 *            non-negative level of mc
	 */
	private void printMasterComponent(MasterComponent mc, int level) {
		System.out.println(sp(level) + "<MasterComponent>----------------");
		System.out.println(sp(level) + "  Name=" + mc.getName());
		System.out.println(sp(level) + "  Pid =" + mc.getPid());
		System.out.println(sp(level) + "  Arch=" + mc.getArch());
		System.out.println(sp(level) + "</MasterComponent>----------------");
	}

	/**
	 * Spaces according to level.
	 * 
	 * @param level
	 *            non-negative level of element
	 * @return space
	 */
	private String sp(int level) {
		String ss = "";
		for (int i = 0; i < level; i++) {
			ss = ss + "    ";
		}
		return ss;
	}

	/**
	 * Prints the SlaveComponent to the standard output stream.<br>
	 * <b>No operation now.</b>
	 * 
	 * @param sc
	 *            the SlaveComponent to print
	 * @param level
	 *            non-negative level of mc
	 */
	private void printSlaveComponent(SlaveComponent sc, int level) {
		// NOOP
	}

	public static Resource createResource(String path) {
		ResourceSet resourceSet = new ResourceSetImpl();

		Map<String, Object> resourceSetMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		if (!resourceSetMap.containsKey(Resource.Factory.Registry.DEFAULT_EXTENSION)) {
			resourceSetMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		}

		Resource resource = resourceSet.createResource(URI.createFileURI(path));

		return resource;
	}

	public static Map<Object, Object> createLoadOptions() {
		Map<Object, Object> options = new HashMap<Object, Object>();

		options.put(XMIResource.OPTION_SUPPRESS_XMI, Boolean.TRUE);
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, new BasicExtendedMetaData() {
			@Override
			public EPackage getPackage(String namespace) {
				if (namespace == null) {
					return ShimPackage.eINSTANCE;
				}
				return super.getPackage(namespace);
			}
		});

		return options;
	}

	public static Map<Object, Object> createSaveOptions() {
		Map<Object, Object> options = new HashMap<Object, Object>();

		options.put(XMIResource.OPTION_SUPPRESS_XMI, Boolean.TRUE);
		options.put(XMIResource.OPTION_ENCODING, "UTF-8");
		options.put(XMIResource.OPTION_LINE_DELIMITER, "\n");
		options.put(XMIResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		options.put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, new BasicExtendedMetaData());
		/*
		{
			@Override
			public EPackage getPackage(String namespace) {
				if (namespace == null) {
					return ShimPackage.eINSTANCE;
				}
				return super.getPackage(namespace);
			}
		});
*/
				
		// Required for SHIM 1.0
//		options.put(XMLResource.OPTION_URI_HANDLER, new XMLResource.URIHandler() {
//
//			@Override
//			public void setBaseURI(URI uri) {
//			}
//
//			@Override
//			public URI resolve(URI uri) {
//				return uri;
//			}
//
//			@Override
//			public URI deresolve(URI uri) {
//				return new PlainIDRefURI(uri);
//			}
//		});

		return options;
	}

	private static class PlainIDRefURI extends URI {

		private URI original;

		protected PlainIDRefURI(URI original) {
			super(original.hashCode());

			this.original = original; 
		}

		public String toString() {
			return original.fragment();
		}
	}
}
