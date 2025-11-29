/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
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
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

/* TASK: Making Arrows -> MakingarrowsTask */
@TaskDesc(name="Making Arrows")
public class F
extends a {
    private static /* synthetic */ int[] lllIlIlIIlI;
    private final /* synthetic */ int[] u;

    @Inject
    public F(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.ARROWS);
        int[] nArray = new int[lllIlIlIIlI[0]];
        nArray[F.lllIlIlIIlI[1]] = lllIlIlIIlI[2];
        nArray[F.lllIlIlIIlI[3]] = lllIlIlIIlI[4];
        this.u = nArray;
    }

    @Override
    public int i() {
        return lllIlIlIIlI[8];
    }

    private static boolean lIlIllllllIIII(Object object) {
        return object == null;
    }

    private static void lIlIlllllIllIl() {
        lllIlIlIIlI = new int[9];
        F.lllIlIlIIlI[0] = 2;
        F.lllIlIlIIlI[1] = 1 & ~1;
        F.lllIlIlIIlI[2] = -(0xFFFFF7CF & 0x6AF5) & (0xFFFFFBFE & 0x67FF);
        F.lllIlIlIIlI[3] = 1;
        F.lllIlIlIIlI[4] = -(0xFFFFC828 & 0x77DF) & (0xFFFFEF6F & 0x77FF);
        F.lllIlIlIIlI[5] = 140 + 50 - 186 + 144 ^ 91 + 153 - 98 + 14;
        F.lllIlIlIIlI[6] = 0x3B ^ 0x34 ^ (0x24 ^ 0x6C) & ~(0x54 ^ 0x1C);
        F.lllIlIlIIlI[7] = 151 + 48 - 78 + 123 ^ 115 + 177 - 203 + 104;
        F.lllIlIlIIlI[8] = 3;
    }

    private static boolean lIlIlllllIllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlllllIlllI(int n2, int n3) {
        return n2 == n3;
    }

    static {
        F.lIlIlllllIllIl();
    }

    @Override
    public Map<Integer, Integer> g() {
        if (F.lIlIlllllIlllI(this.j.arrowProduct().o(), lllIlIlIIlI[5])) {
            return Map.of(lllIlIlIIlI[2], lllIlIlIIlI[6], this.j.arrowProduct().o(), lllIlIlIIlI[6]);
        }
        return Map.of(lllIlIlIIlI[7], lllIlIlIIlI[6], this.j.arrowProduct().o(), lllIlIlIIlI[6]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_1;
        void var2_2;
        Item var1;
        Item item;
        F var2;
        if (F.lIlIlllllIllll(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return lllIlIlIIlI[3];
        }
        int[] nArray = new int[lllIlIlIIlI[3]];
        nArray[F.lllIlIlIIlI[1]] = var2.j.arrowProduct().o();
        Item var3 = Inventory.getFirst((int[])nArray);
        if (F.lIlIllllllIIII(var3)) {
            return lllIlIlIIlI[1];
        }
        if (F.lIlIlllllIlllI(var2.j.arrowProduct().o(), lllIlIlIIlI[5])) {
            item = Inventory.getFirst((int[])var2.u);
            0;
            if (1 > 3) {
                return false;
            }
        } else {
            int[] nArray2 = new int[lllIlIlIIlI[3]];
            nArray2[F.lllIlIlIIlI[1]] = lllIlIlIIlI[7];
            item = Inventory.getFirst((int[])nArray2);
        }
        if (F.lIlIllllllIIII(var1 = item)) {
            return lllIlIlIIlI[1];
        }
        var2_2.useOn((Item)var1_1);
        return lllIlIlIIlI[3];
    }
}

