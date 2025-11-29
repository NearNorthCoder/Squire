/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.GameObject
 *  net.runelite.api.NPC
 *  net.runelite.api.events.GameObjectDespawned
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.autotoa.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;

public class AutotoaEventHandler {
    private final  Set<GameObject> ac;
    private final  Set<NPC> ab;
    private static final  int Y;
    private static final  int V;
    private static final  int T;
    private static final  List<Integer> W;
    private static final  int X;
    private static final  int Z;
    private final  Set<GameObject> aa;
    
    private static final  int U;

    private static void var2() {
        var1 = new int[12];
        k.var1[0] = -(0xFFFFD7D6 & 0x6C2D) & (0xFFFFFFEF & 0xEF77);
        k.var1[1] = -(0xFFFFF37F & 0x4C9D) & (0xFFFFFFFD & 0x6DFE);
        k.var1[2] = 0xFFFFBFFF & 0x6DDF;
        k.var1[3] = -(0xFFFFCFFF & 0x7AAF) & (0xFFFFFFFF & 0xFEFF);
        k.var1[4] = 0xFFFFAFFF & 0x7DD2;
        k.var1[5] = -(0xFFFFFFBF & 0x456F) & (0xFFFFEFBE & 0x5DEF);
        k.var1[6] = -(0xFFFFEEFF & 0x15ED) & (0xFFFFB7EE & 0xFEFF);
        k.var1[7] = -(0xFFFFD32F & 0x7DF5) & (0xFFFFFF7F & 0xFFBF);
        k.var1[8] = -(0xFFFFDFFF & 0x65BB) & (0xFFFFF7BE & 0xFFFF);
        k.var1[9] = 0xFFFFF32F & 0xBED5;
        k.var1[10] = -(0xFFFFB9FA & 0x4E57) & (0xFFFFBB7F & 0xFED7);
        k.var1[11] = -(0xFFFFD4FF & 0x6FB9) & (0xFFFFFFBF & 0xF6FF);
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
        0;
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    public Set<NPC> D() {
        return this.ab;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var4;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (k.var3(W.contains(gameObject.getId()) ? 1 : 0)) {
            this.aa.add(gameObject);
            0;
        }
        if (k.var5(var4.getId(), var1[0])) {
            k var6;
            var6.ac.add((GameObject)var4);
            0;
        }
    }

    static {
        k.var2();
        T = var1[3];
        U = var1[4];
        Z = var1[1];
        X = var1[0];
        Y = var1[2];
        V = var1[5];
        W = List.of(Integer.valueOf(var1[6]), Integer.valueOf(var1[7]), Integer.valueOf(var1[8]), Integer.valueOf(var1[9]), Integer.valueOf(var1[10]), Integer.valueOf(var1[11]));
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    public AutotoaEventHandler() {
        this.aa = new HashSet<GameObject>();
        this.ab = new HashSet<NPC>();
        this.ac = new HashSet<GameObject>();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void var7;
        NPC nPC = npcSpawned.getNpc();
        if (k.var5(nPC.getId(), var1[1])) {
            this.ab.add(nPC);
            0;
        }
        if (k.var5(var7.getId(), var1[2])) {
            k var8;
            var8.ab.add((NPC)var7);
            0;
        }
    }

    public Set<GameObject> C() {
        return this.aa;
    }
}

