/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.h;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.u;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.v;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.w;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

public class d
extends h {
    private final /* synthetic */ w B;
    private final /* synthetic */ w w;
    private final /* synthetic */ w z;
    private final /* synthetic */ w x;
    private final /* synthetic */ w A;
    private static /* synthetic */ int[] lIIlIlllIIII;
    private final /* synthetic */ w v;
    private final /* synthetic */ w C;
    private final /* synthetic */ w D;
    private final /* synthetic */ w y;

    @Override
    public String g() {
        return a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bp;
    }

    static {
        d.llIIllIlIlIllI();
    }

    private static boolean llIIllIlIllIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public w a(o o2) {
        d lllllllllllllllIllllIIIlIIlIIIll;
        void lllllllllllllllIllllIIIlIIlIIIlI;
        if (d.llIIllIlIlIlll(o2.o().G() ? 1 : 0)) {
            int[] nArray = new int[lIIlIlllIIII[7]];
            nArray[d.lIIlIlllIIII[1]] = lIIlIlllIIII[8];
            nArray[d.lIIlIlllIIII[0]] = lIIlIlllIIII[2];
            nArray[d.lIIlIlllIIII[9]] = lIIlIlllIIII[3];
            nArray[d.lIIlIlllIIII[10]] = lIIlIlllIIII[4];
            nArray[d.lIIlIlllIIII[11]] = lIIlIlllIIII[5];
            if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return this.Y;
            }
        }
        if (!d.llIIllIlIlIlll(Bank.isOpen() ? 1 : 0) || d.llIIllIlIlIlll(lllllllllllllllIllllIIIlIIlIIIlI.o().G() ? 1 : 0)) {
            return null;
        }
        int[] nArray = new int[lIIlIlllIIII[11]];
        nArray[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        nArray[d.lIIlIlllIIII[0]] = lIIlIlllIIII[3];
        nArray[d.lIIlIlllIIII[9]] = lIIlIlllIIII[4];
        nArray[d.lIIlIlllIIII[10]] = lIIlIlllIIII[5];
        if (d.llIIllIlIllIII(Inventory.contains((int[])nArray) ? 1 : 0) && d.llIIllIlIlIlll(Inventory.isFull() ? 1 : 0)) {
            return lllllllllllllllIllllIIIlIIlIIIll.Y;
        }
        int[] nArray2 = new int[lIIlIlllIIII[0]];
        nArray2[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            return lllllllllllllllIllllIIIlIIlIIIll.z;
        }
        int[] nArray3 = new int[lIIlIlllIIII[0]];
        nArray3[d.lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray3) ? 1 : 0)) {
            return lllllllllllllllIllllIIIlIIlIIIll.A;
        }
        int[] nArray4 = new int[lIIlIlllIIII[0]];
        nArray4[d.lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray4) ? 1 : 0)) {
            return lllllllllllllllIllllIIIlIIlIIIll.B;
        }
        int[] nArray5 = new int[lIIlIlllIIII[0]];
        nArray5[d.lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        if (d.llIIllIlIlIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
            return lllllllllllllllIllllIIIlIIlIIIll.C;
        }
        int[] nArray6 = new int[lIIlIlllIIII[0]];
        nArray6[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        if (d.llIIllIlIlIlll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            return lllllllllllllllIllllIIIlIIlIIIll.v;
        }
        int[] nArray7 = new int[lIIlIlllIIII[0]];
        nArray7[d.lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        if (d.llIIllIlIlIlll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            return lllllllllllllllIllllIIIlIIlIIIll.w;
        }
        int[] nArray8 = new int[lIIlIlllIIII[0]];
        nArray8[d.lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        if (d.llIIllIlIlIlll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            return lllllllllllllllIllllIIIlIIlIIIll.x;
        }
        int[] nArray9 = new int[lIIlIlllIIII[0]];
        nArray9[d.lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        if (d.llIIllIlIlIlll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            return lllllllllllllllIllllIIIlIIlIIIll.y;
        }
        return this.D;
    }

    public d() {
        int[] nArray = new int[lIIlIlllIIII[0]];
        nArray[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        this.v = new u(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bD, nArray);
        int[] nArray2 = new int[lIIlIlllIIII[0]];
        nArray2[d.lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        this.w = new u(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bE, nArray2);
        int[] nArray3 = new int[lIIlIlllIIII[0]];
        nArray3[d.lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        this.x = new u(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bF, nArray3);
        int[] nArray4 = new int[lIIlIlllIIII[0]];
        nArray4[d.lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        this.y = new u(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bG, nArray4);
        int[] nArray5 = new int[lIIlIlllIIII[0]];
        nArray5[d.lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        this.z = new v(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bH, nArray5);
        int[] nArray6 = new int[lIIlIlllIIII[0]];
        nArray6[d.lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        this.A = new v(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bI, nArray6);
        int[] nArray7 = new int[lIIlIlllIIII[0]];
        nArray7[d.lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        this.B = new v(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bJ, nArray7);
        int[] nArray8 = new int[lIIlIlllIIII[0]];
        nArray8[d.lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        this.C = new v(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bK, nArray8);
        int[] nArray9 = new int[lIIlIlllIIII[0]];
        nArray9[d.lIIlIlllIIII[1]] = lIIlIlllIIII[6];
        this.D = new v(a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.I.bL, nArray9);
    }

    private static boolean llIIllIlIlIlll(int n2) {
        return n2 != 0;
    }

    private static void llIIllIlIlIllI() {
        lIIlIlllIIII = new int[12];
        d.lIIlIlllIIII[0] = " ".length();
        d.lIIlIlllIIII[1] = (3 ^ 0x10) & ~(0x45 ^ 0x56);
        d.lIIlIlllIIII[2] = -(0xFFFFFFA3 & 0x4C7D) & (0xFFFFFD7F & 0x7FF7);
        d.lIIlIlllIIII[3] = -(0xFFFFAEBF & 0x59E9) & (0xFFFFBFFF & 0x79FD);
        d.lIIlIlllIIII[4] = -(0xFFFFCF4F & 0x74B5) & (0xFFFFFF7F & 0x75D7);
        d.lIIlIlllIIII[5] = -(0xFFFFEEB1 & 0x1FEF) & (0xFFFFFFF3 & 0x3FFD);
        d.lIIlIlllIIII[6] = 0xFFFFFFF3 & 0x2EFF;
        d.lIIlIlllIIII[7] = 0x1F ^ 0x1A;
        d.lIIlIlllIIII[8] = 153 + 119 - 186 + 143;
        d.lIIlIlllIIII[9] = "  ".length();
        d.lIIlIlllIIII[10] = "   ".length();
        d.lIIlIlllIIII[11] = 0x9E ^ 0x9A;
    }
}

