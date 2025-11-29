/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.basics.gearloadouts;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squire_gear_loadouts")
public interface GearLoadoutConfig
extends Config {
    public static final /* synthetic */ String GEAR_LOADOUT_CONFIG_GROUP;

    @ConfigItem(keyName="loadout0", name="Loadout 1", description="The loadout to use for loadout 1", position=1)
    default public ConfigStorageBox<EquipmentSetup> loadout1() {
        return new ConfigStorageBox("equipmentsetup", "");
    }

    static {
        GEAR_LOADOUT_CONFIG_GROUP = "squire_gear_loadouts";
    }
}

