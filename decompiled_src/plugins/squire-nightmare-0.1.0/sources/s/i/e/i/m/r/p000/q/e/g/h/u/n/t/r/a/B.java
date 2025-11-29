package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Client;
@TaskDesc(name = "Preventing Logout")
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.B  reason: invalid package */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/B.class */
public class B extends Task {
    @Inject
    private /* synthetic */ Client bv;
    private static /* synthetic */ int[] lllIllIlIllI;
    private /* synthetic */ long cG;

    private static void lIIIllIlIIllllI() {
        lllIllIlIllI = new int[7];
        lllIllIlIllI[0] = " ".length();
        lllIllIlIllI[1] = ((((195 + 70) - 226) + 211) ^ (((61 + 102) - 25) + 27)) & (((134 ^ 140) ^ (3 ^ 86)) ^ (-" ".length()));
        lllIllIlIllI[2] = (-((-417) & 22507)) & (-2085) & 24575;
        lllIllIlIllI[3] = (-((-5121) & 16048)) & (-337) & 12287;
        lllIllIlIllI[4] = (((126 + 30) - 125) + 155) ^ (((167 + 4) - 1) + 8);
        lllIllIlIllI[5] = (-((-259) & 24391)) & (-8194) & 32727;
        lllIllIlIllI[6] = (-14377) & 14776;
    }

    static {
        lIIIllIlIIllllI();
    }

    private long bV() {
        return (long) b(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0d));
    }

    private static boolean lIIIllIlIlIIIIl(int i, int i2) {
        return i < i2;
    }

    private double b(double d) {
        return Math.max(1.0d, Math.min(13000.0d, d));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIIIllIlIIlllll(bX() ? 1 : 0)) {
            this.cG = bV();
            Executors.newSingleThreadExecutor().submit(this::bW);
            "".length();
            return lllIllIlIllI[0];
        }
        return lllIllIlIllI[1];
    }

    private static boolean lIIIllIlIIlllll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    private boolean bX() {
        int keyboardIdleTicks = this.bv.getKeyboardIdleTicks();
        if (lIIIllIlIlIIIIl(this.bv.getMouseIdleTicks(), keyboardIdleTicks)) {
            keyboardIdleTicks = this.bv.getMouseIdleTicks();
        }
        if (lIIIllIlIlIIIlI(lIIIllIlIlIIIII(keyboardIdleTicks, this.cG))) {
            ?? r0 = lllIllIlIllI[0];
            "".length();
            return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIlIllI[1];
    }

    private static boolean lIIIllIlIlIIIlI(int i) {
        return i >= 0;
    }

    private void bW() {
        this.bv.getCanvas().dispatchEvent(new KeyEvent(this.bv.getCanvas(), lllIllIlIllI[2], System.currentTimeMillis(), lllIllIlIllI[3], lllIllIlIllI[4]));
        this.bv.getCanvas().dispatchEvent(new KeyEvent(this.bv.getCanvas(), lllIllIlIllI[5], System.currentTimeMillis(), lllIllIlIllI[1], lllIllIlIllI[4]));
        this.bv.getCanvas().dispatchEvent(new KeyEvent(this.bv.getCanvas(), lllIllIlIllI[6], System.currentTimeMillis(), lllIllIlIllI[1], lllIllIlIllI[4]));
    }

    private static int lIIIllIlIlIIIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
