/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Projectile
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.gorillas.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@TaskDesc(name="Dodging boulders", priority=50, blocking=true)
public class DodgingBouldersTask
extends Task {

    private static  boolean b(NPC nPC, WorldPoint worldPoint) {
        boolean bl;
        if ((nPC.getWorldArea( == 0).contains(worldPoint) ? 1 : 0)) {
            bl = 0;
            0;
            if null != null {
                return ((0xA6 ^ 0xB4 ^ (0x59 ^ 0x6B)) & (86 + 144 - 173 + 119 ^ 101 + 81 - 145 + 107 ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    static {
        q.var2();
    }

    private static  boolean a(NPC nPC, WorldPoint worldPoint) {
        return nPC.getWorldArea().isInMeleeDistance(worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        Object var3;
        Projectile var4;
        void var5;
        int[] nArray = new int[0];
        nArray[1] = 2;
        List list = Projectiles.getAll((int[])nArray);
        if ((list.isEmpty( != 0) ? 1 : 0)) {
            return 1;
        }
        ArrayList<WorldPoint> var6 = new ArrayList<WorldPoint>();
        Player var7 = var5.iterator();
        while ((var7.hasNext( != 0) ? 1 : 0)) {
            var4 = (Projectile)var7.next();
            var3 = var4.getTarget();
            if var3 == null {
                0;
                if ((0x86 ^ 0x8C ^ (0x9B ^ 0x94)) > 0) continue;
                return ((25 + 4 - -89 + 43 ^ 15 + 44 - 26 + 122) & (0x2A ^ 0x4D ^ (0xDB ^ 0x86) ^ -1)) != 0;
            }
            WorldPoint var8 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var3);
            var6.add(var8);
            0;
            0;
            if null == null continue;
            return ((0xC1 ^ 0xC6) & ~(0x25 ^ 0x22)) != 0;
        }
        var7 = Players.getLocal();
        if ((var6.contains(var7.getWorldLocation( == 0)) ? 1 : 0)) {
            return 1;
        }
        var4 = NPCs.getNearest(nPC -> {
            boolean bl;
            if ((nPC.getInteracting() == nPC.getInteracting()2))) {
                bl = 0;
                0;
                if (-3 >= 0) {
                    return ((64 + 115 - 152 + 164 ^ 26 + 105 - -30 + 15) & (0x7A ^ 0x50 ^ (0xF ^ 0x2A) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
        if var4 != null {
            var3 = var4.getWorldArea().toWorldPointList().stream().flatMap(worldPoint -> worldPoint.dx(3).dy(3).createWorldArea(4, 4).toWorldPointList().stream()).filter(arg_0 -> q.b((NPC)var4, arg_0)).filter(worldPoint -> {
                boolean bl;
                if ((var6.contains(worldPoint == 0) ? 1 : 0)) {
                    bl = 0;
                    0;
                    if (((0xD0 ^ 0xBB ^ (0x7C ^ 0x32)) & (3 ^ (0x2F ^ 9) ^ -1)) < 0) {
                        return ((94 + 82 - 123 + 88 ^ 44 + 101 - 136 + 124) & (107 + 26 - -3 + 12 ^ 152 + 10 - 45 + 39 ^ -1)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }).filter(arg_0 -> q.a((NPC)var4, arg_0)).filter(Reachable::isWalkable).collect(Collectors.toList());
            0;
            if null != null {
                return ((0xC ^ 0x66 ^ (0x3D ^ 0x61)) & (76 + 131 - 70 + 52 ^ 78 + 137 - 182 + 106 ^ -1)) != 0;
            }
        } else {
            var3 = var7.getWorldLocation().dx(3).dy(3).createWorldArea(4, 4).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if ((var6.contains(worldPoint == 0) ? 1 : 0)) {
                    bl = 0;
                    0;
                    if (((0x28 ^ 0x5B ^ (0x66 ^ 0x22)) & (0x63 ^ 0x7B ^ (0x8F ^ 0xA0) ^ -1)) > 0) {
                        return ((0xBF ^ 0xAF ^ (0x63 ^ 0x6B)) & (41 + 3 - -65 + 63 ^ 173 + 77 - 136 + 66 ^ -1)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            }).filter(Reachable::isWalkable).collect(Collectors.toList());
        }
        if ((var3.isEmpty( != 0) ? 1 : 0)) {
            return 1;
        }
        Movement.setDestination((WorldPoint)((WorldPoint)var5_5.get(Rand.nextInt((int)1, (int)var5_5.size()))));
        return 0;
    }
}

