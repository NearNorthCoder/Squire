package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

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
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.f  reason: invalid package and case insensitive filesystem */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/f.class */
public class C0005f {
    private final /* synthetic */ Map<Integer, Prayer> o = new HashMap();
    private final /* synthetic */ Client p;
    private static /* synthetic */ int[] lIIlIlIIIIIII;

    private static boolean lIlIlIlIlllIIll(Object obj) {
        return obj == null;
    }

    private static void lIlIlIlIlllIIIl() {
        lIIlIlIIIIIII = new int[1];
        lIIlIlIIIIIII[0] = (((140 + 80) - 122) + 44) ^ (((78 + 34) - 94) + 121);
    }

    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        k a = k.a(projectileSpawned.getProjectile());
        if (lIlIlIlIlllIIll(a)) {
            return;
        }
        a(lIIlIlIIIIIII[0], a.E());
    }

    private void a(int i, Prayer prayer) {
        int tickCount = this.p.getTickCount() + i;
        if (lIlIlIlIlllIIlI(this.o.containsKey(Integer.valueOf(tickCount)) ? 1 : 0) && lIlIlIlIlllIlIl(this.o.get(Integer.valueOf(tickCount)), Prayer.PROTECT_FROM_MAGIC)) {
            return;
        }
        this.o.put(Integer.valueOf(this.p.getTickCount() + i), prayer);
        "".length();
    }

    private static boolean lIlIlIlIlllIlII(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIlIlIlllIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        lIlIlIlIlllIIIl();
    }

    @Inject
    public C0005f(Client client) {
        this.p = client;
    }

    private static boolean lIlIlIlIlllIIlI(int i) {
        return i != 0;
    }

    public Prayer a(int i, boolean z) {
        Prayer prayer;
        Map<Integer, Prayer> map = this.o;
        Integer valueOf = Integer.valueOf(this.p.getTickCount() + i);
        if (lIlIlIlIlllIIlI(z ? 1 : 0)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        } else {
            prayer = Prayer.PROTECT_ITEM;
        }
        return map.getOrDefault(valueOf, prayer);
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC actor = animationChanged.getActor();
        if (lIlIlIlIlllIIlI(actor instanceof Player ? 1 : 0)) {
            return;
        }
        k c = k.c(actor);
        if (lIlIlIlIlllIIll(c) || lIlIlIlIlllIlII(actor.getAnimation(), c.G())) {
            return;
        }
        a(lIIlIlIIIIIII[0], c.E());
    }
}
