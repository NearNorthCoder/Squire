package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.OverlayUtil;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Q  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/Q.class */
public class Q extends Overlay {
    private final /* synthetic */ TOAConfig bR;
    private final /* synthetic */ C0064m bQ;
    private final /* synthetic */ Client bP;

    public Dimension render(Graphics2D graphics2D) {
        f(graphics2D);
        e(graphics2D);
        return null;
    }

    private void f(Graphics2D graphics2D) {
        for (TileObject tileObject : this.bQ.H()) {
            Polygon canvasTilePoly = tileObject.getCanvasTilePoly();
            if (lIlIIlIlIIllll(canvasTilePoly)) {
                "".length();
                if ((((((117 + 150) - 103) + 26) ^ (((25 + 88) - 91) + 125)) & (((54 ^ 102) ^ (110 ^ 19)) ^ (-" ".length()))) < (((56 ^ 65) ^ (35 ^ 28)) & (((145 ^ 176) ^ (43 ^ 76)) ^ (-" ".length())))) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, ColorScheme.BRAND_YELLOW, new BasicStroke(1.0f));
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
    }

    private void e(Graphics2D graphics2D) {
        for (NPC npc : this.bQ.I()) {
            Shape convexHull = npc.getConvexHull();
            if (lIlIIlIlIIlllI(convexHull)) {
                OverlayUtil.renderPolygon(graphics2D, convexHull, ColorScheme.BRAND_ORANGE, new BasicStroke(1.0f));
            }
            "".length();
            if (0 != 0) {
                return;
            }
        }
    }

    private static boolean lIlIIlIlIIlllI(Object obj) {
        return obj != null;
    }

    @Inject
    protected Q(Client client, C0064m c0064m, TOAConfig tOAConfig) {
        this.bP = client;
        this.bQ = c0064m;
        this.bR = tOAConfig;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIlIIlIlIIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIlIlIIllIl(int i) {
        return i != 0;
    }
}
