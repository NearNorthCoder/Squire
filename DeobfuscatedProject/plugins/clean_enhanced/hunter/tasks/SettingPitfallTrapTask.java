/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Setting Pitfall Trap")
public class SettingPitfallTrapTask
extends HunterTaskBase {

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean x() {
        void var1_1;
        int[] nArray = new int[var1[0]];
        nArray[y.var1[1]] = var1[2];
        if (y.var4(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return var1[1];
        }
        TileObject var6 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.var7(var2[var1[0]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[var1[0]];
                stringArray[y.var1[1]] = var2[var1[3]];
                if (y.var7(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[0];
                    0;
                    if null == null return n2 != 0;
                    return ((0x3C ^ 5 ^ (0x5C ^ 0x2E)) & (0x9B ^ 0xB8 ^ (0xC0 ^ 0xA8) ^ -1)) != 0;
                }
            }
            n2 = var1[1];
            return n2 != 0;
        });
        if (y.var5(var6)) {
            return var1[1];
        }
        var1_1.interact(var2[var1[1]]);
        return var1[0];
    }

    @Inject
    public SettingPitfallTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.PITFALL);
    }

    private static void var8() {
        var2 = new String[var1[4]];
        y.var2[y.var1[1]] = "Trap";
        y.var2[y.var1[0]] = "Pit";
        y.var2[y.var1[3]] = "Trap";
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = var1[1];
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = var1[1];
        while (y.var3(var17, var16)) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 <= 2) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    static {
        y.var19();
        y.var8();
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    private static void var19() {
        var1 = new int[5];
        y.var1[0] = 1;
        y.var1[1] = (0x15 ^ 0x1D) & ~(0xB7 ^ 0xBF);
        y.var1[2] = 0xFFFF87F7 & 0x7DEF;
        y.var1[3] = 2;
        y.var1[4] = 3;
    }
}

