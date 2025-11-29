package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "0 Ticking")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.N  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/N.class */
public class N extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIIlIlIl;

    private static boolean lIlIllIlIIIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    private boolean U() {
        if (lIlIllIlIIIlII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return lllIIIlIlIl[6];
        }
        int[] iArr = new int[lllIIIlIlIl[6]];
        iArr[lllIIIlIlIl[5]] = lllIIIlIlIl[3];
        Item first = Inventory.getFirst(iArr);
        if (lIlIllIlIIIIll(first)) {
            return lllIIIlIlIl[5];
        }
        int[] iArr2 = new int[lllIIIlIlIl[6]];
        iArr2[lllIIIlIlIl[5]] = lllIIIlIlIl[4];
        Item first2 = Inventory.getFirst(iArr2);
        if (lIlIllIlIIIIll(first2)) {
            return lllIIIlIlIl[5];
        }
        first.useOn(first2);
        return lllIIIlIlIl[6];
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        if (lIlIllIIlllllI(this.j.zeroTickProduct(), s.COMPOST)) {
            int i = lllIIIlIlIl[7];
            "".length();
            return 0 != 0 ? (74 ^ 120) & ((121 ^ 75) ^ (-1)) : i;
        }
        return lllIIIlIlIl[5];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIllIIllllll(this.j.activity(), EnumC0001b.ZERO_TICK)) {
            return lllIIIlIlIl[5];
        }
        if (lIlIllIIlllllI(this.j.zeroTickProduct(), s.COMPOST)) {
            return U();
        }
        if (lIlIllIlIIIIII(Inventory.getFreeSlots(), lllIIIlIlIl[1])) {
            return lllIIIlIlIl[5];
        }
        int i = lllIIIlIlIl[5];
        do {
            if (lIlIllIlIIIIIl(i, lllIIIlIlIl[1])) {
                Item item = Inventory.getItem(i);
                if (lIlIllIlIIIIlI(item)) {
                    if (lIlIllIlIIIIll(Inventory.getItem(i + lllIIIlIlIl[1]))) {
                        "".length();
                        if ("   ".length() <= 0) {
                            return ((76 ^ 91) ^ (47 ^ 60)) & (((2 ^ 65) ^ (59 ^ 124)) ^ (-" ".length()));
                        }
                    } else {
                        item.useOn(Inventory.getItem(i + lllIIIlIlIl[1]));
                    }
                }
                i++;
                "".length();
            }
            return lllIIIlIlIl[6];
        } while ((((33 ^ 23) ^ (181 ^ 157)) & (((241 ^ 134) ^ (192 ^ 169)) ^ (-" ".length()))) == 0);
        return ((108 ^ 63) ^ (86 ^ 101)) & (((((228 + 155) - 199) + 55) ^ (((65 + 22) - 50) + 106)) ^ (-" ".length()));
    }

    private static boolean lIlIllIIlllllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return lIlIllIIlllllI(this.j.zeroTickProduct(), s.SERUMS) ? Map.of(Integer.valueOf(lllIIIlIlIl[0]), Integer.valueOf(lllIIIlIlIl[1]), Integer.valueOf(lllIIIlIlIl[2]), Integer.valueOf(lllIIIlIlIl[1])) : Map.of(Integer.valueOf(lllIIIlIlIl[3]), Integer.valueOf(lllIIIlIlIl[1]), Integer.valueOf(lllIIIlIlIl[4]), Integer.valueOf(lllIIIlIlIl[1]));
    }

    private static boolean lIlIllIIllllll(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Inject
    public N(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.ZERO_TICK);
    }

    private static boolean lIlIllIlIIIlII(int i) {
        return i != 0;
    }

    private static void lIlIllIIllllIl() {
        lllIIIlIlIl = new int[8];
        lllIIIlIlIl[0] = (-((-67) & 28102)) & (-4101) & 32727;
        lllIIIlIlIl[1] = (((30 + 122) - 110) + 108) ^ (((18 + 58) - 9) + 85);
        lllIIIlIlIl[2] = 38 ^ 121;
        lllIIIlIlIl[3] = (-18473) & 24504;
        lllIIIlIlIl[4] = (-18947) & 32367;
        lllIIIlIlIl[5] = (101 ^ 121) & ((51 ^ 47) ^ (-1));
        lllIIIlIlIl[6] = " ".length();
        lllIIIlIlIl[7] = 159 ^ 155;
    }

    private static boolean lIlIllIlIIIIII(int i, int i2) {
        return i >= i2;
    }

    static {
        lIlIllIIllllIl();
    }

    private static boolean lIlIllIlIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIllIlIIIIlI(Object obj) {
        return obj != null;
    }
}
