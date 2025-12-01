package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
@TaskDesc(name = "Going to house", priority = 50)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.x  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/x.class */
public class x extends Task {
    private static /* synthetic */ int[] llllIllIIlI;
    private final /* synthetic */ SquireBarrowsConfig am;
    private final /* synthetic */ SquireBarrows al;

    static {
        lIllIllIIIlIlI();
    }

    private static boolean lIllIllIIIllII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public x(SquireBarrows squireBarrows, SquireBarrowsConfig squireBarrowsConfig) {
        this.al = squireBarrows;
        this.am = squireBarrowsConfig;
    }

    private static boolean lIllIllIIIlIll(int i) {
        return i == 0;
    }

    private static void lIllIllIIIlIlI() {
        llllIllIIlI = new int[3];
        llllIllIIlI[0] = (254 ^ 194) & ((147 ^ 175) ^ (-1));
        llllIllIIlI[1] = (37 ^ 6) ^ (23 ^ 50);
        llllIllIIlI[2] = " ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean run() {
        if (!lIllIllIIIlIll(this.am.useHouse() ? 1 : 0) && !lIllIllIIIlIll(this.al.h() ? 1 : 0) && !lIllIllIIIllII(this.al.e(), llllIllIIlI[1]) && !lIllIllIIIlIll(this.al.v() ? 1 : 0) && !lIllIllIIIlIll(TeleportLoader.canEnterHouse() ? 1 : 0)) {
            TeleportLoader.enterHouse();
            "".length();
            return llllIllIIlI[2];
        }
        return llllIllIIlI[0];
    }
}
