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
package gg.squire.thieving.tasks;

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

public final class GHelper {
    
    private  boolean t;
    private final  Runnable s;
    private final  Collection<Function<WorldPoint, Boolean>> r;

    static {
        g.var2();
    }

    private static boolean var3(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    public g d(WorldPoint worldPoint) {
        return this.a(worldPoint2 -> {
            int n2;
            if (g.var4(worldPoint2.getX(), worldPoint.getX()) && g.var4(worldPoint2.getY(), worldPoint.getY())) {
                n2 = var1[1];
                0;
                if (((0xB7 ^ 0x99 ^ (0x3B ^ 5)) & (14 + 157 - 29 + 33 ^ 119 + 161 - 125 + 36 ^ -1)) > 0) {
                    return null;
                }
            } else {
                n2 = var1[0];
            }
            return n2 != 0;
        });
    }

    public g d(boolean bl) {
        this.t = bl;
        return this;
    }

    public static g b(Predicate<TileObject> predicate) {
        return g.a(() -> TileObjects.getNearest((Predicate)predicate).interact(string -> var1[1]));
    }

    private static void var2() {
        var1 = new int[5];
        g.var1[0] = (0xF1 ^ 0xA5 ^ (0xF0 ^ 0x9E)) & (0x17 ^ 0x79 ^ (0x29 ^ 0x7D) ^ -1);
        g.var1[1] = 1;
        g.var1[2] = 0x44 ^ 0x58 ^ (0x81 ^ 0x84);
        g.var1[3] = 0x1B ^ 0x11;
        g.var1[4] = -1;
    }

    public static g b(int n2) {
        int[] nArray = new int[var1[1]];
        nArray[g.var1[0]] = n2;
        return g.b(Predicates.ids((int[])nArray));
    }

    public g a(int n2, int n3, int n4, int n5, Integer n6) {
        return this.a(worldPoint -> {
            int n7;
            void var5;
            void var6;
            void var7;
            void var8;
            void var9;
            if (g.var10(n6) && g.var11(worldPoint.getPlane(), n6)) {
                return var1[0];
            }
            if (g.var3((int)var9, var8.getX()) && g.var12((int)var7, var8.getX()) && g.var3((int)var6, var8.getY()) && g.var12((int)var5, var8.getY())) {
                n7 = var1[1];
                0;
                if (3 <= -1) {
                    return null;
                }
            } else {
                n7 = var1[0];
            }
            return n7 != 0;
        });
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var13(Object object) {
        return object == null;
    }

    public static g a(int n2, int n3) {
        return g.a(n2, n3, null);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

    private static boolean var10(Object object) {
        return object != null;
    }

    public static g a(Runnable runnable) {
        return new GHelper(runnable);
    }

    public g b(int n2, int n3) {
        return this.d(new WorldPoint(n2, n3, var1[1]));
    }

    private GHelper(Runnable runnable) {
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
        if (g.var14(this.t)) {
            if (g.var14(Movement.isRunEnabled() ? 1 : 0) && g.var3(Movement.getRunEnergy(), var1[2])) {
                Movement.toggleRun();
                0;
                if (-(0x13 ^ 0x4F ^ (0xE3 ^ 0xBA)) >= 0) {
                    return;
                }
            }
        } else {
            if (g.var3(Movement.getRunEnergy(), var1[3])) {
                return;
            }
            if (g.var15(Movement.isRunEnabled() ? 1 : 0)) {
                Movement.toggleRun();
            }
        }
        this.s.run();
    }

    public static g a(int n2, int n3, String string) {
        return g.a(n2, n3, string, var1[0]);
    }

    private static boolean var11(int n2, int n3) {
        return n2 != n3;
    }

    public boolean c(WorldPoint worldPoint) {
        return this.r.stream().anyMatch(function -> (Boolean)function.apply(worldPoint));
    }

    public static g a(int n2, int n3, String string, boolean bl) {
        WorldPoint worldPoint = new WorldPoint(n2, n3, var1[1]);
        return g.a(() -> {
            void var16;
            TileObject tileObject2 = TileObjects.getFirstAt((WorldPoint)worldPoint, tileObject -> tileObject.hasAction(Objects::nonNull));
            if (g.var10(tileObject2) && g.var4(Players.getLocal().getAnimation(), var1[4])) {
                if (g.var13(string)) {
                    tileObject2.interact(var1[0]);
                    0;
                    if (-1 != -1) {
                        return;
                    }
                } else {
                    void var17;
                    var17.interact((String)var16);
                }
                return;
            }
            if (g.var13(var16)) {
                WorldPoint var18;
                Movement.walk((WorldPoint)var18);
            }
        }).d(bl);
    }

    public g a(int n2, int n3, int n4, int n5) {
        return this.a(n2, n3, n4, n5, null);
    }

    private static boolean var15(int n2) {
        return n2 == 0;
    }
}

