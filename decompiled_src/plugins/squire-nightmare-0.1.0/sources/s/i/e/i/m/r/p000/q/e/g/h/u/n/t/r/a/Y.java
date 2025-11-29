package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.Y  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/Y.class */
public abstract class Y extends D {
    private static /* synthetic */ int[] llllIIIllIII;

    static {
        lIIIllllIIlIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean run() {
        if (!lIIIllllIIlIIlI(this.cW.ad() ? 1 : 0) && !lIIIllllIIlIIll(Static.getClient().isInInstancedRegion() ? 1 : 0) && !lIIIllllIIlIlII(Players.getLocal().getWorldLocation().getPlane(), llllIIIllIII[1])) {
            return bY();
        }
        return llllIIIllIII[0];
    }

    private static void lIIIllllIIlIIIl() {
        llllIIIllIII = new int[2];
        llllIIIllIII[0] = (148 ^ 156) & ((184 ^ 176) ^ (-1));
        llllIIIllIII[1] = "   ".length();
    }

    private static boolean lIIIllllIIlIIll(int i) {
        return i != 0;
    }

    private static boolean lIIIllllIIlIIlI(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Inject
    public Y(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static boolean lIIIllllIIlIlII(int i, int i2) {
        return i == i2;
    }

    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public abstract boolean bY();
}
