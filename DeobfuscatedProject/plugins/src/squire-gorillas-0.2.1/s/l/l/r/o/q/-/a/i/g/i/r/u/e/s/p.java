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
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

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
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.c;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.d;

@TaskDesc(name="Detecting Melee", priority=25, blocking=true)
public class p
extends Task {
    private final /* synthetic */ SquireGorillaPlugin aa;
    private static /* synthetic */ int[] llIIlIlIlIII;

    static {
        p.lllllIlIlIIlIl();
    }

    private static void lllllIlIlIIlIl() {
        llIIlIlIlIII = new int[5];
        p.llIIlIlIlIII[0] = (0xFB ^ 0xA1 ^ (9 ^ 1)) & ("  ".length() ^ (0x66 ^ 0x36) ^ -" ".length());
        p.llIIlIlIlIII[1] = "   ".length();
        p.llIIlIlIlIII[2] = "  ".length();
        p.llIIlIlIlIII[3] = -" ".length();
        p.llIIlIlIlIII[4] = " ".length();
    }

    private static /* synthetic */ boolean c(NPC nPC, WorldPoint worldPoint) {
        boolean bl;
        if (p.lllllIlIlIlIlI(nPC.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            bl = llIIlIlIlIII[4];
            "".length();
            if ("   ".length() == 0) {
                return ((81 + 176 - 247 + 224 ^ 58 + 57 - -15 + 34) & (0xE8 ^ 0xB4 ^ (0xAF ^ 0xBD) ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIlIlIlIII[0];
        }
        return bl;
    }

    private static boolean lllllIlIlIlIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lllllIlIlIIlll(int n2) {
        return n2 > 0;
    }

    private static /* synthetic */ boolean a(NPC nPC, WorldPoint worldPoint) {
        return nPC.getWorldArea().hasLineOfSightTo(Static.getClient().getTopLevelWorldView(), worldPoint);
    }

    @Inject
    public p(SquireGorillaPlugin squireGorillaPlugin) {
        this.aa = squireGorillaPlugin;
    }

    private static boolean lllllIlIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIlIlIlIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lllllIlIlIIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6_6;
        void lllllllllllllllIlIIlllllIIlIIIIl;
        p lllllllllllllllIlIIlllllIIlIIIlI;
        NPC nPC2 = NPCs.getNearest(nPC -> {
            boolean bl;
            if (p.lllllIlIlIlIll(nPC.getInteracting(), Players.getLocal())) {
                bl = llIIlIlIlIII[4];
                "".length();
                if (((0x6E ^ 0x7B) & ~(0x2A ^ 0x3F)) >= "   ".length()) {
                    return ((0xAF ^ 0xA4) & ~(0x5C ^ 0x57)) != 0;
                }
            } else {
                bl = llIIlIlIlIII[0];
            }
            return bl;
        });
        if (p.lllllIlIlIIllI(nPC2)) {
            return llIIlIlIlIII[0];
        }
        c lllllllllllllllIlIIlllllIIlIIIII = lllllllllllllllIlIIlllllIIlIIIlI.aa.a((NPC)lllllllllllllllIlIIlllllIIlIIIIl);
        if (p.lllllIlIlIIllI(lllllllllllllllIlIIlllllIIlIIIII)) {
            return llIIlIlIlIII[0];
        }
        if (p.lllllIlIlIIlll(lllllllllllllllIlIIlllllIIlIIIII.o()) && p.lllllIlIlIlIII(lllllllllllllllIlIIlllllIIlIIIII.o(), llIIlIlIlIII[1])) {
            return llIIlIlIlIII[0];
        }
        List<d> lllllllllllllllIlIIlllllIIIlllll = lllllllllllllllIlIIlllllIIlIIIII.n();
        int lllllllllllllllIlIIlllllIIIllllI = lllllllllllllllIlIIlllllIIIlllll.size();
        if (!p.lllllIlIlIlIIl(lllllllllllllllIlIIlllllIIIllllI, llIIlIlIlIII[2]) || p.lllllIlIlIlIlI(lllllllllllllllIlIIlllllIIIlllll.contains((Object)d.MELEE) ? 1 : 0)) {
            return llIIlIlIlIII[0];
        }
        WorldPoint lllllllllllllllIlIIlllllIIIlllIl = Players.getLocal().getWorldLocation();
        if (p.lllllIlIlIlIlI(lllllllllllllllIlIIlllllIIlIIIIl.getWorldArea().isInMeleeDistance(lllllllllllllllIlIIlllllIIIlllIl) ? 1 : 0)) {
            return llIIlIlIlIII[0];
        }
        WorldPoint lllllllllllllllIlIIlllllIIIlllII = lllllllllllllllIlIIlllllIIIlllIl.dx(llIIlIlIlIII[3]).dy(llIIlIlIlIII[3]).createWorldArea(llIIlIlIlIII[1], llIIlIlIlIII[1]).toWorldPointList().stream().filter(arg_0 -> p.c((NPC)lllllllllllllllIlIIlllllIIlIIIIl, arg_0)).filter(arg_0 -> p.b((NPC)lllllllllllllllIlIIlllllIIlIIIIl, arg_0)).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl;
            if (p.lllllIlIlIlIlI(Reachable.isObstacle((WorldPoint)worldPoint) ? 1 : 0)) {
                bl = llIIlIlIlIII[4];
                "".length();
                if (null != null) {
                    return ((19 + 163 - -5 + 30 ^ 30 + 95 - -22 + 1) & (26 + 203 - 68 + 54 ^ 108 + 34 - 101 + 113 ^ -" ".length())) != 0;
                }
            } else {
                bl = llIIlIlIlIII[0];
            }
            return bl;
        }).filter(arg_0 -> p.a((NPC)lllllllllllllllIlIIlllllIIlIIIIl, arg_0)).max(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(lllllllllllllllIlIIlllllIIIlllIl))).orElse(null);
        if (p.lllllIlIlIIllI(lllllllllllllllIlIIlllllIIIlllII)) {
            return llIIlIlIlIII[0];
        }
        Movement.setDestination((WorldPoint)var6_6);
        return llIIlIlIlIII[4];
    }

    private static /* synthetic */ boolean b(NPC nPC, WorldPoint worldPoint) {
        boolean bl;
        if (p.lllllIlIlIlIlI(nPC.getWorldArea().isInMeleeDistance(worldPoint) ? 1 : 0)) {
            bl = llIIlIlIlIII[4];
            "".length();
            if (-" ".length() > 0) {
                return ((0x93 ^ 0xAE) & ~(2 ^ 0x3F)) != 0;
            }
        } else {
            bl = llIIlIlIlIII[0];
        }
        return bl;
    }

    private static boolean lllllIlIlIlIII(int n2, int n3) {
        return n2 < n3;
    }
}

