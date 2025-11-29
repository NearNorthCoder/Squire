/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum17
extends Enum<p> {
    public static final  /* enum */ p REDWOOD;
    public static final  /* enum */ p MAGIC;
    public static final  /* enum */ p MAPLE;
    private static final  p[] $VALUES;
    private final  int logId;

    public static final  /* enum */ p WILLOW;
    public static final  /* enum */ p NORMAL;
    public static final  /* enum */ p OAK;
    public static final  /* enum */ p YEW;

    public static p valueOf(String string) {
        return Enum.valueOf(GameEnum17.class, string);
    }

    static {
        p.var3();
        p.var4();
        NORMAL = new GameEnum17(var1[1]);
        OAK = new GameEnum17(var1[3]);
        WILLOW = new GameEnum17(var1[5]);
        MAPLE = new GameEnum17(var1[7]);
        YEW = new GameEnum17(var1[9]);
        MAGIC = new GameEnum17(var1[11]);
        REDWOOD = new GameEnum17(var1[13]);
        p[] pArray = new p[var1[14]];
        pArray[p.var1[0]] = NORMAL;
        pArray[p.var1[2]] = OAK;
        pArray[p.var1[4]] = WILLOW;
        pArray[p.var1[6]] = MAPLE;
        pArray[p.var1[8]] = YEW;
        pArray[p.var1[10]] = MAGIC;
        pArray[p.var1[12]] = REDWOOD;
        $VALUES = pArray;
    }

    public int M() {
        return this.logId;
    }

    private static void var4() {
        var2 = new String[var1[14]];
        p.var2[p.var1[0]] = "NORMAL";
        p.var2[p.var1[2]] = "OAK";
        p.var2[p.var1[4]] = "WILLOW";
        p.var2[p.var1[6]] = "MAPLE";
        p.var2[p.var1[8]] = "YEW";
        p.var2[p.var1[10]] = "MAGIC";
        p.var2[p.var1[12]] = "REDWOOD";
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (p.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (2 != -1) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private GameEnum17(int n3) {
        this.logId = n3;
    }

    private static void var3() {
        var1 = new int[16];
        p.var1[0] = (9 + 0 - -6 + 225 ^ 160 + 113 - 101 + 5) & (0xD9 ^ 0xC0 ^ (0x16 ^ 0x4E) ^ -1);
        p.var1[1] = -(0xFFFFE2DD & 0x7F2B) & (0xFFFFFFFF & 0x67EF);
        p.var1[2] = 1;
        p.var1[3] = -(0xFFFFF3CF & 0x2E3F) & (0xFFFFA7FF & Short.MAX_VALUE);
        p.var1[4] = 2;
        p.var1[5] = 0xFFFFFFEF & 0x5FF;
        p.var1[6] = 3;
        p.var1[7] = 0xFFFFF7EF & 0xDFD;
        p.var1[8] = 138 + 70 - 106 + 66 ^ 12 + 84 - -34 + 42;
        p.var1[9] = 0xFFFF9FFB & 0x65EF;
        p.var1[10] = 0x76 ^ 0x6C ^ (0x41 ^ 0x5E);
        p.var1[11] = 0xFFFFBFFD & 0x45EB;
        p.var1[12] = 37 + 65 - 82 + 149 ^ 51 + 152 - 68 + 40;
        p.var1[13] = -(0xFFFFB5CB & 0x7B3F) & (0xFFFFFFDF & 0x7DFF);
        p.var1[14] = 2 + 22 - -40 + 95 ^ 5 + 95 - 83 + 135;
        p.var1[15] = 50 + 35 - 39 + 94 ^ 55 + 100 - 72 + 49;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }
}

