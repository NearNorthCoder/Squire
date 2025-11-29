package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import net.runelite.api.coords.WorldPoint;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.s  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/s.class */
class C0044s extends C0042q {
    final /* synthetic */ C0043r aS;
    private static /* synthetic */ int[] llIIIlIlIIlI;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0044s(C0043r c0043r, String str, int i, boolean z, N... nArr) {
        super(str, i, z, nArr);
        this.aS = c0043r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.C0042q
    public boolean c(WorldPoint worldPoint) {
        if (llllIlIIlIIlIl(worldPoint.getX(), llIIIlIlIIlI[0]) && llllIlIIlIIllI(worldPoint.getY(), llIIIlIlIIlI[1])) {
            if (llllIlIIlIIllI(worldPoint.getX(), llIIIlIlIIlI[2]) && llllIlIIlIIlIl(worldPoint.getY(), llIIIlIlIIlI[3]) && llllIlIIlIIlll(worldPoint.getPlane())) {
                ?? r0 = llIIIlIlIIlI[4];
                "".length();
                return "  ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIlIlIIlI[5];
        }
        return llIIIlIlIIlI[4];
    }

    private static boolean llllIlIIlIIlll(int i) {
        return i == 0;
    }

    static {
        llllIlIIlIIlII();
    }

    private static void llllIlIIlIIlII() {
        llIIIlIlIIlI = new int[6];
        llIIIlIlIIlI[0] = (-21754) & 24569;
        llIIIlIlIIlI[1] = (-16980) & 20435;
        llIIIlIlIIlI[2] = (-16420) & 19259;
        llIIIlIlIIlI[3] = (-25227) & 28666;
        llIIIlIlIIlI[4] = " ".length();
        llIIIlIlIIlI[5] = ((232 ^ 170) ^ (0 ^ 108)) & (((46 ^ 39) ^ (34 ^ 5)) ^ (-" ".length()));
    }

    private static boolean llllIlIIlIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llllIlIIlIIlIl(int i, int i2) {
        return i >= i2;
    }
}
