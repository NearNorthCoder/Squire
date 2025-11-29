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
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

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

/* TASK: Dodging boulders -> DodgingbouldersTask */
@TaskDesc(name="Dodging boulders", priority=50, blocking=true)
public class DodgingBouldersTask
extends Task {
    private static /* synthetic */ int[] llIIlIllllII;

    private static void lllllIlllIlIIl() {
        llIIlIllllII = new int[5];
        q.llIIlIllllII[0] = 1;
        q.llIIlIllllII[1] = (0x25 ^ 0x2F ^ 2) & (0xFE ^ 0xC1 ^ (0x5C ^ 0x6B) ^ -1);
        q.llIIlIllllII[2] = -(0xFFFFF4F7 & 0x3B2F) & (0xFFFFF7FF & 0x3B7E);
        q.llIIlIllllII[3] = -1;
        q.llIIlIllllII[4] = 3;
    }

    private static boolean lllllIlllIlIll(Object object) {
        return object == null;
    }

    private static boolean lllllIlllIllIl(Object object) {
        return object != null;
    }

    private static boolean lllllIlllIlllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllIlllIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllllIlllIllII(int n2) {
        return n2 == 0;
    }

    private static /* synthetic */ boolean b(NPC nPC, WorldPoint worldPoint) {
        boolean bl;
        if (q.lllllIlllIllII(nPC.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            bl = llIIlIllllII[0];
            0;
            
            }
        } else {
            bl = llIIlIllllII[1];
        }
        return bl;
    }

    static {
        q.lllllIlllIlIIl();
    }

    private static /* synthetic */ boolean a(NPC nPC, WorldPoint worldPoint) {
        return nPC.getWorldArea().isInMeleeDistance(worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        Object var3;
        Projectile var5;
        void var2;
        int[] nArray = new int[llIIlIllllII[0]];
        nArray[q.llIIlIllllII[1]] = llIIlIllllII[2];
        List list = Projectiles.getAll((int[])nArray);
        if (q.lllllIlllIlIlI(list.isEmpty() ? 1 : 0)) {
            return llIIlIllllII[1];
        }
        ArrayList<WorldPoint> var6 = new ArrayList<WorldPoint>();
        Player var1 = var2.iterator();
        while (q.lllllIlllIlIlI(var1.hasNext() ? 1 : 0)) {
            var5 = (Projectile)var1.next();
            var3 = var5.getTarget();
            if (q.lllllIlllIlIll(var3)) {
                0;
                if ((0x86 ^ 0x8C ^ (0x9B ^ 0x94)) > 0) continue;
                return ((25 + 4 - -89 + 43 ^ 15 + 44 - 26 + 122) & (0x2A ^ 0x4D ^ (0xDB ^ 0x86) ^ -1)) != 0;
            }
            WorldPoint var4 = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var3);
            var6.add(var4);
            0;
            0;
            
            return false;
        }
        var1 = Players.getLocal();
        if (q.lllllIlllIllII(var6.contains(var1.getWorldLocation()) ? 1 : 0)) {
            return llIIlIllllII[1];
        }
        var5 = NPCs.getNearest(nPC -> {
            boolean bl;
            if (q.lllllIlllIlllI(nPC.getInteracting(), Players.getLocal())) {
                bl = llIIlIllllII[0];
                0;
                if (-3 >= 0) {
                    return ((64 + 115 - 152 + 164 ^ 26 + 105 - -30 + 15) & (0x7A ^ 0x50 ^ (0xF ^ 0x2A) ^ -1)) != 0;
                }
            } else {
                bl = llIIlIllllII[1];
            }
            return bl;
        });
        if (q.lllllIlllIllIl(var5)) {
            var3 = var5.getWorldArea().toWorldPointList().stream().flatMap(worldPoint -> worldPoint.dx(llIIlIllllII[3]).dy(llIIlIllllII[3]).createWorldArea(llIIlIllllII[4], llIIlIllllII[4]).toWorldPointList().stream()).filter(arg_0 -> q.b((NPC)var5, arg_0)).filter(worldPoint -> {
                boolean bl;
                if (q.lllllIlllIllII(var6.contains(worldPoint) ? 1 : 0)) {
                    bl = llIIlIllllII[0];
                    0;
                    if (((0xD0 ^ 0xBB ^ (0x7C ^ 0x32)) & (3 ^ (0x2F ^ 9) ^ -1)) < 0) {
                        return false;
                    }
                } else {
                    bl = llIIlIllllII[1];
                }
                return bl;
            }).filter(arg_0 -> q.a((NPC)var5, arg_0)).filter(Reachable::isWalkable).collect(Collectors.toList());
            0;
            
            }
        } else {
            var3 = var1.getWorldLocation().dx(llIIlIllllII[3]).dy(llIIlIllllII[3]).createWorldArea(llIIlIllllII[4], llIIlIllllII[4]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if (q.lllllIlllIllII(var6.contains(worldPoint) ? 1 : 0)) {
                    bl = llIIlIllllII[0];
                    0;
                    if (((0x28 ^ 0x5B ^ (0x66 ^ 0x22)) & (0x63 ^ 0x7B ^ (0x8F ^ 0xA0) ^ -1)) > 0) {
                        return ((0xBF ^ 0xAF ^ (0x63 ^ 0x6B)) & (41 + 3 - -65 + 63 ^ 173 + 77 - 136 + 66 ^ -1)) != 0;
                    }
                } else {
                    bl = llIIlIllllII[1];
                }
                return bl;
            }).filter(Reachable::isWalkable).collect(Collectors.toList());
        }
        if (q.lllllIlllIlIlI(var3.isEmpty() ? 1 : 0)) {
            return llIIlIllllII[1];
        }
        Movement.setDestination((WorldPoint)((WorldPoint)var5_5.get(Rand.nextInt((int)llIIlIllllII[1], (int)var5_5.size()))));
        return llIIlIllllII[0];
    }
}

