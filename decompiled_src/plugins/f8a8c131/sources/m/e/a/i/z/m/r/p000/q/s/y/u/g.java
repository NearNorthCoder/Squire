package m.e.a.i.z.m.r.p000.q.s.y.u;

import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.g  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/g.class */
public class g {
    private static /* synthetic */ int[] lIllIIlIlIlll;
    public final /* synthetic */ HashMap<String, Integer> p = new h(this);

    private static boolean llIIIllIIIllIII(int i) {
        return i != 0;
    }

    public Item w() {
        return (Item) Inventory.getAll(item -> {
            if (llIIIllIIIllIII(this.p.containsKey(item.getName()) ? 1 : 0) && llIIIllIIIllIIl(Combat.getMissingHealth())) {
                ?? r0 = lIllIIlIlIlll[0];
                "".length();
                return " ".length() < 0 ? ((81 ^ 59) ^ (125 ^ 117)) & (((52 ^ 63) ^ (229 ^ 140)) ^ (-" ".length())) : r0;
            }
            return lIllIIlIlIlll[1];
        }).stream().min(Comparator.comparingInt(item2 -> {
            return this.p.get(item2.getName()).intValue();
        })).orElse(null);
    }

    private static boolean llIIIllIIIllIIl(int i) {
        return i > 0;
    }

    static {
        llIIIllIIIlIlll();
    }

    private static void llIIIllIIIlIlll() {
        lIllIIlIlIlll = new int[2];
        lIllIIlIlIlll[0] = " ".length();
        lIllIIlIlIlll[1] = ((71 ^ 79) ^ (77 ^ 0)) & (((((84 + 50) - 96) + 190) ^ (((54 + 20) - (-4)) + 83)) ^ (-" ".length()));
    }
}
