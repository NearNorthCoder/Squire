package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.u  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/u.class */
public class u implements o {
    private final /* synthetic */ int ai;
    private static /* synthetic */ int[] lIlIIIlIIlIll;

    private static void lIllIlllllIIlll() {
        lIlIIIlIIlIll = new int[3];
        lIlIIIlIIlIll[0] = " ".length();
        lIlIIIlIIlIll[1] = (11 ^ 1) & ((84 ^ 94) ^ (-1));
        lIlIIIlIIlIll[2] = "  ".length();
    }

    private static boolean lIllIlllllIlIII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        int[] iArr = new int[lIlIIIlIIlIll[0]];
        iArr[lIlIIIlIIlIll[1]] = this.ai;
        if (lIllIlllllIlIII(Equipment.contains(iArr) ? 1 : 0)) {
            return lIlIIIlIIlIll[1];
        }
        int[] iArr2 = new int[lIlIIIlIIlIll[0]];
        iArr2[lIlIIIlIIlIll[1]] = this.ai;
        Inventory.getFirst(iArr2).interact(lIlIIIlIIlIll[2]);
        return lIlIIIlIIlIll[0];
    }

    static {
        lIllIlllllIIlll();
    }

    public u(int i) {
        this.ai = i;
    }
}
