package y.l.q.i.p000.g.u.s.r.e.t.a.i.i;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;
/* renamed from: y.l.q.i.-.g.u.s.r.e.t.a.i.i.a  reason: invalid package */
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:y/l/q/i/-/g/u/s/r/e/t/a/i/i/a.class */
public class a {
    private final /* synthetic */ WorldPoint h;
    private final /* synthetic */ List<WorldPoint> j;
    private final /* synthetic */ int k;
    private final /* synthetic */ WorldPoint i;
    private static /* synthetic */ int[] lIlIllllIIl;

    public a(int i, int i2, int i3, int i4, int i5) {
        this(new WorldPoint(i, i2, i5), new WorldPoint(i3, i4, i5), i5);
    }

    public a(WorldPoint worldPoint, WorldPoint worldPoint2, int i) {
        this.h = worldPoint;
        this.i = worldPoint2;
        this.k = i;
        this.j = new ArrayList();
        int x = e().getX();
        int y2 = e().getY();
        int x2 = f().getX();
        int y3 = f().getY();
        int min = Math.min(x, x2);
        while (lIIlIlIIIIllII(min, Math.max(x, x2))) {
            int max = Math.max(y2, y3);
            while (lIIlIlIIIIllIl(max, Math.min(y2, y3))) {
                this.j.add(new WorldPoint(min, max, i));
                "".length();
                max--;
                "".length();
                if (0 != 0) {
                    throw null;
                }
            }
            min++;
            "".length();
            if ((-"   ".length()) >= 0) {
                throw null;
            }
        }
    }

    public List<WorldPoint> c() {
        return this.j;
    }

    static {
        lIIlIlIIIIlIll();
    }

    public int h() {
        return (Math.max(e().getY(), f().getY()) + lIlIllllIIl[1]) - Math.min(e().getY(), f().getY());
    }

    public int g() {
        return (Math.max(e().getX(), f().getX()) + lIlIllllIIl[1]) - Math.min(e().getX(), f().getX());
    }

    public WorldPoint f() {
        return this.i;
    }

    public WorldPoint i() {
        List<WorldPoint> c = c();
        int i = lIlIllllIIl[0];
        int i2 = lIlIllllIIl[0];
        for (WorldPoint worldPoint : c) {
            i += worldPoint.getX();
            i2 += worldPoint.getY();
            "".length();
            if (((((116 + 66) - 128) + 96) ^ (((112 + 97) - 133) + 71)) == 0) {
                return null;
            }
        }
        return new WorldPoint(i / c.size(), i2 / c.size(), d());
    }

    private static void lIIlIlIIIIlIll() {
        lIlIllllIIl = new int[2];
        lIlIllllIIl[0] = (162 ^ 138) & ((37 ^ 13) ^ (-1));
        lIlIllllIIl[1] = " ".length();
    }

    public a(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, lIlIllllIIl[0]);
    }

    public int d() {
        return this.k;
    }

    public WorldPoint e() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean a(Locatable locatable) {
        for (WorldPoint worldPoint : c()) {
            if (lIIlIlIIIIlllI(locatable.getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                return lIlIllllIIl[1];
            }
            "".length();
            if ((((240 ^ 147) ^ (120 ^ 32)) & (((((91 + 27) - 72) + 96) ^ (((113 + 43) - 49) + 74)) ^ (-" ".length()))) <= (-" ".length())) {
                return "  ".length() & ("  ".length() ^ (-" ".length()));
            }
        }
        return lIlIllllIIl[0];
    }

    private static boolean lIIlIlIIIIlllI(int i) {
        return i != 0;
    }

    public a(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this(worldPoint, worldPoint2, lIlIllllIIl[0]);
    }

    private static boolean lIIlIlIIIIllIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlIIIIllII(int i, int i2) {
        return i <= i2;
    }
}
