package e.g.n.r.p.l.q.p000.p001.e.m.i.t.e.e.s.t.i.k.r.k.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.c  reason: invalid package */
/* loaded from: 1a91e21b-fcbe-4432-8f0e-1258958a8366.jar:e/g/n/r/p/l/q/-/-/e/m/i/t/e/e/s/t/i/k/r/k/u/c.class */
public final class c {
    public static final /* synthetic */ c DARK_CRAB;
    public static final /* synthetic */ c SHARK;
    public static final /* synthetic */ c SEA_TURTLE;
    private static final /* synthetic */ c[] $VALUES;
    public static final /* synthetic */ c BASS;
    public static final /* synthetic */ c SALMON;
    public static final /* synthetic */ c TROUT;
    public static final /* synthetic */ c SWORDFISH;
    public static final /* synthetic */ c MONKFISH;
    public static final /* synthetic */ c MANTA_RAY;
    public static final /* synthetic */ c STEW;
    public static final /* synthetic */ c PIKE;
    private final /* synthetic */ int healAmount;
    public static final /* synthetic */ c KARAMBWAN;
    private static /* synthetic */ String[] lIIllIlIIllIl;
    public static final /* synthetic */ c LOBSTER;
    public static final /* synthetic */ c JUG_OF_WINE;
    public static final /* synthetic */ c TUNA;
    private final /* synthetic */ int itemId;
    private static /* synthetic */ int[] lIIllIlIlIlII;

    private c(String str, int i, int i2, int i3) {
        this.itemId = i2;
        this.healAmount = i3;
    }

    private static String lIllIIIIlIIlIIl(String llllllllllllllIlllIllllIlIIIlIII, String llllllllllllllIlllIllllIlIIIIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIllllIlIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIlIIIIlll.getBytes(StandardCharsets.UTF_8)), lIIllIlIlIlII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIllIlIlIlII[6], llllllllllllllIlllIllllIlIIIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIlIIIlIIl) {
            llllllllllllllIlllIllllIlIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIIlIIlIll(String llllllllllllllIlllIllllIIllllIll, String llllllllllllllIlllIllllIIllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIllIlIlIlII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIllllIIlllllII) {
            llllllllllllllIlllIllllIIlllllII.printStackTrace();
            return null;
        }
    }

    public int v() {
        return this.healAmount;
    }

    private static void lIllIIIIllIIlII() {
        lIIllIlIlIlII = new int[36];
        lIIllIlIlIlII[0] = (140 ^ 173) & ((110 ^ 79) ^ (-1));
        lIIllIlIlIlII[1] = (-((-459) & 32747)) & (-17) & 32637;
        lIIllIlIlIlII[2] = 160 ^ 167;
        lIIllIlIlIlII[3] = " ".length();
        lIIllIlIlIlII[4] = (-((-1561) & 32313)) & (-513) & 31615;
        lIIllIlIlIlII[5] = (((124 + 27) - 83) + 119) ^ (((127 + 144) - 134) + 42);
        lIIllIlIlIlII[6] = "  ".length();
        lIIllIlIlIlII[7] = (-11265) & 11593;
        lIIllIlIlIlII[8] = 202 ^ 195;
        lIIllIlIlIlII[9] = "   ".length();
        lIIllIlIlIlII[10] = (-((-435) & 13751)) & (-18945) & 32621;
        lIIllIlIlIlII[11] = (126 ^ 26) ^ (169 ^ 199);
        lIIllIlIlIlII[12] = 40 ^ 44;
        lIIllIlIlIlII[13] = (-10245) & 12247;
        lIIllIlIlIlII[14] = (211 ^ 163) ^ (96 ^ 27);
        lIIllIlIlIlII[15] = (236 ^ 137) ^ (217 ^ 185);
        lIIllIlIlIlII[16] = (-6177) & 8169;
        lIIllIlIlIlII[17] = (144 ^ 194) ^ (63 ^ 107);
        lIIllIlIlIlII[18] = (-26241) & 26619;
        lIIllIlIlIlII[19] = (((84 + 42) - (-2)) + 2) ^ (((100 + 90) - 103) + 55);
        lIIllIlIlIlII[20] = (-20609) & 20973;
        lIIllIlIlIlII[21] = 9 ^ 4;
        lIIllIlIlIlII[22] = (-((-8803) & 15075)) & (-17929) & 24573;
        lIIllIlIlIlII[23] = (((188 + 159) - 147) + 3) ^ (((194 + 13) - 26) + 16);
        lIIllIlIlIlII[24] = (-((-521) & 17098)) & (-8213) & 32735;
        lIIllIlIlIlII[25] = 147 ^ 131;
        lIIllIlIlIlII[26] = (-((-4098) & 29589)) & (-5) & 28639;
        lIIllIlIlIlII[27] = 20 ^ 6;
        lIIllIlIlIlII[28] = (-29223) & 29607;
        lIIllIlIlIlII[29] = 43 ^ 63;
        lIIllIlIlIlII[30] = (-((-2381) & 6527)) & (-8769) & 13311;
        lIIllIlIlIlII[31] = (((79 + 77) - 103) + 100) ^ (((9 + 72) - 24) + 83);
        lIIllIlIlIlII[32] = (-30209) & 30599;
        lIIllIlIlIlII[33] = (93 ^ 25) ^ (11 ^ 89);
        lIIllIlIlIlII[34] = (-((-17071) & 21503)) & (-13) & 16380;
        lIIllIlIlIlII[35] = 127 ^ 112;
    }

    private static boolean lIllIIIIllIIlIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIllIIIIllIIlII();
        lIllIIIIllIIIll();
        TROUT = new c(lIIllIlIIllIl[lIIllIlIlIlII[0]], lIIllIlIlIlII[0], lIIllIlIlIlII[1], lIIllIlIlIlII[2]);
        PIKE = new c(lIIllIlIIllIl[lIIllIlIlIlII[3]], lIIllIlIlIlII[3], lIIllIlIlIlII[4], lIIllIlIlIlII[5]);
        SALMON = new c(lIIllIlIIllIl[lIIllIlIlIlII[6]], lIIllIlIlIlII[6], lIIllIlIlIlII[7], lIIllIlIlIlII[8]);
        TUNA = new c(lIIllIlIIllIl[lIIllIlIlIlII[9]], lIIllIlIlIlII[9], lIIllIlIlIlII[10], lIIllIlIlIlII[11]);
        STEW = new c(lIIllIlIIllIl[lIIllIlIlIlII[12]], lIIllIlIlIlII[12], lIIllIlIlIlII[13], lIIllIlIlIlII[14]);
        JUG_OF_WINE = new c(lIIllIlIIllIl[lIIllIlIlIlII[15]], lIIllIlIlIlII[15], lIIllIlIlIlII[16], lIIllIlIlIlII[14]);
        LOBSTER = new c(lIIllIlIIllIl[lIIllIlIlIlII[17]], lIIllIlIlIlII[17], lIIllIlIlIlII[18], lIIllIlIlIlII[19]);
        BASS = new c(lIIllIlIIllIl[lIIllIlIlIlII[2]], lIIllIlIlIlII[2], lIIllIlIlIlII[20], lIIllIlIlIlII[21]);
        SWORDFISH = new c(lIIllIlIIllIl[lIIllIlIlIlII[5]], lIIllIlIlIlII[5], lIIllIlIlIlII[22], lIIllIlIlIlII[23]);
        MONKFISH = new c(lIIllIlIIllIl[lIIllIlIlIlII[8]], lIIllIlIlIlII[8], lIIllIlIlIlII[24], lIIllIlIlIlII[25]);
        KARAMBWAN = new c(lIIllIlIIllIl[lIIllIlIlIlII[11]], lIIllIlIlIlII[11], lIIllIlIlIlII[26], lIIllIlIlIlII[27]);
        SHARK = new c(lIIllIlIIllIl[lIIllIlIlIlII[14]], lIIllIlIlIlII[14], lIIllIlIlIlII[28], lIIllIlIlIlII[29]);
        SEA_TURTLE = new c(lIIllIlIIllIl[lIIllIlIlIlII[19]], lIIllIlIlIlII[19], lIIllIlIlIlII[30], lIIllIlIlIlII[31]);
        MANTA_RAY = new c(lIIllIlIIllIl[lIIllIlIlIlII[21]], lIIllIlIlIlII[21], lIIllIlIlIlII[32], lIIllIlIlIlII[33]);
        DARK_CRAB = new c(lIIllIlIIllIl[lIIllIlIlIlII[23]], lIIllIlIlIlII[23], lIIllIlIlIlII[34], lIIllIlIlIlII[33]);
        c[] cVarArr = new c[lIIllIlIlIlII[35]];
        cVarArr[lIIllIlIlIlII[0]] = TROUT;
        cVarArr[lIIllIlIlIlII[3]] = PIKE;
        cVarArr[lIIllIlIlIlII[6]] = SALMON;
        cVarArr[lIIllIlIlIlII[9]] = TUNA;
        cVarArr[lIIllIlIlIlII[12]] = STEW;
        cVarArr[lIIllIlIlIlII[15]] = JUG_OF_WINE;
        cVarArr[lIIllIlIlIlII[17]] = LOBSTER;
        cVarArr[lIIllIlIlIlII[2]] = BASS;
        cVarArr[lIIllIlIlIlII[5]] = SWORDFISH;
        cVarArr[lIIllIlIlIlII[8]] = MONKFISH;
        cVarArr[lIIllIlIlIlII[11]] = KARAMBWAN;
        cVarArr[lIIllIlIlIlII[14]] = SHARK;
        cVarArr[lIIllIlIlIlII[19]] = SEA_TURTLE;
        cVarArr[lIIllIlIlIlII[21]] = MANTA_RAY;
        cVarArr[lIIllIlIlIlII[23]] = DARK_CRAB;
        $VALUES = cVarArr;
    }

    private static void lIllIIIIllIIIll() {
        lIIllIlIIllIl = new String[lIIllIlIlIlII[35]];
        lIIllIlIIllIl[lIIllIlIlIlII[0]] = lIllIIIIlIIlIIl("9vXyAd40WpA=", "fMFoi");
        lIIllIlIIllIl[lIIllIlIlIlII[3]] = lIllIIIIlIIlIlI("CTkGLA==", "YpMiC");
        lIIllIlIIllIl[lIIllIlIlIlII[6]] = lIllIIIIlIIlIlI("Jzs7LDo6", "tzwau");
        lIIllIlIIllIl[lIIllIlIlIlII[9]] = lIllIIIIlIIlIll("nfHh5VxtuF4=", "ZcTRK");
        lIIllIlIIllIl[lIIllIlIlIlII[12]] = lIllIIIIlIIlIIl("W5DrwKXAURs=", "PyDZp");
        lIIllIlIIllIl[lIIllIlIlIlII[15]] = lIllIIIIlIIlIll("gtDeVnC2KKI1nwx996AEcA==", "NhqHH");
        lIIllIlIIllIl[lIIllIlIlIlII[17]] = lIllIIIIlIIlIll("w18eq8iFtyo=", "CCHER");
        lIIllIlIIllIl[lIIllIlIlIlII[2]] = lIllIIIIlIIlIll("FHL/qUkbMeI=", "bKjnU");
        lIIllIlIIllIl[lIIllIlIlIlII[5]] = lIllIIIIlIIlIlI("NCA6GQEhPiYD", "gwuKE");
        lIIllIlIIllIl[lIIllIlIlIlII[8]] = lIllIIIIlIIlIll("pCcEc+y7ws0LMJyaBlDKLQ==", "waYSg");
        lIIllIlIIllIl[lIIllIlIlIlII[11]] = lIllIIIIlIIlIlI("PwcFDgg2ERYB", "tFWOE");
        lIIllIlIIllIl[lIIllIlIlIlII[14]] = lIllIIIIlIIlIlI("Bg8iAz4=", "UGcQu");
        lIIllIlIIllIl[lIIllIlIlIlII[19]] = lIllIIIIlIIlIlI("MAkvGhA2HjoJAQ==", "cLnED");
        lIIllIlIIllIl[lIIllIlIlIlII[21]] = lIllIIIIlIIlIIl("aLx6hbyPNcvdZTS0W6NNjg==", "fuItg");
        lIIllIlIIllIl[lIIllIlIlIlII[23]] = lIllIIIIlIIlIll("Z+WUTvLa8lhJlfU92BioSg==", "sFmVd");
    }

    public int u() {
        return this.itemId;
    }

    private static String lIllIIIIlIIlIlI(String llllllllllllllIlllIllllIlIIlllIl, String llllllllllllllIlllIllllIlIIlllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIllllIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIllllIlIIlllII.toCharArray();
        int llllllllllllllIlllIllllIlIIllIIl = lIIllIlIlIlII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int llllllllllllllIlllIllllIlIIlIIIl = lIIllIlIlIlII[0];
        while (lIllIIIIllIIlIl(llllllllllllllIlllIllllIlIIlIIIl, length)) {
            char llllllllllllllIlllIllllIlIIllllI = charArray2[llllllllllllllIlllIllllIlIIlIIIl];
            sb.append((char) (llllllllllllllIlllIllllIlIIllllI ^ charArray[llllllllllllllIlllIllllIlIIllIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIllllIlIIllIIl++;
            llllllllllllllIlllIllllIlIIlIIIl++;
            "".length();
            if ((158 ^ 154) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
