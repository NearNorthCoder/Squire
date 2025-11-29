/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Prayer;

public final class GameEnum14
extends Enum<u> {
    private static final  u[] $VALUES;
    private final  Prayer mapped;
    
    public static final  /* enum */ u ULTIMATE_STRENGTH;
    
    public static final  /* enum */ u CHIVALRY;
    public static final  /* enum */ u PIETY;

    static {
        u.var3();
        u.var4();
        PIETY = new GameEnum14(Prayer.PIETY);
        CHIVALRY = new GameEnum14(Prayer.CHIVALRY);
        ULTIMATE_STRENGTH = new GameEnum14(Prayer.ULTIMATE_STRENGTH);
        u[] uArray = new u[var1[3]];
        uArray[u.var1[0]] = PIETY;
        uArray[u.var1[1]] = CHIVALRY;
        uArray[u.var1[2]] = ULTIMATE_STRENGTH;
        $VALUES = uArray;
    }

    private GameEnum14(Prayer prayer) {
        this.mapped = prayer;
    }

    public Prayer ag() {
        return this.mapped;
    }

    private static void var3() {
        var1 = new int[4];
        u.var1[0] = (10 + 88 - 42 + 127 ^ 126 + 19 - 127 + 118) & (0x4B ^ 0x40 ^ (0x74 ^ 0x40) ^ -1);
        u.var1[1] = 1;
        u.var1[2] = 2;
        u.var1[3] = 3;
    }

    public static u[] values() {
        return (u[])$VALUES.clone();
    }

        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean var11(int n2, int n3) {
        return n2 < n3;
    }

    public static u valueOf(String string) {
        return Enum.valueOf(GameEnum14.class, string);
    }

    private static void var4() {
        var2 = new String[var1[3]];
        u.var2[u.var1[0]] = "PIETY";
        u.var2[u.var1[1]] = "CHIVALRY";
        u.var2[u.var1[2]] = "ULTIMATE_STRENGTH";
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = var1[0];
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = var1[0];
        while (u.var11(var20, var19)) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }
}

