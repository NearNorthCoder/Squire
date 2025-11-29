/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.quest.tasks;

public final class GameEnum4
extends Enum<h> {
    public static final  /* enum */ h ROMEO_AND_JULIET;
    public static final  /* enum */ h WITCHS_POTION;
    public static final  /* enum */ h PIRATES_TREASURE;
    public static final  /* enum */ h IMP_CATCHER;
    public static final  /* enum */ h DWARF_CANNON;
    
    public static final  /* enum */ h RUNE_MYSTERIES;
    
    public static final  /* enum */ h PRINCE_ALI_RESCUE;
    public static final  /* enum */ h SHEEP_SHEARER;
    private static final  h[] $VALUES;
    private final  String questName;
    public static final  /* enum */ h TUTORIAL_ISLAND;
    public static final  /* enum */ h BELOW_ICE_MOUNTAIN;
    public static final  /* enum */ h X_MARKS_THE_SPOT;
    public static final  /* enum */ h MISTHALIN_MYSTERY;
    public static final  /* enum */ h CLIENT_OF_KOUREND;
    public static final  /* enum */ h COOKS_ASSISTANT;
    public static final  /* enum */ h RESTLESS_GHOST;
    public static final  /* enum */ h NATURAL_HISTORY_QUIZ;

    private static void var3() {
        var2 = new int[33];
        h.var2[0] = (0x65 ^ 0x46 ^ (0xC5 ^ 0xB9)) & (0x3A ^ 0x1F ^ (0x68 ^ 0x12) ^ -1);
        h.var2[1] = 1;
        h.var2[2] = 2;
        h.var2[3] = 3;
        h.var2[4] = 9 + 79 - 7 + 84 ^ 120 + 18 - -17 + 6;
        h.var2[5] = 0x47 ^ 0x42;
        h.var2[6] = 81 + 102 - 121 + 75 ^ 12 + 52 - 62 + 141;
        h.var2[7] = 74 + 98 - 93 + 58 ^ 82 + 116 - 196 + 140;
        h.var2[8] = 7 ^ 0xF;
        h.var2[9] = 0xC0 ^ 0xA9 ^ (0x1B ^ 0x7B);
        h.var2[10] = 30 + 6 - -32 + 120 ^ 22 + 41 - -93 + 26;
        h.var2[11] = 0xA0 ^ 0xAB;
        h.var2[12] = 9 ^ 5;
        h.var2[13] = 0xB ^ 0x30 ^ (0x8C ^ 0xBA);
        h.var2[14] = 0x55 ^ 0x5B;
        h.var2[15] = 0x7D ^ 0x72;
        h.var2[16] = 0x66 ^ 0x76;
        h.var2[17] = 0x70 ^ 0x7A ^ (0x92 ^ 0x89);
        h.var2[18] = 0x71 ^ 0x4F ^ (0x89 ^ 0xA5);
        h.var2[19] = 0xB7 ^ 0xC5 ^ (0xCF ^ 0xAE);
        h.var2[20] = 0xF8 ^ 0x9D ^ (0x1F ^ 0x6E);
        h.var2[21] = 0xE5 ^ 0xB0 ^ (0xC1 ^ 0x81);
        h.var2[22] = 69 + 79 - 119 + 98 ^ (0xCA ^ 0xA3);
        h.var2[23] = 0x10 ^ 7;
        h.var2[24] = 0x8D ^ 0x95;
        h.var2[25] = 0x52 ^ 0x42 ^ (0x4D ^ 0x44);
        h.var2[26] = 0xE2 ^ 0xAB ^ (0x6B ^ 0x38);
        h.var2[27] = 0x53 ^ 0x16 ^ (1 ^ 0x5F);
        h.var2[28] = 132 + 5 - 114 + 139 ^ 53 + 67 - 63 + 133;
        h.var2[29] = 0x3C ^ 0x39 ^ (0x47 ^ 0x5F);
        h.var2[30] = 0x69 ^ 0x77;
        h.var2[31] = 0x5E ^ 0x51 ^ (0x94 ^ 0x84);
        h.var2[32] = 0xD7 ^ 0xC4 ^ (0xA1 ^ 0x92);
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private GameEnum4(String string2) {
        this.questName = string2;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    static {
        h.var3();
        h.var5();
        BELOW_ICE_MOUNTAIN = new GameEnum4(var1[var2[1]]);
        CLIENT_OF_KOUREND = new GameEnum4(var1[var2[3]]);
        COOKS_ASSISTANT = new GameEnum4(var1[var2[5]]);
        DWARF_CANNON = new GameEnum4(var1[var2[7]]);
        IMP_CATCHER = new GameEnum4(var1[var2[9]]);
        MISTHALIN_MYSTERY = new GameEnum4(var1[var2[11]]);
        PIRATES_TREASURE = new GameEnum4(var1[var2[13]]);
        PRINCE_ALI_RESCUE = new GameEnum4(var1[var2[15]]);
        RESTLESS_GHOST = new GameEnum4(var1[var2[17]]);
        ROMEO_AND_JULIET = new GameEnum4(var1[var2[19]]);
        RUNE_MYSTERIES = new GameEnum4(var1[var2[21]]);
        NATURAL_HISTORY_QUIZ = new GameEnum4(var1[var2[23]]);
        SHEEP_SHEARER = new GameEnum4(var1[var2[25]]);
        TUTORIAL_ISLAND = new GameEnum4(var1[var2[27]]);
        WITCHS_POTION = new GameEnum4(var1[var2[29]]);
        X_MARKS_THE_SPOT = new GameEnum4(var1[var2[31]]);
        h[] hArray = new h[var2[16]];
        hArray[h.var2[0]] = BELOW_ICE_MOUNTAIN;
        hArray[h.var2[1]] = CLIENT_OF_KOUREND;
        hArray[h.var2[2]] = COOKS_ASSISTANT;
        hArray[h.var2[3]] = DWARF_CANNON;
        hArray[h.var2[4]] = IMP_CATCHER;
        hArray[h.var2[5]] = MISTHALIN_MYSTERY;
        hArray[h.var2[6]] = PIRATES_TREASURE;
        hArray[h.var2[7]] = PRINCE_ALI_RESCUE;
        hArray[h.var2[8]] = RESTLESS_GHOST;
        hArray[h.var2[9]] = ROMEO_AND_JULIET;
        hArray[h.var2[10]] = RUNE_MYSTERIES;
        hArray[h.var2[11]] = NATURAL_HISTORY_QUIZ;
        hArray[h.var2[12]] = SHEEP_SHEARER;
        hArray[h.var2[13]] = TUTORIAL_ISLAND;
        hArray[h.var2[14]] = WITCHS_POTION;
        hArray[h.var2[15]] = X_MARKS_THE_SPOT;
        $VALUES = hArray;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (h.var4(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((61 + 18 - -10 + 93 ^ 111 + 138 - 224 + 153) >= (137 + 122 - 161 + 90 ^ 34 + 40 - -72 + 38)) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var1 = new String[var2[32]];
        h.var1[h.var2[0]] = "BELOW_ICE_MOUNTAIN";
        h.var1[h.var2[1]] = "Below Ice Mountain";
        h.var1[h.var2[2]] = "CLIENT_OF_KOUREND";
        h.var1[h.var2[3]] = "Client Of Kourend";
        h.var1[h.var2[4]] = "COOKS_ASSISTANT";
        h.var1[h.var2[5]] = "Cook's Assistant";
        h.var1[h.var2[6]] = "DWARF_CANNON";
        h.var1[h.var2[7]] = "Dwarf Cannon";
        h.var1[h.var2[8]] = "IMP_CATCHER";
        h.var1[h.var2[9]] = "Imp Catcher";
        h.var1[h.var2[10]] = "MISTHALIN_MYSTERY";
        h.var1[h.var2[11]] = "Misthalin Mystery";
        h.var1[h.var2[12]] = "PIRATES_TREASURE";
        h.var1[h.var2[13]] = "Pirates Treasure";
        h.var1[h.var2[14]] = "PRINCE_ALI_RESCUE";
        h.var1[h.var2[15]] = "Prince Ali Rescue";
        h.var1[h.var2[16]] = "RESTLESS_GHOST";
        h.var1[h.var2[17]] = "Restless Ghost";
        h.var1[h.var2[18]] = "ROMEO_AND_JULIET";
        h.var1[h.var2[19]] = "Romeo And  Juliet";
        h.var1[h.var2[20]] = "RUNE_MYSTERIES";
        h.var1[h.var2[21]] = "Rune Mysteries";
        h.var1[h.var2[22]] = "NATURAL_HISTORY_QUIZ";
        h.var1[h.var2[23]] = "Natural History Quiz";
        h.var1[h.var2[24]] = "SHEEP_SHEARER";
        h.var1[h.var2[25]] = "Sheep Shearer";
        h.var1[h.var2[26]] = "TUTORIAL_ISLAND";
        h.var1[h.var2[27]] = "Tutorial Island";
        h.var1[h.var2[28]] = "WITCHS_POTION";
        h.var1[h.var2[29]] = "Witchs Potion";
        h.var1[h.var2[30]] = "X_MARKS_THE_SPOT";
        h.var1[h.var2[31]] = "X Marks The Spot";
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

