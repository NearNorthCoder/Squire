package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Cutting stuff")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.H  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/H.class */
public class H extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIllIIIl;

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return lIlIlllIIlIlIl(this.j.fletchingProduct(), EnumC0011l.ARROW_SHAFT) ? Map.of(Integer.valueOf(lllIIllIIIl[0]), Integer.valueOf(lllIIllIIIl[1]), Integer.valueOf(this.j.arrowShaftLogs().M()), Integer.valueOf(lllIIllIIIl[1])) : Map.of(Integer.valueOf(lllIIllIIIl[0]), Integer.valueOf(lllIIllIIIl[1]), Integer.valueOf(this.j.fletchingProduct().z()), Integer.valueOf(lllIIllIIIl[1]));
    }

    @Inject
    public H(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.FLETCH_CUTTING);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIllIIIl[3];
    }

    private static void lIlIlllIIlIlII() {
        lllIIllIIIl = new int[4];
        lllIIllIIIl[0] = (-1101) & 2046;
        lllIIllIIIl[1] = " ".length();
        lllIIllIIIl[2] = (108 ^ 73) & ((129 ^ 164) ^ (-1));
        lllIIllIIIl[3] = (((21 + 33) - 22) + 98) ^ (((24 + 79) - 13) + 44);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        int z;
        if (lIlIlllIIlIllI(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption(this.j.fletchingProduct().C());
            sleep(i());
            return lllIIllIIIl[1];
        }
        int[] iArr = new int[lllIIllIIIl[1]];
        int i = lllIIllIIIl[2];
        if (lIlIlllIIlIlIl(this.j.fletchingProduct(), EnumC0011l.ARROW_SHAFT)) {
            z = this.j.arrowShaftLogs().M();
            "".length();
            if (((54 ^ 42) & ((141 ^ 145) ^ (-1))) < 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            z = this.j.fletchingProduct().z();
        }
        iArr[i] = z;
        Item first = Inventory.getFirst(iArr);
        int[] iArr2 = new int[lllIIllIIIl[1]];
        iArr2[lllIIllIIIl[2]] = lllIIllIIIl[0];
        first.useOn(Inventory.getFirst(iArr2));
        return lllIIllIIIl[1];
    }

    private static boolean lIlIlllIIlIllI(int i) {
        return i != 0;
    }

    static {
        lIlIlllIIlIlII();
    }

    private static boolean lIlIlllIIlIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }
}
