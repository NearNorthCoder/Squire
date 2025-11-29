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
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.BHelper;
import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Handling zebak prayers", priority=0x7FFFFFFF, register=true)
public class HandlingZebakPrayersTask
extends ToaTaskBase {
    private  Prayer ba;

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
    public HandlingZebakPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
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

            if (3 != 3) {
                return;
            }
        } else if (R.lIllIlIlIIllllI(b.r.contains(var1.getProjectile().getId()) ? 1 : 0)) {
            var2.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }
}

