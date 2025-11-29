package r.e.o.r.h.s.b.e.q.l.e.u.p000.i.r;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: r.e.o.r.h.s.b.e.q.l.e.u.-.i.r.b  reason: invalid package */
/* loaded from: 5d6a9183-7b7a-42a1-8cad-f88f0a9fad3c.jar:r/e/o/r/h/s/b/e/q/l/e/u/-/i/r/b.class */
public final class b {
    public static final /* synthetic */ b LANTADYME;
    public static final /* synthetic */ b TORSTOL;
    public static final /* synthetic */ b CADANTINE;
    public static final /* synthetic */ b TARROMIN;
    public static final /* synthetic */ b DWARF_WEED;
    public static final /* synthetic */ b TOADFLAX;
    private final /* synthetic */ int unfPotionId;
    private static /* synthetic */ int[] lllIIlllllll;
    public static final /* synthetic */ b AVANTOE;
    public static final /* synthetic */ b MARRENTILL;
    private final /* synthetic */ int cleanId;
    public static final /* synthetic */ b IRIT_LEAF;
    private static /* synthetic */ String[] lllIIllllllI;
    public static final /* synthetic */ b KWUARM;
    public static final /* synthetic */ b GUAM_LEAF;
    public static final /* synthetic */ b RANARR_WEED;
    private static final /* synthetic */ b[] $VALUES;
    public static final /* synthetic */ b SNAPDRAGON;
    private final /* synthetic */ int grimyId;
    public static final /* synthetic */ b HARRALANDER;

    public static b a(Integer num) {
        b[] values = values();
        int length = values.length;
        int i = lllIIlllllll[0];
        while (lIIIlIllIlIllII(i, length)) {
            b bVar = values[i];
            if (lIIIlIllIlIllIl(bVar.a(num.intValue()) ? 1 : 0)) {
                return bVar;
            }
            i++;
            "".length();
            if (((18 ^ 58) & ((98 ^ 74) ^ (-1))) > " ".length()) {
                return null;
            }
        }
        return null;
    }

    public int e() {
        return this.grimyId;
    }

    private b(String str, int i, int i2, int i3, int i4) {
        this.grimyId = i2;
        this.cleanId = i3;
        this.unfPotionId = i4;
    }

    private static boolean lIIIlIllIlIllIl(int i) {
        return i != 0;
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    private static boolean lIIIlIllIlIllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIllIlIlllI(int i, int i2) {
        return i != i2;
    }

    private static String lIIIlIllIlIIlll(String lllllllllllllllIIllIIlIlIlllIIll, String lllllllllllllllIIllIIlIlIlllIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlllllll[32]), "DES");
            Cipher lllllllllllllllIIllIIlIlIlllIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIIlIlIlllIlIl.init(lllIIlllllll[8], secretKeySpec);
            return new String(lllllllllllllllIIllIIlIlIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIlIlllIlII) {
            lllllllllllllllIIllIIlIlIlllIlII.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIllIlIlIII(String lllllllllllllllIIllIIlIlIllIIIll, String lllllllllllllllIIllIIlIlIllIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlIlIllIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIIlIlIllIIIIl = new StringBuilder();
        char[] lllllllllllllllIIllIIlIlIllIIIII = lllllllllllllllIIllIIlIlIllIIIlI.toCharArray();
        int lllllllllllllllIIllIIlIlIlIlllll = lllIIlllllll[0];
        char[] charArray = str.toCharArray();
        int lllllllllllllllIIllIIlIlIlIllIII = charArray.length;
        int i = lllIIlllllll[0];
        while (lIIIlIllIlIllII(i, lllllllllllllllIIllIIlIlIlIllIII)) {
            char lllllllllllllllIIllIIlIlIllIIlII = charArray[i];
            lllllllllllllllIIllIIlIlIllIIIIl.append((char) (lllllllllllllllIIllIIlIlIllIIlII ^ lllllllllllllllIIllIIlIlIllIIIII[lllllllllllllllIIllIIlIlIlIlllll % lllllllllllllllIIllIIlIlIllIIIII.length]));
            "".length();
            lllllllllllllllIIllIIlIlIlIlllll++;
            i++;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIIlIlIllIIIIl);
    }

    public int g() {
        return this.unfPotionId;
    }

    private static void lIIIlIllIlIlIll() {
        lllIIlllllll = new int[57];
        lllIIlllllll[0] = (1 ^ 8) & ((188 ^ 181) ^ (-1));
        lllIIlllllll[1] = " ".length();
        lllIIlllllll[2] = (((49 ^ 120) + (49 ^ 106)) - (-(69 ^ 86))) + (51 ^ 35);
        lllIIlllllll[3] = (((((55 + 98) - 83) + 94) + (123 ^ 44)) - (((157 + 118) - 57) + 15)) + ((13 + 142) - (-27)) + 49;
        lllIIlllllll[4] = 91 ^ 0;
        lllIIlllllll[5] = ((188 + 88) - 169) + 94;
        lllIIlllllll[6] = (((((101 + 122) - 202) + 192) + (((144 + 36) - 103) + 73)) - (((53 + 16) - 57) + 175)) + (245 ^ 190);
        lllIIlllllll[7] = 115 ^ 46;
        lllIIlllllll[8] = "  ".length();
        lllIIlllllll[9] = (((56 ^ 115) + (0 ^ 102)) - (81 ^ 60)) + ((20 + 19) - 8) + 104;
        lllIIlllllll[10] = (((((63 + 150) - 179) + 167) + (59 ^ 9)) - (208 ^ 130)) + (86 ^ 2);
        lllIIlllllll[11] = (246 ^ 144) ^ (176 ^ 137);
        lllIIlllllll[12] = "   ".length();
        lllIIlllllll[13] = (((((138 + 138) - 156) + 67) + (((88 + 64) - 100) + 81)) - (((141 + 5) - 3) + 10)) + (43 ^ 13);
        lllIIlllllll[14] = ((97 + 99) - 13) + 72;
        lllIIlllllll[15] = (((91 + 111) - 52) + 44) ^ (((11 + 0) - (-79)) + 73);
        lllIIlllllll[16] = 103 ^ 99;
        lllIIlllllll[17] = (((((80 + 133) - 132) + 54) + (((71 + 93) - 94) + 87)) - (((127 + 0) - 11) + 13)) + (104 ^ 68);
        lllIIlllllll[18] = (-31403) & 31659;
        lllIIlllllll[19] = (((134 + 45) - 20) + 38) ^ (((60 + 19) - 44) + 131);
        lllIIlllllll[20] = 144 ^ 149;
        lllIIlllllll[21] = (-21505) & 24553;
        lllIIlllllll[22] = (-9289) & 12286;
        lllIIlllllll[23] = (-((-8967) & 30535)) & (-8193) & 32762;
        lllIIlllllll[24] = (((133 + 59) - 23) + 25) ^ (((30 + 169) - 110) + 107);
        lllIIlllllll[25] = (((133 ^ 180) + (((58 + 92) - 132) + 114)) - (((108 + 32) - 114) + 114)) + ((66 + 26) - (-12)) + 64;
        lllIIlllllll[26] = (-((-16513) & 31469)) & (-1153) & 16367;
        lllIIlllllll[27] = (((93 + 102) - 47) + 63) ^ (((42 + 138) - 137) + 139);
        lllIIlllllll[28] = 121 ^ 126;
        lllIIlllllll[29] = ((92 + 124) - 210) + 205;
        lllIIlllllll[30] = (-14473) & 14733;
        lllIIlllllll[31] = (122 ^ 85) ^ (102 ^ 46);
        lllIIlllllll[32] = (((106 + 34) - 81) + 108) ^ (((11 + 158) - 12) + 18);
        lllIIlllllll[33] = ((45 + 1) - (-119)) + 48;
        lllIIlllllll[34] = (-((-6033) & 14233)) & (-18625) & 27087;
        lllIIlllllll[35] = 173 ^ 196;
        lllIIlllllll[36] = (133 ^ 150) ^ (9 ^ 19);
        lllIIlllllll[37] = (-28677) & 31727;
        lllIIlllllll[38] = (-((-11787) & 15887)) & (-24578) & 31677;
        lllIIlllllll[39] = (-((-20241) & 32530)) & (-16387) & 31679;
        lllIIlllllll[40] = 117 ^ 127;
        lllIIlllllll[41] = ((46 + 185) - 206) + 190;
        lllIIlllllll[42] = (-27287) & 27551;
        lllIIlllllll[43] = (121 ^ 127) ^ (245 ^ 152);
        lllIIlllllll[44] = (((130 + 146) - 132) + 31) ^ (((66 + 18) - 65) + 145);
        lllIIlllllll[45] = (-17987) & 20471;
        lllIIlllllll[46] = (-17485) & 19965;
        lllIIlllllll[47] = (-((-4449) & 30569)) & (-4165) & 32767;
        lllIIlllllll[48] = 102 ^ 106;
        lllIIlllllll[49] = ((39 + 30) - (-55)) + 93;
        lllIIlllllll[50] = (-6853) & 7119;
        lllIIlllllll[51] = 37 ^ 72;
        lllIIlllllll[52] = (((135 + 155) - 289) + 166) ^ (((136 + 30) - 108) + 112);
        lllIIlllllll[53] = ((33 + 56) - (-93)) + 37;
        lllIIlllllll[54] = (-10353) & 10621;
        lllIIlllllll[55] = 17 ^ 126;
        lllIIlllllll[56] = 142 ^ 128;
    }

    private static String lIIIlIllIlIlIIl(String lllllllllllllllIIllIIlIllIIIIIII, String lllllllllllllllIIllIIlIlIlllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlIlIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIlIllIIIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIlIllIIIIIlI.init(lllIIlllllll[8], secretKeySpec);
            return new String(lllllllllllllllIIllIIlIllIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlIllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIIlIllIIIIIIl) {
            lllllllllllllllIIllIIlIllIIIIIIl.printStackTrace();
            return null;
        }
    }

    public int f() {
        return this.cleanId;
    }

    private static void lIIIlIllIlIlIlI() {
        lllIIllllllI = new String[lllIIlllllll[56]];
        lllIIllllllI[lllIIlllllll[0]] = lIIIlIllIlIIlll("otZNQrqD5i8Qogo/XzB+jA==", "XWRht");
        lllIIllllllI[lllIIlllllll[1]] = lIIIlIllIlIlIII("KCo8HTcrPycDPg==", "eknOr");
        lllIIllllllI[lllIIlllllll[8]] = lIIIlIllIlIlIII("PxcrJRgmHzc=", "kVywW");
        lllIIllllllI[lllIIlllllll[12]] = lIIIlIllIlIlIIl("F2tQP3l9jLNsgJ+3AIcP1A==", "kLpwc");
        lllIIllllllI[lllIIlllllll[16]] = lIIIlIllIlIlIII("MAsnJRYwFT4hASY=", "bJidD");
        lllIIllllllI[lllIIlllllll[20]] = lIIIlIllIlIlIII("FiUQFw4OKwk=", "BjQSH");
        lllIIllllllI[lllIIlllllll[24]] = lIIIlIllIlIIlll("rvIme/vEf5NEKE9y1PIszg==", "HCiWL");
        lllIIllllllI[lllIIlllllll[28]] = lIIIlIllIlIIlll("C8bCbHPUU9Q=", "nlxhF");
        lllIIllllllI[lllIIlllllll[32]] = lIIIlIllIlIIlll("welGu22SPSg=", "HbXUI");
        lllIIllllllI[lllIIlllllll[36]] = lIIIlIllIlIIlll("4ijJ65OBWaGw5aGvctN2Fg==", "Njmef");
        lllIIllllllI[lllIIlllllll[40]] = lIIIlIllIlIlIIl("Pye7m4FUFT6Uh7klvWnaUw==", "FAyDF");
        lllIIllllllI[lllIIlllllll[44]] = lIIIlIllIlIlIII("Pgg9JhM2ED43", "rIsrR");
        lllIIllllllI[lllIIlllllll[48]] = lIIIlIllIlIIlll("HGRr7eD8v11FtbgaRx8OOA==", "gHhBj");
        lllIIllllllI[lllIIlllllll[52]] = lIIIlIllIlIIlll("rjMz61MaNFc=", "bQaDe");
    }

    public c b(int i) {
        if (lIIIlIllIlIllll(i, this.grimyId)) {
            return c.CLEAN_HERBS;
        }
        if (lIIIlIllIlIllll(i, this.cleanId)) {
            return c.MAKE_UNF_POTS;
        }
        if (lIIIlIllIlIllll(i, this.unfPotionId)) {
            return c.FINISH_POTS;
        }
        return null;
    }

    private static boolean lIIIlIllIlIllll(int i, int i2) {
        return i == i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    static {
        lIIIlIllIlIlIll();
        lIIIlIllIlIlIlI();
        GUAM_LEAF = new b(lllIIllllllI[lllIIlllllll[0]], lllIIlllllll[0], lllIIlllllll[2], lllIIlllllll[3], lllIIlllllll[4]);
        MARRENTILL = new b(lllIIllllllI[lllIIlllllll[1]], lllIIlllllll[1], lllIIlllllll[5], lllIIlllllll[6], lllIIlllllll[7]);
        TARROMIN = new b(lllIIllllllI[lllIIlllllll[8]], lllIIlllllll[8], lllIIlllllll[9], lllIIlllllll[10], lllIIlllllll[11]);
        HARRALANDER = new b(lllIIllllllI[lllIIlllllll[12]], lllIIlllllll[12], lllIIlllllll[13], lllIIlllllll[14], lllIIlllllll[15]);
        RANARR_WEED = new b(lllIIllllllI[lllIIlllllll[16]], lllIIlllllll[16], lllIIlllllll[17], lllIIlllllll[18], lllIIlllllll[19]);
        TOADFLAX = new b(lllIIllllllI[lllIIlllllll[20]], lllIIlllllll[20], lllIIlllllll[21], lllIIlllllll[22], lllIIlllllll[23]);
        IRIT_LEAF = new b(lllIIllllllI[lllIIlllllll[24]], lllIIlllllll[24], lllIIlllllll[25], lllIIlllllll[26], lllIIlllllll[27]);
        AVANTOE = new b(lllIIllllllI[lllIIlllllll[28]], lllIIlllllll[28], lllIIlllllll[29], lllIIlllllll[30], lllIIlllllll[31]);
        KWUARM = new b(lllIIllllllI[lllIIlllllll[32]], lllIIlllllll[32], lllIIlllllll[33], lllIIlllllll[34], lllIIlllllll[35]);
        SNAPDRAGON = new b(lllIIllllllI[lllIIlllllll[36]], lllIIlllllll[36], lllIIlllllll[37], lllIIlllllll[38], lllIIlllllll[39]);
        CADANTINE = new b(lllIIllllllI[lllIIlllllll[40]], lllIIlllllll[40], lllIIlllllll[41], lllIIlllllll[42], lllIIlllllll[43]);
        LANTADYME = new b(lllIIllllllI[lllIIlllllll[44]], lllIIlllllll[44], lllIIlllllll[45], lllIIlllllll[46], lllIIlllllll[47]);
        DWARF_WEED = new b(lllIIllllllI[lllIIlllllll[48]], lllIIlllllll[48], lllIIlllllll[49], lllIIlllllll[50], lllIIlllllll[51]);
        TORSTOL = new b(lllIIllllllI[lllIIlllllll[52]], lllIIlllllll[52], lllIIlllllll[53], lllIIlllllll[54], lllIIlllllll[55]);
        b[] bVarArr = new b[lllIIlllllll[56]];
        bVarArr[lllIIlllllll[0]] = GUAM_LEAF;
        bVarArr[lllIIlllllll[1]] = MARRENTILL;
        bVarArr[lllIIlllllll[8]] = TARROMIN;
        bVarArr[lllIIlllllll[12]] = HARRALANDER;
        bVarArr[lllIIlllllll[16]] = RANARR_WEED;
        bVarArr[lllIIlllllll[20]] = TOADFLAX;
        bVarArr[lllIIlllllll[24]] = IRIT_LEAF;
        bVarArr[lllIIlllllll[28]] = AVANTOE;
        bVarArr[lllIIlllllll[32]] = KWUARM;
        bVarArr[lllIIlllllll[36]] = SNAPDRAGON;
        bVarArr[lllIIlllllll[40]] = CADANTINE;
        bVarArr[lllIIlllllll[44]] = LANTADYME;
        bVarArr[lllIIlllllll[48]] = DWARF_WEED;
        bVarArr[lllIIlllllll[52]] = TORSTOL;
        $VALUES = bVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(int i) {
        if (lIIIlIllIlIlllI(i, this.grimyId) && lIIIlIllIlIlllI(i, this.cleanId) && !lIIIlIllIlIllll(i, this.unfPotionId)) {
            return lllIIlllllll[0];
        }
        ?? r0 = lllIIlllllll[1];
        "".length();
        return ((((16 + 46) - 22) + 109) ^ (((132 + 90) - 182) + 105)) <= 0 ? ((((20 + 21) - (-10)) + 119) ^ (((48 + 1) - (-62)) + 46)) & (((((73 + 35) - 56) + 77) ^ (((16 + 132) - 27) + 61)) ^ (-" ".length())) : r0;
    }
}
