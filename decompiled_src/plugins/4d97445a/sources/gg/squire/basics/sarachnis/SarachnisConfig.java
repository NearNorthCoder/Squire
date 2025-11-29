package gg.squire.basics.sarachnis;

import i.i.b.s.c.q.r.s.s.p000.u.a.e.G;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squiresarachnis")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/sarachnis/SarachnisConfig.class */
public interface SarachnisConfig extends Config {
    @ConfigSection(name = "Special Settings", description = "Settings related to Special Attacks", position = 30)
    public static final /* synthetic */ String specialSettings = "Special Settings";
    @ConfigSection(name = "Consumable Settings", description = "Settings related to Consumables", position = 10)
    public static final /* synthetic */ String consumableSettings = "Consumable Settings";

    @ConfigItem(keyName = "specialWeapon", name = "Wep", description = "Which Weapon to use special attack with", position = 32, hidden = true, unhide = "specAttack", section = "Special Settings")
    default G specWeapon() {
        return G.DRAGON_BATTLEAXE;
    }

    @ConfigItem(position = 12, keyName = "restorePrayerLevel", name = "Drink Prayer Potion at x prayer", description = "Drink Prayer Potion at x prayer", section = "Consumable Settings")
    @Range(min = 1, max = 99)
    default int restorePrayerLevel() {
        return 181 ^ 157;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(keyName = "specAttack", name = "Use Special Attack", description = "Use Special Attack", position = 31, section = "Special Settings")
    default boolean useSpecialAttack() {
        return " ".length();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @ConfigItem(position = 13, keyName = "flickPiety", name = "Flick Piety", description = "Flick Piety", section = "Consumable Settings")
    default boolean flickPiety() {
        return " ".length();
    }

    @ConfigItem(position = 11, keyName = "eatMissing", name = "Eat At X Health Missing", description = "EAt at missing x health", section = "Consumable Settings")
    @Range(min = 1, max = 99)
    default int eatMissingHealth() {
        return 121 ^ 81;
    }
}
