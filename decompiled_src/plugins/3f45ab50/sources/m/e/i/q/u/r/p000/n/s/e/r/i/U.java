package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.WallObjectDespawned;
import net.runelite.api.events.WallObjectSpawned;
import net.runelite.client.eventbus.Subscribe;
@Singleton
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.U  reason: invalid package */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/U.class */
public class U {
    private /* synthetic */ int aG;
    private static /* synthetic */ int[] llllllIIllIl;
    private /* synthetic */ WorldPoint aH;
    private final /* synthetic */ Client aE;
    private /* synthetic */ int aI;
    private /* synthetic */ TileObject aF;
    private /* synthetic */ boolean aJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(WallObjectSpawned wallObjectSpawned) {
        WallObject wallObject = wallObjectSpawned.getWallObject();
        if (lIIlIlIIIlllIII(d(wallObject) ? 1 : 0)) {
            this.aF = wallObject;
            this.aJ = llllllIIllIl[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void b(GameTick gameTick) {
        if (lIIlIlIIIlllIII(this.aJ ? 1 : 0)) {
            this.aF = null;
            this.aH = null;
            this.aI = llllllIIllIl[2];
            this.aJ = llllllIIllIl[0];
            this.aG = this.aE.getTickCount();
        }
    }

    private static boolean lIIlIlIIIlllIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        this.aJ = llllllIIllIl[1];
    }

    public int Q() {
        return this.aG;
    }

    private static boolean lIIlIlIIIlllIII(int i) {
        return i != 0;
    }

    private static boolean lIIlIlIIIllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIIlIlIIIllIllI() {
        llllllIIllIl = new int[3];
        llllllIIllIl[0] = (41 ^ 54) & ((153 ^ 134) ^ (-1));
        llllllIIllIl[1] = " ".length();
        llllllIIllIl[2] = -" ".length();
    }

    static {
        lIIlIlIIIllIllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(WallObjectDespawned wallObjectDespawned) {
        if (lIIlIlIIIllIlll(wallObjectDespawned.getWallObject(), this.aF)) {
            this.aJ = llllllIIllIl[1];
        }
    }

    public void e(TileObject tileObject) {
        this.aF = tileObject;
        if (!lIIlIlIIIlllIlI(tileObject)) {
            this.aH = tileObject.getWorldLocation();
            this.aI = tileObject.getId();
            return;
        }
        this.aH = null;
        this.aI = llllllIIllIl[2];
        "".length();
        if ("  ".length() <= 0) {
        }
    }

    @Inject
    public U(Client client) {
        this.aE = client;
    }

    public TileObject P() {
        return this.aF;
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        if (lIIlIlIIIllIlll(gameObjectDespawned.getGameObject(), this.aF)) {
            this.aF = null;
            this.aG = this.aE.getTickCount();
        }
    }

    private static boolean lIIlIlIIIlllIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean d(TileObject tileObject) {
        if (lIIlIlIIIlllIIl(tileObject.getId(), this.aI) && lIIlIlIIIlllIII(tileObject.getWorldLocation().equals(this.aH) ? 1 : 0)) {
            ?? r0 = llllllIIllIl[1];
            "".length();
            return (((148 ^ 171) ^ (240 ^ 173)) & (((((43 + 109) - 32) + 7) ^ (168 ^ 181)) ^ (-" ".length()))) < 0 ? ((((226 + 140) - 258) + 136) ^ (((95 + 32) - (-59)) + 6)) & (((16 ^ 116) ^ (248 ^ 168)) ^ (-" ".length())) : r0;
        }
        return llllllIIllIl[0];
    }
}
