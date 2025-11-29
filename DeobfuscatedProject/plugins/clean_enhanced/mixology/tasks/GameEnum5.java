/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

public final class GameEnum5
extends Enum<e> {
    private final  int herbId;
    public static final  /* enum */ e HARRALANDER;
    public static final  /* enum */ e MARRENTILL_POT_UNF;

    public static final  /* enum */ e HARRALANDER_POT_UNF;
    public static final  /* enum */ e GUAM_POT_UNF;
    public static final  /* enum */ e TARROMIN_POT_UNF;
    public static final  /* enum */ e GUAM_LEAF;
    private static final  e[] $VALUES;
    public static final  /* enum */ e TARROMIN;
    public static final  /* enum */ e MARRENTILL;
    private final  String name;

    public int b() {
        return this.herbId;
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    static {
        e.var3();
        e.var4();
        GUAM_LEAF = new GameEnum5(var1[var2[1]], var2[2]);
        MARRENTILL = new GameEnum5(var1[var2[4]], var2[5]);
        TARROMIN = new GameEnum5(var1[var2[7]], var2[8]);
        HARRALANDER = new GameEnum5(var1[var2[10]], var2[11]);
        GUAM_POT_UNF = new GameEnum5(var1[var2[13]], var2[14]);
        MARRENTILL_POT_UNF = new GameEnum5(var1[var2[16]], var2[17]);
        TARROMIN_POT_UNF = new GameEnum5(var1[var2[19]], var2[20]);
        HARRALANDER_POT_UNF = new GameEnum5(var1[var2[22]], var2[23]);
        e[] eArray = new e[var2[12]];
        eArray[e.var2[0]] = GUAM_LEAF;
        eArray[e.var2[1]] = MARRENTILL;
        eArray[e.var2[3]] = TARROMIN;
        eArray[e.var2[4]] = HARRALANDER;
        eArray[e.var2[6]] = GUAM_POT_UNF;
        eArray[e.var2[7]] = MARRENTILL_POT_UNF;
        eArray[e.var2[9]] = TARROMIN_POT_UNF;
        eArray[e.var2[10]] = HARRALANDER_POT_UNF;
        $VALUES = eArray;
    }

    private static void var4() {
        var1 = new String[var2[24]];
        e.var1[e.var2[0]] = "GUAM_LEAF";
        e.var1[e.var2[1]] = "Guam leaf";
        e.var1[e.var2[3]] = "MARRENTILL";
        e.var1[e.var2[4]] = "Marrentill";
        e.var1[e.var2[6]] = "TARROMIN";
        e.var1[e.var2[7]] = "Tarromin";
        e.var1[e.var2[9]] = "HARRALANDER";
        e.var1[e.var2[10]] = "Harralander";
        e.var1[e.var2[12]] = "GUAM_POT_UNF";
        e.var1[e.var2[13]] = "Guam potion (unf)";
        e.var1[e.var2[15]] = "MARRENTILL_POT_UNF";
        e.var1[e.var2[16]] = "Marrentill potion (unf)";
        e.var1[e.var2[18]] = "TARROMIN_POT_UNF";
        e.var1[e.var2[19]] = "Tarromin potion (unf)";
        e.var1[e.var2[21]] = "HARRALANDER_POT_UNF";
        e.var1[e.var2[22]] = "Harralander potion (unf)";
    }

    private GameEnum5(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public String a() {
        return this.name;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (e.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void var3() {
        var2 = new int[25];
        e.var2[0] = (0xE7 ^ 0xB0 ^ (0xDF ^ 0x93)) & (0x34 ^ 0xA ^ (0x80 ^ 0xA5) ^ -1);
        e.var2[1] = 1;
        e.var2[2] = 171 + 157 - 79 + 0;
        e.var2[3] = 2;
        e.var2[4] = 3;
        e.var2[5] = 104 + 145 - 167 + 96 + (15 + 134 - 50 + 42) - (0xFFFFAF33 & 0x51EE) + (118 + 77 - -23 + 4);
        e.var2[6] = 0x74 ^ 0x64 ^ (0x8F ^ 0x9B);
        e.var2[7] = 0x92 ^ 0x97;
        e.var2[8] = 223 + 213 - 401 + 218;
        e.var2[9] = 26 + 93 - 79 + 119 ^ 89 + 115 - 117 + 66;
        e.var2[10] = 0x92 ^ 0x9B ^ (0x24 ^ 0x2A);
        e.var2[11] = 24 + 109 - -89 + 33;
        e.var2[12] = 0x6A ^ 0x62;
        e.var2[13] = 127 + 142 - 127 + 16 ^ 87 + 140 - 96 + 20;
        e.var2[14] = 0xFF ^ 0xA4;
        e.var2[15] = 0x17 ^ 0x1D;
        e.var2[16] = 6 ^ 0xD ^ (0x4E ^ 0x53) & ~(0xB1 ^ 0xAC);
        e.var2[17] = 87 + 142 - 222 + 199 ^ 59 + 143 - 147 + 92;
        e.var2[18] = 0x46 ^ 0x18 ^ (0x53 ^ 1);
        e.var2[19] = 0x3A ^ 0x37;
        e.var2[20] = 0x49 ^ 0x16;
        e.var2[21] = 0xB1 ^ 0xC3 ^ (0xCB ^ 0xB7);
        e.var2[22] = 0x4F ^ 0x44 ^ (0x4C ^ 0x48);
        e.var2[23] = 105 + 54 - 158 + 162 ^ 10 + 120 - -1 + 63;
        e.var2[24] = 2 + 42 - 29 + 115 ^ 80 + 30 - 55 + 91;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

