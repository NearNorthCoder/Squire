package p000.r.u.q.e.s.o.t.a.i;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: -.r.u.q.e.s.o.t.a.i.f  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/f.class */
public class C0005f {
    private static /* synthetic */ int[] lIlIIIIIIllII;
    private final /* synthetic */ List<NPC> w = new ArrayList();
    public static final /* synthetic */ int v;

    private static void lIllIlIlllllIIl() {
        lIlIIIIIIllII = new int[1];
        lIlIIIIIIllII[0] = (-((-12005) & 28669)) & (-4097) & 32543;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (lIllIlIlllllIlI(npc.getId(), lIlIIIIIIllII[0])) {
            this.w.add(npc);
            "".length();
        }
    }

    public void c() {
        this.w.clear();
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        NPC npc = npcDespawned.getNpc();
        if (lIllIlIlllllIlI(npc.getId(), lIlIIIIIIllII[0])) {
            this.w.remove(npc);
            "".length();
        }
    }

    private static boolean lIllIlIlllllIlI(int i, int i2) {
        return i == i2;
    }

    public List<NPC> e() {
        return this.w;
    }

    static {
        lIllIlIlllllIIl();
        v = lIlIIIIIIllII[0];
    }
}
