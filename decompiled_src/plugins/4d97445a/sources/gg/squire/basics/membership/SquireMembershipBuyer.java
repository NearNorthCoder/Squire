package gg.squire.basics.membership;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aX;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aY;
import net.runelite.client.plugins.PluginDescriptor;
@SquireUtil
@PluginDescriptor(name = "Squire Membership Buyer", description = "Buys bonds and converts to keys", enabledByDefault = false, hidden = true)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/membership/SquireMembershipBuyer.class */
public class SquireMembershipBuyer extends SquirePlugin {
    private static /* synthetic */ int[] lllIlIl;
    private /* synthetic */ boolean ff;

    public void e(boolean z) {
        this.ff = z;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lllIlIl[0]];
        clsArr[lllIlIl[1]] = aY.class;
        clsArr[lllIlIl[2]] = aX.class;
        return clsArr;
    }

    public boolean cq() {
        return this.ff;
    }

    private static void lllIIlIlI() {
        lllIlIl = new int[3];
        lllIlIl[0] = "  ".length();
        lllIlIl[1] = (56 ^ 60) & ((19 ^ 23) ^ (-1));
        lllIlIl[2] = " ".length();
    }

    protected void onStop() {
    }

    protected void onStart() {
    }

    static {
        lllIIlIlI();
    }
}
