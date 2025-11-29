package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.C  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/C.class */
public final class C {
    public static final /* synthetic */ C STATUE_BLUE_STRICT;
    public static final /* synthetic */ C STATUE_BLUE_I;
    private static /* synthetic */ int[] lllIIlIIIIlI;
    public static final /* synthetic */ C STATUE_BLUE_SHORT;
    public static final /* synthetic */ C STATUE_BLUE_II;
    public static final /* synthetic */ C STATUE_SHORT;
    private static /* synthetic */ String[] lllIIlIIIIIl;
    private static final /* synthetic */ C[] $VALUES;
    public static final /* synthetic */ C STATUE_BLUE_III;
    public static final /* synthetic */ C STATUE_4;
    public static final /* synthetic */ C STATUE_STRICT;
    public static final /* synthetic */ C STATUE_GOLD_SHORT;
    public static final /* synthetic */ C STATUE_GOLD_6;
    public static final /* synthetic */ C STATUE;

    private static String lIIIlIIlllIlIlI(String lllllllllllllllIIllIlIlllIIllIIl, String lllllllllllllllIIllIlIlllIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIlllIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIlllIIllIll.init(lllIIlIIIIlI[2], secretKeySpec);
            return new String(lllllllllllllllIIllIlIlllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlllIIllIlI) {
            lllllllllllllllIIllIlIlllIIllIlI.printStackTrace();
            return null;
        }
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }

    static {
        lIIIlIIlllIllIl();
        lIIIlIIlllIllII();
        STATUE = new C(lllIIlIIIIIl[lllIIlIIIIlI[0]], lllIIlIIIIlI[0]);
        STATUE_SHORT = new C(lllIIlIIIIIl[lllIIlIIIIlI[1]], lllIIlIIIIlI[1]);
        STATUE_4 = new C(lllIIlIIIIIl[lllIIlIIIIlI[2]], lllIIlIIIIlI[2]);
        STATUE_GOLD_SHORT = new C(lllIIlIIIIIl[lllIIlIIIIlI[3]], lllIIlIIIIlI[3]);
        STATUE_GOLD_6 = new C(lllIIlIIIIIl[lllIIlIIIIlI[4]], lllIIlIIIIlI[4]);
        STATUE_STRICT = new C(lllIIlIIIIIl[lllIIlIIIIlI[5]], lllIIlIIIIlI[5]);
        STATUE_BLUE_STRICT = new C(lllIIlIIIIIl[lllIIlIIIIlI[6]], lllIIlIIIIlI[6]);
        STATUE_BLUE_SHORT = new C(lllIIlIIIIIl[lllIIlIIIIlI[7]], lllIIlIIIIlI[7]);
        STATUE_BLUE_I = new C(lllIIlIIIIIl[lllIIlIIIIlI[8]], lllIIlIIIIlI[8]);
        STATUE_BLUE_II = new C(lllIIlIIIIIl[lllIIlIIIIlI[9]], lllIIlIIIIlI[9]);
        STATUE_BLUE_III = new C(lllIIlIIIIIl[lllIIlIIIIlI[10]], lllIIlIIIIlI[10]);
        C[] cArr = new C[lllIIlIIIIlI[11]];
        cArr[lllIIlIIIIlI[0]] = STATUE;
        cArr[lllIIlIIIIlI[1]] = STATUE_SHORT;
        cArr[lllIIlIIIIlI[2]] = STATUE_4;
        cArr[lllIIlIIIIlI[3]] = STATUE_GOLD_SHORT;
        cArr[lllIIlIIIIlI[4]] = STATUE_GOLD_6;
        cArr[lllIIlIIIIlI[5]] = STATUE_STRICT;
        cArr[lllIIlIIIIlI[6]] = STATUE_BLUE_STRICT;
        cArr[lllIIlIIIIlI[7]] = STATUE_BLUE_SHORT;
        cArr[lllIIlIIIIlI[8]] = STATUE_BLUE_I;
        cArr[lllIIlIIIIlI[9]] = STATUE_BLUE_II;
        cArr[lllIIlIIIIlI[10]] = STATUE_BLUE_III;
        $VALUES = cArr;
    }

    private static void lIIIlIIlllIllIl() {
        lllIIlIIIIlI = new int[12];
        lllIIlIIIIlI[0] = (((99 ^ 82) & ((33 ^ 16) ^ (-1))) ^ (10 ^ 74)) & (((160 ^ 139) ^ (216 ^ 179)) ^ (-" ".length()));
        lllIIlIIIIlI[1] = " ".length();
        lllIIlIIIIlI[2] = "  ".length();
        lllIIlIIIIlI[3] = "   ".length();
        lllIIlIIIIlI[4] = (225 ^ 148) ^ (23 ^ 102);
        lllIIlIIIIlI[5] = 185 ^ 188;
        lllIIlIIIIlI[6] = 143 ^ 137;
        lllIIlIIIIlI[7] = (255 ^ 152) ^ (94 ^ 62);
        lllIIlIIIIlI[8] = (227 ^ 147) ^ (186 ^ 194);
        lllIIlIIIIlI[9] = 27 ^ 18;
        lllIIlIIIIlI[10] = 21 ^ 31;
        lllIIlIIIIlI[11] = 92 ^ 87;
    }

    private static boolean lIIIlIIlllIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlIIlllIlIIl(String lllllllllllllllIIllIlIllIlllllII, String lllllllllllllllIIllIlIllIllllIll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIllIlIllIllllIIl = lllllllllllllllIIllIlIllIllllIll.toCharArray();
        int lllllllllllllllIIllIlIllIllllIII = lllIIlIIIIlI[0];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIIllIlIllIlllIIIl = charArray.length;
        int i = lllIIlIIIIlI[0];
        while (lIIIlIIlllIlllI(i, lllllllllllllllIIllIlIllIlllIIIl)) {
            char lllllllllllllllIIllIlIllIlllllIl = charArray[i];
            sb.append((char) (lllllllllllllllIIllIlIllIlllllIl ^ lllllllllllllllIIllIlIllIllllIIl[lllllllllllllllIIllIlIllIllllIII % lllllllllllllllIIllIlIllIllllIIl.length]));
            "".length();
            lllllllllllllllIIllIlIllIllllIII++;
            i++;
            "".length();
            if (((true ^ true) ^ (true ^ true)) != ((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private C(String str, int i) {
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    private static void lIIIlIIlllIllII() {
        lllIIlIIIIIl = new String[lllIIlIIIIlI[11]];
        lllIIlIIIIIl[lllIIlIIIIlI[0]] = lIIIlIIlllIlIIl("PBIwBBsq", "oFqPN");
        lllIIlIIIIIl[lllIIlIIIIlI[1]] = lIIIlIIlllIlIlI("p8F/B9fOCYbzTFKERCDSlA==", "zDFRC");
        lllIIlIIIIIl[lllIIlIIIIlI[2]] = lIIIlIIlllIlIlI("kqoTKjD4BkiURdRycKHm9A==", "Qlqnc");
        lllIIlIIIIIl[lllIIlIIIIlI[3]] = lIIIlIIlllIlIlI("h4Gv0eIm0HttyawBvaocQQXx61ue3YDB", "lVrHv");
        lllIIlIIIIIl[lllIIlIIIIlI[4]] = lIIIlIIlllIlIIl("Jwc1ARcxDDMaDjAMQg==", "tStUB");
        lllIIlIIIIIl[lllIIlIIIIlI[5]] = lIIIlIIlllIlIll("Rm0Ex9c1ReGtXyjOYYzcvA==", "CVloD");
        lllIIlIIIIIl[lllIIlIIIIlI[6]] = lIIIlIIlllIlIIl("GhkbMx4MEhgrHgwSCTMZAA4O", "IMZgK");
        lllIIlIIIIIl[lllIIlIIIIlI[7]] = lIIIlIIlllIlIll("UzsAnSlgHl5FWCAKuAEDW9CcXAeQWyIC", "AxeGg");
        lllIIlIIIIIl[lllIIlIIIIlI[8]] = lIIIlIIlllIlIll("86Dwssi9pGC6WEyEPV2y2A==", "dCbCl");
        lllIIlIIIIIl[lllIIlIIIIlI[9]] = lIIIlIIlllIlIll("8S+aHQXgEASFOBg4cGviWw==", "hknvy");
        lllIIlIIIIIl[lllIIlIIIIlI[10]] = lIIIlIIlllIlIlI("wu/f7c79LtROWnCdbGgABg==", "ebaqF");
    }

    private static String lIIIlIIlllIlIll(String lllllllllllllllIIllIlIlllIIIllII, String lllllllllllllllIIllIlIlllIIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllIIIlIll.getBytes(StandardCharsets.UTF_8)), lllIIlIIIIlI[8]), "DES");
            Cipher lllllllllllllllIIllIlIlllIIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIlllIIIlllI.init(lllIIlIIIIlI[2], secretKeySpec);
            return new String(lllllllllllllllIIllIlIlllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlllIIIllIl) {
            lllllllllllllllIIllIlIlllIIIllIl.printStackTrace();
            return null;
        }
    }
}
