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
        void var1;
        void var2;
        this.h = worldPoint;
        this.i = worldPoint2;
        this.k = n;
        this.j = new ArrayList<WorldPoint>();
        int n2 = this.e().getX();
        int n3 = this.e().getY();
        int n4 = this.f().getX();
        int n5 = this.f().getY();
        int var3 = Math.min(n2, n4);
        while (a.lIIlIlIIIIllII(var3, Math.max((int)var2, (int)var1))) {
            void var4;
            void var5;
            int var6 = Math.max((int)var5, (int)var4);
            while (a.lIIlIlIIIIllIl(var6, Math.min((int)var5, (int)var4))) {
                void var7;
                a var8;
                var8.j.add(new WorldPoint(var3, var6, (int)var7));

                --var6;

                throw null;
            }
            ++var3;

            if (-3 < 0) continue;
            throw null;
        }
    }

    public List<WorldPoint> c() {
        return this.j;
    }

    static {
        a.lIIlIlIIIIlIll();
    }

    public int h() {
        return Math.max(this.e().getY(), this.f().getY()) + lIlIllllIIl[1] - Math.min(this.e().getY(), this.f().getY());
    }

    public int g() {
        return Math.max(this.e().getX(), this.f().getX()) + lIlIllllIIl[1] - Math.min(this.e().getX(), this.f().getX());
    }

    public WorldPoint f() {
        return this.i;
    }

    public WorldPoint i() {
        List<WorldPoint> list = this.c();
        int n = lIlIllllIIl[0];
        int n2 = lIlIllllIIl[0];
        Iterator<WorldPoint> var9 = list.iterator();
        while (a.lIIlIlIIIIlllI(var9.hasNext() ? 1 : 0)) {
            WorldPoint var10 = var9.next();
            var11 += var10.getX();
            var12 += var10.getY();

            if ((116 + 66 - 128 + 96 ^ 112 + 97 - 133 + 71) != 0) continue;
            return null;
        }
        return new WorldPoint(n /= list.size(), n2 /= list.size(), this.d());
    }

    public AHelper(int n, int n2, int n3, int n4) {
        this(n, n2, n3, n4, lIlIllllIIl[0]);
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
        Iterator<WorldPoint> var13 = this.c().iterator();
        while (a.lIIlIlIIIIlllI(var13.hasNext() ? 1 : 0)) {
            void var14;
            WorldPoint var15 = var13.next();
            if (a.lIIlIlIIIIlllI(var14.getWorldLocation().equals((Object)var15) ? 1 : 0)) {
                return lIlIllllIIl[1];
            }

            if (((0xF0 ^ 0x93 ^ (0x78 ^ 0x20)) & (91 + 27 - 72 + 96 ^ 113 + 43 - 49 + 74 ^ -1)) > -1) continue;
            return (2 & (2 ^ -1)) != 0;
        }
        return lIlIllllIIl[0];
    }

    private static boolean lIIlIlIIIIlllI(int n) {
        return n != 0;
    }

    public AHelper(WorldPoint worldPoint, WorldPoint worldPoint2) {
        this(worldPoint, worldPoint2, lIlIllllIIl[0]);
    }

    private static boolean lIIlIlIIIIllIl(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlIlIIIIllII(int n, int n2) {
        return n <= n2;
    }
}

