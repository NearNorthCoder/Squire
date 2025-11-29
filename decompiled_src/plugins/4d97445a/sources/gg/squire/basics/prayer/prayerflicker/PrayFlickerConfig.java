package gg.squire.basics.prayer.prayerflicker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Keybind;
@ConfigGroup("squireflicker")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/prayer/prayerflicker/PrayFlickerConfig.class */
public interface PrayFlickerConfig extends Config {
    @ConfigSection(name = "Pray Flicking Settings", description = "Settings related to pray flicking", position = 10)
    public static final /* synthetic */ String FLICK_SETTINGS = "Pray Flicking Settings";

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 12, keyName = "keepPrayerOn", name = "Keep On", description = "Keeps the prayers on after using the hotkey (for safety)", section = "Pray Flicking Settings")
    default boolean keepPrayerOn() {
        return " ".length();
    }

    @ConfigItem(position = 13, keyName = "flickHotkey", name = "Flicking Hotkey", description = "Enable or disable flicking when pressing this hotkey", section = "Pray Flicking Settings")
    default Keybind flickHotkey() {
        return Keybind.NOT_SET;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 11, keyName = "flickInCombat", name = "Only In Combat", description = "Flick In Combat", section = "Pray Flicking Settings")
    default boolean flickInCombat() {
        return " ".length();
    }
}
