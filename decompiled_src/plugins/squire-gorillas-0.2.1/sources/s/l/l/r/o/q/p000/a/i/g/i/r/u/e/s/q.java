package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
@TaskDesc(name = "Dodging boulders", priority = 50, blocking = true)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.q  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/q.class */
public class q extends Task {
    private static /* synthetic */ int[] llIIlIllllII;

    private static void lllllIlllIlIIl() {
        llIIlIllllII = new int[5];
        llIIlIllllII[0] = " ".length();
        llIIlIllllII[1] = ((37 ^ 47) ^ "  ".length()) & (((254 ^ 193) ^ (92 ^ 107)) ^ (-" ".length()));
        llIIlIllllII[2] = (-((-2825) & 15151)) & (-2049) & 15230;
        llIIlIllllII[3] = -" ".length();
        llIIlIllllII[4] = "   ".length();
    }

    private static boolean lllllIlllIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lllllIlllIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lllllIlllIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllllIlllIlIlI(int i) {
        return i != 0;
    }

    private static boolean lllllIlllIllII(int i) {
        return i == 0;
    }

    static {
        lllllIlllIlIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    public boolean run() {
        List list;
        int[] iArr = new int[llIIlIllllII[0]];
        iArr[llIIlIllllII[1]] = llIIlIllllII[2];
        List<Projectile> all = Projectiles.getAll(iArr);
        if (lllllIlllIlIlI(all.isEmpty() ? 1 : 0)) {
            return llIIlIllllII[1];
        }
        ArrayList arrayList = new ArrayList();
        for (Projectile projectile : all) {
            LocalPoint target = projectile.getTarget();
            if (lllllIlllIlIll(target)) {
                "".length();
                if (((134 ^ 140) ^ (155 ^ 148)) <= 0) {
                    return ((((25 + 4) - (-89)) + 43) ^ (((15 + 44) - 26) + 122)) & (((42 ^ 77) ^ (219 ^ 134)) ^ (-" ".length()));
                }
            } else {
                arrayList.add(WorldPoint.fromLocal(Static.getClient(), target));
                "".length();
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
        }
        Player local = Players.getLocal();
        if (lllllIlllIllII(arrayList.contains(local.getWorldLocation()) ? 1 : 0)) {
            return llIIlIllllII[1];
        }
        NPC nearest = NPCs.getNearest(npc -> {
            if (lllllIlllIlllI(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = llIIlIllllII[0];
                "".length();
                return (-"   ".length()) >= 0 ? ((((64 + 115) - 152) + 164) ^ (((26 + 105) - (-30)) + 15)) & (((122 ^ 80) ^ (15 ^ 42)) ^ (-" ".length())) : r0;
            }
            return llIIlIllllII[1];
        });
        if (lllllIlllIllIl(nearest)) {
            list = (List) nearest.getWorldArea().toWorldPointList().stream().flatMap(worldPoint -> {
                return worldPoint.dx(llIIlIllllII[3]).dy(llIIlIllllII[3]).createWorldArea(llIIlIllllII[4], llIIlIllllII[4]).toWorldPointList().stream();
            }).filter(worldPoint2 -> {
                if (lllllIlllIllII(nearest.getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                    ?? r0 = llIIlIllllII[0];
                    "".length();
                    return 0 != 0 ? ((166 ^ 180) ^ (89 ^ 107)) & (((((86 + 144) - 173) + 119) ^ (((101 + 81) - 145) + 107)) ^ (-" ".length())) : r0;
                }
                return llIIlIllllII[1];
            }).filter(worldPoint3 -> {
                if (lllllIlllIllII(arrayList.contains(worldPoint3) ? 1 : 0)) {
                    ?? r0 = llIIlIllllII[0];
                    "".length();
                    return (((208 ^ 187) ^ (124 ^ 50)) & (("   ".length() ^ (47 ^ 9)) ^ (-" ".length()))) < 0 ? ((((94 + 82) - 123) + 88) ^ (((44 + 101) - 136) + 124)) & (((((107 + 26) - (-3)) + 12) ^ (((152 + 10) - 45) + 39)) ^ (-" ".length())) : r0;
                }
                return llIIlIllllII[1];
            }).filter(worldPoint4 -> {
                return nearest.getWorldArea().isInMeleeDistance(worldPoint4);
            }).filter(Reachable::isWalkable).collect(Collectors.toList());
            "".length();
            if (0 != 0) {
                return ((12 ^ 102) ^ (61 ^ 97)) & (((((76 + 131) - 70) + 52) ^ (((78 + 137) - 182) + 106)) ^ (-" ".length()));
            }
        } else {
            list = (List) local.getWorldLocation().dx(llIIlIllllII[3]).dy(llIIlIllllII[3]).createWorldArea(llIIlIllllII[4], llIIlIllllII[4]).toWorldPointList().stream().filter(worldPoint5 -> {
                if (lllllIlllIllII(arrayList.contains(worldPoint5) ? 1 : 0)) {
                    ?? r0 = llIIlIllllII[0];
                    "".length();
                    return (((40 ^ 91) ^ (102 ^ 34)) & (((99 ^ 123) ^ (143 ^ 160)) ^ (-" ".length()))) > 0 ? ((191 ^ 175) ^ (99 ^ 107)) & (((((41 + 3) - (-65)) + 63) ^ (((173 + 77) - 136) + 66)) ^ (-" ".length())) : r0;
                }
                return llIIlIllllII[1];
            }).filter(Reachable::isWalkable).collect(Collectors.toList());
        }
        if (lllllIlllIlIlI(list.isEmpty() ? 1 : 0)) {
            return llIIlIllllII[1];
        }
        Movement.setDestination((WorldPoint) list.get(Rand.nextInt(llIIlIllllII[1], list.size())));
        return llIIlIllllII[0];
    }
}
