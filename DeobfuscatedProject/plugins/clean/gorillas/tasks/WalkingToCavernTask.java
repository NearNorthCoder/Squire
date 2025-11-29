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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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

        return String.valueOf(var1);
    }

    private static boolean lllllIlIIllIlI(Object object) {
        return object != null;
    }

    private static boolean lllllIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public WalkingToCavernTask(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    private static boolean lllllIlIIllIIl(int n2) {
        return n2 == 0;
    }

    private static void lllllIlIIlIllI() {
        llIIlIIlllll = new String[llIIlIlIIIII[5]];
        k.llIIlIIlllll[k.llIIlIlIIIII[0]] = "Cavern entrance";
        k.llIIlIIlllll[k.llIIlIlIIIII[2]] = "Enter";
    }

    private static boolean lllllIlIIllIII(int n2) {
        return n2 != 0;
    }

    static {
        k.lllllIlIIlIlll();
        k.lllllIlIIlIllI();
        V = llIIlIlIIIII[1];
        W = new WorldPoint(llIIlIlIIIII[3], llIIlIlIIIII[4], llIIlIlIIIII[0]);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (k.lllllIlIIllIII(this.J() ? 1 : 0)) {
            return llIIlIlIIIII[0];
        }
        if (k.lllllIlIIllIIl(Locations.isRegionLoaded((int)llIIlIlIIIII[1]) ? 1 : 0)) {
            return llIIlIlIIIII[0];
        }
        String[] stringArray = new String[llIIlIlIIIII[2]];
        stringArray[k.llIIlIlIIIII[0]] = llIIlIIlllll[llIIlIlIIIII[0]];
        TileObject var2 = TileObjects.getNearest((String[])stringArray);
        if (!k.lllllIlIIllIlI(var2) || k.lllllIlIIllIIl(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)W);

            return llIIlIlIIIII[2];
        }
        var1_1.interact(llIIlIIlllll[llIIlIlIIIII[2]]);
        return llIIlIlIIIII[2];
    }

}

