package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.az  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/az.class */
public abstract class AbstractC0026az extends Task {
    protected /* synthetic */ WorldPoint cy = new WorldPoint(lIlIllIIIIIl[0], lIlIllIIIIIl[1], lIlIllIIIIIl[2]);
    @Inject
    protected /* synthetic */ SquireChambersConfig k;
    @Inject
    protected /* synthetic */ SquireChambersPlugin v;
    private static /* synthetic */ int[] lIlIllIIIIIl;
    @Inject
    protected /* synthetic */ Client u;

    protected abstract boolean cg();

    private static boolean llIllllllIIlll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    public boolean run() {
        if (!llIllllllIIlll(this.k.pause() ? 1 : 0) && !llIllllllIIlll(this.u.isInInstancedRegion() ? 1 : 0)) {
            return cg();
        }
        return lIlIllIIIIIl[2];
    }

    private static void llIllllllIIllI() {
        lIlIllIIIIIl = new int[3];
        lIlIllIIIIIl[0] = (-6945) & 8190;
        lIlIllIIIIIl[1] = (-16389) & 19950;
        lIlIllIIIIIl[2] = (10 ^ 28) & ((80 ^ 70) ^ (-1));
    }

    static {
        llIllllllIIllI();
    }
}
