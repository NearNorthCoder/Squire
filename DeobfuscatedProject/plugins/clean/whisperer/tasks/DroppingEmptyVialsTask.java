/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping empty vials", priority=15)
public class DroppingEmptyVialsTask
extends Task {

    static {
        x.llIIIIIlIllIIII();
        x.llIIIIIlIlIllll();
    }

    private static boolean llIIIIIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIIIlIlIllll() {
        lIlIllIlIlIlI = new String[lIlIllIlIlIll[2]];
        x.lIlIllIlIlIlI[x.lIlIllIlIlIll[1]] = "Vial";
        x.lIlIllIlIlIlI[x.lIlIllIlIlIll[0]] = "Drop";
    }

        return String.valueOf(var1);
    }

    public boolean run() {
        String[] stringArray = new String[lIlIllIlIlIll[0]];
        stringArray[x.lIlIllIlIlIll[1]] = lIlIllIlIlIlI[lIlIllIlIlIll[1]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (x.llIIIIIlIllIIIl(item)) {
            return lIlIllIlIlIll[1];
        }
        item.interact(lIlIllIlIlIlI[lIlIllIlIlIll[0]]);
        return lIlIllIlIlIll[0];
    }

    private static boolean llIIIIIlIllIIIl(Object object) {
        return object == null;
    }

}

