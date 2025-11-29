/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 */
package gg.squire.vardorvis.tasks;

import com.google.common.collect.ImmutableMap;
import java.security.InvalidParameterException;
import java.util.Map;
import java.util.stream.Collectors;
import gg.squire.vardorvis.tasks.GameEnum3;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i MELEE_DRAGON_WARHAMMER_SPEC;
    public static final  /* enum */ i MELEE_2H_CRUSH;
    public static final  /* enum */ i RANGED_DARTS;
    public static final  /* enum */ i MELEE_AHRIMS_STAFF_CRUSH;
    public final  int baseSpellDamage;
    public static final  /* enum */ i RANGED_RUNE_CROSSBOW;
    public static final  /* enum */ i RANGED_DRAGON_KNIFE_SPEC;
    public static final  /* enum */ i MELEE_INQUISITORS_MACE;
    public static final  /* enum */ i MELEE_ZAMORAK_GODSWORD_SPEC;
    public static final  /* enum */ i MAGIC_STANDARD_WAVE_STAFF;
    public static final  /* enum */ i RANGED_CROSSBOW_PVP;
    public static final  /* enum */ i MELEE_SPEAR_CRUSH;
    public static final  /* enum */ i RANGED_SHORTBOW;
    public static final  /* enum */ i RANGED_CHINCHOMPA;
    public static final  /* enum */ i MAGIC_STANDARD_BIND_STAFF;
    public static final  /* enum */ i MELEE_ABYSSAL_BLUDGEON_CRUSH;
    public static final  /* enum */ i MELEE_ABYSSAL_DAGGER_STAB;
    public static final  /* enum */ i MELEE_SCYTHE;
    public static final  /* enum */ i MELEE_VLS_SPEC;
    public static final  /* enum */ i MELEE_BATTLEAXE_CRUSH;
    public static final  /* enum */ i RANGED_BLOWPIPE;
    public static final  /* enum */ i RANGED_RUNE_KNIFE;
    public static final  /* enum */ i MELEE_VIGGORAS_CHAINMACE;
    public static final  /* enum */ i MELEE_SWORD_STAB;
    public static final  /* enum */ i MELEE_GODSWORD_DEFENSIVE;
    public static final  /* enum */ i MELEE_DAGGER_SLASH;
    public static final  /* enum */ i MELEE_BATTLEAXE_SLASH;
    public static final  /* enum */ i RANGED_ZARYTE_CROSSBOW;
    public static final  /* enum */ i MELEE_KICK;
    public static final  /* enum */ i MELEE_STAFF_CRUSH_3;
    public static final  /* enum */ i MELEE_PUNCH;
    public static final  /* enum */ i MELEE_ARMADYL_GODSWORD_SPEC;
    public static final  /* enum */ i MELEE_SCIM_SLASH;
    private static final  Map<Integer, i> DATA;
    public static final  /* enum */ i MAGIC_STANDARD_SURGE_STAFF;
    public static final  /* enum */ i MELEE_ARMADYL_GODSWORD_OR_SPEC;
    public static final  /* enum */ i MELEE_ZAMORAK_GODSWORD_OR_SPEC;
    public final  boolean isSpecial;
    public static final  /* enum */ i RANGED_BALLISTA;
    public static final  /* enum */ i MELEE_LEAF_BLADED_BATTLEAXE_CRUSH;
    public static final  /* enum */ i MAGIC_STANDARD_BIND;
    public static final  /* enum */ i MELEE_GRANITE_MAUL_SPEC;
    public static final  /* enum */ i MELEE_DRAGON_CLAWS_SPEC;
    public static final  /* enum */ i MELEE_FANG_SPEC;
    
    public static final  /* enum */ i RANGED_ZARYTE_CROSSBOW_PVP;
    public static final  /* enum */ i MELEE_SARADOMIN_GODSWORD_SPEC;
    public static final  /* enum */ i MELEE_MACE_STAB;
    public final  int animationId;
    public static final  /* enum */ i MAGIC_TUMEKENS_SHADOW;
    public static final  /* enum */ i MELEE_ABYSSAL_WHIP;
    public static final  /* enum */ i RANGED_DRAGON_KNIFE;
    public static final  /* enum */ i MAGIC_ANCIENT_MULTI_TARGET;
    public static final  /* enum */ i MELEE_GENERIC_SLASH;
    public static final  /* enum */ i MELEE_LANCE_SLASH;
    public static final  /* enum */ i MAGIC_STANDARD_STRIKE_BOLT_BLAST;
    public static final  /* enum */ i MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC;
    public static final  /* enum */ i MELEE_SPEAR_STAB;
    public static final  /* enum */ i MELEE_GODSWORD_CRUSH;
    public static final  /* enum */ i RANGED_MAGIC_SHORTBOW_SPEC;
    public static final  /* enum */ i MELEE_LEAF_BLADED_BATTLEAXE_SLASH;
    public static final  /* enum */ i MELEE_2H_SLASH;
    public static final  /* enum */ i RANGED_BALLISTA_2;
    public static final  /* enum */ i MELEE_SARADOMIN_GODSWORD_OR_SPEC;
    public static final  /* enum */ i MELEE_OBBY_MAUL_CRUSH;
    private static final  i[] $VALUES;
    public static final  /* enum */ i MELEE_CRYSTAL_HALBERD_SPEC;
    public static final  /* enum */ i RANGED_DRAGON_KNIFE_POISONED;
    public static final  /* enum */ i MELEE_DLONG_SPEC;
    public static final  /* enum */ i MELEE_GHAZI_RAPIER_STAB;
    public static final  /* enum */ i MELEE_GRANITE_MAUL;
    public static final  /* enum */ i MELEE_DHAROKS_GREATAXE_SLASH;
    public static final  /* enum */ i RANGED_DRAGON_THROWNAXE_SPEC;
    public static final  /* enum */ i MELEE_LANCE_STAB;
    public static final  /* enum */ i MELEE_ANCIENT_GODSWORD_SPEC;
    public static final  /* enum */ i MELEE_ELDER_MAUL;
    public static final  /* enum */ i MELEE_LANCE_CRUSH;
    public static final  /* enum */ i MELEE_STAFF_SLASH;
    public static final  /* enum */ i MELEE_STAFF_CRUSH_2;
    public static final  /* enum */ i MELEE_FANG_STAB;
    public static final  /* enum */ i MELEE_DRAGON_MACE_SPEC;
    public final  j attackStyle;
    public static final  /* enum */ i MELEE_BANDOS_GODSWORD_SPEC;
    public static final  /* enum */ i MELEE_STAFF_STAB;
    public static final  /* enum */ i MELEE_GODSWORD_SLASH;
    public static final  /* enum */ i MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF;
    public static final  /* enum */ i MELEE_STAFF_CRUSH;
    
    public static final  /* enum */ i RANGED_RUNE_KNIFE_PVP;
    public static final  /* enum */ i MAGIC_ANCIENT_SINGLE_TARGET;
    public static final  /* enum */ i MELEE_BARRELCHEST_ANCHOR_CRUSH;
    public static final  /* enum */ i MELEE_DHAROKS_GREATAXE_CRUSH;
    public static final  /* enum */ i MELEE_DRAGON_DAGGER_SPEC;
    public static final  /* enum */ i MELEE_BANDOS_GODSWORD_OR_SPEC;

    /*
     * WARNING - void declaration
     */
    
                } else {
                    void var11;
                    var11.put((Object)var9.animationId, (Object)var9);
                    0;
                }
                ++var6;
                0;
                if null == null continue;
                break block4;
            }
            DATA = builder.build();
        }
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (i.var7(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((0x65 ^ 0x61) <= (0xA8 ^ 0xAC)) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static boolean var22(Object object) {
        return object == null;
    }

    private static void var4() {
        var2 = new int[177];
        i.var2[0] = (0xC9 ^ 0xC3) & ~(0x89 ^ 0x83);
        i.var2[1] = 1;
        i.var2[2] = 2;
        i.var2[3] = 3;
        i.var2[4] = 114 + 107 - 111 + 24 ^ 21 + 83 - 47 + 73;
        i.var2[5] = 109 + 108 - 216 + 146 ^ 25 + 46 - -68 + 11;
        i.var2[6] = 16 + 139 - 56 + 146;
        i.var2[7] = 0x2B ^ 7 ^ (0x8C ^ 0xA6);
        i.var2[8] = 0xFFFFFBFF & 0x578;
        i.var2[9] = 74 + 177 - 201 + 133 ^ 37 + 62 - 97 + 174;
        i.var2[10] = -(0xFFFFF2EB & 0x3F17) & (0xFFFFB77F & 0x7BFF);
        i.var2[11] = 32 + 78 - 84 + 154 ^ 73 + 94 - 152 + 173;
        i.var2[12] = 0xFFFF97AF & 0x69D2;
        i.var2[13] = 0x94 ^ 0x9D;
        i.var2[14] = 0xFFFFDBE6 & 0x259F;
        i.var2[15] = 0x29 ^ 0x23;
        i.var2[16] = -(0xFFFFF73D & 0x4FC7) & (0xFFFFF7EE & 0x6F75);
        i.var2[17] = 0x99 ^ 0x90 ^ 2;
        i.var2[18] = -(0xFFFFDFFF & 0x3C9E) & (0xFFFFFEFF & 0x3DFF);
        i.var2[19] = 0xDF ^ 0x95 ^ (0x2A ^ 0x6C);
        i.var2[20] = -(0xFFFF9D7B & 0x7B9F) & (0xFFFFBDFF & 0x7B7B);
        i.var2[21] = 0x2A ^ 0x27;
        i.var2[22] = 0xFFFFE7FF & 0x3CFF;
        i.var2[23] = 0x16 ^ 0xC ^ (0xA7 ^ 0xB3);
        i.var2[24] = 0xFFFFBFFE & 0x57E7;
        i.var2[25] = 0x96 ^ 0x99;
        i.var2[26] = -(0xFFFFF667 & 0x79DB) & (0xFFFFF9EB & 0x77DF);
        i.var2[27] = 0xAA ^ 0xBA;
        i.var2[28] = (0x2E ^ 0x3C) & ~(0xBF ^ 0xAD) ^ (0x1B ^ 0xA);
        i.var2[29] = -(0xFFFFDC37 & 0x7FF9) & (0xFFFFFFFF & 0x5DBB);
        i.var2[30] = 0x3C ^ 9 ^ (0xA3 ^ 0x84);
        i.var2[31] = -(0xFFFFAD65 & 0x7AFF) & (0xFFFFEDFF & 0x3BF4);
        i.var2[32] = 0xD2 ^ 0xC1;
        i.var2[33] = -(0xFFFFFAA7 & 0x7D7D) & (0xFFFFF9F7 & 0x7FBD);
        i.var2[34] = 0x38 ^ 0x2C;
        i.var2[35] = -(0xFFFFB5FB & 0x6E6D) & (0xFFFFFFFE & 0x25FF);
        i.var2[36] = 0x44 ^ 4 ^ (0xD ^ 0x58);
        i.var2[37] = 0xFFFFCDB7 & 0x33DF;
        i.var2[38] = 0x57 ^ 0x1A ^ (0 ^ 0x5B);
        i.var2[39] = -(0xFFFFB3E7 & 0x6E79) & (0xFFFFAFFE & 0x73FF);
        i.var2[40] = 0x2A ^ 0x3D;
        i.var2[41] = -(0xFFFFEEFF & 0x5D41) & (0xFFFFEDFB & 0x5FE7);
        i.var2[42] = 88 + 72 - 142 + 110 ^ 40 + 120 - 129 + 121;
        i.var2[43] = 0xFFFFA3E7 & 0x5DBE;
        i.var2[44] = 80 + 147 - 67 + 13 ^ 54 + 123 - 145 + 148;
        i.var2[45] = 0xFFFFABF7 & 0x55AF;
        i.var2[46] = 0x92 ^ 0xA6 ^ (0xB2 ^ 0x9C);
        i.var2[47] = -(0xFFFFCB9F & 0x3E63) & (0xFFFFDFAF & 0x2BFE);
        i.var2[48] = 0x87 ^ 0x9C;
        i.var2[49] = -(0xFFFFBFD9 & 0x6E77) & (0xFFFFBFFF & 0x6FFD);
        i.var2[50] = 0x41 ^ 0x79 ^ (0xE3 ^ 0xC7);
        i.var2[51] = 0xFFFFBDFB & 0x43BC;
        i.var2[52] = 0xB ^ 0x16;
        i.var2[53] = -(0xFFFFDFFF & 0x6155) & (0xFFFFF5FE & 0x4F77);
        i.var2[54] = 0x6E ^ 0x4B ^ (0x52 ^ 0x69);
        i.var2[55] = 0xFFFFE577 & 0x1EAC;
        i.var2[56] = 147 + 85 - 96 + 30 ^ 60 + 133 - 96 + 88;
        i.var2[57] = -(0xFFFFBBD9 & 0x7DB7) & (0xFFFFBDF7 & 0x7FBE);
        i.var2[58] = 0x6C ^ 0x4C;
        i.var2[59] = 0xFFFFEDFE & 0x1763;
        i.var2[60] = 0x30 ^ 0x11;
        i.var2[61] = -(0xFFFFA9AE & 0x7FD7) & (0xFFFFEFFF & 0x3FFF);
        i.var2[62] = 0xA ^ 0x17 ^ (0x9B ^ 0xA4);
        i.var2[63] = 0xFFFFB7EF & 0x4E91;
        i.var2[64] = 0xB8 ^ 0x9B;
        i.var2[65] = -(0xFFFFF977 & 0x2FFD) & (0xFFFFAFF7 & Short.MAX_VALUE);
        i.var2[66] = 149 + 2 - 128 + 131 ^ 0 + 68 - -18 + 104;
        i.var2[67] = -(0xFFFFB7BF & 0x6BE6) & (0xFFFFEBB7 & 0x3FFF);
        i.var2[68] = 0x37 ^ 0x39 ^ (0x8A ^ 0xA1);
        i.var2[69] = 0xFFFFFA9B & 0xD77;
        i.var2[70] = 0x20 ^ 0x12 ^ (0xA2 ^ 0xB6);
        i.var2[71] = -(0xFFFFF367 & 0x2DDA) & (0xFFFFBF7F & 0x69DF);
        i.var2[72] = 9 ^ 0x22 ^ (0x54 ^ 0x58);
        i.var2[73] = 0xFFFFBA7F & 0x4FE5;
        i.var2[74] = 1 ^ 0x29;
        i.var2[75] = 0xFFFFCCED & 0x3FF3;
        i.var2[76] = 0x33 ^ 0x1A;
        i.var2[77] = 0xFFFFADE2 & 0x5EFF;
        i.var2[78] = 8 ^ 0x22;
        i.var2[79] = -(119 + 30 - 47 + 125) & (0xFFFFDFEE & 0x2FFF);
        i.var2[80] = 4 ^ 0x2F;
        i.var2[81] = 0xFFFF97DF & 0x79B7;
        i.var2[82] = 21 + 78 - -7 + 21 ^ (0x14 ^ 0x47);
        i.var2[83] = 0xFFFFFFED & 0x16FB;
        i.var2[84] = 0xC5 ^ 0xA6 ^ (0xC9 ^ 0x87);
        i.var2[85] = -(0xFFFFA5AE & 0x7AF3) & (0xFFFFBFFF & 0x7BFD);
        i.var2[86] = 0x6D ^ 0x43;
        i.var2[87] = -(0xFFFFA673 & 0x7DFD) & (0xFFFFFFF7 & 0x3FFD);
        i.var2[88] = 0x91 ^ 0xBE;
        i.var2[89] = -(0xFFFFF67B & 0x2DF5) & (0xFFFFBFFF & 0x7FFE);
        i.var2[90] = 90 + 140 - 116 + 31 ^ 46 + 6 - 27 + 136;
        i.var2[91] = -(0xFFFFB5DD & 0x6E33) & (0xFFFFFFBF & 0x3FDF);
        i.var2[92] = 0x1F ^ 0x2E;
        i.var2[93] = -(0xFFFFAAAB & 0x57F6) & (0xFFFFBFFB & 0x5FFF);
        i.var2[94] = 0xB0 ^ 0x82;
        i.var2[95] = 0xFFFFBF5B & 0x5DFF;
        i.var2[96] = 0xC1 ^ 0xAA ^ (0x2B ^ 0x73);
        i.var2[97] = -(0xFFFFF7B6 & 0x6AED) & (0xFFFFFFFF & Short.MAX_VALUE);
        i.var2[98] = 0xBC ^ 0x88;
        i.var2[99] = -(0xFFFF9B76 & 0x668B) & (0xFFFFDFD7 & 0x3FFF);
        i.var2[100] = 0x34 ^ 1;
        i.var2[101] = -(0xFFFFEDAF & 0x5271) & (0xFFFFDFF7 & 0x7DFF);
        i.var2[102] = 0x78 ^ 0x7C ^ (0x5C ^ 0x6E);
        i.var2[103] = -(0xFFFFA22B & 0x7FD7) & (0xFFFFBFDF & 0x7FFA);
        i.var2[104] = 2 + 82 - 25 + 79 ^ 134 + 117 - 201 + 139;
        i.var2[105] = 0xFFFFFDD9 & 0x1FFF;
        i.var2[106] = 54 + 12 - 60 + 153 ^ 127 + 112 - 94 + 22;
        i.var2[107] = 0xFFFFDFFE & 0x3DDB;
        i.var2[108] = 0 + 116 - 16 + 56 ^ 2 + 157 - 137 + 143;
        i.var2[109] = -(0xFFFFF2ED & 0x6F13) & (0xFFFFFFDF & 0x7FFB);
        i.var2[110] = 64 + 45 - -11 + 10 ^ 72 + 172 - 235 + 175;
        i.var2[111] = -(0xFFFFE377 & 0x7EAB) & (0xFFFFFFFE & Short.MAX_VALUE);
        i.var2[112] = 126 + 98 - 129 + 62 ^ 85 + 23 - 89 + 147;
        i.var2[113] = 0xFFFFDFFD & 0x3DDF;
        i.var2[114] = 0xCE ^ 0x9A ^ (0xD1 ^ 0xB9);
        i.var2[115] = 0xFFFFFFF9 & 0x1F7E;
        i.var2[116] = 96 + 4 - 50 + 93 ^ 157 + 155 - 168 + 34;
        i.var2[117] = -(0xFFFFE737 & 0x78EB) & (0xFFFFFFF7 & 0x7FFB);
        i.var2[118] = 0x71 ^ 0x4F;
        i.var2[119] = 0xFFFFA3D7 & 0x7FFB;
        i.var2[120] = 0x96 ^ 0xA0 ^ (0x42 ^ 0x4B);
        i.var2[121] = -(0xFFFFDF7D & 0x69C7) & (0xFFFFCFFF & 0x7DF7);
        i.var2[122] = 0x4A ^ 0xA;
        i.var2[123] = 0xFFFF9DCB & 0x7FF6;
        i.var2[124] = 0x26 ^ 0x67;
        i.var2[125] = -(0xFFFFEEF7 & 0x734E) & (0xFFFFEBEF & 0x77FF);
        i.var2[126] = 78 + 151 - 114 + 92 ^ 34 + 118 - 97 + 86;
        i.var2[127] = 0xFFFFA3A5 & 0x5FFB;
        i.var2[128] = 0x17 ^ 0x12 ^ (0xD ^ 0x4B);
        i.var2[129] = -(0xFFFF8ADF & 0x7FAE) & (0xFFFFBFFF & 0x4EBF);
        i.var2[130] = 0x65 ^ 0x2C ^ (0x6A ^ 0x67);
        i.var2[131] = 0xFFFFDEB7 & 0x31CE;
        i.var2[132] = 0xE ^ 0x22 ^ (0xF8 ^ 0x91);
        i.var2[133] = 0xFFFFF3C7 & 0x1FFD;
        i.var2[134] = 0xF8 ^ 0xBE;
        i.var2[135] = 0xFFFF99FF & 0x7FC8;
        i.var2[136] = 0x76 ^ 0x31;
        i.var2[137] = 0xFFFF9D33 & 0x7EFE;
        i.var2[138] = 160 + 66 - 106 + 79 ^ 134 + 110 - 181 + 80;
        i.var2[139] = 0xFFFFBFF3 & 0x5D6D;
        i.var2[140] = 57 + 29 - 69 + 181 ^ 96 + 8 - -27 + 12;
        i.var2[141] = 0xFFFFFDDE & 0x1FA1;
        i.var2[142] = 0x61 ^ 0x2B;
        i.var2[143] = 0xFFFFDD83 & 0x3FFF;
        i.var2[144] = 0x88 ^ 0xC3;
        i.var2[145] = 0xFFFFDDDB & 0x3FE5;
        i.var2[146] = 0x35 ^ 0x59 ^ (0x81 ^ 0xA1);
        i.var2[147] = -(0xFFFFF1FE & 0x1FB7) & (0xFFFFF7B7 & 0x39FF);
        i.var2[148] = 47 + 76 - 13 + 104 ^ 120 + 103 - 111 + 43;
        i.var2[149] = 0xFFFFFC7B & 0x2387;
        i.var2[150] = 0x41 ^ 0xF;
        i.var2[151] = -(0xFFFFEFED & 0x5F93) & (0xFFFFEFF5 & 0x7FEE);
        i.var2[152] = 0x36 ^ 0x79;
        i.var2[153] = -(0xFFFFDC9C & 0x7F6F) & (0xFFFFFFDB & Short.MAX_VALUE);
        i.var2[154] = 130 + 59 - 182 + 142 ^ 96 + 141 - 123 + 83;
        i.var2[155] = 0xFFFFFFFF & 0x23CE;
        i.var2[156] = 89 + 89 - 78 + 124 ^ 110 + 22 - 126 + 171;
        i.var2[157] = 0xFFFFEAE6 & 0x17DF;
        i.var2[158] = 40 + 40 - -76 + 87 ^ 114 + 142 - 120 + 25;
        i.var2[159] = -(0xFFFFBFFF & 0x7C01) & (0xFFFFFFD7 & 0x3EEF);
        i.var2[160] = 0xC2 ^ 0x91;
        i.var2[161] = 0xFFFFB5AD & 0x4EDB;
        i.var2[162] = 1 ^ 0x55;
        i.var2[163] = 0xFFFFC5FB & 0x3E8E;
        i.var2[164] = 0x52 ^ 7;
        i.var2[165] = 0xFFFFDDDF & 0x26AF;
        i.var2[166] = 0x75 ^ 0x23;
        i.var2[167] = -(0xFFFFF77D & 0x9D3) & (0xFFFFFFFF & 0x1FFF);
        i.var2[168] = 0xB1 ^ 0xB7 ^ (0x10 ^ 0x41);
        i.var2[169] = -(0xFFFFF8C5 & 0x6F3F) & (0xFFFFEFBF & 0x7FFE);
        i.var2[170] = 0xF1 ^ 0xA9;
        i.var2[171] = 0xFFFFD7BB & 0x2FFF;
        i.var2[172] = 0xA2 ^ 0x96 ^ (0x37 ^ 0x5A);
        i.var2[173] = 0xFFFFB774 & 0x69DF;
        i.var2[174] = 0x34 ^ 0x6E;
        i.var2[175] = 0xFFFFBDB7 & 0x675D;
        i.var2[176] = 89 + 6 - -55 + 2 ^ 80 + 126 - 71 + 60;
    }

    public String toString() {
        CharSequence[] charSequenceArray = super.toString().toLowerCase().split(var1[var2[3]]);
        Arrays.stream(charSequenceArray).collect(Collectors.toList()).toArray(charSequenceArray);
        0;
        return String.join((CharSequence)var1[var2[4]], charSequenceArray);
    }

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static boolean var23(Object object, Object object2) {
        return object != object2;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    private GameEnum(int n3, j j2, boolean bl) {
        if (i.var22((Object)j2)) {
            throw new InvalidParameterException(var1[var2[1]]);
        }
        this.animationId = n3;
        this.attackStyle = j2;
        this.isSpecial = bl;
        this.baseSpellDamage = var2[0];
    }

    public static boolean b(i i2) {
        boolean bl;
        if (!i.var23((Object)i2, (Object)MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF) || !i.var23((Object)i2, (Object)MAGIC_STANDARD_STRIKE_BOLT_BLAST) || !i.var23((Object)i2, (Object)MAGIC_STANDARD_WAVE_STAFF) || i.var30((Object)i2, (Object)MAGIC_STANDARD_SURGE_STAFF)) {
            bl = var2[1];
            0;
            if (((0xB8 ^ 0xBC) & ~(0x80 ^ 0x84)) < 0) {
                return ((0x94 ^ 0xBF) & ~(0x35 ^ 0x1E)) != 0;
            }
        } else {
            bl = var2[0];
        }
        return bl;
    }

    private static void var5() {
        var1 = new String[var2[176]];
        i.var1[i.var2[0]] = "Attack Style must be valid for AnimationData";
        i.var1[i.var2[1]] = "Attack Style must be valid for AnimationData";
        i.var1[i.var2[2]] = "Attack Style and Attack Type must be valid for AnimationData";
        i.var1[i.var2[3]] = "_";
        i.var1[i.var2[4]] = " ";
        i.var1[i.var2[5]] = "MELEE_VIGGORAS_CHAINMACE";
        i.var1[i.var2[7]] = "MELEE_DAGGER_SLASH";
        i.var1[i.var2[9]] = "MELEE_SPEAR_STAB";
        i.var1[i.var2[11]] = "MELEE_SWORD_STAB";
        i.var1[i.var2[13]] = "MELEE_SCIM_SLASH";
        i.var1[i.var2[15]] = "MELEE_LANCE_STAB";
        i.var1[i.var2[17]] = "MELEE_LANCE_CRUSH";
        i.var1[i.var2[19]] = "MELEE_LANCE_SLASH";
        i.var1[i.var2[21]] = "MELEE_FANG_STAB";
        i.var1[i.var2[23]] = "MELEE_FANG_SPEC";
        i.var1[i.var2[25]] = "MELEE_GENERIC_SLASH";
        i.var1[i.var2[27]] = "MELEE_STAFF_CRUSH";
        i.var1[i.var2[28]] = "MELEE_BATTLEAXE_SLASH";
        i.var1[i.var2[30]] = "MELEE_MACE_STAB";
        i.var1[i.var2[32]] = "MELEE_BATTLEAXE_CRUSH";
        i.var1[i.var2[34]] = "MELEE_2H_CRUSH";
        i.var1[i.var2[36]] = "MELEE_2H_SLASH";
        i.var1[i.var2[38]] = "MELEE_STAFF_CRUSH_2";
        i.var1[i.var2[40]] = "MELEE_STAFF_CRUSH_3";
        i.var1[i.var2[42]] = "MELEE_PUNCH";
        i.var1[i.var2[44]] = "MELEE_KICK";
        i.var1[i.var2[46]] = "MELEE_STAFF_STAB";
        i.var1[i.var2[48]] = "MELEE_SPEAR_CRUSH";
        i.var1[i.var2[50]] = "MELEE_STAFF_SLASH";
        i.var1[i.var2[52]] = "MELEE_DLONG_SPEC";
        i.var1[i.var2[54]] = "MELEE_DRAGON_MACE_SPEC";
        i.var1[i.var2[56]] = "MELEE_DRAGON_DAGGER_SPEC";
        i.var1[i.var2[58]] = "MELEE_DRAGON_WARHAMMER_SPEC";
        i.var1[i.var2[60]] = "MELEE_ABYSSAL_WHIP";
        i.var1[i.var2[62]] = "MELEE_GRANITE_MAUL";
        i.var1[i.var2[64]] = "MELEE_GRANITE_MAUL_SPEC";
        i.var1[i.var2[66]] = "MELEE_DHAROKS_GREATAXE_CRUSH";
        i.var1[i.var2[68]] = "MELEE_DHAROKS_GREATAXE_SLASH";
        i.var1[i.var2[70]] = "MELEE_AHRIMS_STAFF_CRUSH";
        i.var1[i.var2[72]] = "MELEE_OBBY_MAUL_CRUSH";
        i.var1[i.var2[74]] = "MELEE_ABYSSAL_DAGGER_STAB";
        i.var1[i.var2[76]] = "MELEE_ABYSSAL_BLUDGEON_CRUSH";
        i.var1[i.var2[78]] = "MELEE_LEAF_BLADED_BATTLEAXE_CRUSH";
        i.var1[i.var2[80]] = "MELEE_INQUISITORS_MACE";
        i.var1[i.var2[82]] = "MELEE_BARRELCHEST_ANCHOR_CRUSH";
        i.var1[i.var2[84]] = "MELEE_LEAF_BLADED_BATTLEAXE_SLASH";
        i.var1[i.var2[86]] = "MELEE_GODSWORD_SLASH";
        i.var1[i.var2[88]] = "MELEE_GODSWORD_CRUSH";
        i.var1[i.var2[90]] = "MELEE_GODSWORD_DEFENSIVE";
        i.var1[i.var2[92]] = "MELEE_DRAGON_CLAWS_SPEC";
        i.var1[i.var2[94]] = "MELEE_VLS_SPEC";
        i.var1[i.var2[96]] = "MELEE_ELDER_MAUL";
        i.var1[i.var2[98]] = "MELEE_ZAMORAK_GODSWORD_SPEC";
        i.var1[i.var2[100]] = "MELEE_ZAMORAK_GODSWORD_OR_SPEC";
        i.var1[i.var2[102]] = "MELEE_SARADOMIN_GODSWORD_SPEC";
        i.var1[i.var2[104]] = "MELEE_SARADOMIN_GODSWORD_OR_SPEC";
        i.var1[i.var2[106]] = "MELEE_BANDOS_GODSWORD_SPEC";
        i.var1[i.var2[108]] = "MELEE_BANDOS_GODSWORD_OR_SPEC";
        i.var1[i.var2[110]] = "MELEE_ARMADYL_GODSWORD_SPEC";
        i.var1[i.var2[112]] = "MELEE_ARMADYL_GODSWORD_OR_SPEC";
        i.var1[i.var2[114]] = "MELEE_SCYTHE";
        i.var1[i.var2[116]] = "MELEE_GHAZI_RAPIER_STAB";
        i.var1[i.var2[118]] = "MELEE_ANCIENT_GODSWORD_SPEC";
        i.var1[i.var2[120]] = "MELEE_CRYSTAL_HALBERD_SPEC";
        i.var1[i.var2[122]] = "RANGED_CHINCHOMPA";
        i.var1[i.var2[124]] = "RANGED_SHORTBOW";
        i.var1[i.var2[126]] = "RANGED_RUNE_KNIFE_PVP";
        i.var1[i.var2[128]] = "RANGED_MAGIC_SHORTBOW_SPEC";
        i.var1[i.var2[130]] = "RANGED_CROSSBOW_PVP";
        i.var1[i.var2[132]] = "RANGED_BLOWPIPE";
        i.var1[i.var2[134]] = "RANGED_DARTS";
        i.var1[i.var2[136]] = "RANGED_BALLISTA";
        i.var1[i.var2[138]] = "RANGED_DRAGON_THROWNAXE_SPEC";
        i.var1[i.var2[140]] = "RANGED_RUNE_CROSSBOW";
        i.var1[i.var2[142]] = "RANGED_BALLISTA_2";
        i.var1[i.var2[144]] = "RANGED_RUNE_KNIFE";
        i.var1[i.var2[146]] = "RANGED_DRAGON_KNIFE";
        i.var1[i.var2[148]] = "RANGED_DRAGON_KNIFE_POISONED";
        i.var1[i.var2[150]] = "RANGED_DRAGON_KNIFE_SPEC";
        i.var1[i.var2[152]] = "RANGED_ZARYTE_CROSSBOW";
        i.var1[i.var2[154]] = "RANGED_ZARYTE_CROSSBOW_PVP";
        i.var1[i.var2[156]] = "MAGIC_STANDARD_BIND";
        i.var1[i.var2[158]] = "MAGIC_STANDARD_STRIKE_BOLT_BLAST";
        i.var1[i.var2[160]] = "MAGIC_STANDARD_BIND_STAFF";
        i.var1[i.var2[162]] = "MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF";
        i.var1[i.var2[164]] = "MAGIC_STANDARD_WAVE_STAFF";
        i.var1[i.var2[166]] = "MAGIC_STANDARD_SURGE_STAFF";
        i.var1[i.var2[168]] = "MAGIC_ANCIENT_SINGLE_TARGET";
        i.var1[i.var2[170]] = "MAGIC_ANCIENT_MULTI_TARGET";
        i.var1[i.var2[172]] = "MAGIC_VOLATILE_NIGHTMARE_STAFF_SPEC";
        i.var1[i.var2[174]] = "MAGIC_TUMEKENS_SHADOW";
    }

    private static boolean var30(Object object, Object object2) {
        return object == object2;
    }

    private GameEnum(int n3, j j2, int n4) {
        if (i.var22((Object)j2)) {
            throw new InvalidParameterException(var1[var2[2]]);
        }
        this.animationId = n3;
        this.attackStyle = j2;
        this.isSpecial = var2[0];
        this.baseSpellDamage = n4;
    }

    public static i d(int n2) {
        return DATA.get(n2);
    }

    public static boolean a(i i2) {
        int n2;
        if (!i.var23((Object)i2, (Object)MAGIC_STANDARD_STRIKE_BOLT_BLAST_STAFF) || !i.var23((Object)i2, (Object)MAGIC_STANDARD_WAVE_STAFF) || i.var30((Object)i2, (Object)MAGIC_STANDARD_SURGE_STAFF)) {
            n2 = var2[1];
            0;
            if null != null {
                return ((0x5E ^ 0x7C) & ~(0x88 ^ 0xAA)) != 0;
            }
        } else {
            n2 = var2[0];
        }
        return n2 != 0;
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var10(int n2) {
        return n2 <= 0;
    }

    private GameEnum(int n3, j j2) {
        if (i.var22((Object)j2)) {
            throw new InvalidParameterException(var1[var2[0]]);
        }
        this.animationId = n3;
        this.attackStyle = j2;
        this.isSpecial = var2[0];
        this.baseSpellDamage = var2[0];
    }
}

