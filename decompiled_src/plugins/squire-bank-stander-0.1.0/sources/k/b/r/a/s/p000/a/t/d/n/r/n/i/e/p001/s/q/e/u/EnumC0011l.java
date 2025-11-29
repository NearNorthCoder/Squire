package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.l  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/l.class */
public final class EnumC0011l {
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ EnumC0011l MAPLE_SHIELD;
    public static final /* synthetic */ EnumC0011l MAPLE_CROSSBOW_STOCK;
    public static final /* synthetic */ EnumC0011l OAK_LONGBOW_U;
    public static final /* synthetic */ EnumC0011l MAGIC_SHORTBOW_U;
    public static final /* synthetic */ EnumC0011l YEW_SHORTBOW_U;
    public static final /* synthetic */ EnumC0011l LONGBOW_U;
    private final /* synthetic */ int craftingOption;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ EnumC0011l YEW_SHIELD;
    private static final /* synthetic */ EnumC0011l[] $VALUES;
    private static /* synthetic */ int[] lllIIllllll;
    public static final /* synthetic */ EnumC0011l OAK_CROSSBOW_STOCK;
    public static final /* synthetic */ EnumC0011l OAK_SHORTBOW_U;
    public static final /* synthetic */ EnumC0011l ARROW_SHAFT;
    public static final /* synthetic */ EnumC0011l MAGIC_CROSSBOW_STOCK;
    public static final /* synthetic */ EnumC0011l YEW_CROSSBOW_STOCK;
    public static final /* synthetic */ EnumC0011l JAVELIN_SHAFT;
    public static final /* synthetic */ EnumC0011l OAK_SHIELD;
    private static /* synthetic */ String[] lllIIlllllI;
    public static final /* synthetic */ EnumC0011l MAGIC_LONGBOW_U;
    public static final /* synthetic */ EnumC0011l WILLOW_SHORTBOW_U;
    public static final /* synthetic */ EnumC0011l CROSSBOW_STOCK;
    public static final /* synthetic */ EnumC0011l YEW_LONGBOW_U;
    public static final /* synthetic */ EnumC0011l REDWOOD_SHIELD;
    public static final /* synthetic */ EnumC0011l SHORTBOW_U;
    public static final /* synthetic */ EnumC0011l WILLOW_CROSSBOW_STOCK;
    public static final /* synthetic */ EnumC0011l MAPLE_LONGBOW_U;
    public static final /* synthetic */ EnumC0011l WILLOW_SHIELD;
    public static final /* synthetic */ EnumC0011l MAGIC_SHIELD;
    public static final /* synthetic */ EnumC0011l WILLOW_LONGBOW_U;
    public static final /* synthetic */ EnumC0011l MAPLE_SHORTBOW_U;

    private static String lIlIlllIllIIll(String llllllllllllllllIIlIIllIllIlIlll, String llllllllllllllllIIlIIllIllIlIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIIlIIllIllIlIlII = llllllllllllllllIIlIIllIllIlIllI.toCharArray();
        int llllllllllllllllIIlIIllIllIIlllI = lllIIllllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIllllll[0];
        while (lIlIlllIllIlll(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllIIlIIllIllIlIlII[llllllllllllllllIIlIIllIllIIlllI % llllllllllllllllIIlIIllIllIlIlII.length]));
            "".length();
            llllllllllllllllIIlIIllIllIIlllI++;
            i++;
            "".length();
            if ((((((149 + 36) - 166) + 132) ^ (((109 + 52) - 96) + 70)) & (((25 ^ 58) ^ (115 ^ 64)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public boolean G() {
        return name().endsWith(lllIIlllllI[lllIIllllll[0]]);
    }

    public int z() {
        return this.materialID;
    }

    private static String lIlIlllIllIlII(String llllllllllllllllIIlIIllIllIIIIlI, String llllllllllllllllIIlIIllIllIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), lllIIllllll[17]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIllllll[4], llllllllllllllllIIlIIllIllIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIllIIIIll) {
            llllllllllllllllIIlIIllIllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIllIllI() {
        lllIIllllll = new int[61];
        lllIIllllll[0] = ((217 ^ 198) ^ "  ".length()) & (((205 ^ 189) ^ (23 ^ 122)) ^ (-" ".length()));
        lllIIllllll[1] = " ".length();
        lllIIllllll[2] = (-((-165) & 17069)) & (-2049) & 20463;
        lllIIllllll[3] = 14 ^ 58;
        lllIIllllll[4] = "  ".length();
        lllIIllllll[5] = (-((-18961) & 31316)) & (-805) & 32743;
        lllIIllllll[6] = "   ".length();
        lllIIllllll[7] = 116 ^ 70;
        lllIIllllll[8] = 56 ^ 60;
        lllIIllllll[9] = (((116 + 15) - 79) + 103) ^ (((110 + 116) - 104) + 49);
        lllIIllllll[10] = 81 ^ 84;
        lllIIllllll[11] = (-277) & 9716;
        lllIIllllll[12] = (((140 + 85) - 134) + 72) ^ (((20 + 60) - 53) + 138);
        lllIIllllll[13] = (-((-8499) & 28983)) & (-513) & 22517;
        lllIIllllll[14] = 240 ^ 198;
        lllIIllllll[15] = (86 ^ 14) ^ (49 ^ 110);
        lllIIllllll[16] = 77 ^ 117;
        lllIIllllll[17] = 166 ^ 174;
        lllIIllllll[18] = (-20746) & 30187;
        lllIIllllll[19] = 111 ^ 102;
        lllIIllllll[20] = (-((-5313) & 7621)) & (-8193) & 32751;
        lllIIllllll[21] = (157 ^ 155) ^ (42 ^ 38);
        lllIIllllll[22] = (-((-2519) & 11223)) & (-6161) & 16383;
        lllIIllllll[23] = 122 ^ 70;
        lllIIllllll[24] = (83 ^ 9) ^ (96 ^ 49);
        lllIIllllll[25] = (((198 + 91) - 72) + 35) ^ (((178 + 158) - 302) + 164);
        lllIIllllll[26] = 80 ^ 92;
        lllIIllllll[27] = (-((-1138) & 23677)) & (-257) & 32239;
        lllIIllllll[28] = 2 ^ 15;
        lllIIllllll[29] = (-2066) & 24319;
        lllIIllllll[30] = (160 ^ 151) ^ (123 ^ 66);
        lllIIllllll[31] = (-((-22287) & 24335)) & (-29187) & 32751;
        lllIIllllll[32] = (34 ^ 125) ^ (105 ^ 118);
        lllIIllllll[33] = 1 ^ 14;
        lllIIllllll[34] = (42 ^ 120) ^ (79 ^ 35);
        lllIIllllll[35] = 72 ^ 88;
        lllIIllllll[36] = (-((-8373) & 31164)) & (-1) & 32239;
        lllIIllllll[37] = (((130 + 177) - 110) + 11) ^ (((93 + 88) - 124) + 136);
        lllIIllllll[38] = (-267) & 22523;
        lllIIllllll[39] = (20 ^ 24) ^ (139 ^ 149);
        lllIIllllll[40] = (-((-1329) & 23861)) & (-8721) & 32767;
        lllIIllllll[41] = (66 ^ 10) ^ (3 ^ 15);
        lllIIllllll[42] = 24 ^ 11;
        lllIIllllll[43] = (227 ^ 145) ^ (1 ^ 49);
        lllIIllllll[44] = (116 ^ 56) ^ (200 ^ 144);
        lllIIllllll[45] = (-4610) & 14061;
        lllIIllllll[46] = 156 ^ 137;
        lllIIllllll[47] = (-8452) & 30711;
        lllIIllllll[48] = (11 ^ 73) ^ (48 ^ 100);
        lllIIllllll[49] = (-((-1337) & 32571)) & (-5) & 32751;
        lllIIllllll[50] = (169 ^ 164) ^ (65 ^ 4);
        lllIIllllll[51] = (((87 + 25) - 64) + 128) ^ (((115 + 65) - 79) + 66);
        lllIIllllll[52] = 87 ^ 17;
        lllIIllllll[53] = (242 ^ 180) ^ (216 ^ 134);
        lllIIllllll[54] = (-8751) & 30702;
        lllIIllllll[55] = (83 ^ 106) ^ (226 ^ 194);
        lllIIllllll[56] = (-((-23773) & 32221)) & (-2057) & 32767;
        lllIIllllll[57] = (61 ^ 48) ^ (61 ^ 42);
        lllIIllllll[58] = (-8449) & 28117;
        lllIIllllll[59] = (-10246) & 32511;
        lllIIllllll[60] = 16 ^ 11;
    }

    private static boolean lIlIlllIllIlll(int i, int i2) {
        return i < i2;
    }

    public int E() {
        return this.finishedID;
    }

    public static EnumC0011l[] values() {
        return (EnumC0011l[]) $VALUES.clone();
    }

    private static String lIlIlllIllIIlI(String llllllllllllllllIIlIIllIlllIIlll, String llllllllllllllllIIlIIllIlllIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIlllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIIllllll[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIlllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIIllIlllIlIII) {
            llllllllllllllllIIlIIllIlllIlIII.printStackTrace();
            return null;
        }
    }

    public static EnumC0011l valueOf(String str) {
        return (EnumC0011l) Enum.valueOf(EnumC0011l.class, str);
    }

    private EnumC0011l(String str, int i, int i2, int i3, int i4) {
        this.materialID = i2;
        this.finishedID = i3;
        this.craftingOption = i4;
    }

    private static void lIlIlllIllIlIl() {
        lllIIlllllI = new String[lllIIllllll[60]];
        lllIIlllllI[lllIIllllll[0]] = lIlIlllIllIIlI("63eREJuhiO8=", "WLmyI");
        lllIIlllllI[lllIIllllll[1]] = lIlIlllIllIIll("KhoEDD80Gx4CLj8=", "kHVCh");
        lllIIlllllI[lllIIllllll[4]] = lIlIlllIllIIlI("FsVIl1TsBpC4Nc6ygXCV6w==", "vFeGW");
        lllIIlllllI[lllIIllllll[6]] = lIlIlllIllIIlI("4gRzy4YqbSuAa4cZ7iOM4Q==", "yvzAo");
        lllIIlllllI[lllIIllllll[8]] = lIlIlllIllIIlI("xDCEIUOJVl7jwXtZhxbNZg==", "NTtcF");
        lllIIlllllI[lllIIllllll[10]] = lIlIlllIllIIlI("JwZCwdCNK19+XDSKWTEZ3A==", "YFdMp");
        lllIIlllllI[lllIIllllll[12]] = lIlIlllIllIIll("BTAELysCPh0kOgUmECU=", "JqOpx");
        lllIIlllllI[lllIIllllll[15]] = lIlIlllIllIIlI("YgF1+UbMcMTULXp9Jg+iWQ==", "viyNF");
        lllIIlllllI[lllIIllllll[17]] = lIlIlllIllIlII("5xxPfCmMR7atWTHLYFKKxjm6JNv1+r93", "ibHzM");
        lllIIlllllI[lllIIllllll[19]] = lIlIlllIllIIlI("uxzaGcA76D3VbG1qJ58yuQ==", "mmLYT");
        lllIIlllllI[lllIIllllll[21]] = lIlIlllIllIIll("JzA0AgInJisGAiItOgEaLyw=", "pyxNM");
        lllIIlllllI[lllIIllllll[24]] = lIlIlllIllIIlI("FqROyViSm6lR6DkhnOLFXpAMgfGJjfY2", "MvWwM");
        lllIIlllllI[lllIIllllll[26]] = lIlIlllIllIIll("PC4mKyI8OCk1Ijg0KCg6NDQ+KC4g", "kgjgm");
        lllIIlllllI[lllIIllllll[28]] = lIlIlllIllIIlI("H/76zcQlZrvHP9rnaX91vQ==", "LiJpy");
        lllIIlllllI[lllIIllllll[30]] = lIlIlllIllIIlI("twty1nbfJX5ZrwSq0/bTBBp6ihS+u5j8", "jSOBG");
        lllIIlllllI[lllIIllllll[33]] = lIlIlllIllIIlI("8qUf7B5HouYuQR5J69gYQA==", "vHYAZ");
        lllIIlllllI[lllIIllllll[35]] = lIlIlllIllIlII("pFCq54iNm0ixQeBzlTmO6OnRLRmeqg9v", "QnsNf");
        lllIIlllllI[lllIIllllll[37]] = lIlIlllIllIIlI("x39qUSF/mk6vAlWdspidow==", "cBisX");
        lllIIlllllI[lllIIllllll[39]] = lIlIlllIllIlII("8tq1N6pzTkzfBKupv4xXXg==", "OvUzo");
        lllIIlllllI[lllIIllllll[42]] = lIlIlllIllIIlI("Y4JGrQg/Bsj9RXwRRMcSPA==", "buwnw");
        lllIIlllllI[lllIIllllll[44]] = lIlIlllIllIIlI("1sgTVfdVTTK9XAqQrw9GcdJj9T0jqPQU", "AcYfI");
        lllIIlllllI[lllIIllllll[46]] = lIlIlllIllIIlI("b4FtSSJO6zu+6hE8ICUedQ==", "MjWka");
        lllIIlllllI[lllIIllllll[48]] = lIlIlllIllIlII("MDVlhVS1O44p1dQyBiErtAv5e3+DW7ED", "mEqiP");
        lllIIlllllI[lllIIllllll[51]] = lIlIlllIllIlII("bYdjSahSM3YIviX43Axi+w==", "LICEr");
        lllIIlllllI[lllIIllllll[53]] = lIlIlllIllIIlI("MF8681Yh/vem2friS4HA2QSpTnOY5E7L", "kRZfv");
        lllIIlllllI[lllIIllllll[55]] = lIlIlllIllIIlI("HkmEVxnizGbAOTEZp/PVXQ==", "gckmY");
        lllIIlllllI[lllIIllllll[57]] = lIlIlllIllIlII("MsIWbIzVAZmjsgSLLh0BXA==", "zSMYJ");
    }

    static {
        lIlIlllIllIllI();
        lIlIlllIllIlIl();
        ARROW_SHAFT = new EnumC0011l(lllIIlllllI[lllIIllllll[1]], lllIIllllll[0], lllIIllllll[2], lllIIllllll[3], lllIIllllll[1]);
        JAVELIN_SHAFT = new EnumC0011l(lllIIlllllI[lllIIllllll[4]], lllIIllllll[1], lllIIllllll[2], lllIIllllll[5], lllIIllllll[4]);
        SHORTBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[6]], lllIIllllll[4], lllIIllllll[2], lllIIllllll[7], lllIIllllll[6]);
        LONGBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[8]], lllIIllllll[6], lllIIllllll[2], lllIIllllll[9], lllIIllllll[8]);
        CROSSBOW_STOCK = new EnumC0011l(lllIIlllllI[lllIIllllll[10]], lllIIllllll[8], lllIIllllll[2], lllIIllllll[11], lllIIllllll[10]);
        OAK_SHORTBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[12]], lllIIllllll[10], lllIIllllll[13], lllIIllllll[14], lllIIllllll[4]);
        OAK_LONGBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[15]], lllIIllllll[12], lllIIllllll[13], lllIIllllll[16], lllIIllllll[6]);
        OAK_CROSSBOW_STOCK = new EnumC0011l(lllIIlllllI[lllIIllllll[17]], lllIIllllll[15], lllIIllllll[13], lllIIllllll[18], lllIIllllll[8]);
        OAK_SHIELD = new EnumC0011l(lllIIlllllI[lllIIllllll[19]], lllIIllllll[17], lllIIllllll[13], lllIIllllll[20], lllIIllllll[10]);
        WILLOW_SHORTBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[21]], lllIIllllll[19], lllIIllllll[22], lllIIllllll[23], lllIIllllll[4]);
        WILLOW_LONGBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[24]], lllIIllllll[21], lllIIllllll[22], lllIIllllll[25], lllIIllllll[6]);
        WILLOW_CROSSBOW_STOCK = new EnumC0011l(lllIIlllllI[lllIIllllll[26]], lllIIllllll[24], lllIIllllll[22], lllIIllllll[27], lllIIllllll[8]);
        WILLOW_SHIELD = new EnumC0011l(lllIIlllllI[lllIIllllll[28]], lllIIllllll[26], lllIIllllll[22], lllIIllllll[29], lllIIllllll[10]);
        MAPLE_SHORTBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[30]], lllIIllllll[28], lllIIllllll[31], lllIIllllll[32], lllIIllllll[4]);
        MAPLE_LONGBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[33]], lllIIllllll[30], lllIIllllll[31], lllIIllllll[34], lllIIllllll[6]);
        MAPLE_CROSSBOW_STOCK = new EnumC0011l(lllIIlllllI[lllIIllllll[35]], lllIIllllll[33], lllIIllllll[31], lllIIllllll[36], lllIIllllll[8]);
        MAPLE_SHIELD = new EnumC0011l(lllIIlllllI[lllIIllllll[37]], lllIIllllll[35], lllIIllllll[31], lllIIllllll[38], lllIIllllll[10]);
        YEW_SHORTBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[39]], lllIIllllll[37], lllIIllllll[40], lllIIllllll[41], lllIIllllll[4]);
        YEW_LONGBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[42]], lllIIllllll[39], lllIIllllll[40], lllIIllllll[43], lllIIllllll[6]);
        YEW_CROSSBOW_STOCK = new EnumC0011l(lllIIlllllI[lllIIllllll[44]], lllIIllllll[42], lllIIllllll[40], lllIIllllll[45], lllIIllllll[8]);
        YEW_SHIELD = new EnumC0011l(lllIIlllllI[lllIIllllll[46]], lllIIllllll[44], lllIIllllll[40], lllIIllllll[47], lllIIllllll[10]);
        MAGIC_SHORTBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[48]], lllIIllllll[46], lllIIllllll[49], lllIIllllll[50], lllIIllllll[4]);
        MAGIC_LONGBOW_U = new EnumC0011l(lllIIlllllI[lllIIllllll[51]], lllIIllllll[48], lllIIllllll[49], lllIIllllll[52], lllIIllllll[6]);
        MAGIC_CROSSBOW_STOCK = new EnumC0011l(lllIIlllllI[lllIIllllll[53]], lllIIllllll[51], lllIIllllll[49], lllIIllllll[54], lllIIllllll[8]);
        MAGIC_SHIELD = new EnumC0011l(lllIIlllllI[lllIIllllll[55]], lllIIllllll[53], lllIIllllll[49], lllIIllllll[56], lllIIllllll[10]);
        REDWOOD_SHIELD = new EnumC0011l(lllIIlllllI[lllIIllllll[57]], lllIIllllll[55], lllIIllllll[58], lllIIllllll[59], lllIIllllll[4]);
        EnumC0011l[] enumC0011lArr = new EnumC0011l[lllIIllllll[57]];
        enumC0011lArr[lllIIllllll[0]] = ARROW_SHAFT;
        enumC0011lArr[lllIIllllll[1]] = JAVELIN_SHAFT;
        enumC0011lArr[lllIIllllll[4]] = SHORTBOW_U;
        enumC0011lArr[lllIIllllll[6]] = LONGBOW_U;
        enumC0011lArr[lllIIllllll[8]] = CROSSBOW_STOCK;
        enumC0011lArr[lllIIllllll[10]] = OAK_SHORTBOW_U;
        enumC0011lArr[lllIIllllll[12]] = OAK_LONGBOW_U;
        enumC0011lArr[lllIIllllll[15]] = OAK_CROSSBOW_STOCK;
        enumC0011lArr[lllIIllllll[17]] = OAK_SHIELD;
        enumC0011lArr[lllIIllllll[19]] = WILLOW_SHORTBOW_U;
        enumC0011lArr[lllIIllllll[21]] = WILLOW_LONGBOW_U;
        enumC0011lArr[lllIIllllll[24]] = WILLOW_CROSSBOW_STOCK;
        enumC0011lArr[lllIIllllll[26]] = WILLOW_SHIELD;
        enumC0011lArr[lllIIllllll[28]] = MAPLE_SHORTBOW_U;
        enumC0011lArr[lllIIllllll[30]] = MAPLE_LONGBOW_U;
        enumC0011lArr[lllIIllllll[33]] = MAPLE_CROSSBOW_STOCK;
        enumC0011lArr[lllIIllllll[35]] = MAPLE_SHIELD;
        enumC0011lArr[lllIIllllll[37]] = YEW_SHORTBOW_U;
        enumC0011lArr[lllIIllllll[39]] = YEW_LONGBOW_U;
        enumC0011lArr[lllIIllllll[42]] = YEW_CROSSBOW_STOCK;
        enumC0011lArr[lllIIllllll[44]] = YEW_SHIELD;
        enumC0011lArr[lllIIllllll[46]] = MAGIC_SHORTBOW_U;
        enumC0011lArr[lllIIllllll[48]] = MAGIC_LONGBOW_U;
        enumC0011lArr[lllIIllllll[51]] = MAGIC_CROSSBOW_STOCK;
        enumC0011lArr[lllIIllllll[53]] = MAGIC_SHIELD;
        enumC0011lArr[lllIIllllll[55]] = REDWOOD_SHIELD;
        $VALUES = enumC0011lArr;
    }

    public int C() {
        return this.craftingOption;
    }
}
