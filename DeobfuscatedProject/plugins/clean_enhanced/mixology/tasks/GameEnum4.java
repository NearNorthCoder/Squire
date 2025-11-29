/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

public final class GameEnum4
extends Enum<a> {
    public static final  /* enum */ a DWARF_WEED_POT_UNF;
    public static final  /* enum */ a DWARF_WEED;
    public static final  /* enum */ a CADANTINE_POT_UNF;
    public static final  /* enum */ a IRIT_LEAF;
    private final  String name;
    public static final  /* enum */ a IRIT_POT_UNF;

    public static final  /* enum */ a TORSTOL_POT_UNF;
    public static final  /* enum */ a LANTADYME;
    private final  int herbId;
    public static final  /* enum */ a LANTA_POT_UNF;
    private static final  a[] $VALUES;
    public static final  /* enum */ a CADANTINE;
    public static final  /* enum */ a TORSTOL;

    public int b() {
        return this.herbId;
    }

    public String GameEnum4() {
        return this.name;
    }

    private static void var3() {
        var1 = new int[31];
        a.var1[0] = (0x29 ^ 0x43 ^ (0x54 ^ 9)) & (0xC3 ^ 0x93 ^ (0x49 ^ 0x2E) ^ -1);
        a.var1[1] = 1;
        a.var1[2] = 0xFFFFCB9F & 0x3563;
        a.var1[3] = 2;
        a.var1[4] = 3;
        a.var1[5] = -(0xFFFFFF9B & 0x24F7) & (0xFFFFADBB & 0x77DF);
        a.var1[6] = 0x2B ^ 0x25 ^ (0x5A ^ 0x50);
        a.var1[7] = 0xBD ^ 0xB8;
        a.var1[8] = 0xFFFFCDF7 & 0x3BB9;
        a.var1[9] = 0x9E ^ 0x9A ^ 2;
        a.var1[10] = 0x39 ^ 0x3E;
        a.var1[11] = 0xFFFFFDFB & 0x30F;
        a.var1[12] = 0x9F ^ 0x97;
        a.var1[13] = 153 + 22 - 12 + 6 ^ 83 + 128 - 171 + 120;
        a.var1[14] = 0xFFFFC5DF & 0x3B2D;
        a.var1[15] = 0x2E ^ 0x24;
        a.var1[16] = 0x48 ^ 0x43;
        a.var1[17] = 0x49 ^ 0x2C;
        a.var1[18] = 0xB6 ^ 0xBA;
        a.var1[19] = 0xCF ^ 0xC2;
        a.var1[20] = 0x8D ^ 0xC1 ^ (0x85 ^ 0xA2);
        a.var1[21] = 0x54 ^ 0x5A;
        a.var1[22] = 0x8E ^ 0x81;
        a.var1[23] = 0xFFFFEDB7 & 0x1BFB;
        a.var1[24] = 0x2B ^ 0x3B;
        a.var1[25] = 0xD4 ^ 0xC5;
        a.var1[26] = 0x6A ^ 7;
        a.var1[27] = 0xB1 ^ 0xA3;
        a.var1[28] = 0x1A ^ 9;
        a.var1[29] = 0x38 ^ 0x74 ^ (0x2E ^ 0xD);
        a.var1[30] = 0x44 ^ 0x50;
    }

    private static void var4() {
        var2 = new String[var1[30]];
        a.var2[a.var1[0]] = "IRIT_LEAF";
        a.var2[a.var1[1]] = "Irit leaf";
        a.var2[a.var1[3]] = "CADANTINE";
        a.var2[a.var1[4]] = "Cadantine";
        a.var2[a.var1[6]] = "LANTADYME";
        a.var2[a.var1[7]] = "Lantadyme";
        a.var2[a.var1[9]] = "DWARF_WEED";
        a.var2[a.var1[10]] = "Dwarf weed";
        a.var2[a.var1[12]] = "TORSTOL";
        a.var2[a.var1[13]] = "Torstol";
        a.var2[a.var1[15]] = "IRIT_POT_UNF";
        a.var2[a.var1[16]] = "Irit potion (unf)";
        a.var2[a.var1[18]] = "CADANTINE_POT_UNF";
        a.var2[a.var1[19]] = "Cadantine potion (unf)";
        a.var2[a.var1[21]] = "LANTA_POT_UNF";
        a.var2[a.var1[22]] = "Lantadyme potion (unf)";
        a.var2[a.var1[24]] = "DWARF_WEED_POT_UNF";
        a.var2[a.var1[25]] = "Dwarf weed potion (unf)";
        a.var2[a.var1[27]] = "TORSTOL_POT_UNF";
        a.var2[a.var1[28]] = "Torstol potion (unf)";
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var1[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var1[0];
        while (a.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((0x6D ^ 0x4B) & ~(0xA9 ^ 0x8F)) == ((0x4F ^ 0xB) & ~(0x17 ^ 0x53))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    public static a valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public static a[] values() {
        return (a[])$VALUES.clone();
    }

    private GameEnum4(String string2, int n3) {
        this.name = string2;
        this.herbId = n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    static {
        a.var3();
        a.var4();
        IRIT_LEAF = new GameEnum4(var2[var1[1]], var1[2]);
        CADANTINE = new GameEnum4(var2[var1[4]], var1[5]);
        LANTADYME = new GameEnum4(var2[var1[7]], var1[8]);
        DWARF_WEED = new GameEnum4(var2[var1[10]], var1[11]);
        TORSTOL = new GameEnum4(var2[var1[13]], var1[14]);
        IRIT_POT_UNF = new GameEnum4(var2[var1[16]], var1[17]);
        CADANTINE_POT_UNF = new GameEnum4(var2[var1[19]], var1[20]);
        LANTA_POT_UNF = new GameEnum4(var2[var1[22]], var1[23]);
        DWARF_WEED_POT_UNF = new GameEnum4(var2[var1[25]], var1[26]);
        TORSTOL_POT_UNF = new GameEnum4(var2[var1[28]], var1[29]);
        a[] aArray = new a[var1[15]];
        aArray[a.var1[0]] = IRIT_LEAF;
        aArray[a.var1[1]] = CADANTINE;
        aArray[a.var1[3]] = LANTADYME;
        aArray[a.var1[4]] = DWARF_WEED;
        aArray[a.var1[6]] = TORSTOL;
        aArray[a.var1[7]] = IRIT_POT_UNF;
        aArray[a.var1[9]] = CADANTINE_POT_UNF;
        aArray[a.var1[10]] = LANTA_POT_UNF;
        aArray[a.var1[12]] = DWARF_WEED_POT_UNF;
        aArray[a.var1[13]] = TORSTOL_POT_UNF;
        $VALUES = aArray;
    }
}

