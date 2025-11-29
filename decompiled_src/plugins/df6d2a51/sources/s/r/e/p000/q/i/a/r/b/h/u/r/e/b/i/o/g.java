package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.g  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/g.class */
public final class g {
    public static final /* synthetic */ g H;
    public static final /* synthetic */ g J;
    private static final /* synthetic */ g[] $VALUES;
    public static final /* synthetic */ g E;
    public static final /* synthetic */ g K;
    public static final /* synthetic */ g C;
    public static final /* synthetic */ g D;
    private static /* synthetic */ int[] lllIIlllllIl;
    public static final /* synthetic */ g F;
    private static /* synthetic */ String[] lllIIlllIlIl;
    public static final /* synthetic */ g I;
    public static final /* synthetic */ g G;
    public static final /* synthetic */ g B;
    public static final /* synthetic */ g A;

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    private static boolean lIIIlIllIlIIllI(int i, int i2) {
        return i < i2;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    private static String lIIIlIllIIIIlIl(String lllllllllllllllIIllIIlIllIlIIIll, String lllllllllllllllIIllIIlIllIlIIIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIIlIllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlllllIl[8]), "DES");
            Cipher lllllllllllllllIIllIIlIllIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIllIlIIlIl.init(lllIIlllllIl[2], lllllllllllllllIIllIIlIllIlIIllI);
            return new String(lllllllllllllllIIllIIlIllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIllIlIIlII) {
            lllllllllllllllIIllIIlIllIlIIlII.printStackTrace();
            return null;
        }
    }

    private g(String str, int i) {
    }

    static {
        lIIIlIllIlIIlIl();
        lIIIlIllIlIIlII();
        A = new g(lllIIlllIlIl[lllIIlllllIl[0]], lllIIlllllIl[0]);
        B = new g(lllIIlllIlIl[lllIIlllllIl[1]], lllIIlllllIl[1]);
        C = new g(lllIIlllIlIl[lllIIlllllIl[2]], lllIIlllllIl[2]);
        D = new g(lllIIlllIlIl[lllIIlllllIl[3]], lllIIlllllIl[3]);
        E = new g(lllIIlllIlIl[lllIIlllllIl[4]], lllIIlllllIl[4]);
        F = new g(lllIIlllIlIl[lllIIlllllIl[5]], lllIIlllllIl[5]);
        G = new g(lllIIlllIlIl[lllIIlllllIl[6]], lllIIlllllIl[6]);
        H = new g(lllIIlllIlIl[lllIIlllllIl[7]], lllIIlllllIl[7]);
        I = new g(lllIIlllIlIl[lllIIlllllIl[8]], lllIIlllllIl[8]);
        J = new g(lllIIlllIlIl[lllIIlllllIl[9]], lllIIlllllIl[9]);
        K = new g(lllIIlllIlIl[lllIIlllllIl[10]], lllIIlllllIl[10]);
        g[] gVarArr = new g[lllIIlllllIl[11]];
        gVarArr[lllIIlllllIl[0]] = A;
        gVarArr[lllIIlllllIl[1]] = B;
        gVarArr[lllIIlllllIl[2]] = C;
        gVarArr[lllIIlllllIl[3]] = D;
        gVarArr[lllIIlllllIl[4]] = E;
        gVarArr[lllIIlllllIl[5]] = F;
        gVarArr[lllIIlllllIl[6]] = G;
        gVarArr[lllIIlllllIl[7]] = H;
        gVarArr[lllIIlllllIl[8]] = I;
        gVarArr[lllIIlllllIl[9]] = J;
        gVarArr[lllIIlllllIl[10]] = K;
        $VALUES = gVarArr;
    }

    private static void lIIIlIllIlIIlII() {
        lllIIlllIlIl = new String[lllIIlllllIl[11]];
        lllIIlllIlIl[lllIIlllllIl[0]] = lIIIlIllIIIIIlI("Fg==", "WJnKw");
        lllIIlllIlIl[lllIIlllllIl[1]] = lIIIlIllIIIIIll("XrdQt2mnVBg=", "BPadz");
        lllIIlllIlIl[lllIIlllllIl[2]] = lIIIlIllIIIIlIl("FTAtfEqalSk=", "AdmKz");
        lllIIlllIlIl[lllIIlllllIl[3]] = lIIIlIllIIIIIll("yE/lWt53iLU=", "mDrDd");
        lllIIlllIlIl[lllIIlllllIl[4]] = lIIIlIllIIIIIll("fTMiuo52Aeg=", "eupQM");
        lllIIlllIlIl[lllIIlllllIl[5]] = lIIIlIllIIIIlIl("j4dUjQSlZEI=", "mrdfZ");
        lllIIlllIlIl[lllIIlllllIl[6]] = lIIIlIllIIIIIlI("Eg==", "UzzCP");
        lllIIlllIlIl[lllIIlllllIl[7]] = lIIIlIllIIIIlIl("hYmpAJD14pk=", "qhcBU");
        lllIIlllIlIl[lllIIlllllIl[8]] = lIIIlIllIIIIIlI("IA==", "ioXPM");
        lllIIlllIlIl[lllIIlllllIl[9]] = lIIIlIllIIIIlIl("QP2y1DXHgbc=", "mLkzQ");
        lllIIlllIlIl[lllIIlllllIl[10]] = lIIIlIllIIIIIlI("Dw==", "DnINQ");
    }

    private static String lIIIlIllIIIIIll(String lllllllllllllllIIllIIlIllIllIIII, String lllllllllllllllIIllIIlIllIlIllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIlllllIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIllIllIIIl) {
            lllllllllllllllIIllIIlIllIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIllIIIIIlI(String lllllllllllllllIIllIIlIlllIIIlIl, String lllllllllllllllIIllIIlIlllIIIlII) {
        String lllllllllllllllIIllIIlIlllIIIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlllIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIIlIlllIIIIlI = lllllllllllllllIIllIIlIlllIIIlII.toCharArray();
        int lllllllllllllllIIllIIlIlllIIIIIl = lllIIlllllIl[0];
        char[] charArray = lllllllllllllllIIllIIlIlllIIIlIl2.toCharArray();
        int length = charArray.length;
        int i = lllIIlllllIl[0];
        while (lIIIlIllIlIIllI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIllIIlIlllIIIIlI[lllllllllllllllIIllIIlIlllIIIIIl % lllllllllllllllIIllIIlIlllIIIIlI.length]));
            "".length();
            lllllllllllllllIIllIIlIlllIIIIIl++;
            i++;
            "".length();
            if ((-((((92 + 10) - 101) + 168) ^ (((151 + 55) - 80) + 46))) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIIIlIllIlIIlIl() {
        lllIIlllllIl = new int[12];
        lllIIlllllIl[0] = (109 ^ 114) & ((163 ^ 188) ^ (-1));
        lllIIlllllIl[1] = " ".length();
        lllIIlllllIl[2] = "  ".length();
        lllIIlllllIl[3] = "   ".length();
        lllIIlllllIl[4] = (48 ^ 118) ^ (25 ^ 91);
        lllIIlllllIl[5] = 18 ^ 23;
        lllIIlllllIl[6] = (241 ^ 199) ^ (154 ^ 170);
        lllIIlllllIl[7] = (37 ^ 99) ^ (129 ^ 192);
        lllIIlllllIl[8] = (238 ^ 130) ^ (209 ^ 181);
        lllIIlllllIl[9] = 206 ^ 199;
        lllIIlllllIl[10] = (103 ^ 10) ^ (195 ^ 164);
        lllIIlllllIl[11] = (224 ^ 136) ^ (232 ^ 139);
    }
}
