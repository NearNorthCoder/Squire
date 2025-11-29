/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.cerberus.SquireCerberus;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.construction.tasks.ConstructionManager;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Traversing to Cerberus", priority=155)
public class TraversingToCerberusTask
extends Task {
    private final  SquireCerberus aQ;
    private final  a aS;
    
    private final  SquireCerberusConfig aR;

    @Inject
    public TraversingToCerberusTask(SquireCerberus squireCerberus, SquireCerberusConfig squireCerberusConfig, a a2) {
        this.aQ = squireCerberus;
        this.aR = squireCerberusConfig;
        this.aS = a2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        A llIIIIIlIlIIlII;
        if (A.lIIlIIlIlll(this.aQ.r() ? 1 : 0)) {
            return lIlIIlllI[0];
        }
        if (A.lIIlIIlIlll(llIIIIIlIlIIlII.aS.l() ? 1 : 0)) {
            return lIlIIlllI[0];
        }
        if (A.lIIlIIllIII(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIlllI[0];
        }
        String[] stringArray = new String[lIlIIlllI[1]];
        stringArray[A.lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[0]];
        NPC llIIIIIlIlIIIll = NPCs.getNearest((String[])stringArray);
        if (A.lIIlIIllIIl(llIIIIIlIlIIlII.aS.k()) && A.lIIlIIllIlI(llIIIIIlIlIIIll)) {
            llIIIIIlIlIIlII.aS.a(llIIIIIlIlIIIll);
        }
        if (A.lIIlIIllIlI(llIIIIIlIlIIIll)) {
            return lIlIIlllI[0];
        }
        if (A.lIIlIIllIlI(llIIIIIlIlIIlII.aS.b())) {
            Log.info((String)lIlIIllIl[lIlIIlllI[1]]);
            return llIIIIIlIlIIlII.aS.c();
        }
        String[] stringArray2 = new String[lIlIIlllI[1]];
        stringArray2[A.lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[2]];
        TileObject llIIIIIlIlIIIlI = TileObjects.getNearest((String[])stringArray2);
        if (A.lIIlIIllIlI(llIIIIIlIlIIIlI)) {
            Log.info((String)lIlIIllIl[lIlIIlllI[3]]);
            WorldPoint llIIIIIlIlIIIIl = Players.getLocal().getWorldLocation();
            Movement.setDestination((WorldPoint)new WorldPoint(llIIIIIlIlIIIIl.getX(), llIIIIIlIlIIIIl.getY() + lIlIIlllI[4], llIIIIIlIlIIIIl.getPlane()));
            return lIlIIlllI[1];
        }
        String[] stringArray3 = new String[lIlIIlllI[1]];
        stringArray3[A.lIlIIlllI[0]] = lIlIIllIl[lIlIIlllI[5]];
        TileObject llIIIIIlIlIIIIl = TileObjects.getNearest((String[])stringArray3);
        if (A.lIIlIIllIIl(llIIIIIlIlIIIIl)) {
            WorldPoint llIIIIIlIlIIIII = new WorldPoint(lIlIIlllI[6], lIlIIlllI[7], lIlIIlllI[0]);
            return Movement.walkTo((WorldPoint)llIIIIIlIlIIIII);
        }
        Log.info((String)lIlIIllIl[lIlIIlllI[8]]);
        var3_4.interact(lIlIIllIl[lIlIIlllI[9]]);
        this.sleep(lIlIIlllI[9]);
        return lIlIIlllI[1];
    }

        return String.valueOf(llIIIIIlIIIIllI);
    }

    private static boolean lIIlIIlIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIlIIlIlIl() {
        lIlIIllIl = new String[lIlIIlllI[10]];
        A.lIlIIllIl[A.lIlIIlllI[0]] = "Cerberus";
        A.lIlIIllIl[A.lIlIIlllI[1]] = "Passing flames";
        A.lIlIIllIl[A.lIlIIlllI[2]] = "Portcullis";
        A.lIlIIllIl[A.lIlIIlllI[3]] = "We are inside the Cerb lair, but there are no flames.";
        A.lIlIIllIl[A.lIlIIlllI[5]] = "Iron Winch";
        A.lIlIIllIl[A.lIlIIlllI[8]] = "Turning winch";
        A.lIlIIllIl[A.lIlIIlllI[9]] = "Turn";
    }

    private static boolean lIIlIIllIIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        A.lIIlIIlIllI();
        A.lIIlIIlIlIl();
    }

    private static boolean lIIlIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIllIlI(Object object) {
        return object != null;
    }
}

