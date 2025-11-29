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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Handling zebak prayers", priority=0x7FFFFFFF, register=true)
public class HandlingZebakPrayersTask
extends AutotoaTaskBase {
    private  Prayer dE;
    private static final  int hg;
    private  int hh;

    private static boolean lIIlIlIlllIlIl(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var1;
        if (bW.lIIlIlIlllIlIl(projectileSpawned.getProjectile().getId(), lIllIIlIIlI[4])) {
            this.dE = Prayer.PROTECT_FROM_MAGIC;

        } else if (bW.lIIlIlIlllIlll(f.E.contains(var1.getProjectile().getId()) ? 1 : 0)) {
            var2.dE = Prayer.PROTECT_FROM_MISSILES;
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
        bW var3;
        void var4;
        NPC nPC = this.cm.b();
        if (bW.lIIlIlIlllIlII(nPC)) {
            return List.of(this.aQ(), this.dE);
        }
        int var5 = var4.getHealthRatio() * lIllIIlIIlI[0] / var4.getHealthScale();
        if (bW.lIIlIlIlllIlIl(Static.getClient().getTickCount(), var3.hh) && bW.lIIlIlIlllIllI(var5, lIllIIlIIlI[1])) {
            return List.of(var3.aQ(), Prayer.PROTECT_FROM_MAGIC);
        }
        return List.of(this.aQ(), this.dE);
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
    public HandlingZebakPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dE = Prayer.PROTECT_FROM_MISSILES;
    }
}

