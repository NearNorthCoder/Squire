/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum8
extends Enum<j> {
    public static final  /* enum */ j BRONZE;
    public static final  /* enum */ j IRON;
    public static final  /* enum */ j DRAGON;
    public static final  /* enum */ j AMETHYST;
    private final  int dartTipId;
    public static final  /* enum */ j ADAMANT;
    private static final  j[] $VALUES;
    public static final  /* enum */ j STEEL;
    
    public static final  /* enum */ j RUNE;
    
    public static final  /* enum */ j MITHRIL;

    private static void var3() {
        var1 = new int[17];
        j.var1[0] = (0x20 ^ 0x3E) & ~(0x8B ^ 0x95);
        j.var1[1] = -(106 + 9 - 91 + 109) & (0xFFFFFFFF & 0x3B7);
        j.var1[2] = 1;
        j.var1[3] = 0xFFFFA375 & 0x5FBE;
        j.var1[4] = 2;
        j.var1[5] = 0xFFFFCB7F & 0x37B5;
        j.var1[6] = 3;
        j.var1[7] = 0xFFFFCF7E & 0x33B7;
        j.var1[8] = 0x8C ^ 0x88;
        j.var1[9] = 0xFFFFCFBF & 0x3377;
        j.var1[10] = 0 ^ 0x70 ^ (0x12 ^ 0x67);
        j.var1[11] = -(0xFFFFF7F9 & 0x1CC7) & (0xFFFFBFFE & 0x57F9);
        j.var1[12] = 18 + 111 - 106 + 135 ^ 57 + 0 - -72 + 23;
        j.var1[13] = 0xFFFFFFFD & 0x64FF;
        j.var1[14] = 0x77 ^ 0x70;
        j.var1[15] = 0xFFFFAFF5 & 0x7BEA;
        j.var1[16] = 0xDF ^ 0xA9 ^ (0x63 ^ 0x1D);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    private static void var4() {
        var2 = new String[var1[16]];
        j.var2[j.var1[0]] = "BRONZE";
        j.var2[j.var1[2]] = "IRON";
        j.var2[j.var1[4]] = "STEEL";
        j.var2[j.var1[6]] = "MITHRIL";
        j.var2[j.var1[8]] = "ADAMANT";
        j.var2[j.var1[10]] = "RUNE";
        j.var2[j.var1[12]] = "AMETHYST";
        j.var2[j.var1[14]] = "DRAGON";
    }

    public int D() {
        return this.dartTipId;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var1[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var1[0];
        while (j.var5(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (((0xBF ^ 0xB5) & ~(0x39 ^ 0x33)) < 1) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    static {
        j.var3();
        j.var4();
        BRONZE = new GameEnum8(var1[1]);
        IRON = new GameEnum8(var1[3]);
        STEEL = new GameEnum8(var1[5]);
        MITHRIL = new GameEnum8(var1[7]);
        ADAMANT = new GameEnum8(var1[9]);
        RUNE = new GameEnum8(var1[11]);
        AMETHYST = new GameEnum8(var1[13]);
        DRAGON = new GameEnum8(var1[15]);
        j[] jArray = new j[var1[16]];
        jArray[j.var1[0]] = BRONZE;
        jArray[j.var1[2]] = IRON;
        jArray[j.var1[4]] = STEEL;
        jArray[j.var1[6]] = MITHRIL;
        jArray[j.var1[8]] = ADAMANT;
        jArray[j.var1[10]] = RUNE;
        jArray[j.var1[12]] = AMETHYST;
        jArray[j.var1[14]] = DRAGON;
        $VALUES = jArray;
    }

    private GameEnum8(int n3) {
        this.dartTipId = n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

