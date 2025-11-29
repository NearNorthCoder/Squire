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

@TaskDesc(name="Gathering harpoon", priority=100, blocking=true)
public class GatheringHarpoonTask
extends TemporossTaskBase {

    @Override
    public boolean ak() {
        boolean bl;
        if (s.lIllIIIlIlIIIIl(this.ar.m() ? 1 : 0)) {
            bl = lIIllIllIlIlI[0];

            if (-(0x9E ^ 0x9A) >= 0) {
                return false;
            }
        } else {
            bl = lIIllIllIlIlI[1];
        }
        return bl;
    }

    private static boolean lIllIIIlIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void var2_2;
        s var1;
        int n2 = Inventory.getCount(item -> item.getName().toLowerCase().endsWith(lIIllIllIIIlI[lIIllIllIlIlI[3]]));
        if (s.lIllIIIlIlIIIlI(n2, lIIllIllIlIlI[0])) {
            int[] nArray = new int[lIIllIllIlIlI[0]];
            nArray[s.lIIllIllIlIlI[1]] = lIIllIllIlIlI[2];
            Inventory.getFirst((int[])nArray).interact(lIIllIllIIIlI[lIIllIllIlIlI[1]]);
            return lIIllIllIlIlI[0];
        }
        c var2 = var1.ar.N();
        TileObject var3 = var2.S();
        if (s.lIllIIIlIlIIIll(var3) && s.lIllIIIlIlIIIIl(var1.au.a((Locatable)var3) ? 1 : 0)) {
            var3.interact(lIIllIllIIIlI[lIIllIllIlIlI[0]]);
            return lIIllIllIlIlI[0];
        }
        this.au.b(var2_2.Y());

        return lIIllIllIlIlI[0];
    }

    @Inject
    protected GatheringHarpoonTask(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static void lIllIIIlIIlllll() {
        lIIllIllIIIlI = new String[lIIllIllIlIlI[4]];
        s.lIIllIllIIIlI[s.lIIllIllIlIlI[1]] = "Drop";
        s.lIIllIllIIIlI[s.lIIllIllIlIlI[0]] = "Take";
        s.lIIllIllIIIlI[s.lIIllIllIlIlI[3]] = "harpoon";
    }

    private static boolean lIllIIIlIlIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIlIIIll(Object object) {
        return object != null;
    }

    static {
        s.lIllIIIlIlIIIII();
        s.lIllIIIlIIlllll();
    }

    private static boolean lIllIIIlIlIIIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var4);
    }
}

