package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import net.runelite.api.coords.WorldPoint;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/t.class */
class C0045t extends C0042q {
    private static /* synthetic */ int[] lIllllIIIIlI;
    final /* synthetic */ C0043r aT;

    private static boolean lllIllIllIIIIl(int i, int i2) {
        return i == i2;
    }

    private static void lllIllIlIllllI() {
        lIllllIIIIlI = new int[4];
        lIllllIIIIlI[0] = (-((-11777) & 28392)) & (-1025) & 20479;
        lIllllIIIIlI[1] = (-((-10497) & 14728)) & (-25097) & 32767;
        lIllllIIIIlI[2] = " ".length();
        lIllllIIIIlI[3] = (78 ^ 26) & ((12 ^ 88) ^ (-1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.C0042q
    public boolean c(WorldPoint worldPoint) {
        if (lllIllIlIlllll(worldPoint.getX(), lIllllIIIIlI[0]) && lllIllIllIIIII(worldPoint.getY(), lIllllIIIIlI[1]) && !lllIllIllIIIIl(worldPoint.getPlane(), lIllllIIIIlI[2])) {
            return lIllllIIIIlI[3];
        }
        ?? r0 = lIllllIIIIlI[2];
        "".length();
        return (169 ^ 173) > (21 ^ 17) ? (true ^ true) & ((true ^ true) ^ true) : r0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045t(C0043r c0043r, String str, int i, boolean z, N... nArr) {
        super(str, i, z, nArr);
        this.aT = c0043r;
    }

    private static boolean lllIllIllIIIII(int i, int i2) {
        return i >= i2;
    }

    static {
        lllIllIlIllllI();
    }

    private static boolean lllIllIlIlllll(int i, int i2) {
        return i < i2;
    }
}
