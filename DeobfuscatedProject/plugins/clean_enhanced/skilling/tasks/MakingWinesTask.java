/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.entities.Players
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Making wines")
public class MakingWinesTask
extends SkillingManager {

    private static boolean var2(int n2, int n3) {
        return n2 == n3;
    }

    static {
        w.var3();
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean h() {
        if (w.var2(Players.getLocal().getAnimation(), var1[3])) {
            return var1[4];
        }
        if (w.var4(Production.isOpen() ? 1 : 0)) {
            w var5;
            Production.choosePreviousOption();
            var5.sleep(var5.i());
            return var1[1];
        }
        int[] nArray = new int[var1[1]];
        nArray[w.var1[4]] = var1[0];
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[var1[1]];
        nArray2[w.var1[4]] = var1[2];
        Item item2 = Inventory.getFirst((int[])nArray2);
        item.useOn(item2);
        return var1[1];
    }

    @Override
    public int i() {
        return var1[5];
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(var1[0], var1[1], var1[2], var1[1]);
    }

    @Inject
    public MakingWinesTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.WINES);
    }

    private static void var3() {
        var1 = new int[6];
        w.var1[0] = -(0xFFFFE7BF & 0x784D) & (0xFFFFF7EF & 0x6FDF);
        w.var1[1] = 1;
        w.var1[2] = -(0xFFFFF59B & 0x5A6D) & (0xFFFFDFBD & 0x77DB);
        w.var1[3] = -(0xFFFFCA77 & 0x379F) & (0xFFFFFF7F & 0x1FFF);
        w.var1[4] = (234 + 133 - 352 + 230 ^ 98 + 67 - 109 + 122) & (0x36 ^ 0x64 ^ (0x89 ^ 0x9C) ^ -1);
        w.var1[5] = 3;
    }
}

