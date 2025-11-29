package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.g  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/g.class */
public final class C0006g {
    private static /* synthetic */ int[] lIIllIlIlIIll;
    private /* synthetic */ boolean t;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ Runnable f0s;
    private final /* synthetic */ Collection<Function<WorldPoint, Boolean>> r = new HashSet();

    static {
        lIllIIIIIlllIll();
    }

    private static boolean lIllIIIIIllllIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIIIIlIIIIlI(int i, int i2) {
        return i == i2;
    }

    public C0006g d(WorldPoint worldPoint) {
        return a(worldPoint2 -> {
            boolean z;
            if (lIllIIIIlIIIIlI(worldPoint2.getX(), worldPoint.getX()) && lIllIIIIlIIIIlI(worldPoint2.getY(), worldPoint.getY())) {
                int i = lIIllIlIlIIll[1];
                "".length();
                z = i;
                if ((((183 ^ 153) ^ (59 ^ 5)) & (((((14 + 157) - 29) + 33) ^ (((119 + 161) - 125) + 36)) ^ (-" ".length()))) > 0) {
                    return null;
                }
            } else {
                z = lIIllIlIlIIll[0];
            }
            return Boolean.valueOf(z);
        });
    }

    public C0006g d(boolean z) {
        this.t = z;
        return this;
    }

    public static C0006g b(Predicate<TileObject> predicate) {
        return a(() -> {
            TileObjects.getNearest(predicate).interact(str -> {
                return lIIllIlIlIIll[1];
            });
        });
    }

    private static void lIllIIIIIlllIll() {
        lIIllIlIlIIll = new int[5];
        lIIllIlIlIIll[0] = ((241 ^ 165) ^ (240 ^ 158)) & (((23 ^ 121) ^ (41 ^ 125)) ^ (-" ".length()));
        lIIllIlIlIIll[1] = " ".length();
        lIIllIlIlIIll[2] = (68 ^ 88) ^ (129 ^ 132);
        lIIllIlIlIIll[3] = 27 ^ 17;
        lIIllIlIlIIll[4] = -" ".length();
    }

    public static C0006g b(int i) {
        int[] iArr = new int[lIIllIlIlIIll[1]];
        iArr[lIIllIlIlIIll[0]] = i;
        return b(Predicates.ids(iArr));
    }

    public C0006g a(int i, int i2, int i3, int i4, Integer num) {
        return a(worldPoint -> {
            boolean z;
            if (lIllIIIIIllllll(num) && lIllIIIIlIIIIII(worldPoint.getPlane(), num.intValue())) {
                return Boolean.valueOf((boolean) lIIllIlIlIIll[0]);
            }
            if (lIllIIIIIllllIl(i, worldPoint.getX()) && lIllIIIIlIIIIIl(i3, worldPoint.getX()) && lIllIIIIIllllIl(i2, worldPoint.getY()) && lIllIIIIlIIIIIl(i4, worldPoint.getY())) {
                int i5 = lIIllIlIlIIll[1];
                "".length();
                z = i5;
                if ("   ".length() <= (-" ".length())) {
                    return null;
                }
            } else {
                z = lIIllIlIlIIll[0];
            }
            return Boolean.valueOf(z);
        });
    }

    private static boolean lIllIIIIlIIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIIIlIIIIll(Object obj) {
        return obj == null;
    }

    public static C0006g a(int i, int i2) {
        return a(i, i2, (String) null);
    }

    private static boolean lIllIIIIIllllII(int i) {
        return i != 0;
    }

    private static boolean lIllIIIIIllllll(Object obj) {
        return obj != null;
    }

    public static C0006g a(Runnable runnable) {
        return new C0006g(runnable);
    }

    public C0006g b(int i, int i2) {
        return d(new WorldPoint(i, i2, lIIllIlIlIIll[1]));
    }

    private C0006g(Runnable runnable) {
        this.f0s = runnable;
    }

    public static C0006g a(int i, int i2, boolean z) {
        return a(i, i2, (String) null, z);
    }

    public C0006g a(Function<WorldPoint, Boolean> function) {
        this.r.add(function);
        "".length();
        return this;
    }

    public void y() {
        if (lIllIIIIIllllII(this.t ? 1 : 0)) {
            if (lIllIIIIIllllII(Movement.isRunEnabled() ? 1 : 0) && lIllIIIIIllllIl(Movement.getRunEnergy(), lIIllIlIlIIll[2])) {
                Movement.toggleRun();
                "".length();
                if ((-((19 ^ 79) ^ (227 ^ 186))) >= 0) {
                    return;
                }
            }
        } else if (lIllIIIIIllllIl(Movement.getRunEnergy(), lIIllIlIlIIll[3])) {
            return;
        } else {
            if (lIllIIIIIlllllI(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
        }
        this.f0s.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    public static C0006g a(int i, int i2, String str) {
        return a(i, i2, str, (boolean) lIIllIlIlIIll[0]);
    }

    private static boolean lIllIIIIlIIIIII(int i, int i2) {
        return i != i2;
    }

    public boolean c(WorldPoint worldPoint) {
        return this.r.stream().anyMatch(function -> {
            return ((Boolean) function.apply(worldPoint)).booleanValue();
        });
    }

    public static C0006g a(int i, int i2, String str, boolean z) {
        WorldPoint worldPoint = new WorldPoint(i, i2, lIIllIlIlIIll[1]);
        return a(() -> {
            TileObject firstAt = TileObjects.getFirstAt(worldPoint, tileObject -> {
                return tileObject.hasAction((v0) -> {
                    return Objects.nonNull(v0);
                });
            });
            if (!lIllIIIIIllllll(firstAt) || !lIllIIIIlIIIIlI(Players.getLocal().getAnimation(), lIIllIlIlIIll[4])) {
                if (lIllIIIIlIIIIll(str)) {
                    Movement.walk(worldPoint);
                }
            } else if (!lIllIIIIlIIIIll(str)) {
                firstAt.interact(str);
            } else {
                firstAt.interact(lIIllIlIlIIll[0]);
                "".length();
                if ((-" ".length()) != (-" ".length())) {
                }
            }
        }).d(z);
    }

    public C0006g a(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, i4, null);
    }

    private static boolean lIllIIIIIlllllI(int i) {
        return i == 0;
    }
}
