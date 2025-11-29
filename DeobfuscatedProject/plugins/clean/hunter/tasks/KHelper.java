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
        int n2 = lllIIlllllII[2];
        int n3 = lllIIlllllII[0];
        n3 = n3 * lllIIlllllII[2] + this.O();
        n3 = n3 * lllIIlllllII[2] + this.M();
        n3 = n3 * lllIIlllllII[2] + this.N();
        return n3;
    }

    private static boolean lIIIlIllIlIIIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object object) {
        k var1;
        void var2;
        if (k.lIIIlIllIlIIIIl(object, this)) {
            return lllIIlllllII[0];
        }
        if (k.lIIIlIllIlIIIlI(var2 instanceof k)) {
            return lllIIlllllII[1];
        }
        k var3 = (KHelper) ar2;
        if (k.lIIIlIllIlIIIll(var1.O(), var3.O())) {
            return lllIIlllllII[1];
        }
        if (k.lIIIlIllIlIIIll(var1.M(), var3.M())) {
            return lllIIlllllII[1];
        }
        if (k.lIIIlIllIlIIIll(var1.N(), var3.N())) {
            return lllIIlllllII[1];
        }
        return lllIIlllllII[0];
    }

    public int N() {
        return this.Y;
    }

    private static boolean lIIIlIllIlIIIIl(Object object, Object object2) {
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
        k.lIIIlIllIlIIIII();
    }

    public int M() {
        return this.X;
    }

    public String toString() {
        return "TrailToSpot(varbitId=" + this.O() + ", value=" + this.M() + ", footprint=" + this.N() + ")";
    }

    private static boolean lIIIlIllIlIIIll(int n2, int n3) {
        return n2 != n3;
    }

    Set<Integer> L() {
        return ImmutableSet.of((Object)this.Y, (Object)(this.Y + lllIIlllllII[0]));
    }
}

