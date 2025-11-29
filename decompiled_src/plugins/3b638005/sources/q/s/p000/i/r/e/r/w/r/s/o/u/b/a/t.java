package q.s.p000.i.r.e.r.w.r.s.o.u.b.a;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.unethicalite.api.game.House;
@TaskDesc(name = "Drinking from pool", priority = 250, blocking = true)
/* renamed from: q.s.-.i.r.e.r.w.r.s.o.u.b.a.t  reason: invalid package */
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:q/s/-/i/r/e/r/w/r/s/o/u/b/a/t.class */
public class t extends Task {
    private static /* synthetic */ int[] lllIlllllIl;
    private final /* synthetic */ SquireBarrows af;

    private static boolean lIllIIlIlIlllI(int i) {
        return i == 0;
    }

    @Inject
    public t(SquireBarrows squireBarrows) {
        this.af = squireBarrows;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public boolean run() {
        if (lIllIIlIlIlllI(House.isInside() ? 1 : 0)) {
            return lllIlllllIl[0];
        }
        this.af.b((boolean) lllIlllllIl[0]);
        return lIllIIlIlIlllI(House.isPoolDrinkUseful() ? 1 : 0) ? lllIlllllIl[0] : House.drinkFromPool();
    }

    static {
        lIllIIlIlIllIl();
    }

    private static void lIllIIlIlIllIl() {
        lllIlllllIl = new int[1];
        lllIlllllIl[0] = ((((92 + 158) - 95) + 40) ^ (((131 + 18) - 2) + 9)) & (((((112 + 126) - 213) + 212) ^ (((52 + 123) - 156) + 159)) ^ (-" ".length()));
    }
}
