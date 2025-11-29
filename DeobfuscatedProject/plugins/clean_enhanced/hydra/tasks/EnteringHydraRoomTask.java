/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.hydra.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.hydra.tasks.HydraManager;

@TaskDesc(name="Entering hydra room", priority=5, blocking=true)
public class EnteringHydraRoomTask
extends Task {
    public static final  int ao;

    private final  a ap;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (n.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (((0x40 ^ 0x1E) & ~(0x70 ^ 0x2E)) < 1) continue;
            return null;
        }
        return String.valueOf(var7);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public EnteringHydraRoomTask(a a2) {
        this.ap = a2;
    }

    static {
        n.var21();
        n.var22();
        ao = var2[1];
    }

    private static void var21() {
        var2 = new int[4];
        n.var2[0] = (0x40 ^ 0x1D) & ~(0xC0 ^ 0x9D);
        n.var2[1] = 0x74 ^ 0x26 ^ (0x66 ^ 0x17);
        n.var2[2] = 1;
        n.var2[3] = 2;
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    private static boolean var24(int n2, int n3) {
        return n2 > n3;
    }

    private static void var22() {
        var1 = new String[var2[3]];
        n.var1[n.var2[0]] = "Alchemical door";
        n.var1[n.var2[2]] = "Quick-open";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (n.var23(this.ap.g() ? 1 : 0)) {
            return var2[0];
        }
        RegionPoint var25 = RegionPoint.fromWorld((WorldPoint)Players.getLocal().getWorldLocation());
        if (n.var24(var25.getX(), var2[1])) {
            return var2[0];
        }
        String[] stringArray = new String[var2[2]];
        stringArray[n.var2[0]] = var1[var2[0]];
        TileObject var26 = TileObjects.getNearest((String[])stringArray);
        if (n.var3(var26)) {
            return var2[0];
        }
        var2_2.interact(var1[var2[2]]);
        return var2[2];
    }
}

