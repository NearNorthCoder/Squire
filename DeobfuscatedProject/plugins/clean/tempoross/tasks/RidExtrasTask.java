/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.unethicalite.api.items.Inventory;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Rid extras", priority=50)
public class RidExtrasTask
extends TemporossTaskBase {

    private static void lIllIIIlIIllIlI() {
        lIIllIllIlIII = new String[lIIllIllIlIIl[4]];
        u.lIIllIllIlIII[u.lIIllIllIlIIl[1]] = "Drop";
        u.lIIllIllIlIII[u.lIIllIllIlIIl[0]] = "Drop";
    }

    @Override
    public boolean al() {
        u var1;
        int[] nArray = new int[lIIllIllIlIIl[0]];
        nArray[u.lIIllIllIlIIl[1]] = lIIllIllIlIIl[2];
        if (u.lIllIIIlIIlllIl(Inventory.getCount((int[])nArray), lIIllIllIlIIl[0])) {
            int[] nArray2 = new int[lIIllIllIlIIl[0]];
            nArray2[u.lIIllIllIlIIl[1]] = lIIllIllIlIIl[2];
            Inventory.getFirst((int[])nArray2).interact(lIIllIllIlIII[lIIllIllIlIIl[1]]);
            return lIIllIllIlIIl[0];
        }
        if (u.lIllIIIlIIlllIl(var1.ar.n(), var1.as.numberOfBuckets())) {
            int[] nArray3 = new int[lIIllIllIlIIl[0]];
            nArray3[u.lIIllIllIlIIl[1]] = lIIllIllIlIIl[3];
            Inventory.getFirst((int[])nArray3).interact(lIIllIllIlIII[lIIllIllIlIIl[0]]);
        }
        return lIIllIllIlIIl[1];
    }

    @Inject
    protected RidExtrasTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    static {
        u.lIllIIIlIIllIll();
        u.lIllIIIlIIllIlI();
    }

    private static boolean lIllIIIlIIlllIl(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ak() {
        int n2;
        int[] nArray = new int[lIIllIllIlIIl[0]];
        nArray[u.lIIllIllIlIIl[1]] = lIIllIllIlIIl[2];
        if (!u.lIllIIIlIIlllII(Inventory.getCount((int[])nArray), lIIllIllIlIIl[0]) || u.lIllIIIlIIlllIl(this.ar.n(), this.as.numberOfBuckets())) {
            n2 = lIIllIllIlIIl[0];

            }
        } else {
            n2 = lIIllIllIlIIl[1];
        }
        return n2 != 0;
    }

    private static boolean lIllIIIlIIlllII(int n2, int n3) {
        return n2 <= n3;
    }

}

