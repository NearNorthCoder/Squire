package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.bQ  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/bQ.class */
public final class bQ {
    private static /* synthetic */ int[] lIllIllIlll;
    final /* synthetic */ boolean hd;
    final /* synthetic */ WorldPoint hb;
    final /* synthetic */ NPC ha;
    private final /* synthetic */ boolean hc;
    final /* synthetic */ NPC gZ;

    private static boolean lIIlIllllllIII(int i, int i2) {
        return i != i2;
    }

    public bQ(NPC npc, NPC npc2, WorldPoint worldPoint, boolean z, boolean z2) {
        this.gZ = npc;
        this.ha = npc2;
        this.hb = worldPoint;
        this.hc = z;
        this.hd = z2;
    }

    private static boolean lIIlIllllllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (lIIlIllllllIll(r0.equals(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
        if (lIIlIllllllIll(r0.equals(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0141, code lost:
        if (lIIlIllllllIll(r0.equals(r0) ? 1 : 0) != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (lIIlIllllllIlI(obj, this)) {
            return lIllIllIlll[0];
        }
        if (lIIlIllllllIll(obj instanceof bQ ? 1 : 0)) {
            return lIllIllIlll[1];
        }
        bQ bQVar = (bQ) obj;
        if (lIIlIllllllIII(cx() ? 1 : 0, bQVar.cx() ? 1 : 0)) {
            return lIllIllIlll[1];
        }
        if (lIIlIllllllIII(cy() ? 1 : 0, bQVar.cy() ? 1 : 0)) {
            return lIllIllIlll[1];
        }
        NPC cu = cu();
        NPC cu2 = bQVar.cu();
        if (lIIlIlllllllII(cu)) {
            if (lIIlIlllllllIl(cu2)) {
                "".length();
                if ((-"   ".length()) >= 0) {
                    return ((((71 + 2) - (-16)) + 52) ^ (((51 + 86) - (-2)) + 29)) & (((55 ^ 19) ^ " ".length()) ^ (-" ".length()));
                }
                return lIllIllIlll[1];
            }
            NPC cv = cv();
            NPC cv2 = bQVar.cv();
            if (lIIlIlllllllII(cv)) {
                if (lIIlIlllllllIl(cv2)) {
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                    return lIllIllIlll[1];
                }
                WorldPoint cw = cw();
                WorldPoint cw2 = bQVar.cw();
                if (lIIlIlllllllII(cw)) {
                    if (lIIlIlllllllIl(cw2)) {
                        "".length();
                        if ("  ".length() <= " ".length()) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                        return lIllIllIlll[1];
                    }
                    return lIllIllIlll[0];
                }
            }
        }
    }

    public String toString() {
        return "ClearBoulder.BoulderSolution(boulder=" + String.valueOf(cu()) + ", jug=" + String.valueOf(cv()) + ", towards=" + String.valueOf(cw()) + ", diagonal=" + cx() + ", needsAttack=" + cy() + ")";
    }

    private static void lIIlIlllllIllI() {
        lIllIllIlll = new int[6];
        lIllIllIlll[0] = " ".length();
        lIllIllIlll[1] = (124 ^ 106) & ((52 ^ 34) ^ (-1));
        lIllIllIlll[2] = 78 ^ 117;
        lIllIllIlll[3] = 12 ^ 67;
        lIllIllIlll[4] = (((50 + 126) - 134) + 85) ^ (182 ^ 168);
        lIllIllIlll[5] = 152 ^ 179;
    }

    public boolean cy() {
        return this.hd;
    }

    public WorldPoint ct() {
        return lIIlIlllllIlll(cx() ? 1 : 0) ? this.ha.getWorldLocation().dx((int) Math.signum(this.ha.getWorldX() - this.hb.getWorldX())).dy((int) Math.signum(this.ha.getWorldY() - this.hb.getWorldY())) : (!lIIlIllllllIII(this.ha.getWorldY(), this.gZ.getWorldY()) || lIIlIllllllIIl(this.ha.getWorldY(), this.hb.getWorldY())) ? this.ha.getWorldLocation().dx((int) Math.signum(this.ha.getWorldX() - this.gZ.getWorldX())) : this.ha.getWorldLocation().dy((int) Math.signum(this.ha.getWorldY() - this.gZ.getWorldY()));
    }

    private static boolean lIIlIllllllIIl(int i, int i2) {
        return i == i2;
    }

    public boolean cx() {
        return this.hc;
    }

    public NPC cv() {
        return this.ha;
    }

    private static boolean lIIlIlllllllII(Object obj) {
        return obj == null;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i3 = lIllIllIlll[2];
        int i4 = lIllIllIlll[0] * lIllIllIlll[2];
        if (lIIlIlllllIlll(cx() ? 1 : 0)) {
            i = lIllIllIlll[3];
            "".length();
            if (" ".length() == (-" ".length())) {
                return (38 ^ 22) & ((186 ^ 138) ^ (-1));
            }
        } else {
            i = lIllIllIlll[4];
        }
        int i5 = (i4 + i) * lIllIllIlll[2];
        if (lIIlIlllllIlll(cy() ? 1 : 0)) {
            i2 = lIllIllIlll[3];
            "".length();
            if (0 != 0) {
                return "   ".length() & ("   ".length() ^ (-" ".length()));
            }
        } else {
            i2 = lIllIllIlll[4];
        }
        int i6 = i5 + i2;
        NPC cu = cu();
        int i7 = i6 * lIllIllIlll[2];
        if (lIIlIlllllllII(cu)) {
            hashCode = lIllIllIlll[5];
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return (181 ^ 185) & ((131 ^ 143) ^ (-1));
            }
        } else {
            hashCode = cu.hashCode();
        }
        int i8 = i7 + hashCode;
        NPC cv = cv();
        int i9 = i8 * lIllIllIlll[2];
        if (lIIlIlllllllII(cv)) {
            hashCode2 = lIllIllIlll[5];
            "".length();
            if (" ".length() == 0) {
                return (174 ^ 146) & ((140 ^ 176) ^ (-1));
            }
        } else {
            hashCode2 = cv.hashCode();
        }
        int i10 = i9 + hashCode2;
        WorldPoint cw = cw();
        int i11 = i10 * lIllIllIlll[2];
        if (lIIlIlllllllII(cw)) {
            hashCode3 = lIllIllIlll[5];
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (249 ^ 181) & ((51 ^ 127) ^ (-1));
            }
        } else {
            hashCode3 = cw.hashCode();
        }
        return i11 + hashCode3;
    }

    static {
        lIIlIlllllIllI();
    }

    private static boolean lIIlIlllllllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlllllIlll(int i) {
        return i != 0;
    }

    public NPC cu() {
        return this.gZ;
    }

    public WorldPoint cw() {
        return this.hb;
    }

    private static boolean lIIlIllllllIll(int i) {
        return i == 0;
    }
}
