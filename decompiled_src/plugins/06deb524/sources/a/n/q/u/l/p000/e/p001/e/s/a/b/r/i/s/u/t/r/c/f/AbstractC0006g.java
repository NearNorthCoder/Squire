package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/g.class */
public abstract class AbstractC0006g extends AbstractC0007h {
    private static /* synthetic */ int[] lIIllIIlIlII;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract w d();

    private w b(C0014o c0014o) {
        int[] iArr = new int[lIIllIIlIlII[0]];
        iArr[lIIllIIlIlII[1]] = lIIllIIlIlII[2];
        iArr[lIIllIIlIlII[3]] = lIIllIIlIlII[4];
        if (llIIlllIlIIIlI(Inventory.contains(iArr) ? 1 : 0)) {
            if (llIIlllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                w wVar = this.H;
                "".length();
                if ((-" ".length()) == "  ".length()) {
                    return null;
                }
                return wVar;
            }
            return this.aa;
        }
        int[] iArr2 = new int[lIIllIIlIlII[0]];
        iArr2[lIIllIIlIlII[1]] = lIIllIIlIlII[5];
        iArr2[lIIllIIlIlII[3]] = lIIllIIlIlII[6];
        if (llIIlllIlIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIllIIlIlII[0]];
            iArr3[lIIllIIlIlII[1]] = lIIllIIlIlII[5];
            iArr3[lIIllIIlIlII[3]] = lIIllIIlIlII[6];
            if (llIIlllIlIIIlI(Equipment.contains(iArr3) ? 1 : 0)) {
                if (llIIlllIlIIIll(Bank.isOpen() ? 1 : 0)) {
                    w wVar2 = this.O;
                    "".length();
                    if ((-" ".length()) > " ".length()) {
                        return null;
                    }
                    return wVar2;
                }
                return this.aa;
            }
        }
        int[] iArr4 = new int[lIIllIIlIlII[0]];
        iArr4[lIIllIIlIlII[1]] = lIIllIIlIlII[5];
        iArr4[lIIllIIlIlII[3]] = lIIllIIlIlII[6];
        if (llIIlllIlIIIll(Inventory.contains(iArr4) ? 1 : 0)) {
            return this.P;
        }
        return null;
    }

    private static void llIIlllIlIIIIl() {
        lIIllIIlIlII = new int[9];
        lIIllIIlIlII[0] = "  ".length();
        lIIllIIlIlII[1] = ((((0 + 148) - 49) + 86) ^ (((129 + 45) - 173) + 135)) & (((131 ^ 167) ^ (183 ^ 162)) ^ (-" ".length()));
        lIIllIIlIlII[2] = (-16385) & 28403;
        lIIllIIlIlII[3] = " ".length();
        lIIllIIlIlII[4] = (-8277) & 32756;
        lIIllIIlIlII[5] = (-((-1838) & 32639)) & (-259) & 32639;
        lIIllIIlIlII[6] = (-5737) & 32767;
        lIIllIIlIlII[7] = (-((-6661) & 31293)) & (-4611) & 29695;
        lIIllIIlIlII[8] = 66 ^ 89;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int f();

    private static boolean llIIlllIlIIIlI(int i) {
        return i == 0;
    }

    private static boolean llIIlllIlIIlII(Object obj) {
        return obj != null;
    }

    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.AbstractC0007h
    public w a(C0014o c0014o) {
        int i;
        w b = b(c0014o);
        if (llIIlllIlIIlII(b)) {
            return b;
        }
        C0017r p = c0014o.p();
        int[] iArr = new int[lIIllIIlIlII[3]];
        iArr[lIIllIIlIlII[1]] = lIIllIIlIlII[7];
        if (llIIlllIlIIlIl(p.a(iArr), lIIllIIlIlII[8] * (f() - c0014o.p().A()))) {
            i = lIIllIIlIlII[3];
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        } else {
            i = lIIllIIlIlII[1];
        }
        int i2 = i;
        int[] iArr2 = new int[lIIllIIlIlII[3]];
        iArr2[lIIllIIlIlII[1]] = lIIllIIlIlII[7];
        if (llIIlllIlIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIllIIlIlII[3]];
            iArr3[lIIllIIlIlII[1]] = c();
            if (!llIIlllIlIIIll(Inventory.contains(iArr3) ? 1 : 0) || !llIIlllIlIIIlI(i2)) {
                if (llIIlllIlIIIll(c0014o.o().F() ? 1 : 0) && llIIlllIlIIIlI(c0014o.k().r() ? 1 : 0)) {
                    return this.G;
                }
                if (llIIlllIlIIIll(c0014o.o().H() ? 1 : 0)) {
                    return this.ac;
                }
                C0017r p2 = c0014o.p();
                int[] iArr4 = new int[lIIllIIlIlII[3]];
                iArr4[lIIllIIlIlII[1]] = e();
                if (llIIlllIlIIIll(p2.b(iArr4) ? 1 : 0)) {
                    return this.ab;
                }
                if (llIIlllIlIIIll(c0014o.m().h() ? 1 : 0)) {
                    C0018s l = c0014o.l();
                    int[] iArr5 = new int[lIIllIIlIlII[0]];
                    iArr5[lIIllIIlIlII[1]] = e();
                    iArr5[lIIllIIlIlII[3]] = c();
                    if (llIIlllIlIIIll(l.b(iArr5) ? 1 : 0)) {
                        return this.Y;
                    }
                    if (llIIlllIlIIIll(c0014o.k().r() ? 1 : 0)) {
                        return this.E;
                    }
                    if (llIIlllIlIIIll(i2)) {
                        return this.I;
                    }
                    C0018s l2 = c0014o.l();
                    int[] iArr6 = new int[lIIllIIlIlII[3]];
                    iArr6[lIIllIIlIlII[1]] = c();
                    if (llIIlllIlIIIlI(l2.b(iArr6) ? 1 : 0)) {
                        return d();
                    }
                }
                return this.aa;
            }
        }
        return this.Z;
    }

    private static boolean llIIlllIlIIIll(int i) {
        return i != 0;
    }

    private static boolean llIIlllIlIIlIl(int i, int i2) {
        return i < i2;
    }

    public abstract int c();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int e();

    static {
        llIIlllIlIIIIl();
    }
}
