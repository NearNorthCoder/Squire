/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mta.tasks;

public final class GameEnum4
extends Enum<d> {
    public static final  /* enum */ d POSSIBLY_EMPTY;
    public static final  /* enum */ d RUNE_LONGSWORD;
    public static final  /* enum */ d UNKNOWN;
    public static final  /* enum */ d EMPTY;
    
    public static final  /* enum */ d EMERALD;
    private final  int id;
    public static final  /* enum */ d ADAMANT_MED_HELM;
    private final  String name;
    private static final  d[] $VALUES;
    public static final  /* enum */ d ADAMANT_KITESHIELD;
    
    public static final  /* enum */ d LEATHER_BOOTS;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public int i() {
        return this.id;
    }

    private GameEnum4(String string2, int n3) {
        this.id = n3;
        this.name = string2;
    }

    private static void var9() {
        var2 = new int[24];
        d.var2[0] = (0x90 ^ 0x8E) & ~(0x9B ^ 0x85);
        d.var2[1] = 1;
        d.var2[2] = 0xFFFFFAFF & 0x1FED;
        d.var2[3] = 2;
        d.var2[4] = 3;
        d.var2[5] = -(0xD6 ^ 0xC4) & (0xFFFFFFFF & 0x1AFF);
        d.var2[6] = 0x55 ^ 0x51;
        d.var2[7] = 0x68 ^ 0x6D;
        d.var2[8] = 0xFFFF9BEF & 0x7EFF;
        d.var2[9] = 0x5A ^ 0x5C;
        d.var2[10] = 10 + 73 - 14 + 72 ^ 83 + 13 - -31 + 11;
        d.var2[11] = -(0x80 ^ 0x87) & (0xFFFFFBF6 & 0x1EFF);
        d.var2[12] = 0xB3 ^ 0xBB;
        d.var2[13] = 0xF8 ^ 0x80 ^ (0x37 ^ 0x46);
        d.var2[14] = -(0xFFFF85DB & 0x7E25) & (0xFFFFFFFF & 0x1EF1);
        d.var2[15] = 0x40 ^ 0x4A;
        d.var2[16] = 81 + 2 - 51 + 174 ^ 153 + 35 - 76 + 85;
        d.var2[17] = -1;
        d.var2[18] = 175 + 69 - 178 + 122 ^ 37 + 165 - 50 + 24;
        d.var2[19] = 0x78 ^ 0x75;
        d.var2[20] = -(0xFFFFF67F & 0x6B89) & (0xFFFFFFFF & 0x7F7E);
        d.var2[21] = 0xA8 ^ 0x8D ^ (0x5E ^ 0x75);
        d.var2[22] = 75 + 33 - -56 + 6 ^ 100 + 139 - 92 + 18;
        d.var2[23] = 0x59 ^ 0x7B ^ (0x94 ^ 0xA6);
    }

    static {
        d.var9();
        d.var10();
        LEATHER_BOOTS = new GameEnum4(var1[var2[1]], var2[2]);
        ADAMANT_KITESHIELD = new GameEnum4(var1[var2[4]], var2[5]);
        ADAMANT_MED_HELM = new GameEnum4(var1[var2[7]], var2[8]);
        EMERALD = new GameEnum4(var1[var2[10]], var2[11]);
        RUNE_LONGSWORD = new GameEnum4(var1[var2[13]], var2[14]);
        EMPTY = new GameEnum4(var1[var2[16]], var2[17]);
        POSSIBLY_EMPTY = new GameEnum4(var1[var2[19]], var2[20]);
        UNKNOWN = new GameEnum4(var1[var2[22]], var2[20]);
        d[] dArray = new d[var2[12]];
        dArray[d.var2[0]] = LEATHER_BOOTS;
        dArray[d.var2[1]] = ADAMANT_KITESHIELD;
        dArray[d.var2[3]] = ADAMANT_MED_HELM;
        dArray[d.var2[4]] = EMERALD;
        dArray[d.var2[6]] = RUNE_LONGSWORD;
        dArray[d.var2[7]] = EMPTY;
        dArray[d.var2[9]] = POSSIBLY_EMPTY;
        dArray[d.var2[10]] = UNKNOWN;
        $VALUES = dArray;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public String j() {
        return this.name;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (d.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    /*
     * WARNING - void declaration
     */
    public static d a(String string) {
        void var22;
        d[] dArray = d.values();
        int n2 = dArray.length;
        int var23 = var2[0];
        while (d.var20(var23, (int)var22)) {
            String var24;
            void var25;
            void var26 = var25[var23];
            if (d.var27(var24.toLowerCase().contains(var26.name.toLowerCase()) ? 1 : 0)) {
                return var26;
            }
            ++var23;
            0;
            if (((0x7C ^ 0x61 ^ (0x31 ^ 0x78)) & (49 + 13 - -63 + 71 ^ 143 + 134 - 221 + 88 ^ -1)) <= (0x92 ^ 0xBE ^ (0xA7 ^ 0x8F))) continue;
            return null;
        }
        return null;
    }

    private static boolean var27(int n2) {
        return n2 != 0;
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    private static void var10() {
        var1 = new String[var2[23]];
        d.var1[d.var2[0]] = "LEATHER_BOOTS";
        d.var1[d.var2[1]] = "Leather Boots";
        d.var1[d.var2[3]] = "ADAMANT_KITESHIELD";
        d.var1[d.var2[4]] = "Adamant Kiteshield";
        d.var1[d.var2[6]] = "ADAMANT_MED_HELM";
        d.var1[d.var2[7]] = "Helm";
        d.var1[d.var2[9]] = "EMERALD";
        d.var1[d.var2[10]] = "Emerald";
        d.var1[d.var2[12]] = "RUNE_LONGSWORD";
        d.var1[d.var2[13]] = "Rune Longsword";
        d.var1[d.var2[15]] = "EMPTY";
        d.var1[d.var2[16]] = d.var3("YSXflEoZ8Qw=", "EVypK");
        d.var1[d.var2[18]] = "POSSIBLY_EMPTY";
        d.var1[d.var2[19]] = d.var3("7PTaSKWPx0c=", "wtsUT");
        d.var1[d.var2[21]] = "UNKNOWN";
        d.var1[d.var2[22]] = "Unknown";
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

        catch (Exception var33) {
            var33.printStackTrace();
            return null;
        }
    }
}

