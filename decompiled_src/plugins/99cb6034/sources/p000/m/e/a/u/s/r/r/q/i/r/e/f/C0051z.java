package p000.m.e.a.u.s.r.r.q.i.r.e.f;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.z  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/z.class */
public final class C0051z {
    private static /* synthetic */ int[] llIIIIIllIII;
    private final /* synthetic */ String bi;
    private final /* synthetic */ N bh;

    public N as() {
        return this.bh;
    }

    private static void llllIIIllIlIII() {
        llIIIIIllIII = new int[4];
        llIIIIIllIII[0] = " ".length();
        llIIIIIllIII[1] = (103 ^ 43) & ((40 ^ 100) ^ (-1));
        llIIIIIllIII[2] = 121 ^ 66;
        llIIIIIllIII[3] = (((60 + 6) - (-31)) + 44) ^ (((110 + 29) - 37) + 64);
    }

    public C0051z(N n, String str) {
        this.bh = n;
        this.bi = str;
    }

    private static boolean llllIIIllIllII(Object obj) {
        return obj != null;
    }

    private static boolean llllIIIllIlIlI(int i) {
        return i == 0;
    }

    private static boolean llllIIIllIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = llIIIIIllIII[2];
        int i2 = llIIIIIllIII[0];
        N as = as();
        int i3 = i2 * llIIIIIllIII[2];
        if (llllIIIllIlIll(as)) {
            hashCode = llIIIIIllIII[3];
            "".length();
            if (((234 ^ 178) ^ (68 ^ 24)) < (-" ".length())) {
                return ((44 ^ 70) ^ (23 ^ 116)) & (((((62 + 102) - 119) + 155) ^ (((130 + 43) - 65) + 85)) ^ (-" ".length()));
            }
        } else {
            hashCode = as.hashCode();
        }
        int i4 = i3 + hashCode;
        String at = at();
        int i5 = i4 * llIIIIIllIII[2];
        if (llllIIIllIlIll(at)) {
            hashCode2 = llIIIIIllIII[3];
            "".length();
            if ((43 ^ 46) <= 0) {
                return (37 ^ 26) & ((112 ^ 79) ^ (-1));
            }
        } else {
            hashCode2 = at.hashCode();
        }
        return i5 + hashCode2;
    }

    private static boolean llllIIIllIlIll(Object obj) {
        return obj == null;
    }

    static {
        llllIIIllIlIII();
    }

    public String at() {
        return this.bi;
    }

    public String toString() {
        return "ProfilePatch(patch=" + String.valueOf(as()) + ", rsProfileKey=" + at() + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (llllIIIllIlIlI(r0.equals(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
        if (llllIIIllIlIlI(r0.equals(r0) ? 1 : 0) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (llllIIIllIlIIl(obj, this)) {
            return llIIIIIllIII[0];
        }
        if (llllIIIllIlIlI(obj instanceof C0051z ? 1 : 0)) {
            return llIIIIIllIII[1];
        }
        C0051z c0051z = (C0051z) obj;
        N as = as();
        N as2 = c0051z.as();
        if (llllIIIllIlIll(as)) {
            if (llllIIIllIllII(as2)) {
                "".length();
                if (0 != 0) {
                    return ((3 ^ 72) ^ (218 ^ 193)) & (((87 ^ 111) ^ (203 ^ 163)) ^ (-" ".length()));
                }
                return llIIIIIllIII[1];
            }
            String at = at();
            String at2 = c0051z.at();
            if (llllIIIllIlIll(at)) {
                if (llllIIIllIllII(at2)) {
                    "".length();
                    if ((142 ^ 138) == " ".length()) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return llIIIIIllIII[1];
                }
                return llIIIIIllIII[0];
            }
        }
    }
}
