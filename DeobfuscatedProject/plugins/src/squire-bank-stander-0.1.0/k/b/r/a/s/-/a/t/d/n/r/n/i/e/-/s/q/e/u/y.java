/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Cutting Gems")
public class y
extends a {
    private static /* synthetic */ int[] lllIIIIlIIl;

    private static boolean lIlIllIIIlllII(int n2, int n3) {
        return n2 == n3;
    }

    static {
        y.lIlIllIIIllIlI();
    }

    @Inject
    public y(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.GEM_CUTTING);
    }

    @Override
    public int i() {
        return lllIIIIlIIl[5];
    }

    private static boolean lIlIllIIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean h() {
        y llllllllllllllllIIlIlIlIllIIlIll;
        if (y.lIlIllIIIllIll(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)this.j.cuttingProduct().C());
            this.sleep(this.i());
            return lllIIIIlIIl[1];
        }
        int[] nArray = new int[lllIIIIlIIl[1]];
        nArray[y.lllIIIIlIIl[2]] = llllllllllllllllIIlIlIlIllIIlIll.j.cuttingProduct().z();
        if (y.lIlIllIIIlllII(Inventory.getCount((int[])nArray), lllIIIIlIIl[1]) && y.lIlIllIIIlllIl(llllllllllllllllIIlIlIlIllIIlIll.i.e(), lllIIIIlIIl[3])) {
            int[] nArray2 = new int[lllIIIIlIIl[1]];
            nArray2[y.lllIIIIlIIl[2]] = lllIIIIlIIl[0];
            int[] nArray3 = new int[lllIIIIlIIl[1]];
            nArray3[y.lllIIIIlIIl[2]] = llllllllllllllllIIlIlIlIllIIlIll.j.cuttingProduct().z();
            Inventory.getFirst((int[])nArray2).useOn(Inventory.getFirst((int[])nArray3));
            llllllllllllllllIIlIlIlIllIIlIll.sleep(lllIIIIlIIl[4]);
            return lllIIIIlIIl[1];
        }
        int[] nArray4 = new int[lllIIIIlIIl[1]];
        nArray4[y.lllIIIIlIIl[2]] = lllIIIIlIIl[0];
        int[] nArray5 = new int[lllIIIIlIIl[1]];
        nArray5[y.lllIIIIlIIl[2]] = this.j.cuttingProduct().z();
        Inventory.getFirst((int[])nArray4).useOn(Inventory.getFirst((int[])nArray5));
        this.sleep(lllIIIIlIIl[1]);
        return lllIIIIlIIl[1];
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIIIlIIl[0], lllIIIIlIIl[1], this.j.cuttingProduct().z(), lllIIIIlIIl[1]);
    }

    private static void lIlIllIIIllIlI() {
        lllIIIIlIIl = new int[6];
        y.lllIIIIlIIl[0] = -(0xFFFFFDAD & 0x4273) & (0xFFFFFFFF & 0x46FB);
        y.lllIIIIlIIl[1] = " ".length();
        y.lllIIIIlIIl[2] = (0x6E ^ 0x26) & ~(0x51 ^ 0x19);
        y.lllIIIIlIIl[3] = 0x1A ^ 0x3C ^ (0x8E ^ 0xA2);
        y.lllIIIIlIIl[4] = 0xA0 ^ 0x9C ^ (0x1D ^ 0x24);
        y.lllIIIIlIIl[5] = 77 + 114 - 36 + 41 ^ 95 + 10 - -70 + 17;
    }

    private static boolean lIlIllIIIllIll(int n2) {
        return n2 != 0;
    }
}

