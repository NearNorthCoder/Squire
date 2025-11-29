package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/g.class */
public final class C0032g {
    private final /* synthetic */ C0000a at;
    private static /* synthetic */ int[] lIlIlIlIIIll;
    private final /* synthetic */ boolean au;

    public String toString() {
        return "RaidScouted(raid=" + String.valueOf(C()) + ", firstScout=" + S() + ")";
    }

    private static boolean llIlllIlllIIII(int i, int i2) {
        return i != i2;
    }

    private static boolean llIlllIlllIIlI(Object obj) {
        return obj != null;
    }

    private static void llIlllIllIllIl() {
        lIlIlIlIIIll = new int[6];
        lIlIlIlIIIll[0] = " ".length();
        lIlIlIlIIIll[1] = (11 ^ 13) & ((104 ^ 110) ^ (-1));
        lIlIlIlIIIll[2] = 61 ^ 6;
        lIlIlIlIIIll[3] = (225 ^ 133) ^ (39 ^ 12);
        lIlIlIlIIIll[4] = (146 ^ 172) ^ (195 ^ 156);
        lIlIlIlIIIll[5] = (((86 + 118) - 127) + 94) ^ (((73 + 32) - 2) + 25);
    }

    public C0000a C() {
        return this.at;
    }

    private static boolean llIlllIllIllll(int i) {
        return i == 0;
    }

    public boolean S() {
        return this.au;
    }

    private static boolean llIlllIlllIIll(int i) {
        return i != 0;
    }

    private static boolean llIlllIllIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int i2 = lIlIlIlIIIll[2];
        int i3 = lIlIlIlIIIll[0] * lIlIlIlIIIll[2];
        if (llIlllIlllIIll(S() ? 1 : 0)) {
            i = lIlIlIlIIIll[3];
            "".length();
            if ("  ".length() == 0) {
                return (125 ^ 86) & ((48 ^ 27) ^ (-1));
            }
        } else {
            i = lIlIlIlIIIll[4];
        }
        int i4 = i3 + i;
        C0000a C = C();
        int i5 = i4 * lIlIlIlIIIll[2];
        if (llIlllIlllIIIl(C)) {
            hashCode = lIlIlIlIIIll[5];
            "".length();
            if ((-"   ".length()) >= 0) {
                return (128 ^ 174) & ((23 ^ 57) ^ (-1));
            }
        } else {
            hashCode = C.hashCode();
        }
        return i5 + hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
        if (llIlllIllIllll(r0.equals(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (llIlllIllIlllI(obj, this)) {
            return lIlIlIlIIIll[0];
        }
        if (llIlllIllIllll(obj instanceof C0032g ? 1 : 0)) {
            return lIlIlIlIIIll[1];
        }
        C0032g c0032g = (C0032g) obj;
        if (llIlllIlllIIII(S() ? 1 : 0, c0032g.S() ? 1 : 0)) {
            return lIlIlIlIIIll[1];
        }
        C0000a C = C();
        C0000a C2 = c0032g.C();
        if (llIlllIlllIIIl(C)) {
            if (llIlllIlllIIlI(C2)) {
                "".length();
                if (((((122 + 0) - 37) + 103) ^ (((161 + 80) - 193) + 137)) == 0) {
                    return ((21 ^ 7) ^ (254 ^ 194)) & (((9 ^ 93) ^ (190 ^ 196)) ^ (-" ".length()));
                }
                return lIlIlIlIIIll[1];
            }
            return lIlIlIlIIIll[0];
        }
    }

    static {
        llIlllIllIllIl();
    }

    public C0032g(C0000a c0000a, boolean z) {
        this.at = c0000a;
        this.au = z;
    }

    private static boolean llIlllIlllIIIl(Object obj) {
        return obj == null;
    }
}
