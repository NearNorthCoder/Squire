package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Making battlestaves")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.x  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/x.class */
public class x extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIlIIlII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIllIlllIlII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            sleep(i());
            return lllIIlIIlII[1];
        }
        int[] iArr = new int[lllIIlIIlII[1]];
        iArr[lllIIlIIlII[2]] = lllIIlIIlII[0];
        Item first = Inventory.getFirst(iArr);
        int[] iArr2 = new int[lllIIlIIlII[1]];
        iArr2[lllIIlIIlII[2]] = this.j.battlestaff().x();
        first.useOn(Inventory.getFirst(iArr2));
        return lllIIlIIlII[1];
    }

    private static boolean lIlIllIlllIlII(int i) {
        return i != 0;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIIlIIlII[0]), Integer.valueOf(lllIIlIIlII[1]), Integer.valueOf(this.j.battlestaff().x()), Integer.valueOf(lllIIlIIlII[1]));
    }

    static {
        lIlIllIlllIIll();
    }

    private static void lIlIllIlllIIll() {
        lllIIlIIlII = new int[4];
        lllIIlIIlII[0] = (-20609) & 21999;
        lllIIlIIlII[1] = " ".length();
        lllIIlIIlII[2] = ((((144 + 37) - 111) + 78) ^ (((168 + 2) - 136) + 153)) & (((102 ^ 16) ^ (210 ^ 139)) ^ (-" ".length()));
        lllIIlIIlII[3] = "   ".length();
    }

    @Inject
    public x(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.BATTLESTAVES);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIlIIlII[3];
    }
}
