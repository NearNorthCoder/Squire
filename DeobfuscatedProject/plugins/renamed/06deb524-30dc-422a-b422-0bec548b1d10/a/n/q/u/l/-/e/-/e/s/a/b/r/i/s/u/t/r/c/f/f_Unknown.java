/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.g_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o_Unknown;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

public abstract class f_Unknown
extends g_Unknown {
    private static /* synthetic */ int[] lIIllIlIIlII;

    private static void llIIllllIIllll() {
        lIIllIlIIlII = new int[17];
        f.lIIllIlIIlII[0] = 2;
        f.lIIllIlIIlII[1] = (3 + 31 - -65 + 29 ^ 128 + 41 - 93 + 58) & (0x27 ^ 0 ^ (0x57 ^ 0x76) ^ -1);
        f.lIIllIlIIlII[2] = 0xFFFFAFFF & 0x7EF3;
        f.lIIllIlIIlII[3] = 1;
        f.lIIllIlIIlII[4] = -(0x98 ^ 0xC3) & (0xFFFFFFFA & 0x5FFF);
        f.lIIllIlIIlII[5] = -(0xFFFFFAF7 & 0x75CC) & (0xFFFFF6EF & Short.MAX_VALUE);
        f.lIIllIlIIlII[6] = -(0xFFFFBF6B & 0x42FD) & (0xFFFFFBFF & 0x6FFF);
        f.lIIllIlIIlII[7] = -(0xFFFF9D3D & 0x6EC7) & (0xFFFFBFEF & 0x7FF4);
        f.lIIllIlIIlII[8] = 0xFFFFFF63 & 0x26DF;
        f.lIIllIlIIlII[9] = -(0xFFFFD77F & 0x79B2) & (0xFFFFFFF7 & 0x777D);
        f.lIIllIlIIlII[10] = 3;
        f.lIIllIlIIlII[11] = -(0xFFFFFD6E & 0x7AF3) & (0xFFFFFB69 & Short.MAX_VALUE);
        f.lIIllIlIIlII[12] = 0x4E ^ 0x43 ^ (0xAF ^ 0xB9);
        f.lIIllIlIIlII[13] = 0x76 ^ 0x6C;
        f.lIIllIlIIlII[14] = 0xFFFFFDE7 & 0x3DD;
        f.lIIllIlIIlII[15] = 0xFFFFB5BF & 0x4BFC;
        f.lIIllIlIIlII[16] = -(0xFFFFFEB1 & 0x37CF) & (0xFFFFFFB7 & 0x3FFD);
    }

    private static boolean llIIllllIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public w a(o o2) {
        int var5;
        f var2;
        int var6;
        void var4;
        block26: {
            block25: {
                int n2;
                int n3;
                w w2 = this.b(o2);
                if (f.llIIllllIlIIlI(w2)) {
                    void var3;
                    return var3;
                }
                int[] nArray = new int[lIIllIlIIlII[0]];
                nArray[f.lIIllIlIIlII[1]] = lIIllIlIIlII[8];
                nArray[f.lIIllIlIIlII[3]] = lIIllIlIIlII[9];
                if (f.llIIllllIlIIIl(var4.n().d(nArray) ? 1 : 0)) {
                    n3 = lIIllIlIIlII[12];
                    0;
                    if (-3 >= 0) {
                        return null;
                    }
                } else {
                    n3 = lIIllIlIIlII[13];
                }
                var6 = n3;
                int[] nArray2 = new int[lIIllIlIIlII[3]];
                nArray2[f.lIIllIlIIlII[1]] = lIIllIlIIlII[14];
                if (f.llIIllllIlIIll(var4.p().a(nArray2), var6 * (var2.f() - var4.p().A()))) {
                    n2 = lIIllIlIIlII[3];
                    0;
                    if (2 != 2) {
                        return null;
                    }
                } else {
                    n2 = lIIllIlIIlII[1];
                }
                var5 = n2;
                int[] nArray3 = new int[lIIllIlIIlII[3]];
                nArray3[f.lIIllIlIIlII[1]] = lIIllIlIIlII[15];
                if (f.llIIllllIlIIIl(var4.l().b(nArray3) ? 1 : 0) && f.llIIllllIlIIII(var4.n().y() ? 1 : 0)) {
                    return var2.R;
                }
                int[] nArray4 = new int[lIIllIlIIlII[0]];
                nArray4[f.lIIllIlIIlII[1]] = lIIllIlIIlII[14];
                nArray4[f.lIIllIlIIlII[3]] = lIIllIlIIlII[15];
                if (!f.llIIllllIlIIII(var4.l().b(nArray4) ? 1 : 0)) break block25;
                int[] nArray5 = new int[lIIllIlIIlII[3]];
                nArray5[f.lIIllIlIIlII[1]] = var2.c();
                if (!f.llIIllllIlIIIl(var4.l().b(nArray5) ? 1 : 0) || !f.llIIllllIlIIII(var5)) break block26;
            }
            return var2.Z;
        }
        if (f.llIIllllIlIIIl(var4.o().F() ? 1 : 0) && (!f.llIIllllIlIIII(var4.k().s() ? 1 : 0) || f.llIIllllIlIlII(var6, lIIllIlIIlII[12]) && f.llIIllllIlIIII(var4.k().r() ? 1 : 0))) {
            return var2.G;
        }
        if (f.llIIllllIlIIIl(var4.o().H() ? 1 : 0)) {
            return var2.ac;
        }
        int[] nArray = new int[lIIllIlIIlII[0]];
        nArray[f.lIIllIlIIlII[1]] = var2.e();
        nArray[f.lIIllIlIIlII[3]] = lIIllIlIIlII[16];
        if (f.llIIllllIlIIIl(var4.p().b(nArray) ? 1 : 0)) {
            if (f.llIIllllIlIIII(var4.n().z() ? 1 : 0)) {
                return var2.P;
            }
            return var2.ab;
        }
        if (f.llIIllllIlIIIl(var4.m().h() ? 1 : 0)) {
            int[] nArray6 = new int[lIIllIlIIlII[10]];
            nArray6[f.lIIllIlIIlII[1]] = lIIllIlIIlII[16];
            nArray6[f.lIIllIlIIlII[3]] = var2.e();
            nArray6[f.lIIllIlIIlII[0]] = var2.c();
            if (f.llIIllllIlIIIl(var4.l().b(nArray6) ? 1 : 0)) {
                return var2.Y;
            }
            if (f.llIIllllIlIIIl(var5) && f.llIIllllIlIIII(var4.n().y() ? 1 : 0)) {
                return var2.R;
            }
            if (f.llIIllllIlIIII(var4.k().s() ? 1 : 0)) {
                w w3;
                if (f.llIIllllIlIIIl(var4.k().r() ? 1 : 0)) {
                    w3 = var2.E;
                    0;
                    if ((0xB2 ^ 0xA4 ^ (0xAB ^ 0xB9)) == -1) {
                        return null;
                    }
                } else {
                    w3 = var2.F;
                }
                return w3;
            }
            if (f.llIIllllIlIIIl(var5)) {
                return var2.J;
            }
            int[] nArray7 = new int[lIIllIlIIlII[3]];
            nArray7[f.lIIllIlIIlII[1]] = var2.c();
            if (f.llIIllllIlIIII(var4.l().b(nArray7) ? 1 : 0)) {
                return var2.d();
            }
        }
        return this.aa;
    }

    static {
        f.llIIllllIIllll();
    }

    private static boolean llIIllllIlIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIIllllIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIllllIlIIlI(Object object) {
        return object != null;
    }

    private static boolean llIIllllIlIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    private w b(o o2) {
        void var7;
        f var1;
        int[] nArray = new int[lIIllIlIIlII[0]];
        nArray[f.lIIllIlIIlII[1]] = lIIllIlIIlII[2];
        nArray[f.lIIllIlIIlII[3]] = lIIllIlIIlII[4];
        if (f.llIIllllIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            w w2;
            if (f.llIIllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                w2 = this.H;
                0;
                
                }
            } else {
                w2 = var1.aa;
            }
            return w2;
        }
        int[] nArray2 = new int[lIIllIlIIlII[0]];
        nArray2[f.lIIllIlIIlII[1]] = lIIllIlIIlII[5];
        nArray2[f.lIIllIlIIlII[3]] = lIIllIlIIlII[6];
        if (f.llIIllllIlIIII(Inventory.contains((int[])nArray2) ? 1 : 0) && f.llIIllllIlIIII(var7.n().z() ? 1 : 0)) {
            w w3;
            if (f.llIIllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                w3 = var1.O;
                0;
                if (((0x73 ^ 0x27) & ~(0xC3 ^ 0x97)) == -1) {
                    return null;
                }
            } else {
                w3 = var1.aa;
            }
            return w3;
        }
        int[] nArray3 = new int[lIIllIlIIlII[3]];
        nArray3[f.lIIllIlIIlII[1]] = lIIllIlIIlII[7];
        if (f.llIIllllIlIIIl(var7.m().b(nArray3) ? 1 : 0)) {
            int[] nArray4 = new int[lIIllIlIIlII[3]];
            nArray4[f.lIIllIlIIlII[1]] = lIIllIlIIlII[7];
            if (f.llIIllllIlIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                int[] nArray5 = new int[lIIllIlIIlII[3]];
                nArray5[f.lIIllIlIIlII[1]] = lIIllIlIIlII[7];
                if (f.llIIllllIlIIII(Equipment.contains((int[])nArray5) ? 1 : 0)) {
                    w w4;
                    if (f.llIIllllIlIIIl(var7.m().h() ? 1 : 0)) {
                        w4 = var1.T;
                        0;
                        if (1 <= ((3 + 38 - -65 + 31 ^ 131 + 29 - 121 + 108) & (0x22 ^ 0x34 ^ (0x41 ^ 0x4D) ^ -1))) {
                            return null;
                        }
                    } else {
                        w4 = var1.aa;
                    }
                    return w4;
                }
            }
        }
        int[] nArray6 = new int[lIIllIlIIlII[3]];
        nArray6[f.lIIllIlIIlII[1]] = lIIllIlIIlII[7];
        if (f.llIIllllIlIIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) {
            int[] nArray7 = new int[lIIllIlIIlII[3]];
            nArray7[f.lIIllIlIIlII[1]] = lIIllIlIIlII[7];
            if (f.llIIllllIlIIII(Equipment.contains((int[])nArray7) ? 1 : 0)) {
                return var1.V;
            }
        }
        int[] nArray8 = new int[lIIllIlIIlII[0]];
        nArray8[f.lIIllIlIIlII[1]] = lIIllIlIIlII[8];
        nArray8[f.lIIllIlIIlII[3]] = lIIllIlIIlII[9];
        if (f.llIIllllIlIIIl(var7.m().b(nArray8) ? 1 : 0)) {
            int[] nArray9 = new int[lIIllIlIIlII[0]];
            nArray9[f.lIIllIlIIlII[1]] = lIIllIlIIlII[8];
            nArray9[f.lIIllIlIIlII[3]] = lIIllIlIIlII[9];
            if (f.llIIllllIlIIII(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[lIIllIlIIlII[10]];
                nArray10[f.lIIllIlIIlII[1]] = lIIllIlIIlII[8];
                nArray10[f.lIIllIlIIlII[3]] = lIIllIlIIlII[9];
                nArray10[f.lIIllIlIIlII[0]] = lIIllIlIIlII[7];
                if (f.llIIllllIlIIII(Equipment.contains((int[])nArray10) ? 1 : 0)) {
                    w w5;
                    if (f.llIIllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                        w5 = var1.S;
                        0;
                        if ((0x96 ^ 0x92) == 0) {
                            return null;
                        }
                    } else {
                        w5 = var1.aa;
                    }
                    return w5;
                }
            }
        }
        int[] nArray11 = new int[lIIllIlIIlII[0]];
        nArray11[f.lIIllIlIIlII[1]] = lIIllIlIIlII[8];
        nArray11[f.lIIllIlIIlII[3]] = lIIllIlIIlII[9];
        if (f.llIIllllIlIIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) {
            int[] nArray12 = new int[lIIllIlIIlII[10]];
            nArray12[f.lIIllIlIIlII[1]] = lIIllIlIIlII[8];
            nArray12[f.lIIllIlIIlII[3]] = lIIllIlIIlII[9];
            nArray12[f.lIIllIlIIlII[0]] = lIIllIlIIlII[7];
            if (f.llIIllllIlIIII(Equipment.contains((int[])nArray12) ? 1 : 0)) {
                return var1.U;
            }
        }
        int[] nArray13 = new int[lIIllIlIIlII[3]];
        nArray13[f.lIIllIlIIlII[1]] = lIIllIlIIlII[11];
        if (f.llIIllllIlIIII(Inventory.contains((int[])nArray13) ? 1 : 0) && f.llIIllllIlIIII(var7.n().y() ? 1 : 0)) {
            w w6;
            if (f.llIIllllIlIIIl(Bank.isOpen() ? 1 : 0)) {
                w6 = var1.Q;
                0;
                
                }
            } else {
                w6 = var1.aa;
            }
            return w6;
        }
        if (f.llIIllllIlIIII(var7.n().z() ? 1 : 0) && f.llIIllllIlIIII(var7.n().y() ? 1 : 0)) {
            return var1.R;
        }
        return null;
    }
}

