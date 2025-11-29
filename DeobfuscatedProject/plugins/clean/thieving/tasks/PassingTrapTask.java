/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Passing Trap", priority=15)
public class PassingTrapTask
extends Task {

    private final  Client B;

    private static boolean lIIlIlIIlIlllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIIlIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIlIIlIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIlIlIIlIllIII() {
        llllllIllllI = new String[llllllIlllll[5]];
        h.llllllIllllI[h.llllllIlllll[1]] = "Pass";
        h.llllllIllllI[h.llllllIlllll[3]] = "Speartrap";
        h.llllllIllllI[h.llllllIlllll[4]] = "Pass";
    }

    static {
        h.lIIlIlIIlIllIIl();
        h.lIIlIlIIlIllIII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (h.lIIlIlIIlIllIlI(this.B.getVarbitValue(llllllIlllll[0]))) {
            return llllllIlllll[1];
        }
        if (h.lIIlIlIIlIllIll(Players.getLocal().getWorldLocation().getRegionID(), llllllIlllll[2])) {
            return llllllIlllll[1];
        }
        if (!h.lIIlIlIIlIllIlI(Players.getLocal().isMoving() ? 1 : 0) || h.lIIlIlIIlIlllII(Players.getLocal().isAnimating() ? 1 : 0)) {
            return llllllIlllll[1];
        }
        TileObject var1 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIIlIlIIlIlllII(tileObject.getName().contains(llllllIllllI[llllllIlllll[3]]) ? 1 : 0)) {
                String[] stringArray = new String[llllllIlllll[3]];
                stringArray[h.llllllIlllll[1]] = llllllIllllI[llllllIlllll[4]];
                if (h.lIIlIlIIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = llllllIlllll[3];

                    if ((0x2F ^ 0x38 ^ (0xBF ^ 0xAC)) != 0) return n2 != 0;
                    return false;
                }
            }
            n2 = llllllIlllll[1];
            return n2 != 0;
        });
        if (h.lIIlIlIIlIlllIl(var1)) {
            return llllllIlllll[1];
        }
        var1_1.interact(llllllIllllI[llllllIlllll[1]]);
        return llllllIlllll[3];
    }

    @Inject
    public PassingTrapTask(Client client) {
        this.B = client;
    }

    private static boolean lIIlIlIIlIlllII(int n2) {
        return n2 != 0;
    }
}

