package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Opening bank", priority = 50)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.v  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/v.class */
public class v extends j {
    private static /* synthetic */ int[] llIlIlIlIllI;

    static {
        lIIIIIllIIlIIll();
    }

    @Inject
    public v(a aVar, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(aVar, squireGiantsFoundry, squireGiantsConfig);
    }

    private static void lIIIIIllIIlIIll() {
        llIlIlIlIllI = new int[2];
        llIlIlIlIllI[0] = ((((60 + 15) - (-119)) + 31) ^ (((15 + 51) - 16) + 143)) & (((((57 + 129) - 84) + 31) ^ (((125 + 132) - 118) + 26)) ^ (-" ".length()));
        llIlIlIlIllI[1] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j
    public boolean M() {
        if (!lIIIIIllIIlIlII(this.T.g() ? 1 : 0) && !lIIIIIllIIlIlII(this.T.d() ? 1 : 0)) {
            int[] iArr = new int[llIlIlIlIllI[1]];
            iArr[llIlIlIlIllI[0]] = this.V.primaryBar().v();
            if (lIIIIIllIIlIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlIlIllI[1]];
                iArr2[llIlIlIlIllI[0]] = this.V.secondaryBar().v();
                if (lIIIIIllIIlIlIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    return llIlIlIlIllI[0];
                }
            }
            if (lIIIIIllIIlIlII(Bank.isOpen() ? 1 : 0)) {
                Bank.open();
                "".length();
                return llIlIlIlIllI[1];
            }
            return llIlIlIlIllI[0];
        }
        return llIlIlIlIllI[0];
    }

    private static boolean lIIIIIllIIlIlIl(int i) {
        return i != 0;
    }

    private static boolean lIIIIIllIIlIlII(int i) {
        return i == 0;
    }
}
