package m.e.a.i.z.m.r.p000.q.s.y.u;

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
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.k  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/k.class */
public class k {
    private final /* synthetic */ Map<Integer, Prayer> u = new HashMap();
    private final /* synthetic */ Client v;
    private static /* synthetic */ int[] lIllIIlIIllIl;

    private static boolean llIIIlIlllllIIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIIlIlllllIII(int i) {
        return i != 0;
    }

    private static void llIIIlIllllIlll() {
        lIllIIlIIllIl = new int[1];
        lIllIIlIIllIl[0] = 35 ^ 38;
    }

    @Inject
    public k(Client client) {
        this.v = client;
    }

    static {
        llIIIlIllllIlll();
    }

    private static boolean llIIIlIlllllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    public Prayer a(int i, boolean z) {
        Prayer prayer;
        Map<Integer, Prayer> map = this.u;
        Integer valueOf = Integer.valueOf(this.v.getTickCount() + i);
        if (llIIIlIlllllIII(z ? 1 : 0)) {
            prayer = Prayer.PROTECT_FROM_MISSILES;
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
    public void a(ProjectileSpawned projectileSpawned) {
        EnumC0004e a = EnumC0004e.a(projectileSpawned.getProjectile());
        if (llIIIlIlllllIIl(a)) {
            return;
        }
        a(lIllIIlIIllIl[0], a.o());
    }

    private static boolean llIIIlIlllllIlI(int i, int i2) {
        return i != i2;
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC actor = animationChanged.getActor();
        if (llIIIlIlllllIII(actor instanceof Player ? 1 : 0)) {
            return;
        }
        EnumC0004e a = EnumC0004e.a(actor);
        if (llIIIlIlllllIIl(a) || llIIIlIlllllIlI(actor.getAnimation(), a.q())) {
            return;
        }
        a(lIllIIlIIllIl[0], a.o());
    }

    private void a(int i, Prayer prayer) {
        int tickCount = this.v.getTickCount() + i;
        if (llIIIlIlllllIII(this.u.containsKey(Integer.valueOf(tickCount)) ? 1 : 0) && llIIIlIlllllIll(this.u.get(Integer.valueOf(tickCount)), Prayer.PROTECT_FROM_MISSILES)) {
            return;
        }
        this.u.put(Integer.valueOf(this.v.getTickCount() + i), prayer);
        "".length();
    }
}
