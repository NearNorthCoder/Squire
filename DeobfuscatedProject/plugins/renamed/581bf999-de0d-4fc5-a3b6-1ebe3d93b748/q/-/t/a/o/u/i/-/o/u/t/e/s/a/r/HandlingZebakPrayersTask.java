/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.client.Static;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.W_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.VEnum;

/* TASK: Handling zebak prayers -> HandlingzebakprayersTask */
@TaskDesc(name="Handling zebak prayers", priority=0x7FFFFFFF, register=true)
public class HandlingZebakPrayersTask
extends W_Unknown {
    private /* synthetic */ Prayer dE;
    private static final /* synthetic */ int hg;
    private /* synthetic */ int hh;
    private static /* synthetic */ int[] lIllIIlIIlI;

    private static boolean lIIlIlIlllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var3;
        if (bW.lIIlIlIlllIlIl(projectileSpawned.getProjectile().getId(), lIllIIlIIlI[4])) {
            this.dE = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (-3 >= 0) {
                return;
            }
        } else if (bW.lIIlIlIlllIlll(f.E.contains(var3.getProjectile().getId()) ? 1 : 0)) {
            llllllllllllllllIlIlIIllllllllIl.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        if (bW.lIIlIlIlllIlIl(graphicsObjectCreated.getGraphicsObject().getId(), lIllIIlIIlI[5])) {
            this.hh = Static.getClient().getTickCount() + lIllIIlIIlI[6];
        }
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static boolean lIIlIlIllllIII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIlIlllIlII(Object object) {
        return object == null;
    }

    private static boolean lIIlIlIlllIlll(int n2) {
        return n2 != 0;
    }

    @Override
    public int aO() {
        return lIllIIlIIlI[2];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> aN() {
        bW var2;
        void var1;
        NPC nPC = this.cm.b();
        if (bW.lIIlIlIlllIlII(nPC)) {
            return List.of(this.aQ(), this.dE);
        }
        int var4 = var1.getHealthRatio() * lIllIIlIIlI[0] / var1.getHealthScale();
        if (bW.lIIlIlIlllIlIl(Static.getClient().getTickCount(), var2.hh) && bW.lIIlIlIlllIllI(var4, lIllIIlIIlI[1])) {
            return List.of(var2.aQ(), Prayer.PROTECT_FROM_MAGIC);
        }
        return List.of(this.aQ(), this.dE);
    }

    private static void lIIlIlIlllIIll() {
        lIllIIlIIlI = new int[10];
        bW.lIllIIlIIlI[0] = 0x33 ^ 0x57;
        bW.lIllIIlIIlI[1] = 0xFC ^ 0xBF ^ (0x4A ^ 0x10);
        bW.lIllIIlIIlI[2] = 0xFFFFFF55 & 0x3DFE;
        bW.lIllIIlIIlI[3] = 1;
        bW.lIllIIlIIlI[4] = -(0xFFFF83BD & 0x7F5B) & (0xFFFFBB9D & 0x4FFF);
        bW.lIllIIlIIlI[5] = 0xFFFFF5FB & 0xB7D;
        bW.lIllIIlIIlI[6] = 2;
        bW.lIllIIlIIlI[7] = 0xFFFFAFFB & 0x7DD6;
        bW.lIllIIlIIlI[8] = 0xFFFFBFFE & 0x6DD5;
        bW.lIllIIlIIlI[9] = (0x54 ^ 0x16 ^ (0xCA ^ 0x8E)) & (165 + 161 - 300 + 170 ^ 156 + 62 - 170 + 146 ^ -1);
    }

    private static boolean lIIlIlIlllIllI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean aS() {
        return lIllIIlIIlI[3];
    }

    static {
        bW.lIIlIlIlllIIll();
        hg = lIllIIlIIlI[5];
    }

    @Override
    public boolean aL() {
        return this.cm.a((NPC nPC) -> {
            boolean bl2;
            if (!bW.lIIlIlIllllIII(nPC.getId(), lIllIIlIIlI[7]) || bW.lIIlIlIlllIlIl(nPC.getId(), lIllIIlIIlI[8])) {
                bl2 = lIllIIlIIlI[3];
                0;
                if (-1 >= ((0x98 ^ 0xBD) & ~(0x95 ^ 0xB0))) {
                    return false;
                }
            } else {
                bl2 = lIllIIlIIlI[9];
            }
            return bl2;
        });
    }

    @Inject
    public bW(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dE = Prayer.PROTECT_FROM_MISSILES;
    }
}

