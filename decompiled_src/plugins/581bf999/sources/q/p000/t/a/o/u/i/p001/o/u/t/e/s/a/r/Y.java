package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Client;
@TaskDesc(name = "Preventing Logout")
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Y  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/Y.class */
public class Y extends Task {
    private static /* synthetic */ int[] llIlllIIlII;
    private /* synthetic */ long cq;
    @Inject
    private /* synthetic */ Client ai;

    private static boolean lIlIlIllIIIIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    private boolean aW() {
        int keyboardIdleTicks = this.ai.getKeyboardIdleTicks();
        if (lIlIlIllIIIIIl(this.ai.getMouseIdleTicks(), keyboardIdleTicks)) {
            keyboardIdleTicks = this.ai.getMouseIdleTicks();
        }
        if (lIlIlIllIIIIlI(lIlIlIllIIIIII(keyboardIdleTicks, this.cq))) {
            ?? r0 = llIlllIIlII[0];
            "".length();
            return "  ".length() == "   ".length() ? ((((19 + 69) - 7) + 49) ^ (((31 + 4) - (-56)) + 78)) & (((((66 + 69) - 109) + 114) ^ (((69 + 30) - 44) + 112)) ^ (-" ".length())) : r0;
        }
        return llIlllIIlII[1];
    }

    static {
        lIlIlIlIlllllI();
    }

    private long aU() {
        return (long) a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0d));
    }

    private static boolean lIlIlIlIllllll(int i) {
        return i != 0;
    }

    private static void lIlIlIlIlllllI() {
        llIlllIIlII = new int[7];
        llIlllIIlII[0] = " ".length();
        llIlllIIlII[1] = (10 ^ 76) & ((249 ^ 191) ^ (-1));
        llIlllIIlII[2] = (-30311) & 30711;
        llIlllIIlII[3] = (-((-16659) & 19383)) & (-24899) & 28646;
        llIlllIIlII[4] = 146 ^ 154;
        llIlllIIlII[5] = (-11881) & 12282;
        llIlllIIlII[6] = (-39) & 438;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean run() {
        if (lIlIlIlIllllll(aW() ? 1 : 0)) {
            this.cq = aU();
            Executors.newSingleThreadExecutor().submit(this::aV);
            "".length();
            return llIlllIIlII[0];
        }
        return llIlllIIlII[1];
    }

    private void aV() {
        this.ai.getCanvas().dispatchEvent(new KeyEvent(this.ai.getCanvas(), llIlllIIlII[2], System.currentTimeMillis(), llIlllIIlII[3], llIlllIIlII[4]));
        this.ai.getCanvas().dispatchEvent(new KeyEvent(this.ai.getCanvas(), llIlllIIlII[5], System.currentTimeMillis(), llIlllIIlII[1], llIlllIIlII[4]));
        this.ai.getCanvas().dispatchEvent(new KeyEvent(this.ai.getCanvas(), llIlllIIlII[6], System.currentTimeMillis(), llIlllIIlII[1], llIlllIIlII[4]));
    }

    private double a(double d) {
        return Math.max(1.0d, Math.min(13000.0d, d));
    }

    private static boolean lIlIlIllIIIIlI(int i) {
        return i >= 0;
    }

    private static int lIlIlIllIIIIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
