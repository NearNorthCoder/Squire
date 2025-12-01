package p000.m.e.a.u.s.r.r.q.i.r.e.f;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.am  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/am.class */
public final class C0013am {
    private final /* synthetic */ EnumC0021au bx;
    private final /* synthetic */ int bA;
    private final /* synthetic */ int bB;
    private final /* synthetic */ EnumC0039n by;
    private static /* synthetic */ int[] lIllllIIIllI;
    private final /* synthetic */ long bz;

    static {
        lllIllIllIlllI();
    }

    public String toString() {
        String valueOf = String.valueOf(aY());
        String valueOf2 = String.valueOf(aZ());
        long ba = ba();
        int bb = bb();
        bc();
        return "PatchPrediction(produce=" + valueOf + ", cropState=" + valueOf2 + ", doneEstimate=" + ba + ", stage=" + valueOf + ", stages=" + bb + ")";
    }

    private static int lllIllIllIllll(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    public int bb() {
        return this.bA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
        if (lllIllIlllIIIl(r0.equals(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0142, code lost:
        if (lllIllIlllIIIl(r0.equals(r0) ? 1 : 0) != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lllIllIlllIIII(obj, this)) {
            return lIllllIIIllI[0];
        }
        if (lllIllIlllIIIl(obj instanceof C0013am ? 1 : 0)) {
            return lIllllIIIllI[1];
        }
        C0013am c0013am = (C0013am) obj;
        if (!lllIllIlllIIlI(lllIllIllIllll(ba(), c0013am.ba())) && !lllIllIlllIIll(bb(), c0013am.bb()) && !lllIllIlllIIll(bc(), c0013am.bc())) {
            EnumC0021au aY = aY();
            EnumC0021au aY2 = c0013am.aY();
            if (lllIllIlllIlII(aY)) {
                if (lllIllIlllIlIl(aY2)) {
                    "".length();
                    if ((true ^ true) & ((true ^ true) ^ true)) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return lIllllIIIllI[1];
                }
                EnumC0039n aZ = aZ();
                EnumC0039n aZ2 = c0013am.aZ();
                if (lllIllIlllIlII(aZ)) {
                    if (lllIllIlllIlIl(aZ2)) {
                        "".length();
                        if ((((((114 + 109) - 176) + 116) ^ (((10 + 53) - (-50)) + 55)) & (((152 ^ 190) ^ (90 ^ 119)) ^ (-" ".length()))) < 0) {
                            return ((((218 + 189) - 294) + 126) ^ (((139 + 159) - 259) + 148)) & (((30 ^ 23) ^ (52 ^ 105)) ^ (-" ".length()));
                        }
                        return lIllllIIIllI[1];
                    }
                    return lIllllIIIllI[0];
                }
            }
        }
        return lIllllIIIllI[1];
    }

    private static boolean lllIllIlllIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllIllIlllIIIl(int i) {
        return i == 0;
    }

    public long ba() {
        return this.bz;
    }

    private static boolean lllIllIlllIlII(Object obj) {
        return obj == null;
    }

    private static void lllIllIllIlllI() {
        lIllllIIIllI = new int[5];
        lIllllIIIllI[0] = " ".length();
        lIllllIIIllI[1] = ((96 ^ 2) ^ ((125 ^ 101) & ((147 ^ 139) ^ (-1)))) & (((103 ^ 35) ^ (3 ^ 37)) ^ (-" ".length()));
        lIllllIIIllI[2] = (89 ^ 93) ^ (58 ^ 5);
        lIllllIIIllI[3] = 153 ^ 185;
        lIllllIIIllI[4] = (24 ^ 65) ^ (247 ^ 133);
    }

    private static boolean lllIllIlllIIlI(int i) {
        return i != 0;
    }

    private static boolean lllIllIlllIlIl(Object obj) {
        return obj != null;
    }

    public EnumC0021au aY() {
        return this.bx;
    }

    public C0013am(EnumC0021au enumC0021au, EnumC0039n enumC0039n, long j, int i, int i2) {
        this.bx = enumC0021au;
        this.by = enumC0039n;
        this.bz = j;
        this.bA = i;
        this.bB = i2;
    }

    private static boolean lllIllIlllIIll(int i, int i2) {
        return i != i2;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = lIllllIIIllI[2];
        int i2 = lIllllIIIllI[0];
        long ba = ba();
        int bb = (((((i2 * lIllllIIIllI[2]) + ((int) ((ba >>> lIllllIIIllI[3]) ^ ba))) * lIllllIIIllI[2]) + bb()) * lIllllIIIllI[2]) + bc();
        EnumC0021au aY = aY();
        int i3 = bb * lIllllIIIllI[2];
        if (lllIllIlllIlII(aY)) {
            hashCode = lIllllIIIllI[4];
            "".length();
            if ("   ".length() >= (21 ^ 17)) {
                return (97 ^ 64) & ((3 ^ 34) ^ (-1));
            }
        } else {
            hashCode = aY.hashCode();
        }
        int lllllllllllllllIlIllIIlllIllllIl = i3 + hashCode;
        EnumC0039n aZ = aZ();
        int i4 = lllllllllllllllIlIllIIlllIllllIl * lIllllIIIllI[2];
        if (lllIllIlllIlII(aZ)) {
            hashCode2 = lIllllIIIllI[4];
            "".length();
            if ((-"   ".length()) > 0) {
                return ((((243 + 18) - 43) + 27) ^ (((31 + 101) - 45) + 87)) & (((110 ^ 63) ^ (119 ^ 125)) ^ (-" ".length()));
            }
        } else {
            hashCode2 = aZ.hashCode();
        }
        return i4 + hashCode2;
    }

    public EnumC0039n aZ() {
        return this.by;
    }

    public int bc() {
        return this.bB;
    }
}
