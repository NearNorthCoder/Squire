package gg.squire.basics.combat.AutoEater;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
@ConfigGroup("squireeater")
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/AutoEater/AutoEatConfig.class */
public interface AutoEatConfig extends Config {
    @ConfigSection(name = "Food Settings", description = "Settings related to food", position = 10)
    public static final /* synthetic */ String foodSettings = "Food Settings";
    @ConfigSection(name = "Potion Settings", description = "Settings related to potions", position = 20)
    public static final /* synthetic */ String POTION_SETTINGS = "Potion Settings";

    /* JADX WARN: Multi-variable type inference failed */
    @ConfigItem(position = 12, keyName = "boostDrink", name = "Drink boosts", description = "Consumes boosting pots like super combat/super attack", section = "Potion Settings")
    default boolean drinkBoostPotions() {
        return ((56 ^ 127) ^ (226 ^ 140)) & (((((55 + 109) - 55) + 47) ^ (((131 + 148) - 138) + 40)) ^ (-" ".length()));
    }

    @ConfigItem(position = 11, keyName = "prayDrinkAt", name = "Drink prayer at", description = "Consumes prayer restoration potion (super restore/ppot) at the specific value", section = "Potion Settings")
    @Range(max = 99)
    default int drinkPrayAt() {
        return 39 ^ 51;
    }

    @ConfigItem(position = 13, keyName = "boostDrinkPercentage", name = "Drink at %", description = "Specify how many percentages of boost left to drink at", section = "Potion Settings", hidden = true, unhide = "boostDrink")
    @Range(max = 80)
    default int boostAtPercentage() {
        return 86 ^ 100;
    }

    @ConfigItem(position = 11, keyName = "eatHP", name = "Eat at HP", description = "Eat HP", section = "Food Settings")
    @Range(max = 99)
    default int eatHP() {
        return (((62 + 41) - 102) + 134) ^ (((122 + 39) - 121) + 141);
    }
}
