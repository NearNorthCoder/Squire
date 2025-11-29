/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;

@TaskDesc(name="Building work area", priority=0x7FFFFFFF, blocking=true)
public class BuildingWorkAreaTask
extends Task {

    private final  a ae;
    private final  Client af;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    @Inject
    public BuildingWorkAreaTask(a a2, Client client) {
        this.ae = a2;
        this.af = client;
    }

    static {
        d.var10();
        d.var11();
    }

    private static void var10() {
        var2 = new int[5];
        d.var2[0] = (0x30 ^ 0x65) & ~(0x46 ^ 0x13);
        d.var2[1] = 1;
        d.var2[2] = 2;
        d.var2[3] = 3;
        d.var2[4] = 53 + 188 - 102 + 63 ^ 151 + 190 - 339 + 192;
    }

    private static boolean var12(Object object) {
        return object == null;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean var19(Object object) {
        return object != null;
    }

    private static boolean var20(int n2) {
        return n2 == 0;
    }

    private static boolean var21(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_2;
        void var2_1;
        boolean bl;
        d var22;
        if (d.var20(this.af.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        if (d.var9(var22.ae.M() ? 1 : 0)) {
            return var2[0];
        }
        if (d.var19(var22.ae.N())) {
            return var2[0];
        }
        NPC var23 = NPCs.getNearest(nPC -> {
            String[] stringArray = new String[var2[1]];
            stringArray[d.var2[0]] = var1[var2[2]];
            return nPC.hasAction(stringArray);
        });
        String[] stringArray = new String[var2[1]];
        stringArray[d.var2[0]] = var1[var2[0]];
        TileObject var24 = TileObjects.getNearest((String[])stringArray);
        if (!d.var19(var23) || d.var12(var24)) {
            return var2[0];
        }
        if (d.var21(var23.getWorldLocation().getX(), var24.getWorldLocation().getX())) {
            bl = var2[1];
            0;
            if (1 >= 3) {
                return ((0x3E ^ 0x11) & ~(9 ^ 0x26)) != 0;
            }
        } else {
            bl = var2[0];
        }
        boolean bl2 = bl;
        c c2 = new TemporossManager(var2_1.getWorldLocation(), var3_2.getWorldLocation(), bl2);
        this.ae.a(c2);
        System.out.println(var1[var2[1]]);
        return var2[1];
    }

    private static void var11() {
        var1 = new String[var2[3]];
        d.var1[d.var2[0]] = "Harpoonfish cannon";
        d.var1[d.var2[1]] = "Successfully set work area";
        d.var1[d.var2[2]] = "Forfeit";
    }
}

