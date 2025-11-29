/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.a;

@TaskDesc(name="Initialization")
public class f
extends Task {
    private final /* synthetic */ a z;
    private static /* synthetic */ int[] lIllIIlllIIll;

    static {
        f.llIIIllIllllIIl();
    }

    private static void llIIIllIllllIIl() {
        lIllIIlllIIll = new int[3];
        f.lIllIIlllIIll[0] = -" ".length();
        f.lIllIIlllIIll[1] = (0x17 ^ 0x4F) & ~(0x2F ^ 0x77);
        f.lIllIIlllIIll[2] = " ".length();
    }

    private static boolean llIIIllIllllIlI(int n, int n2) {
        return n != n2;
    }

    public boolean run() {
        if (f.llIIIllIllllIlI(this.z.j(), lIllIIlllIIll[0])) {
            return lIllIIlllIIll[1];
        }
        this.z.d();
        return lIllIIlllIIll[2];
    }

    @Inject
    public f(a a2) {
        this.z = a2;
    }
}

