package gg.squire.leagues.cooking;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

import java.awt.Label;

/**
 * Configuration for the 1-tick Cooker plugin.
 * Provides information labels about how to use the plugin.
 */
@ConfigGroup(value = "leaguesminer")
public interface TickCookerConfig extends Config {

    /**
     * Information label about banker's note requirement.
     *
     * @return null (label component)
     */
    @ConfigItem(
            keyName = "note",
            name = "Must have banker note in inv",
            description = "Must have banker note in inventory",
            position = 0
    )
    default Label instructionLabel1() {
        return null;
    }

    /**
     * Information label about noted food placement.
     *
     * @return null (label component)
     */
    @ConfigItem(
            keyName = "note",
            name = " Put noted food in first inv slot",
            description = "Must have banker note in inventory",
            position = 1
    )
    default Label instructionLabel2() {
        return null;
    }

    /**
     * Information label about burnt food handling.
     *
     * @return null (label component)
     */
    @ConfigItem(
            keyName = "note",
            name = "Will auto note burnt food",
            description = "Must have banker note in inventory",
            position = 2
    )
    default Label instructionLabel3() {
        return null;
    }

    /**
     * Information label about food noting behavior.
     *
     * @return null (label component)
     */
    @ConfigItem(
            keyName = "note",
            name = "Will note food with 'eat' action when 15 or more in inventory",
            description = "Must have banker note in inventory",
            position = 3
    )
    default Label instructionLabel4() {
        return null;
    }
}
