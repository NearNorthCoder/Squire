package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.s  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/s.class */
public class s implements o {
    private static /* synthetic */ int[] lIlIIIlIlllIl;

    private static boolean lIlllIIIIIlIIII(int i) {
        return i == 0;
    }

    private static boolean lIlllIIIIIIllll(int i) {
        return i != 0;
    }

    private static void lIlllIIIIIIlllI() {
        lIlIIIlIlllIl = new int[4];
        lIlIIIlIlllIl[0] = " ".length();
        lIlIIIlIlllIl[1] = (125 ^ 85) & ((3 ^ 43) ^ (-1));
        lIlIIIlIlllIl[2] = (-26147) & 28662;
        lIlIIIlIlllIl[3] = (-((-397) & 14845)) & (-1) & 16377;
    }

    static {
        lIlllIIIIIIlllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        int[] iArr = new int[lIlIIIlIlllIl[0]];
        iArr[lIlIIIlIlllIl[1]] = lIlIIIlIlllIl[2];
        if (lIlllIIIIIIllll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIIlIlllIl[0]];
            iArr2[lIlIIIlIlllIl[1]] = lIlIIIlIlllIl[3];
            if (!lIlllIIIIIlIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlIIIlIlllIl[0]];
                iArr3[lIlIIIlIlllIl[1]] = lIlIIIlIlllIl[2];
                Item first = Inventory.getFirst(iArr3);
                int[] iArr4 = new int[lIlIIIlIlllIl[0]];
                iArr4[lIlIIIlIlllIl[1]] = lIlIIIlIlllIl[3];
                first.useOn(Inventory.getFirst(iArr4));
                return lIlIIIlIlllIl[0];
            }
        }
        return lIlIIIlIlllIl[1];
    }
}
