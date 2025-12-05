/*
 * Deobfuscated from DagannothKingConfig
 * Package: gg.squire.basics.dagannothkings
 *
 * Configuration interface for the Squire Dagannoth Kings plugin.
 * Provides settings for consumables and prayer management.
 *
 * Note: The config group value references "squiresarachnis" which appears
 * to be a copy-paste error from another plugin.
 */
package gg.squire.basics.dagannothkings;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

/**
 * Configuration for Dagannoth Kings combat plugin.
 * Controls consumable usage and prayer flicking.
 */
@ConfigGroup(value="squiresarachnis")
public interface DagannothKingConfig extends Config {

    /** Consumables configuration section */
    public static final String CONSUMABLE_SETTINGS = "Consumable Settings";

    /**
     * Health threshold for eating food.
     * Eats when missing this much HP.
     *
     * @return missing health to trigger eating (default: 40)
     */
    @ConfigItem(
        position=11,
        keyName="eatMissing",
        name="Eat At X Health Missing",
        description="EAt at missing x health",
        section="Consumable Settings"
    )
    @Range(min=1, max=99)
    default int eatMissingHealth() {
        return 40; // 53 + 126 - 78 + 90 ^ 77 + 39 - 50 + 85
    }

    /**
     * Prayer points threshold for drinking prayer potions.
     *
     * @return prayer points to restore at (default: 20)
     */
    @ConfigItem(
        position=12,
        keyName="restorePrayerLevel",
        name="Drink Prayer Potion at x prayer",
        description="Drink Prayer Potion at x prayer",
        section="Consumable Settings"
    )
    @Range(min=1, max=99)
    default int restorePrayerLevel() {
        return 20; // 216 + 155 - 160 + 21 ^ 116 + 178 - 244 + 142
    }

    /**
     * Whether to flick piety prayer for damage boost.
     *
     * @return true to enable piety flicking (default: true)
     */
    @ConfigItem(
        position=13,
        keyName="flickPiety",
        name="Flick Piety",
        description="Flick Piety",
        section="Consumable Settings"
    )
    default boolean flickPiety() {
        return true;
    }
}
