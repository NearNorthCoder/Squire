package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aI  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aI.class */
public final class aI {
    private static /* synthetic */ String[] llIIIlII;
    public static final /* synthetic */ aI WATER_RUNE;
    private static /* synthetic */ int[] llIIIlll;
    public static final /* synthetic */ aI EARTH_RUNE;
    public static final /* synthetic */ aI MIND_RUNE;
    private final /* synthetic */ String itemName;
    private final /* synthetic */ int id;
    public static final /* synthetic */ aI AIR_RUNE;
    public static final /* synthetic */ aI DEATH_RUNE;
    public static final /* synthetic */ aI BODY_RUNE;
    private static final /* synthetic */ aI[] $VALUES;
    public static final /* synthetic */ aI FIRE_RUNE;
    public static final /* synthetic */ aI COSMIC_RUNE;
    public static final /* synthetic */ aI NATURE_RUNE;
    public static final /* synthetic */ aI CHAOS_RUNE;
    public static final /* synthetic */ aI LAW_RUNE;

    private static String lIlIllIlIl(String llIllIllIIIIlll, String llIllIllIIIIlII) {
        try {
            SecretKeySpec llIllIllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIllIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIllIllIIIlIIl = Cipher.getInstance("Blowfish");
            llIllIllIIIlIIl.init(llIIIlll[3], llIllIllIIIlIlI);
            return new String(llIllIllIIIlIIl.doFinal(Base64.getDecoder().decode(llIllIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIllIIIlIII) {
            llIllIllIIIlIII.printStackTrace();
            return null;
        }
    }

    public int P() {
        return this.id;
    }

    private static void lIlIlllIIl() {
        llIIIlII = new String[llIIIlll[33]];
        llIIIlII[llIIIlll[0]] = lIlIlIllll("NDkhDhEgPjY=", "upsQC");
        llIIIlII[llIIIlll[1]] = lIlIllIIII("8ypdASy3SNv/0yLUaOCUIw==", "SoflV");
        llIIIlII[llIIIlll[3]] = lIlIlIllll("Bj8dCTUZIx0I", "KvSMj");
        llIIIlII[llIIIlll[4]] = lIlIlIllll("GjABCWElLAEI", "WYomA");
        llIIIlII[llIIIlll[6]] = lIlIllIIII("c9QUw2eV7NWPjMcVNc0pdg==", "jxDQB");
        llIIIlII[llIIIlll[7]] = lIlIllIIII("AntX6Y0AY68rHQwSnZT93A==", "ZaoKl");
        llIIIlII[llIIIlll[9]] = lIlIllIlIl("OlL56+xw+9mnVgs+aeTJjw==", "hMEvP");
        llIIIlII[llIIIlll[10]] = lIlIllIIII("hVU/BqaAzCljueZuxH083Q==", "hioyb");
        llIIIlII[llIIIlll[12]] = lIlIlIllll("KTw1LSg9ICkt", "oughw");
        llIIIlII[llIIIlll[13]] = lIlIllIlIl("gVesYqIh8rEMRIa6sv8nEA==", "aitgf");
        llIIIlII[llIIIlll[15]] = lIlIllIlIl("v3/Vkt9s8Qcswi+JHfKPrQ==", "eddTr");
        llIIIlII[llIIIlll[16]] = lIlIllIlIl("DEDK+3GOrU++SiDdcCcWrw==", "ANLzL");
        llIIIlII[llIIIlll[18]] = lIlIllIlIl("Z/iVvKHR6V3eflD8aWy9jw==", "FBPsW");
        llIIIlII[llIIIlll[19]] = lIlIllIIII("BXGFw0CVXGV3cD7ApN/m/g==", "KQiVE");
        llIIIlII[llIIIlll[21]] = lIlIlIllll("LgsOOTgyERo4Lg==", "mCOvk");
        llIIIlII[llIIIlll[22]] = lIlIlIllll("NzozCBRUICcJAg==", "tRRgg");
        llIIIlII[llIIIlll[24]] = lIlIllIlIl("Efwzcmqrc7t1ds0GRTqUqw==", "Ndtgu");
        llIIIlII[llIIIlll[25]] = lIlIllIlIl("HXzmv882468p3AsWyzmiqQ==", "BqNWZ");
        llIIIlII[llIIIlll[27]] = lIlIlIllll("PgQSCxknCwA=", "rEETK");
        llIIIlII[llIIIlll[28]] = lIlIllIlIl("MhGLteYPEl14AxD/J69rVw==", "TacMx");
        llIIIlII[llIIIlll[30]] = lIlIlIllll("AikXMwQZPgMpCQ==", "FlVgL");
        llIIIlII[llIIIlll[31]] = lIlIllIlIl("kTEYoUevvCYOybGC4u86tg==", "xgwbD");
    }

    private static String lIlIlIllll(String llIllIlIlllIIlI, String llIllIlIlllIllI) {
        String llIllIlIlllIIlI2 = new String(Base64.getDecoder().decode(llIllIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIllIlIlllIllI.toCharArray();
        int llIllIlIlllIIll = llIIIlll[0];
        char[] charArray2 = llIllIlIlllIIlI2.toCharArray();
        int length = charArray2.length;
        int i2 = llIIIlll[0];
        while (lIlIlllIll(i2, length)) {
            sb.append((char) (charArray2[i2] ^ charArray[llIllIlIlllIIll % charArray.length]));
            "".length();
            llIllIlIlllIIll++;
            i2++;
            "".length();
            if ((110 ^ 106) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIlIlllIlI();
        lIlIlllIIl();
        AIR_RUNE = new aI(llIIIlII[llIIIlll[0]], llIIIlll[0], llIIIlII[llIIIlll[1]], llIIIlll[2]);
        MIND_RUNE = new aI(llIIIlII[llIIIlll[3]], llIIIlll[1], llIIIlII[llIIIlll[4]], llIIIlll[5]);
        WATER_RUNE = new aI(llIIIlII[llIIIlll[6]], llIIIlll[3], llIIIlII[llIIIlll[7]], llIIIlll[8]);
        EARTH_RUNE = new aI(llIIIlII[llIIIlll[9]], llIIIlll[4], llIIIlII[llIIIlll[10]], llIIIlll[11]);
        FIRE_RUNE = new aI(llIIIlII[llIIIlll[12]], llIIIlll[6], llIIIlII[llIIIlll[13]], llIIIlll[14]);
        BODY_RUNE = new aI(llIIIlII[llIIIlll[15]], llIIIlll[7], llIIIlII[llIIIlll[16]], llIIIlll[17]);
        COSMIC_RUNE = new aI(llIIIlII[llIIIlll[18]], llIIIlll[9], llIIIlII[llIIIlll[19]], llIIIlll[20]);
        CHAOS_RUNE = new aI(llIIIlII[llIIIlll[21]], llIIIlll[10], llIIIlII[llIIIlll[22]], llIIIlll[23]);
        NATURE_RUNE = new aI(llIIIlII[llIIIlll[24]], llIIIlll[12], llIIIlII[llIIIlll[25]], llIIIlll[26]);
        LAW_RUNE = new aI(llIIIlII[llIIIlll[27]], llIIIlll[13], llIIIlII[llIIIlll[28]], llIIIlll[29]);
        DEATH_RUNE = new aI(llIIIlII[llIIIlll[30]], llIIIlll[15], llIIIlII[llIIIlll[31]], llIIIlll[32]);
        aI[] aIVarArr = new aI[llIIIlll[16]];
        aIVarArr[llIIIlll[0]] = AIR_RUNE;
        aIVarArr[llIIIlll[1]] = MIND_RUNE;
        aIVarArr[llIIIlll[3]] = WATER_RUNE;
        aIVarArr[llIIIlll[4]] = EARTH_RUNE;
        aIVarArr[llIIIlll[6]] = FIRE_RUNE;
        aIVarArr[llIIIlll[7]] = BODY_RUNE;
        aIVarArr[llIIIlll[9]] = COSMIC_RUNE;
        aIVarArr[llIIIlll[10]] = CHAOS_RUNE;
        aIVarArr[llIIIlll[12]] = NATURE_RUNE;
        aIVarArr[llIIIlll[13]] = LAW_RUNE;
        aIVarArr[llIIIlll[15]] = DEATH_RUNE;
        $VALUES = aIVarArr;
    }

    private static void lIlIlllIlI() {
        llIIIlll = new int[34];
        llIIIlll[0] = ((51 ^ 12) ^ (97 ^ 101)) & (((((37 + 134) - 131) + 118) ^ (((108 + 113) - 185) + 129)) ^ (-" ".length()));
        llIIIlll[1] = " ".length();
        llIIIlll[2] = (-((-17161) & 24410)) & (-8579) & 16383;
        llIIIlll[3] = "  ".length();
        llIIIlll[4] = "   ".length();
        llIIIlll[5] = (-((-4654) & 32767)) & (-1) & 28671;
        llIIIlll[6] = 83 ^ 87;
        llIIIlll[7] = (((54 + 162) - 135) + 101) ^ (((49 + 14) - 17) + 133);
        llIIIlll[8] = (-((-911) & 15263)) & (-17477) & 32383;
        llIIIlll[9] = 149 ^ 147;
        llIIIlll[10] = (((108 + 124) - 166) + 109) ^ (((35 + 34) - (-85)) + 14);
        llIIIlll[11] = (-19521) & 20077;
        llIIIlll[12] = (136 ^ 179) ^ (87 ^ 100);
        llIIIlll[13] = (120 ^ 116) ^ (131 ^ 134);
        llIIIlll[14] = (-((-25131) & 26559)) & (-22530) & 24511;
        llIIIlll[15] = 165 ^ 175;
        llIIIlll[16] = (11 ^ 108) ^ (55 ^ 91);
        llIIIlll[17] = (-20865) & 21423;
        llIIIlll[18] = (56 ^ 92) ^ (241 ^ 153);
        llIIIlll[19] = (116 ^ 78) ^ (187 ^ 140);
        llIIIlll[20] = (-1026) & 1589;
        llIIIlll[21] = (35 ^ 23) ^ (132 ^ 190);
        llIIIlll[22] = (((118 + 92) - 79) + 43) ^ (((151 + 5) - (-2)) + 3);
        llIIIlll[23] = (-((-16410) & 28127)) & (-20489) & 32767;
        llIIIlll[24] = (169 ^ 163) ^ (144 ^ 138);
        llIIIlll[25] = (((91 + 34) - 86) + 148) ^ (((86 + 3) - (-60)) + 21);
        llIIIlll[26] = (-129) & 689;
        llIIIlll[27] = (34 ^ 120) ^ (220 ^ 148);
        llIIIlll[28] = 8 ^ 27;
        llIIIlll[29] = (-2117) & 2679;
        llIIIlll[30] = (((37 + 74) - (-8)) + 18) ^ (((97 + 87) - 123) + 96);
        llIIIlll[31] = 6 ^ 19;
        llIIIlll[32] = (-19590) & 20149;
        llIIIlll[33] = (((141 + 71) - 14) + 13) ^ (((124 + 83) - 141) + 131);
    }

    public static aI valueOf(String str) {
        return (aI) Enum.valueOf(aI.class, str);
    }

    private static boolean lIlIlllIll(int i2, int i3) {
        return i2 < i3;
    }

    public static aI[] values() {
        return (aI[]) $VALUES.clone();
    }

    private static String lIlIllIIII(String llIllIlIllIIIlI, String llIllIlIlIlllll) {
        try {
            SecretKeySpec llIllIlIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIlIlIlllll.getBytes(StandardCharsets.UTF_8)), llIIIlll[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIlll[3], llIllIlIllIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIlIlIllllI) {
            llIllIlIlIllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllllII(int i2, int i3) {
        return i2 == i3;
    }

    private aI(String str, int i2, String str2, int i3) {
        this.itemName = str2;
        this.id = i3;
    }

    public String N() {
        return this.itemName;
    }

    public static aG x(int i2) {
        aG[] values = aG.values();
        int length = values.length;
        int i3 = llIIIlll[0];
        while (lIlIlllIll(i3, length)) {
            aG aGVar = values[i3];
            if (lIlIllllII(aGVar.P(), i2)) {
                return aGVar;
            }
            i3++;
            "".length();
            if ((-"  ".length()) >= 0) {
                return null;
            }
        }
        return null;
    }
}
