package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Glass Make")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.B  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/B.class */
public class B extends AbstractC0000a {
    private static /* synthetic */ int[] lllIIIIIlIl;

    @Inject
    public B(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.GLASS_MAKE);
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(this.j.seaweed().N()), Integer.valueOf(this.j.seaweed().O()), Integer.valueOf(lllIIIIIlIl[0]), Integer.valueOf(this.j.seaweed().P()));
    }

    private static boolean lIlIllIIIlIlIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        if (lIlIllIIIlIlII(this.i.d() ? 1 : 0)) {
            return lllIIIIIlIl[1];
        }
        int[] iArr = new int[lllIIIIIlIl[2]];
        iArr[lllIIIIIlIl[1]] = lllIIIIIlIl[3];
        if (lIlIllIIIlIlII(Inventory.contains(iArr) ? 1 : 0)) {
            Bank.open();
            "".length();
            return lllIIIIIlIl[2];
        } else if (lIlIllIIIlIlII(Magic.canCast(SpellBook.Lunar.SUPERGLASS_MAKE) ? 1 : 0) && lIlIllIIIlIlIl(Bank.isOpen() ? 1 : 0)) {
            Magic.cast(SpellBook.Lunar.SUPERGLASS_MAKE);
            sleep(i());
            return lllIIIIIlIl[2];
        } else {
            Bank.open();
            "".length();
            return lllIIIIIlIl[2];
        }
    }

    static {
        lIlIllIIIlIIll();
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIIIIIlIl[4];
    }

    private static void lIlIllIIIlIIll() {
        lllIIIIIlIl = new int[5];
        lllIIIIIlIl[0] = (-28929) & 30711;
        lllIIIIIlIl[1] = (199 ^ 137) & ((192 ^ 142) ^ (-1));
        lllIIIIIlIl[2] = " ".length();
        lllIIIIIlIl[3] = (-((-4349) & 23037)) & (-12289) & 32751;
        lllIIIIIlIl[4] = "   ".length();
    }

    private static boolean lIlIllIIIlIlII(int i) {
        return i != 0;
    }
}
