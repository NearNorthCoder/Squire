package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import gg.squire.sepulchre.SquireSepulchre;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.util.List;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.Static;
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.M  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/M.class */
public class M extends Overlay {
    private final /* synthetic */ SquireSepulchre ad;

    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        for (WorldPoint worldPoint : list) {
            LocalPoint fromWorld = LocalPoint.fromWorld(Static.getClient(), worldPoint);
            if (lIIIlIIllIIIIII(fromWorld)) {
                "".length();
                if (((232 ^ 194) & ((112 ^ 90) ^ (-1))) >= " ".length()) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, Perspective.getCanvasTilePoly(Static.getClient(), fromWorld), color);
                "".length();
                if ((-(19 ^ 23)) >= 0) {
                    return;
                }
            }
        }
    }

    @Inject
    public M(SquireSepulchre squireSepulchre) {
        this.ad = squireSepulchre;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
    }

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    private static boolean lIIIlIIlIllllll(int i) {
        return i != 0;
    }

    private static boolean lIIIlIIllIIIIII(Object obj) {
        return obj == null;
    }
}
