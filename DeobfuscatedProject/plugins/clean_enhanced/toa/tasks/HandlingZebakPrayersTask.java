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
import gg.squire.toa.tasks.ToaManager;
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
extends ToaManager {
    private  Prayer ba;

    @Override
    public List<Prayer> E() {
        return List.of(this.H(), this.ba);
    }

    private static boolean var2(int n2, int n3) {
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
        R.var3();
    }

    @Override
    public int F() {
        return var1[0];
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean C() {
        return this.aS.a((NPC nPC) -> {
            boolean bl;
            if (!R.var2(nPC.getId(), var1[3]) || R.var5(nPC.getId(), var1[4])) {
                bl = var1[1];
                0;
                if (((0xAD ^ 0xB5) & ~(0xB0 ^ 0xA8)) == -1) {
                    return ((0x24 ^ 0x10) & ~(0x41 ^ 0x75)) != 0;
                }
            } else {
                bl = var1[5];
            }
            return bl;
        });
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static void var3() {
        var1 = new int[6];
        R.var1[0] = 0xFFFFFFF7 & 0x3D5C;
        R.var1[1] = 1;
        R.var1[2] = -(0xFFFFD679 & 0x7DD7) & (0xFFFFFCDF & 0x5FF5);
        R.var1[3] = 0xFFFFBDF3 & 0x6FDE;
        R.var1[4] = 0xFFFFAFD6 & 0x7DFD;
        R.var1[5] = (0x42 ^ 0x22) & ~(0xD2 ^ 0xB2);
    }

    @Override
    public boolean I() {
        return var1[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var6;
        if (R.var5(projectileSpawned.getProjectile().getId(), var1[2])) {
            this.ba = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (3 != 3) {
                return;
            }
        } else if (R.var4(b.r.contains(var6.getProjectile().getId()) ? 1 : 0)) {
            var7.ba = Prayer.PROTECT_FROM_MISSILES;
        }
    }
}

