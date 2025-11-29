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

@TaskDesc(name="Walking to cavern")
public class WalkingToCavernTask
extends GorillasTaskBase {
    
    private static final  int V;
    private static final  WorldPoint W;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Inject
    public WalkingToCavernTask(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    static {
        k.var13();
        k.var14();
        V = 1;
        W = new WorldPoint(3, 4, 0);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if ((this.J( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((Locations.isRegionLoaded((int == 0)1) ? 1 : 0)) {
            return 0;
        }
        String[] stringArray = new String[2];
        stringArray[0] = var2[0];
        TileObject var15 = TileObjects.getNearest((String[])stringArray);
        if (!var15 != null || (Reachable.isInteractable((Locatable == 0)var15) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)W);
            0;
            return 2;
        }
        var1_1.interact(var2[2]);
        return 2;
    }
}

