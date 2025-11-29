package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.ax  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/ax.class */
class C0024ax extends KeyAdapter {
    final /* synthetic */ C0022av dB;
    private static /* synthetic */ int[] lllIIIlIl;

    static {
        llIIIIlIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public void keyPressed(KeyEvent keyEvent) {
        if (llIIIIlIIlI(this.dB.dz ? 1 : 0)) {
            this.dB.dy.setHotkey(keyEvent.getKeyCode());
            this.dB.dv.setText(KeyEvent.getKeyText(this.dB.dy.getHotkey()));
            this.dB.dz = lllIIIlIl[0];
        }
    }

    private static boolean llIIIIlIIlI(int i2) {
        return i2 != 0;
    }

    private static void llIIIIlIIIl() {
        lllIIIlIl = new int[1];
        lllIIIlIl[0] = (146 ^ 142) & ((159 ^ 131) ^ (-1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0024ax(C0022av c0022av) {
        this.dB = c0022av;
    }
}
