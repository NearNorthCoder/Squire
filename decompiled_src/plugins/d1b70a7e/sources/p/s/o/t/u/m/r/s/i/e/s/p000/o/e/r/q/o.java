package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import net.runelite.api.Client;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.o  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/o.class */
public abstract class o extends l {
    private static /* synthetic */ int[] lIIllIlllIlIl;

    private static boolean lIllIIIllIlIlII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public boolean run() {
        int i;
        int i2;
        c N = this.ar.N();
        Player local = Players.getLocal();
        if (!lIllIIIllIIlllI(N) && !lIllIIIllIIllll(ak() ? 1 : 0)) {
            if ((!lIllIIIllIIllll(this.as.cookFish() ? 1 : 0) || lIllIIIllIlIIII(this.as.solo() ? 1 : 0)) && lIllIIIllIIllll(this.au.d()) && (!lIllIIIllIlIIIl(this.au.f(), this.as.numberOfFish()) || ((lIllIIIllIlIIlI(this.au.f()) && !lIllIIIllIlIIll(N.Y().distanceTo(local), lIIllIlllIlIl[1])) || (lIllIIIllIlIIII(this.as.solo() ? 1 : 0) && lIllIIIllIlIlII(this.au.b(), lIIllIlllIlIl[2]))))) {
                i = lIIllIlllIlIl[3];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                i = lIIllIlllIlIl[0];
            }
            int i3 = i;
            if (lIllIIIllIIllll(this.as.cookFish() ? 1 : 0) && lIllIIIllIIllll(this.as.solo() ? 1 : 0) && (!lIllIIIllIlIIIl(this.au.d(), this.as.numberOfFish()) || ((lIllIIIllIlIIlI(this.au.d()) && !lIllIIIllIlIIll(N.Y().distanceTo(local), lIIllIlllIlIl[1])) || (lIllIIIllIlIIII(this.as.solo() ? 1 : 0) && lIllIIIllIlIlII(this.au.b(), lIIllIlllIlIl[2]))))) {
                i2 = lIIllIlllIlIl[3];
                "".length();
                if (" ".length() > "  ".length()) {
                    return ((242 ^ 166) ^ (16 ^ 123)) & (((10 ^ 57) ^ (178 ^ 190)) ^ (-" ".length()));
                }
            } else {
                i2 = lIIllIlllIlIl[0];
            }
            int i4 = i2;
            if (lIllIIIllIlIIII(this.ar.k() ? 1 : 0)) {
                return lIIllIlllIlIl[0];
            }
            if (lIllIIIllIIllll(i3) && lIllIIIllIIllll(i4)) {
                return lIIllIlllIlIl[0];
            }
            if (lIllIIIllIlIIll(local.getWorldLocation().distanceTo(N.af()), lIIllIlllIlIl[1])) {
                this.ar.f(N.af());
                "".length();
                return lIIllIlllIlIl[3];
            }
            return al();
        }
        return lIIllIlllIlIl[0];
    }

    private static boolean lIllIIIllIIllll(int i) {
        return i == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(aVar, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIllIlIIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIIIllIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIllIlIIlI(int i) {
        return i > 0;
    }

    @Override // p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q.l
    public abstract boolean al();

    private static boolean lIllIIIllIIlllI(Object obj) {
        return obj == null;
    }

    static {
        lIllIIIllIIllIl();
    }

    private static void lIllIIIllIIllIl() {
        lIIllIlllIlIl = new int[4];
        lIIllIlllIlIl[0] = (129 ^ 176) & ((106 ^ 91) ^ (-1));
        lIIllIlllIlIl[1] = (((1 + 53) - (-91)) + 21) ^ (((87 + 21) - 0) + 64);
        lIIllIlllIlIl[2] = (81 ^ 114) ^ (50 ^ 43);
        lIIllIlllIlIl[3] = " ".length();
    }

    private static boolean lIllIIIllIlIIII(int i) {
        return i != 0;
    }
}
