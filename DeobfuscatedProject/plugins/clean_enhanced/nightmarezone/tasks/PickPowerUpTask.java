/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.nightmarezone.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Pick Power Up", priority=10, blocking=true)
public class PickPowerUpTask
extends Task {
    private final  SquireNightmareZoneConfig W;
    
    private final  SquireNightmareZone V;
    private final  Client X;

    private static void var3() {
        var2 = new int[4];
        i.var2[0] = (0xC9 ^ 0x8A) & ~(0x23 ^ 0x60);
        i.var2[1] = 1;
        i.var2[2] = 2;
        i.var2[3] = 3;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (i.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (-1 == -1) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    static {
        i.var3();
        i.var15();
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var15() {
        var1 = new String[var2[3]];
        i.var1[i.var2[0]] = "Power surge";
        i.var1[i.var2[1]] = "Picking up Power Surge";
        i.var1[i.var2[2]] = "Activate";
    }

    @Inject
    public PickPowerUpTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.V = squireNightmareZone;
        this.W = squireNightmareZoneConfig;
        this.X = client;
    }

    private static boolean var22(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        i var23;
        if (i.var22(this.W.powerSurge() ? 1 : 0)) {
            return var2[0];
        }
        if (i.var22(var23.X.isInInstancedRegion() ? 1 : 0)) {
            return var2[0];
        }
        String[] stringArray = new String[var2[1]];
        stringArray[i.var2[0]] = var1[var2[0]];
        TileObject var24 = TileObjects.getNearest((String[])stringArray);
        if (i.var25(var24)) {
            return var2[0];
        }
        if (i.var22(Movement.shouldWalk() ? 1 : 0)) {
            return var2[1];
        }
        System.out.println(var1[var2[1]]);
        var1_1.interact(var1[var2[2]]);
        return var2[1];
    }

    private static boolean var25(Object object) {
        return object == null;
    }
}

