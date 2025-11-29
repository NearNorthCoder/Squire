package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import net.unethicalite.api.widgets.Dialog;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.B  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/B.class */
public class B implements o {
    private /* synthetic */ int ah;
    private static /* synthetic */ int[] lIlIIIlIlllll;

    static {
        lIlllIIIIIlIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        if (lIlllIIIIIlIIlI(M.I() ? 1 : 0)) {
            return lIlIIIlIlllll[0];
        }
        if (lIlllIIIIIlIIll(this.ah, lIlIIIlIlllll[1])) {
            this.ah -= lIlIIIlIlllll[1];
            return lIlIIIlIlllll[0];
        }
        Dialog.continueTutorial();
        this.ah = M.a(lIlIIIlIlllll[1], lIlIIIlIlllll[2]);
        return lIlIIIlIlllll[1];
    }

    private static boolean lIlllIIIIIlIIll(int i, int i2) {
        return i >= i2;
    }

    private static void lIlllIIIIIlIIIl() {
        lIlIIIlIlllll = new int[3];
        lIlIIIlIlllll[0] = ((((38 + 157) - 64) + 52) ^ (((79 + 57) - 105) + 118)) & (((139 ^ 183) ^ (108 ^ 114)) ^ (-" ".length()));
        lIlIIIlIlllll[1] = " ".length();
        lIlIIIlIlllll[2] = "   ".length();
    }

    private static boolean lIlllIIIIIlIIlI(int i) {
        return i == 0;
    }
}
