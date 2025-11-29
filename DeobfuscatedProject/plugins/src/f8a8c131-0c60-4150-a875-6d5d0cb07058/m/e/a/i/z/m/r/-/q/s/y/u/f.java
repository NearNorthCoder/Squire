/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Singleton
 *  net.unethicalite.client.Static
 */
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Singleton;
import net.unethicalite.client.Static;

@Singleton
public class f {
    private /* synthetic */ int n;
    private static /* synthetic */ int[] lIllIIlIIllll;
    private /* synthetic */ int o;

    private int v() {
        return Static.getClient().getTickCount();
    }

    private static boolean llIIIlIllllllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIlIlllllllI(int n2) {
        return n2 != 0;
    }

    public boolean u() {
        int n2;
        int n3 = this.v() - this.o;
        if (f.llIIIlIllllllIl(this.v() - this.n, lIllIIlIIllll[0]) && (!f.llIIIlIlllllllI(n3) || f.llIIIlIllllllIl(n3, lIllIIlIIllll[0]))) {
            n2 = lIllIIlIIllll[1];
            "".length();
            if (null != null) {
                return ((0x32 ^ 0x53) & ~(0x23 ^ 0x42)) != 0;
            }
        } else {
            n2 = lIllIIlIIllll[2];
        }
        return n2 != 0;
    }

    static {
        f.llIIIlIllllllII();
    }

    public boolean t() {
        boolean bl;
        if (f.llIIIlIllllllIl(this.v() - Math.max(this.o, this.n), lIllIIlIIllll[0])) {
            bl = lIllIIlIIllll[1];
            "".length();
            if (-(132 + 62 - 116 + 90 ^ 113 + 64 - 95 + 91) >= 0) {
                return ((161 + 27 - 94 + 89 ^ 138 + 54 - 159 + 106) & (0x3D ^ 0x2A ^ (0x45 ^ 0x6E) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIllIIlIIllll[2];
        }
        return bl;
    }

    public void r() {
        this.n = this.v();
    }

    public void s() {
        this.o = this.v();
    }

    private static void llIIIlIllllllII() {
        lIllIIlIIllll = new int[3];
        f.lIllIIlIIllll[0] = 0x28 ^ 0x2C;
        f.lIllIIlIIllll[1] = " ".length();
        f.lIllIIlIIllll[2] = (6 ^ 0x49) & ~(0x3D ^ 0x72);
    }
}

