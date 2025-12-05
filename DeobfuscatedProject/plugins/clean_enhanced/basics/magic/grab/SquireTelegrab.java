/*
 * Deobfuscated with CFR 0.152.
 *
 * Squire Telegrab Plugin
 * Automatically casts Telekinetic Grab on configured items.
 *
 * Original obfuscated class: SquireTelegrab
 * Package: gg.squire.basics.magic.grab
 */
package gg.squire.basics.magic.grab;

import com.google.inject.Provides;
import gg.squire.basics.tasks.TelegrabTask;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Plugin for automatically using Telekinetic Grab spell on items.
 * Useful for collecting items that are otherwise unreachable or across obstacles.
 */
@PluginDescriptor(
    name = "Squire Telegrab",
    description = "Telegrabs items",
    enabledByDefault = false
)
@SquireUtil
public class SquireTelegrab extends SquirePlugin {

    /**
     * Provides the plugin configuration.
     *
     * @param configManager the config manager
     * @return the plugin configuration
     */
    @Provides
    SquireTelegrabConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireTelegrabConfig.class);
    }

    /**
     * Returns the task classes used by this plugin.
     *
     * @return array containing the TelegrabTask class
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[]{TelegrabTask.class};
    }

    /**
     * Called when the plugin is started.
     */
    @Override
    protected void onStart() {
        // No additional setup required
    }

    /**
     * Called when the plugin is stopped.
     */
    @Override
    protected void onStop() {
        // No additional cleanup required
    }
}
