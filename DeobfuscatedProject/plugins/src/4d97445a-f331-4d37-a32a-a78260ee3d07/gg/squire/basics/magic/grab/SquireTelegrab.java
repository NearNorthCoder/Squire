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
import i.i.b.s.c.q.r.s.s.-.u.a.e.aR;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(name="Squire Telegrab", description="Telegrabs items", enabledByDefault=false)
@SquireUtil
public class SquireTelegrab
extends SquirePlugin {
    private static /* synthetic */ int[] lIlIIllI;

    protected void onStart() {
    }

    @Provides
    SquireTelegrabConfig p(ConfigManager configManager) {
        return (SquireTelegrabConfig)configManager.getConfig(SquireTelegrabConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIIllI[0]];
        classArray[SquireTelegrab.lIlIIllI[1]] = aR.class;
        return classArray;
    }

    static {
        SquireTelegrab.lIIlIlIlll();
    }

    protected void onStop() {
    }

    private static void lIIlIlIlll() {
        lIlIIllI = new int[2];
        SquireTelegrab.lIlIIllI[0] = " ".length();
        SquireTelegrab.lIlIIllI[1] = (0xFE ^ 0xBC) & ~(0x79 ^ 0x3B);
    }
}

