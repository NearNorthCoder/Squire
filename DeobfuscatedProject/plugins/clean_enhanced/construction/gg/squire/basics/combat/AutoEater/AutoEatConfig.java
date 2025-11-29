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
package gg.squire.basics.combat.AutoEater;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup(value="squireeater")
public interface AutoEatConfig
extends Config {
    @ConfigSection(name="Potion Settings", description="Settings related to potions", position=20)
    public static final  String POTION_SETTINGS;
    @ConfigSection(name="Food Settings", description="Settings related to food", position=10)
    public static final  String foodSettings;

    static {
        foodSettings = "Food Settings";
        POTION_SETTINGS = "Potion Settings";
    }

    @ConfigItem(position=12, keyName="boostDrink", name="Drink boosts", description="Consumes boosting pots like super combat/super attack", section="Potion Settings")
    default public boolean drinkBoostPotions() {
        return ((0x38 ^ 0x7F ^ (0xE2 ^ 0x8C)) & (55 + 109 - 55 + 47 ^ 131 + 148 - 138 + 40 ^ -1)) != 0;
    }

    @ConfigItem(position=11, keyName="prayDrinkAt", name="Drink prayer at", description="Consumes prayer restoration potion (super restore/ppot) at the specific value", section="Potion Settings")
    @Range(max=99)
    default public int drinkPrayAt() {
        return 0x27 ^ 0x33;
    }

    @ConfigItem(position=13, keyName="boostDrinkPercentage", name="Drink at %", description="Specify how many percentages of boost left to drink at", section="Potion Settings", hidden=true, unhide="boostDrink")
    @Range(max=80)
    default public int boostAtPercentage() {
        return 0x56 ^ 0x64;
    }

    @Range(max=99)
    @ConfigItem(position=11, keyName="eatHP", name="Eat at HP", description="Eat HP", section="Food Settings")
    default public int eatHP() {
        return 62 + 41 - 102 + 134 ^ 122 + 39 - 121 + 141;
    }
}

