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

public class GHelper {
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

    public GHelper() {
        this.E = new HashSet<GameObject>();
        this.F = new HashSet<NPC>();
        this.G = new HashSet<GameObject>();
    }

    public Set<NPC> GHelper() {
        return this.F;
    }

    public Set<GameObject> h() {
        return this.G;
    }

    @Subscribe
    public void a(GameObjectDespawned gameObjectDespawned) {
        this.E.remove(gameObjectDespawned.getGameObject());

    }

    static {
        g.lIllIlIIlIIlIII();
        D = lIIllllIIllll[1];
        x = lIIllllIIllll[3];
        B = lIIllllIIllll[0];
        C = lIIllllIIllll[2];
        y = lIIllllIIllll[4];
        z = lIIllllIIllll[5];
        A = List.of(Integer.valueOf(lIIllllIIllll[6]), Integer.valueOf(lIIllllIIllll[7]), Integer.valueOf(lIIllllIIllll[8]), Integer.valueOf(lIIllllIIllll[9]), Integer.valueOf(lIIllllIIllll[10]), Integer.valueOf(lIIllllIIllll[11]));
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var1;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (g.lIllIlIIlIIlIIl(A.contains(gameObject.getId()) ? 1 : 0)) {
            this.E.add(gameObject);

        }
        if (g.lIllIlIIlIIlIlI(var1.getId(), lIIllllIIllll[0])) {
            g var2;
            var2.G.add((GameObject)var1);

        }
    }

    private static boolean lIllIlIIlIIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    public void c() {
        this.E.clear();
        this.F.clear();
        this.G.clear();
    }

    private static boolean lIllIlIIlIIlIIl(int n2) {
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
        void var3;
        NPC nPC = npcSpawned.getNpc();
        if (g.lIllIlIIlIIlIlI(nPC.getId(), lIIllllIIllll[1])) {
            this.F.add(nPC);

        }
        if (g.lIllIlIIlIIlIlI(var3.getId(), lIIllllIIllll[2])) {
            g var4;
            var4.F.add((NPC)var3);

        }
    }
}

