/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Passing Trap", priority=15)
public class PassingTrapTask
extends Task {

    private final  Client B;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static boolean var11(int n2, int n3) {
        return n2 != n3;
    }

    private static void var12() {
        var1 = new int[7];
        h.var1[0] = 0xFFFFDBFF & 0x2D3D;
        h.var1[1] = 3 & ~3;
        h.var1[2] = -(0xFFFFCFE3 & 0x713F) & (0xFFFFFFEF & 0x5F77);
        h.var1[3] = 1;
        h.var1[4] = 2;
        h.var1[5] = 3;
        h.var1[6] = 0x50 ^ 0x58;
    }

    private static void var13() {
        var2 = new String[var1[5]];
        h.var2[h.var1[1]] = "Pass";
        h.var2[h.var1[3]] = "Speartrap";
        h.var2[h.var1[4]] = "Pass";
    }

    static {
        h.var12();
        h.var13();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (h.var10(this.B.getVarbitValue(var1[0]))) {
            return var1[1];
        }
        if (h.var11(Players.getLocal().getWorldLocation().getRegionID(), var1[2])) {
            return var1[1];
        }
        if (!h.var10(Players.getLocal().isMoving() ? 1 : 0) || h.var14(Players.getLocal().isAnimating() ? 1 : 0)) {
            return var1[1];
        }
        TileObject var15 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.var14(tileObject.getName().contains(var2[var1[3]]) ? 1 : 0)) {
                String[] stringArray = new String[var1[3]];
                stringArray[h.var1[1]] = var2[var1[4]];
                if (h.var14(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = var1[3];
                    0;
                    if ((0x2F ^ 0x38 ^ (0xBF ^ 0xAC)) != 0) return n2 != 0;
                    return ((110 + 99 - 89 + 69 ^ 15 + 121 - 104 + 103) & (95 + 75 - 141 + 127 ^ 95 + 86 - 117 + 102 ^ -1)) != 0;
                }
            }
            n2 = var1[1];
            return n2 != 0;
        });
        if (h.var9(var15)) {
            return var1[1];
        }
        var1_1.interact(var2[var1[1]]);
        return var1[3];
    }

    @Inject
    public PassingTrapTask(Client client) {
        this.B = client;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }
}

