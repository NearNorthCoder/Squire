package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Client;
@TaskDesc(name = "Preventing Logout")
/* renamed from: -.r.u.q.e.s.o.t.a.i.B  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/B.class */
public class B extends Task {
    private static /* synthetic */ int[] lIlIIIIIIIllI;
    private /* synthetic */ long aV;
    @Inject
    private /* synthetic */ Client M;

    private static boolean lIllIlIllIlllll(int i) {
        return i != 0;
    }

    private double a(double d) {
        return Math.max(1.0d, Math.min(13000.0d, d));
    }

    private long K() {
        return (long) a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0d));
    }

    private static void lIllIlIllIllllI() {
        lIlIIIIIIIllI = new int[7];
        lIlIIIIIIIllI[0] = " ".length();
        lIlIIIIIIIllI[1] = (122 ^ 42) & ((194 ^ 146) ^ (-1));
        lIlIIIIIIIllI[2] = (-((-131) & 31407)) & (-1025) & 32701;
        lIlIIIIIIIllI[3] = (-11161) & 12184;
        lIlIIIIIIIllI[4] = (92 ^ 89) ^ (93 ^ 80);
        lIlIIIIIIIllI[5] = (-((-17434) & 26139)) & (-1069) & 10175;
        lIlIIIIIIIllI[6] = (-17510) & 17909;
    }

    private void L() {
        this.M.getCanvas().dispatchEvent(new KeyEvent(this.M.getCanvas(), lIlIIIIIIIllI[2], System.currentTimeMillis(), lIlIIIIIIIllI[3], lIlIIIIIIIllI[4]));
        this.M.getCanvas().dispatchEvent(new KeyEvent(this.M.getCanvas(), lIlIIIIIIIllI[5], System.currentTimeMillis(), lIlIIIIIIIllI[1], lIlIIIIIIIllI[4]));
        this.M.getCanvas().dispatchEvent(new KeyEvent(this.M.getCanvas(), lIlIIIIIIIllI[6], System.currentTimeMillis(), lIlIIIIIIIllI[1], lIlIIIIIIIllI[4]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    private boolean M() {
        int keyboardIdleTicks = this.M.getKeyboardIdleTicks();
        if (lIllIlIlllIIIIl(this.M.getMouseIdleTicks(), keyboardIdleTicks)) {
            keyboardIdleTicks = this.M.getMouseIdleTicks();
        }
        if (lIllIlIlllIIIlI(lIllIlIlllIIIII(keyboardIdleTicks, this.aV))) {
            ?? r0 = lIlIIIIIIIllI[0];
            "".length();
            return (-" ".length()) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIIIIIIllI[1];
    }

    static {
        lIllIlIllIllllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIllIlIllIlllll(M() ? 1 : 0)) {
            this.aV = K();
            Executors.newSingleThreadExecutor().submit(this::L);
            "".length();
            return lIlIIIIIIIllI[0];
        }
        return lIlIIIIIIIllI[1];
    }

    private static boolean lIllIlIlllIIIIl(int i, int i2) {
        return i < i2;
    }

    private static int lIllIlIlllIIIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean lIllIlIlllIIIlI(int i) {
        return i >= 0;
    }
}
