/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Keybind
 */
package gg.squire.basics.prayer.prayerflicker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Keybind;

@ConfigGroup(value="squireflicker")
public interface PrayFlickerConfig
extends Config {
    @ConfigSection(name="Pray Flicking Settings", description="Settings related to pray flicking", position=10)
    public static final /* synthetic */ String FLICK_SETTINGS;

    @ConfigItem(position=12, keyName="keepPrayerOn", name="Keep On", description="Keeps the prayers on after using the hotkey (for safety)", section="Pray Flicking Settings")
    default public boolean keepPrayerOn() {
        return " ".length() != 0;
    }

    static {
        FLICK_SETTINGS = "Pray Flicking Settings";
    }

    @ConfigItem(position=13, keyName="flickHotkey", name="Flicking Hotkey", description="Enable or disable flicking when pressing this hotkey", section="Pray Flicking Settings")
    default public Keybind flickHotkey() {
        return Keybind.NOT_SET;
    }

    @ConfigItem(position=11, keyName="flickInCombat", name="Only In Combat", description="Flick In Combat", section="Pray Flicking Settings")
    default public boolean flickInCombat() {
        return " ".length() != 0;
    }
}

