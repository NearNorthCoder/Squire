/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.hunter.tasks;

import gg.squire.hunter.tasks.HunterManager;
import gg.squire.hunter.tasks.GameEnum4;
import gg.squire.hunter.tasks.HunterTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Setting up net trap", priority=30, blocking=true)
public class SettingUpNetTrapTask
extends HunterTaskBase {

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (r.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0x22 ^ 0x26) != 3) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(Object object) {
        return object != null;
    }

    private static boolean var15(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    static {
        r.var17();
        r.var18();
    }

    private static void var18() {
        var2 = new String[var1[5]];
        r.var2[r.var1[0]] = "Set-trap";
        r.var2[r.var1[1]] = "Release";
    }

    private static boolean var19(int n2) {
        return n2 != 0;
    }

    private static boolean var20(int n2) {
        return n2 > 0;
    }

    private static int var21(float f2, float f3) {
        return f2 == f3 ? 0 : (f2 > f3 ? 1 : -1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean x() {
        void var1_1;
        r var22;
        block8: {
            block7: {
                if (!r.var19(this.y().c() ? 1 : 0) || r.var16(Movement.shouldWalk() ? 1 : 0)) {
                    return var1[0];
                }
                int[] nArray = new int[var1[1]];
                nArray[r.var1[0]] = var1[2];
                if (!r.var19(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray2 = new int[var1[1]];
                nArray2[r.var1[0]] = var1[3];
                if (!r.var16(Inventory.contains((int[])nArray2) ? 1 : 0)) break block8;
            }
            return var1[0];
        }
        TileObject var23 = var22.y().f();
        if (!r.var14(var23) || r.var20(r.var21(var23.getWorldLocation().distanceToHypotenuse(var22.y().k()), 12.0f))) {
            return var1[0];
        }
        if (r.var16(Movement.isRunEnabled() ? 1 : 0) && r.var15(Movement.getRunEnergy(), var1[4])) {
            Movement.toggleRun();
        }
        if (r.var14(Inventory.getFirst(item -> {
            String[] stringArray = new String[var1[1]];
            stringArray[r.var1[0]] = var2[var1[1]];
            return item.hasAction(stringArray);
        }))) {
            var22.y().d();
            0;
        }
        var1_1.interact(var2[var1[0]]);
        return var1[1];
    }

    private static void var17() {
        var1 = new int[6];
        r.var1[0] = (0xC0 ^ 0x9F) & ~(0x79 ^ 0x26);
        r.var1[1] = 1;
        r.var1[2] = 0xFFFFE9EF & 0x173F;
        r.var1[3] = 0xFFFFB3BF & 0x4FFA;
        r.var1[4] = 0x77 ^ 0x78;
        r.var1[5] = 2;
    }

    @Inject
    public SettingUpNetTrapTask(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig, e.SALLIES);
    }
}

