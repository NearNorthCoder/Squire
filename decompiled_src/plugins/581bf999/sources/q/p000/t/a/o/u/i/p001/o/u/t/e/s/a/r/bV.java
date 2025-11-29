package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Moving to center", priority = 30)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bV  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bV.class */
public class bV extends bX {
    private static final /* synthetic */ RegionPoint hf;
    private static /* synthetic */ int[] llIIIIlIllI;

    private static boolean lIIlllIlIlIlll(int i, int i2) {
        return i <= i2;
    }

    private static void lIIlllIlIlIIll() {
        llIIIIlIllI = new int[6];
        llIIIIlIllI[0] = (57 ^ 15) & ((105 ^ 95) ^ (-1));
        llIIIIlIllI[1] = "  ".length();
        llIIIIlIllI[2] = " ".length();
        llIIIIlIllI[3] = 172 ^ 181;
        llIIIIlIllI[4] = (((20 + 172) - 104) + 103) ^ (((35 + 66) - 38) + 97);
        llIIIIlIllI[5] = (-((-7447) & 24383)) & (-130) & 32765;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.bX
    public boolean bL() {
        if ((!lIIlllIlIlIlII(bq() ? 1 : 0) || !lIIlllIlIlIlIl(Combat.isSpecEnabled() ? 1 : 0)) && !lIIlllIlIlIlII(cE().isEmpty() ? 1 : 0)) {
            WorldPoint worldLocation = Players.getLocal().getWorldLocation();
            WorldPoint worldPoint = (WorldPoint) WorldPoint.toLocalInstance(this.cu, hf.toWorld()).stream().min(Comparator.comparingInt(worldPoint2 -> {
                return worldPoint2.distanceTo2D(worldLocation);
            })).orElse(null);
            if (lIIlllIlIlIllI(worldPoint)) {
                return llIIIIlIllI[0];
            }
            if ((!lIIlllIlIlIlll(worldPoint.distanceTo(worldLocation), llIIIIlIllI[1]) || !lIIlllIlIllIII(worldLocation.getWorldX(), worldPoint.getWorldX())) && !lIIlllIlIllIIl(cA()) && !lIIlllIlIlIlIl(p(worldPoint) ? 1 : 0)) {
                a(worldPoint, this::P);
                return llIIIIlIllI[2];
            }
            return llIIIIlIllI[0];
        }
        return llIIIIlIllI[0];
    }

    private static boolean lIIlllIlIllIII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlllIlIlIlIl(int i) {
        return i != 0;
    }

    private static boolean lIIlllIlIlIlII(int i) {
        return i == 0;
    }

    @Inject
    protected bV(Client client, C0077z c0077z, TOAConfig tOAConfig) {
        super(client, c0077z, tOAConfig, bY.ATTACK);
    }

    static {
        lIIlllIlIlIIll();
        hf = new RegionPoint(llIIIIlIllI[3], llIIIIlIllI[4], llIIIIlIllI[0], llIIIIlIllI[5]);
    }

    private static boolean lIIlllIlIlIllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlllIlIllIIl(Object obj) {
        return obj != null;
    }
}
