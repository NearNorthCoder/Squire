/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.tithefarm.tasks;

import gg.squire.tithefarm.tasks.GameEnum;

public final class GameEnum6
extends Enum<h> {
    
    private static final  h[] $VALUES;
    
    private final  g[] patches;
    public static final  /* enum */ h ROTATION_25;

    private static void var3() {
        var2 = new int[26];
        h.var2[0] = (0x2D ^ 0x33) & ~(0x89 ^ 0x97);
        h.var2[1] = 0xA ^ 0x47 ^ (0x7E ^ 0x2A);
        h.var2[2] = 1;
        h.var2[3] = 2;
        h.var2[4] = 3;
        h.var2[5] = 0xB1 ^ 0x9E ^ (0x44 ^ 0x6F);
        h.var2[6] = 0x87 ^ 0xB8 ^ (3 ^ 0x39);
        h.var2[7] = 0x9B ^ 0x9D;
        h.var2[8] = 0x9F ^ 0x98;
        h.var2[9] = 3 ^ 0x6C ^ (0xD9 ^ 0xBE);
        h.var2[10] = 0xEC ^ 0xA1 ^ (0xD6 ^ 0x92);
        h.var2[11] = 0x2D ^ 0x27;
        h.var2[12] = 0x7E ^ 0x57 ^ (0xE3 ^ 0xC1);
        h.var2[13] = 0x2E ^ 0x22;
        h.var2[14] = 0x9D ^ 0x90;
        h.var2[15] = 0x25 ^ 0x2B;
        h.var2[16] = 0x95 ^ 0x9A;
        h.var2[17] = 0x23 ^ 0x33;
        h.var2[18] = 78 + 62 - 100 + 117 ^ 55 + 64 - 19 + 40;
        h.var2[19] = 0x24 ^ 0x36;
        h.var2[20] = 87 + 80 - 100 + 63 ^ 82 + 87 - 136 + 112;
        h.var2[21] = 0x7B ^ 0x6F;
        h.var2[22] = 31 + 37 - 5 + 81 ^ 35 + 101 - 97 + 94;
        h.var2[23] = 0xA ^ 0x1C;
        h.var2[24] = 0x4B ^ 0x5C;
        h.var2[25] = 0xA0 ^ 0xB8;
    }

    private static String var4(String var5, String var6) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var8 = var6.toCharArray();
        int var9 = var2[0];
        char[] var10 = var5.toCharArray();
        int var11 = var10.length;
        int var12 = var2[0];
        while (h.var13(var12, var11)) {
            char var14 = var10[var12];
            var7.append((char)(var14 ^ var8[var9 % var8.length]));
            0;
            ++var9;
            ++var12;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum6.class, string);
    }

    private GameEnum6(g ... gArray) {
        this.patches = gArray;
    }

    private static boolean var13(int n2, int n3) {
        return n2 < n3;
    }

    private static void var15() {
        var1 = new String[var2[2]];
        h.var1[h.var2[0]] = "ROTATION_25";
    }

    static {
        h.var3();
        h.var15();
        g[] gArray = new g[var2[1]];
        gArray[h.var2[0]] = g.PATCH_13_SOUTH;
        gArray[h.var2[2]] = g.PATCH_9;
        gArray[h.var2[3]] = g.PATCH_13;
        gArray[h.var2[4]] = g.PATCH_14;
        gArray[h.var2[5]] = g.PATCH_10;
        gArray[h.var2[6]] = g.PATCH_11;
        gArray[h.var2[7]] = g.PATCH_15;
        gArray[h.var2[8]] = g.PATCH_16;
        gArray[h.var2[9]] = g.PATCH_12;
        gArray[h.var2[10]] = g.PATCH_9_NORTH;
        gArray[h.var2[11]] = g.PATCH_13_NORTH;
        gArray[h.var2[12]] = g.PATCH_14_NORTH;
        gArray[h.var2[13]] = g.PATCH_10_NORTH;
        gArray[h.var2[14]] = g.PATCH_11_NORTH;
        gArray[h.var2[15]] = g.PATCH_15_NORTH;
        gArray[h.var2[16]] = g.PATCH_16_NORTH;
        gArray[h.var2[17]] = g.PATCH_12_NORTH;
        gArray[h.var2[18]] = g.PATCH_8_NORTH;
        gArray[h.var2[19]] = g.PATCH_7_NORTH;
        gArray[h.var2[20]] = g.PATCH_6_NORTH;
        gArray[h.var2[21]] = g.PATCH_5_NORTH;
        gArray[h.var2[22]] = g.PATCH_8;
        gArray[h.var2[23]] = g.PATCH_7;
        gArray[h.var2[24]] = g.PATCH_6;
        gArray[h.var2[25]] = g.PATCH_5;
        ROTATION_25 = new GameEnum6(gArray);
        h[] hArray = new h[var2[2]];
        hArray[h.var2[0]] = ROTATION_25;
        $VALUES = hArray;
    }

    public g[] o() {
        return this.patches;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }
}

