/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.muling.trader;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.be;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Trader", description="Offers entire inventory for trade menu", enabledByDefault=false)
public class SquireTrader
extends SquirePlugin {
    private static /* synthetic */ int[] lllIlIIl;

    static {
        SquireTrader.llIIllIIll();
    }

    protected void onStop() {
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIlIIl[0]];
        classArray[SquireTrader.lllIlIIl[1]] = be.class;
        return classArray;
    }

    private static void llIIllIIll() {
        lllIlIIl = new int[2];
        SquireTrader.lllIlIIl[0] = 1;
        SquireTrader.lllIlIIl[1] = (134 + 86 - 76 + 33 ^ 44 + 188 - 159 + 117) & (54 + 32 - 42 + 131 ^ 33 + 37 - 35 + 125 ^ -1);
    }
}

