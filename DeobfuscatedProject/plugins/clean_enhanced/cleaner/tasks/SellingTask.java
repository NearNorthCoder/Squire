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
        if (b.var2(Bank.isOpen() ? 1 : 0) && b.var3(Inventory.isFull() ? 1 : 0)) {
            return var1[0];
        }
        if (b.var3(Inventory.contains(item -> {
            boolean bl;
            if (b.var4(item.getId(), var1[3])) {
                bl = var1[1];
                0;
                if null != null {
                    return ((24 + 68 - 48 + 117 ^ 152 + 176 - 207 + 71) & (0xC6 ^ 0xA8 ^ (0xC9 ^ 0xC6) ^ -1)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        }) ? 1 : 0)) {
            return var1[0];
        }
        if (b.var2(Inventory.isFull() ? 1 : 0) && b.var2(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
        }
        if (b.var3(GrandExchange.isOpen() ? 1 : 0)) {
            GrandExchange.open();
        }
        if (b.var2(GrandExchange.canCollect() ? 1 : 0) && b.var3(GrandExchange.getEmptySlots())) {
            GrandExchange.collect((boolean)var1[1]);
            return var1[0];
        }
        List var5 = Inventory.getAll(item -> {
            boolean bl;
            if (b.var4(item.getId(), var1[3])) {
                bl = var1[1];
                0;
                
            } else {
                bl = var1[0];
            }
            return bl;
        });
        int var6 = var1[0];
        Iterator var7 = var5.iterator();
        while (b.var2(var7.hasNext() ? 1 : 0)) {
            Item var8 = (Item)var7.next();
            if (b.var9(var6, var1[2])) {
                0;
                if (1 >= 0) break;
                return ((0xD6 ^ 0x91 ^ (0xDB ^ 0x84)) & (67 + 116 - 108 + 77 ^ 19 + 70 - 85 + 124 ^ -1)) != 0;
            }
            ++var6;
            if (b.var3(GrandExchange.isSelling() ? 1 : 0)) {
                int[] nArray = new int[var1[1]];
                nArray[b.var1[0]] = var8.getId();
                GrandExchange.sell((int[])nArray);
                0;
                if (((0x84 ^ 0xAF ^ (0x85 ^ 0x9A)) & (0x64 ^ 0x1C ^ (0xCA ^ 0x86) ^ -1)) == 0) break;
                return ((58 + 58 - 87 + 140 ^ 145 + 39 - 134 + 99) & (0 + 38 - -93 + 49 ^ 98 + 123 - 134 + 49 ^ -1)) != 0;
            }
            if (b.var2(GrandExchange.isSelling() ? 1 : 0)) {
                b var10;
                int var11 = (int)((double)Prices.getItemPrice((int)var8.getId()) * 0.01 * (double)var10.e.sellPercent());
                int var12 = Prices.getItemPrice((int)var8.getId()) - var11;
                GrandExchange.setPrice((int)var12);
                GrandExchange.confirm();
                0;
                if (((73 + 59 - 80 + 115 ^ 149 + 49 - 154 + 129) & (142 + 45 - 136 + 131 ^ 171 + 36 - 106 + 87 ^ -1)) == 0) break;
                return ((0x90 ^ 0x9F ^ (0x88 ^ 0xC5)) & (0xB8 ^ 0xB7 ^ (0x39 ^ 0x74) ^ -1)) != 0;
            }
            0;
            if (-1 >= -1) continue;
            return ((9 ^ 0x4C) & ~(0x5F ^ 0x1A)) != 0;
        }
        return var1[1];
    }

    private static boolean var3(int n) {
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

    private static boolean var9(int n, int n2) {
        return n > n2;
    }

    private static boolean var4(int n, int n2) {
        return n != n2;
    }

    static {
        b.var13();
    }

    private static boolean var2(int n) {
        return n != 0;
    }

    private static void var13() {
        var1 = new int[4];
        b.var1[0] = (0x81 ^ 0xAF ^ 3) & (56 + 188 - 239 + 227 ^ 48 + 37 - 56 + 168 ^ -1);
        b.var1[1] = 1;
        b.var1[2] = 0x4D ^ 0x35 ^ (0xB1 ^ 0xC1);
        b.var1[3] = 0xFFFFBBF7 & 0x47EB;
    }
}

