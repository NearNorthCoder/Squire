package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import java.util.Comparator;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/g.class */
public class C0006g {
    private static /* synthetic */ int[] lIlIllIIIIIIl;
    @Inject
    private /* synthetic */ Client D;

    private static void llIIIIIIIIIIIIl() {
        lIlIllIIIIIIl = new int[2];
        lIlIllIIIIIIl[0] = (110 ^ 62) & ((201 ^ 153) ^ (-1));
        lIlIllIIIIIIl[1] = " ".length();
    }

    private static boolean llIIIIIIIIIIIll(int i2, int i3) {
        return i2 == i3;
    }

    public WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, regionPoint.toWorld()).stream().filter(worldPoint -> {
            if (llIIIIIIIIIIIll(worldPoint.getPlane(), client.getPlane())) {
                ?? r0 = lIlIllIIIIIIl[1];
                "".length();
                return "   ".length() != "   ".length() ? ((250 ^ 136) ^ (254 ^ 167)) & (((73 ^ 120) ^ (26 ^ 0)) ^ (-" ".length())) : r0;
            }
            return lIlIllIIIIIIl[0];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }

    private static boolean llIIIIIIIIIIlII(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean d(int i2) {
        if (llIIIIIIIIIIIll(J(), i2)) {
            ?? r0 = lIlIllIIIIIIl[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIllIIIIIIl[0];
    }

    static {
        llIIIIIIIIIIIIl();
    }

    private static boolean llIIIIIIIIIIIlI(int i2, int i3) {
        return i2 < i3;
    }

    public int J() {
        return llIIIIIIIIIIlII(this.D.isInInstancedRegion() ? 1 : 0) ? WorldPoint.fromLocalInstance(this.D, this.D.getLocalPlayer().getLocalLocation()).getRegionID() : this.D.getLocalPlayer().getWorldLocation().getRegionID();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean c(int i2) {
        int[] mapRegions = this.D.getMapRegions();
        int length = mapRegions.length;
        int i3 = lIlIllIIIIIIl[0];
        while (llIIIIIIIIIIIlI(i3, length)) {
            int llllllllllllllIllIlIIlllllIlIlIl = mapRegions[i3];
            if (llIIIIIIIIIIIll(llllllllllllllIllIlIIlllllIlIlIl, i2)) {
                return lIlIllIIIIIIl[1];
            }
            i3++;
            "".length();
            if (((((65 + 54) - (-3)) + 10) ^ (((118 + 33) - 88) + 65)) < " ".length()) {
                return ((91 ^ 8) ^ (141 ^ 199)) & (((232 ^ 138) ^ (53 ^ 78)) ^ (-" ".length()));
            }
        }
        return lIlIllIIIIIIl[0];
    }
}
