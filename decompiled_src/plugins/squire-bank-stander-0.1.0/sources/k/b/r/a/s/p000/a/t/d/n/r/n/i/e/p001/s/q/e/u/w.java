package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Making wines")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.w  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/w.class */
public class w extends AbstractC0000a {
    private static /* synthetic */ int[] lllIlIIllII;

    private static boolean lIlIllllIllIll(int i, int i2) {
        return i == i2;
    }

    static {
        lIlIllllIllIlI();
    }

    private static boolean lIlIllllIlllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIllllIllIll(Players.getLocal().getAnimation(), lllIlIIllII[3])) {
            return lllIlIIllII[4];
        }
        if (lIlIllllIlllII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            sleep(i());
            return lllIlIIllII[1];
        }
        int[] iArr = new int[lllIlIIllII[1]];
        iArr[lllIlIIllII[4]] = lllIlIIllII[0];
        Item first = Inventory.getFirst(iArr);
        int[] iArr2 = new int[lllIlIIllII[1]];
        iArr2[lllIlIIllII[4]] = lllIlIIllII[2];
        first.useOn(Inventory.getFirst(iArr2));
        return lllIlIIllII[1];
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIlIIllII[5];
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(lllIlIIllII[0]), Integer.valueOf(lllIlIIllII[1]), Integer.valueOf(lllIlIIllII[2]), Integer.valueOf(lllIlIIllII[1]));
    }

    @Inject
    public w(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.WINES);
    }

    private static void lIlIllllIllIlI() {
        lllIlIIllII = new int[6];
        lllIlIIllII[0] = (-((-6209) & 30797)) & (-2065) & 28639;
        lllIlIIllII[1] = " ".length();
        lllIlIIllII[2] = (-((-2661) & 23149)) & (-8259) & 30683;
        lllIlIIllII[3] = (-((-13705) & 14239)) & (-129) & 8191;
        lllIlIIllII[4] = ((((234 + 133) - 352) + 230) ^ (((98 + 67) - 109) + 122)) & (((54 ^ 100) ^ (137 ^ 156)) ^ (-" ".length()));
        lllIlIIllII[5] = "   ".length();
    }
}
