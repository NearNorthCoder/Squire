/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.N;
import -.m.e.a.u.s.r.r.q.i.r.e.f.q;
import -.m.e.a.u.s.r.r.q.i.r.e.f.r;
import net.runelite.api.coords.WorldPoint;

class v
extends q {
    final /* synthetic */ r aV;
    private static /* synthetic */ int[] lIlllIIllIII;

    static {
        v.lllIlIlllIIlII();
    }

    v(r r2, String string, int n2, boolean bl, N ... nArray) {
        this.aV = r2;
        super(string, n2, bl, nArray);
    }

    private static boolean lllIlIlllIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lllIlIlllIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllIlIlllIlIII(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean c(WorldPoint worldPoint) {
        boolean bl;
        void lllllllllllllllIlIllIlllIIlIlIll;
        if (v.lllIlIlllIIlIl(worldPoint.getX(), lIlllIIllIII[0]) && v.lllIlIlllIIllI(worldPoint.getY(), lIlllIIllIII[1]) && v.lllIlIlllIIlll(worldPoint.getY(), lIlllIIllIII[2])) {
            return lIlllIIllIII[3];
        }
        if ((!v.lllIlIlllIlIII(lllllllllllllllIlIllIlllIIlIlIll.getX(), lIlllIIllIII[4]) || !v.lllIlIlllIlIII(lllllllllllllllIlIllIlllIIlIlIll.getX(), lIlllIIllIII[5]) || !v.lllIlIlllIlIII(lllllllllllllllIlIllIlllIIlIlIll.getX(), lIlllIIllIII[6]) || v.lllIlIlllIIlIl(lllllllllllllllIlIllIlllIIlIlIll.getX(), lIlllIIllIII[7])) && v.lllIlIlllIIlll(lllllllllllllllIlIllIlllIIlIlIll.getY(), lIlllIIllIII[8]) && v.lllIlIlllIIllI(lllllllllllllllIlIllIlllIIlIlIll.getY(), lIlllIIllIII[9])) {
            return lIlllIIllIII[3];
        }
        if (v.lllIlIlllIlIIl(lllllllllllllllIlIllIlllIIlIlIll.getPlane())) {
            bl = lIlllIIllIII[10];
            "".length();
            if ("  ".length() < " ".length()) {
                return ((7 ^ 0x19) & ~(0x12 ^ 0xC)) != 0;
            }
        } else {
            bl = lIlllIIllIII[3];
        }
        return bl;
    }

    private static boolean lllIlIlllIIllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lllIlIlllIIlII() {
        lIlllIIllIII = new int[11];
        v.lIlllIIllIII[0] = -(0xFFFFB9FD & 0x5617) & (0xFFFFDEFD & 0x3FBF);
        v.lIlllIIllIII[1] = -(0xFFFFEFB3 & 0x304E) & (0xFFFFEF1F & 0x3FFD);
        v.lIlllIIllIII[2] = 0xFFFFBF9E & 0x4F7F;
        v.lIlllIIllIII[3] = "  ".length() & ("  ".length() ^ -" ".length());
        v.lIlllIIllIII[4] = -(0xFFFFF07F & 0x6FEF) & (0xFFFFEFFF & 0x7EFF);
        v.lIlllIIllIII[5] = -(0xFFFFF9FD & 0x662F) & (0xFFFFEFFE & 0x7EBD);
        v.lIlllIIllIII[6] = 0xFFFFBFAF & 0x4EF3;
        v.lIlllIIllIII[7] = -(0xFFFFF41F & 0x5BFE) & (0xFFFFDEFF & 0x7FBF);
        v.lIlllIIllIII[8] = -(0xFFFFBD1E & 0x62E5) & (0xFFFFFEFF & 0x2FFB);
        v.lIlllIIllIII[9] = -(0xFFFFFE8F & 0x7179) & (0xFFFFFEFF & 0x7FFE);
        v.lIlllIIllIII[10] = " ".length();
    }

    private static boolean lllIlIlllIIlll(int n2, int n3) {
        return n2 <= n3;
    }
}

