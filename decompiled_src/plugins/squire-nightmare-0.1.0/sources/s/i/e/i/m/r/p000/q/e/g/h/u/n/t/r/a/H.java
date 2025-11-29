package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Walking to bank", priority = 250, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.H  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/H.class */
public class H extends F {
    private static /* synthetic */ int[] lllIlllllIlI;

    private static boolean lIIIlllIIlIllII(int i) {
        return i == 0;
    }

    @Inject
    protected H(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.F, s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIIlllIIlIlIlI(this.cW.ad() ? 1 : 0) && !lIIIlllIIlIlIlI(this.cW.ae() ? 1 : 0) && !lIIIlllIIlIllII(this.cW.s() ? 1 : 0) && !lIIIlllIIlIlIlI(Bank.isOpen() ? 1 : 0) && !lIIIlllIIlIlIlI(cc() ? 1 : 0)) {
            return this.cV.bankLocation().bI().getAsBoolean();
        }
        return lllIlllllIlI[0];
    }

    static {
        lIIIlllIIlIlIII();
    }

    private static void lIIIlllIIlIlIII() {
        lllIlllllIlI = new int[1];
        lllIlllllIlI[0] = (" ".length() ^ (245 ^ 179)) & (((229 ^ 168) ^ (130 ^ 136)) ^ (-" ".length()));
    }

    private static boolean lIIIlllIIlIlIlI(int i) {
        return i != 0;
    }
}
