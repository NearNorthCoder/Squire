/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.minigame.tasks;

public final class GameEnum3
extends Enum<d> {
    
    private static final  d[] $VALUES;
    
    public static final  /* enum */ d WEST;
    public static final  /* enum */ d SOUTH;
    public static final  /* enum */ d EAST;
     String direction;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (d.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0x1A ^ 3 ^ (0x6F ^ 0x79)) & (105 + 40 - -12 + 15 ^ 37 + 147 - 122 + 101 ^ -1)) < (61 + 105 - 131 + 114 ^ 132 + 95 - 192 + 110)) continue;
            return null;
        }
        return String.valueOf(var6);
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private GameEnum3(String string2) {
        this.direction = string2;
    }

    private static void var20() {
        var1 = new int[8];
        d.var1[0] = (0xBC ^ 0xAE ^ (0xC7 ^ 0x94)) & (0x43 ^ 0x78 ^ (0x59 ^ 0x23) ^ -1);
        d.var1[1] = 1;
        d.var1[2] = 2;
        d.var1[3] = 3;
        d.var1[4] = 0x49 ^ 0x4D;
        d.var1[5] = 0x24 ^ 0x48 ^ (0x11 ^ 0x78);
        d.var1[6] = 0x99 ^ 0x9F;
        d.var1[7] = 0x25 ^ 0x2D;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    static {
        d.var20();
        d.var21();
        EAST = new GameEnum3(var2[var1[1]]);
        WEST = new GameEnum3(var2[var1[3]]);
        SOUTH = new GameEnum3(var2[var1[5]]);
        d[] dArray = new d[var1[3]];
        dArray[d.var1[0]] = EAST;
        dArray[d.var1[1]] = WEST;
        dArray[d.var1[2]] = SOUTH;
        $VALUES = dArray;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

    private static void var21() {
        var2 = new String[var1[6]];
        d.var2[d.var1[0]] = "EAST";
        d.var2[d.var1[1]] = "East";
        d.var2[d.var1[2]] = "WEST";
        d.var2[d.var1[3]] = "West";
        d.var2[d.var1[4]] = "SOUTH";
        d.var2[d.var1[5]] = "South";
    }

    private static boolean var12(int n, int n2) {
        return n < n2;
    }

    public String n() {
        return this.direction;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }
}

