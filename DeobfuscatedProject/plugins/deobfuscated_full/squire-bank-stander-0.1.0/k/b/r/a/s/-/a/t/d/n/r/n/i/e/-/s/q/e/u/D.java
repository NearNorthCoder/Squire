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

/* TASK: Making Armour -> MakingarmourTask */
@TaskDesc(name="Making Armour")
public class D
extends a {
    private static /* synthetic */ int[] lllIIIIllll;

    static {
        D.lIlIllIIlIllll();
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIIIllll[0], lllIIIIllll[1], this.j.armourProduct().l(), this.j.armourProduct().n());
    }

    @Override
    public boolean h() {
        if (D.lIlIllIIllIIII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return lllIIIIllll[1];
        }
        int[] nArray = new int[lllIIIIllll[1]];
        nArray[D.lllIIIIllll[2]] = this.j.armourProduct().l();
        int[] nArray2 = new int[lllIIIIllll[1]];
        nArray2[D.lllIIIIllll[2]] = lllIIIIllll[0];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        return lllIIIIllll[1];
    }

    @Override
    public int i() {
        return lllIIIIllll[3];
    }

    private static void lIlIllIIlIllll() {
        lllIIIIllll = new int[4];
        D.lllIIIIllll[0] = -(0xFFFF9143 & 0x7FBF) & (0xFFFFF7DF & 0x1FE7);
        D.lllIIIIllll[1] = 1;
        D.lllIIIIllll[2] = (0xC8 ^ 0x9F) & ~(0xC2 ^ 0x95);
        D.lllIIIIllll[3] = 0xEC ^ 0xA6 ^ (0x5E ^ 0x10);
    }

    @Inject
    public D(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.ARMOUR);
    }

    private static boolean lIlIllIIllIIII(int n2) {
        return n2 != 0;
    }
}

