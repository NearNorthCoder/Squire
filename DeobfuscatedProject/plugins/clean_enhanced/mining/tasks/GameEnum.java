/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.mining.tasks;

public final class GameEnum
extends Enum<b> {
    
    private static final  b[] $VALUES;
    
    public static final  /* enum */ b JAVELIN_HEADS;
    public static final  /* enum */ b ARROW_TIPS;
    public static final  /* enum */ b DISABLE;
    public static final  /* enum */ b DART_TIPS;
    public static final  /* enum */ b BOLT_TIPS;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        b.var9();
        b.var10();
        BOLT_TIPS = new GameEnum();
        ARROW_TIPS = new GameEnum();
        JAVELIN_HEADS = new GameEnum();
        DART_TIPS = new GameEnum();
        DISABLE = new GameEnum();
        b[] bArray = new b[var2[5]];
        bArray[b.var2[0]] = BOLT_TIPS;
        bArray[b.var2[1]] = ARROW_TIPS;
        bArray[b.var2[2]] = JAVELIN_HEADS;
        bArray[b.var2[3]] = DART_TIPS;
        bArray[b.var2[4]] = DISABLE;
        $VALUES = bArray;
    }

    public static b[] values() {
        return (b[])$VALUES.clone();
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var2 = new int[7];
        b.var2[0] = (0xAB ^ 0xB9) & ~(0x15 ^ 7);
        b.var2[1] = 1;
        b.var2[2] = 2;
        b.var2[3] = 3;
        b.var2[4] = 0x5C ^ 0x58;
        b.var2[5] = 3 ^ (0xC3 ^ 0xC5);
        b.var2[6] = 0x6E ^ 0x66;
    }

    public static b valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    private static void var10() {
        var1 = new String[var2[5]];
        b.var1[b.var2[0]] = "BOLT_TIPS";
        b.var1[b.var2[1]] = "ARROW_TIPS";
        b.var1[b.var2[2]] = "JAVELIN_HEADS";
        b.var1[b.var2[3]] = "DART_TIPS";
        b.var1[b.var2[4]] = "DISABLE";
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[0];
        while (b.var11(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var21);
    }
}

