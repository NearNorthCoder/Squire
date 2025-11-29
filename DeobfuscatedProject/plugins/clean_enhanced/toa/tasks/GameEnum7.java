/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.toa.tasks;

public final class GameEnum7
extends Enum<d> {
    private static final  d[] $VALUES;
    public static final  /* enum */ d SPECIAL_2;
    public static final  /* enum */ d SPECIAL_1;
    
    public static final  /* enum */ d NONE;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (d.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0x29 ^ 0x36) & ~(0xBD ^ 0xA2)) < (0x45 ^ 0x41)) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void var14() {
        var1 = new int[5];
        d.var1[0] = (0x63 ^ 0x7B) & ~(0x68 ^ 0x70);
        d.var1[1] = 1;
        d.var1[2] = 2;
        d.var1[3] = 3;
        d.var1[4] = 0x92 ^ 0x89 ^ (0xA7 ^ 0xB4);
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    private static void var15() {
        var2 = new String[var1[3]];
        d.var2[d.var1[0]] = "SPECIAL_1";
        d.var2[d.var1[1]] = "SPECIAL_2";
        d.var2[d.var1[2]] = "NONE";
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    static {
        d.var14();
        d.var15();
        SPECIAL_1 = new GameEnum7();
        SPECIAL_2 = new GameEnum7();
        NONE = new GameEnum7();
        d[] dArray = new d[var1[3]];
        dArray[d.var1[0]] = SPECIAL_1;
        dArray[d.var1[1]] = SPECIAL_2;
        dArray[d.var1[2]] = NONE;
        $VALUES = dArray;
    }
}

