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

import gg.squire.toa.tasks.GameEnum3;
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

    private static boolean var2(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        h var3;
        void var4;
        if (!h.var5(npcSpawned.getNpc().getId(), var1[8]) || !h.var5(npcSpawned.getNpc().getId(), var1[9]) || h.var6(npcSpawned.getNpc().getId(), var1[10])) {
            var3.O = var4.getNpc();
            var3.J.clear();
        }
        if (h.var6(var4.getNpc().getId(), var1[11])) {
            var3.L.add(var4.getNpc());
            0;
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

    private static boolean var7(Object object) {
        return object != null;
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    public Set<TileObject> j() {
        return this.K;
    }

    private static boolean var8(int n2) {
        return n2 > 0;
    }

    public void c() {
        int[] nArray = new int[var1[0]];
        nArray[h.var1[1]] = var1[2];
        this.K.addAll(TileObjects.getAll((int[])nArray));
        0;
    }

    private static boolean var9(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        void var10;
        h var11;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        WorldPoint worldPoint = WorldPoint.fromLocal((Client)this.M, (LocalPoint)graphicsObject.getLocation());
        if (h.var8(Players.getAll(player -> {
            boolean bl;
            if (h.var12(player.getWorldLocation().distanceTo(worldPoint), var1[12])) {
                bl = var1[0];
                0;
                if (1 == 2) {
                    return ((0x18 ^ 0x5E) & ~(0xC9 ^ 0x8F)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }).size())) {
            return;
        }
        int var13 = var11.M.getTickCount();
        int var14 = var10.getGraphicsObject().getId();
        if (h.var5(var14, var1[3]) && h.var5(var14, var1[4]) && h.var5(var14, var1[5]) && h.var5(var14, var1[6])) {
            return;
        }
        if (!h.var9(var13 - var11.N, var1[0]) || h.var15(var13 - var11.Q, var1[0])) {
            return;
        }
        var11.N = var13;
        if (h.var16(var11.J.isEmpty() ? 1 : 0)) {
            var11.J.remove();
            0;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    public NPC l() {
        return this.O;
    }

    private static boolean var5(int n2, int n3) {
        return n2 != n3;
    }

    static {
        h.var17();
        I = var1[2];
        H = var1[7];
    }

    public List<NPC> k() {
        return this.L;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (h.var2(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.c();
        }
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (h.var6(npcDespawned.getNpc().getId(), var1[11])) {
            this.L.remove(npcDespawned.getNpc());
            0;
        }
    }

    private static boolean var15(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        void var18;
        GameObject gameObject = gameObjectDespawned.getGameObject();
        if (h.var6(gameObject.getId(), var1[2])) {
            this.K.remove(gameObject);
            0;
        }
        if (h.var6(var18.getId(), var1[7])) {
            var19.P = null;
        }
    }

    private static void var17() {
        var1 = new int[13];
        h.var1[0] = 1;
        h.var1[1] = (0x4A ^ 0x47 ^ (0x13 ^ 0x23)) & (0xF7 ^ 0x9B ^ (0x91 ^ 0xC0) ^ -1);
        h.var1[2] = 0xFFFFBDCF & 0xF3BF;
        h.var1[3] = -(0xFFFFBF6F & 0x75B1) & (0xFFFFFDF7 & 0x3FFB);
        h.var1[4] = -(0xFFFF9E5D & 0x73AF) & (0xFFFFFFFF & 0x1ADE);
        h.var1[5] = -(0xFFFFF737 & 0x68CB) & (0xFFFFECDB & 0x7BF7);
        h.var1[6] = 0xFFFFCBDA & 0x3CF5;
        h.var1[7] = 0xFFFFF99D & 0xB7FE;
        h.var1[8] = -(0xFFFFD0FB & 0x7F55) & (0xFFFFFEDF & 0x7F7E);
        h.var1[9] = -(0xFFFFF5D5 & 0x4BEB) & (0xFFFFFFFF & 0x6FCF);
        h.var1[10] = 0xFFFFBF3C & 0x6ED3;
        h.var1[11] = -(0xFFFFC34B & 0x7EF7) & (0xFFFFFFFF & 0x6FFE);
        h.var1[12] = 3 ^ 5;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var20;
        i var21;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (h.var6(gameObject.getId(), var1[2])) {
            this.K.add((TileObject)gameObject);
            0;
        }
        if (h.var7((Object)(var21 = i.a(var20.getId())))) {
            h var22;
            var22.J.add(var21);
            0;
            var22.Q = var22.M.getTickCount();
        }
        if (h.var6(var20.getId(), var1[7])) {
            var22.P = var20;
        }
    }
}

