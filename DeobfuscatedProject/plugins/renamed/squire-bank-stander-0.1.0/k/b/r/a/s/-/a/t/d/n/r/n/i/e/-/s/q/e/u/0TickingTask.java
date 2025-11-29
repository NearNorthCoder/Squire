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
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.a_Unknown;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.BEnum;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.SEnum;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

/* TASK: 0 Ticking -> 0TickingTask */
@TaskDesc(name="0 Ticking")
public class 0TickingTask
extends a_Unknown {
    private static /* synthetic */ int[] lllIIIlIlIl;

    private static boolean lIlIllIlIIIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean U() {
        void var2_2;
        void var1_1;
        if (N.lIlIllIlIIIlII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return lllIIIlIlIl[6];
        }
        int[] nArray = new int[lllIIIlIlIl[6]];
        nArray[N.lllIIIlIlIl[5]] = lllIIIlIlIl[3];
        Item var5 = Inventory.getFirst((int[])nArray);
        if (N.lIlIllIlIIIIll(var5)) {
            return lllIIIlIlIl[5];
        }
        int[] nArray2 = new int[lllIIIlIlIl[6]];
        nArray2[N.lllIIIlIlIl[5]] = lllIIIlIlIl[4];
        Item var3 = Inventory.getFirst((int[])nArray2);
        if (N.lIlIllIlIIIIll(var3)) {
            return lllIIIlIlIl[5];
        }
        var1_1.useOn((Item)var2_2);
        return lllIIIlIlIl[6];
    }

    @Override
    public int i() {
        int n2;
        if (N.lIlIllIIlllllI((Object)this.j.zeroTickProduct(), (Object)s.COMPOST)) {
            n2 = lllIIIlIlIl[7];
            0;
            
            }
        } else {
            n2 = lllIIIlIlIl[5];
        }
        return n2;
    }

    @Override
    public boolean h() {
        N var1;
        if (N.lIlIllIIllllll((Object)this.j.activity(), (Object)b.ZERO_TICK)) {
            return lllIIIlIlIl[5];
        }
        if (N.lIlIllIIlllllI((Object)var1.j.zeroTickProduct(), (Object)s.COMPOST)) {
            return var1.U();
        }
        if (N.lIlIllIlIIIIII(Inventory.getFreeSlots(), lllIIIlIlIl[1])) {
            return lllIIIlIlIl[5];
        }
        int var4 = lllIIIlIlIl[5];
        while (N.lIlIllIlIIIIIl(var4, lllIIIlIlIl[1])) {
            Item var2 = Inventory.getItem((int)var4);
            if (N.lIlIllIlIIIIlI(var2)) {
                if (N.lIlIllIlIIIIll(Inventory.getItem((int)(var4 + lllIIIlIlIl[1])))) {
                    0;
                    if (3 > 0) break;
                    return ((0x4C ^ 0x5B ^ (0x2F ^ 0x3C)) & (2 ^ 0x41 ^ (0x3B ^ 0x7C) ^ -1)) != 0;
                }
                var2.useOn(Inventory.getItem((int)(var4 + lllIIIlIlIl[1])));
            }
            ++var4;
            0;
            if (((0x21 ^ 0x17 ^ (0xB5 ^ 0x9D)) & (0xF1 ^ 0x86 ^ (0xC0 ^ 0xA9) ^ -1)) == 0) continue;
            return ((0x6C ^ 0x3F ^ (0x56 ^ 0x65)) & (228 + 155 - 199 + 55 ^ 65 + 22 - 50 + 106 ^ -1)) != 0;
        }
        return lllIIIlIlIl[6];
    }

    private static boolean lIlIllIIlllllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public Map<Integer, Integer> g() {
        if (N.lIlIllIIlllllI((Object)this.j.zeroTickProduct(), (Object)s.SERUMS)) {
            return Map.of(lllIIIlIlIl[0], lllIIIlIlIl[1], lllIIIlIlIl[2], lllIIIlIlIl[1]);
        }
        return Map.of(lllIIIlIlIl[3], lllIIIlIlIl[1], lllIIIlIlIl[4], lllIIIlIlIl[1]);
    }

    private static boolean lIlIllIIllllll(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public N(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.ZERO_TICK);
    }

    private static boolean lIlIllIlIIIlII(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIIllllIl() {
        lllIIIlIlIl = new int[8];
        N.lllIIIlIlIl[0] = -(0xFFFFFFBD & 0x6DC6) & (0xFFFFEFFB & 0x7FD7);
        N.lllIIIlIlIl[1] = 30 + 122 - 110 + 108 ^ 18 + 58 - 9 + 85;
        N.lllIIIlIlIl[2] = 0x26 ^ 0x79;
        N.lllIIIlIlIl[3] = 0xFFFFB7D7 & 0x5FB8;
        N.lllIIIlIlIl[4] = 0xFFFFB5FD & 0x7E6F;
        N.lllIIIlIlIl[5] = (0x65 ^ 0x79) & ~(0x33 ^ 0x2F);
        N.lllIIIlIlIl[6] = 1;
        N.lllIIIlIlIl[7] = 0x9F ^ 0x9B;
    }

    private static boolean lIlIllIlIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        N.lIlIllIIllllIl();
    }

    private static boolean lIlIllIlIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIlIIIIlI(Object object) {
        return object != null;
    }
}

