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
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.M;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.S;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

public class n {
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
        n.lIlIlIlIIlIl[1] = " ".length();
        n.lIlIlIlIIlIl[2] = -(0x34 ^ 0x65 ^ (0xCB ^ 0xBA));
        n.lIlIlIlIIlIl[3] = -" ".length();
        n.lIlIlIlIIlIl[4] = (65 + 20 - -14 + 34 ^ 35 + 30 - -97 + 26) & (0x48 ^ 0x40 ^ (0x58 ^ 0x69) ^ -" ".length());
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
                void lllllllllllllllIllIlIIIIIllIIIIl;
                return lllllllllllllllIllIlIIIIIllIIIIl.dx(lIlIlIlIIlIl[7]).dy(lIlIlIlIIlIl[8]);
            }
            case 'W': {
                void lllllllllllllllIllIlIIIIIllIIIIl;
                return lllllllllllllllIllIlIIIIIllIIIIl.dx(lIlIlIlIIlIl[4]).dy(lIlIlIlIIlIl[8]);
            }
            case 'S': {
                void lllllllllllllllIllIlIIIIIllIIIIl;
                return lllllllllllllllIllIlIIIIIllIIIIl.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[4]);
            }
            case 'N': {
                void lllllllllllllllIllIlIIIIIllIIIIl;
                return lllllllllllllllIllIlIIIIIllIIIIl.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[7]);
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
                void lllllllllllllllIllIlIIIIIlIllIll;
                return lllllllllllllllIllIlIIIIIlIllIll.dx(lIlIlIlIIlIl[4]).dy(lIlIlIlIIlIl[8]);
            }
            case 'W': {
                void lllllllllllllllIllIlIIIIIlIllIll;
                return lllllllllllllllIllIlIIIIIlIllIll.dx(lIlIlIlIIlIl[7]).dy(lIlIlIlIIlIl[8]);
            }
            case 'S': {
                void lllllllllllllllIllIlIIIIIlIllIll;
                return lllllllllllllllIllIlIIIIIlIllIll.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[7]);
            }
            case 'N': {
                void lllllllllllllllIllIlIIIIIlIllIll;
                return lllllllllllllllIllIlIIIIIlIllIll.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[4]);
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
    public static List<n> c(a lllllllllllllllIllIlIIIIIlllIlII) {
        void var1_1;
        ArrayList<n> lllllllllllllllIllIlIIIIIlllIIll = new ArrayList<n>();
        ArrayList<WorldPoint> lllllllllllllllIllIlIIIIIlllIIlI = new ArrayList<WorldPoint>();
        WorldPoint lllllllllllllllIllIlIIIIIlllIIIl = lllllllllllllllIllIlIIIIIlllIlII.k();
        String lllllllllllllllIllIlIIIIIlllIIII = lllllllllllllllIllIlIIIIIlllIlII.m();
        lllllllllllllllIllIlIIIIIlllIIlI.add(lllllllllllllllIllIlIIIIIlllIIIl);
        "".length();
        int lllllllllllllllIllIlIIIIIllIlllI22 = lIlIlIlIIlIl[1];
        while (n.llIlllIlllIlIl(lllllllllllllllIllIlIIIIIllIlllI22, lllllllllllllllIllIlIIIIIlllIIII.length())) {
            char lllllllllllllllIllIlIIIIIllIllIl = lllllllllllllllIllIlIIIIIlllIIII.charAt(lllllllllllllllIllIlIIIIIllIlllI22);
            switch (lllllllllllllllIllIlIIIIIllIllIl) {
                case 'E': {
                    WorldPoint lllllllllllllllIllIlIIIIIllIllll = (WorldPoint)lllllllllllllllIllIlIIIIIlllIIlI.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    lllllllllllllllIllIlIIIIIlllIIlI.add(lllllllllllllllIllIlIIIIIllIllll.dx(lIlIlIlIIlIl[0]));
                    "".length();
                    "".length();
                    if (null == null) break;
                    return null;
                }
                case 'W': {
                    WorldPoint lllllllllllllllIllIlIIIIIllIllll = (WorldPoint)lllllllllllllllIllIlIIIIIlllIIlI.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    lllllllllllllllIllIlIIIIIlllIIlI.add(lllllllllllllllIllIlIIIIIllIllll.dx(lIlIlIlIIlIl[2]));
                    "".length();
                    "".length();
                    if ("  ".length() > 0) break;
                    return null;
                }
                case 'S': {
                    WorldPoint lllllllllllllllIllIlIIIIIllIllll = (WorldPoint)lllllllllllllllIllIlIIIIIlllIIlI.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    lllllllllllllllIllIlIIIIIlllIIlI.add(lllllllllllllllIllIlIIIIIllIllll.dy(lIlIlIlIIlIl[2]));
                    "".length();
                    "".length();
                    if ((0x89 ^ 0x8C) > 0) break;
                    return null;
                }
                case 'N': {
                    WorldPoint lllllllllllllllIllIlIIIIIllIllll = (WorldPoint)lllllllllllllllIllIlIIIIIlllIIlI.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    lllllllllllllllIllIlIIIIIlllIIlI.add(lllllllllllllllIllIlIIIIIllIllll.dy(lIlIlIlIIlIl[0]));
                    "".length();
                    "".length();
                    if ("   ".length() > ((0x86 ^ 0xAE) & ~(0x41 ^ 0x69))) break;
                    return null;
                }
                case '#': {
                    WorldPoint lllllllllllllllIllIlIIIIIllIllll = (WorldPoint)lllllllllllllllIllIlIIIIIlllIIlI.get(lllllllllllllllIllIlIIIIIllIlllI22 - lIlIlIlIIlIl[1]);
                    lllllllllllllllIllIlIIIIIlllIIlI.add(lllllllllllllllIllIlIIIIIllIllll.dz(lIlIlIlIIlIl[3]));
                    "".length();
                    "".length();
                    if ((0x66 ^ 0x62) >= ((0xB8 ^ 0x95) & ~(0x70 ^ 0x5D))) break;
                    return null;
                }
            }
            ++lllllllllllllllIllIlIIIIIllIlllI22;
            "".length();
            if (((0x25 ^ 0x46) & ~(0xC ^ 0x6F)) <= 0) continue;
            return null;
        }
        ArrayList<WorldPoint> lllllllllllllllIllIlIIIIIllIlllI22 = new ArrayList<WorldPoint>();
        ArrayList<WorldPoint> lllllllllllllllIllIlIIIIIllIllIl = new ArrayList<WorldPoint>();
        int lllllllllllllllIllIlIIIIIllIllII = lIlIlIlIIlIl[4];
        while (n.llIlllIlllIlIl(lllllllllllllllIllIlIIIIIllIllII, lllllllllllllllIllIlIIIIIlllIIII.length())) {
            WorldPoint lllllllllllllllIllIlIIIIIllIlIll = new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
            char lllllllllllllllIllIlIIIIIllIlIlI = lIlIlIlIIlIl[5];
            if (n.llIlllIlllIlIl(lllllllllllllllIllIlIIIIIllIllII + lIlIlIlIIlIl[1], lllllllllllllllIllIlIIIIIlllIIII.length())) {
                lllllllllllllllIllIlIIIIIllIlIlI = lllllllllllllllIllIlIIIIIlllIIII.charAt(lllllllllllllllIllIlIIIIIllIllII + lIlIlIlIIlIl[1]);
                lllllllllllllllIllIlIIIIIllIlIll = n.a(lllllllllllllllIllIlIIIIIllIlIlI, (WorldPoint)lllllllllllllllIllIlIIIIIlllIIlI.get(lllllllllllllllIllIlIIIIIllIllII));
            }
            lllllllllllllllIllIlIIIIIllIllIl.add(lllllllllllllllIllIlIIIIIllIlIll);
            "".length();
            WorldPoint lllllllllllllllIllIlIIIIIllIlIIl = new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
            char lllllllllllllllIllIlIIIIIllIlIII = lIlIlIlIIlIl[5];
            if (n.llIlllIlllIllI(lllllllllllllllIllIlIIIIIllIllII)) {
                lllllllllllllllIllIlIIIIIllIlIII = lllllllllllllllIllIlIIIIIlllIIII.charAt(lllllllllllllllIllIlIIIIIllIllII);
                lllllllllllllllIllIlIIIIIllIlIIl = n.b(lllllllllllllllIllIlIIIIIllIlIII, (WorldPoint)lllllllllllllllIllIlIIIIIlllIIlI.get(lllllllllllllllIllIlIIIIIllIllII));
            }
            lllllllllllllllIllIlIIIIIllIlllI22.add(lllllllllllllllIllIlIIIIIllIlIIl);
            "".length();
            n lllllllllllllllIllIlIIIIIllIIlll = new n(lllllllllllllllIllIlIIIIIlllIlII.e().get(lllllllllllllllIllIlIIIIIllIllII), (WorldPoint)lllllllllllllllIllIlIIIIIlllIIlI.get(lllllllllllllllIllIlIIIIIllIllII), (WorldPoint)lllllllllllllllIllIlIIIIIllIlllI22.get(lllllllllllllllIllIlIIIIIllIllII), (WorldPoint)lllllllllllllllIllIlIIIIIllIllIl.get(lllllllllllllllIllIlIIIIIllIllII), lllllllllllllllIllIlIIIIIllIlIII, lllllllllllllllIllIlIIIIIllIlIlI);
            if (n.llIlllIlllIlll(lllllllllllllllIllIlIIIIIlllIIII.charAt(lllllllllllllllIllIlIIIIIllIllII), lIlIlIlIIlIl[6])) {
                lllllllllllllllIllIlIIIIIllIIlll.bx = S.a(lllllllllllllllIllIlIIIIIllIlIII, lllllllllllllllIllIlIIIIIllIlIlI);
            }
            lllllllllllllllIllIlIIIIIlllIIll.add(lllllllllllllllIllIlIIIIIllIIlll);
            "".length();
            ++lllllllllllllllIllIlIIIIIllIllII;
            "".length();
            if ("  ".length() > ((0x1C ^ 0x2D) & ~(0xBA ^ 0x8B))) continue;
            return null;
        }
        return var1_1;
    }
}

