/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Predicates
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

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

public final class g {
    private static /* synthetic */ int[] lIIllIlIlIIll;
    private /* synthetic */ boolean t;
    private final /* synthetic */ Runnable s;
    private final /* synthetic */ Collection<Function<WorldPoint, Boolean>> r;

    static {
        g.lIllIIIIIlllIll();
    }

    private static boolean lIllIIIIIllllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIIIlIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    public g d(WorldPoint worldPoint) {
        return this.a(worldPoint2 -> {
            int n2;
            if (g.lIllIIIIlIIIIlI(worldPoint2.getX(), worldPoint.getX()) && g.lIllIIIIlIIIIlI(worldPoint2.getY(), worldPoint.getY())) {
                n2 = lIIllIlIlIIll[1];
                0;
                if (((0xB7 ^ 0x99 ^ (0x3B ^ 5)) & (14 + 157 - 29 + 33 ^ 119 + 161 - 125 + 36 ^ -1)) > 0) {
                    return null;
                }
            } else {
                n2 = lIIllIlIlIIll[0];
            }
            return n2 != 0;
        });
    }

    public g d(boolean bl) {
        this.t = bl;
        return this;
    }

    public static g b(Predicate<TileObject> predicate) {
        return g.a(() -> TileObjects.getNearest((Predicate)predicate).interact(string -> lIIllIlIlIIll[1]));
    }

    private static void lIllIIIIIlllIll() {
        lIIllIlIlIIll = new int[5];
        g.lIIllIlIlIIll[0] = (0xF1 ^ 0xA5 ^ (0xF0 ^ 0x9E)) & (0x17 ^ 0x79 ^ (0x29 ^ 0x7D) ^ -1);
        g.lIIllIlIlIIll[1] = 1;
        g.lIIllIlIlIIll[2] = 0x44 ^ 0x58 ^ (0x81 ^ 0x84);
        g.lIIllIlIlIIll[3] = 0x1B ^ 0x11;
        g.lIIllIlIlIIll[4] = -1;
    }

    public static g b(int n2) {
        int[] nArray = new int[lIIllIlIlIIll[1]];
        nArray[g.lIIllIlIlIIll[0]] = n2;
        return g.b(Predicates.ids((int[])nArray));
    }

    public g a(int n2, int n3, int n4, int n5, Integer n6) {
        return this.a(worldPoint -> {
            int n7;
            void var1;
            void var2;
            void var4;
            void var6;
            void var7;
            if (g.lIllIIIIIllllll(n6) && g.lIllIIIIlIIIIII(worldPoint.getPlane(), n6)) {
                return lIIllIlIlIIll[0];
            }
            if (g.lIllIIIIIllllIl((int)var7, var6.getX()) && g.lIllIIIIlIIIIIl((int)var4, var6.getX()) && g.lIllIIIIIllllIl((int)var2, var6.getY()) && g.lIllIIIIlIIIIIl((int)var1, var6.getY())) {
                n7 = lIIllIlIlIIll[1];
                0;
                if (3 <= -1) {
                    return null;
                }
            } else {
                n7 = lIIllIlIlIIll[0];
            }
            return n7 != 0;
        });
    }

    private static boolean lIllIIIIlIIIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIlIIIIll(Object object) {
        return object == null;
    }

    public static g a(int n2, int n3) {
        return g.a(n2, n3, null);
    }

    private static boolean lIllIIIIIllllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIllllll(Object object) {
        return object != null;
    }

    public static g a(Runnable runnable) {
        return new g(runnable);
    }

    public g b(int n2, int n3) {
        return this.d(new WorldPoint(n2, n3, lIIllIlIlIIll[1]));
    }

    private g(Runnable runnable) {
        this.r = new HashSet<Function<WorldPoint, Boolean>>();
        this.s = runnable;
    }

    public static g a(int n2, int n3, boolean bl) {
        return g.a(n2, n3, null, bl);
    }

    public g a(Function<WorldPoint, Boolean> function) {
        this.r.add(function);
        0;
        return this;
    }

    public void y() {
        if (g.lIllIIIIIllllII(this.t ? 1 : 0)) {
            if (g.lIllIIIIIllllII(Movement.isRunEnabled() ? 1 : 0) && g.lIllIIIIIllllIl(Movement.getRunEnergy(), lIIllIlIlIIll[2])) {
                Movement.toggleRun();
                0;
                if (-(0x13 ^ 0x4F ^ (0xE3 ^ 0xBA)) >= 0) {
                    return;
                }
            }
        } else {
            if (g.lIllIIIIIllllIl(Movement.getRunEnergy(), lIIllIlIlIIll[3])) {
                return;
            }
            if (g.lIllIIIIIlllllI(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
        }
        this.s.run();
    }

    public static g a(int n2, int n3, String string) {
        return g.a(n2, n3, string, lIIllIlIlIIll[0]);
    }

    private static boolean lIllIIIIlIIIIII(int n2, int n3) {
        return n2 != n3;
    }

    public boolean c(WorldPoint worldPoint) {
        return this.r.stream().anyMatch(function -> (Boolean)function.apply(worldPoint));
    }

    public static g a(int n2, int n3, String string, boolean bl) {
        WorldPoint worldPoint = new WorldPoint(n2, n3, lIIllIlIlIIll[1]);
        return g.a(() -> {
            void var3;
            TileObject tileObject2 = TileObjects.getFirstAt((WorldPoint)worldPoint, tileObject -> tileObject.hasAction(Objects::nonNull));
            if (g.lIllIIIIIllllll(tileObject2) && g.lIllIIIIlIIIIlI(Players.getLocal().getAnimation(), lIIllIlIlIIll[4])) {
                if (g.lIllIIIIlIIIIll(string)) {
                    tileObject2.interact(lIIllIlIlIIll[0]);
                    0;
                    if (-1 != -1) {
                        return;
                    }
                } else {
                    void var5;
                    var5.interact((String)var3);
                }
                return;
            }
            if (g.lIllIIIIlIIIIll(var3)) {
                WorldPoint var8;
                Movement.walk((WorldPoint)var8);
            }
        }).d(bl);
    }

    public g a(int n2, int n3, int n4, int n5) {
        return this.a(n2, n3, n4, n5, null);
    }

    private static boolean lIllIIIIIlllllI(int n2) {
        return n2 == 0;
    }
}

