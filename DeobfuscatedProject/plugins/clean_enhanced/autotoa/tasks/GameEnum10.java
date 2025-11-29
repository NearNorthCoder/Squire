/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

public final class GameEnum10
extends Enum<v> {
    public static final  /* enum */ v FLICK;

    private static final  v[] $VALUES;
    public static final  /* enum */ v NORMAL;
    public static final  /* enum */ v NONE;

    public static v valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var2[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var2[0];
        while (v.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((5 ^ 1) != 1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public static v[] values() {
        return (v[])$VALUES.clone();
    }

    static {
        v.var14();
        v.var15();
        NONE = new GameEnum10();
        NORMAL = new GameEnum10();
        FLICK = new GameEnum10();
        v[] vArray = new v[var2[3]];
        vArray[v.var2[0]] = NONE;
        vArray[v.var2[1]] = NORMAL;
        vArray[v.var2[2]] = FLICK;
        $VALUES = vArray;
    }

    private static void var14() {
        var2 = new int[4];
        v.var2[0] = (101 + 173 - 137 + 111 ^ 40 + 135 - 169 + 146) & (0x6B ^ 0x28 ^ (0x17 ^ 0x34) ^ -1);
        v.var2[1] = 1;
        v.var2[2] = 2;
        v.var2[3] = 3;
    }

    private static void var15() {
        var1 = new String[var2[3]];
        v.var1[v.var2[0]] = "NONE";
        v.var1[v.var2[1]] = "NORMAL";
        v.var1[v.var2[2]] = "FLICK";
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }
}

