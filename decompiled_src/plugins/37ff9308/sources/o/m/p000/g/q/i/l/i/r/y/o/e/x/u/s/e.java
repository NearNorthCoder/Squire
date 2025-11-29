package o.m.p000.g.q.i.l.i.r.y.o.e.x.u.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.m.-.g.q.i.l.i.r.y.o.e.x.u.s.e  reason: invalid package */
/* loaded from: 37ff9308-5bb6-4332-83e0-8ab13e118f7a.jar:o/m/-/g/q/i/l/i/r/y/o/e/x/u/s/e.class */
public final class e {
    private final /* synthetic */ int herbId;
    public static final /* synthetic */ e HARRALANDER;
    public static final /* synthetic */ e MARRENTILL_POT_UNF;
    private static /* synthetic */ String[] lIIIIIIIlIIII;
    private static /* synthetic */ int[] lIIIIIIIlIIIl;
    public static final /* synthetic */ e HARRALANDER_POT_UNF;
    public static final /* synthetic */ e GUAM_POT_UNF;
    public static final /* synthetic */ e TARROMIN_POT_UNF;
    public static final /* synthetic */ e GUAM_LEAF;
    private static final /* synthetic */ e[] $VALUES;
    public static final /* synthetic */ e TARROMIN;
    public static final /* synthetic */ e MARRENTILL;
    private final /* synthetic */ String name;

    public int b() {
        return this.herbId;
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    static {
        lIIlIllIlIIllIl();
        lIIlIllIlIIllII();
        GUAM_LEAF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[0]], lIIIIIIIlIIIl[0], lIIIIIIIlIIII[lIIIIIIIlIIIl[1]], lIIIIIIIlIIIl[2]);
        MARRENTILL = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[3]], lIIIIIIIlIIIl[1], lIIIIIIIlIIII[lIIIIIIIlIIIl[4]], lIIIIIIIlIIIl[5]);
        TARROMIN = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[6]], lIIIIIIIlIIIl[3], lIIIIIIIlIIII[lIIIIIIIlIIIl[7]], lIIIIIIIlIIIl[8]);
        HARRALANDER = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[9]], lIIIIIIIlIIIl[4], lIIIIIIIlIIII[lIIIIIIIlIIIl[10]], lIIIIIIIlIIIl[11]);
        GUAM_POT_UNF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[12]], lIIIIIIIlIIIl[6], lIIIIIIIlIIII[lIIIIIIIlIIIl[13]], lIIIIIIIlIIIl[14]);
        MARRENTILL_POT_UNF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[15]], lIIIIIIIlIIIl[7], lIIIIIIIlIIII[lIIIIIIIlIIIl[16]], lIIIIIIIlIIIl[17]);
        TARROMIN_POT_UNF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[18]], lIIIIIIIlIIIl[9], lIIIIIIIlIIII[lIIIIIIIlIIIl[19]], lIIIIIIIlIIIl[20]);
        HARRALANDER_POT_UNF = new e(lIIIIIIIlIIII[lIIIIIIIlIIIl[21]], lIIIIIIIlIIIl[10], lIIIIIIIlIIII[lIIIIIIIlIIIl[22]], lIIIIIIIlIIIl[23]);
        e[] eVarArr = new e[lIIIIIIIlIIIl[12]];
        eVarArr[lIIIIIIIlIIIl[0]] = GUAM_LEAF;
        eVarArr[lIIIIIIIlIIIl[1]] = MARRENTILL;
        eVarArr[lIIIIIIIlIIIl[3]] = TARROMIN;
        eVarArr[lIIIIIIIlIIIl[4]] = HARRALANDER;
        eVarArr[lIIIIIIIlIIIl[6]] = GUAM_POT_UNF;
        eVarArr[lIIIIIIIlIIIl[7]] = MARRENTILL_POT_UNF;
        eVarArr[lIIIIIIIlIIIl[9]] = TARROMIN_POT_UNF;
        eVarArr[lIIIIIIIlIIIl[10]] = HARRALANDER_POT_UNF;
        $VALUES = eVarArr;
    }

    private static void lIIlIllIlIIllII() {
        lIIIIIIIlIIII = new String[lIIIIIIIlIIIl[24]];
        lIIIIIIIlIIII[lIIIIIIIlIIIl[0]] = lIIlIllIlIIlIIl("/C1FNNGw9wLRTbmXYiENHQ==", "CsQKV");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[1]] = lIIlIllIlIIlIlI("Igc3NU4JFzc+", "erVXn");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[3]] = lIIlIllIlIIlIIl("F0vDY+yYBH8V9+gcijKapQ==", "dHQka");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[4]] = lIIlIllIlIIlIIl("Kz54IkQ7j4WP7gAXpgt40Q==", "CYIuj");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[6]] = lIIlIllIlIIlIll("bHAWcyH18UYblYEnH6o/Eg==", "bnEhg");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[7]] = lIIlIllIlIIlIll("bEsqGcSRejMEu4JSICxvGg==", "LdbcL");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[9]] = lIIlIllIlIIlIIl("GxSBYrkQhhkWrxTezGODrw==", "bRKXm");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[10]] = lIIlIllIlIIlIIl("sjb3fHICPGYx2plx9CIeCw==", "ncKJa");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[12]] = lIIlIllIlIIlIll("O+oQSWem7UEwx0ojoezO1A==", "VMZAq");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[13]] = lIIlIllIlIIlIll("hX0U8842DGBWBtuhFqbMGVhcSswpQf9n", "VAzEn");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[15]] = lIIlIllIlIIlIlI("DxMCCy4MBhkVJx0CHw00FxwW", "BRPYk");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[16]] = lIIlIllIlIIlIIl("cwQoHkxxQ9zdIptHxi9rssoqr3UqKksh", "nBCvU");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[18]] = lIIlIllIlIIlIlI("OhAnKyMjGDsmPCEFKiwiKA==", "nQuyl");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[19]] = lIIlIllIlIIlIll("dLaZAFyfn2W6G3nrGXRZXw2/CEXCrhIU", "KwQOq");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[21]] = lIIlIllIlIIlIlI("JiQFHjAiJBkINDw6BwMlMTAZCg==", "neWLq");
        lIIIIIIIlIIII[lIIIIIIIlIIIl[22]] = lIIlIllIlIIlIIl("T7x6G6ngEholHjSk+G7SFF5yt5jMjU8e5S2cEFZgr9g=", "jfPSU");
    }

    private e(String str, int i, String str2, int i2) {
        this.name = str2;
        this.herbId = i2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    private static String lIIlIllIlIIlIIl(String lllllllllllllllIIIllllllIlIllIll, String lllllllllllllllIIIllllllIlIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllllIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIllllllIlIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIllllllIlIlllIl.init(lIIIIIIIlIIIl[3], secretKeySpec);
            return new String(lllllllllllllllIIIllllllIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllllIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllllIlIlllII) {
            lllllllllllllllIIIllllllIlIlllII.printStackTrace();
            return null;
        }
    }

    public String a() {
        return this.name;
    }

    private static boolean lIIlIllIlIIlllI(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIllIlIIlIlI(String lllllllllllllllIIIllllllIlllllIl, String lllllllllllllllIIIllllllIlllllII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIllllllIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIllllllIllllIll = new StringBuilder();
        char[] lllllllllllllllIIIllllllIllllIlI = lllllllllllllllIIIllllllIlllllII.toCharArray();
        int lllllllllllllllIIIllllllIllllIIl = lIIIIIIIlIIIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int lllllllllllllllIIIllllllIlllIIIl = lIIIIIIIlIIIl[0];
        while (lIIlIllIlIIlllI(lllllllllllllllIIIllllllIlllIIIl, length)) {
            lllllllllllllllIIIllllllIllllIll.append((char) (charArray[lllllllllllllllIIIllllllIlllIIIl] ^ lllllllllllllllIIIllllllIllllIlI[lllllllllllllllIIIllllllIllllIIl % lllllllllllllllIIIllllllIllllIlI.length]));
            "".length();
            lllllllllllllllIIIllllllIllllIIl++;
            lllllllllllllllIIIllllllIlllIIIl++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIllllllIllllIll);
    }

    private static void lIIlIllIlIIllIl() {
        lIIIIIIIlIIIl = new int[25];
        lIIIIIIIlIIIl[0] = ((231 ^ 176) ^ (223 ^ 147)) & (((52 ^ 10) ^ (128 ^ 165)) ^ (-" ".length()));
        lIIIIIIIlIIIl[1] = " ".length();
        lIIIIIIIlIIIl[2] = ((171 + 157) - 79) + 0;
        lIIIIIIIlIIIl[3] = "  ".length();
        lIIIIIIIlIIIl[4] = "   ".length();
        lIIIIIIIlIIIl[5] = (((((104 + 145) - 167) + 96) + (((15 + 134) - 50) + 42)) - ((-20685) & 20974)) + ((118 + 77) - (-23)) + 4;
        lIIIIIIIlIIIl[6] = (116 ^ 100) ^ (143 ^ 155);
        lIIIIIIIlIIIl[7] = 146 ^ 151;
        lIIIIIIIlIIIl[8] = ((223 + 213) - 401) + 218;
        lIIIIIIIlIIIl[9] = (((26 + 93) - 79) + 119) ^ (((89 + 115) - 117) + 66);
        lIIIIIIIlIIIl[10] = (146 ^ 155) ^ (36 ^ 42);
        lIIIIIIIlIIIl[11] = ((24 + 109) - (-89)) + 33;
        lIIIIIIIlIIIl[12] = 106 ^ 98;
        lIIIIIIIlIIIl[13] = (((127 + 142) - 127) + 16) ^ (((87 + 140) - 96) + 20);
        lIIIIIIIlIIIl[14] = 255 ^ 164;
        lIIIIIIIlIIIl[15] = 23 ^ 29;
        lIIIIIIIlIIIl[16] = (6 ^ 13) ^ ((78 ^ 83) & ((177 ^ 172) ^ (-1)));
        lIIIIIIIlIIIl[17] = (((87 + 142) - 222) + 199) ^ (((59 + 143) - 147) + 92);
        lIIIIIIIlIIIl[18] = (70 ^ 24) ^ (83 ^ 1);
        lIIIIIIIlIIIl[19] = 58 ^ 55;
        lIIIIIIIlIIIl[20] = 73 ^ 22;
        lIIIIIIIlIIIl[21] = (177 ^ 195) ^ (203 ^ 183);
        lIIIIIIIlIIIl[22] = (79 ^ 68) ^ (76 ^ 72);
        lIIIIIIIlIIIl[23] = (((105 + 54) - 158) + 162) ^ (((10 + 120) - (-1)) + 63);
        lIIIIIIIlIIIl[24] = (((2 + 42) - 29) + 115) ^ (((80 + 30) - 55) + 91);
    }

    private static String lIIlIllIlIIlIll(String lllllllllllllllIIIllllllIllIlIII, String lllllllllllllllIIIllllllIllIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIIllllllIllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllllIllIIlll.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlIIIl[12]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIIlIIIl[3], lllllllllllllllIIIllllllIllIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllllIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllllIllIlIIl) {
            lllllllllllllllIIIllllllIllIlIIl.printStackTrace();
            return null;
        }
    }
}
