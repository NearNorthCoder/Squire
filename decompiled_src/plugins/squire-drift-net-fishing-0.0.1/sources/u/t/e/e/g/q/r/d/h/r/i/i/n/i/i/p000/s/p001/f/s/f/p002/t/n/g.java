package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.p000.s.p001.f.s.f.p002.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.driftnet.SquireDriftNet;
import javax.inject.Inject;
import net.runelite.api.Client;
@TaskDesc(name = "Figuring out what harpoon we are using", priority = Integer.MAX_VALUE, blocking = true)
/* renamed from: u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n.g  reason: invalid package */
/* loaded from: squire-drift-net-fishing-0.0.1.jar:u/t/e/e/g/q/r/d/h/r/i/i/n/i/i/-/s/-/f/s/f/-/t/n/g.class */
public class g extends Task {
    private static /* synthetic */ int[] lIlIIIIIlIll;
    private final /* synthetic */ Client C;
    private final /* synthetic */ SquireDriftNet B;

    static {
        llIlIIllIlIlII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    public boolean run() {
        if (llIlIIllIlIlIl(this.B.d().isEmpty() ? 1 : 0)) {
            return lIlIIIIIlIll[0];
        }
        this.B.a(this.B.a());
        if (llIlIIllIlIlIl(this.B.d().isEmpty() ? 1 : 0)) {
            this.B.b();
        }
        return lIlIIIIIlIll[1];
    }

    private static boolean llIlIIllIlIlIl(int i) {
        return i == 0;
    }

    @Inject
    public g(SquireDriftNet squireDriftNet, Client client) {
        this.B = squireDriftNet;
        this.C = client;
    }

    private static void llIlIIllIlIlII() {
        lIlIIIIIlIll = new int[2];
        lIlIIIIIlIll[0] = " ".length() & (" ".length() ^ (-" ".length()));
        lIlIIIIIlIll[1] = " ".length();
    }
}
