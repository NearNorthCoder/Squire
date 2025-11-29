/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.gorillas.tasks.GorillasTaskBase;

@TaskDesc(name="Walking to gate")
public class WalkingToGateTask
extends GorillasTaskBase {

    private static final  WorldPoint X;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            
            return null;
        }
        return String.valueOf(var12);
    }

    static {
        n.var19();
        n.var20();
        X = new WorldPoint(3, 4, 1);
    }

    @Inject
    public WalkingToGateTask(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        n var21;
        if ((Locations.isRegionLoaded((int == 0)0) ? 1 : 0)) {
            return 1;
        }
        if ((var21.J( != 0) ? 1 : 0)) {
            return 1;
        }
        String[] stringArray = new String[2];
        stringArray[1] = var1[1];
        TileObject var22 = TileObjects.getNearest((String[])stringArray);
        if (!var22 != null || (Reachable.isInteractable((Locatable == 0)var22) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)X);
            0;
            return 2;
        }
        var1_1.interact(var1[2]);
        return 2;
    }

}

