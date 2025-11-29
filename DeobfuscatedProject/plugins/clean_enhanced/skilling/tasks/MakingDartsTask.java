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
import gg.squire.skilling.tasks.GameEnum8;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Making darts")
public class MakingDartsTask
extends SkillingManager {
    private final  int[] w;

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var1[2], var1[5], this.j.dart().D(), var1[5]);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean h() {
        I var3;
        j j2 = this.j.dart();
        int[] nArray = new int[var1[3]];
        nArray[I.var1[1]] = j2.D();
        Item item = Inventory.getFirst((int[])nArray);
        if (I.var4(item)) {
            return var1[1];
        }
        Item var5 = Inventory.getFirst((int[])var3.w);
        if (I.var4(var5)) {
            return var1[1];
        }
        int var6 = var1[1];
        while (I.var2(var6, var1[6])) {
            void var7;
            var5.useOn((Item)var7);
            ++var6;
            0;
            
            return ((0xCD ^ 0x83) & ~(0x66 ^ 0x28)) != 0;
        }
        return var1[3];
    }

    static {
        I.var8();
    }

    private static void var8() {
        var1 = new int[7];
        I.var1[0] = 2;
        I.var1[1] = (0x12 ^ 0x59 ^ (0x42 ^ 0x37)) & (1 + 151 - 25 + 33 ^ 97 + 94 - 91 + 58 ^ -1);
        I.var1[2] = -(0xFFFFCCF7 & 0x7309) & (0xFFFFC1BF & 0x7F7A);
        I.var1[3] = 1;
        I.var1[4] = 0xFFFFF76A & 0x2FFD;
        I.var1[5] = 0x2E ^ 0x24;
        I.var1[6] = 0x2A ^ 0x22;
    }

    @Inject
    public MakingDartsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.DARTS);
        int[] nArray = new int[var1[0]];
        nArray[I.var1[1]] = var1[2];
        nArray[I.var1[3]] = var1[4];
        this.w = nArray;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    @Override
    public int i() {
        return var1[1];
    }
}

