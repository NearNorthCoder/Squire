package p000.r.u.q.e.s.o.t.a.i;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
@Singleton
/* renamed from: -.r.u.q.e.s.o.t.a.i.h  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/h.class */
public class C0007h {
    public static final /* synthetic */ int H;
    private /* synthetic */ int Q;
    private /* synthetic */ GameObject P;
    @Inject
    private /* synthetic */ Client M;
    private static final /* synthetic */ int I;
    private static /* synthetic */ int[] lIlIIIIIlIIlI;
    private /* synthetic */ int N;
    private /* synthetic */ NPC O;
    private final /* synthetic */ Queue<EnumC0008i> J = new LinkedList();
    private final /* synthetic */ Set<TileObject> K = new HashSet();
    private final /* synthetic */ List<NPC> L = new ArrayList();

    private static boolean lIllIllIIIlIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (!lIllIllIIIIllIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[8]) || !lIllIllIIIIllIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[9]) || lIllIllIIIlIIIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[10])) {
            this.O = npcSpawned.getNpc();
            this.J.clear();
        }
        if (lIllIllIIIlIIIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[11])) {
            this.L.add(npcSpawned.getNpc());
            "".length();
        }
    }

    public Queue<EnumC0008i> i() {
        return this.J;
    }

    private static boolean lIllIllIIIlIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIllIllIIIlIIIl(int i, int i2) {
        return i == i2;
    }

    public Set<TileObject> j() {
        return this.K;
    }

    private static boolean lIllIllIIIIllII(int i) {
        return i > 0;
    }

    public void c() {
        Set<TileObject> set = this.K;
        int[] iArr = new int[lIlIIIIIlIIlI[0]];
        iArr[lIlIIIIIlIIlI[1]] = lIlIIIIIlIIlI[2];
        set.addAll(TileObjects.getAll(iArr));
        "".length();
    }

    private static boolean lIllIllIIIIlllI(int i, int i2) {
        return i > i2;
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        WorldPoint fromLocal = WorldPoint.fromLocal(this.M, graphicsObjectCreated.getGraphicsObject().getLocation());
        if (lIllIllIIIIllII(Players.getAll(player -> {
            if (lIllIllIIIlIlII(player.getWorldLocation().distanceTo(fromLocal), lIlIIIIIlIIlI[12])) {
                ?? r0 = lIlIIIIIlIIlI[0];
                "".length();
                return " ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIlIIIIIlIIlI[1];
        }).size())) {
            return;
        }
        int tickCount = this.M.getTickCount();
        int id = graphicsObjectCreated.getGraphicsObject().getId();
        if ((lIllIllIIIIllIl(id, lIlIIIIIlIIlI[3]) && lIllIllIIIIllIl(id, lIlIIIIIlIIlI[4]) && lIllIllIIIIllIl(id, lIlIIIIIlIIlI[5]) && lIllIllIIIIllIl(id, lIlIIIIIlIIlI[6])) || !lIllIllIIIIlllI(tickCount - this.N, lIlIIIIIlIIlI[0]) || lIllIllIIIIllll(tickCount - this.Q, lIlIIIIIlIIlI[0])) {
            return;
        }
        this.N = tickCount;
        if (lIllIllIIIlIIII(this.J.isEmpty() ? 1 : 0)) {
            this.J.remove();
            "".length();
        }
    }

    private static boolean lIllIllIIIlIlII(int i, int i2) {
        return i < i2;
    }

    public NPC l() {
        return this.O;
    }

    private static boolean lIllIllIIIIllIl(int i, int i2) {
        return i != i2;
    }

    static {
        lIllIllIIIIlIll();
        I = lIlIIIIIlIIlI[2];
        H = lIlIIIIIlIIlI[7];
    }

    public List<NPC> k() {
        return this.L;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIllIllIIIlIIll(gameStateChanged.getGameState(), GameState.LOADING)) {
            c();
        }
    }

    private static boolean lIllIllIIIlIIII(int i) {
        return i == 0;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIllIllIIIlIIIl(npcDespawned.getNpc().getId(), lIlIIIIIlIIlI[11])) {
            this.L.remove(npcDespawned.getNpc());
            "".length();
        }
    }

    private static boolean lIllIllIIIIllll(int i, int i2) {
        return i <= i2;
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (lIllIllIIIlIIIl(gameObject.getId(), lIlIIIIIlIIlI[2])) {
            this.K.remove(gameObject);
            "".length();
        }
        if (lIllIllIIIlIIIl(gameObject.getId(), lIlIIIIIlIIlI[7])) {
            this.P = null;
        }
    }

    private static void lIllIllIIIIlIll() {
        lIlIIIIIlIIlI = new int[13];
        lIlIIIIIlIIlI[0] = " ".length();
        lIlIIIIIlIIlI[1] = ((74 ^ 71) ^ (19 ^ 35)) & (((247 ^ 155) ^ (145 ^ 192)) ^ (-" ".length()));
        lIlIIIIIlIIlI[2] = (-16945) & 62399;
        lIlIIIIIlIIlI[3] = (-((-16529) & 30129)) & (-521) & 16379;
        lIlIIIIIlIIlI[4] = (-((-24995) & 29615)) & (-1) & 6878;
        lIlIIIIIlIIlI[5] = (-((-2249) & 26827)) & (-4901) & 31735;
        lIlIIIIIlIIlI[6] = (-13350) & 15605;
        lIlIIIIIlIIlI[7] = (-1635) & 47102;
        lIlIIIIIlIIlI[8] = (-((-12037) & 32597)) & (-289) & 32638;
        lIlIIIIIlIIlI[9] = (-((-2603) & 19435)) & (-1) & 28623;
        lIlIIIIIlIIlI[10] = (-16580) & 28371;
        lIlIIIIIlIIlI[11] = (-((-15541) & 32503)) & (-1) & 28670;
        lIlIIIIIlIIlI[12] = 3 ^ 5;
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        TileObject gameObject = gameObjectSpawned.getGameObject();
        if (lIllIllIIIlIIIl(gameObject.getId(), lIlIIIIIlIIlI[2])) {
            this.K.add(gameObject);
            "".length();
        }
        EnumC0008i a = EnumC0008i.a(gameObject.getId());
        if (lIllIllIIIlIIlI(a)) {
            this.J.add(a);
            "".length();
            this.Q = this.M.getTickCount();
        }
        if (lIllIllIIIlIIIl(gameObject.getId(), lIlIIIIIlIIlI[7])) {
            this.P = gameObject;
        }
    }
}
