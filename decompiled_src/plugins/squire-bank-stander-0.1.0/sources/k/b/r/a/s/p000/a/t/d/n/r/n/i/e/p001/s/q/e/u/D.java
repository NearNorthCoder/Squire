package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Making Armour")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.D  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/D.class */
public class D extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIIIllll;

    static {
        lIlIllIIlIllll();
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIIIIllll[0]), Integer.valueOf(lllIIIIllll[1]), Integer.valueOf(this.j.armourProduct().l()), Integer.valueOf(this.j.armourProduct().n()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIllIIllIIII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            sleep(i());
            return lllIIIIllll[1];
        }
        int[] iArr = new int[lllIIIIllll[1]];
        iArr[lllIIIIllll[2]] = this.j.armourProduct().l();
        Item first = Inventory.getFirst(iArr);
        int[] iArr2 = new int[lllIIIIllll[1]];
        iArr2[lllIIIIllll[2]] = lllIIIIllll[0];
        first.useOn(Inventory.getFirst(iArr2));
        return lllIIIIllll[1];
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIIIllll[3];
    }

    private static void lIlIllIIlIllll() {
        lllIIIIllll = new int[4];
        lllIIIIllll[0] = (-((-28349) & 32703)) & (-2081) & 8167;
        lllIIIIllll[1] = " ".length();
        lllIIIIllll[2] = (200 ^ 159) & ((194 ^ 149) ^ (-1));
        lllIIIIllll[3] = (236 ^ 166) ^ (94 ^ 16);
    }

    @Inject
    public D(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.ARMOUR);
    }

    private static boolean lIlIllIIllIIII(int i) {
        return i != 0;
    }
}
