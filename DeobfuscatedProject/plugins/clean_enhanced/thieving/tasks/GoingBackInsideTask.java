/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.thieving.tasks.ThievingTaskBase;

@TaskDesc(name="Going back inside", priority=0x7FFFFFFF, blocking=true)
public class GoingBackInsideTask
extends ThievingTaskBase {

    private static void var3() {
        var2 = new int[5];
        v.var2[0] = 93 + 58 - 35 + 75 ^ 65 + 25 - 67 + 163;
        v.var2[1] = 1;
        v.var2[2] = (0x91 ^ 0xAB) & ~(0x35 ^ 0xF);
        v.var2[3] = 2;
        v.var2[4] = 0xCC ^ 0xC4;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean l() {
        if (v.var10(Movement.isRunEnabled() ? 1 : 0) && v.var11(Movement.getRunEnergy(), var2[0])) {
            Movement.toggleRun();
            return var2[1];
        }
        if (v.var10(Movement.shouldWalk() ? 1 : 0)) {
            return var2[2];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[v.var2[2]] = var1[var2[2]];
        TileObject var12 = TileObjects.getNearest((String[])stringArray);
        if (v.var13(var12)) {
            var12.interact(var1[var2[1]]);
            return var2[1];
        }
        return var2[2];
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static void var15() {
        var1 = new String[var2[3]];
        v.var1[v.var2[2]] = "Lizard dwelling";
        v.var1[v.var2[1]] = "Enter";
    }

    @Inject
    public GoingBackInsideTask(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        super(squireThieving, squireThievingConfig);
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = var2[2];
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = var2[2];
        while (v.var14(var24, var23)) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if ((0x83 ^ 0x98 ^ (0xD ^ 0x12)) > 2) continue;
            return null;
        }
        return String.valueOf(var19);
    }

    static {
        v.var3();
        v.var15();
    }
}

