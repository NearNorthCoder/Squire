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
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.FHelper;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Handling zebak prayers", priority=0x7FFFFFFF, register=true)
public class HandlingZebakPrayersTask
extends AutotoaManager {
    private  Prayer dE;
    private static final  int hg;
    private  int hh;

    private static boolean var2(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        void var3;
        if (bW.var2(projectileSpawned.getProjectile().getId(), var1[4])) {
            this.dE = Prayer.PROTECT_FROM_MAGIC;
            0;
            if (-3 >= 0) {
                return;
            }
        } else if (bW.var4(f.E.contains(var3.getProjectile().getId()) ? 1 : 0)) {
            var5.dE = Prayer.PROTECT_FROM_MISSILES;
        }
    }

    @Subscribe
    public void b(GraphicsObjectCreated graphicsObjectCreated) {
        if (bW.var2(graphicsObjectCreated.getGraphicsObject().getId(), var1[5])) {
            this.hh = Static.getClient().getTickCount() + var1[6];
        }
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    private static boolean var6(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var7(Object object) {
        return object == null;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Override
    public int aO() {
        return var1[2];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public List<Prayer> aN() {
        bW var8;
        void var9;
        NPC nPC = this.cm.b();
        if (bW.var7(nPC)) {
            return List.of(this.aQ(), this.dE);
        }
        int var10 = var9.getHealthRatio() * var1[0] / var9.getHealthScale();
        if (bW.var2(Static.getClient().getTickCount(), var8.hh) && bW.var11(var10, var1[1])) {
            return List.of(var8.aQ(), Prayer.PROTECT_FROM_MAGIC);
        }
        return List.of(this.aQ(), this.dE);
    }

    private static void var12() {
        var1 = new int[10];
        bW.var1[0] = 0x33 ^ 0x57;
        bW.var1[1] = 0xFC ^ 0xBF ^ (0x4A ^ 0x10);
        bW.var1[2] = 0xFFFFFF55 & 0x3DFE;
        bW.var1[3] = 1;
        bW.var1[4] = -(0xFFFF83BD & 0x7F5B) & (0xFFFFBB9D & 0x4FFF);
        bW.var1[5] = 0xFFFFF5FB & 0xB7D;
        bW.var1[6] = 2;
        bW.var1[7] = 0xFFFFAFFB & 0x7DD6;
        bW.var1[8] = 0xFFFFBFFE & 0x6DD5;
        bW.var1[9] = (0x54 ^ 0x16 ^ (0xCA ^ 0x8E)) & (165 + 161 - 300 + 170 ^ 156 + 62 - 170 + 146 ^ -1);
    }

    private static boolean var11(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean aS() {
        return var1[3];
    }

    static {
        bW.var12();
        hg = var1[5];
    }

    @Override
    public boolean aL() {
        return this.cm.a((NPC nPC) -> {
            boolean bl2;
            if (!bW.var6(nPC.getId(), var1[7]) || bW.var2(nPC.getId(), var1[8])) {
                bl2 = var1[3];
                0;
                if (-1 >= ((0x98 ^ 0xBD) & ~(0x95 ^ 0xB0))) {
                    return ((0x77 ^ 0x16) & ~(0x7B ^ 0x1A)) != 0;
                }
            } else {
                bl2 = var1[9];
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

