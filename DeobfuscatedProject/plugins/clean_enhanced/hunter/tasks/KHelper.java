/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package gg.squire.hunter.tasks;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public final class KHelper {
    
    private final  int X;
    private final  int Y;
    private final  int W;

    public int hashCode() {
        int n2 = var1[2];
        int n3 = var1[0];
        n3 = n3 * var1[2] + this.O();
        n3 = n3 * var1[2] + this.M();
        n3 = n3 * var1[2] + this.N();
        return n3;
    }

    private static boolean var2(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        k var3;
        void var4;
        if (k.var5(object, this)) {
            return var1[0];
        }
        if (k.var2(var4 instanceof k)) {
            return var1[1];
        }
        k var6 = (k)var4;
        if (k.var7(var3.O(), var6.O())) {
            return var1[1];
        }
        if (k.var7(var3.M(), var6.M())) {
            return var1[1];
        }
        if (k.var7(var3.N(), var6.N())) {
            return var1[1];
        }
        return var1[0];
    }

    private static void var8() {
        var1 = new int[3];
        k.var1[0] = 1;
        k.var1[1] = (0x34 ^ 0xC) & ~(0xE ^ 0x36);
        k.var1[2] = 0xA4 ^ 0x82 ^ (0x25 ^ 0x38);
    }

    public int N() {
        return this.Y;
    }

    private static boolean var5(Object object, Object object2) {
        return object == object2;
    }

    public int O() {
        return this.W;
    }

    public KHelper(int n2, int n3, int n4) {
        this.W = n2;
        this.X = n3;
        this.Y = n4;
    }

    static {
        k.var8();
    }

    public int M() {
        return this.X;
    }

    public String toString() {
        return "TrailToSpot(varbitId=" + this.O() + ", value=" + this.M() + ", footprint=" + this.N() + ")";
    }

    private static boolean var7(int n2, int n3) {
        return n2 != n3;
    }

    Set<Integer> L() {
        return ImmutableSet.of((Object)this.Y, (Object)(this.Y + var1[0]));
    }
}

