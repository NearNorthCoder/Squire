package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Enabling run", priority = 30000)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.af  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/af.class */
public class C0006af extends Task {
    private static /* synthetic */ int[] lIlIllIlIIll;
    private /* synthetic */ int cI = lIlIllIlIIll[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean cB() {
        if (!lllIIIIIlIIIII(Movement.getRunEnergy(), this.cI) && !lllIIIIIlIIIIl(Movement.isRunEnabled() ? 1 : 0)) {
            this.cI = Rand.nextInt(lIlIllIlIIll[2], lIlIllIlIIll[3]);
            Movement.toggleRun();
            return lIlIllIlIIll[2];
        }
        return lIlIllIlIIll[1];
    }

    private static void lllIIIIIIlllll() {
        lIlIllIlIIll = new int[4];
        lIlIllIlIIll[0] = (((134 + 26) - 116) + 137) ^ (((68 + 112) - 33) + 30);
        lIlIllIlIIll[1] = (217 ^ 152) & ((68 ^ 5) ^ (-1));
        lIlIllIlIIll[2] = " ".length();
        lIlIllIlIIll[3] = 32 ^ 37;
    }

    private static boolean lllIIIIIlIIIIl(int i) {
        return i != 0;
    }

    private static boolean lllIIIIIlIIIII(int i, int i2) {
        return i < i2;
    }

    static {
        lllIIIIIIlllll();
    }

    public boolean run() {
        return cB();
    }
}
