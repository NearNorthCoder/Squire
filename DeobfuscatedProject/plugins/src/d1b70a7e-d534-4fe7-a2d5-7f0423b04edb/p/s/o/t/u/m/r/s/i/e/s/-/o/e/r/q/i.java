/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.NPCs
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

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
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.NPCs;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

@TaskDesc(name="Handling fires", priority=20, blocking=true)
public class i
extends l {
    private static /* synthetic */ int[] lIIlllIIIllIl;
    private static /* synthetic */ String[] lIIlllIIIlIll;

    static {
        i.lIllIIlIIlllllI();
        i.lIllIIlIIlllIIl();
    }

    private static void lIllIIlIIlllIIl() {
        lIIlllIIIlIll = new String[lIIlllIIIllIl[5]];
        i.lIIlllIIIlIll[i.lIIlllIIIllIl[2]] = i.lIllIIlIIllIlll("hZuDZHeBCnlLJ2HSLlsT/b/D6MGj3/T1c+r4Bk+jQ7/OR1c3t1fKIw==", "VbXXo");
        i.lIIlllIIIlIll[i.lIIlllIIIllIl[0]] = i.lIllIIlIIlllIII("ERkkNyw=", "UvQDI");
    }

    private static void lIllIIlIIlllllI() {
        lIIlllIIIllIl = new int[6];
        i.lIIlllIIIllIl[0] = " ".length();
        i.lIIlllIIIllIl[1] = 0x70 ^ 0x53;
        i.lIIlllIIIllIl[2] = (5 ^ 0x46) & ~(0x87 ^ 0xC4);
        i.lIIlllIIIllIl[3] = "   ".length();
        i.lIIlllIIIllIl[4] = 0xFFFFE3C7 & 0x3DFB;
        i.lIIlllIIIllIl[5] = "  ".length();
    }

    private static String lIllIIlIIllIlll(String llllllllllllllIlllIllIIIIlIlIIII, String llllllllllllllIlllIllIIIIlIIllll) {
        try {
            SecretKeySpec llllllllllllllIlllIllIIIIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllIIIIlIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllIIIIlIlIIlI.init(lIIlllIIIllIl[5], llllllllllllllIlllIllIIIIlIlIIll);
            return new String(llllllllllllllIlllIllIIIIlIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIIIIlIlIIIl) {
            llllllllllllllIlllIllIIIIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIlIIIIIl(Object object) {
        return object == null;
    }

    @Override
    public boolean ak() {
        int n2;
        if (i.lIllIIlIIllllll(this.ar.E(), lIIlllIIIllIl[0]) && i.lIllIIlIIllllll(this.au.b(), lIIlllIIIllIl[1]) && i.lIllIIlIlIIIIII(this.ar.I() ? 1 : 0)) {
            n2 = lIIlllIIIllIl[0];
            "".length();
            if (null != null) {
                return ((0x4C ^ 4 ^ (0x7B ^ 0x27)) & (0x12 ^ 0x7C ^ (0x18 ^ 0x62) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lIIlllIIIllIl[2];
        }
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIIIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIlIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        i llllllllllllllIlllIllIIIIlllIIll;
        void llllllllllllllIlllIllIIIIlllIIlI;
        NPC nPC2 = NPCs.getNearest((WorldPoint)this.ar.N().ag(), nPC -> {
            int n2;
            if (i.lIllIIlIlIIIIlI(nPC.getId(), lIIlllIIIllIl[4])) {
                String[] stringArray = new String[lIIlllIIIllIl[0]];
                stringArray[i.lIIlllIIIllIl[2]] = lIIlllIIIlIll[lIIlllIIIllIl[0]];
                if (i.lIllIIlIlIIIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlllIIIllIl[0];
                    "".length();
                    if (((81 + 40 - 115 + 213 ^ 22 + 115 - 80 + 87) & (0x75 ^ 0x3B ^ (0x84 ^ 0x81) ^ -" ".length())) >= 0) return n2 != 0;
                    return ((128 + 86 - 94 + 68 ^ 26 + 81 - 19 + 76) & (205 + 76 - 216 + 156 ^ 77 + 93 - 50 + 77 ^ -" ".length())) != 0;
                }
            }
            n2 = lIIlllIIIllIl[2];
            return n2 != 0;
        });
        if (i.lIllIIlIlIIIIIl(nPC2)) {
            return lIIlllIIIllIl[2];
        }
        if (i.lIllIIlIIllllll(llllllllllllllIlllIllIIIIlllIIlI.distanceTo(llllllllllllllIlllIllIIIIlllIIll.ar.N().ag()), lIIlllIIIllIl[3])) {
            llllllllllllllIlllIllIIIIlllIIll.ar.a(lIIlllIIIllIl[2]);
            return lIIlllIIIllIl[2];
        }
        if (i.lIllIIlIlIIIIII(llllllllllllllIlllIllIIIIlllIIll.au.a((Locatable)llllllllllllllIlllIllIIIIlllIIlI) ? 1 : 0)) {
            System.out.println(lIIlllIIIlIll[lIIlllIIIllIl[2]]);
            llllllllllllllIlllIllIIIIlllIIll.au.b((SceneEntity)llllllllllllllIlllIllIIIIlllIIlI);
            "".length();
            return lIIlllIIIllIl[0];
        }
        this.au.b(nPC2);
        "".length();
        return lIIlllIIIllIl[0];
    }

    @Inject
    protected i(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIlIlIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIIlIIlllIII(String llllllllllllllIlllIllIIIIllIIlIl, String llllllllllllllIlllIllIIIIllIIlII) {
        llllllllllllllIlllIllIIIIllIIlIl = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIIIIllIIIll = new StringBuilder();
        char[] llllllllllllllIlllIllIIIIllIIIlI = llllllllllllllIlllIllIIIIllIIlII.toCharArray();
        int llllllllllllllIlllIllIIIIllIIIIl = lIIlllIIIllIl[2];
        char[] llllllllllllllIlllIllIIIIlIllIll = llllllllllllllIlllIllIIIIllIIlIl.toCharArray();
        int llllllllllllllIlllIllIIIIlIllIlI = llllllllllllllIlllIllIIIIlIllIll.length;
        int llllllllllllllIlllIllIIIIlIllIIl = lIIlllIIIllIl[2];
        while (i.lIllIIlIlIIIIll(llllllllllllllIlllIllIIIIlIllIIl, llllllllllllllIlllIllIIIIlIllIlI)) {
            char llllllllllllllIlllIllIIIIllIIllI = llllllllllllllIlllIllIIIIlIllIll[llllllllllllllIlllIllIIIIlIllIIl];
            llllllllllllllIlllIllIIIIllIIIll.append((char)(llllllllllllllIlllIllIIIIllIIllI ^ llllllllllllllIlllIllIIIIllIIIlI[llllllllllllllIlllIllIIIIllIIIIl % llllllllllllllIlllIllIIIIllIIIlI.length]));
            "".length();
            ++llllllllllllllIlllIllIIIIllIIIIl;
            ++llllllllllllllIlllIllIIIIlIllIIl;
            "".length();
            if (-(9 + 131 - 74 + 79 ^ 141 + 75 - 138 + 71) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIIIIllIIIll);
    }

    private static boolean lIllIIlIIllllll(int n2, int n3) {
        return n2 > n3;
    }
}

