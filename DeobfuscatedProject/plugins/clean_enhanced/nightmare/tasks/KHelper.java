/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.util.HashMap;

class KHelper
extends HashMap<Integer, Integer> {

    private static void var2() {
        var1 = new int[12];
        k.var1[0] = -(0xFFFFFABE & 0x5747) & (0xFFFFF7DF & 0x7EFF);
        k.var1[1] = 2;
        k.var1[2] = -(0xFFFFDF6F & 0x7A93) & (0xFFFFFEDF & Short.MAX_VALUE);
        k.var1[3] = 3;
        k.var1[4] = 0xFFFFF7E3 & 0x2CFC;
        k.var1[5] = (0xE9 ^ 0xAD ^ 2) & (0x37 ^ 4 ^ (0xCD ^ 0xB8) ^ -1);
        k.var1[6] = 0xFFFFEEF3 & 0x35EF;
        k.var1[7] = 1;
        k.var1[8] = 0xFFFFEEDB & 0x35FF;
        k.var1[9] = 0xFFFFEFFF & 0x34DE;
        k.var1[10] = 0xFFFFF5EB & 0x2EF5;
        k.var1[11] = 0xFFFFE7FE & 0x3CE5;
    }

    static {
        k.var2();
    }

    KHelper() {
        this.put(var1[0], var1[1]);
        0;
        this.put(var1[2], var1[3]);
        0;
        this.put(var1[4], var1[5]);
        0;
        this.put(var1[6], var1[7]);
        0;
        this.put(var1[8], var1[1]);
        0;
        this.put(var1[9], var1[3]);
        0;
        this.put(var1[10], var1[5]);
        0;
        this.put(var1[11], var1[5]);
        0;
    }
}

