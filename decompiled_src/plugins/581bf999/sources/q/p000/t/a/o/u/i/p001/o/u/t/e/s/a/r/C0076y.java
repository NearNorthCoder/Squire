package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.y  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/y.class */
public class C0076y {
    private static /* synthetic */ int[] llIlIlIIIll;
    private static final /* synthetic */ int aQ;
    private /* synthetic */ int aS;
    @Inject
    protected /* synthetic */ Client ai;
    private /* synthetic */ NPC aR;

    private static boolean lIlIIllIlIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    public void h(int i) {
        this.aS = i;
    }

    static {
        lIlIIllIIlllII();
        aQ = llIlIlIIIll[1];
    }

    private static boolean lIlIIllIIlllll(Object obj) {
        return obj == null;
    }

    private static void lIlIIllIIlllII() {
        llIlIlIIIll = new int[2];
        llIlIlIIIll[0] = ((35 ^ 111) ^ (237 ^ 147)) & (((((55 + 87) - 101) + 93) ^ (((176 + 73) - 134) + 65)) ^ (-" ".length()));
        llIlIlIIIll[1] = (-25089) & 32730;
    }

    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        NPC actor = hitsplatApplied.getActor();
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        if (!lIlIIllIIllllI(hitsplat.isMine() ? 1 : 0) || lIlIIllIIlllIl(actor, this.ai.getLocalPlayer())) {
            return;
        }
        NPC npc = actor;
        if (lIlIIllIIlllll(npc) || lIlIIllIlIIIII(this.ai.getLocalPlayer().getAnimation(), llIlIlIIIll[1])) {
            return;
        }
        if (lIlIIllIlIIIIl(this.aR, npc)) {
            this.aR = npc;
            this.aS = llIlIlIIIll[0];
        }
        this.aS += hitsplat.getAmount();
    }

    private static boolean lIlIIllIIlllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIllIIllllI(int i) {
        return i != 0;
    }

    public int b(NPC npc) {
        return lIlIIllIIlllIl(npc, this.aR) ? this.aS : llIlIlIIIll[0];
    }

    private static boolean lIlIIllIlIIIII(int i, int i2) {
        return i != i2;
    }

    public int ah() {
        return this.aS;
    }
}
