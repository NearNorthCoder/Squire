package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.H  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/H.class */
public final class H {
    public static final /* synthetic */ H KARAMJA_GLOVES_4;
    public static final /* synthetic */ H RING_OF_DUELING;
    public static final /* synthetic */ H FISHING_CAPE;
    public static final /* synthetic */ H ROYAL_SEED_POD;
    private final /* synthetic */ String teleportOption;
    public static final /* synthetic */ H AMULET_OF_GLORY;
    public static final /* synthetic */ H CHRONICLE;
    private final /* synthetic */ int[] itemID;
    public static final /* synthetic */ H RADAS_BLESSING;
    private static final /* synthetic */ H[] $VALUES;
    private static /* synthetic */ String[] lIlIIllll;
    public static final /* synthetic */ H CONSTRUCTION_CAPE;
    public static final /* synthetic */ H EXPLORERS_RING;
    public static final /* synthetic */ H CRAFTING_CAPE;
    private /* synthetic */ boolean mustBeEquipped;
    private static /* synthetic */ int[] lIlIlIIII;
    public static final /* synthetic */ H KARAMJA_GLOVES_3;
    public static final /* synthetic */ H MAX_CAPE;
    public static final /* synthetic */ H ARDOUGNE_CLOAK;
    public static final /* synthetic */ H ECTOPHIAL;

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    private static String lIIlIIlllIl(String llIIIIIIIllllIl, String llIIIIIIIllllII) {
        String llIIIIIIIllllIl2 = new String(Base64.getDecoder().decode(llIIIIIIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIIIIIIIllllII.toCharArray();
        int llIIIIIIIlllIIl = lIlIlIIII[0];
        char[] charArray2 = llIIIIIIIllllIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIlIlIIII[0];
        while (lIIlIlIIIIl(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[llIIIIIIIlllIIl % charArray.length]));
            "".length();
            llIIIIIIIlllIIl++;
            i2++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int[] av() {
        return this.itemID;
    }

    private static String lIIlIIllllI(String llIIIIIIlIllIlI, String llIIIIIIlIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIIIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIIlIllIll) {
            llIIIIIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllII(String llIIIIIIlIIllIl, String llIIIIIIlIIllII) {
        try {
            SecretKeySpec llIIIIIIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIIlIIllII.getBytes(StandardCharsets.UTF_8)), lIlIlIIII[15]), "DES");
            Cipher llIIIIIIlIIllll = Cipher.getInstance("DES");
            llIIIIIIlIIllll.init(lIlIlIIII[2], llIIIIIIlIlIIII);
            return new String(llIIIIIIlIIllll.doFinal(Base64.getDecoder().decode(llIIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIIlIIlllI) {
            llIIIIIIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIl(int i2, int i3) {
        return i2 < i3;
    }

    private H(String str, int i2, String str2, boolean z, int... iArr) {
        this.itemID = iArr;
        this.mustBeEquipped = z;
        this.teleportOption = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v66, types: [boolean] */
    static {
        lIIlIlIIIII();
        lIIlIIlllll();
        String str = lIlIIllll[lIlIlIIII[0]];
        int i2 = lIlIlIIII[0];
        String str2 = lIlIIllll[lIlIlIIII[1]];
        int[] iArr = new int[lIlIlIIII[2]];
        iArr[lIlIlIIII[0]] = lIlIlIIII[3];
        iArr[lIlIlIIII[1]] = lIlIlIIII[4];
        CONSTRUCTION_CAPE = new H(str, i2, str2, iArr);
        String str3 = lIlIIllll[lIlIlIIII[2]];
        int i3 = lIlIlIIII[1];
        String str4 = lIlIIllll[lIlIlIIII[5]];
        int[] iArr2 = new int[lIlIlIIII[1]];
        iArr2[lIlIlIIII[0]] = lIlIlIIII[6];
        MAX_CAPE = new H(str3, i3, str4, iArr2);
        String str5 = lIlIIllll[lIlIlIIII[7]];
        int i4 = lIlIlIIII[2];
        String str6 = lIlIIllll[lIlIlIIII[8]];
        int[] iArr3 = new int[lIlIlIIII[2]];
        iArr3[lIlIlIIII[0]] = lIlIlIIII[9];
        iArr3[lIlIlIIII[1]] = lIlIlIIII[10];
        CRAFTING_CAPE = new H(str5, i4, str6, iArr3);
        String str7 = lIlIIllll[lIlIlIIII[11]];
        int i5 = lIlIlIIII[5];
        String str8 = lIlIIllll[lIlIlIIII[12]];
        int[] iArr4 = new int[lIlIlIIII[2]];
        iArr4[lIlIlIIII[0]] = lIlIlIIII[13];
        iArr4[lIlIlIIII[1]] = lIlIlIIII[14];
        FISHING_CAPE = new H(str7, i5, str8, iArr4);
        String str9 = lIlIIllll[lIlIlIIII[15]];
        int i6 = lIlIlIIII[7];
        String str10 = lIlIIllll[lIlIlIIII[16]];
        int[] iArr5 = new int[lIlIlIIII[7]];
        iArr5[lIlIlIIII[0]] = lIlIlIIII[17];
        iArr5[lIlIlIIII[1]] = lIlIlIIII[18];
        iArr5[lIlIlIIII[2]] = lIlIlIIII[19];
        iArr5[lIlIlIIII[5]] = lIlIlIIII[20];
        ARDOUGNE_CLOAK = new H(str9, i6, str10, iArr5);
        String str11 = lIlIIllll[lIlIlIIII[21]];
        int i7 = lIlIlIIII[8];
        String str12 = lIlIIllll[lIlIlIIII[22]];
        int[] iArr6 = new int[lIlIlIIII[1]];
        iArr6[lIlIlIIII[0]] = lIlIlIIII[23];
        ECTOPHIAL = new H(str11, i7, str12, iArr6);
        String str13 = lIlIIllll[lIlIlIIII[24]];
        int i8 = lIlIlIIII[11];
        String str14 = lIlIIllll[lIlIlIIII[25]];
        int[] iArr7 = new int[lIlIlIIII[1]];
        iArr7[lIlIlIIII[0]] = lIlIlIIII[26];
        KARAMJA_GLOVES_3 = new H(str13, i8, str14, iArr7);
        String str15 = lIlIIllll[lIlIlIIII[27]];
        int i9 = lIlIlIIII[12];
        String str16 = lIlIIllll[lIlIlIIII[28]];
        int[] iArr8 = new int[lIlIlIIII[1]];
        iArr8[lIlIlIIII[0]] = lIlIlIIII[29];
        KARAMJA_GLOVES_4 = new H(str15, i9, str16, iArr8);
        String str17 = lIlIIllll[lIlIlIIII[30]];
        int i10 = lIlIlIIII[15];
        String str18 = lIlIIllll[lIlIlIIII[31]];
        int[] iArr9 = new int[lIlIlIIII[2]];
        iArr9[lIlIlIIII[0]] = lIlIlIIII[32];
        iArr9[lIlIlIIII[1]] = lIlIlIIII[33];
        EXPLORERS_RING = new H(str17, i10, str18, iArr9);
        String str19 = lIlIIllll[lIlIlIIII[34]];
        int i11 = lIlIlIIII[16];
        String str20 = lIlIIllll[lIlIlIIII[35]];
        int[] iArr10 = new int[lIlIlIIII[1]];
        iArr10[lIlIlIIII[0]] = lIlIlIIII[36];
        ROYAL_SEED_POD = new H(str19, i11, str20, iArr10);
        String str21 = lIlIIllll[lIlIlIIII[37]];
        int i12 = lIlIlIIII[21];
        String str22 = lIlIIllll[lIlIlIIII[38]];
        int[] iArr11 = new int[lIlIlIIII[1]];
        iArr11[lIlIlIIII[0]] = lIlIlIIII[39];
        CHRONICLE = new H(str21, i12, str22, iArr11);
        String str23 = lIlIIllll[lIlIlIIII[40]];
        int i13 = lIlIlIIII[22];
        String str24 = lIlIIllll[lIlIlIIII[41]];
        ?? r5 = lIlIlIIII[1];
        int[] iArr12 = new int[lIlIlIIII[12]];
        iArr12[lIlIlIIII[0]] = lIlIlIIII[42];
        iArr12[lIlIlIIII[1]] = lIlIlIIII[43];
        iArr12[lIlIlIIII[2]] = lIlIlIIII[44];
        iArr12[lIlIlIIII[5]] = lIlIlIIII[45];
        iArr12[lIlIlIIII[7]] = lIlIlIIII[46];
        iArr12[lIlIlIIII[8]] = lIlIlIIII[47];
        iArr12[lIlIlIIII[11]] = lIlIlIIII[48];
        AMULET_OF_GLORY = new H(str23, i13, str24, r5, iArr12);
        String str25 = lIlIIllll[lIlIlIIII[49]];
        int i14 = lIlIlIIII[24];
        String str26 = lIlIIllll[lIlIlIIII[50]];
        ?? r52 = lIlIlIIII[1];
        int[] iArr13 = new int[lIlIlIIII[15]];
        iArr13[lIlIlIIII[0]] = lIlIlIIII[51];
        iArr13[lIlIlIIII[1]] = lIlIlIIII[52];
        iArr13[lIlIlIIII[2]] = lIlIlIIII[53];
        iArr13[lIlIlIIII[5]] = lIlIlIIII[54];
        iArr13[lIlIlIIII[7]] = lIlIlIIII[55];
        iArr13[lIlIlIIII[8]] = lIlIlIIII[56];
        iArr13[lIlIlIIII[11]] = lIlIlIIII[57];
        iArr13[lIlIlIIII[12]] = lIlIlIIII[58];
        RING_OF_DUELING = new H(str25, i14, str26, r52, iArr13);
        String str27 = lIlIIllll[lIlIlIIII[59]];
        int i15 = lIlIlIIII[25];
        String str28 = lIlIIllll[lIlIlIIII[60]];
        ?? r53 = lIlIlIIII[1];
        int[] iArr14 = new int[lIlIlIIII[1]];
        iArr14[lIlIlIIII[0]] = lIlIlIIII[61];
        RADAS_BLESSING = new H(str27, i15, str28, r53, iArr14);
        H[] hArr = new H[lIlIlIIII[27]];
        hArr[lIlIlIIII[0]] = CONSTRUCTION_CAPE;
        hArr[lIlIlIIII[1]] = MAX_CAPE;
        hArr[lIlIlIIII[2]] = CRAFTING_CAPE;
        hArr[lIlIlIIII[5]] = FISHING_CAPE;
        hArr[lIlIlIIII[7]] = ARDOUGNE_CLOAK;
        hArr[lIlIlIIII[8]] = ECTOPHIAL;
        hArr[lIlIlIIII[11]] = KARAMJA_GLOVES_3;
        hArr[lIlIlIIII[12]] = KARAMJA_GLOVES_4;
        hArr[lIlIlIIII[15]] = EXPLORERS_RING;
        hArr[lIlIlIIII[16]] = ROYAL_SEED_POD;
        hArr[lIlIlIIII[21]] = CHRONICLE;
        hArr[lIlIlIIII[22]] = AMULET_OF_GLORY;
        hArr[lIlIlIIII[24]] = RING_OF_DUELING;
        hArr[lIlIlIIII[25]] = RADAS_BLESSING;
        $VALUES = hArr;
    }

    private static void lIIlIlIIIII() {
        lIlIlIIII = new int[63];
        lIlIlIIII[0] = (133 ^ 170) & ((79 ^ 96) ^ (-1));
        lIlIlIIII[1] = " ".length();
        lIlIlIIII[2] = "  ".length();
        lIlIlIIII[3] = (-20675) & 30463;
        lIlIlIIII[4] = (-4161) & 13950;
        lIlIlIIII[5] = "   ".length();
        lIlIlIIII[6] = (-16417) & 29758;
        lIlIlIIII[7] = 65 ^ 69;
        lIlIlIIII[8] = (5 ^ 40) ^ (0 ^ 40);
        lIlIlIIII[9] = (-4420) & 14199;
        lIlIlIIII[10] = (-((-4609) & 6787)) & (-16713) & 28671;
        lIlIlIIII[11] = 53 ^ 51;
        lIlIlIIII[12] = (((171 + 175) - 261) + 93) ^ (((17 + 178) - 172) + 158);
        lIlIlIIII[13] = (-(((114 + 114) - 216) + 174)) & (-257) & 10239;
        lIlIlIIII[14] = (-20913) & 30711;
        lIlIlIIII[15] = (((154 + 92) - 77) + 12) ^ (((89 + 142) - 96) + 54);
        lIlIlIIII[16] = (((105 + 35) - (-2)) + 9) ^ (((48 + 47) - 34) + 97);
        lIlIlIIII[17] = (-((-8729) & 25279)) & (-1) & 29671;
        lIlIlIIII[18] = (-((-22) & 19647)) & (-21) & 32767;
        lIlIlIIII[19] = (-((-30853) & 31933)) & (-2053) & 16255;
        lIlIlIIII[20] = (-((-13127) & 32599)) & (-43) & 32638;
        lIlIlIIII[21] = 50 ^ 56;
        lIlIlIIII[22] = (((21 + 15) - (-34)) + 119) ^ (((170 + 41) - 73) + 44);
        lIlIlIIII[23] = (-11073) & 15323;
        lIlIlIIII[24] = (59 ^ 8) ^ (174 ^ 145);
        lIlIlIIII[25] = (((21 + 0) - (-47)) + 73) ^ (((49 + 100) - 98) + 77);
        lIlIlIIII[26] = (-((-2637) & 23167)) & (-1034) & 32703;
        lIlIlIIII[27] = (81 ^ 10) ^ (17 ^ 68);
        lIlIlIIII[28] = (200 ^ 189) ^ (15 ^ 117);
        lIlIlIIII[29] = (-1233) & 14335;
        lIlIlIIII[30] = 10 ^ 26;
        lIlIlIIII[31] = 48 ^ 33;
        lIlIlIIII[32] = (-((-14871) & 32319)) & (-145) & 30719;
        lIlIlIIII[33] = (-17458) & 30585;
        lIlIlIIII[34] = 215 ^ 197;
        lIlIlIIII[35] = 69 ^ 86;
        lIlIlIIII[36] = (-((-4073) & 16379)) & (-769) & 32638;
        lIlIlIIII[37] = (((51 + 49) - (-112)) + 2) ^ (((140 + 107) - 102) + 49);
        lIlIlIIII[38] = (((171 + 29) - 180) + 166) ^ (((36 + 143) - 96) + 92);
        lIlIlIIII[39] = (-((-267) & 19371)) & (-2) & 32765;
        lIlIlIIII[40] = (62 ^ 101) ^ (28 ^ 81);
        lIlIlIIII[41] = (((122 + 145) - 204) + 114) ^ (((156 + 45) - 105) + 70);
        lIlIlIIII[42] = (-((-691) & 11187)) & (-20481) & 32682;
        lIlIlIIII[43] = (-12356) & 14063;
        lIlIlIIII[44] = (-14673) & 16382;
        lIlIlIIII[45] = (-16458) & 18169;
        lIlIlIIII[46] = (-((-4673) & 4949)) & (-16419) & 28670;
        lIlIlIIII[47] = (-((-10273) & 30769)) & (-293) & 32766;
        lIlIlIIII[48] = (-((-95) & 8543)) & (-4097) & 32251;
        lIlIlIIII[49] = 1 ^ 25;
        lIlIlIIII[50] = 89 ^ 64;
        lIlIlIIII[51] = (-5121) & 7686;
        lIlIlIIII[52] = (-(((166 + 22) - 22) + 3)) & (-21827) & 24558;
        lIlIlIIII[53] = (-233) & 2794;
        lIlIlIIII[54] = (-9315) & 11874;
        lIlIlIIII[55] = (-514) & 3071;
        lIlIlIIII[56] = (-4099) & 6654;
        lIlIlIIII[57] = (-26114) & 28667;
        lIlIlIIII[58] = (-28678) & 31229;
        lIlIlIIII[59] = 142 ^ 148;
        lIlIlIIII[60] = (55 ^ 14) ^ (52 ^ 22);
        lIlIlIIII[61] = (-9) & 22955;
        lIlIlIIII[62] = (59 ^ 28) ^ (124 ^ 71);
    }

    private H(String str, int i2, String str2, int... iArr) {
        this.itemID = iArr;
        this.teleportOption = str2;
    }

    public static H[] values() {
        return (H[]) $VALUES.clone();
    }

    private static void lIIlIIlllll() {
        lIlIIllll = new String[lIlIlIIII[62]];
        lIlIIllll[lIlIlIIII[0]] = lIIlIIlllII("vvbFC4yPxwiXPynneJ1WxRYAbYqCq0r8", "PHaIH");
        lIlIIllll[lIlIlIIII[1]] = lIIlIIlllII("CnmUpaUcUgxCisKcHCUEqA==", "hjYvM");
        lIlIIllll[lIlIlIIII[2]] = lIIlIIlllIl("NQk7GzA5GCY=", "xHcDs");
        lIlIIllll[lIlIlIIII[5]] = lIIlIIlllII("S76iiC1+mpWcB+6MsXK8dQ==", "tJQBr");
        lIlIIllll[lIlIlIIII[7]] = lIIlIIllllI("ZaSA5eix5v9Ve0cpQkSF9Q==", "kyXjw");
        lIlIIllll[lIlIlIIII[8]] = lIIlIIlllIl("ETQfMhEqIwc=", "EQsWa");
        lIlIIllll[lIlIlIIII[11]] = lIIlIIllllI("WQtX8O6YE9ooKOi44UFSqw==", "QNsmx");
        lIlIIllll[lIlIlIIII[12]] = lIIlIIlllII("PRWswDA7iyGOpUVohx/e1Q==", "xlqSS");
        lIlIIllll[lIlIlIIII[15]] = lIIlIIlllIl("CiUOBxkMOQ8XDwc4CwM=", "KwJHL");
        lIlIIllll[lIlIlIIII[16]] = lIIlIIllllI("uf2lsdUGk3nY+O5UbpjHbjZS4VzZd4IV", "eJvdm");
        lIlIIllll[lIlIlIIII[21]] = lIIlIIlllII("E6AHdJs7iSVKSVwxU6/o4w==", "NfRLn");
        lIlIIllll[lIlIlIIII[22]] = lIIlIIlllIl("DRc/BCs=", "HzOpR");
        lIlIIllll[lIlIlIIII[24]] = lIIlIIllllI("geHw2YT7g1/Bdzv9+tpCWUDYKeViVYBE", "YjynK");
        lIlIIllll[lIlIlIIII[25]] = lIIlIIlllII("bJLy/KguJPYOVwFSWJbiyQ==", "aDdVH");
        lIlIIllll[lIlIlIIII[27]] = lIIlIIllllI("t1uA5Sc+V1eltZV8HQzEPDL2tb/8plBh", "UQPcp");
        lIlIIllll[lIlIlIIII[28]] = lIIlIIlllII("vVyNKCmh4VI=", "amDiq");
        lIlIIllll[lIlIlIIII[30]] = lIIlIIlllIl("Fi4XOiYBMxUlNgE/CTE=", "SvGvi");
        lIlIIllll[lIlIlIIII[31]] = lIIlIIlllII("HOiihyFpvnmkyt0kIOnQVQ==", "eNFXE");
        lIlIIllll[lIlIlIIII[34]] = lIIlIIlllII("0vMbBLcfYqmyuZnP2J08hA==", "hsgkj");
        lIlIIllll[lIlIlIIII[35]] = lIIlIIlllIl("ESgmCiU8Ig==", "RGKgP");
        lIlIIllll[lIlIlIIII[37]] = lIIlIIlllII("5ohdCF3x+ZGVRHb75GRo8w==", "cFKTI");
        lIlIIllll[lIlIlIIII[38]] = lIIlIIlllII("IlBL93cJiOI63NpcSg1AsA==", "qmpQB");
        lIlIIllll[lIlIlIIII[40]] = lIIlIIlllII("F5aWLGob+WVVxeQRhmdU5Q==", "TYTdk");
        lIlIIllll[lIlIlIIII[41]] = lIIlIIlllII("MCJp9pO8iLYtyzan0mAeXw==", "AXsMW");
        lIlIIllll[lIlIlIIII[49]] = lIIlIIllllI("UBX/6o5/09G6TzOV/WbE3Q==", "sADYJ");
        lIlIIllll[lIlIlIIII[50]] = lIIlIIlllII("IIsvGsaYjsg0J7oaOjLdIQ==", "FmnQX");
        lIlIIllll[lIlIlIIII[59]] = lIIlIIlllII("l/WjhgSyQW1kHD3k6bTaiw==", "AvloD");
        lIlIIllll[lIlIlIIII[60]] = lIIlIIlllII("gEHN3fJljr0jYdXKHJHFmw==", "LrwOX");
    }

    public String au() {
        return this.teleportOption;
    }

    public boolean aw() {
        return this.mustBeEquipped;
    }
}
