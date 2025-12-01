package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.y  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/y.class */
public final class y {
    public static final /* synthetic */ y MAHOGANY_RUNE;
    public static final /* synthetic */ y REGULAR_STEEL;
    public static final /* synthetic */ y NONE;
    public static final /* synthetic */ y OAK_MITHRIL;
    public static final /* synthetic */ y TEAK_ADAMANT;
    private static final /* synthetic */ y[] $VALUES;
    private static /* synthetic */ String[] lllIIIlllIll;
    /* synthetic */ String name;
    private static /* synthetic */ int[] lllIIIllllII;

    private static String lIIIlIIllIlllII(String lllllllllllllllIIllIlIlllllIIlIl, String lllllllllllllllIIllIlIlllllIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIIllllII[2], lllllllllllllllIIllIlIlllllIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIlllllIIllI) {
            lllllllllllllllIIllIlIlllllIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIllIllllI() {
        lllIIIlllIll = new String[lllIIIllllII[10]];
        lllIIIlllIll[lllIIIllllII[0]] = lIIIlIIllIllIll("PAs+LA==", "rDpiY");
        lllIIIlllIll[lllIIIllllII[1]] = lIIIlIIllIllIll("", "cQpgg");
        lllIIIlllIll[lllIIIllllII[2]] = lIIIlIIllIlllII("gSnikCqytrkV4Yrmwi+eYw==", "DwUYT");
        lllIIIlllIll[lllIIIllllII[3]] = lIIIlIIllIlllIl("AgcO4NW/zDA=", "UNgQI");
        lllIIIlllIll[lllIIIllllII[4]] = lIIIlIIllIlllII("D+rEWRNgM3VXnLTevic6ag==", "ifVfL");
        lllIIIlllIll[lllIIIllllII[5]] = lIIIlIIllIlllIl("AbBifuy7EEg=", "TzZOJ");
        lllIIIlllIll[lllIIIllllII[6]] = lIIIlIIllIlllII("Wn/QRFO/PnkZJkORpWJJVA==", "LfXSP");
        lllIIIlllIll[lllIIIllllII[7]] = lIIIlIIllIlllIl("m6lWtxjJnq8=", "FnxZn");
        lllIIIlllIll[lllIIIllllII[8]] = lIIIlIIllIllIll("JRgwFRQpFyEFAT0XPQ==", "hYxZS");
        lllIIIlllIll[lllIIIllllII[9]] = lIIIlIIllIlllIl("E8W3bkJzcLw=", "DUsns");
    }

    static {
        lIIIlIIllIlllll();
        lIIIlIIllIllllI();
        NONE = new y(lllIIIlllIll[lllIIIllllII[0]], lllIIIllllII[0], lllIIIlllIll[lllIIIllllII[1]]);
        REGULAR_STEEL = new y(lllIIIlllIll[lllIIIllllII[2]], lllIIIllllII[1], lllIIIlllIll[lllIIIllllII[3]]);
        OAK_MITHRIL = new y(lllIIIlllIll[lllIIIllllII[4]], lllIIIllllII[2], lllIIIlllIll[lllIIIllllII[5]]);
        TEAK_ADAMANT = new y(lllIIIlllIll[lllIIIllllII[6]], lllIIIllllII[3], lllIIIlllIll[lllIIIllllII[7]]);
        MAHOGANY_RUNE = new y(lllIIIlllIll[lllIIIllllII[8]], lllIIIllllII[4], lllIIIlllIll[lllIIIllllII[9]]);
        y[] yVarArr = new y[lllIIIllllII[5]];
        yVarArr[lllIIIllllII[0]] = NONE;
        yVarArr[lllIIIllllII[1]] = REGULAR_STEEL;
        yVarArr[lllIIIllllII[2]] = OAK_MITHRIL;
        yVarArr[lllIIIllllII[3]] = TEAK_ADAMANT;
        yVarArr[lllIIIllllII[4]] = MAHOGANY_RUNE;
        $VALUES = yVarArr;
    }

    private static String lIIIlIIllIllIll(String lllllllllllllllIIllIlIllllIlIlIl, String lllllllllllllllIIllIlIllllIlIlII) {
        String lllllllllllllllIIllIlIllllIlIlIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIlIllllIlIlII.toCharArray();
        int lllllllllllllllIIllIlIllllIlIIIl = lllIIIllllII[0];
        char[] charArray2 = lllllllllllllllIIllIlIllllIlIlIl2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIllllII[0];
        while (lIIIlIIlllIIIII(i, length)) {
            char lllllllllllllllIIllIlIllllIlIllI = charArray2[i];
            sb.append((char) (lllllllllllllllIIllIlIllllIlIllI ^ charArray[lllllllllllllllIIllIlIllllIlIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIlIllllIlIIIl++;
            i++;
            "".length();
            if (((((116 + 20) - 11) + 50) ^ (((102 + 149) - 181) + 100)) <= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIlIIlllIIIII(int i, int i2) {
        return i < i2;
    }

    private static void lIIIlIIllIlllll() {
        lllIIIllllII = new int[11];
        lllIIIllllII[0] = ((103 ^ 34) ^ (25 ^ 31)) & (((22 ^ 97) ^ (78 ^ 122)) ^ (-" ".length()));
        lllIIIllllII[1] = " ".length();
        lllIIIllllII[2] = "  ".length();
        lllIIIllllII[3] = "   ".length();
        lllIIIllllII[4] = (((73 + 24) - (-35)) + 8) ^ (((82 + 47) - 128) + 135);
        lllIIIllllII[5] = 159 ^ 154;
        lllIIIllllII[6] = 193 ^ 199;
        lllIIIllllII[7] = (118 ^ 74) ^ (53 ^ 14);
        lllIIIllllII[8] = (83 ^ 72) ^ (191 ^ 172);
        lllIIIllllII[9] = (224 ^ 173) ^ (87 ^ 19);
        lllIIIllllII[10] = 0 ^ 10;
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }

    private static String lIIIlIIllIlllIl(String lllllllllllllllIIllIlIllllllIIlI, String lllllllllllllllIIllIlIllllllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIllllllIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIllllII[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIllllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIllllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIlIllllllIIll) {
            lllllllllllllllIIllIlIllllllIIll.printStackTrace();
            return null;
        }
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    private y(String str, int i, String str2) {
        this.name = str2;
    }
}
