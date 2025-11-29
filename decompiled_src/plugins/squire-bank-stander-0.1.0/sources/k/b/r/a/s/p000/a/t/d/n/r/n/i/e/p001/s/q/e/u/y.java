package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Cutting Gems")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.y  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/y.class */
public class y extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIIIlIIl;

    private static boolean lIlIllIIIlllII(int i, int i2) {
        return i == i2;
    }

    static {
        lIlIllIIIllIlI();
    }

    @Inject
    public y(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.GEM_CUTTING);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIIIlIIl[5];
    }

    private static boolean lIlIllIIIlllIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIllIIIllIll(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption(this.j.cuttingProduct().C());
            sleep(i());
            return lllIIIIlIIl[1];
        }
        int[] iArr = new int[lllIIIIlIIl[1]];
        iArr[lllIIIIlIIl[2]] = this.j.cuttingProduct().z();
        if (lIlIllIIIlllII(Inventory.getCount(iArr), lllIIIIlIIl[1]) && lIlIllIIIlllIl(this.i.e(), lllIIIIlIIl[3])) {
            int[] iArr2 = new int[lllIIIIlIIl[1]];
            iArr2[lllIIIIlIIl[2]] = lllIIIIlIIl[0];
            Item first = Inventory.getFirst(iArr2);
            int[] iArr3 = new int[lllIIIIlIIl[1]];
            iArr3[lllIIIIlIIl[2]] = this.j.cuttingProduct().z();
            first.useOn(Inventory.getFirst(iArr3));
            sleep(lllIIIIlIIl[4]);
            return lllIIIIlIIl[1];
        }
        int[] iArr4 = new int[lllIIIIlIIl[1]];
        iArr4[lllIIIIlIIl[2]] = lllIIIIlIIl[0];
        Item first2 = Inventory.getFirst(iArr4);
        int[] iArr5 = new int[lllIIIIlIIl[1]];
        iArr5[lllIIIIlIIl[2]] = this.j.cuttingProduct().z();
        first2.useOn(Inventory.getFirst(iArr5));
        sleep(lllIIIIlIIl[1]);
        return lllIIIIlIIl[1];
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIIIIlIIl[0]), Integer.valueOf(lllIIIIlIIl[1]), Integer.valueOf(this.j.cuttingProduct().z()), Integer.valueOf(lllIIIIlIIl[1]));
    }

    private static void lIlIllIIIllIlI() {
        lllIIIIlIIl = new int[6];
        lllIIIIlIIl[0] = (-((-595) & 17011)) & (-1) & 18171;
        lllIIIIlIIl[1] = " ".length();
        lllIIIIlIIl[2] = (110 ^ 38) & ((81 ^ 25) ^ (-1));
        lllIIIIlIIl[3] = (26 ^ 60) ^ (142 ^ 162);
        lllIIIIlIIl[4] = (160 ^ 156) ^ (29 ^ 36);
        lllIIIIlIIl[5] = (((77 + 114) - 36) + 41) ^ (((95 + 10) - (-70)) + 17);
    }

    private static boolean lIlIllIIIllIll(int i) {
        return i != 0;
    }
}
