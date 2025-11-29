package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.debug.typer.SquireTyperConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.input.Keyboard;
@TaskDesc(name = "Typing")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.al  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/al.class */
public class C0012al extends Task {
    private static /* synthetic */ int[] llllIIlll;
    @Inject
    private /* synthetic */ SquireTyperConfig cR;

    private static boolean llIIllllllI(int i2) {
        return i2 != 0;
    }

    static {
        llIIlllllIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public boolean run() {
        if (llIIllllllI(this.cR.msg().isEmpty() ? 1 : 0)) {
            return llllIIlll[0];
        }
        Keyboard.type(this.cR.msg(), (boolean) llllIIlll[1]);
        int tickDelay = (int) (this.cR.tickDelay() * 0.1d);
        sleep(Rand.nextInt(this.cR.tickDelay() - tickDelay, this.cR.tickDelay() + tickDelay));
        return llllIIlll[1];
    }

    private static void llIIlllllIl() {
        llllIIlll = new int[2];
        llllIIlll[0] = ((8 ^ 40) ^ (197 ^ 189)) & (((39 ^ 123) ^ (153 ^ 157)) ^ (-" ".length()));
        llllIIlll[1] = " ".length();
    }
}
