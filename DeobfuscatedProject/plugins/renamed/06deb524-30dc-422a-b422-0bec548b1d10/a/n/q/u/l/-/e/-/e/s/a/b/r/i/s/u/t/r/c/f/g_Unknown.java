/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.h_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public abstract class g_Unknown
extends h_Unknown {
    private static /* synthetic */ int[] lIIllIIlIlII;

    protected abstract w d();

    private w b(o o2) {
        g var3;
        int[] nArray = new int[lIIllIIlIlII[0]];
        nArray[g.lIIllIIlIlII[1]] = lIIllIIlIlII[2];
        nArray[g.lIIllIIlIlII[3]] = lIIllIIlIlII[4];
        if (g.llIIlllIlIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            w w2;
            if (g.llIIlllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                w2 = this.H;
                0;
                if (-1 == 2) {
                    return null;
                }
            } else {
                w2 = var3.aa;
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
                    w3 = var3.O;
                    0;
                    if (-1 > 1) {
                        return null;
                    }
                } else {
                    w3 = var3.aa;
                }
                return w3;
            }
        }
        int[] nArray4 = new int[lIIllIIlIlII[0]];
        nArray4[g.lIIllIIlIlII[1]] = lIIllIIlIlII[5];
        nArray4[g.lIIllIIlIlII[3]] = lIIllIIlIlII[6];
        if (g.llIIlllIlIIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return var3.P;
        }
        return null;
    }

    private static void llIIlllIlIIIIl() {
        lIIllIIlIlII = new int[9];
        g.lIIllIIlIlII[0] = 2;
        g.lIIllIIlIlII[1] = (0 + 148 - 49 + 86 ^ 129 + 45 - 173 + 135) & (0x83 ^ 0xA7 ^ (0xB7 ^ 0xA2) ^ -1);
        g.lIIllIIlIlII[2] = 0xFFFFBFFF & 0x6EF3;
        g.lIIllIIlIlII[3] = 1;
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
        int var2;
        g var4;
        void var1;
        block17: {
            block16: {
                int n2;
                w w2 = this.b(o2);
                if (g.llIIlllIlIIlII(w2)) {
                    void var5;
                    return var5;
                }
                int[] nArray = new int[lIIllIIlIlII[3]];
                nArray[g.lIIllIIlIlII[1]] = lIIllIIlIlII[7];
                if (g.llIIlllIlIIlIl(var1.p().a(nArray), lIIllIIlIlII[8] * (var4.f() - var1.p().A()))) {
                    n2 = lIIllIIlIlII[3];
                    0;
                    if (((0xC3 ^ 0x9A) & ~(0xDD ^ 0x84)) != 0) {
                        return null;
                    }
                } else {
                    n2 = lIIllIIlIlII[1];
                }
                var2 = n2;
                int[] nArray2 = new int[lIIllIIlIlII[3]];
                nArray2[g.lIIllIIlIlII[1]] = lIIllIIlIlII[7];
                if (!g.llIIlllIlIIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block16;
                int[] nArray3 = new int[lIIllIIlIlII[3]];
                nArray3[g.lIIllIIlIlII[1]] = var4.c();
                if (!g.llIIlllIlIIIll(Inventory.contains((int[])nArray3) ? 1 : 0) || !g.llIIlllIlIIIlI(var2)) break block17;
            }
            return var4.Z;
        }
        if (g.llIIlllIlIIIll(var1.o().F() ? 1 : 0) && g.llIIlllIlIIIlI(var1.k().r() ? 1 : 0)) {
            return var4.G;
        }
        if (g.llIIlllIlIIIll(var1.o().H() ? 1 : 0)) {
            return var4.ac;
        }
        int[] nArray = new int[lIIllIIlIlII[3]];
        nArray[g.lIIllIIlIlII[1]] = var4.e();
        if (g.llIIlllIlIIIll(var1.p().b(nArray) ? 1 : 0)) {
            return var4.ab;
        }
        if (g.llIIlllIlIIIll(var1.m().h() ? 1 : 0)) {
            int[] nArray4 = new int[lIIllIIlIlII[0]];
            nArray4[g.lIIllIIlIlII[1]] = var4.e();
            nArray4[g.lIIllIIlIlII[3]] = var4.c();
            if (g.llIIlllIlIIIll(var1.l().b(nArray4) ? 1 : 0)) {
                return var4.Y;
            }
            if (g.llIIlllIlIIIll(var1.k().r() ? 1 : 0)) {
                return var4.E;
            }
            if (g.llIIlllIlIIIll(var2)) {
                return var4.I;
            }
            int[] nArray5 = new int[lIIllIIlIlII[3]];
            nArray5[g.lIIllIIlIlII[1]] = var4.c();
            if (g.llIIlllIlIIIlI(var1.l().b(nArray5) ? 1 : 0)) {
                return var4.d();
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

