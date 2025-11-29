package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Blowing glass")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.A  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/A.class */
public class A extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIlllIIl;

    private static boolean lIlIlllIlIlIIl(int i) {
        return i != 0;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIIlllIIl[0]), Integer.valueOf(lllIIlllIIl[1]), Integer.valueOf(lllIIlllIIl[2]), Integer.valueOf(lllIIlllIIl[1]));
    }

    static {
        lIlIlllIlIlIII();
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIlllIIl[4];
    }

    @Inject
    public A(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.GLASS_BLOWING);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIlllIlIlIIl(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption(this.j.glassProduct().C());
            sleep(i());
            return lllIIlllIIl[1];
        }
        int[] iArr = new int[lllIIlllIIl[1]];
        iArr[lllIIlllIIl[3]] = lllIIlllIIl[0];
        Item first = Inventory.getFirst(iArr);
        int[] iArr2 = new int[lllIIlllIIl[1]];
        iArr2[lllIIlllIIl[3]] = lllIIlllIIl[2];
        first.useOn(Inventory.getFirst(iArr2));
        return lllIIlllIIl[1];
    }

    private static void lIlIlllIlIlIII() {
        lllIIlllIIl = new int[5];
        lllIIlllIIl[0] = (-((-677) & 19111)) & (-4353) & 24571;
        lllIIlllIIl[1] = " ".length();
        lllIIlllIIl[2] = (-((-679) & 31655)) & (-17) & 32767;
        lllIIlllIIl[3] = ((16 ^ 1) ^ (221 ^ 129)) & (((113 ^ 33) ^ (57 ^ 36)) ^ (-" ".length()));
        lllIIlllIIl[4] = 9 ^ 13;
    }
}
