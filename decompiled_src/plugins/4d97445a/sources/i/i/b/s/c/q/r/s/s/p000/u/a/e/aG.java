package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aG  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aG.class */
public final class aG {
    public static final /* synthetic */ aG TORSTOL;
    public static final /* synthetic */ aG MARRENTILL;
    private static /* synthetic */ String[] lllllII;
    public static final /* synthetic */ aG CADANTINE;
    public static final /* synthetic */ aG LANTADYME;
    public static final /* synthetic */ aG AVANTOE;
    public static final /* synthetic */ aG KWUARM;
    public static final /* synthetic */ aG RANARR_WEED;
    private final /* synthetic */ String itemName;
    public static final /* synthetic */ aG IRIT_LEAF;
    public static final /* synthetic */ aG HARRALANDER;
    public static final /* synthetic */ aG SNAPDRAGON;
    public static final /* synthetic */ aG TOADFLAX;
    public static final /* synthetic */ aG DWARF_WEED;
    private static /* synthetic */ int[] lllllIl;
    private static final /* synthetic */ aG[] $VALUES;
    private final /* synthetic */ int id;
    public static final /* synthetic */ aG GUAM_LEAF;
    public static final /* synthetic */ aG TARROMIN;

    private aG(String str, int i2, String str2, int i3) {
        this.itemName = str2;
        this.id = i3;
    }

    public static aG x(int i2) {
        aG[] values = values();
        int length = values.length;
        int i3 = lllllIl[0];
        while (llllIIlII(i3, length)) {
            aG aGVar = values[i3];
            if (llllIIlIl(aGVar.P(), i2)) {
                return aGVar;
            }
            i3++;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return null;
    }

    private static boolean llllIIlII(int i2, int i3) {
        return i2 < i3;
    }

    static {
        llllIIIll();
        llllIIIlI();
        GUAM_LEAF = new aG(lllllII[lllllIl[0]], lllllIl[0], lllllII[lllllIl[1]], lllllIl[2]);
        MARRENTILL = new aG(lllllII[lllllIl[3]], lllllIl[1], lllllII[lllllIl[4]], lllllIl[5]);
        TARROMIN = new aG(lllllII[lllllIl[6]], lllllIl[3], lllllII[lllllIl[7]], lllllIl[8]);
        HARRALANDER = new aG(lllllII[lllllIl[9]], lllllIl[4], lllllII[lllllIl[10]], lllllIl[11]);
        RANARR_WEED = new aG(lllllII[lllllIl[12]], lllllIl[6], lllllII[lllllIl[13]], lllllIl[14]);
        TOADFLAX = new aG(lllllII[lllllIl[15]], lllllIl[7], lllllII[lllllIl[16]], lllllIl[17]);
        IRIT_LEAF = new aG(lllllII[lllllIl[18]], lllllIl[9], lllllII[lllllIl[19]], lllllIl[20]);
        AVANTOE = new aG(lllllII[lllllIl[21]], lllllIl[10], lllllII[lllllIl[22]], lllllIl[23]);
        KWUARM = new aG(lllllII[lllllIl[24]], lllllIl[12], lllllII[lllllIl[25]], lllllIl[26]);
        SNAPDRAGON = new aG(lllllII[lllllIl[27]], lllllIl[13], lllllII[lllllIl[28]], lllllIl[29]);
        CADANTINE = new aG(lllllII[lllllIl[30]], lllllIl[15], lllllII[lllllIl[31]], lllllIl[32]);
        LANTADYME = new aG(lllllII[lllllIl[33]], lllllIl[16], lllllII[lllllIl[34]], lllllIl[35]);
        DWARF_WEED = new aG(lllllII[lllllIl[36]], lllllIl[18], lllllII[lllllIl[37]], lllllIl[38]);
        TORSTOL = new aG(lllllII[lllllIl[39]], lllllIl[19], lllllII[lllllIl[40]], lllllIl[41]);
        aG[] aGVarArr = new aG[lllllIl[21]];
        aGVarArr[lllllIl[0]] = GUAM_LEAF;
        aGVarArr[lllllIl[1]] = MARRENTILL;
        aGVarArr[lllllIl[3]] = TARROMIN;
        aGVarArr[lllllIl[4]] = HARRALANDER;
        aGVarArr[lllllIl[6]] = RANARR_WEED;
        aGVarArr[lllllIl[7]] = TOADFLAX;
        aGVarArr[lllllIl[9]] = IRIT_LEAF;
        aGVarArr[lllllIl[10]] = AVANTOE;
        aGVarArr[lllllIl[12]] = KWUARM;
        aGVarArr[lllllIl[13]] = SNAPDRAGON;
        aGVarArr[lllllIl[15]] = CADANTINE;
        aGVarArr[lllllIl[16]] = LANTADYME;
        aGVarArr[lllllIl[18]] = DWARF_WEED;
        aGVarArr[lllllIl[19]] = TORSTOL;
        $VALUES = aGVarArr;
    }

    public int P() {
        return this.id;
    }

    private static void llllIIIll() {
        lllllIl = new int[43];
        lllllIl[0] = ((((111 + 96) - 131) + 73) ^ (((135 + 58) - 94) + 97)) & (((((46 + 110) - 144) + 139) ^ (((99 + 63) - 20) + 56)) ^ (-" ".length()));
        lllllIl[1] = " ".length();
        lllllIl[2] = ((187 + 168) - 224) + 68;
        lllllIl[3] = "  ".length();
        lllllIl[4] = "   ".length();
        lllllIl[5] = ((106 + 122) - 67) + 40;
        lllllIl[6] = (15 ^ 34) ^ (86 ^ 127);
        lllllIl[7] = (((110 + 137) - 227) + 173) ^ (((189 + 138) - 213) + 82);
        lllllIl[8] = (((((75 + 132) - 157) + 108) + (32 ^ 62)) - (225 ^ 149)) + ((28 + 12) - 34) + 125;
        lllllIl[9] = 3 ^ 5;
        lllllIl[10] = 124 ^ 123;
        lllllIl[11] = (((((122 + 87) - 195) + 142) + (((102 + 92) - 166) + 143)) - (((106 + 81) - 32) + 66)) + (41 ^ 74);
        lllllIl[12] = 39 ^ 47;
        lllllIl[13] = (173 ^ 131) ^ (30 ^ 57);
        lllllIl[14] = (((91 ^ 18) + (107 ^ 58)) - (-(177 ^ 169))) + (149 ^ 136);
        lllllIl[15] = 16 ^ 26;
        lllllIl[16] = 115 ^ 120;
        lllllIl[17] = (-8213) & 11261;
        lllllIl[18] = 118 ^ 122;
        lllllIl[19] = 143 ^ 130;
        lllllIl[20] = ((141 + 77) - 184) + 175;
        lllllIl[21] = (46 ^ 51) ^ (188 ^ 175);
        lllllIl[22] = (71 ^ 7) ^ (21 ^ 90);
        lllllIl[23] = (((122 ^ 118) + (161 ^ 176)) - (-(((62 + 95) - 0) + 9))) + (39 ^ 55);
        lllllIl[24] = 87 ^ 71;
        lllllIl[25] = (7 ^ 52) ^ (139 ^ 169);
        lllllIl[26] = ((78 + 170) - 42) + 7;
        lllllIl[27] = 42 ^ 56;
        lllllIl[28] = (70 ^ 106) ^ (179 ^ 140);
        lllllIl[29] = (-8193) & 11243;
        lllllIl[30] = 24 ^ 12;
        lllllIl[31] = 4 ^ 17;
        lllllIl[32] = ((92 + 3) - 86) + 206;
        lllllIl[33] = (((96 + 116) - 192) + 156) ^ (((98 + 105) - 199) + 162);
        lllllIl[34] = 3 ^ 20;
        lllllIl[35] = (-12867) & 15351;
        lllllIl[36] = (110 ^ 88) ^ (141 ^ 163);
        lllllIl[37] = 11 ^ 18;
        lllllIl[38] = ((145 + 138) - 115) + 49;
        lllllIl[39] = (252 ^ 139) ^ (169 ^ 196);
        lllllIl[40] = (121 ^ 42) ^ (89 ^ 17);
        lllllIl[41] = (((249 ^ 138) + (115 ^ 76)) - (57 ^ 90)) + ((0 + 35) - (-44)) + 61;
        lllllIl[42] = 23 ^ 11;
    }

    public String N() {
        return this.itemName;
    }

    private static String llllIIIIl(String lllIIllIIlllIlI, String lllIIllIIlllIIl) {
        String lllIIllIIlllIlI2 = new String(Base64.getDecoder().decode(lllIIllIIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIllIIlllIII = new StringBuilder();
        char[] charArray = lllIIllIIlllIIl.toCharArray();
        int lllIIllIIllIllI = lllllIl[0];
        char[] charArray2 = lllIIllIIlllIlI2.toCharArray();
        int length = charArray2.length;
        int i2 = lllllIl[0];
        while (llllIIlII(i2, length)) {
            lllIIllIIlllIII.append((char) (charArray2[i2] ^ charArray[lllIIllIIllIllI % charArray.length]));
            "".length();
            lllIIllIIllIllI++;
            i2++;
            "".length();
            if ((-((((118 + 186) - 245) + 130) ^ (((172 + 160) - 213) + 65))) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllIIllIIlllIII);
    }

    public static aG[] values() {
        return (aG[]) $VALUES.clone();
    }

    private static boolean llllIIlIl(int i2, int i3) {
        return i2 == i3;
    }

    private static String llllIIIII(String lllIIllIlIIlIlI, String lllIIllIlIIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIllIlIIllII = Cipher.getInstance("Blowfish");
            lllIIllIlIIllII.init(lllllIl[3], secretKeySpec);
            return new String(lllIIllIlIIllII.doFinal(Base64.getDecoder().decode(lllIIllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIllIlIIlIll) {
            lllIIllIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static String lllIlllll(String lllIIllIIlIIlIl, String lllIIllIIlIIlII) {
        try {
            SecretKeySpec lllIIllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIIlIIlII.getBytes(StandardCharsets.UTF_8)), lllllIl[12]), "DES");
            Cipher lllIIllIIlIIlll = Cipher.getInstance("DES");
            lllIIllIIlIIlll.init(lllllIl[3], lllIIllIIlIlIII);
            return new String(lllIIllIIlIIlll.doFinal(Base64.getDecoder().decode(lllIIllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIllIIlIIllI) {
            lllIIllIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static void llllIIIlI() {
        lllllII = new String[lllllIl[42]];
        lllllII[lllllIl[0]] = lllIlllll("yhnuZzYL8FfsxTx78Nb8Pw==", "RTjaV");
        lllllII[lllllIl[1]] = llllIIIII("EidxgMELmjxYtMJ6Gv0OtA==", "uxXhf");
        lllllII[lllllIl[3]] = llllIIIIl("HgY5KAgdEyI2AQ==", "SGkzM");
        lllllII[lllllIl[4]] = llllIIIIl("AisGJDhlNA47MyA3GyAtKQ==", "EYoIA");
        lllllII[lllllIl[6]] = llllIIIIl("Phk5PxYnESU=", "jXkmY");
        lllllII[lllllIl[7]] = lllIlllll("29PtzxzlqOAcxUQ8wfnkKg==", "HYsTg");
        lllllII[lllllIl[9]] = lllIlllll("/qJxyw40QeI8p8Ji88KKgg==", "gXLXp");
        lllllII[lllllIl[10]] = lllIlllll("gi/7IiWcRY2B0y/1NI5N7W0uFnBrjCun", "lxmLj");
        lllllII[lllllIl[12]] = lllIlllll("yKOtnjKVVxxA1Pwdqt8tHg==", "XeuHV");
        lllllII[lllllIl[13]] = lllIlllll("uiHe2i5uVkvRszqOCEKrba8bwrBWAcgO", "IQIgJ");
        lllllII[lllllIl[15]] = llllIIIII("FqTpdMDvnbwa4TYlSYhITA==", "SmlHk");
        lllllII[lllllIl[16]] = llllIIIIl("FBkABghzHwYKFTUHCBM=", "Skikq");
        lllllII[lllllIl[18]] = lllIlllll("ILOfemYAoCqC2lpcNtet7A==", "xQfxl");
        lllllII[lllllIl[19]] = lllIlllll("z2Zy3cDJ7TAI/ldHPgEWkg==", "Ovamr");
        lllllII[lllllIl[21]] = llllIIIII("QAauAL3PqqQ=", "RPKOC");
        lllllII[lllllIl[22]] = llllIIIIl("DyELPh1oMhQyCjw8Bw==", "HSbSd");
        lllllII[lllllIl[24]] = lllIlllll("3DP1K+mUsmA=", "urYEO");
        lllllII[lllllIl[25]] = lllIlllll("+Iqszaph1yypBsVX0nhdpA==", "PZHrk");
        lllllII[lllllIl[27]] = llllIIIII("si2rtu5v1dy8NXEJdmfbqA==", "xIHJQ");
        lllllII[lllllIl[28]] = lllIlllll("dBALKwLVWj0g3QbRALIxhv0YM4rczTH1", "WEgkt");
        lllllII[lllllIl[30]] = lllIlllll("+4ALw58omiet/FHFZY7ecA==", "oaSQO");
        lllllII[lllllIl[31]] = llllIIIII("auIiEBH+0Aos59ndKYD5Zw==", "aehpq");
        lllllII[lllllIl[33]] = llllIIIII("aTnRJilGCJO2f9LevDhD1Q==", "ArarM");
        lllllII[lllllIl[34]] = llllIIIII("Izm92Uj20nvEBkIMkeNIOA==", "NRPUD");
        lllllII[lllllIl[36]] = llllIIIIl("CgIOCz4RAgocPA==", "NUOYx");
        lllllII[lllllIl[37]] = llllIIIII("BsRG8rIruX8+3AmyBu3pOBBaBvMrOMzQ", "uUvSq");
        lllllII[lllllIl[39]] = lllIlllll("w6arHN0LyVQ=", "QembU");
        lllllII[lllllIl[40]] = lllIlllll("WFIL7U1PlHiCON//zM7bJQ==", "QHjju");
    }

    public static aG valueOf(String str) {
        return (aG) Enum.valueOf(aG.class, str);
    }
}
