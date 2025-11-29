/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.HashMap;

public class BHelper
extends HashMap<Integer, Integer> {
    
    final  SquireNightmarePlugin bh;

    private static void var2() {
        var1 = new int[5];
        b.var1[0] = 0xFFFFACFF & 0x77DB;
        b.var1[1] = (156 + 140 - 275 + 168 ^ 41 + 113 - 112 + 96) & (12 + 5 - -216 + 9 ^ 67 + 33 - 36 + 133 ^ -1);
        b.var1[2] = -(0xFFFFFBE1 & 0x471F) & (0xFFFFE7FF & 0x7FDE);
        b.var1[3] = 0xFFFFA5FB & 0x7EE5;
        b.var1[4] = -(0xFFFFD97F & 0x7F9B) & (0xFFFFFDFE & Short.MAX_VALUE);
    }

    public BHelper(SquireNightmarePlugin squireNightmarePlugin) {
        this.bh = squireNightmarePlugin;
        this.put(var1[0], var1[1]);
        0;
        this.put(var1[2], var1[1]);
        0;
        this.put(var1[3], var1[1]);
        0;
        this.put(var1[4], var1[1]);
        0;
    }

    static {
        b.var2();
    }
}

