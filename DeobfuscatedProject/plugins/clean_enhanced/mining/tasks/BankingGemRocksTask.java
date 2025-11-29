/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.DepositBox
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.mining.tasks;

import com.google.common.collect.ImmutableSet;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.DepositBox;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Banking gem rocks", priority=100, blocking=true)
public class BankingGemRocksTask
extends Task {
    
    @Inject
    private  SquireMinerConfig f;
    private static final  Set<Integer> v;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (q.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_2;
        if (q.var14((Object)this.f.activity(), (Object)a.GEM_ROCKS)) {
            return var1[0];
        }
        if (q.var15(Inventory.isFull() ? 1 : 0)) {
            return var1[0];
        }
        if (q.var16(DepositBox.isOpen() ? 1 : 0)) {
            Widget var17 = Widgets.get((WidgetInfo)WidgetInfo.DEPOSIT_BOX_INVENTORY_ITEMS_CONTAINER);
            if (q.var15(Widgets.isVisible((Widget)var17) ? 1 : 0)) {
                return var1[0];
            }
            DepositBox.selectQuantityAll();
            Widget[] var18 = var17.getChildren();
            if (q.var19(var18)) {
                return var1[0];
            }
            HashSet<Integer> var20 = new HashSet<Integer>();
            Widget[] var21 = var18;
            int var22 = var21.length;
            int var23 = var1[0];
            while (q.var12(var23, var22)) {
                Widget var24 = var21[var23];
                int var25 = var24.getItemId();
                if (q.var16(v.contains(var25) ? 1 : 0)) {
                    if (q.var16(var20.contains(var25) ? 1 : 0)) {
                        0;
                        if null != null {
                            return ((0xCA ^ 0xA0 ^ (0x76 ^ 0x10)) & (0x7E ^ 0x10 ^ (0xC9 ^ 0xAB) ^ -1)) != 0;
                        }
                    } else {
                        var24.interact(var2[var1[0]]);
                        var20.add(var25);
                        0;
                    }
                }
                ++var23;
                0;
                if (-1 < 3) continue;
                return ((0x3F ^ 0x5A ^ (0x13 ^ 0x60)) & (0x9A ^ 0x94 ^ (0x82 ^ 0x9A) ^ -1)) != 0;
            }
            return var1[1];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[q.var1[0]] = var2[var1[1]];
        TileObject var17 = TileObjects.getNearest((String[])stringArray);
        if (q.var19(var17)) {
            return var1[0];
        }
        var1_2.interact(var2[var1[2]]);
        return var1[1];
    }

    private static void var26() {
        var1 = new int[13];
        q.var1[0] = 3 & (3 ^ -1);
        q.var1[1] = 1;
        q.var1[2] = 2;
        q.var1[3] = -(0xFFFFF73F & 0x49EB) & (0xFFFFE77B & 0x5FFF);
        q.var1[4] = -(0xFFFFF1DD & 0x3FA7) & (0xFFFFB7D7 & Short.MAX_VALUE);
        q.var1[5] = 0xFFFFC6FF & 0x3F55;
        q.var1[6] = 0xFFFFE77F & 0x1ED7;
        q.var1[7] = -(0xFFFFECBF & 0x3B41) & (0xFFFFEF7B & 0x3EDD);
        q.var1[8] = 0xFFFFDE7B & 0x27DF;
        q.var1[9] = 0xFFFFD75F & 0x2EFD;
        q.var1[10] = 0xFFFFAEDF & 0x577F;
        q.var1[11] = 3;
        q.var1[12] = 0x16 ^ 0x10 ^ (0xA7 ^ 0xA9);
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    private static void var27() {
        var2 = new String[var1[11]];
        q.var2[q.var1[0]] = "Deposit-All";
        q.var2[q.var1[1]] = "Bank Deposit Chest";
        q.var2[q.var1[2]] = "Deposit";
    }

    static {
        q.var26();
        q.var27();
        Object[] objectArray = new Integer[var1[2]];
        objectArray[q.var1[0]] = var1[9];
        objectArray[q.var1[1]] = var1[10];
        v = ImmutableSet.of((Object)var1[3], (Object)var1[4], (Object)var1[5], (Object)var1[6], (Object)var1[7], (Object)var1[8], (Object[])objectArray);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var16(int n2) {
        return n2 != 0;
    }
}

