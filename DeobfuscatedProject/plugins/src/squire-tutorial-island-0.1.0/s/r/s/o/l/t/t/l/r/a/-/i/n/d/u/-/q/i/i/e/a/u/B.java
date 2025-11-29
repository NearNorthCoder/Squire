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

public class B
implements o {
    private /* synthetic */ int ah;
    private static /* synthetic */ int[] lIlIIIlIlllll;

    static {
        B.lIlllIIIIIlIIIl();
    }

    @Override
    public boolean D() {
        B llllllllllllllIlllIIIlIlIIIlllII;
        if (B.lIlllIIIIIlIIlI(M.I() ? 1 : 0)) {
            return lIlIIIlIlllll[0];
        }
        if (B.lIlllIIIIIlIIll(llllllllllllllIlllIIIlIlIIIlllII.ah, lIlIIIlIlllll[1])) {
            llllllllllllllIlllIIIlIlIIIlllII.ah -= lIlIIIlIlllll[1];
            return lIlIIIlIlllll[0];
        }
        Dialog.continueTutorial();
        this.ah = M.a(lIlIIIlIlllll[1], lIlIIIlIlllll[2]);
        return lIlIIIlIlllll[1];
    }

    private static boolean lIlllIIIIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlllIIIIIlIIIl() {
        lIlIIIlIlllll = new int[3];
        B.lIlIIIlIlllll[0] = (38 + 157 - 64 + 52 ^ 79 + 57 - 105 + 118) & (0x8B ^ 0xB7 ^ (0x6C ^ 0x72) ^ -" ".length());
        B.lIlIIIlIlllll[1] = " ".length();
        B.lIlIIIlIlllll[2] = "   ".length();
    }

    private static boolean lIlllIIIIIlIIlI(int n2) {
        return n2 == 0;
    }
}

