/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.hunter.tasks;

public final class GameEnum2
extends Enum<g> {

    public static final  /* enum */ g FULL;
    private static final  g[] $VALUES;
    public static final  /* enum */ g TRANSITION;
    public static final  /* enum */ g OPEN;
    public static final  /* enum */ g EMPTY;

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    static {
        g.var10();
        g.var11();
        OPEN = new GameEnum2();
        EMPTY = new GameEnum2();
        FULL = new GameEnum2();
        TRANSITION = new GameEnum2();
        g[] gArray = new g[var2[4]];
        gArray[g.var2[0]] = OPEN;
        gArray[g.var2[1]] = EMPTY;
        gArray[g.var2[2]] = FULL;
        gArray[g.var2[3]] = TRANSITION;
        $VALUES = gArray;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var2[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var2[0];
        while (g.var9(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-(0xC ^ 8) < 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void var11() {
        var1 = new String[var2[4]];
        g.var1[g.var2[0]] = "OPEN";
        g.var1[g.var2[1]] = "EMPTY";
        g.var1[g.var2[2]] = "FULL";
        g.var1[g.var2[3]] = "TRANSITION";
    }

    private static void var10() {
        var2 = new int[6];
        g.var2[0] = (0x60 ^ 0x75) & ~(9 ^ 0x1C);
        g.var2[1] = 1;
        g.var2[2] = 2;
        g.var2[3] = 3;
        g.var2[4] = 0x3C ^ 0x38;
        g.var2[5] = 50 + 37 - -70 + 5 ^ 27 + 106 - 3 + 40;
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum2.class, string);
    }
}

