package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.google.inject.Inject;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Set;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.client.Static;
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.R  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/R.class */
public class R extends Overlay {
    private /* synthetic */ Set<WorldPoint> cP;
    private final /* synthetic */ SquireVorkathPlugin cN;
    private /* synthetic */ Set<WorldPoint> cO;
    @Inject
    /* synthetic */ SquireVorkathConfig y;

    public void a(Set<WorldPoint> set, Graphics2D graphics2D, Color color) {
        for (WorldPoint worldPoint : set) {
            LocalPoint fromWorld = LocalPoint.fromWorld(Static.getClient(), worldPoint);
            if (lIllllllllIlIlI(fromWorld)) {
                "".length();
                if (((((31 + 15) - (-58)) + 53) ^ (((126 + 126) - 119) + 20)) < "   ".length()) {
                    return;
                }
            } else {
                OverlayUtil.renderPolygon(graphics2D, Perspective.getCanvasTilePoly(Static.getClient(), fromWorld), color);
                "".length();
                if (0 != 0) {
                    return;
                }
            }
        }
    }

    private static boolean lIllllllllIlIll(Object obj) {
        return obj != null;
    }

    public void c(Set<WorldPoint> set) {
        this.cP = set;
    }

    private static boolean lIllllllllIlIIl(int i2) {
        return i2 == 0;
    }

    public void b(Set<WorldPoint> set) {
        this.cO = set;
    }

    private static boolean lIllllllllIlIlI(Object obj) {
        return obj == null;
    }

    @Inject
    public R(SquireVorkathConfig squireVorkathConfig, SquireVorkathPlugin squireVorkathPlugin) {
        this.y = squireVorkathConfig;
        this.cN = squireVorkathPlugin;
        setLayer(OverlayLayer.ABOVE_SCENE);
        setPosition(OverlayPosition.DYNAMIC);
    }

    private static boolean lIllllllllIlIII(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dimension render(Graphics2D graphics2D) {
        Set<WorldPoint> set;
        Set<WorldPoint> set2;
        if (lIllllllllIlIII(this.cN.debugOverlaysDisabled() ? 1 : 0) || lIllllllllIlIIl(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return null;
        }
        if (lIllllllllIlIlI(this.cO)) {
            set = Set.of();
            "".length();
            if (((43 ^ 118) ^ (57 ^ 96)) <= 0) {
                return null;
            }
        } else {
            set = this.cO;
        }
        a(set, graphics2D, Color.GREEN);
        if (lIllllllllIlIlI(this.cP)) {
            set2 = Set.of();
            "".length();
            if (0 != 0) {
                return null;
            }
        } else {
            set2 = this.cP;
        }
        a(set2, graphics2D, Color.RED);
        a(graphics2D, Color.CYAN);
        return null;
    }

    public void a(Graphics2D graphics2D, Color color) {
        LocalPoint localDestinationLocation = Static.getClient().getLocalDestinationLocation();
        if (lIllllllllIlIll(localDestinationLocation)) {
            Polygon canvasTilePoly = Perspective.getCanvasTilePoly(Static.getClient(), localDestinationLocation);
            if (lIllllllllIlIll(canvasTilePoly)) {
                OverlayUtil.renderPolygon(graphics2D, canvasTilePoly, color, color, new BasicStroke(1.0f));
            }
        }
    }
}
