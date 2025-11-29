package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking to random tile", priority = 12, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.ac  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/ac.class */
public class ac extends AbstractC0013n {
    private static /* synthetic */ int[] llIIllIIIlll;
    private final /* synthetic */ RectangularArea cm;

    private static void llllllIIlllIlI() {
        llIIllIIIlll = new int[7];
        llIIllIIIlll[0] = " ".length();
        llIIllIIIlll[1] = ((221 ^ 169) ^ (242 ^ 196)) & (((((62 + 107) - 67) + 27) ^ (((116 + 128) - 228) + 179)) ^ (-" ".length()));
        llIIllIIIlll[2] = (-((-2963) & 28567)) & (-1) & 28631;
        llIIllIIIlll[3] = (-10244) & 16367;
        llIIllIIIlll[4] = (-20515) & 23551;
        llIIllIIIlll[5] = (-2067) & 8191;
        llIIllIIIlll[6] = (((96 + 104) - 45) + 10) ^ (((6 + 192) - 134) + 129);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ac(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIllIIIlll[0]];
        enumC0003dArr[llIIllIIIlll[1]] = EnumC0003d.OUTSIDE;
        this.cm = new RectangularArea(llIIllIIIlll[2], llIIllIIIlll[3], llIIllIIIlll[4], llIIllIIIlll[5], llIIllIIIlll[0]);
    }

    private static boolean llllllIIlllIll(int i) {
        return i == 0;
    }

    static {
        llllllIIlllIlI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        if (!llllllIIlllIll(this.ba.h().waitAfterAttempt() ? 1 : 0) && llllllIIllllII(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo(this.cm.getRandomTile());
            "".length();
            sleep(llIIllIIIlll[6]);
            return llIIllIIIlll[0];
        }
        return llIIllIIIlll[1];
    }

    private static boolean llllllIIllllII(int i) {
        return i != 0;
    }
}
