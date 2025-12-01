package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import java.util.Comparator;
import java.util.HashMap;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.b  reason: invalid package and case insensitive filesystem */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/b.class */
public class C0001b {
    private static /* synthetic */ int[] lIIlIIllIIlIl;
    public final /* synthetic */ HashMap<String, Integer> i = new C0002c(this);

    public HashMap<String, Integer> h() {
        return this.i;
    }

    private static boolean lIlIlIlIIIllIlI(int i) {
        return i != 0;
    }

    public Item g() {
        return (Item) Inventory.getAll(item -> {
            if (lIlIlIlIIIllIlI(this.i.containsKey(item.getName()) ? 1 : 0) && lIlIlIlIIIllIll(Combat.getMissingHealth())) {
                ?? r0 = lIIlIIllIIlIl[0];
                "".length();
                return (49 ^ 53) <= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIIllIIlIl[1];
        }).stream().min(Comparator.comparingInt(item2 -> {
            return this.i.get(item2.getName()).intValue();
        })).orElse(null);
    }

    static {
        lIlIlIlIIIllIIl();
    }

    private static boolean lIlIlIlIIIllIll(int i) {
        return i > 0;
    }

    private static void lIlIlIlIIIllIIl() {
        lIIlIIllIIlIl = new int[2];
        lIIlIIllIIlIl[0] = " ".length();
        lIIlIIllIIlIl[1] = (108 ^ 124) & ((178 ^ 162) ^ (-1));
    }
}
