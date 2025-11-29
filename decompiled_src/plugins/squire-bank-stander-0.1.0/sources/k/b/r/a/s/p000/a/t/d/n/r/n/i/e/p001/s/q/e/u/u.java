package k.b.r.a.s.p000.a.t.d.n.r.n.i.e.p001.s.q.e.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.SquireBankStander;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.StatChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
@TaskDesc(name = "Inactivity Tracker", priority = Integer.MAX_VALUE, register = true)
/* renamed from: k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.u  reason: invalid package */
/* loaded from: squire-bank-stander-0.1.0.jar:k/b/r/a/s/-/a/t/d/n/r/n/i/e/-/s/q/e/u/u.class */
public class u extends Task {
    private final /* synthetic */ SquireBankStander r;
    private static /* synthetic */ int[] lllIIllIlll;

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (lIlIlllIlIIlII(animationChanged.getActor(), Players.getLocal()) || lIlIlllIlIIlIl(animationChanged.getActor().getAnimation(), lllIIllIlll[0])) {
            return;
        }
        this.r.c(lllIIllIlll[1]);
    }

    private static void lIlIlllIlIIIll() {
        lllIIllIlll = new int[3];
        lllIIllIlll[0] = -" ".length();
        lllIIllIlll[1] = (137 ^ 184) & ((119 ^ 70) ^ (-1));
        lllIIllIlll[2] = " ".length();
    }

    private static boolean lIlIlllIlIIlll(int i, int i2) {
        return i != i2;
    }

    @Subscribe
    public void a(StatChanged statChanged) {
        this.r.c(lllIIllIlll[1]);
    }

    static {
        lIlIlllIlIIIll();
    }

    private static boolean lIlIlllIlIIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean run() {
        Player local = Players.getLocal();
        if (lIlIlllIlIIllI(local)) {
            return lllIIllIlll[1];
        }
        if (lIlIlllIlIIlll(local.getAnimation(), lllIIllIlll[0])) {
            this.r.c(lllIIllIlll[1]);
        }
        return lllIIllIlll[1];
    }

    @Inject
    public u(SquireBankStander squireBankStander) {
        this.r = squireBankStander;
    }

    private static boolean lIlIlllIlIIllI(Object obj) {
        return obj == null;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.r.c(this.r.e() + lllIIllIlll[2]);
    }

    private static boolean lIlIlllIlIIlIl(int i, int i2) {
        return i == i2;
    }
}
