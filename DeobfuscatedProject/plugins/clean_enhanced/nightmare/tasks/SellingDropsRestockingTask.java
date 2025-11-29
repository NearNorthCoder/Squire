/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Selling drops (Restocking)", priority=14674, blocking=true)
public class SellingDropsRestockingTask
extends NightmareTaskBase {

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Inject
    protected SellingDropsRestockingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    @Override
    public boolean ci() {
        T var4;
        if (T.var5(this.cW.D() ? 1 : 0)) {
            return var1[0];
        }
        if (T.var3(var4.cW.C() ? 1 : 0)) {
            return var1[0];
        }
        Player var6 = Players.getLocal();
        if (T.var5(ds.contains(var6.getWorldLocation()) ? 1 : 0)) {
            return var1[0];
        }
        if (T.var3(Bank.isOpen() ? 1 : 0) && T.var5(var4.cl() ? 1 : 0) && T.var3(var4.cm() ? 1 : 0)) {
            Log.info((String)var2[var1[0]]);
            Object[] objectArray = new Object[var1[2]];
            objectArray[T.var1[0]] = var4.cl();
            objectArray[T.var1[1]] = var4.cm();
            Log.info((String)var2[var1[1]], (Object[])objectArray);
            var4.cW.f(var1[0]);
            var4.cW.e(var1[1]);
            return var1[1];
        }
        if (T.var5(GrandExchange.isOpen() ? 1 : 0)) {
            GrandExchange.open();
            return var1[1];
        }
        if (T.var3(GrandExchange.canCollect() ? 1 : 0)) {
            Log.info((String)var2[var1[2]]);
            GrandExchange.collect();
            return var1[1];
        }
        Item var7 = Inventory.getFirst(item -> {
            int n2;
            int n3 = item.getId();
            if (T.var3(item.isNoted() ? 1 : 0)) {
                n2 = var1[1];
                0;
                if ((1 ^ 5) > (0x85 ^ 0x81)) {
                    return ((0x58 ^ 4) & ~(0x54 ^ 8)) != 0;
                }
            } else {
                n2 = var1[0];
            }
            return dt.contains(n3 - n2);
        });
        if (T.var8(var7)) {
            Log.info((String)var2[var1[3]]);
            if (T.var3(var4.cm() ? 1 : 0) && T.var3(GrandExchange.isEmpty() ? 1 : 0)) {
                Log.info((String)var2[var1[4]]);
                var4.cW.f(var1[0]);
                var4.cW.e(var1[1]);
                return var1[1];
            }
            Log.info((String)var2[var1[5]]);
            return var1[0];
        }
        if (T.var5(GrandExchange.isSelling() ? 1 : 0)) {
            Log.info((String)("[SellDrops]: Selling " + var7.getName() + " for " + Prices.getItemPrice((int)var7.getId()) + " GP"));
            int[] nArray = new int[var1[1]];
            nArray[T.var1[0]] = var7.getId();
            GrandExchange.sell((int[])nArray);
            0;
            if null != null {
                return ((0x6D ^ 0x48) & ~(3 ^ 0x26)) != 0;
            }
        } else {
            int var9 = (int)((double)Prices.getItemPrice((int)var7.getId()) * 0.8);
            Log.info((String)("[SellDrops]: Setting price to " + var9 + " GP"));
            GrandExchange.setPrice((int)var9);
            GrandExchange.confirm();
        }
        return var1[1];
    }

    private static void var10() {
        var1 = new int[8];
        T.var1[0] = (0x8B ^ 0xA3) & ~(0x84 ^ 0xAC);
        T.var1[1] = 1;
        T.var1[2] = 2;
        T.var1[3] = 3;
        T.var1[4] = 35 + 79 - 72 + 133 ^ 125 + 143 - 214 + 117;
        T.var1[5] = 0x1E ^ 0x1B;
        T.var1[6] = 3 ^ 5;
        T.var1[7] = 0xC8 ^ 0xC3 ^ 3;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (T.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

    static {
        T.var10();
        T.var22();
    }

    private static void var22() {
        var2 = new String[var1[6]];
        T.var2[T.var1[0]] = "[SellDrops]: No sellable items in bank or inventory, moving on.";
        T.var2[T.var1[1]] = "Bank contains sellable: {}, noDropsInInventory: {}";
        T.var2[T.var1[2]] = "[SellDrops]: Collecting items from GE.";
        T.var2[T.var1[3]] = "[SellDrops]: Cannot find any items to sell.";
        T.var2[T.var1[4]] = "[SellDrops]: We have sold all items and collected the money, moving on.";
        T.var2[T.var1[5]] = "[SellDrops]: We have not sold all items yet, waiting for GE to update.";
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }
}

