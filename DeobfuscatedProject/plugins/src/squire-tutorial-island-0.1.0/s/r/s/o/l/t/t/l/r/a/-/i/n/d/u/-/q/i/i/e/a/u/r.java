/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class r
implements o {
    private static /* synthetic */ int ah;
    private static /* synthetic */ int[] lIlIIlIIIIllI;

    private static void lIlllIIIlllIIlI() {
        lIlIIlIIIIllI = new int[6];
        r.lIlIIlIIIIllI[0] = " ".length();
        r.lIlIIlIIIIllI[1] = (0x49 ^ 0x56) & ~(0x72 ^ 0x6D);
        r.lIlIIlIIIIllI[2] = 0xFFFFF9FF & 0xFCF;
        r.lIlIIlIIIIllI[3] = 0xFFFFC6CF & 0x3B7E;
        r.lIlIIlIIIIllI[4] = -" ".length();
        r.lIlIIlIIIIllI[5] = 0x67 ^ 0x63;
    }

    private static boolean lIlllIIIlllIlIl(Object object) {
        return object != null;
    }

    @Override
    public boolean D() {
        block7: {
            block6: {
                int[] nArray = new int[lIlIIlIIIIllI[0]];
                nArray[r.lIlIIlIIIIllI[1]] = lIlIIlIIIIllI[2];
                if (!r.lIlllIIIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block6;
                int[] nArray2 = new int[lIlIIlIIIIllI[0]];
                nArray2[r.lIlIIlIIIIllI[1]] = lIlIIlIIIIllI[3];
                if (!r.lIlllIIIlllIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block7;
            }
            return lIlIIlIIIIllI[1];
        }
        if (r.lIlllIIIlllIlIl(TileObjects.getNearest(tileObject -> tileObject.getWorldLocation().equals((Object)Players.getLocal())))) {
            Movement.walkTo((int)(Players.getLocal().getWorldLocation().getX() + lIlIIlIIIIllI[0]), (int)Players.getLocal().getWorldLocation().getY());
            "".length();
            return lIlIIlIIIIllI[0];
        }
        if (r.lIlllIIIlllIllI(Players.getLocal().getAnimation(), lIlIIlIIIIllI[4])) {
            return lIlIIlIIIIllI[1];
        }
        if (r.lIlllIIIlllIlll(ah, lIlIIlIIIIllI[0])) {
            ah -= lIlIIlIIIIllI[0];
            return lIlIIlIIIIllI[1];
        }
        int[] nArray = new int[lIlIIlIIIIllI[0]];
        nArray[r.lIlIIlIIIIllI[1]] = lIlIIlIIIIllI[2];
        int[] nArray3 = new int[lIlIIlIIIIllI[0]];
        nArray3[r.lIlIIlIIIIllI[1]] = lIlIIlIIIIllI[3];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray3));
        ah = M.a(lIlIIlIIIIllI[0], lIlIIlIIIIllI[5]);
        return lIlIIlIIIIllI[0];
    }

    private static boolean lIlllIIIlllIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIIIlllIlII(int n2) {
        return n2 == 0;
    }

    static {
        r.lIlllIIIlllIIlI();
    }

    private static boolean lIlllIIIlllIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlllIIIlllIllI(int n2, int n3) {
        return n2 != n3;
    }
}

