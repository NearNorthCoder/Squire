/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum5
extends Enum<o> {

    public static final  /* enum */ o SOUTH;
    private static final  o[] $VALUES;

    private static void var3() {
        var2 = new int[2];
        o.var2[0] = (0x3A ^ 0x5E ^ (0x20 ^ 0x48)) & (0x42 ^ 0x2C ^ (0x4A ^ 0x28) ^ -1);
        o.var2[1] = 1;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    static {
        o.var3();
        o.var5();
        SOUTH = new GameEnum5();
        o[] oArray = new o[var2[1]];
        oArray[o.var2[0]] = SOUTH;
        $VALUES = oArray;
    }

    private static void var5() {
        var1 = new String[var2[1]];
        o.var1[o.var2[0]] = "SOUTH";
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (o.var4(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }
}

