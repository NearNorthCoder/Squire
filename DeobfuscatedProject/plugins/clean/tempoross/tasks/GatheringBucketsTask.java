/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tempoross.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossManager;
import gg.squire.tempoross.tasks.TemporossTaskBase;

@TaskDesc(name="Gathering buckets", priority=100, blocking=true)
public class GatheringBucketsTask
extends TemporossTaskBase {

    private static void lIllIIIlIlIIlll() {
        lIIllIllIlIll = new String[lIIllIllIllII[3]];
        q.lIIllIllIlIll[q.lIIllIllIllII[1]] = "Drop";
        q.lIIllIllIlIll[q.lIIllIllIllII[0]] = "Take";
        q.lIIllIllIlIll[q.lIIllIllIllII[2]] = "Bucket";
    }

    private static boolean lIllIIIlIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIIlIlIllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIlIlIlIll(Object object) {
        return object != null;
    }

    @Override
    public boolean ak() {
        boolean bl;
        if (q.lIllIIIlIlIlIIl(this.ar.p(), this.as.numberOfBuckets())) {
            bl = lIIllIllIllII[0];

            if (1 <= ((0x6B ^ 0x67) & ~(0x44 ^ 0x48))) {
                return false;
            }
        } else {
            bl = lIIllIllIllII[1];
        }
        return bl;
    }

    @Inject
    protected GatheringBucketsTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIlIlIlIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean al() {
        q var1;
        if (q.lIllIIIlIlIlIlI(this.ar.p(), this.as.numberOfBuckets())) {
            Inventory.getFirst(item -> item.getName().contains(lIIllIllIlIll[lIIllIllIllII[2]])).interact(lIIllIllIlIll[lIIllIllIllII[1]]);
            return lIIllIllIllII[0];
        }
        c var2 = var1.ar.N();
        TileObject var3 = var2.O();
        if (q.lIllIIIlIlIlIll(var3) && q.lIllIIIlIlIllII(var1.au.a((Locatable)var3) ? 1 : 0)) {
            var3.interact(lIIllIllIlIll[lIIllIllIllII[0]]);

            if (3 == 0) {
                return false;
            }
        } else {
            var1.au.b(var2.aa());

        }
        return lIIllIllIllII[0];
    }

    static {
        q.lIllIIIlIlIlIII();
        q.lIllIIIlIlIIlll();
    }

        return String.valueOf(var4);
    }

    private static boolean lIllIIIlIlIllIl(int n2, int n3) {
        return n2 < n3;
    }
}

