/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.autotoa.tasks;

public final class GameEnum7
extends Enum<g> {
    private static final  g[] $VALUES;
    public static final  /* enum */ g MAGE;
    public static final  /* enum */ g RANGE_1;
    
    public static final  /* enum */ g MELEE_1;
    public static final  /* enum */ g NONE;
    
    public static final  /* enum */ g MELEE_2;
    public static final  /* enum */ g RANGE_2;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum7.class, string);
    }

    static {
        g.var9();
        g.var10();
        NONE = new GameEnum7();
        MELEE_1 = new GameEnum7();
        MELEE_2 = new GameEnum7();
        RANGE_1 = new GameEnum7();
        RANGE_2 = new GameEnum7();
        MAGE = new GameEnum7();
        g[] gArray = new g[var1[6]];
        gArray[g.var1[0]] = NONE;
        gArray[g.var1[1]] = MELEE_1;
        gArray[g.var1[2]] = MELEE_2;
        gArray[g.var1[3]] = RANGE_1;
        gArray[g.var1[4]] = RANGE_2;
        gArray[g.var1[5]] = MAGE;
        $VALUES = gArray;
    }

    private static void var10() {
        var2 = new String[var1[6]];
        g.var2[g.var1[0]] = "NONE";
        g.var2[g.var1[1]] = "MELEE_1";
        g.var2[g.var1[2]] = "MELEE_2";
        g.var2[g.var1[3]] = "RANGE_1";
        g.var2[g.var1[4]] = "RANGE_2";
        g.var2[g.var1[5]] = "MAGE";
    }

    private static String var11(String var12, String var13) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var15 = var13.toCharArray();
        int var16 = var1[0];
        char[] var17 = var12.toCharArray();
        int var18 = var17.length;
        int var19 = var1[0];
        while (g.var20(var19, var18)) {
            char var21 = var17[var19];
            var14.append((char)(var21 ^ var15[var16 % var15.length]));
            0;
            ++var16;
            ++var19;
            0;
            
            return null;
        }
        return String.valueOf(var14);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var20(int n2, int n3) {
        return n2 < n3;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static void var9() {
        var1 = new int[8];
        g.var1[0] = (0x12 ^ 0xA) & ~(0x85 ^ 0x9D);
        g.var1[1] = 1;
        g.var1[2] = 2;
        g.var1[3] = 3;
        g.var1[4] = 0x94 ^ 0x90;
        g.var1[5] = 0x7F ^ 0x7A;
        g.var1[6] = 0xC ^ 0xA;
        g.var1[7] = 62 + 25 - 6 + 46 ^ (0xD4 ^ 0xA3);
    }
}

