/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum27
extends Enum<p> {

    public static final  /* enum */ p FINAL;
    private static final  p[] $VALUES;

    public static p valueOf(String string) {
        return Enum.valueOf(GameEnum27.class, string);
    }

    static {
        p.var3();
        p.var4();
        FINAL = new GameEnum27();
        p[] pArray = new p[var2[1]];
        pArray[p.var2[0]] = FINAL;
        $VALUES = pArray;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static void var3() {
        var2 = new int[2];
        p.var2[0] = (0x61 ^ 0x68) & ~(0x19 ^ 0x10);
        p.var2[1] = 1;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (p.var5(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var9);
    }

    public static p[] values() {
        return (p[])$VALUES.clone();
    }

    private static void var4() {
        var1 = new String[var2[1]];
        p.var1[p.var2[0]] = "FINAL";
    }
}

