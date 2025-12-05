/*
 * Deobfuscated from SquireCoxHelper
 * Package: gg.squire.basics.cox
 *
 * Chambers of Xeric (COX) helper plugin stub.
 * Currently provides no functionality - placeholder for future implementation.
 */
package gg.squire.basics.cox;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * COX (Chambers of Xeric) helper plugin.
 * Currently a placeholder with no active tasks or functionality.
 * Hidden from plugin list by default.
 */
@PluginDescriptor(
    name="Squire COX Helper",
    enabledByDefault=false,
    hidden=true
)
@SquireUtil
public class SquireCoxHelper extends SquirePlugin {

    @Override
    protected void onStart() {
        // No initialization needed
    }

    @Override
    protected void onStop() {
        // No cleanup needed
    }

    /**
     * Returns empty task array - plugin has no active tasks.
     *
     * @return empty Class array
     */
    @Override
    protected Class<?>[] tasks() {
        return new Class[0];
    }
}
