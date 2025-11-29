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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

        return String.valueOf(var1);
    }

    static {
        i.lIIllllIlIIlIll();
        i.lIIllllIlIIlIlI();
    }

    private static boolean lIIllllIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIllllIlIIlIlI() {
        lIIIlIIIlIlll = new String[lIIIlIIIllIII[3]];
        i.lIIIlIIIlIlll[i.lIIIlIIIllIII[0]] = "Power surge";
        i.lIIIlIIIlIlll[i.lIIIlIIIllIII[1]] = "Picking up Power Surge";
        i.lIIIlIIIlIlll[i.lIIIlIIIllIII[2]] = "Activate";
    }

    @Inject
    public PickPowerUpTask(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.V = squireNightmareZone;
        this.W = squireNightmareZoneConfig;
        this.X = client;
    }

    private static boolean lIIllllIlIIllII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        i var2;
        if (i.lIIllllIlIIllII(this.W.powerSurge() ? 1 : 0)) {
            return lIIIlIIIllIII[0];
        }
        if (i.lIIllllIlIIllII(var2.X.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIllIII[0];
        }
        String[] stringArray = new String[lIIIlIIIllIII[1]];
        stringArray[i.lIIIlIIIllIII[0]] = lIIIlIIIlIlll[lIIIlIIIllIII[0]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (i.lIIllllIlIIllIl(var3)) {
            return lIIIlIIIllIII[0];
        }
        if (i.lIIllllIlIIllII(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIlIIIllIII[1];
        }
        System.out.println(lIIIlIIIlIlll[lIIIlIIIllIII[1]]);
        var1_1.interact(lIIIlIIIlIlll[lIIIlIIIllIII[2]]);
        return lIIIlIIIllIII[1];
    }

    private static boolean lIIllllIlIIllIl(Object object) {
        return object == null;
    }
}

