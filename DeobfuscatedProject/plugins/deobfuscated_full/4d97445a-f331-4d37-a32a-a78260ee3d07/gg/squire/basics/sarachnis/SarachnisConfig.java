/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.Range
 */
package gg.squire.basics.sarachnis;

import i.i.b.s.c.q.r.s.s.-.u.a.e.G;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiresarachnis")
public interface SarachnisConfig
extends Config {
    @ConfigSection(name="Consumable Settings", description="Settings related to Consumables", position=10)
    public static final /* synthetic */ String consumableSettings;
    @ConfigSection(name="Special Settings", description="Settings related to Special Attacks", position=30)
    public static final /* synthetic */ String specialSettings;

    @ConfigItem(keyName="specialWeapon", name="Wep", description="Which Weapon to use special attack with", position=32, hidden=true, unhide="specAttack", section="Special Settings")
    default public G specWeapon() {
        return G.DRAGON_BATTLEAXE;
    }

    @ConfigItem(position=12, keyName="restorePrayerLevel", name="Drink Prayer Potion at x prayer", description="Drink Prayer Potion at x prayer", section="Consumable Settings")
    @Range(min=1, max=99)
    default public int restorePrayerLevel() {
        return 0xB5 ^ 0x9D;
    }

    @ConfigItem(keyName="specAttack", name="Use Special Attack", description="Use Special Attack", position=31, section="Special Settings")
    default public boolean useSpecialAttack() {
        return 1 != 0;
    }

    @ConfigItem(position=13, keyName="flickPiety", name="Flick Piety", description="Flick Piety", section="Consumable Settings")
    default public boolean flickPiety() {
        return 1 != 0;
    }

    @ConfigItem(position=11, keyName="eatMissing", name="Eat At X Health Missing", description="EAt at missing x health", section="Consumable Settings")
    @Range(min=1, max=99)
    default public int eatMissingHealth() {
        return 0x79 ^ 0x51;
    }

    static {
        specialSettings = "Special Settings";
        consumableSettings = "Consumable Settings";
    }
}

