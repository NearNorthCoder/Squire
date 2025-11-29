/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.runecrafting.tasks;

public final class GameEnum
extends Enum<b> {
    public static final  /* enum */ b OVERCHARGED;
    
    public static final  /* enum */ b STRONG;
    private static final  b[] $VALUES;
    public static final  /* enum */ b MEDIUM;
    public static final  /* enum */ b WEAK;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (-(6 ^ 0x40 ^ (0x42 ^ 0)) <= 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    static {
        b.var19();
        b.var20();
        WEAK = new GameEnum();
        MEDIUM = new GameEnum();
        STRONG = new GameEnum();
        OVERCHARGED = new GameEnum();
        b[] bArray = new b[4];
        bArray[0] = WEAK;
        bArray[1] = MEDIUM;
        bArray[2] = STRONG;
        bArray[3] = OVERCHARGED;
        $VALUES = bArray;
    }

    public String toString() {
        String string = super.toString();
        return string.charAt(0) + string.substring(1).toLowerCase();
    }

}

