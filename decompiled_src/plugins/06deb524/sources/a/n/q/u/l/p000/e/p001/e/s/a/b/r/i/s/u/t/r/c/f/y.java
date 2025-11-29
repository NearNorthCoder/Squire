package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.Movement;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.y  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/y.class */
public class y extends w {
    private final /* synthetic */ WorldPoint ay;
    private static /* synthetic */ int[] lIIlIlllIIlI;

    private static void llIIllIlIllIIl() {
        lIIlIlllIIlI = new int[1];
        lIIlIlllIIlI[0] = " ".length();
    }

    static {
        llIIllIlIllIIl();
    }

    public WorldPoint L() {
        return this.ay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.w
    public boolean c(C0014o c0014o) {
        Movement.setDestination(this.ay);
        return lIIlIlllIIlI[0];
    }

    public y(String str, WorldPoint worldPoint) {
        super(str);
        this.ay = worldPoint;
    }
}
