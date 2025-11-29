/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package gg.squire.cleaner.tasks;

import com.google.inject.Inject;
import gg.squire.cleaner.SquireAccountCleanerConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Item;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

@TaskDesc(name="Selling")
public class SellingTask
extends Task {
    
    private final  SquireAccountCleanerConfig e;

    public boolean run() {
        if (b.lIIlIIIlIIIIlI(Bank.isOpen() ? 1 : 0) && b.lIIlIIIlIIIIll(Inventory.isFull() ? 1 : 0)) {
            return lIlIlIIIlIl[0];
        }
        if (b.lIIlIIIlIIIIll(Inventory.contains(item -> {
            boolean bl;
            if (b.lIIlIIIlIIIlIl(item.getId(), lIlIlIIIlIl[3])) {
                bl = lIlIlIIIlIl[1];

                }
            } else {
                bl = lIlIlIIIlIl[0];
            }
            return bl;
        }) ? 1 : 0)) {
            return lIlIlIIIlIl[0];
        }
        if (b.lIIlIIIlIIIIlI(Inventory.isFull() ? 1 : 0) && b.lIIlIIIlIIIIlI(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
        }
        if (b.lIIlIIIlIIIIll(GrandExchange.isOpen() ? 1 : 0)) {
            GrandExchange.open();
        }
        if (b.lIIlIIIlIIIIlI(GrandExchange.canCollect() ? 1 : 0) && b.lIIlIIIlIIIIll(GrandExchange.getEmptySlots())) {
            GrandExchange.collect((boolean)lIlIlIIIlIl[1]);
            return lIlIlIIIlIl[0];
        }
        List var1 = Inventory.getAll(item -> {
            boolean bl;
            if (b.lIIlIIIlIIIlIl(item.getId(), lIlIlIIIlIl[3])) {
                bl = lIlIlIIIlIl[1];

                if (3 == 0) {
                    return false;
                }
            } else {
                bl = lIlIlIIIlIl[0];
            }
            return bl;
        });
        int var2 = lIlIlIIIlIl[0];
        Iterator var3 = var1.iterator();
        while (b.lIIlIIIlIIIIlI(var3.hasNext() ? 1 : 0)) {
            Item var4 = (Item)var3.next();
            if (b.lIIlIIIlIIIlII(var2, lIlIlIIIlIl[2])) {

                if (1 >= 0) break;
                return ((0xD6 ^ 0x91 ^ (0xDB ^ 0x84)) & (67 + 116 - 108 + 77 ^ 19 + 70 - 85 + 124 ^ -1)) != 0;
            }
            ++var2;
            if (b.lIIlIIIlIIIIll(GrandExchange.isSelling() ? 1 : 0)) {
                int[] nArray = new int[lIlIlIIIlIl[1]];
                nArray[b.lIlIlIIIlIl[0]] = var4.getId();
                GrandExchange.sell((int[])nArray);

                if (((0x84 ^ 0xAF ^ (0x85 ^ 0x9A)) & (0x64 ^ 0x1C ^ (0xCA ^ 0x86) ^ -1)) == 0) break;
                return false;
            }
            if (b.lIIlIIIlIIIIlI(GrandExchange.isSelling() ? 1 : 0)) {
                b var5;
                int var6 = (int)((double)Prices.getItemPrice((int)var4.getId()) * 0.01 * (double)var5.e.sellPercent());
                int var7 = Prices.getItemPrice((int)var4.getId()) - var6;
                GrandExchange.setPrice((int)var7);
                GrandExchange.confirm();

                if (((73 + 59 - 80 + 115 ^ 149 + 49 - 154 + 129) & (142 + 45 - 136 + 131 ^ 171 + 36 - 106 + 87 ^ -1)) == 0) break;
                return ((0x90 ^ 0x9F ^ (0x88 ^ 0xC5)) & (0xB8 ^ 0xB7 ^ (0x39 ^ 0x74) ^ -1)) != 0;
            }

            if (-1 >= -1) continue;
            return false;
        }
        return lIlIlIIIlIl[1];
    }

    private static boolean lIIlIIIlIIIIll(int n) {
        return n == 0;
    }

    @Inject
    public SellingTask(SquireAccountCleanerConfig squireAccountCleanerConfig) {
        this.e = squireAccountCleanerConfig;
    }

    private int SellingTask(Item item) {
        String string = Static.getClient().getItemDefinition(item.getId()).getName().toLowerCase();
        int n = Prices.getItemPrice((int)item.getId()) * item.getQuantity();
        return n;
    }

    private static boolean lIIlIIIlIIIlII(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlIIIlIIIlIl(int n, int n2) {
        return n != n2;
    }

    static {
        b.lIIlIIIlIIIIIl();
    }

    private static boolean lIIlIIIlIIIIlI(int n) {
        return n != 0;
    }

}

