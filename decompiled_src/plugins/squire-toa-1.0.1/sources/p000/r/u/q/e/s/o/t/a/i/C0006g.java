package p000.r.u.q.e.s.o.t.a.i;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
/* renamed from: -.r.u.q.e.s.o.t.a.i.g  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/g.class */
public class C0006g {
    private static final /* synthetic */ int D;
    private static final /* synthetic */ int z;
    private static final /* synthetic */ int B;
    private static final /* synthetic */ int y;
    private static final /* synthetic */ int x;
    private static final /* synthetic */ int C;
    private static final /* synthetic */ List<Integer> A;
    private static /* synthetic */ int[] lIIllllIIllll;
    private final /* synthetic */ Set<GameObject> E = new HashSet();
    private final /* synthetic */ Set<NPC> F = new HashSet();
    private final /* synthetic */ Set<GameObject> G = new HashSet();

    public Set<NPC> g() {
        return this.F;
    }

    public Set<GameObject> h() {
        return this.G;
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        this.E.remove(gameObjectDespawned.getGameObject());
        "".length();
    }

    static {
        lIllIlIIlIIlIII();
        D = lIIllllIIllll[1];
        x = lIIllllIIllll[3];
        B = lIIllllIIllll[0];
        C = lIIllllIIllll[2];
        y = lIIllllIIllll[4];
        z = lIIllllIIllll[5];
        A = List.of(Integer.valueOf(lIIllllIIllll[6]), Integer.valueOf(lIIllllIIllll[7]), Integer.valueOf(lIIllllIIllll[8]), Integer.valueOf(lIIllllIIllll[9]), Integer.valueOf(lIIllllIIllll[10]), Integer.valueOf(lIIllllIIllll[11]));
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (lIllIlIIlIIlIIl(A.contains(Integer.valueOf(gameObject.getId())) ? 1 : 0)) {
            this.E.add(gameObject);
            "".length();
        }
        if (lIllIlIIlIIlIlI(gameObject.getId(), lIIllllIIllll[0])) {
            this.G.add(gameObject);
            "".length();
        }
    }

    private static void lIllIlIIlIIlIII() {
        lIIllllIIllll = new int[12];
        lIIllllIIllll[0] = (-((-8481) & 30124)) & (-1) & 65519;
        lIIllllIIllll[1] = (-(86 ^ 94)) & (-21009) & 32759;
        lIIllllIIllll[2] = (-20993) & 32735;
        lIIllllIIllll[3] = (-((-24649) & 26863)) & (-16649) & 65023;
        lIIllllIIllll[4] = (-((-19465) & 20013)) & (-10) & 12287;
        lIIllllIIllll[5] = (-((-17057) & 29433)) & (-547) & 15098;
        lIIllllIIllll[6] = (-(124 ^ 57)) & (-3225) & 48862;
        lIIllllIIllll[7] = (-4101) & 48671;
        lIIllllIIllll[8] = (-1082) & 46653;
        lIIllllIIllll[9] = (-((-10789) & 12149)) & (-16513) & 63445;
        lIIllllIIllll[10] = (-1) & 45574;
        lIIllllIIllll[11] = (-((-523) & 19435)) & (-9) & 64495;
    }

    private static boolean lIllIlIIlIIlIlI(int i, int i2) {
        return i == i2;
    }

    public void c() {
        this.E.clear();
        this.F.clear();
        this.G.clear();
    }

    private static boolean lIllIlIIlIIlIIl(int i) {
        return i != 0;
    }

    public Set<GameObject> f() {
        return this.E;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (lIllIlIIlIIlIlI(npc.getId(), lIIllllIIllll[1])) {
            this.F.add(npc);
            "".length();
        }
        if (lIllIlIIlIIlIlI(npc.getId(), lIIllllIIllll[2])) {
            this.F.add(npc);
            "".length();
        }
    }
}
