/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum9
extends Enum<k> {
    public static final  /* enum */ k NORTH;
    public static final  /* enum */ k SOUTH_BLADE;
    public static final  /* enum */ k EAST;
    public static final  /* enum */ k WEST;
    public static final  /* enum */ k SOUTH;
    
    private static final  k[] $VALUES;

    public static k valueOf(String string) {
        return Enum.valueOf(GameEnum9.class, string);
    }

    static {
        k.var3();
        k.var4();
        NORTH = new GameEnum9();
        SOUTH = new GameEnum9();
        WEST = new GameEnum9();
        EAST = new GameEnum9();
        SOUTH_BLADE = new GameEnum9();
        k[] kArray = new k[var2[5]];
        kArray[k.var2[0]] = NORTH;
        kArray[k.var2[1]] = SOUTH;
        kArray[k.var2[2]] = WEST;
        kArray[k.var2[3]] = EAST;
        kArray[k.var2[4]] = SOUTH_BLADE;
        $VALUES = kArray;
    }

    private static void var3() {
        var2 = new int[7];
        k.var2[0] = (155 + 13 - 135 + 182 ^ 57 + 155 - 141 + 87) & (0xB6 ^ 0x86 ^ (0x32 ^ 0x4B) ^ -1);
        k.var2[1] = 1;
        k.var2[2] = 2;
        k.var2[3] = 3;
        k.var2[4] = 0x1B ^ 0xD ^ (5 ^ 0x17);
        k.var2[5] = 0x29 ^ 0x2C;
        k.var2[6] = 0x7F ^ 0x24 ^ (0xE5 ^ 0xB6);
    }

    private static boolean var5(int n2, int n3) {
        return n2 < n3;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = var2[0];
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = var2[0];
        while (k.var5(var14, var13)) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if ((0x54 ^ 0x22 ^ (0xF3 ^ 0x81)) > ((0x89 ^ 0xB1 ^ 3) & (56 + 153 - 43 + 24 ^ 14 + 87 - 23 + 55 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var9);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var4() {
        var1 = new String[var2[5]];
        k.var1[k.var2[0]] = "NORTH";
        k.var1[k.var2[1]] = "SOUTH";
        k.var1[k.var2[2]] = "WEST";
        k.var1[k.var2[3]] = "EAST";
        k.var1[k.var2[4]] = "SOUTH_BLADE";
    }

    public static k[] values() {
        return (k[])$VALUES.clone();
    }
}

