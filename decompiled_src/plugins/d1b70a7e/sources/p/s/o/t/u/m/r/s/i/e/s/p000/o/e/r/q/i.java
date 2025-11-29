package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

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
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.NPCs;
@TaskDesc(name = "Handling fires", priority = 20, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.i  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/i.class */
public class i extends l {
    private static /* synthetic */ int[] lIIlllIIIllIl;
    private static /* synthetic */ String[] lIIlllIIIlIll;

    static {
        lIllIIlIIlllllI();
        lIllIIlIIlllIIl();
    }

    private static void lIllIIlIIlllIIl() {
        lIIlllIIIlIll = new String[lIIlllIIIllIl[5]];
        lIIlllIIIlIll[lIIlllIIIllIl[2]] = lIllIIlIIllIlll("hZuDZHeBCnlLJ2HSLlsT/b/D6MGj3/T1c+r4Bk+jQ7/OR1c3t1fKIw==", "VbXXo");
        lIIlllIIIlIll[lIIlllIIIllIl[0]] = lIllIIlIIlllIII("ERkkNyw=", "UvQDI");
    }

    private static void lIllIIlIIlllllI() {
        lIIlllIIIllIl = new int[6];
        lIIlllIIIllIl[0] = " ".length();
        lIIlllIIIllIl[1] = 112 ^ 83;
        lIIlllIIIllIl[2] = (5 ^ 70) & ((135 ^ 196) ^ (-1));
        lIIlllIIIllIl[3] = "   ".length();
        lIIlllIIIllIl[4] = (-7225) & 15867;
        lIIlllIIIllIl[5] = "  ".length();
    }

    private static String lIllIIlIIllIlll(String llllllllllllllIlllIllIIIIlIlIIII, String llllllllllllllIlllIllIIIIlIIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIIIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIIllIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllIIIIlIlIIIl) {
            llllllllllllllIlllIllIIIIlIlIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIlIlIIIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean ak() {
        if (lIllIIlIIllllll(this.ar.E(), lIIlllIIIllIl[0]) && lIllIIlIIllllll(this.au.b(), lIIlllIIIllIl[1]) && lIllIIlIlIIIIII(this.ar.I() ? 1 : 0)) {
            ?? r0 = lIIlllIIIllIl[0];
            "".length();
            return 0 != 0 ? ((76 ^ 4) ^ (123 ^ 39)) & (((18 ^ 124) ^ (24 ^ 98)) ^ (-" ".length())) : r0;
        }
        return lIIlllIIIllIl[2];
    }

    private static boolean lIllIIlIlIIIIII(int i) {
        return i != 0;
    }

    private static boolean lIllIIlIlIIIIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean al() {
        SceneEntity nearest = NPCs.getNearest(this.ar.N().ag(), npc -> {
            if (lIllIIlIlIIIIlI(npc.getId(), lIIlllIIIllIl[4])) {
                String[] strArr = new String[lIIlllIIIllIl[0]];
                strArr[lIIlllIIIllIl[2]] = lIIlllIIIlIll[lIIlllIIIllIl[0]];
                if (lIllIIlIlIIIIII(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIlllIIIllIl[0];
                    "".length();
                    return (((((81 + 40) - 115) + 213) ^ (((22 + 115) - 80) + 87)) & (((117 ^ 59) ^ (132 ^ 129)) ^ (-" ".length()))) < 0 ? ((((128 + 86) - 94) + 68) ^ (((26 + 81) - 19) + 76)) & (((((205 + 76) - 216) + 156) ^ (((77 + 93) - 50) + 77)) ^ (-" ".length())) : r0;
                }
            }
            return lIIlllIIIllIl[2];
        });
        if (lIllIIlIlIIIIIl(nearest)) {
            return lIIlllIIIllIl[2];
        }
        if (lIllIIlIIllllll(nearest.distanceTo(this.ar.N().ag()), lIIlllIIIllIl[3])) {
            this.ar.a((boolean) lIIlllIIIllIl[2]);
            return lIIlllIIIllIl[2];
        } else if (!lIllIIlIlIIIIII(this.au.a((Locatable) nearest) ? 1 : 0)) {
            this.au.b((NPC) nearest);
            "".length();
            return lIIlllIIIllIl[0];
        } else {
            System.out.println(lIIlllIIIlIll[lIIlllIIIllIl[2]]);
            this.au.b(nearest);
            "".length();
            return lIIlllIIIllIl[0];
        }
    }

    @Inject
    protected i(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIlIlIIIIlI(int i, int i2) {
        return i == i2;
    }

    private static String lIllIIlIIlllIII(String llllllllllllllIlllIllIIIIllIIlIl, String llllllllllllllIlllIllIIIIllIIlII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllIIIIllIIlII.toCharArray();
        int llllllllllllllIlllIllIIIIllIIIIl = lIIlllIIIllIl[2];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIIIllIl[2];
        while (lIllIIlIlIIIIll(i, length)) {
            char llllllllllllllIlllIllIIIIllIIllI = charArray2[i];
            sb.append((char) (llllllllllllllIlllIllIIIIllIIllI ^ charArray[llllllllllllllIlllIllIIIIllIIIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIllIIIIllIIIIl++;
            i++;
            "".length();
            if ((-((((9 + 131) - 74) + 79) ^ (((141 + 75) - 138) + 71))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIlIIllllll(int i, int i2) {
        return i > i2;
    }
}
