package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.k  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/k.class */
public class C0062k {
    private static final /* synthetic */ int Y;
    private static final /* synthetic */ int V;
    private static final /* synthetic */ int T;
    private static final /* synthetic */ List<Integer> W;
    private static final /* synthetic */ int X;
    private static final /* synthetic */ int Z;
    private static /* synthetic */ int[] lIlllIlIIlI;
    private static final /* synthetic */ int U;
    private final /* synthetic */ Set<GameObject> aa = new HashSet();
    private final /* synthetic */ Set<NPC> ab = new HashSet();
    private final /* synthetic */ Set<GameObject> ac = new HashSet();

    private static void lIIllIIlIlIlII() {
        lIlllIlIIlI = new int[12];
        lIlllIlIIlI[0] = (-((-10282) & 27693)) & (-17) & 61303;
        lIlllIlIIlI[1] = (-((-3201) & 19613)) & (-3) & 28158;
        lIlllIlIIlI[2] = (-16385) & 28127;
        lIlllIlIIlI[3] = (-((-12289) & 31407)) & (-1) & 65279;
        lIlllIlIIlI[4] = (-20481) & 32210;
        lIlllIlIIlI[5] = (-((-65) & 17775)) & (-4162) & 24047;
        lIlllIlIIlI[6] = (-((-4353) & 5613)) & (-18450) & 65279;
        lIlllIlIIlI[7] = (-((-11473) & 32245)) & (-129) & 65471;
        lIlllIlIIlI[8] = (-((-8193) & 26043)) & (-2114) & 65535;
        lIlllIlIIlI[9] = (-3281) & 48853;
        lIlllIlIIlI[10] = (-((-17926) & 20055)) & (-17537) & 65239;
        lIlllIlIIlI[11] = (-((-11009) & 28601)) & (-65) & 63231;
    }

    public void w() {
        this.aa.clear();
        this.ab.clear();
        this.ac.clear();
    }

    public Set<GameObject> E() {
        return this.ac;
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        this.aa.remove(gameObjectDespawned.getGameObject());
        "".length();
    }

    private static boolean lIIllIIlIlIlIl(int i) {
        return i != 0;
    }

    public Set<NPC> D() {
        return this.ab;
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (lIIllIIlIlIlIl(W.contains(Integer.valueOf(gameObject.getId())) ? 1 : 0)) {
            this.aa.add(gameObject);
            "".length();
        }
        if (lIIllIIlIlIllI(gameObject.getId(), lIlllIlIIlI[0])) {
            this.ac.add(gameObject);
            "".length();
        }
    }

    static {
        lIIllIIlIlIlII();
        T = lIlllIlIIlI[3];
        U = lIlllIlIIlI[4];
        Z = lIlllIlIIlI[1];
        X = lIlllIlIIlI[0];
        Y = lIlllIlIIlI[2];
        V = lIlllIlIIlI[5];
        W = List.of(Integer.valueOf(lIlllIlIIlI[6]), Integer.valueOf(lIlllIlIIlI[7]), Integer.valueOf(lIlllIlIIlI[8]), Integer.valueOf(lIlllIlIIlI[9]), Integer.valueOf(lIlllIlIIlI[10]), Integer.valueOf(lIlllIlIIlI[11]));
    }

    private static boolean lIIllIIlIlIllI(int i, int i2) {
        return i == i2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (lIIllIIlIlIllI(npc.getId(), lIlllIlIIlI[1])) {
            this.ab.add(npc);
            "".length();
        }
        if (lIIllIIlIlIllI(npc.getId(), lIlllIlIIlI[2])) {
            this.ab.add(npc);
            "".length();
        }
    }

    public Set<GameObject> C() {
        return this.aa;
    }
}
