package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import net.runelite.api.coords.WorldPoint;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.w  reason: invalid package and case insensitive filesystem */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/w.class */
class C0048w extends C0042q {
    final /* synthetic */ C0043r aW;
    private static /* synthetic */ int[] llIIIIlIlIII;

    private static void llllIIlIIlIlII() {
        llIIIIlIlIII = new int[3];
        llIIIIlIlIII[0] = (-28693) & 31964;
        llIIIIlIlIII[1] = " ".length();
        llIIIIlIlIII[2] = ((229 ^ 183) ^ (154 ^ 198)) & (((((116 + 156) - 203) + 99) ^ (((129 + 86) - 199) + 150)) ^ (-" ".length()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0048w(C0043r c0043r, String str, int i, boolean z, N... nArr) {
        super(str, i, z, nArr);
        this.aW = c0043r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.m.e.a.u.s.r.r.q.i.r.e.f.C0042q
    public boolean c(WorldPoint worldPoint) {
        if (llllIIlIIlIlIl(worldPoint.getY(), llIIIIlIlIII[0])) {
            ?? r0 = llIIIIlIlIII[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIIIlIlIII[2];
    }

    static {
        llllIIlIIlIlII();
    }

    private static boolean llllIIlIIlIlIl(int i, int i2) {
        return i < i2;
    }
}
