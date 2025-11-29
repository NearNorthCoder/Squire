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
import java.util.Arrays;
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

@TaskDesc(name="Gathering hammer", priority=100, blocking=true)
public class GatheringHammerTask
extends TemporossTaskBase {

    @Override
    public boolean ak() {
        boolean bl;
        if (r.lIllIIlIIIIIIIl(this.ar.t() ? 1 : 0)) {
            bl = lIIllIlllllll[0];

            if ((0xAA ^ 0x9F ^ (0x26 ^ 0x17)) == ((0xC3 ^ 0x9A ^ (0x44 ^ 0xA)) & (10 + 136 - 101 + 111 ^ 5 + 79 - 77 + 132 ^ -1))) {
                return ((0x90 ^ 0xB0 ^ (0x1D ^ 2)) & (0x95 ^ 0x8F ^ (0x3D ^ 0x18) ^ -1) & ((0x24 ^ 0x3D ^ (0x14 ^ 0x55)) & (221 + 101 - 293 + 210 ^ 128 + 20 - 70 + 105 ^ -1) ^ -1)) != 0;
            }
        } else {
            bl = lIIllIlllllll[1];
        }
        return bl;
    }

    private static boolean lIllIIlIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    protected GatheringHammerTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIllllllll() {
        lIIllIllllllI = new String[lIIllIlllllll[3]];
        r.lIIllIllllllI[r.lIIllIlllllll[1]] = "Drop";
        r.lIIllIllllllI[r.lIIllIlllllll[0]] = "Take";
    }

    private static boolean lIllIIlIIIIIIll(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        r var1;
        int[] nArray = new int[lIIllIlllllll[0]];
        nArray[r.lIIllIlllllll[1]] = lIIllIlllllll[2];
        int n2 = Inventory.getCount((int[])nArray);
        if (r.lIllIIlIIIIIIlI(n2, lIIllIlllllll[0])) {
            int[] nArray2 = new int[lIIllIlllllll[0]];
            nArray2[r.lIIllIlllllll[1]] = lIIllIlllllll[2];
            Inventory.getFirst((int[])nArray2).interact(lIIllIllllllI[lIIllIlllllll[1]]);
            return lIIllIlllllll[0];
        }
        c var2 = var1.ar.N();
        TileObject var3 = var2.R();
        if (r.lIllIIlIIIIIIll(var3) && r.lIllIIlIIIIIIIl(var1.au.a((Locatable)var3) ? 1 : 0)) {
            var3.interact(lIIllIllllllI[lIIllIlllllll[0]]);
            return lIIllIlllllll[0];
        }
        this.au.b(var2_2.Y());

        return lIIllIlllllll[1];
    }

        return String.valueOf(var4);
    }

    private static boolean lIllIIlIIIIIIIl(int n2) {
        return n2 == 0;
    }

    static {
        r.lIllIIlIIIIIIII();
        r.lIllIIIllllllll();
    }

    private static boolean lIllIIlIIIIIIlI(int n2, int n3) {
        return n2 > n3;
    }
}

