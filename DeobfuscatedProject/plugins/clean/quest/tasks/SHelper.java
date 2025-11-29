/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.quest.tasks;

import net.unethicalite.api.items.Inventory;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;

public class SHelper
implements o {

    private static boolean lIlllIIIIIlIIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIIIIIIllll(int n2) {
        return n2 != 0;
    }

    static {
        s.lIlllIIIIIIlllI();
    }

    @Override
    public boolean D() {
        block3: {
            block2: {
                int[] nArray = new int[lIlIIIlIlllIl[0]];
                nArray[s.lIlIIIlIlllIl[1]] = lIlIIIlIlllIl[2];
                if (!s.lIlllIIIIIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[lIlIIIlIlllIl[0]];
                nArray2[s.lIlIIIlIlllIl[1]] = lIlIIIlIlllIl[3];
                if (!s.lIlllIIIIIlIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
            }
            return lIlIIIlIlllIl[1];
        }
        int[] nArray = new int[lIlIIIlIlllIl[0]];
        nArray[s.lIlIIIlIlllIl[1]] = lIlIIIlIlllIl[2];
        int[] nArray3 = new int[lIlIIIlIlllIl[0]];
        nArray3[s.lIlIIIlIlllIl[1]] = lIlIIIlIlllIl[3];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray3));
        return lIlIIIlIlllIl[0];
    }
}

