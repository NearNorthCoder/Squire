package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/k.class */
public final class EnumC0010k {
    public static final /* synthetic */ EnumC0010k NORTH;
    public static final /* synthetic */ EnumC0010k SOUTH_BLADE;
    public static final /* synthetic */ EnumC0010k EAST;
    public static final /* synthetic */ EnumC0010k WEST;
    public static final /* synthetic */ EnumC0010k SOUTH;
    private static /* synthetic */ String[] lllIIIIlllll;
    private static final /* synthetic */ EnumC0010k[] $VALUES;
    private static /* synthetic */ int[] lllIIIlIIIII;

    public static EnumC0010k valueOf(String str) {
        return (EnumC0010k) Enum.valueOf(EnumC0010k.class, str);
    }

    static {
        lIIIlIIIllIllIl();
        lIIIlIIIllIllII();
        NORTH = new EnumC0010k(lllIIIIlllll[lllIIIlIIIII[0]], lllIIIlIIIII[0]);
        SOUTH = new EnumC0010k(lllIIIIlllll[lllIIIlIIIII[1]], lllIIIlIIIII[1]);
        WEST = new EnumC0010k(lllIIIIlllll[lllIIIlIIIII[2]], lllIIIlIIIII[2]);
        EAST = new EnumC0010k(lllIIIIlllll[lllIIIlIIIII[3]], lllIIIlIIIII[3]);
        SOUTH_BLADE = new EnumC0010k(lllIIIIlllll[lllIIIlIIIII[4]], lllIIIlIIIII[4]);
        EnumC0010k[] enumC0010kArr = new EnumC0010k[lllIIIlIIIII[5]];
        enumC0010kArr[lllIIIlIIIII[0]] = NORTH;
        enumC0010kArr[lllIIIlIIIII[1]] = SOUTH;
        enumC0010kArr[lllIIIlIIIII[2]] = WEST;
        enumC0010kArr[lllIIIlIIIII[3]] = EAST;
        enumC0010kArr[lllIIIlIIIII[4]] = SOUTH_BLADE;
        $VALUES = enumC0010kArr;
    }

    private static void lIIIlIIIllIllIl() {
        lllIIIlIIIII = new int[7];
        lllIIIlIIIII[0] = ((((155 + 13) - 135) + 182) ^ (((57 + 155) - 141) + 87)) & (((182 ^ 134) ^ (50 ^ 75)) ^ (-" ".length()));
        lllIIIlIIIII[1] = " ".length();
        lllIIIlIIIII[2] = "  ".length();
        lllIIIlIIIII[3] = "   ".length();
        lllIIIlIIIII[4] = (27 ^ 13) ^ (5 ^ 23);
        lllIIIlIIIII[5] = 41 ^ 44;
        lllIIIlIIIII[6] = (127 ^ 36) ^ (229 ^ 182);
    }

    private static boolean lIIIlIIIllIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIIlIIIllIlIlI(String lllllllllllllllIIlllIIIIIIlIIIll, String lllllllllllllllIIlllIIIIIIlIIIlI) {
        String lllllllllllllllIIlllIIIIIIlIIIll2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIIIIIlIIIIl = new StringBuilder();
        char[] lllllllllllllllIIlllIIIIIIlIIIII = lllllllllllllllIIlllIIIIIIlIIIlI.toCharArray();
        int lllllllllllllllIIlllIIIIIIIlllll = lllIIIlIIIII[0];
        char[] charArray = lllllllllllllllIIlllIIIIIIlIIIll2.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIlllIIIIIIIlIlll = lllIIIlIIIII[0];
        while (lIIIlIIIllIlllI(lllllllllllllllIIlllIIIIIIIlIlll, length)) {
            lllllllllllllllIIlllIIIIIIlIIIIl.append((char) (charArray[lllllllllllllllIIlllIIIIIIIlIlll] ^ lllllllllllllllIIlllIIIIIIlIIIII[lllllllllllllllIIlllIIIIIIIlllll % lllllllllllllllIIlllIIIIIIlIIIII.length]));
            "".length();
            lllllllllllllllIIlllIIIIIIIlllll++;
            lllllllllllllllIIlllIIIIIIIlIlll++;
            "".length();
            if (((84 ^ 34) ^ (243 ^ 129)) <= (((137 ^ 177) ^ "   ".length()) & (((((56 + 153) - 43) + 24) ^ (((14 + 87) - 23) + 55)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlllIIIIIIlIIIIl);
    }

    private EnumC0010k(String str, int i) {
    }

    private static String lIIIlIIIllIlIll(String lllllllllllllllIIlllIIIIIIIIlllI, String lllllllllllllllIIlllIIIIIIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIIIIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), lllIIIlIIIII[6]), "DES");
            Cipher lllllllllllllllIIlllIIIIIIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIIIIIIlIIII.init(lllIIIlIIIII[2], lllllllllllllllIIlllIIIIIIIlIIIl);
            return new String(lllllllllllllllIIlllIIIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIIIIIIIllll) {
            lllllllllllllllIIlllIIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIIllIllII() {
        lllIIIIlllll = new String[lllIIIlIIIII[5]];
        lllIIIIlllll[lllIIIlIIIII[0]] = lIIIlIIIllIlIlI("CiwLMSA=", "DcYeh");
        lllIIIIlllll[lllIIIlIIIII[1]] = lIIIlIIIllIlIlI("ERgUDSo=", "BWAYb");
        lllIIIIlllll[lllIIIlIIIII[2]] = lIIIlIIIllIlIll("QMoyd3Bc0Pg=", "XMifH");
        lllIIIIlllll[lllIIIlIIIII[3]] = lIIIlIIIllIlIll("stEZvTFiWTU=", "yjRtu");
        lllIIIIlllll[lllIIIlIIIII[4]] = lIIIlIIIllIlIll("tIE6YVBzUqQAYr+6xb0YRA==", "xgldU");
    }

    public static EnumC0010k[] values() {
        return (EnumC0010k[]) $VALUES.clone();
    }
}
