/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.runecrafting.tasks;

public final class GameEnum2
extends Enum<c> {
    
    public static final  /* enum */ c OUTSIDE;
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c ACTIVE;
    public static final  /* enum */ c FINISHING;
    public static final  /* enum */ c COUNTDOWN;
    public static final  /* enum */ c ACTIVATING;

    private static boolean var3(int n2, int n3) {
        return n2 < n3;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (c.var3(var12, var11)) {
            char var13 = var10[var12];
            var7.append((char)(var13 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    static {
        c.var14();
        c.var15();
        ACTIVATING = new GameEnum2();
        COUNTDOWN = new GameEnum2();
        ACTIVE = new GameEnum2();
        FINISHING = new GameEnum2();
        OUTSIDE = new GameEnum2();
        c[] cArray = new c[var2[5]];
        cArray[c.var2[0]] = ACTIVATING;
        cArray[c.var2[1]] = COUNTDOWN;
        cArray[c.var2[2]] = ACTIVE;
        cArray[c.var2[3]] = FINISHING;
        cArray[c.var2[4]] = OUTSIDE;
        $VALUES = cArray;
    }

    private static void var14() {
        var2 = new int[6];
        c.var2[0] = (0x57 ^ 0x18) & ~(0x37 ^ 0x78);
        c.var2[1] = 1;
        c.var2[2] = 2;
        c.var2[3] = 3;
        c.var2[4] = 4 ^ 0x28 ^ (0x35 ^ 0x1D);
        c.var2[5] = 0xC0 ^ 0xC5;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(var2[0]) + string.substring(var2[1]).toLowerCase();
    }

    private static void var15() {
        var1 = new String[var2[5]];
        c.var1[c.var2[0]] = "ACTIVATING";
        c.var1[c.var2[1]] = "COUNTDOWN";
        c.var1[c.var2[2]] = "ACTIVE";
        c.var1[c.var2[3]] = "FINISHING";
        c.var1[c.var2[4]] = "OUTSIDE";
    }
}

