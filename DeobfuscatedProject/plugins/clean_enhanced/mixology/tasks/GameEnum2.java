/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

public final class GameEnum2
extends Enum<b> {
    public static final  /* enum */ b KWUARM_POT_UNF;
    public static final  /* enum */ b CADANTINE;
    public static final  /* enum */ b CADANTINE_POT_UNF;
    public static final  /* enum */ b IRIT_LEAF;
    
    public static final  /* enum */ b RANARR_POT_UNF;
    public static final  /* enum */ b AVANTOE_POT_UNF;
    public static final  /* enum */ b TARROMIN;
    public static final  /* enum */ b SNAPDRAGON_POT_UNF;
    public static final  /* enum */ b HARRALANDER_POT_UNF;
    public static final  /* enum */ b MARRENTILL_POT_UNF;
    public static final  /* enum */ b TOADFLAX_POT_UNF;
    public static final  /* enum */ b LANTADYME;
    private final  String name;
    public static final  /* enum */ b DWARF_WEED;
    public static final  /* enum */ b KWUARM;
    private static final  b[] $VALUES;
    public static final  /* enum */ b MARRENTILL;
    public static final  /* enum */ b HARRALANDER;
    public static final  /* enum */ b IRIT_POT_UNF;
    public static final  /* enum */ b DWARF_WEED_POT_UNF;
    public static final  /* enum */ b RANARR_WEED;
    public static final  /* enum */ b GUAM_POT_UNF;
    public static final  /* enum */ b TORSTOL_POT_UNF;
    public static final  /* enum */ b TOADFLAX;
    public static final  /* enum */ b GUAM_LEAF;
    public static final  /* enum */ b AVANTOE;
    public static final  /* enum */ b LANTA_POT_UNF;
    
    private final  int herbId;
    public static final  /* enum */ b TARROMIN_POT_UNF;
    public static final  /* enum */ b SNAPDRAGON;
    public static final  /* enum */ b TORSTOL;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (b.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((0 + 76 - 75 + 195 ^ 4 + 149 - 87 + 126) != ((0xF4 ^ 0xAB ^ (0xFD ^ 0xB4)) & (0x10 ^ 0x37 ^ (0x1C ^ 0x2D) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private GameEnum2(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    public String a() {
        return this.name;
    }

    private static void var14() {
        var2 = new String[var1[84]];
        b.var2[b.var1[0]] = "GUAM_LEAF";
        b.var2[b.var1[1]] = "Guam leaf";
        b.var2[b.var1[3]] = "MARRENTILL";
        b.var2[b.var1[4]] = "Marrentill";
        b.var2[b.var1[6]] = "TARROMIN";
        b.var2[b.var1[7]] = "Tarromin";
        b.var2[b.var1[9]] = "HARRALANDER";
        b.var2[b.var1[10]] = "Harralander";
        b.var2[b.var1[12]] = "RANARR_WEED";
        b.var2[b.var1[13]] = "Ranarr weed";
        b.var2[b.var1[15]] = "TOADFLAX";
        b.var2[b.var1[16]] = "Toadflax";
        b.var2[b.var1[18]] = "IRIT_LEAF";
        b.var2[b.var1[19]] = "Irit leaf";
        b.var2[b.var1[21]] = "AVANTOE";
        b.var2[b.var1[22]] = "Avantoe";
        b.var2[b.var1[24]] = "KWUARM";
        b.var2[b.var1[25]] = "Kwuarm";
        b.var2[b.var1[27]] = "SNAPDRAGON";
        b.var2[b.var1[28]] = "Snapdragon";
        b.var2[b.var1[30]] = "CADANTINE";
        b.var2[b.var1[31]] = "Cadantine";
        b.var2[b.var1[33]] = "LANTADYME";
        b.var2[b.var1[34]] = "Lantadyme";
        b.var2[b.var1[36]] = "DWARF_WEED";
        b.var2[b.var1[37]] = "Dwarf weed";
        b.var2[b.var1[39]] = "TORSTOL";
        b.var2[b.var1[40]] = "Torstol";
        b.var2[b.var1[42]] = "IRIT_POT_UNF";
        b.var2[b.var1[43]] = "Irit potion (unf)";
        b.var2[b.var1[45]] = "CADANTINE_POT_UNF";
        b.var2[b.var1[46]] = "Cadantine potion (unf)";
        b.var2[b.var1[48]] = "LANTA_POT_UNF";
        b.var2[b.var1[49]] = "Lantadyme potion (unf)";
        b.var2[b.var1[51]] = "DWARF_WEED_POT_UNF";
        b.var2[b.var1[52]] = "Dwarf weed potion (unf)";
        b.var2[b.var1[54]] = "TORSTOL_POT_UNF";
        b.var2[b.var1[55]] = "Torstol potion (unf)";
        b.var2[b.var1[57]] = "RANARR_POT_UNF";
        b.var2[b.var1[58]] = "Ranarr potion (unf)";
        b.var2[b.var1[60]] = "TOADFLAX_POT_UNF";
        b.var2[b.var1[61]] = "Toadflax potion (unf)";
        b.var2[b.var1[63]] = "AVANTOE_POT_UNF";
        b.var2[b.var1[64]] = "Avantoe potion (unf)";
        b.var2[b.var1[66]] = "KWUARM_POT_UNF";
        b.var2[b.var1[67]] = "Kwuarm potion (unf)";
        b.var2[b.var1[69]] = "SNAPDRAGON_POT_UNF";
        b.var2[b.var1[70]] = "Snapdragon potion (unf)";
        b.var2[b.var1[72]] = "GUAM_POT_UNF";
        b.var2[b.var1[73]] = "Guam potion (unf)";
        b.var2[b.var1[75]] = "MARRENTILL_POT_UNF";
        b.var2[b.var1[76]] = "Marrentill potion (unf)";
        b.var2[b.var1[78]] = "TARROMIN_POT_UNF";
        b.var2[b.var1[79]] = "Tarromin potion (unf)";
        b.var2[b.var1[81]] = "HARRALANDER_POT_UNF";
        b.var2[b.var1[82]] = "Harralander potion (unf)";
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    public int GameEnum2() {
        return this.herbId;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static void var27() {
        var1 = new int[85];
        b.var1[0] = (171 + 85 - 91 + 36 ^ 144 + 94 - 186 + 105) & (0xE4 ^ 0xA7 ^ (0x10 ^ 7) ^ -1);
        b.var1[1] = 1;
        b.var1[2] = 8 + 167 - 82 + 104 + (0xCC ^ 0xC5) - (0x63 ^ 0x66) + (0x2E ^ 0x1E);
        b.var1[3] = 2;
        b.var1[4] = 3;
        b.var1[5] = 2 + (174 + 28 - -1 + 36) - (137 + 95 - 226 + 139) + (144 + 7 - 87 + 91);
        b.var1[6] = 0x81 ^ 0x85;
        b.var1[7] = 0xB2 ^ 0xB7;
        b.var1[8] = (0x5F ^ 0x41) + (0 + 42 - -128 + 79) - (0x6F ^ 0x3B) + (0x49 ^ 0x73);
        b.var1[9] = 0x59 ^ 0x4B ^ (0x48 ^ 0x5C);
        b.var1[10] = 7 ^ 0x2C ^ (0x74 ^ 0x58);
        b.var1[11] = 150 + 8 - 133 + 230;
        b.var1[12] = 0x9A ^ 0x92;
        b.var1[13] = 0x39 ^ 0x30;
        b.var1[14] = -(0xFFFFEDBD & 0x76DF) & (0xFFFFFD9F & 0x67FD);
        b.var1[15] = 0x5F ^ 0x55;
        b.var1[16] = 0xA4 ^ 0xAF;
        b.var1[17] = -(0xFFFFB7ED & 0x685B) & (0xFFFFABFF & 0x7FFE);
        b.var1[18] = 0x3C ^ 0x30;
        b.var1[19] = 0x8E ^ 0x83;
        b.var1[20] = 0xFFFF9F6B & 0x6197;
        b.var1[21] = 0x2B ^ 0x25;
        b.var1[22] = 0x76 ^ 0x7D ^ (0x20 ^ 0x24);
        b.var1[23] = -(0xFFFFFEFB & 0x4FFF) & (0xFFFFCFFF & Short.MAX_VALUE);
        b.var1[24] = 0x4A ^ 0x18 ^ (0x56 ^ 0x14);
        b.var1[25] = 0x52 ^ 0x43;
        b.var1[26] = -(0xFFFFFBFB & 0x5EE5) & (0xFFFFDFFF & 0x7BE7);
        b.var1[27] = 0xB5 ^ 0xA7;
        b.var1[28] = 112 + 117 - 223 + 174 ^ 147 + 75 - 66 + 11;
        b.var1[29] = -1 & (0xFFFFDBFB & 0x2FBC);
        b.var1[30] = 10 + 37 - -2 + 92 ^ 34 + 63 - 11 + 67;
        b.var1[31] = 0x84 ^ 0x91;
        b.var1[32] = 0xFFFFA7DF & 0x5929;
        b.var1[33] = 0x91 ^ 0x87;
        b.var1[34] = 0xA1 ^ 0xB6;
        b.var1[35] = 0xFFFFFBFB & 0xDB5;
        b.var1[36] = 0x9F ^ 0xC3 ^ (0x62 ^ 0x26);
        b.var1[37] = 0x57 ^ 0x4F ^ 1;
        b.var1[38] = -(0xFFFFD1E5 & 0x7E3F) & (0xFFFFD5FF & 0x7B2F);
        b.var1[39] = 0 ^ 5 ^ (0x49 ^ 0x56);
        b.var1[40] = 85 + 67 - 54 + 88 ^ 65 + 156 - 216 + 156;
        b.var1[41] = 0xFFFFEB0F & 0x15FD;
        b.var1[42] = 0x5E ^ 0x42;
        b.var1[43] = 26 + 103 - 0 + 8 ^ 0 + 45 - -94 + 9;
        b.var1[44] = 136 + 196 - 154 + 48 ^ 22 + 56 - -51 + 6;
        b.var1[45] = 0xB1 ^ 0xAF;
        b.var1[46] = 0xAA ^ 0xB5;
        b.var1[47] = 77 + 0 - 54 + 192 ^ 105 + 65 - -7 + 11;
        b.var1[48] = 0x47 ^ 9 ^ (0x5D ^ 0x33);
        b.var1[49] = 0xB2 ^ 0x93;
        b.var1[50] = 0xFFFF9BBF & 0x6DF3;
        b.var1[51] = 0xBB ^ 0x99;
        b.var1[52] = 0x21 ^ 0x4F ^ (0x28 ^ 0x65);
        b.var1[53] = 0x24 ^ 0x45 ^ (0xB6 ^ 0xBA);
        b.var1[54] = 171 + 107 - 107 + 2 ^ 100 + 68 - 88 + 57;
        b.var1[55] = 0xC9 ^ 0x82 ^ (0xE8 ^ 0x86);
        b.var1[56] = 0xA ^ 0x65;
        b.var1[57] = 0xE0 ^ 0xC6;
        b.var1[58] = 7 ^ 0x70 ^ (0x3F ^ 0x6F);
        b.var1[59] = 130 + 11 - -15 + 67 ^ 97 + 179 - 197 + 109;
        b.var1[60] = 0xD9 ^ 0x80 ^ (0x54 ^ 0x25);
        b.var1[61] = 0x8E ^ 0xA7;
        b.var1[62] = 0xFFFF9BFA & 0x6FBF;
        b.var1[63] = 0x54 ^ 0x7E;
        b.var1[64] = 42 + 94 - 125 + 150 ^ 118 + 56 - 44 + 8;
        b.var1[65] = 3 + 20 - -12 + 180 ^ 27 + 119 - 95 + 125;
        b.var1[66] = 0x10 ^ 0x55 ^ (0xEB ^ 0x82);
        b.var1[67] = 0x64 ^ 0xB ^ (0xC ^ 0x4E);
        b.var1[68] = 0x8B ^ 0xA1 ^ (0x23 ^ 0x60);
        b.var1[69] = 0x51 ^ 0x7F;
        b.var1[70] = 0xE8 ^ 0xC7;
        b.var1[71] = 0xFFFF9FBF & 0x6BFC;
        b.var1[72] = 0x76 ^ 0x46;
        b.var1[73] = 0x7C ^ 0x4D;
        b.var1[74] = 0xFF ^ 0xA4;
        b.var1[75] = 0xA ^ 0x38;
        b.var1[76] = 0x7C ^ 0x4F;
        b.var1[77] = 0xFE ^ 0xA3;
        b.var1[78] = 0x70 ^ 0x44;
        b.var1[79] = 0x4A ^ 0x7F;
        b.var1[80] = 0xA ^ 0x55;
        b.var1[81] = 0x77 ^ 0x41;
        b.var1[82] = 3 ^ 0x2B ^ (0x36 ^ 0x29);
        b.var1[83] = 0x2A ^ 0x74 ^ (0x96 ^ 0xA9);
        b.var1[84] = 144 + 28 - 94 + 75 ^ 74 + 85 - 34 + 36;
    }

    static {
        b.var27();
        b.var14();
        GUAM_LEAF = new GameEnum2(var2[var1[1]], var1[2]);
        MARRENTILL = new GameEnum2(var2[var1[4]], var1[5]);
        TARROMIN = new GameEnum2(var2[var1[7]], var1[8]);
        HARRALANDER = new GameEnum2(var2[var1[10]], var1[11]);
        RANARR_WEED = new GameEnum2(var2[var1[13]], var1[14]);
        TOADFLAX = new GameEnum2(var2[var1[16]], var1[17]);
        IRIT_LEAF = new GameEnum2(var2[var1[19]], var1[20]);
        AVANTOE = new GameEnum2(var2[var1[22]], var1[23]);
        KWUARM = new GameEnum2(var2[var1[25]], var1[26]);
        SNAPDRAGON = new GameEnum2(var2[var1[28]], var1[29]);
        CADANTINE = new GameEnum2(var2[var1[31]], var1[32]);
        LANTADYME = new GameEnum2(var2[var1[34]], var1[35]);
        DWARF_WEED = new GameEnum2(var2[var1[37]], var1[38]);
        TORSTOL = new GameEnum2(var2[var1[40]], var1[41]);
        IRIT_POT_UNF = new GameEnum2(var2[var1[43]], var1[44]);
        CADANTINE_POT_UNF = new GameEnum2(var2[var1[46]], var1[47]);
        LANTA_POT_UNF = new GameEnum2(var2[var1[49]], var1[50]);
        DWARF_WEED_POT_UNF = new GameEnum2(var2[var1[52]], var1[53]);
        TORSTOL_POT_UNF = new GameEnum2(var2[var1[55]], var1[56]);
        RANARR_POT_UNF = new GameEnum2(var2[var1[58]], var1[59]);
        TOADFLAX_POT_UNF = new GameEnum2(var2[var1[61]], var1[62]);
        AVANTOE_POT_UNF = new GameEnum2(var2[var1[64]], var1[65]);
        KWUARM_POT_UNF = new GameEnum2(var2[var1[67]], var1[68]);
        SNAPDRAGON_POT_UNF = new GameEnum2(var2[var1[70]], var1[71]);
        GUAM_POT_UNF = new GameEnum2(var2[var1[73]], var1[74]);
        MARRENTILL_POT_UNF = new GameEnum2(var2[var1[76]], var1[77]);
        TARROMIN_POT_UNF = new GameEnum2(var2[var1[79]], var1[80]);
        HARRALANDER_POT_UNF = new GameEnum2(var2[var1[82]], var1[83]);
        b[] bArray = new b[var1[42]];
        bArray[b.var1[0]] = GUAM_LEAF;
        bArray[b.var1[1]] = MARRENTILL;
        bArray[b.var1[3]] = TARROMIN;
        bArray[b.var1[4]] = HARRALANDER;
        bArray[b.var1[6]] = RANARR_WEED;
        bArray[b.var1[7]] = TOADFLAX;
        bArray[b.var1[9]] = IRIT_LEAF;
        bArray[b.var1[10]] = AVANTOE;
        bArray[b.var1[12]] = KWUARM;
        bArray[b.var1[13]] = SNAPDRAGON;
        bArray[b.var1[15]] = CADANTINE;
        bArray[b.var1[16]] = LANTADYME;
        bArray[b.var1[18]] = DWARF_WEED;
        bArray[b.var1[19]] = TORSTOL;
        bArray[b.var1[21]] = IRIT_POT_UNF;
        bArray[b.var1[22]] = CADANTINE_POT_UNF;
        bArray[b.var1[24]] = LANTA_POT_UNF;
        bArray[b.var1[25]] = DWARF_WEED_POT_UNF;
        bArray[b.var1[27]] = TORSTOL_POT_UNF;
        bArray[b.var1[28]] = RANARR_POT_UNF;
        bArray[b.var1[30]] = TOADFLAX_POT_UNF;
        bArray[b.var1[31]] = AVANTOE_POT_UNF;
        bArray[b.var1[33]] = KWUARM_POT_UNF;
        bArray[b.var1[34]] = SNAPDRAGON_POT_UNF;
        bArray[b.var1[36]] = GUAM_POT_UNF;
        bArray[b.var1[37]] = MARRENTILL_POT_UNF;
        bArray[b.var1[39]] = TARROMIN_POT_UNF;
        bArray[b.var1[40]] = HARRALANDER_POT_UNF;
        $VALUES = bArray;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }
}

