/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import i.i.b.s.c.q.r.s.s.-.u.a.e.aG;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class aI
extends Enum<aI> {
    private static /* synthetic */ String[] llIIIlII;
    public static final /* synthetic */ /* enum */ aI WATER_RUNE;
    private static /* synthetic */ int[] llIIIlll;
    public static final /* synthetic */ /* enum */ aI EARTH_RUNE;
    public static final /* synthetic */ /* enum */ aI MIND_RUNE;
    private final /* synthetic */ String itemName;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ aI AIR_RUNE;
    public static final /* synthetic */ /* enum */ aI DEATH_RUNE;
    public static final /* synthetic */ /* enum */ aI BODY_RUNE;
    private static final /* synthetic */ aI[] $VALUES;
    public static final /* synthetic */ /* enum */ aI FIRE_RUNE;
    public static final /* synthetic */ /* enum */ aI COSMIC_RUNE;
    public static final /* synthetic */ /* enum */ aI NATURE_RUNE;
    public static final /* synthetic */ /* enum */ aI CHAOS_RUNE;
    public static final /* synthetic */ /* enum */ aI LAW_RUNE;

    private static String lIlIllIlIl(String llIllIllIIIIlll, String llIllIllIIIIllI) {
        try {
            SecretKeySpec llIllIllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIllIIIlIIl = Cipher.getInstance("Blowfish");
            llIllIllIIIlIIl.init(llIIIlll[3], llIllIllIIIlIlI);
            return new String(llIllIllIIIlIIl.doFinal(Base64.getDecoder().decode(llIllIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIllIIIlIII) {
            llIllIllIIIlIII.printStackTrace();
            return null;
        }
    }

    public int P() {
        return this.id;
    }

    private static void lIlIlllIIl() {
        llIIIlII = new String[llIIIlll[33]];
        aI.llIIIlII[aI.llIIIlll[0]] = aI.lIlIlIllll("NDkhDhEgPjY=", "upsQC");
        aI.llIIIlII[aI.llIIIlll[1]] = aI.lIlIllIIII("8ypdASy3SNv/0yLUaOCUIw==", "SoflV");
        aI.llIIIlII[aI.llIIIlll[3]] = aI.lIlIlIllll("Bj8dCTUZIx0I", "KvSMj");
        aI.llIIIlII[aI.llIIIlll[4]] = aI.lIlIlIllll("GjABCWElLAEI", "WYomA");
        aI.llIIIlII[aI.llIIIlll[6]] = aI.lIlIllIIII("c9QUw2eV7NWPjMcVNc0pdg==", "jxDQB");
        aI.llIIIlII[aI.llIIIlll[7]] = aI.lIlIllIIII("AntX6Y0AY68rHQwSnZT93A==", "ZaoKl");
        aI.llIIIlII[aI.llIIIlll[9]] = aI.lIlIllIlIl("OlL56+xw+9mnVgs+aeTJjw==", "hMEvP");
        aI.llIIIlII[aI.llIIIlll[10]] = aI.lIlIllIIII("hVU/BqaAzCljueZuxH083Q==", "hioyb");
        aI.llIIIlII[aI.llIIIlll[12]] = aI.lIlIlIllll("KTw1LSg9ICkt", "oughw");
        aI.llIIIlII[aI.llIIIlll[13]] = aI.lIlIllIlIl("gVesYqIh8rEMRIa6sv8nEA==", "aitgf");
        aI.llIIIlII[aI.llIIIlll[15]] = aI.lIlIllIlIl("v3/Vkt9s8Qcswi+JHfKPrQ==", "eddTr");
        aI.llIIIlII[aI.llIIIlll[16]] = aI.lIlIllIlIl("DEDK+3GOrU++SiDdcCcWrw==", "ANLzL");
        aI.llIIIlII[aI.llIIIlll[18]] = aI.lIlIllIlIl("Z/iVvKHR6V3eflD8aWy9jw==", "FBPsW");
        aI.llIIIlII[aI.llIIIlll[19]] = aI.lIlIllIIII("BXGFw0CVXGV3cD7ApN/m/g==", "KQiVE");
        aI.llIIIlII[aI.llIIIlll[21]] = aI.lIlIlIllll("LgsOOTgyERo4Lg==", "mCOvk");
        aI.llIIIlII[aI.llIIIlll[22]] = aI.lIlIlIllll("NzozCBRUICcJAg==", "tRRgg");
        aI.llIIIlII[aI.llIIIlll[24]] = aI.lIlIllIlIl("Efwzcmqrc7t1ds0GRTqUqw==", "Ndtgu");
        aI.llIIIlII[aI.llIIIlll[25]] = aI.lIlIllIlIl("HXzmv882468p3AsWyzmiqQ==", "BqNWZ");
        aI.llIIIlII[aI.llIIIlll[27]] = aI.lIlIlIllll("PgQSCxknCwA=", "rEETK");
        aI.llIIIlII[aI.llIIIlll[28]] = aI.lIlIllIlIl("MhGLteYPEl14AxD/J69rVw==", "TacMx");
        aI.llIIIlII[aI.llIIIlll[30]] = aI.lIlIlIllll("AikXMwQZPgMpCQ==", "FlVgL");
        aI.llIIIlII[aI.llIIIlll[31]] = aI.lIlIllIlIl("kTEYoUevvCYOybGC4u86tg==", "xgwbD");
    }

    private static String lIlIlIllll(String llIllIlIlllIlll, String llIllIlIlllIIIl) {
        llIllIlIlllIlll = new String(Base64.getDecoder().decode(llIllIlIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIlIlllIlIl = new StringBuilder();
        char[] llIllIlIlllIlII = llIllIlIlllIIIl.toCharArray();
        int llIllIlIlllIIll = llIIIlll[0];
        char[] llIllIlIllIllIl = llIllIlIlllIlll.toCharArray();
        int llIllIlIllIllII = llIllIlIllIllIl.length;
        int llIllIlIllIlIll = llIIIlll[0];
        while (aI.lIlIlllIll(llIllIlIllIlIll, llIllIlIllIllII)) {
            char llIllIlIllllIII = llIllIlIllIllIl[llIllIlIllIlIll];
            llIllIlIlllIlIl.append((char)(llIllIlIllllIII ^ llIllIlIlllIlII[llIllIlIlllIIll % llIllIlIlllIlII.length]));
            "".length();
            ++llIllIlIlllIIll;
            ++llIllIlIllIlIll;
            "".length();
            if ((0x6E ^ 0x6A) > "  ".length()) continue;
            return null;
        }
        return String.valueOf(llIllIlIlllIlIl);
    }

    static {
        aI.lIlIlllIlI();
        aI.lIlIlllIIl();
        AIR_RUNE = new aI(llIIIlII[llIIIlll[1]], llIIIlll[2]);
        MIND_RUNE = new aI(llIIIlII[llIIIlll[4]], llIIIlll[5]);
        WATER_RUNE = new aI(llIIIlII[llIIIlll[7]], llIIIlll[8]);
        EARTH_RUNE = new aI(llIIIlII[llIIIlll[10]], llIIIlll[11]);
        FIRE_RUNE = new aI(llIIIlII[llIIIlll[13]], llIIIlll[14]);
        BODY_RUNE = new aI(llIIIlII[llIIIlll[16]], llIIIlll[17]);
        COSMIC_RUNE = new aI(llIIIlII[llIIIlll[19]], llIIIlll[20]);
        CHAOS_RUNE = new aI(llIIIlII[llIIIlll[22]], llIIIlll[23]);
        NATURE_RUNE = new aI(llIIIlII[llIIIlll[25]], llIIIlll[26]);
        LAW_RUNE = new aI(llIIIlII[llIIIlll[28]], llIIIlll[29]);
        DEATH_RUNE = new aI(llIIIlII[llIIIlll[31]], llIIIlll[32]);
        aI[] aIArray = new aI[llIIIlll[16]];
        aIArray[aI.llIIIlll[0]] = AIR_RUNE;
        aIArray[aI.llIIIlll[1]] = MIND_RUNE;
        aIArray[aI.llIIIlll[3]] = WATER_RUNE;
        aIArray[aI.llIIIlll[4]] = EARTH_RUNE;
        aIArray[aI.llIIIlll[6]] = FIRE_RUNE;
        aIArray[aI.llIIIlll[7]] = BODY_RUNE;
        aIArray[aI.llIIIlll[9]] = COSMIC_RUNE;
        aIArray[aI.llIIIlll[10]] = CHAOS_RUNE;
        aIArray[aI.llIIIlll[12]] = NATURE_RUNE;
        aIArray[aI.llIIIlll[13]] = LAW_RUNE;
        aIArray[aI.llIIIlll[15]] = DEATH_RUNE;
        $VALUES = aIArray;
    }

    private static void lIlIlllIlI() {
        llIIIlll = new int[34];
        aI.llIIIlll[0] = (0x33 ^ 0xC ^ (0x61 ^ 0x65)) & (37 + 134 - 131 + 118 ^ 108 + 113 - 185 + 129 ^ -" ".length());
        aI.llIIIlll[1] = " ".length();
        aI.llIIIlll[2] = -(0xFFFFBCF7 & 0x5F5A) & (0xFFFFDE7D & 0x3FFF);
        aI.llIIIlll[3] = "  ".length();
        aI.llIIIlll[4] = "   ".length();
        aI.llIIIlll[5] = -(0xFFFFEDD2 & Short.MAX_VALUE) & (0xFFFFFFFF & 0x6FFF);
        aI.llIIIlll[6] = 0x53 ^ 0x57;
        aI.llIIIlll[7] = 54 + 162 - 135 + 101 ^ 49 + 14 - 17 + 133;
        aI.llIIIlll[8] = -(0xFFFFFC71 & 0x3B9F) & (0xFFFFBBBB & 0x7E7F);
        aI.llIIIlll[9] = 0x95 ^ 0x93;
        aI.llIIIlll[10] = 108 + 124 - 166 + 109 ^ 35 + 34 - -85 + 14;
        aI.llIIIlll[11] = 0xFFFFB3BF & 0x4E6D;
        aI.llIIIlll[12] = 0x88 ^ 0xB3 ^ (0x57 ^ 0x64);
        aI.llIIIlll[13] = 0x78 ^ 0x74 ^ (0x83 ^ 0x86);
        aI.llIIIlll[14] = -(0xFFFF9DD5 & 0x67BF) & (0xFFFFA7FE & 0x5FBF);
        aI.llIIIlll[15] = 0xA5 ^ 0xAF;
        aI.llIIIlll[16] = 0xB ^ 0x6C ^ (0x37 ^ 0x5B);
        aI.llIIIlll[17] = 0xFFFFAE7F & 0x53AF;
        aI.llIIIlll[18] = 0x38 ^ 0x5C ^ (0xF1 ^ 0x99);
        aI.llIIIlll[19] = 0x74 ^ 0x4E ^ (0xBB ^ 0x8C);
        aI.llIIIlll[20] = 0xFFFFFBFE & 0x635;
        aI.llIIIlll[21] = 0x23 ^ 0x17 ^ (0x84 ^ 0xBE);
        aI.llIIIlll[22] = 118 + 92 - 79 + 43 ^ 151 + 5 - -2 + 3;
        aI.llIIIlll[23] = -(0xFFFFBFE6 & 0x6DDF) & (0xFFFFAFF7 & Short.MAX_VALUE);
        aI.llIIIlll[24] = 0xA9 ^ 0xA3 ^ (0x90 ^ 0x8A);
        aI.llIIIlll[25] = 91 + 34 - 86 + 148 ^ 86 + 3 - -60 + 21;
        aI.llIIIlll[26] = 0xFFFFFF7F & 0x2B1;
        aI.llIIIlll[27] = 0x22 ^ 0x78 ^ (0xDC ^ 0x94);
        aI.llIIIlll[28] = 8 ^ 0x1B;
        aI.llIIIlll[29] = 0xFFFFF7BB & 0xA77;
        aI.llIIIlll[30] = 37 + 74 - -8 + 18 ^ 97 + 87 - 123 + 96;
        aI.llIIIlll[31] = 6 ^ 0x13;
        aI.llIIIlll[32] = 0xFFFFB37A & 0x4EB5;
        aI.llIIIlll[33] = 141 + 71 - 14 + 13 ^ 124 + 83 - 141 + 131;
    }

    public static aI valueOf(String string) {
        return Enum.valueOf(aI.class, string);
    }

    private static boolean lIlIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    public static aI[] values() {
        return (aI[])$VALUES.clone();
    }

    private static String lIlIllIIII(String llIllIlIllIIIlI, String llIllIlIllIIIIl) {
        try {
            SecretKeySpec llIllIlIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), llIIIlll[12]), "DES");
            Cipher llIllIlIllIIlII = Cipher.getInstance("DES");
            llIllIlIllIIlII.init(llIIIlll[3], llIllIlIllIIlIl);
            return new String(llIllIlIllIIlII.doFinal(Base64.getDecoder().decode(llIllIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIllIlIllIIIll) {
            llIllIlIllIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllII(int n2, int n3) {
        return n2 == n3;
    }

    private aI(String string2, int n3) {
        this.itemName = string2;
        this.id = n3;
    }

    public String N() {
        return this.itemName;
    }

    /*
     * WARNING - void declaration
     */
    public static aG x(int n2) {
        void llIllIllIIlIIIl;
        aG[] aGArray = aG.values();
        int n3 = aGArray.length;
        int llIllIllIIlIIII = llIIIlll[0];
        while (aI.lIlIlllIll(llIllIllIIlIIII, (int)llIllIllIIlIIIl)) {
            int llIllIllIIlIIll;
            void llIllIllIIlIIlI;
            void llIllIllIIIllll = llIllIllIIlIIlI[llIllIllIIlIIII];
            if (aI.lIlIllllII(llIllIllIIIllll.P(), llIllIllIIlIIll)) {
                return llIllIllIIIllll;
            }
            ++llIllIllIIlIIII;
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return null;
    }
}

