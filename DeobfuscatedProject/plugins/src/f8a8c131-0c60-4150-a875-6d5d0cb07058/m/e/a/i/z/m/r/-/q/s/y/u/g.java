/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import java.util.Comparator;
import java.util.HashMap;
import m.e.a.i.z.m.r.-.q.s.y.u.h;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

public class g {
    private static /* synthetic */ int[] lIllIIlIlIlll;
    public final /* synthetic */ HashMap<String, Integer> p;

    private static boolean llIIIllIIIllIII(int n2) {
        return n2 != 0;
    }

    public Item w() {
        return Inventory.getAll(item -> {
            int n2;
            if (g.llIIIllIIIllIII(this.p.containsKey(item.getName()) ? 1 : 0) && g.llIIIllIIIllIIl(Combat.getMissingHealth())) {
                n2 = lIllIIlIlIlll[0];
                "".length();
                if (" ".length() < 0) {
                    return ((0x51 ^ 0x3B ^ (0x7D ^ 0x75)) & (0x34 ^ 0x3F ^ (0xE5 ^ 0x8C) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIllIIlIlIlll[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparingInt(item -> this.p.get(item.getName()))).orElse(null);
    }

    private static boolean llIIIllIIIllIIl(int n2) {
        return n2 > 0;
    }

    static {
        g.llIIIllIIIlIlll();
    }

    private static void llIIIllIIIlIlll() {
        lIllIIlIlIlll = new int[2];
        g.lIllIIlIlIlll[0] = " ".length();
        g.lIllIIlIlIlll[1] = (0x47 ^ 0x4F ^ (0x4D ^ 0)) & (84 + 50 - 96 + 190 ^ 54 + 20 - -4 + 83 ^ -" ".length());
    }

    public g() {
        this.p = new h(this);
    }
}

