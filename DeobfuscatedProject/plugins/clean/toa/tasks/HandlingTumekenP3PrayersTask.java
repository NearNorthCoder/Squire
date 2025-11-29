/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.ProjectileSpawned
 *  net.runelite.client.eventbus.Subscribe
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.BHelper;
import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;

@TaskDesc(name="Handling Tumeken P3 Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingTumekenP3PrayersTask
extends ToaTaskBase {
    
    private  Prayer ba;

    private static boolean lIllIlIllIIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean I() {
        return this.C();
    }

    @Override
    public n HandlingTumekenP3PrayersTask() {
        return this.aT.prayFlickLastWarden();
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIIlllllllIlI[1]];
        nArray[J.lIIlllllllIlI[2]] = lIIlllllllIlI[3];
        nArray[J.lIIlllllllIlI[4]] = lIIlllllllIlI[5];
        return this.aS.a(nArray);
    }

    private static boolean lIllIlIllIIIIIl(Object object) {
        return object == null;
    }

    @Inject
    public HandlingTumekenP3PrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
        this.ba = null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var1;
        Projectile projectile = projectileSpawned.getProjectile();
        if (J.lIllIlIllIIIIlI(projectile.getId(), lIIlllllllIlI[6])) {
            this.ba = Prayer.PROTECT_FROM_MAGIC;

            }
        } else if (J.lIllIlIllIIIIll(b.r.contains(var1.getProjectile().getId()) ? 1 : 0)) {
            var2.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Override
    public int F() {
        return lIIlllllllIlI[0];
    }

    static {
        J.lIllIlIllIIIIII();
    }

    private static boolean lIllIlIllIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public List<Prayer> E() {
        if (J.lIllIlIllIIIIIl(this.ba)) {
            return List.of(this.H());
        }
        return List.of(this.H(), this.ba);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (J.lIllIlIllIIIIlI(nPC.getId(), lIIlllllllIlI[7])) {
            Prayer prayer;
            if (J.lIllIlIllIIIIlI(nPC.getGraphic(), lIIlllllllIlI[8])) {
                prayer = Prayer.PROTECT_FROM_MAGIC;

                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            this.ba = prayer;
        }
    }
}

