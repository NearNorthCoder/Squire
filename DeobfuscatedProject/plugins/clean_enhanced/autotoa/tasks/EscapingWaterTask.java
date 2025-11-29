/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum6;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Escaping water", priority=50, blocking=true)
public class EscapingWaterTask
extends AutotoaManager {

    @Inject
    protected EscapingWaterTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static void var3() {
        var1 = new int[5];
        bT.var1[0] = (107 + 122 - 225 + 169 ^ 126 + 94 - 182 + 119) & (0x43 ^ 0x4C ^ (0x16 ^ 0x29) ^ -1);
        bT.var1[1] = 0x24 ^ 0x3A;
        bT.var1[2] = 1;
        bT.var1[3] = 2;
        bT.var1[4] = 0x33 ^ 0x3B;
    }

    private static boolean var4(int n2) {
        return n2 == 0;
    }

    private static void var5() {
        var2 = new String[var1[3]];
        bT.var2[bT.var1[0]] = "Rock steps";
        bT.var2[bT.var1[2]] = "Climb-up";
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean var12(Object object) {
        return object == null;
    }

    private static boolean var13(int n2) {
        return n2 != 0;
    }

    static {
        bT.var3();
        bT.var5();
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var3_3;
        bT var20;
        NPC nPC = this.cB();
        if (bT.var12(nPC)) {
            return var1[0];
        }
        Point var21 = new Point(var1[1], var1[1]);
        if (!bT.var4(Reachable.isWalkable((WorldPoint)var20.a(var21)) ? 1 : 0) || bT.var13(Reachable.isObstacle((WorldPoint)var20.a(var21)) ? 1 : 0)) {
            return var1[0];
        }
        String[] stringArray = new String[var1[2]];
        stringArray[bT.var1[0]] = var2[var1[0]];
        TileObject var22 = TileObjects.getNearest((String[])stringArray);
        if (bT.var12(var22)) {
            return var1[0];
        }
        if (bT.var23((Object)var20.cF(), (Object)bY.ATTACK)) {
            Movement.setDestination((WorldPoint)var22.getWorldLocation());
            return var1[2];
        }
        var3_3.interact(var2[var1[2]]);
        return var1[2];
    }

    private static boolean var23(Object object, Object object2) {
        return object != object2;
    }
}

