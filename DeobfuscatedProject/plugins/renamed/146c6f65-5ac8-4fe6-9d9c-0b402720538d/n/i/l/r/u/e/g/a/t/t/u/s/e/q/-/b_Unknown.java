/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.NPC
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.NPC;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;

@Singleton
public class b_Unknown {
    private /* synthetic */ int A;
    private /* synthetic */ int B;
    private /* synthetic */ int y;
    private /* synthetic */ int z;
    private final /* synthetic */ EventBus u;
    private static /* synthetic */ int[] llIIllIllIIl;
    private /* synthetic */ int x;
    private /* synthetic */ int w;
    private /* synthetic */ Map<NPC, Integer> v;

    public void v() {
        this.y = llIIllIllIIl[4];
        this.A = llIIllIllIIl[4];
    }

    private static boolean lllllllIIllIll(int n2) {
        return n2 > 0;
    }

    public void a(NPC nPC) {
        this.v.put(nPC, llIIllIllIIl[5]);
        0;
    }

    public int b(NPC nPC) {
        return this.v.getOrDefault(nPC, llIIllIllIIl[1]);
    }

    public void d(int n2) {
        this.w = n2;
    }

    private static boolean lllllllIIllIlI(int n2) {
        return n2 == 0;
    }

    public void c(int n2) {
        this.B = n2;
        this.y = llIIllIllIIl[2];
        this.z = llIIllIllIIl[2];
        this.A = llIIllIllIIl[2];
    }

    public int z() {
        return this.w;
    }

    public boolean s() {
        boolean bl;
        if (b.lllllllIIllIll(this.A)) {
            bl = llIIllIllIIl[0];
            0;
            if (2 == 3) {
                return false;
            }
        } else {
            bl = llIIllIllIIl[1];
        }
        return bl;
    }

    @Inject
    public b(EventBus eventBus) {
        this.v = new HashMap<NPC, Integer>();
        this.u = eventBus;
    }

    public boolean q() {
        boolean bl;
        if (b.lllllllIIllIll(this.y)) {
            bl = llIIllIllIIl[0];
            0;
            
            }
        } else {
            bl = llIIllIllIIl[1];
        }
        return bl;
    }

    public void w() {
        this.v();
        this.z = llIIllIllIIl[4];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        b var3;
        this.w += llIIllIllIIl[0];
        Iterator<NPC> var4 = this.v.keySet().iterator();
        while (b.lllllllIIllIIl(var4.hasNext() ? 1 : 0)) {
            NPC var1 = var4.next();
            int var2 = var3.v.get(var1) - llIIllIllIIl[0];
            if (b.lllllllIIllIlI(var2)) {
                var3.v.remove(var1);
                0;
                0;
                if (-3 >= 0) {
                    return;
                }
            } else {
                var3.v.put(var1, var2);
                0;
            }
            0;
            if ((0x6B ^ 0x4A ^ (0x43 ^ 0x67)) != 0) continue;
            return;
        }
        if (b.lllllllIIllIIl(var3.p() ? 1 : 0)) {
            var3.x -= llIIllIllIIl[0];
        }
        if (b.lllllllIIllIIl(var3.q() ? 1 : 0)) {
            var3.y -= llIIllIllIIl[0];
        }
        if (b.lllllllIIllIIl(var3.t() ? 1 : 0)) {
            var3.B -= llIIllIllIIl[0];
        }
        if (b.lllllllIIllIIl(var3.r() ? 1 : 0)) {
            var3.z -= llIIllIllIIl[0];
        }
        if (b.lllllllIIllIIl(var3.s() ? 1 : 0)) {
            var3.A -= llIIllIllIIl[0];
        }
    }

    private static void lllllllIIllIII() {
        llIIllIllIIl = new int[6];
        b.llIIllIllIIl[0] = 1;
        b.llIIllIllIIl[1] = (0x50 ^ 0x4F) & ~(0x34 ^ 0x2B);
        b.llIIllIllIIl[2] = 2;
        b.llIIllIllIIl[3] = 0x6B ^ 0x6F;
        b.llIIllIllIIl[4] = 3;
        b.llIIllIllIIl[5] = 0x8C ^ 0xA5 ^ (0x63 ^ 0x5F);
    }

    public boolean p() {
        boolean bl;
        if (b.lllllllIIllIll(this.x)) {
            bl = llIIllIllIIl[0];
            0;
            if (-1 > 0) {
                return ((67 + 18 - -5 + 67 ^ 118 + 166 - 251 + 150) & (0xFD ^ 0xB5 ^ (0x66 ^ 4) ^ -1)) != 0;
            }
        } else {
            bl = llIIllIllIIl[1];
        }
        return bl;
    }

    public boolean r() {
        boolean bl;
        if (b.lllllllIIllIll(this.z)) {
            bl = llIIllIllIIl[0];
            0;
            if (3 == 0) {
                return ((0x4E ^ 3 ^ (0x16 ^ 0x1D)) & (0x75 ^ 0x19 ^ (0x80 ^ 0xAA) ^ -1)) != 0;
            }
        } else {
            bl = llIIllIllIIl[1];
        }
        return bl;
    }

    private static boolean lllllllIIllIIl(int n2) {
        return n2 != 0;
    }

    public void x() {
        this.u.register((Object)this);
        this.d(llIIllIllIIl[1]);
    }

    public void u() {
        this.B = llIIllIllIIl[3];
        this.y = llIIllIllIIl[4];
    }

    public void y() {
        this.u.unregister((Object)this);
        this.d(llIIllIllIIl[1]);
    }

    public boolean t() {
        boolean bl;
        if (b.lllllllIIllIll(this.B)) {
            bl = llIIllIllIIl[0];
            0;
            if (1 > 3) {
                return false;
            }
        } else {
            bl = llIIllIllIIl[1];
        }
        return bl;
    }

    public void e(int n2) {
        this.x = n2;
    }

    static {
        b.lllllllIIllIII();
    }
}

