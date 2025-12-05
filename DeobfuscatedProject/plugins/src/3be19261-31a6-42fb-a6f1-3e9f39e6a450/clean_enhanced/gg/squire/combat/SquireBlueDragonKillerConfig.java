package gg.squire.combat;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

/**
 * Configuration interface for the Blue Dragon Killer plugin.
 * Provides settings for combat style, dragon location, banking, and looting.
 */
@ConfigGroup(value = "squirebdk")
public interface SquireBlueDragonKillerConfig extends Config {
    String GROUP = "squirebdk";

    // Configuration sections
    String combatSettings = "Combat Settings";
    String lootSettings = "Loot Settings";
    String bankLocation = "Bank Location";
    String bankLoadout = "Gear Loadout";

    /**
     * Combat style selection - melee, magic, or range.
     *
     * @return selected attack style
     */
    @ConfigItem(
        position = 5,
        keyName = "attackStyle",
        name = "Attack Style",
        description = "Which type of style would you like to use",
        section = combatSettings
    )
    default AttackStyle attackStyle() {
        return AttackStyle.MELEE;
    }

    /**
     * Health percentage threshold for eating food.
     *
     * @return health percent to eat at (default 50)
     */
    @ConfigItem(
        position = 10,
        keyName = "eatAt",
        name = "Eat At %",
        description = "What health percentage do you want to eat at?",
        section = combatSettings
    )
    default int eatAt() {
        return 50;
    }

    /**
     * Dragon location selection.
     *
     * @return selected dragon location
     */
    @ConfigItem(
        position = 15,
        keyName = "dragonLocation",
        name = "Location",
        description = "Where do you want to kill dragons?",
        section = combatSettings
    )
    default DragonLocation dragonLocation() {
        return DragonLocation.HEROS;
    }

    /**
     * Whether to flick combat prayers.
     *
     * @return true if prayer flicking is enabled
     */
    @ConfigItem(
        position = 31,
        keyName = "flickPrayer",
        name = "Flick Prayers?",
        description = "Do you want to flick combat prayers?",
        section = combatSettings
    )
    default boolean flickPrayer() {
        return true;
    }

    /**
     * Bank location selection.
     *
     * @return selected bank location
     */
    @ConfigItem(
        position = 21,
        keyName = "bankLocation",
        name = " ",
        description = "Where do you want to bank?",
        section = bankLocation
    )
    default BankLocation bankLocation() {
        return BankLocation.FALADOR_WEST_BANK;
    }

    /**
     * Bank loadout configuration for gear and supplies.
     *
     * @return configured bank loadout
     */
    @ConfigItem(
        keyName = "loadout",
        name = " ",
        description = "What bank loadout to use for banking",
        section = bankLoadout,
        position = 22
    )
    default ConfigStorageBox<BankLoadout> loadout() {
        return new ConfigStorageBox("bankloadout", "None");
    }

    /**
     * Whether to loot dragon bones.
     *
     * @return true if bones should be looted
     */
    @ConfigItem(
        position = 31,
        keyName = "lootBones",
        name = "Loot Dragon Bones",
        description = "Do you want to loot bones?",
        section = lootSettings
    )
    default boolean lootBones() {
        return true;
    }

    /**
     * Whether to loot dragon hides.
     *
     * @return true if hides should be looted
     */
    @ConfigItem(
        position = 32,
        keyName = "lootHides",
        name = "Loot Dragon Hides",
        description = "Do you want to loot hides",
        section = lootSettings
    )
    default boolean lootHides() {
        return true;
    }

    /**
     * Whether to loot dragon scales.
     *
     * @return true if scales should be looted
     */
    @ConfigItem(
        position = 33,
        keyName = "lootScales",
        name = "Loot Dragon Scales",
        description = "Do you want to loot scales",
        section = lootSettings
    )
    default boolean lootScales() {
        return true;
    }

    /**
     * Whether to loot ensouled dragon heads.
     *
     * @return true if ensouled heads should be looted
     */
    @ConfigItem(
        position = 34,
        keyName = "lootEnsouled",
        name = "Loot Ensouled Heads",
        description = "Do you want to loot ensouled heads",
        section = lootSettings
    )
    default boolean lootEnsouled() {
        return true;
    }
}
