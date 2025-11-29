package h.s.r.p000.r.e.z.n.e.r.r.q.a.a.e.t.p001.f.i.c.e.u.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
@TaskDesc(name = "Initialization")
/* renamed from: h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.f  reason: invalid package */
/* loaded from: d11e2dee-7190-435e-95f6-a7b9761c02e8.jar:h/s/r/-/r/e/z/n/e/r/r/q/a/a/e/t/-/f/i/c/e/u/u/f.class */
public class f extends Task {
    private final /* synthetic */ a z;
    private static /* synthetic */ int[] lIllIIlllIIll;

    static {
        llIIIllIllllIIl();
    }

    private static void llIIIllIllllIIl() {
        lIllIIlllIIll = new int[3];
        lIllIIlllIIll[0] = -" ".length();
        lIllIIlllIIll[1] = (23 ^ 79) & ((47 ^ 119) ^ (-1));
        lIllIIlllIIll[2] = " ".length();
    }

    private static boolean llIIIllIllllIlI(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (llIIIllIllllIlI(this.z.j(), lIllIIlllIIll[0])) {
            return lIllIIlllIIll[1];
        }
        this.z.d();
        return lIllIIlllIIll[2];
    }

    @Inject
    public f(a aVar) {
        this.z = aVar;
    }
}
