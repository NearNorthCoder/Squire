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

public final class HerbType
extends Enum<aG> {
    public static final /* synthetic */ /* enum */ aG TORSTOL;
    public static final /* synthetic */ /* enum */ aG MARRENTILL;
    private static /* synthetic */ String[] lllllII;
    public static final /* synthetic */ /* enum */ aG CADANTINE;
    public static final /* synthetic */ /* enum */ aG LANTADYME;
    public static final /* synthetic */ /* enum */ aG AVANTOE;
    public static final /* synthetic */ /* enum */ aG KWUARM;
    public static final /* synthetic */ /* enum */ aG RANARR_WEED;
    private final /* synthetic */ String itemName;
    public static final /* synthetic */ /* enum */ aG IRIT_LEAF;
    public static final /* synthetic */ /* enum */ aG HARRALANDER;
    public static final /* synthetic */ /* enum */ aG SNAPDRAGON;
    public static final /* synthetic */ /* enum */ aG TOADFLAX;
    public static final /* synthetic */ /* enum */ aG DWARF_WEED;
    private static /* synthetic */ int[] lllllIl;
    private static final /* synthetic */ aG[] $VALUES;
    private final /* synthetic */ int id;
    public static final /* synthetic */ /* enum */ aG GUAM_LEAF;
    public static final /* synthetic */ /* enum */ aG TARROMIN;

    private aG(String string2, int n3) {
        this.itemName = string2;
        this.id = n3;
    }

    /*
     * WARNING - void declaration
     */
    public static aG x(int n2) {
        void lllIIllIlIlIlII;
        aG[] aGArray = aG.values();
        int n3 = aGArray.length;
        int lllIIllIlIlIIll = lllllIl[0];
        while (aG.llllIIlII(lllIIllIlIlIIll, (int)lllIIllIlIlIlII)) {
            int lllIIllIlIlIllI;
            void lllIIllIlIlIlIl;
            void lllIIllIlIlIIlI = lllIIllIlIlIlIl[lllIIllIlIlIIll];
            if (aG.llllIIlIl(lllIIllIlIlIIlI.P(), lllIIllIlIlIllI)) {
                return lllIIllIlIlIIlI;
            }
            ++lllIIllIlIlIIll;
            0;
            if (1 != 3) continue;
            return null;
        }
        return null;
    }

    private static boolean llllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    static {
        aG.llllIIIll();
        aG.llllIIIlI();
        GUAM_LEAF = new aG(lllllII[lllllIl[1]], lllllIl[2]);
        MARRENTILL = new aG(lllllII[lllllIl[4]], lllllIl[5]);
        TARROMIN = new aG(lllllII[lllllIl[7]], lllllIl[8]);
        HARRALANDER = new aG(lllllII[lllllIl[10]], lllllIl[11]);
        RANARR_WEED = new aG(lllllII[lllllIl[13]], lllllIl[14]);
        TOADFLAX = new aG(lllllII[lllllIl[16]], lllllIl[17]);
        IRIT_LEAF = new aG(lllllII[lllllIl[19]], lllllIl[20]);
        AVANTOE = new aG(lllllII[lllllIl[22]], lllllIl[23]);
        KWUARM = new aG(lllllII[lllllIl[25]], lllllIl[26]);
        SNAPDRAGON = new aG(lllllII[lllllIl[28]], lllllIl[29]);
        CADANTINE = new aG(lllllII[lllllIl[31]], lllllIl[32]);
        LANTADYME = new aG(lllllII[lllllIl[34]], lllllIl[35]);
        DWARF_WEED = new aG(lllllII[lllllIl[37]], lllllIl[38]);
        TORSTOL = new aG(lllllII[lllllIl[40]], lllllIl[41]);
        aG[] aGArray = new aG[lllllIl[21]];
        aGArray[aG.lllllIl[0]] = GUAM_LEAF;
        aGArray[aG.lllllIl[1]] = MARRENTILL;
        aGArray[aG.lllllIl[3]] = TARROMIN;
        aGArray[aG.lllllIl[4]] = HARRALANDER;
        aGArray[aG.lllllIl[6]] = RANARR_WEED;
        aGArray[aG.lllllIl[7]] = TOADFLAX;
        aGArray[aG.lllllIl[9]] = IRIT_LEAF;
        aGArray[aG.lllllIl[10]] = AVANTOE;
        aGArray[aG.lllllIl[12]] = KWUARM;
        aGArray[aG.lllllIl[13]] = SNAPDRAGON;
        aGArray[aG.lllllIl[15]] = CADANTINE;
        aGArray[aG.lllllIl[16]] = LANTADYME;
        aGArray[aG.lllllIl[18]] = DWARF_WEED;
        aGArray[aG.lllllIl[19]] = TORSTOL;
        $VALUES = aGArray;
    }

    public int P() {
        return this.id;
    }

    private static void llllIIIll() {
        lllllIl = new int[43];
        aG.lllllIl[0] = (111 + 96 - 131 + 73 ^ 135 + 58 - 94 + 97) & (46 + 110 - 144 + 139 ^ 99 + 63 - 20 + 56 ^ -1);
        aG.lllllIl[1] = 1;
        aG.lllllIl[2] = 187 + 168 - 224 + 68;
        aG.lllllIl[3] = 2;
        aG.lllllIl[4] = 3;
        aG.lllllIl[5] = 106 + 122 - 67 + 40;
        aG.lllllIl[6] = 0xF ^ 0x22 ^ (0x56 ^ 0x7F);
        aG.lllllIl[7] = 110 + 137 - 227 + 173 ^ 189 + 138 - 213 + 82;
        aG.lllllIl[8] = 75 + 132 - 157 + 108 + (0x20 ^ 0x3E) - (0xE1 ^ 0x95) + (28 + 12 - 34 + 125);
        aG.lllllIl[9] = 3 ^ 5;
        aG.lllllIl[10] = 0x7C ^ 0x7B;
        aG.lllllIl[11] = 122 + 87 - 195 + 142 + (102 + 92 - 166 + 143) - (106 + 81 - 32 + 66) + (0x29 ^ 0x4A);
        aG.lllllIl[12] = 0x27 ^ 0x2F;
        aG.lllllIl[13] = 0xAD ^ 0x83 ^ (0x1E ^ 0x39);
        aG.lllllIl[14] = (0x5B ^ 0x12) + (0x6B ^ 0x3A) - -(0xB1 ^ 0xA9) + (0x95 ^ 0x88);
        aG.lllllIl[15] = 0x10 ^ 0x1A;
        aG.lllllIl[16] = 0x73 ^ 0x78;
        aG.lllllIl[17] = 0xFFFFDFEB & 0x2BFD;
        aG.lllllIl[18] = 0x76 ^ 0x7A;
        aG.lllllIl[19] = 0x8F ^ 0x82;
        aG.lllllIl[20] = 141 + 77 - 184 + 175;
        aG.lllllIl[21] = 0x2E ^ 0x33 ^ (0xBC ^ 0xAF);
        aG.lllllIl[22] = 0x47 ^ 7 ^ (0x15 ^ 0x5A);
        aG.lllllIl[23] = (0x7A ^ 0x76) + (0xA1 ^ 0xB0) - -(62 + 95 - 0 + 9) + (0x27 ^ 0x37);
        aG.lllllIl[24] = 0x57 ^ 0x47;
        aG.lllllIl[25] = 7 ^ 0x34 ^ (0x8B ^ 0xA9);
        aG.lllllIl[26] = 78 + 170 - 42 + 7;
        aG.lllllIl[27] = 0x2A ^ 0x38;
        aG.lllllIl[28] = 0x46 ^ 0x6A ^ (0xB3 ^ 0x8C);
        aG.lllllIl[29] = 0xFFFFDFFF & 0x2BEB;
        aG.lllllIl[30] = 0x18 ^ 0xC;
        aG.lllllIl[31] = 4 ^ 0x11;
        aG.lllllIl[32] = 92 + 3 - 86 + 206;
        aG.lllllIl[33] = 96 + 116 - 192 + 156 ^ 98 + 105 - 199 + 162;
        aG.lllllIl[34] = 3 ^ 0x14;
        aG.lllllIl[35] = 0xFFFFCDBD & 0x3BF7;
        aG.lllllIl[36] = 0x6E ^ 0x58 ^ (0x8D ^ 0xA3);
        aG.lllllIl[37] = 0xB ^ 0x12;
        aG.lllllIl[38] = 145 + 138 - 115 + 49;
        aG.lllllIl[39] = 0xFC ^ 0x8B ^ (0xA9 ^ 0xC4);
        aG.lllllIl[40] = 0x79 ^ 0x2A ^ (0x59 ^ 0x11);
        aG.lllllIl[41] = (0xF9 ^ 0x8A) + (0x73 ^ 0x4C) - (0x39 ^ 0x5A) + (0 + 35 - -44 + 61);
        aG.lllllIl[42] = 0x17 ^ 0xB;
    }

    public String N() {
        return this.itemName;
    }

    private static String llllIIIIl(String lllIIllIIllIlIl, String lllIIllIIllIlII) {
        lllIIllIIllIlIl = new String(Base64.getDecoder().decode(lllIIllIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIllIIlllIII = new StringBuilder();
        char[] lllIIllIIllIlll = lllIIllIIllIlII.toCharArray();
        int lllIIllIIllIllI = lllllIl[0];
        char[] lllIIllIIllIIII = lllIIllIIllIlIl.toCharArray();
        int lllIIllIIlIllll = lllIIllIIllIIII.length;
        int lllIIllIIlIlllI = lllllIl[0];
        while (aG.llllIIlII(lllIIllIIlIlllI, lllIIllIIlIllll)) {
            char lllIIllIIlllIll = lllIIllIIllIIII[lllIIllIIlIlllI];
            lllIIllIIlllIII.append((char)(lllIIllIIlllIll ^ lllIIllIIllIlll[lllIIllIIllIllI % lllIIllIIllIlll.length]));
            0;
            ++lllIIllIIllIllI;
            ++lllIIllIIlIlllI;
            0;
            if (-(118 + 186 - 245 + 130 ^ 172 + 160 - 213 + 65) < 0) continue;
            return null;
        }
        return String.valueOf(lllIIllIIlllIII);
    }

    public static aG[] values() {
        return (aG[])$VALUES.clone();
    }

    private static boolean llllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String llllIIIII(String lllIIllIlIIlIII, String lllIIllIlIIlIIl) {
        try {
            SecretKeySpec lllIIllIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIllIlIIllII = Cipher.getInstance("Blowfish");
            lllIIllIlIIllII.init(lllllIl[3], lllIIllIlIIllIl);
            return new String(lllIIllIlIIllII.doFinal(Base64.getDecoder().decode(lllIIllIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllIlIIlIll) {
            lllIIllIlIIlIll.printStackTrace();
            return null;
        }
    }

    private static String lllIlllll(String lllIIllIIlIIIll, String lllIIllIIlIIIlI) {
        try {
            SecretKeySpec lllIIllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), lllllIl[12]), "DES");
            Cipher lllIIllIIlIIlll = Cipher.getInstance("DES");
            lllIIllIIlIIlll.init(lllllIl[3], lllIIllIIlIlIII);
            return new String(lllIIllIIlIIlll.doFinal(Base64.getDecoder().decode(lllIIllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllIIllIIlIIllI) {
            lllIIllIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static void llllIIIlI() {
        lllllII = new String[lllllIl[42]];
        aG.lllllII[aG.lllllIl[0]] = aG."GUAM_LEAF";
        aG.lllllII[aG.lllllIl[1]] = aG."Grimy guam leaf";
        aG.lllllII[aG.lllllIl[3]] = aG."MARRENTILL";
        aG.lllllII[aG.lllllIl[4]] = aG."Grimy marrentill";
        aG.lllllII[aG.lllllIl[6]] = aG."TARROMIN";
        aG.lllllII[aG.lllllIl[7]] = aG."Grimy tarromin";
        aG.lllllII[aG.lllllIl[9]] = aG."HARRALANDER";
        aG.lllllII[aG.lllllIl[10]] = aG."Grimy harralander";
        aG.lllllII[aG.lllllIl[12]] = aG."RANARR_WEED";
        aG.lllllII[aG.lllllIl[13]] = aG."Grimy ranarr weed";
        aG.lllllII[aG.lllllIl[15]] = aG."TOADFLAX";
        aG.lllllII[aG.lllllIl[16]] = aG."Grimy toadflax";
        aG.lllllII[aG.lllllIl[18]] = aG."IRIT_LEAF";
        aG.lllllII[aG.lllllIl[19]] = aG."Grimy irit leaf";
        aG.lllllII[aG.lllllIl[21]] = aG."AVANTOE";
        aG.lllllII[aG.lllllIl[22]] = aG."Grimy avantoe";
        aG.lllllII[aG.lllllIl[24]] = aG."KWUARM";
        aG.lllllII[aG.lllllIl[25]] = aG."Grimy kwuarm";
        aG.lllllII[aG.lllllIl[27]] = aG."SNAPDRAGON";
        aG.lllllII[aG.lllllIl[28]] = aG."Grimy snapdragon";
        aG.lllllII[aG.lllllIl[30]] = aG."CADANTINE";
        aG.lllllII[aG.lllllIl[31]] = aG."Grimy cadantine";
        aG.lllllII[aG.lllllIl[33]] = aG."LANTADYME";
        aG.lllllII[aG.lllllIl[34]] = aG."Grimy lantadyme";
        aG.lllllII[aG.lllllIl[36]] = aG."DWARF_WEED";
        aG.lllllII[aG.lllllIl[37]] = aG."Grimy dwarf weed";
        aG.lllllII[aG.lllllIl[39]] = aG."TORSTOL";
        aG.lllllII[aG.lllllIl[40]] = aG."Grimy torstol";
    }

    public static aG valueOf(String string) {
        return Enum.valueOf(HerbType.class, string);
    }
}

