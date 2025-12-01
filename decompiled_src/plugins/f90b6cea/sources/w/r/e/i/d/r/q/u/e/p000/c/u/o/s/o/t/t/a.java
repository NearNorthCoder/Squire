package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.a  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/a.class */
public final class a {
    public static final /* synthetic */ a MAHOGANY;
    public static final /* synthetic */ a TEAK;
    private final /* synthetic */ int logId;
    public static final /* synthetic */ a WILLOW;
    private static /* synthetic */ int[] lIllIIIIlIlII;
    public static final /* synthetic */ a OAK;
    public static final /* synthetic */ a REDWOOD;
    private static final /* synthetic */ a[] $VALUES;
    public static final /* synthetic */ a MAGIC;
    public static final /* synthetic */ a YEW;
    public static final /* synthetic */ a MAPLE;
    public static final /* synthetic */ a BLISTERWOOD;
    private static /* synthetic */ String[] lIllIIIIIllll;
    private final /* synthetic */ String treeName;
    public static final /* synthetic */ a TREE;

    private static void llIIIlIIIlIIlll() {
        lIllIIIIlIlII = new int[31];
        lIllIIIIlIlII[0] = (129 ^ 138) & ((41 ^ 34) ^ (-1));
        lIllIIIIlIlII[1] = " ".length();
        lIllIIIIlIlII[2] = (-12297) & 13807;
        lIllIIIIlIlII[3] = "  ".length();
        lIllIIIIlIlII[4] = "   ".length();
        lIllIIIIlIlII[5] = (-((-4313) & 15069)) & (-4105) & 16381;
        lIllIIIIlIlII[6] = (245 ^ 160) ^ (59 ^ 106);
        lIllIIIIlIlII[7] = 178 ^ 183;
        lIllIIIIlIlII[8] = (-((-5153) & 24113)) & (-8193) & 28671;
        lIllIIIIlIlII[9] = (0 ^ 45) ^ (138 ^ 161);
        lIllIIIIlIlII[10] = 11 ^ 12;
        lIllIIIIlIlII[11] = (-24833) & 31165;
        lIllIIIIlIlII[12] = 37 ^ 45;
        lIllIIIIlIlII[13] = (169 ^ 147) ^ (166 ^ 149);
        lIllIIIIlIlII[14] = (-((-489) & 31723)) & (-17) & 32767;
        lIllIIIIlIlII[15] = (218 ^ 160) ^ (5 ^ 117);
        lIllIIIIlIlII[16] = (((101 + 103) - 134) + 131) ^ (((142 + 130) - 185) + 107);
        lIllIIIIlIlII[17] = (-836) & 7167;
        lIllIIIIlIlII[18] = (((105 + 101) - 86) + 11) ^ (((12 + 110) - 8) + 29);
        lIllIIIIlIlII[19] = (((175 + 113) - 217) + 112) ^ (((82 + 47) - 66) + 123);
        lIllIIIIlIlII[20] = (-((-6561) & 31137)) & (-4097) & 30187;
        lIllIIIIlIlII[21] = 8 ^ 6;
        lIllIIIIlIlII[22] = 161 ^ 174;
        lIllIIIIlIlII[23] = (-((-10467) & 15075)) & (-1281) & 30579;
        lIllIIIIlIlII[24] = 40 ^ 56;
        lIllIIIIlIlII[25] = (165 ^ 171) ^ (99 ^ 124);
        lIllIIIIlIlII[26] = (-6167) & 7679;
        lIllIIIIlIlII[27] = 183 ^ 165;
        lIllIIIIlIlII[28] = 85 ^ 70;
        lIllIIIIlIlII[29] = (-((-19613) & 32159)) & (-9) & 32223;
        lIllIIIIlIlII[30] = 89 ^ 77;
    }

    private static String llIIIlIIIIlIIIl(String llllllllllllllIllIIllIIllIlIlIlI, String llllllllllllllIllIIllIIllIlIlIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIIllIlIlIII = new StringBuilder();
        char[] llllllllllllllIllIIllIIllIlIIlll = llllllllllllllIllIIllIIllIlIlIIl.toCharArray();
        int llllllllllllllIllIIllIIllIlIIIIl = lIllIIIIlIlII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIIIlIlII[0];
        while (llIIIlIIIlIlIIl(i, length)) {
            char llllllllllllllIllIIllIIllIlIlIll = charArray[i];
            llllllllllllllIllIIllIIllIlIlIII.append((char) (llllllllllllllIllIIllIIllIlIlIll ^ llllllllllllllIllIIllIIllIlIIlll[llllllllllllllIllIIllIIllIlIIIIl % llllllllllllllIllIIllIIllIlIIlll.length]));
            "".length();
            llllllllllllllIllIIllIIllIlIIIIl++;
            i++;
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIllIIllIlIlIII);
    }

    public int s() {
        return this.logId;
    }

    static {
        llIIIlIIIlIIlll();
        llIIIlIIIlIIlIl();
        TREE = new a(lIllIIIIIllll[lIllIIIIlIlII[0]], lIllIIIIlIlII[0], lIllIIIIIllll[lIllIIIIlIlII[1]], lIllIIIIlIlII[2]);
        OAK = new a(lIllIIIIIllll[lIllIIIIlIlII[3]], lIllIIIIlIlII[1], lIllIIIIIllll[lIllIIIIlIlII[4]], lIllIIIIlIlII[5]);
        WILLOW = new a(lIllIIIIIllll[lIllIIIIlIlII[6]], lIllIIIIlIlII[3], lIllIIIIIllll[lIllIIIIlIlII[7]], lIllIIIIlIlII[8]);
        TEAK = new a(lIllIIIIIllll[lIllIIIIlIlII[9]], lIllIIIIlIlII[4], lIllIIIIIllll[lIllIIIIlIlII[10]], lIllIIIIlIlII[11]);
        MAPLE = new a(lIllIIIIIllll[lIllIIIIlIlII[12]], lIllIIIIlIlII[6], lIllIIIIIllll[lIllIIIIlIlII[13]], lIllIIIIlIlII[14]);
        MAHOGANY = new a(lIllIIIIIllll[lIllIIIIlIlII[15]], lIllIIIIlIlII[7], lIllIIIIIllll[lIllIIIIlIlII[16]], lIllIIIIlIlII[17]);
        YEW = new a(lIllIIIIIllll[lIllIIIIlIlII[18]], lIllIIIIlIlII[9], lIllIIIIIllll[lIllIIIIlIlII[19]], lIllIIIIlIlII[20]);
        BLISTERWOOD = new a(lIllIIIIIllll[lIllIIIIlIlII[21]], lIllIIIIlIlII[10], lIllIIIIIllll[lIllIIIIlIlII[22]], lIllIIIIlIlII[23]);
        MAGIC = new a(lIllIIIIIllll[lIllIIIIlIlII[24]], lIllIIIIlIlII[12], lIllIIIIIllll[lIllIIIIlIlII[25]], lIllIIIIlIlII[26]);
        REDWOOD = new a(lIllIIIIIllll[lIllIIIIlIlII[27]], lIllIIIIlIlII[13], lIllIIIIIllll[lIllIIIIlIlII[28]], lIllIIIIlIlII[29]);
        a[] aVarArr = new a[lIllIIIIlIlII[15]];
        aVarArr[lIllIIIIlIlII[0]] = TREE;
        aVarArr[lIllIIIIlIlII[1]] = OAK;
        aVarArr[lIllIIIIlIlII[3]] = WILLOW;
        aVarArr[lIllIIIIlIlII[4]] = TEAK;
        aVarArr[lIllIIIIlIlII[6]] = MAPLE;
        aVarArr[lIllIIIIlIlII[7]] = MAHOGANY;
        aVarArr[lIllIIIIlIlII[9]] = YEW;
        aVarArr[lIllIIIIlIlII[10]] = BLISTERWOOD;
        aVarArr[lIllIIIIlIlII[12]] = MAGIC;
        aVarArr[lIllIIIIlIlII[13]] = REDWOOD;
        $VALUES = aVarArr;
    }

    private static void llIIIlIIIlIIlIl() {
        lIllIIIIIllll = new String[lIllIIIIlIlII[30]];
        lIllIIIIIllll[lIllIIIIlIlII[0]] = llIIIlIIIIlIIII("zObILKeC8Zw=", "BDxzO");
        lIllIIIIIllll[lIllIIIIlIlII[1]] = llIIIlIIIIlIIII("FDtksM+avag=", "AZpaY");
        lIllIIIIIllll[lIllIIIIlIlII[3]] = llIIIlIIIIlIIIl("NRYp", "zWbvI");
        lIllIIIIIllll[lIllIIIIlIlII[4]] = llIIIlIIIIlIIIl("OzA7", "tQPuP");
        lIllIIIIIllll[lIllIIIIlIlII[6]] = llIIIlIIIIlIIlI("TWYu4aAPpgk=", "EYbfZ");
        lIllIIIIIllll[lIllIIIIlIlII[7]] = llIIIlIIIIlIIlI("+2G1wPr93K0=", "XdYqs");
        lIllIIIIIllll[lIllIIIIlIlII[9]] = llIIIlIIIIlIIlI("LKc2MVFE5Fo=", "bgkTi");
        lIllIIIIIllll[lIllIIIIlIlII[10]] = llIIIlIIIIlIIlI("h5YJVYJID8Q=", "GTRLA");
        lIllIIIIIllll[lIllIIIIlIlII[12]] = llIIIlIIIIlIIII("Q+C1bbJDpcw=", "tNMzI");
        lIllIIIIIllll[lIllIIIIlIlII[13]] = llIIIlIIIIlIIlI("wsW+JqUvX6k=", "uOnRo");
        lIllIIIIIllll[lIllIIIIlIlII[15]] = llIIIlIIIIlIIIl("AxIDFwYPHRI=", "NSKXA");
        lIllIIIIIllll[lIllIIIIlIlII[16]] = llIIIlIIIIlIIlI("84Igd3Ys9e6Ir1CryS5rgw==", "izzNA");
        lIllIIIIIllll[lIllIIIIlIlII[18]] = llIIIlIIIIlIIlI("FMI9JNMUOcA=", "BnNRw");
        lIllIIIIIllll[lIllIIIIlIlII[19]] = llIIIlIIIIlIIII("Nlj53N5LXos=", "lNLHv");
        lIllIIIIIllll[lIllIIIIlIlII[21]] = llIIIlIIIIlIIlI("Zq2KzwDDPyItqq+sWKTINA==", "oPDAp");
        lIllIIIIIllll[lIllIIIIlIlII[22]] = llIIIlIIIIlIIII("DdrOLx9tsTKw+6UDP+yF2A==", "zBixv");
        lIllIIIIIllll[lIllIIIIlIlII[24]] = llIIIlIIIIlIIIl("IRA2AgI=", "lQqKA");
        lIllIIIIIllll[lIllIIIIlIlII[25]] = llIIIlIIIIlIIII("AovCGKnYi5U=", "przWz");
        lIllIIIIIllll[lIllIIIIlIlII[27]] = llIIIlIIIIlIIlI("hJ6bkfWMSDk=", "HpZdC");
        lIllIIIIIllll[lIllIIIIlIlII[28]] = llIIIlIIIIlIIlI("LIh5pQKeQjQ=", "NjLke");
    }

    public String r() {
        return this.treeName;
    }

    private static String llIIIlIIIIlIIII(String llllllllllllllIllIIllIIllIIlIlIl, String llllllllllllllIllIIllIIllIIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIllIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIIlIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIllIIlIllI) {
            llllllllllllllIllIIllIIllIIlIllI.printStackTrace();
            return null;
        }
    }

    private a(String str, int i, String str2, int i2) {
        this.treeName = str2;
        this.logId = i2;
    }

    private static boolean llIIIlIIIlIlIIl(int i, int i2) {
        return i < i2;
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    private static String llIIIlIIIIlIIlI(String llllllllllllllIllIIllIIllIlllIlI, String llllllllllllllIllIIllIIllIlllIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIllIIllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIIllIlllIIl.getBytes(StandardCharsets.UTF_8)), lIllIIIIlIlII[12]), "DES");
            Cipher llllllllllllllIllIIllIIllIllllII = Cipher.getInstance("DES");
            llllllllllllllIllIIllIIllIllllII.init(lIllIIIIlIlII[3], llllllllllllllIllIIllIIllIllllIl);
            return new String(llllllllllllllIllIIllIIllIllllII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIIllIlllIll) {
            llllllllllllllIllIIllIIllIlllIll.printStackTrace();
            return null;
        }
    }
}
