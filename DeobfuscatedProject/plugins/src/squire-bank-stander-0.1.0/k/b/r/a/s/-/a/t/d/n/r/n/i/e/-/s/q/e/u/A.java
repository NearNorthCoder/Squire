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

@TaskDesc(name="Blowing glass")
public class A
extends a {
    private static /* synthetic */ int[] lllIIlllIIl;

    private static boolean lIlIlllIlIlIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlllIIl[0], lllIIlllIIl[1], lllIIlllIIl[2], lllIIlllIIl[1]);
    }

    static {
        A.lIlIlllIlIlIII();
    }

    @Override
    public int i() {
        return lllIIlllIIl[4];
    }

    @Inject
    public A(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.GLASS_BLOWING);
    }

    @Override
    public boolean h() {
        if (A.lIlIlllIlIlIIl(Production.isOpen() ? 1 : 0)) {
            Production.chooseOption((int)this.j.glassProduct().C());
            this.sleep(this.i());
            return lllIIlllIIl[1];
        }
        int[] nArray = new int[lllIIlllIIl[1]];
        nArray[A.lllIIlllIIl[3]] = lllIIlllIIl[0];
        int[] nArray2 = new int[lllIIlllIIl[1]];
        nArray2[A.lllIIlllIIl[3]] = lllIIlllIIl[2];
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        return lllIIlllIIl[1];
    }

    private static void lIlIlllIlIlIII() {
        lllIIlllIIl = new int[5];
        A.lllIIlllIIl[0] = -(0xFFFFFD5B & 0x4AA7) & (0xFFFFEEFF & 0x5FFB);
        A.lllIIlllIIl[1] = " ".length();
        A.lllIIlllIIl[2] = -(0xFFFFFD59 & 0x7BA7) & (0xFFFFFFEF & Short.MAX_VALUE);
        A.lllIIlllIIl[3] = (0x10 ^ 1 ^ (0xDD ^ 0x81)) & (0x71 ^ 0x21 ^ (0x39 ^ 0x24) ^ -" ".length());
        A.lllIIlllIIl[4] = 9 ^ 0xD;
    }
}

