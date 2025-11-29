package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Singleton;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/i.class */
public class C0060i {
    private static final /* synthetic */ int L;
    private static /* synthetic */ int[] llIIIlIlIlI;
    private static final /* synthetic */ int K;
    private final /* synthetic */ List<GraphicsObject> M = new ArrayList();
    private final /* synthetic */ Map<WorldPoint, Integer> N = new HashMap();
    private final /* synthetic */ Map<WorldPoint, GraphicsObject> O = new HashMap();
    private final /* synthetic */ Map<WorldPoint, GraphicsObject> P = new HashMap();
    private /* synthetic */ int Q = llIIIlIlIlI[0];

    public Map<WorldPoint, Integer> y() {
        return this.N;
    }

    static {
        lIIllllIIIIlIl();
        K = llIIIlIlIlI[5];
        L = llIIIlIlIlI[6];
    }

    @Subscribe
    public void a(GameTick gameTick) {
        for (WorldPoint worldPoint : this.N.keySet()) {
            if (lIIllllIIIlIIl(Static.getClient().getTickCount() - this.N.get(worldPoint).intValue(), llIIIlIlIlI[8])) {
                this.N.remove(worldPoint);
                "".length();
            }
            "".length();
            if ("  ".length() > ((99 ^ 3) ^ (77 ^ 41))) {
                return;
            }
        }
    }

    public Map<WorldPoint, GraphicsObject> A() {
        return this.P;
    }

    private static boolean lIIllllIIIlIII(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        this.N.clear();
    }

    public Map<WorldPoint, GraphicsObject> z() {
        return this.O;
    }

    private static boolean lIIllllIIIIllI(int i, int i2) {
        return i != i2;
    }

    private static void lIIllllIIIIlIl() {
        llIIIlIlIlI = new int[9];
        llIIIlIlIlI[0] = ((((45 + 172) - 142) + 140) ^ (((123 + 93) - 35) + 2)) & (((98 ^ 51) ^ (82 ^ 99)) ^ (-" ".length()));
        llIIIlIlIlI[1] = (-((-1409) & 30676)) & (-1281) & 32767;
        llIIIlIlIlI[2] = (-((-10353) & 31603)) & (-8273) & 31743;
        llIIIlIlIlI[3] = (-((-4266) & 30379)) & (-4417) & 32751;
        llIIIlIlIlI[4] = (-((-37) & 30581)) & (-1) & 32767;
        llIIIlIlIlI[5] = (-28762) & 30207;
        llIIIlIlIlI[6] = (-28965) & 31215;
        llIIIlIlIlI[7] = (-((-9105) & 25531)) & (-513) & 26623;
        llIIIlIlIlI[8] = 106 ^ 98;
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        NPC actor = animationChanged.getActor();
        if (lIIllllIIIlIII(actor instanceof Player ? 1 : 0) || lIIllllIIIIlll(actor.getAnimation(), llIIIlIlIlI[7])) {
            return;
        }
        this.M.clear();
    }

    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        int id = graphicsObject.getId();
        if (!lIIllllIIIIllI(id, llIIIlIlIlI[1]) || !lIIllllIIIIllI(id, llIIIlIlIlI[2]) || !lIIllllIIIIllI(id, llIIIlIlIlI[3]) || lIIllllIIIIlll(id, llIIIlIlIlI[4])) {
            this.M.add(graphicsObject);
            "".length();
        }
        if (!lIIllllIIIIlll(id, llIIIlIlIlI[5])) {
            if (lIIllllIIIIlll(id, llIIIlIlIlI[6])) {
                this.O.put(WorldPoint.fromLocal(Static.getClient(), graphicsObject.getLocation()), graphicsObject);
                "".length();
                return;
            }
            return;
        }
        WorldPoint fromLocal = WorldPoint.fromLocal(Static.getClient(), graphicsObject.getLocation());
        this.N.put(fromLocal, Integer.valueOf(Static.getClient().getTickCount()));
        "".length();
        this.P.put(fromLocal, graphicsObject);
        "".length();
        "".length();
        if ((-"   ".length()) > 0) {
        }
    }

    private static boolean lIIllllIIIlIIl(int i, int i2) {
        return i > i2;
    }

    public void w() {
        this.Q = llIIIlIlIlI[0];
        this.M.clear();
        this.N.clear();
        this.O.clear();
    }

    public List<GraphicsObject> x() {
        return this.M;
    }

    private static boolean lIIllllIIIIlll(int i, int i2) {
        return i == i2;
    }
}
