package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.g  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/g.class */
public class g {
    public final /* synthetic */ HashMap<String, Integer> v = new h(this);
    private static /* synthetic */ int[] lllIIIIlIII;

    private static boolean lIlIllIIlllIlI(int i) {
        return i > 0;
    }

    private static void lIlIllIIlllIII() {
        lllIIIIlIII = new int[2];
        lllIIIIlIII[0] = " ".length();
        lllIIIIlIII[1] = (62 ^ 43) & ((112 ^ 101) ^ (-1));
    }

    private static boolean lIlIllIIlllIIl(int i) {
        return i != 0;
    }

    public Item G() {
        return (Item) Inventory.getAll(item -> {
            if (lIlIllIIlllIIl(this.v.containsKey(item.getName()) ? 1 : 0) && lIlIllIIlllIlI(Combat.getMissingHealth())) {
                ?? r0 = lllIIIIlIII[0];
                "".length();
                return "   ".length() <= (((253 ^ 191) ^ (226 ^ 148)) & (((((76 + 101) - 144) + 120) ^ (((8 + 57) - 44) + 152)) ^ (-" ".length()))) ? ((((86 + 51) - 5) + 40) ^ (((96 + 47) - 135) + 138)) & (((((107 + 132) - 189) + 138) ^ (((41 + 12) - (-54)) + 23)) ^ (-" ".length())) : r0;
            }
            return lllIIIIlIII[1];
        }).stream().min(Comparator.comparingInt(item2 -> {
            return this.v.get(item2.getName()).intValue();
        })).orElse(null);
    }

    static {
        lIlIllIIlllIII();
    }
}
