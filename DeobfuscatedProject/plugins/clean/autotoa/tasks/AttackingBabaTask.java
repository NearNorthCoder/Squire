/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Attacking baba")
public class AttackingBabaTask
extends AutotoaTaskBase {

    private static boolean lIIllIIIlIllIl(int n2) {
        return n2 != 0;
    }

    static {
        aL.lIIllIIIlIllII();
        aL.lIIllIIIlIlIII();
    }

    private static boolean lIIllIIIlIllll(Object object) {
        return object == null;
    }

    private static void lIIllIIIlIlIII() {
        lIlllIIIIll = new String[lIlllIIIlIl[4]];
        aL.lIlllIIIIll[aL.lIlllIIIlIl[0]] = "Attack";
        aL.lIlllIIIIll[aL.lIlllIIIlIl[2]] = "Boulder";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var1_1;
        aL var1;
        if (aL.lIIllIIIlIllIl(this.cW.redX() ? 1 : 0)) {
            return lIlllIIIlIl[0];
        }
        NPC var2 = var1.bB();
        if (aL.lIIllIIIlIllll(var2)) {
            return lIlllIIIlIl[0];
        }
        if (aL.lIIllIIIllIIII(var2.getId(), lIlllIIIlIl[1])) {
            return lIlllIIIlIl[0];
        }
        if (aL.lIIllIIIllIIIl(NPCs.getNearest(nPC -> {
            int n2;
            if (aL.lIIllIIIlIllIl(nPC.getName().equals(lIlllIIIIll[lIlllIIIlIl[2]]) ? 1 : 0) && aL.lIIllIIIllIIlI(nPC.distanceTo((Locatable)Players.getLocal()), lIlllIIIlIl[3])) {
                n2 = lIlllIIIlIl[2];

                if (-(0x61 ^ 9 ^ (0x5D ^ 0x30)) >= 0) {
                    return ((40 + 111 - -6 + 72 ^ 22 + 68 - -54 + 17) & (0xFE ^ 0x86 ^ (0xB9 ^ 0x85) ^ -1)) != 0;
                }
            } else {
                n2 = lIlllIIIlIl[0];
            }
            return n2 != 0;
        }))) {
            return lIlllIIIlIl[0];
        }
        this.a((NPC)var1_1, lIlllIIIlIl[2]);

        var1_1.interact(lIlllIIIIll[lIlllIIIlIl[0]]);
        return lIlllIIIlIl[2];
    }

    private static boolean lIIllIIIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIIIllIIIl(Object object) {
        return object != null;
    }

    @Inject
    protected AttackingBabaTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIllIIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

