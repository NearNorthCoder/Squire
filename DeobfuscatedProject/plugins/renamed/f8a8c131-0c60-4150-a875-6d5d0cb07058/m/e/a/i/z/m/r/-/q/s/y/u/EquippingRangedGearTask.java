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
import m.e.a.i.z.m.r.-.q.s.y.u.l_Unknown;
import m.e.a.i.z.m.r.-.q.s.y.u.m_Unknown;
import net.unethicalite.api.game.Combat;

/* TASK: Equipping Ranged Gear -> EquippingrangedgearTask */
@TaskDesc(name="Equipping Ranged Gear", priority=100)
public class EquippingRangedGearTask
extends m_Unknown {
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
        y var2;
        if (!y.llIIIllIIIIIIIl(this.I.B() ? 1 : 0) || y.llIIIllIIIIIIIl(this.I.A() ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        if (y.llIIIllIIIIIIIl(var2.I.H() ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        if (y.llIIIllIIIIIIIl(var2.H.useBlowpipe() ? 1 : 0) && y.llIIIllIIIIIIIl(Combat.isSpecEnabled() ? 1 : 0) && y.llIIIllIIIIIIlI(var2.I.z(), lIllIIlIlIIlI[1])) {
            return lIllIIlIlIIlI[0];
        }
        int[] var1 = var2.L();
        if (y.llIIIllIIIIIIll(var2.b(var1) ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        this.a((int[])var1_1);
        0;
        return lIllIIlIlIIlI[2];
    }

    private static void llIIIllIIIIIIII() {
        lIllIIlIlIIlI = new int[3];
        y.lIllIIlIlIIlI[0] = 3 & ~3;
        y.lIllIIlIlIIlI[1] = 0xC ^ 0x66 ^ (2 ^ 0x62);
        y.lIllIIlIlIIlI[2] = 1;
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

