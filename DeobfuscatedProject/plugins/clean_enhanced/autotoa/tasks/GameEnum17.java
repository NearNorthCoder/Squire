/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

public final class GameEnum17
extends Enum<x> {
    public static final  /* enum */ x RANGE;
    public static final  /* enum */ x MAGE;
    private static final  x[] $VALUES;
    public static final  /* enum */ x MELEE;

    public static x[] values() {
        return (x[])$VALUES.clone();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new int[4];
        x.var1[0] = (0x26 ^ 0x19 ^ (0x8C ^ 0x99)) & ((0xBB ^ 0x81) & ~(0 ^ 0x3A) ^ (0x31 ^ 0x1B) ^ -1);
        x.var1[1] = 1;
        x.var1[2] = 2;
        x.var1[3] = 3;
    }

    static {
        x.var9();
        x.var10();
        RANGE = new GameEnum17();
        MAGE = new GameEnum17();
        MELEE = new GameEnum17();
        x[] xArray = new x[var1[3]];
        xArray[x.var1[0]] = RANGE;
        xArray[x.var1[1]] = MAGE;
        xArray[x.var1[2]] = MELEE;
        $VALUES = xArray;
    }

    private static void var10() {
        var2 = new String[var1[3]];
        x.var2[x.var1[0]] = "RANGE";
        x.var2[x.var1[1]] = "MAGE";
        x.var2[x.var1[2]] = "MELEE";
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (x.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static x valueOf(String string) {
        return Enum.valueOf(GameEnum17.class, string);
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }
}

