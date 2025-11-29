package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.questing.SquireQuestHelper;
import java.awt.event.KeyEvent;
import net.runelite.client.input.KeyListener;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bh  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bh.class */
public class C0035bh implements KeyListener {
    private static /* synthetic */ int[] llIIIlIII;
    final /* synthetic */ SquireQuestHelper fE;

    private static boolean lIlIlIllIIl(int i2) {
        return i2 != 0;
    }

    public void keyTyped(KeyEvent keyEvent) {
        if (lIlIlIllIIl(this.fE.fA.pauseRestart().matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }

    public C0035bh(SquireQuestHelper squireQuestHelper) {
        this.fE = squireQuestHelper;
    }

    public void keyReleased(KeyEvent keyEvent) {
        if (lIlIlIllIIl(this.fE.fA.pauseRestart().matches(keyEvent) ? 1 : 0)) {
            keyEvent.consume();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void keyPressed(KeyEvent keyEvent) {
        boolean z;
        if (lIlIlIllIIl(this.fE.fA.pauseRestart().matches(keyEvent) ? 1 : 0)) {
            SquireQuestHelper squireQuestHelper = this.fE;
            if (lIlIlIllIlI(this.fE.fu ? 1 : 0)) {
                int i2 = llIIIlIII[0];
                "".length();
                z = i2;
                if ((-"   ".length()) > 0) {
                    return;
                }
            } else {
                z = llIIIlIII[1];
            }
            squireQuestHelper.fu = z;
            keyEvent.consume();
        }
    }

    private static boolean lIlIlIllIlI(int i2) {
        return i2 == 0;
    }

    static {
        lIlIlIllIII();
    }

    private static void lIlIlIllIII() {
        llIIIlIII = new int[2];
        llIIIlIII[0] = " ".length();
        llIIIlIII[1] = (43 ^ 44) & ((155 ^ 156) ^ (-1));
    }
}
