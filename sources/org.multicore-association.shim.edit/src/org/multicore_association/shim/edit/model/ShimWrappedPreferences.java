/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.model;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.multicore_association.shim.edit.gui.common.LabelConstants;
import org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences;
import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect;
import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences;
import org.multicore_association.shim.edit.model.app.preferences.LatencyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PitchPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesFactory;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyType;
import org.multicore_association.shim.edit.model.app.preferences.ShimPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesStore;
import org.multicore_association.shim.model.shim.CacheCoherencyType;
import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.LockDownType;
import org.multicore_association.shim.model.shim.MasterType;
import org.multicore_association.shim.model.shim.OperationType;
import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * Preferences to create SHIM Data obejct's instance.
 */
public class ShimWrappedPreferences {

	private static ShimWrappedPreferences currInstance = new ShimWrappedPreferences();

	private static ShimWrappedPreferences oldInstance = new ShimWrappedPreferences();

	private ShimPreferencesStore store;

	private ShimPreferences preferences;

	/**
	 * Constructs a new instance of ShimPreferences.
	 */
	private ShimWrappedPreferences() {
		store = ShimPreferencesStore.getInstance();

		preferences = PreferencesFactory.eINSTANCE.createShimPreferences();
		ShimUtils.createResource(preferences);
		/* Component Parameter */
		preferences.setComponentsPreferences(
				PreferencesFactory.eINSTANCE.createComponentsPreferences());
		loadComponentsPreferences();

		// MasterComponent Parameter
		preferences.setMasterComponentPreferences(
				PreferencesFactory.eINSTANCE.createMasterComponentPreferences());
		loadMasterComponentPreferences();

		// SlaveComponent Parameter
		preferences.setSlaveComponentPreferences(
				PreferencesFactory.eINSTANCE.createSlaveComponentPreferences());
		loadSlaveComponentPreferences();

		// ComponentSet Parameter
		preferences.setComponentSetPreferences(
				PreferencesFactory.eINSTANCE.createComponentSetPreferences());
		loadComponentSetPreferences();

		/* AddressSpace Parameter */
		preferences.setAddressSpacePreferences(
				PreferencesFactory.eINSTANCE.createAddressSpacePreferences());
		loadAddressSpacePreferences();

		/* CommunicationSet Parameter */
		preferences.setCommunicationSetPreferences(
				PreferencesFactory.eINSTANCE.createCommunicationSetPreferences());
		loadCommunicationSetPreferences();

		/* CacheData Parameter */
		CacheDataPreferences cacheDataPreferences = PreferencesFactory.eINSTANCE.createCacheDataPreferences();
		cacheDataPreferences.setData(PreferencesFactory.eINSTANCE.createCacheDataUnitPreferences());
		cacheDataPreferences.setInstruction(PreferencesFactory.eINSTANCE.createCacheDataUnitPreferences());
		preferences.setCacheDataPreferences(cacheDataPreferences);
		loadCacheDataPreferences();

		/* AccessType Parameter */
		preferences.setAccessTypePreferences(
				PreferencesFactory.eINSTANCE.createAccessTypePreferences());
		loadAccessTypePreferences();

		/* Performance */
		preferences.setLatencyPreferences(
				PreferencesFactory.eINSTANCE.createLatencyPreferences());
		loadLatencyPreferences();

		preferences.setPitchPreferences(
				PreferencesFactory.eINSTANCE.createPitchPreferences());
		loadPitchPreferences();

		preferences.setSavePolicyPreferences(
				PreferencesFactory.eINSTANCE.createSavePolicyPreferences());
		loadSavePolicyPreferences();
	}

	private ShimWrappedPreferences(ShimPreferences preferences) {
		store = ShimPreferencesStore.getInstance();

		this.preferences = preferences;
	}

	/**
	 * Returns the ShimPreferences instance which is used now.
	 * 
	 * @return the ShimPreferences instance which is used now
	 */
	public static ShimWrappedPreferences getCurrentInstance() {
		return currInstance;
	}

	/**
	 * Creates a new ShimPreferences instance, and returns it.
	 * 
	 * @return new Shim_Settings instance
	 */
	public static ShimWrappedPreferences getNewInstance() {
		oldInstance = currInstance;
		currInstance = new ShimWrappedPreferences();
		return currInstance;
	}

	/**
	 * Creates a new ShimPreferences instance, and returns it.
	 * 
	 * @return the new ShimPreferences instance
	 */
	public static ShimWrappedPreferences getNewCopyInstance() {
		oldInstance = currInstance;
		currInstance = new ShimWrappedPreferences(EcoreUtil.copy(oldInstance.preferences));

		return currInstance;
	}

	/**
	 * 'currInstance' change into oldInstance from currInstance.
	 */
	public static void restoreOldInstance() {
		currInstance = oldInstance;
	}

	/**
	 * Sets ComponentsPreferences which is stored last time to this
	 * ComponentsPreferences.
	 */
	public void loadComponentsPreferences() {
		ComponentsPreferences componentsPreferences = getComponentsPreferences();

		componentsPreferences.setSystemName(store
				.getString(ShimPreferencesKey.CP_SYSTEM_NAME));
		componentsPreferences.setNumberMaster(store
				.getInt(ShimPreferencesKey.CP_NUMBER_MASTER));
		componentsPreferences.setNumberSlave(store
				.getInt(ShimPreferencesKey.CP_NUMBER_SLAVE));
		componentsPreferences.setNumberComponent(store
				.getInt(ShimPreferencesKey.CP_NUMBER_COMPONENT));
		componentsPreferences.setClock(store
				.getFloat(ShimPreferencesKey.CP_CLOCK));
	}

	/**
	 * Sets MasterComponentPreferences which is stored last time to this
	 * MasterComponentPreferences.
	 */
	public void loadMasterComponentPreferences() {
		MasterComponentPreferences masterComponentPreferences = getMasterComponentPreferences();

		masterComponentPreferences.setBaseName(store
				.getString(ShimPreferencesKey.CP_MASTER_NAME));
		masterComponentPreferences.setType(MasterType.get(store
				.getInt(ShimPreferencesKey.CP_MASTER_TYPE)));
		masterComponentPreferences.setEndian(EndianType.get(store
				.getInt(ShimPreferencesKey.CP_MASTER_ENDIAN)));
		masterComponentPreferences.setArch(store
				.getString(ShimPreferencesKey.CP_MASTER_ARCH));
		masterComponentPreferences.setArchOpt(store
				.getString(ShimPreferencesKey.CP_MASTER_ARCH_OPT));
		masterComponentPreferences.setNChannel(store
				.getInteger(ShimPreferencesKey.CP_MASTER_NUMBER_CHANNEL));
		masterComponentPreferences.setNThread(store
				.getInteger(ShimPreferencesKey.CP_MASTER_NUMBER_THREAD));
		masterComponentPreferences.setCheckClockForMaster(store
				.getBoolean(ShimPreferencesKey.CP_MASTER_CHECK_CLOCKFREQUENCY));
		masterComponentPreferences.setClock(store
				.getFloat(ShimPreferencesKey.CP_MASTER_CLOCK));
	}

	/**
	 * Sets SlaveComponentPreferences which is stored last time to this
	 * SlaveComponentPreferences.
	 */
	public void loadSlaveComponentPreferences() {
		SlaveComponentPreferences slaveComponentPreferences = getSlaveComponentPreferences();

		slaveComponentPreferences.setBaseName(store
				.getString(ShimPreferencesKey.CP_SLAVE_NAME));
		slaveComponentPreferences.setSize(store
				.getInt(ShimPreferencesKey.CP_SLAVE_SIZE));
		slaveComponentPreferences.setSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CP_SLAVE_SIZE_UNIT)));
		slaveComponentPreferences.setRwType(RWType.get(store
				.getInt(ShimPreferencesKey.CP_SLAVE_RWTYPE)));
	}

	/**
	 * Sets ComponentSetPreferences which is stored last time to this
	 * ComponentSetPreferences.
	 */
	public void loadComponentSetPreferences() {
		ComponentSetPreferences componentSetPreferences = getComponentSetPreferences();

		componentSetPreferences.setBaseName(store
				.getString(ShimPreferencesKey.CP_COMPONENTSET_NAME));
	}

	/**
	 * Sets AddressSpacePreferences which is stored last time to this
	 * AddressSpacePreferences.
	 */
	public void loadAddressSpacePreferences() {
		AddressSpacePreferences addressSpacePreferences = getAddressSpacePreferences();

		addressSpacePreferences.setNumberSubSpace(store
				.getInt(ShimPreferencesKey.AS_NUMBER_SUBSPACE));
		addressSpacePreferences.setSizeSubSpace(store
				.getInt(ShimPreferencesKey.AS_SIZE_SUBSPACE));
		addressSpacePreferences.setAddressSpaceName(store
				.getString(ShimPreferencesKey.AS_NAME));
		addressSpacePreferences.setSubSpaceName(store
				.getString(ShimPreferencesKey.AS_SUBSPACE_NAME));
		addressSpacePreferences.setDontConnect(store
				.getBoolean(ShimPreferencesKey.AS_CHECK_DONT_CONNECT));
	}

	/**
	 * Sets CommunicationSetPreferences which is stored last time to this
	 * CommunicationSetPreferences.
	 */
	public void loadCommunicationSetPreferences() {
		CommunicationSetPreferences communicationSetPreferences = getCommunicationSetPreferences();

		// InterruptCommunication parameter
		communicationSetPreferences.setCheckInterruptCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_INTERRUPT));

		// EventCommunication parameter
		communicationSetPreferences.setCheckEventCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_EVENT));

		// FIFOCommunication parameter
		communicationSetPreferences.setCheckFIFOCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_FIFO));
		communicationSetPreferences.setFifoDataSize(store
				.getInt(ShimPreferencesKey.CS_FIFO_DATA_SIZE));
		communicationSetPreferences.setFifoDataSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CS_FIFO_DATA_SIZE_UNIT)));
		communicationSetPreferences.setQueueSize(store
				.getInt(ShimPreferencesKey.CS_FIFO_QUEUE_SIZE));

		// SharedMemoryCommunication parameter
		communicationSetPreferences.setCheckSharedMemoryCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_SMC));
		communicationSetPreferences.setSharedMemoryDataSize(store
				.getInteger(ShimPreferencesKey.CS_SMC_DATA_SIZE));
		communicationSetPreferences.setSharedMemoryDataSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CS_SMC_DATA_SIZE_UNIT)));
		communicationSetPreferences.setOperationType(OperationType.get(store
				.getInt(ShimPreferencesKey.CS_SMC_OPERATION)));

		// SharedRegisterCommunication parameter
		communicationSetPreferences.setCheckSharedRegisterCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_SRC));
		communicationSetPreferences.setSharedRegisterDataSize(store
				.getInt(ShimPreferencesKey.CS_SRC_DATA_SIZE));
		communicationSetPreferences.setSharedRegisterDataSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CS_SRC_DATA_SIZE_UNIT)));
		communicationSetPreferences.setNRegister(store
				.getInt(ShimPreferencesKey.CS_SRC_NUMBER_REGISTER));

		communicationSetPreferences.setDontConnect(store
				.getBoolean(ShimPreferencesKey.CS_DONT_CONNECT));
	}

	/**
	 * Sets CacheDataPreferences which is stored last time to this
	 * CacheDataPreferences.
	 */
	public void loadCacheDataPreferences() {
		CacheDataPreferences cacheDataPreferences = getCacheDataPreferences();

		cacheDataPreferences.setCacheType(CacheTypeSelect.get(store
				.getInt(ShimPreferencesKey.CD_CACHE_TYPE)));

		CacheDataUnitPreferences data = cacheDataPreferences.getData();
		data.setCacheCoherenecy(CacheCoherencyType.get(store
				.getInt(ShimPreferencesKey.CD_DATA_CACHE_COHERENCY)));
		data.setSize(store
				.getInt(ShimPreferencesKey.CD_DATA_CACHE_SIZE));
		data.setSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CD_DATA_CACHE_SIZE_UNIT)));
		data.setNWay(store
				.getInteger(ShimPreferencesKey.CD_DATA_NUMBER_WAY));
		data.setLineSize(store
				.getInteger(ShimPreferencesKey.CD_DATA_LINE_SIZE));
		data.setLockDownType(LockDownType.get(store
				.getInt(ShimPreferencesKey.CD_DATA_LOCK_DOWN_TYPE)));

		// parameter for [data and instruction]
		CacheDataUnitPreferences instruction = cacheDataPreferences.getInstruction();
		instruction.setCacheCoherenecy(CacheCoherencyType.get(store
				.getInt(ShimPreferencesKey.CD_INSTRUCTION_CACHE_COHERENCY)));
		instruction.setSize(store
				.getInt(ShimPreferencesKey.CD_INSTRUCTION_CACHE_SIZE));
		instruction.setSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CD_INSTRUCTION_CACHE_SIZE_UNIT)));
		instruction.setNWay(store
				.getInteger(ShimPreferencesKey.CD_INSTRUCTION_NUMBER_WAY));
		instruction.setLineSize(store
				.getInteger(ShimPreferencesKey.CD_INSTRUCTION_LINE_SIZE));
		instruction.setLockDownType(LockDownType.get(store
				.getInt(ShimPreferencesKey.CD_INSTRUCTION_LOCK_DOWN_TYPE)));
	}

	/**
	 * Sets AccessTypePreferences which is stored last time to this
	 * AccessTypePreferences.
	 */
	public void loadAccessTypePreferences() {
		AccessTypePreferences accessTypePreferences = getAccessTypePreferences();

		accessTypePreferences.setBaseName(store
				.getString(ShimPreferencesKey.AT_NAME));
		accessTypePreferences.setCheckR(store
				.getBoolean(ShimPreferencesKey.AT_CHECK_R));
		accessTypePreferences.setCheckW(store
				.getBoolean(ShimPreferencesKey.AT_CHECK_W));
		accessTypePreferences.setCheckRW(store
				.getBoolean(ShimPreferencesKey.AT_CHECK_RW));
		accessTypePreferences.setCheckRWX(store
				.getBoolean(ShimPreferencesKey.AT_CHECK_RWX));
		accessTypePreferences.setCheckRX(store
				.getBoolean(ShimPreferencesKey.AT_CHECK_RX));
		accessTypePreferences.setCheckX(store
				.getBoolean(ShimPreferencesKey.AT_CHECK_X));
		accessTypePreferences.setAccessByteSize(store
				.getString(ShimPreferencesKey.AT_ACCESS_BYTE_SIZE));
		accessTypePreferences.setNBurst(store
				.getInteger(ShimPreferencesKey.AT_NUMBER_BURST));
	}

	/**
	 * Sets LatencyPreferences which is stored last time to this
	 * LatencyPreferences.
	 */
	public void loadLatencyPreferences() {
		LatencyPreferences latencyPreferences = getLatencyPreferences();

		latencyPreferences.setBest(store
				.getFloatWrapper(ShimPreferencesKey.P_LATENCY_BEST));
		latencyPreferences.setTypical(store
				.getFloat(ShimPreferencesKey.P_LATENCY_TYPICAL));
		latencyPreferences.setWorst(store
				.getFloatWrapper(ShimPreferencesKey.P_LATENCY_WORST));
	}

	/**
	 * Sets PitchPreferences which is stored last time to this PitchPreferences.
	 */
	public void loadPitchPreferences() {
		PitchPreferences pitchPreferences = getPitchPreferences();

		pitchPreferences.setBest(store
				.getFloatWrapper(ShimPreferencesKey.P_PITCH_BEST));
		pitchPreferences.setTypical(store
				.getFloat(ShimPreferencesKey.P_PITCH_TYPICAL));
		pitchPreferences.setWorst(store
				.getFloatWrapper(ShimPreferencesKey.P_PITCH_WORST));
	}

	/**
	 * Sets SavePolicyPreferences which is stored last time to this
	 * PitchPreferences.
	 */
	public void loadSavePolicyPreferences() {
		SavePolicyPreferences savePolicyPreferences = getSavePolicyPreferences();

		if (store.getBoolean(ShimPreferencesKey.WIZ_CHECK_ALWAYS)) {
			savePolicyPreferences.setSavePolicy(SavePolicyType.ALWAYS);
		} else if (store.getBoolean(ShimPreferencesKey.WIZ_CHECK_ON_REQUEST)) {
			savePolicyPreferences.setSavePolicy(SavePolicyType.ON_REQUEST);
		} else if (store.getBoolean(ShimPreferencesKey.WIZ_CHECK_NEVER)) {
			savePolicyPreferences.setSavePolicy(SavePolicyType.NEVER);
		} else {
			savePolicyPreferences.setSavePolicy(SavePolicyType.ON_REQUEST);
		}
	}

	public ShimPreferences getShimPreferences() {
		return preferences;
	}

	/**
	 * Returns preferences to create a SystemConfiguration instance and
	 * components.
	 * 
	 * @return preferences to create a SystemConfiguration instance and
	 *         components
	 */
	public ComponentsPreferences getComponentsPreferences() {
		return preferences.getComponentsPreferences();
	}

	/**
	 * Returns preferences to create a MasterComponent instance.
	 * 
	 * @return preferences to create a MasterComponent instance
	 */
	public MasterComponentPreferences getMasterComponentPreferences() {
		return preferences.getMasterComponentPreferences();
	}

	/**
	 * Returns preferences to create a SlaveComponent instance.
	 * 
	 * @return preferences to create a SlaveComponent instance
	 */
	public SlaveComponentPreferences getSlaveComponentPreferences() {
		return preferences.getSlaveComponentPreferences();
	}

	/**
	 * Returns preferences to create a ComponentSet instance.
	 * 
	 * @return preferences to create a ComponentSet instance
	 */
	public ComponentSetPreferences getComponentSetPreferences() {
		return preferences.getComponentSetPreferences();
	}

	/**
	 * Returns preferences to create a ComponentSet instance.
	 * 
	 * @return preferences to create a ComponentSet instance
	 */
	public AddressSpacePreferences getAddressSpacePreferences() {
		return preferences.getAddressSpacePreferences();
	}

	/**
	 * Returns preferences to create a CommunicationSet instance.
	 * 
	 * @return preferences to create a CommunicationSet instance
	 */
	public CommunicationSetPreferences getCommunicationSetPreferences() {
		return preferences.getCommunicationSetPreferences();
	}

	/**
	 * Returns preferences to create a Cache instance.
	 * 
	 * @return preferences to create a Cache instance
	 */
	public CacheDataPreferences getCacheDataPreferences() {
		return preferences.getCacheDataPreferences();
	}

	/**
	 * Returns preferences to create an AccessType instance.
	 * 
	 * @return preferences to create an AccessType instance
	 */
	public AccessTypePreferences getAccessTypePreferences() {
		return preferences.getAccessTypePreferences();
	}

	/**
	 * Returns preferences to create a Latency instance.
	 * 
	 * @return preferences to create a Latency instance
	 */
	public LatencyPreferences getLatencyPreferences() {
		return preferences.getLatencyPreferences();
	}

	/**
	 * Returns preferences to create a Pitch instance.
	 * 
	 * @return preferences to create a Pitch instance
	 */
	public PitchPreferences getPitchPreferences() {
		return preferences.getPitchPreferences();
	}

	/**
	 * Returns preferences whether the preferences saves or not.
	 * 
	 * @return preferences whether the preferences saves or not
	 */
	public SavePolicyPreferences getSavePolicyPreferences() {
		return preferences.getSavePolicyPreferences();
	}

	/**
	 * Dumps preferences.
	 * 
	 * @param preferences
	 *            SHIM Editor preferences
	 * @param isRemake
	 *            whether this method is called by re-make wizard
	 * @return the dump string
	 */
	public static String createDumpStr(ShimWrappedPreferences preferences,
			boolean isRemake) {

		StringBuilder dumpBuilder = new StringBuilder();
		dumpBuilder.append("Wizard Finish:\n");
		if (isRemake) {
			dumpBuilder.append("== Re-Make New SHIM Data Parameter ==\n");
		} else {
			dumpBuilder.append("== Create New SHIM Data Parameter ==\n");
		}

		final String equal = "=";
		final String nl = "\n";

		if (!isRemake) {

			// Creates the dump str of components preferences.
			ComponentsPreferences cpParameter = preferences
					.getComponentsPreferences();
			MasterComponentPreferences cpMasterParameter = preferences
					.getMasterComponentPreferences();
			SlaveComponentPreferences cpSlaveParameter = preferences
					.getSlaveComponentPreferences();
			ComponentSetPreferences cpComponentSetParameter = preferences
					.getComponentSetPreferences();
			dumpBuilder.append("1.Components\n");
			dumpBuilder.append(LabelConstants.SYSTEM_NAME + equal
					+ cpParameter.getSystemName() + nl);
			dumpBuilder.append(LabelConstants.NUMBER_OF_MASTERCOMPONENT + equal
					+ cpParameter.getNumberMaster() + nl);
			dumpBuilder.append(LabelConstants.NUMBER_OF_SLAVECOMPONENT + equal
					+ cpParameter.getNumberSlave() + nl);
			dumpBuilder.append(LabelConstants.NUMBER_OF_COMPONENTSET + equal
					+ cpParameter.getNumberComponent() + nl);
			dumpBuilder.append(LabelConstants.CLOCK_FREQUENCY + equal
					+ cpParameter.getClock() + nl);
			dumpBuilder.append("1-1.MasterComponent\n");
			dumpBuilder.append(LabelConstants.BASE_NAME + equal
					+ cpMasterParameter.getBaseName() + nl);
			dumpBuilder.append(LabelConstants.TYPE + equal
					+ cpMasterParameter.getType() + nl);
			dumpBuilder.append(LabelConstants.ENDIAN + equal
					+ cpMasterParameter.getEndian()
					+ nl);
			dumpBuilder.append(LabelConstants.ARCH + equal
					+ cpMasterParameter.getArch() + nl);
			dumpBuilder.append(LabelConstants.ARCH_OPT + equal
					+ cpMasterParameter.getArchOpt() + nl);
			dumpBuilder.append(LabelConstants.NUMBER_OF_CHANNEL + equal
					+ cpMasterParameter.getNChannel() + nl);
			dumpBuilder.append(LabelConstants.NUMBER_OF_THREAD + equal
					+ cpMasterParameter.getNThread() + nl);
			dumpBuilder.append(LabelConstants.CLOCK_FREQUENCY + equal
					+ cpMasterParameter.getClock() + nl);
			dumpBuilder.append("1-2.SlaveComponent\n");
			dumpBuilder.append(LabelConstants.BASE_NAME + equal
					+ cpSlaveParameter.getBaseName() + nl);
			dumpBuilder.append(LabelConstants.SIZE + equal
					+ cpSlaveParameter.getSize() + " "
					+ cpSlaveParameter.getSizeUnit()
					+ nl);
			dumpBuilder.append(LabelConstants.RW_TYPE + equal
					+ cpSlaveParameter.getRwType() + nl);
			dumpBuilder.append("1-3.ComponentSet\n");
			dumpBuilder.append(LabelConstants.BASE_NAME + equal
					+ cpComponentSetParameter.getBaseName() + nl);
		}

		// Creates the dump str of AddressSpaces preferences.
		AddressSpacePreferences asParameter = preferences
				.getAddressSpacePreferences();
		dumpBuilder.append("2.AddressSpace\n");
		dumpBuilder.append(LabelConstants.NUMBER_OF_SUBSPACES + equal
				+ asParameter.getNumberSubSpace() + nl);
		dumpBuilder.append(LabelConstants.SIZE_OF_SUBSPACE + equal
				+ asParameter.getSizeSubSpace() + nl);
		dumpBuilder.append(LabelConstants.ADDRESSSPACE_BASE_NAME + equal
				+ asParameter.getAddressSpaceName() + nl);
		dumpBuilder.append(LabelConstants.SUBSPACE_BASE_NAME + equal
				+ asParameter.getSubSpaceName() + nl);

		// Creates the dump str of communications preferences.
		CommunicationSetPreferences csParameter = preferences
				.getCommunicationSetPreferences();
		dumpBuilder.append("3.CommunicationSet\n");
		dumpBuilder.append("3-1.InterruptCommunication\n");
		if (csParameter.isCheckInterruptCommunication()) {
			dumpBuilder.append("CREATE\n");
		} else {
			dumpBuilder.append("NOT CREATE\n");
		}
		dumpBuilder.append("3-2.EventCommunication\n");
		if (csParameter.isCheckEventCommunication()) {
			dumpBuilder.append("CREATE\n");
		} else {
			dumpBuilder.append("NOT CREATE\n");
		}
		dumpBuilder.append("3-3.FIFOCommunication\n");
		if (csParameter.isCheckFIFOCommunication()) {
			dumpBuilder.append(LabelConstants.DATA_SIZE + equal
					+ csParameter.getFifoDataSize() + " "
					+ csParameter.getFifoDataSizeUnit()
					+ nl);
			dumpBuilder.append(LabelConstants.QUEUE_SIZE + equal
					+ csParameter.getQueueSize() + nl);
		} else {
			dumpBuilder.append("NOT CREATE\n");
		}
		dumpBuilder.append("3-4.SharedMemoryCommunication\n");
		if (csParameter.isCheckSharedMemoryCommunication()) {
			dumpBuilder.append(LabelConstants.DATA_SIZE
					+ equal
					+ csParameter.getSharedMemoryDataSize()
					+ " "
					+ csParameter.getSharedMemoryDataSizeUnit() + nl);
			dumpBuilder.append(LabelConstants.OPERATION_TYPE + equal
					+ csParameter.getOperationType()
					+ nl);
		} else {
			dumpBuilder.append("NOT CREATE\n");
		}
		dumpBuilder.append("3-5.SharedRegisterCommunication\n");
		if (csParameter.isCheckSharedMemoryCommunication()) {
			dumpBuilder.append(LabelConstants.DATA_SIZE
					+ equal
					+ csParameter.getSharedRegisterDataSize()
					+ " "
					+ csParameter.getSharedRegisterDataSizeUnit() + nl);
			dumpBuilder.append(LabelConstants.DATA_SIZE + equal
					+ csParameter.getNRegister() + nl);
		} else {
			dumpBuilder.append("NOT CREATE\n");
		}

		// Creates the dump str of cache preferences.
		CacheDataPreferences cdParameter = preferences
				.getCacheDataPreferences();
		dumpBuilder.append("4.Cache\n");
		CacheTypeSelect cacheType = cdParameter.getCacheType();
		dumpBuilder.append("Cache Type" + equal + cacheType + nl);
		switch (cacheType) {
		case NONE:
			break;
		case UNIFIED:
		case DATA:
		case INSTRUCTION:
			dumpBuilder.append("4-1.Cache("
					+ cacheType.toString().toLowerCase() + ")");
			dumpBuilder.append(LabelConstants.CACHE_COHERENCY + equal
					+ cdParameter.getData().getCacheCoherenecy() + nl);
			dumpBuilder.append(LabelConstants.CACHE_SIZE + equal
					+ cdParameter.getData().getSize() + " "
					+ cdParameter.getData().getSizeUnit()
					+ nl);
			dumpBuilder.append(LabelConstants.NUMBER_OF_WAY + equal
					+ cdParameter.getData().getNWay() + nl);
			dumpBuilder.append(LabelConstants.LINE_SIZE + equal
					+ cdParameter.getData().getLineSize() + nl);
			dumpBuilder.append(LabelConstants.LOCKDOWN_TYPE + equal
					+ cdParameter.getData().getLockDownType()
					+ nl);
			break;
		case DATA_AND_INSTRUCTION:
			dumpBuilder.append("4-1.Cache(Data)");
			dumpBuilder.append(LabelConstants.CACHE_COHERENCY + equal
					+ cdParameter.getData().getCacheCoherenecy() + nl);
			dumpBuilder.append(LabelConstants.CACHE_SIZE + equal
					+ cdParameter.getData().getSize() + " "
					+ cdParameter.getData().getSizeUnit()
					+ nl);
			dumpBuilder.append(LabelConstants.NUMBER_OF_WAY + equal
					+ cdParameter.getData().getNWay() + nl);
			dumpBuilder.append(LabelConstants.LINE_SIZE + equal
					+ cdParameter.getData().getLineSize() + nl);
			dumpBuilder.append(LabelConstants.LOCKDOWN_TYPE + equal
					+ cdParameter.getData().getLockDownType()
					+ nl);

			dumpBuilder.append("4-2.Cache(Instruction)");
			dumpBuilder.append(LabelConstants.CACHE_COHERENCY + equal
					+ cdParameter.getInstruction().getCacheCoherenecy() + nl);
			dumpBuilder.append(LabelConstants.CACHE_SIZE + equal
					+ cdParameter.getInstruction().getSize() + " "
					+ cdParameter.getInstruction().getSizeUnit()
					+ nl);
			dumpBuilder.append(LabelConstants.NUMBER_OF_WAY + equal
					+ cdParameter.getInstruction().getNWay() + nl);
			dumpBuilder.append(LabelConstants.LINE_SIZE + equal
					+ cdParameter.getInstruction().getLineSize() + nl);
			dumpBuilder.append(LabelConstants.LOCKDOWN_TYPE + equal
					+ cdParameter.getInstruction().getLockDownType()
					+ nl);
		}

		// Creates the dump str of AccessTypes preferences.
		AccessTypePreferences atParameter = preferences
				.getAccessTypePreferences();
		StringBuilder rwBuilder = new StringBuilder();
		if (atParameter.isCheckR()) {
			rwBuilder.append("R");
		}
		if (atParameter.isCheckRW()) {
			if (rwBuilder.length() > 0) {
				rwBuilder.append(", ");
			}
			rwBuilder.append("RW");
		}
		if (atParameter.isCheckRWX()) {
			if (rwBuilder.length() > 0) {
				rwBuilder.append(", ");
			}
			rwBuilder.append("RWX");
		}
		if (atParameter.isCheckRX()) {
			if (rwBuilder.length() > 0) {
				rwBuilder.append(", ");
			}
			rwBuilder.append("RX");
		}
		if (atParameter.isCheckW()) {
			if (rwBuilder.length() > 0) {
				rwBuilder.append(", ");
			}
			rwBuilder.append("W");
		}
		if (atParameter.isCheckX()) {
			if (rwBuilder.length() > 0) {
				rwBuilder.append(", ");
			}
			rwBuilder.append("X");
		}

		dumpBuilder.append("5.AccessType\n");
		dumpBuilder.append(LabelConstants.RW_TYPE + equal
				+ rwBuilder.toString() + nl);
		dumpBuilder.append(LabelConstants.ACCESS_BYTE_SIZE + equal
				+ atParameter.getAccessByteSize() + nl);
		dumpBuilder.append(LabelConstants.NUMBER_OF_BURST + equal
				+ atParameter.getNBurst() + nl);

		return dumpBuilder.toString();
	}
}
