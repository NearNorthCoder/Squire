package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.h  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/h.class */
public final class EnumC0007h {
    public static final /* synthetic */ EnumC0007h ZULANDRA_TELEPORT;
    public static final /* synthetic */ EnumC0007h CONSTRUCTION_CAPE;
    private static final /* synthetic */ EnumC0007h[] $VALUES;
    public static final /* synthetic */ EnumC0007h ARDOUGNE_CLOAK;
    private static /* synthetic */ int[] lIllIlllIIlll;
    public static final /* synthetic */ EnumC0007h QUEST_CAPE;
    public static final /* synthetic */ EnumC0007h HOUSE_TELEPORT;
    public static final /* synthetic */ EnumC0007h EXPLORERS_RING;
    public static final /* synthetic */ EnumC0007h RING_OF_DUELING;
    public static final /* synthetic */ EnumC0007h MAX_CAPE;
    public static final /* synthetic */ EnumC0007h ROYAL_SEED_POD;
    public static final /* synthetic */ EnumC0007h ECTOPHIAL;
    public static final /* synthetic */ EnumC0007h FISHING_CAPE;
    public static final /* synthetic */ EnumC0007h AMULET_OF_GLORY;
    public static final /* synthetic */ EnumC0007h CRAFTING_CAPE;
    private /* synthetic */ int[] itemID;
    private /* synthetic */ boolean mustBeEquipped;
    private /* synthetic */ String teleportOption;
    public static final /* synthetic */ EnumC0007h RADAS_BLESSING;
    private static /* synthetic */ String[] lIllIllIllllI;

    private EnumC0007h(String str, int i, String str2, int... iArr) {
        this.itemID = iArr;
        this.teleportOption = str2;
    }

    public String s() {
        return this.teleportOption;
    }

    private static boolean llIIlIIlIlllllI(int i, int i2) {
        return i < i2;
    }

    private static String llIIlIIlIlIllll(String llllllllllllllIllIIIlIIlIllIIlll, String llllllllllllllIllIIIlIIlIllIIllI) {
        String llllllllllllllIllIIIlIIlIllIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIIIlIIlIllIIlII = llllllllllllllIllIIIlIIlIllIIllI.toCharArray();
        int llllllllllllllIllIIIlIIlIllIIIll = lIllIlllIIlll[0];
        char[] charArray = llllllllllllllIllIIIlIIlIllIIlll2.toCharArray();
        int llllllllllllllIllIIIlIIlIlIlllII = charArray.length;
        int i = lIllIlllIIlll[0];
        while (llIIlIIlIlllllI(i, llllllllllllllIllIIIlIIlIlIlllII)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIIIlIIlIllIIlII[llllllllllllllIllIIIlIIlIllIIIll % llllllllllllllIllIIIlIIlIllIIlII.length]));
            "".length();
            llllllllllllllIllIIIlIIlIllIIIll++;
            i++;
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static EnumC0007h[] values() {
        return (EnumC0007h[]) $VALUES.clone();
    }

    private static void llIIlIIlIllllIl() {
        lIllIlllIIlll = new int[65];
        lIllIlllIIlll[0] = "  ".length() & ("  ".length() ^ (-" ".length()));
        lIllIlllIIlll[1] = " ".length();
        lIllIlllIIlll[2] = 30 ^ 22;
        lIllIlllIIlll[3] = (-((-16198) & 32719)) & (-4401) & 23487;
        lIllIlllIIlll[4] = (-((-3667) & 32638)) & (-145) & 31679;
        lIllIlllIIlll[5] = "  ".length();
        lIllIlllIIlll[6] = (-((-1570) & 5879)) & (-16681) & 23551;
        lIllIlllIIlll[7] = "   ".length();
        lIllIlllIIlll[8] = (-((-28938) & 30157)) & (-4413) & 8191;
        lIllIlllIIlll[9] = (204 ^ 138) ^ (231 ^ 165);
        lIllIlllIIlll[10] = (-5121) & 7678;
        lIllIlllIIlll[11] = 105 ^ 108;
        lIllIlllIIlll[12] = (-16898) & 19453;
        lIllIlllIIlll[13] = 139 ^ 141;
        lIllIlllIIlll[14] = (-21510) & 24063;
        lIllIlllIIlll[15] = (251 ^ 179) ^ (253 ^ 178);
        lIllIlllIIlll[16] = (-9731) & 12282;
        lIllIlllIIlll[17] = (-18442) & 31563;
        lIllIlllIIlll[18] = (-17) & 13139;
        lIllIlllIIlll[19] = (-((-13189) & 31663)) & (-17) & 31614;
        lIllIlllIIlll[20] = (-((-13) & 29022)) & (-2053) & 32767;
        lIllIlllIIlll[21] = (-31043) & 32750;
        lIllIlllIIlll[22] = (-((-16633) & 18681)) & (-20753) & 24510;
        lIllIlllIIlll[23] = (-20749) & 22460;
        lIllIlllIIlll[24] = (-((-613) & 17271)) & (-33) & 28666;
        lIllIlllIIlll[25] = (-33) & 12010;
        lIllIlllIIlll[26] = (-((-17529) & 22397)) & (-8193) & 32767;
        lIllIlllIIlll[27] = (-((-3555) & 12287)) & (-1) & 31679;
        lIllIlllIIlll[28] = 124 ^ 117;
        lIllIlllIIlll[29] = (-8209) & 16221;
        lIllIlllIIlll[30] = 58 ^ 48;
        lIllIlllIIlll[31] = 117 ^ 126;
        lIllIlllIIlll[32] = (-19798) & 32735;
        lIllIlllIIlll[33] = (44 ^ 89) ^ (230 ^ 159);
        lIllIlllIIlll[34] = (59 ^ 120) ^ (120 ^ 54);
        lIllIlllIIlll[35] = (-12418) & 31981;
        lIllIlllIIlll[36] = 11 ^ 5;
        lIllIlllIIlll[37] = 18 ^ 29;
        lIllIlllIIlll[38] = (-((-131) & 26531)) & (-2053) & 32703;
        lIllIlllIIlll[39] = 190 ^ 174;
        lIllIlllIIlll[40] = (((114 + 152) - 171) + 85) ^ (((126 + 77) - 85) + 47);
        lIllIlllIIlll[41] = (-((-1053) & 7391)) & (-257) & 16383;
        lIllIlllIIlll[42] = (-((-4909) & 7150)) & (-16385) & 28415;
        lIllIlllIIlll[43] = (192 ^ 181) ^ (104 ^ 15);
        lIllIlllIIlll[44] = 214 ^ 197;
        lIllIlllIIlll[45] = (-6315) & 16127;
        lIllIlllIIlll[46] = (-((-12723) & 32179)) & (-196) & 32719;
        lIllIlllIIlll[47] = 131 ^ 151;
        lIllIlllIIlll[48] = (247 ^ 172) ^ (222 ^ 144);
        lIllIlllIIlll[49] = (-2914) & 16255;
        lIllIlllIIlll[50] = (-((-15625) & 32043)) & (-837) & 30591;
        lIllIlllIIlll[51] = (-54) & 21951;
        lIllIlllIIlll[52] = 58 ^ 44;
        lIllIlllIIlll[53] = 28 ^ 11;
        lIllIlllIIlll[54] = (-((-27684) & 32239)) & (-16385) & 30719;
        lIllIlllIIlll[55] = (-((-7729) & 24571)) & (-6145) & 32767;
        lIllIlllIIlll[56] = (125 ^ 61) ^ (125 ^ 37);
        lIllIlllIIlll[57] = (((109 + 110) - 193) + 134) ^ (((172 + 84) - 71) + 0);
        lIllIlllIIlll[58] = (-18450) & 28247;
        lIllIlllIIlll[59] = (-(((71 + 56) - 4) + 62)) & (-6145) & 16127;
        lIllIlllIIlll[60] = 183 ^ 173;
        lIllIlllIIlll[61] = (((181 + 49) - 210) + 169) ^ (((90 + 135) - 106) + 47);
        lIllIlllIIlll[62] = (-((-30339) & 32411)) & (-16417) & 31615;
        lIllIlllIIlll[63] = (-(((105 + 56) - 155) + 130)) & (-2081) & 15343;
        lIllIlllIIlll[64] = 55 ^ 43;
    }

    private static String llIIlIIlIlIlIlI(String llllllllllllllIllIIIlIIlIlIlIIlI, String llllllllllllllIllIIIlIIlIlIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIlllIIlll[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIlIlIlIIll) {
            llllllllllllllIllIIIlIIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    public static EnumC0007h valueOf(String str) {
        return (EnumC0007h) Enum.valueOf(EnumC0007h.class, str);
    }

    public int[] u() {
        return this.itemID;
    }

    private static String llIIlIIlIllIIII(String llllllllllllllIllIIIlIIlIlIIIlIl, String llllllllllllllIllIIIlIIlIlIIIlII) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIlIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), lIllIlllIIlll[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlllIIlll[5], llllllllllllllIllIIIlIIlIlIIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIIlIIlIlIIIllI) {
            llllllllllllllIllIIIlIIlIlIIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    static {
        llIIlIIlIllllIl();
        llIIlIIlIlllIII();
        String str = lIllIllIllllI[lIllIlllIIlll[0]];
        int i = lIllIlllIIlll[0];
        String str2 = lIllIllIllllI[lIllIlllIIlll[1]];
        ?? r5 = lIllIlllIIlll[1];
        int[] iArr = new int[lIllIlllIIlll[2]];
        iArr[lIllIlllIIlll[0]] = lIllIlllIIlll[3];
        iArr[lIllIlllIIlll[1]] = lIllIlllIIlll[4];
        iArr[lIllIlllIIlll[5]] = lIllIlllIIlll[6];
        iArr[lIllIlllIIlll[7]] = lIllIlllIIlll[8];
        iArr[lIllIlllIIlll[9]] = lIllIlllIIlll[10];
        iArr[lIllIlllIIlll[11]] = lIllIlllIIlll[12];
        iArr[lIllIlllIIlll[13]] = lIllIlllIIlll[14];
        iArr[lIllIlllIIlll[15]] = lIllIlllIIlll[16];
        RING_OF_DUELING = new EnumC0007h(str, i, str2, r5, iArr);
        String str3 = lIllIllIllllI[lIllIlllIIlll[5]];
        int i2 = lIllIlllIIlll[1];
        String str4 = lIllIllIllllI[lIllIlllIIlll[7]];
        int[] iArr2 = new int[lIllIlllIIlll[7]];
        iArr2[lIllIlllIIlll[0]] = lIllIlllIIlll[17];
        iArr2[lIllIlllIIlll[1]] = lIllIlllIIlll[18];
        iArr2[lIllIlllIIlll[5]] = lIllIlllIIlll[19];
        ARDOUGNE_CLOAK = new EnumC0007h(str3, i2, str4, iArr2);
        String str5 = lIllIllIllllI[lIllIlllIIlll[9]];
        int i3 = lIllIlllIIlll[5];
        String str6 = lIllIllIllllI[lIllIlllIIlll[11]];
        ?? r52 = lIllIlllIIlll[1];
        int[] iArr3 = new int[lIllIlllIIlll[15]];
        iArr3[lIllIlllIIlll[0]] = lIllIlllIIlll[20];
        iArr3[lIllIlllIIlll[1]] = lIllIlllIIlll[21];
        iArr3[lIllIlllIIlll[5]] = lIllIlllIIlll[22];
        iArr3[lIllIlllIIlll[7]] = lIllIlllIIlll[23];
        iArr3[lIllIlllIIlll[9]] = lIllIlllIIlll[24];
        iArr3[lIllIlllIIlll[11]] = lIllIlllIIlll[25];
        iArr3[lIllIlllIIlll[13]] = lIllIlllIIlll[26];
        AMULET_OF_GLORY = new EnumC0007h(str5, i3, str6, r52, iArr3);
        String str7 = lIllIllIllllI[lIllIlllIIlll[13]];
        int i4 = lIllIlllIIlll[7];
        String str8 = lIllIllIllllI[lIllIlllIIlll[15]];
        ?? r53 = lIllIlllIIlll[1];
        int[] iArr4 = new int[lIllIlllIIlll[1]];
        iArr4[lIllIlllIIlll[0]] = lIllIlllIIlll[27];
        RADAS_BLESSING = new EnumC0007h(str7, i4, str8, r53, iArr4);
        String str9 = lIllIllIllllI[lIllIlllIIlll[2]];
        int i5 = lIllIlllIIlll[9];
        String str10 = lIllIllIllllI[lIllIlllIIlll[28]];
        int[] iArr5 = new int[lIllIlllIIlll[1]];
        iArr5[lIllIlllIIlll[0]] = lIllIlllIIlll[29];
        HOUSE_TELEPORT = new EnumC0007h(str9, i5, str10, iArr5);
        String str11 = lIllIllIllllI[lIllIlllIIlll[30]];
        int i6 = lIllIlllIIlll[11];
        String str12 = lIllIllIllllI[lIllIlllIIlll[31]];
        int[] iArr6 = new int[lIllIlllIIlll[1]];
        iArr6[lIllIlllIIlll[0]] = lIllIlllIIlll[32];
        ZULANDRA_TELEPORT = new EnumC0007h(str11, i6, str12, iArr6);
        String str13 = lIllIllIllllI[lIllIlllIIlll[33]];
        int i7 = lIllIlllIIlll[13];
        String str14 = lIllIllIllllI[lIllIlllIIlll[34]];
        int[] iArr7 = new int[lIllIlllIIlll[1]];
        iArr7[lIllIlllIIlll[0]] = lIllIlllIIlll[35];
        ROYAL_SEED_POD = new EnumC0007h(str13, i7, str14, iArr7);
        String str15 = lIllIllIllllI[lIllIlllIIlll[36]];
        int i8 = lIllIlllIIlll[15];
        String str16 = lIllIllIllllI[lIllIlllIIlll[37]];
        int[] iArr8 = new int[lIllIlllIIlll[1]];
        iArr8[lIllIlllIIlll[0]] = lIllIlllIIlll[38];
        ECTOPHIAL = new EnumC0007h(str15, i8, str16, iArr8);
        String str17 = lIllIllIllllI[lIllIlllIIlll[39]];
        int i9 = lIllIlllIIlll[2];
        String str18 = lIllIllIllllI[lIllIlllIIlll[40]];
        int[] iArr9 = new int[lIllIlllIIlll[5]];
        iArr9[lIllIlllIIlll[0]] = lIllIlllIIlll[41];
        iArr9[lIllIlllIIlll[1]] = lIllIlllIIlll[42];
        CONSTRUCTION_CAPE = new EnumC0007h(str17, i9, str18, iArr9);
        String str19 = lIllIllIllllI[lIllIlllIIlll[43]];
        int i10 = lIllIlllIIlll[28];
        String str20 = lIllIllIllllI[lIllIlllIIlll[44]];
        int[] iArr10 = new int[lIllIlllIIlll[5]];
        iArr10[lIllIlllIIlll[0]] = lIllIlllIIlll[45];
        iArr10[lIllIlllIIlll[1]] = lIllIlllIIlll[46];
        QUEST_CAPE = new EnumC0007h(str19, i10, str20, iArr10);
        String str21 = lIllIllIllllI[lIllIlllIIlll[47]];
        int i11 = lIllIlllIIlll[30];
        String str22 = lIllIllIllllI[lIllIlllIIlll[48]];
        int[] iArr11 = new int[lIllIlllIIlll[7]];
        iArr11[lIllIlllIIlll[0]] = lIllIlllIIlll[49];
        iArr11[lIllIlllIIlll[1]] = lIllIlllIIlll[50];
        iArr11[lIllIlllIIlll[5]] = lIllIlllIIlll[51];
        MAX_CAPE = new EnumC0007h(str21, i11, str22, iArr11);
        String str23 = lIllIllIllllI[lIllIlllIIlll[52]];
        int i12 = lIllIlllIIlll[31];
        String str24 = lIllIllIllllI[lIllIlllIIlll[53]];
        int[] iArr12 = new int[lIllIlllIIlll[5]];
        iArr12[lIllIlllIIlll[0]] = lIllIlllIIlll[54];
        iArr12[lIllIlllIIlll[1]] = lIllIlllIIlll[55];
        CRAFTING_CAPE = new EnumC0007h(str23, i12, str24, iArr12);
        String str25 = lIllIllIllllI[lIllIlllIIlll[56]];
        int i13 = lIllIlllIIlll[33];
        String str26 = lIllIllIllllI[lIllIlllIIlll[57]];
        int[] iArr13 = new int[lIllIlllIIlll[5]];
        iArr13[lIllIlllIIlll[0]] = lIllIlllIIlll[58];
        iArr13[lIllIlllIIlll[1]] = lIllIlllIIlll[59];
        FISHING_CAPE = new EnumC0007h(str25, i13, str26, iArr13);
        String str27 = lIllIllIllllI[lIllIlllIIlll[60]];
        int i14 = lIllIlllIIlll[34];
        String str28 = lIllIllIllllI[lIllIlllIIlll[61]];
        int[] iArr14 = new int[lIllIlllIIlll[5]];
        iArr14[lIllIlllIIlll[0]] = lIllIlllIIlll[62];
        iArr14[lIllIlllIIlll[1]] = lIllIlllIIlll[63];
        EXPLORERS_RING = new EnumC0007h(str27, i14, str28, iArr14);
        EnumC0007h[] enumC0007hArr = new EnumC0007h[lIllIlllIIlll[36]];
        enumC0007hArr[lIllIlllIIlll[0]] = RING_OF_DUELING;
        enumC0007hArr[lIllIlllIIlll[1]] = ARDOUGNE_CLOAK;
        enumC0007hArr[lIllIlllIIlll[5]] = AMULET_OF_GLORY;
        enumC0007hArr[lIllIlllIIlll[7]] = RADAS_BLESSING;
        enumC0007hArr[lIllIlllIIlll[9]] = HOUSE_TELEPORT;
        enumC0007hArr[lIllIlllIIlll[11]] = ZULANDRA_TELEPORT;
        enumC0007hArr[lIllIlllIIlll[13]] = ROYAL_SEED_POD;
        enumC0007hArr[lIllIlllIIlll[15]] = ECTOPHIAL;
        enumC0007hArr[lIllIlllIIlll[2]] = CONSTRUCTION_CAPE;
        enumC0007hArr[lIllIlllIIlll[28]] = QUEST_CAPE;
        enumC0007hArr[lIllIlllIIlll[30]] = MAX_CAPE;
        enumC0007hArr[lIllIlllIIlll[31]] = CRAFTING_CAPE;
        enumC0007hArr[lIllIlllIIlll[33]] = FISHING_CAPE;
        enumC0007hArr[lIllIlllIIlll[34]] = EXPLORERS_RING;
        $VALUES = enumC0007hArr;
    }

    private static void llIIlIIlIlllIII() {
        lIllIllIllllI = new String[lIllIlllIIlll[64]];
        lIllIllIllllI[lIllIlllIIlll[0]] = llIIlIIlIlIlIlI("waqg7Eq61EB/0PKKo8mUNw==", "Spgyq");
        lIllIllIllllI[lIllIlllIIlll[1]] = llIIlIIlIlIllll("AC0eOTpmDQI1Lic+CQ==", "FHlVB");
        lIllIllIllllI[lIllIlllIIlll[5]] = llIIlIIlIlIllll("NBwSGQwyABMJGjkBFx0=", "uNVVY");
        lIllIllIllllI[lIllIlllIIlll[7]] = llIIlIIlIlIllll("IQYKIj8YDBY6bDgMCCY8AxsQ", "lidCL");
        lIllIllIllllI[lIllIlllIIlll[9]] = llIIlIIlIlIllll("KTwnNQ08Lj0/Fy89PSsR", "hqryH");
        lIllIllIllllI[lIllIlllIIlll[11]] = llIIlIIlIlIllll("NgUlDiMaDS4O", "saBkU");
        lIllIllIllllI[lIllIlllIIlll[13]] = llIIlIIlIllIIII("ZNsVF1F0t2XrEUEhZVnZQw==", "ytqhs");
        lIllIllIllllI[lIllIlllIIlll[15]] = llIIlIIlIlIllll("NT0HPBhYGRMgGQ0+Hw==", "xRrRl");
        lIllIllIllllI[lIllIlllIIlll[2]] = llIIlIIlIlIllll("OwMfMD8sGA8vPyMDGDc=", "sLJcz");
        lIllIllIllllI[lIllIlllIIlll[28]] = llIIlIIlIlIlIlI("Xlum9xFQj88=", "ipKsp");
        lIllIllIllllI[lIllIlllIIlll[30]] = llIIlIIlIlIlIlI("K9QElG3MaBax08umro+bCCgPbyvwJ0Eq", "hHtiU");
        lIllIllIllllI[lIllIlllIIlll[31]] = llIIlIIlIllIIII("xHlg/7IjLoC9waOUnLBfSA==", "OopwX");
        lIllIllIllllI[lIllIlllIIlll[33]] = llIIlIIlIllIIII("YcfAqHzGjHfxePBGSOIXuw==", "fmDhH");
        lIllIllIllllI[lIllIlllIIlll[34]] = llIIlIIlIlIlIlI("SEEdX+My9RI=", "brPTB");
        lIllIllIllllI[lIllIlllIIlll[36]] = llIIlIIlIlIllll("LAYWBzUhDAME", "iEBHe");
        lIllIllIllllI[lIllIlllIIlll[37]] = llIIlIIlIlIllll("BhUUAhg=", "Cxdva");
        lIllIllIllllI[lIllIlllIIlll[39]] = llIIlIIlIlIlIlI("wiFkxNCw78cbVg84nx6vkULWoEgip0I7", "gPtCs");
        lIllIllIllllI[lIllIlllIIlll[40]] = llIIlIIlIllIIII("dERH4+NiDkqPxNfJXX9OPQ==", "MjHTq");
        lIllIllIllllI[lIllIlllIIlll[43]] = llIIlIIlIlIlIlI("DVPNMzbsZZqLBhiQ2iOgpg==", "kajJP");
        lIllIllIllllI[lIllIlllIIlll[44]] = llIIlIIlIllIIII("WQO1tqHsu0FDFMtQAOG2IQ==", "vkVvB");
        lIllIllIllllI[lIllIlllIIlll[47]] = llIIlIIlIllIIII("+uCIcVVOBsPDSBaaDiMozQ==", "Ruooy");
        lIllIllIllllI[lIllIlllIIlll[48]] = llIIlIIlIlIllll("FjEkK0U2O2geKgo=", "BTHNe");
        lIllIllIllllI[lIllIlllIIlll[52]] = llIIlIIlIllIIII("EwoSwmYjHpiZzNzsUvmCug==", "kSloe");
        lIllIllIllllI[lIllIlllIIlll[53]] = llIIlIIlIlIlIlI("hDFgAW0S1F+7NA3dZL8Abg==", "JfuEw");
        lIllIllIllllI[lIllIlllIIlll[56]] = llIIlIIlIlIllll("DwQCJj4HCg4tNhkI", "IMQnw");
        lIllIllIllllI[lIllIlllIIlll[57]] = llIIlIIlIlIllll("My81KRwbIWYGABwqIg==", "uFFAu");
        lIllIllIllllI[lIllIlllIIlll[60]] = llIIlIIlIlIllll("MBEeCT8nDBwWLycAAAI=", "uINEp");
        lIllIllIllllI[lIllIlllIIlll[61]] = llIIlIIlIlIllll("NgYgHBcNETg=", "bcLyg");
    }

    private EnumC0007h(String str, int i, String str2, boolean z, int... iArr) {
        this.itemID = iArr;
        this.mustBeEquipped = z;
        this.teleportOption = str2;
    }

    public boolean t() {
        return this.mustBeEquipped;
    }
}
