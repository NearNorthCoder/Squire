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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.FHelper;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Handling Tumeken P3 Prayers", priority=0x7FFFFFFF, register=true)
public class HandlingTumekenP3PrayersTask
extends AutotoaManager {
    private  Prayer dE;

    @Override
    public boolean aL() {
        int[] nArray = new int[var1[1]];
        nArray[aG.var1[2]] = var1[3];
        nArray[aG.var1[4]] = var1[5];
        return this.cm.a(nArray);
    }

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean aS() {
        return this.aL();
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (aG.var3(nPC.getId(), var1[7])) {
            Prayer prayer;
            if (aG.var3(nPC.getGraphic(), var1[8])) {
                prayer = Prayer.PROTECT_FROM_MAGIC;
                0;
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
        if (aG.var4(this.dE)) {
            return List.of(this.aQ());
        }
        return List.of(this.aQ(), this.dE);
    }

    private static void var5() {
        var1 = new int[9];
        aG.var1[0] = -(0xFFFFF2CF & 0xFB4) & (0xFFFFBFD3 & Short.MAX_VALUE);
        aG.var1[1] = 2;
        aG.var1[2] = (0xF4 ^ 0xC5) & ~(0x1F ^ 0x2E);
        aG.var1[3] = -(0xFFFFDE2F & 0x63D5) & (0xFFFFEFFF & 0x7FF6);
        aG.var1[4] = 1;
        aG.var1[5] = -(0xFFFFD3DB & 0x7C2D) & (0xFFFFFFFF & 0x7DFC);
        aG.var1[6] = 0xFFFFCE95 & 0x39EF;
        aG.var1[7] = -(0xFFFFF35F & 0x1CBE) & (0xFFFFBDFD & Short.MAX_VALUE);
        aG.var1[8] = 0xFFFFFCCA & 0xBBF;
    }

    @Override
    public int aO() {
        return var1[0];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var6;
        Projectile projectile = projectileSpawned.getProjectile();
        if (aG.var3(projectile.getId(), var1[6])) {
            this.dE = Prayer.PROTECT_FROM_MAGIC;
            0;
            if ((0x11 ^ 0x64 ^ (0x14 ^ 0x65)) <= 1) {
                return;
            }
        } else if (aG.var2(f.E.contains(var6.getProjectile().getId()) ? 1 : 0)) {
            var7.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Inject
    public HandlingTumekenP3PrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.dE = null;
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    static {
        aG.var5();
    }
}

