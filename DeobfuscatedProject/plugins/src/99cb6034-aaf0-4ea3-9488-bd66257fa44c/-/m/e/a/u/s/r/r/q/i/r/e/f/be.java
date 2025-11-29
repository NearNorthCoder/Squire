/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.L;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f;
import -.m.e.a.u.s.r.r.q.i.r.e.f.h;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Noting produce", priority=20, blocking=true)
public class be
extends az {
    private static /* synthetic */ int[] llIIIIIlllII;
    private final /* synthetic */ h cR;
    private /* synthetic */ boolean cS;

    private static boolean llllIIIlllIIlI(int n2) {
        return n2 == 0;
    }

    private static void llllIIIlllIIIl() {
        llIIIIIlllII = new int[2];
        be.llIIIIIlllII[0] = (0xEB ^ 0x8A) & ~(0x60 ^ 1);
        be.llIIIIIlllII[1] = " ".length();
    }

    static {
        be.llllIIIlllIIIl();
    }

    private static boolean llllIIIlllIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        int n2;
        be lllllllllllllllIlIlIllIlIIIlIlII;
        void lllllllllllllllIlIlIllIlIIIlIIll;
        WorldPoint worldPoint = this.bR.u();
        if (be.llllIIIlllIIlI(Inventory.contains(item -> L.bq.contains(item.getId())) ? 1 : 0)) {
            this.cS = llIIIIIlllII[0];
            "".length();
            if (((0xAA ^ 0x8A) & ~(0x72 ^ 0x52)) == -" ".length()) {
                return ((0xD9 ^ 0x94) & ~(1 ^ 0x4C)) != 0;
            }
        } else if (!be.llllIIIlllIIlI(Inventory.isFull() ? 1 : 0) || !be.llllIIIlllIIll(lllllllllllllllIlIlIllIlIIIlIIll) || be.llllIIIlllIIlI(lllllllllllllllIlIlIllIlIIIlIIll.isInScene(lllllllllllllllIlIlIllIlIIIlIlII.bT) ? 1 : 0)) {
            lllllllllllllllIlIlIllIlIIIlIlII.cS = llIIIIIlllII[1];
        }
        if (be.llllIIIlllIIlI(lllllllllllllllIlIlIllIlIIIlIlII.cR.K() ? 1 : 0)) {
            return llIIIIIlllII[0];
        }
        if (be.llllIIIlllIlII(lllllllllllllllIlIlIllIlIIIlIlII.cS ? 1 : 0) && be.llllIIIlllIlII(lllllllllllllllIlIlIllIlIIIlIlII.cR.J() ? 1 : 0)) {
            n2 = llIIIIIlllII[1];
            "".length();
            if (-" ".length() > " ".length()) {
                return ((0xEB ^ 0xA3 ^ (0x36 ^ 0x38)) & (68 + 124 - 98 + 155 ^ 68 + 121 - 86 + 88 ^ -" ".length())) != 0;
            }
        } else {
            n2 = llIIIIIlllII[0];
        }
        return n2 != 0;
    }

    @Inject
    public be(f f2, SquireFarmerConfig squireFarmerConfig, Client client, h h2) {
        super(f2, squireFarmerConfig, client);
        this.cR = h2;
    }

    private static boolean llllIIIlllIIll(Object object) {
        return object != null;
    }
}

