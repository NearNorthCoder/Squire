/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.basics.cerberus;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squirecerberus")
public interface SquireCerberusConfig
extends Config {
    @ConfigSection(name="Banking/Gear", description="Banking and Gear config", position=1)
    public static final  String BANKING_SECTION;
    @ConfigSection(name="Combat", description="Combat config", position=2)
    public static final  String COMBAT_SECTION;

    @ConfigItem(position=5, keyName="eatAtHealth", name="Eat at health", description="Plugin will eat food at this health", section="COMBAT_SECTION")
    default public int eatAtHealth() {
        return 0xF5 ^ 0xB4;
    }

    @ConfigItem(position=7, keyName="drinkPrayAtGhost", name="Drink pray at ghost", description="Stay above this prayer amount when ghosts are up", section="COMBAT_SECTION")
    default public int drinkAtPrayerGhost() {
        return 0x67 ^ 0x15 ^ (0xE2 ^ 0xA2);
    }

    @ConfigItem(position=1, keyName="bankLoadout", name="Bank loadout", description="The loadout to use when banking", section="BANKING_SECTION")
    default public ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    @ConfigItem(position=6, keyName="prayAtAmount", name="Drink pray at", description="Plugin will drink prayer potion at this amount", section="COMBAT_SECTION")
    default public int drinkAtPrayer() {
        return 0xE ^ 0x3B ^ (0x92 ^ 0x84);
    }

    @ConfigItem(position=2, keyName="bankUnderAmount", name="Food to bank under", description="Under this amount we will not start a new kill", section="BANKING_SECTION")
    default public int bankUnderAmount() {
        return 2;
    }

    @ConfigItem(position=2, keyName="specGear", name="Special Attack Gear", description="Gear to equip when using special attack", section="BANKING_SECTION")
    default public ConfigStorageBox<EquipmentSetup> cerbSpecGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    static {
        BANKING_SECTION = "BANKING_SECTION";
        COMBAT_SECTION = "COMBAT_SECTION";
    }

    @ConfigItem(position=99, keyName="scatterAshes", name="Scatter Ashes", description="Should we scatter the ashes that we loot?")
    default public boolean scatterAshes() {
        return 1 != 0;
    }

    @ConfigItem(position=15, keyName="forceTeleportAtHp", name="Force teleport under hp", description="Plugin will force teleport at this health with no food", section="COMBAT_SECTION")
    default public int forceTeleportAtHp() {
        return 0xC2 ^ 0x8C ^ (0x4E ^ 0x29);
    }
}

