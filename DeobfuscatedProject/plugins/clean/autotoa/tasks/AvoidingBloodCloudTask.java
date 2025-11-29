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
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Avoiding Blood Cloud", priority=15, blocking=true)
public class AvoidingBloodCloudTask
extends AutotoaTaskBase {

    @Inject
    protected AvoidingBloodCloudTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIlllIIlIIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIIlIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        bO.lIIlllIIlIIIII();
    }

    private static boolean lIIlllIIlIIIIl(Object object) {
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
        bO var1;
        void var2;
        NPC nPC = this.cA();
        if (bO.lIIlllIIlIIIIl(nPC)) {
            return llIIIIIIlll[0];
        }
        Player var3 = Players.getLocal();
        if (bO.lIIlllIIlIIIlI(var2.distanceTo((Locatable)var3), llIIIIIIlll[1])) {
            return llIIIIIIlll[0];
        }
        WorldArea var4 = var3.getWorldArea().offset(llIIIIIIlll[2]);
        WorldPoint var5 = var4.toWorldPointList().stream().filter(worldPoint -> {
            boolean bl2;
            if (bO.lIIlllIIlIIIll(this.p((WorldPoint)worldPoint) ? 1 : 0)) {
                bl2 = llIIIIIIlll[3];

                if (1 == 2) {
                    return false;
                }
            } else {
                bl2 = llIIIIIIlll[0];
            }
            return bl2;
        }).filter(Reachable::isWalkable).max(Comparator.comparingDouble(arg_0 -> bO.h((NPC)var2, arg_0))).orElse(null);
        if (bO.lIIlllIIlIIIIl(var5)) {
            return llIIIIIIlll[0];
        }
        worldPoint2 = this.C(var2_2.getWorldLocation(), worldPoint2);
        Movement.setDestination((WorldPoint)worldPoint2);
        return llIIIIIIlll[3];
    }
}

