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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.runelite.api.GameObject;
import net.runelite.api.NPC;
import net.runelite.api.events.GameObjectDespawned;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;

public class k {
    private final /* synthetic */ Set<GameObject> ac;
    private final /* synthetic */ Set<NPC> ab;
    private static final /* synthetic */ int Y;
    private static final /* synthetic */ int V;
    private static final /* synthetic */ int T;
    private static final /* synthetic */ List<Integer> W;
    private static final /* synthetic */ int X;
    private static final /* synthetic */ int Z;
    private final /* synthetic */ Set<GameObject> aa;
    private static /* synthetic */ int[] lIlllIlIIlI;
    private static final /* synthetic */ int U;

    private static void lIIllIIlIlIlII() {
        lIlllIlIIlI = new int[12];
        k.lIlllIlIIlI[0] = -(0xFFFFD7D6 & 0x6C2D) & (0xFFFFFFEF & 0xEF77);
        k.lIlllIlIIlI[1] = -(0xFFFFF37F & 0x4C9D) & (0xFFFFFFFD & 0x6DFE);
        k.lIlllIlIIlI[2] = 0xFFFFBFFF & 0x6DDF;
        k.lIlllIlIIlI[3] = -(0xFFFFCFFF & 0x7AAF) & (0xFFFFFFFF & 0xFEFF);
        k.lIlllIlIIlI[4] = 0xFFFFAFFF & 0x7DD2;
        k.lIlllIlIIlI[5] = -(0xFFFFFFBF & 0x456F) & (0xFFFFEFBE & 0x5DEF);
        k.lIlllIlIIlI[6] = -(0xFFFFEEFF & 0x15ED) & (0xFFFFB7EE & 0xFEFF);
        k.lIlllIlIIlI[7] = -(0xFFFFD32F & 0x7DF5) & (0xFFFFFF7F & 0xFFBF);
        k.lIlllIlIIlI[8] = -(0xFFFFDFFF & 0x65BB) & (0xFFFFF7BE & 0xFFFF);
        k.lIlllIlIIlI[9] = 0xFFFFF32F & 0xBED5;
        k.lIlllIlIIlI[10] = -(0xFFFFB9FA & 0x4E57) & (0xFFFFBB7F & 0xFED7);
        k.lIlllIlIIlI[11] = -(0xFFFFD4FF & 0x6FB9) & (0xFFFFFFBF & 0xF6FF);
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
        "".length();
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
        void llllllllllllllllIlIIllIlIIlllllI;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (k.lIIllIIlIlIlIl(W.contains(gameObject.getId()) ? 1 : 0)) {
            this.aa.add(gameObject);
            "".length();
        }
        if (k.lIIllIIlIlIllI(llllllllllllllllIlIIllIlIIlllllI.getId(), lIlllIlIIlI[0])) {
            k llllllllllllllllIlIIllIlIlIIIIII;
            llllllllllllllllIlIIllIlIlIIIIII.ac.add((GameObject)llllllllllllllllIlIIllIlIIlllllI);
            "".length();
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

    public k() {
        this.aa = new HashSet<GameObject>();
        this.ab = new HashSet<NPC>();
        this.ac = new HashSet<GameObject>();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        void llllllllllllllllIlIIllIlIIlllIII;
        NPC nPC = npcSpawned.getNpc();
        if (k.lIIllIIlIlIllI(nPC.getId(), lIlllIlIIlI[1])) {
            this.ab.add(nPC);
            "".length();
        }
        if (k.lIIllIIlIlIllI(llllllllllllllllIlIIllIlIIlllIII.getId(), lIlllIlIIlI[2])) {
            k llllllllllllllllIlIIllIlIIlllIlI;
            llllllllllllllllIlIIllIlIIlllIlI.ab.add((NPC)llllllllllllllllIlIIllIlIIlllIII);
            "".length();
        }
    }

    public Set<GameObject> C() {
        return this.aa;
    }
}

