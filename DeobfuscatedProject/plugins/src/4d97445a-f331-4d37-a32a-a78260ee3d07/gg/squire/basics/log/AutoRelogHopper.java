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
import i.i.b.s.c.q.r.s.s.-.u.a.e.aC;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aD;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aE;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aF;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Relog Hopper", description="Automatically relogs when you get logged out", enabledByDefault=false)
public class AutoRelogHopper
extends SquirePlugin {
    private static /* synthetic */ int[] llIIIIll;
    private /* synthetic */ boolean bV;

    static {
        AutoRelogHopper.lIlIlIllIl();
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

    private static void lIlIlIllIl() {
        llIIIIll = new int[5];
        AutoRelogHopper.llIIIIll[0] = 0x93 ^ 0x97;
        AutoRelogHopper.llIIIIll[1] = (68 + 131 - 11 + 14 ^ 75 + 23 - 53 + 90) & (0x5B ^ 0x66 ^ (0xF9 ^ 0x89) ^ -" ".length());
        AutoRelogHopper.llIIIIll[2] = " ".length();
        AutoRelogHopper.llIIIIll[3] = "  ".length();
        AutoRelogHopper.llIIIIll[4] = "   ".length();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIIIll[0]];
        classArray[AutoRelogHopper.llIIIIll[1]] = aF.class;
        classArray[AutoRelogHopper.llIIIIll[2]] = aC.class;
        classArray[AutoRelogHopper.llIIIIll[3]] = aD.class;
        classArray[AutoRelogHopper.llIIIIll[4]] = aE.class;
        return classArray;
    }

    @Provides
    RelogConfig m(ConfigManager configManager) {
        return (RelogConfig)configManager.getConfig(RelogConfig.class);
    }
}

