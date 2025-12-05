package gg.squire.leagues.miner;

import gg.squire.leagues.common.RockType;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

/**
 * Configuration for the Leagues Miner plugin.
 * Allows players to configure which rocks to mine and whether to use a Banker's Note.
 */
@ConfigGroup(value = "leaguesminer")
public interface MinerConfig extends Config {

    /**
     * Information label about supported locations.
     *
     * @return false (always disabled label)
     */
    @ConfigItem(
            keyName = "note",
            name = "Only works at fossil island mine",
            description = "Must have banker note in inventory",
            position = 0
    )
    default boolean locationInfo1() {
        return false;
    }

    /**
     * Information label about alternate location.
     *
     * @return false (always disabled label)
     */
    @ConfigItem(
            keyName = "note",
            name = " or the Priff underground mine",
            description = "Must have banker note in inventory",
            position = 1
    )
    default boolean locationInfo2() {
        return false;
    }

    /**
     * Gets the type of rocks to mine.
     *
     * @return the configured rock type
     */
    @ConfigItem(
            keyName = "rocks",
            name = "Choose rocks",
            description = "Rocks to mine, must be in Fossil island or elf mine, standing near rocks",
            position = 5
    )
    default RockType getRockType() {
        return RockType.RUNE;
    }

    /**
     * Whether to use a Banker's Note to automatically note ores.
     *
     * @return true if banker's note should be used, false otherwise
     */
    @ConfigItem(
            keyName = "note",
            name = "Note items banker note",
            description = "Must have banker note in inventory",
            position = 6
    )
    default boolean getuseBankerNote() {
        return false;
    }
}
