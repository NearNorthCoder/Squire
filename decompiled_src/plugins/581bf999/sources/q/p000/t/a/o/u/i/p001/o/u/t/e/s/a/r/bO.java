package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Avoiding Blood Cloud", priority = 15, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bO  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bO.class */
public class bO extends bX {
    private static /* synthetic */ int[] llIIIIIIlll;

    private static void lIIlllIIlIIIII() {
        llIIIIIIlll = new int[4];
        llIIIIIIlll[0] = (122 ^ 38) & ((53 ^ 105) ^ (-1));
        llIIIIIIlll[1] = "  ".length();
        llIIIIIIlll[2] = "   ".length();
        llIIIIIIlll[3] = " ".length();
    }

    @Inject
    protected bO(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIIlllIIlIIIll(int i) {
        return i == 0;
    }

    private static boolean lIIlllIIlIIIlI(int i, int i2) {
        return i > i2;
    }

    static {
        lIIlllIIlIIIII();
    }

    private static boolean lIIlllIIlIIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bX
    public boolean bL() {
        NPC cA = cA();
        if (lIIlllIIlIIIIl(cA)) {
            return llIIIIIIlll[0];
        }
        Player local = Players.getLocal();
        if (lIIlllIIlIIIlI(cA.distanceTo(local), llIIIIIIlll[1])) {
            return llIIIIIIlll[0];
        }
        WorldPoint worldPoint = (WorldPoint) local.getWorldArea().offset(llIIIIIIlll[2]).toWorldPointList().stream().filter(worldPoint2 -> {
            if (lIIlllIIlIIIll(p(worldPoint2) ? 1 : 0)) {
                ?? r0 = llIIIIIIlll[3];
                "".length();
                return " ".length() == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIIIIlll[0];
        }).filter(Reachable::isWalkable).max(Comparator.comparingDouble(worldPoint3 -> {
            return worldPoint3.distanceTo2DHypotenuse(cA.getWorldLocation());
        })).orElse(null);
        if (lIIlllIIlIIIIl(worldPoint)) {
            return llIIIIIIlll[0];
        }
        Movement.setDestination(C(local.getWorldLocation(), worldPoint));
        return llIIIIIIlll[3];
    }
}
