package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/n.class */
public class C0039n {
    public /* synthetic */ N bw;
    public /* synthetic */ WorldArea br;
    public /* synthetic */ J by;
    public /* synthetic */ char bv;
    public /* synthetic */ WorldPoint bq;
    public /* synthetic */ char bu;
    private static /* synthetic */ int[] lIlIlIlIIlIl;
    public /* synthetic */ S bx;
    public /* synthetic */ M bz = M.RAIDS_EMPTY;
    public /* synthetic */ WorldPoint bt;
    public /* synthetic */ WorldPoint bs;

    private static void llIlllIlllIlII() {
        lIlIlIlIIlIl = new int[9];
        lIlIlIlIIlIl[0] = (12 ^ 64) ^ (55 ^ 91);
        lIlIlIlIIlIl[1] = " ".length();
        lIlIlIlIIlIl[2] = -((52 ^ 101) ^ (203 ^ 186));
        lIlIlIlIIlIl[3] = -" ".length();
        lIlIlIlIIlIl[4] = ((((65 + 20) - (-14)) + 34) ^ (((35 + 30) - (-97)) + 26)) & (((72 ^ 64) ^ (88 ^ 105)) ^ (-" ".length()));
        lIlIlIlIIlIl[5] = (((32 + 132) - 146) + 132) ^ (((93 + 151) - 109) + 52);
        lIlIlIlIIlIl[6] = (188 ^ 171) ^ (151 ^ 163);
        lIlIlIlIIlIl[7] = 20 ^ 11;
        lIlIlIlIIlIl[8] = (244 ^ 134) ^ (119 ^ 10);
    }

    public M aN() {
        return this.bz;
    }

    static {
        llIlllIlllIlII();
    }

    public boolean a(WorldPoint worldPoint) {
        return this.br.contains(worldPoint);
    }

    private static WorldPoint a(char c2, WorldPoint worldPoint) {
        switch (c2) {
            case 'E':
                return worldPoint.dx(lIlIlIlIIlIl[7]).dy(lIlIlIlIIlIl[8]);
            case 'N':
                return worldPoint.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[7]);
            case 'S':
                return worldPoint.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[4]);
            case 'W':
                return worldPoint.dx(lIlIlIlIIlIl[4]).dy(lIlIlIlIIlIl[8]);
            default:
                return new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
        }
    }

    public N aM() {
        return this.bw;
    }

    private static boolean llIlllIlllIlIl(int i, int i2) {
        return i < i2;
    }

    public boolean a(Locatable locatable) {
        return this.br.contains(locatable);
    }

    public C0039n(N n, WorldPoint worldPoint, WorldPoint worldPoint2, WorldPoint worldPoint3, char c2, char c3) {
        this.bw = n;
        this.bq = worldPoint;
        this.bs = worldPoint2;
        this.bt = worldPoint3;
        this.br = new WorldArea(worldPoint, lIlIlIlIIlIl[0], lIlIlIlIIlIl[0]);
        this.bx = S.a(c2, c3);
        this.bu = c2;
        this.bv = c3;
    }

    private static boolean llIlllIlllIlll(int i, int i2) {
        return i != i2;
    }

    private static WorldPoint b(char c2, WorldPoint worldPoint) {
        switch (c2) {
            case 'E':
                return worldPoint.dx(lIlIlIlIIlIl[4]).dy(lIlIlIlIIlIl[8]);
            case 'N':
                return worldPoint.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[4]);
            case 'S':
                return worldPoint.dx(lIlIlIlIIlIl[8]).dy(lIlIlIlIIlIl[7]);
            case 'W':
                return worldPoint.dx(lIlIlIlIIlIl[7]).dy(lIlIlIlIIlIl[8]);
            default:
                return new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
        }
    }

    public void a(M m) {
        this.bz = m;
    }

    private static boolean llIlllIlllIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<C0039n> c(C0000a c0000a) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        WorldPoint k = c0000a.k();
        String m = c0000a.m();
        arrayList2.add(k);
        "".length();
        int i = lIlIlIlIIlIl[1];
        while (llIlllIlllIlIl(i, m.length())) {
            switch (m.charAt(i)) {
                case '#':
                    arrayList2.add(((WorldPoint) arrayList2.get(i - lIlIlIlIIlIl[1])).dz(lIlIlIlIIlIl[3]));
                    "".length();
                    "".length();
                    if ((102 ^ 98) < ((184 ^ 149) & ((112 ^ 93) ^ (-1)))) {
                        return null;
                    }
                    break;
                case 'E':
                    arrayList2.add(((WorldPoint) arrayList2.get(i - lIlIlIlIIlIl[1])).dx(lIlIlIlIIlIl[0]));
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                    break;
                case 'N':
                    arrayList2.add(((WorldPoint) arrayList2.get(i - lIlIlIlIIlIl[1])).dy(lIlIlIlIIlIl[0]));
                    "".length();
                    "".length();
                    if ("   ".length() <= ((134 ^ 174) & ((65 ^ 105) ^ (-1)))) {
                        return null;
                    }
                    break;
                case 'S':
                    arrayList2.add(((WorldPoint) arrayList2.get(i - lIlIlIlIIlIl[1])).dy(lIlIlIlIIlIl[2]));
                    "".length();
                    "".length();
                    if ((137 ^ 140) <= 0) {
                        return null;
                    }
                    break;
                case 'W':
                    arrayList2.add(((WorldPoint) arrayList2.get(i - lIlIlIlIIlIl[1])).dx(lIlIlIlIIlIl[2]));
                    "".length();
                    "".length();
                    if ("  ".length() <= 0) {
                        return null;
                    }
                    break;
            }
            i++;
            "".length();
            if (((37 ^ 70) & ((12 ^ 111) ^ (-1))) > 0) {
                return null;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int lllllllllllllllIllIlIIIIIllIllII = lIlIlIlIIlIl[4];
        while (llIlllIlllIlIl(lllllllllllllllIllIlIIIIIllIllII, m.length())) {
            WorldPoint worldPoint = new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
            char c2 = lIlIlIlIIlIl[5];
            if (llIlllIlllIlIl(lllllllllllllllIllIlIIIIIllIllII + lIlIlIlIIlIl[1], m.length())) {
                c2 = m.charAt(lllllllllllllllIllIlIIIIIllIllII + lIlIlIlIIlIl[1]);
                worldPoint = a(c2, (WorldPoint) arrayList2.get(lllllllllllllllIllIlIIIIIllIllII));
            }
            arrayList4.add(worldPoint);
            "".length();
            WorldPoint worldPoint2 = new WorldPoint(lIlIlIlIIlIl[4], lIlIlIlIIlIl[4], lIlIlIlIIlIl[4]);
            char c3 = lIlIlIlIIlIl[5];
            if (llIlllIlllIllI(lllllllllllllllIllIlIIIIIllIllII)) {
                c3 = m.charAt(lllllllllllllllIllIlIIIIIllIllII);
                worldPoint2 = b(c3, (WorldPoint) arrayList2.get(lllllllllllllllIllIlIIIIIllIllII));
            }
            arrayList3.add(worldPoint2);
            "".length();
            C0039n c0039n = new C0039n(c0000a.e().get(lllllllllllllllIllIlIIIIIllIllII), (WorldPoint) arrayList2.get(lllllllllllllllIllIlIIIIIllIllII), (WorldPoint) arrayList3.get(lllllllllllllllIllIlIIIIIllIllII), (WorldPoint) arrayList4.get(lllllllllllllllIllIlIIIIIllIllII), c3, c2);
            if (llIlllIlllIlll(m.charAt(lllllllllllllllIllIlIIIIIllIllII), lIlIlIlIIlIl[6])) {
                c0039n.bx = S.a(c3, c2);
            }
            arrayList.add(c0039n);
            "".length();
            lllllllllllllllIllIlIIIIIllIllII++;
            "".length();
            if ("  ".length() <= ((28 ^ 45) & ((186 ^ 139) ^ (-1)))) {
                return null;
            }
        }
        return arrayList;
    }
}
