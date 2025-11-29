/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.skilling.tasks;

public final class GameEnum9
extends Enum<s> {
    private static final  s[] $VALUES;
    
    public static final  /* enum */ s SERUMS;
    public static final  /* enum */ s COMPOST;

    private static void var3() {
        var2 = new int[4];
        s.var2[0] = (0xA8 ^ 0xB6 ^ (0x1F ^ 0x10)) & (0x99 ^ 0xA7 ^ (0x41 ^ 0x6E) ^ -1);
        s.var2[1] = 1;
        s.var2[2] = 2;
        s.var2[3] = 0x78 ^ 0x67 ^ (0xA ^ 0x1D);
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    public static s valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[0];
        while (s.var4(var13, var12)) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((2 & ~2) <= (0x6A ^ 0x6E)) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static void var15() {
        var1 = new String[var2[2]];
        s.var1[s.var2[0]] = "SERUMS";
        s.var1[s.var2[1]] = "COMPOST";
    }

    public static s[] values() {
        return (s[])$VALUES.clone();
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    static {
        s.var3();
        s.var15();
        SERUMS = new GameEnum9();
        COMPOST = new GameEnum9();
        s[] sArray = new s[var2[2]];
        sArray[s.var2[0]] = SERUMS;
        sArray[s.var2[1]] = COMPOST;
        $VALUES = sArray;
    }
}

