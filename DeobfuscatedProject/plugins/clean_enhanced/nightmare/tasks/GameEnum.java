/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

final class GameEnum
extends Enum<av> {
    public static final  /* enum */ av WEST;

    public static final  /* enum */ av NORTH;
    private static final  av[] $VALUES;
    public static final  /* enum */ av EAST;
    public static final  /* enum */ av SOUTH;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static av valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    public static av[] values() {
        return (av[])$VALUES.clone();
    }

        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    static {
        av.var15();
        av.var16();
        NORTH = new GameEnum();
        SOUTH = new GameEnum();
        EAST = new GameEnum();
        WEST = new GameEnum();
        av[] avArray = new av[var1[4]];
        avArray[av.var1[0]] = NORTH;
        avArray[av.var1[1]] = SOUTH;
        avArray[av.var1[2]] = EAST;
        avArray[av.var1[3]] = WEST;
        $VALUES = avArray;
    }

    private static void var15() {
        var1 = new int[6];
        av.var1[0] = (0xC5 ^ 0x8B) & ~(0xE7 ^ 0xA9);
        av.var1[1] = 1;
        av.var1[2] = 2;
        av.var1[3] = 3;
        av.var1[4] = 93 + 138 - 173 + 98 ^ 90 + 15 - -22 + 25;
        av.var1[5] = 0x71 ^ 0x79 ^ (0x10 ^ 0x1C) & ~(0xB0 ^ 0xBC);
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[0];
        while (av.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (1 == 1) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static void var16() {
        var2 = new String[var1[4]];
        av.var2[av.var1[0]] = "NORTH";
        av.var2[av.var1[1]] = "SOUTH";
        av.var2[av.var1[2]] = "EAST";
        av.var2[av.var1[3]] = "WEST";
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }
}

