/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.tithefarm.tasks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import gg.squire.tithefarm.tasks.GameEnum;

public final class GameEnum19
extends Enum<h> {
    
    private static final  h[] $VALUES;
    
    private final  g[] patches;
    public static final  /* enum */ h ROTATION_25;

        return String.valueOf(var1);
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum19.class, string);
    }

    private GameEnum19(g ... gArray) {
        this.patches = gArray;
    }

    private static boolean lIllIllIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIllIlIllIII() {
        lIlIIIIIIllII = new String[lIlIIIIIIllIl[2]];
        h.lIlIIIIIIllII[h.lIlIIIIIIllIl[0]] = "ROTATION_25";
    }

    static {
        h.lIllIllIlIllIIl();
        h.lIllIllIlIllIII();
        g[] gArray = new g[lIlIIIIIIllIl[1]];
        gArray[h.lIlIIIIIIllIl[0]] = g.PATCH_13_SOUTH;
        gArray[h.lIlIIIIIIllIl[2]] = g.PATCH_9;
        gArray[h.lIlIIIIIIllIl[3]] = g.PATCH_13;
        gArray[h.lIlIIIIIIllIl[4]] = g.PATCH_14;
        gArray[h.lIlIIIIIIllIl[5]] = g.PATCH_10;
        gArray[h.lIlIIIIIIllIl[6]] = g.PATCH_11;
        gArray[h.lIlIIIIIIllIl[7]] = g.PATCH_15;
        gArray[h.lIlIIIIIIllIl[8]] = g.PATCH_16;
        gArray[h.lIlIIIIIIllIl[9]] = g.PATCH_12;
        gArray[h.lIlIIIIIIllIl[10]] = g.PATCH_9_NORTH;
        gArray[h.lIlIIIIIIllIl[11]] = g.PATCH_13_NORTH;
        gArray[h.lIlIIIIIIllIl[12]] = g.PATCH_14_NORTH;
        gArray[h.lIlIIIIIIllIl[13]] = g.PATCH_10_NORTH;
        gArray[h.lIlIIIIIIllIl[14]] = g.PATCH_11_NORTH;
        gArray[h.lIlIIIIIIllIl[15]] = g.PATCH_15_NORTH;
        gArray[h.lIlIIIIIIllIl[16]] = g.PATCH_16_NORTH;
        gArray[h.lIlIIIIIIllIl[17]] = g.PATCH_12_NORTH;
        gArray[h.lIlIIIIIIllIl[18]] = g.PATCH_8_NORTH;
        gArray[h.lIlIIIIIIllIl[19]] = g.PATCH_7_NORTH;
        gArray[h.lIlIIIIIIllIl[20]] = g.PATCH_6_NORTH;
        gArray[h.lIlIIIIIIllIl[21]] = g.PATCH_5_NORTH;
        gArray[h.lIlIIIIIIllIl[22]] = g.PATCH_8;
        gArray[h.lIlIIIIIIllIl[23]] = g.PATCH_7;
        gArray[h.lIlIIIIIIllIl[24]] = g.PATCH_6;
        gArray[h.lIlIIIIIIllIl[25]] = g.PATCH_5;
        ROTATION_25 = new GameEnum19(gArray);
        h[] hArray = new h[lIlIIIIIIllIl[2]];
        hArray[h.lIlIIIIIIllIl[0]] = ROTATION_25;
        $VALUES = hArray;
    }

    public g[] o() {
        return this.patches;
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }
}

