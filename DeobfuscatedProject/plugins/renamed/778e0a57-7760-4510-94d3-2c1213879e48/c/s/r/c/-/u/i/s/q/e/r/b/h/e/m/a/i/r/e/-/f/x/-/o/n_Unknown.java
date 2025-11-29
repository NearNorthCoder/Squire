/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.J;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.MEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.SEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a_Unknown;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class n_Unknown {
    public /* synthetic */ N bw;
    public /* synthetic */ WorldArea br;
    public /* synthetic */ J by;
    public /* synthetic */ char bv;
    public /* synthetic */ WorldPoint bq;
    public /* synthetic */ char bu;
    private static /* synthetic */ int[] lIlIlIlIIlIl;
    public /* synthetic */ S bx;
    public /* synthetic */ M bz;
    public /* synthetic */ WorldPoint bt;
    public /* synthetic */ WorldPoint bs;

    private static void llIlllIlllIlII() {
        lIlIlIlIIlIl = new int[9];
        n.lIlIlIlIIlIl[0] = 0xC ^ 0x40 ^ (0x37 ^ 0x5B);
        n.lIlIlIlIIlIl[1] = 1;
        n.lIlIlIlIIlIl[2] = -(0x34 ^ 0x65 ^ (0xCB ^ 0xBA));
        n.lIlIlIlIIlIl[3] = -1;
        n.lIlIlIlIIlIl[4] = (65 + 20 - -14 + 34 ^ 35 + 30 - -97 + 26) & (0x48 ^ 0x40 ^ (0x58 ^ 0x69) ^ -1);
        n.lIlIlIlIIlIl[5] = 32 + 132 - 146 + 132 ^ 93 + 151 - 109 + 52;
        n.lIlIlIlIIlIl[6] = 0xBC ^ 0xAB ^ (0x97 ^ 0xA3);
        n.lIlIlIlIIlIl[7] = 0x14 ^ 0xB;
        n.lIlIlIlIIlIl[8] = 0xF4 ^ 0x86 ^ (0x77 ^ 0xA);
    }

    public M aN() {
        return this.bz;
    }

    static {
        n.llIlllIlllIlII();
    }

    public boolean a(WorldPoint worldPoint) {
        return this.br.contains(worldPoint);
    }

    /*
     * WARNING - void declaration
     */
    private static WorldPoint a(char c2, WorldPoint worldPoint) {
        WorldPoint worldPoint2 = worldPoint;
        switch (c2) {
            case 'E': {
                void var5;
                return var5.dx(lIlIlIlIIlIl[7]).dy(lIlIlIlIIlIl[8]);
            }
            case 'W': {
                void var5;
                return var5.dx(lIlIlIlIIlIl[4]).dy(lIlIlIlIIlIl[8]);
            }
            case 'S': {
                void var5;
                return var5.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[4]);
            }
            case 'N': {
                void var5;
                return var5.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[7]);
            }
        }
        return new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
    }

    public N aM() {
        return this.bw;
    }

    private static boolean llIlllIlllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public boolean a(Locatable locatable) {
        return this.br.contains(locatable);
    }

    public n(N n2, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, char c2, char c3) {
        this.bw = n2;
        this.bq = worldPoint;
        this.bs = worldPoint2;
        this.bt = worldPoint3;
        this.br = new WorldArea(worldPoint, lIlIlIlIIlIl[0], lIlIlIlIIlIl[0]);
        this.bz = M.RAIDS_EMPTY;
        this.bx = S.a(c2, c3);
        this.bu = c2;
        this.bv = c3;
    }

    private static boolean llIlllIlllIlll(int n2, int n3) {
        return n2 != n3;
    }

    /*
     * WARNING - void declaration
     */
    private static WorldPoint b(char c2, WorldPoint worldPoint) {
        WorldPoint worldPoint2 = worldPoint;
        switch (c2) {
            case 'E': {
                void var10;
                return var10.dx(lIlIlIlIIlIl[4]).dy(lIlIlIlIIlIl[8]);
            }
            case 'W': {
                void var10;
                return var10.dx(lIlIlIlIIlIl[7]).dy(lIlIlIlIIlIl[8]);
            }
            case 'S': {
                void var10;
                return var10.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[7]);
            }
            case 'N': {
                void var10;
                return var10.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[4]);
            }
        }
        return new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
    }

    public void a(M m2) {
        this.bz = m2;
    }

    private static boolean llIlllIlllIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static List<n> c(a var7) {
        void var1_1;
        ArrayList<n> var6 = new ArrayList<n>();
        ArrayList<WorldPoint> var1 = new ArrayList<WorldPoint>();
        WorldPoint var14 = var7.k();
        String var15 = var7.m();
        var1.add(var14);
        0;
        int lllllllllllllllIllIlIIIIIllIlllI22 = lIlIlIlIIlIl[1];
        while (n.llIlllIlllIlIl(lllllllllllllllIllIlIIIIIllIlllI22, var15.length())) {
            char var2 = var15.charAt(lllllllllllllllIllIlIIIIIllIlllI22);
            switch (var2) {
                case 'E': {
                    WorldPoint var9 = (WorldPoint)var1.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var1.add(var9.dx(lIlIlIlIIlIl[0]));
                    0;
                    0;
                    if (null == null) break;
                    return null;
                }
                case 'W': {
                    WorldPoint var9 = (WorldPoint)var1.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var1.add(var9.dx(lIlIlIlIIlIl[2]));
                    0;
                    0;
                    if (2 > 0) break;
                    return null;
                }
                case 'S': {
                    WorldPoint var9 = (WorldPoint)var1.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var1.add(var9.dy(lIlIlIlIIlIl[2]));
                    0;
                    0;
                    if ((0x89 ^ 0x8C) > 0) break;
                    return null;
                }
                case 'N': {
                    WorldPoint var9 = (WorldPoint)var1.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var1.add(var9.dy(lIlIlIlIIlIl[0]));
                    0;
                    0;
                    if (3 > ((0x86 ^ 0xAE) & ~(0x41 ^ 0x69))) break;
                    return null;
                }
                case '#': {
                    WorldPoint var9 = (WorldPoint)var1.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    var1.add(var9.dz(lIlIlIlIIlIl[3]));
                    0;
                    0;
                    if ((0x66 ^ 0x62) >= ((0xB8 ^ 0x95) & ~(0x70 ^ 0x5D))) break;
                    return null;
                }
            }
            ++lllllllllllllllIllIlIIIIIllIlllI22;
            0;
            if (((0x25 ^ 0x46) & ~(0xC ^ 0x6F)) <= 0) continue;
            return null;
        }
        ArrayList<WorldPoint> lllllllllllllllIllIlIIIIIllIlllI22 = new ArrayList<WorldPoint>();
        ArrayList<WorldPoint> var2 = new ArrayList<WorldPoint>();
        int var3 = lIlIlIlIIlIl[4];
        while (n.llIlllIlllIlIl(var3, var15.length())) {
            WorldPoint var4 = new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
            char var12 = lIlIlIlIIlIl[5];
            if (n.llIlllIlllIlIl(var3 + lIlIlIlIIlIl[1], var15.length())) {
                var12 = var15.charAt(var3 + lIlIlIlIIlIl[1]);
                var4 = n.a(var12, (WorldPoint)var1.get(var3));
            }
            var2.add(var4);
            0;
            WorldPoint var11 = new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
            char var13 = lIlIlIlIIlIl[5];
            if (n.llIlllIlllIllI(var3)) {
                var13 = var15.charAt(var3);
                var11 = n.b(var13, (WorldPoint)var1.get(var3));
            }
            lllllllllllllllIllIlIIIIIllIlllI22.add(var11);
            0;
            n var8 = new n(var7.e().get(var3), (WorldPoint)var1.get(var3), (WorldPoint)lllllllllllllllIllIlIIIIIllIlllI22.get(var3), (WorldPoint)var2.get(var3), var13, var12);
            if (n.llIlllIlllIlll(var15.charAt(var3), lIlIlIlIIlIl[6])) {
                var8.bx = S.a(var13, var12);
            }
            var6.add(var8);
            0;
            ++var3;
            0;
            if (2 > ((0x1C ^ 0x2D) & ~(0xBA ^ 0x8B))) continue;
            return null;
        }
        return var1_1;
    }
}

