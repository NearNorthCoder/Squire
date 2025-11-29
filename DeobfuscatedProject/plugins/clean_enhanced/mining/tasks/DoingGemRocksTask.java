/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
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
import javax.inject.Inject;
import gg.squire.mining.tasks.GameEnum5;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Doing gem rocks", priority=100, blocking=true)
public class DoingGemRocksTask
extends Task {
    
    @Inject
    private  SquireMinerConfig f;
    
    private final  int[] w;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
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
                    if (!r.var9(Inventory.contains((int[])this.w) ? 1 : 0)) break block2;
                    int[] nArray = new int[var1[3]];
                    nArray[r.var1[1]] = var1[9];
                    if (!r.var9(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                    int[] nArray2 = new int[var1[3]];
                    nArray2[r.var1[1]] = var1[13];
                    if (!r.var10(Inventory.contains((int[])nArray2) ? 1 : 0)) break block3;
                }
                int[] nArray = new int[var1[3]];
                nArray[r.var1[1]] = var1[10];
                if (!r.var9(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray3 = new int[var1[3]];
                nArray3[r.var1[1]] = var1[12];
                if (!r.var10(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[var1[3]];
                nArray4[r.var1[1]] = var1[11];
                if (!r.var9(Inventory.contains((int[])nArray4) ? 1 : 0)) break block4;
            }
            n2 = var1[3];
            0;
            if (-(0xB0 ^ 0xB4) <= 0) return n2 != 0;
            return ((0xAD ^ 0xB3) & ~(0x4E ^ 0x50)) != 0;
        }
        n2 = var1[1];
        return n2 != 0;
    }

    private static boolean var11(Object object) {
        return object == null;
    }

    private static void var12() {
        var1 = new int[16];
        r.var1[0] = 0xA ^ 0xE;
        r.var1[1] = (3 ^ (2 ^ 9)) & (93 + 128 - 171 + 105 ^ 139 + 41 - 93 + 60 ^ -1);
        r.var1[2] = 223 + 121 - 101 + 6;
        r.var1[3] = 1;
        r.var1[4] = 121 + 66 - 10 + 74;
        r.var1[5] = 2;
        r.var1[6] = 204 + 54 - 109 + 104;
        r.var1[7] = 3;
        r.var1[8] = 32 + 184 - 43 + 82;
        r.var1[9] = -(0xFFFFB869 & Short.MAX_VALUE) & (0xFFFFFFFB & 0x3FFF);
        r.var1[10] = 0xFFFFC3FF & 0x3FB2;
        r.var1[11] = -2 & (0xFFFFBBBD & 0x5CFF);
        r.var1[12] = -(0xFFFFE553 & 0x1FEF) & (0xFFFFDDFF & 0x3FFF);
        r.var1[13] = (0x93 ^ 0x8B) + (66 + 190 - 140 + 104) - (101 + 144 - 171 + 76) + (113 + 86 - 145 + 85);
        r.var1[14] = -(0xFFFFDCCF & 0x73BC) & (0xFFFFFEFF & 0x7DFF);
        r.var1[15] = 0xFFFF8F3F & 0x7BD3;
    }

    static {
        r.var12();
        r.var13();
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private void DoingGemRocksTask() {
        if (r.var9(Inventory.contains((int[])this.w) ? 1 : 0)) {
            int[] nArray = new int[var1[3]];
            nArray[r.var1[1]] = var1[9];
            Inventory.getFirst((int[])this.w).useOn(Inventory.getFirst((int[])nArray));
            0;
            if ((0xD3 ^ 0xA4 ^ (0x47 ^ 0x34)) < 3) {
                return;
            }
        } else {
            int[] nArray = new int[var1[3]];
            nArray[r.var1[1]] = var1[10];
            int[] nArray2 = new int[var1[5]];
            nArray2[r.var1[1]] = var1[11];
            nArray2[r.var1[3]] = var1[12];
            Inventory.getFirst((int[])nArray).useOn(Inventory.getFirst((int[])nArray2));
        }
    }

    private static void var13() {
        var2 = new String[var1[5]];
        r.var2[r.var1[1]] = "Mine";
        r.var2[r.var1[3]] = "Mine";
    }

    private static boolean var14(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var15;
        if (r.var16((Object)this.f.activity(), (Object)a.GEM_ROCKS)) {
            return var1[1];
        }
        if (r.var9(Inventory.isFull() ? 1 : 0)) {
            return var1[1];
        }
        TileObject var17 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.var14(tileObject.getId(), var1[14]) && r.var18(tileObject.getWorldX(), var1[15])) {
                n2 = var1[3];
                0;
                if (3 <= 2) {
                    return ((0x6E ^ 0x25 ^ (3 ^ 0x77)) & (0x33 ^ 0x53 ^ (7 ^ 0x58) ^ -1)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        });
        if (r.var11(var17)) {
            return var1[1];
        }
        WorldPoint var19 = var17.getWorldLocation();
        WorldPoint var20 = Players.getLocal().getWorldLocation();
        if (r.var9(var20.toWorldArea().isInMeleeDistance(var19) ? 1 : 0)) {
            var17.interact(var2[var1[1]]);
            return var1[3];
        }
        if (r.var9(var15.n() ? 1 : 0)) {
            var15.DoingGemRocksTask();
        }
        var1_1.interact(var2[var1[3]]);
        this.sleep(var1[3]);
        return var1[3];
    }

    private static boolean var18(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var16(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    public DoingGemRocksTask() {
        int[] nArray = new int[var1[0]];
        nArray[r.var1[1]] = var1[2];
        nArray[r.var1[3]] = var1[4];
        nArray[r.var1[5]] = var1[6];
        nArray[r.var1[7]] = var1[8];
        this.w = nArray;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static String var22(String var23, String var24) {
        var23 = new String(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var25 = new StringBuilder();
        char[] var26 = var24.toCharArray();
        int var27 = var1[1];
        char[] var28 = var23.toCharArray();
        int var29 = var28.length;
        int var30 = var1[1];
        while (r.var21(var30, var29)) {
            char var31 = var28[var30];
            var25.append((char)(var31 ^ var26[var27 % var26.length]));
            0;
            ++var27;
            ++var30;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var25);
    }
}

