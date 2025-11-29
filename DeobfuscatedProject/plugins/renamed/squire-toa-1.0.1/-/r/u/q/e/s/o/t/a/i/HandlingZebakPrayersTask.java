/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.b;
import -.r.u.q.e.s.o.t.a.i.NEnum;
import -.r.u.q.e.s.o.t.a.i.z_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;

/* TASK: Handling zebak prayers -> HandlingzebakprayersTask */
@TaskDesc(name="Handling zebak prayers", priority=0x7FFFFFFF, register=true)
public class HandlingZebakPrayersTask
extends z_Unknown {
    private /* synthetic */ Prayer ba;
    private static /* synthetic */ int[] lIIlllllIlllI;

    @Override
    public List<Prayer> E() {
        return List.of(this.H(), this.ba);
    }

    private static boolean lIllIlIlIIlllll(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public n J() {
        return this.aT.prayModeZebak();
    }

    @Inject
    public R(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.ba = Prayer.PROTECT_FROM_MISSILES;
    }

    static {
        R.lIllIlIlIIlllII();
    }

    @Override
    public int F() {
        return lIIlllllIlllI[0];
    }

    private static boolean lIllIlIlIIllllI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean C() {
        return this.aS.a((NPC nPC) -> {
            boolean bl;
            if (!R.lIllIlIlIIlllll(nPC.getId(), lIIlllllIlllI[3]) || R.lIllIlIlIIlllIl(nPC.getId(), lIIlllllIlllI[4])) {
                bl = lIIlllllIlllI[1];
                0;
                if (((0xAD ^ 0xB5) & ~(0xB0 ^ 0xA8)) == -1) {
                    return false;
                }
            } else {
                bl = lIIlllllIlllI[5];
            }
            return bl;
        });
    }

    private static boolean lIllIlIlIIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIllIlIlIIlllII() {
        lIIlllllIlllI = new int[6];
        R.lIIlllllIlllI[0] = 0xFFFFFFF7 & 0x3D5C;
        R.lIIlllllIlllI[1] = 1;
        R.lIIlllllIlllI[2] = -(0xFFFFD679 & 0x7DD7) & (0xFFFFFCDF & 0x5FF5);
        R.lIIlllllIlllI[3] = 0xFFFFBDF3 & 0x6FDE;
        R.lIIlllllIlllI[4] = 0xFFFFAFD6 & 0x7DFD;
        R.lIIlllllIlllI[5] = (0x42 ^ 0x22) & ~(0xD2 ^ 0xB2);
    }

    @Override
    public boolean I() {
        return lIIlllllIlllI[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var1;
        if (R.lIllIlIlIIlllIl(projectileSpawned.getProjectile().getId(), lIIlllllIlllI[2])) {
            this.ba = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (3 != 3) {
                return;
            }
        } else if (R.lIllIlIlIIllllI(b.r.contains(var1.getProjectile().getId()) ? 1 : 0)) {
            llllllllllllllIlllIIlllllllIlIll.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }
}

