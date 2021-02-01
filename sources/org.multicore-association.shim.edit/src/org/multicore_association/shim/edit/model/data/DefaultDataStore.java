/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.model.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.multicore_association.shim.edit.gui.common.CommonConstants;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences;
import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect;
import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences;
import org.multicore_association.shim.edit.model.app.preferences.LatencyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PitchPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences;
import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.Accessor;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.Cache;
import org.multicore_association.shim.model.shim.CacheType;
import org.multicore_association.shim.model.shim.ClockFrequency;
import org.multicore_association.shim.model.shim.CommonInstructionSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.Connection;
import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.EventCommunication;
import org.multicore_association.shim.model.shim.FIFOCommunication;
import org.multicore_association.shim.model.shim.InterruptCommunication;
import org.multicore_association.shim.model.shim.Latency;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.MasterSlaveBinding;
import org.multicore_association.shim.model.shim.MemoryConsistencyModel;
import org.multicore_association.shim.model.shim.OrderingType;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.Pitch;
import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.SharedMemoryCommunication;
import org.multicore_association.shim.model.shim.SharedRegisterCommunication;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimFactory;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SlaveComponent;
import org.multicore_association.shim.model.shim.SubSpace;
import org.multicore_association.shim.model.shim.util.ShimSwitch;

/**
 * This Store contains the default values of the data to be used by this editor.
 */
public class DefaultDataStore {

	private static final Logger log = ShimLoggerUtil
			.getLogger(DefaultDataStore.class);

	public static final String ID_PREFIX = "SHIMEDITOR";

	public static final String CHILD_SUB_NAME = "_New";

	/**
	 * Creates and returns a new instance of the specified class with the
	 * current preferences.<br>
	 * Creates also its member's instances.
	 * 
	 * @param eClass
	 *            the class to create an instance
	 * @return a new instance of the specified class
	 */
	public static EObject getDefaultSet(EClass eClass) {

		EObject newObject = ShimFactory.eINSTANCE.create(eClass);

		initDefaultSet(newObject);

		return newObject;
	}

	public static void initDefaultSet(EObject newObject) {
		if (!ShimModelManager.initObject(newObject, CHILD_SUB_NAME)) {
			initInstance(newObject, true, false);
		}

		ShimUtils.getAllChildReferences(newObject)
		.filter(x -> x.isContainment() && x.isRequired())
		.forEach(reference -> {

			if (reference.isUnsettable()) {
				return;
			}

			EClass childClass = reference.getEReferenceType();
			EObject childDefaultSet = getDefaultSet(childClass);

			if (childDefaultSet != null) {
				setDefaultSet(newObject, reference, childDefaultSet);
			}
		});
	}

	/**
	 * Sets the specified instance to default.
	 * 
	 * @param defaultSet
	 *            instance to be set to default
	 * @param reference
	 *            the reference of the defaultSet
	 * @param childDefaultSet
	 *            the child (means member of defaultSet) instance to be set to
	 *            default
	 */
	public static void setDefaultSet(EObject defaultSet, EReference reference,
			EObject childDefaultSet) {

		if (reference.isMany()) {
			@SuppressWarnings("unchecked")
			List<EObject> list = (List<EObject>) defaultSet.eGet(reference);
			list.add(childDefaultSet);
		} else {
			defaultSet.eSet(reference, childDefaultSet);
		}
	}

	/**
	 * Returns the default instance according to the specified class.
	 * 
	 * @param eClass
	 *            the class to return default object
	 * @return default object
	 */
	public static EObject getDefaultInstance(EClass eClass) {
		return createInstance(eClass, false, false);
	}

	/**
	 * Creates and returns a new instance of the specified default instance.
	 * 
	 * @param eClass
	 *            the class to create an instance
	 * @param needsRef
	 *            If true, sets default values to field of references.
	 * @param needsIdOnly
	 *            If true, only sets value to id.
	 * @return a new instance
	 */
	private static EObject createInstance(EClass eClass, boolean needsRef,
			boolean needsIdOnly) {

		EObject object = ShimFactory.eINSTANCE.create(eClass);

		initInstance(object, needsRef, needsIdOnly);

		return object;
	}

	public static void initInstance(EObject object, boolean needsRef,
			boolean needsIdOnly) {
		SetDefaultsSwitch.doSwitch(object, needsRef, needsIdOnly);

		if (!needsIdOnly) {
			setDefaultName(object);
		}

		setDefaultId(object);
	}

	private static void setDefaultName(EObject object) {
		ShimUtils.getNameAttribute(object)
		.ifPresent(attribute -> {
			String value = (String) object.eGet(attribute);

			if (StringUtils.isBlank(value)) {
				object.eSet(attribute, object.eClass().getName());
			}
		});
	}

	private static void setDefaultId(EObject object) {
		EClass eClass = object.eClass();

		if (!(eClass.getEPackage() instanceof ShimPackage)
				|| eClass.getEIDAttribute() == null) {
			return;
		}

		if (StringUtils.isBlank(EcoreUtil.getID(object))) {
			String id = createId(object);
			EcoreUtil.setID(object, id);
		}
	}

	private static class SetDefaultsSwitch extends ShimSwitch<EObject> {

		private Shim rootInstance;
		private boolean needsRef;
		private boolean needsIdOnly;

		private SetDefaultsSwitch(Shim rootInstance, boolean needsRef, boolean needsIdOnly) {
			this.rootInstance = rootInstance;
			this.needsRef = needsRef;
			this.needsIdOnly = needsIdOnly;
		}

		/**
		 * Set default values to the instance.
		 * 
		 * @param eObject
		 *            the instance
		 * @param needsRef
		 *            If true, sets default values to field of references.
		 * @param needsIdOnly
		 *            If true, only sets value to id.
		 * @return the instance
		 */
		public static EObject doSwitch(EObject eObject, boolean needsRef, boolean needsIdOnly) {
			Shim shim = ShimUtils.getShim(eObject);
			SetDefaultsSwitch sw = new SetDefaultsSwitch(shim, needsRef, needsIdOnly);
			return sw.doSwitch(eObject);
		}

		@Override
		public EObject caseAccessor(Accessor a) {
			if (needsRef) {
				List<EObject> list = ShimUtils.getObjectsList(
						rootInstance, ShimPackage.eINSTANCE.getMasterComponent());

				if (list.size() > 0) {
					a.setMasterComponentRef((MasterComponent) list.get(0));
				} else {
					a.setMasterComponentRef(null);
				}
			}
			return a;
		}

		@Override
		public EObject caseAccessType(AccessType at) {
			if (!needsIdOnly) {
				AccessTypePreferences preferences = ShimWrappedPreferences.getCurrentInstance().getAccessTypePreferences();

				at.setAccessByteSize(32);
				at.setAlignmentByteSize(32);
				at.setName(preferences.getBaseName());
				at.setNBurst(preferences.getNBurst());
				at.setRwType(RWType.values()[0]);
			}
			return at;
		}

		@Override
		public EObject caseAddressSpace(AddressSpace as) {
			if (!needsIdOnly) {
				AddressSpacePreferences preferences = ShimWrappedPreferences.getCurrentInstance()
						.getAddressSpacePreferences();

				as.setName(preferences.getAddressSpaceName());
			}
			return as;
		}

		@Override
		public EObject caseCache(Cache c) {
			CacheDataPreferences cdParameter = ShimWrappedPreferences.getCurrentInstance().getCacheDataPreferences();
			CacheTypeSelect cacheTypeSelection = cdParameter.getCacheType();
			CacheType type = CacheType.DATA;
			if (cacheTypeSelection == CacheTypeSelect.UNIFIED) {
				type = CacheType.UNIFIED;
			} else if (cacheTypeSelection == CacheTypeSelect.INSTRUCTION) {
				type = CacheType.INSTRUCTION;
			}

			if (!needsIdOnly) {
				c.setLineSize(128);
				c.setCacheCoherency(cdParameter.getData().getCacheCoherenecy());
				c.setCacheType(type);
				c.setLockDownType(cdParameter.getData().getLockDownType());
				c.setNWay(cdParameter.getData().getNWay());
				c.setSize(cdParameter.getData().getSize());
				c.setSizeUnit(cdParameter.getData().getSizeUnit());
			}
			return c;
		}

		@Override
		public EObject caseClockFrequency(ClockFrequency cf) {
			ComponentsPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
					.getComponentsPreferences();

			cf.setClockValue(preferences.getClock());
			return cf;
		}

		@Override
		public EObject caseCommonInstructionSet(CommonInstructionSet cis) {
			cis.setName("LLVM Instructions");
			return cis;
		}

		@Override
		public EObject caseComponentSet(ComponentSet cs) {
			ComponentSetPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
					.getComponentSetPreferences();

			cs.setName(preferences.getBaseName());
			return cs;
		}

		@Override
		public EObject caseConnection(Connection c) {
			if (needsRef) {
				List<EObject> list = ShimUtils.getObjectsList(
						rootInstance, ShimPackage.eINSTANCE.getMasterComponent());

				if (list.size() > 1) {
					c.setFrom((MasterComponent) list.get(0));
					c.setTo((MasterComponent) list.get(1));
				} else {
					c.setFrom(null);
					c.setTo(null);
				}
			}
			return c;
		}

		@Override
		public EObject caseEventCommunication(EventCommunication ec) {
			ec.setName("Event");
			return ec;
		}

		@Override
		public EObject caseFIFOCommunication(FIFOCommunication fc) {
			CommunicationSetPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
					.getCommunicationSetPreferences();

			fc.setDataSize(preferences.getFifoDataSize());
			fc.setDataSizeUnit(preferences.getFifoDataSizeUnit());
			fc.setName("fifo");
			fc.setQueueSize(preferences.getQueueSize());
			return fc;
		}

		@Override
		public EObject caseInterruptCommunication(InterruptCommunication ic) {
			ic.setName("Interrupt");
			return ic;
		}

		@Override
		public EObject caseLatency(Latency l) {
			LatencyPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
					.getLatencyPreferences();

			l.setBest(preferences.getBest());
			l.setTypical(preferences.getTypical());
			l.setWorst(preferences.getWorst());
			return l;
		}

		@Override
		public EObject caseSharedMemoryCommunication(SharedMemoryCommunication lc) {
			CommunicationSetPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
					.getCommunicationSetPreferences();

			lc.setDataSize(preferences.getSharedMemoryDataSize());
			lc.setDataSizeUnit(preferences.getSharedMemoryDataSizeUnit());
			lc.setName("shmem");
			if (needsRef) {
				List<EObject> list_as = ShimUtils.getObjectsList(
						rootInstance, ShimPackage.eINSTANCE.getAddressSpace());

				if (list_as.size() > 0) {
					AddressSpace as = (AddressSpace) list_as.get(0);
					lc.setAddressSpaceRef(as);
					if (as != null && as.getSubSpace().size() > 0) {
						lc.setSubSpaceRef(as.getSubSpace().get(0));
					} else {
						lc.setSubSpaceRef(null);
					}
				} else {
					lc.setAddressSpaceRef(null);
					lc.setSubSpaceRef(null);
				}
			}
			return lc;
		}

		@Override
		public EObject caseMasterComponent(MasterComponent mc) {
			if (!needsIdOnly) {
				MasterComponentPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
						.getMasterComponentPreferences();

				mc.setArch(preferences.getArch());
				mc.setMasterType(preferences.getType());

				mc.setName(preferences.getBaseName());
				mc.setNThread(preferences.getNThread());
				mc.setPid("64");
				mc.setEndian(preferences.getEndian());
			}
			return mc;
		}

		@Override
		public EObject caseMasterSlaveBinding(MasterSlaveBinding msb) {
			if (needsRef) {
				List<EObject> list = ShimUtils.getObjectsList(
						rootInstance, ShimPackage.eINSTANCE.getSlaveComponent());

				if (list.size() > 0) {
					msb.setSlaveComponentRef((SlaveComponent) list.get(0));
				} else {
					msb.setSlaveComponentRef(null);
				}
			}
			return msb;
		}

		@Override
		public EObject caseMemoryConsistencyModel(MemoryConsistencyModel mcm) {
			mcm.setRarOrdering(OrderingType.get(0));
			mcm.setRawOrdering(OrderingType.get(0));
			mcm.setWarOrdering(OrderingType.get(0));
			mcm.setWawOrdering(OrderingType.get(0));
			return mcm;
		}

		@Override
		public EObject casePerformance(Performance p) {
			if (needsRef) {
				List<EObject> list = ShimUtils.getObjectsList(
						rootInstance, ShimPackage.eINSTANCE.getAccessType());

				if (list.size() > 0) {
					p.setAccessTypeRef((AccessType) list.get(0));
				} else {
					p.setAccessTypeRef(null);
				}
			}
			return p;
		}

		@Override
		public EObject casePitch(Pitch p) {
			PitchPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
					.getPitchPreferences();

			p.setBest(preferences.getBest());
			p.setTypical(preferences.getTypical());
			p.setWorst(preferences.getWorst());
			return p;
		}

		@Override
		public EObject caseSharedRegisterCommunication(SharedRegisterCommunication src) {
			CommunicationSetPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
					.getCommunicationSetPreferences();

			src.setDataSize(preferences.getSharedRegisterDataSize());
			src.setDataSizeUnit(preferences.getSharedRegisterDataSizeUnit());
			src.setName("sreg");
			src.setNRegister(preferences.getNRegister());
			return src;
		}

		@Override
		public EObject caseSlaveComponent(SlaveComponent sc) {
			if (!needsIdOnly) {
				SlaveComponentPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
						.getSlaveComponentPreferences();

				sc.setName(preferences.getBaseName());
				sc.setRwType(preferences.getRwType());
				sc.setSize(preferences.getSize());
				sc.setSizeUnit(preferences.getSizeUnit());
			}
			return sc;
		}

		@Override
		public EObject caseSubSpace(SubSpace ss) {
			if (!needsIdOnly) {
				AddressSpacePreferences preferences = ShimWrappedPreferences.getCurrentInstance()
						.getAddressSpacePreferences();

				ss.setName(preferences.getSubSpaceName());
				ss.setStart(0);
				ss.setEnd(127);
				ss.setEndian(EndianType.LITTLE);
			}
			return ss;
		}

		@Override
		public EObject caseShim(Shim shim) {
			ComponentsPreferences preferences = ShimWrappedPreferences.getCurrentInstance()
					.getComponentsPreferences();

			shim.setShimVersion(CommonConstants.SHIM_VERSION_2_0);
			shim.setName(preferences.getSystemName());
			return shim;
		}
	}

	private static Pattern ID_EXCLUDE_CHARS_PATTERN = Pattern.compile("[^A-Z]+");

	/**
	 * Creates and returns a new id from hash code.
	 * 
	 * @param object
	 *            the object
	 * @return a new id
	 */
	public static String createId(EObject object) {
		String abbrevClassName = ID_EXCLUDE_CHARS_PATTERN
				.matcher(object.eClass().getName())
				.replaceAll("");

		Calendar c = Calendar.getInstance();

		Random rnd = new Random();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");

		StringBuffer id = new StringBuffer();
		id.append(abbrevClassName);
		id.append("_");
		id.append(ID_PREFIX);
		id.append(sdf.format(c.getTime()));
		id.append(String.format("%1$010d", object.hashCode()));
		id.append(String.format("%1$04d", rnd.nextInt(9999)));

		log.finest("[DEBUG] created id=" + id.toString());
		return id.toString();
	}
}
