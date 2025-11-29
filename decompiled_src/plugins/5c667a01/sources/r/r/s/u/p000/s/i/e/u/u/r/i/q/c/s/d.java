package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/d.class */
public class d {
    public static /* synthetic */ int G;
    public static /* synthetic */ int B;
    public static /* synthetic */ List<Integer> E;
    private static /* synthetic */ int[] lIIlIllIIlIIl;
    public static /* synthetic */ int C;
    public static /* synthetic */ int A;
    private static /* synthetic */ String[] lIIlIllIIIllI;
    public static /* synthetic */ WorldPoint H;
    public static /* synthetic */ List<String> v;
    public static /* synthetic */ List<String> y;
    public static /* synthetic */ int D;
    public static /* synthetic */ List<String> x;
    public static /* synthetic */ List<String> z;
    public static /* synthetic */ WorldArea F;
    public static /* synthetic */ List<String> w;

    static {
        lIlIllIIllIlllI();
        lIlIllIIllIllIl();
        String[] strArr = new String[lIIlIllIIlIIl[0]];
        strArr[lIIlIllIIlIIl[1]] = lIIlIllIIIllI[lIIlIllIIlIIl[1]];
        strArr[lIIlIllIIlIIl[2]] = lIIlIllIIIllI[lIIlIllIIlIIl[2]];
        strArr[lIIlIllIIlIIl[3]] = lIIlIllIIIllI[lIIlIllIIlIIl[3]];
        strArr[lIIlIllIIlIIl[4]] = lIIlIllIIIllI[lIIlIllIIlIIl[4]];
        strArr[lIIlIllIIlIIl[5]] = lIIlIllIIIllI[lIIlIllIIlIIl[5]];
        strArr[lIIlIllIIlIIl[6]] = lIIlIllIIIllI[lIIlIllIIlIIl[6]];
        strArr[lIIlIllIIlIIl[7]] = lIIlIllIIIllI[lIIlIllIIlIIl[7]];
        strArr[lIIlIllIIlIIl[8]] = lIIlIllIIIllI[lIIlIllIIlIIl[8]];
        strArr[lIIlIllIIlIIl[9]] = lIIlIllIIIllI[lIIlIllIIlIIl[9]];
        strArr[lIIlIllIIlIIl[10]] = lIIlIllIIIllI[lIIlIllIIlIIl[10]];
        strArr[lIIlIllIIlIIl[11]] = lIIlIllIIIllI[lIIlIllIIlIIl[11]];
        strArr[lIIlIllIIlIIl[12]] = lIIlIllIIIllI[lIIlIllIIlIIl[12]];
        strArr[lIIlIllIIlIIl[13]] = lIIlIllIIIllI[lIIlIllIIlIIl[13]];
        v = List.of((Object[]) strArr);
        w = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[0]], lIIlIllIIIllI[lIIlIllIIlIIl[14]], lIIlIllIIIllI[lIIlIllIIlIIl[15]], lIIlIllIIIllI[lIIlIllIIlIIl[16]]);
        x = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[17]], lIIlIllIIIllI[lIIlIllIIlIIl[18]], lIIlIllIIIllI[lIIlIllIIlIIl[19]], lIIlIllIIIllI[lIIlIllIIlIIl[20]], lIIlIllIIIllI[lIIlIllIIlIIl[21]], lIIlIllIIIllI[lIIlIllIIlIIl[22]]);
        y = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[23]], lIIlIllIIIllI[lIIlIllIIlIIl[24]]);
        z = List.of(lIIlIllIIIllI[lIIlIllIIlIIl[25]]);
        A = lIIlIllIIlIIl[26];
        B = lIIlIllIIlIIl[27];
        C = lIIlIllIIlIIl[28];
        D = lIIlIllIIlIIl[29];
        E = List.of(Integer.valueOf(C), Integer.valueOf(D));
        F = new WorldArea(new WorldPoint(lIIlIllIIlIIl[30], lIIlIllIIlIIl[31], lIIlIllIIlIIl[1]), new WorldPoint(lIIlIllIIlIIl[32], lIIlIllIIlIIl[33], lIIlIllIIlIIl[1]));
        G = lIIlIllIIlIIl[34];
        H = new WorldPoint(lIIlIllIIlIIl[35], lIIlIllIIlIIl[36], lIIlIllIIlIIl[1]);
    }

    private static String lIlIllIIllIIIlI(String llllllllllllllIllllIlIllIlIlllII, String llllllllllllllIllllIlIllIlIllIll) {
        try {
            SecretKeySpec llllllllllllllIllllIlIllIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIllIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIllIIlIIl[3], llllllllllllllIllllIlIllIlIlllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIllIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIllIlIlllIl) {
            llllllllllllllIllllIlIllIlIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIllIIlII(String llllllllllllllIllllIlIllIllllllI, String llllllllllllllIllllIlIllIlllllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIllIllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIlIllIlllllII = new StringBuilder();
        char[] llllllllllllllIllllIlIllIllllIll = llllllllllllllIllllIlIllIlllllIl.toCharArray();
        int llllllllllllllIllllIlIllIllllIlI = lIIlIllIIlIIl[1];
        char[] charArray = str.toCharArray();
        int llllllllllllllIllllIlIllIlllIIll = charArray.length;
        int i = lIIlIllIIlIIl[1];
        while (lIlIllIIllIllll(i, llllllllllllllIllllIlIllIlllIIll)) {
            char llllllllllllllIllllIlIllIlllllll = charArray[i];
            llllllllllllllIllllIlIllIlllllII.append((char) (llllllllllllllIllllIlIllIlllllll ^ llllllllllllllIllllIlIllIllllIll[llllllllllllllIllllIlIllIllllIlI % llllllllllllllIllllIlIllIllllIll.length]));
            "".length();
            llllllllllllllIllllIlIllIllllIlI++;
            i++;
            "".length();
            if ((((116 ^ 21) ^ (250 ^ 180)) & (((((166 + 9) - 146) + 140) ^ (((99 + 116) - 130) + 49)) ^ (-" ".length()))) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllllIlIllIlllllII);
    }

    private static void lIlIllIIllIllIl() {
        lIIlIllIIIllI = new String[lIIlIllIIlIIl[37]];
        lIIlIllIIIllI[lIIlIllIIlIIl[1]] = lIlIllIIllIIIlI("3tEHPbbKagfD+QNPCiQr+g==", "tImeT");
        lIIlIllIIIllI[lIIlIllIIlIIl[2]] = lIlIllIIllIIIll("V6bINVq6SyuiNY3uu8TkOQ==", "UyihT");
        lIIlIllIIIllI[lIIlIllIIlIIl[3]] = lIlIllIIllIIIlI("M4SKJFmgxF9qEfjZR/09EA==", "lNaqf");
        lIIlIllIIIllI[lIIlIllIIlIIl[4]] = lIlIllIIllIIlII("JyE8AnQTIT4LdB0xPgo=", "uTRgT");
        lIIlIllIIIllI[lIIlIllIIlIIl[5]] = lIlIllIIllIIIll("67uHnHIF6znOOTUn67c0PA==", "CIlSX");
        lIIlIllIIIllI[lIIlIllIIlIIl[6]] = lIlIllIIllIIIll("Ec5hkI/9OYFIxDyci/voCg==", "nwzUq");
        lIIlIllIIIllI[lIIlIllIIlIIl[7]] = lIlIllIIllIIlII("Lw4rFj1MFD8XKw==", "lfJyN");
        lIIlIllIIIllI[lIIlIllIIlIIl[8]] = lIlIllIIllIIIlI("zOEB4g4yIUGdZUtzT9ggmg==", "spbKN");
        lIIlIllIIIllI[lIIlIllIIlIIl[9]] = lIlIllIIllIIlII("Kzc4NGUYMCQ+Mg==", "yBVQE");
        lIIlIllIIIllI[lIIlIllIIlIIl[10]] = lIlIllIIllIIIlI("0IJvtJXUtxM=", "PuNYw");
        lIIlIllIIIllI[lIIlIllIIlIIl[11]] = lIlIllIIllIIIll("UUR9oXeM8wVmI3YUC8O/XnyZSb0ouCyV", "uNsoy");
        lIIlIllIIIllI[lIIlIllIIlIIl[12]] = lIlIllIIllIIIlI("Uh3IRrEunPdQCRvz/3w6Ug==", "fxzAM");
        lIIlIllIIIllI[lIIlIllIIlIIl[13]] = lIlIllIIllIIlII("FAESIQ07EVM8ADQRFi4DMRw=", "UesLl");
        lIIlIllIIIllI[lIIlIllIIlIIl[0]] = lIlIllIIllIIIll("igZoVt6Pdc0=", "vjpwr");
        lIIlIllIIIllI[lIIlIllIIlIIl[14]] = lIlIllIIllIIlII("NA0NNxE=", "gelEz");
        lIIlIllIIIllI[lIIlIllIIlIIl[15]] = lIlIllIIllIIlII("Fyw2Cg==", "CYXkj");
        lIIlIllIIIllI[lIIlIllIIlIIl[16]] = lIlIllIIllIIIlI("ni2h+hgT4LU=", "JLoXs");
        lIIlIllIIIllI[lIIlIllIIlIIl[17]] = lIlIllIIllIIlII("KhQZJ00bCRYrAxoOEzs=", "xawBm");
        lIIlIllIIIllI[lIIlIllIIlIIl[18]] = lIlIllIIllIIIlI("rU1z9r1OAf3vAfwznxacSw==", "gunHl");
        lIIlIllIIIllI[lIIlIllIIlIIl[19]] = lIlIllIIllIIIll("JDI/cD/vpnscfdc//+t3tw==", "acRxz");
        lIIlIllIIIllI[lIIlIllIIlIIl[20]] = lIlIllIIllIIlII("FhA7PXopADF4MiEJOA==", "DeUXZ");
        lIIlIllIIIllI[lIIlIllIIlIIl[21]] = lIlIllIIllIIIlI("FFvMtQWqltN06no6vFCD1A==", "nfFkQ");
        lIIlIllIIIllI[lIIlIllIIlIIl[22]] = lIlIllIIllIIlII("JicMDBEJN00RHAY3CAMfAzo=", "gCmap");
        lIIlIllIIIllI[lIIlIllIIlIIl[23]] = lIlIllIIllIIIll("pNgmeITT0CIoxx+oqJ1dRX1s+cxP/cbB", "nyyQF");
        lIIlIllIIIllI[lIIlIllIIlIIl[24]] = lIlIllIIllIIIll("Yc0y2HBj8TluXpbtbbtcnDFObulWYy+Q", "OTWci");
        lIIlIllIIIllI[lIIlIllIIlIIl[25]] = lIlIllIIllIIIll("DPlwWy0saJI=", "WCiYG");
    }

    private static boolean lIlIllIIllIllll(int i, int i2) {
        return i < i2;
    }

    private static void lIlIllIIllIlllI() {
        lIIlIllIIlIIl = new int[38];
        lIIlIllIIlIIl[0] = 113 ^ 124;
        lIIlIllIIlIIl[1] = ((175 ^ 191) ^ (19 ^ 95)) & (((32 ^ 17) ^ (212 ^ 185)) ^ (-" ".length()));
        lIIlIllIIlIIl[2] = " ".length();
        lIIlIllIIlIIl[3] = "  ".length();
        lIIlIllIIlIIl[4] = "   ".length();
        lIIlIllIIlIIl[5] = 38 ^ 34;
        lIIlIllIIlIIl[6] = 3 ^ 6;
        lIIlIllIIlIIl[7] = 23 ^ 17;
        lIIlIllIIlIIl[8] = 95 ^ 88;
        lIIlIllIIlIIl[9] = 12 ^ 4;
        lIIlIllIIlIIl[10] = (38 ^ 45) ^ "  ".length();
        lIIlIllIIlIIl[11] = (81 ^ 17) ^ (213 ^ 159);
        lIIlIllIIlIIl[12] = (255 ^ 167) ^ (239 ^ 188);
        lIIlIllIIlIIl[13] = 106 ^ 102;
        lIIlIllIIlIIl[14] = 187 ^ 181;
        lIIlIllIIlIIl[15] = 38 ^ 41;
        lIIlIllIIlIIl[16] = (((149 + 64) - 119) + 78) ^ (((128 + 78) - 181) + 163);
        lIIlIllIIlIIl[17] = 87 ^ 70;
        lIIlIllIIlIIl[18] = 80 ^ 66;
        lIIlIllIIlIIl[19] = 118 ^ 101;
        lIIlIllIIlIIl[20] = (((35 + 179) - 178) + 155) ^ (((46 + 74) - 5) + 56);
        lIIlIllIIlIIl[21] = (15 ^ 18) ^ (26 ^ 18);
        lIIlIllIIlIIl[22] = (92 ^ 29) ^ (209 ^ 134);
        lIIlIllIIlIIl[23] = 136 ^ 159;
        lIIlIllIIlIIl[24] = (182 ^ 188) ^ (60 ^ 46);
        lIIlIllIIlIIl[25] = 80 ^ 73;
        lIIlIllIIlIIl[26] = (-593) & 49014;
        lIIlIllIIlIIl[27] = (-5379) & 8022;
        lIIlIllIIlIIl[28] = (-((-433) & 26037)) & (-4105) & 32350;
        lIIlIllIIlIIl[29] = (-((-889) & 29693)) & (-1027) & 32470;
        lIIlIllIIlIIl[30] = (-((-1061) & 22311)) & (-8225) & 32763;
        lIIlIllIIlIIl[31] = (-4449) & 14306;
        lIIlIllIIlIIl[32] = (-17170) & 20477;
        lIIlIllIIlIIl[33] = (-6217) & 16093;
        lIIlIllIIlIIl[34] = (-((-30770) & 32639)) & (-1) & 12159;
        lIIlIllIIlIIl[35] = (-((-2618) & 11963)) & (-16641) & 28591;
        lIIlIllIIlIIl[36] = (-25205) & 28415;
        lIIlIllIIlIIl[37] = (((101 + 48) - 125) + 116) ^ (((125 + 139) - 204) + 90);
    }

    private static String lIlIllIIllIIIll(String llllllllllllllIllllIlIllIllIlIIl, String llllllllllllllIllllIlIllIllIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIllIllIlIII.getBytes(StandardCharsets.UTF_8)), lIIlIllIIlIIl[9]), "DES");
            Cipher llllllllllllllIllllIlIllIllIlIll = Cipher.getInstance("DES");
            llllllllllllllIllllIlIllIllIlIll.init(lIIlIllIIlIIl[3], secretKeySpec);
            return new String(llllllllllllllIllllIlIllIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIllIllIlIlI) {
            llllllllllllllIllllIlIllIllIlIlI.printStackTrace();
            return null;
        }
    }
}
