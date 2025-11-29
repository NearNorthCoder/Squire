/*
 * Decompiled with CFR 0.152.
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class l
extends Enum<l> {
    private final /* synthetic */ int finishedID;
    public static final /* synthetic */ /* enum */ l MAPLE_SHIELD;
    public static final /* synthetic */ /* enum */ l MAPLE_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l OAK_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l MAGIC_SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l YEW_SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l LONGBOW_U;
    private final /* synthetic */ int craftingOption;
    private final /* synthetic */ int materialID;
    public static final /* synthetic */ /* enum */ l YEW_SHIELD;
    private static final /* synthetic */ l[] $VALUES;
    private static /* synthetic */ int[] lllIIllllll;
    public static final /* synthetic */ /* enum */ l OAK_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l OAK_SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l ARROW_SHAFT;
    public static final /* synthetic */ /* enum */ l MAGIC_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l YEW_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l JAVELIN_SHAFT;
    public static final /* synthetic */ /* enum */ l OAK_SHIELD;
    private static /* synthetic */ String[] lllIIlllllI;
    public static final /* synthetic */ /* enum */ l MAGIC_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l WILLOW_SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l YEW_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l REDWOOD_SHIELD;
    public static final /* synthetic */ /* enum */ l SHORTBOW_U;
    public static final /* synthetic */ /* enum */ l WILLOW_CROSSBOW_STOCK;
    public static final /* synthetic */ /* enum */ l MAPLE_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l WILLOW_SHIELD;
    public static final /* synthetic */ /* enum */ l MAGIC_SHIELD;
    public static final /* synthetic */ /* enum */ l WILLOW_LONGBOW_U;
    public static final /* synthetic */ /* enum */ l MAPLE_SHORTBOW_U;

    private static String lIlIlllIllIIll(String llllllllllllllllIIlIIllIllIlIlll, String llllllllllllllllIIlIIllIllIlIllI) {
        llllllllllllllllIIlIIllIllIlIlll = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIllIllIlIlIl = new StringBuilder();
        char[] llllllllllllllllIIlIIllIllIlIlII = llllllllllllllllIIlIIllIllIlIllI.toCharArray();
        int llllllllllllllllIIlIIllIllIlIIll = lllIIllllll[0];
        char[] llllllllllllllllIIlIIllIllIIllIl = llllllllllllllllIIlIIllIllIlIlll.toCharArray();
        int llllllllllllllllIIlIIllIllIIllII = llllllllllllllllIIlIIllIllIIllIl.length;
        int llllllllllllllllIIlIIllIllIIlIll = lllIIllllll[0];
        while (l.lIlIlllIllIlll(llllllllllllllllIIlIIllIllIIlIll, llllllllllllllllIIlIIllIllIIllII)) {
            char llllllllllllllllIIlIIllIllIllIII = llllllllllllllllIIlIIllIllIIllIl[llllllllllllllllIIlIIllIllIIlIll];
            llllllllllllllllIIlIIllIllIlIlIl.append((char)(llllllllllllllllIIlIIllIllIllIII ^ llllllllllllllllIIlIIllIllIlIlII[llllllllllllllllIIlIIllIllIlIIll % llllllllllllllllIIlIIllIllIlIlII.length]));
            "".length();
            ++llllllllllllllllIIlIIllIllIlIIll;
            ++llllllllllllllllIIlIIllIllIIlIll;
            "".length();
            if (((149 + 36 - 166 + 132 ^ 109 + 52 - 96 + 70) & (0x19 ^ 0x3A ^ (0x73 ^ 0x40) ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIllIllIlIlIl);
    }

    public boolean G() {
        return this.name().endsWith(lllIIlllllI[lllIIllllll[0]]);
    }

    public int z() {
        return this.materialID;
    }

    private static String lIlIlllIllIlII(String llllllllllllllllIIlIIllIllIIIIII, String llllllllllllllllIIlIIllIllIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), lllIIllllll[17]), "DES");
            Cipher llllllllllllllllIIlIIllIllIIIlII = Cipher.getInstance("DES");
            llllllllllllllllIIlIIllIllIIIlII.init(lllIIllllll[4], llllllllllllllllIIlIIllIllIIIlIl);
            return new String(llllllllllllllllIIlIIllIllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIllIIIIll) {
            llllllllllllllllIIlIIllIllIIIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIlllIllIllI() {
        lllIIllllll = new int[61];
        l.lllIIllllll[0] = (0xD9 ^ 0xC6 ^ "  ".length()) & (0xCD ^ 0xBD ^ (0x17 ^ 0x7A) ^ -" ".length());
        l.lllIIllllll[1] = " ".length();
        l.lllIIllllll[2] = -(0xFFFFFF5B & 0x42AD) & (0xFFFFF7FF & 0x4FEF);
        l.lllIIllllll[3] = 0xE ^ 0x3A;
        l.lllIIllllll[4] = "  ".length();
        l.lllIIllllll[5] = -(0xFFFFB5EF & 0x7A54) & (0xFFFFFCDB & 0x7FE7);
        l.lllIIllllll[6] = "   ".length();
        l.lllIIllllll[7] = 0x74 ^ 0x46;
        l.lllIIllllll[8] = 0x38 ^ 0x3C;
        l.lllIIllllll[9] = 116 + 15 - 79 + 103 ^ 110 + 116 - 104 + 49;
        l.lllIIllllll[10] = 0x51 ^ 0x54;
        l.lllIIllllll[11] = 0xFFFFFEEB & 0x25F4;
        l.lllIIllllll[12] = 140 + 85 - 134 + 72 ^ 20 + 60 - 53 + 138;
        l.lllIIllllll[13] = -(0xFFFFDECD & 0x7137) & (0xFFFFFDFF & 0x57F5);
        l.lllIIllllll[14] = 0xF0 ^ 0xC6;
        l.lllIIllllll[15] = 0x56 ^ 0xE ^ (0x31 ^ 0x6E);
        l.lllIIllllll[16] = 0x4D ^ 0x75;
        l.lllIIllllll[17] = 0xA6 ^ 0xAE;
        l.lllIIllllll[18] = 0xFFFFAEF6 & 0x75EB;
        l.lllIIllllll[19] = 0x6F ^ 0x66;
        l.lllIIllllll[20] = -(0xFFFFEB3F & 0x1DC5) & (0xFFFFDFFF & 0x7FEF);
        l.lllIIllllll[21] = 0x9D ^ 0x9B ^ (0x2A ^ 0x26);
        l.lllIIllllll[22] = -(0xFFFFF629 & 0x2BD7) & (0xFFFFE7EF & 0x3FFF);
        l.lllIIllllll[23] = 0x7A ^ 0x46;
        l.lllIIllllll[24] = 0x53 ^ 9 ^ (0x60 ^ 0x31);
        l.lllIIllllll[25] = 198 + 91 - 72 + 35 ^ 178 + 158 - 302 + 164;
        l.lllIIllllll[26] = 0x50 ^ 0x5C;
        l.lllIIllllll[27] = -(0xFFFFFB8E & 0x5C7D) & (0xFFFFFEFF & 0x7DEF);
        l.lllIIllllll[28] = 2 ^ 0xF;
        l.lllIIllllll[29] = 0xFFFFF7EE & 0x5EFF;
        l.lllIIllllll[30] = 0xA0 ^ 0x97 ^ (0x7B ^ 0x42);
        l.lllIIllllll[31] = -(0xFFFFA8F1 & 0x5F0F) & (0xFFFF8DFD & 0x7FEF);
        l.lllIIllllll[32] = 0x22 ^ 0x7D ^ (0x69 ^ 0x76);
        l.lllIIllllll[33] = 1 ^ 0xE;
        l.lllIIllllll[34] = 0x2A ^ 0x78 ^ (0x4F ^ 0x23);
        l.lllIIllllll[35] = 0x48 ^ 0x58;
        l.lllIIllllll[36] = -(0xFFFFDF4B & 0x79BC) & (0xFFFFFFFF & 0x7DEF);
        l.lllIIllllll[37] = 130 + 177 - 110 + 11 ^ 93 + 88 - 124 + 136;
        l.lllIIllllll[38] = 0xFFFFFEF5 & 0x57FB;
        l.lllIIllllll[39] = 0x14 ^ 0x18 ^ (0x8B ^ 0x95);
        l.lllIIllllll[40] = -(0xFFFFFACF & 0x5D35) & (0xFFFFDDEF & Short.MAX_VALUE);
        l.lllIIllllll[41] = 0x42 ^ 0xA ^ (3 ^ 0xF);
        l.lllIIllllll[42] = 0x18 ^ 0xB;
        l.lllIIllllll[43] = 0xE3 ^ 0x91 ^ (1 ^ 0x31);
        l.lllIIllllll[44] = 0x74 ^ 0x38 ^ (0xC8 ^ 0x90);
        l.lllIIllllll[45] = 0xFFFFEDFE & 0x36ED;
        l.lllIIllllll[46] = 0x9C ^ 0x89;
        l.lllIIllllll[47] = 0xFFFFDEFC & 0x77F7;
        l.lllIIllllll[48] = 0xB ^ 0x49 ^ (0x30 ^ 0x64);
        l.lllIIllllll[49] = -(0xFFFFFAC7 & 0x7F3B) & (0xFFFFFFFB & 0x7FEF);
        l.lllIIllllll[50] = 0xA9 ^ 0xA4 ^ (0x41 ^ 4);
        l.lllIIllllll[51] = 87 + 25 - 64 + 128 ^ 115 + 65 - 79 + 66;
        l.lllIIllllll[52] = 0x57 ^ 0x11;
        l.lllIIllllll[53] = 0xF2 ^ 0xB4 ^ (0xD8 ^ 0x86);
        l.lllIIllllll[54] = 0xFFFFDDD1 & 0x77EE;
        l.lllIIllllll[55] = 0x53 ^ 0x6A ^ (0xE2 ^ 0xC2);
        l.lllIIllllll[56] = -(0xFFFFA323 & 0x7DDD) & (0xFFFFF7F7 & Short.MAX_VALUE);
        l.lllIIllllll[57] = 0x3D ^ 0x30 ^ (0x3D ^ 0x2A);
        l.lllIIllllll[58] = 0xFFFFDEFF & 0x6DD5;
        l.lllIIllllll[59] = 0xFFFFD7FA & 0x7EFF;
        l.lllIIllllll[60] = 0x10 ^ 0xB;
    }

    private static boolean lIlIlllIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    public int E() {
        return this.finishedID;
    }

    public static l[] values() {
        return (l[])$VALUES.clone();
    }

    private static String lIlIlllIllIIlI(String llllllllllllllllIIlIIllIlllIIlll, String llllllllllllllllIIlIIllIlllIIlII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIllIlllIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIllIlllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIllIlllIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIllIlllIlIIl.init(lllIIllllll[4], llllllllllllllllIIlIIllIlllIlIlI);
            return new String(llllllllllllllllIIlIIllIlllIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIllIlllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIllIlllIlIII) {
            llllllllllllllllIIlIIllIlllIlIII.printStackTrace();
            return null;
        }
    }

    public static l valueOf(String string) {
        return Enum.valueOf(l.class, string);
    }

    private l(int n3, int n4, int n5) {
        this.materialID = n3;
        this.finishedID = n4;
        this.craftingOption = n5;
    }

    private static void lIlIlllIllIlIl() {
        lllIIlllllI = new String[lllIIllllll[60]];
        l.lllIIlllllI[l.lllIIllllll[0]] = l.lIlIlllIllIIlI("63eREJuhiO8=", "WLmyI");
        l.lllIIlllllI[l.lllIIllllll[1]] = l.lIlIlllIllIIll("KhoEDD80Gx4CLj8=", "kHVCh");
        l.lllIIlllllI[l.lllIIllllll[4]] = l.lIlIlllIllIIlI("FsVIl1TsBpC4Nc6ygXCV6w==", "vFeGW");
        l.lllIIlllllI[l.lllIIllllll[6]] = l.lIlIlllIllIIlI("4gRzy4YqbSuAa4cZ7iOM4Q==", "yvzAo");
        l.lllIIlllllI[l.lllIIllllll[8]] = l.lIlIlllIllIIlI("xDCEIUOJVl7jwXtZhxbNZg==", "NTtcF");
        l.lllIIlllllI[l.lllIIllllll[10]] = l.lIlIlllIllIIlI("JwZCwdCNK19+XDSKWTEZ3A==", "YFdMp");
        l.lllIIlllllI[l.lllIIllllll[12]] = l.lIlIlllIllIIll("BTAELysCPh0kOgUmECU=", "JqOpx");
        l.lllIIlllllI[l.lllIIllllll[15]] = l.lIlIlllIllIIlI("YgF1+UbMcMTULXp9Jg+iWQ==", "viyNF");
        l.lllIIlllllI[l.lllIIllllll[17]] = l.lIlIlllIllIlII("5xxPfCmMR7atWTHLYFKKxjm6JNv1+r93", "ibHzM");
        l.lllIIlllllI[l.lllIIllllll[19]] = l.lIlIlllIllIIlI("uxzaGcA76D3VbG1qJ58yuQ==", "mmLYT");
        l.lllIIlllllI[l.lllIIllllll[21]] = l.lIlIlllIllIIll("JzA0AgInJisGAiItOgEaLyw=", "pyxNM");
        l.lllIIlllllI[l.lllIIllllll[24]] = l.lIlIlllIllIIlI("FqROyViSm6lR6DkhnOLFXpAMgfGJjfY2", "MvWwM");
        l.lllIIlllllI[l.lllIIllllll[26]] = l.lIlIlllIllIIll("PC4mKyI8OCk1Ijg0KCg6NDQ+KC4g", "kgjgm");
        l.lllIIlllllI[l.lllIIllllll[28]] = l.lIlIlllIllIIlI("H/76zcQlZrvHP9rnaX91vQ==", "LiJpy");
        l.lllIIlllllI[l.lllIIllllll[30]] = l.lIlIlllIllIIlI("twty1nbfJX5ZrwSq0/bTBBp6ihS+u5j8", "jSOBG");
        l.lllIIlllllI[l.lllIIllllll[33]] = l.lIlIlllIllIIlI("8qUf7B5HouYuQR5J69gYQA==", "vHYAZ");
        l.lllIIlllllI[l.lllIIllllll[35]] = l.lIlIlllIllIlII("pFCq54iNm0ixQeBzlTmO6OnRLRmeqg9v", "QnsNf");
        l.lllIIlllllI[l.lllIIllllll[37]] = l.lIlIlllIllIIlI("x39qUSF/mk6vAlWdspidow==", "cBisX");
        l.lllIIlllllI[l.lllIIllllll[39]] = l.lIlIlllIllIlII("8tq1N6pzTkzfBKupv4xXXg==", "OvUzo");
        l.lllIIlllllI[l.lllIIllllll[42]] = l.lIlIlllIllIIlI("Y4JGrQg/Bsj9RXwRRMcSPA==", "buwnw");
        l.lllIIlllllI[l.lllIIllllll[44]] = l.lIlIlllIllIIlI("1sgTVfdVTTK9XAqQrw9GcdJj9T0jqPQU", "AcYfI");
        l.lllIIlllllI[l.lllIIllllll[46]] = l.lIlIlllIllIIlI("b4FtSSJO6zu+6hE8ICUedQ==", "MjWka");
        l.lllIIlllllI[l.lllIIllllll[48]] = l.lIlIlllIllIlII("MDVlhVS1O44p1dQyBiErtAv5e3+DW7ED", "mEqiP");
        l.lllIIlllllI[l.lllIIllllll[51]] = l.lIlIlllIllIlII("bYdjSahSM3YIviX43Axi+w==", "LICEr");
        l.lllIIlllllI[l.lllIIllllll[53]] = l.lIlIlllIllIIlI("MF8681Yh/vem2friS4HA2QSpTnOY5E7L", "kRZfv");
        l.lllIIlllllI[l.lllIIllllll[55]] = l.lIlIlllIllIIlI("HkmEVxnizGbAOTEZp/PVXQ==", "gckmY");
        l.lllIIlllllI[l.lllIIllllll[57]] = l.lIlIlllIllIlII("MsIWbIzVAZmjsgSLLh0BXA==", "zSMYJ");
    }

    static {
        l.lIlIlllIllIllI();
        l.lIlIlllIllIlIl();
        ARROW_SHAFT = new l(lllIIllllll[2], lllIIllllll[3], lllIIllllll[1]);
        JAVELIN_SHAFT = new l(lllIIllllll[2], lllIIllllll[5], lllIIllllll[4]);
        SHORTBOW_U = new l(lllIIllllll[2], lllIIllllll[7], lllIIllllll[6]);
        LONGBOW_U = new l(lllIIllllll[2], lllIIllllll[9], lllIIllllll[8]);
        CROSSBOW_STOCK = new l(lllIIllllll[2], lllIIllllll[11], lllIIllllll[10]);
        OAK_SHORTBOW_U = new l(lllIIllllll[13], lllIIllllll[14], lllIIllllll[4]);
        OAK_LONGBOW_U = new l(lllIIllllll[13], lllIIllllll[16], lllIIllllll[6]);
        OAK_CROSSBOW_STOCK = new l(lllIIllllll[13], lllIIllllll[18], lllIIllllll[8]);
        OAK_SHIELD = new l(lllIIllllll[13], lllIIllllll[20], lllIIllllll[10]);
        WILLOW_SHORTBOW_U = new l(lllIIllllll[22], lllIIllllll[23], lllIIllllll[4]);
        WILLOW_LONGBOW_U = new l(lllIIllllll[22], lllIIllllll[25], lllIIllllll[6]);
        WILLOW_CROSSBOW_STOCK = new l(lllIIllllll[22], lllIIllllll[27], lllIIllllll[8]);
        WILLOW_SHIELD = new l(lllIIllllll[22], lllIIllllll[29], lllIIllllll[10]);
        MAPLE_SHORTBOW_U = new l(lllIIllllll[31], lllIIllllll[32], lllIIllllll[4]);
        MAPLE_LONGBOW_U = new l(lllIIllllll[31], lllIIllllll[34], lllIIllllll[6]);
        MAPLE_CROSSBOW_STOCK = new l(lllIIllllll[31], lllIIllllll[36], lllIIllllll[8]);
        MAPLE_SHIELD = new l(lllIIllllll[31], lllIIllllll[38], lllIIllllll[10]);
        YEW_SHORTBOW_U = new l(lllIIllllll[40], lllIIllllll[41], lllIIllllll[4]);
        YEW_LONGBOW_U = new l(lllIIllllll[40], lllIIllllll[43], lllIIllllll[6]);
        YEW_CROSSBOW_STOCK = new l(lllIIllllll[40], lllIIllllll[45], lllIIllllll[8]);
        YEW_SHIELD = new l(lllIIllllll[40], lllIIllllll[47], lllIIllllll[10]);
        MAGIC_SHORTBOW_U = new l(lllIIllllll[49], lllIIllllll[50], lllIIllllll[4]);
        MAGIC_LONGBOW_U = new l(lllIIllllll[49], lllIIllllll[52], lllIIllllll[6]);
        MAGIC_CROSSBOW_STOCK = new l(lllIIllllll[49], lllIIllllll[54], lllIIllllll[8]);
        MAGIC_SHIELD = new l(lllIIllllll[49], lllIIllllll[56], lllIIllllll[10]);
        REDWOOD_SHIELD = new l(lllIIllllll[58], lllIIllllll[59], lllIIllllll[4]);
        l[] lArray = new l[lllIIllllll[57]];
        lArray[l.lllIIllllll[0]] = ARROW_SHAFT;
        lArray[l.lllIIllllll[1]] = JAVELIN_SHAFT;
        lArray[l.lllIIllllll[4]] = SHORTBOW_U;
        lArray[l.lllIIllllll[6]] = LONGBOW_U;
        lArray[l.lllIIllllll[8]] = CROSSBOW_STOCK;
        lArray[l.lllIIllllll[10]] = OAK_SHORTBOW_U;
        lArray[l.lllIIllllll[12]] = OAK_LONGBOW_U;
        lArray[l.lllIIllllll[15]] = OAK_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[17]] = OAK_SHIELD;
        lArray[l.lllIIllllll[19]] = WILLOW_SHORTBOW_U;
        lArray[l.lllIIllllll[21]] = WILLOW_LONGBOW_U;
        lArray[l.lllIIllllll[24]] = WILLOW_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[26]] = WILLOW_SHIELD;
        lArray[l.lllIIllllll[28]] = MAPLE_SHORTBOW_U;
        lArray[l.lllIIllllll[30]] = MAPLE_LONGBOW_U;
        lArray[l.lllIIllllll[33]] = MAPLE_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[35]] = MAPLE_SHIELD;
        lArray[l.lllIIllllll[37]] = YEW_SHORTBOW_U;
        lArray[l.lllIIllllll[39]] = YEW_LONGBOW_U;
        lArray[l.lllIIllllll[42]] = YEW_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[44]] = YEW_SHIELD;
        lArray[l.lllIIllllll[46]] = MAGIC_SHORTBOW_U;
        lArray[l.lllIIllllll[48]] = MAGIC_LONGBOW_U;
        lArray[l.lllIIllllll[51]] = MAGIC_CROSSBOW_STOCK;
        lArray[l.lllIIllllll[53]] = MAGIC_SHIELD;
        lArray[l.lllIIllllll[55]] = REDWOOD_SHIELD;
        $VALUES = lArray;
    }

    public int C() {
        return this.craftingOption;
    }
}

