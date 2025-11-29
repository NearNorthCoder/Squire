/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.debug.typer;

import com.google.inject.Provides;
import gg.squire.basics.debug.typer.SquireTyperConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.debug.typer.TypingTask;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Typer", enabledByDefault=false)
public class SquireTyper
extends SquirePlugin {
    private static  int[] llllIl;

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = TypingTask.class;
        return classArray;
    }

    @Provides
    SquireTyperConfig i(ConfigManager configManager) {
        return (SquireTyperConfig)configManager.getConfig(SquireTyperConfig.class);
    }

    protected void onStop() {
    }

    protected void onStart() {
    }
}

