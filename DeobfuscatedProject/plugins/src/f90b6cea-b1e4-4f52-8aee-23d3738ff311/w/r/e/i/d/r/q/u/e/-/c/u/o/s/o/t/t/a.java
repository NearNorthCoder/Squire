/*
 * Decompiled with CFR 0.152.
 */
package w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class a
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a MAHOGANY;
    public static final /* synthetic */ /* enum */ a TEAK;
    private final /* synthetic */ int logId;
    public static final /* synthetic */ /* enum */ a WILLOW;
    private static /* synthetic */ int[] lIllIIIIlIlII;
    public static final /* synthetic */ /* enum */ a OAK;
    public static final /* synthetic */ /* enum */ a REDWOOD;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ /* enum */ a MAGIC;
    public static final /* synthetic */ /* enum */ a YEW;
    public static final /* synthetic */ /* enum */ a MAPLE;
    public static final /* synthetic */ /* enum */ a BLISTERWOOD;
    private static /* synthetic */ String[] lIllIIIIIllll;
    private final /* synthetic */ String treeName;
    public static final /* synthetic */ /* enum */ a TREE;

    private static void llIIIlIIIlIIlll() {
        lIllIIIIlIlII = new int[31];
        a.lIllIIIIlIlII[0] = (0x81 ^ 0x8A) & ~(0x29 ^ 0x22);
        a.lIllIIIIlIlII[1] = " ".length();
        a.lIllIIIIlIlII[2] = 0xFFFFCFF7 & 0x35EF;
        a.lIllIIIIlIlII[3] = "  ".length();
        a.lIllIIIIlIlII[4] = "   ".length();
        a.lIllIIIIlIlII[5] = -(0xFFFFEF27 & 0x3ADD) & (0xFFFFEFF7 & 0x3FFD);
        a.lIllIIIIlIlII[6] = 0xF5 ^ 0xA0 ^ (0x3B ^ 0x6A);
        a.lIllIIIIlIlII[7] = 0xB2 ^ 0xB7;
        a.lIllIIIIlIlII[8] = -(0xFFFFEBDF & 0x5E31) & (0xFFFFDFFF & 0x6FFF);
        a.lIllIIIIlIlII[9] = 0 ^ 0x2D ^ (0x8A ^ 0xA1);
        a.lIllIIIIlIlII[10] = 0xB ^ 0xC;
        a.lIllIIIIlIlII[11] = 0xFFFF9EFF & 0x79BD;
        a.lIllIIIIlIlII[12] = 0x25 ^ 0x2D;
        a.lIllIIIIlIlII[13] = 0xA9 ^ 0x93 ^ (0xA6 ^ 0x95);
        a.lIllIIIIlIlII[14] = -(0xFFFFFE17 & 0x7BEB) & (0xFFFFFFEF & Short.MAX_VALUE);
        a.lIllIIIIlIlII[15] = 0xDA ^ 0xA0 ^ (5 ^ 0x75);
        a.lIllIIIIlIlII[16] = 101 + 103 - 134 + 131 ^ 142 + 130 - 185 + 107;
        a.lIllIIIIlIlII[17] = 0xFFFFFCBC & 0x1BFF;
        a.lIllIIIIlIlII[18] = 105 + 101 - 86 + 11 ^ 12 + 110 - 8 + 29;
        a.lIllIIIIlIlII[19] = 175 + 113 - 217 + 112 ^ 82 + 47 - 66 + 123;
        a.lIllIIIIlIlII[20] = -(0xFFFFE65F & 0x79A1) & (0xFFFFEFFF & 0x75EB);
        a.lIllIIIIlIlII[21] = 8 ^ 6;
        a.lIllIIIIlIlII[22] = 0xA1 ^ 0xAE;
        a.lIllIIIIlIlII[23] = -(0xFFFFD71D & 0x3AE3) & (0xFFFFFAFF & 0x7773);
        a.lIllIIIIlIlII[24] = 0x28 ^ 0x38;
        a.lIllIIIIlIlII[25] = 0xA5 ^ 0xAB ^ (0x63 ^ 0x7C);
        a.lIllIIIIlIlII[26] = 0xFFFFE7E9 & 0x1DFF;
        a.lIllIIIIlIlII[27] = 0xB7 ^ 0xA5;
        a.lIllIIIIlIlII[28] = 0x55 ^ 0x46;
        a.lIllIIIIlIlII[29] = -(0xFFFFB363 & 0x7D9F) & (0xFFFFFFF7 & 0x7DDF);
        a.lIllIIIIlIlII[30] = 0x59 ^ 0x4D;
    }

    private static String llIIIlIIIIlIIIl(String llllllllllllllIllIIllIIllIlIlIlI, String llllllllllllllIllIIllIIllIlIIlII) {
        llllllllllllllIllIIllIIllIlIlIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIIllIlIlIII = new StringBuilder();
        char[] llllllllllllllIllIIllIIllIlIIlll = llllllllllllllIllIIllIIllIlIIlII.toCharArray();
        int llllllllllllllIllIIllIIllIlIIllI = lIllIIIIlIlII[0];
        char[] llllllllllllllIllIIllIIllIlIIIII = llllllllllllllIllIIllIIllIlIlIlI.toCharArray();
        int llllllllllllllIllIIllIIllIIlllll = llllllllllllllIllIIllIIllIlIIIII.length;
        int llllllllllllllIllIIllIIllIIllllI = lIllIIIIlIlII[0];
        while (a.llIIIlIIIlIlIIl(llllllllllllllIllIIllIIllIIllllI, llllllllllllllIllIIllIIllIIlllll)) {
            char llllllllllllllIllIIllIIllIlIlIll = llllllllllllllIllIIllIIllIlIIIII[llllllllllllllIllIIllIIllIIllllI];
            llllllllllllllIllIIllIIllIlIlIII.append((char)(llllllllllllllIllIIllIIllIlIlIll ^ llllllllllllllIllIIllIIllIlIIlll[llllllllllllllIllIIllIIllIlIIllI % llllllllllllllIllIIllIIllIlIIlll.length]));
            "".length();
            ++llllllllllllllIllIIllIIllIlIIllI;
            ++llllllllllllllIllIIllIIllIIllllI;
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIllIIllIlIlIII);
    }

    public int s() {
        return this.logId;
    }

    static {
        a.llIIIlIIIlIIlll();
        a.llIIIlIIIlIIlIl();
        TREE = new a(lIllIIIIIllll[lIllIIIIlIlII[1]], lIllIIIIlIlII[2]);
        OAK = new a(lIllIIIIIllll[lIllIIIIlIlII[4]], lIllIIIIlIlII[5]);
        WILLOW = new a(lIllIIIIIllll[lIllIIIIlIlII[7]], lIllIIIIlIlII[8]);
        TEAK = new a(lIllIIIIIllll[lIllIIIIlIlII[10]], lIllIIIIlIlII[11]);
        MAPLE = new a(lIllIIIIIllll[lIllIIIIlIlII[13]], lIllIIIIlIlII[14]);
        MAHOGANY = new a(lIllIIIIIllll[lIllIIIIlIlII[16]], lIllIIIIlIlII[17]);
        YEW = new a(lIllIIIIIllll[lIllIIIIlIlII[19]], lIllIIIIlIlII[20]);
        BLISTERWOOD = new a(lIllIIIIIllll[lIllIIIIlIlII[22]], lIllIIIIlIlII[23]);
        MAGIC = new a(lIllIIIIIllll[lIllIIIIlIlII[25]], lIllIIIIlIlII[26]);
        REDWOOD = new a(lIllIIIIIllll[lIllIIIIlIlII[28]], lIllIIIIlIlII[29]);
        a[] aArray = new a[lIllIIIIlIlII[15]];
        aArray[a.lIllIIIIlIlII[0]] = TREE;
        aArray[a.lIllIIIIlIlII[1]] = OAK;
        aArray[a.lIllIIIIlIlII[3]] = WILLOW;
        aArray[a.lIllIIIIlIlII[4]] = TEAK;
        aArray[a.lIllIIIIlIlII[6]] = MAPLE;
        aArray[a.lIllIIIIlIlII[7]] = MAHOGANY;
        aArray[a.lIllIIIIlIlII[9]] = YEW;
        aArray[a.lIllIIIIlIlII[10]] = BLISTERWOOD;
        aArray[a.lIllIIIIlIlII[12]] = MAGIC;
        aArray[a.lIllIIIIlIlII[13]] = REDWOOD;
        $VALUES = aArray;
    }

    private static void llIIIlIIIlIIlIl() {
        lIllIIIIIllll = new String[lIllIIIIlIlII[30]];
        a.lIllIIIIIllll[a.lIllIIIIlIlII[0]] = a.llIIIlIIIIlIIII("zObILKeC8Zw=", "BDxzO");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[1]] = a.llIIIlIIIIlIIII("FDtksM+avag=", "AZpaY");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[3]] = a.llIIIlIIIIlIIIl("NRYp", "zWbvI");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[4]] = a.llIIIlIIIIlIIIl("OzA7", "tQPuP");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[6]] = a.llIIIlIIIIlIIlI("TWYu4aAPpgk=", "EYbfZ");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[7]] = a.llIIIlIIIIlIIlI("+2G1wPr93K0=", "XdYqs");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[9]] = a.llIIIlIIIIlIIlI("LKc2MVFE5Fo=", "bgkTi");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[10]] = a.llIIIlIIIIlIIlI("h5YJVYJID8Q=", "GTRLA");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[12]] = a.llIIIlIIIIlIIII("Q+C1bbJDpcw=", "tNMzI");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[13]] = a.llIIIlIIIIlIIlI("wsW+JqUvX6k=", "uOnRo");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[15]] = a.llIIIlIIIIlIIIl("AxIDFwYPHRI=", "NSKXA");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[16]] = a.llIIIlIIIIlIIlI("84Igd3Ys9e6Ir1CryS5rgw==", "izzNA");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[18]] = a.llIIIlIIIIlIIlI("FMI9JNMUOcA=", "BnNRw");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[19]] = a.llIIIlIIIIlIIII("Nlj53N5LXos=", "lNLHv");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[21]] = a.llIIIlIIIIlIIlI("Zq2KzwDDPyItqq+sWKTINA==", "oPDAp");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[22]] = a.llIIIlIIIIlIIII("DdrOLx9tsTKw+6UDP+yF2A==", "zBixv");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[24]] = a.llIIIlIIIIlIIIl("IRA2AgI=", "lQqKA");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[25]] = a.llIIIlIIIIlIIII("AovCGKnYi5U=", "przWz");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[27]] = a.llIIIlIIIIlIIlI("hJ6bkfWMSDk=", "HpZdC");
        a.lIllIIIIIllll[a.lIllIIIIlIlII[28]] = a.llIIIlIIIIlIIlI("LIh5pQKeQjQ=", "NjLke");
    }

    public String r() {
        return this.treeName;
    }

    private static String llIIIlIIIIlIIII(String llllllllllllllIllIIllIIllIIlIlIl, String llllllllllllllIllIIllIIllIIlIlII) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIllIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIllIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIllIIllIIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIllIIllIIlIlll.init(lIllIIIIlIlII[3], llllllllllllllIllIIllIIllIIllIII);
            return new String(llllllllllllllIllIIllIIllIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIIllIIlIllI) {
            llllllllllllllIllIIllIIllIIlIllI.printStackTrace();
            return null;
        }
    }

    private a(String string2, int n2) {
        this.treeName = string2;
        this.logId = n2;
    }

    private static boolean llIIIlIIIlIlIIl(int n, int n2) {
        return n < n2;
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private static String llIIIlIIIIlIIlI(String llllllllllllllIllIIllIIllIlllIlI, String llllllllllllllIllIIllIIllIllIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIllIllIlll.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIlII[12]), "DES");
            Cipher llllllllllllllIllIIllIIllIllllII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIIllIllllII.init(lIllIIIIlIlII[3], llllllllllllllIllIIllIIllIllllIl);
            return new String(llllllllllllllIllIIllIIllIllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIllIIllIlllIll) {
            llllllllllllllIllIIllIIllIlllIll.printStackTrace();
            return null;
        }
    }
}

