/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.config.Range
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.zammy;

import m.e.a.i.z.m.r.-.q.s.y.u.AEnum;
import m.e.a.i.z.m.r.-.q.s.y.u.BEnum;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squirezammy")
public interface SquireZammyConfig
extends Config {
    public static final /* synthetic */ String ZAMMY_CONFIG_GROUP;

    static {
        ZAMMY_CONFIG_GROUP = "squirezammy";
    }

    @ConfigItem(keyName="zammy.eatrange", name="Eat at hp", description="At what hp should the plugin eat food?", position=14)
    @Range(min=20, max=80)
    default public int eatFoodAt() {
        return 0x17 ^ 0x25;
    }

    @ConfigItem(keyName="looting.walk", name="Turn off run for looting", description="Turns off run to save energy for looting", position=13)
    default public boolean turnOffRun() {
        return false;
    }

    @ConfigItem(keyName="zammy.altarteleport", name="Teleport out using altar", description="Uses the teleport option on the altar to leave the room", position=11)
    default public boolean altarTeleport() {
        return ((0x24 ^ 0x15 ^ (0xE ^ 0x68)) & (0x1F ^ 0x4C ^ (0x38 ^ 0x3C) ^ -1)) != 0;
    }

    @ConfigItem(keyName="zammy.mageprayer", name="Mage prayer", description="What mage prayer to use", position=12)
    default public a magePrayer() {
        return a.MYSTIC_MIGHT;
    }

    @ConfigItem(keyName="zammy.rangeprayer", name="Range prayer", description="What range prayer to use", position=12)
    default public b rangePrayer() {
        return b.EAGLE_EYE;
    }

    @ConfigItem(name="Ranged Gear", description="The ranged gear (with bowfa) for killing zammy", keyName="general.gear.range", position=15)
    default public ConfigStorageBox<EquipmentSetup> rangedGear() {
        return new ConfigStorageBox("equipmentsetup", "");
    }

    @ConfigItem(name="Mage gear", description="The mage gear for healing on zammy minions", keyName="general.gear.mage", position=17)
    default public ConfigStorageBox<EquipmentSetup> mageGear() {
        return new ConfigStorageBox("equipmentsetup", "");
    }

    @ConfigItem(keyName="minions.bp", name="Use blowpipe spec", description="Swaps to blowpipe for spec heal on minions", position=14)
    default public boolean useBlowpipe() {
        return false;
    }

    @ConfigItem(keyName="zammy.barrage", name="Use barrage", description="Swaps to barrage usage instead of burst", position=14)
    default public boolean useBloodBarrage() {
        return 1 != 0;
    }
}

