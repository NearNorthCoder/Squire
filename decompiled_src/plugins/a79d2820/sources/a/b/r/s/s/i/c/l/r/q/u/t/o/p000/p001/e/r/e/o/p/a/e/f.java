package a.b.r.s.s.i.c.l.r.q.u.t.o.p000.p001.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Drinking boost")
/* renamed from: a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e.f  reason: invalid package */
/* loaded from: a79d2820-2b30-4bed-9aed-0ccb18befd76.jar:a/b/r/s/s/i/c/l/r/q/u/t/o/-/-/e/r/e/o/p/a/e/f.class */
public class f extends a {
    private static /* synthetic */ int[] lIlIlllIIllI;

    private static boolean lllIIIIllIIIIl(Object obj) {
        return obj == null;
    }

    private static void lllIIIIlIlllll() {
        lIlIlllIIllI = new int[1];
        lIlIlllIIllI[0] = ((35 ^ 37) ^ (247 ^ 188)) & (((((210 + 0) - 139) + 145) ^ (((71 + 36) - 36) + 78)) ^ (-" ".length()));
    }

    static {
        lllIIIIlIlllll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    public boolean run() {
        if (!lllIIIIllIIIII(g() ? 1 : 0) && !lllIIIIllIIIIl(Players.getLocal().getInteracting())) {
            return Combat.drinkBoostingPotion(this.o.boostPercentage());
        }
        return lIlIlllIIllI[0];
    }

    private static boolean lllIIIIllIIIII(int i) {
        return i == 0;
    }
}
