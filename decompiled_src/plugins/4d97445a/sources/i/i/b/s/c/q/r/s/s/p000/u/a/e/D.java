package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.D  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/D.class */
public final class D {
    private final /* synthetic */ String log;
    private final /* synthetic */ String tree;
    public static final /* synthetic */ D YEW;
    public static final /* synthetic */ D NORMAL;
    private static final /* synthetic */ D[] $VALUES;
    public static final /* synthetic */ D OAK;
    private static /* synthetic */ String[] llIllIIII;
    private static /* synthetic */ int[] llIllIIIl;
    public static final /* synthetic */ D TEAK;
    public static final /* synthetic */ D MAPLE;
    public static final /* synthetic */ D WILLOW;

    public String Y() {
        return this.log;
    }

    public String Z() {
        return this.tree;
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }

    private static void lIllllIlIII() {
        llIllIIIl = new int[19];
        llIllIIIl[0] = "   ".length() & ("   ".length() ^ (-1));
        llIllIIIl[1] = " ".length();
        llIllIIIl[2] = "  ".length();
        llIllIIIl[3] = "   ".length();
        llIllIIIl[4] = 10 ^ 14;
        llIllIIIl[5] = (82 ^ 103) ^ (184 ^ 136);
        llIllIIIl[6] = 27 ^ 29;
        llIllIIIl[7] = 77 ^ 74;
        llIllIIIl[8] = 55 ^ 63;
        llIllIIIl[9] = 101 ^ 108;
        llIllIIIl[10] = (1 ^ 118) ^ (7 ^ 122);
        llIllIIIl[11] = (((2 + 143) - 16) + 17) ^ (((34 + 28) - (-91)) + 0);
        llIllIIIl[12] = 12 ^ 0;
        llIllIIIl[13] = (97 ^ 33) ^ (23 ^ 90);
        llIllIIIl[14] = (226 ^ 143) ^ (253 ^ 158);
        llIllIIIl[15] = (174 ^ 189) ^ (146 ^ 142);
        llIllIIIl[16] = 64 ^ 80;
        llIllIIIl[17] = 170 ^ 187;
        llIllIIIl[18] = (((9 + 119) - (-2)) + 4) ^ (((4 + 55) - (-88)) + 1);
    }

    private static void lIllllIIlll() {
        llIllIIII = new String[llIllIIIl[18]];
        llIllIIII[llIllIIIl[0]] = lIllllIIlII("Xay07JHseh0=", "VUPkt");
        llIllIIII[llIllIIIl[1]] = lIllllIIlIl("Iz8hNw==", "wMDRM");
        llIllIIII[llIllIIIl[2]] = lIllllIIllI("TLXXyzv9Ags=", "xCdgd");
        llIllIIII[llIllIIIl[3]] = lIllllIIlIl("AzYy", "LwyqX");
        llIllIIII[llIllIIIl[4]] = lIllllIIlIl("BC8/YhE5KzE=", "KNTBe");
        llIllIIII[llIllIIIl[5]] = lIllllIIlIl("HxUlbD8/Ez0=", "PtNLS");
        llIllIIII[llIllIIIl[6]] = lIllllIIlII("Klv01nbMpxE=", "TBCHg");
        llIllIIII[llIllIIIl[7]] = lIllllIIlIl("NTA8BzYVeSQZPAc=", "bYPkY");
        llIllIIII[llIllIIIl[8]] = lIllllIIlII("HhIvdsqE2rhIft37h4b1YQ==", "mfcBX");
        llIllIIII[llIllIIIl[9]] = lIllllIIlII("k1KDtTgprvs=", "EilZB");
        llIllIIII[llIllIIIl[10]] = lIllllIIlIl("CCUeLjRlMBwnNA==", "EDnBQ");
        llIllIIII[llIllIIIl[11]] = lIllllIIllI("zqtuF1Mft4rf1KktqAVqFg==", "ifUte");
        llIllIIII[llIllIIIl[12]] = lIllllIIlIl("MhYsGA==", "fSmSY");
        llIllIIII[llIllIIIl[13]] = lIllllIIlIl("EwIwP0UzFTQx", "GgQTe");
        llIllIIII[llIllIIIl[14]] = lIllllIIlII("jUjddtEvN1IsJhlhfwGUHA==", "PhQlR");
        llIllIIII[llIllIIIl[15]] = lIllllIIlII("H5xl63wYon0=", "HKNvx");
        llIllIIII[llIllIIIl[16]] = lIllllIIlII("PAdFhs8VTGwOp0fdoFsNUA==", "AHaKO");
        llIllIIII[llIllIIIl[17]] = lIllllIIlIl("MxUHcSsFFwM=", "jppQG");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.tree;
    }

    private static String lIllllIIllI(String lIlIlllIllIIlIl, String lIlIlllIllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlllIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllIllIIlll = Cipher.getInstance("Blowfish");
            lIlIlllIllIIlll.init(llIllIIIl[2], secretKeySpec);
            return new String(lIlIlllIllIIlll.doFinal(Base64.getDecoder().decode(lIlIlllIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllIllIIllI) {
            lIlIlllIllIIllI.printStackTrace();
            return null;
        }
    }

    private static String lIllllIIlII(String lIlIlllIlllIIlI, String lIlIlllIlllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlllIlllIIIl.getBytes(StandardCharsets.UTF_8)), llIllIIIl[8]), "DES");
            Cipher lIlIlllIlllIlII = Cipher.getInstance("DES");
            lIlIlllIlllIlII.init(llIllIIIl[2], secretKeySpec);
            return new String(lIlIlllIlllIlII.doFinal(Base64.getDecoder().decode(lIlIlllIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlllIlllIIll) {
            lIlIlllIlllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIl(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIllllIlIII();
        lIllllIIlll();
        NORMAL = new D(llIllIIII[llIllIIIl[0]], llIllIIIl[0], llIllIIII[llIllIIIl[1]], llIllIIII[llIllIIIl[2]]);
        OAK = new D(llIllIIII[llIllIIIl[3]], llIllIIIl[1], llIllIIII[llIllIIIl[4]], llIllIIII[llIllIIIl[5]]);
        WILLOW = new D(llIllIIII[llIllIIIl[6]], llIllIIIl[2], llIllIIII[llIllIIIl[7]], llIllIIII[llIllIIIl[8]]);
        MAPLE = new D(llIllIIII[llIllIIIl[9]], llIllIIIl[3], llIllIIII[llIllIIIl[10]], llIllIIII[llIllIIIl[11]]);
        TEAK = new D(llIllIIII[llIllIIIl[12]], llIllIIIl[4], llIllIIII[llIllIIIl[13]], llIllIIII[llIllIIIl[14]]);
        YEW = new D(llIllIIII[llIllIIIl[15]], llIllIIIl[5], llIllIIII[llIllIIIl[16]], llIllIIII[llIllIIIl[17]]);
        D[] dArr = new D[llIllIIIl[6]];
        dArr[llIllIIIl[0]] = NORMAL;
        dArr[llIllIIIl[1]] = OAK;
        dArr[llIllIIIl[2]] = WILLOW;
        dArr[llIllIIIl[3]] = MAPLE;
        dArr[llIllIIIl[4]] = TEAK;
        dArr[llIllIIIl[5]] = YEW;
        $VALUES = dArr;
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    private static String lIllllIIlIl(String lIlIllllIIIIlll, String lIlIllllIIIIllI) {
        String str = new String(Base64.getDecoder().decode(lIlIllllIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllllIIIIlIl = new StringBuilder();
        char[] lIlIllllIIIIlII = lIlIllllIIIIllI.toCharArray();
        int lIlIllllIIIIIll = llIllIIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = llIllIIIl[0];
        while (lIllllIlIIl(i2, length)) {
            lIlIllllIIIIlIl.append((char) (charArray[i2] ^ lIlIllllIIIIlII[lIlIllllIIIIIll % lIlIllllIIIIlII.length]));
            "".length();
            lIlIllllIIIIIll++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lIlIllllIIIIlIl);
    }

    private D(String str, int i2, String str2, String str3) {
        this.log = str3;
        this.tree = str2;
    }
}
