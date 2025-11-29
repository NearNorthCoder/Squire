package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import gg.squire.minigames.SquireBlastFurnaceConfig;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/t.class */
public class C0019t {
    private static final /* synthetic */ WorldPoint ar;
    @Inject
    private /* synthetic */ SquireBlastFurnaceConfig i;
    @Inject
    private /* synthetic */ H at;
    private /* synthetic */ boolean as = lIIllIIIllII[0];
    private static /* synthetic */ int[] lIIllIIIllII;

    private static boolean llIIlllIIIlIII(Object obj) {
        return obj == null;
    }

    private static boolean llIIlllIIIllII(int i) {
        return i > 0;
    }

    public boolean H() {
        return this.as;
    }

    private static void llIIlllIIIIlll() {
        lIIllIIIllII = new int[5];
        lIIllIIIllII[0] = (93 ^ 65) & ((109 ^ 113) ^ (-1));
        lIIllIIIllII[1] = "  ".length();
        lIIllIIIllII[2] = " ".length();
        lIIllIIIllII[3] = (-((-665) & 31481)) & (-10) & 32767;
        lIIllIIIllII[4] = (-2193) & 7159;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    public boolean G() {
        if (llIIlllIIIlIll(this.i.useStams() ? 1 : 0)) {
            return lIIllIIIllII[2];
        }
        if (llIIlllIIIllII(llIIlllIIIlIlI(Movement.getRunEnergy() - this.at.aj(), this.i.requireStaminaThreshold()))) {
            ?? r0 = lIIllIIIllII[2];
            "".length();
            return (76 ^ 72) <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIllIIIllII[0];
    }

    static {
        llIIlllIIIIlll();
        ar = new WorldPoint(lIIllIIIllII[3], lIIllIIIllII[4], lIIllIIIllII[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean F() {
        Player local = Players.getLocal();
        if (!llIIlllIIIlIII(local) && llIIlllIIIlIIl(local.getWorldLocation().distanceTo(ar), lIIllIIIllII[1])) {
            ?? r0 = lIIllIIIllII[2];
            "".length();
            return "  ".length() < (((4 ^ 63) ^ (160 ^ 196)) & (((((129 + 217) - 215) + 88) ^ (((26 + 79) - 16) + 43)) ^ (-" ".length()))) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
        }
        return lIIllIIIllII[0];
    }

    private static int llIIlllIIIlIlI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llIIlllIIIlIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlllIIIlIll(int i) {
        return i == 0;
    }

    public C0019t a(boolean z) {
        this.as = z;
        return this;
    }
}
