/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum26
extends Enum<C> {
    public static final  /* enum */ C STATUE_BLUE_STRICT;
    public static final  /* enum */ C STATUE_BLUE_I;
    
    public static final  /* enum */ C STATUE_BLUE_SHORT;
    public static final  /* enum */ C STATUE_BLUE_II;
    public static final  /* enum */ C STATUE_SHORT;
    
    private static final  C[] $VALUES;
    public static final  /* enum */ C STATUE_BLUE_III;
    public static final  /* enum */ C STATUE_4;
    public static final  /* enum */ C STATUE_STRICT;
    public static final  /* enum */ C STATUE_GOLD_SHORT;
    public static final  /* enum */ C STATUE_GOLD_6;
    public static final  /* enum */ C STATUE;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static C[] values() {
        return (C[])$VALUES.clone();
    }

    static {
        C.var9();
        C.var10();
        STATUE = new GameEnum26();
        STATUE_SHORT = new GameEnum26();
        STATUE_4 = new GameEnum26();
        STATUE_GOLD_SHORT = new GameEnum26();
        STATUE_GOLD_6 = new GameEnum26();
        STATUE_STRICT = new GameEnum26();
        STATUE_BLUE_STRICT = new GameEnum26();
        STATUE_BLUE_SHORT = new GameEnum26();
        STATUE_BLUE_I = new GameEnum26();
        STATUE_BLUE_II = new GameEnum26();
        STATUE_BLUE_III = new GameEnum26();
        C[] cArray = new C[var1[11]];
        cArray[C.var1[0]] = STATUE;
        cArray[C.var1[1]] = STATUE_SHORT;
        cArray[C.var1[2]] = STATUE_4;
        cArray[C.var1[3]] = STATUE_GOLD_SHORT;
        cArray[C.var1[4]] = STATUE_GOLD_6;
        cArray[C.var1[5]] = STATUE_STRICT;
        cArray[C.var1[6]] = STATUE_BLUE_STRICT;
        cArray[C.var1[7]] = STATUE_BLUE_SHORT;
        cArray[C.var1[8]] = STATUE_BLUE_I;
        cArray[C.var1[9]] = STATUE_BLUE_II;
        cArray[C.var1[10]] = STATUE_BLUE_III;
        $VALUES = cArray;
    }

    private static void var9() {
        var1 = new int[12];
        C.var1[0] = ((0x63 ^ 0x52) & ~(0x21 ^ 0x10) ^ (0xA ^ 0x4A)) & (0xA0 ^ 0x8B ^ (0xD8 ^ 0xB3) ^ -1);
        C.var1[1] = 1;
        C.var1[2] = 2;
        C.var1[3] = 3;
        C.var1[4] = 0xE1 ^ 0x94 ^ (0x17 ^ 0x66);
        C.var1[5] = 0xB9 ^ 0xBC;
        C.var1[6] = 0x8F ^ 0x89;
        C.var1[7] = 0xFF ^ 0x98 ^ (0x5E ^ 0x3E);
        C.var1[8] = 0xE3 ^ 0x93 ^ (0xBA ^ 0xC2);
        C.var1[9] = 0x1B ^ 0x12;
        C.var1[10] = 0x15 ^ 0x1F;
        C.var1[11] = 0x5C ^ 0x57;
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (C.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((0xF1 ^ 0xB4 ^ (0x2E ^ 0x6F)) == (0x1F ^ 0x54 ^ (0x67 ^ 0x28))) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    public static C valueOf(String string) {
        return Enum.valueOf(GameEnum26.class, string);
    }

    private static void var10() {
        var2 = new String[var1[11]];
        C.var2[C.var1[0]] = "STATUE";
        C.var2[C.var1[1]] = "STATUE_SHORT";
        C.var2[C.var1[2]] = "STATUE_4";
        C.var2[C.var1[3]] = "STATUE_GOLD_SHORT";
        C.var2[C.var1[4]] = "STATUE_GOLD_6";
        C.var2[C.var1[5]] = "STATUE_STRICT";
        C.var2[C.var1[6]] = "STATUE_BLUE_STRICT";
        C.var2[C.var1[7]] = "STATUE_BLUE_SHORT";
        C.var2[C.var1[8]] = "STATUE_BLUE_I";
        C.var2[C.var1[9]] = "STATUE_BLUE_II";
        C.var2[C.var1[10]] = "STATUE_BLUE_III";
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

