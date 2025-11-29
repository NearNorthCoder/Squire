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
package gg.squire.basics.magic.grab;

import com.google.inject.Provides;
import gg.squire.basics.magic.grab.SquireTelegrabConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.magic.grab.GrabbingTask;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(name="Squire Telegrab", description="Telegrabs items", enabledByDefault=false)
@SquireUtil
public class SquireTelegrab
extends SquirePlugin {

    protected void onStart() {
    }

    @Provides
    SquireTelegrabConfig p(ConfigManager configManager) {
        return (SquireTelegrabConfig)configManager.getConfig(SquireTelegrabConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIIllI[0]];
        classArray[SquireTelegrab.lIlIIllI[1]] = GrabbingTask.class;
        return classArray;
    }

    static {
        SquireTelegrab.lIIlIlIlll();
    }

    protected void onStop() {
    }

}

