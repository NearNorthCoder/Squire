/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Trade
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Trade;

@TaskDesc(name="Trading")
public class TradingTask
extends Task {
    private static  int[] lIlllllII;

    static {
        be.var1();
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static void var1() {
        lIlllllII = new int[1];
        be.lIlllllII[0] = 1;
    }

    public boolean run() {
        if (be.var2(Trade.isOpen() ? 1 : 0)) {
            if (be.var2(Trade.isSecondScreenOpen() ? 1 : 0)) {
                Trade.acceptSecondScreen();
                return lIlllllII[0];
            }
            List var3 = Inventory.getAll(Item::isTradable);
            if (be.var2(var3.isEmpty() ? 1 : 0)) {
                Trade.acceptFirstScreen();
                return lIlllllII[0];
            }
            Iterator var4 = var3.iterator();
            while (be.var2(var4.hasNext() ? 1 : 0)) {
                Item var5 = (Item)var4.next();
                Trade.offer((int)var5.getId(), (int)var5.getQuantity());
                0;
                if (2 != (53 + 0 - -40 + 85 ^ 162 + 44 - 170 + 146)) continue;
                return ((149 + 64 - 80 + 61 ^ 68 + 23 - 16 + 64) & (73 + 99 - 45 + 109 ^ 5 + 145 - 33 + 48 ^ -1)) != 0;
            }
        }
        return lIlllllII[0];
    }
}

