package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;
@TaskDesc(name = "Logging out before 6h timer", priority = 2147482309, blocking = true, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.aC  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/aC.class */
public class aC extends D {
    private static /* synthetic */ int[] llllIlllIIlI;

    private static void lIIlIIIlllIlIll() {
        llllIlllIIlI = new int[2];
        llllIlllIIlI[0] = ((30 ^ 74) ^ (86 ^ 92)) & (((41 ^ 17) ^ (50 ^ 84)) ^ (-" ".length()));
        llllIlllIIlI[1] = " ".length();
    }

    @Inject
    protected aC(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
    }

    private static boolean lIIlIIIlllIllII(int i) {
        return i == 0;
    }

    static {
        lIIlIIIlllIlIll();
    }

    private static boolean lIIlIIIlllIllIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.D
    public boolean bY() {
        if (!lIIlIIIlllIllII(this.cW.G() ? 1 : 0) && !lIIlIIIlllIllIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            Game.logout();
            return llllIlllIIlI[1];
        }
        return llllIlllIIlI[0];
    }
}
