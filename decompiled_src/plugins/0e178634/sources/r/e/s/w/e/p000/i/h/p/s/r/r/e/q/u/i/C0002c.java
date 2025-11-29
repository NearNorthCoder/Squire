package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import java.util.Comparator;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.c  reason: invalid package and case insensitive filesystem */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/c.class */
public class C0002c {
    private static /* synthetic */ int[] lIlIllIlIIIlI;
    @Inject
    private /* synthetic */ Client j;

    private static boolean llIIIIIlIIIIIll(int i) {
        return i != 0;
    }

    private static void llIIIIIlIIIIIII() {
        lIlIllIlIIIlI = new int[2];
        lIlIllIlIIIlI[0] = (47 ^ 76) & ((167 ^ 196) ^ (-1));
        lIlIllIlIIIlI[1] = " ".length();
    }

    public WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, regionPoint.toWorld()).stream().filter(worldPoint -> {
            if (llIIIIIlIIIIIlI(worldPoint.getPlane(), client.getPlane())) {
                ?? r0 = lIlIllIlIIIlI[1];
                "".length();
                return ((248 ^ 143) ^ (251 ^ 136)) > ((33 ^ 97) ^ (104 ^ 44)) ? ((172 ^ 156) ^ (222 ^ 164)) & (((241 ^ 132) ^ (8 ^ 55)) ^ (-" ".length())) : r0;
            }
            return lIlIllIlIIIlI[0];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }

    public int d() {
        return llIIIIIlIIIIIll(this.j.isInInstancedRegion() ? 1 : 0) ? WorldPoint.fromLocalInstance(this.j, this.j.getLocalPlayer().getLocalLocation()).getRegionID() : this.j.getLocalPlayer().getWorldLocation().getRegionID();
    }

    static {
        llIIIIIlIIIIIII();
    }

    private static boolean llIIIIIlIIIIIlI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIIIIlIIIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean b(int i) {
        int[] mapRegions = this.j.getMapRegions();
        int length = mapRegions.length;
        int i2 = lIlIllIlIIIlI[0];
        while (llIIIIIlIIIIIIl(i2, length)) {
            if (llIIIIIlIIIIIlI(mapRegions[i2], i)) {
                return lIlIllIlIIIlI[1];
            }
            i2++;
            "".length();
            if ((-"   ".length()) >= 0) {
                return ((((37 + 51) - (-19)) + 64) ^ (((151 + 4) - 96) + 98)) & (((((131 + 77) - 187) + 224) ^ (((170 + 40) - 75) + 60)) ^ (-" ".length()));
            }
        }
        return lIlIllIlIIIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean c(int i) {
        if (llIIIIIlIIIIIlI(d(), i)) {
            ?? r0 = lIlIllIlIIIlI[1];
            "".length();
            return "  ".length() > "  ".length() ? ((150 ^ 187) ^ (234 ^ 158)) & (((132 ^ 172) ^ (236 ^ 157)) ^ (-" ".length())) : r0;
        }
        return lIlIllIlIIIlI[0];
    }
}
