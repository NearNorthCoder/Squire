package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Making darts")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.I  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/I.class */
public class I extends AbstractC0000a {
    private final /* synthetic */ int[] w;
    private static /* synthetic */ int[] lllIIIlIlll;

    private static boolean lIlIllIlIIIlll(int i, int i2) {
        return i < i2;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIIIlIlll[2]), Integer.valueOf(lllIIIlIlll[5]), Integer.valueOf(this.j.dart().D()), Integer.valueOf(lllIIIlIlll[5]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        EnumC0009j dart = this.j.dart();
        int[] iArr = new int[lllIIIlIlll[3]];
        iArr[lllIIIlIlll[1]] = dart.D();
        Item first = Inventory.getFirst(iArr);
        if (lIlIllIlIIIllI(first)) {
            return lllIIIlIlll[1];
        }
        Item first2 = Inventory.getFirst(this.w);
        if (lIlIllIlIIIllI(first2)) {
            return lllIIIlIlll[1];
        }
        int i = lllIIIlIlll[1];
        while (lIlIllIlIIIlll(i, lllIIIlIlll[6])) {
            first2.useOn(first);
            i++;
            "".length();
            if (((42 ^ 58) & ((142 ^ 158) ^ (-1))) < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIIlIlll[3];
    }

    static {
        lIlIllIlIIIlIl();
    }

    private static void lIlIllIlIIIlIl() {
        lllIIIlIlll = new int[7];
        lllIIIlIlll[0] = "  ".length();
        lllIIIlIlll[1] = ((18 ^ 89) ^ (66 ^ 55)) & (((((1 + 151) - 25) + 33) ^ (((97 + 94) - 91) + 58)) ^ (-" ".length()));
        lllIIIlIlll[2] = (-((-13065) & 29449)) & (-15937) & 32634;
        lllIIIlIlll[3] = " ".length();
        lllIIIlIlll[4] = (-2198) & 12285;
        lllIIIlIlll[5] = 46 ^ 36;
        lllIIIlIlll[6] = 42 ^ 34;
    }

    @Inject
    public I(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.DARTS);
        int[] iArr = new int[lllIIIlIlll[0]];
        iArr[lllIIIlIlll[1]] = lllIIIlIlll[2];
        iArr[lllIIIlIlll[3]] = lllIIIlIlll[4];
        this.w = iArr;
    }

    private static boolean lIlIllIlIIIllI(Object obj) {
        return obj == null;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIIlIlll[1];
    }
}
