/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.sepulchre.tasks;

public final class GameEnum10
extends Enum<g> {
    private static final  g[] $VALUES;
    public static final  /* enum */ g BLADE;
    public static final  /* enum */ g GOLDEN_BLADE_II;
    public static final  /* enum */ g GOLDEN_BLADE_V;
    public static final  /* enum */ g BLADE_I;
    public static final  /* enum */ g BLADE_III;
    public static final  /* enum */ g BLADE_II;
    public static final  /* enum */ g BLUE_BLADE_II;
    public static final  /* enum */ g BLADE_IV;
    public static final  /* enum */ g GOLDEN_BLADE_III;
    public static final  /* enum */ g GOLDEN_BLADE_IV;
    public static final  /* enum */ g GOLDEN_BLADE_VI;
    
    public static final  /* enum */ g BLUE_BLADE_I;
    
    public static final  /* enum */ g GOLDEN_BLADE_I;

    static {
        g.var3();
        g.var4();
        BLADE = new GameEnum10();
        BLADE_I = new GameEnum10();
        BLADE_II = new GameEnum10();
        BLADE_III = new GameEnum10();
        BLADE_IV = new GameEnum10();
        GOLDEN_BLADE_II = new GameEnum10();
        GOLDEN_BLADE_I = new GameEnum10();
        GOLDEN_BLADE_III = new GameEnum10();
        GOLDEN_BLADE_IV = new GameEnum10();
        GOLDEN_BLADE_V = new GameEnum10();
        GOLDEN_BLADE_VI = new GameEnum10();
        BLUE_BLADE_I = new GameEnum10();
        BLUE_BLADE_II = new GameEnum10();
        g[] gArray = new g[var1[13]];
        gArray[g.var1[0]] = BLADE;
        gArray[g.var1[1]] = BLADE_I;
        gArray[g.var1[2]] = BLADE_II;
        gArray[g.var1[3]] = BLADE_III;
        gArray[g.var1[4]] = BLADE_IV;
        gArray[g.var1[5]] = GOLDEN_BLADE_II;
        gArray[g.var1[6]] = GOLDEN_BLADE_I;
        gArray[g.var1[7]] = GOLDEN_BLADE_III;
        gArray[g.var1[8]] = GOLDEN_BLADE_IV;
        gArray[g.var1[9]] = GOLDEN_BLADE_V;
        gArray[g.var1[10]] = GOLDEN_BLADE_VI;
        gArray[g.var1[11]] = BLUE_BLADE_I;
        gArray[g.var1[12]] = BLUE_BLADE_II;
        $VALUES = gArray;
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void var3() {
        var1 = new int[14];
        g.var1[0] = (0xAB ^ 0xB2 ^ (0x8A ^ 0xA1)) & (96 + 98 - 109 + 43 ^ 133 + 140 - 209 + 114 ^ -1);
        g.var1[1] = 1;
        g.var1[2] = 2;
        g.var1[3] = 3;
        g.var1[4] = 0x5D ^ 0x59;
        g.var1[5] = 0xB6 ^ 0xB3;
        g.var1[6] = 0x74 ^ 0x12 ^ (0x2D ^ 0x4D);
        g.var1[7] = 0x53 ^ 0x54;
        g.var1[8] = 0x12 ^ 0x1A;
        g.var1[9] = 0x51 ^ 0x1A ^ (0x41 ^ 3);
        g.var1[10] = 43 + 72 - 14 + 38 ^ 107 + 3 - 61 + 80;
        g.var1[11] = 0x64 ^ 0x75 ^ (0x72 ^ 0x68);
        g.var1[12] = 0x92 ^ 0x9E;
        g.var1[13] = 0x5D ^ 3 ^ (0x6E ^ 0x3D);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var1[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var1[0];
        while (g.var11(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static void var4() {
        var2 = new String[var1[13]];
        g.var2[g.var1[0]] = "BLADE";
        g.var2[g.var1[1]] = "BLADE_I";
        g.var2[g.var1[2]] = "BLADE_II";
        g.var2[g.var1[3]] = "BLADE_III";
        g.var2[g.var1[4]] = "BLADE_IV";
        g.var2[g.var1[5]] = "GOLDEN_BLADE_II";
        g.var2[g.var1[6]] = "GOLDEN_BLADE_I";
        g.var2[g.var1[7]] = "GOLDEN_BLADE_III";
        g.var2[g.var1[8]] = "GOLDEN_BLADE_IV";
        g.var2[g.var1[9]] = "GOLDEN_BLADE_V";
        g.var2[g.var1[10]] = "GOLDEN_BLADE_VI";
        g.var2[g.var1[11]] = "BLUE_BLADE_I";
        g.var2[g.var1[12]] = "BLUE_BLADE_II";
    }
}

