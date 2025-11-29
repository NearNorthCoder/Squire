package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import net.runelite.api.coords.WorldPoint;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.v  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/v.class */
class C0047v extends C0042q {
    final /* synthetic */ C0043r aV;
    private static /* synthetic */ int[] lIlllIIllIII;

    static {
        lllIlIlllIIlII();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0047v(C0043r c0043r, String str, int i, boolean z, N... nArr) {
        super(str, i, z, nArr);
        this.aV = c0043r;
    }

    private static boolean lllIlIlllIIlIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIlIlllIlIIl(int i) {
        return i == 0;
    }

    private static boolean lllIlIlllIlIII(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.C0042q
    public boolean c(WorldPoint worldPoint) {
        if (lllIlIlllIIlIl(worldPoint.getX(), lIlllIIllIII[0]) && lllIlIlllIIllI(worldPoint.getY(), lIlllIIllIII[1]) && lllIlIlllIIlll(worldPoint.getY(), lIlllIIllIII[2])) {
            return lIlllIIllIII[3];
        }
        if (((lllIlIlllIlIII(worldPoint.getX(), lIlllIIllIII[4]) && lllIlIlllIlIII(worldPoint.getX(), lIlllIIllIII[5]) && lllIlIlllIlIII(worldPoint.getX(), lIlllIIllIII[6]) && !lllIlIlllIIlIl(worldPoint.getX(), lIlllIIllIII[7])) || !lllIlIlllIIlll(worldPoint.getY(), lIlllIIllIII[8]) || !lllIlIlllIIllI(worldPoint.getY(), lIlllIIllIII[9])) && lllIlIlllIlIIl(worldPoint.getPlane())) {
            ?? r0 = lIlllIIllIII[10];
            "".length();
            return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlllIIllIII[3];
    }

    private static boolean lllIlIlllIIllI(int i, int i2) {
        return i >= i2;
    }

    private static void lllIlIlllIIlII() {
        lIlllIIllIII = new int[11];
        lIlllIIllIII[0] = (-((-17923) & 22039)) & (-8451) & 16319;
        lIlllIIllIII[1] = (-((-4173) & 12366)) & (-4321) & 16381;
        lIlllIIllIII[2] = (-16482) & 20351;
        lIlllIIllIII[3] = "  ".length() & ("  ".length() ^ (-" ".length()));
        lIlllIIllIII[4] = (-((-3969) & 28655)) & (-4097) & 32511;
        lIlllIIllIII[5] = (-((-1539) & 26159)) & (-4098) & 32445;
        lIlllIIllIII[6] = (-16465) & 20211;
        lIlllIIllIII[7] = (-((-3041) & 23550)) & (-8449) & 32703;
        lIlllIIllIII[8] = (-((-17122) & 25317)) & (-257) & 12283;
        lIlllIIllIII[9] = (-((-369) & 29049)) & (-257) & 32766;
        lIlllIIllIII[10] = " ".length();
    }

    private static boolean lllIlIlllIIlll(int i, int i2) {
        return i <= i2;
    }
}
