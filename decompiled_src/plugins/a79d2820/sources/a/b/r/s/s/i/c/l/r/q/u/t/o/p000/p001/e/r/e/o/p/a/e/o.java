package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
@TaskDesc(name = "Teleporting to house")
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.o  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/o.class */
public class o extends m {
    private static /* synthetic */ int[] lIllIIIIlIll;
    @Inject
    private /* synthetic */ SquireCorp p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if ((!lllIIIllllIIII(this.p.d() ? 1 : 0) || (!lllIIIllllIIIl(g() ? 1 : 0) && !lllIIIllllIIIl(this.p.c() ? 1 : 0) && !lllIIIllllIIIl(this.p.b() ? 1 : 0))) && !lllIIIllllIIIl(l() ? 1 : 0)) {
            TeleportLoader.enterHouse();
            "".length();
            return lIllIIIIlIll[1];
        }
        return lIllIIIIlIll[0];
    }

    static {
        lllIIIlllIllll();
    }

    private static void lllIIIlllIllll() {
        lIllIIIIlIll = new int[2];
        lIllIIIIlIll[0] = ((((125 + 31) - 136) + 113) ^ (((101 + 23) - 60) + 118)) & (((55 ^ 12) ^ (162 ^ 170)) ^ (-" ".length()));
        lIllIIIIlIll[1] = " ".length();
    }

    private static boolean lllIIIllllIIII(int i) {
        return i == 0;
    }

    private static boolean lllIIIllllIIIl(int i) {
        return i != 0;
    }
}
