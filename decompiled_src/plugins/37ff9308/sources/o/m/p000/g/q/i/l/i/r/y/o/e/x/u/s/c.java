package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.c  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/c.class */
public final class c {
    public static final /* synthetic */ c AVANTOE;
    public static final /* synthetic */ c TOADFLAX;
    public static final /* synthetic */ c KWUARM;
    public static final /* synthetic */ c KWUARM_POT_UNF;
    private static /* synthetic */ int[] llllllllIlII;
    public static final /* synthetic */ c SNAPDRAGON_POT_UNF;
    public static final /* synthetic */ c SNAPDRAGON;
    public static final /* synthetic */ c RANARR_POT_UNF;
    public static final /* synthetic */ c AVANTOE_POT_UNF;
    private final /* synthetic */ String name;
    public static final /* synthetic */ c RANARR_WEED;
    private final /* synthetic */ int herbId;
    private static final /* synthetic */ c[] $VALUES;
    private static /* synthetic */ String[] llllllllIIll;
    public static final /* synthetic */ c TOADFLAX_POT_UNF;

    static {
        lIIlIlIllIlIIll();
        lIIlIlIllIlIIlI();
        RANARR_WEED = new c(llllllllIIll[llllllllIlII[0]], llllllllIlII[0], llllllllIIll[llllllllIlII[1]], llllllllIlII[2]);
        TOADFLAX = new c(llllllllIIll[llllllllIlII[3]], llllllllIlII[1], llllllllIIll[llllllllIlII[4]], llllllllIlII[5]);
        AVANTOE = new c(llllllllIIll[llllllllIlII[6]], llllllllIlII[3], llllllllIIll[llllllllIlII[7]], llllllllIlII[8]);
        KWUARM = new c(llllllllIIll[llllllllIlII[9]], llllllllIlII[4], llllllllIIll[llllllllIlII[10]], llllllllIlII[11]);
        SNAPDRAGON = new c(llllllllIIll[llllllllIlII[12]], llllllllIlII[6], llllllllIIll[llllllllIlII[13]], llllllllIlII[14]);
        RANARR_POT_UNF = new c(llllllllIIll[llllllllIlII[15]], llllllllIlII[7], llllllllIIll[llllllllIlII[16]], llllllllIlII[17]);
        TOADFLAX_POT_UNF = new c(llllllllIIll[llllllllIlII[18]], llllllllIlII[9], llllllllIIll[llllllllIlII[19]], llllllllIlII[20]);
        AVANTOE_POT_UNF = new c(llllllllIIll[llllllllIlII[21]], llllllllIlII[10], llllllllIIll[llllllllIlII[22]], llllllllIlII[23]);
        KWUARM_POT_UNF = new c(llllllllIIll[llllllllIlII[24]], llllllllIlII[12], llllllllIIll[llllllllIlII[25]], llllllllIlII[26]);
        SNAPDRAGON_POT_UNF = new c(llllllllIIll[llllllllIlII[27]], llllllllIlII[13], llllllllIIll[llllllllIlII[28]], llllllllIlII[29]);
        c[] cVarArr = new c[llllllllIlII[15]];
        cVarArr[llllllllIlII[0]] = RANARR_WEED;
        cVarArr[llllllllIlII[1]] = TOADFLAX;
        cVarArr[llllllllIlII[3]] = AVANTOE;
        cVarArr[llllllllIlII[4]] = KWUARM;
        cVarArr[llllllllIlII[6]] = SNAPDRAGON;
        cVarArr[llllllllIlII[7]] = RANARR_POT_UNF;
        cVarArr[llllllllIlII[9]] = TOADFLAX_POT_UNF;
        cVarArr[llllllllIlII[10]] = AVANTOE_POT_UNF;
        cVarArr[llllllllIlII[12]] = KWUARM_POT_UNF;
        cVarArr[llllllllIlII[13]] = SNAPDRAGON_POT_UNF;
        $VALUES = cVarArr;
    }

    private static String lIIlIlIllIlIIII(String lllllllllllllllIIlIIIIllIlIllIIl, String lllllllllllllllIIlIIIIllIlIllIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIIIllIlIllIII.toCharArray();
        int lllllllllllllllIIlIIIIllIlIlIlIl = llllllllIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llllllllIlII[0];
        while (lIIlIlIllIlIlII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIIIllIlIlIlIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIIIIllIlIlIlIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int b() {
        return this.herbId;
    }

    private static void lIIlIlIllIlIIlI() {
        llllllllIIll = new String[llllllllIlII[30]];
        llllllllIIll[llllllllIlII[0]] = lIIlIlIllIIllll("4qiLoj9WOCEabbPEjeODUg==", "BTqvv");
        llllllllIIll[llllllllIlII[1]] = lIIlIlIllIlIIII("JRg6CygFWSMPPxM=", "wyTjZ");
        llllllllIIll[llllllllIlII[3]] = lIIlIlIllIIllll("XMY7VUjaupFwbeASkZDfHA==", "CgDTi");
        llllllllIIll[llllllllIlII[4]] = lIIlIlIllIlIIII("FykGJhYvJx8=", "CFgBp");
        llllllllIIll[llllllllIlII[6]] = lIIlIlIllIlIIIl("Z9f6NXhM8Hw=", "OdQbq");
        llllllllIIll[llllllllIlII[7]] = lIIlIlIllIIllll("QN5DN/hf5BY=", "WyIei");
        llllllllIIll[llllllllIlII[9]] = lIIlIlIllIlIIII("KTM4LwYv", "bdmnT");
        llllllllIIll[llllllllIlII[10]] = lIIlIlIllIlIIII("DwIDLT4p", "DuvLL");
        llllllllIIll[llllllllIlII[12]] = lIIlIlIllIlIIII("NCs7ADQ1JD0fPg==", "gezPp");
        llllllllIIll[llllllllIlII[13]] = lIIlIlIllIlIIIl("2yCi3NWsJpPMQzdIFB6XuQ==", "wXIiX");
        llllllllIIll[llllllllIlII[15]] = lIIlIlIllIlIIII("IQUcNBghGwI6HiwRHDM=", "sDRuJ");
        llllllllIIll[llllllllIlII[16]] = lIIlIlIllIlIIII("GhklCjE6WDsENyEXJUtrPRYtQg==", "HxKkC");
        llllllllIIll[llllllllIlII[18]] = lIIlIlIllIlIIIl("cpY/7Hfy+W36wtaF3HUUaczwkzgOGgi0", "bmHUj");
        llllllllIIll[llllllllIlII[19]] = lIIlIlIllIlIIIl("fz3rdCQP4TOiK7EgVw7MDoC9juSO2dGb", "GcUTE");
        llllllllIIll[llllllllIlII[21]] = lIIlIlIllIlIIII("AhAwKyQMAy41PxcZJCs2", "CFqep");
        llllllllIIll[llllllllIlII[22]] = lIIlIlIllIlIIIl("GlqdEDfVcLUefhDTv+xSI2EN+4ySujEP", "wtoiN");
        llllllllIIll[llllllllIlII[24]] = lIIlIlIllIIllll("cSKtj5u2b0B+0Ktg1ItUiQ==", "QPwFV");
        llllllllIIll[llllllllIlII[25]] = lIIlIlIllIlIIII("OC8gMQgeeCU/Dho3O3BSBjYzeQ==", "sXUPz");
        llllllllIIll[llllllllIlII[27]] = lIIlIlIllIlIIII("PDkAFR09NgYKFzAnDhEGOjkH", "owAEY");
        llllllllIIll[llllllllIlII[28]] = lIIlIlIllIlIIIl("xeRU3BGewJdT0NcHG/026Ow7P90FXDEd", "gDXBH");
    }

    private static void lIIlIlIllIlIIll() {
        llllllllIlII = new int[31];
        llllllllIlII[0] = (1 ^ 16) & ((127 ^ 110) ^ (-1));
        llllllllIlII[1] = " ".length();
        llllllllIlII[2] = (-27683) & 27939;
        llllllllIlII[3] = "  ".length();
        llllllllIlII[4] = "   ".length();
        llllllllIlII[5] = (-12289) & 15286;
        llllllllIlII[6] = (((151 + 134) - 251) + 155) ^ (((180 + 61) - 99) + 43);
        llllllllIlII[7] = (218 ^ 167) ^ (96 ^ 24);
        llllllllIlII[8] = (-23051) & 23311;
        llllllllIlII[9] = (27 ^ 44) ^ (79 ^ 126);
        llllllllIlII[10] = 46 ^ 41;
        llllllllIlII[11] = (-29233) & 29495;
        llllllllIlII[12] = 34 ^ 42;
        llllllllIlII[13] = (180 ^ 170) ^ (84 ^ 67);
        llllllllIlII[14] = (-((-27161) & 28255)) & (-28673) & 32766;
        llllllllIlII[15] = 177 ^ 187;
        llllllllIlII[16] = 106 ^ 97;
        llllllllIlII[17] = (((138 + 19) - 143) + 211) ^ (((24 + 94) - (-3)) + 9);
        llllllllIlII[18] = (81 ^ 41) ^ (90 ^ 46);
        llllllllIlII[19] = 34 ^ 47;
        llllllllIlII[20] = (-((-177) & 9394)) & (-16453) & 28671;
        llllllllIlII[21] = 173 ^ 163;
        llllllllIlII[22] = 95 ^ 80;
        llllllllIlII[23] = 73 ^ 46;
        llllllllIlII[24] = (66 ^ 10) ^ (236 ^ 180);
        llllllllIlII[25] = (((7 + 126) - 68) + 88) ^ (((88 + 8) - 59) + 99);
        llllllllIlII[26] = (((156 + 102) - 189) + 148) ^ (((134 + 161) - 186) + 67);
        llllllllIlII[27] = (((133 + 31) - 132) + 111) ^ (((71 + 80) - 55) + 61);
        llllllllIlII[28] = (99 ^ 116) ^ (96 ^ 100);
        llllllllIlII[29] = (-((-8297) & 13419)) & (-2) & 8127;
        llllllllIlII[30] = (((76 + 104) - 10) + 6) ^ (((109 + 127) - 222) + 150);
    }

    public String a() {
        return this.name;
    }

    private static boolean lIIlIlIllIlIlII(int i, int i2) {
        return i < i2;
    }

    private c(String str, int i, String str2, int i2) {
        this.name = str2;
        this.herbId = i2;
    }

    private static String lIIlIlIllIIllll(String lllllllllllllllIIlIIIIllIIllIlIl, String lllllllllllllllIIlIIIIllIIllIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIllIIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIllIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllllllIlII[3], lllllllllllllllIIlIIIIllIIlllIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIllIIlllIII) {
            lllllllllllllllIIlIIIIllIIlllIII.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    private static String lIIlIlIllIlIIIl(String lllllllllllllllIIlIIIIllIlIIIlII, String lllllllllllllllIIlIIIIllIlIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIIllIlIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), llllllllIlII[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllllllIlII[3], lllllllllllllllIIlIIIIllIlIIIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIIllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIIllIlIIIlIl) {
            lllllllllllllllIIlIIIIllIlIIIlIl.printStackTrace();
            return null;
        }
    }
}
