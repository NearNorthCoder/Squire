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
package -.r.u.q.e.s.o.t.a.i;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;

public class g_Unknown {
    private static final /* synthetic */ int D;
    private static final /* synthetic */ int z;
    private static final /* synthetic */ int B;
    private static final /* synthetic */ int y;
    private static final /* synthetic */ int x;
    private final /* synthetic */ Set<NPC> F;
    private final /* synthetic */ Set<GameObject> E;
    private final /* synthetic */ Set<GameObject> G;
    private static final /* synthetic */ int C;
    private static final /* synthetic */ List<Integer> A;
    private static /* synthetic */ int[] lIIllllIIllll;

    public g() {
        this.E = new HashSet<GameObject>();
        this.F = new HashSet<NPC>();
        this.G = new HashSet<GameObject>();
    }

    public Set<NPC> g() {
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
        void var4;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (g.lIllIlIIlIIlIIl(A.contains(gameObject.getId()) ? 1 : 0)) {
            this.E.add(gameObject);
            0;
        }
        if (g.lIllIlIIlIIlIlI(var4.getId(), lIIllllIIllll[0])) {
            g var1;
            var1.G.add((GameObject)var4);
            0;
        }
    }

    private static void lIllIlIIlIIlIII() {
        lIIllllIIllll = new int[12];
        g.lIIllllIIllll[0] = -(0xFFFFDEDF & 0x75AC) & (0xFFFFFFFF & 0xFFEF);
        g.lIIllllIIllll[1] = -(0x56 ^ 0x5E) & (0xFFFFADEF & 0x7FF7);
        g.lIIllllIIllll[2] = 0xFFFFADFF & 0x7FDF;
        g.lIIllllIIllll[3] = -(0xFFFF9FB7 & 0x68EF) & (0xFFFFBEF7 & 0xFDFF);
        g.lIIllllIIllll[4] = -(0xFFFFB3F7 & 0x4E2D) & (0xFFFFFFF6 & 0x2FFF);
        g.lIIllllIIllll[5] = -(0xFFFFBD5F & 0x72F9) & (0xFFFFFDDD & 0x3AFA);
        g.lIIllllIIllll[6] = -(0x7C ^ 0x39) & (0xFFFFF367 & 0xBEDE);
        g.lIIllllIIllll[7] = 0xFFFFEFFB & 0xBE1F;
        g.lIIllllIIllll[8] = 0xFFFFFBC6 & 0xB63D;
        g.lIIllllIIllll[9] = -(0xFFFFD5DB & 0x2F75) & (0xFFFFBF7F & 0xF7D5);
        g.lIIllllIIllll[10] = 0xFFFFFFFF & 0xB206;
        g.lIIllllIIllll[11] = -(0xFFFFFDF5 & 0x4BEB) & (0xFFFFFFF7 & 0xFBEF);
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
        void var2;
        NPC nPC = npcSpawned.getNpc();
        if (g.lIllIlIIlIIlIlI(nPC.getId(), lIIllllIIllll[1])) {
            this.F.add(nPC);
            0;
        }
        if (g.lIllIlIIlIIlIlI(var2.getId(), lIIllllIIllll[2])) {
            g var3;
            var3.F.add((NPC)var2);
            0;
        }
    }
}

