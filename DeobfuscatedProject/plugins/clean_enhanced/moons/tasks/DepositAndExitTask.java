/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.moons.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;

@TaskDesc(name="Deposit and exit")
public class DepositAndExitTask
extends Task {

    final  WorldArea M;

    private static boolean var3(int n) {
        return n != 0;
    }

    private static void var4() {
        var1 = new int[18];
        e.var1[0] = -(0xFFFFBE39 & 0x69EF) & (0xFFFFADFF & 0x7FFB);
        e.var1[1] = 0xFFFFE57B & 0x3FDD;
        e.var1[2] = 0x6A ^ 0x41;
        e.var1[3] = 0xB9 ^ 0x93;
        e.var1[4] = (0x35 ^ 0x50 ^ (0x88 ^ 0xA6)) & (99 + 99 - 98 + 103 ^ 13 + 25 - 9 + 99 ^ -1);
        e.var1[5] = 0xFFFFEED6 & 0x37AB;
        e.var1[6] = 1;
        e.var1[7] = 0xFFFFE7EB & 0x3E97;
        e.var1[8] = -(0xFFFFFB63 & 0x5DE) & (0xFFFFB7F5 & 0x6FCF);
        e.var1[9] = -(0xFFFFEC5F & 0x7BA9) & (0xFFFFEB6F & 0x7FFC);
        e.var1[10] = 0x78 ^ 0x26 ^ (0x1A ^ 0x50);
        e.var1[11] = 2;
        e.var1[12] = 3;
        e.var1[13] = 0x78 ^ 0x7C;
        e.var1[14] = -(0xFFFFDAF1 & 0x6F1F) & (0xFFFFEFFD & 0x5FFB);
        e.var1[15] = -(0xFFFFDD9C & 0x32E7) & (0xFFFFFFFF & 0x35FF);
        e.var1[16] = 0x8A ^ 0xB3 ^ (0xFB ^ 0xC7);
        e.var1[17] = 0x36 ^ 0x3E;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    static {
        e.var4();
        e.var11();
    }

    private static void var11() {
        var2 = new String[var1[16]];
        e.var2[e.var1[4]] = "Depositing to bank";
        e.var2[e.var1[6]] = "Bank-all";
        e.var2[e.var1[11]] = "Exiting to Cavern";
        e.var2[e.var1[12]] = "Pass-through";
        e.var2[e.var1[13]] = "Entrance";
    }

    public boolean run() {
        e var12;
        if (e.var13(Vars.getBit((int)var1[5]), var1[6]) && e.var13(Vars.getBit((int)var1[7]), var1[6]) && e.var13(Vars.getBit((int)var1[8]), var1[6])) {
            return var1[4];
        }
        if (e.var14(var12.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return var1[4];
        }
        if (e.var3(var12.M.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            TileObject var15;
            Widget var16 = Widgets.get((int)var1[9], (int)var1[10]);
            if (e.var17(var16)) {
                SquireMoonsOfPeril.g = var2[var1[4]];
                var16.interact(var2[var1[6]]);
                return var1[6];
            }
            if (e.var18(var16) && e.var17(var15 = TileObjects.getNearest(tileObject -> {
                int n;
                if (e.var3(tileObject.getName().contains(var2[var1[13]]) ? 1 : 0) && e.var19(tileObject.getWorldLocation().distanceTo(new WorldPoint(var1[14], var1[15], var1[4])), var1[16])) {
                    n = var1[6];
                    0;
                    if (((0x2A ^ 7) & ~(0x31 ^ 0x1C)) <= -1) {
                        return ((0xA6 ^ 0x9E) & ~(0x87 ^ 0xBF)) != 0;
                    }
                } else {
                    n = var1[4];
                }
                return n != 0;
            }))) {
                SquireMoonsOfPeril.g = var2[var1[11]];
                var15.interact(var2[var1[12]]);
                return var1[6];
            }
        }
        return var1[4];
    }

    private static boolean var20(int n, int n2) {
        return n < n2;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n) {
        return n == 0;
    }

    private static String var27(String var28, String var29) {
        var28 = new String(Base64.getDecoder().decode(var28.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var30 = new StringBuilder();
        char[] var31 = var29.toCharArray();
        int var32 = var1[4];
        char[] var33 = var28.toCharArray();
        int var34 = var33.length;
        int var35 = var1[4];
        while (e.var20(var35, var34)) {
            char var36 = var33[var35];
            var30.append((char)(var36 ^ var31[var32 % var31.length]));
            0;
            ++var32;
            ++var35;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var30);
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    private static boolean var19(int n, int n2) {
        return n <= n2;
    }

    private static boolean var13(int n, int n2) {
        return n == n2;
    }

    public DepositAndExitTask() {
        this.M = new WorldArea(var1[0], var1[1], var1[2], var1[3], var1[4]);
    }

    private static boolean var17(Object object) {
        return object != null;
    }
}

