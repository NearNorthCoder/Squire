/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.i;
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
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
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
public class h {
    private final /* synthetic */ List<NPC> L;
    public static final /* synthetic */ int H;
    private /* synthetic */ int Q;
    private final /* synthetic */ Queue<i> J;
    private /* synthetic */ GameObject P;
    @Inject
    private /* synthetic */ Client M;
    private static final /* synthetic */ int I;
    private static /* synthetic */ int[] lIlIIIIIlIIlI;
    private /* synthetic */ int N;
    private final /* synthetic */ Set<TileObject> K;
    private /* synthetic */ NPC O;

    private static boolean lIllIllIIIlIIll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        h llllllllllllllIlllIIllIIlIIlIIII;
        void llllllllllllllIlllIIllIIlIIIllll;
        if (!h.lIllIllIIIIllIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[8]) || !h.lIllIllIIIIllIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[9]) || h.lIllIllIIIlIIIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[10])) {
            llllllllllllllIlllIIllIIlIIlIIII.O = llllllllllllllIlllIIllIIlIIIllll.getNpc();
            llllllllllllllIlllIIllIIlIIlIIII.J.clear();
        }
        if (h.lIllIllIIIlIIIl(llllllllllllllIlllIIllIIlIIIllll.getNpc().getId(), lIlIIIIIlIIlI[11])) {
            llllllllllllllIlllIIllIIlIIlIIII.L.add(llllllllllllllIlllIIllIIlIIIllll.getNpc());
            "".length();
        }
    }

    public Queue<i> i() {
        return this.J;
    }

    public h() {
        this.J = new LinkedList<i>();
        this.K = new HashSet<TileObject>();
        this.L = new ArrayList<NPC>();
    }

    private static boolean lIllIllIIIlIIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIllIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    public Set<TileObject> j() {
        return this.K;
    }

    private static boolean lIllIllIIIIllII(int n2) {
        return n2 > 0;
    }

    public void c() {
        int[] nArray = new int[lIlIIIIIlIIlI[0]];
        nArray[h.lIlIIIIIlIIlI[1]] = lIlIIIIIlIIlI[2];
        this.K.addAll(TileObjects.getAll((int[])nArray));
        "".length();
    }

    private static boolean lIllIllIIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        void llllllllllllllIlllIIllIIlIlIIlIl;
        h llllllllllllllIlllIIllIIlIlIIllI;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.M, (LocalPoint)graphicsObject.getLocation());
        if (h.lIllIllIIIIllII(Players.getAll(player -> {
            boolean bl;
            if (h.lIllIllIIIlIlII(player.getWorldLocation().distanceTo(worldPoint), lIlIIIIIlIIlI[12])) {
                bl = lIlIIIIIlIIlI[0];
                "".length();
                if (" ".length() == "  ".length()) {
                    return ((0x18 ^ 0x5E) & ~(0xC9 ^ 0x8F)) != 0;
                }
            } else {
                bl = lIlIIIIIlIIlI[1];
            }
            return bl;
        }).size())) {
            return;
        }
        int llllllllllllllIlllIIllIIlIlIIIlI = llllllllllllllIlllIIllIIlIlIIllI.M.getTickCount();
        int llllllllllllllIlllIIllIIlIlIIIIl = llllllllllllllIlllIIllIIlIlIIlIl.getGraphicsObject().getId();
        if (h.lIllIllIIIIllIl(llllllllllllllIlllIIllIIlIlIIIIl, lIlIIIIIlIIlI[3]) && h.lIllIllIIIIllIl(llllllllllllllIlllIIllIIlIlIIIIl, lIlIIIIIlIIlI[4]) && h.lIllIllIIIIllIl(llllllllllllllIlllIIllIIlIlIIIIl, lIlIIIIIlIIlI[5]) && h.lIllIllIIIIllIl(llllllllllllllIlllIIllIIlIlIIIIl, lIlIIIIIlIIlI[6])) {
            return;
        }
        if (!h.lIllIllIIIIlllI(llllllllllllllIlllIIllIIlIlIIIlI - llllllllllllllIlllIIllIIlIlIIllI.N, lIlIIIIIlIIlI[0]) || h.lIllIllIIIIllll(llllllllllllllIlllIIllIIlIlIIIlI - llllllllllllllIlllIIllIIlIlIIllI.Q, lIlIIIIIlIIlI[0])) {
            return;
        }
        llllllllllllllIlllIIllIIlIlIIllI.N = llllllllllllllIlllIIllIIlIlIIIlI;
        if (h.lIllIllIIIlIIII(llllllllllllllIlllIIllIIlIlIIllI.J.isEmpty() ? 1 : 0)) {
            llllllllllllllIlllIIllIIlIlIIllI.J.remove();
            "".length();
        }
    }

    private static boolean lIllIllIIIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    public NPC l() {
        return this.O;
    }

    private static boolean lIllIllIIIIllIl(int n2, int n3) {
        return n2 != n3;
    }

    static {
        h.lIllIllIIIIlIll();
        I = lIlIIIIIlIIlI[2];
        H = lIlIIIIIlIIlI[7];
    }

    public List<NPC> k() {
        return this.L;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (h.lIllIllIIIlIIll(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.c();
        }
    }

    private static boolean lIllIllIIIlIIII(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (h.lIllIllIIIlIIIl(npcDespawned.getNpc().getId(), lIlIIIIIlIIlI[11])) {
            this.L.remove(npcDespawned.getNpc());
            "".length();
        }
    }

    private static boolean lIllIllIIIIllll(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        void llllllllllllllIlllIIllIIlIIlIIll;
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (h.lIllIllIIIlIIIl(gameObject.getId(), lIlIIIIIlIIlI[2])) {
            this.K.remove(gameObject);
            "".length();
        }
        if (h.lIllIllIIIlIIIl(llllllllllllllIlllIIllIIlIIlIIll.getId(), lIlIIIIIlIIlI[7])) {
            llllllllllllllIlllIIllIIlIIlIlIl.P = null;
        }
    }

    private static void lIllIllIIIIlIll() {
        lIlIIIIIlIIlI = new int[13];
        h.lIlIIIIIlIIlI[0] = " ".length();
        h.lIlIIIIIlIIlI[1] = (0x4A ^ 0x47 ^ (0x13 ^ 0x23)) & (0xF7 ^ 0x9B ^ (0x91 ^ 0xC0) ^ -" ".length());
        h.lIlIIIIIlIIlI[2] = 0xFFFFBDCF & 0xF3BF;
        h.lIlIIIIIlIIlI[3] = -(0xFFFFBF6F & 0x75B1) & (0xFFFFFDF7 & 0x3FFB);
        h.lIlIIIIIlIIlI[4] = -(0xFFFF9E5D & 0x73AF) & (0xFFFFFFFF & 0x1ADE);
        h.lIlIIIIIlIIlI[5] = -(0xFFFFF737 & 0x68CB) & (0xFFFFECDB & 0x7BF7);
        h.lIlIIIIIlIIlI[6] = 0xFFFFCBDA & 0x3CF5;
        h.lIlIIIIIlIIlI[7] = 0xFFFFF99D & 0xB7FE;
        h.lIlIIIIIlIIlI[8] = -(0xFFFFD0FB & 0x7F55) & (0xFFFFFEDF & 0x7F7E);
        h.lIlIIIIIlIIlI[9] = -(0xFFFFF5D5 & 0x4BEB) & (0xFFFFFFFF & 0x6FCF);
        h.lIlIIIIIlIIlI[10] = 0xFFFFBF3C & 0x6ED3;
        h.lIlIIIIIlIIlI[11] = -(0xFFFFC34B & 0x7EF7) & (0xFFFFFFFF & 0x6FFE);
        h.lIlIIIIIlIIlI[12] = 3 ^ 5;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void llllllllllllllIlllIIllIIlIIllIlI;
        i llllllllllllllIlllIIllIIlIIllIIl;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (h.lIllIllIIIlIIIl(gameObject.getId(), lIlIIIIIlIIlI[2])) {
            this.K.add((TileObject)gameObject);
            "".length();
        }
        if (h.lIllIllIIIlIIlI((Object)(llllllllllllllIlllIIllIIlIIllIIl = i.a(llllllllllllllIlllIIllIIlIIllIlI.getId())))) {
            h llllllllllllllIlllIIllIIlIIlllII;
            llllllllllllllIlllIIllIIlIIlllII.J.add(llllllllllllllIlllIIllIIlIIllIIl);
            "".length();
            llllllllllllllIlllIIllIIlIIlllII.Q = llllllllllllllIlllIIllIIlIIlllII.M.getTickCount();
        }
        if (h.lIllIllIIIlIIIl(llllllllllllllIlllIIllIIlIIllIlI.getId(), lIlIIIIIlIIlI[7])) {
            llllllllllllllIlllIIllIIlIIlllII.P = llllllllllllllIlllIIllIIlIIllIlI;
        }
    }
}

