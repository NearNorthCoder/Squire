/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import gg.squire.tithefarm.tasks.TithefarmManager;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Watering Plant", priority=20, blocking=true)
public class WateringPlantTask
extends TithefarmTaskBase {

    static {
        v.var3();
        v.var4();
    }

    private static boolean var5(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static void var3() {
        var1 = new int[6];
        v.var1[0] = 1;
        v.var1[1] = (235 + 102 - 258 + 165 ^ 69 + 100 - 95 + 125) & (0x24 ^ 0x3C ^ (0 ^ 0x2B) ^ -1);
        v.var1[2] = -(0xFFFFEAD5 & 0x55AF) & (0xFFFFFCEF & 0x77BD);
        v.var1[3] = 2;
        v.var1[4] = -(0xFFFFA28D & 0x7F7F) & (0xFFFFBFDF & 0x76FF);
        v.var1[5] = 0xFFFF9CDC & 0x77FF;
    }

    private static boolean var7(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var8(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        v var9;
        int[] nArray = new int[var1[0]];
        nArray[v.var1[1]] = var1[2];
        Item item2 = Inventory.getFirst((int[])nArray);
        if (v.var10(Inventory.contains(item -> {
            int n2;
            if (v.var5(item.getId(), var1[4]) && v.var7(item.getId(), var1[5])) {
                n2 = var1[0];
                0;
                if (-(0x33 ^ 0x39 ^ (0x64 ^ 0x6A)) > 0) {
                    return ((127 + 130 - 80 + 6 ^ 31 + 29 - 54 + 128) & (0x49 ^ 0x37 ^ (0x6A ^ 0x25) ^ -1)) != 0;
                }
            } else {
                n2 = var1[1];
            }
            return n2 != 0;
        }) ? 1 : 0) && v.var6(item2)) {
            return var1[1];
        }
        TileObject var11 = var9.Z.a(var2[var1[1]]);
        if (v.var6(var11)) {
            return var1[1];
        }
        var11.interact(var2[var1[0]]);
        GameObject var12 = (GameObject)var11;
        Player var13 = Players.getLocal();
        if (v.var14(var12.getWorldArea().isInMeleeDistance(var13.getWorldArea()) ? 1 : 0)) {
            var9.sleep(var1[3]);
        }
        return var1[0];
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[1];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[1];
        while (v.var8(var23, var22)) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if ((0x90 ^ 0x94) != 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    @Inject
    protected WateringPlantTask(i i2) {
        super(i2);
    }

    private static void var4() {
        var2 = new String[var1[3]];
        v.var2[v.var1[1]] = "Water";
        v.var2[v.var1[0]] = "Water";
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }
}

