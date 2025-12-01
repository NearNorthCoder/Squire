package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import com.google.common.collect.ImmutableMap;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.f  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/f.class */
public final class f {
    public static final /* synthetic */ f GOLOVANOVA;
    public static final /* synthetic */ f LOGAVANO;
    private static /* synthetic */ String[] lIlIIIIIIIIlI;
    private static final /* synthetic */ f[] $VALUES;
    public static final /* synthetic */ f EMPTY;
    public static final /* synthetic */ f BOLOGANO;
    private static final /* synthetic */ Map<Integer, f> plantTypes;
    private final /* synthetic */ String name;
    private final /* synthetic */ int baseId;
    private final /* synthetic */ int[] objectIds;
    private static /* synthetic */ int[] lIlIIIIIIIlII;

    private static String lIllIllIIlllIll(String llllllllllllllIlllIIlIlIIIllllIl, String llllllllllllllIlllIIlIlIIIllllII) {
        String llllllllllllllIlllIIlIlIIIllllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIlIlIIIllllII.toCharArray();
        int llllllllllllllIlllIIlIlIIIlllIIl = lIlIIIIIIIlII[0];
        char[] charArray2 = llllllllllllllIlllIIlIlIIIllllIl2.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllIIlIlIIIllIIIl = lIlIIIIIIIlII[0];
        while (lIllIllIIllllll(llllllllllllllIlllIIlIlIIIllIIIl, length)) {
            char llllllllllllllIlllIIlIlIIIlllllI = charArray2[llllllllllllllIlllIIlIlIIIllIIIl];
            sb.append((char) (llllllllllllllIlllIIlIlIIIlllllI ^ charArray[llllllllllllllIlllIIlIlIIIlllIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIIlIlIIIlllIIl++;
            llllllllllllllIlllIIlIlIIIllIIIl++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIllIllIIlllllI() {
        lIlIIIIIIIlII = new int[46];
        lIlIIIIIIIlII[0] = ((108 ^ 26) ^ (208 ^ 151)) & (((20 ^ 85) ^ (54 ^ 70)) ^ (-" ".length()));
        lIlIIIIIIIlII[1] = " ".length();
        lIlIIIIIIIlII[2] = (-((-26695) & 31823)) & (-1) & 32511;
        lIlIIIIIIIlII[3] = "  ".length();
        lIlIIIIIIIlII[4] = "   ".length();
        lIlIIIIIIIlII[5] = (-1093) & 28485;
        lIlIIIIIIIlII[6] = (((108 + 20) - 30) + 45) ^ (((119 + 87) - 205) + 131);
        lIlIIIIIIIlII[7] = (-((-10521) & 15645)) & (-258) & 32765;
        lIlIIIIIIIlII[8] = (-" ".length()) & (-5121) & 32505;
        lIlIIIIIIIlII[9] = (-((-10917) & 16038)) & (-261) & 32767;
        lIlIIIIIIIlII[10] = (-1025) & 28411;
        lIlIIIIIIIlII[11] = (59 ^ 75) ^ (221 ^ 169);
        lIlIIIIIIIlII[12] = (-1028) & 28415;
        lIlIIIIIIIlII[13] = (((46 + 36) - (-16)) + 77) ^ (((146 + 69) - 50) + 5);
        lIlIIIIIIIlII[14] = (-5377) & 32765;
        lIlIIIIIIIlII[15] = (((50 + 19) - (-82)) + 5) ^ (((6 + 129) - (-7)) + 12);
        lIlIIIIIIIlII[16] = (-5377) & 32766;
        lIlIIIIIIIlII[17] = 110 ^ 105;
        lIlIIIIIIIlII[18] = (-((-6893) & 8173)) & (-4097) & 32767;
        lIlIIIIIIIlII[19] = (207 ^ 167) ^ (233 ^ 137);
        lIlIIIIIIIlII[20] = (-(((29 + 209) - 90) + 62)) & (-1029) & 28629;
        lIlIIIIIIIlII[21] = 119 ^ 126;
        lIlIIIIIIIlII[22] = (255 ^ 190) ^ (35 ^ 104);
        lIlIIIIIIIlII[23] = (-(((100 + 173) - 166) + 78)) & (-1089) & 28666;
        lIlIIIIIIIlII[24] = (-((-12300) & 13327)) & (-4337) & 32767;
        lIlIIIIIIIlII[25] = (-4249) & 31643;
        lIlIIIIIIIlII[26] = (-5340) & 32735;
        lIlIIIIIIIlII[27] = (-17) & 27413;
        lIlIIIIIIIlII[28] = (-74) & 27471;
        lIlIIIIIIIlII[29] = (-(((35 + 48) - (-35)) + 131)) & (-4097) & 31743;
        lIlIIIIIIIlII[30] = (-215) & 27614;
        lIlIIIIIIIlII[31] = (-4263) & 31663;
        lIlIIIIIIIlII[32] = (-5334) & 32735;
        lIlIIIIIIIlII[33] = (-5) & 27407;
        lIlIIIIIIIlII[34] = (-1137) & 28541;
        lIlIIIIIIIlII[35] = (-((-2067) & 3131)) & (-4289) & 32767;
        lIlIIIIIIIlII[36] = (-((-12803) & 14051)) & (-4114) & 32767;
        lIlIIIIIIIlII[37] = (-((-26627) & 30819)) & (-1169) & 32767;
        lIlIIIIIIIlII[38] = (-((-18434) & 23759)) & (-35) & 32767;
        lIlIIIIIIIlII[39] = (-193) & 27601;
        lIlIIIIIIIlII[40] = (-133) & 27542;
        lIlIIIIIIIlII[41] = (-1025) & 28435;
        lIlIIIIIIIlII[42] = (-(246 ^ 181)) & (-10) & 27487;
        lIlIIIIIIIlII[43] = (-(30 ^ 117)) & (-1) & 27519;
        lIlIIIIIIIlII[44] = (-4097) & 31510;
        lIlIIIIIIIlII[45] = (-(32 ^ 70)) & (-1153) & 28669;
    }

    private static void lIllIllIIllllII() {
        lIlIIIIIIIIlI = new String[lIlIIIIIIIlII[19]];
        lIlIIIIIIIIlI[lIlIIIIIIIlII[0]] = lIllIllIIlllIIl("B/x+1Bvw+dA=", "fVkLM");
        lIlIIIIIIIIlI[lIlIIIIIIIlII[1]] = lIllIllIIlllIIl("TOnY68HTqfU=", "qKFSE");
        lIlIIIIIIIIlI[lIlIIIIIIIlII[3]] = lIllIllIIlllIIl("OZzkgH1976BgrZePsIUD8g==", "oHWSn");
        lIlIIIIIIIIlI[lIlIIIIIIIlII[4]] = lIllIllIIlllIll("EA0dBR42DB4cCQ==", "Wbqjh");
        lIlIIIIIIIIlI[lIlIIIIIIIlII[11]] = lIllIllIIlllIll("MyoZAhMwKxo=", "qeUMT");
        lIlIIIIIIIIlI[lIlIIIIIIIlII[13]] = lIllIllIIlllIll("GgYtIww5By4=", "XiALk");
        lIlIIIIIIIIlI[lIlIIIIIIIlII[15]] = lIllIllIIlllIll("Cj8CIDUHPgo=", "FpEac");
        lIlIIIIIIIIlI[lIlIIIIIIIlII[17]] = lIllIllIIlllIIl("UV/oiU9gHYdM6bNWhMVQEQ==", "BDCsq");
    }

    public String j() {
        return this.name;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    private static boolean lIllIllIIllllll(int i, int i2) {
        return i < i2;
    }

    public int[] l() {
        return this.objectIds;
    }

    private f(String str, int i, String str2, int i2, int... iArr) {
        this.name = str2;
        this.baseId = i2;
        this.objectIds = iArr;
    }

    public static f d(int i) {
        return plantTypes.get(Integer.valueOf(i));
    }

    private static String lIllIllIIlllIIl(String llllllllllllllIlllIIlIlIIlIIllIl, String llllllllllllllIlllIIlIlIIlIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIlIIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIlIIlIIllll = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIlIIlIIllll.init(lIlIIIIIIIlII[3], secretKeySpec);
            return new String(llllllllllllllIlllIIlIlIIlIIllll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIlIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIlIIlIIlllI) {
            llllllllllllllIlllIIlIlIIlIIlllI.printStackTrace();
            return null;
        }
    }

    public int k() {
        return this.baseId;
    }

    static {
        lIllIllIIlllllI();
        lIllIllIIllllII();
        String str = lIlIIIIIIIIlI[lIlIIIIIIIlII[0]];
        int i = lIlIIIIIIIlII[0];
        String str2 = lIlIIIIIIIIlI[lIlIIIIIIIlII[1]];
        int i2 = lIlIIIIIIIlII[2];
        int[] iArr = new int[lIlIIIIIIIlII[1]];
        iArr[lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[2];
        EMPTY = new f(str, i, str2, i2, iArr);
        String str3 = lIlIIIIIIIIlI[lIlIIIIIIIlII[3]];
        int i3 = lIlIIIIIIIlII[1];
        String str4 = lIlIIIIIIIIlI[lIlIIIIIIIlII[4]];
        int i4 = lIlIIIIIIIlII[5];
        int[] iArr2 = new int[lIlIIIIIIIlII[6]];
        iArr2[lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[7];
        iArr2[lIlIIIIIIIlII[1]] = lIlIIIIIIIlII[8];
        iArr2[lIlIIIIIIIlII[3]] = lIlIIIIIIIlII[9];
        iArr2[lIlIIIIIIIlII[4]] = lIlIIIIIIIlII[10];
        iArr2[lIlIIIIIIIlII[11]] = lIlIIIIIIIlII[12];
        iArr2[lIlIIIIIIIlII[13]] = lIlIIIIIIIlII[14];
        iArr2[lIlIIIIIIIlII[15]] = lIlIIIIIIIlII[16];
        iArr2[lIlIIIIIIIlII[17]] = lIlIIIIIIIlII[18];
        iArr2[lIlIIIIIIIlII[19]] = lIlIIIIIIIlII[20];
        iArr2[lIlIIIIIIIlII[21]] = lIlIIIIIIIlII[5];
        iArr2[lIlIIIIIIIlII[22]] = lIlIIIIIIIlII[23];
        GOLOVANOVA = new f(str3, i3, str4, i4, iArr2);
        String str5 = lIlIIIIIIIIlI[lIlIIIIIIIlII[11]];
        int i5 = lIlIIIIIIIlII[3];
        String str6 = lIlIIIIIIIIlI[lIlIIIIIIIlII[13]];
        int i6 = lIlIIIIIIIlII[24];
        int[] iArr3 = new int[lIlIIIIIIIlII[6]];
        iArr3[lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[25];
        iArr3[lIlIIIIIIIlII[1]] = lIlIIIIIIIlII[26];
        iArr3[lIlIIIIIIIlII[3]] = lIlIIIIIIIlII[27];
        iArr3[lIlIIIIIIIlII[4]] = lIlIIIIIIIlII[28];
        iArr3[lIlIIIIIIIlII[11]] = lIlIIIIIIIlII[29];
        iArr3[lIlIIIIIIIlII[13]] = lIlIIIIIIIlII[30];
        iArr3[lIlIIIIIIIlII[15]] = lIlIIIIIIIlII[31];
        iArr3[lIlIIIIIIIlII[17]] = lIlIIIIIIIlII[32];
        iArr3[lIlIIIIIIIlII[19]] = lIlIIIIIIIlII[33];
        iArr3[lIlIIIIIIIlII[21]] = lIlIIIIIIIlII[24];
        iArr3[lIlIIIIIIIlII[22]] = lIlIIIIIIIlII[34];
        BOLOGANO = new f(str5, i5, str6, i6, iArr3);
        String str7 = lIlIIIIIIIIlI[lIlIIIIIIIlII[15]];
        int i7 = lIlIIIIIIIlII[4];
        String str8 = lIlIIIIIIIIlI[lIlIIIIIIIlII[17]];
        int i8 = lIlIIIIIIIlII[35];
        int[] iArr4 = new int[lIlIIIIIIIlII[6]];
        iArr4[lIlIIIIIIIlII[0]] = lIlIIIIIIIlII[36];
        iArr4[lIlIIIIIIIlII[1]] = lIlIIIIIIIlII[37];
        iArr4[lIlIIIIIIIlII[3]] = lIlIIIIIIIlII[38];
        iArr4[lIlIIIIIIIlII[4]] = lIlIIIIIIIlII[39];
        iArr4[lIlIIIIIIIlII[11]] = lIlIIIIIIIlII[40];
        iArr4[lIlIIIIIIIlII[13]] = lIlIIIIIIIlII[41];
        iArr4[lIlIIIIIIIlII[15]] = lIlIIIIIIIlII[42];
        iArr4[lIlIIIIIIIlII[17]] = lIlIIIIIIIlII[43];
        iArr4[lIlIIIIIIIlII[19]] = lIlIIIIIIIlII[44];
        iArr4[lIlIIIIIIIlII[21]] = lIlIIIIIIIlII[35];
        iArr4[lIlIIIIIIIlII[22]] = lIlIIIIIIIlII[45];
        LOGAVANO = new f(str7, i7, str8, i8, iArr4);
        f[] fVarArr = new f[lIlIIIIIIIlII[11]];
        fVarArr[lIlIIIIIIIlII[0]] = EMPTY;
        fVarArr[lIlIIIIIIIlII[1]] = GOLOVANOVA;
        fVarArr[lIlIIIIIIIlII[3]] = BOLOGANO;
        fVarArr[lIlIIIIIIIlII[4]] = LOGAVANO;
        $VALUES = fVarArr;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        f[] values = values();
        int length = values.length;
        int llllllllllllllIlllIIlIlIIlIllIlI = lIlIIIIIIIlII[0];
        while (lIllIllIIllllll(llllllllllllllIlllIIlIlIIlIllIlI, length)) {
            f fVar = values[llllllllllllllIlllIIlIlIIlIllIlI];
            int[] l = fVar.l();
            int length2 = l.length;
            int i9 = lIlIIIIIIIlII[0];
            while (lIllIllIIllllll(i9, length2)) {
                builder.put(Integer.valueOf(l[i9]), fVar);
                "".length();
                i9++;
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            llllllllllllllIlllIIlIlIIlIllIlI++;
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        plantTypes = builder.build();
    }
}
