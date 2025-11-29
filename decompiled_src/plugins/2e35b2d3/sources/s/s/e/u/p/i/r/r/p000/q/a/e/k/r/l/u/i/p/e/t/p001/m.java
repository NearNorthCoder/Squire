package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.unethicalite.api.game.House;
@TaskDesc(name = "Restoring from pool", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.m  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/m.class */
public class m extends Task {
    private final /* synthetic */ Client J;
    private static /* synthetic */ int[] lIlIIlIlIIIll;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (!lIlllIlIlllIlll(House.isInside() ? 1 : 0) && !lIlllIlIlllIlll(House.isPoolDrinkUseful() ? 1 : 0)) {
            return House.drinkFromPool();
        }
        return lIlIIlIlIIIll[0];
    }

    private static void lIlllIlIlllIllI() {
        lIlIIlIlIIIll = new int[1];
        lIlIIlIlIIIll[0] = (103 ^ 54) & ((122 ^ 43) ^ (-1));
    }

    @Inject
    public m(Client client) {
        this.J = client;
    }

    static {
        lIlllIlIlllIllI();
    }

    private static boolean lIlllIlIlllIlll(int i) {
        return i == 0;
    }
}
