package p000.r.u.q.e.s.o.t.a.i;

import gg.squire.toa.TOAConfig;
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
/* renamed from: -.r.u.q.e.s.o.t.a.i.u  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/u.class */
public class u extends Overlay {
    private final /* synthetic */ C0007h aD;
    private final /* synthetic */ TOAConfig aE;
    private final /* synthetic */ Client aC;

    public Dimension render(Graphics2D graphics2D) {
        f(graphics2D);
        e(graphics2D);
        return null;
    }

    private static boolean lIllIlIIllllIIl(Object obj) {
        return obj == null;
    }

    private void e(Graphics2D graphics2D) {
        if (lIllIlIIlllIllI(this.aE.showOrbs() ? 1 : 0)) {
            return;
        }
        for (NPC npc : this.aD.k()) {
            Shape convexHull = npc.getConvexHull();
            if (lIllIlIIllllIII(convexHull)) {
                OverlayUtil.renderPolygon(graphics2D, convexHull, ColorScheme.BRAND_ORANGE, new BasicStroke(1.0f));
            }
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return;
            }
        }
    }

    private static boolean lIllIlIIlllIllI(int i) {
        return i == 0;
    }

    @Inject
    protected u(Client client, C0007h c0007h, TOAConfig tOAConfig) {
        this.aC = client;
        this.aD = c0007h;
        this.aE = tOAConfig;
        setPriority(OverlayPriority.HIGH);
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.UNDER_WIDGETS);
    }

    private static boolean lIllIlIIllllIII(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlIIlllIlll(int i) {
        return i != 0;
    }

    private void f(Graphics2D graphics2D) {
        if (lIllIlIIlllIllI(this.aE.outlineMirrors() ? 1 : 0)) {
            return;
        }
        for (TileObject tileObject : this.aD.j()) {
            Polygon canvasTilePoly = tileObject.getCanvasTilePoly();
            if (lIllIlIIllllIIl(canvasTilePoly)) {
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, ColorScheme.BRAND_YELLOW, new BasicStroke(1.0f));
                "".length();
                if ("  ".length() <= (-" ".length())) {
                    return;
                }
            }
        }
    }
}
