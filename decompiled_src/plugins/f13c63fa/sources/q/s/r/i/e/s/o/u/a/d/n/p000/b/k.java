package q.s.r.i.e.s.o.u.a.d.n.p000.b;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: q.s.r.i.e.s.o.u.a.d.n.-.b.k  reason: invalid package */
/* loaded from: f13c63fa-3e76-4035-9dfa-e833a382cd4c.jar:q/s/r/i/e/s/o/u/a/d/n/-/b/k.class */
public class k {
    private final /* synthetic */ Client C;
    private static /* synthetic */ int[] llIlllIllll;
    private final /* synthetic */ Map<Integer, Prayer> B = new HashMap();

    private static boolean lIlIlIlllIlllI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIlIlllIllII(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        b a = b.a(projectileSpawned.getProjectile());
        if (lIlIlIlllIllIl(a)) {
            return;
        }
        a(llIlllIllll[0], a.e());
    }

    private static void lIlIlIlllIlIll() {
        llIlllIllll = new int[1];
        llIlllIllll[0] = (67 ^ 85) ^ (36 ^ 55);
    }

    @Inject
    public k(Client client) {
        this.C = client;
    }

    public Prayer a(int i, boolean z) {
        Prayer prayer;
        Map<Integer, Prayer> map = this.B;
        Integer valueOf = Integer.valueOf(this.C.getTickCount() + i);
        if (lIlIlIlllIllII(z ? 1 : 0)) {
            prayer = Prayer.PROTECT_FROM_MISSILES;
            "".length();
            if ((((((78 + 45) - 37) + 50) ^ (((22 + 30) - (-50)) + 47)) & (((((148 + 135) - 145) + 39) ^ (((117 + 102) - 196) + 149)) ^ (-" ".length()))) != 0) {
                return null;
            }
        } else {
            prayer = Prayer.PROTECT_ITEM;
        }
        return map.getOrDefault(valueOf, prayer);
    }

    static {
        lIlIlIlllIlIll();
    }

    private static boolean lIlIlIlllIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC actor = animationChanged.getActor();
        if (lIlIlIlllIllII(actor instanceof Player ? 1 : 0)) {
            return;
        }
        b a = b.a(actor);
        if (lIlIlIlllIllIl(a) || lIlIlIlllIlllI(actor.getAnimation(), a.g())) {
            return;
        }
        a(llIlllIllll[0], a.e());
    }

    private static boolean lIlIlIlllIllIl(Object obj) {
        return obj == null;
    }

    private void a(int i, Prayer prayer) {
        int tickCount = this.C.getTickCount() + i;
        if (lIlIlIlllIllII(this.B.containsKey(Integer.valueOf(tickCount)) ? 1 : 0) && lIlIlIlllIllll(this.B.get(Integer.valueOf(tickCount)), Prayer.PROTECT_FROM_MISSILES)) {
            return;
        }
        this.B.put(Integer.valueOf(this.C.getTickCount() + i), prayer);
        "".length();
    }
}
