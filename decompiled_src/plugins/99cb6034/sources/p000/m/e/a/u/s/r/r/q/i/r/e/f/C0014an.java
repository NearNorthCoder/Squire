package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import net.unethicalite.api.game.Vars;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.an  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/an.class */
public final class C0014an {
    private final /* synthetic */ EnumC0039n bD;
    private final /* synthetic */ int bE;
    private static /* synthetic */ int[] llIIIIIIllII;
    private final /* synthetic */ EnumC0021au bC;

    public C0014an(EnumC0021au enumC0021au, EnumC0039n enumC0039n, int i) {
        this.bC = enumC0021au;
        this.bD = enumC0039n;
        this.bE = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (llllIIIlIIlIlI(r0.equals(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
        if (llllIIIlIIlIlI(r0.equals(r0) ? 1 : 0) != false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (llllIIIlIIlIII(obj, this)) {
            return llIIIIIIllII[2];
        }
        if (llllIIIlIIlIlI(obj instanceof C0014an ? 1 : 0)) {
            return llIIIIIIllII[0];
        }
        C0014an c0014an = (C0014an) obj;
        if (llllIIIlIIllII(bb(), c0014an.bb())) {
            return llIIIIIIllII[0];
        }
        EnumC0021au aY = aY();
        EnumC0021au aY2 = c0014an.aY();
        if (llllIIIlIIllIl(aY)) {
            if (llllIIIlIIlllI(aY2)) {
                "".length();
                if ("   ".length() <= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                return llIIIIIIllII[0];
            }
            EnumC0039n aZ = aZ();
            EnumC0039n aZ2 = c0014an.aZ();
            if (llllIIIlIIllIl(aZ)) {
                if (llllIIIlIIlllI(aZ2)) {
                    "".length();
                    if ((158 ^ 154) <= 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return llIIIIIIllII[0];
                }
                return llIIIIIIllII[2];
            }
        }
    }

    private static boolean llllIIIlIIlIll(int i) {
        return i != 0;
    }

    private static boolean llllIIIlIIlIIl(int i) {
        return i > 0;
    }

    private static void llllIIIlIIIllI() {
        llIIIIIIllII = new int[5];
        llIIIIIIllII[0] = (115 ^ 36) & ((248 ^ 175) ^ (-1));
        llIIIIIIllII[1] = (-2627) & 8183;
        llIIIIIIllII[2] = " ".length();
        llIIIIIIllII[3] = (12 ^ 77) ^ (94 ^ 36);
        llIIIIIIllII[4] = (87 ^ 6) ^ (215 ^ 173);
    }

    private static boolean llllIIIlIIlIlI(int i) {
        return i == 0;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i = llIIIIIIllII[3];
        int bb = (llIIIIIIllII[2] * llIIIIIIllII[3]) + bb();
        EnumC0021au aY = aY();
        int i2 = bb * llIIIIIIllII[3];
        if (llllIIIlIIllIl(aY)) {
            hashCode = llIIIIIIllII[4];
            "".length();
            if (((207 ^ 153) & ((86 ^ 0) ^ (-1))) >= "   ".length()) {
                return (155 ^ 135) & ((98 ^ 126) ^ (-1));
            }
        } else {
            hashCode = aY.hashCode();
        }
        int i3 = i2 + hashCode;
        EnumC0039n aZ = aZ();
        int i4 = i3 * llIIIIIIllII[3];
        if (llllIIIlIIllIl(aZ)) {
            hashCode2 = llIIIIIIllII[4];
            "".length();
            if (" ".length() >= "   ".length()) {
                return (98 ^ 118) & ((6 ^ 18) ^ (-1));
            }
        } else {
            hashCode2 = aZ.hashCode();
        }
        return i4 + hashCode2;
    }

    public int bc() {
        if (!llllIIIlIIIlll(this.bD, EnumC0039n.HARVESTABLE) || llllIIIlIIlIII(this.bD, EnumC0039n.FILLING)) {
            int bk = this.bC.bk();
            "".length();
            return "  ".length() < 0 ? ((106 ^ 123) ^ "  ".length()) & ((((120 ^ 102) & ((78 ^ 80) ^ (-1))) ^ (10 ^ 25)) ^ (-" ".length())) : bk;
        }
        return this.bC.bc();
    }

    private static boolean llllIIIlIIllII(int i, int i2) {
        return i != i2;
    }

    static {
        llllIIIlIIIllI();
    }

    private static boolean llllIIIlIIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean llllIIIlIIlIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean be() {
        int i;
        if (llllIIIlIIlIIl(Vars.getBit(llIIIIIIllII[1]))) {
            i = llIIIIIIllII[2];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = llIIIIIIllII[0];
        }
        int i2 = i;
        if (!llllIIIlIIIlll(this.bD, EnumC0039n.EMPTY) || ((llllIIIlIIlIlI(this.bE) && !llllIIIlIIIlll(this.bC, EnumC0021au.WEEDS)) || (llllIIIlIIlIII(this.bC, EnumC0021au.WEEDS) && llllIIIlIIlIll(i2)))) {
            ?? r0 = llIIIIIIllII[2];
            "".length();
            return ((205 ^ 174) ^ (222 ^ 185)) <= (-" ".length()) ? ((122 ^ 107) ^ (238 ^ 193)) & (((((91 + 100) - 106) + 96) ^ (((106 + 37) - 13) + 9)) ^ (-" ".length())) : r0;
        }
        return llIIIIIIllII[0];
    }

    public EnumC0039n aZ() {
        return this.bD;
    }

    public EnumC0021au aY() {
        return this.bC;
    }

    private static boolean llllIIIlIIllIl(Object obj) {
        return obj == null;
    }

    public String toString() {
        return "PatchState(produce=" + String.valueOf(aY()) + ", cropState=" + String.valueOf(aZ()) + ", stage=" + bb() + ")";
    }

    public int bd() {
        switch (C0015ao.bF[this.bD.ordinal()]) {
            case 1:
                return this.bC.bj();
            case 2:
                return this.bC.bi();
            default:
                return llIIIIIIllII[0];
        }
    }

    public int bb() {
        return this.bE;
    }

    private static boolean llllIIIlIIlllI(Object obj) {
        return obj != null;
    }
}
