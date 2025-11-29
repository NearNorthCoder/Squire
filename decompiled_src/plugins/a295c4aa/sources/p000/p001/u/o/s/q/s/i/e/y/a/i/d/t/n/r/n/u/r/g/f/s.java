package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import javax.inject.Inject;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Banking for bars", priority = 150)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.s  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/s.class */
public class s extends j {
    private static /* synthetic */ int[] llIlIllIIIIl;

    private static boolean lIIIIIlllIIIIII(int i) {
        return i != 0;
    }

    static {
        lIIIIIllIlllllI();
    }

    private static void lIIIIIllIlllllI() {
        llIlIllIIIIl = new int[3];
        llIlIllIIIIl[0] = (221 ^ 130) & ((94 ^ 1) ^ (-1));
        llIlIllIIIIl[1] = " ".length();
        llIlIllIIIIl[2] = "  ".length();
    }

    @Inject
    public s(a aVar, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(aVar, squireGiantsFoundry, squireGiantsConfig);
    }

    private static boolean lIIIIIllIllllll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    @Override // p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j
    public boolean M() {
        if (!lIIIIIllIllllll(this.T.g() ? 1 : 0) && !lIIIIIllIllllll(this.T.d() ? 1 : 0) && !lIIIIIllIllllll(Bank.isOpen() ? 1 : 0)) {
            if (lIIIIIlllIIIIII(this.U.b().matchesInventory() ? 1 : 0)) {
                Bank.close();
                return llIlIllIIIIl[1];
            } else if (lIIIIIlllIIIIII(Bank.isOpen() ? 1 : 0)) {
                this.U.b().withdraw();
                "".length();
                sleep(llIlIllIIIIl[2]);
                return llIlIllIIIIl[1];
            } else {
                return llIlIllIIIIl[0];
            }
        }
        return llIlIllIIIIl[0];
    }
}
