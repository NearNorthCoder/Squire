package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Singleton;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.f  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/f.class */
public class f {
    private /* synthetic */ int n;
    private static /* synthetic */ int[] lIllIIlIIllll;
    private /* synthetic */ int o;

    private int v() {
        return Static.getClient().getTickCount();
    }

    private static boolean llIIIlIllllllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean llIIIlIlllllllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean u() {
        int v = v() - this.o;
        if (!llIIIlIllllllIl(v() - this.n, lIllIIlIIllll[0]) || (llIIIlIlllllllI(v) && !llIIIlIllllllIl(v, lIllIIlIIllll[0]))) {
            return lIllIIlIIllll[2];
        }
        ?? r0 = lIllIIlIIllll[1];
        "".length();
        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    static {
        llIIIlIllllllII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean t() {
        if (llIIIlIllllllIl(v() - Math.max(this.o, this.n), lIllIIlIIllll[0])) {
            ?? r0 = lIllIIlIIllll[1];
            "".length();
            return (-((((132 + 62) - 116) + 90) ^ (((113 + 64) - 95) + 91))) >= 0 ? ((((161 + 27) - 94) + 89) ^ (((138 + 54) - 159) + 106)) & (((61 ^ 42) ^ (69 ^ 110)) ^ (-" ".length())) : r0;
        }
        return lIllIIlIIllll[2];
    }

    public void r() {
        this.n = v();
    }

    public void s() {
        this.o = v();
    }

    private static void llIIIlIllllllII() {
        lIllIIlIIllll = new int[3];
        lIllIIlIIllll[0] = 40 ^ 44;
        lIllIIlIIllll[1] = " ".length();
        lIllIIlIIllll[2] = (6 ^ 73) & ((61 ^ 114) ^ (-1));
    }
}
