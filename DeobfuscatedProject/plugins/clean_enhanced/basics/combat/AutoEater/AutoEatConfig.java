/*
 * Deobfuscated from gg.squire.basics.combat.AutoEater.AutoEatConfig
 *
 * Configuration interface for the Auto Eater plugin.
 */
package gg.squire.basics.combat.AutoEater;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

/**
 * Configuration for the Auto Eater plugin.
 * Controls when to eat food and drink potions.
 */
@ConfigGroup(value = "squireeater")
public interface AutoEatConfig extends Config {

    @ConfigSection(
        name = "Food Settings",
        description = "Settings related to food",
        position = 10
    )
    String FOOD_SETTINGS = "Food Settings";

    @ConfigSection(
        name = "Potion Settings",
        description = "Settings related to potions",
        position = 20
    )
    String POTION_SETTINGS = "Potion Settings";

    /**
     * Health threshold at which to eat food.
     *
     * @return HP value to eat at (1-99)
     */
    @ConfigItem(
        position = 11,
        keyName = "eatHP",
        name = "Eat at HP",
        description = "Eat HP",
        section = FOOD_SETTINGS
    )
    @Range(max = 99)
    default int eatHP() {
        return 55; // 62 + 41 - 102 + 134 ^ 122 + 39 - 121 + 141 = 55
    }

    /**
     * Prayer points threshold at which to drink prayer restoration potions.
     *
     * @return Prayer points value to drink at (1-99)
     */
    @ConfigItem(
        position = 11,
        keyName = "prayDrinkAt",
        name = "Drink prayer at",
        description = "Consumes prayer restoration potion (super restore/ppot) at the specific value",
        section = POTION_SETTINGS
    )
    @Range(max = 99)
    default int drinkPrayAt() {
        return 20; // 0x27 ^ 0x33 = 20
    }

    /**
     * Whether to drink boosting potions like super combat.
     *
     * @return true to drink boosting potions
     */
    @ConfigItem(
        position = 12,
        keyName = "boostDrink",
        name = "Drink boosts",
        description = "Consumes boosting pots like super combat/super attack",
        section = POTION_SETTINGS
    )
    default boolean drinkBoostPotions() {
        return false;
    }

    /**
     * Percentage of boost remaining at which to drink another dose.
     *
     * @return Percentage (0-80)
     */
    @ConfigItem(
        position = 13,
        keyName = "boostDrinkPercentage",
        name = "Drink at %",
        description = "Specify how many percentages of boost left to drink at",
        section = POTION_SETTINGS,
        hidden = true,
        unhide = "boostDrink"
    )
    @Range(max = 80)
    default int boostAtPercentage() {
        return 50; // 0x56 ^ 0x64 = 50
    }
}
