package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.common.annotations.VisibleForTesting;
import java.time.Instant;
import net.runelite.api.coords.WorldPoint;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/d.class */
public final class C0029d {
    private final /* synthetic */ WorldPoint F;
    private final /* synthetic */ N G;
    private static /* synthetic */ int[] llIIIIlIIllI;
    private final /* synthetic */ Instant E;

    private static void llllIIlIIIllll() {
        llIIIIlIIllI = new int[4];
        llIIIIlIIllI[0] = " ".length();
        llIIIIlIIllI[1] = ((((11 + 160) - 82) + 107) ^ (((112 + 59) - 158) + 144)) & (((88 ^ 86) ^ (249 ^ 174)) ^ (-" ".length()));
        llIIIIlIIllI[2] = 18 ^ 41;
        llIIIIlIIllI[3] = 14 ^ 37;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        if (llllIIlIIlIIIl(r0.equals(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
        if (llllIIlIIlIIIl(r0.equals(r0) ? 1 : 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0133, code lost:
        if (llllIIlIIlIIIl(r0.equals(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        if (llllIIlIIlIIII(obj, this)) {
            return llIIIIlIIllI[0];
        }
        if (llllIIlIIlIIIl(obj instanceof C0029d ? 1 : 0)) {
            return llIIIIlIIllI[1];
        }
        C0029d c0029d = (C0029d) obj;
        Instant f = f();
        Instant f2 = c0029d.f();
        if (llllIIlIIlIIlI(f)) {
            if (llllIIlIIlIIll(f2)) {
                "".length();
                if (0 != 0) {
                    return ((236 ^ 197) ^ (17 ^ 12)) & (((((35 + 73) - 82) + 101) ^ (236 ^ 167)) ^ (-" ".length()));
                }
                return llIIIIlIIllI[1];
            }
            WorldPoint g = g();
            WorldPoint g2 = c0029d.g();
            if (llllIIlIIlIIlI(g)) {
                if (llllIIlIIlIIll(g2)) {
                    "".length();
                    if ((-"   ".length()) >= 0) {
                        return ((90 ^ 17) ^ (123 ^ 5)) & (((43 ^ 93) ^ (222 ^ 157)) ^ (-" ".length()));
                    }
                    return llIIIIlIIllI[1];
                }
                N h = h();
                N h2 = c0029d.h();
                if (llllIIlIIlIIlI(h)) {
                    if (llllIIlIIlIIll(h2)) {
                        "".length();
                        if ((-" ".length()) > ((10 ^ 2) & ((15 ^ 7) ^ (-1)))) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                        return llIIIIlIIllI[1];
                    }
                    return llIIIIlIIllI[0];
                }
            }
        }
    }

    public N h() {
        return this.G;
    }

    public String toString() {
        return "CompostTracker.PendingCompost(timeout=" + String.valueOf(f()) + ", patchLocation=" + String.valueOf(g()) + ", farmingPatch=" + String.valueOf(h()) + ")";
    }

    public WorldPoint g() {
        return this.F;
    }

    public C0029d(Instant instant, WorldPoint worldPoint, N n) {
        this.E = instant;
        this.F = worldPoint;
        this.G = n;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = llIIIIlIIllI[2];
        int i2 = llIIIIlIIllI[0];
        Instant f = f();
        int i3 = i2 * llIIIIlIIllI[2];
        if (llllIIlIIlIIlI(f)) {
            hashCode = llIIIIlIIllI[3];
            "".length();
            if ((143 ^ 139) <= (-" ".length())) {
                return (112 ^ 89) & ((52 ^ 29) ^ (-1));
            }
        } else {
            hashCode = f.hashCode();
        }
        int lllllllllllllllIlIlIllIIIIllIIll = i3 + hashCode;
        WorldPoint g = g();
        int i4 = lllllllllllllllIlIlIllIIIIllIIll * llIIIIlIIllI[2];
        if (llllIIlIIlIIlI(g)) {
            hashCode2 = llIIIIlIIllI[3];
            "".length();
            if ((-" ".length()) > 0) {
                return ((221 ^ 180) ^ (81 ^ 18)) & (((143 ^ 132) ^ (225 ^ 192)) ^ (-" ".length()));
            }
        } else {
            hashCode2 = g.hashCode();
        }
        int lllllllllllllllIlIlIllIIIIllIIll2 = i4 + hashCode2;
        N h = h();
        int i5 = lllllllllllllllIlIlIllIIIIllIIll2 * llIIIIlIIllI[2];
        if (llllIIlIIlIIlI(h)) {
            hashCode3 = llIIIIlIIllI[3];
            "".length();
            if (0 != 0) {
                return (227 ^ 180) & ((64 ^ 23) ^ (-1));
            }
        } else {
            hashCode3 = h.hashCode();
        }
        return i5 + hashCode3;
    }

    private static boolean llllIIlIIlIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        llllIIlIIIllll();
    }

    private static boolean llllIIlIIlIIIl(int i) {
        return i == 0;
    }

    public Instant f() {
        return this.E;
    }

    private static boolean llllIIlIIlIIll(Object obj) {
        return obj != null;
    }

    private static boolean llllIIlIIlIIlI(Object obj) {
        return obj == null;
    }
}
