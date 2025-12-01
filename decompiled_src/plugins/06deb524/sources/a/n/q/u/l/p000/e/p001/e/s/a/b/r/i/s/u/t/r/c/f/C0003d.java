package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/d.class */
public class C0003d extends AbstractC0007h {
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

    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.AbstractC0007h
    public String g() {
        return I.bp;
    }

    static {
        llIIllIlIlIllI();
    }

    private static boolean llIIllIlIllIII(int i) {
        return i == 0;
    }

    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.AbstractC0007h
    public w a(C0014o c0014o) {
        if (llIIllIlIlIlll(c0014o.o().G() ? 1 : 0)) {
            int[] iArr = new int[lIIlIlllIIII[7]];
            iArr[lIIlIlllIIII[1]] = lIIlIlllIIII[8];
            iArr[lIIlIlllIIII[0]] = lIIlIlllIIII[2];
            iArr[lIIlIlllIIII[9]] = lIIlIlllIIII[3];
            iArr[lIIlIlllIIII[10]] = lIIlIlllIIII[4];
            iArr[lIIlIlllIIII[11]] = lIIlIlllIIII[5];
            if (llIIllIlIlIlll(Inventory.contains(iArr) ? 1 : 0)) {
                return this.Y;
            }
        }
        if (!llIIllIlIlIlll(Bank.isOpen() ? 1 : 0) || llIIllIlIlIlll(c0014o.o().G() ? 1 : 0)) {
            return null;
        }
        int[] iArr2 = new int[lIIlIlllIIII[11]];
        iArr2[lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        iArr2[lIIlIlllIIII[0]] = lIIlIlllIIII[3];
        iArr2[lIIlIlllIIII[9]] = lIIlIlllIIII[4];
        iArr2[lIIlIlllIIII[10]] = lIIlIlllIIII[5];
        if (llIIllIlIllIII(Inventory.contains(iArr2) ? 1 : 0) && llIIllIlIlIlll(Inventory.isFull() ? 1 : 0)) {
            return this.Y;
        }
        int[] iArr3 = new int[lIIlIlllIIII[0]];
        iArr3[lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        if (llIIllIlIlIlll(Inventory.contains(iArr3) ? 1 : 0)) {
            return this.z;
        }
        int[] iArr4 = new int[lIIlIlllIIII[0]];
        iArr4[lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        if (llIIllIlIlIlll(Inventory.contains(iArr4) ? 1 : 0)) {
            return this.A;
        }
        int[] iArr5 = new int[lIIlIlllIIII[0]];
        iArr5[lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        if (llIIllIlIlIlll(Inventory.contains(iArr5) ? 1 : 0)) {
            return this.B;
        }
        int[] iArr6 = new int[lIIlIlllIIII[0]];
        iArr6[lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        if (llIIllIlIlIlll(Inventory.contains(iArr6) ? 1 : 0)) {
            return this.C;
        }
        int[] iArr7 = new int[lIIlIlllIIII[0]];
        iArr7[lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        if (llIIllIlIlIlll(Bank.contains(iArr7) ? 1 : 0)) {
            return this.v;
        }
        int[] iArr8 = new int[lIIlIlllIIII[0]];
        iArr8[lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        if (llIIllIlIlIlll(Bank.contains(iArr8) ? 1 : 0)) {
            return this.w;
        }
        int[] iArr9 = new int[lIIlIlllIIII[0]];
        iArr9[lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        if (llIIllIlIlIlll(Bank.contains(iArr9) ? 1 : 0)) {
            return this.x;
        }
        int[] iArr10 = new int[lIIlIlllIIII[0]];
        iArr10[lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        return llIIllIlIlIlll(Bank.contains(iArr10) ? 1 : 0) ? this.y : this.D;
    }

    public C0003d() {
        String str = I.bD;
        int[] iArr = new int[lIIlIlllIIII[0]];
        iArr[lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        this.v = new C0020u(str, iArr);
        String str2 = I.bE;
        int[] iArr2 = new int[lIIlIlllIIII[0]];
        iArr2[lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        this.w = new C0020u(str2, iArr2);
        String str3 = I.bF;
        int[] iArr3 = new int[lIIlIlllIIII[0]];
        iArr3[lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        this.x = new C0020u(str3, iArr3);
        String str4 = I.bG;
        int[] iArr4 = new int[lIIlIlllIIII[0]];
        iArr4[lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        this.y = new C0020u(str4, iArr4);
        String str5 = I.bH;
        int[] iArr5 = new int[lIIlIlllIIII[0]];
        iArr5[lIIlIlllIIII[1]] = lIIlIlllIIII[2];
        this.z = new v(str5, iArr5);
        String str6 = I.bI;
        int[] iArr6 = new int[lIIlIlllIIII[0]];
        iArr6[lIIlIlllIIII[1]] = lIIlIlllIIII[3];
        this.A = new v(str6, iArr6);
        String str7 = I.bJ;
        int[] iArr7 = new int[lIIlIlllIIII[0]];
        iArr7[lIIlIlllIIII[1]] = lIIlIlllIIII[4];
        this.B = new v(str7, iArr7);
        String str8 = I.bK;
        int[] iArr8 = new int[lIIlIlllIIII[0]];
        iArr8[lIIlIlllIIII[1]] = lIIlIlllIIII[5];
        this.C = new v(str8, iArr8);
        String str9 = I.bL;
        int[] iArr9 = new int[lIIlIlllIIII[0]];
        iArr9[lIIlIlllIIII[1]] = lIIlIlllIIII[6];
        this.D = new v(str9, iArr9);
    }

    private static boolean llIIllIlIlIlll(int i) {
        return i != 0;
    }

    private static void llIIllIlIlIllI() {
        lIIlIlllIIII = new int[12];
        lIIlIlllIIII[0] = " ".length();
        lIIlIlllIIII[1] = (3 ^ 16) & ((69 ^ 86) ^ (-1));
        lIIlIlllIIII[2] = (-((-93) & 19581)) & (-641) & 32759;
        lIIlIlllIIII[3] = (-((-20801) & 23017)) & (-16385) & 31229;
        lIIlIlllIIII[4] = (-((-12465) & 29877)) & (-129) & 30167;
        lIIlIlllIIII[5] = (-((-4431) & 8175)) & (-13) & 16381;
        lIIlIlllIIII[6] = (-13) & 12031;
        lIIlIlllIIII[7] = 31 ^ 26;
        lIIlIlllIIII[8] = ((153 + 119) - 186) + 143;
        lIIlIlllIIII[9] = "  ".length();
        lIIlIlllIIII[10] = "   ".length();
        lIIlIlllIIII[11] = 158 ^ 154;
    }
}
