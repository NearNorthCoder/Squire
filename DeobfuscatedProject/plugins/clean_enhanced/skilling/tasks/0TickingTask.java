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
package gg.squire.skilling.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import gg.squire.skilling.tasks.GameEnum9;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="0 Ticking")
public class 0TickingTask
extends SkillingManager {

    private static boolean var2(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private boolean U() {
        void var2_2;
        void var1_1;
        if (N.var3(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return var1[6];
        }
        int[] nArray = new int[var1[6]];
        nArray[N.var1[5]] = var1[3];
        Item var4 = Inventory.getFirst((int[])nArray);
        if (N.var2(var4)) {
            return var1[5];
        }
        int[] nArray2 = new int[var1[6]];
        nArray2[N.var1[5]] = var1[4];
        Item var5 = Inventory.getFirst((int[])nArray2);
        if (N.var2(var5)) {
            return var1[5];
        }
        var1_1.useOn((Item)var2_2);
        return var1[6];
    }

    @Override
    public int i() {
        int n2;
        if (N.var6((Object)this.j.zeroTickProduct(), (Object)s.COMPOST)) {
            n2 = var1[7];
            0;
            if null != null {
                return (0x4A ^ 0x78) & ~(0x79 ^ 0x4B);
            }
        } else {
            n2 = var1[5];
        }
        return n2;
    }

    @Override
    public boolean h() {
        N var7;
        if (N.var8((Object)this.j.activity(), (Object)b.ZERO_TICK)) {
            return var1[5];
        }
        if (N.var6((Object)var7.j.zeroTickProduct(), (Object)s.COMPOST)) {
            return var7.U();
        }
        if (N.var9(Inventory.getFreeSlots(), var1[1])) {
            return var1[5];
        }
        int var10 = var1[5];
        while (N.var11(var10, var1[1])) {
            Item var12 = Inventory.getItem((int)var10);
            if (N.var13(var12)) {
                if (N.var2(Inventory.getItem((int)(var10 + var1[1])))) {
                    0;
                    if (3 > 0) break;
                    return ((0x4C ^ 0x5B ^ (0x2F ^ 0x3C)) & (2 ^ 0x41 ^ (0x3B ^ 0x7C) ^ -1)) != 0;
                }
                var12.useOn(Inventory.getItem((int)(var10 + var1[1])));
            }
            ++var10;
            0;
            if (((0x21 ^ 0x17 ^ (0xB5 ^ 0x9D)) & (0xF1 ^ 0x86 ^ (0xC0 ^ 0xA9) ^ -1)) == 0) continue;
            return ((0x6C ^ 0x3F ^ (0x56 ^ 0x65)) & (228 + 155 - 199 + 55 ^ 65 + 22 - 50 + 106 ^ -1)) != 0;
        }
        return var1[6];
    }

    private static boolean var6(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public Map<Integer, Integer> g() {
        if (N.var6((Object)this.j.zeroTickProduct(), (Object)s.SERUMS)) {
            return Map.of(var1[0], var1[1], var1[2], var1[1]);
        }
        return Map.of(var1[3], var1[1], var1[4], var1[1]);
    }

    private static boolean var8(Object object, Object object2) {
        return object != object2;
    }

    @Inject
    public 0TickingTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.ZERO_TICK);
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static void var14() {
        var1 = new int[8];
        N.var1[0] = -(0xFFFFFFBD & 0x6DC6) & (0xFFFFEFFB & 0x7FD7);
        N.var1[1] = 30 + 122 - 110 + 108 ^ 18 + 58 - 9 + 85;
        N.var1[2] = 0x26 ^ 0x79;
        N.var1[3] = 0xFFFFB7D7 & 0x5FB8;
        N.var1[4] = 0xFFFFB5FD & 0x7E6F;
        N.var1[5] = (0x65 ^ 0x79) & ~(0x33 ^ 0x2F);
        N.var1[6] = 1;
        N.var1[7] = 0x9F ^ 0x9B;
    }

    private static boolean var9(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        N.var14();
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var13(Object object) {
        return object != null;
    }
}

