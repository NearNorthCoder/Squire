package gg.squire.corp;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@ConfigGroup("squirecorp")
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:gg/squire/corp/SquireCorpConfig.class */
public interface SquireCorpConfig extends Config {
    @ConfigItem(position = 2, keyName = "fightGear", name = "Fight Gear", description = "Loadout for fight Gear")
    default ConfigStorageBox<EquipmentSetup> fightLoadout() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 3, keyName = "boostPercentage", name = "Boost percentage", description = "At what percentage (of original boost) should we repot boosting potions")
    @Range(min = 10, max = 90)
    default int boostPercentage() {
        return (85 ^ 122) ^ (66 ^ 43);
    }

    @ConfigItem(position = 2, keyName = "dwhGear", name = "DWH Gear", description = "Loadout for DWH Gear")
    default ConfigStorageBox<EquipmentSetup> dwhLoadout() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 3, keyName = "eatAt", name = "Eat at", description = "Hitpoints level to eat at")
    @Range(min = 40, max = 99)
    default int eatAt() {
        return 36 ^ 24;
    }

    @ConfigItem(position = 2, keyName = "arcGear", name = "Arclight Gear", description = "Loadout for Arclight Gear")
    default ConfigStorageBox<EquipmentSetup> arcLightLoadout() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 2, keyName = "bgsGear", name = "BGS Gear", description = "Loadout for BGS Gear")
    default ConfigStorageBox<EquipmentSetup> bgsLoadout() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 1, keyName = "bankLoadout", name = "Bank loadout", description = "Loadout to use when banking")
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    @ConfigItem(position = 3, keyName = "lootPrice", name = "Min. Loot GP", description = "Minimal gp to loot item at")
    default int lootThreshold() {
        return (-((-4622) & 22127)) & (-3) & 22507;
    }
}
