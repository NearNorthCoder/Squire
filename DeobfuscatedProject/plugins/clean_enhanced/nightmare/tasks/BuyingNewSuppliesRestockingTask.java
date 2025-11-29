/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.client.game.ItemVariationMapping
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.nightmare.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.client.game.ItemVariationMapping;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import gg.squire.nightmare.tasks.NightmareTaskBase;
import gg.squire.nightmare.tasks.NightmareManager;

@TaskDesc(name="Buying new supplies (Restocking)", priority=13337, blocking=true)
public class BuyingNewSuppliesRestockingTask
extends NightmareTaskBase {

    private static void var3() {
        var2 = new int[16];
        Q.var2[0] = (0x73 ^ 0x5E) & ~(0x5A ^ 0x77);
        Q.var2[1] = 1;
        Q.var2[2] = -(0xFFFFBD77 & 0x6A9D) & (0xFFFFAFF7 & 0x7BFF);
        Q.var2[3] = 2;
        Q.var2[4] = 3;
        Q.var2[5] = 0xC7 ^ 0xC3;
        Q.var2[6] = -(0xFFFFEBDB & 0x55AD) & (0xFFFFFBEB & 0x77FF);
        Q.var2[7] = -(0xFFFF9937 & 0x6FFA) & (0xFFFFBFF7 & 0x7BBF);
        Q.var2[8] = -(0xFFFFFDDF & 0x2FEA) & (0xFFFFFFFD & 0x2FFB);
        Q.var2[9] = 0xFFFFD7F2 & 0x2A3F;
        Q.var2[10] = 0xFFFFA7BE & 0x5A6B;
        Q.var2[11] = 0x90 ^ 0x95;
        Q.var2[12] = -(0xFFFFF3F3 & 0x5C6D) & (0xFFFFFFFF & 0x7EE3);
        Q.var2[13] = 0x7E ^ 0x33 ^ (0x2B ^ 0x6C);
        Q.var2[14] = -(0xFFFFE4F7 & 0x3BC9) & (0xFFFFFFFF & 0x77F3);
        Q.var2[15] = -(0xFFFFF7DF & 0x5D6B) & (0xFFFFFFFF & 0x577F);
    }

    static {
        Q.var3();
        Q.var4();
    }

    private static boolean var5(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var4() {
        var1 = new String[var2[5]];
        Q.var1[Q.var2[0]] = "[BuyNewSupplies]: No coins in inventory, closing GE.";
        Q.var1[Q.var2[1]] = "No items to buy, or no recharge amount set, stopping restocking";
        Q.var1[Q.var2[3]] = "[BuyNewSupplies]: We have all of the required items, stopping restocking.";
        Q.var1[Q.var2[4]] = "[BuyNewSupplies]: We have {} coins but need {} to buy {} of {}";
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    @Override
    public boolean ci() {
        int var7;
        Map.Entry<Integer, Integer> var8;
        Q var9;
        if (Q.var10(this.cW.C() ? 1 : 0)) {
            return var2[0];
        }
        if (Q.var10(var9.cn() ? 1 : 0)) {
            return var2[0];
        }
        int[] nArray = new int[var2[1]];
        nArray[Q.var2[0]] = var2[2];
        if (Q.var10(Inventory.contains((int[])nArray) ? 1 : 0) && Q.var11(GrandExchange.isOpen() ? 1 : 0)) {
            Log.info((String)var1[var2[0]]);
            Bank.open();
            0;
            return var2[1];
        }
        EquipmentSetup var12 = (EquipmentSetup)var9.cV.totemGear().selected(EquipmentSetup.class);
        if (Q.var6(var12)) {
            return var2[0];
        }
        int var13 = var12.get(EquipmentInventorySlot.WEAPON);
        int var14 = var9.cV.rechargeStaffAmount();
        Collection var15 = ItemVariationMapping.getVariations((int)var13);
        Log.info((String)("Weapon variations: " + var15));
        Map<Integer, Integer> var16 = var9.a(var15);
        Log.info((String)("Required items: " + var16));
        if (!Q.var17(var16) || Q.var18(var14)) {
            Log.info((String)var1[var2[1]]);
            var9.co();
            return var2[0];
        }
        if (Q.var5(Inventory.getCount((boolean)var2[1], (int[])var16.keySet().stream().mapToInt(Integer::intValue).toArray()), var14)) {
            Log.info((String)var1[var2[3]]);
            var9.co();
            return var2[0];
        }
        Iterator<Map.Entry<Integer, Integer>> var19 = var16.entrySet().iterator();
        while (Q.var11(var19.hasNext() ? 1 : 0)) {
            var8 = var19.next();
            var7 = var8.getKey();
            int[] nArray2 = new int[var2[1]];
            nArray2[Q.var2[0]] = var7;
            if (Q.var10(Bank.contains((int[])nArray2) ? 1 : 0)) {
                0;
                if (-1 != 1) continue;
                return ((0x76 ^ 0x3A ^ (0x40 ^ 0xA)) & (109 + 21 - 0 + 2 ^ 49 + 128 - 90 + 43 ^ -1)) != 0;
            }
            Bank.withdrawAll((int)var7, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return var2[1];
        }
        int[] nArray3 = new int[var2[1]];
        nArray3[Q.var2[0]] = var2[2];
        if (Q.var11(Bank.contains((int[])nArray3) ? 1 : 0)) {
            Bank.withdrawAll((int)var2[2], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return var2[1];
        }
        if (Q.var11(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
        }
        if (Q.var10(GrandExchange.isOpen() ? 1 : 0)) {
            GrandExchange.open();
            return var2[1];
        }
        if (Q.var11(GrandExchange.canCollect() ? 1 : 0)) {
            GrandExchange.collect();
            return var2[1];
        }
        var19 = var16.entrySet().iterator();
        while (Q.var11(var19.hasNext() ? 1 : 0)) {
            var8 = var19.next();
            var7 = var8.getKey();
            int[] nArray4 = new int[var2[1]];
            nArray4[Q.var2[0]] = var7;
            int var20 = var8.getValue() * (var14 - Inventory.getCount((boolean)var2[1], (int[])nArray4));
            int[] nArray5 = new int[var2[1]];
            nArray5[Q.var2[0]] = var7;
            if (Q.var5(Inventory.getCount((boolean)var2[1], (int[])nArray5), var20)) {
                0;
                if (((0x5F ^ 0x66) & ~(0x35 ^ 0xC)) <= ((0x87 ^ 0x88) & ~(0x2C ^ 0x23))) continue;
                return ((0x39 ^ 0x6E) & ~(0x25 ^ 0x72)) != 0;
            }
            int[] nArray6 = new int[var2[1]];
            nArray6[Q.var2[0]] = var7;
            int var21 = var20 - Inventory.getCount((boolean)var2[1], (int[])nArray6);
            if (Q.var18(var21)) {
                0;
                if (3 <= 3) continue;
                return ((0x63 ^ 0x3D) & ~(0xF2 ^ 0xAC)) != 0;
            }
            int var22 = (int)((double)Prices.getItemPrice((int)var7) * 1.25);
            int var23 = var21 * var22;
            int[] nArray7 = new int[var2[1]];
            nArray7[Q.var2[0]] = var2[2];
            if (Q.var24(Inventory.getCount((boolean)var2[1], (int[])nArray7), var23)) {
                Object[] objectArray = new Object[var2[5]];
                int[] nArray8 = new int[var2[1]];
                nArray8[Q.var2[0]] = var2[2];
                objectArray[Q.var2[0]] = Inventory.getCount((boolean)var2[1], (int[])nArray8);
                objectArray[Q.var2[1]] = var23;
                objectArray[Q.var2[3]] = var21;
                objectArray[Q.var2[4]] = var7;
                Log.info((String)var1[var2[4]], (Object[])objectArray);
                return var2[0];
            }
            Log.info((String)("[BuyNewSupplies]: Buying " + var21 + " of " + var7 + " (price: " + var22 + ")"));
            GrandExchange.buy((int)var7, (int)var21, (int)var22);
            0;
            var9.sleep(var2[4]);
            return var2[1];
        }
        return var2[0];
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected BuyingNewSuppliesRestockingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean var18(int n2) {
        return n2 <= 0;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Map<Integer, Integer> a(Collection<Integer> collection) {
        void var25;
        Log.info((String)("[BuyNewSupplies]: Getting required items for weapon variations: " + collection));
        if (Q.var11(collection.contains(var2[6]) ? 1 : 0)) {
            return Map.of(var2[7], var2[1], var2[8], var2[1], var2[9], var2[1], var2[10], var2[11]);
        }
        if (Q.var11(var25.contains(var2[12]) ? 1 : 0)) {
            return Map.of(var2[2], var2[13], var2[8], var2[1], var2[9], var2[1], var2[10], var2[11]);
        }
        if (Q.var11(var25.contains(var2[14]) ? 1 : 0)) {
            return Map.of(var2[15], var2[4]);
        }
        Log.info((String)("[BuyNewSupplies]: No required items found for weapon variations: " + collection));
        return null;
    }

    private static boolean var17(Object object) {
        return object != null;
    }

    private static String var26(String var27, String var28) {
        var27 = new String(Base64.getDecoder().decode(var27.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var29 = new StringBuilder();
        char[] var30 = var28.toCharArray();
        int var31 = var2[0];
        char[] var32 = var27.toCharArray();
        int var33 = var32.length;
        int var34 = var2[0];
        while (Q.var24(var34, var33)) {
            char var35 = var32[var34];
            var29.append((char)(var35 ^ var30[var31 % var30.length]));
            0;
            ++var31;
            ++var34;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var29);
    }
}

