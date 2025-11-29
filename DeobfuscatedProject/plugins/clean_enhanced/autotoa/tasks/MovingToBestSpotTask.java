/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum16;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving to best spot", priority=20)
public class MovingToBestSpotTask
extends AutotoaManager {
    private static final  RegionPoint fe;
    private static final  RegionPoint ff;

    private static boolean var2(int n2) {
        return n2 != 0;
    }

    private static  boolean g(NPC nPC, WorldPoint worldPoint) {
        boolean bl2;
        if (bl.var3(nPC.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            bl2 = var1[1];
            0;
            if ((39 + 10 - -133 + 6 ^ 61 + 177 - 213 + 159) <= 2) {
                return ((0xD6 ^ 0xBC ^ (0x95 ^ 0xC6)) & (0x2C ^ 0x67 ^ (0xFF ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            bl2 = var1[0];
        }
        return bl2;
    }

    private static  boolean f(NPC nPC, WorldPoint worldPoint) {
        return nPC.getWorldArea().isInMeleeDistance(worldPoint);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var6_6;
        void var4;
        bl var5;
        Player player = Players.getLocal();
        NPC nPC = this.bO();
        if (bl.var6(nPC)) {
            return var1[0];
        }
        if (!bl.var3(var5.bR() ? 1 : 0) || bl.var2(bl.bV() ? 1 : 0)) {
            return var1[0];
        }
        Set<WorldPoint> var7 = var5.bU();
        if (bl.var3(var7.isEmpty() ? 1 : 0)) {
            return var1[0];
        }
        List<WorldPoint> var8 = var5.bS();
        WorldPoint var9 = var5.bT();
        WorldPoint var10 = var4.getWorldArea().offset(var1[1]).toWorldPointList().stream().filter(arg_0 -> bl.g((NPC)var4, arg_0)).filter(arg_0 -> bl.f((NPC)var4, arg_0)).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl2;
            if (bl.var3(var8.contains(worldPoint) ? 1 : 0)) {
                bl2 = var1[1];
                0;
                if (3 < 0) {
                    return ((101 + 121 - 146 + 74 ^ 11 + 65 - -62 + 39) & (0xAC ^ 0xA1 ^ (0xED ^ 0xC7) ^ -1)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).min(Comparator.comparingDouble(object -> ((WorldPoint)object).distanceToPath(this.cu, var9)).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(var9)))).orElse(null);
        if (!bl.var11(var10) || bl.var12(var10.distanceTo2D(Players.getLocal().getWorldLocation()), var1[2])) {
            return var1[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return var1[1];
    }

    static {
        bl.var13();
        fe = new RegionPoint(var1[3], var1[4], var1[0], var1[5]);
        ff = new RegionPoint(var1[3], var1[6], var1[0], var1[5]);
    }

    @Inject
    protected MovingToBestSpotTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
    }

    private static void var13() {
        var1 = new int[7];
        bl.var1[0] = (0xA ^ 0x42 ^ (0x2B ^ 0x7F)) & (0x6A ^ 0x7E ^ (0x2A ^ 0x22) ^ -1);
        bl.var1[1] = 1;
        bl.var1[2] = 2;
        bl.var1[3] = 125 + 74 - 74 + 56 ^ 94 + 104 - 138 + 91;
        bl.var1[4] = 70 + 113 - 80 + 71 ^ 30 + 69 - 50 + 92;
        bl.var1[5] = -(0x65 ^ 0x47) & (0xFFFFB7FD & 0x7F77);
        bl.var1[6] = 0x82 ^ 0x9F;
    }

    private static boolean var12(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var11(Object object) {
        return object != null;
    }

    private static boolean var6(Object object) {
        return object == null;
    }
}

