/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Client;

@TaskDesc(name="Preventing Logout")
public class Y
extends Task {
    private static /* synthetic */ int[] llIlllIIlII;
    private /* synthetic */ long cq;
    @Inject
    private /* synthetic */ Client ai;

    private static boolean lIlIlIllIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private boolean aW() {
        boolean bl2;
        Y llllllllllllllllIIlIlIllIlIIIlIl;
        int llllllllllllllllIIlIlIllIlIIIlII;
        int n2 = this.ai.getKeyboardIdleTicks();
        if (Y.lIlIlIllIIIIIl(this.ai.getMouseIdleTicks(), n2)) {
            llllllllllllllllIIlIlIllIlIIIlII = this.ai.getMouseIdleTicks();
        }
        if (Y.lIlIlIllIIIIlI(Y.lIlIlIllIIIIII(llllllllllllllllIIlIlIllIlIIIlII, llllllllllllllllIIlIlIllIlIIIlIl.cq))) {
            bl2 = llIlllIIlII[0];
            "".length();
            if ("  ".length() == "   ".length()) {
                return ((19 + 69 - 7 + 49 ^ 31 + 4 - -56 + 78) & (66 + 69 - 109 + 114 ^ 69 + 30 - 44 + 112 ^ -" ".length())) != 0;
            }
        } else {
            bl2 = llIlllIIlII[1];
        }
        return bl2;
    }

    static {
        Y.lIlIlIlIlllllI();
    }

    private long aU() {
        return (long)this.a(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private static boolean lIlIlIlIllllll(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIlIlllllI() {
        llIlllIIlII = new int[7];
        Y.llIlllIIlII[0] = " ".length();
        Y.llIlllIIlII[1] = (0xA ^ 0x4C) & ~(0xF9 ^ 0xBF);
        Y.llIlllIIlII[2] = 0xFFFF8999 & 0x77F7;
        Y.llIlllIIlII[3] = -(0xFFFFBEED & 0x4BB7) & (0xFFFF9EBD & 0x6FE6);
        Y.llIlllIIlII[4] = 0x92 ^ 0x9A;
        Y.llIlllIIlII[5] = 0xFFFFD197 & 0x2FFA;
        Y.llIlllIIlII[6] = 0xFFFFFFD9 & 0x1B6;
    }

    public boolean run() {
        if (Y.lIlIlIlIllllll(this.aW() ? 1 : 0)) {
            this.cq = this.aU();
            Executors.newSingleThreadExecutor().submit(this::aV);
            "".length();
            return llIlllIIlII[0];
        }
        return llIlllIIlII[1];
    }

    private void aV() {
        KeyEvent keyEvent = new KeyEvent(this.ai.getCanvas(), llIlllIIlII[2], System.currentTimeMillis(), llIlllIIlII[3], llIlllIIlII[4]);
        this.ai.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.ai.getCanvas(), llIlllIIlII[5], System.currentTimeMillis(), llIlllIIlII[1], llIlllIIlII[4]);
        this.ai.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.ai.getCanvas(), llIlllIIlII[6], System.currentTimeMillis(), llIlllIIlII[1], llIlllIIlII[4]);
        this.ai.getCanvas().dispatchEvent(keyEvent3);
    }

    private double a(double d2) {
        return Math.max(1.0, Math.min(13000.0, d2));
    }

    private static boolean lIlIlIllIIIIlI(int n2) {
        return n2 >= 0;
    }

    private static int lIlIlIllIIIIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

