package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Stringing bows", register = true)
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.J  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/J.class */
public class J extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIllllIl;

    @Inject
    public J(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.STRING_BOWS);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIllllIl[3];
    }

    private static boolean lIlIlllIllIIIl(int i) {
        return i != 0;
    }

    private static void lIlIlllIllIIII() {
        lllIIllllIl = new int[4];
        lllIIllllIl[0] = " ".length();
        lllIIllllIl[1] = (-8199) & 9975;
        lllIIllllIl[2] = ((192 ^ 134) ^ (236 ^ 157)) & (((((131 + 44) - 160) + 137) ^ (((95 + 65) - 106) + 121)) ^ (-" ".length()));
        lllIIllllIl[3] = (54 ^ 34) ^ (33 ^ 49);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(this.j.stringableBow().z()), Integer.valueOf(lllIIllllIl[0]), Integer.valueOf(lllIIllllIl[1]), Integer.valueOf(lllIIllllIl[0]));
    }

    static {
        lIlIlllIllIIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIlllIllIIIl(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            sleep(i());
            return lllIIllllIl[0];
        }
        int[] iArr = new int[lllIIllllIl[0]];
        iArr[lllIIllllIl[2]] = this.j.stringableBow().z();
        Item first = Inventory.getFirst(iArr);
        int[] iArr2 = new int[lllIIllllIl[0]];
        iArr2[lllIIllllIl[2]] = lllIIllllIl[1];
        first.useOn(Inventory.getFirst(iArr2));
        return lllIIllllIl[0];
    }
}
