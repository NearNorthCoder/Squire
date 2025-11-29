package gg.squire.moons;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
@ConfigGroup("squiremoonsofperil")
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:gg/squire/moons/SquireMoonsOfPerilConfig.class */
public interface SquireMoonsOfPerilConfig extends Config {
    @ConfigSection(name = "Gear Settings", description = "Settings related to your gear", position = 0)
    public static final /* synthetic */ String GEAR_SETTINGS = "Gear Settings";
    @ConfigSection(name = "Supplies Settings", description = "Settings related to your supplies", position = 1)
    public static final /* synthetic */ String SUPPLY_SETTINGS = "Supplies Settings";
    @ConfigSection(name = "Fight Settings", description = "Settings related to fights", position = 1)
    public static final /* synthetic */ String FIGHT_SETTINGS = "Fight Settings";

    @ConfigItem(position = 1, keyName = "minFoodBloodMoon", name = "Min Food For Blood Moon", description = "Minimum food to start another attempt", section = "Fight Settings")
    @Range(min = 1, max = 20)
    default int minimumBloodMoonFood() {
        return 132 ^ 140;
    }

    @ConfigItem(position = 1, keyName = "minFoodBlueMoon", name = "Min Food For Blue Moon", description = "Minimum food to start another attempt", section = "Fight Settings")
    @Range(min = 1, max = 20)
    default int minimumBlueMoonFood() {
        return (((78 + 31) - (-31)) + 19) ^ (((83 + 40) - 103) + 131);
    }

    @ConfigItem(position = 2, keyName = "blueMoonGear", name = "Blue Moon Gear", description = "Gear setup attacking Blue Moon", section = "Gear Settings")
    default ConfigStorageBox<EquipmentSetup> blueMoonGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 5, keyName = "pause", name = "Pause", description = "Pause execution")
    default Button pause() {
        return new Button();
    }

    @ConfigItem(position = 1, keyName = "eclipseGear", name = "Eclipse Gear", description = "Gear for attacking Eclipse", section = "Gear Settings")
    default ConfigStorageBox<EquipmentSetup> eclipseGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 1, keyName = "mFoodRequire", name = "Min Food For New Run", description = "Minimum food to start another attempt", section = "Supplies Settings")
    @Range(min = 1, max = 20)
    default int minimumFood() {
        return " ".length();
    }

    @ConfigItem(position = 3, keyName = "bloodMoonGear", name = "Blood Moon Gear", description = "Gear setup attacking Blood moon", section = "Gear Settings")
    default ConfigStorageBox<EquipmentSetup> bloodMoonGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    @ConfigItem(position = 0, keyName = "eatAt", name = "Eat at Hp %", description = "hp % to eat at", section = "Fight Settings")
    @Range(min = 10, max = 95)
    default int eatAtHpPercent() {
        return (((76 + 180) - 242) + 182) ^ (((87 + 115) - 130) + 58);
    }

    @ConfigItem(position = 1, keyName = "minFoodEclipseMoon", name = "Min Food For Eclipse Moon", description = "Minimum food to start another attempt", section = "Fight Settings")
    @Range(min = 1, max = 20)
    default int minimumEclipseMoonFood() {
        return 73 ^ 65;
    }

    @ConfigItem(position = 1, keyName = "makeXPotions", name = "Make X Potions", description = "Make X potions during prep", section = "Supplies Settings")
    @Range(min = 1, max = 10)
    default int makeXPotions() {
        return " ".length();
    }
}
