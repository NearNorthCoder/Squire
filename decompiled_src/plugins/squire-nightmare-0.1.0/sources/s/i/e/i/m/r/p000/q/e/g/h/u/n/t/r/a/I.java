package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import net.unethicalite.api.items.Bank;
@TaskDesc(name = "Opening bank", priority = 500, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.I  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/I.class */
public class I extends F {
    private static /* synthetic */ int[] lllIllIllIII;

    @Inject
    protected I(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static boolean lIIIllIlIlIIlIl(int i) {
        return i == 0;
    }

    private static void lIIIllIlIlIIIll() {
        lllIllIllIII = new int[1];
        lllIllIllIII[0] = ((4 ^ 0) ^ (51 ^ 16)) & (((233 ^ 162) ^ (104 ^ 4)) ^ (-" ".length()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.F, s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIIllIlIlIIlII(this.cW.ae() ? 1 : 0) && !lIIIllIlIlIIlIl(cc() ? 1 : 0) && !lIIIllIlIlIIlII(Bank.isOpen() ? 1 : 0) && !lIIIllIlIlIIlIl(ce().needsToBank() ? 1 : 0)) {
            return this.cV.bankLocation().bK().getAsBoolean();
        }
        return lllIllIllIII[0];
    }

    private static boolean lIIIllIlIlIIlII(int i) {
        return i != 0;
    }

    static {
        lIIIllIlIlIIIll();
    }
}
