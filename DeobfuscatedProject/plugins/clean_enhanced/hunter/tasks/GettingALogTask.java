/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.HunterManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Getting a log")
public class GettingALogTask
extends HunterManager {

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (v.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((77 + 18 - 71 + 169 ^ 67 + 1 - -46 + 83) > 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    @Inject
    public GettingALogTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    static {
        v.var15();
        v.var16();
    }

    private static boolean var17(Object object) {
        return object != null;
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        TileObject var19;
        NPC nPC;
        TileObject tileObject2 = this.G();
        if (v.var17(tileObject2)) {
            void var20;
            nPC = this.E();
            if (v.var18(nPC) && v.var18(nPC = this.D())) {
                return var1[0];
            }
            if (v.var21(((GameObject)var20).getWorldArea().contains(var19.getWorldLocation()) ? 1 : 0)) {
                return var1[0];
            }
        }
        int[] nArray = new int[var1[1]];
        nArray[v.var1[0]] = var1[2];
        if (v.var14(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1[0];
        }
        var19 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (v.var14(var2[var1[1]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[var1[1]];
                stringArray[v.var1[0]] = var2[var1[3]];
                if (v.var14(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[1];
                    0;
                    if null == null return n2 != 0;
                    return ((0xA3 ^ 0xAE) & ~(0x79 ^ 0x74)) != 0;
                }
            }
            n2 = var1[0];
            return n2 != 0;
        });
        if (v.var18(var19)) {
            return var1[0];
        }
        nPC.interact(var2[var1[0]]);
        return var1[1];
    }

    private static void var16() {
        var2 = new String[var1[4]];
        v.var2[v.var1[0]] = "Chop down";
        v.var2[v.var1[1]] = "Tree";
        v.var2[v.var1[3]] = "Chop down";
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    private static void var15() {
        var1 = new int[5];
        v.var1[0] = (0xE ^ 0x61 ^ (0x69 ^ 0x59)) & (6 ^ 0x7C ^ (0x9A ^ 0xBF) ^ -1);
        v.var1[1] = 1;
        v.var1[2] = -(0xFFFFE5EB & 0x5A1D) & (0xFFFFF7EF & 0x4DFF);
        v.var1[3] = 2;
        v.var1[4] = 3;
    }
}

