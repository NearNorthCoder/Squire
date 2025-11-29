/*
 * Decompiled with CFR 0.152.
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class J {
    private static /* synthetic */ int[] lIIllIllIIll;
    private /* synthetic */ int bP;
    private /* synthetic */ int bO;
    private /* synthetic */ double bQ;
    private /* synthetic */ int bN;
    private static final /* synthetic */ List<J> bM;

    public int ao() {
        return this.bP;
    }

    static {
        J.llIIlllllIllII();
        bM = new ArrayList<J>();
        bM.add(new J(lIIllIllIIll[0], lIIllIllIIll[1], lIIllIllIIll[2], 56.2));
        0;
        bM.add(new J(lIIllIllIIll[3], lIIllIllIIll[4], lIIllIllIIll[5], 17.5));
        0;
        bM.add(new J(lIIllIllIIll[6], lIIllIllIIll[7], lIIllIllIIll[8], 30.0));
        0;
        bM.add(new J(lIIllIllIIll[9], lIIllIllIIll[10], lIIllIllIIll[11], 37.5));
        0;
        bM.add(new J(lIIllIllIIll[12], lIIllIllIIll[13], lIIllIllIIll[14], 50.0));
        0;
    }

    public double ap() {
        return this.bQ;
    }

    public static J o(int n2) {
        Iterator<J> var1 = bM.iterator();
        while (J.llIIlllllIllIl(var1.hasNext() ? 1 : 0)) {
            int var3;
            J var2 = var1.next();
            if (!J.llIIlllllIlllI(var2.am(), var3) || J.llIIlllllIllll(var2.an(), var3)) {
                return var2;
            }
            0;
            if (((0xE0 ^ 0x87 ^ (0x61 ^ 0x22)) & (0x78 ^ 0x1F ^ (0xA ^ 0x49) ^ -1)) == 0) continue;
            return null;
        }
        return null;
    }

    private static boolean llIIlllllIllIl(int n2) {
        return n2 != 0;
    }

    public int am() {
        return this.bN;
    }

    public int an() {
        return this.bO;
    }

    private static boolean llIIlllllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static void llIIlllllIllII() {
        lIIllIllIIll = new int[15];
        J.lIIllIllIIll[0] = -(0xFFFFEE3B & 0x7DC6) & (0xFFFFFDBD & 0x6FFF);
        J.lIIllIllIIll[1] = 0xFFFFDB37 & 0x2DFD;
        J.lIIllIllIIll[2] = (0xB0 ^ 0xA0) & ~(0x39 ^ 0x29);
        J.lIIllIllIIll[3] = 0xFFFFBDFB & 0x43BC;
        J.lIIllIllIIll[4] = 0xFFFFC931 & 0x3FFF;
        J.lIIllIllIIll[5] = 1;
        J.lIIllIllIIll[6] = 0xFFFFDFBF & 0x21FF;
        J.lIIllIllIIll[7] = 0xFFFFEB37 & 0x1DFF;
        J.lIIllIllIIll[8] = 2;
        J.lIIllIllIIll[9] = -(0xFFFFF91B & 0x1EFF) & (0xFFFFBDDF & 0x5BFB);
        J.lIIllIllIIll[10] = 0xFFFFF9BD & 0xF7B;
        J.lIIllIllIIll[11] = 3;
        J.lIIllIllIIll[12] = -(0xFFFFBF2F & 0x70FD) & (0xFFFFF1FF & 0x3FEF);
        J.lIIllIllIIll[13] = 0xFFFFFB3F & 0xDFB;
        J.lIIllIllIIll[14] = 0x98 ^ 0x9C;
    }

    public J(int n2, int n3, int n4, double d2) {
        this.bN = n2;
        this.bO = n3;
        this.bP = n4;
        this.bQ = d2;
    }

    private static boolean llIIlllllIlllI(int n2, int n3) {
        return n2 != n3;
    }
}

