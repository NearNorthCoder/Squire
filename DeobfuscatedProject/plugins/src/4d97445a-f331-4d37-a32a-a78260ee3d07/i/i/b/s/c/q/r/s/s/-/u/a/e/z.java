/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.magic.Thralls
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import i.i.b.s.c.q.r.s.s.-.u.a.e.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.unethicalite.api.magic.Thralls;

@TaskDesc(name="Using thrall", priority=4999)
public class z
extends Task {
    private static /* synthetic */ int[] lllIlllll;
    private static /* synthetic */ String[] lllIllllI;
    private final /* synthetic */ a aP;

    private static void llIIllIlIll() {
        lllIlllll = new int[3];
        z.lllIlllll[0] = (146 + 38 - 66 + 54 ^ 113 + 140 - 214 + 111) & (7 + 140 - 48 + 60 ^ 51 + 54 - 44 + 104 ^ -" ".length());
        z.lllIlllll[1] = " ".length();
        z.lllIlllll[2] = "  ".length();
    }

    private static boolean llIIllIlllI(Object object) {
        return object != null;
    }

    private static void llIIllIlIlI() {
        lllIllllI = new String[lllIlllll[1]];
        z.lllIllllI[z.lllIlllll[0]] = z.llIIllIlIIl("39P8w1W0u5U=", "vGsfE");
    }

    @Inject
    public z(a a2) {
        this.aP = a2;
    }

    private static String llIIllIlIIl(String lIlIlIIIIIllIIl, String lIlIlIIIIIllIII) {
        try {
            SecretKeySpec lIlIlIIIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIIIllIll = Cipher.getInstance("Blowfish");
            lIlIlIIIIIllIll.init(lllIlllll[2], lIlIlIIIIIlllII);
            return new String(lIlIlIIIIIllIll.doFinal(Base64.getDecoder().decode(lIlIlIIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIIIllIlI) {
            lIlIlIIIIIllIlI.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        z lIlIlIIIIlIIIlI;
        if (z.llIIllIllII(Thralls.canUse() ? 1 : 0)) {
            return lllIlllll[0];
        }
        if (z.llIIllIllIl(lIlIlIIIIlIIIlI.aP.k())) {
            return lllIlllll[0];
        }
        NPC lIlIlIIIIlIIIIl = lIlIlIIIIlIIIlI.aP.k().y();
        if (z.llIIllIlllI(lIlIlIIIIlIIIIl)) {
            String[] stringArray = new String[lllIlllll[1]];
            stringArray[z.lllIlllll[0]] = lllIllllI[lllIlllll[0]];
            if (z.llIIllIllII(lIlIlIIIIlIIIIl.hasAction(stringArray) ? 1 : 0)) {
                return lllIlllll[0];
            }
        }
        return Thralls.useBestThrall();
    }

    static {
        z.llIIllIlIll();
        z.llIIllIlIlI();
    }

    private static boolean llIIllIllIl(Object object) {
        return object == null;
    }

    private static boolean llIIllIllII(int n2) {
        return n2 == 0;
    }
}

