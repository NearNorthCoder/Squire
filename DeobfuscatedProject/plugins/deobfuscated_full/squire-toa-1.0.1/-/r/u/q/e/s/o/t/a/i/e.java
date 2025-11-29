/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.eventbus.Subscribe
 */
package -.r.u.q.e.s.o.t.a.i;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class e {
    private final /* synthetic */ List<GraphicsObject> t;
    private static /* synthetic */ int[] lIlIIIIlIIIII;
    private /* synthetic */ int u;

    public List<GraphicsObject> d() {
        return this.t;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.t.removeIf(GraphicsObject::finished);
        0;
    }

    public void c() {
        this.u = lIlIIIIlIIIII[0];
        this.t.clear();
    }

    private static boolean lIllIllIlIIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIllIlIIlIll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        GraphicsObject graphicsObject = graphicsObjectCreated.getGraphicsObject();
        int n2 = graphicsObject.getId();
        if (!e.lIllIllIlIIlIll(n2, lIlIIIIlIIIII[1]) || !e.lIllIllIlIIlIll(n2, lIlIIIIlIIIII[2]) || !e.lIllIllIlIIlIll(n2, lIlIIIIlIIIII[3]) || e.lIllIllIlIIllII(n2, lIlIIIIlIIIII[4])) {
            void var5;
            e var3;
            var3.t.add((GraphicsObject)var5);
            0;
        }
    }

    private static boolean lIllIllIlIIllII(int n2, int n3) {
        return n2 == n3;
    }

    public e() {
        this.t = new ArrayList<GraphicsObject>();
        this.u = lIlIIIIlIIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        void var1;
        Actor actor = animationChanged.getActor();
        if (e.lIllIllIlIIllIl(actor instanceof Player)) {
            return;
        }
        NPC var4 = (NPC)var1;
        int var2 = var4.getAnimation();
        if (e.lIllIllIlIIllII(var2, lIlIIIIlIIIII[5])) {
            return;
        }
        this.t.clear();
    }

    static {
        e.lIllIllIlIIlIlI();
    }

    private static void lIllIllIlIIlIlI() {
        lIlIIIIlIIIII = new int[6];
        e.lIlIIIIlIIIII[0] = (0xB9 ^ 0x99) & ~(0xB5 ^ 0x95);
        e.lIlIIIIlIIIII[1] = -(0xFFFFBDF5 & 0x675B) & (0xFFFFBFFE & 0x6DFD);
        e.lIlIIIIlIIIII[2] = 0xFFFF8BBD & 0x7CEF;
        e.lIlIIIIlIIIII[3] = 0xFFFF8EBE & 0x79EF;
        e.lIlIIIIlIIIII[4] = 0xFFFFB9EF & 0x4EBF;
        e.lIlIIIIlIIIII[5] = 0xFFFFF5DF & 0x2FF5;
    }
}

