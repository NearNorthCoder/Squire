package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Production;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.x  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/x.class */
public class x extends w {
    private final /* synthetic */ int ax;
    private static /* synthetic */ int[] lIIllIllllll;

    private static boolean llIIllllllllII(Object obj) {
        return obj == null;
    }

    public int K() {
        return this.ax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    @Override // a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f.w
    public boolean c(C0014o c0014o) {
        int[] iArr = new int[lIIllIllllll[0]];
        iArr[lIIllIllllll[1]] = this.ax;
        TileObject nearest = TileObjects.getNearest(iArr);
        if (llIIllllllllII(nearest)) {
            return lIIllIllllll[1];
        }
        if (llIIllllllllIl(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
            return lIIllIllllll[0];
        }
        nearest.interact(lIIllIllllll[1]);
        return lIIllIllllll[0];
    }

    private static void llIIlllllllIll() {
        lIIllIllllll = new int[2];
        lIIllIllllll[0] = " ".length();
        lIIllIllllll[1] = ((((117 + 43) - 130) + 130) ^ (((134 + 120) - 116) + 4)) & (((33 ^ 66) ^ (68 ^ 9)) ^ (-" ".length()));
    }

    public x(String str, int i) {
        super(str);
        this.ax = i;
    }

    private static boolean llIIllllllllIl(int i) {
        return i != 0;
    }

    static {
        llIIlllllllIll();
    }
}
