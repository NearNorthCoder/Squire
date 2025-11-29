package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

import com.google.inject.Inject;
import gg.squire.quest.SquireTutorialIsland;
import net.unethicalite.api.jsoup.Highscores;
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.C  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/C.class */
public class C implements o {
    private final /* synthetic */ SquireTutorialIsland as;
    private static /* synthetic */ int[] lIlIIlIIlIIlI;

    @Inject
    public C(SquireTutorialIsland squireTutorialIsland) {
        this.as = squireTutorialIsland;
    }

    private static void lIlllIIlIIlIlII() {
        lIlIIlIIlIIlI = new int[2];
        lIlIIlIIlIIlI[0] = (55 ^ 96) & ((242 ^ 165) ^ (-1));
        lIlIIlIIlIIlI[1] = " ".length();
    }

    private static boolean lIlllIIlIIlIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u.o
    public boolean D() {
        if (lIlllIIlIIlIlIl(this.as.c())) {
            return lIlIIlIIlIIlI[0];
        }
        this.as.b(Highscores.getRandomUsername());
        return lIlIIlIIlIIlI[1];
    }

    static {
        lIlllIIlIIlIlII();
    }
}
