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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.hydra.tasks.AHelper;

@TaskDesc(name="Entering hydra room", priority=5, blocking=true)
public class EnteringHydraRoomTask
extends Task {
    public static final  int ao;

    private final  a ap;

    private static boolean lIIIllllllllIIl(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
    }

    private static boolean lIIIllllllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public EnteringHydraRoomTask(a a2) {
        this.ap = a2;
    }

    static {
        n.lIIIlllllllIllI();
        n.lIIIlllllllIlIl();
        ao = llllIIlIllIl[1];
    }

    private static boolean lIIIlllllllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllllllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIIIlllllllIlIl() {
        llllIIlIllII = new String[llllIIlIllIl[3]];
        n.llllIIlIllII[n.llllIIlIllIl[0]] = "Alchemical door";
        n.llllIIlIllII[n.llllIIlIllIl[2]] = "Quick-open";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        if (n.lIIIlllllllIlll(this.ap.g() ? 1 : 0)) {
            return llllIIlIllIl[0];
        }
        RegionPoint var2 = RegionPoint.fromWorld((WorldPoint)Players.getLocal().getWorldLocation());
        if (n.lIIIllllllllIII(var2.getX(), llllIIlIllIl[1])) {
            return llllIIlIllIl[0];
        }
        String[] stringArray = new String[llllIIlIllIl[2]];
        stringArray[n.llllIIlIllIl[0]] = llllIIlIllII[llllIIlIllIl[0]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (n.lIIIllllllllIIl(var3)) {
            return llllIIlIllIl[0];
        }
        var2_2.interact(llllIIlIllII[llllIIlIllIl[2]]);
        return llllIIlIllIl[2];
    }
}

