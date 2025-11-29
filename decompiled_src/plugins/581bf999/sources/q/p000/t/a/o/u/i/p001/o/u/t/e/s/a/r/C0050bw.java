package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Dodging ufos", priority = 100)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bw  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bw.class */
public class C0050bw extends AbstractC0052by {
    private static /* synthetic */ int[] llIIIIlllII;

    @Inject
    protected C0050bw(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIIlllIllIlIlI(int i) {
        return i != 0;
    }

    private static void lIIlllIllIlIII() {
        llIIIIlllII = new int[3];
        llIIIIlllII[0] = ((((47 + 36) - 22) + 68) ^ (((5 + 58) - (-69)) + 28)) & (((104 ^ 31) ^ (83 ^ 5)) ^ (-" ".length()));
        llIIIIlllII[1] = (106 ^ 22) ^ (68 ^ 61);
        llIIIIlllII[2] = " ".length();
    }

    private static boolean lIIlllIllIlIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        WorldPoint worldLocation = Players.getLocal().getWorldLocation();
        if (lIIlllIllIlIIl(TileObjects.getNearest(tileObject -> {
            if (lIIlllIllIlIlI(fH.contains(Integer.valueOf(tileObject.getId())) ? 1 : 0) && lIIlllIllIlIlI(((GameObject) tileObject).getWorldArea().contains(worldLocation) ? 1 : 0)) {
                ?? r0 = llIIIIlllII[2];
                "".length();
                return 0 != 0 ? ((((18 + 171) - 38) + 36) ^ (((12 + 95) - 17) + 66)) & (((((156 + 174) - 321) + 168) ^ (((64 + 0) - (-5)) + 81)) ^ (-" ".length())) : r0;
            }
            return llIIIIlllII[0];
        }))) {
            return llIIIIlllII[0];
        }
        WorldPoint worldPoint = (WorldPoint) worldLocation.createWorldArea(llIIIIlllII[1]).toWorldPointList().stream().filter(worldPoint2 -> {
            if (lIIlllIllIlIIl(TileObjects.getNearest(tileObject2 -> {
                if (lIIlllIllIlIlI(fH.contains(Integer.valueOf(tileObject2.getId())) ? 1 : 0) && lIIlllIllIlIlI(((GameObject) tileObject2).getWorldArea().contains(worldPoint2) ? 1 : 0)) {
                    ?? r0 = llIIIIlllII[2];
                    "".length();
                    return (-" ".length()) > (-" ".length()) ? ((80 ^ 23) ^ (30 ^ 2)) & (((0 ^ 68) ^ (29 ^ 2)) ^ (-" ".length())) : r0;
                }
                return llIIIIlllII[0];
            }))) {
                ?? r0 = llIIIIlllII[2];
                "".length();
                return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIIlllII[0];
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint3 -> {
            return worldPoint3.distanceTo(worldLocation);
        })).orElse(null);
        if (lIIlllIllIlIIl(worldPoint)) {
            return llIIIIlllII[0];
        }
        Movement.setDestination(worldPoint);
        return llIIIIlllII[2];
    }

    static {
        lIIlllIllIlIII();
    }
}
