package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.d  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/d.class */
public final class EnumC0003d {
    public static final /* synthetic */ EnumC0003d RING_OF_RECOIL;
    public static final /* synthetic */ EnumC0003d CHAOS_RUNE;
    private /* synthetic */ int amount;
    public static final /* synthetic */ EnumC0003d ANTI_VENOM;
    public static final /* synthetic */ EnumC0003d FIRE_RUNE;
    public static final /* synthetic */ EnumC0003d DEATH_RUNE;
    public static final /* synthetic */ EnumC0003d ZUL_ANDRA_TELEPORT;
    public static final /* synthetic */ EnumC0003d RANGING_POTION;
    public static final /* synthetic */ EnumC0003d RING_OF_WEALTH;
    private static /* synthetic */ String[] lIllIlIlllIIl;
    private /* synthetic */ int id;
    private static /* synthetic */ int[] lIllIllIIIIIl;
    private /* synthetic */ int price;
    public static final /* synthetic */ EnumC0003d SHARK;
    private /* synthetic */ String name;
    public static final /* synthetic */ EnumC0003d PRAYER_POTION;
    public static final /* synthetic */ EnumC0003d ADAMANT_DART;
    public static final /* synthetic */ EnumC0003d COOKED_KARAMBWAN;
    public static final /* synthetic */ EnumC0003d ZULRAH_SCALES;
    public static final /* synthetic */ EnumC0003d LUMBRIDGE_TELEPORT;
    public static final /* synthetic */ EnumC0003d RING_OF_DUELING;
    private static final /* synthetic */ EnumC0003d[] $VALUES;
    public static final /* synthetic */ EnumC0003d MAGIC_POTION;

    public static EnumC0003d[] values() {
        return (EnumC0003d[]) $VALUES.clone();
    }

    public int o() {
        return this.price;
    }

    public void a(String str) {
        this.name = str;
    }

    static {
        llIIlIIIlIIlIll();
        llIIlIIIlIIIllI();
        RING_OF_DUELING = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[0]], lIllIllIIIIIl[0], lIllIllIIIIIl[1], lIllIllIIIIIl[2], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[3]]);
        RING_OF_RECOIL = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[4]], lIllIllIIIIIl[3], lIllIllIIIIIl[5], lIllIllIIIIIl[6], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[7]]);
        RING_OF_WEALTH = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[8]], lIllIllIIIIIl[4], lIllIllIIIIIl[9], lIllIllIIIIIl[10], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[10]]);
        LUMBRIDGE_TELEPORT = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[11]], lIllIllIIIIIl[7], lIllIllIIIIIl[12], lIllIllIIIIIl[13], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[14]]);
        ZUL_ANDRA_TELEPORT = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[15]], lIllIllIIIIIl[8], lIllIllIIIIIl[16], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[18]]);
        FIRE_RUNE = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[13]], lIllIllIIIIIl[10], lIllIllIIIIIl[19], lIllIllIIIIIl[20], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[21]]);
        CHAOS_RUNE = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[22]], lIllIllIIIIIl[11], lIllIllIIIIIl[23], lIllIllIIIIIl[24], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[25]]);
        DEATH_RUNE = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[26]], lIllIllIIIIIl[14], lIllIllIIIIIl[27], lIllIllIIIIIl[24], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[2]]);
        SHARK = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[28]], lIllIllIIIIIl[15], lIllIllIIIIIl[29], lIllIllIIIIIl[30], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[31]]);
        ANTI_VENOM = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[32]], lIllIllIIIIIl[18], lIllIllIIIIIl[33], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[34]]);
        RANGING_POTION = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[35]], lIllIllIIIIIl[13], lIllIllIIIIIl[36], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[37]]);
        MAGIC_POTION = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[38]], lIllIllIIIIIl[21], lIllIllIIIIIl[39], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[40]]);
        PRAYER_POTION = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[41]], lIllIllIIIIIl[22], lIllIllIIIIIl[42], lIllIllIIIIIl[17], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[43]]);
        ADAMANT_DART = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[44]], lIllIllIIIIIl[25], lIllIllIIIIIl[45], lIllIllIIIIIl[46], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[47]]);
        COOKED_KARAMBWAN = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[48]], lIllIllIIIIIl[26], lIllIllIIIIIl[49], lIllIllIIIIIl[50], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[51]]);
        ZULRAH_SCALES = new EnumC0003d(lIllIlIlllIIl[lIllIllIIIIIl[17]], lIllIllIIIIIl[2], lIllIllIIIIIl[52], lIllIllIIIIIl[46], lIllIllIIIIIl[0], lIllIlIlllIIl[lIllIllIIIIIl[53]]);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[lIllIllIIIIIl[28]];
        enumC0003dArr[lIllIllIIIIIl[0]] = RING_OF_DUELING;
        enumC0003dArr[lIllIllIIIIIl[3]] = RING_OF_RECOIL;
        enumC0003dArr[lIllIllIIIIIl[4]] = RING_OF_WEALTH;
        enumC0003dArr[lIllIllIIIIIl[7]] = LUMBRIDGE_TELEPORT;
        enumC0003dArr[lIllIllIIIIIl[8]] = ZUL_ANDRA_TELEPORT;
        enumC0003dArr[lIllIllIIIIIl[10]] = FIRE_RUNE;
        enumC0003dArr[lIllIllIIIIIl[11]] = CHAOS_RUNE;
        enumC0003dArr[lIllIllIIIIIl[14]] = DEATH_RUNE;
        enumC0003dArr[lIllIllIIIIIl[15]] = SHARK;
        enumC0003dArr[lIllIllIIIIIl[18]] = ANTI_VENOM;
        enumC0003dArr[lIllIllIIIIIl[13]] = RANGING_POTION;
        enumC0003dArr[lIllIllIIIIIl[21]] = MAGIC_POTION;
        enumC0003dArr[lIllIllIIIIIl[22]] = PRAYER_POTION;
        enumC0003dArr[lIllIllIIIIIl[25]] = ADAMANT_DART;
        enumC0003dArr[lIllIllIIIIIl[26]] = COOKED_KARAMBWAN;
        enumC0003dArr[lIllIllIIIIIl[2]] = ZULRAH_SCALES;
        $VALUES = enumC0003dArr;
    }

    private static void llIIlIIIlIIIllI() {
        lIllIlIlllIIl = new String[lIllIllIIIIIl[54]];
        lIllIlIlllIIl[lIllIllIIIIIl[0]] = llIIlIIIIllIIIl("PwIZFRgiDQgWEigHHhwA", "mKWRG");
        lIllIlIlllIIl[lIllIllIIIIIl[3]] = llIIlIIIIllIIlI("ioYGLIuswsVyIRk/z15Dczcw7kYAAdeR", "rpmgC");
        lIllIlIlllIIl[lIllIllIIIIIl[4]] = llIIlIIIIllIIIl("ERs/LCcMFC45PQAdOCc=", "CRqkx");
        lIllIlIlllIIl[lIllIllIIIIIl[7]] = llIIlIIIIllIIIl("HSonKE4gJWk9CywsICM=", "OCIOn");
        lIllIlIlllIIl[lIllIllIIIIIl[8]] = llIIlIIIIllIIIl("Nx0pCAoqEjgYECQYMwc=", "eTgOU");
        lIllIlIlllIIl[lIllIllIIIIIl[10]] = llIIlIIIIllIIlI("oaQVAMOfreBoPcmAtRLSjL1GfCQggo4Z", "kPGwg");
        lIllIlIlllIIl[lIllIllIIIIIl[11]] = llIIlIIIIllIIlI("2KhkwIzIssKEbv2AJcX+/gjlmtI+hfoL", "Nhwcf");
        lIllIlIlllIIl[lIllIllIIIIIl[14]] = llIIlIIIIllllIl("YfZpyWzEjpLflS3+Pfq1oCPaLasAOU48", "jOqfg");
        lIllIlIlllIIl[lIllIllIIIIIl[15]] = llIIlIIIIllllIl("Nn4yBM0JGGD6vnOYMhyNTfx0ejMRcDUX", "sgMcr");
        lIllIlIlllIIl[lIllIllIIIIIl[18]] = llIIlIIIIllllIl("6qNZ/6LPmC7A1VQUZqLZR4xnEo4m1YJG", "NkaIi");
        lIllIlIlllIIl[lIllIllIIIIIl[13]] = llIIlIIIIllIIIl("LjwxFy46IC0X", "hucRq");
        lIllIlIlllIIl[lIllIllIIIIIl[21]] = llIIlIIIIllllIl("ifxdXN/ZqC76/UNPbPKzTg==", "XKIGC");
        lIllIlIlllIIl[lIllIllIIIIIl[22]] = llIIlIIIIllllIl("E2j6gl9/n9tjkwx0K0s6Jg==", "bYNod");
        lIllIlIlllIIl[lIllIllIIIIIl[25]] = llIIlIIIIllIIlI("N5wsULAVQLXjWs2Gk0iP5Q==", "COcNQ");
        lIllIlIlllIIl[lIllIllIIIIIl[26]] = llIIlIIIIllIIIl("NxQ3IBEsAyM6HA==", "sQvtY");
        lIllIlIlllIIl[lIllIllIIIIIl[2]] = llIIlIIIIllllIl("TQb3t4zSDCFeZFi4k/zsPg==", "aNStQ");
        lIllIlIlllIIl[lIllIllIIIIIl[28]] = llIIlIIIIllllIl("/c5zIsxM27M=", "tkERr");
        lIllIlIlllIIl[lIllIllIIIIIl[31]] = llIIlIIIIllllIl("DI6tjDKTDkQ=", "rPDMm");
        lIllIlIlllIIl[lIllIllIIIIIl[32]] = llIIlIIIIllIIIl("EAUjKAsHDjkuGQ==", "QKwaT");
        lIllIlIlllIIl[lIllIllIIIIIl[34]] = llIIlIIIIllllIl("hAxk87cC5Y7Q72gNPmwekA==", "HbBxq");
        lIllIlIlllIIl[lIllIllIIIIIl[35]] = llIIlIIIIllllIl("1/Ur/G3AqcIU7iLm9NAyVQ==", "XPxyF");
        lIllIlIlllIIl[lIllIllIIIIIl[37]] = llIIlIIIIllIIlI("bSGvW+PKOaYGTH2L21QxTtJY05bbMCkB", "omKrm");
        lIllIlIlllIIl[lIllIllIIIIIl[38]] = llIIlIIIIllIIlI("3eK34XyHrb9+iy+JGzYMxg==", "axNmG");
        lIllIlIlllIIl[lIllIllIIIIIl[40]] = llIIlIIIIllIIIl("Pgk9GQxTGDUEBhwGckRG", "shZpo");
        lIllIlIlllIIl[lIllIllIIIIIl[41]] = llIIlIIIIllllIl("afydyQtCV1bWRB5KclSzAg==", "OZnrU");
        lIllIlIlllIIl[lIllIllIIIIIl[43]] = llIIlIIIIllllIl("iKZBwJXpW6kbbMawM10gyorB3W4pryaL", "Fobrj");
        lIllIlIlllIIl[lIllIllIIIIIl[44]] = llIIlIIIIllIIIl("GSEEODQWMRoxNAox", "XeEuu");
        lIllIlIlllIIl[lIllIllIIIIIl[47]] = llIIlIIIIllIIIl("AiYHNTctNkY8NzE2", "CBfXV");
        lIllIlIlllIIl[lIllIllIIIIIl[48]] = llIIlIIIIllllIl("fLpIKl745wWWOD88/eg+d1SKd5ygus4Y", "BlsFd");
        lIllIlIlllIIl[lIllIllIIIIIl[51]] = llIIlIIIIllIIlI("qSFF2TQ5PM474favl3Wv5xApyDhyu2GU", "EXhQk");
        lIllIlIlllIIl[lIllIllIIIIIl[17]] = llIIlIIIIllllIl("JMaNsPcgfFWMR0RlFTVocg==", "GYQkb");
        lIllIlIlllIIl[lIllIllIIIIIl[53]] = llIIlIIIIllllIl("0FnZjqxZ7Ds/HVn0qJ2YpQ==", "EuycM");
    }

    private static String llIIlIIIIllllIl(String llllllllllllllIllIIIllIIIIllIlll, String llllllllllllllIllIIIllIIIIllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIIIIllIlII.getBytes(StandardCharsets.UTF_8)), lIllIllIIIIIl[15]), "DES");
            Cipher llllllllllllllIllIIIllIIIIlllIIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIllIIIIlllIIl.init(lIllIllIIIIIl[4], secretKeySpec);
            return new String(llllllllllllllIllIIIllIIIIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIIIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllIIIIlllIII) {
            llllllllllllllIllIIIllIIIIlllIII.printStackTrace();
            return null;
        }
    }

    public int n() {
        return this.amount;
    }

    private static void llIIlIIIlIIlIll() {
        lIllIllIIIIIl = new int[55];
        lIllIllIIIIIl[0] = ((((95 + 189) - 154) + 111) ^ (((77 + 0) - 76) + 175)) & (((((46 + 3) - (-61)) + 108) ^ (((127 + 77) - 199) + 150)) ^ (-" ".length()));
        lIllIllIIIIIl[1] = (-((-6201) & 31806)) & (-1) & 28157;
        lIllIllIIIIIl[2] = 64 ^ 79;
        lIllIllIIIIIl[3] = " ".length();
        lIllIllIIIIIl[4] = "  ".length();
        lIllIllIIIIIl[5] = (-((-1159) & 13967)) & (-2) & 15359;
        lIllIllIIIIIl[6] = ((38 + 75) - 82) + 119;
        lIllIllIIIIIl[7] = "   ".length();
        lIllIllIIIIIl[8] = 95 ^ 91;
        lIllIllIIIIIl[9] = (-((-8994) & 29491)) & (-3) & 32479;
        lIllIllIIIIIl[10] = (((63 + 163) - 98) + 48) ^ (((165 + 92) - 171) + 95);
        lIllIllIIIIIl[11] = (((65 + 84) - 121) + 107) ^ (((99 + 76) - 81) + 35);
        lIllIllIIIIIl[12] = (-((-13962) & 30399)) & (-8193) & 32637;
        lIllIllIIIIIl[13] = (93 ^ 17) ^ (83 ^ 21);
        lIllIllIIIIIl[14] = 86 ^ 81;
        lIllIllIIIIIl[15] = (26 ^ 39) ^ (188 ^ 137);
        lIllIllIIIIIl[16] = (-((-8339) & 27799)) & (-322) & 32719;
        lIllIllIIIIIl[17] = (27 ^ 42) ^ (12 ^ 35);
        lIllIllIIIIIl[18] = (((82 + 102) - 42) + 21) ^ (((144 + 113) - 92) + 5);
        lIllIllIIIIIl[19] = (-18437) & 18990;
        lIllIllIIIIIl[20] = (-8370) & 15869;
        lIllIllIIIIIl[21] = (((24 + 11) - (-35)) + 65) ^ (((20 + 71) - 27) + 76);
        lIllIllIIIIIl[22] = 72 ^ 68;
        lIllIllIIIIIl[23] = (-26697) & 27258;
        lIllIllIIIIIl[24] = (-((-11350) & 11903)) & (-17) & 3069;
        lIllIllIIIIIl[25] = (((41 + 57) - (-27)) + 7) ^ (((28 + 107) - 106) + 108);
        lIllIllIIIIIl[26] = 132 ^ 138;
        lIllIllIIIIIl[27] = (-((-17938) & 28509)) & (-1) & 11131;
        lIllIllIIIIIl[28] = (((70 + 15) - (-45)) + 9) ^ (((31 + 105) - 126) + 145);
        lIllIllIIIIIl[29] = (-((-13697) & 32183)) & (-4105) & 22975;
        lIllIllIIIIIl[30] = (-((-745) & 32492)) & (-1) & 32247;
        lIllIllIIIIIl[31] = (241 ^ 170) ^ (9 ^ 67);
        lIllIllIIIIIl[32] = (100 ^ 109) ^ (170 ^ 177);
        lIllIllIIIIIl[33] = (-2183) & 15095;
        lIllIllIIIIIl[34] = 25 ^ 10;
        lIllIllIIIIIl[35] = 91 ^ 79;
        lIllIllIIIIIl[36] = (-((-18821) & 28662)) & (-20481) & 32765;
        lIllIllIIIIIl[37] = (((23 + 32) - 7) + 164) ^ (((136 + 46) - 152) + 163);
        lIllIllIIIIIl[38] = (252 ^ 167) ^ (86 ^ 27);
        lIllIllIIIIIl[39] = (-((-22787) & 23835)) & (-24581) & 28668;
        lIllIllIIIIIl[40] = (((7 + 206) - 70) + 70) ^ (((23 + 63) - 53) + 161);
        lIllIllIIIIIl[41] = 136 ^ 144;
        lIllIllIIIIIl[42] = (-29197) & 31630;
        lIllIllIIIIIl[43] = (2 ^ 18) ^ (133 ^ 140);
        lIllIllIIIIIl[44] = 67 ^ 89;
        lIllIllIIIIIl[45] = (-((-6441) & 7593)) & (-30805) & 32766;
        lIllIllIIIIIl[46] = (-28696) & 29695;
        lIllIllIIIIIl[47] = (90 ^ 41) ^ (50 ^ 90);
        lIllIllIIIIIl[48] = 76 ^ 80;
        lIllIllIIIIIl[49] = (-8195) & 11338;
        lIllIllIIIIIl[50] = (((222 + 20) - 36) + 24) ^ (((56 + 103) - 68) + 39);
        lIllIllIIIIIl[51] = 61 ^ 32;
        lIllIllIIIIIl[52] = (-17697) & 30630;
        lIllIllIIIIIl[53] = 146 ^ 141;
        lIllIllIIIIIl[54] = (((34 + 44) - (-10)) + 49) ^ (((55 + 4) - (-19)) + 91);
    }

    private static boolean llIIlIIIlIIllII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIIIlIIllIl(int i, int i2) {
        return i == i2;
    }

    public static EnumC0003d b(int i) {
        EnumC0003d[] values = values();
        int length = values.length;
        int i2 = lIllIllIIIIIl[0];
        while (llIIlIIIlIIllII(i2, length)) {
            EnumC0003d enumC0003d = values[i2];
            if (llIIlIIIlIIllIl(enumC0003d.m(), i)) {
                return enumC0003d;
            }
            i2++;
            "".length();
            if (((100 ^ 125) ^ (222 ^ 195)) < "  ".length()) {
                return null;
            }
        }
        return null;
    }

    public void c(int i) {
        this.id = i;
    }

    private static String llIIlIIIIllIIIl(String llllllllllllllIllIIIllIIIlIIllII, String llllllllllllllIllIIIllIIIlIIlIll) {
        String llllllllllllllIllIIIllIIIlIIllII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIllIIIlIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIllIIIlIIlIlI = new StringBuilder();
        char[] charArray = llllllllllllllIllIIIllIIIlIIlIll.toCharArray();
        int llllllllllllllIllIIIllIIIlIIlIII = lIllIllIIIIIl[0];
        char[] charArray2 = llllllllllllllIllIIIllIIIlIIllII2.toCharArray();
        int llllllllllllllIllIIIllIIIlIIIIIl = charArray2.length;
        int i = lIllIllIIIIIl[0];
        while (llIIlIIIlIIllII(i, llllllllllllllIllIIIllIIIlIIIIIl)) {
            char llllllllllllllIllIIIllIIIlIIllIl = charArray2[i];
            llllllllllllllIllIIIllIIIlIIlIlI.append((char) (llllllllllllllIllIIIllIIIlIIllIl ^ charArray[llllllllllllllIllIIIllIIIlIIlIII % charArray.length]));
            "".length();
            llllllllllllllIllIIIllIIIlIIlIII++;
            i++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIIllIIIlIIlIlI);
    }

    public String k() {
        return this.name;
    }

    private static String llIIlIIIIllIIlI(String llllllllllllllIllIIIllIIIlIlllII, String llllllllllllllIllIIIllIIIlIllIll) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIIIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIIIlIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIllIIIIIl[4], llllllllllllllIllIIIllIIIlIlllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIllIIIlIllIII) {
            llllllllllllllIllIIIllIIIlIllIII.printStackTrace();
            return null;
        }
    }

    public void d(int i) {
        this.amount = i;
    }

    public int m() {
        return this.id;
    }

    public void e(int i) {
        this.price = i;
    }

    public static EnumC0003d valueOf(String str) {
        return (EnumC0003d) Enum.valueOf(EnumC0003d.class, str);
    }

    private EnumC0003d(String str, int i, int i2, int i3, int i4, String str2) {
        this.id = i2;
        this.amount = i3;
        this.price = i4;
        this.name = str2;
    }
}
