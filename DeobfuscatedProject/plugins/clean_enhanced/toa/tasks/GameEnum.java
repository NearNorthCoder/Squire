/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.toa.tasks;

public final class GameEnum
extends Enum<n> {
    public static final  /* enum */ n NORMAL;
    
    private static final  n[] $VALUES;
    public static final  /* enum */ n FLICK;
    public static final  /* enum */ n NONE;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (n.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void var14() {
        var1 = new int[4];
        n.var1[0] = (0xA8 ^ 0xA2 ^ (0x2E ^ 0x2A)) & (75 + 134 - 164 + 133 ^ 43 + 80 - -25 + 40 ^ -1);
        n.var1[1] = 1;
        n.var1[2] = 2;
        n.var1[3] = 3;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public static n[] values() {
        return (n[])$VALUES.clone();
    }

    public static n valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    static {
        n.var14();
        n.var15();
        NONE = new GameEnum();
        NORMAL = new GameEnum();
        FLICK = new GameEnum();
        n[] nArray = new n[var1[3]];
        nArray[n.var1[0]] = NONE;
        nArray[n.var1[1]] = NORMAL;
        nArray[n.var1[2]] = FLICK;
        $VALUES = nArray;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var15() {
        var2 = new String[var1[3]];
        n.var2[n.var1[0]] = "NONE";
        n.var2[n.var1[1]] = "NORMAL";
        n.var2[n.var1[2]] = "FLICK";
    }
}

