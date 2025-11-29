package a.n.q.u.l.p000.e.p001.e.s.a.b.r.i.s.u.t.r.c.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Turning run on", priority = 1)
/* renamed from: a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.U  reason: invalid package */
/* loaded from: 06deb524-30dc-422a-b422-0bec548b1d10.jar:a/n/q/u/l/-/e/-/e/s/a/b/r/i/s/u/t/r/c/f/U.class */
public class U extends Task {
    /* synthetic */ int cf = lIIllIlIllII[0];
    private static /* synthetic */ int[] lIIllIlIllII;

    private static boolean llIIlllllIIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean run() {
        if (!llIIlllllIIIIl(Movement.isRunEnabled() ? 1 : 0) && !llIIlllllIIIlI(Movement.getRunEnergy(), this.cf)) {
            Movement.toggleRun();
            this.cf = Rand.nextInt(lIIllIlIllII[2], lIIllIlIllII[3]);
            return lIIllIlIllII[4];
        }
        return lIIllIlIllII[1];
    }

    private static boolean llIIlllllIIIIl(int i) {
        return i != 0;
    }

    static {
        llIIlllllIIIII();
    }

    private static void llIIlllllIIIII() {
        lIIllIlIllII = new int[5];
        lIIllIlIllII[0] = (((32 + 158) - 180) + 165) ^ (((35 + 148) - 67) + 66);
        lIIllIlIllII[1] = (15 ^ 77) & ((122 ^ 56) ^ (-1));
        lIIllIlIllII[2] = (((156 + 143) - 223) + 127) ^ (((3 + 173) - 129) + 149);
        lIIllIlIllII[3] = 141 ^ 191;
        lIIllIlIllII[4] = " ".length();
    }
}
