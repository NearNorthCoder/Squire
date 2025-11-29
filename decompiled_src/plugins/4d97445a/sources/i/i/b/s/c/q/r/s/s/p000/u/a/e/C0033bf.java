package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.prayer.prayerflicker.SquirePrayFlick;
import java.awt.event.KeyEvent;
import net.runelite.client.input.KeyListener;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bf  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bf.class */
public class C0033bf implements KeyListener {
    final /* synthetic */ SquirePrayFlick fw;
    private static /* synthetic */ int[] lllIIIIlI;

    private static boolean llIIIIIllll(int i2) {
        return i2 != 0;
    }

    static {
        llIIIIIlllI();
    }

    private static void llIIIIIlllI() {
        lllIIIIlI = new int[2];
        lllIIIIlI[0] = " ".length();
        lllIIIIlI[1] = (252 ^ 170) & ((108 ^ 58) ^ (-1));
    }

    public C0033bf(SquirePrayFlick squirePrayFlick) {
        this.fw = squirePrayFlick;
    }

    public void keyReleased(KeyEvent keyEvent) {
        if (llIIIIIllll(this.fw.ft.flickHotkey().matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }

    private static boolean llIIIIlIIII(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void keyPressed(KeyEvent keyEvent) {
        boolean z;
        if (llIIIIIllll(this.fw.ft.flickHotkey().matches(keyEvent) ? 1 : 0)) {
            SquirePrayFlick squirePrayFlick = this.fw;
            if (llIIIIlIIII(this.fw.fu ? 1 : 0)) {
                int i2 = lllIIIIlI[0];
                "".length();
                z = i2;
                if ("   ".length() < " ".length()) {
                    return;
                }
            } else {
                z = lllIIIIlI[1];
            }
            squirePrayFlick.fu = z;
            keyEvent.consume();
        }
    }

    public void keyTyped(KeyEvent keyEvent) {
        if (llIIIIIllll(this.fw.ft.flickHotkey().matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }
}
