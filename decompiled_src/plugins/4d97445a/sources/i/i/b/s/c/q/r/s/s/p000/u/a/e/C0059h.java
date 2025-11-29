package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.time.Instant;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.h  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/h.class */
public class C0059h {
    private static /* synthetic */ int[] lIlIllll;
    private /* synthetic */ int ag;
    private /* synthetic */ String ac;
    private /* synthetic */ Instant ad;
    private /* synthetic */ int af;
    private /* synthetic */ int ae;

    public void a(Instant instant) {
        this.ad = instant;
    }

    private static boolean lIIlllIlIl(int i2, int i3) {
        return i2 != i3;
    }

    public String N() {
        return this.ac;
    }

    static {
        lIIlllIIlI();
    }

    private static boolean lIIlllIlll(Object obj) {
        return obj != null;
    }

    public int Q() {
        return this.af;
    }

    private static boolean lIIlllIlII(int i2) {
        return i2 == 0;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i2 = lIlIllll[2];
        int P = (((((lIlIllll[0] * lIlIllll[2]) + P()) * lIlIllll[2]) + Q()) * lIlIllll[2]) + R();
        String N = N();
        int i3 = P * lIlIllll[2];
        if (lIIlllIllI(N)) {
            hashCode = lIlIllll[3];
            "".length();
            if (" ".length() >= ((((8 + 82) - (-16)) + 35) ^ (((41 + 84) - 75) + 87))) {
                return ((135 ^ 172) ^ (55 ^ 125)) & (((82 ^ 71) ^ (113 ^ 5)) ^ (-" ".length()));
            }
        } else {
            hashCode = N.hashCode();
        }
        int i4 = i3 + hashCode;
        Instant O = O();
        int i5 = i4 * lIlIllll[2];
        if (lIIlllIllI(O)) {
            hashCode2 = lIlIllll[3];
            "".length();
            if ((-" ".length()) > 0) {
                return (88 ^ 100) & ((83 ^ 111) ^ (-1));
            }
        } else {
            hashCode2 = O.hashCode();
        }
        return i5 + hashCode2;
    }

    public void f(int i2) {
        this.ae = i2;
    }

    private static boolean lIIlllIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    protected boolean a(Object obj) {
        return obj instanceof C0059h;
    }

    public Instant O() {
        return this.ad;
    }

    public int R() {
        return this.ag;
    }

    public String toString() {
        return "LootTarget(itemName=" + N() + ", dropTime=" + O() + ", id=" + P() + ", itemValue=" + Q() + ", alchValue=" + R() + ")";
    }

    private static boolean lIIlllIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
        if (lIIlllIlII(r0.equals(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
        if (lIIlllIlII(r0.equals(r0) ? 1 : 0) != false) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIlllIIll(obj, this)) {
            return lIlIllll[0];
        }
        if (lIIlllIlII(obj instanceof C0059h ? 1 : 0)) {
            return lIlIllll[1];
        }
        C0059h c0059h = (C0059h) obj;
        if (!lIIlllIlII(c0059h.a(this) ? 1 : 0) && !lIIlllIlIl(P(), c0059h.P()) && !lIIlllIlIl(Q(), c0059h.Q()) && !lIIlllIlIl(R(), c0059h.R())) {
            String N = N();
            String N2 = c0059h.N();
            if (lIIlllIllI(N)) {
                if (lIIlllIlll(N2)) {
                    "".length();
                    if ((-" ".length()) > "   ".length()) {
                        return ((((109 + 4) - (-41)) + 91) ^ (((168 + 62) - 173) + 125)) & (((171 ^ 139) ^ (249 ^ 154)) ^ (-" ".length()));
                    }
                    return lIlIllll[1];
                }
                Instant O = O();
                Instant O2 = c0059h.O();
                if (lIIlllIllI(O)) {
                    if (lIIlllIlll(O2)) {
                        "".length();
                        if ((187 ^ 191) < (-" ".length())) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                        return lIlIllll[1];
                    }
                    return lIlIllll[0];
                }
            }
        }
        return lIlIllll[1];
    }

    public void a(String str) {
        this.ac = str;
    }

    public void g(int i2) {
        this.af = i2;
    }

    public int P() {
        return this.ae;
    }

    public void h(int i2) {
        this.ag = i2;
    }

    private static void lIIlllIIlI() {
        lIlIllll = new int[4];
        lIlIllll[0] = " ".length();
        lIlIllll[1] = ((108 ^ 26) ^ (49 ^ 122)) & (((214 ^ 133) ^ (220 ^ 178)) ^ (-" ".length()));
        lIlIllll[2] = (224 ^ 160) ^ (219 ^ 160);
        lIlIllll[3] = (255 ^ 194) ^ (76 ^ 90);
    }
}
