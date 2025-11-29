package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import javax.inject.Inject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walk to Grand Exchange", priority = 15837, blocking = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.U  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/U.class */
public class U extends S {
    private final /* synthetic */ WorldArea du;
    private static /* synthetic */ int[] llllIIlIlIIl;

    static {
        lIIIlllllIIIlIl();
    }

    @Inject
    protected U(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, C0011h c0011h) {
        super(squireNightmareConfig, squireNightmarePlugin, c0011h);
        this.du = S.ds;
    }

    private static boolean lIIIlllllIIIlll(int i) {
        return i != 0;
    }

    private static boolean lIIIlllllIIIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlllllIIlIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.S
    public boolean ci() {
        if (!lIIIlllllIIIllI(Players.getLocal()) && !lIIIlllllIIIlll(cn() ? 1 : 0) && !lIIIlllllIIlIII(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo(this.du.getCenter());
            "".length();
            return llllIIlIlIIl[1];
        }
        return llllIIlIlIIl[0];
    }

    private static void lIIIlllllIIIlIl() {
        llllIIlIlIIl = new int[2];
        llllIIlIlIIl[0] = (240 ^ 181) & ((204 ^ 137) ^ (-1));
        llllIIlIlIIl[1] = " ".length();
    }
}
