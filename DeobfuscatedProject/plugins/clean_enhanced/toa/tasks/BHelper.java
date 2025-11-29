/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.toa.tasks;

import java.util.List;

public class BHelper {
    
    public static final  int q;
    public static final  List<Integer> r;
    public static final  int s;

    private static void var2() {
        var1 = new int[4];
        b.var1[0] = -(0xFFFFBDAF & 0x737B) & (0xFFFFFBAF & 0x3DFF);
        b.var1[1] = 0xFFFFBFF7 & 0x6DDD;
        b.var1[2] = 0xFFFFE9DF & 0x1EAB;
        b.var1[3] = -(0xFFFFEF7A & 0x54A7) & (0xFFFFEDEF & 0x5EBD);
    }

    static {
        b.var2();
        q = var1[0];
        s = var1[1];
        r = List.of(Integer.valueOf(var1[2]), Integer.valueOf(var1[3]));
    }
}

