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
package gg.squire.basics.dagannothkings;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squiresarachnis")
public interface DagannothKingConfig
extends Config {
    @ConfigSection(name="Consumable Settings", description="Settings related to Consumables", position=10)
    public static final  String consumableSettings;

    static {
        consumableSettings = "Consumable Settings";
    }

    @ConfigItem(position=12, keyName="restorePrayerLevel", name="Drink Prayer Potion at x prayer", description="Drink Prayer Potion at x prayer", section="Consumable Settings")
    @Range(min=1, max=99)
    default public int restorePrayerLevel() {
        return 216 + 155 - 160 + 21 ^ 116 + 178 - 244 + 142;
    }

    @Range(min=1, max=99)
    @ConfigItem(position=11, keyName="eatMissing", name="Eat At X Health Missing", description="EAt at missing x health", section="Consumable Settings")
    default public int eatMissingHealth() {
        return 53 + 126 - 78 + 90 ^ 77 + 39 - 50 + 85;
    }

    @ConfigItem(position=13, keyName="flickPiety", name="Flick Piety", description="Flick Piety", section="Consumable Settings")
    default public boolean flickPiety() {
        return 1 != 0;
    }
}

