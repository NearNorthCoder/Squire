/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.GameEnum16;
import gg.squire.zammy.tasks.LHelper;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Killing last minion with ranged")
public class KillingLastMinionWithRangedTask
extends Task {
    private final  Client aw;
    private final  SquireZammyConfig av;
    private final  l au;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z var1;
        if (!z.llIIIlIlIlIllIl(this.au.B() ? 1 : 0) || z.llIIIlIlIlIllIl(this.au.A() ? 1 : 0)) {
            return lIllIIIlllIlI[0];
        }
        if (!z.llIIIlIlIlIlllI(var1.au.H() ? 1 : 0) || z.llIIIlIlIlIllll(var1.au.KillingLastMinionWithRangedTask(), lIllIIIlllIlI[1])) {
            return lIllIIIlllIlI[0];
        }
        if (z.llIIIlIlIllIIII(Players.getLocal().getInteracting())) {
            return lIllIIIlllIlI[0];
        }
        NPC var2 = NPCs.getNearest(nPC -> {
            int n2;
            if (z.llIIIlIlIlIlllI(nPC.isDead() ? 1 : 0) && z.llIIIlIlIllIIII((Object)e.a(nPC))) {
                n2 = lIllIIIlllIlI[2];

                if ((0x48 ^ 0x4C) == ((0x49 ^ 0x45) & ~(0x8B ^ 0x87))) {
                    return false;
                }
            } else {
                n2 = lIllIIIlllIlI[0];
            }
            return n2 != 0;
        });
        if (z.llIIIlIlIllIIlI(var2)) {
            return lIllIIIlllIlI[0];
        }
        var1_1.interact(lIllIIIlllIIl[lIllIIIlllIlI[0]]);
        return lIllIIIlllIlI[2];
    }

    private static boolean llIIIlIlIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    @Inject
    public KillingLastMinionWithRangedTask(l l2, SquireZammyConfig squireZammyConfig, Client client) {
        this.au = l2;
        this.av = squireZammyConfig;
        this.aw = client;
    }

    private static boolean llIIIlIlIlIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIlIllIIII(Object object) {
        return object != null;
    }

    private static boolean llIIIlIlIllIIlI(Object object) {
        return object == null;
    }

    static {
        z.llIIIlIlIlIllII();
        z.llIIIlIlIlIlIlI();
    }

    private static boolean llIIIlIlIlIlllI(int n2) {
        return n2 == 0;
    }

    private static void llIIIlIlIlIlIlI() {
        lIllIIIlllIIl = new String[lIllIIIlllIlI[2]];
        z.lIllIIIlllIIl[z.lIllIIIlllIlI[0]] = "Attack";
    }
}

