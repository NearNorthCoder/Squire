/*
 * Decompiled with CFR 0.152.
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class h
extends Enum<h> {
    public static final /* synthetic */ /* enum */ h ZULANDRA_TELEPORT;
    public static final /* synthetic */ /* enum */ h CONSTRUCTION_CAPE;
    private static final /* synthetic */ h[] $VALUES;
    public static final /* synthetic */ /* enum */ h ARDOUGNE_CLOAK;
    private static /* synthetic */ int[] lIllIlllIIlll;
    public static final /* synthetic */ /* enum */ h QUEST_CAPE;
    public static final /* synthetic */ /* enum */ h HOUSE_TELEPORT;
    public static final /* synthetic */ /* enum */ h EXPLORERS_RING;
    public static final /* synthetic */ /* enum */ h RING_OF_DUELING;
    public static final /* synthetic */ /* enum */ h MAX_CAPE;
    public static final /* synthetic */ /* enum */ h ROYAL_SEED_POD;
    public static final /* synthetic */ /* enum */ h ECTOPHIAL;
    public static final /* synthetic */ /* enum */ h FISHING_CAPE;
    public static final /* synthetic */ /* enum */ h AMULET_OF_GLORY;
    public static final /* synthetic */ /* enum */ h CRAFTING_CAPE;
    private /* synthetic */ int[] itemID;
    private /* synthetic */ boolean mustBeEquipped;
    private /* synthetic */ String teleportOption;
    public static final /* synthetic */ /* enum */ h RADAS_BLESSING;
    private static /* synthetic */ String[] lIllIllIllllI;

    private h(String string2, int ... nArray) {
        this.itemID = nArray;
        this.teleportOption = string2;
    }

    public String s() {
        return this.teleportOption;
    }

    private static boolean llIIlIIlIlllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIlIIlIlIllll(String llllllllllllllIllIIIlIIlIllIIIlI, String llllllllllllllIllIIIlIIlIllIIIIl) {
        llllllllllllllIllIIIlIIlIllIIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIIlIIlIllIIlIl = new StringBuilder();
        char[] llllllllllllllIllIIIlIIlIllIIlII = llllllllllllllIllIIIlIIlIllIIIIl.toCharArray();
        int llllllllllllllIllIIIlIIlIllIIIll = lIllIlllIIlll[0];
        char[] llllllllllllllIllIIIlIIlIlIlllIl = llllllllllllllIllIIIlIIlIllIIIlI.toCharArray();
        int llllllllllllllIllIIIlIIlIlIlllII = llllllllllllllIllIIIlIIlIlIlllIl.length;
        int llllllllllllllIllIIIlIIlIlIllIll = lIllIlllIIlll[0];
        while (h.llIIlIIlIlllllI(llllllllllllllIllIIIlIIlIlIllIll, llllllllllllllIllIIIlIIlIlIlllII)) {
            char llllllllllllllIllIIIlIIlIllIlIII = llllllllllllllIllIIIlIIlIlIlllIl[llllllllllllllIllIIIlIIlIlIllIll];
            llllllllllllllIllIIIlIIlIllIIlIl.append((char)(llllllllllllllIllIIIlIIlIllIlIII ^ llllllllllllllIllIIIlIIlIllIIlII[llllllllllllllIllIIIlIIlIllIIIll % llllllllllllllIllIIIlIIlIllIIlII.length]));
            "".length();
            ++llllllllllllllIllIIIlIIlIllIIIll;
            ++llllllllllllllIllIIIlIIlIlIllIll;
            "".length();
            if (-" ".length() < "  ".length()) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIIlIIlIllIIlIl);
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static void llIIlIIlIllllIl() {
        lIllIlllIIlll = new int[65];
        h.lIllIlllIIlll[0] = "  ".length() & ("  ".length() ^ -" ".length());
        h.lIllIlllIIlll[1] = " ".length();
        h.lIllIlllIIlll[2] = 0x1E ^ 0x16;
        h.lIllIlllIIlll[3] = -(0xFFFFC0BA & 0x7FCF) & (0xFFFFEECF & 0x5BBF);
        h.lIllIlllIIlll[4] = -(0xFFFFF1AD & 0x7F7E) & (0xFFFFFF6F & 0x7BBF);
        h.lIllIlllIIlll[5] = "  ".length();
        h.lIllIlllIIlll[6] = -(0xFFFFF9DE & 0x16F7) & (0xFFFFBED7 & 0x5BFF);
        h.lIllIlllIIlll[7] = "   ".length();
        h.lIllIlllIIlll[8] = -(0xFFFF8EF6 & 0x75CD) & (0xFFFFEEC3 & 0x1FFF);
        h.lIllIlllIIlll[9] = 0xCC ^ 0x8A ^ (0xE7 ^ 0xA5);
        h.lIllIlllIIlll[10] = 0xFFFFEBFF & 0x1DFE;
        h.lIllIlllIIlll[11] = 0x69 ^ 0x6C;
        h.lIllIlllIIlll[12] = 0xFFFFBDFE & 0x4BFD;
        h.lIllIlllIIlll[13] = 0x8B ^ 0x8D;
        h.lIllIlllIIlll[14] = 0xFFFFABFA & 0x5DFF;
        h.lIllIlllIIlll[15] = 0xFB ^ 0xB3 ^ (0xFD ^ 0xB2);
        h.lIllIlllIIlll[16] = 0xFFFFD9FD & 0x2FFA;
        h.lIllIlllIIlll[17] = 0xFFFFB7F6 & 0x7B4B;
        h.lIllIlllIIlll[18] = 0xFFFFFFEF & 0x3353;
        h.lIllIlllIIlll[19] = -(0xFFFFCC7B & 0x7BAF) & (0xFFFFFFEF & 0x7B7E);
        h.lIllIlllIIlll[20] = -(0xFFFFFFF3 & 0x715E) & (0xFFFFF7FB & Short.MAX_VALUE);
        h.lIllIlllIIlll[21] = 0xFFFF86BD & 0x7FEE;
        h.lIllIlllIIlll[22] = -(0xFFFFBF07 & 0x48F9) & (0xFFFFAEEF & 0x5FBE);
        h.lIllIlllIIlll[23] = 0xFFFFAEF3 & 0x57BC;
        h.lIllIlllIIlll[24] = -(0xFFFFFD9B & 0x4377) & (0xFFFFFFDF & 0x6FFA);
        h.lIllIlllIIlll[25] = 0xFFFFFFDF & 0x2EEA;
        h.lIllIlllIIlll[26] = -(0xFFFFBB87 & 0x577D) & (0xFFFFDFFF & Short.MAX_VALUE);
        h.lIllIlllIIlll[27] = -(0xFFFFF21D & 0x2FFF) & (0xFFFFFFFF & 0x7BBF);
        h.lIllIlllIIlll[28] = 0x7C ^ 0x75;
        h.lIllIlllIIlll[29] = 0xFFFFDFEF & 0x3F5D;
        h.lIllIlllIIlll[30] = 0x3A ^ 0x30;
        h.lIllIlllIIlll[31] = 0x75 ^ 0x7E;
        h.lIllIlllIIlll[32] = 0xFFFFB2AA & 0x7FDF;
        h.lIllIlllIIlll[33] = 0x2C ^ 0x59 ^ (0xE6 ^ 0x9F);
        h.lIllIlllIIlll[34] = 0x3B ^ 0x78 ^ (0x78 ^ 0x36);
        h.lIllIlllIIlll[35] = 0xFFFFCF7E & 0x7CED;
        h.lIllIlllIIlll[36] = 0xB ^ 5;
        h.lIllIlllIIlll[37] = 0x12 ^ 0x1D;
        h.lIllIlllIIlll[38] = -(0xFFFFFF7D & 0x67A3) & (0xFFFFF7FB & 0x7FBF);
        h.lIllIlllIIlll[39] = 0xBE ^ 0xAE;
        h.lIllIlllIIlll[40] = 114 + 152 - 171 + 85 ^ 126 + 77 - 85 + 47;
        h.lIllIlllIIlll[41] = -(0xFFFFFBE3 & 0x1CDF) & (0xFFFFFEFF & 0x3FFF);
        h.lIllIlllIIlll[42] = -(0xFFFFECD3 & 0x1BEE) & (0xFFFFBFFF & 0x6EFF);
        h.lIllIlllIIlll[43] = 0xC0 ^ 0xB5 ^ (0x68 ^ 0xF);
        h.lIllIlllIIlll[44] = 0xD6 ^ 0xC5;
        h.lIllIlllIIlll[45] = 0xFFFFE755 & 0x3EFF;
        h.lIllIlllIIlll[46] = -(0xFFFFCE4D & 0x7DB3) & (0xFFFFFF3C & 0x7FCF);
        h.lIllIlllIIlll[47] = 0x83 ^ 0x97;
        h.lIllIlllIIlll[48] = 0xF7 ^ 0xAC ^ (0xDE ^ 0x90);
        h.lIllIlllIIlll[49] = 0xFFFFF49E & 0x3F7F;
        h.lIllIlllIIlll[50] = -(0xFFFFC2F7 & 0x7D2B) & (0xFFFFFCBB & 0x777F);
        h.lIllIlllIIlll[51] = 0xFFFFFFCA & 0x55BF;
        h.lIllIlllIIlll[52] = 0x3A ^ 0x2C;
        h.lIllIlllIIlll[53] = 0x1C ^ 0xB;
        h.lIllIlllIIlll[54] = -(0xFFFF93DC & 0x7DEF) & (0xFFFFBFFF & 0x77FF);
        h.lIllIlllIIlll[55] = -(0xFFFFE1CF & 0x5FFB) & (0xFFFFE7FF & Short.MAX_VALUE);
        h.lIllIlllIIlll[56] = 0x7D ^ 0x3D ^ (0x7D ^ 0x25);
        h.lIllIlllIIlll[57] = 109 + 110 - 193 + 134 ^ 172 + 84 - 71 + 0;
        h.lIllIlllIIlll[58] = 0xFFFFB7EE & 0x6E57;
        h.lIllIlllIIlll[59] = -(71 + 56 - 4 + 62) & (0xFFFFE7FF & 0x3EFF);
        h.lIllIlllIIlll[60] = 0xB7 ^ 0xAD;
        h.lIllIlllIIlll[61] = 181 + 49 - 210 + 169 ^ 90 + 135 - 106 + 47;
        h.lIllIlllIIlll[62] = -(0xFFFF897D & 0x7E9B) & (0xFFFFBFDF & 0x7B7F);
        h.lIllIlllIIlll[63] = -(105 + 56 - 155 + 130) & (0xFFFFF7DF & 0x3BEF);
        h.lIllIlllIIlll[64] = 0x37 ^ 0x2B;
    }

    private static String llIIlIIlIlIlIlI(String llllllllllllllIllIIIlIIlIlIlIIII, String llllllllllllllIllIIIlIIlIlIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIlIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIlIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIIlIlIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIIlIlIlIlII.init(lIllIlllIIlll[5], llllllllllllllIllIIIlIIlIlIlIlIl);
            return new String(llllllllllllllIllIIIlIIlIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIIlIlIlIIll) {
            llllllllllllllIllIIIlIIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public int[] u() {
        return this.itemID;
    }

    private static String llIIlIIlIllIIII(String llllllllllllllIllIIIlIIlIlIIIlIl, String llllllllllllllIllIIIlIIlIlIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIlIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), lIllIlllIIlll[2]), "DES");
            Cipher llllllllllllllIllIIIlIIlIlIIIlll = Cipher.getInstance("DES");
            llllllllllllllIllIIIlIIlIlIIIlll.init(lIllIlllIIlll[5], llllllllllllllIllIIIlIIlIlIIlIII);
            return new String(llllllllllllllIllIIIlIIlIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIIlIlIIIllI) {
            llllllllllllllIllIIIlIIlIlIIIllI.printStackTrace();
            return null;
        }
    }

    static {
        h.llIIlIIlIllllIl();
        h.llIIlIIlIlllIII();
        int[] nArray = new int[lIllIlllIIlll[2]];
        nArray[h.lIllIlllIIlll[0]] = lIllIlllIIlll[3];
        nArray[h.lIllIlllIIlll[1]] = lIllIlllIIlll[4];
        nArray[h.lIllIlllIIlll[5]] = lIllIlllIIlll[6];
        nArray[h.lIllIlllIIlll[7]] = lIllIlllIIlll[8];
        nArray[h.lIllIlllIIlll[9]] = lIllIlllIIlll[10];
        nArray[h.lIllIlllIIlll[11]] = lIllIlllIIlll[12];
        nArray[h.lIllIlllIIlll[13]] = lIllIlllIIlll[14];
        nArray[h.lIllIlllIIlll[15]] = lIllIlllIIlll[16];
        RING_OF_DUELING = new h(lIllIllIllllI[lIllIlllIIlll[1]], lIllIlllIIlll[1], nArray);
        int[] nArray2 = new int[lIllIlllIIlll[7]];
        nArray2[h.lIllIlllIIlll[0]] = lIllIlllIIlll[17];
        nArray2[h.lIllIlllIIlll[1]] = lIllIlllIIlll[18];
        nArray2[h.lIllIlllIIlll[5]] = lIllIlllIIlll[19];
        ARDOUGNE_CLOAK = new h(lIllIllIllllI[lIllIlllIIlll[7]], nArray2);
        int[] nArray3 = new int[lIllIlllIIlll[15]];
        nArray3[h.lIllIlllIIlll[0]] = lIllIlllIIlll[20];
        nArray3[h.lIllIlllIIlll[1]] = lIllIlllIIlll[21];
        nArray3[h.lIllIlllIIlll[5]] = lIllIlllIIlll[22];
        nArray3[h.lIllIlllIIlll[7]] = lIllIlllIIlll[23];
        nArray3[h.lIllIlllIIlll[9]] = lIllIlllIIlll[24];
        nArray3[h.lIllIlllIIlll[11]] = lIllIlllIIlll[25];
        nArray3[h.lIllIlllIIlll[13]] = lIllIlllIIlll[26];
        AMULET_OF_GLORY = new h(lIllIllIllllI[lIllIlllIIlll[11]], lIllIlllIIlll[1], nArray3);
        int[] nArray4 = new int[lIllIlllIIlll[1]];
        nArray4[h.lIllIlllIIlll[0]] = lIllIlllIIlll[27];
        RADAS_BLESSING = new h(lIllIllIllllI[lIllIlllIIlll[15]], lIllIlllIIlll[1], nArray4);
        int[] nArray5 = new int[lIllIlllIIlll[1]];
        nArray5[h.lIllIlllIIlll[0]] = lIllIlllIIlll[29];
        HOUSE_TELEPORT = new h(lIllIllIllllI[lIllIlllIIlll[28]], nArray5);
        int[] nArray6 = new int[lIllIlllIIlll[1]];
        nArray6[h.lIllIlllIIlll[0]] = lIllIlllIIlll[32];
        ZULANDRA_TELEPORT = new h(lIllIllIllllI[lIllIlllIIlll[31]], nArray6);
        int[] nArray7 = new int[lIllIlllIIlll[1]];
        nArray7[h.lIllIlllIIlll[0]] = lIllIlllIIlll[35];
        ROYAL_SEED_POD = new h(lIllIllIllllI[lIllIlllIIlll[34]], nArray7);
        int[] nArray8 = new int[lIllIlllIIlll[1]];
        nArray8[h.lIllIlllIIlll[0]] = lIllIlllIIlll[38];
        ECTOPHIAL = new h(lIllIllIllllI[lIllIlllIIlll[37]], nArray8);
        int[] nArray9 = new int[lIllIlllIIlll[5]];
        nArray9[h.lIllIlllIIlll[0]] = lIllIlllIIlll[41];
        nArray9[h.lIllIlllIIlll[1]] = lIllIlllIIlll[42];
        CONSTRUCTION_CAPE = new h(lIllIllIllllI[lIllIlllIIlll[40]], nArray9);
        int[] nArray10 = new int[lIllIlllIIlll[5]];
        nArray10[h.lIllIlllIIlll[0]] = lIllIlllIIlll[45];
        nArray10[h.lIllIlllIIlll[1]] = lIllIlllIIlll[46];
        QUEST_CAPE = new h(lIllIllIllllI[lIllIlllIIlll[44]], nArray10);
        int[] nArray11 = new int[lIllIlllIIlll[7]];
        nArray11[h.lIllIlllIIlll[0]] = lIllIlllIIlll[49];
        nArray11[h.lIllIlllIIlll[1]] = lIllIlllIIlll[50];
        nArray11[h.lIllIlllIIlll[5]] = lIllIlllIIlll[51];
        MAX_CAPE = new h(lIllIllIllllI[lIllIlllIIlll[48]], nArray11);
        int[] nArray12 = new int[lIllIlllIIlll[5]];
        nArray12[h.lIllIlllIIlll[0]] = lIllIlllIIlll[54];
        nArray12[h.lIllIlllIIlll[1]] = lIllIlllIIlll[55];
        CRAFTING_CAPE = new h(lIllIllIllllI[lIllIlllIIlll[53]], nArray12);
        int[] nArray13 = new int[lIllIlllIIlll[5]];
        nArray13[h.lIllIlllIIlll[0]] = lIllIlllIIlll[58];
        nArray13[h.lIllIlllIIlll[1]] = lIllIlllIIlll[59];
        FISHING_CAPE = new h(lIllIllIllllI[lIllIlllIIlll[57]], nArray13);
        int[] nArray14 = new int[lIllIlllIIlll[5]];
        nArray14[h.lIllIlllIIlll[0]] = lIllIlllIIlll[62];
        nArray14[h.lIllIlllIIlll[1]] = lIllIlllIIlll[63];
        EXPLORERS_RING = new h(lIllIllIllllI[lIllIlllIIlll[61]], nArray14);
        h[] hArray = new h[lIllIlllIIlll[36]];
        hArray[h.lIllIlllIIlll[0]] = RING_OF_DUELING;
        hArray[h.lIllIlllIIlll[1]] = ARDOUGNE_CLOAK;
        hArray[h.lIllIlllIIlll[5]] = AMULET_OF_GLORY;
        hArray[h.lIllIlllIIlll[7]] = RADAS_BLESSING;
        hArray[h.lIllIlllIIlll[9]] = HOUSE_TELEPORT;
        hArray[h.lIllIlllIIlll[11]] = ZULANDRA_TELEPORT;
        hArray[h.lIllIlllIIlll[13]] = ROYAL_SEED_POD;
        hArray[h.lIllIlllIIlll[15]] = ECTOPHIAL;
        hArray[h.lIllIlllIIlll[2]] = CONSTRUCTION_CAPE;
        hArray[h.lIllIlllIIlll[28]] = QUEST_CAPE;
        hArray[h.lIllIlllIIlll[30]] = MAX_CAPE;
        hArray[h.lIllIlllIIlll[31]] = CRAFTING_CAPE;
        hArray[h.lIllIlllIIlll[33]] = FISHING_CAPE;
        hArray[h.lIllIlllIIlll[34]] = EXPLORERS_RING;
        $VALUES = hArray;
    }

    private static void llIIlIIlIlllIII() {
        lIllIllIllllI = new String[lIllIlllIIlll[64]];
        h.lIllIllIllllI[h.lIllIlllIIlll[0]] = h.llIIlIIlIlIlIlI("waqg7Eq61EB/0PKKo8mUNw==", "Spgyq");
        h.lIllIllIllllI[h.lIllIlllIIlll[1]] = h.llIIlIIlIlIllll("AC0eOTpmDQI1Lic+CQ==", "FHlVB");
        h.lIllIllIllllI[h.lIllIlllIIlll[5]] = h.llIIlIIlIlIllll("NBwSGQwyABMJGjkBFx0=", "uNVVY");
        h.lIllIllIllllI[h.lIllIlllIIlll[7]] = h.llIIlIIlIlIllll("IQYKIj8YDBY6bDgMCCY8AxsQ", "lidCL");
        h.lIllIllIllllI[h.lIllIlllIIlll[9]] = h.llIIlIIlIlIllll("KTwnNQ08Lj0/Fy89PSsR", "hqryH");
        h.lIllIllIllllI[h.lIllIlllIIlll[11]] = h.llIIlIIlIlIllll("NgUlDiMaDS4O", "saBkU");
        h.lIllIllIllllI[h.lIllIlllIIlll[13]] = h.llIIlIIlIllIIII("ZNsVF1F0t2XrEUEhZVnZQw==", "ytqhs");
        h.lIllIllIllllI[h.lIllIlllIIlll[15]] = h.llIIlIIlIlIllll("NT0HPBhYGRMgGQ0+Hw==", "xRrRl");
        h.lIllIllIllllI[h.lIllIlllIIlll[2]] = h.llIIlIIlIlIllll("OwMfMD8sGA8vPyMDGDc=", "sLJcz");
        h.lIllIllIllllI[h.lIllIlllIIlll[28]] = h.llIIlIIlIlIlIlI("Xlum9xFQj88=", "ipKsp");
        h.lIllIllIllllI[h.lIllIlllIIlll[30]] = h.llIIlIIlIlIlIlI("K9QElG3MaBax08umro+bCCgPbyvwJ0Eq", "hHtiU");
        h.lIllIllIllllI[h.lIllIlllIIlll[31]] = h.llIIlIIlIllIIII("xHlg/7IjLoC9waOUnLBfSA==", "OopwX");
        h.lIllIllIllllI[h.lIllIlllIIlll[33]] = h.llIIlIIlIllIIII("YcfAqHzGjHfxePBGSOIXuw==", "fmDhH");
        h.lIllIllIllllI[h.lIllIlllIIlll[34]] = h.llIIlIIlIlIlIlI("SEEdX+My9RI=", "brPTB");
        h.lIllIllIllllI[h.lIllIlllIIlll[36]] = h.llIIlIIlIlIllll("LAYWBzUhDAME", "iEBHe");
        h.lIllIllIllllI[h.lIllIlllIIlll[37]] = h.llIIlIIlIlIllll("BhUUAhg=", "Cxdva");
        h.lIllIllIllllI[h.lIllIlllIIlll[39]] = h.llIIlIIlIlIlIlI("wiFkxNCw78cbVg84nx6vkULWoEgip0I7", "gPtCs");
        h.lIllIllIllllI[h.lIllIlllIIlll[40]] = h.llIIlIIlIllIIII("dERH4+NiDkqPxNfJXX9OPQ==", "MjHTq");
        h.lIllIllIllllI[h.lIllIlllIIlll[43]] = h.llIIlIIlIlIlIlI("DVPNMzbsZZqLBhiQ2iOgpg==", "kajJP");
        h.lIllIllIllllI[h.lIllIlllIIlll[44]] = h.llIIlIIlIllIIII("WQO1tqHsu0FDFMtQAOG2IQ==", "vkVvB");
        h.lIllIllIllllI[h.lIllIlllIIlll[47]] = h.llIIlIIlIllIIII("+uCIcVVOBsPDSBaaDiMozQ==", "Ruooy");
        h.lIllIllIllllI[h.lIllIlllIIlll[48]] = h.llIIlIIlIlIllll("FjEkK0U2O2geKgo=", "BTHNe");
        h.lIllIllIllllI[h.lIllIlllIIlll[52]] = h.llIIlIIlIllIIII("EwoSwmYjHpiZzNzsUvmCug==", "kSloe");
        h.lIllIllIllllI[h.lIllIlllIIlll[53]] = h.llIIlIIlIlIlIlI("hDFgAW0S1F+7NA3dZL8Abg==", "JfuEw");
        h.lIllIllIllllI[h.lIllIlllIIlll[56]] = h.llIIlIIlIlIllll("DwQCJj4HCg4tNhkI", "IMQnw");
        h.lIllIllIllllI[h.lIllIlllIIlll[57]] = h.llIIlIIlIlIllll("My81KRwbIWYGABwqIg==", "uFFAu");
        h.lIllIllIllllI[h.lIllIlllIIlll[60]] = h.llIIlIIlIlIllll("MBEeCT8nDBwWLycAAAI=", "uINEp");
        h.lIllIllIllllI[h.lIllIlllIIlll[61]] = h.llIIlIIlIlIllll("NgYgHBcNETg=", "bcLyg");
    }

    private h(String string2, boolean bl, int ... nArray) {
        this.itemID = nArray;
        this.mustBeEquipped = bl;
        this.teleportOption = string2;
    }

    public boolean t() {
        return this.mustBeEquipped;
    }
}

