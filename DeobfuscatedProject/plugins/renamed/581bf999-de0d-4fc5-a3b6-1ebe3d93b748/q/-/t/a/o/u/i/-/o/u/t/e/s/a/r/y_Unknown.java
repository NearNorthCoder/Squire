/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.Hitsplat
 *  net.runelite.api.NPC
 *  net.runelite.api.events.HitsplatApplied
 *  net.runelite.client.eventbus.Subscribe
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.Hitsplat;
import net.runelite.api.NPC;
import net.runelite.api.events.HitsplatApplied;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class y_Unknown {
    private static /* synthetic */ int[] llIlIlIIIll;
    private static final /* synthetic */ int aQ;
    private /* synthetic */ int aS;
    @Inject
    protected /* synthetic */ Client ai;
    private /* synthetic */ NPC aR;

    private static boolean lIlIIllIlIIIIl(Object object, Object object2) {
        return object != object2;
    }

    public void h(int n2) {
        this.aS = n2;
    }

    static {
        y.lIlIIllIIlllII();
        aQ = llIlIlIIIll[1];
    }

    private static boolean lIlIIllIIlllll(Object object) {
        return object == null;
    }

    private static void lIlIIllIIlllII() {
        llIlIlIIIll = new int[2];
        y.llIlIlIIIll[0] = (0x23 ^ 0x6F ^ (0xED ^ 0x93)) & (55 + 87 - 101 + 93 ^ 176 + 73 - 134 + 65 ^ -1);
        y.llIlIlIIIll[1] = 0xFFFF9DFF & 0x7FDA;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(HitsplatApplied hitsplatApplied) {
        y var1;
        void var2;
        Actor actor = hitsplatApplied.getActor();
        Hitsplat hitsplat = hitsplatApplied.getHitsplat();
        if (!y.lIlIIllIIllllI(hitsplat.isMine() ? 1 : 0) || y.lIlIIllIIlllIl(actor, this.ai.getLocalPlayer())) {
            return;
        }
        NPC var3 = (NPC)var2;
        if (y.lIlIIllIIlllll(var3)) {
            return;
        }
        if (y.lIlIIllIlIIIII(var1.ai.getLocalPlayer().getAnimation(), llIlIlIIIll[1])) {
            return;
        }
        if (y.lIlIIllIlIIIIl(var1.aR, var3)) {
            var1.aR = var3;
            var1.aS = llIlIlIIIll[0];
        }
        this.aS += hitsplat.getAmount();
    }

    private static boolean lIlIIllIIlllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIllIIllllI(int n2) {
        return n2 != 0;
    }

    public int b(NPC nPC) {
        if (y.lIlIIllIIlllIl(nPC, this.aR)) {
            return this.aS;
        }
        return llIlIlIIIll[0];
    }

    private static boolean lIlIIllIlIIIII(int n2, int n3) {
        return n2 != n3;
    }

    public int ah() {
        return this.aS;
    }
}

