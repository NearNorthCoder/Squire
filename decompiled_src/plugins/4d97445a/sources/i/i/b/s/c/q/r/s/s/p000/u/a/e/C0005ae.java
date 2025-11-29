package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Map;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.runelite.api.events.AnimationChanged;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ae  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ae.class */
public class C0005ae {
    private static /* synthetic */ int[] lIllIlIl;
    private final /* synthetic */ Map<Integer, Prayer> cG = new HashMap();
    private final /* synthetic */ Client cH;

    private static boolean lIlIIIIllI(int i2) {
        return i2 != 0;
    }

    private static boolean lIlIIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC actor = animationChanged.getActor();
        if (lIlIIIIllI(actor instanceof Player ? 1 : 0)) {
            return;
        }
        Z h = Z.h(actor);
        if (lIlIIIIlll(h) || lIlIIIlIII(actor.getAnimation(), h.ba())) {
            return;
        }
        if (lIlIIIlIIl(h.P(), lIllIlIl[0])) {
            System.out.println(h.aZ());
            a(lIllIlIl[1], h.aZ());
        }
        if (!lIlIIIlIIl(h.P(), lIllIlIl[2])) {
            a(lIllIlIl[3], h.aZ());
            return;
        }
        a(lIllIlIl[1], h.aZ());
        "".length();
        if (0 != 0) {
        }
    }

    private static void lIlIIIIlIl() {
        lIllIlIl = new int[4];
        lIllIlIl[0] = (126 ^ 108) ^ (223 ^ 165);
        lIllIlIl[1] = (5 ^ 13) & ((164 ^ 172) ^ (-1));
        lIllIlIl[2] = (-12321) & 14587;
        lIllIlIl[3] = 117 ^ 113;
    }

    private static boolean lIlIIIlIIl(int i2, int i3) {
        return i2 == i3;
    }

    @Inject
    public C0005ae(Client client) {
        this.cH = client;
    }

    public Prayer a(int i2, boolean z) {
        Prayer prayer;
        Map<Integer, Prayer> map = this.cG;
        Integer valueOf = Integer.valueOf(this.cH.getTickCount() + i2);
        if (lIlIIIIllI(z ? 1 : 0)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
            "".length();
            if ((0 ^ 4) < " ".length()) {
                return null;
            }
        } else {
            prayer = Prayer.PROTECT_ITEM;
        }
        return map.getOrDefault(valueOf, prayer);
    }

    private static boolean lIlIIIlIII(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlIIIIlll(Object obj) {
        return obj == null;
    }

    private void a(int i2, Prayer prayer) {
        int tickCount = this.cH.getTickCount() + i2;
        if (lIlIIIIllI(this.cG.containsKey(Integer.valueOf(tickCount)) ? 1 : 0) && lIlIIIlIlI(this.cG.get(Integer.valueOf(tickCount)), Prayer.PROTECT_FROM_MISSILES)) {
            return;
        }
        this.cG.put(Integer.valueOf(this.cH.getTickCount() + i2), prayer);
        "".length();
    }

    static {
        lIlIIIIlIl();
    }
}
