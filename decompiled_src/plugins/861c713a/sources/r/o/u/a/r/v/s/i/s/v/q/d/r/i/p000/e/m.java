package r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e;

import com.google.inject.Inject;
import gg.squire.vardorvis.SquireVardorvis;
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
/* renamed from: r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.m  reason: invalid package */
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:r/o/u/a/r/v/s/i/s/v/q/d/r/i/-/e/m.class */
public class m extends Overlay {
    private final /* synthetic */ SquireVardorvis ac;

    @Inject
    public m(SquireVardorvis squireVardorvis) {
        this.ac = squireVardorvis;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean lIlllllIIIlIIll(Object obj) {
        return obj == null;
    }

    private static boolean lIlllllIIIlIIlI(int i) {
        return i != 0;
    }

    public Dimension render(Graphics2D graphics2D) {
        return null;
    }

    public void a(List<WorldPoint> list, Graphics2D graphics2D, Color color) {
        for (WorldPoint worldPoint : list) {
            LocalPoint fromWorld = LocalPoint.fromWorld(Static.getClient(), worldPoint);
            if (lIlllllIIIlIIll(fromWorld)) {
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, Perspective.getCanvasTilePoly(Static.getClient(), fromWorld), color);
                "".length();
                if (((143 ^ 172) ^ (175 ^ 136)) < " ".length()) {
                    return;
                }
            }
        }
    }
}
