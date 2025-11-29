/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.aerialfisher.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Gathering bait", priority=7, blocking=true)
public class GatheringBaitTask
extends Task {

    private static boolean lIIlIIlllllIIl(int n) {
        return n == 0;
    }

    private static boolean lIIlIIlllllIlI(int n, int n2) {
        return n >= n2;
    }

    static {
        c.lIIlIIlllllIII();
        c.lIIlIIllllIlll();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        block5: {
            block4: {
                int[] nArray = new int[lIlIlllIIll[0]];
                nArray[c.lIlIlllIIll[1]] = lIlIlllIIll[2];
                if (!c.lIIlIIlllllIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[lIlIlllIIll[0]];
                nArray2[c.lIlIlllIIll[1]] = lIlIlllIIll[3];
                if (!c.lIIlIIlllllIlI(Inventory.getCount((int[])nArray2), lIlIlllIIll[4])) break block5;
            }
            return lIlIlllIIll[1];
        }
        int[] nArray = new int[lIlIlllIIll[0]];
        nArray[c.lIlIlllIIll[1]] = lIlIlllIIll[5];
        TileObject var1 = TileObjects.getNearest((int[])nArray);
        if (c.lIIlIIlllllIll(var1)) {
            return lIlIlllIIll[1];
        }
        var1_1.interact(lIlIlllIIlI[lIlIlllIIll[1]]);
        return lIlIlllIIll[0];
    }

    private static void lIIlIIllllIlll() {
        lIlIlllIIlI = new String[lIlIlllIIll[0]];
        c.lIlIlllIIlI[c.lIlIlllIIll[1]] = "Take";
    }

    private static boolean lIIlIIlllllIll(Object object) {
        return object == null;
    }
}

