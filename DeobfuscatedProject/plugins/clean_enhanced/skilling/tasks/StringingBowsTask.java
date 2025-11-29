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
package gg.squire.skilling.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import gg.squire.plugins.skilling.SquireBankStander;
import java.util.Map;
import javax.inject.Inject;
import gg.squire.skilling.tasks.SkillingManager;
import gg.squire.skilling.tasks.GameEnum4;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Production;

@TaskDesc(name="Stringing bows", register=true)
public class StringingBowsTask
extends SkillingManager {

    @Inject
    public StringingBowsTask(SquireBankStander squireBankStander, BankStanderConfig bankStanderConfig) {
        super(squireBankStander, bankStanderConfig, b.STRING_BOWS);
    }

    @Override
    public int i() {
        return var1[3];
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static void var3() {
        var1 = new int[4];
        J.var1[0] = 1;
        J.var1[1] = 0xFFFFDFF9 & 0x26F7;
        J.var1[2] = (0xC0 ^ 0x86 ^ (0xEC ^ 0x9D)) & (131 + 44 - 160 + 137 ^ 95 + 65 - 106 + 121 ^ -1);
        J.var1[3] = 0x36 ^ 0x22 ^ (0x21 ^ 0x31);
    }

    @Override
    public Map<Integer, Integer> g() {
        return Map.of(this.j.stringableBow().z(), var1[0], var1[1], var1[0]);
    }

    static {
        J.var3();
    }

    @Override
    public boolean h() {
        if (J.var2(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            this.sleep(this.i());
            return var1[0];
        }
        int[] nArray = new int[var1[0]];
        nArray[J.var1[2]] = this.j.stringableBow().z();
        Item item = Inventory.getFirst((int[])nArray);
        int[] nArray2 = new int[var1[0]];
        nArray2[J.var1[2]] = var1[1];
        item.useOn(Inventory.getFirst((int[])nArray2));
        return var1[0];
    }
}

