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
import gg.squire.toa.tasks.ToaManager;
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
extends ToaManager {
    
    private  Prayer ba;

    private static boolean var2(int n2) {
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
        int[] nArray = new int[var1[1]];
        nArray[J.var1[2]] = var1[3];
        nArray[J.var1[4]] = var1[5];
        return this.aS.a(nArray);
    }

    private static void var3() {
        var1 = new int[9];
        J.var1[0] = 0xFFFFFF59 & 0x3DF6;
        J.var1[1] = 2;
        J.var1[2] = (224 + 195 - 286 + 99 ^ 104 + 170 - 241 + 159) & (68 + 13 - 39 + 127 ^ 12 + 22 - -35 + 60 ^ -1);
        J.var1[3] = -(0xFFFF93FF & 0x7E05) & (0xFFFFFFFF & 0x3FF6);
        J.var1[4] = 1;
        J.var1[5] = 0xFFFFADFC & 0x7FF7;
        J.var1[6] = 0xFFFFD9A5 & 0x2EDF;
        J.var1[7] = 0xFFFFBFF4 & 0x6DEB;
        J.var1[8] = -(0xFFFFFD66 & 0x27DB) & (0xFFFFBDDF & 0x6FEB);
    }

    private static boolean var4(Object object) {
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
        void var5;
        Projectile projectile = projectileSpawned.getProjectile();
        if (J.var6(projectile.getId(), var1[6])) {
            this.ba = Prayer.PROTECT_FROM_MAGIC;
            0;
            if null != null {
                return;
            }
        } else if (J.var2(b.r.contains(var5.getProjectile().getId()) ? 1 : 0)) {
            var7.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Override
    public int F() {
        return var1[0];
    }

    static {
        J.var3();
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public List<Prayer> E() {
        if (J.var4(this.ba)) {
            return List.of(this.H());
        }
        return List.of(this.H(), this.ba);
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (J.var6(nPC.getId(), var1[7])) {
            Prayer prayer;
            if (J.var6(nPC.getGraphic(), var1[8])) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                0;
                if null != null {
                    return;
                }
            } else {
                prayer = Prayer.PROTECT_FROM_MISSILES;
            }
            this.ba = prayer;
        }
    }
}

