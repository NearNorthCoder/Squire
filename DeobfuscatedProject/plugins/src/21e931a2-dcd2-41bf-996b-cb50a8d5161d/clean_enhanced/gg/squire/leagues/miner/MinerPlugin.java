package gg.squire.leagues.miner;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Leagues utility plugin for automated mining of various rock types.
 *
 * This plugin is designed for use during Leagues and supports:
 * - Mining multiple rock types (Runite, Adamantite, Mithril, Iron, Coal, Gold, Silver, Soft Clay)
 * - Works at Fossil Island mine and Prifddinas underground mine
 * - Automatic ore noting using Banker's Note when inventory is full
 *
 * Usage:
 * 1. Position yourself near the rocks you want to mine
 * 2. Configure the rock type in the plugin settings
 * 3. Optionally enable Banker's Note mode and place a Banker's Note in inventory
 * 4. Enable the plugin and it will automatically mine the configured rocks
 */
@PluginDescriptor(
        name = "[Leagues] Miner",
        enabledByDefault = false
)
public class MinerPlugin extends SquirePlugin {

    /**
     * Provides the configuration for this plugin.
     *
     * @param configManager the config manager
     * @return the plugin configuration
     */
    @Provides
    MinerConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(MinerConfig.class);
    }

    /**
     * Called when the plugin is started.
     * No initialization needed for this plugin.
     */
    @Override
    protected void onStart() {
    }

    /**
     * Called when the plugin is stopped.
     * No cleanup needed for this plugin.
     */
    @Override
    protected void onStop() {
    }

    /**
     * Returns the tasks that should be executed by this plugin.
     * The MinerTask handles the actual mining logic.
     *
     * @return array of task classes
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class<?>[]{MinerTask.class};
    }

    /**
     * Called on each game tick.
     * No per-tick logic needed as the task framework handles execution.
     *
     * @param gameTick the game tick event
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }
}
