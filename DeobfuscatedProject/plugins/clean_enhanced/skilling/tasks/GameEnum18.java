/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum18
extends Enum<h> {
    public static final  /* enum */ h YEW_LONGBOW;
    public static final  /* enum */ h YEW_SHORTBOW;
    public static final  /* enum */ h WILLOW_LONGBOW;
    public static final  /* enum */ h MAPLE_SHORTBOW;
    public static final  /* enum */ h MAPLE_LONGBOW;
    
    public static final  /* enum */ h MAGIC_SHORTBOW;
    public static final  /* enum */ h OAK_SHORTBOW;
    public static final  /* enum */ h OAK_LONGBOW;
    public static final  /* enum */ h SHORTBOW;
    public static final  /* enum */ h LONGBOW;
    private static final  h[] $VALUES;
    public static final  /* enum */ h WILLOW_SHORTBOW;
    
    private final  int materialID;
    public static final  /* enum */ h MAGIC_LONGBOW;

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum18.class, string);
    }

    private GameEnum18(int n3) {
        this.materialID = n3;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        h.var9();
        h.var10();
        SHORTBOW = new GameEnum18(var2[1]);
        LONGBOW = new GameEnum18(var2[3]);
        OAK_SHORTBOW = new GameEnum18(var2[5]);
        OAK_LONGBOW = new GameEnum18(var2[7]);
        WILLOW_SHORTBOW = new GameEnum18(var2[9]);
        WILLOW_LONGBOW = new GameEnum18(var2[11]);
        MAPLE_SHORTBOW = new GameEnum18(var2[13]);
        MAPLE_LONGBOW = new GameEnum18(var2[15]);
        YEW_SHORTBOW = new GameEnum18(var2[17]);
        YEW_LONGBOW = new GameEnum18(var2[19]);
        MAGIC_SHORTBOW = new GameEnum18(var2[21]);
        MAGIC_LONGBOW = new GameEnum18(var2[23]);
        h[] hArray = new h[var2[24]];
        hArray[h.var2[0]] = SHORTBOW;
        hArray[h.var2[2]] = LONGBOW;
        hArray[h.var2[4]] = OAK_SHORTBOW;
        hArray[h.var2[6]] = OAK_LONGBOW;
        hArray[h.var2[8]] = WILLOW_SHORTBOW;
        hArray[h.var2[10]] = WILLOW_LONGBOW;
        hArray[h.var2[12]] = MAPLE_SHORTBOW;
        hArray[h.var2[14]] = MAPLE_LONGBOW;
        hArray[h.var2[16]] = YEW_SHORTBOW;
        hArray[h.var2[18]] = YEW_LONGBOW;
        hArray[h.var2[20]] = MAGIC_SHORTBOW;
        hArray[h.var2[22]] = MAGIC_LONGBOW;
        $VALUES = hArray;
    }

    private static void var10() {
        var1 = new String[var2[24]];
        h.var1[h.var2[0]] = "SHORTBOW";
        h.var1[h.var2[2]] = "LONGBOW";
        h.var1[h.var2[4]] = "OAK_SHORTBOW";
        h.var1[h.var2[6]] = "OAK_LONGBOW";
        h.var1[h.var2[8]] = "WILLOW_SHORTBOW";
        h.var1[h.var2[10]] = "WILLOW_LONGBOW";
        h.var1[h.var2[12]] = "MAPLE_SHORTBOW";
        h.var1[h.var2[14]] = "MAPLE_LONGBOW";
        h.var1[h.var2[16]] = "YEW_SHORTBOW";
        h.var1[h.var2[18]] = "YEW_LONGBOW";
        h.var1[h.var2[20]] = "MAGIC_SHORTBOW";
        h.var1[h.var2[22]] = "MAGIC_LONGBOW";
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
        while (h.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public int z() {
        return this.materialID;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var2 = new int[25];
        h.var2[0] = (153 + 181 - 225 + 96 ^ 26 + 40 - 51 + 130) & (30 + 157 - 1 + 10 ^ 129 + 26 - 99 + 96 ^ -1);
        h.var2[1] = 0x13 ^ 0x21;
        h.var2[2] = 1;
        h.var2[3] = 2 ^ (0x2B ^ 0x19);
        h.var2[4] = 2;
        h.var2[5] = 75 + 91 - 94 + 86 ^ 39 + 19 - 23 + 133;
        h.var2[6] = 3;
        h.var2[7] = 0x2C ^ 0x14;
        h.var2[8] = 0x25 ^ 0x70 ^ (0x32 ^ 0x63);
        h.var2[9] = 0x62 ^ 0x67 ^ (0x7B ^ 0x42);
        h.var2[10] = 0xD2 ^ 0x80 ^ (0x5D ^ 0xA);
        h.var2[11] = 0xF8 ^ 0xC2;
        h.var2[12] = 57 + 59 - 53 + 126 ^ 147 + 32 - 127 + 135;
        h.var2[13] = 9 ^ 0x50 ^ (0x69 ^ 0x70);
        h.var2[14] = 0x32 ^ 0x1F ^ (0x40 ^ 0x6A);
        h.var2[15] = 0xBF ^ 0x81;
        h.var2[16] = 0x86 ^ 0x8E;
        h.var2[17] = 9 ^ 0x4D;
        h.var2[18] = 0x78 ^ 0x3E ^ (0xC6 ^ 0x89);
        h.var2[19] = 0xDB ^ 0x8B ^ (0xB2 ^ 0xA0);
        h.var2[20] = 0xBF ^ 0xB5;
        h.var2[21] = 0xF3 ^ 0xBB;
        h.var2[22] = 88 + 34 - 114 + 158 ^ 118 + 58 - 64 + 61;
        h.var2[23] = 0x80 ^ 0xC6;
        h.var2[24] = 0x69 ^ 0x54 ^ (0x42 ^ 0x73);
    }
}

