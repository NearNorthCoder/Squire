/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Prayer
 */
package gg.squire.autotoa.tasks;

import net.runelite.api.Prayer;

public final class GameEnum8
extends Enum<w> {
    private static final  w[] $VALUES;
    
    public static final  /* enum */ w EAGLE_EYE;
    
    public static final  /* enum */ w RIGOUR;
    private final  Prayer mapped;

    private static void var3() {
        var1 = new int[4];
        w.var1[0] = (0x16 ^ 0x32 ^ 2) & (0xC0 ^ 0x90 ^ (0x29 ^ 0x5F) ^ -1);
        w.var1[1] = 1;
        w.var1[2] = 2;
        w.var1[3] = 0xAC ^ 0xA4;
    }

    private GameEnum8(Prayer prayer) {
        this.mapped = prayer;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var1[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var1[0];
        while (w.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if ((0x41 ^ 0x17 ^ (0x1F ^ 0x4D)) != ((0x26 ^ 0x75 ^ (0x75 ^ 0x70)) & (0x8C ^ 0xC2 ^ (0x60 ^ 0x78) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    public Prayer ag() {
        return this.mapped;
    }

    public static w[] values() {
        return (w[])$VALUES.clone();
    }

    static {
        w.var3();
        w.var15();
        RIGOUR = new GameEnum8(Prayer.RIGOUR);
        EAGLE_EYE = new GameEnum8(Prayer.EAGLE_EYE);
        w[] wArray = new w[var1[2]];
        wArray[w.var1[0]] = RIGOUR;
        wArray[w.var1[1]] = EAGLE_EYE;
        $VALUES = wArray;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var15() {
        var2 = new String[var1[2]];
        w.var2[w.var1[0]] = "RIGOUR";
        w.var2[w.var1[1]] = "EAGLE_EYE";
    }

    public static w valueOf(String string) {
        return Enum.valueOf(GameEnum8.class, string);
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }
}

