package gg.squire.leagues.banknote;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Leagues utility plugin for automatically noting/unnoting items using a Banker's Note.
 *
 * This plugin is designed for use during Leagues, where Banker's Notes allow players
 * to convert items between noted and unnoted forms. The plugin can:
 * - Automatically note items when the inventory is full
 * - Automatically unnote items when there are no unnoted items in the inventory
 *
 * Usage:
 * 1. Place a Banker's Note in your inventory
 * 2. Configure the item name you want to note/unnote
 * 3. Enable the plugin
 * 4. The plugin will automatically use the Banker's Note on your items based on the mode
 */
@PluginDescriptor(
        name = "[Leagues] Note items",
        enabledByDefault = false
)
@SquireUtil
public class NoteItemsPlugin extends SquirePlugin {

    /**
     * Provides the configuration for this plugin.
     *
     * @param configManager the config manager
     * @return the plugin configuration
     */
    @Provides
    NoteItemsConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(NoteItemsConfig.class);
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
     * The NoteItemTask handles the actual noting/unnoting logic.
     *
     * @return array of task classes
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class<?>[]{NoteItemTask.class};
    }

    /**
     * Called on each game tick.
     * No per-tick logic needed as the task framework handles execution.
     *
     * @param gameTick the game tick event
     */
    public void onGameTick(GameTick gameTick) {
    }
}
