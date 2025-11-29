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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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

    static {
        Q.lIIlIIIlIIIllIl();
        Q.lIIlIIIlIIIllII();
    }

    private static boolean lIIlIIIlIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIIIlIIIllII() {
        llllIlIllIll = new String[llllIlIlllII[5]];
        Q.llllIlIllIll[Q.llllIlIlllII[0]] = "[BuyNewSupplies]: No coins in inventory, closing GE.";
        Q.llllIlIllIll[Q.llllIlIlllII[1]] = "No items to buy, or no recharge amount set, stopping restocking";
        Q.llllIlIllIll[Q.llllIlIlllII[3]] = "[BuyNewSupplies]: We have all of the required items, stopping restocking.";
        Q.llllIlIllIll[Q.llllIlIlllII[4]] = "[BuyNewSupplies]: We have {} coins but need {} to buy {} of {}";
    }

    private static boolean lIIlIIIlIIlIIII(Object object) {
        return object == null;
    }

    @Override
    public boolean ci() {
        int var1;
        Map.Entry<Integer, Integer> var2;
        Q var3;
        if (Q.lIIlIIIlIIIlllI(this.cW.C() ? 1 : 0)) {
            return llllIlIlllII[0];
        }
        if (Q.lIIlIIIlIIIlllI(var3.cn() ? 1 : 0)) {
            return llllIlIlllII[0];
        }
        int[] nArray = new int[llllIlIlllII[1]];
        nArray[Q.llllIlIlllII[0]] = llllIlIlllII[2];
        if (Q.lIIlIIIlIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0) && Q.lIIlIIIlIIIllll(GrandExchange.isOpen() ? 1 : 0)) {
            Log.info((String)llllIlIllIll[llllIlIlllII[0]]);
            Bank.open();

            return llllIlIlllII[1];
        }
        EquipmentSetup var4 = (EquipmentSetup)var3.cV.totemGear().selected(EquipmentSetup.class);
        if (Q.lIIlIIIlIIlIIII(var4)) {
            return llllIlIlllII[0];
        }
        int var5 = var4.get(EquipmentInventorySlot.WEAPON);
        int var6 = var3.cV.rechargeStaffAmount();
        Collection var7 = ItemVariationMapping.getVariations((int)var5);
        Log.info((String)("Weapon variations: " + var7));
        Map<Integer, Integer> var8 = var3.a(var7);
        Log.info((String)("Required items: " + var8));
        if (!Q.lIIlIIIlIIlIIIl(var8) || Q.lIIlIIIlIIlIIlI(var6)) {
            Log.info((String)llllIlIllIll[llllIlIlllII[1]]);
            var3.co();
            return llllIlIlllII[0];
        }
        if (Q.lIIlIIIlIIlIIll(Inventory.getCount((boolean)llllIlIlllII[1], (int[])var8.keySet().stream().mapToInt(Integer::intValue).toArray()), var6)) {
            Log.info((String)llllIlIllIll[llllIlIlllII[3]]);
            var3.co();
            return llllIlIlllII[0];
        }
        Iterator<Map.Entry<Integer, Integer>> var9 = var8.entrySet().iterator();
        while (Q.lIIlIIIlIIIllll(var9.hasNext() ? 1 : 0)) {
            var2 = var9.next();
            var1 = var2.getKey();
            int[] nArray2 = new int[llllIlIlllII[1]];
            nArray2[Q.llllIlIlllII[0]] = var1;
            if (Q.lIIlIIIlIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {

                if (-1 != 1) continue;
                return ((0x76 ^ 0x3A ^ (0x40 ^ 0xA)) & (109 + 21 - 0 + 2 ^ 49 + 128 - 90 + 43 ^ -1)) != 0;
            }
            Bank.withdrawAll((int)var1, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return llllIlIlllII[1];
        }
        int[] nArray3 = new int[llllIlIlllII[1]];
        nArray3[Q.llllIlIlllII[0]] = llllIlIlllII[2];
        if (Q.lIIlIIIlIIIllll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            Bank.withdrawAll((int)llllIlIlllII[2], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            return llllIlIlllII[1];
        }
        if (Q.lIIlIIIlIIIllll(Bank.isOpen() ? 1 : 0)) {
            Bank.close();
        }
        if (Q.lIIlIIIlIIIlllI(GrandExchange.isOpen() ? 1 : 0)) {
            GrandExchange.open();
            return llllIlIlllII[1];
        }
        if (Q.lIIlIIIlIIIllll(GrandExchange.canCollect() ? 1 : 0)) {
            GrandExchange.collect();
            return llllIlIlllII[1];
        }
        var9 = var8.entrySet().iterator();
        while (Q.lIIlIIIlIIIllll(var9.hasNext() ? 1 : 0)) {
            var2 = var9.next();
            var1 = var2.getKey();
            int[] nArray4 = new int[llllIlIlllII[1]];
            nArray4[Q.llllIlIlllII[0]] = var1;
            int var10 = var2.getValue() * (var6 - Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray4));
            int[] nArray5 = new int[llllIlIlllII[1]];
            nArray5[Q.llllIlIlllII[0]] = var1;
            if (Q.lIIlIIIlIIlIIll(Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray5), var10)) {

                if (((0x5F ^ 0x66) & ~(0x35 ^ 0xC)) <= ((0x87 ^ 0x88) & ~(0x2C ^ 0x23))) continue;
                return false;
            }
            int[] nArray6 = new int[llllIlIlllII[1]];
            nArray6[Q.llllIlIlllII[0]] = var1;
            int var11 = var10 - Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray6);
            if (Q.lIIlIIIlIIlIIlI(var11)) {

                if (3 <= 3) continue;
                return false;
            }
            int var12 = (int)((double)Prices.getItemPrice((int)var1) * 1.25);
            int var13 = var11 * var12;
            int[] nArray7 = new int[llllIlIlllII[1]];
            nArray7[Q.llllIlIlllII[0]] = llllIlIlllII[2];
            if (Q.lIIlIIIlIIlIlII(Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray7), var13)) {
                Object[] objectArray = new Object[llllIlIlllII[5]];
                int[] nArray8 = new int[llllIlIlllII[1]];
                nArray8[Q.llllIlIlllII[0]] = llllIlIlllII[2];
                objectArray[Q.llllIlIlllII[0]] = Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray8);
                objectArray[Q.llllIlIlllII[1]] = var13;
                objectArray[Q.llllIlIlllII[3]] = var11;
                objectArray[Q.llllIlIlllII[4]] = var1;
                Log.info((String)llllIlIllIll[llllIlIlllII[4]], (Object[])objectArray);
                return llllIlIlllII[0];
            }
            Log.info((String)("[BuyNewSupplies]: Buying " + var11 + " of " + var1 + " (price: " + var12 + ")"));
            GrandExchange.buy((int)var1, (int)var11, (int)var12);

            var3.sleep(llllIlIlllII[4]);
            return llllIlIlllII[1];
        }
        return llllIlIlllII[0];
    }

    private static boolean lIIlIIIlIIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIlIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected BuyingNewSuppliesRestockingTask(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }

    private static boolean lIIlIIIlIIlIIlI(int n2) {
        return n2 <= 0;
    }

    private static boolean lIIlIIIlIIIllll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private Map<Integer, Integer> a(Collection<Integer> collection) {
        void var14;
        Log.info((String)("[BuyNewSupplies]: Getting required items for weapon variations: " + collection));
        if (Q.lIIlIIIlIIIllll(collection.contains(llllIlIlllII[6]) ? 1 : 0)) {
            return Map.of(llllIlIlllII[7], llllIlIlllII[1], llllIlIlllII[8], llllIlIlllII[1], llllIlIlllII[9], llllIlIlllII[1], llllIlIlllII[10], llllIlIlllII[11]);
        }
        if (Q.lIIlIIIlIIIllll(var14.contains(llllIlIlllII[12]) ? 1 : 0)) {
            return Map.of(llllIlIlllII[2], llllIlIlllII[13], llllIlIlllII[8], llllIlIlllII[1], llllIlIlllII[9], llllIlIlllII[1], llllIlIlllII[10], llllIlIlllII[11]);
        }
        if (Q.lIIlIIIlIIIllll(var14.contains(llllIlIlllII[14]) ? 1 : 0)) {
            return Map.of(llllIlIlllII[15], llllIlIlllII[4]);
        }
        Log.info((String)("[BuyNewSupplies]: No required items found for weapon variations: " + collection));
        return null;
    }

    private static boolean lIIlIIIlIIlIIIl(Object object) {
        return object != null;
    }

        return String.valueOf(var15);
    }
}

