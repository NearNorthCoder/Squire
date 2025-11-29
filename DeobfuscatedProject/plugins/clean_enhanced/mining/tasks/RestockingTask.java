/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.items.Shop
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.mining.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.items.Shop;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Restocking")
public class RestockingTask
extends Task {

    private final  SquireMinerConfig D;

    private static boolean var3(Object object) {
        return object != null;
    }

    static {
        t.var4();
        t.var5();
    }

    @Inject
    public RestockingTask(SquireMinerConfig squireMinerConfig) {
        this.D = squireMinerConfig;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        if (t.var8((Object)this.D.activity(), (Object)a.GRANITE)) {
            return var1[0];
        }
        int[] nArray = new int[var1[1]];
        nArray[t.var1[0]] = var1[2];
        nArray[t.var1[3]] = var1[4];
        nArray[t.var1[5]] = var1[6];
        nArray[t.var1[7]] = var1[8];
        if (t.var7(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1[0];
        }
        int[] nArray2 = new int[var1[3]];
        nArray2[t.var1[0]] = var1[2];
        if (t.var9(Inventory.getCount((int[])nArray2), var1[9])) {
            int[] nArray3 = new int[var1[3]];
            nArray3[t.var1[0]] = var1[2];
            Inventory.getFirst((int[])nArray3).interact(var2[var1[0]]);
            return var1[0];
        }
        int[] nArray4 = new int[var1[3]];
        nArray4[t.var1[0]] = var1[10];
        NPC var10 = NPCs.getNearest((int[])nArray4);
        if (t.var7(Shop.isOpen() ? 1 : 0)) {
            if (t.var6(Shop.getStock((int)var1[2]), var1[9])) {
                Shop.sellFive((int)var1[11]);
                return var1[0];
            }
            if (t.var11(Shop.getStock((int)var1[2]), var1[9])) {
                Shop.buyFifty((int)var1[2]);
                return var1[0];
            }
        }
        if (t.var3(var10) && t.var7(Reachable.isInteractable((Locatable)var10) ? 1 : 0) && t.var12(Shop.isOpen() ? 1 : 0)) {
            var10.interact(var2[var1[3]]);
            0;
            if null != null {
                return ((0x3E ^ 0xF) & ~(0x3E ^ 0xF)) != 0;
            }
        } else {
            int[] nArray5 = new int[var1[3]];
            nArray5[t.var1[0]] = var1[12];
            if (t.var7(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[var1[3]];
                nArray6[t.var1[0]] = var1[12];
                Inventory.getFirst((int[])nArray6).interact(var2[var1[5]]);
                return var1[3];
            }
            Movement.walkTo((WorldPoint)new WorldPoint(var1[13], var1[14], var1[0]));
            0;
            return var1[3];
        }
        return var1[3];
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (t.var6(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if ((0x3F ^ 0x3A) > 0) continue;
            return null;
        }
        return String.valueOf(var16);
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 >= n3;
    }

    private static void var5() {
        var2 = new String[var1[7]];
        t.var2[t.var1[0]] = "Drop";
        t.var2[t.var1[3]] = "Trade";
        t.var2[t.var1[5]] = "Drop";
    }

    private static void var4() {
        var1 = new int[15];
        t.var1[0] = (0xBC ^ 0xA9 ^ (0xB9 ^ 0xB6)) & (56 + 46 - -54 + 34 ^ 91 + 23 - 112 + 162 ^ -1);
        t.var1[1] = 0xA ^ 0xE;
        t.var1[2] = 0xFFFF8FDF & 0x773F;
        t.var1[3] = 1;
        t.var1[4] = 0xFFFFC7F1 & 0x3F2F;
        t.var1[5] = 2;
        t.var1[6] = 0xFFFFAF7F & 0x57A3;
        t.var1[7] = 3;
        t.var1[8] = 0xFFFFBF65 & 0x47BF;
        t.var1[9] = 36 + 181 - 57 + 53 ^ 170 + 166 - 168 + 25;
        t.var1[10] = 0xFFFFBFFF & 0x4729;
        t.var1[11] = -(0xFFFFBF8F & 0x7078) & (0xFFFFBF37 & 0x77EF);
        t.var1[12] = -(0xFFFFB8DD & 0x7FA3) & (0xFFFFBFA7 & Short.MAX_VALUE);
        t.var1[13] = 0xFFFFAF78 & 0x5CEF;
        t.var1[14] = -(0xFFFFD47D & 0x6FC3) & (0xFFFFFFEF & 0x4FFB);
    }

    private static boolean var8(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }
}

