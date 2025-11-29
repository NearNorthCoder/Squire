package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import net.unethicalite.api.game.Combat;
@TaskDesc(name = "Equipping Ranged Gear", priority = 100)
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.y  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/y.class */
public class y extends m {
    private static /* synthetic */ int[] lIllIIlIlIIlI;

    private static boolean llIIIllIIIIIIlI(int i, int i2) {
        return i > i2;
    }

    @Inject
    public y(SquireZammyConfig squireZammyConfig, l lVar) {
        super(squireZammyConfig, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!llIIIllIIIIIIIl(this.I.B() ? 1 : 0) || llIIIllIIIIIIIl(this.I.A() ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        if (llIIIllIIIIIIIl(this.I.H() ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        if (llIIIllIIIIIIIl(this.H.useBlowpipe() ? 1 : 0) && llIIIllIIIIIIIl(Combat.isSpecEnabled() ? 1 : 0) && llIIIllIIIIIIlI(this.I.z(), lIllIIlIlIIlI[1])) {
            return lIllIIlIlIIlI[0];
        }
        int[] L = L();
        if (llIIIllIIIIIIll(b(L) ? 1 : 0)) {
            return lIllIIlIlIIlI[0];
        }
        a(L);
        "".length();
        return lIllIIlIlIIlI[2];
    }

    private static void llIIIllIIIIIIII() {
        lIllIIlIlIIlI = new int[3];
        lIllIIlIlIIlI[0] = "   ".length() & ("   ".length() ^ (-1));
        lIllIIlIlIIlI[1] = (12 ^ 102) ^ (2 ^ 98);
        lIllIIlIlIIlI[2] = " ".length();
    }

    private static boolean llIIIllIIIIIIIl(int i) {
        return i != 0;
    }

    private static boolean llIIIllIIIIIIll(int i) {
        return i == 0;
    }

    static {
        llIIIllIIIIIIII();
    }
}
