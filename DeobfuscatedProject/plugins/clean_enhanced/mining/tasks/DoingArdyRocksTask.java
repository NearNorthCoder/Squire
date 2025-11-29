/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.mining.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.util.List;
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Doing ardy rocks", priority=100, blocking=true)
public class DoingArdyRocksTask
extends Task {

    private final  int[] O;
    @Inject
    private  SquireMinerConfig f;

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    private static void var4() {
        var1 = new int[18];
        y.var1[0] = 8 ^ 0xC;
        y.var1[1] = 2 & ~2;
        y.var1[2] = 108 + 57 - 128 + 212;
        y.var1[3] = 1;
        y.var1[4] = 211 + 110 - 156 + 86;
        y.var1[5] = 2;
        y.var1[6] = (0x12 ^ 0x21) + (127 + 117 - 154 + 122) - (160 + 176 - 228 + 70) + (135 + 75 - 99 + 57);
        y.var1[7] = 3;
        y.var1[8] = 22 + 142 - 32 + 123;
        y.var1[9] = 0xFFFFA1BF & 0x5FF8;
        y.var1[10] = 0xFFFFAFB7 & 0x57DB;
        y.var1[11] = 0xFFFFC3FB & 0x3FB6;
        y.var1[12] = 0xFFFFDBFF & 0x3CBC;
        y.var1[13] = -(0xFFFFD6EF & 0x6F53) & (0xFFFFFEFF & 0x5FFF);
        y.var1[14] = 24 + 115 - 81 + 175;
        y.var1[15] = -(0xFFFF9FA3 & 0x71DD) & (0xFFFFFFFD & 0x3DE6);
        y.var1[16] = -(0xFFFFFBDB & 0x1737) & (0xFFFFFFF7 & 0x3F7F);
        y.var1[17] = -(0xFFFFD769 & 0x78BF) & (0xFFFFDBBF & 0x7EFF);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        y var5;
        if (y.var3((Object)this.f.activity(), (Object)a.ARDY_IRON)) {
            return var1[1];
        }
        TileObject var6 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.var7(List.of(Integer.valueOf(var1[15]), Integer.valueOf(var1[16])).contains(tileObject.getId()) ? 1 : 0) && y.var8(tileObject.getWorldX(), var1[17])) {
                n2 = var1[3];
                0;
                if (3 < 0) {
                    return ((0x4D ^ 0x60) & ~(0x22 ^ 0xF)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        });
        if (y.var9(var6)) {
            return var1[1];
        }
        WorldPoint var10 = var6.getWorldLocation();
        WorldPoint var11 = Players.getLocal().getWorldLocation();
        if (y.var7(var11.toWorldArea().isInMeleeDistance(var10) ? 1 : 0)) {
            var6.interact(var2[var1[1]]);
            return var1[3];
        }
        int[] nArray = new int[var1[3]];
        nArray[y.var1[1]] = var1[9];
        int var12 = Inventory.getCount((int[])nArray);
        if (y.var8(var12, var1[3])) {
            int[] nArray2 = new int[var1[3]];
            nArray2[y.var1[1]] = var1[9];
            Inventory.getAll((int[])nArray2).subList(var1[1], Math.min(var1[7], var12)).forEach(Item::drop);
        }
        if (y.var7(var5.n() ? 1 : 0)) {
            var5.r();
        }
        var1_1.interact(var2[var1[3]]);
        this.sleep(var1[3]);
        return var1[3];
    }

    private static boolean var8(int n2, int n3) {
        return n2 > n3;
    }

    static {
        y.var4();
        y.var13();
    }

    public DoingArdyRocksTask() {
        int[] nArray = new int[var1[0]];
        nArray[y.var1[1]] = var1[2];
        nArray[y.var1[3]] = var1[4];
        nArray[y.var1[5]] = var1[6];
        nArray[y.var1[7]] = var1[8];
        this.O = nArray;
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    private void r() {
        if (y.var7(Inventory.contains((int[])this.O) ? 1 : 0)) {
            int[] nArray = new int[var1[3]];
            nArray[y.var1[1]] = var1[10];
            Inventory.getFirst((int[])this.O).useOn(Inventory.getFirst((int[])nArray));
            0;
            if (((0x3F ^ 0x1E) & ~(0x65 ^ 0x44)) != 0) {
                return;
            }
        } else {
            int[] nArray = new int[var1[3]];
            nArray[y.var1[1]] = var1[11];
            int[] nArray2 = new int[var1[5]];
            nArray2[y.var1[1]] = var1[12];
            nArray2[y.var1[3]] = var1[13];
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[1];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[1];
        while (y.var24(var23, var22)) {
            char var25 = var21[var23];
            var18.append((char)(var25 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean n() {
        int n2;
        block4: {
            block3: {
                block2: {
                    if (!y.var7(Inventory.contains((int[])this.O) ? 1 : 0)) break block2;
                    int[] nArray = new int[var1[3]];
                    nArray[y.var1[1]] = var1[10];
                    if (!y.var7(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[var1[3]];
                    nArray2[y.var1[1]] = var1[14];
                    if (!y.var14(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[var1[3]];
                nArray[y.var1[1]] = var1[11];
                if (!y.var7(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[var1[3]];
                nArray3[y.var1[1]] = var1[13];
                if (!y.var14(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[var1[3]];
                nArray4[y.var1[1]] = var1[12];
                if (!y.var7(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = var1[3];
            0;
            if null == null return n2 != 0;
            return ((0x6F ^ 0x4F ^ (0xD ^ 0x37)) & (142 + 162 - 142 + 29 ^ 26 + 21 - 24 + 142 ^ -1)) != 0;
        }
        n2 = var1[1];
        return n2 != 0;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static void var13() {
        var2 = new String[var1[5]];
        y.var2[y.var1[1]] = "Mine";
        y.var2[y.var1[3]] = "Mine";
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

