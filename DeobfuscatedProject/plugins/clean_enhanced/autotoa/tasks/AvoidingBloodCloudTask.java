/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Avoiding Blood Cloud", priority=15, blocking=true)
public class AvoidingBloodCloudTask
extends AutotoaManager {

    private static void var2() {
        var1 = new int[4];
        bO.var1[0] = (0x7A ^ 0x26) & ~(0x35 ^ 0x69);
        bO.var1[1] = 2;
        bO.var1[2] = 3;
        bO.var1[3] = 1;
    }

    @Inject
    protected AvoidingBloodCloudTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean var3(int n2) {
        return n2 == 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 > n3;
    }

    static {
        bO.var2();
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    private static  double h(NPC nPC, WorldPoint worldPoint) {
        return worldPoint.distanceTo2DHypotenuse(nPC.getWorldLocation());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        WorldPoint worldPoint2;
        void var2_2;
        bO var6;
        void var7;
        NPC nPC = this.cA();
        if (bO.var5(nPC)) {
            return var1[0];
        }
        Player var8 = Players.getLocal();
        if (bO.var4(var7.distanceTo((Locatable)var8), var1[1])) {
            return var1[0];
        }
        WorldArea var9 = var8.getWorldArea().offset(var1[2]);
        WorldPoint var10 = var9.toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bO.var3(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = var1[3];
                0;
                if (1 == 2) {
                    return ((0x26 ^ 0x6D) & ~(0xA ^ 0x41)) != 0;
                }
            } else {
                bl2 = var1[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).max(Comparator.comparingDouble(arg_0 -> bO.h((NPC)var7, arg_0))).orElse(null);
        if (bO.var5(var10)) {
            return var1[0];
        }
        worldPoint2 = this.C(var2_2.getWorldLocation(), worldPoint2);
        Movement.setDestination((WorldPoint)worldPoint2);
        return var1[3];
    }
}

