/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldPoint
 */
package gg.squire.agility.tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;

public class AHelper {
    private final  WorldPoint h;
    private final  List<WorldPoint> j;
    private final  int k;
    private final  WorldPoint i;

    public AHelper(int n, int n2, int n3, int n4, int n5) {
        this(new WorldPoint(n, n2, n5), new WorldPoint(n3, n4, n5), n5);
    }

    /*
     * WARNING - void declaration
     */
    public AHelper(WorldPoint worldPoint, WorldPoint worldPoint2, int n) {
        void var2;
        void var3;
        this.h = worldPoint;
        this.i = worldPoint2;
        this.k = n;
        this.j = new ArrayList<WorldPoint>();
        int n2 = this.e().getX();
        int n3 = this.e().getY();
        int n4 = this.f().getX();
        int n5 = this.f().getY();
        int var4 = Math.min(n2, n4);
        while (a.var5(var4, Math.max((int)var3, (int)var2))) {
            void var6;
            void var7;
            int var8 = Math.max((int)var7, (int)var6);
            while (a.var9(var8, Math.min((int)var7, (int)var6))) {
                void var10;
                a var11;
                var11.j.add(new WorldPoint(var4, var8, (int)var10));
                0;
                --var8;
                0;
                if null == null continue;
                throw null;
            }
            ++var4;
            0;
            if (-3 < 0) continue;
            throw null;
        }
    }

    public List<WorldPoint> c() {
        return this.j;
    }

    static {
        a.var12();
    }

    public int h() {
        return Math.max(this.e().getY(), this.f().getY()) + var1[1] - Math.min(this.e().getY(), this.f().getY());
    }

    public int g() {
        return Math.max(this.e().getX(), this.f().getX()) + var1[1] - Math.min(this.e().getX(), this.f().getX());
    }

    public WorldPoint f() {
        return this.i;
    }

    public WorldPoint i() {
        List<WorldPoint> list = this.c();
        int n = var1[0];
        int n2 = var1[0];
        Iterator<WorldPoint> var13 = list.iterator();
        while (a.var14(var13.hasNext() ? 1 : 0)) {
            WorldPoint var15 = var13.next();
            var16 += var15.getX();
            var17 += var15.getY();
            0;
            if ((116 + 66 - 128 + 96 ^ 112 + 97 - 133 + 71) != 0) continue;
            return null;
        }
        return new WorldPoint(n /= list.size(), n2 /= list.size(), this.d());
    }

    private static void var12() {
        var1 = new int[2];
        a.var1[0] = (0xA2 ^ 0x8A) & ~(0x25 ^ 0xD);
        a.var1[1] = 1;
    }

    public AHelper(int n, int n2, int n3, int n4) {
        this(n, n2, n3, n4, var1[0]);
    }

    public int d() {
        return this.k;
    }

    public WorldPoint e() {
        return this.h;
    }

    /*
     * WARNING - void declaration
     */
    public boolean AHelper(Locatable locatable) {
        Iterator<WorldPoint> var18 = this.c().iterator();
        while (a.var14(var18.hasNext() ? 1 : 0)) {
            void var19;
            WorldPoint var20 = var18.next();
            if (a.var14(var19.getWorldLocation().equals((Object)var20) ? 1 : 0)) {
                return var1[1];
            }
            0;
            if (((0xF0 ^ 0x93 ^ (0x78 ^ 0x20)) & (91 + 27 - 72 + 96 ^ 113 + 43 - 49 + 74 ^ -1)) > -1) continue;
            return (2 & (2 ^ -1)) != 0;
        }
        return var1[0];
    }

    private static boolean var14(int n) {
        return n != 0;
    }

    public AHelper(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this(worldPoint, worldPoint2, var1[0]);
    }

    private static boolean var9(int n, int n2) {
        return n >= n2;
    }

    private static boolean var5(int n, int n2) {
        return n <= n2;
    }
}

