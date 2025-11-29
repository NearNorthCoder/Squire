/*
 * Decompiled with CFR 0.152.
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class y
extends Enum<y> {
    public static final /* synthetic */ /* enum */ y MAHOGANY_RUNE;
    public static final /* synthetic */ /* enum */ y REGULAR_STEEL;
    public static final /* synthetic */ /* enum */ y NONE;
    public static final /* synthetic */ /* enum */ y OAK_MITHRIL;
    public static final /* synthetic */ /* enum */ y TEAK_ADAMANT;
    private static final /* synthetic */ y[] $VALUES;
    private static /* synthetic */ String[] lllIIIlllIll;
    /* synthetic */ String name;
    private static /* synthetic */ int[] lllIIIllllII;

    private static String lIIIlIIllIlllII(String lllllllllllllllIIllIlIlllllIIIll, String lllllllllllllllIIllIlIlllllIIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIlllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIlllllIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIlllllIIlll.init(lllIIIllllII[2], lllllllllllllllIIllIlIlllllIlIII);
            return new String(lllllllllllllllIIllIlIlllllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIlllllIIllI) {
            lllllllllllllllIIllIlIlllllIIllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIllIllllI() {
        lllIIIlllIll = new String[lllIIIllllII[10]];
        y.lllIIIlllIll[y.lllIIIllllII[0]] = y.lIIIlIIllIllIll("PAs+LA==", "rDpiY");
        y.lllIIIlllIll[y.lllIIIllllII[1]] = y.lIIIlIIllIllIll("", "cQpgg");
        y.lllIIIlllIll[y.lllIIIllllII[2]] = y.lIIIlIIllIlllII("gSnikCqytrkV4Yrmwi+eYw==", "DwUYT");
        y.lllIIIlllIll[y.lllIIIllllII[3]] = y.lIIIlIIllIlllIl("AgcO4NW/zDA=", "UNgQI");
        y.lllIIIlllIll[y.lllIIIllllII[4]] = y.lIIIlIIllIlllII("D+rEWRNgM3VXnLTevic6ag==", "ifVfL");
        y.lllIIIlllIll[y.lllIIIllllII[5]] = y.lIIIlIIllIlllIl("AbBifuy7EEg=", "TzZOJ");
        y.lllIIIlllIll[y.lllIIIllllII[6]] = y.lIIIlIIllIlllII("Wn/QRFO/PnkZJkORpWJJVA==", "LfXSP");
        y.lllIIIlllIll[y.lllIIIllllII[7]] = y.lIIIlIIllIlllIl("m6lWtxjJnq8=", "FnxZn");
        y.lllIIIlllIll[y.lllIIIllllII[8]] = y.lIIIlIIllIllIll("JRgwFRQpFyEFAT0XPQ==", "hYxZS");
        y.lllIIIlllIll[y.lllIIIllllII[9]] = y.lIIIlIIllIlllIl("E8W3bkJzcLw=", "DUsns");
    }

    static {
        y.lIIIlIIllIlllll();
        y.lIIIlIIllIllllI();
        NONE = new y(lllIIIlllIll[lllIIIllllII[1]]);
        REGULAR_STEEL = new y(lllIIIlllIll[lllIIIllllII[3]]);
        OAK_MITHRIL = new y(lllIIIlllIll[lllIIIllllII[5]]);
        TEAK_ADAMANT = new y(lllIIIlllIll[lllIIIllllII[7]]);
        MAHOGANY_RUNE = new y(lllIIIlllIll[lllIIIllllII[9]]);
        y[] yArray = new y[lllIIIllllII[5]];
        yArray[y.lllIIIllllII[0]] = NONE;
        yArray[y.lllIIIllllII[1]] = REGULAR_STEEL;
        yArray[y.lllIIIllllII[2]] = OAK_MITHRIL;
        yArray[y.lllIIIllllII[3]] = TEAK_ADAMANT;
        yArray[y.lllIIIllllII[4]] = MAHOGANY_RUNE;
        $VALUES = yArray;
    }

    private static String lIIIlIIllIllIll(String lllllllllllllllIIllIlIllllIlIIII, String lllllllllllllllIIllIlIllllIIllll) {
        lllllllllllllllIIllIlIllllIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIllllIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIllllIlIIll = new StringBuilder();
        char[] lllllllllllllllIIllIlIllllIlIIlI = lllllllllllllllIIllIlIllllIIllll.toCharArray();
        int lllllllllllllllIIllIlIllllIlIIIl = lllIIIllllII[0];
        char[] lllllllllllllllIIllIlIllllIIlIll = lllllllllllllllIIllIlIllllIlIIII.toCharArray();
        int lllllllllllllllIIllIlIllllIIlIlI = lllllllllllllllIIllIlIllllIIlIll.length;
        int lllllllllllllllIIllIlIllllIIlIIl = lllIIIllllII[0];
        while (y.lIIIlIIlllIIIII(lllllllllllllllIIllIlIllllIIlIIl, lllllllllllllllIIllIlIllllIIlIlI)) {
            char lllllllllllllllIIllIlIllllIlIllI = lllllllllllllllIIllIlIllllIIlIll[lllllllllllllllIIllIlIllllIIlIIl];
            lllllllllllllllIIllIlIllllIlIIll.append((char)(lllllllllllllllIIllIlIllllIlIllI ^ lllllllllllllllIIllIlIllllIlIIlI[lllllllllllllllIIllIlIllllIlIIIl % lllllllllllllllIIllIlIllllIlIIlI.length]));
            "".length();
            ++lllllllllllllllIIllIlIllllIlIIIl;
            ++lllllllllllllllIIllIlIllllIIlIIl;
            "".length();
            if ((116 + 20 - 11 + 50 ^ 102 + 149 - 181 + 100) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIllllIlIIll);
    }

    private static boolean lIIIlIIlllIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIllIlllll() {
        lllIIIllllII = new int[11];
        y.lllIIIllllII[0] = (0x67 ^ 0x22 ^ (0x19 ^ 0x1F)) & (0x16 ^ 0x61 ^ (0x4E ^ 0x7A) ^ -" ".length());
        y.lllIIIllllII[1] = " ".length();
        y.lllIIIllllII[2] = "  ".length();
        y.lllIIIllllII[3] = "   ".length();
        y.lllIIIllllII[4] = 73 + 24 - -35 + 8 ^ 82 + 47 - 128 + 135;
        y.lllIIIllllII[5] = 0x9F ^ 0x9A;
        y.lllIIIllllII[6] = 0xC1 ^ 0xC7;
        y.lllIIIllllII[7] = 0x76 ^ 0x4A ^ (0x35 ^ 0xE);
        y.lllIIIllllII[8] = 0x53 ^ 0x48 ^ (0xBF ^ 0xAC);
        y.lllIIIllllII[9] = 0xE0 ^ 0xAD ^ (0x57 ^ 0x13);
        y.lllIIIllllII[10] = 0 ^ 0xA;
    }

    public static y[] values() {
        return (y[])$VALUES.clone();
    }

    private static String lIIIlIIllIlllIl(String lllllllllllllllIIllIlIllllllIIII, String lllllllllllllllIIllIlIllllllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIllllllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIllllllIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIllllII[8]), "DES");
            Cipher lllllllllllllllIIllIlIllllllIlII = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIllllllIlII.init(lllIIIllllII[2], lllllllllllllllIIllIlIllllllIlIl);
            return new String(lllllllllllllllIIllIlIllllllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIllllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIllllllIIll) {
            lllllllllllllllIIllIlIllllllIIll.printStackTrace();
            return null;
        }
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    private y(String string2) {
        this.name = string2;
    }
}

