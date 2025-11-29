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
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

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
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.S;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/* TASK: Buying new supplies (Restocking) -> Buyingnewsupplies(Restocking)Task */
@TaskDesc(name="Buying new supplies (Restocking)", priority=13337, blocking=true)
public class Q
extends S {
    private static /* synthetic */ String[] llllIlIllIll;
    private static /* synthetic */ int[] llllIlIlllII;

    private static void lIIlIIIlIIIllIl() {
        llllIlIlllII = new int[16];
        Q.llllIlIlllII[0] = (0x73 ^ 0x5E) & ~(0x5A ^ 0x77);
        Q.llllIlIlllII[1] = 1;
        Q.llllIlIlllII[2] = -(0xFFFFBD77 & 0x6A9D) & (0xFFFFAFF7 & 0x7BFF);
        Q.llllIlIlllII[3] = 2;
        Q.llllIlIlllII[4] = 3;
        Q.llllIlIlllII[5] = 0xC7 ^ 0xC3;
        Q.llllIlIlllII[6] = -(0xFFFFEBDB & 0x55AD) & (0xFFFFFBEB & 0x77FF);
        Q.llllIlIlllII[7] = -(0xFFFF9937 & 0x6FFA) & (0xFFFFBFF7 & 0x7BBF);
        Q.llllIlIlllII[8] = -(0xFFFFFDDF & 0x2FEA) & (0xFFFFFFFD & 0x2FFB);
        Q.llllIlIlllII[9] = 0xFFFFD7F2 & 0x2A3F;
        Q.llllIlIlllII[10] = 0xFFFFA7BE & 0x5A6B;
        Q.llllIlIlllII[11] = 0x90 ^ 0x95;
        Q.llllIlIlllII[12] = -(0xFFFFF3F3 & 0x5C6D) & (0xFFFFFFFF & 0x7EE3);
        Q.llllIlIlllII[13] = 0x7E ^ 0x33 ^ (0x2B ^ 0x6C);
        Q.llllIlIlllII[14] = -(0xFFFFE4F7 & 0x3BC9) & (0xFFFFFFFF & 0x77F3);
        Q.llllIlIlllII[15] = -(0xFFFFF7DF & 0x5D6B) & (0xFFFFFFFF & 0x577F);
    }

    static {
        Q.lIIlIIIlIIIllIl();
        Q.lIIlIIIlIIIllII();
    }

    private static boolean lIIlIIIlIIlIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIlIIIlIIIllII() {
        llllIlIllIll = new String[llllIlIlllII[5]];
        Q.llllIlIllIll[Q.llllIlIlllII[0]] = Q."[BuyNewSupplies]: No coins in inventory, closing GE.";
        Q.llllIlIllIll[Q.llllIlIlllII[1]] = Q."No items to buy, or no recharge amount set, stopping restocking";
        Q.llllIlIllIll[Q.llllIlIlllII[3]] = Q."[BuyNewSupplies]: We have all of the required items, stopping restocking.";
        Q.llllIlIllIll[Q.llllIlIlllII[4]] = Q."[BuyNewSupplies]: We have {} coins but need {} to buy {} of {}";
    }

    private static boolean lIIlIIIlIIlIIII(Object object) {
        return object == null;
    }

    @Override
    public boolean ci() {
        int var2;
        Map.Entry<Integer, Integer> var6;
        Q var8;
        if (Q.lIIlIIIlIIIlllI(this.cW.C() ? 1 : 0)) {
            return llllIlIlllII[0];
        }
        if (Q.lIIlIIIlIIIlllI(var8.cn() ? 1 : 0)) {
            return llllIlIlllII[0];
        }
        int[] nArray = new int[llllIlIlllII[1]];
        nArray[Q.llllIlIlllII[0]] = llllIlIlllII[2];
        if (Q.lIIlIIIlIIIlllI(Inventory.contains((int[])nArray) ? 1 : 0) && Q.lIIlIIIlIIIllll(GrandExchange.isOpen() ? 1 : 0)) {
            Log.info((String)llllIlIllIll[llllIlIlllII[0]]);
            Bank.open();
            0;
            return llllIlIlllII[1];
        }
        EquipmentSetup var16 = (EquipmentSetup)var8.cV.totemGear().selected(EquipmentSetup.class);
        if (Q.lIIlIIIlIIlIIII(var16)) {
            return llllIlIlllII[0];
        }
        int var11 = var16.get(EquipmentInventorySlot.WEAPON);
        int var17 = var8.cV.rechargeStaffAmount();
        Collection var18 = ItemVariationMapping.getVariations((int)var11);
        Log.info((String)("Weapon variations: " + var18));
        Map<Integer, Integer> var23 = var8.a(var18);
        Log.info((String)("Required items: " + var23));
        if (!Q.lIIlIIIlIIlIIIl(var23) || Q.lIIlIIIlIIlIIlI(var17)) {
            Log.info((String)llllIlIllIll[llllIlIlllII[1]]);
            var8.co();
            return llllIlIlllII[0];
        }
        if (Q.lIIlIIIlIIlIIll(Inventory.getCount((boolean)llllIlIlllII[1], (int[])var23.keySet().stream().mapToInt(Integer::intValue).toArray()), var17)) {
            Log.info((String)llllIlIllIll[llllIlIlllII[3]]);
            var8.co();
            return llllIlIlllII[0];
        }
        Iterator<Map.Entry<Integer, Integer>> var14 = var23.entrySet().iterator();
        while (Q.lIIlIIIlIIIllll(var14.hasNext() ? 1 : 0)) {
            var6 = var14.next();
            var2 = var6.getKey();
            int[] nArray2 = new int[llllIlIlllII[1]];
            nArray2[Q.llllIlIlllII[0]] = var2;
            if (Q.lIIlIIIlIIIlllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                0;
                if (-1 != 1) continue;
                return ((0x76 ^ 0x3A ^ (0x40 ^ 0xA)) & (109 + 21 - 0 + 2 ^ 49 + 128 - 90 + 43 ^ -1)) != 0;
            }
            Bank.withdrawAll((int)var2, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
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
        var14 = var23.entrySet().iterator();
        while (Q.lIIlIIIlIIIllll(var14.hasNext() ? 1 : 0)) {
            var6 = var14.next();
            var2 = var6.getKey();
            int[] nArray4 = new int[llllIlIlllII[1]];
            nArray4[Q.llllIlIlllII[0]] = var2;
            int var22 = var6.getValue() * (var17 - Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray4));
            int[] nArray5 = new int[llllIlIlllII[1]];
            nArray5[Q.llllIlIlllII[0]] = var2;
            if (Q.lIIlIIIlIIlIIll(Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray5), var22)) {
                0;
                if (((0x5F ^ 0x66) & ~(0x35 ^ 0xC)) <= ((0x87 ^ 0x88) & ~(0x2C ^ 0x23))) continue;
                return false;
            }
            int[] nArray6 = new int[llllIlIlllII[1]];
            nArray6[Q.llllIlIlllII[0]] = var2;
            int var19 = var22 - Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray6);
            if (Q.lIIlIIIlIIlIIlI(var19)) {
                0;
                if (3 <= 3) continue;
                return false;
            }
            int var15 = (int)((double)Prices.getItemPrice((int)var2) * 1.25);
            int var13 = var19 * var15;
            int[] nArray7 = new int[llllIlIlllII[1]];
            nArray7[Q.llllIlIlllII[0]] = llllIlIlllII[2];
            if (Q.lIIlIIIlIIlIlII(Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray7), var13)) {
                Object[] objectArray = new Object[llllIlIlllII[5]];
                int[] nArray8 = new int[llllIlIlllII[1]];
                nArray8[Q.llllIlIlllII[0]] = llllIlIlllII[2];
                objectArray[Q.llllIlIlllII[0]] = Inventory.getCount((boolean)llllIlIlllII[1], (int[])nArray8);
                objectArray[Q.llllIlIlllII[1]] = var13;
                objectArray[Q.llllIlIlllII[3]] = var19;
                objectArray[Q.llllIlIlllII[4]] = var2;
                Log.info((String)llllIlIllIll[llllIlIlllII[4]], (Object[])objectArray);
                return llllIlIlllII[0];
            }
            Log.info((String)("[BuyNewSupplies]: Buying " + var19 + " of " + var2 + " (price: " + var15 + ")"));
            GrandExchange.buy((int)var2, (int)var19, (int)var15);
            0;
            var8.sleep(llllIlIlllII[4]);
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
    protected Q(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
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
        void var9;
        Log.info((String)("[BuyNewSupplies]: Getting required items for weapon variations: " + collection));
        if (Q.lIIlIIIlIIIllll(collection.contains(llllIlIlllII[6]) ? 1 : 0)) {
            return Map.of(llllIlIlllII[7], llllIlIlllII[1], llllIlIlllII[8], llllIlIlllII[1], llllIlIlllII[9], llllIlIlllII[1], llllIlIlllII[10], llllIlIlllII[11]);
        }
        if (Q.lIIlIIIlIIIllll(var9.contains(llllIlIlllII[12]) ? 1 : 0)) {
            return Map.of(llllIlIlllII[2], llllIlIlllII[13], llllIlIlllII[8], llllIlIlllII[1], llllIlIlllII[9], llllIlIlllII[1], llllIlIlllII[10], llllIlIlllII[11]);
        }
        if (Q.lIIlIIIlIIIllll(var9.contains(llllIlIlllII[14]) ? 1 : 0)) {
            return Map.of(llllIlIlllII[15], llllIlIlllII[4]);
        }
        Log.info((String)("[BuyNewSupplies]: No required items found for weapon variations: " + collection));
        return null;
    }

    private static boolean lIIlIIIlIIlIIIl(Object object) {
        return object != null;
    }

    private static String lIIlIIIlIIIlIll(String var12, String var21) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var20 = var21.toCharArray();
        int var10 = llllIlIlllII[0];
        char[] var1 = var12.toCharArray();
        int var3 = var1.length;
        int var4 = llllIlIlllII[0];
        while (Q.lIIlIIIlIIlIlII(var4, var3)) {
            char var7 = var1[var4];
            var5.append((char)(var7 ^ var20[var10 % var20.length]));
            0;
            ++var10;
            ++var4;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var5);
    }
}

