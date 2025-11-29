package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import net.runelite.api.coords.WorldPoint;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aH  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aH.class */
public class aH {
    private /* synthetic */ int ae;
    private static /* synthetic */ int[] lIlIlIII;
    private /* synthetic */ WorldPoint eo;

    public String toString() {
        return "LootTarget(location=" + cd() + ", id=" + P() + ")";
    }

    private static boolean lIIlIlllIl(Object obj) {
        return obj != null;
    }

    public int P() {
        return this.ae;
    }

    private static void lIIlIllIII() {
        lIlIlIII = new int[4];
        lIlIlIII[0] = " ".length();
        lIlIlIII[1] = (88 ^ 116) & ((185 ^ 149) ^ (-1));
        lIlIlIII[2] = 11 ^ 48;
        lIlIlIII[3] = 21 ^ 62;
    }

    private static boolean lIIlIllIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIllIlI(int i2) {
        return i2 == 0;
    }

    public void i(WorldPoint worldPoint) {
        this.eo = worldPoint;
    }

    public void f(int i2) {
        this.ae = i2;
    }

    public WorldPoint cd() {
        return this.eo;
    }

    public int hashCode() {
        int hashCode;
        int i2 = lIlIlIII[2];
        int P = (lIlIlIII[0] * lIlIlIII[2]) + P();
        WorldPoint cd = cd();
        int i3 = P * lIlIlIII[2];
        if (lIIlIlllII(cd)) {
            hashCode = lIlIlIII[3];
            "".length();
            if ((-" ".length()) > (63 ^ 59)) {
                return (248 ^ 173) & ((71 ^ 18) ^ (-1));
            }
        } else {
            hashCode = cd.hashCode();
        }
        return i3 + hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (lIIlIllIlI(r0.equals(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIlIllIIl(obj, this)) {
            return lIlIlIII[0];
        }
        if (lIIlIllIlI(obj instanceof aH ? 1 : 0)) {
            return lIlIlIII[1];
        }
        aH aHVar = (aH) obj;
        if (!lIIlIllIlI(aHVar.a(this) ? 1 : 0) && !lIIlIllIll(P(), aHVar.P())) {
            WorldPoint cd = cd();
            WorldPoint cd2 = aHVar.cd();
            if (lIIlIlllII(cd)) {
                if (lIIlIlllIl(cd2)) {
                    "".length();
                    if ("  ".length() <= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return lIlIlIII[1];
                }
                return lIlIlIII[0];
            }
        }
        return lIlIlIII[1];
    }

    private static boolean lIIlIllIll(int i2, int i3) {
        return i2 != i3;
    }

    protected boolean a(Object obj) {
        return obj instanceof aH;
    }

    private static boolean lIIlIlllII(Object obj) {
        return obj == null;
    }

    static {
        lIIlIllIII();
    }
}
