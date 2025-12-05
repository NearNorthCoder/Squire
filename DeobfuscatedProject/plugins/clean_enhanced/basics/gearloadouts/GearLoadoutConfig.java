/*
 * Deobfuscated from GearLoadoutConfig
 * Package: gg.squire.basics.gearloadouts
 *
 * Configuration for gear loadout quick-switching.
 * Allows saving equipment setups for fast gear changes.
 */
package gg.squire.basics.gearloadouts;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

/**
 * Configuration for Gear Loadout plugin.
 * Stores equipment setup presets for quick switching.
 */
@ConfigGroup(value="squire_gear_loadouts")
public interface GearLoadoutConfig extends Config {

    /** Config group identifier */
    public static final String GEAR_LOADOUT_CONFIG_GROUP = "squire_gear_loadouts";

    /**
     * First loadout slot configuration.
     *
     * @return equipment setup for loadout 1
     */
    @ConfigItem(
        keyName="loadout0",
        name="Loadout 1",
        description="The loadout to use for loadout 1",
        position=1
    )
    default ConfigStorageBox<EquipmentSetup> loadout1() {
        return new ConfigStorageBox<>("equipmentsetup", "");
    }
}
