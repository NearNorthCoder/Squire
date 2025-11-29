/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.construction.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Opening pack", priority=10, blocking=true)
public class OpeningPackTask
extends Task {

    private static void lIlIIIlIlIl() {
        lIlllIlIl = new String[llIIIIIlI[4]];
        bW.lIlllIlIl[bW.llIIIIIlI[0]] = "Open";
        bW.lIlllIlIl[bW.llIIIIIlI[2]] = "pack";
        bW.lIlllIlIl[bW.llIIIIIlI[3]] = "pack";
    }

    public boolean run() {
        if (bW.lIlIlIIIllI(Inventory.contains(item -> item.getName().contains(lIlllIlIl[llIIIIIlI[3]])) ? 1 : 0)) {
            return llIIIIIlI[0];
        }
        List lIlllIIIIlIIIIl = Inventory.getAll(item -> item.getName().contains(lIlllIlIl[llIIIIIlI[2]]));
        int lIlllIIIIlIIIII = llIIIIIlI[0];
        while (bW.lIlIlIIIlll(lIlllIIIIlIIIII, Math.min(llIIIIIlI[1], lIlllIIIIlIIIIl.size()))) {
            ((Item)lIlllIIIIlIIIIl.get(lIlllIIIIlIIIII)).interact(lIlllIlIl[llIIIIIlI[0]]);
            ++lIlllIIIIlIIIII;

            if ((0xA ^ 7 ^ (0xC8 ^ 0xC1)) >= 0) continue;
            return false;
        }
        return llIIIIIlI[2];
    }

    private static boolean lIlIlIIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIIIlll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bW.lIlIlIIIlIl();
        bW.lIlIIIlIlIl();
    }

}

