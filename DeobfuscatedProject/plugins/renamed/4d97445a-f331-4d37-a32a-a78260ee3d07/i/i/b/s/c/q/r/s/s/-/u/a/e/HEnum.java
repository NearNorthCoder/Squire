/*
 * Decompiled with CFR 0.152.
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class HEnum
extends Enum<H> {
    public static final /* synthetic */ /* enum */ H KARAMJA_GLOVES_4;
    public static final /* synthetic */ /* enum */ H RING_OF_DUELING;
    public static final /* synthetic */ /* enum */ H FISHING_CAPE;
    public static final /* synthetic */ /* enum */ H ROYAL_SEED_POD;
    private final /* synthetic */ String teleportOption;
    public static final /* synthetic */ /* enum */ H AMULET_OF_GLORY;
    public static final /* synthetic */ /* enum */ H CHRONICLE;
    private final /* synthetic */ int[] itemID;
    public static final /* synthetic */ /* enum */ H RADAS_BLESSING;
    private static final /* synthetic */ H[] $VALUES;
    private static /* synthetic */ String[] lIlIIllll;
    public static final /* synthetic */ /* enum */ H CONSTRUCTION_CAPE;
    public static final /* synthetic */ /* enum */ H EXPLORERS_RING;
    public static final /* synthetic */ /* enum */ H CRAFTING_CAPE;
    private /* synthetic */ boolean mustBeEquipped;
    private static /* synthetic */ int[] lIlIlIIII;
    public static final /* synthetic */ /* enum */ H KARAMJA_GLOVES_3;
    public static final /* synthetic */ /* enum */ H MAX_CAPE;
    public static final /* synthetic */ /* enum */ H ARDOUGNE_CLOAK;
    public static final /* synthetic */ /* enum */ H ECTOPHIAL;

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }

    private static String lIIlIIlllIl(String llIIIIIIIlllIII, String llIIIIIIIllIlll) {
        llIIIIIIIlllIII = new String(Base64.getDecoder().decode(llIIIIIIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIIIIIlllIll = new StringBuilder();
        char[] llIIIIIIIlllIlI = llIIIIIIIllIlll.toCharArray();
        int llIIIIIIIlllIIl = lIlIlIIII[0];
        char[] llIIIIIIIllIIll = llIIIIIIIlllIII.toCharArray();
        int llIIIIIIIllIIlI = llIIIIIIIllIIll.length;
        int llIIIIIIIllIIIl = lIlIlIIII[0];
        while (H.lIIlIlIIIIl(llIIIIIIIllIIIl, llIIIIIIIllIIlI)) {
            char llIIIIIIIlllllI = llIIIIIIIllIIll[llIIIIIIIllIIIl];
            llIIIIIIIlllIll.append((char)(llIIIIIIIlllllI ^ llIIIIIIIlllIlI[llIIIIIIIlllIIl % llIIIIIIIlllIlI.length]));
            0;
            ++llIIIIIIIlllIIl;
            ++llIIIIIIIllIIIl;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(llIIIIIIIlllIll);
    }

    public int[] av() {
        return this.itemID;
    }

    private static String lIIlIIllllI(String llIIIIIIlIllIlI, String llIIIIIIlIlIlll) {
        try {
            SecretKeySpec llIIIIIIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIIlIlllII = Cipher.getInstance("Blowfish");
            llIIIIIIlIlllII.init(lIlIlIIII[2], llIIIIIIlIlllIl);
            return new String(llIIIIIIlIlllII.doFinal(Base64.getDecoder().decode(llIIIIIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIlIllIll) {
            llIIIIIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIIlllII(String llIIIIIIlIIlIll, String llIIIIIIlIIllII) {
        try {
            SecretKeySpec llIIIIIIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIIlIIllII.getBytes(StandardCharsets.UTF_8)), lIlIlIIII[15]), "DES");
            Cipher llIIIIIIlIIllll = Cipher.getInstance("DES");
            llIIIIIIlIIllll.init(lIlIlIIII[2], llIIIIIIlIlIIII);
            return new String(llIIIIIIlIIllll.doFinal(Base64.getDecoder().decode(llIIIIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIIIIlIIlllI) {
            llIIIIIIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private H(String string2, boolean bl2, int ... nArray) {
        this.itemID = nArray;
        this.mustBeEquipped = bl2;
        this.teleportOption = string2;
    }

    static {
        H.lIIlIlIIIII();
        H.lIIlIIlllll();
        int[] nArray = new int[lIlIlIIII[2]];
        nArray[H.lIlIlIIII[0]] = lIlIlIIII[3];
        nArray[H.lIlIlIIII[1]] = lIlIlIIII[4];
        CONSTRUCTION_CAPE = new H(lIlIIllll[lIlIlIIII[1]], nArray);
        int[] nArray2 = new int[lIlIlIIII[1]];
        nArray2[H.lIlIlIIII[0]] = lIlIlIIII[6];
        MAX_CAPE = new H(lIlIIllll[lIlIlIIII[5]], nArray2);
        int[] nArray3 = new int[lIlIlIIII[2]];
        nArray3[H.lIlIlIIII[0]] = lIlIlIIII[9];
        nArray3[H.lIlIlIIII[1]] = lIlIlIIII[10];
        CRAFTING_CAPE = new H(lIlIIllll[lIlIlIIII[8]], nArray3);
        int[] nArray4 = new int[lIlIlIIII[2]];
        nArray4[H.lIlIlIIII[0]] = lIlIlIIII[13];
        nArray4[H.lIlIlIIII[1]] = lIlIlIIII[14];
        FISHING_CAPE = new H(lIlIIllll[lIlIlIIII[12]], nArray4);
        int[] nArray5 = new int[lIlIlIIII[7]];
        nArray5[H.lIlIlIIII[0]] = lIlIlIIII[17];
        nArray5[H.lIlIlIIII[1]] = lIlIlIIII[18];
        nArray5[H.lIlIlIIII[2]] = lIlIlIIII[19];
        nArray5[H.lIlIlIIII[5]] = lIlIlIIII[20];
        ARDOUGNE_CLOAK = new H(lIlIIllll[lIlIlIIII[16]], nArray5);
        int[] nArray6 = new int[lIlIlIIII[1]];
        nArray6[H.lIlIlIIII[0]] = lIlIlIIII[23];
        ECTOPHIAL = new H(lIlIIllll[lIlIlIIII[22]], nArray6);
        int[] nArray7 = new int[lIlIlIIII[1]];
        nArray7[H.lIlIlIIII[0]] = lIlIlIIII[26];
        KARAMJA_GLOVES_3 = new H(lIlIIllll[lIlIlIIII[25]], nArray7);
        int[] nArray8 = new int[lIlIlIIII[1]];
        nArray8[H.lIlIlIIII[0]] = lIlIlIIII[29];
        KARAMJA_GLOVES_4 = new H(lIlIIllll[lIlIlIIII[28]], nArray8);
        int[] nArray9 = new int[lIlIlIIII[2]];
        nArray9[H.lIlIlIIII[0]] = lIlIlIIII[32];
        nArray9[H.lIlIlIIII[1]] = lIlIlIIII[33];
        EXPLORERS_RING = new H(lIlIIllll[lIlIlIIII[31]], nArray9);
        int[] nArray10 = new int[lIlIlIIII[1]];
        nArray10[H.lIlIlIIII[0]] = lIlIlIIII[36];
        ROYAL_SEED_POD = new H(lIlIIllll[lIlIlIIII[35]], nArray10);
        int[] nArray11 = new int[lIlIlIIII[1]];
        nArray11[H.lIlIlIIII[0]] = lIlIlIIII[39];
        CHRONICLE = new H(lIlIIllll[lIlIlIIII[38]], nArray11);
        int[] nArray12 = new int[lIlIlIIII[12]];
        nArray12[H.lIlIlIIII[0]] = lIlIlIIII[42];
        nArray12[H.lIlIlIIII[1]] = lIlIlIIII[43];
        nArray12[H.lIlIlIIII[2]] = lIlIlIIII[44];
        nArray12[H.lIlIlIIII[5]] = lIlIlIIII[45];
        nArray12[H.lIlIlIIII[7]] = lIlIlIIII[46];
        nArray12[H.lIlIlIIII[8]] = lIlIlIIII[47];
        nArray12[H.lIlIlIIII[11]] = lIlIlIIII[48];
        AMULET_OF_GLORY = new H(lIlIIllll[lIlIlIIII[41]], lIlIlIIII[1], nArray12);
        int[] nArray13 = new int[lIlIlIIII[15]];
        nArray13[H.lIlIlIIII[0]] = lIlIlIIII[51];
        nArray13[H.lIlIlIIII[1]] = lIlIlIIII[52];
        nArray13[H.lIlIlIIII[2]] = lIlIlIIII[53];
        nArray13[H.lIlIlIIII[5]] = lIlIlIIII[54];
        nArray13[H.lIlIlIIII[7]] = lIlIlIIII[55];
        nArray13[H.lIlIlIIII[8]] = lIlIlIIII[56];
        nArray13[H.lIlIlIIII[11]] = lIlIlIIII[57];
        nArray13[H.lIlIlIIII[12]] = lIlIlIIII[58];
        RING_OF_DUELING = new H(lIlIIllll[lIlIlIIII[50]], lIlIlIIII[1], nArray13);
        int[] nArray14 = new int[lIlIlIIII[1]];
        nArray14[H.lIlIlIIII[0]] = lIlIlIIII[61];
        RADAS_BLESSING = new H(lIlIIllll[lIlIlIIII[60]], lIlIlIIII[1], nArray14);
        H[] hArray = new H[lIlIlIIII[27]];
        hArray[H.lIlIlIIII[0]] = CONSTRUCTION_CAPE;
        hArray[H.lIlIlIIII[1]] = MAX_CAPE;
        hArray[H.lIlIlIIII[2]] = CRAFTING_CAPE;
        hArray[H.lIlIlIIII[5]] = FISHING_CAPE;
        hArray[H.lIlIlIIII[7]] = ARDOUGNE_CLOAK;
        hArray[H.lIlIlIIII[8]] = ECTOPHIAL;
        hArray[H.lIlIlIIII[11]] = KARAMJA_GLOVES_3;
        hArray[H.lIlIlIIII[12]] = KARAMJA_GLOVES_4;
        hArray[H.lIlIlIIII[15]] = EXPLORERS_RING;
        hArray[H.lIlIlIIII[16]] = ROYAL_SEED_POD;
        hArray[H.lIlIlIIII[21]] = CHRONICLE;
        hArray[H.lIlIlIIII[22]] = AMULET_OF_GLORY;
        hArray[H.lIlIlIIII[24]] = RING_OF_DUELING;
        hArray[H.lIlIlIIII[25]] = RADAS_BLESSING;
        $VALUES = hArray;
    }

    private static void lIIlIlIIIII() {
        lIlIlIIII = new int[63];
        H.lIlIlIIII[0] = (0x85 ^ 0xAA) & ~(0x4F ^ 0x60);
        H.lIlIlIIII[1] = 1;
        H.lIlIlIIII[2] = 2;
        H.lIlIlIIII[3] = 0xFFFFAF3D & 0x76FF;
        H.lIlIlIIII[4] = 0xFFFFEFBF & 0x367E;
        H.lIlIlIIII[5] = 3;
        H.lIlIlIIII[6] = 0xFFFFBFDF & 0x743E;
        H.lIlIlIIII[7] = 0x41 ^ 0x45;
        H.lIlIlIIII[8] = 5 ^ 0x28 ^ (0 ^ 0x28);
        H.lIlIlIIII[9] = 0xFFFFEEBC & 0x3777;
        H.lIlIlIIII[10] = -(0xFFFFEDFF & 0x1A83) & (0xFFFFBEB7 & 0x6FFF);
        H.lIlIlIIII[11] = 0x35 ^ 0x33;
        H.lIlIlIIII[12] = 171 + 175 - 261 + 93 ^ 17 + 178 - 172 + 158;
        H.lIlIlIIII[13] = -(114 + 114 - 216 + 174) & (0xFFFFFEFF & 0x27FF);
        H.lIlIlIIII[14] = 0xFFFFAE4F & 0x77F7;
        H.lIlIlIIII[15] = 154 + 92 - 77 + 12 ^ 89 + 142 - 96 + 54;
        H.lIlIlIIII[16] = 105 + 35 - -2 + 9 ^ 48 + 47 - 34 + 97;
        H.lIlIlIIII[17] = -(0xFFFFDDE7 & 0x62BF) & (0xFFFFFFFF & 0x73E7);
        H.lIlIlIIII[18] = -(0xFFFFFFEA & 0x4CBF) & (0xFFFFFFEB & Short.MAX_VALUE);
        H.lIlIlIIII[19] = -(0xFFFF877B & 0x7CBD) & (0xFFFFF7FB & 0x3F7F);
        H.lIlIlIIII[20] = -(0xFFFFCCB9 & 0x7F57) & (0xFFFFFFD5 & 0x7F7E);
        H.lIlIlIIII[21] = 0x32 ^ 0x38;
        H.lIlIlIIII[22] = 21 + 15 - -34 + 119 ^ 170 + 41 - 73 + 44;
        H.lIlIlIIII[23] = 0xFFFFD4BF & 0x3BDB;
        H.lIlIlIIII[24] = 0x3B ^ 8 ^ (0xAE ^ 0x91);
        H.lIlIlIIII[25] = 21 + 0 - -47 + 73 ^ 49 + 100 - 98 + 77;
        H.lIlIlIIII[26] = -(0xFFFFF5B3 & 0x5A7F) & (0xFFFFFBF6 & 0x7FBF);
        H.lIlIlIIII[27] = 0x51 ^ 0xA ^ (0x11 ^ 0x44);
        H.lIlIlIIII[28] = 0xC8 ^ 0xBD ^ (0xF ^ 0x75);
        H.lIlIlIIII[29] = 0xFFFFFB2F & 0x37FF;
        H.lIlIlIIII[30] = 0xA ^ 0x1A;
        H.lIlIlIIII[31] = 0x30 ^ 0x21;
        H.lIlIlIIII[32] = -(0xFFFFC5E9 & 0x7E3F) & (0xFFFFFF6F & 0x77FF);
        H.lIlIlIIII[33] = 0xFFFFBBCE & 0x7779;
        H.lIlIlIIII[34] = 0xD7 ^ 0xC5;
        H.lIlIlIIII[35] = 0x45 ^ 0x56;
        H.lIlIlIIII[36] = -(0xFFFFF017 & 0x3FFB) & (0xFFFFFCFF & 0x7F7E);
        H.lIlIlIIII[37] = 51 + 49 - -112 + 2 ^ 140 + 107 - 102 + 49;
        H.lIlIlIIII[38] = 171 + 29 - 180 + 166 ^ 36 + 143 - 96 + 92;
        H.lIlIlIIII[39] = -(0xFFFFFEF5 & 0x4BAB) & (0xFFFFFFFE & 0x7FFD);
        H.lIlIlIIII[40] = 0x3E ^ 0x65 ^ (0x1C ^ 0x51);
        H.lIlIlIIII[41] = 122 + 145 - 204 + 114 ^ 156 + 45 - 105 + 70;
        H.lIlIlIIII[42] = -(0xFFFFFD4D & 0x2BB3) & (0xFFFFAFFF & 0x7FAA);
        H.lIlIlIIII[43] = 0xFFFFCFBC & 0x36EF;
        H.lIlIlIIII[44] = 0xFFFFC6AF & 0x3FFE;
        H.lIlIlIIII[45] = 0xFFFFBFB6 & 0x46F9;
        H.lIlIlIIII[46] = -(0xFFFFEDBF & 0x1355) & (0xFFFFBFDD & 0x6FFE);
        H.lIlIlIIII[47] = -(0xFFFFD7DF & 0x7831) & (0xFFFFFEDB & 0x7FFE);
        H.lIlIlIIII[48] = -(0xFFFFFFA1 & 0x215F) & (0xFFFFEFFF & 0x7DFB);
        H.lIlIlIIII[49] = 1 ^ 0x19;
        H.lIlIlIIII[50] = 0x59 ^ 0x40;
        H.lIlIlIIII[51] = 0xFFFFEBFF & 0x1E06;
        H.lIlIlIIII[52] = -(166 + 22 - 22 + 3) & (0xFFFFAABD & 0x5FEE);
        H.lIlIlIIII[53] = 0xFFFFFF17 & 0xAEA;
        H.lIlIlIIII[54] = 0xFFFFDB9D & 0x2E62;
        H.lIlIlIIII[55] = 0xFFFFFDFE & 0xBFF;
        H.lIlIlIIII[56] = 0xFFFFEFFD & 0x19FE;
        H.lIlIlIIII[57] = 0xFFFF99FE & 0x6FFB;
        H.lIlIlIIII[58] = 0xFFFF8FFA & 0x79FD;
        H.lIlIlIIII[59] = 0x8E ^ 0x94;
        H.lIlIlIIII[60] = 0x37 ^ 0xE ^ (0x34 ^ 0x16);
        H.lIlIlIIII[61] = 0xFFFFFFF7 & 0x59AB;
        H.lIlIlIIII[62] = 0x3B ^ 0x1C ^ (0x7C ^ 0x47);
    }

    private H(String string2, int ... nArray) {
        this.itemID = nArray;
        this.teleportOption = string2;
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    private static void lIIlIIlllll() {
        lIlIIllll = new String[lIlIlIIII[62]];
        H.lIlIIllll[H.lIlIlIIII[0]] = H."CONSTRUCTION_CAPE";
        H.lIlIIllll[H.lIlIlIIII[1]] = H."Tele to POH";
        H.lIlIIllll[H.lIlIlIIII[2]] = H."MAX_CAPE";
        H.lIlIIllll[H.lIlIlIIII[5]] = H."Tele to POH";
        H.lIlIIllll[H.lIlIlIIII[7]] = H."CRAFTING_CAPE";
        H.lIlIIllll[H.lIlIlIIII[8]] = H."Teleport";
        H.lIlIIllll[H.lIlIlIIII[11]] = H."FISHING_CAPE";
        H.lIlIIllll[H.lIlIlIIII[12]] = H."Fishing Guild";
        H.lIlIIllll[H.lIlIlIIII[15]] = H."ARDOUGNE_CLOAK";
        H.lIlIIllll[H.lIlIlIIII[16]] = H."Monastery Teleport";
        H.lIlIIllll[H.lIlIlIIII[21]] = H."ECTOPHIAL";
        H.lIlIIllll[H.lIlIlIIII[22]] = H."Empty";
        H.lIlIIllll[H.lIlIlIIII[24]] = H."KARAMJA_GLOVES_3";
        H.lIlIIllll[H.lIlIlIIII[25]] = H."Gem Mine";
        H.lIlIIllll[H.lIlIlIIII[27]] = H."KARAMJA_GLOVES_4";
        H.lIlIIllll[H.lIlIlIIII[28]] = H."Duradel";
        H.lIlIIllll[H.lIlIlIIII[30]] = H."EXPLORERS_RING";
        H.lIlIIllll[H.lIlIlIIII[31]] = H."Teleport";
        H.lIlIIllll[H.lIlIlIIII[34]] = H."ROYAL_SEED_POD";
        H.lIlIIllll[H.lIlIlIIII[35]] = H."Commune";
        H.lIlIIllll[H.lIlIlIIII[37]] = H."CHRONICLE";
        H.lIlIIllll[H.lIlIlIIII[38]] = H."Teleport";
        H.lIlIIllll[H.lIlIlIIII[40]] = H."AMULET_OF_GLORY";
        H.lIlIIllll[H.lIlIlIIII[41]] = H."Edgeville";
        H.lIlIIllll[H.lIlIlIIII[49]] = H."RING_OF_DUELING";
        H.lIlIIllll[H.lIlIlIIII[50]] = H."Castle Wars";
        H.lIlIIllll[H.lIlIlIIII[59]] = H."RADAS_BLESSING";
        H.lIlIIllll[H.lIlIlIIII[60]] = H."Mount Karuulm";
    }

    public String au() {
        return this.teleportOption;
    }

    public boolean aw() {
        return this.mustBeEquipped;
    }
}

