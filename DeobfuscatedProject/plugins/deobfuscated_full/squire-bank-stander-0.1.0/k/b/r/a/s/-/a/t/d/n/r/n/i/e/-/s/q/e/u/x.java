/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

/* TASK: Making battlestaves -> MakingbattlestavesTask */
@TaskDesc(name="Making battlestaves")
public class x
extends a {
    private static /* synthetic */ int[] lllIIlIIlII;

    @Override
    public boolean h() {
        if (x.lIlIllIlllIlII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return lllIIlIIlII[1];
        }
        int[] nArray = new int[lllIIlIIlII[1]];
        nArray[x.lllIIlIIlII[2]] = lllIIlIIlII[0];
        int[] nArray2 = new int[lllIIlIIlII[1]];
        nArray2[x.lllIIlIIlII[2]] = this.j.battlestaff().x();
        Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        return lllIIlIIlII[1];
    }

    private static boolean lIlIllIlllIlII(int n2) {
        return n2 != 0;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIlIIlII[0], lllIIlIIlII[1], this.j.battlestaff().x(), lllIIlIIlII[1]);
    }

    static {
        x.lIlIllIlllIIll();
    }

    private static void lIlIllIlllIIll() {
        lllIIlIIlII = new int[4];
        x.lllIIlIIlII[0] = 0xFFFFAF7F & 0x55EF;
        x.lllIIlIIlII[1] = 1;
        x.lllIIlIIlII[2] = (144 + 37 - 111 + 78 ^ 168 + 2 - 136 + 153) & (0x66 ^ 0x10 ^ (0xD2 ^ 0x8B) ^ -1);
        x.lllIIlIIlII[3] = 3;
    }

    @Inject
    public x(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.BATTLESTAVES);
    }

    @Override
    public int i() {
        return lllIIlIIlII[3];
    }
}

