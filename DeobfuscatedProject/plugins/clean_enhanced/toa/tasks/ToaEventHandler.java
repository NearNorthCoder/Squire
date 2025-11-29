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
package gg.squire.toa.tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;

public class ToaEventHandler {
    private static final  int D;
    private static final  int z;
    private static final  int B;
    private static final  int y;
    private static final  int x;
    private final  Set<NPC> F;
    private final  Set<GameObject> E;
    private final  Set<GameObject> G;
    private static final  int C;
    private static final  List<Integer> A;

    public ToaEventHandler() {
        this.E = new HashSet<GameObject>();
        this.F = new HashSet<NPC>();
        this.G = new HashSet<GameObject>();
    }

    public Set<NPC> ToaEventHandler() {
        return this.F;
    }

    public Set<GameObject> h() {
        return this.G;
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        this.E.remove(gameObjectDespawned.getGameObject());
        0;
    }

    static {
        g.var2();
        D = var1[1];
        x = var1[3];
        B = var1[0];
        C = var1[2];
        y = var1[4];
        z = var1[5];
        A = List.of(Integer.valueOf(var1[6]), Integer.valueOf(var1[7]), Integer.valueOf(var1[8]), Integer.valueOf(var1[9]), Integer.valueOf(var1[10]), Integer.valueOf(var1[11]));
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var3;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (g.var4(A.contains(gameObject.getId()) ? 1 : 0)) {
            this.E.add(gameObject);
            0;
        }
        if (g.var5(var3.getId(), var1[0])) {
            g var6;
            var6.G.add((GameObject)var3);
            0;
        }
    }

    private static void var2() {
        var1 = new int[12];
        g.var1[0] = -(0xFFFFDEDF & 0x75AC) & (0xFFFFFFFF & 0xFFEF);
        g.var1[1] = -(0x56 ^ 0x5E) & (0xFFFFADEF & 0x7FF7);
        g.var1[2] = 0xFFFFADFF & 0x7FDF;
        g.var1[3] = -(0xFFFF9FB7 & 0x68EF) & (0xFFFFBEF7 & 0xFDFF);
        g.var1[4] = -(0xFFFFB3F7 & 0x4E2D) & (0xFFFFFFF6 & 0x2FFF);
        g.var1[5] = -(0xFFFFBD5F & 0x72F9) & (0xFFFFFDDD & 0x3AFA);
        g.var1[6] = -(0x7C ^ 0x39) & (0xFFFFF367 & 0xBEDE);
        g.var1[7] = 0xFFFFEFFB & 0xBE1F;
        g.var1[8] = 0xFFFFFBC6 & 0xB63D;
        g.var1[9] = -(0xFFFFD5DB & 0x2F75) & (0xFFFFBF7F & 0xF7D5);
        g.var1[10] = 0xFFFFFFFF & 0xB206;
        g.var1[11] = -(0xFFFFFDF5 & 0x4BEB) & (0xFFFFFFF7 & 0xFBEF);
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    public void c() {
        this.E.clear();
        this.F.clear();
        this.G.clear();
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    public Set<GameObject> f() {
        return this.E;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void var7;
        NPC nPC = npcSpawned.getNpc();
        if (g.var5(nPC.getId(), var1[1])) {
            this.F.add(nPC);
            0;
        }
        if (g.var5(var7.getId(), var1[2])) {
            g var8;
            var8.F.add((NPC)var7);
            0;
        }
    }
}

