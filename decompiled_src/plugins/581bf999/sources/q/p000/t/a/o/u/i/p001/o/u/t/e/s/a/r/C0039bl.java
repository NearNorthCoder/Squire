package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Moving to best spot", priority = 20)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bl  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bl.class */
public class C0039bl extends AbstractC0035bh {
    private static final /* synthetic */ RegionPoint fe;
    private static final /* synthetic */ RegionPoint ff;
    private static /* synthetic */ int[] llIIlIlllIl;

    private static boolean lIlIIIIllIllII(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIllIlIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0035bh
    protected boolean bL() {
        Players.getLocal();
        NPC bO = bO();
        if (lIlIIIIllIlIlI(bO)) {
            return llIIlIlllIl[0];
        }
        if (!lIlIIIIllIlIll(bR() ? 1 : 0) || lIlIIIIllIllII(bV() ? 1 : 0)) {
            return llIIlIlllIl[0];
        }
        if (lIlIIIIllIlIll(bU().isEmpty() ? 1 : 0)) {
            return llIIlIlllIl[0];
        }
        List<WorldPoint> bS = bS();
        WorldPoint bT = bT();
        WorldPoint worldPoint = (WorldPoint) bO.getWorldArea().offset(llIIlIlllIl[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            if (lIlIIIIllIlIll(bO.getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                ?? r0 = llIIlIlllIl[1];
                "".length();
                return ((((39 + 10) - (-133)) + 6) ^ (((61 + 177) - 213) + 159)) <= "  ".length() ? ((214 ^ 188) ^ (149 ^ 198)) & (((44 ^ 103) ^ (255 ^ 141)) ^ (-" ".length())) : r0;
            }
            return llIIlIlllIl[0];
        }).filter(worldPoint3 -> {
            return bO.getWorldArea().isInMeleeDistance(worldPoint3);
        }).filter(Reachable::isWalkable).filter(worldPoint4 -> {
            if (lIlIIIIllIlIll(bS.contains(worldPoint4) ? 1 : 0)) {
                ?? r0 = llIIlIlllIl[1];
                "".length();
                return "   ".length() < 0 ? ((((101 + 121) - 146) + 74) ^ (((11 + 65) - (-62)) + 39)) & (((172 ^ 161) ^ (237 ^ 199)) ^ (-" ".length())) : r0;
            }
            return llIIlIlllIl[0];
        }).min(Comparator.comparingDouble(obj -> {
            return ((WorldPoint) obj).distanceToPath(this.cu, bT);
        }).thenComparing(obj2 -> {
            return Float.valueOf(((WorldPoint) obj2).distanceTo2DHypotenuse(bT));
        })).orElse(null);
        if (!lIlIIIIllIllIl(worldPoint) || lIlIIIIllIlllI(worldPoint.distanceTo2D(Players.getLocal().getWorldLocation()), llIIlIlllIl[2])) {
            return llIIlIlllIl[0];
        }
        Movement.setDestination(worldPoint);
        return llIIlIlllIl[1];
    }

    static {
        lIlIIIIllIlIIl();
        fe = new RegionPoint(llIIlIlllIl[3], llIIlIlllIl[4], llIIlIlllIl[0], llIIlIlllIl[5]);
        ff = new RegionPoint(llIIlIlllIl[3], llIIlIlllIl[6], llIIlIlllIl[0], llIIlIlllIl[5]);
    }

    @Inject
    protected C0039bl(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig, EnumC0036bi.ATTACK);
    }

    private static void lIlIIIIllIlIIl() {
        llIIlIlllIl = new int[7];
        llIIlIlllIl[0] = ((10 ^ 66) ^ (43 ^ 127)) & (((106 ^ 126) ^ (42 ^ 34)) ^ (-" ".length()));
        llIIlIlllIl[1] = " ".length();
        llIIlIlllIl[2] = "  ".length();
        llIIlIlllIl[3] = (((125 + 74) - 74) + 56) ^ (((94 + 104) - 138) + 91);
        llIIlIlllIl[4] = (((70 + 113) - 80) + 71) ^ (((30 + 69) - 50) + 92);
        llIIlIlllIl[5] = (-(101 ^ 71)) & (-18435) & 32631;
        llIIlIlllIl[6] = 130 ^ 159;
    }

    private static boolean lIlIIIIllIlllI(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlIIIIllIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIIllIlIlI(Object obj) {
        return obj == null;
    }
}
