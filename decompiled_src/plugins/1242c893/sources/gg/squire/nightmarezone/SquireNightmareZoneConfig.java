package gg.squire.nightmarezone;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import s.o.r.e.i.t.h.p000.z.n.g.u.r.e.m.e.n.i.a.p001.q.c;
@ConfigGroup("squirenightmarezone")
/* loaded from: 1242c893-c960-46c9-b833-9f028c156ac6.jar:gg/squire/nightmarezone/SquireNightmareZoneConfig.class */
public interface SquireNightmareZoneConfig extends Config {
    @ConfigSection(name = "Power-up settings", description = "Settings to configure power-ups", position = 3)
    public static final /* synthetic */ String POWER_UP_SETTINGS = "Powerup settings";
    @ConfigSection(name = "Prayer settings", description = "Settings to configure prayer", position = 2)
    public static final /* synthetic */ String PRAYER_SETTINGS = "Prayer settings";
    @ConfigSection(name = "General settings", description = "General settings", position = 1)
    public static final /* synthetic */ String GENERAL_SETTINGS = "General settings";

    @ConfigItem(keyName = "switchStyle", name = "Switch Style", description = "On melee it will switch attack styles upon hitting a 99", position = 17, section = "General settings")
    default boolean switchAttackStyle() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "perfectFlick", name = "Perfect prayer flick", description = "Prayer flick perfectly to avoid taking all damage", position = 2, section = "Prayer settings", hidden = true, unhide = "usePrayer", unhideValue = "true")
    default boolean perfectFlick() {
        return ((((219 + 111) - 303) + 193) ^ (((148 + 174) - 216) + 87)) & (((94 ^ 2) ^ (129 ^ 192)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "usePrayer", name = "Use Prayer", description = "Do you want to use prayers?", position = 1, section = "Prayer settings")
    default boolean usePrayer() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(keyName = "offensivePrayer", name = "Offensive Prayer", description = "Select which offensive prayer to flick", position = 2, section = "Prayer settings", hidden = true, unhide = "usePrayer", unhideValue = "true")
    default c offensivePrayer() {
        return c.PIETY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(keyName = "protectFromMelee", name = "Protect From Melee?", description = "Do you want to flick protect from melee?", position = 3, section = "Prayer settings", hidden = true, unhide = "usePrayer", unhideValue = "true")
    default boolean protectFromMelee() {
        return ((65 ^ 21) ^ (106 ^ 7)) & (((213 ^ 167) ^ (87 ^ 28)) ^ (-" ".length()));
    }

    @ConfigItem(keyName = "specGear", name = "Spec Gear", description = "Select special attack gear loadout", position = 6, section = "Powerup settings", hidden = true, unhide = "powerSurge", unhideValue = "true")
    default ConfigStorageBox<EquipmentSetup> specGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(keyName = "overload", name = "Overload Doses", description = "How many overload doses to start with", position = 10, section = "General settings")
    @Range(max = 112)
    default int overload() {
        return (121 ^ 66) ^ (189 ^ 158);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [int, boolean] */
    @ConfigItem(keyName = "powerSurge", name = "Special Attack", description = "Utilizes Power Surge to special attack", position = 1, section = "Powerup settings")
    default boolean powerSurge() {
        return " ".length();
    }

    @ConfigItem(keyName = "Herb Box", name = "Buy Herb Boxes", description = "Will buy and open herb boxes with spare points", position = 16, section = "General settings")
    default boolean herbBox() {
        return (true ^ true) & ((true ^ true) ^ true);
    }

    @ConfigItem(keyName = "absorption", name = "Absorption Doses", description = "How many absorption doses to start with", position = 15, section = "General settings")
    @Range(max = 112)
    default int absorption() {
        return 211 ^ 155;
    }
}
