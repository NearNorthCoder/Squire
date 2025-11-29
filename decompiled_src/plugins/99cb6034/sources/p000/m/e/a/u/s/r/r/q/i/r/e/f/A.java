package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.A  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/A.class */
public final class A {
    private static final /* synthetic */ A[] $VALUES;
    public static final /* synthetic */ A CLOCK;
    private final /* synthetic */ String name;
    public static final /* synthetic */ A OVERVIEW;
    private final /* synthetic */ int itemID;
    public static final /* synthetic */ A FLOWER;
    public static final /* synthetic */ A HOPS;
    public static final /* synthetic */ A SPECIAL;
    public static final /* synthetic */ A ALLOTMENT;
    public static final /* synthetic */ A TREE;
    public static final /* synthetic */ A TIME_OFFSET;
    public static final /* synthetic */ A FRUIT_TREE;
    private static /* synthetic */ String[] lIlllllIIlII;
    public static final /* synthetic */ A BUSH;
    public static final /* synthetic */ A[] FARMING_RUN_TYPES;
    private static /* synthetic */ int[] lIlllllIlIIl;
    public static final /* synthetic */ A HERB;
    public static final /* synthetic */ A BIRD_HOUSE;
    public static final /* synthetic */ A GRAPE;

    private static String lllIllllIlIlII(String lllllllllllllllIlIllIIIIlIlIIlll, String lllllllllllllllIlIllIIIIlIlIIllI) {
        try {
            SecretKeySpec lllllllllllllllIlIllIIIIlIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlllllIlIIl[3], lllllllllllllllIlIllIIIIlIlIlIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIIlIlIlIII) {
            lllllllllllllllIlIllIIIIlIlIlIII.printStackTrace();
            return null;
        }
    }

    private static String lllIllllIlIIll(String lllllllllllllllIlIllIIIIllIIlIIl, String lllllllllllllllIlIllIIIIllIIlIII) {
        String lllllllllllllllIlIllIIIIllIIlIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIIIllIIIlll = new StringBuilder();
        char[] lllllllllllllllIlIllIIIIllIIIllI = lllllllllllllllIlIllIIIIllIIlIII.toCharArray();
        int lllllllllllllllIlIllIIIIllIIIlIl = lIlllllIlIIl[0];
        char[] charArray = lllllllllllllllIlIllIIIIllIIlIIl2.toCharArray();
        int length = charArray.length;
        int i = lIlllllIlIIl[0];
        while (lllIlllllIIlIl(i, length)) {
            lllllllllllllllIlIllIIIIllIIIlll.append((char) (charArray[i] ^ lllllllllllllllIlIllIIIIllIIIllI[lllllllllllllllIlIllIIIIllIIIlIl % lllllllllllllllIlIllIIIIllIIIllI.length]));
            "".length();
            lllllllllllllllIlIllIIIIllIIIlIl++;
            i++;
            "".length();
            if ("   ".length() < ((61 ^ 34) & ((160 ^ 191) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIIIIllIIIlll);
    }

    public String ac() {
        return this.name;
    }

    static {
        lllIlllllIIlII();
        lllIllllIlllll();
        OVERVIEW = new A(lIlllllIIlII[lIlllllIlIIl[0]], lIlllllIlIIl[0], lIlllllIIlII[lIlllllIlIIl[1]], lIlllllIlIIl[2]);
        CLOCK = new A(lIlllllIIlII[lIlllllIlIIl[3]], lIlllllIlIIl[1], lIlllllIIlII[lIlllllIlIIl[4]], lIlllllIlIIl[5]);
        BIRD_HOUSE = new A(lIlllllIIlII[lIlllllIlIIl[6]], lIlllllIlIIl[3], lIlllllIIlII[lIlllllIlIIl[7]], lIlllllIlIIl[8]);
        ALLOTMENT = new A(lIlllllIIlII[lIlllllIlIIl[9]], lIlllllIlIIl[4], lIlllllIIlII[lIlllllIlIIl[10]], lIlllllIlIIl[11]);
        FLOWER = new A(lIlllllIIlII[lIlllllIlIIl[12]], lIlllllIlIIl[6], lIlllllIIlII[lIlllllIlIIl[13]], lIlllllIlIIl[14]);
        HERB = new A(lIlllllIIlII[lIlllllIlIIl[15]], lIlllllIlIIl[7], lIlllllIIlII[lIlllllIlIIl[16]], lIlllllIlIIl[17]);
        TREE = new A(lIlllllIIlII[lIlllllIlIIl[18]], lIlllllIlIIl[9], lIlllllIIlII[lIlllllIlIIl[19]], lIlllllIlIIl[20]);
        FRUIT_TREE = new A(lIlllllIIlII[lIlllllIlIIl[21]], lIlllllIlIIl[10], lIlllllIIlII[lIlllllIlIIl[22]], lIlllllIlIIl[23]);
        HOPS = new A(lIlllllIIlII[lIlllllIlIIl[24]], lIlllllIlIIl[12], lIlllllIIlII[lIlllllIlIIl[25]], lIlllllIlIIl[26]);
        BUSH = new A(lIlllllIIlII[lIlllllIlIIl[27]], lIlllllIlIIl[13], lIlllllIIlII[lIlllllIlIIl[28]], lIlllllIlIIl[29]);
        GRAPE = new A(lIlllllIIlII[lIlllllIlIIl[30]], lIlllllIlIIl[15], lIlllllIIlII[lIlllllIlIIl[31]], lIlllllIlIIl[32]);
        SPECIAL = new A(lIlllllIIlII[lIlllllIlIIl[33]], lIlllllIlIIl[16], lIlllllIIlII[lIlllllIlIIl[34]], lIlllllIlIIl[35]);
        TIME_OFFSET = new A(lIlllllIIlII[lIlllllIlIIl[36]], lIlllllIlIIl[18], lIlllllIIlII[lIlllllIlIIl[37]], lIlllllIlIIl[38]);
        A[] aArr = new A[lIlllllIlIIl[19]];
        aArr[lIlllllIlIIl[0]] = OVERVIEW;
        aArr[lIlllllIlIIl[1]] = CLOCK;
        aArr[lIlllllIlIIl[3]] = BIRD_HOUSE;
        aArr[lIlllllIlIIl[4]] = ALLOTMENT;
        aArr[lIlllllIlIIl[6]] = FLOWER;
        aArr[lIlllllIlIIl[7]] = HERB;
        aArr[lIlllllIlIIl[9]] = TREE;
        aArr[lIlllllIlIIl[10]] = FRUIT_TREE;
        aArr[lIlllllIlIIl[12]] = HOPS;
        aArr[lIlllllIlIIl[13]] = BUSH;
        aArr[lIlllllIlIIl[15]] = GRAPE;
        aArr[lIlllllIlIIl[16]] = SPECIAL;
        aArr[lIlllllIlIIl[18]] = TIME_OFFSET;
        $VALUES = aArr;
        A[] aArr2 = new A[lIlllllIlIIl[13]];
        aArr2[lIlllllIlIIl[0]] = HERB;
        aArr2[lIlllllIlIIl[1]] = TREE;
        aArr2[lIlllllIlIIl[3]] = FRUIT_TREE;
        aArr2[lIlllllIlIIl[4]] = SPECIAL;
        aArr2[lIlllllIlIIl[6]] = FLOWER;
        aArr2[lIlllllIlIIl[7]] = ALLOTMENT;
        aArr2[lIlllllIlIIl[9]] = BUSH;
        aArr2[lIlllllIlIIl[10]] = GRAPE;
        aArr2[lIlllllIlIIl[12]] = HOPS;
        FARMING_RUN_TYPES = aArr2;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    private A(String str, int i, String str2, int i2) {
        this.name = str2;
        this.itemID = i2;
    }

    private static void lllIllllIlllll() {
        lIlllllIIlII = new String[lIlllllIlIIl[39]];
        lIlllllIIlII[lIlllllIlIIl[0]] = lllIllllIlIIll("IickBDIkNDY=", "mqaVd");
        lIlllllIIlII[lIlllllIlIIl[1]] = lllIllllIlIIll("Bw8gIhchHDI=", "HyEPa");
        lIlllllIIlII[lIlllllIlIIl[3]] = lllIllllIlIlII("eID3JvcNXeU=", "JYKsd");
        lIlllllIIlII[lIlllllIlIIl[4]] = lllIllllIlIlII("jhz3v98WdG5RMJCfu0C3GP3d2GstzPk/", "pXxWM");
        lIlllllIIlII[lIlllllIlIIl[6]] = lllIllllIlIIll("ERMKCQkbFQ0eEw==", "SZXMV");
        lIlllllIIlII[lIlllllIlIIl[7]] = lllIllllIlIIll("BTAiMHMPNiUnNjQ=", "GYPTS");
        lIlllllIIlII[lIlllllIlIIl[9]] = lllIllllIlIlll("RFP2ULQKL/gKAI6H5UE/vg==", "IsYHm");
        lIlllllIIlII[lIlllllIlIIl[10]] = lllIllllIlIIll("Fz4gAyY7NyIYcgYzOA86MyE=", "VRLlR");
        lIlllllIIlII[lIlllllIlIIl[12]] = lllIllllIlIlll("OHRrgUFhLUA=", "oXBPO");
        lIlllllIIlII[lIlllllIlIIl[13]] = lllIllllIlIIll("BzknEzQzdRgFJSI9LRc=", "AUHdQ");
        lIlllllIIlII[lIlllllIlIIl[15]] = lllIllllIlIIll("DysKMA==", "GnXrp");
        lIlllllIIlII[lIlllllIlIIl[16]] = lllIllllIlIlII("UprZW0xlpnC7DeSeZyITZA==", "zUKOi");
        lIlllllIIlII[lIlllllIlIIl[18]] = lllIllllIlIlII("7Bof4cbRxs4=", "mWtsv");
        lIlllllIIlII[lIlllllIlIIl[19]] = lllIllllIlIlII("wdtqUEFR/zRhaPj5DQSOGA==", "mLMdV");
        lIlllllIIlII[lIlllllIlIIl[21]] = lllIllllIlIlII("KxFsNglv13J8saEgbWtr0A==", "fHunS");
        lIlllllIIlII[lIlllllIlIIl[22]] = lllIllllIlIlll("NHLHc2zd0BUhS4Iw+Q1yfWg9CJDKcJ3m", "QlTwv");
        lIlllllIIlII[lIlllllIlIIl[24]] = lllIllllIlIlII("iQ1l+FkOtqM=", "WgBWy");
        lIlllllIIlII[lIlllllIlIIl[25]] = lllIllllIlIIll("DAc7B0sUCT8XAyEb", "DhKtk");
        lIlllllIIlII[lIlllllIlIIl[27]] = lllIllllIlIlll("KZqiUYm4SsA=", "pSFZp");
        lIlllllIIlII[lIlllllIlIIl[28]] = lllIllllIlIlII("8Hyd7bS7bGq5KpIAum4vVw==", "jBMGd");
        lIlllllIIlII[lIlllllIlIIl[30]] = lllIllllIlIIll("KBAOOy0=", "oBOkh");
        lIlllllIIlII[lIlllllIlIIl[31]] = lllIllllIlIlII("PJyB7DNhyg/g4xRzN+wjgQ==", "wdcoK");
        lIlllllIIlII[lIlllllIlIIl[33]] = lllIllllIlIIll("FREvDgoHDQ==", "FAjMC");
        lIlllllIIlII[lIlllllIlIIl[34]] = lllIllllIlIlll("I8GthxPDIBjAamGKES25iA==", "fZULU");
        lIlllllIIlII[lIlllllIlIIl[36]] = lllIllllIlIlll("SxgERaI1zWUOSQ8erFLogg==", "qtRRF");
        lIlllllIIlII[lIlllllIlIIl[37]] = lllIllllIlIlII("9jVMHHDckBod/9SFDpsrb3IGmhEWULJk", "ChDCL");
    }

    private static boolean lllIlllllIIlIl(int i, int i2) {
        return i < i2;
    }

    private static void lllIlllllIIlII() {
        lIlllllIlIIl = new int[40];
        lIlllllIlIIl[0] = (154 ^ 138) & ((43 ^ 59) ^ (-1));
        lIlllllIlIIl[1] = " ".length();
        lIlllllIlIIl[2] = (-((-1057) & 3253)) & (-65) & 24311;
        lIlllllIlIIl[3] = "  ".length();
        lIlllllIlIIl[4] = "   ".length();
        lIlllllIlIIl[5] = (-((-5775) & 30719)) & (-1) & 27519;
        lIlllllIlIIl[6] = 171 ^ 175;
        lIlllllIlIIl[7] = (37 ^ 127) ^ (243 ^ 172);
        lIlllllIlIIl[8] = (-((-9233) & 12277)) & (-1) & 24559;
        lIlllllIlIIl[9] = 113 ^ 119;
        lIlllllIlIIl[10] = (((83 + 173) - 71) + 4) ^ (((51 + 158) - 38) + 15);
        lIlllllIlIIl[11] = (-((-1791) & 18175)) & (-81) & 18429;
        lIlllllIlIIl[12] = (207 ^ 167) ^ (4 ^ 100);
        lIlllllIlIIl[13] = 59 ^ 50;
        lIlllllIlIIl[14] = (-26114) & 28575;
        lIlllllIlIIl[15] = (90 ^ 96) ^ (13 ^ 61);
        lIlllllIlIIl[16] = (29 ^ 1) ^ (89 ^ 78);
        lIlllllIlIIl[17] = (((115 ^ 1) + (((26 + 120) - 114) + 102)) - (19 ^ 43)) + (182 ^ 185);
        lIlllllIlIIl[18] = 142 ^ 130;
        lIlllllIlIIl[19] = (14 ^ 54) ^ (140 ^ 185);
        lIlllllIlIIl[20] = (-((-561) & 10805)) & (-20993) & 32751;
        lIlllllIlIIl[21] = 35 ^ 45;
        lIlllllIlIIl[22] = (((114 + 61) - 34) + 46) ^ (((91 + 40) - (-30)) + 19);
        lIlllllIlIIl[23] = (-21657) & 23770;
        lIlllllIlIIl[24] = 187 ^ 171;
        lIlllllIlIIl[25] = 209 ^ 192;
        lIlllllIlIIl[26] = (-((-1430) & 11679)) & (-1) & 16255;
        lIlllllIlIIl[27] = 107 ^ 121;
        lIlllllIlIIl[28] = 25 ^ 10;
        lIlllllIlIIl[29] = (-10334) & 16351;
        lIlllllIlIIl[30] = 10 ^ 30;
        lIlllllIlIIl[31] = (((145 + 34) - 139) + 118) ^ (((44 + 131) - 88) + 52);
        lIlllllIlIIl[32] = (-24593) & 26579;
        lIlllllIlIIl[33] = (185 ^ 142) ^ (157 ^ 188);
        lIlllllIlIIl[34] = (98 ^ 51) ^ (4 ^ 66);
        lIlllllIlIIl[35] = (-((-49) & 18619)) & (-1) & 24574;
        lIlllllIlIIl[36] = 44 ^ 52;
        lIlllllIlIIl[37] = 160 ^ 185;
        lIlllllIlIIl[38] = (-((-16497) & 25469)) & (-33) & 14335;
        lIlllllIlIIl[39] = (((146 + 0) - (-8)) + 9) ^ (((41 + 112) - 74) + 106);
    }

    public int au() {
        return this.itemID;
    }

    private static String lllIllllIlIlll(String lllllllllllllllIlIllIIIIlIllIlII, String lllllllllllllllIlIllIIIIlIllIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIlIllIIll.getBytes(StandardCharsets.UTF_8)), lIlllllIlIIl[12]), "DES");
            Cipher lllllllllllllllIlIllIIIIlIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIlIllIIIIlIllIllI.init(lIlllllIlIIl[3], secretKeySpec);
            return new String(lllllllllllllllIlIllIIIIlIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIllIIIIlIllIlIl) {
            lllllllllllllllIlIllIIIIlIllIlIl.printStackTrace();
            return null;
        }
    }

    public static A[] values() {
        return (A[]) $VALUES.clone();
    }
}
