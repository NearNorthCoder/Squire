/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum2
extends Enum<o> {
    public static final  /* enum */ o EMERALD_AMULET;
    public static final  /* enum */ o OPAL_AMULET;
    public static final  /* enum */ o ONYX_RING;
    public static final  /* enum */ o GOLD_NECKLACE;
    public static final  /* enum */ o DRAGONSTONE_RING;
    public static final  /* enum */ o RUBY_BRACELET;
    private final  int craftingWidgetGroup;
    public static final  /* enum */ o RUBY_NECKLACE;
    public static final  /* enum */ o ZENYTE_BRACELET;
    public static final  /* enum */ o EMERALD_BRACELET;
    public static final  /* enum */ o DIAMOND_BRACELET;
    private final  int materialID;
    public static final  /* enum */ o RUBY_RING;
    public static final  /* enum */ o DIAMOND_AMULET;
    public static final  /* enum */ o ONYX_AMULET;
    public static final  /* enum */ o OPAL_RING;
    private final  int finishedID;
    public static final  /* enum */ o OPAL_NECKLACE;
    public static final  /* enum */ o JADE_NECKLACE;
    public static final  /* enum */ o EMERALD_NECKLACE;
    public static final  /* enum */ o ONYX_NECKLACE;
    public static final  /* enum */ o SAPPHIRE_AMULET;
    private final  String craftingOption;
    
    private final  int mouldID;
    public static final  /* enum */ o GOLD_RING;
    public static final  /* enum */ o DRAGONSTONE_BRACELET;
    public static final  /* enum */ o SAPPHIRE_BRACELET;
    public static final  /* enum */ o OPAL_BRACELET;
    public static final  /* enum */ o ONYX_BRACELET;
    public static final  /* enum */ o TOPAZ_RING;
    public static final  /* enum */ o TOPAZ_NECKLACE;
    public static final  /* enum */ o GOLD_AMULET;
    
    public static final  /* enum */ o SAPPHIRE_NECKLACE;
    public static final  /* enum */ o SAPPHIRE_RING;
    public static final  /* enum */ o RUBY_AMULET;
    public static final  /* enum */ o JADE_RING;
    public static final  /* enum */ o GOLD_BRACELET;
    public static final  /* enum */ o TOPAZ_BRACELET;
    public static final  /* enum */ o DRAGONSTONE_NECKLACE;
    public static final  /* enum */ o ZENYTE_AMULET;
    public static final  /* enum */ o EMERALD_RING;
    public static final  /* enum */ o DRAGONSTONE_AMULET;
    public static final  /* enum */ o JADE_AMULET;
    public static final  /* enum */ o DIAMOND_RING;
    public static final  /* enum */ o TOPAZ_AMULET;
    public static final  /* enum */ o JADE_BRACELET;
    private final  int secondaryID;
    public static final  /* enum */ o DIAMOND_NECKLACE;
    public static final  /* enum */ o ZENYTE_NECKLACE;
    private final  int craftingWidgetID;
    private static final  o[] $VALUES;
    public static final  /* enum */ o ZENYTE_RING;

    private GameEnum2(int n3, int n4, int n5, int n6, int n7, int n8, String string2) {
        this.materialID = n3;
        this.secondaryID = n4;
        this.mouldID = n5;
        this.finishedID = n6;
        this.craftingWidgetGroup = n7;
        this.craftingWidgetID = n8;
        this.craftingOption = string2;
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public int K() {
        return this.craftingWidgetID;
    }

    public int z() {
        return this.materialID;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    static {
        o.var9();
        o.var10();
        GOLD_RING = new GameEnum2(var1[2], var1[3], var1[4], var1[5], var1[6], var2[var1[7]]);
        GOLD_NECKLACE = new GameEnum2(var1[2], var1[9], var1[10], var1[5], var1[11], var2[var1[12]]);
        GOLD_AMULET = new GameEnum2(var1[2], var1[14], var1[15], var1[5], var1[16], var2[var1[17]]);
        GOLD_BRACELET = new GameEnum2(var1[2], var1[19], var1[20], var1[5], var1[21], var2[var1[22]]);
        OPAL_RING = new GameEnum2(var1[23], var1[24], var1[3], var1[25], var1[18], var1[22], var2[var1[26]]);
        OPAL_NECKLACE = new GameEnum2(var1[23], var1[24], var1[9], var1[28], var1[18], var1[29], var2[var1[29]]);
        OPAL_BRACELET = new GameEnum2(var1[23], var1[24], var1[19], var1[31], var1[18], var1[32], var2[var1[33]]);
        OPAL_AMULET = new GameEnum2(var1[23], var1[24], var1[14], var1[35], var1[18], var1[36], var2[var1[36]]);
        JADE_RING = new GameEnum2(var1[38], var1[24], var1[3], var1[39], var1[18], var1[6], var2[var1[40]]);
        JADE_NECKLACE = new GameEnum2(var1[38], var1[24], var1[9], var1[42], var1[18], var1[30], var2[var1[32]]);
        JADE_BRACELET = new GameEnum2(var1[38], var1[24], var1[19], var1[44], var1[18], var1[43], var2[var1[45]]);
        JADE_AMULET = new GameEnum2(var1[38], var1[24], var1[14], var1[47], var1[18], var1[37], var2[var1[11]]);
        TOPAZ_RING = new GameEnum2(var1[49], var1[24], var1[3], var1[50], var1[18], var1[26], var2[var1[51]]);
        TOPAZ_NECKLACE = new GameEnum2(var1[49], var1[24], var1[9], var1[53], var1[18], var1[33], var2[var1[54]]);
        TOPAZ_BRACELET = new GameEnum2(var1[49], var1[24], var1[19], var1[56], var1[18], var1[45], var2[var1[57]]);
        TOPAZ_AMULET = new GameEnum2(var1[49], var1[24], var1[14], var1[59], var1[18], var1[40], var2[var1[60]]);
        SAPPHIRE_RING = new GameEnum2(var1[62], var1[2], var1[3], var1[63], var1[5], var1[26], var2[var1[64]]);
        SAPPHIRE_NECKLACE = new GameEnum2(var1[62], var1[2], var1[9], var1[66], var1[5], var1[48], var2[var1[67]]);
        SAPPHIRE_BRACELET = new GameEnum2(var1[62], var1[2], var1[19], var1[69], var1[5], var1[70], var2[var1[16]]);
        SAPPHIRE_AMULET = new GameEnum2(var1[62], var1[2], var1[14], var1[72], var1[5], var1[71], var2[var1[73]]);
        EMERALD_RING = new GameEnum2(var1[75], var1[2], var1[3], var1[76], var1[5], var1[27], var2[var1[77]]);
        EMERALD_NECKLACE = new GameEnum2(var1[75], var1[2], var1[9], var1[79], var1[5], var1[51], var2[var1[80]]);
        EMERALD_BRACELET = new GameEnum2(var1[75], var1[2], var1[19], var1[82], var1[5], var1[83], var2[var1[84]]);
        EMERALD_AMULET = new GameEnum2(var1[75], var1[2], var1[14], var1[86], var1[5], var1[73], var2[var1[87]]);
        RUBY_RING = new GameEnum2(var1[89], var1[2], var1[3], var1[90], var1[5], var1[29], var2[var1[91]]);
        RUBY_NECKLACE = new GameEnum2(var1[89], var1[2], var1[9], var1[92], var1[5], var1[52], var2[var1[93]]);
        RUBY_BRACELET = new GameEnum2(var1[89], var1[2], var1[19], var1[94], var1[5], var1[95], var2[var1[83]]);
        RUBY_AMULET = new GameEnum2(var1[89], var1[2], var1[14], var1[96], var1[5], var1[74], var2[var1[97]]);
        DIAMOND_RING = new GameEnum2(var1[99], var1[2], var1[3], var1[100], var1[5], var1[30], var2[var1[101]]);
        DIAMOND_NECKLACE = new GameEnum2(var1[99], var1[2], var1[9], var1[103], var1[5], var1[54], var2[var1[104]]);
        DIAMOND_BRACELET = new GameEnum2(var1[99], var1[2], var1[19], var1[106], var1[5], var1[97], var2[var1[107]]);
        DIAMOND_AMULET = new GameEnum2(var1[99], var1[2], var1[14], var1[109], var1[5], var1[77], var2[var1[110]]);
        DRAGONSTONE_RING = new GameEnum2(var1[112], var1[2], var1[3], var1[113], var1[5], var1[33], var2[var1[114]]);
        DRAGONSTONE_NECKLACE = new GameEnum2(var1[112], var1[2], var1[9], var1[116], var1[5], var1[55], var2[var1[117]]);
        DRAGONSTONE_BRACELET = new GameEnum2(var1[112], var1[2], var1[19], var1[119], var1[5], var1[98], var2[var1[120]]);
        DRAGONSTONE_AMULET = new GameEnum2(var1[112], var1[2], var1[14], var1[122], var1[5], var1[78], var2[var1[123]]);
        ONYX_RING = new GameEnum2(var1[125], var1[2], var1[3], var1[126], var1[5], var1[34], var2[var1[127]]);
        ONYX_NECKLACE = new GameEnum2(var1[125], var1[2], var1[9], var1[129], var1[5], var1[57], var2[var1[130]]);
        ONYX_BRACELET = new GameEnum2(var1[125], var1[2], var1[19], var1[132], var1[5], var1[101], var2[var1[133]]);
        ONYX_AMULET = new GameEnum2(var1[125], var1[2], var1[14], var1[135], var1[5], var1[80], var2[var1[136]]);
        ZENYTE_RING = new GameEnum2(var1[138], var1[2], var1[3], var1[139], var1[5], var1[36], var2[var1[140]]);
        ZENYTE_NECKLACE = new GameEnum2(var1[138], var1[2], var1[9], var1[142], var1[5], var1[58], var2[var1[143]]);
        ZENYTE_BRACELET = new GameEnum2(var1[138], var1[2], var1[19], var1[145], var1[5], var1[102], var2[var1[146]]);
        ZENYTE_AMULET = new GameEnum2(var1[138], var1[2], var1[14], var1[148], var1[5], var1[81], var2[var1[149]]);
        o[] oArray = new o[var1[81]];
        oArray[o.var1[1]] = GOLD_RING;
        oArray[o.var1[7]] = GOLD_NECKLACE;
        oArray[o.var1[8]] = GOLD_AMULET;
        oArray[o.var1[12]] = GOLD_BRACELET;
        oArray[o.var1[13]] = OPAL_RING;
        oArray[o.var1[17]] = OPAL_NECKLACE;
        oArray[o.var1[18]] = OPAL_BRACELET;
        oArray[o.var1[22]] = OPAL_AMULET;
        oArray[o.var1[6]] = JADE_RING;
        oArray[o.var1[26]] = JADE_NECKLACE;
        oArray[o.var1[27]] = JADE_BRACELET;
        oArray[o.var1[29]] = JADE_AMULET;
        oArray[o.var1[30]] = TOPAZ_RING;
        oArray[o.var1[33]] = TOPAZ_NECKLACE;
        oArray[o.var1[34]] = TOPAZ_BRACELET;
        oArray[o.var1[36]] = TOPAZ_AMULET;
        oArray[o.var1[37]] = SAPPHIRE_RING;
        oArray[o.var1[40]] = SAPPHIRE_NECKLACE;
        oArray[o.var1[41]] = SAPPHIRE_BRACELET;
        oArray[o.var1[32]] = SAPPHIRE_AMULET;
        oArray[o.var1[43]] = EMERALD_RING;
        oArray[o.var1[45]] = EMERALD_NECKLACE;
        oArray[o.var1[46]] = EMERALD_BRACELET;
        oArray[o.var1[11]] = EMERALD_AMULET;
        oArray[o.var1[48]] = RUBY_RING;
        oArray[o.var1[51]] = RUBY_NECKLACE;
        oArray[o.var1[52]] = RUBY_BRACELET;
        oArray[o.var1[54]] = RUBY_AMULET;
        oArray[o.var1[55]] = DIAMOND_RING;
        oArray[o.var1[57]] = DIAMOND_NECKLACE;
        oArray[o.var1[58]] = DIAMOND_BRACELET;
        oArray[o.var1[60]] = DIAMOND_AMULET;
        oArray[o.var1[61]] = DRAGONSTONE_RING;
        oArray[o.var1[64]] = DRAGONSTONE_NECKLACE;
        oArray[o.var1[65]] = DRAGONSTONE_BRACELET;
        oArray[o.var1[67]] = DRAGONSTONE_AMULET;
        oArray[o.var1[68]] = ONYX_RING;
        oArray[o.var1[16]] = ONYX_NECKLACE;
        oArray[o.var1[71]] = ONYX_BRACELET;
        oArray[o.var1[73]] = ONYX_AMULET;
        oArray[o.var1[74]] = ZENYTE_RING;
        oArray[o.var1[77]] = ZENYTE_NECKLACE;
        oArray[o.var1[78]] = ZENYTE_BRACELET;
        oArray[o.var1[80]] = ZENYTE_AMULET;
        $VALUES = oArray;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[1];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[1];
        while (o.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if ((0x87 ^ 0x83) != 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public String L() {
        return this.craftingOption;
    }

    private static void var9() {
        var1 = new int[151];
        o.var1[0] = -1;
        o.var1[1] = (0x4A ^ 0x52) & ~(0x9F ^ 0x87);
        o.var1[2] = 0xFFFFC93F & 0x3FF5;
        o.var1[3] = 0xFFFFDEBD & 0x277A;
        o.var1[4] = 0xFFFFF76F & 0xEF3;
        o.var1[5] = 0xFFFFE1BF & 0x1FFE;
        o.var1[6] = 0xDB ^ 0x82 ^ (0x61 ^ 0x30);
        o.var1[7] = 1;
        o.var1[8] = 2;
        o.var1[9] = 0xFFFFCEBF & 0x377D;
        o.var1[10] = 0xFFFFBF7F & 0x46F6;
        o.var1[11] = 0x15 ^ 2;
        o.var1[12] = 3;
        o.var1[13] = 36 + 104 - 66 + 112 ^ 171 + 179 - 254 + 94;
        o.var1[14] = -(0xFFFFFD55 & 0x13EB) & (0xFFFF97FB & 0x7F7F);
        o.var1[15] = -(0xFFFFF7D3 & 0x782F) & (0xFFFFF69F & 0x7FEB);
        o.var1[16] = 0x50 ^ 0x75;
        o.var1[17] = 0x29 ^ 0x76 ^ (0xF4 ^ 0xAE);
        o.var1[18] = 0x5D ^ 0x2A ^ (0xDC ^ 0xAD);
        o.var1[19] = -(0xFFFFD44B & 0x6FF7) & (0xFFFFEF7B & Short.MAX_VALUE);
        o.var1[20] = -(0xFFFF85C7 & 0x7E7B) & (0xFFFFAFFE & 0x7F7F);
        o.var1[21] = 0x7B ^ 0x2E ^ (0xEB ^ 0x8C);
        o.var1[22] = 0x89 ^ 0xB9 ^ (0x92 ^ 0xA5);
        o.var1[23] = 0xFFFFB6E9 & 0x4F5F;
        o.var1[24] = -(0xFFFFAFDD & 0x766F) & (0xFFFFAF7F & Short.MAX_VALUE);
        o.var1[25] = 0xFFFFD7DF & 0x7A79;
        o.var1[26] = 0x7A ^ 0x73;
        o.var1[27] = 0x88 ^ 0x82;
        o.var1[28] = 0xFFFFF3F2 & 0x5E6F;
        o.var1[29] = 0x59 ^ 0x52;
        o.var1[30] = 159 + 35 - 124 + 132 ^ 32 + 128 - 66 + 104;
        o.var1[31] = 0xFFFFD3FD & 0x7E7F;
        o.var1[32] = 0xB0 ^ 0xA3;
        o.var1[33] = 2 ^ 0x1C ^ (0x46 ^ 0x55);
        o.var1[34] = 21 + 11 - -90 + 18 ^ 109 + 60 - 139 + 100;
        o.var1[35] = -(0xFFFFA7BF & 0x7D55) & (0xFFFFFFFF & 0x777F);
        o.var1[36] = 1 ^ (0x2E ^ 0x20);
        o.var1[37] = 0x1F ^ 0x40 ^ (0x68 ^ 0x27);
        o.var1[38] = -(0xFFFFEBB3 & 0x7DDD) & (0xFFFFFFFB & 0x6FDF);
        o.var1[39] = 0xFFFFF2DF & 0x5F7C;
        o.var1[40] = 0x10 ^ 1;
        o.var1[41] = 0x6C ^ 0x7E;
        o.var1[42] = 0xFFFFDBE5 & 0x767F;
        o.var1[43] = 0x91 ^ 0x85;
        o.var1[44] = 0xFFFFDE9C & 0x73E3;
        o.var1[45] = 0x62 ^ 0x77;
        o.var1[46] = 0x28 ^ 0x59 ^ (0xA6 ^ 0xC1);
        o.var1[47] = -(0xFFFFA0F7 & 0x7F8A) & (0xFFFFF6FF & 0x7BEF);
        o.var1[48] = 0xCD ^ 0x9E ^ (0xC1 ^ 0x8A);
        o.var1[49] = -(0xFFFFD50F & 0x7BF3) & (0xFFFFD7EF & 0x7F5F);
        o.var1[50] = 0xFFFFFADF & 0x577F;
        o.var1[51] = 0x89 ^ 0x90;
        o.var1[52] = 8 ^ 0x12;
        o.var1[53] = -(0xFFFFAD4E & 0x7BB7) & (0xFFFFFF7F & 0x7BED);
        o.var1[54] = 0x1F ^ 0x23 ^ (0xB6 ^ 0x91);
        o.var1[55] = 0x89 ^ 0x95;
        o.var1[56] = -(0xFFFFBFEB & 0x653D) & (0xFFFFF7AF & 0x7FFB);
        o.var1[57] = 0xB6 ^ 0xAB;
        o.var1[58] = 0xE7 ^ 0x8A ^ (0xC3 ^ 0xB0);
        o.var1[59] = -(0xFFFFE4E5 & 0x3F9B) & (0xFFFFF7F7 & 0x7EF9);
        o.var1[60] = 3 ^ (0x9C ^ 0x80);
        o.var1[61] = 21 + 80 - 7 + 43 ^ 54 + 161 - 161 + 115;
        o.var1[62] = -(0xFFFFEDAF & 0x5BF1) & (0xFFFFCFFF & 0x7FE7);
        o.var1[63] = -(0xFFFFCBDF & 0x7DB3) & (0xFFFFFFF7 & 0x4FFF);
        o.var1[64] = 0x12 ^ 0x33;
        o.var1[65] = 0x9B ^ 0xB9;
        o.var1[66] = -(0xFFFFEDEF & 0x7217) & (0xFFFFF6FE & 0x6F7F);
        o.var1[67] = 1 ^ (0x58 ^ 0x7A);
        o.var1[68] = 0x80 ^ 0xA4;
        o.var1[69] = -(0xFFFFFEFF & 0x45C1) & (0xFFFFEFFF & Short.MAX_VALUE);
        o.var1[70] = 0xA5 ^ 0x9A ^ (0x5E ^ 0x55);
        o.var1[71] = 0x44 ^ 0x67 ^ (0x8A ^ 0x8F);
        o.var1[72] = 0xFFFFF6DB & 0xFAF;
        o.var1[73] = 0x5C ^ 0x59 ^ (0xA3 ^ 0x81);
        o.var1[74] = 3 ^ 0x2B;
        o.var1[75] = -(0xFFFFD7AF & 0x387B) & (0xFFFFB6FF & 0x5F6F);
        o.var1[76] = 0xFFFFE6EF & 0x1F77;
        o.var1[77] = 0x72 ^ 0x49 ^ (0x12 ^ 0);
        o.var1[78] = 6 + 11 - 6 + 156 ^ 96 + 60 - 127 + 112;
        o.var1[79] = -(0xFFFFFABA & 0x7547) & (0xFFFFFFFF & 0x767B);
        o.var1[80] = 0xA5 ^ 0x8E;
        o.var1[81] = 0xE9 ^ 0x8A ^ (0x2E ^ 0x61);
        o.var1[82] = -(104 + 63 - 156 + 119) & (0xFFFFFBC5 & 0x2FFF);
        o.var1[83] = 0x22 ^ 0x75 ^ (0xCA ^ 0xA8);
        o.var1[84] = 0x6F ^ 0x45 ^ (0x2D ^ 0x2A);
        o.var1[85] = 0x35 ^ 0x1B;
        o.var1[86] = -(0xFFFFB963 & 0x7E9F) & (0xFFFFBFBF & 0x7ECF);
        o.var1[87] = 0x86 ^ 0xB8 ^ (0x98 ^ 0x89);
        o.var1[88] = 0x2A ^ 0x67 ^ (0x26 ^ 0x5B);
        o.var1[89] = 0xFFFFA6FB & 0x5F47;
        o.var1[90] = 0xFFFF9EE9 & 0x677F;
        o.var1[91] = 7 ^ 0x36;
        o.var1[92] = 0xFFFF877E & 0x7EFD;
        o.var1[93] = 0xF3 ^ 0xBF ^ 17 + 5 - -51 + 54;
        o.var1[94] = -(0xFFFFDEFB & 0x6117) & (0xFFFFFFFF & 0x6B5F);
        o.var1[95] = 0x5C ^ 0x6A;
        o.var1[96] = -(0xFFFFF1BD & 0x1F53) & (0xFFFFDFDF & 0x37BF);
        o.var1[97] = 0x4D ^ 0x65 ^ (0xBB ^ 0xA4);
        o.var1[98] = 34 + 204 - 212 + 225 ^ 8 + 32 - -34 + 121;
        o.var1[99] = -(0xFFFFFEBF & 0x71E7) & (0xFFFFFFFF & 0x76E7);
        o.var1[100] = -(0xFFFFDDF1 & 0x721F) & (0xFFFFFEFB & 0x577F);
        o.var1[101] = 0x1A ^ 0x76 ^ (0x95 ^ 0xC0);
        o.var1[102] = 0xBB ^ 0x81;
        o.var1[103] = -(0xFFFFC9A1 & 0x77DF) & (0xFFFFDFFF & 0x67FE);
        o.var1[104] = 0xA7 ^ 0x9C;
        o.var1[105] = 0xC6 ^ 0xBB ^ (0xF5 ^ 0xB4);
        o.var1[106] = 0xFFFFFFDC & 0x2B77;
        o.var1[107] = 146 + 27 - 93 + 71 ^ 100 + 42 - 82 + 110;
        o.var1[108] = 0x80 ^ 0xBE;
        o.var1[109] = 0xFFFFFF9B & 0x6F5;
        o.var1[110] = 0x85 ^ 0xBA;
        o.var1[111] = 0xFA ^ 0xBA;
        o.var1[112] = -(0xFFFFBDFF & 0x6BA1) & (0xFFFFEFEF & 0x3FFF);
        o.var1[113] = 0xFFFFDFED & 0x267F;
        o.var1[114] = 0x4C ^ 0xD;
        o.var1[115] = 0x59 ^ 0x1B;
        o.var1[116] = 0xFFFFD7D1 & 0x2EAE;
        o.var1[117] = 0x2C ^ 0x6F;
        o.var1[118] = 0xED ^ 0xC7 ^ (0x2D ^ 0x43);
        o.var1[119] = 0xFFFFFF7F & 0x2BEB;
        o.var1[120] = 0xDA ^ 0xBC ^ (0xE1 ^ 0xC2);
        o.var1[121] = 44 + 198 - 190 + 181 ^ 59 + 92 - 19 + 43;
        o.var1[122] = 0xFFFFCEFF & 0x3793;
        o.var1[123] = 218 + 204 - 383 + 209 ^ 70 + 17 - 30 + 134;
        o.var1[124] = 0xD5 ^ 0x9D;
        o.var1[125] = -(0xFFFF8CB3 & 0x775D) & (0xFFFFDFBD & 0x3DFF);
        o.var1[126] = 0xFFFFD9AF & 0x3FFF;
        o.var1[127] = 0x3E ^ 0x77;
        o.var1[128] = 0x7F ^ 0x35;
        o.var1[129] = -(0xFFFFDF6F & 0x26DF) & (0xFFFF9FFF & Short.MAX_VALUE);
        o.var1[130] = 137 + 131 - 237 + 212 ^ 135 + 107 - 182 + 124;
        o.var1[131] = 0xE2 ^ 0xA1 ^ (0xB7 ^ 0xB8);
        o.var1[132] = -(0xFFFFBD7F & 0x5686) & (0xFFFFFFFF & 0x3F7F);
        o.var1[133] = 0xAE ^ 0x8C ^ (0x4C ^ 0x23);
        o.var1[134] = 0x19 ^ 0x57;
        o.var1[135] = 0xFFFFF9BB & 0x1FF7;
        o.var1[136] = 0x34 ^ 0x22 ^ (0x7B ^ 0x22);
        o.var1[137] = 0x92 ^ 0xC2;
        o.var1[138] = 0xFFFFFCBF & 0x4F65;
        o.var1[139] = -(0xFFFFBBEF & 0x57B6) & (0xFFFFFFFF & 0x5FF7);
        o.var1[140] = 0x5D ^ 0x62 ^ (0x37 ^ 0x59);
        o.var1[141] = 0xE6 ^ 0xB4;
        o.var1[142] = 0xFFFFEFEF & 0x5C5F;
        o.var1[143] = 0xC0 ^ 0x93;
        o.var1[144] = 81 + 240 - 217 + 141 ^ 45 + 143 - 31 + 4;
        o.var1[145] = 0xFFFFDC66 & 0x6FBD;
        o.var1[146] = 0xEC ^ 0xB9;
        o.var1[147] = 0x59 ^ 0x11 ^ (0x9D ^ 0x83);
        o.var1[148] = -(0xFFFFF791 & 0x1BFF) & (0xFFFFDFBD & Short.MAX_VALUE);
        o.var1[149] = 0x5D ^ 0x12 ^ (0x58 ^ 0x40);
        o.var1[150] = 0x5F ^ 7;
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    public int E() {
        return this.finishedID;
    }

    public int J() {
        return this.craftingWidgetGroup;
    }

    private GameEnum2(int n3, int n4, int n5, int n6, int n7, String string2) {
        this.materialID = n3;
        this.secondaryID = var1[0];
        this.mouldID = n4;
        this.finishedID = n5;
        this.craftingWidgetGroup = n6;
        this.craftingWidgetID = n7;
        this.craftingOption = string2;
    }

    public int I() {
        return this.mouldID;
    }

    private static void var10() {
        var2 = new String[var1[150]];
        o.var2[o.var1[1]] = "GOLD_RING";
        o.var2[o.var1[7]] = "Make";
        o.var2[o.var1[8]] = "GOLD_NECKLACE";
        o.var2[o.var1[12]] = "Make";
        o.var2[o.var1[13]] = "GOLD_AMULET";
        o.var2[o.var1[17]] = "Make";
        o.var2[o.var1[18]] = "GOLD_BRACELET";
        o.var2[o.var1[22]] = "Make";
        o.var2[o.var1[6]] = "OPAL_RING";
        o.var2[o.var1[26]] = "Craft";
        o.var2[o.var1[27]] = "OPAL_NECKLACE";
        o.var2[o.var1[29]] = "Craft";
        o.var2[o.var1[30]] = "OPAL_BRACELET";
        o.var2[o.var1[33]] = "Craft";
        o.var2[o.var1[34]] = "OPAL_AMULET";
        o.var2[o.var1[36]] = "Craft";
        o.var2[o.var1[37]] = "JADE_RING";
        o.var2[o.var1[40]] = "Craft";
        o.var2[o.var1[41]] = "JADE_NECKLACE";
        o.var2[o.var1[32]] = "Craft";
        o.var2[o.var1[43]] = "JADE_BRACELET";
        o.var2[o.var1[45]] = "Craft";
        o.var2[o.var1[46]] = "JADE_AMULET";
        o.var2[o.var1[11]] = "Craft";
        o.var2[o.var1[48]] = "TOPAZ_RING";
        o.var2[o.var1[51]] = "Craft";
        o.var2[o.var1[52]] = "TOPAZ_NECKLACE";
        o.var2[o.var1[54]] = "Craft";
        o.var2[o.var1[55]] = "TOPAZ_BRACELET";
        o.var2[o.var1[57]] = "Craft";
        o.var2[o.var1[58]] = "TOPAZ_AMULET";
        o.var2[o.var1[60]] = "Craft";
        o.var2[o.var1[61]] = "SAPPHIRE_RING";
        o.var2[o.var1[64]] = "Make";
        o.var2[o.var1[65]] = "SAPPHIRE_NECKLACE";
        o.var2[o.var1[67]] = "Make";
        o.var2[o.var1[68]] = "SAPPHIRE_BRACELET";
        o.var2[o.var1[16]] = "Make";
        o.var2[o.var1[71]] = "SAPPHIRE_AMULET";
        o.var2[o.var1[73]] = "Make";
        o.var2[o.var1[74]] = "EMERALD_RING";
        o.var2[o.var1[77]] = "Make";
        o.var2[o.var1[78]] = "EMERALD_NECKLACE";
        o.var2[o.var1[80]] = "Make";
        o.var2[o.var1[81]] = "EMERALD_BRACELET";
        o.var2[o.var1[84]] = "Make";
        o.var2[o.var1[85]] = "EMERALD_AMULET";
        o.var2[o.var1[87]] = "Make";
        o.var2[o.var1[88]] = "RUBY_RING";
        o.var2[o.var1[91]] = "Make";
        o.var2[o.var1[21]] = "RUBY_NECKLACE";
        o.var2[o.var1[93]] = "Make";
        o.var2[o.var1[70]] = "RUBY_BRACELET";
        o.var2[o.var1[83]] = "Make";
        o.var2[o.var1[95]] = "RUBY_AMULET";
        o.var2[o.var1[97]] = "Make";
        o.var2[o.var1[98]] = "DIAMOND_RING";
        o.var2[o.var1[101]] = "Make";
        o.var2[o.var1[102]] = "DIAMOND_NECKLACE";
        o.var2[o.var1[104]] = "Make";
        o.var2[o.var1[105]] = "DIAMOND_BRACELET";
        o.var2[o.var1[107]] = "Make";
        o.var2[o.var1[108]] = "DIAMOND_AMULET";
        o.var2[o.var1[110]] = "Make";
        o.var2[o.var1[111]] = "DRAGONSTONE_RING";
        o.var2[o.var1[114]] = "Make";
        o.var2[o.var1[115]] = "DRAGONSTONE_NECKLACE";
        o.var2[o.var1[117]] = "Make";
        o.var2[o.var1[118]] = "DRAGONSTONE_BRACELET";
        o.var2[o.var1[120]] = "Make";
        o.var2[o.var1[121]] = "DRAGONSTONE_AMULET";
        o.var2[o.var1[123]] = "Make";
        o.var2[o.var1[124]] = "ONYX_RING";
        o.var2[o.var1[127]] = "Make";
        o.var2[o.var1[128]] = "ONYX_NECKLACE";
        o.var2[o.var1[130]] = "Make";
        o.var2[o.var1[131]] = "ONYX_BRACELET";
        o.var2[o.var1[133]] = "Make";
        o.var2[o.var1[134]] = "ONYX_AMULET";
        o.var2[o.var1[136]] = "Make";
        o.var2[o.var1[137]] = "ZENYTE_RING";
        o.var2[o.var1[140]] = "Make";
        o.var2[o.var1[141]] = "ZENYTE_NECKLACE";
        o.var2[o.var1[143]] = "Make";
        o.var2[o.var1[144]] = "ZENYTE_BRACELET";
        o.var2[o.var1[146]] = "Make";
        o.var2[o.var1[147]] = "ZENYTE_AMULET";
        o.var2[o.var1[149]] = "Make";
    }

    public int H() {
        return this.secondaryID;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

