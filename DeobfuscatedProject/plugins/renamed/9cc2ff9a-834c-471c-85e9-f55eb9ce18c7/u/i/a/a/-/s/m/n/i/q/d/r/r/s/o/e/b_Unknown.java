/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.c_Unknown;

public class b_Unknown {
    private static /* synthetic */ int[] lIIlIIllIIlIl;
    public final /* synthetic */ HashMap<String, Integer> i;

    public b() {
        this.i = new c(this);
    }

    public HashMap<String, Integer> h() {
        return this.i;
    }

    private static boolean lIlIlIlIIIllIlI(int n2) {
        return n2 != 0;
    }

    public Item g() {
        return Inventory.getAll(item -> {
            int n2;
            if (b.lIlIlIlIIIllIlI(this.i.containsKey(item.getName()) ? 1 : 0) && b.lIlIlIlIIIllIll(Combat.getMissingHealth())) {
                n2 = lIIlIIllIIlIl[0];
                0;
                if ((0x31 ^ 0x35) <= 3) {
                    return false;
                }
            } else {
                n2 = lIIlIIllIIlIl[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparingInt(item -> this.i.get(item.getName()))).orElse(null);
    }

    static {
        b.lIlIlIlIIIllIIl();
    }

    private static boolean lIlIlIlIIIllIll(int n2) {
        return n2 > 0;
    }

    private static void lIlIlIlIIIllIIl() {
        lIIlIIllIIlIl = new int[2];
        b.lIIlIIllIIlIl[0] = 1;
        b.lIIlIIllIIlIl[1] = (0x6C ^ 0x7C) & ~(0xB2 ^ 0xA2);
    }
}

