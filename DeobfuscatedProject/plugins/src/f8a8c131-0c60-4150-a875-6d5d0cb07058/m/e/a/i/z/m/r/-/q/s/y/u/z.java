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
package m.e.a.i.z.m.r.-.q.s.y.u;

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
import m.e.a.i.z.m.r.-.q.s.y.u.e;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Killing last minion with ranged")
public class z
extends Task {
    private final /* synthetic */ Client aw;
    private final /* synthetic */ SquireZammyConfig av;
    private final /* synthetic */ l au;
    private static /* synthetic */ int[] lIllIIIlllIlI;
    private static /* synthetic */ String[] lIllIIIlllIIl;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        z llllllllllllllIllIIlIllIIlIlIlll;
        if (!z.llIIIlIlIlIllIl(this.au.B() ? 1 : 0) || z.llIIIlIlIlIllIl(this.au.A() ? 1 : 0)) {
            return lIllIIIlllIlI[0];
        }
        if (!z.llIIIlIlIlIlllI(llllllllllllllIllIIlIllIIlIlIlll.au.H() ? 1 : 0) || z.llIIIlIlIlIllll(llllllllllllllIllIIlIllIIlIlIlll.au.z(), lIllIIIlllIlI[1])) {
            return lIllIIIlllIlI[0];
        }
        if (z.llIIIlIlIllIIII(Players.getLocal().getInteracting())) {
            return lIllIIIlllIlI[0];
        }
        NPC llllllllllllllIllIIlIllIIlIlIllI = NPCs.getNearest(nPC -> {
            int n2;
            if (z.llIIIlIlIlIlllI(nPC.isDead() ? 1 : 0) && z.llIIIlIlIllIIII((Object)e.a(nPC))) {
                n2 = lIllIIIlllIlI[2];
                "".length();
                if ((0x48 ^ 0x4C) == ((0x49 ^ 0x45) & ~(0x8B ^ 0x87))) {
                    return ((0x72 ^ 0x75) & ~(9 ^ 0xE)) != 0;
                }
            } else {
                n2 = lIllIIIlllIlI[0];
            }
            return n2 != 0;
        });
        if (z.llIIIlIlIllIIlI(llllllllllllllIllIIlIllIIlIlIllI)) {
            return lIllIIIlllIlI[0];
        }
        var1_1.interact(lIllIIIlllIIl[lIllIIIlllIlI[0]]);
        return lIllIIIlllIlI[2];
    }

    private static boolean llIIIlIlIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIIIlIlIlIllII() {
        lIllIIIlllIlI = new int[5];
        z.lIllIIIlllIlI[0] = (9 ^ 0x34 ^ (0xD9 ^ 0xBE)) & (0x31 ^ 0x7C ^ (0x5B ^ 0x4C) ^ -" ".length());
        z.lIllIIIlllIlI[1] = 0x7B ^ 0xA ^ (0xDD ^ 0xA6);
        z.lIllIIIlllIlI[2] = " ".length();
        z.lIllIIIlllIlI[3] = 0x6B ^ 0x63;
        z.lIllIIIlllIlI[4] = "  ".length();
    }

    @Inject
    public z(l l2, SquireZammyConfig squireZammyConfig, Client client) {
        this.au = l2;
        this.av = squireZammyConfig;
        this.aw = client;
    }

    private static boolean llIIIlIlIlIllIl(int n2) {
        return n2 != 0;
    }

    private static String llIIIlIlIlIlIIl(String llllllllllllllIllIIlIllIIlIIlIlI, String llllllllllllllIllIIlIllIIlIIlIll) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllIIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIIlIIlIll.getBytes(StandardCharsets.UTF_8)), lIllIIIlllIlI[3]), "DES");
            Cipher llllllllllllllIllIIlIllIIlIIlllI = Cipher.getInstance("DES");
            llllllllllllllIllIIlIllIIlIIlllI.init(lIllIIIlllIlI[4], llllllllllllllIllIIlIllIIlIIllll);
            return new String(llllllllllllllIllIIlIllIIlIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIllIIlIIllIl) {
            llllllllllllllIllIIlIllIIlIIllIl.printStackTrace();
            return null;
        }
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
        z.lIllIIIlllIIl[z.lIllIIIlllIlI[0]] = z.llIIIlIlIlIlIIl("oX4NOzkih6Q=", "cxuee");
    }
}

