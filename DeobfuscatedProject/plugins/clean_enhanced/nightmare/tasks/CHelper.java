/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.HashMap;

public class CHelper
extends HashMap<Integer, Integer> {
    
    final  SquireNightmarePlugin bi;

    public CHelper(SquireNightmarePlugin squireNightmarePlugin) {
        this.bi = squireNightmarePlugin;
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
        c.var1[0] = 0xFFFFECFF & 0x37DB;
        c.var1[1] = (0x52 ^ 0x22 ^ (0xBF ^ 0xC2)) & (0x7D ^ 0x4F ^ (0xB6 ^ 0x89) ^ -1);
        c.var1[2] = 0xFFFFFDDE & 0x26FF;
        c.var1[3] = 0xFFFFFFFF & 0x24E1;
        c.var1[4] = 0xFFFFE7E6 & 0x3CFD;
    }

    static {
        c.var2();
    }
}

