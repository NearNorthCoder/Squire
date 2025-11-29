/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mixology.tasks;

public final class GameEnum7
extends Enum<f> {
    private static final  f[] $VALUES;
    public static final  /* enum */ f SINGLE_ORDER;
    
    public static final  /* enum */ f MULTI_ORDER;

    public static f valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    public static f[] values() {
        return (f[])$VALUES.clone();
    }

    private static void var3() {
        var1 = new String[var2[2]];
        f.var1[f.var2[0]] = "SINGLE_ORDER";
        f.var1[f.var2[1]] = "MULTI_ORDER";
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
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
        int var16 = var2[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var2[0];
        while (f.var4(var19, var18)) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static void var21() {
        var2 = new int[4];
        f.var2[0] = (0xF6 ^ 0xBE ^ (0xE0 ^ 0x89)) & (0xAD ^ 0x84 ^ (0x8F ^ 0x87) ^ -1);
        f.var2[1] = 1;
        f.var2[2] = 2;
        f.var2[3] = 0x30 ^ 0x38;
    }

    static {
        f.var21();
        f.var3();
        SINGLE_ORDER = new GameEnum7();
        MULTI_ORDER = new GameEnum7();
        f[] fArray = new f[var2[2]];
        fArray[f.var2[0]] = SINGLE_ORDER;
        fArray[f.var2[1]] = MULTI_ORDER;
        $VALUES = fArray;
    }
}

