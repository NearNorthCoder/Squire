/*
 * Decompiled with CFR 0.152.
 * Deobfuscated for Squire Chambers of Xeric (CoX) Plugin
 *
 * Configuration interface for the CoX raid automation plugin.
 * Provides settings for combat rooms, puzzle rooms, world hopping, and Olm boss mechanics.
 */
package gg.squire.cox;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.config.Range;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;

/**
 * Configuration for Squire Chambers of Xeric automation plugin.
 * Manages settings for raid room selection, boss mechanics, and world hopping.
 */
@ConfigGroup(value = "squireraids")
public interface SquireChambersConfig extends Config {

    // Configuration sections
    String COMBAT_SETTINGS = "Combat Room Settings";
    String PUZZLE_SETTINGS = "Puzzle Room Settings";
    String HOPPING_SETTINGS = "Hopping Settings";
    String OLM_SETTINGS = "Olm Settings";

    @ConfigSection(
        name = "Combat Rooms",
        description = "Settings to configure Combat rooms",
        position = 50
    )
    String COMBAT_ROOM_SECTION = COMBAT_SETTINGS;

    @ConfigSection(
        name = "Puzzle Rooms",
        description = "Settings to configure Puzzle rooms",
        position = 50
    )
    String PUZZLE_ROOM_SECTION = PUZZLE_SETTINGS;

    @ConfigSection(
        name = "World Hopping Settings",
        description = "World Hopping settings",
        position = 40
    )
    String HOPPING_SECTION = HOPPING_SETTINGS;

    @ConfigSection(
        name = "Olm",
        description = "Settings to configure Olm",
        position = 500
    )
    String OLM_SECTION = OLM_SETTINGS;

    /**
     * Select the bank loadout to use for raids
     * @return The selected bank loadout configuration
     */
    @ConfigItem(
        position = 0,
        keyName = "bankLoadout",
        name = "Bank loadout",
        description = "Bank loadout"
    )
    default ConfigStorageBox<BankLoadout> bankLoadout() {
        return new ConfigStorageBox<>("bankloadout", "None");
    }

    /**
     * Display advanced info box with raid statistics
     * @return True if advanced info box should be shown
     */
    @ConfigItem(
        position = 1,
        keyName = "extraInfo",
        name = "Display advanced Info box",
        description = "Display advanced Info box"
    )
    default boolean extraInfo() {
        return false;
    }

    /**
     * Pause the plugin
     * @return True if plugin should be paused
     */
    @ConfigItem(
        position = 2,
        keyName = "pause",
        name = "Pause",
        description = "pause"
    )
    default boolean pause() {
        return false;
    }

    /**
     * Pick up brews that were dropped to make inventory space
     * @return True if dropped brews should be picked up
     */
    @ConfigItem(
        position = 3,
        keyName = "pickupDroppedBrews",
        name = "Pick up dropped brews?",
        description = "Pick up brews that were dropped to make inventory space"
    )
    default boolean pickupBrews() {
        return false;
    }

    /**
     * Anonymize username in Discord loot channel
     * @return True if username should be anonymized
     */
    @ConfigItem(
        name = "Anonymize discord",
        description = "Enabling this will replace your discord username with anonymous in the #cox-loot channel",
        keyName = "anonymize",
        position = 4
    )
    default boolean anonymize() {
        return true;
    }

    // ========== Combat Room Settings ==========

    /**
     * Enable Tekton combat room
     * @return True if Tekton room should be automated
     */
    @ConfigItem(
        position = 0,
        keyName = "enableTekton",
        name = "Enable Tekton",
        description = "Enable Tekton room",
        section = COMBAT_SETTINGS
    )
    default boolean enableTekton() {
        return true;
    }

    /**
     * Use flinching technique against Tekton
     * @return True if Tekton should be flinched
     */
    @ConfigItem(
        position = 0,
        keyName = "flinchTekton",
        name = "Tekton: Flinch",
        description = "Can disable this if using a 4 tick weapon",
        section = COMBAT_SETTINGS,
        hidden = true,
        unhide = "enableTekton",
        unhideValue = "true"
    )
    default boolean flinchTekton() {
        return true;
    }

    /**
     * Enable Muttadiles combat room
     * @return True if Muttadiles room should be automated
     */
    @ConfigItem(
        position = 1,
        keyName = "enableMuttadiles",
        name = "Enable Muttadiles",
        description = "Enable Muttadiles room",
        section = COMBAT_SETTINGS
    )
    default boolean enableMuttadiles() {
        return true;
    }

    /**
     * Enable Guardians (Skeletal Mystics) combat room
     * @return True if Guardians room should be automated
     */
    @ConfigItem(
        position = 2,
        keyName = "enableGuardians",
        name = "Enable Guardians",
        description = "Enable Guardians room",
        section = COMBAT_SETTINGS
    )
    default boolean enableGuardians() {
        return true;
    }

    /**
     * Enable Vasa Nistirio combat room
     * @return True if Vasa room should be automated
     */
    @ConfigItem(
        position = 3,
        keyName = "enableVasa",
        name = "Enable Vasa",
        description = "Enable Vasa room",
        section = COMBAT_SETTINGS
    )
    default boolean enableVasa() {
        return true;
    }

    /**
     * Testing toggle for Vasa combat room
     * @return True if Vasa testing mode is enabled
     */
    @ConfigItem(
        position = 3,
        keyName = "vasaToggle",
        name = "Vasa: Testing",
        description = "Vasa toggle for testing",
        section = COMBAT_SETTINGS,
        hidden = true,
        unhide = "enableVasa",
        unhideValue = "true"
    )
    default boolean vasaToggle() {
        return false;
    }

    /**
     * Enable Vespula combat room
     * @return True if Vespula room should be automated
     */
    @ConfigItem(
        position = 4,
        keyName = "enableVespula",
        name = "Enable Vespula",
        description = "Enable Vespula room",
        section = COMBAT_SETTINGS
    )
    default boolean enableVespula() {
        return true;
    }

    // ========== Puzzle Room Settings ==========

    /**
     * Enable Tightrope puzzle room
     * @return True if Tightrope room should be automated
     */
    @ConfigItem(
        position = 0,
        keyName = "enableTightrope",
        name = "Enable Tightrope",
        description = "Enable Tightrope room",
        section = PUZZLE_SETTINGS
    )
    default boolean enableTightrope() {
        return true;
    }

    /**
     * Swap to melee body armor for ranger enemies on tightrope
     * @return True if body should be swapped for rangers
     */
    @ConfigItem(
        position = 0,
        keyName = "tightropeBody",
        name = "Tightrope: Swap body for rangers",
        description = "Swap to melee body for rangers",
        section = PUZZLE_SETTINGS,
        hidden = true,
        unhide = "enableTightrope",
        unhideValue = "true"
    )
    default boolean tightropeBody() {
        return true;
    }

    /**
     * Enable Ice Demon puzzle room
     * @return True if Ice Demon room should be automated
     */
    @ConfigItem(
        position = 1,
        keyName = "enableIceDemon",
        name = "Enable Ice Demon",
        description = "Enable Ice Demon room",
        section = PUZZLE_SETTINGS
    )
    default boolean enableIceDemon() {
        return true;
    }

    /**
     * Enable Thieving puzzle room
     * @return True if Thieving room should be automated
     */
    @ConfigItem(
        position = 2,
        keyName = "enableThieving",
        name = "Enable Thieving",
        description = "Enable Thieving room",
        section = PUZZLE_SETTINGS
    )
    default boolean enableThieving() {
        return true;
    }

    /**
     * Enable Crabs puzzle room
     * @return True if Crabs room should be automated
     */
    @ConfigItem(
        position = 3,
        keyName = "enableCrabs",
        name = "Enable Crabs",
        description = "Enable Crabs room",
        section = PUZZLE_SETTINGS
    )
    default boolean enableCrabs() {
        return true;
    }

    // ========== World Hopping Settings ==========

    /**
     * Hop worlds after each raid completion
     * @return True if world hopping is enabled
     */
    @ConfigItem(
        position = 1,
        keyName = "enableHopping",
        name = "Hop after each raid",
        description = "Hop worlds after each raid",
        section = HOPPING_SETTINGS
    )
    default boolean enableHopping() {
        return false;
    }

    /**
     * Comma-separated list of world numbers to hop between
     * @return String of world numbers (e.g., "336,368,369")
     */
    @ConfigItem(
        keyName = "worldsHopping",
        name = "Hopping worlds",
        description = "Specify which worlds you want to hop between during raids. If left empty it will choose worlds for you",
        section = HOPPING_SETTINGS,
        position = 13
    )
    default String worldsHopping() {
        return "336,368,369";
    }

    // ========== Olm Settings ==========

    /**
     * HP threshold to stop attacking Olm's mage hand
     * Range: 20-80 HP
     * @return HP threshold for mage hand
     */
    @ConfigItem(
        position = 3,
        keyName = "olmMageThreshold",
        name = "Mage Threshold",
        description = "HP to stop attacking mage hand",
        section = OLM_SETTINGS
    )
    @Range(min = 20, max = 80)
    default int mageThreshold() {
        return 40; // 0x49 ^ 0x61 = 40
    }

    /**
     * HP threshold to stop attacking Olm's melee hand
     * Range: 20-80 HP
     * @return HP threshold for melee hand
     */
    @ConfigItem(
        position = 4,
        keyName = "olmMeleeThreshold",
        name = "Melee Threshold",
        description = "HP to stop attacking melee hand",
        section = OLM_SETTINGS
    )
    @Range(min = 20, max = 80)
    default int meleeThreshold() {
        return 40; // 0xD ^ 0x2D ^ (0x4D ^ 0x45) = 40
    }
}
