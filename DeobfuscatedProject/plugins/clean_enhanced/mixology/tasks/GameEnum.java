/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

public final class GameEnum
extends Enum<t> {
    private final  int lever2Value;
    
    private final  int unfinishedID;
    private final  int finishedID;
    public static final  /* enum */ t AZURE_AURA_MIX;
    public static final  /* enum */ t ALCO_AUGMENTATOR;
    private final  int lever3Value;
    public static final  /* enum */ t MAMMOTH_MIGHT;
    private static final  t[] $VALUES;
    public static final  /* enum */ t MYSTIC_MANA_AMALGAM;
    public static final  /* enum */ t MARLEYS_MOONLIGHT;
    public static final  /* enum */ t ANTI_LEECH_LOTION;
    public static final  /* enum */ t MIXALOT;
    private final  int xpReward;
    private final  int lever1Value;
    private final  String rewardType;
    public static final  /* enum */ t LIPLACK_LIQUOR;
    public static final  /* enum */ t MEGALITE_LIQUID;
    public static final  /* enum */ t AQUALUX_AMALGAM;
    
    private final  String name;

    public int n() {
        return this.unfinishedID;
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    public int k() {
        return this.lever2Value;
    }

    public String q() {
        return this.rewardType;
    }

    public int m() {
        return this.lever1Value;
    }

    public int l() {
        return this.lever3Value;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    static {
        t.var10();
        t.var11();
        LIPLACK_LIQUOR = new GameEnum(var1[var2[1]], var2[2], var2[3], var2[4], var2[4], var2[4], var2[5], var1[var2[6]]);
        ALCO_AUGMENTATOR = new GameEnum(var1[var2[7]], var2[8], var2[9], var2[6], var2[6], var2[6], var2[5], var1[var2[10]]);
        MAMMOTH_MIGHT = new GameEnum(var1[var2[12]], var2[13], var2[14], var2[1], var2[1], var2[1], var2[5], var1[var2[15]]);
        MYSTIC_MANA_AMALGAM = new GameEnum(var1[var2[17]], var2[18], var2[19], var2[1], var2[1], var2[6], var2[20], var1[var2[21]]);
        MARLEYS_MOONLIGHT = new GameEnum(var1[var2[23]], var2[24], var2[25], var2[1], var2[1], var2[4], var2[26], var1[var2[27]]);
        AZURE_AURA_MIX = new GameEnum(var1[var2[29]], var2[30], var2[31], var2[6], var2[6], var2[1], var2[32], var1[var2[33]]);
        AQUALUX_AMALGAM = new GameEnum(var1[var2[35]], var2[36], var2[37], var2[6], var2[4], var2[6], var2[38], var1[var2[39]]);
        MEGALITE_LIQUID = new GameEnum(var1[var2[41]], var2[42], var2[43], var2[1], var2[4], var2[4], var2[44], var1[var2[45]]);
        ANTI_LEECH_LOTION = new GameEnum(var1[var2[47]], var2[48], var2[49], var2[6], var2[4], var2[4], var2[50], var1[var2[51]]);
        MIXALOT = new GameEnum(var1[var2[53]], var2[54], var2[55], var2[1], var2[6], var2[4], var2[56], var1[var2[57]]);
        t[] tArray = new t[var2[17]];
        tArray[t.var2[0]] = LIPLACK_LIQUOR;
        tArray[t.var2[1]] = ALCO_AUGMENTATOR;
        tArray[t.var2[6]] = MAMMOTH_MIGHT;
        tArray[t.var2[4]] = MYSTIC_MANA_AMALGAM;
        tArray[t.var2[7]] = MARLEYS_MOONLIGHT;
        tArray[t.var2[10]] = AZURE_AURA_MIX;
        tArray[t.var2[11]] = AQUALUX_AMALGAM;
        tArray[t.var2[12]] = MEGALITE_LIQUID;
        tArray[t.var2[15]] = ANTI_LEECH_LOTION;
        tArray[t.var2[16]] = MIXALOT;
        $VALUES = tArray;
    }

    public int o() {
        return this.finishedID;
    }

    private static void var11() {
        var1 = new String[var2[58]];
        t.var1[t.var2[0]] = "LIPLACK_LIQUOR";
        t.var1[t.var2[1]] = "Liplack liquor";
        t.var1[t.var2[6]] = "lye";
        t.var1[t.var2[4]] = "ALCO_AUGMENTATOR";
        t.var1[t.var2[7]] = "Alco-augmentator";
        t.var1[t.var2[10]] = "aga";
        t.var1[t.var2[11]] = "MAMMOTH_MIGHT";
        t.var1[t.var2[12]] = "Mammoth-might mix";
        t.var1[t.var2[15]] = "mox";
        t.var1[t.var2[16]] = "MYSTIC_MANA_AMALGAM";
        t.var1[t.var2[17]] = "Mystic mana amalgam";
        t.var1[t.var2[21]] = "mox";
        t.var1[t.var2[22]] = "MARLEYS_MOONLIGHT";
        t.var1[t.var2[23]] = "Marley's moonlight";
        t.var1[t.var2[27]] = "mox";
        t.var1[t.var2[28]] = "AZURE_AURA_MIX";
        t.var1[t.var2[29]] = "Azure aura mix";
        t.var1[t.var2[33]] = "aga";
        t.var1[t.var2[34]] = "AQUALUX_AMALGAM";
        t.var1[t.var2[35]] = "Aqualux amalgam";
        t.var1[t.var2[39]] = "aga";
        t.var1[t.var2[40]] = "MEGALITE_LIQUID";
        t.var1[t.var2[41]] = "Megalite liquid";
        t.var1[t.var2[45]] = "lye";
        t.var1[t.var2[46]] = "ANTI_LEECH_LOTION";
        t.var1[t.var2[47]] = "Anti-leech lotion";
        t.var1[t.var2[51]] = "lye";
        t.var1[t.var2[52]] = "MIXALOT";
        t.var1[t.var2[53]] = "Mixalot";
        t.var1[t.var2[57]] = "lye";
    }

    public int p() {
        return this.xpReward;
    }

    private static void var10() {
        var2 = new int[59];
        t.var2[0] = (0x69 ^ 0x34 ^ (0x5F ^ 0x2C)) & (0x34 ^ 0x73 ^ (0xCC ^ 0xA5) ^ -1);
        t.var2[1] = 1;
        t.var2[2] = -(111 + 5 - 57 + 128) & (0xFFFFF5FF & 0x7FFB);
        t.var2[3] = 0xFFFFF77F & 0x7DCB;
        t.var2[4] = 3;
        t.var2[5] = 65 + 177 - 62 + 0 + (0x3E ^ 0x1A) - (103 + 97 - 146 + 81) + (0xFD ^ 0x90);
        t.var2[6] = 2;
        t.var2[7] = 109 + 51 - 79 + 103 ^ 67 + 99 - 77 + 99;
        t.var2[8] = -(0xFFFF9CEF & 0x6B51) & (0xFFFFFFFF & 0x7D7E);
        t.var2[9] = -(0xFFFFBDE6 & 0x4ABF) & (0xFFFFFFEF & 0x7DFD);
        t.var2[10] = 0x42 ^ 0x67 ^ (0x80 ^ 0xA0);
        t.var2[11] = 0xA5 ^ 0x9E ^ (0x5D ^ 0x60);
        t.var2[12] = 0x15 ^ 6 ^ (0x4C ^ 0x58);
        t.var2[13] = -(0xFFFFFFE1 & 0xADF) & (0xFFFFFFFB & Short.MAX_VALUE);
        t.var2[14] = -(0xFFFF8ABF & 0x7FDB) & (0xFFFFFFFF & 0x7FDF);
        t.var2[15] = 0xA6 ^ 0xAE;
        t.var2[16] = 0xB3 ^ 0xBA;
        t.var2[17] = 0x6B ^ 0x53 ^ (0xAC ^ 0x9E);
        t.var2[18] = 0xFFFFF7BE & 0x7D7D;
        t.var2[19] = 0xFFFFFDF7 & 0x774E;
        t.var2[20] = (0x6E ^ 0x2A) + (0x31 ^ 0x5F) - (9 + 122 - 110 + 108) + (84 + 37 - 26 + 71);
        t.var2[21] = 0x15 ^ 0x1E;
        t.var2[22] = 0x6D ^ 0x15 ^ (0x2F ^ 0x5B);
        t.var2[23] = 0xDA ^ 0xB1 ^ (0xD6 ^ 0xB0);
        t.var2[24] = 0xFFFFFD3D & 0x77FF;
        t.var2[25] = -(0xFFFFDAB9 & 0x27FF) & (0xFFFFF7FF & Short.MAX_VALUE);
        t.var2[26] = 222 + 232 - 361 + 147;
        t.var2[27] = 0x3D ^ 0x33;
        t.var2[28] = 0x67 ^ 0x68;
        t.var2[29] = 133 + 34 - 65 + 76 ^ 120 + 53 - 117 + 106;
        t.var2[30] = 0xFFFFFDDB & 0x7764;
        t.var2[31] = -(0xFFFFEBAD & 0x1CF3) & (0xFFFFFDEA & Short.MAX_VALUE);
        t.var2[32] = 0xFFFFD7CB & 0x293D;
        t.var2[33] = 0x2C ^ 0x3D;
        t.var2[34] = 0x3C ^ 0x1D ^ (0xF1 ^ 0xC2);
        t.var2[35] = 0xD3 ^ 0xC0;
        t.var2[36] = -(28 + 135 - 83 + 113) & (0xFFFFFDFF & 0x77FF);
        t.var2[37] = 0xFFFFF55D & 0x7FEB;
        t.var2[38] = -(0xFFFFFFFE & 0x7C0F) & (0xFFFFFDFF & 0x7F2F);
        t.var2[39] = 116 + 157 - 236 + 130 ^ 46 + 170 - 196 + 159;
        t.var2[40] = 0x78 ^ 0x6D;
        t.var2[41] = 0x25 ^ 0x61 ^ (0 ^ 0x52);
        t.var2[42] = -(0xFFFFC2B9 & 0x3F4F) & (0xFFFFFFCF & 0x777B);
        t.var2[43] = -(111 + 88 - 20 + 0) & (0xFFFFF5FF & Short.MAX_VALUE);
        t.var2[44] = 0xFFFFA9FB & 0x573F;
        t.var2[45] = 0x1E ^ 9;
        t.var2[46] = 59 + 105 - 107 + 91 ^ 82 + 65 - 22 + 15;
        t.var2[47] = 133 + 123 - 172 + 94 ^ 170 + 68 - 79 + 12;
        t.var2[48] = -(0xFFFFBFA3 & 0x4AFE) & (0xFFFFFFFF & 0x7FE3);
        t.var2[49] = 0xFFFFFD6E & 0x77DD;
        t.var2[50] = 0xFFFFC75D & 0x39F6;
        t.var2[51] = 0x8B ^ 0x91;
        t.var2[52] = 0x41 ^ 0x79 ^ (0x9C ^ 0xBF);
        t.var2[53] = 0x84 ^ 0x8A ^ (0x31 ^ 0x23);
        t.var2[54] = -(0x47 ^ 0x43) & (0xFFFFFF47 & 0x75FF);
        t.var2[55] = 0xFFFFFF4E & 0x75FF;
        t.var2[56] = 0xFFFFA96F & 0x57FD;
        t.var2[57] = 2 ^ (0x12 ^ 0xD);
        t.var2[58] = 2 ^ (0x52 ^ 0x4E);
    }

    public static t valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (t.var3(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private GameEnum(String string2, int n3, int n4, int n5, int n6, int n7, int n8, String string3) {
        this.name = string2;
        this.unfinishedID = n3;
        this.finishedID = n4;
        this.lever1Value = n5;
        this.lever2Value = n6;
        this.lever3Value = n7;
        this.xpReward = n8;
        this.rewardType = string3;
    }

    public String a() {
        return this.name;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

