/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class u
implements o {
    private final /* synthetic */ int ai;
    private static /* synthetic */ int[] lIlIIIlIIlIll;

    private static void lIllIlllllIIlll() {
        lIlIIIlIIlIll = new int[3];
        u.lIlIIIlIIlIll[0] = 1;
        u.lIlIIIlIIlIll[1] = (0xB ^ 1) & ~(0x54 ^ 0x5E);
        u.lIlIIIlIIlIll[2] = 2;
    }

    private static boolean lIllIlllllIlIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean D() {
        int[] nArray = new int[lIlIIIlIIlIll[0]];
        nArray[u.lIlIIIlIIlIll[1]] = this.ai;
        if (u.lIllIlllllIlIII(Equipment.contains((int[])nArray) ? 1 : 0)) {
            return lIlIIIlIIlIll[1];
        }
        int[] nArray2 = new int[lIlIIIlIIlIll[0]];
        nArray2[u.lIlIIIlIIlIll[1]] = this.ai;
        Inventory.getFirst((int[])nArray2).interact(lIlIIIlIIlIll[2]);
        return lIlIIIlIIlIll[0];
    }

    static {
        u.lIllIlllllIIlll();
    }

    public u(int n2) {
        this.ai = n2;
    }
}

