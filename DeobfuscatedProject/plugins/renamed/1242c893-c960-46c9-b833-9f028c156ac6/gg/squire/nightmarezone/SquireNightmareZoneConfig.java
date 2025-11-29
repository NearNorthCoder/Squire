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
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.nightmarezone;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q.CEnum;

@ConfigGroup(value="squirenightmarezone")
public interface SquireNightmareZoneConfig
extends Config {
    @ConfigSection(name="Prayer settings", description="Settings to configure prayer", position=2)
    public static final /* synthetic */ String PRAYER_SETTINGS;
    @ConfigSection(name="Power-up settings", description="Settings to configure power-ups", position=3)
    public static final /* synthetic */ String POWER_UP_SETTINGS;
    @ConfigSection(name="General settings", description="General settings", position=1)
    public static final /* synthetic */ String GENERAL_SETTINGS;

    @ConfigItem(keyName="switchStyle", name="Switch Style", description="On melee it will switch attack styles upon hitting a 99", position=17, section="General settings")
    default public boolean switchAttackStyle() {
        return false;
    }

    @ConfigItem(keyName="perfectFlick", name="Perfect prayer flick", description="Prayer flick perfectly to avoid taking all damage", position=2, section="Prayer settings", hidden=true, unhide="usePrayer", unhideValue="true")
    default public boolean perfectFlick() {
        return ((219 + 111 - 303 + 193 ^ 148 + 174 - 216 + 87) & (0x5E ^ 2 ^ (0x81 ^ 0xC0) ^ -1)) != 0;
    }

    @ConfigItem(keyName="usePrayer", name="Use Prayer", description="Do you want to use prayers?", position=1, section="Prayer settings")
    default public boolean usePrayer() {
        return false;
    }

    @ConfigItem(keyName="offensivePrayer", name="Offensive Prayer", description="Select which offensive prayer to flick", position=2, section="Prayer settings", hidden=true, unhide="usePrayer", unhideValue="true")
    default public c offensivePrayer() {
        return c.PIETY;
    }

    @ConfigItem(keyName="protectFromMelee", name="Protect From Melee?", description="Do you want to flick protect from melee?", position=3, section="Prayer settings", hidden=true, unhide="usePrayer", unhideValue="true")
    default public boolean protectFromMelee() {
        return ((0x41 ^ 0x15 ^ (0x6A ^ 7)) & (0xD5 ^ 0xA7 ^ (0x57 ^ 0x1C) ^ -1)) != 0;
    }

    @ConfigItem(keyName="specGear", name="Spec Gear", description="Select special attack gear loadout", position=6, section="Powerup settings", hidden=true, unhide="powerSurge", unhideValue="true")
    default public ConfigStorageBox<EquipmentSetup> specGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(keyName="overload", name="Overload Doses", description="How many overload doses to start with", position=10, section="General settings")
    @Range(max=112)
    default public int overload() {
        return 0x79 ^ 0x42 ^ (0xBD ^ 0x9E);
    }

    @ConfigItem(keyName="powerSurge", name="Special Attack", description="Utilizes Power Surge to special attack", position=1, section="Powerup settings")
    default public boolean powerSurge() {
        return 1 != 0;
    }

    @ConfigItem(keyName="Herb Box", name="Buy Herb Boxes", description="Will buy and open herb boxes with spare points", position=16, section="General settings")
    default public boolean herbBox() {
        return false;
    }

    static {
        POWER_UP_SETTINGS = "Powerup settings";
        PRAYER_SETTINGS = "Prayer settings";
        GENERAL_SETTINGS = "General settings";
    }

    @Range(max=112)
    @ConfigItem(keyName="absorption", name="Absorption Doses", description="How many absorption doses to start with", position=15, section="General settings")
    default public int absorption() {
        return 0xD3 ^ 0x9B;
    }
}

