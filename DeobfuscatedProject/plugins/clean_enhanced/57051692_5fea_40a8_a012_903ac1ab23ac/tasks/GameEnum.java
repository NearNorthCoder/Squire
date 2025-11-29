/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.57051692-5fea-40a8-a012-903ac1ab23ac.tasks;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;

public final class GameEnum
extends Enum<i> {
    public static final  /* enum */ i KALPHITE_5;
    public static final  /* enum */ i SNAIL_2;
    public static final  /* enum */ i LEECH_6;
    public static final  /* enum */ i TORTOISE_6;
    public static final  /* enum */ i DRAGON_3;
    public static final  /* enum */ i PENGUIN_2;
    public static final  /* enum */ i WYVERN_4;
    public static final  /* enum */ i MOLE_4;
    public static final  /* enum */ i MOLE_2;
    public static final  /* enum */ i LEECH_3;
    public static final  /* enum */ i WYVERN_5;
    public static final  /* enum */ i TERRORBIRD_4;
    private static final  i[] $VALUES;
    public static final  /* enum */ i TORTOISE_3;
    public static final  /* enum */ i SLUG_5;
    public static final  /* enum */ i TERRORBIRD_6;
    public static final  /* enum */ i CAMEL_2;
    public static final  /* enum */ i PENGUIN_3;
    public static final  /* enum */ i CAMEL_6;
    public static final  /* enum */ i PENGUIN_5;
    public static final  /* enum */ i CAMEL_4;
    public static final  /* enum */ i TORTOISE_5;
    public static final  /* enum */ i SLUG_3;
    public static final  /* enum */ i SNAIL_4;
    public static final  /* enum */ i SLUG_1;
    public static final  /* enum */ i SNAKE_4;
    public static final  /* enum */ i SLUG_4;
    public static final  /* enum */ i LIZARD_3;
    public static final  /* enum */ i KALPHITE_6;
    public static final  /* enum */ i MONKEY_1;
    private final  String question;
    public static final  /* enum */ i LIZARD_2;
    public static final  /* enum */ i DRAGON_2;
    public static final  /* enum */ i MONKEY_2;
    private static final  Map<String, String> MATCHES;
    public static final  /* enum */ i WYVERN_6;
    public static final  /* enum */ i MONKEY_6;
    public static final  /* enum */ i DRAGON_1;
    
    public static final  /* enum */ i PENGUIN_6;
    public static final  /* enum */ i SLUG_6;
    public static final  /* enum */ i WYVERN_3;
    public static final  /* enum */ i SNAIL_1;
    public static final  /* enum */ i MOLE_5;
    public static final  /* enum */ i SLUG_2;
    public static final  /* enum */ i SNAIL_5;
    public static final  /* enum */ i PENGUIN_1;
    public static final  /* enum */ i WYVERN_2;
    public static final  /* enum */ i MONKEY_4;
    public static final  /* enum */ i LEECH_2;
    public static final  /* enum */ i TERRORBIRD_3;
    public static final  /* enum */ i MOLE_1;
    public static final  /* enum */ i MOLE_3;
    public static final  /* enum */ i LIZARD_6;
    public static final  /* enum */ i SNAKE_6;
    public static final  /* enum */ i TORTOISE_2;
    public static final  /* enum */ i SNAKE_3;
    public static final  /* enum */ i TERRORBIRD_5;
    public static final  /* enum */ i LEECH_1;
    public static final  /* enum */ i KALPHITE_4;
    public static final  /* enum */ i LIZARD_1;
    public static final  /* enum */ i CAMEL_3;
    public static final  /* enum */ i KALPHITE_3;
    public static final  /* enum */ i TORTOISE_1;
    public static final  /* enum */ i LEECH_4;
    public static final  /* enum */ i KALPHITE_2;
    public static final  /* enum */ i SNAKE_5;
    public static final  /* enum */ i DRAGON_4;
    public static final  /* enum */ i LIZARD_5;
    public static final  /* enum */ i TERRORBIRD_2;
    public static final  /* enum */ i CAMEL_1;
    public static final  /* enum */ i WYVERN_1;
    public static final  /* enum */ i SNAKE_1;
    public static final  /* enum */ i CAMEL_5;
    
    public static final  /* enum */ i DRAGON_5;
    public static final  /* enum */ i MONKEY_3;
    public static final  /* enum */ i TORTOISE_4;
    public static final  /* enum */ i LEECH_5;
    public static final  /* enum */ i SNAKE_2;
    public static final  /* enum */ i LIZARD_4;
    public static final  /* enum */ i PENGUIN_4;
    public static final  /* enum */ i SNAIL_6;
    public static final  /* enum */ i KALPHITE_1;
    private final  String answer;
    public static final  /* enum */ i MOLE_6;
    public static final  /* enum */ i TERRORBIRD_1;
    public static final  /* enum */ i SNAIL_3;
    public static final  /* enum */ i MONKEY_5;
    public static final  /* enum */ i DRAGON_6;

    public static i[] values() {
        return (i[])$VALUES.clone();
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (i.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    
            MATCHES = builder.build();
        }
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public String Y() {
        return this.question;
    }

    public static i valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static boolean var33(Object object) {
        return object != null;
    }

    private static void var21() {
        var2 = new int[253];
        i.var2[0] = (0x57 ^ 0x5C) & ~(5 ^ 0xE);
        i.var2[1] = 1;
        i.var2[2] = 2;
        i.var2[3] = 3;
        i.var2[4] = 76 + 44 - 44 + 68 ^ 123 + 109 - 124 + 40;
        i.var2[5] = 0xB1 ^ 0xB4;
        i.var2[6] = 0xB9 ^ 0xBF;
        i.var2[7] = 0xB8 ^ 0x9E ^ (5 ^ 0x24);
        i.var2[8] = 0x8B ^ 0x83;
        i.var2[9] = 0x35 ^ 0x3C;
        i.var2[10] = 0xAE ^ 0xC1 ^ (0x5B ^ 0x3E);
        i.var2[11] = 0x70 ^ 0x22 ^ (0x66 ^ 0x3F);
        i.var2[12] = 0x8E ^ 0x82;
        i.var2[13] = 0xB6 ^ 0xBB;
        i.var2[14] = 30 + 44 - 20 + 80 ^ 122 + 24 - 98 + 88;
        i.var2[15] = 0x2D ^ 4 ^ (0x18 ^ 0x3E);
        i.var2[16] = 1 ^ 0x25 ^ (0x81 ^ 0xB5);
        i.var2[17] = 0x90 ^ 0x81;
        i.var2[18] = 0xA0 ^ 0xB2;
        i.var2[19] = 0x74 ^ 0x67;
        i.var2[20] = 0xB9 ^ 0xAD;
        i.var2[21] = 0xA4 ^ 0xB1;
        i.var2[22] = 94 + 71 - 68 + 113 ^ 156 + 176 - 256 + 120;
        i.var2[23] = 0x35 ^ 0x22;
        i.var2[24] = 30 + 19 - -70 + 47 ^ 147 + 117 - 193 + 119;
        i.var2[25] = 0x44 ^ 0x5D;
        i.var2[26] = 0x4E ^ 0x43 ^ (0x2B ^ 0x3C);
        i.var2[27] = 0x6E ^ 0x75;
        i.var2[28] = 0xE1 ^ 0xAB ^ (0x5B ^ 0xD);
        i.var2[29] = 0xE2 ^ 0xA0 ^ (0x58 ^ 7);
        i.var2[30] = 0x18 ^ 0x6A ^ (0xDB ^ 0xB7);
        i.var2[31] = 0xAF ^ 0xB0;
        i.var2[32] = 0xC ^ 0x2C;
        i.var2[33] = 88 + 36 - 86 + 109 ^ 159 + 107 - 121 + 33;
        i.var2[34] = 0xE4 ^ 0xC6;
        i.var2[35] = 0x66 ^ 0x45;
        i.var2[36] = 0x85 ^ 0xA1;
        i.var2[37] = 0x58 ^ 0x5C ^ (0x7E ^ 0x5F);
        i.var2[38] = 0x8D ^ 0xAB;
        i.var2[39] = 0xE0 ^ 0xC7;
        i.var2[40] = 0x6D ^ 0x26 ^ (0xB ^ 0x68);
        i.var2[41] = 0x91 ^ 0xB8;
        i.var2[42] = 0x32 ^ 0x53 ^ (0xF9 ^ 0xB2);
        i.var2[43] = 8 ^ 0x21 ^ 2;
        i.var2[44] = 0x7C ^ 0x50;
        i.var2[45] = 0xBE ^ 0xA3 ^ (0xD ^ 0x3D);
        i.var2[46] = 0x59 ^ 0x53 ^ (0x19 ^ 0x3D);
        i.var2[47] = 0x3B ^ 0x14;
        i.var2[48] = 51 + 41 - 89 + 140 ^ 73 + 8 - -89 + 21;
        i.var2[49] = 0x35 ^ 4;
        i.var2[50] = 0x35 ^ 7;
        i.var2[51] = 0x6F ^ 0x5C;
        i.var2[52] = 0x39 ^ 0xD;
        i.var2[53] = 0x7B ^ 0x1A ^ (0x4A ^ 0x1E);
        i.var2[54] = 0x30 ^ 6;
        i.var2[55] = 0x7D ^ 0x4A;
        i.var2[56] = 0x29 ^ 0x11;
        i.var2[57] = 0x39 ^ 0x2D ^ (0x35 ^ 0x18);
        i.var2[58] = 0x2B ^ 0x11;
        i.var2[59] = 68 + 113 - 75 + 74 ^ 17 + 11 - -56 + 59;
        i.var2[60] = 96 + 71 - 117 + 102 ^ 116 + 87 - 107 + 68;
        i.var2[61] = 0x5B ^ 0x66;
        i.var2[62] = 0x94 ^ 0xAA;
        i.var2[63] = 0x6A ^ 0x55;
        i.var2[64] = 0x7B ^ 0x3B;
        i.var2[65] = 0x39 ^ 0x41 ^ (3 ^ 0x3A);
        i.var2[66] = 0xD8 ^ 0x80 ^ (0x22 ^ 0x38);
        i.var2[67] = 2 ^ 0x41;
        i.var2[68] = 0x77 ^ 0x4B ^ (0xC1 ^ 0xB9);
        i.var2[69] = 0x71 ^ 0x34;
        i.var2[70] = 0xCB ^ 0x84 ^ (0x7F ^ 0x76);
        i.var2[71] = 131 + 178 - 216 + 117 ^ 146 + 85 - 123 + 41;
        i.var2[72] = 0x3A ^ 0x72;
        i.var2[73] = 0x24 ^ 0x6D;
        i.var2[74] = 0xD7 ^ 0x97 ^ (0xB5 ^ 0xBF);
        i.var2[75] = 0x9F ^ 0xA3 ^ (0xEA ^ 0x9D);
        i.var2[76] = 127 + 210 - 117 + 7 ^ 82 + 153 - 123 + 63;
        i.var2[77] = 0xC ^ 0x41;
        i.var2[78] = 0xC1 ^ 0x8F;
        i.var2[79] = 0x21 ^ 0x6E;
        i.var2[80] = 0x29 ^ 0x79;
        i.var2[81] = 0xB2 ^ 0xBA ^ (0xE9 ^ 0xB0);
        i.var2[82] = 0xDB ^ 0x89;
        i.var2[83] = 0x4B ^ 0x2D ^ (0x8B ^ 0xBE);
        i.var2[84] = 0x7D ^ 0x29;
        i.var2[85] = 0xEF ^ 0xBA;
        i.var2[86] = 0x7B ^ 0x6B ^ (0xE1 ^ 0xA7);
        i.var2[87] = 6 ^ 0x32 ^ (0xD7 ^ 0xB4);
        i.var2[88] = 0x1A ^ 0x42;
        i.var2[89] = 0xD6 ^ 0x8F;
        i.var2[90] = 5 ^ 0x5F;
        i.var2[91] = 0x2B ^ 0x70;
        i.var2[92] = 0xF7 ^ 0x8C ^ (0x5F ^ 0x78);
        i.var2[93] = 0xE7 ^ 0xBA;
        i.var2[94] = 0x5B ^ 5;
        i.var2[95] = 0xF8 ^ 0xA7;
        i.var2[96] = 0x5B ^ 0x3B;
        i.var2[97] = 0xD2 ^ 0xB3;
        i.var2[98] = 0x27 ^ 0xD ^ (6 ^ 0x4E);
        i.var2[99] = 0xF ^ 0x6C;
        i.var2[100] = 0xD6 ^ 0xB2;
        i.var2[101] = 6 ^ 0x51 ^ (0x22 ^ 0x10);
        i.var2[102] = 0xC6 ^ 0xA0;
        i.var2[103] = 0x13 ^ 0x15 ^ (0xDE ^ 0xBF);
        i.var2[104] = 0x68 ^ 0x56 ^ (0x39 ^ 0x6F);
        i.var2[105] = 0x35 ^ 0x5C;
        i.var2[106] = 0x49 ^ 0x23;
        i.var2[107] = 0xC8 ^ 0xC4 ^ (0xC3 ^ 0xA4);
        i.var2[108] = 0x7E ^ 0x12;
        i.var2[109] = 10 + 47 - -64 + 96 ^ 30 + 70 - -13 + 67;
        i.var2[110] = 0x43 ^ 0x2D;
        i.var2[111] = 0x45 ^ 5 ^ (1 ^ 0x2E);
        i.var2[112] = 216 + 241 - 451 + 243 ^ 37 + 87 - 116 + 129;
        i.var2[113] = 35 + 15 - -128 + 70 ^ 81 + 20 - 76 + 112;
        i.var2[114] = 0xA5 ^ 0xB6 ^ (0x4D ^ 0x2C);
        i.var2[115] = 0x71 ^ 2;
        i.var2[116] = 41 + 33 - 67 + 210 ^ 47 + 112 - 14 + 28;
        i.var2[117] = 0x3B ^ 0x41 ^ (0x73 ^ 0x7C);
        i.var2[118] = 1 + 200 - 63 + 75 ^ 88 + 69 - 94 + 100;
        i.var2[119] = 0x5B ^ 0x2C;
        i.var2[120] = 9 ^ 0x71;
        i.var2[121] = 0x23 ^ 0x5A;
        i.var2[122] = 0xBE ^ 0xC4;
        i.var2[123] = 123 + 11 - 94 + 161 ^ 163 + 172 - 184 + 27;
        i.var2[124] = 60 + 43 - 31 + 112 ^ 25 + 20 - -94 + 57;
        i.var2[125] = 2 ^ 0x70 ^ (0xB8 ^ 0xB7);
        i.var2[126] = 22 + 194 - 48 + 65 ^ 7 + 26 - -115 + 3;
        i.var2[127] = 13 + 112 - 39 + 41;
        i.var2[128] = (0x44 ^ 0x58) + (0xCA ^ 0x83) - (0x49 ^ 0x75) + (0xC1 ^ 0x96);
        i.var2[129] = 18 + 54 - 53 + 110;
        i.var2[130] = (0x6B ^ 0x61) + (0xE4 ^ 0xB0) - (0x6E ^ 0x3B) + (0xB8 ^ 0xC1);
        i.var2[131] = 115 + 95 - 193 + 114;
        i.var2[132] = 3 + (0x5F ^ 0x30) - (0x45 ^ 0x21) + (0x55 ^ 0x23);
        i.var2[133] = 103 + 22 - 89 + 97;
        i.var2[134] = (5 ^ 0x34) + (0x4E ^ 0x45) - (0x14 ^ 0x1B) + (0xC7 ^ 0x9E);
        i.var2[135] = (0xD5 ^ 0x83) + (0x69 ^ 0x20) - (0x56 ^ 0x72) + (8 ^ 4);
        i.var2[136] = 135 + 17 - 44 + 28;
        i.var2[137] = (0x4A ^ 0x34) + (0x19 ^ 0x31) - (0x35 ^ 0x42) + (0xEB ^ 0xB1);
        i.var2[138] = (0xD4 ^ 0xAD) + (0x63 ^ 0x42) - (0x97 ^ 0xB5) + (0x9D ^ 0x8F);
        i.var2[139] = (0x7D ^ 0x2A) + (0x88 ^ 0xB4) - (0xA6 ^ 0xBF) + (0x16 ^ 7);
        i.var2[140] = 24 + 21 - -37 + 58;
        i.var2[141] = 3 + (0x17 ^ 0x62) - (0xB0 ^ 0x9F) + (0xF6 ^ 0xB2);
        i.var2[142] = 45 + 121 - 107 + 80 + (23 + 100 - 87 + 95) - (70 + 46 - 5 + 127) + (0x48 ^ 0x26);
        i.var2[143] = 122 + 77 - 197 + 133 + (26 + 60 - -26 + 24) - (47 + 93 - -3 + 83) + (0x62 ^ 0);
        i.var2[144] = (0x3A ^ 0x3D) + (0x71 ^ 0x65) - -(0xD3 ^ 0xB9) + (0x4D ^ 0x46);
        i.var2[145] = 14 + 19 - 17 + 129;
        i.var2[146] = 90 + 108 - 160 + 108;
        i.var2[147] = 140 + 71 - 64 + 0;
        i.var2[148] = 105 + 17 - 89 + 115;
        i.var2[149] = 88 + 116 - 158 + 103;
        i.var2[150] = 103 + 14 - 107 + 140;
        i.var2[151] = (0xF1 ^ 0x83) + (36 + 15 - -33 + 58) - (142 + 56 - 195 + 176) + (0x12 ^ 0x58);
        i.var2[152] = (0x2F ^ 0x39) + (0x4A ^ 0x74) - (0x4F ^ 0x70) + (49 + 108 - 94 + 68);
        i.var2[153] = (0x42 ^ 0x61) + (0x9D ^ 0xC1) - (0x17 ^ 0x3F) + (0x3C ^ 0x7E);
        i.var2[154] = 130 + 91 - 175 + 108;
        i.var2[155] = 44 + 26 - -10 + 55 + (0x29 ^ 0x30) - (87 + 157 - 192 + 106) + (84 + 31 - 9 + 47);
        i.var2[156] = 77 + 104 - 111 + 76 + (0x83 ^ 0x89) - (0x17 ^ 0x6D) + (0x7B ^ 1);
        i.var2[157] = 92 + 25 - -1 + 39;
        i.var2[158] = 64 + 117 - 97 + 74;
        i.var2[159] = 47 + 29 - -27 + 56;
        i.var2[160] = (0xDA ^ 0xAB) + (0x5A ^ 0x70) - (0x8D ^ 0x87) + (0x6D ^ 0x62);
        i.var2[161] = 62 + 143 - 136 + 77 + (0x7A ^ 0x3A) - (0x59 ^ 0xC) + (0xB5 ^ 0x91);
        i.var2[162] = 59 + 73 - 4 + 34;
        i.var2[163] = (0x15 ^ 0x76) + (95 + 64 - 21 + 24) - (32 + 20 - -130 + 1) + (0xCA ^ 0x9F);
        i.var2[164] = (0x8D ^ 0x8B) + (0xFF ^ 0xBD) - (0x2A ^ 0x38) + (0xE ^ 0x60);
        i.var2[165] = 109 + 103 - 195 + 117 + (0x78 ^ 0x23) - (39 + 84 - 61 + 93) + (0xDC ^ 0x83);
        i.var2[166] = (0x4A ^ 0x42) + (0x6A ^ 0x12) - (0x4A ^ 0x5F) + (0xBF ^ 0x84);
        i.var2[167] = 9 + 92 - 43 + 109;
        i.var2[168] = 9 + 33 - -76 + 50;
        i.var2[169] = (0x18 ^ 0x14) + (0x5D ^ 0x2B) - (0x76 ^ 0x60) + (0x7B ^ 0x46);
        i.var2[170] = 77 + 119 - 177 + 151;
        i.var2[171] = 36 + 22 - 12 + 125;
        i.var2[172] = 157 + 168 - 222 + 67 + (0xAB ^ 0x8B) - (26 + 17 - -76 + 44) + (91 + 95 - 183 + 130);
        i.var2[173] = 139 + 142 - 159 + 25 + (132 + 159 - 248 + 127) - (25 + 42 - 6 + 105) + (0x20 ^ 0x36);
        i.var2[174] = 53 + 18 - -25 + 78;
        i.var2[175] = 138 + 89 - 218 + 166;
        i.var2[176] = 157 + 166 - 240 + 93;
        i.var2[177] = 22 + 116 - -31 + 8;
        i.var2[178] = 4 + 117 - 104 + 161;
        i.var2[179] = 95 + 19 - 66 + 112 + (0x5F ^ 0x35) - (51 + 135 - 35 + 25) + (0x3F ^ 0x66);
        i.var2[180] = 101 + 25 - 114 + 135 + (9 ^ 0x72) - (32 + 62 - -5 + 61) + (0xD5 ^ 0x93);
        i.var2[181] = 55 + 105 - 77 + 98;
        i.var2[182] = (0x6B ^ 0xB) + (7 ^ 0x4C) - (0xE1 ^ 0xC7) + (0x2F ^ 0x1E);
        i.var2[183] = 39 + 128 - 91 + 107;
        i.var2[184] = 108 + 121 - 174 + 129;
        i.var2[185] = 89 + 47 - -34 + 15;
        i.var2[186] = (0x2A ^ 0x25) + (0x88 ^ 0xAE) - -(0x61 ^ 0x3B) + (0x2F ^ 4);
        i.var2[187] = 12 + 94 - 30 + 111;
        i.var2[188] = (0x94 ^ 0x8B) + (0x60 ^ 0x4D) - (0xA7 ^ 0x85) + (19 + 55 - -64 + 8);
        i.var2[189] = 15 + 2 - -40 + 132;
        i.var2[190] = 170 + 122 - 132 + 30;
        i.var2[191] = 182 + 19 - 23 + 13;
        i.var2[192] = 16 + 9 - -22 + 145;
        i.var2[193] = 38 + 94 - 9 + 7 + (0x33 ^ 0x69) - (0xE0 ^ 0x8E) + (0xB ^ 0x58);
        i.var2[194] = (0x8E ^ 0xA3) + (61 + 12 - -24 + 38) - (0x4D ^ 0x68) + (0x39 ^ 0xA);
        i.var2[195] = 88 + 155 - 207 + 159;
        i.var2[196] = (0xD6 ^ 0xA2) + (0xCD ^ 0xA4) - (74 + 120 - 144 + 139) + (106 + 134 - 81 + 5);
        i.var2[197] = (0x84 ^ 0x93) + (106 + 91 - 55 + 27) - (3 + 53 - -45 + 66) + (91 + 166 - 85 + 0);
        i.var2[198] = 114 + 156 - 212 + 123 + (179 + 1 - 19 + 30) - (0xFFFFD54F & 0x2BFA) + (123 + 35 - 121 + 119);
        i.var2[199] = (0xDA ^ 0xA9) + (0x67 ^ 0x52) - (3 ^ 0x40) + (0x47 ^ 0x25);
        i.var2[200] = 179 + 60 - 137 + 98;
        i.var2[201] = (0x3C ^ 0x11) + (0x48 ^ 0xF) - (0x18 ^ 0x72) + (185 + 155 - 218 + 69);
        i.var2[202] = 135 + 144 - 140 + 63;
        i.var2[203] = 36 + 177 - 176 + 151 + (0x1B ^ 0x7E) - (208 + 191 - 285 + 130) + (92 + 52 - 62 + 76);
        i.var2[204] = 35 + 163 - 131 + 130 + (0x92 ^ 0xB4) - (1 + 113 - 49 + 101) + (78 + 133 - 141 + 65);
        i.var2[205] = 35 + 61 - 62 + 171;
        i.var2[206] = 66 + 144 - 124 + 120;
        i.var2[207] = 134 + 31 - 136 + 139 + (0x4C ^ 0x2A) - (100 + 147 - 66 + 19) + (106 + 46 - 67 + 52);
        i.var2[208] = 47 + 176 - 61 + 46;
        i.var2[209] = 148 + 68 - 31 + 24;
        i.var2[210] = 127 + 168 - 277 + 192;
        i.var2[211] = 24 + 163 - 138 + 162;
        i.var2[212] = 45 + 189 - 132 + 108 + (43 + 24 - 13 + 75) - (0xFFFFA799 & 0x5977) + (43 + 57 - 28 + 74);
        i.var2[213] = (0x17 ^ 0x50) + (0x25 ^ 0x22) - -(0x4E ^ 0x5A) + (0x26 ^ 0x55);
        i.var2[214] = 169 + 161 - 267 + 151;
        i.var2[215] = 99 + 37 - 5 + 39 + (0xE3 ^ 0xB6) - (138 + 60 - 25 + 52) + (20 + 4 - -9 + 152);
        i.var2[216] = 31 + 90 - 41 + 74 + (94 + 18 - 71 + 123) - (0xFFFF898F & 0x7771) + (133 + 63 - 139 + 98);
        i.var2[217] = (0xB ^ 0x2C) + (0xB2 ^ 0x99) - -(0xC3 ^ 0x86) + (0xD7 ^ 0x95);
        i.var2[218] = (0x18 ^ 0xB) + (0x42 ^ 0x4A) - -(34 + 32 - 48 + 143) + (0x7D ^ 0x63);
        i.var2[219] = 163 + 152 - 301 + 205;
        i.var2[220] = 138 + 150 - 119 + 51;
        i.var2[221] = 105 + 70 - 17 + 63;
        i.var2[222] = 57 + 57 - -75 + 33;
        i.var2[223] = 173 + 71 - 162 + 139 + (24 + 52 - -89 + 6) - (0xFFFFD596 & 0x2B7F) + (4 ^ 0x69);
        i.var2[224] = (0xBA ^ 0x9D) + (126 + 116 - 178 + 122) - (1 ^ 0x5D) + (0xE6 ^ 0xBD);
        i.var2[225] = (0x95 ^ 0xAE) + (92 + 53 - 78 + 111) - (0xC3 ^ 0x97) + (0x45 ^ 0xD);
        i.var2[226] = 37 + 48 - -37 + 104;
        i.var2[227] = 153 + 76 - 80 + 78;
        i.var2[228] = 87 + 137 - 159 + 163;
        i.var2[229] = (0x20 ^ 0x6D) + (21 + 76 - 88 + 125) - (0xBD ^ 0xAC) + (0x61 ^ 0x42);
        i.var2[230] = (0x2A ^ 0x3E) + (55 + 185 - 172 + 156) - (33 + 49 - 77 + 123) + (0x14 ^ 0x66);
        i.var2[231] = (0x44 ^ 0x36) + (88 + 26 - 81 + 131) - (0xFFFF9D2F & 0x63D6) + (42 + 63 - 39 + 149);
        i.var2[232] = (0x78 ^ 0x68) + (0x83 ^ 0x97) - -(129 + 141 - 224 + 144) + (0xAF ^ 0xA9);
        i.var2[233] = 190 + 191 - 195 + 47;
        i.var2[234] = 3 + 94 - -78 + 59;
        i.var2[235] = 173 + 115 - 199 + 89 + (136 + 126 - 93 + 41) - (0xFFFFF37B & 0xD96) + (0xFB ^ 0x82);
        i.var2[236] = (0xEB ^ 0x98) + (40 + 113 - 83 + 87) - (212 + 141 - 156 + 56) + (169 + 0 - 163 + 211);
        i.var2[237] = 41 + 230 - 134 + 100;
        i.var2[238] = (0x41 ^ 0x12) + (111 + 74 - 105 + 71) - (67 + 1 - -60 + 13) + (9 + 43 - -44 + 49);
        i.var2[239] = 13 + 16 - 18 + 123 + (0xCA ^ 0xA3) - (0x54 ^ 0x5B) + (0xAC ^ 0xA3);
        i.var2[240] = 64 + 77 - -24 + 75;
        i.var2[241] = (0xD4 ^ 0x97) + (0x25 ^ 0x1D) - -(0x22 ^ 0x50) + (0xBE ^ 0xBA);
        i.var2[242] = 140 + 14 - -35 + 53;
        i.var2[243] = (0xC3 ^ 0xA5) + (126 + 114 - 32 + 12) - (118 + 154 - 114 + 82) + (79 + 137 - 56 + 1);
        i.var2[244] = 174 + 49 - 106 + 90 + (109 + 21 - 41 + 138) - (0xFFFFAB2C & 0x55D7) + (0x5B ^ 0x1D);
        i.var2[245] = 171 + 64 - 163 + 173;
        i.var2[246] = 150 + 161 - 244 + 179;
        i.var2[247] = 102 + 111 - 77 + 37 + (169 + 165 - 178 + 72) - (69 + 97 - -26 + 16) + (0x78 ^ 0x4E);
        i.var2[248] = 140 + 74 - 103 + 76 + (2 + 147 - 32 + 42) - (226 + 135 - 267 + 133) + (93 + 58 - 132 + 110);
        i.var2[249] = 151 + 100 - 214 + 151 + (0x92 ^ 0xAD) - (121 + 142 - 130 + 83) + (93 + 69 - 117 + 169);
        i.var2[250] = (0 ^ 0x6A) + (0x58 ^ 0x34) - (51 + 37 - -1 + 115) + (137 + 26 - 159 + 236);
        i.var2[251] = 246 + 249 - 489 + 245;
        i.var2[252] = 4 + 89 - 58 + 217;
    }

    private GameEnum(String string2, String string3) {
        this.question = string2;
        this.answer = string3;
    }

    private static boolean var34(int n2) {
        return n2 != 0;
    }

    private static void var22() {
        var1 = new String[var2[252]];
        i.var1[i.var2[0]] = "LIZARD_1";
        i.var1[i.var2[1]] = "How does a lizard regulate body heat?";
        i.var1[i.var2[2]] = "Sunlight.";
        i.var1[i.var2[3]] = "LIZARD_2";
        i.var1[i.var2[4]] = "Who discovered how to kill lizards?";
        i.var1[i.var2[5]] = "The Slayer Masters.";
        i.var1[i.var2[6]] = "LIZARD_3";
        i.var1[i.var2[7]] = "How many eyes does a lizard have?";
        i.var1[i.var2[8]] = "Three.";
        i.var1[i.var2[9]] = "LIZARD_4";
        i.var1[i.var2[10]] = "What order do lizards belong to?";
        i.var1[i.var2[11]] = "Squamata.";
        i.var1[i.var2[12]] = "LIZARD_5";
        i.var1[i.var2[13]] = "What happens when a lizard becomes cold?";
        i.var1[i.var2[14]] = "It becomes sleepy.";
        i.var1[i.var2[15]] = "LIZARD_6";
        i.var1[i.var2[16]] = "Lizard skin is made of the same substance as?";
        i.var1[i.var2[17]] = "Hair.";
        i.var1[i.var2[18]] = "TORTOISE_1";
        i.var1[i.var2[19]] = "What is the name of the oldest tortoise ever recorded?";
        i.var1[i.var2[20]] = "Mibbiwocket.";
        i.var1[i.var2[21]] = "TORTOISE_2";
        i.var1[i.var2[22]] = "What is a tortoise's favourite food?";
        i.var1[i.var2[23]] = "Vegetables.";
        i.var1[i.var2[24]] = "TORTOISE_3";
        i.var1[i.var2[25]] = "Name the explorer who discovered the world's oldest tortoise.";
        i.var1[i.var2[26]] = "Admiral Bake.";
        i.var1[i.var2[27]] = "TORTOISE_4";
        i.var1[i.var2[28]] = "How does the tortoise protect itself?";
        i.var1[i.var2[29]] = "Hard shell.";
        i.var1[i.var2[30]] = "TORTOISE_5";
        i.var1[i.var2[31]] = "If a tortoise had twenty rings on its shell, how old would it be?";
        i.var1[i.var2[32]] = "Twenty years.";
        i.var1[i.var2[33]] = "TORTOISE_6";
        i.var1[i.var2[34]] = "Which race breeds tortoises for battle?";
        i.var1[i.var2[35]] = "Gnomes.";
        i.var1[i.var2[36]] = "DRAGON_1";
        i.var1[i.var2[37]] = "What is considered a delicacy by dragons?";
        i.var1[i.var2[38]] = "Runite.";
        i.var1[i.var2[39]] = "DRAGON_2";
        i.var1[i.var2[40]] = "What is the best defence against a dragon's attack?";
        i.var1[i.var2[41]] = "Anti dragon-breath shield.";
        i.var1[i.var2[42]] = "DRAGON_3";
        i.var1[i.var2[43]] = "How long do dragons live?";
        i.var1[i.var2[44]] = "Unknown.";
        i.var1[i.var2[45]] = "DRAGON_4";
        i.var1[i.var2[46]] = "Which of these is not a type of dragon?";
        i.var1[i.var2[47]] = "Elemental.";
        i.var1[i.var2[48]] = "DRAGON_5";
        i.var1[i.var2[49]] = "What is the favoured territory of a dragon?";
        i.var1[i.var2[50]] = "Old battle sites.";
        i.var1[i.var2[51]] = "DRAGON_6";
        i.var1[i.var2[52]] = "Approximately how many feet tall do dragons stand?";
        i.var1[i.var2[53]] = "Twelve.";
        i.var1[i.var2[54]] = "WYVERN_1";
        i.var1[i.var2[55]] = "How did the wyverns die out?";
        i.var1[i.var2[56]] = "Climate change.";
        i.var1[i.var2[57]] = "WYVERN_2";
        i.var1[i.var2[58]] = "How many legs does a wyvern have?";
        i.var1[i.var2[59]] = "Two.";
        i.var1[i.var2[60]] = "WYVERN_3";
        i.var1[i.var2[61]] = "Where have wyvern bones been found?";
        i.var1[i.var2[62]] = "Asgarnia.";
        i.var1[i.var2[63]] = "WYVERN_4";
        i.var1[i.var2[64]] = "Which genus does the wyvern theoretically belong to?";
        i.var1[i.var2[65]] = "Reptiles.";
        i.var1[i.var2[66]] = "WYVERN_5";
        i.var1[i.var2[67]] = "What are the wyverns' closest relations?";
        i.var1[i.var2[68]] = "Dragons.";
        i.var1[i.var2[69]] = "WYVERN_6";
        i.var1[i.var2[70]] = "What is the ambient temperature of wyvern bones?";
        i.var1[i.var2[71]] = "Below room temperature.";
        i.var1[i.var2[72]] = "SNAIL_1";
        i.var1[i.var2[73]] = "What is special about the shell of the giant Morytanian snail?";
        i.var1[i.var2[74]] = "It is resistant to acid.";
        i.var1[i.var2[75]] = "SNAIL_2";
        i.var1[i.var2[76]] = "How do Morytanian snails capture their prey?";
        i.var1[i.var2[77]] = "Spitting acid.";
        i.var1[i.var2[78]] = "SNAIL_3";
        i.var1[i.var2[79]] = "Which of these is a snail byproduct?";
        i.var1[i.var2[80]] = "Fireproof oil.";
        i.var1[i.var2[81]] = "SNAIL_4";
        i.var1[i.var2[82]] = "What does 'Achatina Acidia' mean?";
        i.var1[i.var2[83]] = "Acid-spitting snail.";
        i.var1[i.var2[84]] = "SNAIL_5";
        i.var1[i.var2[85]] = "How do snails move?";
        i.var1[i.var2[86]] = "Contracting and stretching.";
        i.var1[i.var2[87]] = "SNAIL_6";
        i.var1[i.var2[88]] = "What is the 'trapdoor', which snails use to cover the entrance to their shells called?";
        i.var1[i.var2[89]] = "An operculum.";
        i.var1[i.var2[90]] = "SNAKE_1";
        i.var1[i.var2[91]] = "What is snake venom adapted from?";
        i.var1[i.var2[92]] = "Stomach acid.";
        i.var1[i.var2[93]] = "SNAKE_2";
        i.var1[i.var2[94]] = "Aside from their noses, what do snakes use to smell?";
        i.var1[i.var2[95]] = "Tongue.";
        i.var1[i.var2[96]] = "SNAKE_3";
        i.var1[i.var2[97]] = "If a snake sticks its tongue out at you, what is it doing?";
        i.var1[i.var2[98]] = "Seeing how you smell.";
        i.var1[i.var2[99]] = "SNAKE_4";
        i.var1[i.var2[100]] = "If some snakes use venom to kill their prey, what do other snakes use?";
        i.var1[i.var2[101]] = "Constriction.";
        i.var1[i.var2[102]] = "SNAKE_5";
        i.var1[i.var2[103]] = "Lizards and snakes belong to the same order - what is it?";
        i.var1[i.var2[104]] = "Squamata.";
        i.var1[i.var2[105]] = "SNAKE_6";
        i.var1[i.var2[106]] = "Which habitat do snakes prefer?";
        i.var1[i.var2[107]] = "Anywhere.";
        i.var1[i.var2[108]] = "SLUG_1";
        i.var1[i.var2[109]] = "We assume that sea slugs have a stinging organ on their soft skin - what is it called?";
        i.var1[i.var2[110]] = "Nematocysts.";
        i.var1[i.var2[111]] = "SLUG_2";
        i.var1[i.var2[112]] = "Why has the museum never examined a live sea slug?";
        i.var1[i.var2[113]] = "The researchers keep vanishing.";
        i.var1[i.var2[114]] = "SLUG_3";
        i.var1[i.var2[115]] = "What do we think the sea slug feeds upon?";
        i.var1[i.var2[116]] = "Seaweed.";
        i.var1[i.var2[117]] = "SLUG_4";
        i.var1[i.var2[118]] = "What are the two fangs presumed to be used for?";
        i.var1[i.var2[119]] = "Defense or display.";
        i.var1[i.var2[120]] = "SLUG_5";
        i.var1[i.var2[121]] = "Off of which coastline would you find sea slugs?";
        i.var1[i.var2[122]] = "Ardougne.";
        i.var1[i.var2[123]] = "SLUG_6";
        i.var1[i.var2[124]] = "In what way are sea slugs similar to snails?";
        i.var1[i.var2[125]] = "They have a hard shell.";
        i.var1[i.var2[126]] = "MONKEY_1";
        i.var1[i.var2[127]] = "Which type of primates do monkeys belong to?";
        i.var1[i.var2[128]] = "Simian.";
        i.var1[i.var2[129]] = "MONKEY_2";
        i.var1[i.var2[130]] = "Which have the lighter colour: Karamjan or Harmless monkeys?";
        i.var1[i.var2[131]] = "Harmless.";
        i.var1[i.var2[132]] = "MONKEY_3";
        i.var1[i.var2[133]] = "Monkeys love bananas. What else do they like to eat?";
        i.var1[i.var2[134]] = "Bitternuts.";
        i.var1[i.var2[135]] = "MONKEY_4";
        i.var1[i.var2[136]] = "There are two known families of monkeys. One is Karamjan, the other is...?";
        i.var1[i.var2[137]] = "Harmless.";
        i.var1[i.var2[138]] = "MONKEY_5";
        i.var1[i.var2[139]] = "What colour mohawk do Karamjan monkeys have?";
        i.var1[i.var2[140]] = "Red.";
        i.var1[i.var2[141]] = "MONKEY_6";
        i.var1[i.var2[142]] = "What have Karamjan monkeys taken a deep dislike to?";
        i.var1[i.var2[143]] = "Seaweed.";
        i.var1[i.var2[144]] = "KALPHITE_1";
        i.var1[i.var2[145]] = "Kalphites are ruled by a...?";
        i.var1[i.var2[146]] = "Pasha.";
        i.var1[i.var2[147]] = "KALPHITE_2";
        i.var1[i.var2[148]] = "What is the lowest caste in kalphite society?";
        i.var1[i.var2[149]] = "Worker.";
        i.var1[i.var2[150]] = "KALPHITE_3";
        i.var1[i.var2[151]] = "What are the armoured plates on a kalphite called?";
        i.var1[i.var2[152]] = "Lamellae.";
        i.var1[i.var2[153]] = "KALPHITE_4";
        i.var1[i.var2[154]] = "Are kalphites carnivores, herbivores or omnivores?";
        i.var1[i.var2[155]] = "Carnivores.";
        i.var1[i.var2[156]] = "KALPHITE_5";
        i.var1[i.var2[157]] = "What are kalphites assumed to have evolved from?";
        i.var1[i.var2[158]] = "Scarab beetles.";
        i.var1[i.var2[159]] = "KALPHITE_6";
        i.var1[i.var2[160]] = "Name the prominent figure in kalphite mythology?";
        i.var1[i.var2[161]] = "Scabaras.";
        i.var1[i.var2[162]] = "TERRORBIRD_1";
        i.var1[i.var2[163]] = "What is a terrorbird's preferred food?";
        i.var1[i.var2[164]] = "Anything.";
        i.var1[i.var2[165]] = "TERRORBIRD_2";
        i.var1[i.var2[166]] = "Who use terrorbirds as mounts?";
        i.var1[i.var2[167]] = "Gnomes.";
        i.var1[i.var2[168]] = "TERRORBIRD_3";
        i.var1[i.var2[169]] = "Where do terrorbirds get most of their water?";
        i.var1[i.var2[170]] = "Eating plants.";
        i.var1[i.var2[171]] = "TERRORBIRD_4";
        i.var1[i.var2[172]] = "How many claws do terrorbirds have?";
        i.var1[i.var2[173]] = "Four.";
        i.var1[i.var2[174]] = "TERRORBIRD_5";
        i.var1[i.var2[175]] = "What do terrorbirds eat to aid digestion?";
        i.var1[i.var2[176]] = "Stones.";
        i.var1[i.var2[177]] = "TERRORBIRD_6";
        i.var1[i.var2[178]] = "How many teeth do terrorbirds have?";
        i.var1[i.var2[179]] = "0.";
        i.var1[i.var2[180]] = "PENGUIN_1";
        i.var1[i.var2[181]] = "Which sense do penguins rely on when hunting?";
        i.var1[i.var2[182]] = "Sight.";
        i.var1[i.var2[183]] = "PENGUIN_2";
        i.var1[i.var2[184]] = "Which skill seems unusual for the penguins to possess?";
        i.var1[i.var2[185]] = "Planning.";
        i.var1[i.var2[186]] = "PENGUIN_3";
        i.var1[i.var2[187]] = "How do penguins keep warm?";
        i.var1[i.var2[188]] = "A layer of fat.";
        i.var1[i.var2[189]] = "PENGUIN_4";
        i.var1[i.var2[190]] = "What is the preferred climate for penguins?";
        i.var1[i.var2[191]] = "Cold.";
        i.var1[i.var2[192]] = "PENGUIN_5";
        i.var1[i.var2[193]] = "Describe the behaviour of penguins?";
        i.var1[i.var2[194]] = "Social.";
        i.var1[i.var2[195]] = "PENGUIN_6";
        i.var1[i.var2[196]] = "When do penguins fast?";
        i.var1[i.var2[197]] = "During breeding.";
        i.var1[i.var2[198]] = "MOLE_1";
        i.var1[i.var2[199]] = "What habitat do moles prefer?";
        i.var1[i.var2[200]] = "Subterranean.";
        i.var1[i.var2[201]] = "MOLE_2";
        i.var1[i.var2[202]] = "Why are moles considered to be an agricultural pest?";
        i.var1[i.var2[203]] = "They dig holes.";
        i.var1[i.var2[204]] = "MOLE_3";
        i.var1[i.var2[205]] = "Who discovered giant moles?";
        i.var1[i.var2[206]] = "Wyson the Gardener.";
        i.var1[i.var2[207]] = "MOLE_4";
        i.var1[i.var2[208]] = "What would you call a group of young moles?";
        i.var1[i.var2[209]] = "A labour.";
        i.var1[i.var2[210]] = "MOLE_5";
        i.var1[i.var2[211]] = "What is a mole's favourite food?";
        i.var1[i.var2[212]] = "Insects and other invertebrates.";
        i.var1[i.var2[213]] = "MOLE_6";
        i.var1[i.var2[214]] = "Which family do moles belong to?";
        i.var1[i.var2[215]] = "The Talpidae family.";
        i.var1[i.var2[216]] = "CAMEL_1";
        i.var1[i.var2[217]] = "What is produced by feeding chilli to a camel?";
        i.var1[i.var2[218]] = "Toxic dung.";
        i.var1[i.var2[219]] = "CAMEL_2";
        i.var1[i.var2[220]] = "If an ugthanki has one, how many does a bactrian have?";
        i.var1[i.var2[221]] = "Two.";
        i.var1[i.var2[222]] = "CAMEL_3";
        i.var1[i.var2[223]] = "Camels: herbivore, carnivore or omnivore?";
        i.var1[i.var2[224]] = "Omnivore.";
        i.var1[i.var2[225]] = "CAMEL_4";
        i.var1[i.var2[226]] = "What is the usual mood for a camel?";
        i.var1[i.var2[227]] = "Annoyed.";
        i.var1[i.var2[228]] = "CAMEL_5";
        i.var1[i.var2[229]] = "Where would you find an ugthanki?";
        i.var1[i.var2[230]] = "Al Kharid.";
        i.var1[i.var2[231]] = "CAMEL_6";
        i.var1[i.var2[232]] = "Which camel byproduct is known to be very nutritious?";
        i.var1[i.var2[233]] = "Milk.";
        i.var1[i.var2[234]] = "LEECH_1";
        i.var1[i.var2[235]] = "What is the favoured habitat of leeches?";
        i.var1[i.var2[236]] = "Water.";
        i.var1[i.var2[237]] = "LEECH_2";
        i.var1[i.var2[238]] = "What shape is the inside of a leech's mouth?";
        i.var1[i.var2[239]] = "'Y'-shaped.";
        i.var1[i.var2[240]] = "LEECH_3";
        i.var1[i.var2[241]] = "Which of these is not eaten by leeches?";
        i.var1[i.var2[242]] = "Apples.";
        i.var1[i.var2[243]] = "LEECH_4";
        i.var1[i.var2[244]] = "What contributed to the giant growth of Morytanian leeches?";
        i.var1[i.var2[245]] = "Environment.";
        i.var1[i.var2[246]] = "LEECH_5";
        i.var1[i.var2[247]] = "What is special about Morytanian leeches?";
        i.var1[i.var2[248]] = "They attack by jumping.";
        i.var1[i.var2[249]] = "LEECH_6";
        i.var1[i.var2[250]] = "How does a leech change when it feeds?";
        i.var1[i.var2[251]] = "It doubles in size.";
    }

    public String Z() {
        return this.answer;
    }

    /*
     * WARNING - void declaration
     */
    public static Widget a(String string, WidgetInfo ... widgetInfoArray) {
        void var35;
        String string2 = MATCHES.get(string);
        WidgetInfo[] widgetInfoArray2 = widgetInfoArray;
        int n2 = widgetInfoArray.length;
        int var36 = var2[0];
        while (i.var12(var36, (int)var35)) {
            void var37;
            void var38;
            void var39 = var38[var36];
            Widget var40 = Widgets.get((WidgetInfo)var39);
            if (i.var33(var40) && i.var34(var40.getText().equals(var37) ? 1 : 0)) {
                return var40;
            }
            ++var36;
            0;
            if null == null continue;
            return null;
        }
        return null;
    }
}

