/*
 * Deobfuscated with CFR 0.152.
 *
 * Squire Teleporter Plugin
 * Automatically casts teleportation spells for magic experience training.
 *
 * Original obfuscated class: SquireTeleporter
 * Package: gg.squire.basics.magic.teleporter
 */
package gg.squire.basics.magic.teleporter;

import com.google.inject.Provides;
import gg.squire.basics.tasks.TeleporterTask;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Plugin for automatically casting teleportation spells.
 * Can be configured to cast specific teleports or use progressive mode.
 */
@SquireUtil
@PluginDescriptor(
    name = "Squire Teleporter",
    description = "Teleports for Magic XP",
    enabledByDefault = false
)
public class SquireTeleporter extends SquirePlugin {

    /**
     * Provides the plugin configuration.
     *
     * @param configManager the config manager
     * @return the plugin configuration
     */
    @Provides
    SquireTeleporterConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireTeleporterConfig.class);
    }

    /**
     * Returns the task classes used by this plugin.
     *
     * @return array containing the TeleporterTask class
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[]{TeleporterTask.class};
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
