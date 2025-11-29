package gg.squire.basics.muling.trader;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0032be;
import net.runelite.client.plugins.PluginDescriptor;
@SquireUtil
@PluginDescriptor(name = "Squire Trader", description = "Offers entire inventory for trade menu", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/muling/trader/SquireTrader.class */
public class SquireTrader extends SquirePlugin {
    private static /* synthetic */ int[] lllIlIIl;

    static {
        llIIllIIll();
    }

    protected void onStop() {
    }

    protected void onStart() {
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lllIlIIl[0]];
        clsArr[lllIlIIl[1]] = C0032be.class;
        return clsArr;
    }

    private static void llIIllIIll() {
        lllIlIIl = new int[2];
        lllIlIIl[0] = " ".length();
        lllIlIIl[1] = ((((134 + 86) - 76) + 33) ^ (((44 + 188) - 159) + 117)) & (((((54 + 32) - 42) + 131) ^ (((33 + 37) - 35) + 125)) ^ (-" ".length()));
    }
}
