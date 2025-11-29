package r.r.s.u.p000.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.scurrius.SquireScurrius;
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
/* renamed from: r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.e  reason: invalid package */
/* loaded from: 5c667a01-93f1-4288-83c1-de3f0a449bc2.jar:r/r/s/u/-/s/i/e/u/u/r/i/q/c/s/e.class */
public class e extends Overlay {
    private final /* synthetic */ SquireScurrius L;

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        for (WorldPoint worldPoint : list) {
            LocalPoint fromWorld = LocalPoint.fromWorld(Static.getClient(), worldPoint);
            if (lIlIllIIIlIlIII(fromWorld)) {
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, Perspective.getCanvasTilePoly(Static.getClient(), fromWorld), color);
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
        }
    }

    @Inject
    public e(SquireScurrius squireScurrius) {
        this.L = squireScurrius;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean lIlIllIIIlIIlll(int i) {
        return i != 0;
    }

    private static boolean lIlIllIIIlIlIII(Object obj) {
        return obj == null;
    }
}
