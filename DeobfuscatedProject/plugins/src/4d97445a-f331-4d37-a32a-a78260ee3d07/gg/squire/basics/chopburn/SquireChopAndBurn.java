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
package gg.squire.basics.chopburn;

import com.google.inject.Provides;
import gg.squire.basics.chopburn.ChopBurnConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.C;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Chop 'n Burn", enabledByDefault=false)
public class SquireChopAndBurn
extends SquirePlugin {
    private static /* synthetic */ int[] lIIllIIlI;

    @Provides
    ChopBurnConfig b(ConfigManager configManager) {
        return (ChopBurnConfig)configManager.getConfig(ChopBurnConfig.class);
    }

    protected void onStop() {
    }

    static {
        SquireChopAndBurn.lIIIIllIIII();
    }

    private static void lIIIIllIIII() {
        lIIllIIlI = new int[2];
        SquireChopAndBurn.lIIllIIlI[0] = " ".length();
        SquireChopAndBurn.lIIllIIlI[1] = (50 + 36 - 54 + 96 ^ 16 + 169 - 122 + 134) & (0x3C ^ 0x16 ^ (0xEB ^ 0x84) ^ -" ".length());
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIllIIlI[0]];
        classArray[SquireChopAndBurn.lIIllIIlI[1]] = C.class;
        return classArray;
    }
}

