package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Set;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Dodging ba-ba boulder", priority = 101)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bI  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bI.class */
public class bI extends bM {
    private static /* synthetic */ int[] llIIIllIlIl;

    private static boolean lIIlllllIIIlll(Object obj) {
        return obj == null;
    }

    private static void lIIlllllIIIlII() {
        llIIIllIlIl = new int[3];
        llIIIllIlIl[0] = (23 ^ 71) & ((113 ^ 33) ^ (-1));
        llIIIllIlIl[1] = 111 ^ 103;
        llIIIllIlIl[2] = " ".length();
    }

    private static boolean lIIlllllIIIllI(int i) {
        return i == 0;
    }

    @Inject
    protected bI(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    static {
        lIIlllllIIIlII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.AbstractC0015ao
    public boolean bl() {
        if (!lIIlllllIIIlIl(Players.getLocal().isMoving() ? 1 : 0) && !lIIlllllIIIlIl(be() ? 1 : 0)) {
            Set<WorldPoint> o = o(llIIIllIlIl[1]);
            if (lIIlllllIIIlIl(o.isEmpty() ? 1 : 0)) {
                return llIIIllIlIl[0];
            }
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            if (!lIIlllllIIIllI(o.contains(worldLocation) ? 1 : 0) && !lIIlllllIIIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                WorldPoint worldPoint = (WorldPoint) Stream.of(worldLocation.dy(llIIIllIlIl[2])).filter(Reachable::isWalkable).findFirst().orElse(null);
                if (lIIlllllIIIlll(worldPoint)) {
                    return llIIIllIlIl[0];
                }
                Movement.setDestination(worldPoint);
                return llIIIllIlIl[2];
            }
            return llIIIllIlIl[0];
        }
        return llIIIllIlIl[0];
    }

    private static boolean lIIlllllIIIlIl(int i) {
        return i != 0;
    }
}
