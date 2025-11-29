/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.whisperer.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import gg.squire.whisperer.tasks.WhispererTaskBase;

@TaskDesc(name="Entering Realm", priority=100)
public class EnteringRealmTask
extends WhispererTaskBase {
    
    private static final  int af;

    @Override
    public boolean p() {
        B var1;
        int[] nArray = new int[lIlIllIlllIIl[0]];
        nArray[B.lIlIllIlllIIl[1]] = lIlIllIlllIIl[2];
        Item item = Inventory.getFirst((int[])nArray);
        if (B.llIIIIIllIllIIl(item)) {
            return lIlIllIlllIIl[1];
        }
        if (B.llIIIIIllIllIlI(var1.W.f() ? 1 : 0)) {
            return lIlIllIlllIIl[1];
        }
        item.interact(lIlIllIlllIII[lIlIllIlllIIl[1]]);
        return lIlIllIlllIIl[0];
    }

    static {
        B.llIIIIIllIllIII();
        B.llIIIIIllIlIlll();
        af = lIlIllIlllIIl[2];
    }

    private static boolean llIIIIIllIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIllIllIIl(Object object) {
        return object == null;
    }

    private static void llIIIIIllIlIlll() {
        lIlIllIlllIII = new String[lIlIllIlllIIl[0]];
        B.lIlIllIlllIII[B.lIlIllIlllIIl[1]] = "Activate";
    }
}

