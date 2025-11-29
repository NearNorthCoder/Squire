/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.s.r.i.e.s.o.u.a.d.n.-.b.h;

public class g {
    public final /* synthetic */ HashMap<String, Integer> v;
    private static /* synthetic */ int[] lllIIIIlIII;

    private static boolean lIlIllIIlllIlI(int n2) {
        return n2 > 0;
    }

    public g() {
        this.v = new h(this);
    }

    private static void lIlIllIIlllIII() {
        lllIIIIlIII = new int[2];
        g.lllIIIIlIII[0] = " ".length();
        g.lllIIIIlIII[1] = (0x3E ^ 0x2B) & ~(0x70 ^ 0x65);
    }

    private static boolean lIlIllIIlllIIl(int n2) {
        return n2 != 0;
    }

    public Item G() {
        return Inventory.getAll(item -> {
            int n2;
            if (g.lIlIllIIlllIIl(this.v.containsKey(item.getName()) ? 1 : 0) && g.lIlIllIIlllIlI(Combat.getMissingHealth())) {
                n2 = lllIIIIlIII[0];
                "".length();
                if ("   ".length() <= ((0xFD ^ 0xBF ^ (0xE2 ^ 0x94)) & (76 + 101 - 144 + 120 ^ 8 + 57 - 44 + 152 ^ -" ".length()))) {
                    return ((86 + 51 - 5 + 40 ^ 96 + 47 - 135 + 138) & (107 + 132 - 189 + 138 ^ 41 + 12 - -54 + 23 ^ -" ".length())) != 0;
                }
            } else {
                n2 = lllIIIIlIII[1];
            }
            return n2 != 0;
        }).stream().min(Comparator.comparingInt(item -> this.v.get(item.getName()))).orElse(null);
    }

    static {
        g.lIlIllIIlllIII();
    }
}

