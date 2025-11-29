package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import net.runelite.api.NPC;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.j  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/j.class */
public class C0061j {
    private final /* synthetic */ List<NPC> S = new ArrayList();
    private static /* synthetic */ int[] llIIlIlIIII;
    public static final /* synthetic */ int R;

    public void w() {
        this.S.clear();
    }

    private static void lIlIIIIIlIllIl() {
        llIIlIlIIII = new int[1];
        llIIlIlIIII[0] = (-((-8215) & 12415)) & (-16657) & 32639;
    }

    public List<NPC> B() {
        return this.S;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        NPC npc = npcDespawned.getNpc();
        if (lIlIIIIIlIlllI(npc.getId(), llIIlIlIIII[0])) {
            this.S.remove(npc);
            "".length();
        }
    }

    private static boolean lIlIIIIIlIlllI(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (lIlIIIIIlIlllI(npc.getId(), llIIlIlIIII[0])) {
            this.S.add(npc);
            "".length();
        }
    }

    static {
        lIlIIIIIlIllIl();
        R = llIIlIlIIII[0];
    }
}
