package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.C  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/C.class */
public final class C {
    public static final /* synthetic */ C CAPE;
    private static /* synthetic */ int[] lIIllIIlIIII;
    public static final /* synthetic */ C HEAD;
    public final /* synthetic */ int boost;
    public static final /* synthetic */ C BODY;
    public static final /* synthetic */ C BOOTS;
    private static final /* synthetic */ C[] $VALUES;
    private static /* synthetic */ String[] lIIllIIIllll;
    public static final /* synthetic */ C LEGS;
    public static final /* synthetic */ C GLOVES;
    public final /* synthetic */ int[] items;

    private static boolean llIIlllIIlIlII(int i, int i2) {
        return i < i2;
    }

    private static String llIIlllIIIllll(String lllllllllllllllIlllIlllllIllIlIl, String lllllllllllllllIlllIlllllIllIIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllllIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllllIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIIlIIII[5], lllllllllllllllIlllIlllllIlllIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlllllIllIllI) {
            lllllllllllllllIlllIlllllIllIllI.printStackTrace();
            return null;
        }
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }

    private static void llIIlllIIlIIlI() {
        lIIllIIIllll = new String[lIIllIIlIIII[13]];
        lIIllIIIllll[lIIllIIlIIII[0]] = llIIlllIIIllll("0h7IRyUR1CA=", "FGvDk");
        lIIllIIIllll[lIIllIIlIIII[3]] = llIIlllIIIllll("7mVx5By4Lsc=", "SekYT");
        lIIllIIIllll[lIIllIIlIIII[5]] = llIIlllIIlIIII("DSwDCQ==", "AiDZz");
        lIIllIIIllll[lIIllIIlIIII[7]] = llIIlllIIlIIIl("Efe3o/fpdYU=", "RtBpx");
        lIIllIIIllll[lIIllIIlIIII[9]] = llIIlllIIlIIIl("tJFE0uDdiA0=", "NFvFj");
        lIIllIIIllll[lIIllIIlIIII[11]] = llIIlllIIIllll("iyr3v7jTuKs=", "AIYaJ");
    }

    static {
        llIIlllIIlIIll();
        llIIlllIIlIIlI();
        String str = lIIllIIIllll[lIIllIIlIIII[0]];
        int i = lIIllIIlIIII[0];
        int[] iArr = new int[lIIllIIlIIII[1]];
        iArr[lIIllIIlIIII[0]] = lIIllIIlIIII[2];
        iArr[lIIllIIlIIII[3]] = lIIllIIlIIII[4];
        iArr[lIIllIIlIIII[5]] = lIIllIIlIIII[6];
        iArr[lIIllIIlIIII[7]] = lIIllIIlIIII[8];
        iArr[lIIllIIlIIII[9]] = lIIllIIlIIII[10];
        iArr[lIIllIIlIIII[11]] = lIIllIIlIIII[12];
        iArr[lIIllIIlIIII[13]] = lIIllIIlIIII[14];
        iArr[lIIllIIlIIII[15]] = lIIllIIlIIII[16];
        iArr[lIIllIIlIIII[17]] = lIIllIIlIIII[18];
        iArr[lIIllIIlIIII[19]] = lIIllIIlIIII[20];
        iArr[lIIllIIlIIII[21]] = lIIllIIlIIII[22];
        iArr[lIIllIIlIIII[23]] = lIIllIIlIIII[24];
        iArr[lIIllIIlIIII[25]] = lIIllIIlIIII[26];
        iArr[lIIllIIlIIII[27]] = lIIllIIlIIII[28];
        iArr[lIIllIIlIIII[29]] = lIIllIIlIIII[30];
        iArr[lIIllIIlIIII[31]] = lIIllIIlIIII[32];
        iArr[lIIllIIlIIII[33]] = lIIllIIlIIII[34];
        iArr[lIIllIIlIIII[35]] = lIIllIIlIIII[36];
        iArr[lIIllIIlIIII[37]] = lIIllIIlIIII[38];
        HEAD = new C(str, i, iArr, lIIllIIlIIII[7]);
        String str2 = lIIllIIIllll[lIIllIIlIIII[3]];
        int i2 = lIIllIIlIIII[3];
        int[] iArr2 = new int[lIIllIIlIIII[1]];
        iArr2[lIIllIIlIIII[0]] = lIIllIIlIIII[39];
        iArr2[lIIllIIlIIII[3]] = lIIllIIlIIII[40];
        iArr2[lIIllIIlIIII[5]] = lIIllIIlIIII[41];
        iArr2[lIIllIIlIIII[7]] = lIIllIIlIIII[42];
        iArr2[lIIllIIlIIII[9]] = lIIllIIlIIII[43];
        iArr2[lIIllIIlIIII[11]] = lIIllIIlIIII[44];
        iArr2[lIIllIIlIIII[13]] = lIIllIIlIIII[45];
        iArr2[lIIllIIlIIII[15]] = lIIllIIlIIII[46];
        iArr2[lIIllIIlIIII[17]] = lIIllIIlIIII[47];
        iArr2[lIIllIIlIIII[19]] = lIIllIIlIIII[48];
        iArr2[lIIllIIlIIII[21]] = lIIllIIlIIII[49];
        iArr2[lIIllIIlIIII[23]] = lIIllIIlIIII[50];
        iArr2[lIIllIIlIIII[25]] = lIIllIIlIIII[51];
        iArr2[lIIllIIlIIII[27]] = lIIllIIlIIII[52];
        iArr2[lIIllIIlIIII[29]] = lIIllIIlIIII[53];
        iArr2[lIIllIIlIIII[31]] = lIIllIIlIIII[54];
        iArr2[lIIllIIlIIII[33]] = lIIllIIlIIII[55];
        iArr2[lIIllIIlIIII[35]] = lIIllIIlIIII[56];
        iArr2[lIIllIIlIIII[37]] = lIIllIIlIIII[57];
        BODY = new C(str2, i2, iArr2, lIIllIIlIIII[9]);
        String str3 = lIIllIIIllll[lIIllIIlIIII[5]];
        int i3 = lIIllIIlIIII[5];
        int[] iArr3 = new int[lIIllIIlIIII[1]];
        iArr3[lIIllIIlIIII[0]] = lIIllIIlIIII[58];
        iArr3[lIIllIIlIIII[3]] = lIIllIIlIIII[59];
        iArr3[lIIllIIlIIII[5]] = lIIllIIlIIII[60];
        iArr3[lIIllIIlIIII[7]] = lIIllIIlIIII[61];
        iArr3[lIIllIIlIIII[9]] = lIIllIIlIIII[62];
        iArr3[lIIllIIlIIII[11]] = lIIllIIlIIII[63];
        iArr3[lIIllIIlIIII[13]] = lIIllIIlIIII[64];
        iArr3[lIIllIIlIIII[15]] = lIIllIIlIIII[65];
        iArr3[lIIllIIlIIII[17]] = lIIllIIlIIII[66];
        iArr3[lIIllIIlIIII[19]] = lIIllIIlIIII[67];
        iArr3[lIIllIIlIIII[21]] = lIIllIIlIIII[68];
        iArr3[lIIllIIlIIII[23]] = lIIllIIlIIII[69];
        iArr3[lIIllIIlIIII[25]] = lIIllIIlIIII[70];
        iArr3[lIIllIIlIIII[27]] = lIIllIIlIIII[71];
        iArr3[lIIllIIlIIII[29]] = lIIllIIlIIII[72];
        iArr3[lIIllIIlIIII[31]] = lIIllIIlIIII[73];
        iArr3[lIIllIIlIIII[33]] = lIIllIIlIIII[74];
        iArr3[lIIllIIlIIII[35]] = lIIllIIlIIII[75];
        iArr3[lIIllIIlIIII[37]] = lIIllIIlIIII[76];
        LEGS = new C(str3, i3, iArr3, lIIllIIlIIII[9]);
        String str4 = lIIllIIIllll[lIIllIIlIIII[7]];
        int i4 = lIIllIIlIIII[7];
        int[] iArr4 = new int[lIIllIIlIIII[1]];
        iArr4[lIIllIIlIIII[0]] = lIIllIIlIIII[77];
        iArr4[lIIllIIlIIII[3]] = lIIllIIlIIII[78];
        iArr4[lIIllIIlIIII[5]] = lIIllIIlIIII[79];
        iArr4[lIIllIIlIIII[7]] = lIIllIIlIIII[80];
        iArr4[lIIllIIlIIII[9]] = lIIllIIlIIII[81];
        iArr4[lIIllIIlIIII[11]] = lIIllIIlIIII[82];
        iArr4[lIIllIIlIIII[13]] = lIIllIIlIIII[83];
        iArr4[lIIllIIlIIII[15]] = lIIllIIlIIII[84];
        iArr4[lIIllIIlIIII[17]] = lIIllIIlIIII[85];
        iArr4[lIIllIIlIIII[19]] = lIIllIIlIIII[86];
        iArr4[lIIllIIlIIII[21]] = lIIllIIlIIII[87];
        iArr4[lIIllIIlIIII[23]] = lIIllIIlIIII[88];
        iArr4[lIIllIIlIIII[25]] = lIIllIIlIIII[89];
        iArr4[lIIllIIlIIII[27]] = lIIllIIlIIII[90];
        iArr4[lIIllIIlIIII[29]] = lIIllIIlIIII[91];
        iArr4[lIIllIIlIIII[31]] = lIIllIIlIIII[92];
        iArr4[lIIllIIlIIII[33]] = lIIllIIlIIII[93];
        iArr4[lIIllIIlIIII[35]] = lIIllIIlIIII[94];
        iArr4[lIIllIIlIIII[37]] = lIIllIIlIIII[95];
        GLOVES = new C(str4, i4, iArr4, lIIllIIlIIII[7]);
        String str5 = lIIllIIIllll[lIIllIIlIIII[9]];
        int i5 = lIIllIIlIIII[9];
        int[] iArr5 = new int[lIIllIIlIIII[1]];
        iArr5[lIIllIIlIIII[0]] = lIIllIIlIIII[96];
        iArr5[lIIllIIlIIII[3]] = lIIllIIlIIII[97];
        iArr5[lIIllIIlIIII[5]] = lIIllIIlIIII[98];
        iArr5[lIIllIIlIIII[7]] = lIIllIIlIIII[99];
        iArr5[lIIllIIlIIII[9]] = lIIllIIlIIII[100];
        iArr5[lIIllIIlIIII[11]] = lIIllIIlIIII[101];
        iArr5[lIIllIIlIIII[13]] = lIIllIIlIIII[102];
        iArr5[lIIllIIlIIII[15]] = lIIllIIlIIII[103];
        iArr5[lIIllIIlIIII[17]] = lIIllIIlIIII[104];
        iArr5[lIIllIIlIIII[19]] = lIIllIIlIIII[105];
        iArr5[lIIllIIlIIII[21]] = lIIllIIlIIII[106];
        iArr5[lIIllIIlIIII[23]] = lIIllIIlIIII[107];
        iArr5[lIIllIIlIIII[25]] = lIIllIIlIIII[108];
        iArr5[lIIllIIlIIII[27]] = lIIllIIlIIII[109];
        iArr5[lIIllIIlIIII[29]] = lIIllIIlIIII[110];
        iArr5[lIIllIIlIIII[31]] = lIIllIIlIIII[111];
        iArr5[lIIllIIlIIII[33]] = lIIllIIlIIII[112];
        iArr5[lIIllIIlIIII[35]] = lIIllIIlIIII[113];
        iArr5[lIIllIIlIIII[37]] = lIIllIIlIIII[114];
        BOOTS = new C(str5, i5, iArr5, lIIllIIlIIII[7]);
        String str6 = lIIllIIIllll[lIIllIIlIIII[11]];
        int i6 = lIIllIIlIIII[11];
        int[] iArr6 = new int[lIIllIIlIIII[115]];
        iArr6[lIIllIIlIIII[0]] = lIIllIIlIIII[116];
        iArr6[lIIllIIlIIII[3]] = lIIllIIlIIII[117];
        iArr6[lIIllIIlIIII[5]] = lIIllIIlIIII[118];
        iArr6[lIIllIIlIIII[7]] = lIIllIIlIIII[119];
        iArr6[lIIllIIlIIII[9]] = lIIllIIlIIII[120];
        iArr6[lIIllIIlIIII[11]] = lIIllIIlIIII[121];
        iArr6[lIIllIIlIIII[13]] = lIIllIIlIIII[122];
        iArr6[lIIllIIlIIII[15]] = lIIllIIlIIII[123];
        iArr6[lIIllIIlIIII[17]] = lIIllIIlIIII[124];
        iArr6[lIIllIIlIIII[19]] = lIIllIIlIIII[125];
        iArr6[lIIllIIlIIII[21]] = lIIllIIlIIII[126];
        iArr6[lIIllIIlIIII[23]] = lIIllIIlIIII[127];
        iArr6[lIIllIIlIIII[25]] = lIIllIIlIIII[128];
        iArr6[lIIllIIlIIII[27]] = lIIllIIlIIII[129];
        iArr6[lIIllIIlIIII[29]] = lIIllIIlIIII[130];
        iArr6[lIIllIIlIIII[31]] = lIIllIIlIIII[131];
        iArr6[lIIllIIlIIII[33]] = lIIllIIlIIII[132];
        iArr6[lIIllIIlIIII[35]] = lIIllIIlIIII[133];
        iArr6[lIIllIIlIIII[37]] = lIIllIIlIIII[134];
        iArr6[lIIllIIlIIII[1]] = lIIllIIlIIII[135];
        iArr6[lIIllIIlIIII[136]] = lIIllIIlIIII[137];
        iArr6[lIIllIIlIIII[138]] = lIIllIIlIIII[139];
        CAPE = new C(str6, i6, iArr6, lIIllIIlIIII[7]);
        C[] cArr = new C[lIIllIIlIIII[13]];
        cArr[lIIllIIlIIII[0]] = HEAD;
        cArr[lIIllIIlIIII[3]] = BODY;
        cArr[lIIllIIlIIII[5]] = LEGS;
        cArr[lIIllIIlIIII[7]] = GLOVES;
        cArr[lIIllIIlIIII[9]] = BOOTS;
        cArr[lIIllIIlIIII[11]] = CAPE;
        $VALUES = cArr;
    }

    private C(String str, int i, int[] iArr, int i2) {
        this.items = iArr;
        this.boost = i2;
    }

    private static String llIIlllIIlIIII(String lllllllllllllllIlllIlllllIlIIlIl, String lllllllllllllllIlllIlllllIlIIlII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlllllIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlllllIlIIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIlllIlllllIlIIlII.toCharArray();
        int lllllllllllllllIlllIlllllIlIIIIl = lIIllIIlIIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIllIIlIIII[0];
        while (llIIlllIIlIlII(i, length)) {
            char lllllllllllllllIlllIlllllIlIIllI = charArray2[i];
            lllllllllllllllIlllIlllllIlIIIll.append((char) (lllllllllllllllIlllIlllllIlIIllI ^ charArray[lllllllllllllllIlllIlllllIlIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIlllIlllllIlIIIIl++;
            i++;
            "".length();
            if (((31 ^ 47) ^ (114 ^ 70)) <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlllIlllllIlIIIll);
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    private static String llIIlllIIlIIIl(String lllllllllllllllIlllIlllllIIlIIII, String lllllllllllllllIlllIlllllIIIllll) {
        try {
            SecretKeySpec lllllllllllllllIlllIlllllIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlllllIIIllll.getBytes(StandardCharsets.UTF_8)), lIIllIIlIIII[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIIlIIII[5], lllllllllllllllIlllIlllllIIlIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlllllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlllIlllllIIlIIIl) {
            lllllllllllllllIlllIlllllIIlIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIlllIIlIIll() {
        lIIllIIlIIII = new int[140];
        lIIllIIlIIII[0] = ((((2 + 113) - 18) + 85) ^ (((53 + 92) - 45) + 70)) & (((62 ^ 91) ^ (199 ^ 190)) ^ (-" ".length()));
        lIIllIIlIIII[1] = 122 ^ 105;
        lIIllIIlIIII[2] = (-((-11629) & 28141)) & (-37) & 28399;
        lIIllIIlIIII[3] = " ".length();
        lIIllIIlIIII[4] = (-((-10051) & 26611)) & (-513) & 30651;
        lIIllIIlIIII[5] = "  ".length();
        lIIllIIlIIII[6] = (-2099) & 15678;
        lIIllIIlIIII[7] = "   ".length();
        lIIllIIlIIII[8] = (-(((121 + 101) - 150) + 65)) & (-2113) & 15839;
        lIIllIIlIIII[9] = 31 ^ 27;
        lIIllIIlIIII[10] = (-((-10244) & 10983)) & (-18437) & 32767;
        lIIllIIlIIII[11] = 147 ^ 150;
        lIIllIIlIIII[12] = (-16981) & 30583;
        lIIllIIlIIII[13] = (200 ^ 137) ^ (223 ^ 152);
        lIIllIIlIIII[14] = (-((-8235) & 27374)) & (-25) & 32767;
        lIIllIIlIIII[15] = 0 ^ 7;
        lIIllIIlIIII[16] = (-17105) & 30719;
        lIIllIIlIIII[17] = 161 ^ 169;
        lIIllIIlIIII[18] = (-18958) & 32573;
        lIIllIIlIIII[19] = (((4 + 150) - 122) + 134) ^ (((92 + 25) - 106) + 164);
        lIIllIIlIIII[20] = (-2245) & 15871;
        lIIllIIlIIII[21] = 180 ^ 190;
        lIIllIIlIIII[22] = (-706) & 14333;
        lIIllIIlIIII[23] = 101 ^ 110;
        lIIllIIlIIII[24] = (-((-9571) & 12283)) & (-5) & 16383;
        lIIllIIlIIII[25] = 200 ^ 196;
        lIIllIIlIIII[26] = (-((-13361) & 30268)) & (-145) & 30719;
        lIIllIIlIIII[27] = (((111 + 22) - 84) + 91) ^ (((80 + 90) - 154) + 113);
        lIIllIIlIIII[28] = (-8481) & 29541;
        lIIllIIlIIII[29] = 140 ^ 130;
        lIIllIIlIIII[30] = (-9241) & 30303;
        lIIllIIlIIII[31] = (102 ^ 106) ^ "   ".length();
        lIIllIIlIIII[32] = (-3401) & 28143;
        lIIllIIlIIII[33] = 159 ^ 143;
        lIIllIIlIIII[34] = (-5699) & 30443;
        lIIllIIlIIII[35] = 43 ^ 58;
        lIIllIIlIIII[36] = (-2579) & 27647;
        lIIllIIlIIII[37] = 71 ^ 85;
        lIIllIIlIIII[38] = (-((-17109) & 18133)) & (-6657) & 32751;
        lIIllIIlIIII[39] = (-20513) & 32367;
        lIIllIIlIIII[40] = (-19025) & 32607;
        lIIllIIlIIII[41] = (-18566) & 32149;
        lIIllIIlIIII[42] = (-2053) & 15647;
        lIIllIIlIIII[43] = (-((-29465) & 31705)) & (-33) & 15868;
        lIIllIIlIIII[44] = (-((-899) & 19339)) & (-145) & 32191;
        lIIllIIlIIII[45] = (-(248 ^ 187)) & (-18950) & 32623;
        lIIllIIlIIII[46] = (-517) & 14135;
        lIIllIIlIIII[47] = (-16387) & 30006;
        lIIllIIlIIII[48] = (-18433) & 32063;
        lIIllIIlIIII[49] = (-((-4161) & 23244)) & (-37) & 32751;
        lIIllIIlIIII[50] = (-(((48 + 68) - 103) + 116)) & (-2561) & 16359;
        lIIllIIlIIII[51] = (-2568) & 16239;
        lIIllIIlIIII[52] = (-((-8711) & 11191)) & (-1025) & 24571;
        lIIllIIlIIII[53] = (-((-6657) & 15265)) & (-1025) & 30701;
        lIIllIIlIIII[54] = (-((-25737) & 28617)) & (-1) & 27629;
        lIIllIIlIIII[55] = (-2577) & 27327;
        lIIllIIlIIII[56] = (-((-16755) & 22395)) & (-5) & 30719;
        lIIllIIlIIII[57] = (-4619) & 29695;
        lIIllIIlIIII[58] = (-43) & 11899;
        lIIllIIlIIII[59] = (-201) & 13785;
        lIIllIIlIIII[60] = (-2146) & 15731;
        lIIllIIlIIII[61] = (-16579) & 30175;
        lIIllIIlIIII[62] = (-(((15 + 63) - (-15)) + 101)) & (-18465) & 32255;
        lIIllIIlIIII[63] = (-2689) & 16297;
        lIIllIIlIIII[64] = (-2773) & 16382;
        lIIllIIlIIII[65] = (-(7 ^ 68)) & (-9) & 13695;
        lIIllIIlIIII[66] = (-16962) & 30583;
        lIIllIIlIIII[67] = (-((-1171) & 3731)) & (-189) & 16381;
        lIIllIIlIIII[68] = (-182) & 13815;
        lIIllIIlIIII[69] = (-2199) & 15871;
        lIIllIIlIIII[70] = (-17026) & 30699;
        lIIllIIlIIII[71] = (-1442) & 22511;
        lIIllIIlIIII[72] = (-((-5153) & 13743)) & (-2) & 29663;
        lIIllIIlIIII[73] = (-((-9957) & 16367)) & (-1089) & 32250;
        lIIllIIlIIII[74] = (-6982) & 31735;
        lIIllIIlIIII[75] = (-1) & 25078;
        lIIllIIlIIII[76] = (-1028) & 26107;
        lIIllIIlIIII[77] = (-(167 ^ 174)) & (-20609) & 32475;
        lIIllIIlIIII[78] = (-19181) & 32767;
        lIIllIIlIIII[79] = (-((-15362) & 32365)) & (-1) & 30591;
        lIIllIIlIIII[80] = (-((-4373) & 6453)) & (-193) & 15871;
        lIIllIIlIIII[81] = (-18592) & 32191;
        lIIllIIlIIII[82] = (-((-8747) & 27195)) & (-709) & 32767;
        lIIllIIlIIII[83] = (-705) & 14316;
        lIIllIIlIIII[84] = (-((-409) & 18841)) & (-577) & 32631;
        lIIllIIlIIII[85] = (-711) & 14334;
        lIIllIIlIIII[86] = (-19113) & 32747;
        lIIllIIlIIII[87] = (-((-10501) & 26943)) & (-642) & 30719;
        lIIllIIlIIII[88] = (-((-20843) & 23419)) & (-133) & 16383;
        lIIllIIlIIII[89] = (-19089) & 32764;
        lIIllIIlIIII[90] = (-11277) & 32349;
        lIIllIIlIIII[91] = (-((-16691) & 26043)) & (-261) & 30687;
        lIIllIIlIIII[92] = (-((-25115) & 26463)) & (-4097) & 30199;
        lIIllIIlIIII[93] = (-((-22677) & 24479)) & (-4097) & 30655;
        lIIllIIlIIII[94] = (-((-3117) & 7213)) & (-2053) & 31229;
        lIIllIIlIIII[95] = (-((-16463) & 20559)) & (-1025) & 30203;
        lIIllIIlIIII[96] = (-((-3189) & 7285)) & (-387) & 16343;
        lIIllIIlIIII[97] = (-((-3381) & 20477)) & (-2051) & 32735;
        lIIllIIlIIII[98] = (-16993) & 30582;
        lIIllIIlIIII[99] = (-16385) & 29985;
        lIIllIIlIIII[100] = (-2561) & 16162;
        lIIllIIlIIII[101] = (-(((64 + 144) - 94) + 97)) & (-2049) & 15871;
        lIIllIIlIIII[102] = (-((-12385) & 31473)) & (-2) & 32703;
        lIIllIIlIIII[103] = (-16897) & 30521;
        lIIllIIlIIII[104] = (-18437) & 32062;
        lIIllIIlIIII[105] = (-((-26113) & 28321)) & (-25) & 15869;
        lIIllIIlIIII[106] = (-16433) & 30070;
        lIIllIIlIIII[107] = (-17) & 13693;
        lIIllIIlIIII[108] = (-146) & 13823;
        lIIllIIlIIII[109] = (-2346) & 23421;
        lIIllIIlIIII[110] = (-3338) & 24415;
        lIIllIIlIIII[111] = (-((-16545) & 22498)) & (-2049) & 32759;
        lIIllIIlIIII[112] = (-((-4633) & 5983)) & (-2049) & 28158;
        lIIllIIlIIII[113] = (-"   ".length()) & (-1538) & 26623;
        lIIllIIlIIII[114] = (-2050) & 27135;
        lIIllIIlIIII[115] = (((103 + 75) - 108) + 61) ^ (((89 + 49) - 74) + 85);
        lIIllIIlIIII[116] = (-((-16965) & 21237)) & (-16641) & 32765;
        lIIllIIlIIII[117] = (-2099) & 15679;
        lIIllIIlIIII[118] = (-2194) & 15775;
        lIIllIIlIIII[119] = (-((-3631) & 20207)) & (-37) & 30205;
        lIIllIIlIIII[120] = (-16486) & 30079;
        lIIllIIlIIII[121] = (-((-13749) & 16319)) & (-81) & 16255;
        lIIllIIlIIII[122] = (-((-9221) & 27790)) & (-529) & 32703;
        lIIllIIlIIII[123] = (-18567) & 32183;
        lIIllIIlIIII[124] = (-2178) & 15795;
        lIIllIIlIIII[125] = (-18561) & 32189;
        lIIllIIlIIII[126] = (-514) & 14143;
        lIIllIIlIIII[127] = (-((-5237) & 24309)) & (-27) & 32767;
        lIIllIIlIIII[128] = (-((-21777) & 24474)) & (-17) & 16383;
        lIIllIIlIIII[129] = (-8577) & 29640;
        lIIllIIlIIII[130] = (-10549) & 31614;
        lIIllIIlIIII[131] = (-850) & 25595;
        lIIllIIlIIII[132] = (-1538) & 26285;
        lIIllIIlIIII[133] = (-1550) & 26621;
        lIIllIIlIIII[134] = (-2053) & 27126;
        lIIllIIlIIII[135] = (-((-9761) & 32757)) & (-1) & 32767;
        lIIllIIlIIII[136] = 145 ^ 133;
        lIIllIIlIIII[137] = (-22787) & 32558;
        lIIllIIlIIII[138] = (19 ^ 13) ^ (155 ^ 144);
        lIIllIIlIIII[139] = (-((-89) & 3163)) & (-14) & 16367;
    }
}
