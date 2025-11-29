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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bh;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bi;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Moving to best spot", priority=20)
public class bl
extends bh {
    private static final /* synthetic */ RegionPoint fe;
    private static final /* synthetic */ RegionPoint ff;
    private static /* synthetic */ int[] llIIlIlllIl;

    private static boolean lIlIIIIllIllII(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean g(NPC nPC, WorldPoint worldPoint) {
        boolean bl2;
        if (bl.lIlIIIIllIlIll(nPC.getWorldArea().contains(worldPoint) ? 1 : 0)) {
            bl2 = llIIlIlllIl[1];
            "".length();
            if ((39 + 10 - -133 + 6 ^ 61 + 177 - 213 + 159) <= "  ".length()) {
                return ((0xD6 ^ 0xBC ^ (0x95 ^ 0xC6)) & (0x2C ^ 0x67 ^ (0xFF ^ 0x8D) ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIIlIlllIl[0];
        }
        return bl2;
    }

    private static /* synthetic */ boolean f(NPC nPC, WorldPoint worldPoint) {
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
        void llllllllllllllllIIlllllIIIIIIIll;
        bl llllllllllllllllIIlllllIIIIIIlIl;
        Player player = Players.getLocal();
        NPC nPC = this.bO();
        if (bl.lIlIIIIllIlIlI(nPC)) {
            return llIIlIlllIl[0];
        }
        if (!bl.lIlIIIIllIlIll(llllllllllllllllIIlllllIIIIIIlIl.bR() ? 1 : 0) || bl.lIlIIIIllIllII(bl.bV() ? 1 : 0)) {
            return llIIlIlllIl[0];
        }
        Set<WorldPoint> llllllllllllllllIIlllllIIIIIIIlI = llllllllllllllllIIlllllIIIIIIlIl.bU();
        if (bl.lIlIIIIllIlIll(llllllllllllllllIIlllllIIIIIIIlI.isEmpty() ? 1 : 0)) {
            return llIIlIlllIl[0];
        }
        List<WorldPoint> llllllllllllllllIIlllllIIIIIIIIl = llllllllllllllllIIlllllIIIIIIlIl.bS();
        WorldPoint llllllllllllllllIIlllllIIIIIIIII = llllllllllllllllIIlllllIIIIIIlIl.bT();
        WorldPoint llllllllllllllllIIllllIlllllllll = llllllllllllllllIIlllllIIIIIIIll.getWorldArea().offset(llIIlIlllIl[1]).toWorldPointList().stream().filter(arg_0 -> bl.g((NPC)llllllllllllllllIIlllllIIIIIIIll, arg_0)).filter(arg_0 -> bl.f((NPC)llllllllllllllllIIlllllIIIIIIIll, arg_0)).filter(Reachable::isWalkable).filter(worldPoint -> {
            boolean bl2;
            if (bl.lIlIIIIllIlIll(llllllllllllllllIIlllllIIIIIIIIl.contains(worldPoint) ? 1 : 0)) {
                bl2 = llIIlIlllIl[1];
                "".length();
                if ("   ".length() < 0) {
                    return ((101 + 121 - 146 + 74 ^ 11 + 65 - -62 + 39) & (0xAC ^ 0xA1 ^ (0xED ^ 0xC7) ^ -" ".length())) != 0;
                }
            } else {
                bl2 = llIIlIlllIl[0];
            }
            return bl2;
        }).min(Comparator.comparingDouble(object -> ((WorldPoint)object).distanceToPath(this.cu, llllllllllllllllIIlllllIIIIIIIII)).thenComparing(object -> Float.valueOf(((WorldPoint)object).distanceTo2DHypotenuse(llllllllllllllllIIlllllIIIIIIIII)))).orElse(null);
        if (!bl.lIlIIIIllIllIl(llllllllllllllllIIllllIlllllllll) || bl.lIlIIIIllIlllI(llllllllllllllllIIllllIlllllllll.distanceTo2D(Players.getLocal().getWorldLocation()), llIIlIlllIl[2])) {
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
    protected bl(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig, bi.ATTACK);
    }

    private static void lIlIIIIllIlIIl() {
        llIIlIlllIl = new int[7];
        bl.llIIlIlllIl[0] = (0xA ^ 0x42 ^ (0x2B ^ 0x7F)) & (0x6A ^ 0x7E ^ (0x2A ^ 0x22) ^ -" ".length());
        bl.llIIlIlllIl[1] = " ".length();
        bl.llIIlIlllIl[2] = "  ".length();
        bl.llIIlIlllIl[3] = 125 + 74 - 74 + 56 ^ 94 + 104 - 138 + 91;
        bl.llIIlIlllIl[4] = 70 + 113 - 80 + 71 ^ 30 + 69 - 50 + 92;
        bl.llIIlIlllIl[5] = -(0x65 ^ 0x47) & (0xFFFFB7FD & 0x7F77);
        bl.llIIlIlllIl[6] = 0x82 ^ 0x9F;
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

