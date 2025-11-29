package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.s  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/s.class */
public abstract class s extends Task {
    public final /* synthetic */ SquireThieving ad;
    public final /* synthetic */ SquireThievingConfig ae;
    private static /* synthetic */ int[] lIIlllIIllIII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean run() {
        return lIllIIllIIIllIl(this.ae.method().equals(EnumC0001b.CHESTS) ? 1 : 0) ? l() : lIIlllIIllIII[0];
    }

    @Inject
    public s(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.ad = squireThieving;
        this.ae = squireThievingConfig;
    }

    private static boolean lIllIIllIIIllIl(int i) {
        return i != 0;
    }

    static {
        lIllIIllIIIllII();
    }

    private static void lIllIIllIIIllII() {
        lIIlllIIllIII = new int[1];
        lIIlllIIllIII[0] = "   ".length() & ("   ".length() ^ (-" ".length()));
    }

    public abstract boolean l();
}
