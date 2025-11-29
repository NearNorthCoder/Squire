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
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.f;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Handling Tumeken P3 Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingTumekenP3PrayersTask
extends AutotoaTaskBase {
    private  Prayer dE;

    @Override
    public boolean aL() {
        int[] nArray = new int[llIIIlIIIII[1]];
        nArray[aG.llIIIlIIIII[2]] = llIIIlIIIII[3];
        nArray[aG.llIIIlIIIII[4]] = llIIIlIIIII[5];
        return this.cm.a(nArray);
    }

    private static boolean lIIlllIlllIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (aG.lIIlllIlllIIlI(nPC.getId(), llIIIlIIIII[7])) {
            Prayer prayer;
            if (aG.lIIlllIlllIIlI(nPC.getGraphic(), llIIIlIIIII[8])) {
                prayer = Prayer.PROTECT_FROM_MAGIC;

                if (2 > 3) {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            this.dE = prayer;
        }
    }

    @Override
    public List<Prayer> aN() {
        if (aG.lIIlllIlllIIIl(this.dE)) {
            return List.of(this.aQ());
        }
        return List.of(this.aQ(), this.dE);
    }

    @Override
    public int aO() {
        return llIIIlIIIII[0];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var1;
        Projectile projectile = projectileSpawned.getProjectile();
        if (aG.lIIlllIlllIIlI(projectile.getId(), llIIIlIIIII[6])) {
            this.dE = Prayer.PROTECT_FROM_MAGIC;

            if ((0x11 ^ 0x64 ^ (0x14 ^ 0x65)) <= 1) {
                return;
            }
        } else if (aG.lIIlllIlllIIll(f.E.contains(var1.getProjectile().getId()) ? 1 : 0)) {
            var2.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Inject
    public HandlingTumekenP3PrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dE = null;
    }

    private static boolean lIIlllIlllIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIlllIIIl(Object object) {
        return object == null;
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    static {
        aG.lIIlllIlllIIII();
    }
}

