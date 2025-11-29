/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import m.e.a.i.z.m.r.-.q.s.y.u.e;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import m.e.a.i.z.m.r.-.q.s.y.u.m;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;

@TaskDesc(name="Equipping Mage Gear")
public class x
extends m {
    private static /* synthetic */ int[] lIllIIIllIIlI;

    private static void llIIIlIlIIlIIll() {
        lIllIIIllIIlI = new int[2];
        x.lIllIIIllIIlI[0] = (0x74 ^ 0x22) & ~(0x26 ^ 0x70);
        x.lIllIIIllIIlI[1] = " ".length();
    }

    private static boolean llIIIlIlIIlIllI(Object object) {
        return object != null;
    }

    static {
        x.llIIIlIlIIlIIll();
    }

    @Inject
    public x(SquireZammyConfig squireZammyConfig, l l2) {
        super(squireZammyConfig, l2);
    }

    private static boolean llIIIlIlIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIlIlIIlIlII(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        x llllllllllllllIllIIlIllIllIIlIlI;
        if (!x.llIIIlIlIIlIlII(this.I.B() ? 1 : 0) || x.llIIIlIlIIlIlII(this.I.A() ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        if (x.llIIIlIlIIlIlIl(llllllllllllllIllIIlIllIllIIlIlI.I.D() ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        if (x.llIIIlIlIIlIlIl(llllllllllllllIllIIlIllIllIIlIlI.I.H() ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        int[] nArray = new int[lIllIIIllIIlI[1]];
        nArray[x.lIllIIIllIIlI[0]] = e.BALFRUG_KREEYATH.n();
        NPC llllllllllllllIllIIlIllIllIIlIIl = NPCs.getNearest((int[])nArray);
        if (x.llIIIlIlIIlIllI(llllllllllllllIllIIlIllIllIIlIIl) && x.llIIIlIlIIlIlIl(llllllllllllllIllIIlIllIllIIlIIl.isDead() ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        int[] llllllllllllllIllIIlIllIllIIlIII = llllllllllllllIllIIlIllIllIIlIlI.K();
        if (x.llIIIlIlIIlIlIl(llllllllllllllIllIIlIllIllIIlIlI.b(llllllllllllllIllIIlIllIllIIlIII) ? 1 : 0)) {
            return lIllIIIllIIlI[0];
        }
        this.a((int[])var2_2);
        "".length();
        return lIllIIIllIIlI[1];
    }
}

