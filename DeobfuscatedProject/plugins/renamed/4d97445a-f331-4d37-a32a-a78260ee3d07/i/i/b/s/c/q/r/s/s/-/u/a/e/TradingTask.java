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
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Trade;

/* TASK: Trading -> TradingTask */
@TaskDesc(name="Trading")
public class TradingTask
extends Task {
    private static /* synthetic */ int[] lIlllllII;

    static {
        be.lIlIIlIIIll();
    }

    private static boolean lIlIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static void lIlIIlIIIll() {
        lIlllllII = new int[1];
        be.lIlllllII[0] = 1;
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
                0;
                if (2 != (53 + 0 - -40 + 85 ^ 162 + 44 - 170 + 146)) continue;
                return false;
            }
        }
        return lIlllllII[0];
    }
}

