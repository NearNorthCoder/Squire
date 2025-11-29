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

    }

    private static boolean lIIllIIlIlIlIl(int n2) {
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
        void var1;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (k.lIIllIIlIlIlIl(W.contains(gameObject.getId()) ? 1 : 0)) {
            this.aa.add(gameObject);

        }
        if (k.lIIllIIlIlIllI(var1.getId(), lIlllIlIIlI[0])) {
            k var2;
            var2.ac.add((GameObject)var1);

        }
    }

    static {
        k.lIIllIIlIlIlII();
        T = lIlllIlIIlI[3];
        U = lIlllIlIIlI[4];
        Z = lIlllIlIIlI[1];
        X = lIlllIlIIlI[0];
        Y = lIlllIlIIlI[2];
        V = lIlllIlIIlI[5];
        W = List.of(Integer.valueOf(lIlllIlIIlI[6]), Integer.valueOf(lIlllIlIIlI[7]), Integer.valueOf(lIlllIlIIlI[8]), Integer.valueOf(lIlllIlIIlI[9]), Integer.valueOf(lIlllIlIIlI[10]), Integer.valueOf(lIlllIlIIlI[11]));
    }

    private static boolean lIIllIIlIlIllI(int n2, int n3) {
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
        void var3;
        NPC nPC = npcSpawned.getNpc();
        if (k.lIIllIIlIlIllI(nPC.getId(), lIlllIlIIlI[1])) {
            this.ab.add(nPC);

        }
        if (k.lIIllIIlIlIllI(var3.getId(), lIlllIlIIlI[2])) {
            k var4;
            var4.ab.add((NPC)var3);

        }
    }

    public Set<GameObject> C() {
        return this.aa;
    }
}

