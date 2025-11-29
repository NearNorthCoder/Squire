/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.membership;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aX;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aY;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Membership Buyer", description="Buys bonds and converts to keys", enabledByDefault=false, hidden=true)
public class SquireMembershipBuyer
extends SquirePlugin {
    private static /* synthetic */ int[] lllIlIl;
    private /* synthetic */ boolean ff;

    public void e(boolean bl2) {
        this.ff = bl2;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIlIl[0]];
        classArray[SquireMembershipBuyer.lllIlIl[1]] = aY.class;
        classArray[SquireMembershipBuyer.lllIlIl[2]] = aX.class;
        return classArray;
    }

    public boolean cq() {
        return this.ff;
    }

    private static void lllIIlIlI() {
        lllIlIl = new int[3];
        SquireMembershipBuyer.lllIlIl[0] = 2;
        SquireMembershipBuyer.lllIlIl[1] = (0x38 ^ 0x3C) & ~(0x13 ^ 0x17);
        SquireMembershipBuyer.lllIlIl[2] = 1;
    }

    protected void onStop() {
    }

    protected void onStart() {
    }

    static {
        SquireMembershipBuyer.lllIIlIlI();
    }
}

