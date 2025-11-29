package p000.m.e.a.u.s.r.r.q.i.r.e.f;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.D  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/D.class */
public final class D {
    private static /* synthetic */ int[] llIIIlIIIIlI;
    private final /* synthetic */ int bk;
    private final /* synthetic */ E bj;
    private final /* synthetic */ long bl;

    public String toString() {
        return "BirdHouseData(space=" + String.valueOf(aw()) + ", varp=" + ax() + ", timestamp=" + ay() + ")";
    }

    private static boolean llllIIllllIIII(int i) {
        return i == 0;
    }

    private static boolean llllIIlllIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIIllllIIll(Object obj) {
        return obj == null;
    }

    public E aw() {
        return this.bj;
    }

    public int ax() {
        return this.bk;
    }

    public int hashCode() {
        int hashCode;
        int i = llIIIlIIIIlI[2];
        int ax = (llIIIlIIIIlI[0] * llIIIlIIIIlI[2]) + ax();
        long ay = ay();
        int i2 = (ax * llIIIlIIIIlI[2]) + ((int) ((ay >>> llIIIlIIIIlI[3]) ^ ay));
        E aw = aw();
        int i3 = i2 * llIIIlIIIIlI[2];
        if (llllIIllllIIll(aw)) {
            hashCode = llIIIlIIIIlI[4];
            "".length();
            if ((-((58 ^ 63) ^ " ".length())) > 0) {
                return "   ".length() & ("   ".length() ^ (-" ".length()));
            }
        } else {
            hashCode = aw.hashCode();
        }
        return i3 + hashCode;
    }

    private static boolean llllIIllllIlII(Object obj) {
        return obj != null;
    }

    private static int llllIIlllIlllI(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    public D(E e, int i, long j) {
        this.bj = e;
        this.bk = i;
        this.bl = j;
    }

    static {
        llllIIlllIllIl();
    }

    private static boolean llllIIllllIIlI(int i) {
        return i != 0;
    }

    private static void llllIIlllIllIl() {
        llIIIlIIIIlI = new int[5];
        llIIIlIIIIlI[0] = " ".length();
        llIIIlIIIIlI[1] = (61 ^ 120) & ((111 ^ 42) ^ (-1));
        llIIIlIIIIlI[2] = 99 ^ 88;
        llIIIlIIIIlI[3] = (((39 + 51) - 13) + 56) ^ (((37 + 37) - 2) + 93);
        llIIIlIIIIlI[4] = 85 ^ 126;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
        if (llllIIllllIIII(r0.equals(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (llllIIlllIllll(obj, this)) {
            return llIIIlIIIIlI[0];
        }
        if (llllIIllllIIII(obj instanceof D ? 1 : 0)) {
            return llIIIlIIIIlI[1];
        }
        D d = (D) obj;
        if (!llllIIllllIIIl(ax(), d.ax()) && !llllIIllllIIlI(llllIIlllIlllI(ay(), d.ay()))) {
            E aw = aw();
            E aw2 = d.aw();
            if (llllIIllllIIll(aw)) {
                if (llllIIllllIlII(aw2)) {
                    "".length();
                    if (" ".length() <= (-" ".length())) {
                        return ((96 ^ 61) ^ (244 ^ 180)) & (((((104 + 93) - 76) + 101) ^ (((72 + 122) - 133) + 134)) ^ (-" ".length()));
                    }
                    return llIIIlIIIIlI[1];
                }
                return llIIIlIIIIlI[0];
            }
        }
        return llIIIlIIIIlI[1];
    }

    public long ay() {
        return this.bl;
    }

    private static boolean llllIIllllIIIl(int i, int i2) {
        return i != i2;
    }
}
