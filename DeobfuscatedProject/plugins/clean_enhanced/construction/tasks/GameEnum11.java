/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.construction.tasks;

public final class GameEnum11
extends Enum<H> {
    public static final  /* enum */ H KARAMJA_GLOVES_4;
    public static final  /* enum */ H RING_OF_DUELING;
    public static final  /* enum */ H FISHING_CAPE;
    public static final  /* enum */ H ROYAL_SEED_POD;
    private final  String teleportOption;
    public static final  /* enum */ H AMULET_OF_GLORY;
    public static final  /* enum */ H CHRONICLE;
    private final  int[] itemID;
    public static final  /* enum */ H RADAS_BLESSING;
    private static final  H[] $VALUES;
    private static  String[] lIlIIllll;
    public static final  /* enum */ H CONSTRUCTION_CAPE;
    public static final  /* enum */ H EXPLORERS_RING;
    public static final  /* enum */ H CRAFTING_CAPE;
    private  boolean mustBeEquipped;
    private static  int[] lIlIlIIII;
    public static final  /* enum */ H KARAMJA_GLOVES_3;
    public static final  /* enum */ H MAX_CAPE;
    public static final  /* enum */ H ARDOUGNE_CLOAK;
    public static final  /* enum */ H ECTOPHIAL;

    public static H valueOf(String string) {
        return Enum.valueOf(GameEnum11.class, string);
    }

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = lIlIlIIII[0];
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = lIlIlIIII[0];
        while (H.var10(var9, var8)) {
            char var11 = var7[var9];
            var4.append((char)(var11 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    public int[] av() {
        return this.itemID;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum11(String string2, boolean bl2, int ... nArray) {
        this.itemID = nArray;
        this.mustBeEquipped = bl2;
        this.teleportOption = string2;
    }

    private static void var24() {
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

    private GameEnum11(String string2, int ... nArray) {
        this.itemID = nArray;
        this.teleportOption = string2;
    }

    public static H[] values() {
        return (H[])$VALUES.clone();
    }

    private static void var25() {
        lIlIIllll = new String[lIlIlIIII[62]];
        H.lIlIIllll[H.lIlIlIIII[0]] = "CONSTRUCTION_CAPE";
        H.lIlIIllll[H.lIlIlIIII[1]] = "Tele to POH";
        H.lIlIIllll[H.lIlIlIIII[2]] = "MAX_CAPE";
        H.lIlIIllll[H.lIlIlIIII[5]] = "Tele to POH";
        H.lIlIIllll[H.lIlIlIIII[7]] = "CRAFTING_CAPE";
        H.lIlIIllll[H.lIlIlIIII[8]] = "Teleport";
        H.lIlIIllll[H.lIlIlIIII[11]] = "FISHING_CAPE";
        H.lIlIIllll[H.lIlIlIIII[12]] = "Fishing Guild";
        H.lIlIIllll[H.lIlIlIIII[15]] = "ARDOUGNE_CLOAK";
        H.lIlIIllll[H.lIlIlIIII[16]] = "Monastery Teleport";
        H.lIlIIllll[H.lIlIlIIII[21]] = "ECTOPHIAL";
        H.lIlIIllll[H.lIlIlIIII[22]] = "Empty";
        H.lIlIIllll[H.lIlIlIIII[24]] = "KARAMJA_GLOVES_3";
        H.lIlIIllll[H.lIlIlIIII[25]] = "Gem Mine";
        H.lIlIIllll[H.lIlIlIIII[27]] = "KARAMJA_GLOVES_4";
        H.lIlIIllll[H.lIlIlIIII[28]] = "Duradel";
        H.lIlIIllll[H.lIlIlIIII[30]] = "EXPLORERS_RING";
        H.lIlIIllll[H.lIlIlIIII[31]] = "Teleport";
        H.lIlIIllll[H.lIlIlIIII[34]] = "ROYAL_SEED_POD";
        H.lIlIIllll[H.lIlIlIIII[35]] = "Commune";
        H.lIlIIllll[H.lIlIlIIII[37]] = "CHRONICLE";
        H.lIlIIllll[H.lIlIlIIII[38]] = "Teleport";
        H.lIlIIllll[H.lIlIlIIII[40]] = "AMULET_OF_GLORY";
        H.lIlIIllll[H.lIlIlIIII[41]] = "Edgeville";
        H.lIlIIllll[H.lIlIlIIII[49]] = "RING_OF_DUELING";
        H.lIlIIllll[H.lIlIlIIII[50]] = "Castle Wars";
        H.lIlIIllll[H.lIlIlIIII[59]] = "RADAS_BLESSING";
        H.lIlIIllll[H.lIlIlIIII[60]] = "Mount Karuulm";
    }

    public String au() {
        return this.teleportOption;
    }

    public boolean aw() {
        return this.mustBeEquipped;
    }
}

