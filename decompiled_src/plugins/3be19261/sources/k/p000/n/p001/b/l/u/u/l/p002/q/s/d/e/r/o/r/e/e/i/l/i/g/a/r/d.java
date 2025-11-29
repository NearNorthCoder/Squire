package k.p000.n.p001.b.l.u.u.l.p002.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r;

import net.runelite.api.coords.WorldPoint;
/* renamed from: k.-.n.-.b.l.u.u.l.-.q.s.d.e.r.o.r.e.e.i.l.i.g.a.r.d  reason: invalid package */
/* loaded from: 3be19261-31a6-42fb-a6f1-3e9f39e6a450.jar:k/-/n/-/b/l/u/u/l/-/q/s/d/e/r/o/r/e/e/i/l/i/g/a/r/d.class */
public class d {
    private static /* synthetic */ int[] lIIllllIlIII;
    private /* synthetic */ WorldPoint location;
    private /* synthetic */ int o;

    private static boolean llIlIIIlllllIl(Object obj) {
        return obj != null;
    }

    private static boolean llIlIIIllllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llIlIIIllllIll(int i, int i2) {
        return i != i2;
    }

    public void a(WorldPoint worldPoint) {
        this.location = worldPoint;
    }

    public int hashCode() {
        int hashCode;
        int i = lIIllllIlIII[2];
        int r = (lIIllllIlIII[0] * lIIllllIlIII[2]) + r();
        WorldPoint o = o();
        int i2 = r * lIIllllIlIII[2];
        if (llIlIIIlllllII(o)) {
            hashCode = lIIllllIlIII[3];
            "".length();
            if ((-((((130 + 158) - 204) + 80) ^ (((62 + 132) - 100) + 66))) > 0) {
                return ((((15 + 158) - (-32)) + 29) ^ (((105 + 81) - 156) + 151)) & (((((167 + 133) - 243) + 191) ^ (((46 + 122) - 147) + 146)) ^ (-" ".length()));
            }
        } else {
            hashCode = o.hashCode();
        }
        return i2 + hashCode;
    }

    static {
        llIlIIIllllIII();
    }

    protected boolean a(Object obj) {
        return obj instanceof d;
    }

    private static boolean llIlIIIllllIlI(int i) {
        return i == 0;
    }

    private static boolean llIlIIIlllllII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
        if (llIlIIIllllIlI(r0.equals(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (llIlIIIllllIIl(obj, this)) {
            return lIIllllIlIII[0];
        }
        if (llIlIIIllllIlI(obj instanceof d ? 1 : 0)) {
            return lIIllllIlIII[1];
        }
        d dVar = (d) obj;
        if (!llIlIIIllllIlI(dVar.a(this) ? 1 : 0) && !llIlIIIllllIll(r(), dVar.r())) {
            WorldPoint o = o();
            WorldPoint o2 = dVar.o();
            if (llIlIIIlllllII(o)) {
                if (llIlIIIlllllIl(o2)) {
                    "".length();
                    if ((-"   ".length()) >= 0) {
                        return ((((177 + 30) - 96) + 131) ^ (((154 + 114) - 150) + 81)) & (((105 ^ 89) ^ (110 ^ 107)) ^ (-" ".length()));
                    }
                    return lIIllllIlIII[1];
                }
                return lIIllllIlIII[0];
            }
        }
        return lIIllllIlIII[1];
    }

    public WorldPoint o() {
        return this.location;
    }

    public void f(int i) {
        this.o = i;
    }

    public String toString() {
        return "LootTarget(location=" + String.valueOf(o()) + ", id=" + r() + ")";
    }

    public int r() {
        return this.o;
    }

    private static void llIlIIIllllIII() {
        lIIllllIlIII = new int[4];
        lIIllllIlIII[0] = " ".length();
        lIIllllIlIII[1] = ((((163 + 97) - 222) + 129) ^ (((100 + 145) - 67) + 21)) & (((91 ^ 5) ^ (40 ^ 22)) ^ (-" ".length()));
        lIIllllIlIII[2] = 248 ^ 195;
        lIIllllIlIII[3] = (((170 + 65) - 88) + 34) ^ (((51 + 105) - 19) + 21);
    }
}
