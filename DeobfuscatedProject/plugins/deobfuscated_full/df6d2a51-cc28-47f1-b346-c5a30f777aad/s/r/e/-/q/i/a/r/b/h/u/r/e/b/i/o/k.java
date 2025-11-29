/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

public final class k {
    private static /* synthetic */ int[] lllIIlllllII;
    private final /* synthetic */ int X;
    private final /* synthetic */ int Y;
    private final /* synthetic */ int W;

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
        void var3;
        if (k.lIIIlIllIlIIIIl(object, this)) {
            return lllIIlllllII[0];
        }
        if (k.lIIIlIllIlIIIlI(var3 instanceof k)) {
            return lllIIlllllII[1];
        }
        k var2 = (k)var3;
        if (k.lIIIlIllIlIIIll(var1.O(), var2.O())) {
            return lllIIlllllII[1];
        }
        if (k.lIIIlIllIlIIIll(var1.M(), var2.M())) {
            return lllIIlllllII[1];
        }
        if (k.lIIIlIllIlIIIll(var1.N(), var2.N())) {
            return lllIIlllllII[1];
        }
        return lllIIlllllII[0];
    }

    private static void lIIIlIllIlIIIII() {
        lllIIlllllII = new int[3];
        k.lllIIlllllII[0] = 1;
        k.lllIIlllllII[1] = (0x34 ^ 0xC) & ~(0xE ^ 0x36);
        k.lllIIlllllII[2] = 0xA4 ^ 0x82 ^ (0x25 ^ 0x38);
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

    public k(int n2, int n3, int n4) {
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

