/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.client.Static;

@Singleton
public class i {
    private final /* synthetic */ Map<WorldPoint, GraphicsObject> P;
    private final /* synthetic */ Map<WorldPoint, GraphicsObject> O;
    private final /* synthetic */ Map<WorldPoint, Integer> N;
    private /* synthetic */ int Q;
    private static final /* synthetic */ int L;
    private static /* synthetic */ int[] llIIIlIlIlI;
    private static final /* synthetic */ int K;
    private final /* synthetic */ List<GraphicsObject> M;

    public Map<WorldPoint, Integer> y() {
        return this.N;
    }

    static {
        i.lIIllllIIIIlIl();
        K = llIIIlIlIlI[5];
        L = llIIIlIlIlI[6];
    }

    @Subscribe
    public void a(GameTick gameTick) {
        Iterator<WorldPoint> var9 = this.N.keySet().iterator();
        while (i.lIIllllIIIlIII(var9.hasNext() ? 1 : 0)) {
            i var4;
            WorldPoint var1 = var9.next();
            if (i.lIIllllIIIlIIl(Static.getClient().getTickCount() - var4.N.get(var1), llIIIlIlIlI[8])) {
                var4.N.remove(var1);
                0;
            }
            0;
            if (2 <= (0x63 ^ 3 ^ (0x4D ^ 0x29))) continue;
            return;
        }
    }

    public Map<WorldPoint, GraphicsObject> A() {
        return this.P;
    }

    private static boolean lIIllllIIIlIII(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        this.N.clear();
    }

    public Map<WorldPoint, GraphicsObject> z() {
        return this.O;
    }

    private static boolean lIIllllIIIIllI(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIllllIIIIlIl() {
        llIIIlIlIlI = new int[9];
        i.llIIIlIlIlI[0] = (45 + 172 - 142 + 140 ^ 123 + 93 - 35 + 2) & (0x62 ^ 0x33 ^ (0x52 ^ 0x63) ^ -1);
        i.llIIIlIlIlI[1] = -(0xFFFFFA7F & 0x77D4) & (0xFFFFFAFF & Short.MAX_VALUE);
        i.llIIIlIlIlI[2] = -(0xFFFFD78F & 0x7B73) & (0xFFFFDFAF & 0x7BFF);
        i.llIIIlIlIlI[3] = -(0xFFFFEF56 & 0x76AB) & (0xFFFFEEBF & 0x7FEF);
        i.llIIIlIlIlI[4] = -(0xFFFFFFDB & 0x7775) & (0xFFFFFFFF & Short.MAX_VALUE);
        i.llIIIlIlIlI[5] = 0xFFFF8FA6 & 0x75FF;
        i.llIIIlIlIlI[6] = 0xFFFF8EDB & 0x79EF;
        i.llIIIlIlIlI[7] = -(0xFFFFDC6F & 0x63BB) & (0xFFFFFDFF & 0x67FF);
        i.llIIIlIlIlI[8] = 0x6A ^ 0x62;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var5;
        Actor actor = animationChanged.getActor();
        if (i.lIIllllIIIlIII(actor instanceof Player)) {
            return;
        }
        NPC var8 = (NPC)var5;
        int var10 = var8.getAnimation();
        if (i.lIIllllIIIIlll(var10, llIIIlIlIlI[7])) {
            return;
        }
        this.M.clear();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        void var2;
        void var3;
        i var6;
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        int n2 = graphicsObject.getId();
        if (!i.lIIllllIIIIllI(n2, llIIIlIlIlI[1]) || !i.lIIllllIIIIllI(n2, llIIIlIlIlI[2]) || !i.lIIllllIIIIllI(n2, llIIIlIlIlI[3]) || i.lIIllllIIIIlll(n2, llIIIlIlIlI[4])) {
            var6.M.add((GraphicsObject)var3);
            0;
        }
        if (i.lIIllllIIIIlll((int)var2, llIIIlIlIlI[5])) {
            WorldPoint var7 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var3.getLocation());
            var6.N.put(var7, Static.getClient().getTickCount());
            0;
            var6.P.put(var7, (GraphicsObject)var3);
            0;
            0;
            if (-3 > 0) {
                return;
            }
        } else if (i.lIIllllIIIIlll((int)var2, llIIIlIlIlI[6])) {
            WorldPoint var7 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var3.getLocation());
            var6.O.put(var7, (GraphicsObject)var3);
            0;
        }
    }

    private static boolean lIIllllIIIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    public void w() {
        this.Q = llIIIlIlIlI[0];
        this.M.clear();
        this.N.clear();
        this.O.clear();
    }

    public List<GraphicsObject> x() {
        return this.M;
    }

    public i() {
        this.M = new ArrayList<GraphicsObject>();
        this.N = new HashMap<WorldPoint, Integer>();
        this.O = new HashMap<WorldPoint, GraphicsObject>();
        this.P = new HashMap<WorldPoint, GraphicsObject>();
        this.Q = llIIIlIlIlI[0];
    }

    private static boolean lIIllllIIIIlll(int n2, int n3) {
        return n2 == n3;
    }
}

