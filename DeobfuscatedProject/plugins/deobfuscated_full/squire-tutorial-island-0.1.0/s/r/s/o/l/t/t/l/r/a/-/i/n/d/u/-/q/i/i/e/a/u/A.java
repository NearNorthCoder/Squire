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

public class A
implements o {
    private static /* synthetic */ int[] lIlIIlIIIIIII;

    @Override
    public boolean D() {
        if (A.lIlllIIIllIIIll(M.J() ? 1 : 0)) {
            return lIlIIlIIIIIII[0];
        }
        Dialog.chooseOption((int)M.a(lIlIIlIIIIIII[1], lIlIIlIIIIIII[2]));
        0;
        return lIlIIlIIIIIII[1];
    }

    static {
        A.lIlllIIIllIIIlI();
    }

    private static boolean lIlllIIIllIIIll(int n2) {
        return n2 == 0;
    }

    private static void lIlllIIIllIIIlI() {
        lIlIIlIIIIIII = new int[3];
        A.lIlIIlIIIIIII[0] = 1 & ~1;
        A.lIlIIlIIIIIII[1] = 1;
        A.lIlIIlIIIIIII[2] = 3;
    }
}

