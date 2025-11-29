package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import java.util.Comparator;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.A  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/A.class */
public class A {
    private static /* synthetic */ int[] lIllIlllIlI;
    @Inject
    private /* synthetic */ Client ai;

    public int aj() {
        return lIIllIIIIIlIII(this.ai.isInInstancedRegion() ? 1 : 0) ? WorldPoint.fromLocalInstance(this.ai, this.ai.getLocalPlayer().getLocalLocation()).getRegionID() : this.ai.getLocalPlayer().getWorldLocation().getRegionID();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean j(int i) {
        if (lIIllIIIIIIlll(aj(), i)) {
            ?? r0 = lIllIlllIlI[1];
            "".length();
            return "  ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIlllIlI[0];
    }

    private static boolean lIIllIIIIIlIII(int i) {
        return i != 0;
    }

    private static boolean lIIllIIIIIIllI(int i, int i2) {
        return i < i2;
    }

    private static void lIIllIIIIIIlIl() {
        lIllIlllIlI = new int[2];
        lIllIlllIlI[0] = (32 ^ 41) & ((46 ^ 39) ^ (-1));
        lIllIlllIlI[1] = " ".length();
    }

    public WorldPoint b(RegionPoint regionPoint) {
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, regionPoint.toWorld()).stream().filter(worldPoint -> {
            if (lIIllIIIIIIlll(worldPoint.getPlane(), client.getPlane())) {
                ?? r0 = lIllIlllIlI[1];
                "".length();
                return (120 ^ 124) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIlllIlI[0];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean k(int i) {
        int[] mapRegions = this.ai.getMapRegions();
        int length = mapRegions.length;
        int i2 = lIllIlllIlI[0];
        while (lIIllIIIIIIllI(i2, length)) {
            if (lIIllIIIIIIlll(mapRegions[i2], i)) {
                return lIllIlllIlI[1];
            }
            i2++;
            "".length();
            if ("  ".length() <= 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIllIlllIlI[0];
    }

    static {
        lIIllIIIIIIlIl();
    }

    private static boolean lIIllIIIIIIlll(int i, int i2) {
        return i == i2;
    }
}
