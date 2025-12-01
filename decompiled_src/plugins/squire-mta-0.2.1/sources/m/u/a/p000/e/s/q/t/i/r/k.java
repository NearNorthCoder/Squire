package m.u.a.p000.e.s.q.t.i.r;

import java.awt.Color;
import java.awt.image.BufferedImage;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.ui.overlay.infobox.Counter;
/* renamed from: m.u.a.-.e.s.q.t.i.r.k  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/k.class */
public class k extends Counter {
    private static /* synthetic */ int[] lllIllIIIlII;

    static {
        lIIIllIIllIlIlI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(BufferedImage bufferedImage, Plugin plugin) {
        super(bufferedImage, plugin, lllIllIIIlII[0]);
    }

    public Color getTextColor() {
        int lllllllllllllllIIllIlIIIlIlllIll = getCount();
        return lIIIllIIllIlIll(lllllllllllllllIIllIlIIIlIlllIll, lllIllIIIlII[1]) ? Color.GREEN : lIIIllIIllIllII(lllllllllllllllIIllIlIIIlIlllIll) ? Color.RED : Color.ORANGE;
    }

    private static boolean lIIIllIIllIllII(int i) {
        return i == 0;
    }

    private static boolean lIIIllIIllIlIll(int i, int i2) {
        return i >= i2;
    }

    private static void lIIIllIIllIlIlI() {
        lllIllIIIlII = new int[2];
        lllIllIIIlII[0] = (40 ^ 44) & ((184 ^ 188) ^ (-1));
        lllIllIIIlII[1] = (50 ^ 37) ^ (83 ^ 84);
    }
}
