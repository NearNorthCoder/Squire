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

@TaskDesc(name="Dodging boulders", priority=50, blocking=true)
public class q
extends Task {
    private static /* synthetic */ int[] llIIlIllllII;

    private static void lllllIlllIlIIl() {
        llIIlIllllII = new int[5];
        q.llIIlIllllII[0] = " ".length();
        q.llIIlIllllII[1] = (0x25 ^ 0x2F ^ "  ".length()) & (0xFE ^ 0xC1 ^ (0x5C ^ 0x6B) ^ -" ".length());
        q.llIIlIllllII[2] = -(0xFFFFF4F7 & 0x3B2F) & (0xFFFFF7FF & 0x3B7E);
        q.llIIlIllllII[3] = -" ".length();
        q.llIIlIllllII[4] = "   ".length();
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
            "".length();
            if (null != null) {
                return ((0xA6 ^ 0xB4 ^ (0x59 ^ 0x6B)) & (86 + 144 - 173 + 119 ^ 101 + 81 - 145 + 107 ^ -" ".length())) != 0;
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
        Object lllllllllllllllIlIIlllIlIlIIIlIl;
        Projectile lllllllllllllllIlIIlllIlIlIIIllI;
        void lllllllllllllllIlIIlllIlIlIIlIIl;
        int[] nArray = new int[llIIlIllllII[0]];
        nArray[q.llIIlIllllII[1]] = llIIlIllllII[2];
        List list = Projectiles.getAll((int[])nArray);
        if (q.lllllIlllIlIlI(list.isEmpty() ? 1 : 0)) {
            return llIIlIllllII[1];
        }
        ArrayList<WorldPoint> lllllllllllllllIlIIlllIlIlIIlIII = new ArrayList<WorldPoint>();
        Player lllllllllllllllIlIIlllIlIlIIIlll = lllllllllllllllIlIIlllIlIlIIlIIl.iterator();
        while (q.lllllIlllIlIlI(lllllllllllllllIlIIlllIlIlIIIlll.hasNext() ? 1 : 0)) {
            lllllllllllllllIlIIlllIlIlIIIllI = (Projectile)lllllllllllllllIlIIlllIlIlIIIlll.next();
            lllllllllllllllIlIIlllIlIlIIIlIl = lllllllllllllllIlIIlllIlIlIIIllI.getTarget();
            if (q.lllllIlllIlIll(lllllllllllllllIlIIlllIlIlIIIlIl)) {
                "".length();
                if ((0x86 ^ 0x8C ^ (0x9B ^ 0x94)) > 0) continue;
                return ((25 + 4 - -89 + 43 ^ 15 + 44 - 26 + 122) & (0x2A ^ 0x4D ^ (0xDB ^ 0x86) ^ -" ".length())) != 0;
            }
            WorldPoint lllllllllllllllIlIIlllIlIlIIIlII = WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)lllllllllllllllIlIIlllIlIlIIIlIl);
            lllllllllllllllIlIIlllIlIlIIlIII.add(lllllllllllllllIlIIlllIlIlIIIlII);
            "".length();
            "".length();
            if (null == null) continue;
            return ((0xC1 ^ 0xC6) & ~(0x25 ^ 0x22)) != 0;
        }
        lllllllllllllllIlIIlllIlIlIIIlll = Players.getLocal();
        if (q.lllllIlllIllII(lllllllllllllllIlIIlllIlIlIIlIII.contains(lllllllllllllllIlIIlllIlIlIIIlll.getWorldLocation()) ? 1 : 0)) {
            return llIIlIllllII[1];
        }
        lllllllllllllllIlIIlllIlIlIIIllI = NPCs.getNearest(nPC -> {
            boolean bl;
            if (q.lllllIlllIlllI(nPC.getInteracting(), Players.getLocal())) {
                bl = llIIlIllllII[0];
                "".length();
                if (-"   ".length() >= 0) {
                    return ((64 + 115 - 152 + 164 ^ 26 + 105 - -30 + 15) & (0x7A ^ 0x50 ^ (0xF ^ 0x2A) ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIlIllllII[1];
            }
            return bl;
        });
        if (q.lllllIlllIllIl(lllllllllllllllIlIIlllIlIlIIIllI)) {
            lllllllllllllllIlIIlllIlIlIIIlIl = lllllllllllllllIlIIlllIlIlIIIllI.getWorldArea().toWorldPointList().stream().flatMap(worldPoint -> worldPoint.dx(llIIlIllllII[3]).dy(llIIlIllllII[3]).createWorldArea(llIIlIllllII[4], llIIlIllllII[4]).toWorldPointList().stream()).filter(arg_0 -> q.b((NPC)lllllllllllllllIlIIlllIlIlIIIllI, arg_0)).filter(worldPoint -> {
                boolean bl;
                if (q.lllllIlllIllII(lllllllllllllllIlIIlllIlIlIIlIII.contains(worldPoint) ? 1 : 0)) {
                    bl = llIIlIllllII[0];
                    "".length();
                    if (((0xD0 ^ 0xBB ^ (0x7C ^ 0x32)) & ("   ".length() ^ (0x2F ^ 9) ^ -" ".length())) < 0) {
                        return ((94 + 82 - 123 + 88 ^ 44 + 101 - 136 + 124) & (107 + 26 - -3 + 12 ^ 152 + 10 - 45 + 39 ^ -" ".length())) != 0;
                    }
                } else {
                    bl = llIIlIllllII[1];
                }
                return bl;
            }).filter(arg_0 -> q.a((NPC)lllllllllllllllIlIIlllIlIlIIIllI, arg_0)).filter(Reachable::isWalkable).collect(Collectors.toList());
            "".length();
            if (null != null) {
                return ((0xC ^ 0x66 ^ (0x3D ^ 0x61)) & (76 + 131 - 70 + 52 ^ 78 + 137 - 182 + 106 ^ -" ".length())) != 0;
            }
        } else {
            lllllllllllllllIlIIlllIlIlIIIlIl = lllllllllllllllIlIIlllIlIlIIIlll.getWorldLocation().dx(llIIlIllllII[3]).dy(llIIlIllllII[3]).createWorldArea(llIIlIllllII[4], llIIlIllllII[4]).toWorldPointList().stream().filter(worldPoint -> {
                boolean bl;
                if (q.lllllIlllIllII(lllllllllllllllIlIIlllIlIlIIlIII.contains(worldPoint) ? 1 : 0)) {
                    bl = llIIlIllllII[0];
                    "".length();
                    if (((0x28 ^ 0x5B ^ (0x66 ^ 0x22)) & (0x63 ^ 0x7B ^ (0x8F ^ 0xA0) ^ -" ".length())) > 0) {
                        return ((0xBF ^ 0xAF ^ (0x63 ^ 0x6B)) & (41 + 3 - -65 + 63 ^ 173 + 77 - 136 + 66 ^ -" ".length())) != 0;
                    }
                } else {
                    bl = llIIlIllllII[1];
                }
                return bl;
            }).filter(Reachable::isWalkable).collect(Collectors.toList());
        }
        if (q.lllllIlllIlIlI(lllllllllllllllIlIIlllIlIlIIIlIl.isEmpty() ? 1 : 0)) {
            return llIIlIllllII[1];
        }
        Movement.setDestination((WorldPoint)((WorldPoint)var5_5.get(Rand.nextInt((int)llIIlIllllII[1], (int)var5_5.size()))));
        return llIIlIllllII[0];
    }
}

