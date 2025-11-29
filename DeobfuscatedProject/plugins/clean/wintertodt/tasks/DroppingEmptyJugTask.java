/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.wintertodt.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping empty jug")
public class DroppingEmptyJugTask
extends Task {

    private static boolean llIIIIllIIllIll(int n2) {
        return n2 == 0;
    }

    private static void llIIIIllIIllIIl() {
        lIlIllllIllll = new String[lIlIlllllIIIl[0]];
        k.lIlIllllIllll[k.lIlIlllllIIIl[1]] = "Drop";
    }

    static {
        k.llIIIIllIIllIlI();
        k.llIIIIllIIllIIl();
    }

    public boolean run() {
        int[] nArray = new int[lIlIlllllIIIl[0]];
        nArray[k.lIlIlllllIIIl[1]] = lIlIlllllIIIl[2];
        if (k.llIIIIllIIllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            return lIlIlllllIIIl[1];
        }
        int[] nArray2 = new int[lIlIlllllIIIl[0]];
        nArray2[k.lIlIlllllIIIl[1]] = lIlIlllllIIIl[2];
        Inventory.getFirst((int[])nArray2).interact(lIlIllllIllll[lIlIlllllIIIl[1]]);
        return lIlIlllllIIIl[0];
    }
}

