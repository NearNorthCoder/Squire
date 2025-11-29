package gg.squire.basics.gearloadouts;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@ConfigGroup("squire_gear_loadouts")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/gearloadouts/GearLoadoutConfig.class */
public interface GearLoadoutConfig extends Config {
    public static final /* synthetic */ String GEAR_LOADOUT_CONFIG_GROUP = "squire_gear_loadouts";

    @ConfigItem(keyName = "loadout0", name = "Loadout 1", description = "The loadout to use for loadout 1", position = 1)
    default ConfigStorageBox<EquipmentSetup> loadout1() {
        return new ConfigStorageBox<>("equipmentsetup", "");
    }
}
