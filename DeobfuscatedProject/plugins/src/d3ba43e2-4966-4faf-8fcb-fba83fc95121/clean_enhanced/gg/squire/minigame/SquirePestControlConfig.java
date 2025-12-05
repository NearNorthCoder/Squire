package gg.squire.minigame;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;

/**
 * Configuration interface for the Squire Pest Control plugin.
 * Currently no configurable options, but can be extended in the future.
 */
@ConfigGroup(value = "squirepestcontrol")
public interface SquirePestControlConfig extends Config {
    /**
     * The configuration group name for this plugin.
     */
    String PEST_CONFIG_GROUP = "squirepestcontrol";
}
