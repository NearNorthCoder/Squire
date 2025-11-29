package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/P.class */
public final class P {
    private static final /* synthetic */ P[] $VALUES;
    private final /* synthetic */ String name;
    public static final /* synthetic */ P EMPTY;
    private static /* synthetic */ String[] lIlIIlIIllll;
    public static final /* synthetic */ P PUZZLE;
    private final /* synthetic */ char code;
    public static final /* synthetic */ P START;
    public static final /* synthetic */ P FARMING;
    public static final /* synthetic */ P COMBAT;
    private static /* synthetic */ int[] lIlIIlIlIIII;
    public static final /* synthetic */ P END;
    public static final /* synthetic */ P SCAVENGERS;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        llIllIIlIIIIIl();
        llIllIIlIIIIII();
        START = new P(lIlIIlIIllll[lIlIIlIlIIII[0]], lIlIIlIlIIII[0], lIlIIlIIllll[lIlIIlIlIIII[1]], lIlIIlIlIIII[2]);
        END = new P(lIlIIlIIllll[lIlIIlIlIIII[3]], lIlIIlIlIIII[1], lIlIIlIIllll[lIlIIlIlIIII[4]], lIlIIlIlIIII[5]);
        SCAVENGERS = new P(lIlIIlIIllll[lIlIIlIlIIII[6]], lIlIIlIlIIII[3], lIlIIlIIllll[lIlIIlIlIIII[7]], lIlIIlIlIIII[8]);
        FARMING = new P(lIlIIlIIllll[lIlIIlIlIIII[9]], lIlIIlIlIIII[4], lIlIIlIIllll[lIlIIlIlIIII[10]], lIlIIlIlIIII[11]);
        EMPTY = new P(lIlIIlIIllll[lIlIIlIlIIII[12]], lIlIIlIlIIII[6], lIlIIlIIllll[lIlIIlIlIIII[13]], lIlIIlIlIIII[14]);
        COMBAT = new P(lIlIIlIIllll[lIlIIlIlIIII[15]], lIlIIlIlIIII[7], lIlIIlIIllll[lIlIIlIlIIII[16]], lIlIIlIlIIII[17]);
        PUZZLE = new P(lIlIIlIIllll[lIlIIlIlIIII[18]], lIlIIlIlIIII[9], lIlIIlIIllll[lIlIIlIlIIII[19]], lIlIIlIlIIII[20]);
        P[] pArr = new P[lIlIIlIlIIII[10]];
        pArr[lIlIIlIlIIII[0]] = START;
        pArr[lIlIIlIlIIII[1]] = END;
        pArr[lIlIIlIlIIII[3]] = SCAVENGERS;
        pArr[lIlIIlIlIIII[4]] = FARMING;
        pArr[lIlIIlIlIIII[6]] = EMPTY;
        pArr[lIlIIlIlIIII[7]] = COMBAT;
        pArr[lIlIIlIlIIII[9]] = PUZZLE;
        $VALUES = pArr;
    }

    public N ce() {
        switch (Q.cm[ordinal()]) {
            case 1:
                return N.START;
            case 2:
                return N.END;
            case 3:
                return N.SCAVENGERS;
            case 4:
                return N.FARMING;
            case 5:
                return N.UNKNOWN_COMBAT;
            case 6:
                return N.UNKNOWN_PUZZLE;
            case 7:
            default:
                return N.EMPTY;
        }
    }

    private static String llIllIIIllllIl(String lllllllllllllllIllIllIlIllIIlIII, String lllllllllllllllIllIllIlIllIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIllIllIlIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIlIllIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIlIllIIllII.init(lIlIIlIlIIII[3], lllllllllllllllIllIllIlIllIIllIl);
            return new String(lllllllllllllllIllIllIlIllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIlIllIIlIll) {
            lllllllllllllllIllIllIlIllIIlIll.printStackTrace();
            return null;
        }
    }

    private static String llIllIIIllllll(String lllllllllllllllIllIllIlIllIlllll, String lllllllllllllllIllIllIlIllIllllI) {
        String lllllllllllllllIllIllIlIllIlllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIlIllIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIllIllIlIllIlllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIllIllIlIllIllllI.toCharArray();
        int lllllllllllllllIllIllIlIllIllIll = lIlIIlIlIIII[0];
        char[] charArray2 = lllllllllllllllIllIllIlIllIlllll2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIlIIII[0];
        while (llIllIIlIIIIlI(i, length)) {
            char lllllllllllllllIllIllIlIlllIIIII = charArray2[i];
            lllllllllllllllIllIllIlIllIlllIl.append((char) (lllllllllllllllIllIllIlIlllIIIII ^ charArray[lllllllllllllllIllIllIlIllIllIll % charArray.length]));
            "".length();
            lllllllllllllllIllIllIlIllIllIll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIllIllIlIllIlllIl);
    }

    private static boolean llIllIIlIIIIlI(int i, int i2) {
        return i < i2;
    }

    private static void llIllIIlIIIIII() {
        lIlIIlIIllll = new String[lIlIIlIlIIII[21]];
        lIlIIlIIllll[lIlIIlIlIIII[0]] = llIllIIIllllIl("fxn/twebTcw=", "wfwBr");
        lIlIIlIIllll[lIlIIlIlIIII[1]] = llIllIIIlllllI("2SYof8c78l8=", "viTSR");
        lIlIIlIIllll[lIlIIlIlIIII[3]] = llIllIIIllllIl("h2c/H0kiD1c=", "WiNqC");
        lIlIIlIIllll[lIlIIlIlIIII[4]] = llIllIIIllllll("Ex4B", "Vpeld");
        lIlIIlIIllll[lIlIIlIlIIII[6]] = llIllIIIlllllI("aov4oovc1emxMNONHKaqPQ==", "ihcWW");
        lIlIIlIIllll[lIlIIlIlIIII[7]] = llIllIIIllllll("HBcZJSEhEx0hNw==", "OtxSD");
        lIlIIlIIllll[lIlIIlIlIIII[9]] = llIllIIIllllIl("1ejv0T0NLFg=", "LaOdJ");
        lIlIIlIIllll[lIlIIlIlIIII[10]] = llIllIIIllllIl("DaISl/YqXzk=", "pWNaB");
        lIlIIlIIllll[lIlIIlIlIIII[12]] = llIllIIIllllIl("QuQvh/I78Cc=", "gbiRe");
        lIlIIlIIllll[lIlIIlIlIIII[13]] = llIllIIIllllll("MyMWMgg=", "vNfFq");
        lIlIIlIIllll[lIlIIlIlIIII[15]] = llIllIIIlllllI("kTq/4fPHMWI=", "UBsfp");
        lIlIIlIIllll[lIlIIlIlIIII[16]] = llIllIIIllllIl("8Qr+IG5Q404=", "SuofT");
        lIlIIlIIllll[lIlIIlIlIIII[18]] = llIllIIIllllll("AAE4MSEV", "PTbkm");
        lIlIIlIIllll[lIlIIlIlIIII[19]] = llIllIIIllllll("Ii0qOy0X", "rXPAA");
    }

    public static P c(char c2) {
        P[] values = values();
        int length = values.length;
        int i = lIlIIlIlIIII[0];
        while (llIllIIlIIIIlI(i, length)) {
            P p = values[i];
            if (llIllIIlIIIIll(p.cf(), c2)) {
                return p;
            }
            i++;
            "".length();
            if ((((26 ^ 70) ^ (220 ^ 146)) & (((248 ^ 196) ^ (174 ^ 128)) ^ (-" ".length()))) != (" ".length() & (" ".length() ^ (-" ".length())))) {
                return null;
            }
        }
        return EMPTY;
    }

    public static P valueOf(String str) {
        return (P) Enum.valueOf(P.class, str);
    }

    private static void llIllIIlIIIIIl() {
        lIlIIlIlIIII = new int[22];
        lIlIIlIlIIII[0] = ((224 ^ 179) ^ (16 ^ 0)) & (((((210 + 41) - 220) + 186) ^ (((132 + 44) - 132) + 110)) ^ (-" ".length()));
        lIlIIlIlIIII[1] = " ".length();
        lIlIIlIlIIII[2] = (95 ^ 46) ^ (40 ^ 122);
        lIlIIlIlIIII[3] = "  ".length();
        lIlIIlIlIIII[4] = "   ".length();
        lIlIIlIlIIII[5] = (((75 ^ 1) + (66 ^ 58)) - (((56 + 84) - 1) + 15)) + (34 ^ 94);
        lIlIIlIlIIII[6] = 122 ^ 126;
        lIlIIlIlIIII[7] = 171 ^ 174;
        lIlIIlIlIIII[8] = 77 ^ 30;
        lIlIIlIlIIII[9] = 92 ^ 90;
        lIlIIlIlIIII[10] = (226 ^ 143) ^ (86 ^ 60);
        lIlIIlIlIIII[11] = 22 ^ 80;
        lIlIIlIlIIII[12] = (219 ^ 185) ^ (255 ^ 149);
        lIlIIlIlIIII[13] = (46 ^ 24) ^ (87 ^ 104);
        lIlIIlIlIIII[14] = 61 ^ 29;
        lIlIIlIlIIII[15] = 108 ^ 102;
        lIlIIlIlIIII[16] = 185 ^ 178;
        lIlIIlIlIIII[17] = (((188 + 58) - 49) + 53) ^ (((25 + 106) - 39) + 93);
        lIlIIlIlIIII[18] = (82 ^ 55) ^ (70 ^ 47);
        lIlIIlIlIIII[19] = 163 ^ 174;
        lIlIIlIlIIII[20] = (((165 + 171) - 209) + 86) ^ (((63 + 52) - 83) + 101);
        lIlIIlIlIIII[21] = 160 ^ 174;
    }

    public char cf() {
        return this.code;
    }

    public String bX() {
        return this.name;
    }

    private P(String str, int i, String str2, char c2) {
        this.name = str2;
        this.code = c2;
    }

    private static boolean llIllIIlIIIIll(int i, int i2) {
        return i == i2;
    }

    public static P[] values() {
        return (P[]) $VALUES.clone();
    }

    private static String llIllIIIlllllI(String lllllllllllllllIllIllIlIlIllllIl, String lllllllllllllllIllIllIlIlIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIlIlIllllII.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIIII[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIlIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIlIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIlIlIlllllI) {
            lllllllllllllllIllIllIlIlIlllllI.printStackTrace();
            return null;
        }
    }
}
