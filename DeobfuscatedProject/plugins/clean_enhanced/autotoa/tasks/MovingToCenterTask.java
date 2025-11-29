/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum6;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving to center", priority=30)
public class MovingToCenterTask
extends AutotoaManager {
    private static final  RegionPoint hf;

    private static boolean var2(int n2, int n3) {
        return n2 <= n3;
    }

    private static void var3() {
        var1 = new int[6];
        bV.var1[0] = (0x39 ^ 0xF) & ~(0x69 ^ 0x5F);
        bV.var1[1] = 2;
        bV.var1[2] = 1;
        bV.var1[3] = 0xAC ^ 0xB5;
        bV.var1[4] = 20 + 172 - 104 + 103 ^ 35 + 66 - 38 + 97;
        bV.var1[5] = -(0xFFFFE2E9 & 0x5F3F) & (0xFFFFFF7E & 0x7FFD);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var2_2;
        bV var4;
        if (bV.var5(this.bq() ? 1 : 0) && bV.var6(Combat.isSpecEnabled() ? 1 : 0)) {
            return var1[0];
        }
        if (bV.var5(var4.cE().isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        WorldPoint var7 = Players.getLocal().getWorldLocation();
        WorldPoint var8 = WorldPoint.toLocalInstance((Client)var4.cu, (WorldPoint)hf.toWorld()).stream().min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo2D(var7))).orElse(null);
        if (bV.var9(var8)) {
            return var1[0];
        }
        if (bV.var2(var8.distanceTo(var7), var1[1]) && bV.var10(var7.getWorldX(), var8.getWorldX())) {
            return var1[0];
        }
        NPC var11 = var4.cA();
        if (bV.var12(var11)) {
            return var1[0];
        }
        if (bV.var6(var4.p(var8) ? 1 : 0)) {
            return var1[0];
        }
        this.a((WorldPoint)var2_2, this::P);
        return var1[2];
    }

    private static boolean var10(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var6(int n2) {
        return n2 != 0;
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    @Inject
    protected MovingToCenterTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bY.ATTACK);
    }

    static {
        bV.var3();
        hf = new RegionPoint(var1[3], var1[4], var1[0], var1[5]);
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    private static boolean var12(Object object) {
        return object != null;
    }
}

