/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum23
extends Enum<m> {
    
    private static final  m[] $VALUES;
    public static final  /* enum */ m NORTH_BACK;

    private static void var3() {
        var1 = new String[var2[1]];
        m.var1[m.var2[0]] = "NORTH_BACK";
    }

    public static m valueOf(String string) {
        return Enum.valueOf(GameEnum23.class, string);
    }

    private static void var4() {
        var2 = new int[2];
        m.var2[0] = (101 + 65 - 88 + 143 ^ 77 + 108 - 49 + 12) & (6 ^ 0 ^ (0x6D ^ 0x22) ^ -1);
        m.var2[1] = 1;
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    public static m[] values() {
        return (m[])$VALUES.clone();
    }

    static {
        m.var4();
        m.var3();
        NORTH_BACK = new GameEnum23();
        m[] mArray = new m[var2[1]];
        mArray[m.var2[0]] = NORTH_BACK;
        $VALUES = mArray;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (m.var5(var14, var13)) {
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
}

