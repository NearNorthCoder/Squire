/*
 * Deobfuscated from SquireTyper
 * Package: gg.squire.basics.debug.typer
 *
 * Auto-typer plugin for automatically sending chat messages.
 * Useful for testing or automated messaging.
 */
package gg.squire.basics.debug.typer;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.al;  // TypingTask
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Squire Typer plugin for automated message sending.
 * Sends configured messages at specified intervals.
 */
@SquireUtil
@PluginDescriptor(
    name="Squire Typer",
    enabledByDefault=false
)
public class SquireTyper extends SquirePlugin {

    @Override
    protected void onStart() {
        // Plugin started
    }

    @Override
    protected void onStop() {
        // Plugin stopped
    }

    /**
     * Provides configuration for dependency injection.
     */
    @Provides
    SquireTyperConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(SquireTyperConfig.class);
    }

    /**
     * Returns the typing task for execution.
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[]{
            al.class  // TypingTask
        };
    }
}
