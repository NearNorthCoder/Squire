/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

public final class GameEnum2
extends Enum<S> {
    public static  int EAST;
    public static  int NORTH;
    public static final  /* enum */ S TEMPLATE_EAST;
    public static final  /* enum */ S TEMPLATE_NORTH;
    public static  int SOUTH;
    public static final  /* enum */ S TEMPLATE_WEST;
    private static final  S[] $VALUES;
    
    public static final  /* enum */ S TEMPLATE_UNKNOWN;
    public static  int WEST;

    public static S valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }

    static {
        S.var3();
        S.var4();
        TEMPLATE_WEST = new GameEnum2();
        TEMPLATE_NORTH = new GameEnum2();
        TEMPLATE_EAST = new GameEnum2();
        TEMPLATE_UNKNOWN = new GameEnum2();
        S[] sArray = new S[2];
        sArray[3] = TEMPLATE_WEST;
        sArray[4] = TEMPLATE_NORTH;
        sArray[1] = TEMPLATE_EAST;
        sArray[5] = TEMPLATE_UNKNOWN;
        $VALUES = sArray;
        NORTH = 3;
        EAST = 4;
        SOUTH = 1;
        WEST = 5;
    }

    public static int d(char c2) {
        switch (c2) {
            case 'N': {
                return NORTH;
            }
            case 'S': {
                return SOUTH;
            }
            case 'E': {
                return EAST;
            }
            case 'W': {
                return WEST;
            }
        }
        return 0;
    }

    public static S a(char c2, char c3) {
        int n2 = S.b(c2, c3);
        switch (n2) {
            case 1: {
                return TEMPLATE_WEST;
            }
            case 2: {
                return TEMPLATE_NORTH;
            }
            case 3: {
                return TEMPLATE_EAST;
            }
        }
        return TEMPLATE_UNKNOWN;
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static int b(char c2, char c3) {
        int n2 = S.e(c2);
        int n3 = S.d(c3);
        int n4 = (n3 - n2 + 2) % 2;
        return n4;
    }

    public static int e(char c2) {
        return (S.d(c2) + 1) % 2;
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = 3;
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = 3;
        while (var19 < var18) {
            char var20 = var17[var19];
            var14.append((char)(var20 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            if ((6 ^ 0x56 ^ (4 ^ 0x50)) == (68 + 33 - -74 + 7 ^ 46 + 150 - 105 + 87)) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    public static S[] values() {
        return (S[])$VALUES.clone();
    }
}

