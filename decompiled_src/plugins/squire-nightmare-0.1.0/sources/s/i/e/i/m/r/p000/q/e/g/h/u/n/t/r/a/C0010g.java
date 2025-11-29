package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import java.util.Comparator;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.g  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/g.class */
public class C0010g {
    @Inject
    private /* synthetic */ Client bv;
    private static /* synthetic */ int[] llllIlIIllIl;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean l(int i) {
        int[] mapRegions = this.bv.getMapRegions();
        int length = mapRegions.length;
        int i2 = llllIlIIllIl[0];
        while (lIIlIIIIlIIllll(i2, length)) {
            if (lIIlIIIIlIlIIII(mapRegions[i2], i)) {
                return llllIlIIllIl[1];
            }
            i2++;
            "".length();
            if (" ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llllIlIIllIl[0];
    }

    private static boolean lIIlIIIIlIlIIII(int i, int i2) {
        return i == i2;
    }

    private static void lIIlIIIIlIIlllI() {
        llllIlIIllIl = new int[2];
        llllIlIIllIl[0] = (23 ^ 69) & ((84 ^ 6) ^ (-1));
        llllIlIIllIl[1] = " ".length();
    }

    public int aE() {
        return lIIlIIIIlIlIIlI(this.bv.isInInstancedRegion() ? 1 : 0) ? WorldPoint.fromLocalInstance(this.bv, this.bv.getLocalPlayer().getLocalLocation()).getRegionID() : this.bv.getLocalPlayer().getWorldLocation().getRegionID();
    }

    private static boolean lIIlIIIIlIIllll(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIIIIlIIlllI();
    }

    private static boolean lIIlIIIIlIlIIlI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean m(int i) {
        if (lIIlIIIIlIlIIII(aE(), i)) {
            ?? r0 = llllIlIIllIl[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIlIIllIl[0];
    }

    public WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, regionPoint.toWorld()).stream().filter(worldPoint -> {
            if (lIIlIIIIlIlIIII(worldPoint.getPlane(), client.getPlane())) {
                ?? r0 = llllIlIIllIl[1];
                "".length();
                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llllIlIIllIl[0];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }
}
