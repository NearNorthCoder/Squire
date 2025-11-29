/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.gorillas.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaPlugin;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import gg.squire.gorillas.tasks.CHelper;
import gg.squire.gorillas.tasks.GameEnum3;

@TaskDesc(name="Detecting Melee", priority=25, blocking=true)
public class DetectingMeleeTask
extends Task {
    private final  SquireGorillaPlugin aa;

    static {
        p.var2();
    }

    private static  boolean c(NPC nPC, WorldPoint worldPoint) {
        boolean bl;
        if ((nPC.getWorldArea( == 0).contains(worldPoint) ? 1 : 0)) {
            bl = 4;
            0;
            
        } else {
            bl = 0;
        }
        return bl;
    }

    private static  boolean a(NPC nPC, WorldPoint worldPoint) {
        return nPC.getWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), worldPoint);
    }

    @Inject
    public DetectingMeleeTask(SquireGorillaPlugin squireGorillaPlugin) {
        this.aa = squireGorillaPlugin;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        void var3;
        p var4;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            boolean bl;
            if ((nPC.getInteracting() == nPC.getInteracting()2))) {
                bl = 4;
                0;
                if (((0x6E ^ 0x7B) & ~(0x2A ^ 0x3F)) >= 3) {
                    return ((0xAF ^ 0xA4) & ~(0x5C ^ 0x57)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        });
        if nPC2 == null {
            return 0;
        }
        c var5 = var4.aa.a((NPC)var3);
        if var5 == null {
            return 0;
        }
        if ((var5.o( > 0)) && (var5.o() < 1)) {
            return 0;
        }
        List<d> var6 = var5.n();
        int var7 = var6.size();
        if (!(var7 >= 2) || (var6.contains((Object == 0)d.MELEE) ? 1 : 0)) {
            return 0;
        }
        WorldPoint var8 = Players.getLocal().getWorldLocation();
        if ((var3.getWorldArea( == 0).isInMeleeDistance(var8) ? 1 : 0)) {
            return 0;
        }
        WorldPoint var9 = var8.dx(3).dy(3).createWorldArea(1, 1).toWorldPointList().stream().filter(arg_0 -> p.c((NPC)var3, arg_0)).filter(arg_0 -> p.b((NPC)var3, arg_0)).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl;
            if ((Reachable.isObstacle((WorldPoint == 0)worldPoint) ? 1 : 0)) {
                bl = 4;
                0;
                if null != null {
                    return ((19 + 163 - -5 + 30 ^ 30 + 95 - -22 + 1) & (26 + 203 - 68 + 54 ^ 108 + 34 - 101 + 113 ^ -1)) != 0;
                }
            } else {
                bl = 0;
            }
            return bl;
        }).filter(arg_0 -> p.a((NPC)var3, arg_0)).max(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var8))).orElse(null);
        if var9 == null {
            return 0;
        }
        Movement.setDestination((WorldPoint)var6_6);
        return 4;
    }

    private static  boolean b(NPC nPC, WorldPoint worldPoint) {
        boolean bl;
        if ((nPC.getWorldArea( == 0).isInMeleeDistance(worldPoint) ? 1 : 0)) {
            bl = 4;
            0;
            if (-1 > 0) {
                return ((0x93 ^ 0xAE) & ~(2 ^ 0x3F)) != 0;
            }
        } else {
            bl = 0;
        }
        return bl;
    }

}

