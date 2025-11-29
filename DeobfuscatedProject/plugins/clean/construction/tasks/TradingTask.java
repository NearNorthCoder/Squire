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

    static {
        be.lIlIIlIIIll();
    }

    private static boolean lIlIIlIIlII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (be.lIlIIlIIlII(Trade.isOpen() ? 1 : 0)) {
            if (be.lIlIIlIIlII(Trade.isSecondScreenOpen() ? 1 : 0)) {
                Trade.acceptSecondScreen();
                return lIlllllII[0];
            }
            List lIlllIIlllllIlI = Inventory.getAll(Item::isTradable);
            if (be.lIlIIlIIlII(lIlllIIlllllIlI.isEmpty() ? 1 : 0)) {
                Trade.acceptFirstScreen();
                return lIlllllII[0];
            }
            Iterator lIlllIIlllllIIl = lIlllIIlllllIlI.iterator();
            while (be.lIlIIlIIlII(lIlllIIlllllIIl.hasNext() ? 1 : 0)) {
                Item lIlllIIlllllIII = (Item)lIlllIIlllllIIl.next();
                Trade.offer((int)lIlllIIlllllIII.getId(), (int)lIlllIIlllllIII.getQuantity());

                if (2 != (53 + 0 - -40 + 85 ^ 162 + 44 - 170 + 146)) continue;
                return false;
            }
        }
        return lIlllllII[0];
    }
}

