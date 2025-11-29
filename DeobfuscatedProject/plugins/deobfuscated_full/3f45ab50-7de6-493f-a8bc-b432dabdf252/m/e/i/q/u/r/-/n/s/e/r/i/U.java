/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.WallObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.WallObjectDespawned
 *  net.runelite.api.events.WallObjectSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package m.e.i.q.u.r.-.n.s.e.r.i;

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
public class U {
    private /* synthetic */ int aG;
    private static /* synthetic */ int[] llllllIIllIl;
    private /* synthetic */ WorldPoint aH;
    private final /* synthetic */ Client aE;
    private /* synthetic */ int aI;
    private /* synthetic */ TileObject aF;
    private /* synthetic */ boolean aJ;

    @Subscribe
    public void a(WallObjectSpawned wallObjectSpawned) {
        WallObject wallObject = wallObjectSpawned.getWallObject();
        if (U.lIIlIlIIIlllIII(this.d((TileObject)wallObject) ? 1 : 0)) {
            this.aF = wallObject;
            this.aJ = llllllIIllIl[0];
        }
    }

    @Subscribe
    public void b(GameTick gameTick) {
        if (U.lIIlIlIIIlllIII(this.aJ ? 1 : 0)) {
            this.aF = null;
            this.aH = null;
            this.aI = llllllIIllIl[2];
            this.aJ = llllllIIllIl[0];
            this.aG = this.aE.getTickCount();
        }
    }

    private static boolean lIIlIlIIIlllIlI(Object object) {
        return object == null;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        this.aJ = llllllIIllIl[1];
    }

    public int Q() {
        return this.aG;
    }

    private static boolean lIIlIlIIIlllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIIlIlIIIllIlll(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIlIlIIIllIllI() {
        llllllIIllIl = new int[3];
        U.llllllIIllIl[0] = (0x29 ^ 0x36) & ~(0x99 ^ 0x86);
        U.llllllIIllIl[1] = 1;
        U.llllllIIllIl[2] = -1;
    }

    static {
        U.lIIlIlIIIllIllI();
    }

    @Subscribe
    public void a(WallObjectDespawned wallObjectDespawned) {
        if (U.lIIlIlIIIllIlll(wallObjectDespawned.getWallObject(), this.aF)) {
            this.aJ = llllllIIllIl[1];
        }
    }

    /*
     * WARNING - void declaration
     */
    public void e(TileObject tileObject) {
        this.aF = tileObject;
        if (U.lIIlIlIIIlllIlI(tileObject)) {
            this.aH = null;
            this.aI = llllllIIllIl[2];
            0;
            if (2 <= 0) {
                return;
            }
        } else {
            void var1;
            var2.aH = var1.getWorldLocation();
            var2.aI = var1.getId();
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
        if (U.lIIlIlIIIllIlll(gameObjectDespawned.getGameObject(), this.aF)) {
            this.aF = null;
            this.aG = this.aE.getTickCount();
        }
    }

    private static boolean lIIlIlIIIlllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private boolean d(TileObject tileObject) {
        int n2;
        if (U.lIIlIlIIIlllIIl(tileObject.getId(), this.aI) && U.lIIlIlIIIlllIII(tileObject.getWorldLocation().equals((Object)this.aH) ? 1 : 0)) {
            n2 = llllllIIllIl[1];
            0;
            if (((0x94 ^ 0xAB ^ (0xF0 ^ 0xAD)) & (43 + 109 - 32 + 7 ^ (0xA8 ^ 0xB5) ^ -1)) < 0) {
                return ((226 + 140 - 258 + 136 ^ 95 + 32 - -59 + 6) & (0x10 ^ 0x74 ^ (0xF8 ^ 0xA8) ^ -1)) != 0;
            }
        } else {
            n2 = llllllIIllIl[0];
        }
        return n2 != 0;
    }
}

