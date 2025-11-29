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
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum10;
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
public class ToaManager {
    private final  List<NPC> L;
    public static final  int H;
    private  int Q;
    private final  Queue<i> J;
    private  GameObject P;
    @Inject
    private  Client M;
    private static final  int I;
    
    private  int N;
    private final  Set<TileObject> K;
    private  NPC O;

    private static boolean lIllIllIIIlIIll(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        h var1;
        void var2;
        if (!h.lIllIllIIIIllIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[8]) || !h.lIllIllIIIIllIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[9]) || h.lIllIllIIIlIIIl(npcSpawned.getNpc().getId(), lIlIIIIIlIIlI[10])) {
            var1.O = var2.getNpc();
            var1.J.clear();
        }
        if (h.lIllIllIIIlIIIl(var2.getNpc().getId(), lIlIIIIIlIIlI[11])) {
            var1.L.add(var2.getNpc());

        }
    }

    public Queue<i> i() {
        return this.J;
    }

    public ToaManager() {
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

    }

    private static boolean lIllIllIIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        void var3;
        h var4;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.M, (LocalPoint)graphicsObject.getLocation());
        if (h.lIllIllIIIIllII(Players.getAll(player -> {
            boolean bl;
            if (h.lIllIllIIIlIlII(player.getWorldLocation().distanceTo(worldPoint), lIlIIIIIlIIlI[12])) {
                bl = lIlIIIIIlIIlI[0];

                if (1 == 2) {
                    return false;
                }
            } else {
                bl = lIlIIIIIlIIlI[1];
            }
            return bl;
        }).size())) {
            return;
        }
        int var5 = var4.M.getTickCount();
        int var6 = var3.getGraphicsObject().getId();
        if (h.lIllIllIIIIllIl(var6, lIlIIIIIlIIlI[3]) && h.lIllIllIIIIllIl(var6, lIlIIIIIlIIlI[4]) && h.lIllIllIIIIllIl(var6, lIlIIIIIlIIlI[5]) && h.lIllIllIIIIllIl(var6, lIlIIIIIlIIlI[6])) {
            return;
        }
        if (!h.lIllIllIIIIlllI(var5 - var4.N, lIlIIIIIlIIlI[0]) || h.lIllIllIIIIllll(var5 - var4.Q, lIlIIIIIlIIlI[0])) {
            return;
        }
        var4.N = var5;
        if (h.lIllIllIIIlIIII(var4.J.isEmpty() ? 1 : 0)) {
            var4.J.remove();

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
        void var7;
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (h.lIllIllIIIlIIIl(gameObject.getId(), lIlIIIIIlIIlI[2])) {
            this.K.remove(gameObject);

        }
        if (h.lIllIllIIIlIIIl(var7.getId(), lIlIIIIIlIIlI[7])) {
            var8.P = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var9;
        i var10;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (h.lIllIllIIIlIIIl(gameObject.getId(), lIlIIIIIlIIlI[2])) {
            this.K.add((TileObject)gameObject);

        }
        if (h.lIllIllIIIlIIlI((Object)(var10 = i.a(var9.getId())))) {
            h var11;
            var11.J.add(var10);

            var11.Q = var11.M.getTickCount();
        }
        if (h.lIllIllIIIlIIIl(var9.getId(), lIlIIIIIlIIlI[7])) {
            var11.P = var9;
        }
    }
}

