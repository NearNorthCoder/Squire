/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Barrows Plugin
 *
 * Manages gear loadouts for different brothers and scenarios.
 * Retrieves equipment setups from config and converts them to item ID arrays.
 */
package gg.squire.barrows;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

/**
 * Manages gear setups for different Barrows brothers and tunnel creatures.
 * Retrieves equipment configurations from the plugin config.
 */
@Singleton
public class GearManager {
    private final SquireBarrowsConfig config;

    @Inject
    public GearManager(SquireBarrowsConfig config) {
        this.config = config;
    }

    /**
     * Gets the gear IDs for attacking a specific brother.
     *
     * @param brother The brother to get gear for
     * @return Array of item IDs to equip
     */
    public int[] getAttackGear(Brother brother) {
        switch (BrotherSwitch.BROTHER_ORDINAL_MAP[brother.ordinal()]) {
            case 1: // AHRIM
                return getEquipmentIds(this.config.ahrimGear());
            case 2: // KARIL
                return getEquipmentIds(this.config.karilGear());
            default:
                return getEquipmentIds(this.config.mageGear());
        }
    }

    /**
     * Gets the special attack gear IDs for a specific brother.
     *
     * @param brother The brother to get spec gear for
     * @return Array of item IDs to equip before special attacking
     */
    public int[] getSpecGear(Brother brother) {
        switch (BrotherSwitch.BROTHER_ORDINAL_MAP[brother.ordinal()]) {
            case 1: // AHRIM
                return getEquipmentIds(this.config.ahrimSpecGear());
            case 2: // KARIL
                return getEquipmentIds(this.config.karilSpecGear());
            default:
                return new int[0];
        }
    }

    /**
     * Gets the gear IDs for fighting tunnel creatures.
     *
     * @return Array of item IDs to equip in tunnels
     */
    public int[] getTunnelGear() {
        return getEquipmentIds(this.config.tunnelGear());
    }

    /**
     * Gets the bank loadout configuration.
     *
     * @return The configured bank loadout
     */
    public BankLoadout getBankLoadout() {
        return (BankLoadout) this.config.bankLoadout().selected(BankLoadout.class);
    }

    /**
     * Extracts item IDs from an equipment setup config.
     *
     * @param equipmentBox The equipment setup config box
     * @return Array of item IDs, or empty array if setup is null
     */
    private int[] getEquipmentIds(ConfigStorageBox<EquipmentSetup> equipmentBox) {
        EquipmentSetup setup = (EquipmentSetup) equipmentBox.selected(EquipmentSetup.class);
        if (setup != null) {
            return setup.getIds();
        }
        return new int[0];
    }
}
