package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Dodging floor tiles", priority = 105, blocking = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aO  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/aO.class */
public class aO extends aI {
    private static final /* synthetic */ int ef;
    private static final /* synthetic */ List<Integer> ee;
    private static /* synthetic */ int[] llIIIIIIlII;

    private static boolean lIIlllIIIllIll(int i) {
        return i == 0;
    }

    private static boolean lIIlllIIIlllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlllIIIllIlI(int i) {
        return i != 0;
    }

    private static void lIIlllIIIllIIl() {
        llIIIIIIlII = new int[8];
        llIIIIIIlII[0] = ((((197 + 46) - 55) + 39) ^ (((88 + 82) - 144) + 152)) & (((((80 + 34) - 95) + 178) ^ (((110 + 131) - 203) + 110)) ^ (-" ".length()));
        llIIIIIIlII[1] = (148 ^ 134) ^ (68 ^ 82);
        llIIIIIIlII[2] = " ".length();
        llIIIIIIlII[3] = -((((37 + 128) - 124) + 106) ^ (((134 + 104) - 142) + 55));
        llIIIIIIlII[4] = "  ".length();
        llIIIIIIlII[5] = "   ".length();
        llIIIIIIlII[6] = (-((-994) & 7159)) & (-579) & 8191;
        llIIIIIIlII[7] = (-((-8249) & 30585)) & (-1) & 24447;
    }

    static {
        lIIlllIIIllIIl();
        ef = llIIIIIIlII[6];
        ee = List.of(Integer.valueOf(llIIIIIIlII[7]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.aI
    public boolean bC() {
        if (lIIlllIIIllIlI(this.cW.redX() ? 1 : 0)) {
            return llIIIIIIlII[0];
        }
        ArrayList arrayList = new ArrayList();
        AtomicReference atomicReference = new AtomicReference(null);
        this.cu.getGraphicsObjects().forEach(graphicsObject -> {
            if (lIIlllIIIllIlI(ee.contains(Integer.valueOf(graphicsObject.getId())) ? 1 : 0)) {
                arrayList.add(WorldPoint.fromLocal(this.cu, graphicsObject.getLocation()));
                "".length();
            }
            if (lIIlllIIIlllIl(graphicsObject.getId(), llIIIIIIlII[6])) {
                atomicReference.set(graphicsObject.getLocation());
            }
        });
        if (!lIIlllIIIllIll(arrayList.isEmpty() ? 1 : 0) || lIIlllIIIlllII(atomicReference.get())) {
            return llIIIIIIlII[0];
        }
        WorldPoint fromLocal = WorldPoint.fromLocal(this.cu, (LocalPoint) atomicReference.get());
        WorldPoint[] worldPointArr = new WorldPoint[llIIIIIIlII[1]];
        worldPointArr[llIIIIIIlII[0]] = fromLocal.dx(llIIIIIIlII[1]);
        worldPointArr[llIIIIIIlII[2]] = fromLocal.dx(llIIIIIIlII[3]);
        worldPointArr[llIIIIIIlII[4]] = fromLocal.dy(llIIIIIIlII[1]);
        worldPointArr[llIIIIIIlII[5]] = fromLocal.dy(llIIIIIIlII[3]);
        WorldPoint worldPoint = (WorldPoint) Stream.of((Object[]) worldPointArr).filter(worldPoint2 -> {
            if (lIIlllIIIllIll(arrayList.contains(worldPoint2) ? 1 : 0)) {
                ?? r0 = llIIIIIIlII[2];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIIIIlII[0];
        }).filter(Reachable::isWalkable).min(Comparator.comparingInt(worldPoint3 -> {
            return worldPoint3.distanceTo(Players.getLocal());
        })).orElse(null);
        if (lIIlllIIIlllII(worldPoint)) {
            return llIIIIIIlII[0];
        }
        Movement.setDestination(worldPoint);
        return llIIIIIIlII[2];
    }

    @Inject
    protected aO(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig);
    }

    private static boolean lIIlllIIIlllII(Object obj) {
        return obj == null;
    }
}
