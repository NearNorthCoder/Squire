package a.u.i.p000.l.r.h.z.s.r.u.q.e;

import java.util.Comparator;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: a.u.i.-.l.r.h.z.s.r.u.q.e.u  reason: invalid package and case insensitive filesystem */
/* loaded from: f9e8fbd0-4571-4716-b37b-883b4ae7fc62.jar:a/u/i/-/l/r/h/z/s/r/u/q/e/u.class */
public class C0020u {
    private static /* synthetic */ int[] lIllIllIlllII;
    @Inject
    private /* synthetic */ Client z;

    private static boolean llIIlIIlIlIIlll(int i) {
        return i != 0;
    }

    private static boolean llIIlIIlIlIIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    public boolean g(int i) {
        int[] mapRegions = this.z.getMapRegions();
        int length = mapRegions.length;
        int i2 = lIllIllIlllII[0];
        while (llIIlIIlIlIIlIl(i2, length)) {
            if (llIIlIIlIlIIllI(mapRegions[i2], i)) {
                return lIllIllIlllII[1];
            }
            i2++;
            "".length();
            if (((88 ^ 80) ^ (30 ^ 18)) < 0) {
                return ((238 ^ 195) ^ (84 ^ 32)) & (((((107 + 127) - 148) + 106) ^ (((3 + 114) - (-27)) + 9)) ^ (-" ".length()));
            }
        }
        return lIllIllIlllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean h(int i) {
        if (llIIlIIlIlIIllI(Q(), i)) {
            ?? r0 = lIllIllIlllII[1];
            "".length();
            return (-" ".length()) >= ((((74 + 120) - 161) + 104) ^ (((118 + 125) - 161) + 59)) ? ((212 ^ 133) ^ (231 ^ 153)) & (((38 ^ 62) ^ (158 ^ 169)) ^ (-" ".length())) : r0;
        }
        return lIllIllIlllII[0];
    }

    public WorldPoint a(RegionPoint regionPoint) {
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, regionPoint.toWorld()).stream().filter(worldPoint -> {
            if (llIIlIIlIlIIllI(worldPoint.getPlane(), client.getPlane())) {
                ?? r0 = lIllIllIlllII[1];
                "".length();
                return (true ^ true) != (true ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIllIlllII[0];
        }).min(Comparator.comparingInt(worldPoint2 -> {
            return worldPoint2.distanceTo(Players.getLocal());
        })).orElse(null);
    }

    public int Q() {
        return llIIlIIlIlIIlll(this.z.isInInstancedRegion() ? 1 : 0) ? WorldPoint.fromLocalInstance(this.z, this.z.getLocalPlayer().getLocalLocation()).getRegionID() : this.z.getLocalPlayer().getWorldLocation().getRegionID();
    }

    static {
        llIIlIIlIlIIlII();
    }

    private static boolean llIIlIIlIlIIllI(int i, int i2) {
        return i == i2;
    }

    private static void llIIlIIlIlIIlII() {
        lIllIllIlllII = new int[2];
        lIllIllIlllII[0] = (34 ^ 38) & ((160 ^ 164) ^ (-1));
        lIllIllIlllII[1] = " ".length();
    }
}
