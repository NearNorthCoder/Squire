package m.u.a.p000.e.s.q.t.i.r;

import gg.squire.mta.SquireMTA;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.inject.Inject;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
/* renamed from: m.u.a.-.e.s.q.t.i.r.q  reason: invalid package */
/* loaded from: squire-mta-0.2.1.jar:m/u/a/-/e/s/q/t/i/r/q.class */
public class q extends Overlay {
    private final /* synthetic */ SquireMTA ar;
    private static /* synthetic */ int[] lllIlIlIIlII;

    private static boolean lIIIlIlllllllII(int i, int i2) {
        return i < i2;
    }

    static {
        lIIIlIllllllIll();
    }

    private static boolean lIIIlIlllllllIl(int i) {
        return i != 0;
    }

    private static void lIIIlIllllllIll() {
        lllIlIlIIlII = new int[1];
        lllIlIlIIlII[0] = ((231 ^ 168) ^ (126 ^ 117)) & (((91 ^ 112) ^ (228 ^ 139)) ^ (-" ".length()));
    }

    public Dimension render(Graphics2D graphics2D) {
        b[] b = this.ar.b();
        int length = b.length;
        int i = lllIlIlIIlII[0];
        while (lIIIlIlllllllII(i, length)) {
            b bVar = b[i];
            if (lIIIlIlllllllIl(bVar.c() ? 1 : 0)) {
                graphics2D.setFont(FontManager.getRunescapeFont());
                bVar.a(graphics2D);
            }
            i++;
            "".length();
            if (((196 ^ 158) ^ (33 ^ 127)) == "  ".length()) {
                return null;
            }
        }
        return null;
    }

    @Inject
    public q(SquireMTA squireMTA) {
        this.ar = squireMTA;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
    }
}
