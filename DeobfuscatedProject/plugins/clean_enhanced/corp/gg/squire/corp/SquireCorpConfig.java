/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.config.Range
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.corp;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squirecorp")
public interface SquireCorpConfig
extends Config {
    @ConfigItem(position=2, keyName="fightGear", name="Fight Gear", description="Loadout for fight Gear")
    default public ConfigStorageBox<EquipmentSetup> fightLoadout() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @Range(min=10, max=90)
    @ConfigItem(position=3, keyName="boostPercentage", name="Boost percentage", description="At what percentage (of original boost) should we repot boosting potions")
    default public int boostPercentage() {
        return 0x55 ^ 0x7A ^ (0x42 ^ 0x2B);
    }

    @ConfigItem(position=2, keyName="dwhGear", name="DWH Gear", description="Loadout for DWH Gear")
    default public ConfigStorageBox<EquipmentSetup> dwhLoadout() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @Range(min=40, max=99)
    @ConfigItem(position=3, keyName="eatAt", name="Eat at", description="Hitpoints level to eat at")
    default public int eatAt() {
        return 0x24 ^ 0x18;
    }

    @ConfigItem(position=2, keyName="arcGear", name="Arclight Gear", description="Loadout for Arclight Gear")
    default public ConfigStorageBox<EquipmentSetup> arcLightLoadout() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=2, keyName="bgsGear", name="BGS Gear", description="Loadout for BGS Gear")
    default public ConfigStorageBox<EquipmentSetup> bgsLoadout() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=1, keyName="bankLoadout", name="Bank loadout", description="Loadout to use when banking")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(position=3, keyName="lootPrice", name="Min. Loot GP", description="Minimal gp to loot item at")
    default public int lootThreshold() {
        return -(0xFFFFEDF2 & 0x566F) & (0xFFFFFFFD & 0x57EB);
    }
}

