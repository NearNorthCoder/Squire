package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import gg.squire.nightmare.SquireNightmarePlugin;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.inject.Singleton;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.TileObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.e  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/e.class */
public class C0008e {
    private static final /* synthetic */ Logger bk;
    private static final /* synthetic */ int[] bl;
    private static /* synthetic */ int[] lllIlllllIII;
    private /* synthetic */ WorldArea bn = null;
    private static final /* synthetic */ int[] bm;

    private static boolean lIIIlllIIlIllIl(Object obj) {
        return obj == null;
    }

    public WorldArea az() {
        return this.bn;
    }

    private static boolean lIIIlllIIlIlllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RectangularArea ay() {
        List<TileObject> aW = C0013j.aW();
        if (lIIIlllIIlIIlll(aW.isEmpty() ? 1 : 0)) {
            return null;
        }
        int lllllllllllllllIIllIIIlIllIIIIll = lllIlllllIII[6];
        int i = lllIlllllIII[6];
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (TileObject tileObject : aW) {
            lllllllllllllllIIllIIIlIllIIIIll = Math.min(lllllllllllllllIIllIIIlIllIIIIll, tileObject.getWorldLocation().getX());
            i = Math.min(i, tileObject.getWorldLocation().getY());
            i2 = Math.max(i2, tileObject.getWorldLocation().getX());
            i3 = Math.max(i3, tileObject.getWorldLocation().getY());
            "".length();
            if (((65 ^ 101) & ((52 ^ 16) ^ (-1))) > 0) {
                return null;
            }
        }
        return new RectangularArea(lllllllllllllllIIllIIIlIllIIIIll, i, i2, i3, lllIlllllIII[7]);
    }

    public int hashCode() {
        int hashCode;
        int i = lllIlllllIII[8];
        int i2 = lllIlllllIII[4];
        WorldArea az = az();
        int i3 = i2 * lllIlllllIII[8];
        if (lIIIlllIIlIllIl(az)) {
            hashCode = lllIlllllIII[9];
            "".length();
            if ((-" ".length()) > (78 ^ 74)) {
                return (31 ^ 63) & ((53 ^ 21) ^ (-1));
            }
        } else {
            hashCode = az.hashCode();
        }
        return i3 + hashCode;
    }

    private static boolean lIIIlllIIlIIlll(int i) {
        return i != 0;
    }

    private static void lIIIlllIIlIIllI() {
        lllIlllllIII = new int[16];
        lllIlllllIII[0] = (69 ^ 36) ^ (102 ^ 20);
        lllIlllllIII[1] = "  ".length();
        lllIlllllIII[2] = (84 ^ 96) & ((149 ^ 161) ^ (-1));
        lllIlllllIII[3] = (-(((79 + 93) - 69) + 30)) & (-27649) & 65519;
        lllIlllllIII[4] = " ".length();
        lllIlllllIII[5] = (-((-10) & 25759)) & (-1) & 63487;
        lllIlllllIII[6] = (-1) & Integer.MAX_VALUE;
        lllIlllllIII[7] = "   ".length();
        lllIlllllIII[8] = 174 ^ 149;
        lllIlllllIII[9] = (252 ^ 137) ^ (88 ^ 6);
        lllIlllllIII[10] = (-18950) & 28383;
        lllIlllllIII[11] = (-((-8201) & 14381)) & (-257) & 15871;
        lllIlllllIII[12] = (-6147) & 15582;
        lllIlllllIII[13] = (-5) & 9447;
        lllIlllllIII[14] = (-((-29857) & 32699)) & (-2) & 12287;
        lllIlllllIII[15] = (-((-11021) & 27407)) & (-2049) & 27879;
    }

    static {
        lIIIlllIIlIIllI();
        bk = LoggerFactory.getLogger(C0008e.class);
        int[] iArr = new int[lllIlllllIII[7]];
        iArr[lllIlllllIII[2]] = lllIlllllIII[10];
        iArr[lllIlllllIII[4]] = lllIlllllIII[11];
        iArr[lllIlllllIII[1]] = lllIlllllIII[12];
        bl = iArr;
        int[] iArr2 = new int[lllIlllllIII[7]];
        iArr2[lllIlllllIII[2]] = lllIlllllIII[13];
        iArr2[lllIlllllIII[4]] = lllIlllllIII[14];
        iArr2[lllIlllllIII[1]] = lllIlllllIII[15];
        bm = iArr2;
    }

    public static List<WorldArea> ax() {
        int[] iArr = new int[lllIlllllIII[1]];
        iArr[lllIlllllIII[2]] = lllIlllllIII[3];
        iArr[lllIlllllIII[4]] = lllIlllllIII[5];
        List all = TileObjects.getAll(iArr);
        return lIIIlllIIlIIlll(all.isEmpty() ? 1 : 0) ? new ArrayList() : (List) all.stream().map(tileObject -> {
            return tileObject.getWorldLocation().toWorldArea(lllIlllllIII[7], lllIlllllIII[7]);
        }).collect(Collectors.toList());
    }

    public String toString() {
        return "AreaManager(drawArea=" + az() + ")";
    }

    private static boolean lIIIlllIIlIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static WorldArea aw() {
        return SquireNightmarePlugin.e().toWorldArea(lllIlllllIII[0], lllIlllllIII[0]);
    }

    public void c(WorldArea worldArea) {
        this.bn = worldArea;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
        if (lIIIlllIIlIlIll(r0.equals(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIIlllIIlIlIIl(obj, this)) {
            return lllIlllllIII[4];
        }
        if (lIIIlllIIlIlIll(obj instanceof C0008e ? 1 : 0)) {
            return lllIlllllIII[2];
        }
        C0008e c0008e = (C0008e) obj;
        if (lIIIlllIIlIlIll(c0008e.a(this) ? 1 : 0)) {
            return lllIlllllIII[2];
        }
        WorldArea az = az();
        WorldArea az2 = c0008e.az();
        if (lIIIlllIIlIllIl(az)) {
            if (lIIIlllIIlIlllI(az2)) {
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return lllIlllllIII[2];
            }
            return lllIlllllIII[4];
        }
    }

    private static boolean lIIIlllIIlIlIll(int i) {
        return i == 0;
    }

    protected boolean a(Object obj) {
        return obj instanceof C0008e;
    }
}
