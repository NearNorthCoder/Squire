/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.config.Range
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.gorillas;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squiregorillas")
public interface SquireGorillaConfig
extends Config {
    @ConfigSection(name="Loot Settings", description="Loot options", position=30)
    public static final  String LOOT_SETTINGS;
    @ConfigSection(name="Prayer Settings", description="Settings related to prayer options", position=20)
    public static final  String PRAYER_SETTINGS;
    @ConfigSection(name="Gear Settings", description="Settings related to gear", position=10)
    public static final  String GEAR_SETTINGS;
    @ConfigSection(name="Bank Settings", description="Settings related to banking", position=0)
    public static final  String BANK_SETTINGS;

    @ConfigItem(position=1, keyName="loot.value", name="Loot Above Value", description="Loot Above Value", section="Loot Settings")
    default public int lootValue() {
        return 0xFFFFD7CA & 0x3BBD;
    }

    @Range(min=20, max=85)
    @ConfigItem(position=2, keyName="eatAt", name="Hp to eat at", description="At what hp should we eat?", section="Bank Settings")
    default public int eatAt() {
        return 0x1E ^ 0x37;
    }

    @ConfigItem(position=2, keyName="gear.melee", name="Melee gear", description="Melee attack style gear", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> melee() {
        return new ConfigStorageBox("equipmentsetup", "");
    }

    @ConfigItem(position=1, keyName="prayer.ranged", name="Ranged prayer", description="What melee prayer to use with ranged gear", section="Prayer Settings")
    default public h rangePrayer() {
        return h.RIGOUR;
    }

    static {
        BANK_SETTINGS = "Bank Settings";
        PRAYER_SETTINGS = "Prayer Settings";
        GEAR_SETTINGS = "Gear Settings";
        LOOT_SETTINGS = "Loot Settings";
    }

    @ConfigItem(position=1, keyName="gear.ranged", name="Ranged gear", description="Ranged attack style gear", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> ranged() {
        return new ConfigStorageBox("equipmentsetup", "");
    }

    @ConfigItem(position=1, keyName="bank.loadout.selected", name="Bank loadout", description="Bank loadout to withdraw", section="Bank Settings")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(position=2, keyName="prayer.melee", name="Melee prayer", description="What melee prayer to use with melee gear", section="Prayer Settings")
    default public e meleePrayer() {
        return e.PIETY;
    }
}

