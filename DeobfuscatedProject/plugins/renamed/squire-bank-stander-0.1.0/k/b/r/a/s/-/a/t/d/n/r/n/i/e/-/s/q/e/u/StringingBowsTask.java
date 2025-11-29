/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Production
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a_Unknown;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.BEnum;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

/* TASK: Stringing bows -> StringingbowsTask */
@TaskDesc(name="Stringing bows", register=true)
public class StringingBowsTask
extends a_Unknown {
    private static /* synthetic */ int[] lllIIllllIl;

    @Inject
    public J(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.STRING_BOWS);
    }

    @Override
    public int i() {
        return lllIIllllIl[3];
    }

    private static boolean lIlIlllIllIIIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIlllIllIIII() {
        lllIIllllIl = new int[4];
        J.lllIIllllIl[0] = 1;
        J.lllIIllllIl[1] = 0xFFFFDFF9 & 0x26F7;
        J.lllIIllllIl[2] = (0xC0 ^ 0x86 ^ (0xEC ^ 0x9D)) & (131 + 44 - 160 + 137 ^ 95 + 65 - 106 + 121 ^ -1);
        J.lllIIllllIl[3] = 0x36 ^ 0x22 ^ (0x21 ^ 0x31);
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.stringableBow().z(), lllIIllllIl[0], lllIIllllIl[1], lllIIllllIl[0]);
    }

    static {
        J.lIlIlllIllIIII();
    }

    @Override
    public boolean h() {
        if (J.lIlIlllIllIIIl(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return lllIIllllIl[0];
        }
        int[] nArray = new int[lllIIllllIl[0]];
        nArray[J.lllIIllllIl[2]] = this.j.stringableBow().z();
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[lllIIllllIl[0]];
        nArray2[J.lllIIllllIl[2]] = lllIIllllIl[1];
        item.useOn(Inventory.getFirst((int[])nArray2));
        return lllIIllllIl[0];
    }
}

