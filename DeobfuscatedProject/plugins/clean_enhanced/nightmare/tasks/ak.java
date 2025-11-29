/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.nightmare.tasks;

import java.util.HashMap;
import gg.squire.nightmare.tasks.AttackingTotemTask;

class ak
extends HashMap<Integer, Integer> {
    
    final  aj ea;

    static {
        ak.var2();
    }

    ak(aj aj2) {
        this.ea = aj2;
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
        ak.var1[0] = 0xFFFFF5FF & 0x2EDB;
        ak.var1[1] = (0x39 ^ 0x37) & ~(0xC9 ^ 0xC7);
        ak.var1[2] = 0xFFFFBEDE & 0x65FF;
        ak.var1[3] = -(0xFFFFB333 & 0x5FCD) & (0xFFFFF7F7 & 0x3FE9);
        ak.var1[4] = -(0xFFFF9F23 & 0x79DF) & (0xFFFFFDFF & 0x3FE6);
    }
}

