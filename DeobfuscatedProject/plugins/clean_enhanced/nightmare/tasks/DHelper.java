/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.HashMap;

public class DHelper
extends HashMap<Integer, Integer> {
    
    final  SquireNightmarePlugin bj;

    static {
        d.var2();
    }

    public DHelper(SquireNightmarePlugin squireNightmarePlugin) {
        this.bj = squireNightmarePlugin;
        this.put(var1[0], var1[1]);
        0;
        this.put(var1[2], var1[1]);
        0;
        this.put(var1[3], var1[1]);
        0;
        this.put(var1[4], var1[1]);
        0;
    }

    private static void var2() {
        var1 = new int[5];
        d.var1[0] = 0xFFFFA5FB & 0x7EDF;
        d.var1[1] = (0xA7 ^ 0xC5 ^ (0x31 ^ 0x15)) & (153 + 152 - 279 + 224 ^ 91 + 105 - 70 + 62 ^ -1);
        d.var1[2] = 0xFFFFB5DF & 0x6EFE;
        d.var1[3] = -(0xFFFFFB69 & 0x1E9F) & (0xFFFFBEE9 & Short.MAX_VALUE);
        d.var1[4] = 0xFFFFAFFC & 0x74E7;
    }
}

