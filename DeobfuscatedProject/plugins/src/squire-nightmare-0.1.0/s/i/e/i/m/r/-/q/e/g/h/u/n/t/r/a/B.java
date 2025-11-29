/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import net.runelite.api.Client;

@TaskDesc(name="Preventing Logout")
public class B
extends Task {
    @Inject
    private /* synthetic */ Client bv;
    private static /* synthetic */ int[] lllIllIlIllI;
    private /* synthetic */ long cG;

    private static void lIIIllIlIIllllI() {
        lllIllIlIllI = new int[7];
        B.lllIllIlIllI[0] = " ".length();
        B.lllIllIlIllI[1] = (195 + 70 - 226 + 211 ^ 61 + 102 - 25 + 27) & (0x86 ^ 0x8C ^ (3 ^ 0x56) ^ -" ".length());
        B.lllIllIlIllI[2] = -(0xFFFFFE5F & 0x57EB) & (0xFFFFF7DB & 0x5FFF);
        B.lllIllIlIllI[3] = -(0xFFFFEBFF & 0x3EB0) & (0xFFFFFEAF & 0x2FFF);
        B.lllIllIlIllI[4] = 126 + 30 - 125 + 155 ^ 167 + 4 - 1 + 8;
        B.lllIllIlIllI[5] = -(0xFFFFFEFD & 0x5F47) & (0xFFFFDFFE & 0x7FD7);
        B.lllIllIlIllI[6] = 0xFFFFC7D7 & 0x39B8;
    }

    static {
        B.lIIIllIlIIllllI();
    }

    private long bV() {
        return (long)this.b(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000.0));
    }

    private static boolean lIIIllIlIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private double b(double d2) {
        return Math.max(1.0, Math.min(13000.0, d2));
    }

    public boolean run() {
        if (B.lIIIllIlIIlllll(this.bX() ? 1 : 0)) {
            this.cG = this.bV();
            Executors.newSingleThreadExecutor().submit(this::bW);
            "".length();
            return lllIllIlIllI[0];
        }
        return lllIllIlIllI[1];
    }

    private static boolean lIIIllIlIIlllll(int n2) {
        return n2 != 0;
    }

    private boolean bX() {
        boolean bl;
        B lllllllllllllllIIllIIllIllllIlll;
        int lllllllllllllllIIllIIllIllllIllI;
        int n2 = this.bv.getKeyboardIdleTicks();
        if (B.lIIIllIlIlIIIIl(this.bv.getMouseIdleTicks(), n2)) {
            lllllllllllllllIIllIIllIllllIllI = this.bv.getMouseIdleTicks();
        }
        if (B.lIIIllIlIlIIIlI(B.lIIIllIlIlIIIII(lllllllllllllllIIllIIllIllllIllI, lllllllllllllllIIllIIllIllllIlll.cG))) {
            bl = lllIllIlIllI[0];
            "".length();
            if ("   ".length() <= -" ".length()) {
                return ((0x45 ^ 0x60) & ~(0x62 ^ 0x47)) != 0;
            }
        } else {
            bl = lllIllIlIllI[1];
        }
        return bl;
    }

    private static boolean lIIIllIlIlIIIlI(int n2) {
        return n2 >= 0;
    }

    private void bW() {
        KeyEvent keyEvent = new KeyEvent(this.bv.getCanvas(), lllIllIlIllI[2], System.currentTimeMillis(), lllIllIlIllI[3], lllIllIlIllI[4]);
        this.bv.getCanvas().dispatchEvent(keyEvent);
        KeyEvent keyEvent2 = new KeyEvent(this.bv.getCanvas(), lllIllIlIllI[5], System.currentTimeMillis(), lllIllIlIllI[1], lllIllIlIllI[4]);
        this.bv.getCanvas().dispatchEvent(keyEvent2);
        KeyEvent keyEvent3 = new KeyEvent(this.bv.getCanvas(), lllIllIlIllI[6], System.currentTimeMillis(), lllIllIlIllI[1], lllIllIlIllI[4]);
        this.bv.getCanvas().dispatchEvent(keyEvent3);
    }

    private static int lIIIllIlIlIIIII(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }
}

