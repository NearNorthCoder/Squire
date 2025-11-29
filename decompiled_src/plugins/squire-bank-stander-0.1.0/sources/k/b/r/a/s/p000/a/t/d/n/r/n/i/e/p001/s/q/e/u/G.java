package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Making bolts")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.G  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/G.class */
public class G extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIlIlIll;
    private final /* synthetic */ int[] v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        EnumC0006g bolt = this.j.bolt();
        int[] iArr = new int[lllIIlIlIll[3]];
        iArr[lllIIlIlIll[1]] = bolt.y();
        Item first = Inventory.getFirst(iArr);
        if (lIlIlllIIIIIII(first)) {
            return lllIIlIlIll[1];
        }
        Item first2 = Inventory.getFirst(this.v);
        if (lIlIlllIIIIIII(first2)) {
            return lllIIlIlIll[1];
        }
        int i = lllIIlIlIll[1];
        while (lIlIlllIIIIIIl(i, lllIIlIlIll[6])) {
            first2.useOn(first);
            i++;
            "".length();
            if ((42 ^ 46) < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIlIlIll[3];
    }

    private static boolean lIlIlllIIIIIII(Object obj) {
        return obj == null;
    }

    @Inject
    public G(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.BOLTS);
        int[] iArr = new int[lllIIlIlIll[0]];
        iArr[lllIIlIlIll[1]] = lllIIlIlIll[2];
        iArr[lllIIlIlIll[3]] = lllIIlIlIll[4];
        this.v = iArr;
    }

    static {
        lIlIllIlllllll();
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIIlIlIll[2]), Integer.valueOf(lllIIlIlIll[5]), Integer.valueOf(this.j.bolt().y()), Integer.valueOf(lllIIlIlIll[5]));
    }

    private static boolean lIlIlllIIIIIIl(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllIlllllll() {
        lllIIlIlIll = new int[7];
        lllIIlIlIll[0] = "  ".length();
        lllIIlIlIll[1] = (224 ^ 177) & ((250 ^ 171) ^ (-1));
        lllIIlIlIll[2] = (-((-2905) & 28634)) & (-581) & 26623;
        lllIIlIlIll[3] = " ".length();
        lllIIlIlIll[4] = (-((-5227) & 21611)) & (-2198) & 28669;
        lllIIlIlIll[5] = (245 ^ 128) ^ (((3 + 33) - (-64)) + 27);
        lllIIlIlIll[6] = 132 ^ 140;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIlIlIll[1];
    }
}
