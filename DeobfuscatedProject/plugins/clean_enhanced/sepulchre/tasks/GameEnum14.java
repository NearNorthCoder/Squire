/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum14
extends Enum<j> {
    public static final  /* enum */ j EAST;
    
    public static final  /* enum */ j NORTH;
    public static final  /* enum */ j SOUTH;
    
    public static final  /* enum */ j WEST;
    private static final  j[] $VALUES;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void var9() {
        var1 = new int[6];
        j.var1[0] = 3 & ~3;
        j.var1[1] = 1;
        j.var1[2] = 2;
        j.var1[3] = 3;
        j.var1[4] = 0x69 ^ 0x6D;
        j.var1[5] = 0xEF ^ 0xC1 ^ (0x58 ^ 0x7E);
    }

    public static j[] values() {
        return (j[])$VALUES.clone();
    }

    public static j valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    private static void var10() {
        var2 = new String[var1[4]];
        j.var2[j.var1[0]] = "NORTH";
        j.var2[j.var1[1]] = "SOUTH";
        j.var2[j.var1[2]] = "WEST";
        j.var2[j.var1[3]] = "EAST";
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[0];
        while (j.var26(var25, var24)) {
            char var27 = var23[var25];
            var20.append((char)(var27 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (1 <= 1) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean var26(int n2, int n3) {
        return n2 < n3;
    }

    static {
        j.var9();
        j.var10();
        NORTH = new GameEnum14();
        SOUTH = new GameEnum14();
        WEST = new GameEnum14();
        EAST = new GameEnum14();
        j[] jArray = new j[var1[4]];
        jArray[j.var1[0]] = NORTH;
        jArray[j.var1[1]] = SOUTH;
        jArray[j.var1[2]] = WEST;
        jArray[j.var1[3]] = EAST;
        $VALUES = jArray;
    }
}

