package p000.r.u.q.e.s.o.t.a.i;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.toa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Perspective;
import net.runelite.client.ui.overlay.OverlayUtil;
@Singleton
/* renamed from: -.r.u.q.e.s.o.t.a.i.s  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/s.class */
public class s extends w {
    private final /* synthetic */ C0004e ay;
    private static /* synthetic */ int[] lIIllllIIllIl;

    public Dimension render(Graphics2D graphics2D) {
        c(graphics2D);
        return null;
    }

    private static void lIllIlIIlIIIlIl() {
        lIIllllIIllIl = new int[3];
        lIIllllIIllIl[0] = (((97 ^ 40) + (((124 + 233) - 161) + 54)) - ((-6346) & 6639)) + ((216 + 92) - 100) + 18;
        lIIllllIIllIl[1] = (42 ^ 53) & ((49 ^ 46) ^ (-1));
        lIIllllIIllIl[2] = 65 ^ 88;
    }

    private static boolean lIllIlIIlIIIllI(int i) {
        return i != 0;
    }

    private void c(Graphics2D graphics2D) {
        Color color = new Color(lIIllllIIllIl[0], lIIllllIIllIl[1], lIIllllIIllIl[1], lIIllllIIllIl[2]);
        for (GraphicsObject graphicsObject : this.ay.d()) {
            Polygon canvasTilePoly = Perspective.getCanvasTilePoly(this.M, graphicsObject.getLocation());
            if (lIllIlIIlIIIlll(canvasTilePoly)) {
                "".length();
                if ((((((95 + 40) - 123) + 222) ^ (((36 + 156) - 47) + 47)) & (((157 ^ 191) ^ (60 ^ 52)) ^ (-" ".length()))) > (((106 ^ 48) ^ (175 ^ 176)) & (((249 ^ 138) ^ (48 ^ 6)) ^ (-" ".length())))) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, color, color, new BasicStroke(0.25f));
                "".length();
                if ((-" ".length()) == ((" ".length() ^ (217 ^ 151)) & (((110 ^ 37) ^ (63 ^ 59)) ^ (-" ".length())))) {
                    return;
                }
            }
        }
    }

    private static boolean lIllIlIIlIIIlll(Object obj) {
        return obj == null;
    }

    static {
        lIllIlIIlIIIlIl();
    }

    @Inject
    protected s(TOAConfig tOAConfig, C0004e c0004e) {
        super(tOAConfig);
        this.ay = c0004e;
    }
}
