/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.h;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public abstract class g
extends h {
    private static /* synthetic */ int[] lIIllIIlIlII;

    protected abstract w d();

    private w b(o o2) {
        g lllllllllllllllIlllIllllIIIIllIl;
        int[] nArray = new int[lIIllIIlIlII[0]];
        nArray[g.lIIllIIlIlII[1]] = lIIllIIlIlII[2];
        nArray[g.lIIllIIlIlII[3]] = lIIllIIlIlII[4];
        if (g.llIIlllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            w w2;
            if (g.llIIlllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                w2 = this.H;
                "".length();
                if (-" ".length() == "  ".length()) {
                    return null;
                }
            } else {
                w2 = lllllllllllllllIlllIllllIIIIllIl.aa;
            }
            return w2;
        }
        int[] nArray2 = new int[lIIllIIlIlII[0]];
        nArray2[g.lIIllIIlIlII[1]] = lIIllIIlIlII[5];
        nArray2[g.lIIllIIlIlII[3]] = lIIllIIlIlII[6];
        if (g.llIIlllIlIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            int[] nArray3 = new int[lIIllIIlIlII[0]];
            nArray3[g.lIIllIIlIlII[1]] = lIIllIIlIlII[5];
            nArray3[g.lIIllIIlIlII[3]] = lIIllIIlIlII[6];
            if (g.llIIlllIlIIIlI(Equipment.contains((int[])nArray3) ? 1 : 0)) {
                w w3;
                if (g.llIIlllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                    w3 = lllllllllllllllIlllIllllIIIIllIl.O;
                    "".length();
                    if (-" ".length() > " ".length()) {
                        return null;
                    }
                } else {
                    w3 = lllllllllllllllIlllIllllIIIIllIl.aa;
                }
                return w3;
            }
        }
        int[] nArray4 = new int[lIIllIIlIlII[0]];
        nArray4[g.lIIllIIlIlII[1]] = lIIllIIlIlII[5];
        nArray4[g.lIIllIIlIlII[3]] = lIIllIIlIlII[6];
        if (g.llIIlllIlIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return lllllllllllllllIlllIllllIIIIllIl.P;
        }
        return null;
    }

    private static void llIIlllIlIIIIl() {
        lIIllIIlIlII = new int[9];
        g.lIIllIIlIlII[0] = "  ".length();
        g.lIIllIIlIlII[1] = (0 + 148 - 49 + 86 ^ 129 + 45 - 173 + 135) & (0x83 ^ 0xA7 ^ (0xB7 ^ 0xA2) ^ -" ".length());
        g.lIIllIIlIlII[2] = 0xFFFFBFFF & 0x6EF3;
        g.lIIllIIlIlII[3] = " ".length();
        g.lIIllIIlIlII[4] = 0xFFFFDFAB & 0x7FF4;
        g.lIIllIIlIlII[5] = -(0xFFFFF8D2 & 0x7F7F) & (0xFFFFFEFD & 0x7F7F);
        g.lIIllIIlIlII[6] = 0xFFFFE997 & Short.MAX_VALUE;
        g.lIIllIIlIlII[7] = -(0xFFFFE5FB & 0x7A3D) & (0xFFFFEDFD & 0x73FF);
        g.lIIllIIlIlII[8] = 0x42 ^ 0x59;
    }

    protected abstract int f();

    private static boolean llIIlllIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlllIlIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public w a(o o2) {
        int lllllllllllllllIlllIllllIIIIIlIl;
        g lllllllllllllllIlllIllllIIIIlIII;
        void lllllllllllllllIlllIllllIIIIIlll;
        block17: {
            block16: {
                int n2;
                w w2 = this.b(o2);
                if (g.llIIlllIlIIlII(w2)) {
                    void lllllllllllllllIlllIllllIIIIIllI;
                    return lllllllllllllllIlllIllllIIIIIllI;
                }
                int[] nArray = new int[lIIllIIlIlII[3]];
                nArray[g.lIIllIIlIlII[1]] = lIIllIIlIlII[7];
                if (g.llIIlllIlIIlIl(lllllllllllllllIlllIllllIIIIIlll.p().a(nArray), lIIllIIlIlII[8] * (lllllllllllllllIlllIllllIIIIlIII.f() - lllllllllllllllIlllIllllIIIIIlll.p().A()))) {
                    n2 = lIIllIIlIlII[3];
                    "".length();
                    if (((0xC3 ^ 0x9A) & ~(0xDD ^ 0x84)) != 0) {
                        return null;
                    }
                } else {
                    n2 = lIIllIIlIlII[1];
                }
                lllllllllllllllIlllIllllIIIIIlIl = n2;
                int[] nArray2 = new int[lIIllIIlIlII[3]];
                nArray2[g.lIIllIIlIlII[1]] = lIIllIIlIlII[7];
                if (!g.llIIlllIlIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block16;
                int[] nArray3 = new int[lIIllIIlIlII[3]];
                nArray3[g.lIIllIIlIlII[1]] = lllllllllllllllIlllIllllIIIIlIII.c();
                if (!g.llIIlllIlIIIll(Inventory.contains((int[])nArray3) ? 1 : 0) || !g.llIIlllIlIIIlI(lllllllllllllllIlllIllllIIIIIlIl)) break block17;
            }
            return lllllllllllllllIlllIllllIIIIlIII.Z;
        }
        if (g.llIIlllIlIIIll(lllllllllllllllIlllIllllIIIIIlll.o().F() ? 1 : 0) && g.llIIlllIlIIIlI(lllllllllllllllIlllIllllIIIIIlll.k().r() ? 1 : 0)) {
            return lllllllllllllllIlllIllllIIIIlIII.G;
        }
        if (g.llIIlllIlIIIll(lllllllllllllllIlllIllllIIIIIlll.o().H() ? 1 : 0)) {
            return lllllllllllllllIlllIllllIIIIlIII.ac;
        }
        int[] nArray = new int[lIIllIIlIlII[3]];
        nArray[g.lIIllIIlIlII[1]] = lllllllllllllllIlllIllllIIIIlIII.e();
        if (g.llIIlllIlIIIll(lllllllllllllllIlllIllllIIIIIlll.p().b(nArray) ? 1 : 0)) {
            return lllllllllllllllIlllIllllIIIIlIII.ab;
        }
        if (g.llIIlllIlIIIll(lllllllllllllllIlllIllllIIIIIlll.m().h() ? 1 : 0)) {
            int[] nArray4 = new int[lIIllIIlIlII[0]];
            nArray4[g.lIIllIIlIlII[1]] = lllllllllllllllIlllIllllIIIIlIII.e();
            nArray4[g.lIIllIIlIlII[3]] = lllllllllllllllIlllIllllIIIIlIII.c();
            if (g.llIIlllIlIIIll(lllllllllllllllIlllIllllIIIIIlll.l().b(nArray4) ? 1 : 0)) {
                return lllllllllllllllIlllIllllIIIIlIII.Y;
            }
            if (g.llIIlllIlIIIll(lllllllllllllllIlllIllllIIIIIlll.k().r() ? 1 : 0)) {
                return lllllllllllllllIlllIllllIIIIlIII.E;
            }
            if (g.llIIlllIlIIIll(lllllllllllllllIlllIllllIIIIIlIl)) {
                return lllllllllllllllIlllIllllIIIIlIII.I;
            }
            int[] nArray5 = new int[lIIllIIlIlII[3]];
            nArray5[g.lIIllIIlIlII[1]] = lllllllllllllllIlllIllllIIIIlIII.c();
            if (g.llIIlllIlIIIlI(lllllllllllllllIlllIllllIIIIIlll.l().b(nArray5) ? 1 : 0)) {
                return lllllllllllllllIlllIllllIIIIlIII.d();
            }
        }
        return this.aa;
    }

    private static boolean llIIlllIlIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlllIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public abstract int c();

    protected abstract int e();

    static {
        g.llIIlllIlIIIIl();
    }
}

