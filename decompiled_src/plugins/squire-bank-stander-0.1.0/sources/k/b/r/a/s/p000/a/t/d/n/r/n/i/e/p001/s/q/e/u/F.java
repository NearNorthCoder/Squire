package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;
@TaskDesc(name = "Making Arrows")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.F  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/F.class */
public class F extends AbstractC0000a {
    private static /* synthetic */ int[] lllIlIlIIlI;
    private final /* synthetic */ int[] u;

    @Inject
    public F(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.ARROWS);
        int[] iArr = new int[lllIlIlIIlI[0]];
        iArr[lllIlIlIIlI[1]] = lllIlIlIIlI[2];
        iArr[lllIlIlIIlI[3]] = lllIlIlIIlI[4];
        this.u = iArr;
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIlIlIIlI[8];
    }

    private static boolean lIlIllllllIIII(Object obj) {
        return obj == null;
    }

    private static void lIlIlllllIllIl() {
        lllIlIlIIlI = new int[9];
        lllIlIlIIlI[0] = "  ".length();
        lllIlIlIIlI[1] = " ".length() & (" ".length() ^ (-1));
        lllIlIlIIlI[2] = (-((-2097) & 27381)) & (-1026) & 26623;
        lllIlIlIIlI[3] = " ".length();
        lllIlIlIIlI[4] = (-((-14296) & 30687)) & (-4241) & 30719;
        lllIlIlIIlI[5] = (((140 + 50) - 186) + 144) ^ (((91 + 153) - 98) + 14);
        lllIlIlIIlI[6] = (59 ^ 52) ^ ((36 ^ 108) & ((84 ^ 28) ^ (-1)));
        lllIlIlIIlI[7] = (((151 + 48) - 78) + 123) ^ (((115 + 177) - 203) + 104);
        lllIlIlIIlI[8] = "   ".length();
    }

    private static boolean lIlIlllllIllll(int i) {
        return i != 0;
    }

    private static boolean lIlIlllllIlllI(int i, int i2) {
        return i == i2;
    }

    static {
        lIlIlllllIllIl();
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return lIlIlllllIlllI(this.j.arrowProduct().o(), lllIlIlIIlI[5]) ? Map.of(Integer.valueOf(lllIlIlIIlI[2]), Integer.valueOf(lllIlIlIIlI[6]), Integer.valueOf(this.j.arrowProduct().o()), Integer.valueOf(lllIlIlIIlI[6])) : Map.of(Integer.valueOf(lllIlIlIIlI[7]), Integer.valueOf(lllIlIlIIlI[6]), Integer.valueOf(this.j.arrowProduct().o()), Integer.valueOf(lllIlIlIIlI[6]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        Item first;
        if (lIlIlllllIllll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            sleep(i());
            return lllIlIlIIlI[3];
        }
        int[] iArr = new int[lllIlIlIIlI[3]];
        iArr[lllIlIlIIlI[1]] = this.j.arrowProduct().o();
        Item first2 = Inventory.getFirst(iArr);
        if (lIlIllllllIIII(first2)) {
            return lllIlIlIIlI[1];
        }
        if (lIlIlllllIlllI(this.j.arrowProduct().o(), lllIlIlIIlI[5])) {
            first = Inventory.getFirst(this.u);
            "".length();
            if (" ".length() > "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            int[] iArr2 = new int[lllIlIlIIlI[3]];
            iArr2[lllIlIlIIlI[1]] = lllIlIlIIlI[7];
            first = Inventory.getFirst(iArr2);
        }
        Item item = first;
        if (lIlIllllllIIII(item)) {
            return lllIlIlIIlI[1];
        }
        item.useOn(first2);
        return lllIlIlIIlI[3];
    }
}
