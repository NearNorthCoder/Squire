/*
 * Deobfuscated from SquireCerberusConfig
 * Package: gg.squire.basics.cerberus
 *
 * Configuration interface for the Squire Cerberus plugin.
 * Provides settings for banking, gear, and combat behavior during Cerberus kills.
 */
package gg.squire.basics.cerberus;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

/**
 * Configuration for Squire Cerberus plugin.
 * Controls banking, gear switching, and combat consumable usage.
 */
@ConfigGroup(value="squirecerberus")
public interface SquireCerberusConfig extends Config {

    /** Banking and gear configuration section */
    public static final String BANKING_SECTION = "BANKING_SECTION";

    /** Combat behavior configuration section */
    public static final String COMBAT_SECTION = "COMBAT_SECTION";

    /**
     * Health threshold for eating food.
     * @return health level to eat at (default: 69)
     */
    @ConfigItem(
        position=5,
        keyName="eatAtHealth",
        name="Eat at health",
        description="Plugin will eat food at this health",
        section="COMBAT_SECTION"
    )
    default int eatAtHealth() {
        return 69; // 0xF5 ^ 0xB4
    }

    /**
     * Prayer points threshold when ghosts spawn.
     * @return prayer points to maintain during ghost phase (default: 83)
     */
    @ConfigItem(
        position=7,
        keyName="drinkPrayAtGhost",
        name="Drink pray at ghost",
        description="Stay above this prayer amount when ghosts are up",
        section="COMBAT_SECTION"
    )
    default int drinkAtPrayerGhost() {
        return 83; // 0x67 ^ 0x15 ^ (0xE2 ^ 0xA2)
    }

    /**
     * Bank loadout for restocking supplies.
     * @return configured bank loadout
     */
    @ConfigItem(
        position=1,
        keyName="bankLoadout",
        name="Bank loadout",
        description="The loadout to use when banking",
        section="BANKING_SECTION"
    )
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /**
     * Prayer points threshold for drinking prayer potions.
     * @return prayer points to drink at (default: 51)
     */
    @ConfigItem(
        position=6,
        keyName="prayAtAmount",
        name="Drink pray at",
        description="Plugin will drink prayer potion at this amount",
        section="COMBAT_SECTION"
    )
    default int drinkAtPrayer() {
        return 51; // 0xE ^ 0x3B ^ (0x92 ^ 0x84)
    }

    /**
     * Minimum food count before banking.
     * @return food threshold (default: 2)
     */
    @ConfigItem(
        position=2,
        keyName="bankUnderAmount",
        name="Food to bank under",
        description="Under this amount we will not start a new kill",
        section="BANKING_SECTION"
    )
    default int bankUnderAmount() {
        return 2;
    }

    /**
     * Special attack gear setup.
     * @return equipment setup for special attacks
     */
    @ConfigItem(
        position=2,
        keyName="specGear",
        name="Special Attack Gear",
        description="Gear to equip when using special attack",
        section="BANKING_SECTION"
    )
    default ConfigStorageBox<EquipmentSetup> cerbSpecGear() {
        return new ConfigStorageBox<>("equipmentsetup", "None");
    }

    /**
     * Whether to scatter ashes after looting.
     * @return true to scatter ashes (default: true)
     */
    @ConfigItem(
        position=99,
        keyName="scatterAshes",
        name="Scatter Ashes",
        description="Should we scatter the ashes that we loot?"
    )
    default boolean scatterAshes() {
        return true;
    }

    /**
     * Emergency teleport health threshold.
     * @return HP to force teleport at when out of food (default: 25)
     */
    @ConfigItem(
        position=15,
        keyName="forceTeleportAtHp",
        name="Force teleport under hp",
        description="Plugin will force teleport at this health with no food",
        section="COMBAT_SECTION"
    )
    default int forceTeleportAtHp() {
        return 25; // 0xC2 ^ 0x8C ^ (0x4E ^ 0x29)
    }
}
