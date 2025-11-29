/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.client.config.Button
 *  net.runelite.client.config.Config
 *  net.runelite.client.config.ConfigGroup
 *  net.runelite.client.config.ConfigItem
 *  net.runelite.client.config.ConfigSection
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.config.Range
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package gg.squire.moons;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@ConfigGroup(value="squiremoonsofperil")
public interface SquireMoonsOfPerilConfig
extends Config {
    @ConfigSection(name="Gear Settings", description="Settings related to your gear", position=0)
    public static final  String GEAR_SETTINGS;
    @ConfigSection(name="Supplies Settings", description="Settings related to your supplies", position=1)
    public static final  String SUPPLY_SETTINGS;
    @ConfigSection(name="Fight Settings", description="Settings related to fights", position=1)
    public static final  String FIGHT_SETTINGS;

    @ConfigItem(position=1, keyName="minFoodBloodMoon", name="Min Food For Blood Moon", description="Minimum food to start another attempt", section="Fight Settings")
    @Range(min=1, max=20)
    default public int minimumBloodMoonFood() {
        return 0x84 ^ 0x8C;
    }

    @Range(min=1, max=20)
    @ConfigItem(position=1, keyName="minFoodBlueMoon", name="Min Food For Blue Moon", description="Minimum food to start another attempt", section="Fight Settings")
    default public int minimumBlueMoonFood() {
        return 78 + 31 - -31 + 19 ^ 83 + 40 - 103 + 131;
    }

    @ConfigItem(position=2, keyName="blueMoonGear", name="Blue Moon Gear", description="Gear setup attacking Blue Moon", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> blueMoonGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    static {
        GEAR_SETTINGS = "Gear Settings";
        SUPPLY_SETTINGS = "Supplies Settings";
        FIGHT_SETTINGS = "Fight Settings";
    }

    @ConfigItem(position=5, keyName="pause", name="Pause", description="Pause execution")
    default public Button pause() {
        return new Button();
    }

    @ConfigItem(position=1, keyName="eclipseGear", name="Eclipse Gear", description="Gear for attacking Eclipse", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> eclipseGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @Range(min=1, max=20)
    @ConfigItem(position=1, keyName="mFoodRequire", name="Min Food For New Run", description="Minimum food to start another attempt", section="Supplies Settings")
    default public int minimumFood() {
        return 1;
    }

    @ConfigItem(position=3, keyName="bloodMoonGear", name="Blood Moon Gear", description="Gear setup attacking Blood moon", section="Gear Settings")
    default public ConfigStorageBox<EquipmentSetup> bloodMoonGear() {
        return new ConfigStorageBox("equipmentsetup", "None");
    }

    @ConfigItem(position=0, keyName="eatAt", name="Eat at Hp %", description="hp % to eat at", section="Fight Settings")
    @Range(min=10, max=95)
    default public int eatAtHpPercent() {
        return 76 + 180 - 242 + 182 ^ 87 + 115 - 130 + 58;
    }

    @ConfigItem(position=1, keyName="minFoodEclipseMoon", name="Min Food For Eclipse Moon", description="Minimum food to start another attempt", section="Fight Settings")
    @Range(min=1, max=20)
    default public int minimumEclipseMoonFood() {
        return 0x49 ^ 0x41;
    }

    @ConfigItem(position=1, keyName="makeXPotions", name="Make X Potions", description="Make X potions during prep", section="Supplies Settings")
    @Range(min=1, max=10)
    default public int makeXPotions() {
        return 1;
    }
}

