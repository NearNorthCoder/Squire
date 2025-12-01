package s.r.e.p000.q.i.a.r.b.h.u.r.e.b.i.o;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
/* renamed from: s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.k  reason: invalid package */
/* loaded from: df6d2a51-cc28-47f1-b346-c5a30f777aad.jar:s/r/e/-/q/i/a/r/b/h/u/r/e/b/i/o/k.class */
public final class k {
    private static /* synthetic */ int[] lllIIlllllII;
    private final /* synthetic */ int X;
    private final /* synthetic */ int Y;
    private final /* synthetic */ int W;

    public int hashCode() {
        int i = lllIIlllllII[2];
        return (((((lllIIlllllII[0] * lllIIlllllII[2]) + O()) * lllIIlllllII[2]) + M()) * lllIIlllllII[2]) + N();
    }

    private static boolean lIIIlIllIlIIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean equals(Object obj) {
        if (lIIIlIllIlIIIIl(obj, this)) {
            return lllIIlllllII[0];
        }
        if (lIIIlIllIlIIIlI(obj instanceof k ? 1 : 0)) {
            return lllIIlllllII[1];
        }
        k kVar = (k) obj;
        if (!lIIIlIllIlIIIll(O(), kVar.O()) && !lIIIlIllIlIIIll(M(), kVar.M()) && !lIIIlIllIlIIIll(N(), kVar.N())) {
            return lllIIlllllII[0];
        }
        return lllIIlllllII[1];
    }

    private static void lIIIlIllIlIIIII() {
        lllIIlllllII = new int[3];
        lllIIlllllII[0] = " ".length();
        lllIIlllllII[1] = (52 ^ 12) & ((14 ^ 54) ^ (-1));
        lllIIlllllII[2] = (164 ^ 130) ^ (37 ^ 56);
    }

    public int N() {
        return this.Y;
    }

    private static boolean lIIIlIllIlIIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int O() {
        return this.W;
    }

    public k(int i, int i2, int i3) {
        this.W = i;
        this.X = i2;
        this.Y = i3;
    }

    static {
        lIIIlIllIlIIIII();
    }

    public int M() {
        return this.X;
    }

    public String toString() {
        return "TrailToSpot(varbitId=" + O() + ", value=" + M() + ", footprint=" + N() + ")";
    }

    private static boolean lIIIlIllIlIIIll(int i, int i2) {
        return i != i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Integer> L() {
        return ImmutableSet.of(Integer.valueOf(this.Y), Integer.valueOf(this.Y + lllIIlllllII[0]));
    }
}
