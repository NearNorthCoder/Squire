/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.rangingguild.SquireRangingGuild;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Shooting Target")
public class ShootingTargetTask
extends Task {
    private static  int[] lIIIIlll;
    private static  String[] lIIIIllI;
    private final  SquireRangingGuild ga;

    private static void var1() {
        lIIIIlll = new int[5];
        bx.lIIIIlll[0] = 3 & (3 ^ -1);
        bx.lIIIIlll[1] = 1;
        bx.lIIIIlll[2] = -(0xFFFFFED9 & 0x19AF) & (0xFFFFDFFE & 0x3BFB);
        bx.lIIIIlll[3] = 0xFFFFEDFF & 0x3F8F;
        bx.lIIIIlll[4] = 2;
    }

    private static void var2() {
        lIIIIllI = new String[lIIIIlll[4]];
        bx.lIIIIllI[bx.lIIIIlll[0]] = "Wield";
        bx.lIIIIllI[bx.lIIIIlll[1]] = "Fire-at";
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        bx.var1();
        bx.var2();
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = lIIIIlll[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = lIIIIlll[0];
        while (bx.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        if (bx.var9(this.ga.cq() ? 1 : 0)) {
            return lIIIIlll[0];
        }
        int[] nArray = new int[lIIIIlll[1]];
        nArray[bx.lIIIIlll[0]] = lIIIIlll[2];
        if (bx.var9(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray2 = new int[lIIIIlll[1]];
            nArray2[bx.lIIIIlll[0]] = lIIIIlll[2];
            if (bx.var21(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                int[] nArray3 = new int[lIIIIlll[1]];
                nArray3[bx.lIIIIlll[0]] = lIIIIlll[2];
                Inventory.getFirst((int[])nArray3).interact(lIIIIllI[lIIIIlll[0]]);
            }
        }
        int[] nArray4 = new int[lIIIIlll[1]];
        nArray4[bx.lIIIIlll[0]] = lIIIIlll[3];
        TileObject var22 = TileObjects.getNearest((int[])nArray4);
        if (bx.var23(var22)) {
            var22.interact(lIIIIllI[lIIIIlll[1]]);
        }
        return lIIIIlll[1];
    }

    @Inject
    public ShootingTargetTask(SquireRangingGuild squireRangingGuild) {
        this.ga = squireRangingGuild;
    }

    private static boolean var23(Object object) {
        return object != null;
    }
}

