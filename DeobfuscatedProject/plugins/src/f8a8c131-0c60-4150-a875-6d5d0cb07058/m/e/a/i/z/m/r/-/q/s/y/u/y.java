/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.game.Combat
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import m.e.a.i.z.m.r.-.q.s.y.u.m;
import net.unethicalite.api.game.Combat;

@TaskDesc(name="Equipping Ranged Gear", priority=100)
public class y
extends m {
    private static /* synthetic */ int[] lIllIIlIlIIlI;

    private static boolean llIIIllIIIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public y(SquireZammyConfig squireZammyConfig, l l2) {
        super(squireZammyConfig, l2);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        y llllllllllllllIllIIlIlIIIIlIllIl;
        if (!y.llIIIllIIIIIIIl(this.I.B() ? 1 : 0) || y.llIIIllIIIIIIIl(this.I.A() ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        if (y.llIIIllIIIIIIIl(llllllllllllllIllIIlIlIIIIlIllIl.I.H() ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        if (y.llIIIllIIIIIIIl(llllllllllllllIllIIlIlIIIIlIllIl.H.useBlowpipe() ? 1 : 0) && y.llIIIllIIIIIIIl(Combat.isSpecEnabled() ? 1 : 0) && y.llIIIllIIIIIIlI(llllllllllllllIllIIlIlIIIIlIllIl.I.z(), lIllIIlIlIIlI[1])) {
            return lIllIIlIlIIlI[0];
        }
        int[] llllllllllllllIllIIlIlIIIIlIllII = llllllllllllllIllIIlIlIIIIlIllIl.L();
        if (y.llIIIllIIIIIIll(llllllllllllllIllIIlIlIIIIlIllIl.b(llllllllllllllIllIIlIlIIIIlIllII) ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        this.a((int[])var1_1);
        "".length();
        return lIllIIlIlIIlI[2];
    }

    private static void llIIIllIIIIIIII() {
        lIllIIlIlIIlI = new int[3];
        y.lIllIIlIlIIlI[0] = "   ".length() & ~"   ".length();
        y.lIllIIlIlIIlI[1] = 0xC ^ 0x66 ^ (2 ^ 0x62);
        y.lIllIIlIlIIlI[2] = " ".length();
    }

    private static boolean llIIIllIIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIllIIIIIIll(int n2) {
        return n2 == 0;
    }

    static {
        y.llIIIllIIIIIIII();
    }
}

