/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.skilling.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import gg.squire.skilling.tasks.GameEnum7;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Making bolts")
public class MakingBoltsTask
extends SkillingManager {
    
    private final  int[] v;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        G var2;
        g g2 = this.j.bolt();
        int[] nArray = new int[var1[3]];
        nArray[G.var1[1]] = g2.y();
        Item item = Inventory.getFirst((int[])nArray);
        if (G.var3(item)) {
            return var1[1];
        }
        Item var4 = Inventory.getFirst((int[])var2.v);
        if (G.var3(var4)) {
            return var1[1];
        }
        int var5 = var1[1];
        while (G.var6(var5, var1[6])) {
            void var7;
            var4.useOn((Item)var7);
            ++var5;
            0;
            if ((0x2A ^ 0x2E) >= 0) continue;
            return ((0x28 ^ 0x4A) & ~(0x39 ^ 0x5B)) != 0;
        }
        return var1[3];
    }

    private static boolean var3(Object object) {
        return object == null;
    }

    @Inject
    public MakingBoltsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.BOLTS);
        int[] nArray = new int[var1[0]];
        nArray[G.var1[1]] = var1[2];
        nArray[G.var1[3]] = var1[4];
        this.v = nArray;
    }

    static {
        G.var8();
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var1[2], var1[5], this.j.bolt().y(), var1[5]);
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static void var8() {
        var1 = new int[7];
        G.var1[0] = 2;
        G.var1[1] = (0xE0 ^ 0xB1) & ~(0xFA ^ 0xAB);
        G.var1[2] = -(0xFFFFF4A7 & 0x6FDA) & (0xFFFFFDBB & 0x67FF);
        G.var1[3] = 1;
        G.var1[4] = -(0xFFFFEB95 & 0x546B) & (0xFFFFF76A & 0x6FFD);
        G.var1[5] = 0xF5 ^ 0x80 ^ 3 + 33 - -64 + 27;
        G.var1[6] = 0x84 ^ 0x8C;
    }

    @Override
    public int i() {
        return var1[1];
    }
}

