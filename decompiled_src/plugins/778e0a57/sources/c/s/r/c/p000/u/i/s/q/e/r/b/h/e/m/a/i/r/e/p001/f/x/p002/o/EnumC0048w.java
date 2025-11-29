package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.w  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/w.class */
public final class EnumC0048w {
    public static final /* synthetic */ EnumC0048w REACHED_LOWER_LEVEL;
    private static final /* synthetic */ EnumC0048w[] $VALUES;
    public static final /* synthetic */ EnumC0048w EXPLORING_UPPER_LEVEL;
    private static /* synthetic */ int[] lIlIIlIlIlII;
    public static final /* synthetic */ EnumC0048w REACHED_BOTTOM;
    private static /* synthetic */ String[] lIlIIlIlIIll;
    public static final /* synthetic */ EnumC0048w GET_OUT;
    public static final /* synthetic */ EnumC0048w WAITING_FOR_LEADER_TO_START;
    public static final /* synthetic */ EnumC0048w REACHED_MIDDLE_LEVEL;

    static {
        llIllIIlIIlIIl();
        llIllIIlIIlIII();
        WAITING_FOR_LEADER_TO_START = new EnumC0048w(lIlIIlIlIIll[lIlIIlIlIlII[0]], lIlIIlIlIlII[0]);
        EXPLORING_UPPER_LEVEL = new EnumC0048w(lIlIIlIlIIll[lIlIIlIlIlII[1]], lIlIIlIlIlII[1]);
        REACHED_MIDDLE_LEVEL = new EnumC0048w(lIlIIlIlIIll[lIlIIlIlIlII[2]], lIlIIlIlIlII[2]);
        REACHED_LOWER_LEVEL = new EnumC0048w(lIlIIlIlIIll[lIlIIlIlIlII[3]], lIlIIlIlIlII[3]);
        REACHED_BOTTOM = new EnumC0048w(lIlIIlIlIIll[lIlIIlIlIlII[4]], lIlIIlIlIlII[4]);
        GET_OUT = new EnumC0048w(lIlIIlIlIIll[lIlIIlIlIlII[5]], lIlIIlIlIlII[5]);
        EnumC0048w[] enumC0048wArr = new EnumC0048w[lIlIIlIlIlII[6]];
        enumC0048wArr[lIlIIlIlIlII[0]] = WAITING_FOR_LEADER_TO_START;
        enumC0048wArr[lIlIIlIlIlII[1]] = EXPLORING_UPPER_LEVEL;
        enumC0048wArr[lIlIIlIlIlII[2]] = REACHED_MIDDLE_LEVEL;
        enumC0048wArr[lIlIIlIlIlII[3]] = REACHED_LOWER_LEVEL;
        enumC0048wArr[lIlIIlIlIlII[4]] = REACHED_BOTTOM;
        enumC0048wArr[lIlIIlIlIlII[5]] = GET_OUT;
        $VALUES = enumC0048wArr;
    }

    private EnumC0048w(String str, int i) {
    }

    private static void llIllIIlIIlIIl() {
        lIlIIlIlIlII = new int[8];
        lIlIIlIlIlII[0] = (100 ^ 105) & ((52 ^ 57) ^ (-1));
        lIlIIlIlIlII[1] = " ".length();
        lIlIIlIlIlII[2] = "  ".length();
        lIlIIlIlIlII[3] = "   ".length();
        lIlIIlIlIlII[4] = 15 ^ 11;
        lIlIIlIlIlII[5] = (((23 + 36) - 26) + 152) ^ (((54 + 84) - 13) + 63);
        lIlIIlIlIlII[6] = 29 ^ 27;
        lIlIIlIlIlII[7] = (142 ^ 168) ^ (114 ^ 92);
    }

    private static void llIllIIlIIlIII() {
        lIlIIlIlIIll = new String[lIlIIlIlIlII[6]];
        lIlIIlIlIIll[lIlIIlIlIlII[0]] = llIllIIlIIIlIl("Q8I+3+fczVimFZby3IpNMmdqOtfOGIDjbXDp2YV+bL8=", "hMVWl");
        lIlIIlIlIIll[lIlIIlIlIlII[1]] = llIllIIlIIIllI("EgkEBCYFGBoPNgIBBA07CB0RHiwb", "WQTHi");
        lIlIIlIlIIll[lIlIIlIlIlII[2]] = llIllIIlIIIllI("EDMzNhEHMi04EAYyPjAGDjMkMBU=", "BvruY");
        lIlIIlIlIIll[lIlIIlIlIlII[3]] = llIllIIlIIIllI("GQE1DSAOACsCJxwBJhEkDhIxAg==", "KDtNh");
        lIlIIlIlIIll[lIlIIlIlIlII[4]] = llIllIIlIIIlll("Aie2rWRpVsYUEgqxOVEbUg==", "DtKZo");
        lIlIIlIlIIll[lIlIIlIlIlII[5]] = llIllIIlIIIllI("JggwExs0GQ==", "aMdLT");
    }

    public static EnumC0048w valueOf(String str) {
        return (EnumC0048w) Enum.valueOf(EnumC0048w.class, str);
    }

    public static EnumC0048w[] values() {
        return (EnumC0048w[]) $VALUES.clone();
    }

    private static boolean llIllIIlIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static String llIllIIlIIIllI(String lllllllllllllllIllIllIlIlIIlIIIl, String lllllllllllllllIllIllIlIlIIlIlIl) {
        String lllllllllllllllIllIllIlIlIIlIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIlIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIllIlIlIIlIIll = lllllllllllllllIllIllIlIlIIlIlIl.toCharArray();
        int lllllllllllllllIllIllIlIlIIlIIlI = lIlIIlIlIlII[0];
        char[] charArray = lllllllllllllllIllIllIlIlIIlIIIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIlIlII[0];
        while (llIllIIlIIlIlI(i, length)) {
            char lllllllllllllllIllIllIlIlIIlIlll = charArray[i];
            sb.append((char) (lllllllllllllllIllIllIlIlIIlIlll ^ lllllllllllllllIllIllIlIlIIlIIll[lllllllllllllllIllIllIlIlIIlIIlI % lllllllllllllllIllIllIlIlIIlIIll.length]));
            "".length();
            lllllllllllllllIllIllIlIlIIlIIlI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIllIIlIIIlll(String lllllllllllllllIllIllIlIlIIIIIIl, String lllllllllllllllIllIllIlIlIIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIlIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIlIlIIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIlIlIIIIIll.init(lIlIIlIlIlII[2], secretKeySpec);
            return new String(lllllllllllllllIllIllIlIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIlIlIIIIIlI) {
            lllllllllllllllIllIllIlIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static String llIllIIlIIIlIl(String lllllllllllllllIllIllIlIlIlIIllI, String lllllllllllllllIllIllIlIlIlIIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIlII[7]), "DES");
            Cipher lllllllllllllllIllIllIlIlIlIlIII = Cipher.getInstance("DES");
            lllllllllllllllIllIllIlIlIlIlIII.init(lIlIIlIlIlII[2], secretKeySpec);
            return new String(lllllllllllllllIllIllIlIlIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIlIlIlIIlll) {
            lllllllllllllllIllIllIlIlIlIIlll.printStackTrace();
            return null;
        }
    }
}
