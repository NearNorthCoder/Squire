package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
@TaskDesc(name = "Enchanting")
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.M  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/M.class */
public class M extends AbstractC0000a {
    private static /* synthetic */ int[] lllIlIIIIIl;

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public int i() {
        return lllIlIIIIIl[0];
    }

    @Inject
    public M(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, EnumC0001b.ENCHANTING);
    }

    private static void lIlIlllIlllIII() {
        lllIlIIIIIl = new int[3];
        lllIlIIIIIl[0] = " ".length();
        lllIlIIIIIl[1] = (-((-21533) & 30047)) & (-5257) & 14334;
        lllIlIIIIIl[2] = (13 ^ 89) & ((70 ^ 18) ^ (-1));
    }

    static {
        lIlIlllIlllIII();
    }

    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public Map<Integer, Integer> g() {
        return Map.of(Integer.valueOf(this.j.enchantingProduct().z()), Integer.valueOf(lllIlIIIIIl[0]), Integer.valueOf(lllIlIIIIIl[1]), Integer.valueOf(lllIlIIIIIl[0]));
    }

    private static boolean lIlIlllIlllIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    @Override // k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u.AbstractC0000a
    public boolean h() {
        int[] iArr = new int[lllIlIIIIIl[0]];
        iArr[lllIlIIIIIl[2]] = this.j.enchantingProduct().z();
        Item first = Inventory.getFirst(iArr);
        int[] iArr2 = new int[lllIlIIIIIl[0]];
        iArr2[lllIlIIIIIl[2]] = lllIlIIIIIl[1];
        Item first2 = Inventory.getFirst(iArr2);
        if (!lIlIlllIlllIIl(first) || lIlIlllIlllIlI(first2)) {
            return lllIlIIIIIl[2];
        }
        Spell F = this.j.enchantingProduct().F();
        int[] iArr3 = new int[lllIlIIIIIl[0]];
        iArr3[lllIlIIIIIl[2]] = this.j.enchantingProduct().z();
        Magic.cast(F, Inventory.getFirst(iArr3));
        return lllIlIIIIIl[0];
    }

    private static boolean lIlIlllIlllIlI(Object obj) {
        return obj == null;
    }
}
