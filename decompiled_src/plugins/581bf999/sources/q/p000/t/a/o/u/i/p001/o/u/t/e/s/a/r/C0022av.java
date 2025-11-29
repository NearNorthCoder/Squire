package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Luring Akkha to Quadrant")
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.av  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/av.class */
public class C0022av extends AbstractC0016ap {
    private final /* synthetic */ C0064m dk;
    private static /* synthetic */ String[] lIllIIlIlIl;
    private static /* synthetic */ int[] lIllIIlIllI;
    private final /* synthetic */ SquireAutoTOA dl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v17, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        int i;
        if (lIIlIlIlllllII(bu() ? 1 : 0)) {
            return lIllIIlIllI[0];
        }
        List<NPC> by = by();
        NPC J = J();
        if (lIIlIlIlllllIl(J)) {
            return lIllIIlIllI[0];
        }
        if ((!lIIlIlIlllllII(g(J) ? 1 : 0) || lIIlIlIllllllI(by.size(), lIllIIlIllI[1])) && !lIIlIlIlllllII(bw() ? 1 : 0)) {
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            WorldPoint worldPoint = (WorldPoint) worldLocation.createWorldArea(lIllIIlIllI[2]).toWorldPointList().stream().filter(worldPoint2 -> {
                NPC i2 = i(worldPoint2);
                if (lIIlIllIIIIIlI(i2) && lIIlIlIlllllll(i2.distanceTo(worldPoint2), lIllIIlIllI[2])) {
                    ?? r0 = lIllIIlIllI[3];
                    "".length();
                    return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIIlIllI[0];
            }).filter(worldPoint3 -> {
                return Reachable.isWalkable(worldPoint3.getWorldLocation());
            }).max(Comparator.comparingDouble(worldPoint4 -> {
                return worldPoint4.getWorldLocation().distanceToHypotenuse(i(worldPoint4.getWorldLocation()).getWorldLocation());
            })).orElse(null);
            if (lIIlIlIlllllIl(worldPoint)) {
                return lIllIIlIllI[0];
            }
            if (lIIlIlIlllllII(g(J) ? 1 : 0)) {
                i = lIllIIlIllI[1];
                "".length();
                if ((((((210 + 216) - 316) + 116) ^ (((65 + 13) - (-40)) + 70)) & (((78 ^ 124) ^ (119 ^ 27)) ^ (-" ".length()))) == (-" ".length())) {
                    return ((93 ^ 70) ^ (29 ^ 41)) & (((((100 + 105) - 120) + 65) ^ (((19 + 177) - 92) + 81)) ^ (-" ".length()));
                }
            } else {
                i = lIllIIlIllI[3];
            }
            int i2 = i;
            if (lIIlIlIlllllII(g(J) ? 1 : 0) && lIIlIlIlllllll(J.distanceTo(worldLocation), lIllIIlIllI[4]) && lIIlIlIlllllII(this.cW.keepBack() ? 1 : 0)) {
                Movement.setDestination(J.getWorldLocation());
                return lIllIIlIllI[3];
            } else if (lIIlIllIIIIIII(worldLocation.distanceTo(worldPoint.getWorldLocation()), i2)) {
                return lIllIIlIllI[0];
            } else {
                if (lIIlIlIlllllII(this.dk.K() ? 1 : 0) && lIIlIlIlllllII(by.stream().allMatch(npc -> {
                    if (lIIlIllIIIIIIl(npc.getAnimation(), lIllIIlIllI[5])) {
                        ?? r0 = lIllIIlIllI[3];
                        "".length();
                        return "  ".length() > "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIllIIlIllI[0];
                }) ? 1 : 0)) {
                    return lIllIIlIllI[3];
                }
                this.dl.a((boolean) lIllIIlIllI[0]);
                g(worldPoint.getWorldLocation());
                return lIllIIlIllI[3];
            }
        }
        return lIllIIlIllI[0];
    }

    private static boolean lIIlIlIlllllll(int i, int i2) {
        return i > i2;
    }

    @Inject
    protected C0022av(Client client, C0077z c0077z, TOAConfig tOAConfig, C0064m c0064m, SquireAutoTOA squireAutoTOA) {
        super(client, c0077z, tOAConfig);
        this.dk = c0064m;
        this.dl = squireAutoTOA;
    }

    private static boolean lIIlIlIllllllI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIlIllIIIIIII(int i, int i2) {
        return i < i2;
    }

    private static void lIIlIlIllllIlI() {
        lIllIIlIlIl = new String[lIllIIlIllI[3]];
        lIllIIlIlIl[lIllIIlIllI[0]] = lIIlIlIllllIIl("CxgPDBJtAEQ3GysXCxM=", "Jsdds");
    }

    private NPC i(WorldPoint worldPoint) {
        String[] strArr = new String[lIllIIlIllI[3]];
        strArr[lIllIIlIllI[0]] = lIllIIlIlIl[lIllIIlIllI[0]];
        return NPCs.getNearest(worldPoint, strArr);
    }

    static {
        lIIlIlIllllIll();
        lIIlIlIllllIlI();
    }

    private static boolean lIIlIllIIIIIIl(int i, int i2) {
        return i == i2;
    }

    private static String lIIlIlIllllIIl(String llllllllllllllllIlIlIIllllIIIlll, String llllllllllllllllIlIlIIllllIIIllI) {
        String llllllllllllllllIlIlIIllllIIIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIllllIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllIlIlIIllllIIIlII = llllllllllllllllIlIlIIllllIIIllI.toCharArray();
        int llllllllllllllllIlIlIIllllIIIIll = lIllIIlIllI[0];
        char[] charArray = llllllllllllllllIlIlIIllllIIIlll2.toCharArray();
        int length = charArray.length;
        int i = lIllIIlIllI[0];
        while (lIIlIllIIIIIII(i, length)) {
            char llllllllllllllllIlIlIIllllIIlIII = charArray[i];
            sb.append((char) (llllllllllllllllIlIlIIllllIIlIII ^ llllllllllllllllIlIlIIllllIIIlII[llllllllllllllllIlIlIIllllIIIIll % llllllllllllllllIlIlIIllllIIIlII.length]));
            "".length();
            llllllllllllllllIlIlIIllllIIIIll++;
            i++;
            "".length();
            if (((16 ^ 120) ^ (209 ^ 189)) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIlIlllllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIllIIIIIlI(Object obj) {
        return obj != null;
    }

    private static void lIIlIlIllllIll() {
        lIllIIlIllI = new int[6];
        lIllIIlIllI[0] = ((11 ^ 37) ^ (80 ^ 41)) & (((218 ^ 135) ^ (146 ^ 152)) ^ (-" ".length()));
        lIllIIlIllI[1] = (27 ^ 39) ^ (123 ^ 67);
        lIllIIlIllI[2] = (64 ^ 112) ^ (152 ^ 162);
        lIllIIlIllI[3] = " ".length();
        lIllIIlIllI[4] = "   ".length();
        lIllIIlIllI[5] = -" ".length();
    }

    private static boolean lIIlIlIlllllII(int i) {
        return i != 0;
    }
}
