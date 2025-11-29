/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Picking up pet", priority=250, blocking=true)
public class q
extends Task {
    private final /* synthetic */ c bw;
    private static /* synthetic */ int[] llIIllIIIlIl;
    private static /* synthetic */ String[] llIIllIIIlII;

    private static boolean llllllIIlllIII(int n2) {
        return n2 != 0;
    }

    static {
        q.llllllIIllIlll();
        q.llllllIIllIllI();
    }

    private static boolean llllllIIlllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (q.llllllIIlllIII(this.bw.A() ? 1 : 0)) {
            return llIIllIIIlIl[0];
        }
        NPC lllllllllllllllIlIIlIllIlllllllI = NPCs.getNearest(nPC -> {
            int n2;
            if (q.llllllIIlllIII(Players.getLocal().equals(nPC.getInteracting()) ? 1 : 0) && q.llllllIIlllIII(nPC.hasAction(llIIllIIIlII[llIIllIIIlIl[1]]::equals) ? 1 : 0)) {
                n2 = llIIllIIIlIl[1];
                "".length();
                if (((115 + 126 - 192 + 123 ^ 79 + 77 - 60 + 58) & (0xF0 ^ 0xA6 ^ (0xD6 ^ 0xB6) ^ -" ".length())) > 0) {
                    return ((0x7F ^ 0x4F ^ (0xA8 ^ 0xC2)) & (0x86 ^ 0xB0 ^ (0x66 ^ 0xA) ^ -" ".length())) != 0;
                }
            } else {
                n2 = llIIllIIIlIl[0];
            }
            return n2 != 0;
        });
        if (q.llllllIIlllIIl(lllllllllllllllIlIIlIllIlllllllI)) {
            return llIIllIIIlIl[0];
        }
        var1_1.interact(llIIllIIIlII[llIIllIIIlIl[0]]);
        return llIIllIIIlIl[1];
    }

    private static String llllllIIllIlIl(String lllllllllllllllIlIIlIllIllllIlII, String lllllllllllllllIlIIlIllIllllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllIllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllIllllIllI.init(llIIllIIIlIl[2], lllllllllllllllIlIIlIllIllllIlll);
            return new String(lllllllllllllllIlIIlIllIllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllIllllIlIl) {
            lllllllllllllllIlIIlIllIllllIlIl.printStackTrace();
            return null;
        }
    }

    private static void llllllIIllIlll() {
        llIIllIIIlIl = new int[3];
        q.llIIllIIIlIl[0] = (0x39 ^ 0x4A ^ (0x18 ^ 0x5D)) & (10 + 65 - -38 + 14 ^ (0x42 ^ 0xB) ^ -" ".length());
        q.llIIllIIIlIl[1] = " ".length();
        q.llIIllIIIlIl[2] = "  ".length();
    }

    @Inject
    public q(c c2) {
        this.bw = c2;
    }

    private static void llllllIIllIllI() {
        llIIllIIIlII = new String[llIIllIIIlIl[2]];
        q.llIIllIIIlII[q.llIIllIIIlIl[0]] = q.llllllIIllIlIl("juyvjXwtX20=", "yWksH");
        q.llIIllIIIlII[q.llIIllIIIlIl[1]] = q.llllllIIllIlIl("IYh+2ICg/5k=", "Zpvqm");
    }
}

