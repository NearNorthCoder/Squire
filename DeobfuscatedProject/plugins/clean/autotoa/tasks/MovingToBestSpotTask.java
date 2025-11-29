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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum118;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Moving to best spot", priority=20)
public class MovingToBestSpotTask
extends AutotoaTaskBase {
    private static final  RegionPoint fe;
    private static final  RegionPoint ff;

    private static boolean lIlIIIIllIllII(int n2) {
        return n2 != 0;
    }

    private static  boolean g(NPC nPC, WorldPoint worldPoint) {
        boolean bl2;
        if (bl.lIlIIIIllIlIll(nPC.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            bl2 = llIIlIlllIl[1];

            if ((39 + 10 - -133 + 6 ^ 61 + 177 - 213 + 159) <= 2) {
                return ((0xD6 ^ 0xBC ^ (0x95 ^ 0xC6)) & (0x2C ^ 0x67 ^ (0xFF ^ 0x8D) ^ -1)) != 0;
            }
        } else {
            bl2 = llIIlIlllIl[0];
        }
        return bl2;
    }

    private static  boolean f(NPC nPC, WorldPoint worldPoint) {
        return nPC.getWorldArea().isInMeleeDistance(worldPoint);
    }

    private static boolean lIlIIIIllIlIll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean bL() {
        void var6_6;
        void var1;
        bl var2;
        Player player = Players.getLocal();
        NPC nPC = this.bO();
        if (bl.lIlIIIIllIlIlI(nPC)) {
            return llIIlIlllIl[0];
        }
        if (!bl.lIlIIIIllIlIll(var2.bR() ? 1 : 0) || bl.lIlIIIIllIllII(bl.bV() ? 1 : 0)) {
            return llIIlIlllIl[0];
        }
        Set<WorldPoint> var3 = var2.bU();
        if (bl.lIlIIIIllIlIll(var3.isEmpty() ? 1 : 0)) {
            return llIIlIlllIl[0];
        }
        List<WorldPoint> var4 = var2.bS();
        WorldPoint var5 = var2.bT();
        WorldPoint var6 = var1.getWorldArea().offset(llIIlIlllIl[1]).toWorldPointList().stream().filter(arg_0 -> bl.g((NPC)var1, arg_0)).filter(arg_0 -> bl.f((NPC)var1, arg_0)).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl2;
            if (bl.lIlIIIIllIlIll(var4.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIlIlllIl[1];

                if (3 < 0) {
                    return ((101 + 121 - 146 + 74 ^ 11 + 65 - -62 + 39) & (0xAC ^ 0xA1 ^ (0xED ^ 0xC7) ^ -1)) != 0;
                }
            } else {
                bl2 = llIIlIlllIl[0];
            }
            return bl2;
        }).min(Comparator.comparingDouble(object -> ((WorldPoint)object).distanceToPath(this.cu, var5)).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(var5)))).orElse(null);
        if (!bl.lIlIIIIllIllIl(var6) || bl.lIlIIIIllIlllI(var6.distanceTo2D(Players.getLocal().getWorldLocation()), llIIlIlllIl[2])) {
            return llIIlIlllIl[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return llIIlIlllIl[1];
    }

    static {
        bl.lIlIIIIllIlIIl();
        fe = new RegionPoint(llIIlIlllIl[3], llIIlIlllIl[4], llIIlIlllIl[0], llIIlIlllIl[5]);
        ff = new RegionPoint(llIIlIlllIl[3], llIIlIlllIl[6], llIIlIlllIl[0], llIIlIlllIl[5]);
    }

    @Inject
    protected MovingToBestSpotTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
    }

    private static boolean lIlIIIIllIlllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIIIIllIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIIIIllIlIlI(Object object) {
        return object == null;
    }
}

