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
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Making Arrows")
public class MakingArrowsTask
extends SkillingManager {
    
    private final  int[] u;

    @Inject
    public MakingArrowsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.ARROWS);
        int[] nArray = new int[var1[0]];
        nArray[F.var1[1]] = var1[2];
        nArray[F.var1[3]] = var1[4];
        this.u = nArray;
    }

    @Override
    public int i() {
        return var1[8];
    }

    private static boolean var2(Object object) {
        return object == null;
    }

    private static void var3() {
        var1 = new int[9];
        F.var1[0] = 2;
        F.var1[1] = 1 & ~1;
        F.var1[2] = -(0xFFFFF7CF & 0x6AF5) & (0xFFFFFBFE & 0x67FF);
        F.var1[3] = 1;
        F.var1[4] = -(0xFFFFC828 & 0x77DF) & (0xFFFFEF6F & 0x77FF);
        F.var1[5] = 140 + 50 - 186 + 144 ^ 91 + 153 - 98 + 14;
        F.var1[6] = 0x3B ^ 0x34 ^ (0x24 ^ 0x6C) & ~(0x54 ^ 0x1C);
        F.var1[7] = 151 + 48 - 78 + 123 ^ 115 + 177 - 203 + 104;
        F.var1[8] = 3;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    static {
        F.var3();
    }

    @Override
    public Map<Integer, Integer> g() {
        if (F.var5(this.j.arrowProduct().o(), var1[5])) {
            return Map.of(var1[2], var1[6], this.j.arrowProduct().o(), var1[6]);
        }
        return Map.of(var1[7], var1[6], this.j.arrowProduct().o(), var1[6]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        void var1_1;
        void var2_2;
        Item var6;
        Item item;
        F var7;
        if (F.var4(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return var1[3];
        }
        int[] nArray = new int[var1[3]];
        nArray[F.var1[1]] = var7.j.arrowProduct().o();
        Item var8 = Inventory.getFirst((int[])nArray);
        if (F.var2(var8)) {
            return var1[1];
        }
        if (F.var5(var7.j.arrowProduct().o(), var1[5])) {
            item = Inventory.getFirst((int[])var7.u);
            0;
            if (1 > 3) {
                return ((0x4E ^ 0x1B) & ~(0x34 ^ 0x61)) != 0;
            }
        } else {
            int[] nArray2 = new int[var1[3]];
            nArray2[F.var1[1]] = var1[7];
            item = Inventory.getFirst((int[])nArray2);
        }
        if (F.var2(var6 = item)) {
            return var1[1];
        }
        var2_2.useOn((Item)var1_1);
        return var1[3];
    }
}

