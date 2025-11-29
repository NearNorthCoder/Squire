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
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean lllllIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static boolean lllllIllIIIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIllIIIlll(Object object) {
        return object != null;
    }

    static {
        n.lllllIllIIIlII();
        n.lllllIllIIIIll();
        X = new WorldPoint(llIIlIllIIII[3], llIIlIllIIII[4], llIIlIllIIII[1]);
    }

    private static void lllllIllIIIIll() {
        llIIlIlIllll = new String[llIIlIllIIII[5]];
        n.llIIlIlIllll[n.llIIlIllIIII[1]] = "Opening";
        n.llIIlIlIllll[n.llIIlIllIIII[2]] = "Pass-through";
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
        n var2;
        if (n.lllllIllIIIlIl(Locations.isRegionLoaded((int)llIIlIllIIII[0]) ? 1 : 0)) {
            return llIIlIllIIII[1];
        }
        if (n.lllllIllIIIllI(var2.J() ? 1 : 0)) {
            return llIIlIllIIII[1];
        }
        String[] stringArray = new String[llIIlIllIIII[2]];
        stringArray[n.llIIlIllIIII[1]] = llIIlIlIllll[llIIlIllIIII[1]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (!n.lllllIllIIIlll(var3) || n.lllllIllIIIlIl(Reachable.isInteractable((Locatable)var3) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)X);

            return llIIlIllIIII[2];
        }
        var1_1.interact(llIIlIlIllll[llIIlIllIIII[2]]);
        return llIIlIllIIII[2];
    }

    private static boolean lllllIllIIIllI(int n2) {
        return n2 != 0;
    }
}

