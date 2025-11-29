package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.duke.SquireDukeSucellus;
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
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.i  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/i.class */
public class C0008i extends Overlay {
    private final /* synthetic */ SquireDukeSucellus af;

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    @Inject
    public C0008i(SquireDukeSucellus squireDukeSucellus) {
        this.af = squireDukeSucellus;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean lllIIllllIlllI(int i) {
        return i != 0;
    }

    private static boolean lllIIllllIllll(Object obj) {
        return obj == null;
    }

    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        for (WorldPoint worldPoint : list) {
            LocalPoint fromWorld = LocalPoint.fromWorld(Static.getClient(), worldPoint);
            if (lllIIllllIllll(fromWorld)) {
                "".length();
                if (((((32 + 134) - 161) + 159) ^ (((93 + 26) - 83) + 124)) < ((((118 + 67) - 133) + 81) ^ (((90 + 38) - 81) + 82))) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, Perspective.getCanvasTilePoly(Static.getClient(), fromWorld), color);
                "".length();
                if ((true ^ true) != (true ^ true)) {
                    return;
                }
            }
        }
    }
}
