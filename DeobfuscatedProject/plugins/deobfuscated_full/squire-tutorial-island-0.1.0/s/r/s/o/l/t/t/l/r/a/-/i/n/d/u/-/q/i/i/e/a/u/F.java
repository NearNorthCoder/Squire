/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.widgets.Dialog
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import net.unethicalite.api.widgets.Dialog;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class F
implements o {
    private static /* synthetic */ int[] lIlIIIlllIllI;
    private static /* synthetic */ int ah;

    private static void lIlllIIIlIIlIII() {
        lIlIIIlllIllI = new int[3];
        F.lIlIIIlllIllI[0] = 1;
        F.lIlIIIlllIllI[1] = (70 + 26 - 12 + 121 ^ 191 + 164 - 200 + 38) & (74 + 7 - 59 + 107 ^ 65 + 34 - 83 + 125 ^ -1);
        F.lIlIIIlllIllI[2] = 3;
    }

    static {
        F.lIlllIIIlIIlIII();
    }

    private static boolean lIlllIIIlIIlIlI(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean D() {
        if (F.lIlllIIIlIIlIIl(ah, lIlIIIlllIllI[0])) {
            ah -= lIlIIIlllIllI[0];
            return lIlIIIlllIllI[1];
        }
        if (F.lIlllIIIlIIlIlI(M.H() ? 1 : 0)) {
            return lIlIIIlllIllI[1];
        }
        Dialog.continueSpace();
        ah = M.a(lIlIIIlllIllI[0], lIlIIIlllIllI[2]);
        return lIlIIIlllIllI[0];
    }

    private static boolean lIlllIIIlIIlIIl(int n2, int n3) {
        return n2 >= n3;
    }
}

