/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.j;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/* TASK: Making darts -> MakingdartsTask */
@TaskDesc(name="Making darts")
public class I
extends a {
    private final /* synthetic */ int[] w;
    private static /* synthetic */ int[] lllIIIlIlll;

    private static boolean lIlIllIlIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(lllIIIlIlll[2], lllIIIlIlll[5], this.j.dart().D(), lllIIIlIlll[5]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        I var4;
        j j2 = this.j.dart();
        int[] nArray = new int[lllIIIlIlll[3]];
        nArray[I.lllIIIlIlll[1]] = j2.D();
        Item item = Inventory.getFirst((int[])nArray);
        if (I.lIlIllIlIIIllI(item)) {
            return lllIIIlIlll[1];
        }
        Item var3 = Inventory.getFirst((int[])var4.w);
        if (I.lIlIllIlIIIllI(var3)) {
            return lllIIIlIlll[1];
        }
        int var1 = lllIIIlIlll[1];
        while (I.lIlIllIlIIIlll(var1, lllIIIlIlll[6])) {
            void var2;
            var3.useOn((Item)var2);
            ++var1;
            0;
            if (((0x2A ^ 0x3A) & ~(0x8E ^ 0x9E)) >= 0) continue;
            return false;
        }
        return lllIIIlIlll[3];
    }

    static {
        I.lIlIllIlIIIlIl();
    }

    private static void lIlIllIlIIIlIl() {
        lllIIIlIlll = new int[7];
        I.lllIIIlIlll[0] = 2;
        I.lllIIIlIlll[1] = (0x12 ^ 0x59 ^ (0x42 ^ 0x37)) & (1 + 151 - 25 + 33 ^ 97 + 94 - 91 + 58 ^ -1);
        I.lllIIIlIlll[2] = -(0xFFFFCCF7 & 0x7309) & (0xFFFFC1BF & 0x7F7A);
        I.lllIIIlIlll[3] = 1;
        I.lllIIIlIlll[4] = 0xFFFFF76A & 0x2FFD;
        I.lllIIIlIlll[5] = 0x2E ^ 0x24;
        I.lllIIIlIlll[6] = 0x2A ^ 0x22;
    }

    @Inject
    public I(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.DARTS);
        int[] nArray = new int[lllIIIlIlll[0]];
        nArray[I.lllIIIlIlll[1]] = lllIIIlIlll[2];
        nArray[I.lllIIIlIlll[3]] = lllIIIlIlll[4];
        this.w = nArray;
    }

    private static boolean lIlIllIlIIIllI(Object object) {
        return object == null;
    }

    @Override
    public int i() {
        return lllIIIlIlll[1];
    }
}

