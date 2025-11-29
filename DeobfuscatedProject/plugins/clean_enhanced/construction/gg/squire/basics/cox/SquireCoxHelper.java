/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.cox;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(name="Squire COX Helper", enabledByDefault=false, hidden=true)
@SquireUtil
public class SquireCoxHelper
extends SquirePlugin {
    private static  int[] lIIlllIIl;

    static {
        SquireCoxHelper.var1();
    }

    protected void onStop() {
    }

    private static void var1() {
        lIIlllIIl = new int[1];
        SquireCoxHelper.lIIlllIIl[0] = (0x3B ^ 1) & ~(0x6B ^ 0x51);
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIIlllIIl[0]];
    }
}

