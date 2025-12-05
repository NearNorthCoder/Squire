/*
 * Deobfuscated from DebugPlugin
 * Package: gg.squire.basics.debug
 *
 * Debugging utility plugin for development purposes.
 * Hidden from plugin list and disabled by default.
 */
package gg.squire.basics.debug;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Debug plugin for testing and development.
 * Provides a framework for debugging Squire functionality.
 */
@SquireUtil
@PluginDescriptor(
    name="Squire Debug",
    description="Debugging plugin",
    tags={"debug", "squire"},
    enabledByDefault=false,
    hidden=true
)
public class DebugPlugin extends SquirePlugin {

    /** Logger instance for debug output */
    private static final Logger log = LoggerFactory.getLogger(DebugPlugin.class);

    @Override
    protected void onStart() {
        // Debug plugin started
    }

    @Override
    protected void onStop() {
        // Debug plugin stopped
    }

    /**
     * Game tick event handler for debugging.
     * Currently unused but available for testing.
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        // Debug tick logic can be added here
    }

    /**
     * No tasks defined - debug plugin doesn't use task system.
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[0];
    }
}
