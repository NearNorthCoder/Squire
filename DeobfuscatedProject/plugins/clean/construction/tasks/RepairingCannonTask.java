/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.construction.tasks;

import com.google.inject.Inject;
import gg.squire.basics.combat.Cannon.CannonReloader;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Repairing cannon", priority=5, blocking=true)
public class RepairingCannonTask
extends Task {
    
    private final  CannonReloader bS;

    @Inject
    public RepairingCannonTask(CannonReloader cannonReloader) {
        this.bS = cannonReloader;
    }

    private static boolean lllIlIllIl(Object object) {
        return object == null;
    }

    private static boolean lllIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llIIllIlIIllllI;
        String[] stringArray = new String[lIIIIlllI[0]];
        stringArray[L.lIIIIlllI[1]] = lIIIIllIl[lIIIIlllI[1]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (L.lllIlIllIl(tileObject)) {
            return lIIIIlllI[1];
        }
        String[] stringArray2 = new String[lIIIIlllI[0]];
        stringArray2[L.lIIIIlllI[1]] = lIIIIllIl[lIIIIlllI[0]];
        if (L.lllIlIlllI(llIIllIlIIllllI.hasAction(stringArray2) ? 1 : 0)) {
            return lIIIIlllI[1];
        }
        if (L.lllIlIllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIIIIlllI[0];
        }
        tileObject.interact(lIIIIllIl[lIIIIlllI[2]]);
        return lIIIIlllI[0];
    }

    private static boolean lllIlIllll(int n2) {
        return n2 != 0;
    }

    static {
        L.lllIlIllII();
        L.lllIlIlIll();
    }

        return String.valueOf(llIIllIlIIIIlII);
    }

    private static boolean lllIlIlllI(int n2) {
        return n2 == 0;
    }

    private static void lllIlIlIll() {
        lIIIIllIl = new String[lIIIIlllI[3]];
        L.lIIIIllIl[L.lIIIIlllI[1]] = "Broken multicannon";
        L.lIIIIllIl[L.lIIIIlllI[0]] = "Repair";
        L.lIIIIllIl[L.lIIIIlllI[2]] = "Repair";
    }
}

