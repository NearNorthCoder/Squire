/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum19
extends Enum<L> {
    public static final  /* enum */ L WALK;

    private static final  L[] $VALUES;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    static {
        L.var4();
        L.var5();
        WALK = new GameEnum19();
        L[] lArray = new L[var2[1]];
        lArray[L.var2[0]] = WALK;
        $VALUES = lArray;
    }

    public static L[] values() {
        return (L[])$VALUES.clone();
    }

    private static void var4() {
        var2 = new int[2];
        L.var2[0] = (0x40 ^ 7) & ~(0x27 ^ 0x60);
        L.var2[1] = 1;
    }

    private static void var5() {
        var1 = new String[var2[1]];
        L.var1[L.var2[0]] = "WALK";
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (L.var3(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    public static L valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }
}

