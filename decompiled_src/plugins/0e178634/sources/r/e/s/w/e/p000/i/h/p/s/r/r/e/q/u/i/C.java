package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Walking on green orbs", priority = 50, blocking = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.C  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/C.class */
public class C extends u {
    private static /* synthetic */ int[] lIlIlllIlIIII;
    private static final /* synthetic */ int ah;
    private static final /* synthetic */ int ag;

    private static boolean llIIIIlIIlIllII(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        llIIIIlIIlIIlll();
        ag = lIlIlllIlIIII[4];
        ah = lIlIlllIlIIII[4];
    }

    private static boolean llIIIIlIIlIlIII(int i) {
        return i == 0;
    }

    private static boolean llIIIIlIIlIlIlI(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIIlIIlIlIll(int i) {
        return i != 0;
    }

    private static boolean llIIIIlIIlIlIIl(Object obj) {
        return obj == null;
    }

    private static void llIIIIlIIlIIlll() {
        lIlIlllIlIIII = new int[6];
        lIlIlllIlIIII[0] = ((((73 + 173) - 60) + 45) ^ (((95 + 32) - (-30)) + 17)) & (((((66 + 136) - 192) + 133) ^ (((164 + 10) - 170) + 194)) ^ (-" ".length()));
        lIlIlllIlIIII[1] = -"  ".length();
        lIlIlllIlIIII[2] = (((134 + 25) - (-5)) + 32) ^ (((78 + 45) - (-12)) + 58);
        lIlIlllIlIIII[3] = " ".length();
        lIlIlllIlIIII[4] = (-((-4525) & 21423)) & (-1) & 64471;
        lIlIlllIlIIII[5] = "  ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.u
    public boolean p() {
        if (llIIIIlIIlIlIII(this.W.f() ? 1 : 0)) {
            return lIlIlllIlIIII[0];
        }
        Player local = Players.getLocal();
        List list = (List) local.getWorldLocation().dx(lIlIlllIlIIII[1]).dy(lIlIlllIlIIII[1]).createWorldArea(lIlIlllIlIIII[2], lIlIlllIlIIII[2]).toWorldPointList().stream().filter(Reachable::isWalkable).collect(Collectors.toList());
        int[] iArr = new int[lIlIlllIlIIII[3]];
        iArr[lIlIlllIlIIII[0]] = lIlIlllIlIIII[4];
        Optional max = TileObjects.getAll(iArr).stream().filter(tileObject -> {
            return list.contains(tileObject.getWorldLocation());
        }).max(Comparator.comparingDouble(tileObject2 -> {
            return tileObject2.getWorldLocation().distanceTo2DHypotenuse(this.W.j().getWorldLocation());
        }));
        int[] iArr2 = new int[lIlIlllIlIIII[3]];
        iArr2[lIlIlllIlIIII[0]] = lIlIlllIlIIII[4];
        TileObject tileObject3 = (TileObject) max.orElse(TileObjects.getNearest(iArr2));
        if (llIIIIlIIlIlIIl(tileObject3)) {
            return lIlIlllIlIIII[0];
        }
        if (!llIIIIlIIlIlIlI(tileObject3.distanceTo(local), lIlIlllIlIIII[5])) {
            WorldPoint worldPoint = (WorldPoint) list.stream().filter(worldPoint2 -> {
                return TileObjects.getAll(tileObject4 -> {
                    return tileObject4.getWorldLocation().equals(worldPoint2);
                }).isEmpty();
            }).min(Comparator.comparingDouble(worldPoint3 -> {
                return worldPoint3.distanceTo2DHypotenuse(tileObject3.getWorldLocation());
            })).orElse(null);
            if (llIIIIlIIlIlIIl(worldPoint)) {
                return lIlIlllIlIIII[0];
            }
            Movement.setDestination(worldPoint);
            return lIlIlllIlIIII[3];
        }
        WorldPoint worldLocation = tileObject3.getWorldLocation();
        if (llIIIIlIIlIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
            int[] iArr3 = new int[lIlIlllIlIIII[3]];
            iArr3[lIlIlllIlIIII[0]] = lIlIlllIlIIII[4];
            worldLocation = ((TileObject) TileObjects.getAll(iArr3).stream().filter(tileObject4 -> {
                return list.contains(tileObject4.getWorldLocation());
            }).filter(tileObject5 -> {
                if (llIIIIlIIlIllII(tileObject5, tileObject3)) {
                    ?? r0 = lIlIlllIlIIII[3];
                    "".length();
                    return (((((48 + 52) - 55) + 191) ^ (((34 + 77) - (-43)) + 39)) & (((((89 + 119) - 114) + 38) ^ (((111 + 20) - 83) + 121)) ^ (-" ".length()))) != 0 ? ((((20 + 22) - (-111)) + 27) ^ (((69 + 129) - 56) + 22)) & (((107 ^ 98) ^ (11 ^ 18)) ^ (-" ".length())) : r0;
                }
                return lIlIlllIlIIII[0];
            }).max(Comparator.comparingDouble(tileObject6 -> {
                return tileObject6.getWorldLocation().distanceTo2DHypotenuse(this.W.j().getWorldLocation());
            })).orElse(tileObject3)).getWorldLocation();
        }
        Movement.setDestination(worldLocation);
        return lIlIlllIlIIII[3];
    }
}
