package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import net.runelite.api.TileObject;
import net.unethicalite.client.Static;
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/J.class */
public class J {
    private /* synthetic */ TileObject W;
    private /* synthetic */ int Y;
    private static /* synthetic */ int[] lllIIIIlIlIl;
    private /* synthetic */ int X = lllIIIIlIlIl[0];
    private /* synthetic */ int Z = lllIIIIlIlIl[1];

    public TileObject aI() {
        return this.W;
    }

    public int aG() {
        return this.Y;
    }

    public J(TileObject tileObject) {
        this.W = tileObject;
    }

    private static void lIIIlIIIlIIIIII() {
        lllIIIIlIlIl = new int[2];
        lllIIIIlIlIl[0] = ((((60 + 97) - 60) + 156) ^ (((9 + 173) - 59) + 72)) & (((201 ^ 198) ^ (109 ^ 92)) ^ (-" ".length()));
        lllIIIIlIlIl[1] = -" ".length();
    }

    public int aF() {
        return Static.getClient().getTickCount() - this.X;
    }

    private static boolean lIIIlIIIlIIIIIl(int i, int i2) {
        return i == i2;
    }

    static {
        lIIIlIIIlIIIIII();
    }

    public int aH() {
        return this.Z;
    }

    public void aE() {
        int tickCount = Static.getClient().getTickCount();
        int a = C0002c.a(this.W);
        if (lIIIlIIIlIIIIIl(this.Y, a)) {
            return;
        }
        this.Z = this.Y;
        this.X = tickCount;
        this.Y = a;
    }
}
