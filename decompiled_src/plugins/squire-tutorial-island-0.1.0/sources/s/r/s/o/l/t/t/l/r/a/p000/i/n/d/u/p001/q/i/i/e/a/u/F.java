package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import net.unethicalite.api.widgets.Dialog;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.F  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/F.class */
public class F implements o {
    private static /* synthetic */ int[] lIlIIIlllIllI;
    private static /* synthetic */ int ah;

    private static void lIlllIIIlIIlIII() {
        lIlIIIlllIllI = new int[3];
        lIlIIIlllIllI[0] = " ".length();
        lIlIIIlllIllI[1] = ((((70 + 26) - 12) + 121) ^ (((191 + 164) - 200) + 38)) & (((((74 + 7) - 59) + 107) ^ (((65 + 34) - 83) + 125)) ^ (-" ".length()));
        lIlIIIlllIllI[2] = "   ".length();
    }

    static {
        lIlllIIIlIIlIII();
    }

    private static boolean lIlllIIIlIIlIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        if (lIlllIIIlIIlIIl(ah, lIlIIIlllIllI[0])) {
            ah -= lIlIIIlllIllI[0];
            return lIlIIIlllIllI[1];
        } else if (lIlllIIIlIIlIlI(M.H() ? 1 : 0)) {
            return lIlIIIlllIllI[1];
        } else {
            Dialog.continueSpace();
            ah = M.a(lIlIIIlllIllI[0], lIlIIIlllIllI[2]);
            return lIlIIIlllIllI[0];
        }
    }

    private static boolean lIlllIIIlIIlIIl(int i, int i2) {
        return i >= i2;
    }
}
