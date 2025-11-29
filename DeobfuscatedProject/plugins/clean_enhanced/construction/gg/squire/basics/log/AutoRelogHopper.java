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
package gg.squire.basics.log;

import com.google.inject.Provides;
import gg.squire.basics.log.RelogConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.log.HoppingTask;
import gg.squire.basics.log.LoggingOutTask;
import gg.squire.basics.log.NotifyingForPlayerTask;
import gg.squire.basics.log.ReloggingTask;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Relog Hopper", description="Automatically relogs when you get logged out", enabledByDefault=false)
public class AutoRelogHopper
extends SquirePlugin {
    private static  int[] llIIIIll;
    private  boolean bV;

    static {
        AutoRelogHopper.var1();
    }

    public boolean aI() {
        return this.bV;
    }

    protected void onStop() {
        this.bV = llIIIIll[1];
    }

    protected void onStart() {
        this.bV = llIIIIll[2];
    }

    private static void var1() {
        llIIIIll = new int[5];
        AutoRelogHopper.llIIIIll[0] = 0x93 ^ 0x97;
        AutoRelogHopper.llIIIIll[1] = (68 + 131 - 11 + 14 ^ 75 + 23 - 53 + 90) & (0x5B ^ 0x66 ^ (0xF9 ^ 0x89) ^ -1);
        AutoRelogHopper.llIIIIll[2] = 1;
        AutoRelogHopper.llIIIIll[3] = 2;
        AutoRelogHopper.llIIIIll[4] = 3;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIIIll[0]];
        classArray[AutoRelogHopper.llIIIIll[1]] = ReloggingTask.class;
        classArray[AutoRelogHopper.llIIIIll[2]] = HoppingTask.class;
        classArray[AutoRelogHopper.llIIIIll[3]] = LoggingOutTask.class;
        classArray[AutoRelogHopper.llIIIIll[4]] = NotifyingForPlayerTask.class;
        return classArray;
    }

    @Provides
    RelogConfig m(ConfigManager configManager) {
        return (RelogConfig)configManager.getConfig(RelogConfig.class);
    }
}

