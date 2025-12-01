package s.l.l.r.o.q.p000.a.i.g.i.r.u.e.s;

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
@TaskDesc(name = "Detecting Melee", priority = 25, blocking = true)
/* renamed from: s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.p  reason: invalid package */
/* loaded from: squire-gorillas-0.2.1.jar:s/l/l/r/o/q/-/a/i/g/i/r/u/e/s/p.class */
public class p extends Task {
    private final /* synthetic */ SquireGorillaPlugin aa;
    private static /* synthetic */ int[] llIIlIlIlIII;

    static {
        lllllIlIlIIlIl();
    }

    private static void lllllIlIlIIlIl() {
        llIIlIlIlIII = new int[5];
        llIIlIlIlIII[0] = ((251 ^ 161) ^ (9 ^ 1)) & (("  ".length() ^ (102 ^ 54)) ^ (-" ".length()));
        llIIlIlIlIII[1] = "   ".length();
        llIIlIlIlIII[2] = "  ".length();
        llIIlIlIlIII[3] = -" ".length();
        llIIlIlIlIII[4] = " ".length();
    }

    private static boolean lllllIlIlIlIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllllIlIlIIlll(int i) {
        return i > 0;
    }

    @Inject
    public p(SquireGorillaPlugin squireGorillaPlugin) {
        this.aa = squireGorillaPlugin;
    }

    private static boolean lllllIlIlIlIlI(int i) {
        return i == 0;
    }

    private static boolean lllllIlIlIlIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllllIlIlIIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    public boolean run() {
        NPC nearest = NPCs.getNearest(npc -> {
            if (lllllIlIlIlIll(npc.getInteracting(), Players.getLocal())) {
                ?? r0 = llIIlIlIlIII[4];
                "".length();
                return ((110 ^ 123) & ((42 ^ 63) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIlIlIII[0];
        });
        if (lllllIlIlIIllI(nearest)) {
            return llIIlIlIlIII[0];
        }
        c a = this.aa.a(nearest);
        if (lllllIlIlIIllI(a)) {
            return llIIlIlIlIII[0];
        }
        if (lllllIlIlIIlll(a.o()) && lllllIlIlIlIII(a.o(), llIIlIlIlIII[1])) {
            return llIIlIlIlIII[0];
        }
        List<d> n = a.n();
        if (!lllllIlIlIlIIl(n.size(), llIIlIlIlIII[2]) || lllllIlIlIlIlI(n.contains(d.MELEE) ? 1 : 0)) {
            return llIIlIlIlIII[0];
        }
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lllllIlIlIlIlI(nearest.getWorldArea().isInMeleeDistance(worldLocation) ? 1 : 0)) {
            return llIIlIlIlIII[0];
        }
        WorldPoint worldPoint = (WorldPoint) worldLocation.dx(llIIlIlIlIII[3]).dy(llIIlIlIlIII[3]).createWorldArea(llIIlIlIlIII[1], llIIlIlIlIII[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            if (lllllIlIlIlIlI(nearest.getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                ?? r0 = llIIlIlIlIII[4];
                "".length();
                return "   ".length() == 0 ? ((((81 + 176) - 247) + 224) ^ (((58 + 57) - (-15)) + 34)) & (((232 ^ 180) ^ (175 ^ 189)) ^ (-" ".length())) : r0;
            }
            return llIIlIlIlIII[0];
        }).filter(worldPoint3 -> {
            if (lllllIlIlIlIlI(nearest.getWorldArea().isInMeleeDistance(worldPoint3) ? 1 : 0)) {
                ?? r0 = llIIlIlIlIII[4];
                "".length();
                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIlIlIII[0];
        }).filter(Reachable::isWalkable).filter(worldPoint4 -> {
            if (lllllIlIlIlIlI(Reachable.isObstacle(worldPoint4) ? 1 : 0)) {
                ?? r0 = llIIlIlIlIII[4];
                "".length();
                return 0 != 0 ? ((((19 + 163) - (-5)) + 30) ^ (((30 + 95) - (-22)) + 1)) & (((((26 + 203) - 68) + 54) ^ (((108 + 34) - 101) + 113)) ^ (-" ".length())) : r0;
            }
            return llIIlIlIlIII[0];
        }).filter(worldPoint5 -> {
            return nearest.getWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), worldPoint5);
        }).max(Comparator.comparingInt(worldPoint6 -> {
            return worldPoint6.distanceTo(worldLocation);
        })).orElse(null);
        if (lllllIlIlIIllI(worldPoint)) {
            return llIIlIlIlIII[0];
        }
        Movement.setDestination(worldPoint);
        return llIIlIlIlIII[4];
    }

    private static boolean lllllIlIlIlIII(int i, int i2) {
        return i < i2;
    }
}
