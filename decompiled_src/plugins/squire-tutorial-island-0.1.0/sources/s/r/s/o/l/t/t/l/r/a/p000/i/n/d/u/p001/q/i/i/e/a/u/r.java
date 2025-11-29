package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.r  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/r.class */
public class r implements o {
    private static /* synthetic */ int ah;
    private static /* synthetic */ int[] lIlIIlIIIIllI;

    private static void lIlllIIIlllIIlI() {
        lIlIIlIIIIllI = new int[6];
        lIlIIlIIIIllI[0] = " ".length();
        lIlIIlIIIIllI[1] = (73 ^ 86) & ((114 ^ 109) ^ (-1));
        lIlIIlIIIIllI[2] = (-1537) & 4047;
        lIlIIlIIIIllI[3] = (-14641) & 15230;
        lIlIIlIIIIllI[4] = -" ".length();
        lIlIIlIIIIllI[5] = 103 ^ 99;
    }

    private static boolean lIlllIIIlllIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        int[] iArr = new int[lIlIIlIIIIllI[0]];
        iArr[lIlIIlIIIIllI[1]] = lIlIIlIIIIllI[2];
        if (lIlllIIIlllIIll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIIlIIIIllI[0]];
            iArr2[lIlIIlIIIIllI[1]] = lIlIIlIIIIllI[3];
            if (!lIlllIIIlllIlII(Inventory.contains(iArr2) ? 1 : 0)) {
                if (lIlllIIIlllIlIl(TileObjects.getNearest(tileObject -> {
                    return tileObject.getWorldLocation().equals(Players.getLocal());
                }))) {
                    Movement.walkTo(Players.getLocal().getWorldLocation().getX() + lIlIIlIIIIllI[0], Players.getLocal().getWorldLocation().getY());
                    "".length();
                    return lIlIIlIIIIllI[0];
                } else if (lIlllIIIlllIllI(Players.getLocal().getAnimation(), lIlIIlIIIIllI[4])) {
                    return lIlIIlIIIIllI[1];
                } else {
                    if (lIlllIIIlllIlll(ah, lIlIIlIIIIllI[0])) {
                        ah -= lIlIIlIIIIllI[0];
                        return lIlIIlIIIIllI[1];
                    }
                    int[] iArr3 = new int[lIlIIlIIIIllI[0]];
                    iArr3[lIlIIlIIIIllI[1]] = lIlIIlIIIIllI[2];
                    Item first = Inventory.getFirst(iArr3);
                    int[] iArr4 = new int[lIlIIlIIIIllI[0]];
                    iArr4[lIlIIlIIIIllI[1]] = lIlIIlIIIIllI[3];
                    first.useOn(Inventory.getFirst(iArr4));
                    ah = M.a(lIlIIlIIIIllI[0], lIlIIlIIIIllI[5]);
                    return lIlIIlIIIIllI[0];
                }
            }
        }
        return lIlIIlIIIIllI[1];
    }

    private static boolean lIlllIIIlllIIll(int i) {
        return i != 0;
    }

    private static boolean lIlllIIIlllIlII(int i) {
        return i == 0;
    }

    static {
        lIlllIIIlllIIlI();
    }

    private static boolean lIlllIIIlllIlll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlllIIIlllIllI(int i, int i2) {
        return i != i2;
    }
}
