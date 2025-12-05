/*
 * Deobfuscated from gg.squire.basics.chopburn.SquireChopAndBurn
 *
 * Chops trees and burns the logs for training Woodcutting and Firemaking.
 */
package gg.squire.basics.chopburn;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.C;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Chops trees and burns logs for Woodcutting and Firemaking training.
 */
@PluginDescriptor(
    name = "Squire Chop 'n Burn",
    enabledByDefault = false
)
@SquireUtil
public class SquireChopAndBurn extends SquirePlugin {

    @Override
    protected Class<?>[] tasks() {
        return new Class[]{ C.class };
    }

    @Provides
    ChopBurnConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(ChopBurnConfig.class);
    }

    @Override
    protected void onStart() {
    }

    @Override
    protected void onStop() {
    }
}
